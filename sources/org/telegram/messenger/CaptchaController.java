package org.telegram.messenger;

import android.app.Activity;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class CaptchaController {
    public static HashMap<Integer, Request> currentRequests;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Request {
        public String action;
        public int currentAccount;
        public String key_id;
        public HashSet<Integer> requestTokens = new HashSet<>();

        public Request(int i9, String str, String str2) {
            this.currentAccount = i9;
            this.action = str;
            this.key_id = str2;
        }

        public void done(String str) {
            CaptchaController.currentRequests.remove(Integer.valueOf(hashCode()));
            int[] iArr = new int[this.requestTokens.size()];
            Iterator<Integer> it = this.requestTokens.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                iArr[i9] = it.next().intValue();
                i9++;
            }
            ConnectionsManager.getInstance(this.currentAccount);
            ConnectionsManager.native_receivedCaptchaResult(this.currentAccount, iArr, str);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), this.action, this.key_id);
        }
    }

    private static String formatException(Exception exc) {
        return exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase();
    }

    private static RecaptchaAction getAction(String str) {
        str.getClass();
        switch (str) {
            case "SIGNUP":
            case "signup":
                return RecaptchaAction.SIGNUP;
            case "LOGIN":
            case "login":
                return RecaptchaAction.LOGIN;
            default:
                return RecaptchaAction.custom(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$0(String str, String str2, Request request, String str3) {
        j3.r0.x(str3, j3.r0.q("CaptchaController: got token for {action=", str, ", key_id=", str2, "}: "));
        if (str3 == null) {
            request.done("RECAPTCHA_FAILED_TOKEN_NULL");
        } else {
            request.done(str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$1(Request request, Exception exc) {
        FileLog.e("CaptchaController: executeTask failure", exc);
        request.done("RECAPTCHA_FAILED_TASK_EXCEPTION_" + formatException(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$2(String str, String str2, Request request, RecaptchaTasksClient recaptchaTasksClient) {
        recaptchaTasksClient.executeTask(getAction(str)).addOnSuccessListener(new r0(str, str2, request, 1)).addOnFailureListener(new s0(request, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$3(Request request, Exception exc) {
        FileLog.e("CaptchaController: getTasksClient failure", exc);
        request.done("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_" + formatException(exc));
    }

    public static void request(int i9, int i10, String str, String str2) {
        if (currentRequests == null) {
            currentRequests = new HashMap<>();
        }
        int i11 = 0;
        Request request = currentRequests.get(Integer.valueOf(Objects.hash(Integer.valueOf(i9), str, str2)));
        if (request != null) {
            request.requestTokens.add(Integer.valueOf(i10));
            return;
        }
        Request request2 = new Request(i9, str, str2);
        request2.requestTokens.add(Integer.valueOf(i10));
        Activity activity = AndroidUtilities.getActivity();
        if (activity != null) {
            Recaptcha.getTasksClient(activity.getApplication(), str2).addOnSuccessListener(new r0(str, str2, request2, i11)).addOnFailureListener(new s0(request2, i11));
        } else {
            FileLog.e("CaptchaController: no activity found");
            request2.done("RECAPTCHA_FAILED_NO_ACTIVITY");
        }
    }
}
