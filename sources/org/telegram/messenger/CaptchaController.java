package org.telegram.messenger;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.CaptchaController;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes3.dex */
public class CaptchaController {
    public static HashMap<Integer, Request> currentRequests;

    public static class Request {
        public String action;
        public int currentAccount;
        public String key_id;
        public HashSet<Integer> requestTokens = new HashSet<>();

        public Request(int i, String str, String str2) {
            this.currentAccount = i;
            this.action = str;
            this.key_id = str2;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), this.action, this.key_id);
        }

        public void done(String str) {
            CaptchaController.currentRequests.remove(Integer.valueOf(hashCode()));
            int[] iArr = new int[this.requestTokens.size()];
            Iterator<Integer> it = this.requestTokens.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().intValue();
                i++;
            }
            ConnectionsManager.getInstance(this.currentAccount);
            ConnectionsManager.native_receivedCaptchaResult(this.currentAccount, iArr, str);
        }
    }

    public static void request(int i, int i2, final String str, final String str2) {
        if (currentRequests == null) {
            currentRequests = new HashMap<>();
        }
        Request request = currentRequests.get(Integer.valueOf(Objects.hash(Integer.valueOf(i), str, str2)));
        if (request != null) {
            request.requestTokens.add(Integer.valueOf(i2));
            return;
        }
        final Request request2 = new Request(i, str, str2);
        request2.requestTokens.add(Integer.valueOf(i2));
        Activity activity = AndroidUtilities.getActivity();
        if (activity == null) {
            FileLog.e("CaptchaController: no activity found");
            request2.done("RECAPTCHA_FAILED_NO_ACTIVITY");
        } else {
            Recaptcha.getTasksClient(activity.getApplication(), str2).addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.messenger.CaptchaController$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ((RecaptchaTasksClient) obj).executeTask(CaptchaController.getAction(r0)).addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.messenger.CaptchaController$$ExternalSyntheticLambda2
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj2) {
                            CaptchaController.$r8$lambda$AMiLmmmYyKOwfWSiRvRczX2HcNw(r1, r2, r3, (String) obj2);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: org.telegram.messenger.CaptchaController$$ExternalSyntheticLambda3
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            CaptchaController.$r8$lambda$UjfC46a1LwdNoQ4PzIEIXfzBxPc(CaptchaController.Request.this, exc);
                        }
                    });
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: org.telegram.messenger.CaptchaController$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CaptchaController.$r8$lambda$stK-JxtC1RPLdV30yoHtFVwBWyI(CaptchaController.Request.this, exc);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$AMiLmmmYyKOwfWSiRvRczX2HcNw(String str, String str2, Request request, String str3) {
        FileLog.d("CaptchaController: got token for {action=" + str + ", key_id=" + str2 + "}: " + str3);
        if (str3 == null) {
            request.done("RECAPTCHA_FAILED_TOKEN_NULL");
        } else {
            request.done(str3);
        }
    }

    public static /* synthetic */ void $r8$lambda$UjfC46a1LwdNoQ4PzIEIXfzBxPc(Request request, Exception exc) {
        FileLog.e("CaptchaController: executeTask failure", exc);
        request.done("RECAPTCHA_FAILED_TASK_EXCEPTION_" + formatException(exc));
    }

    public static /* synthetic */ void $r8$lambda$stK-JxtC1RPLdV30yoHtFVwBWyI(Request request, Exception exc) {
        FileLog.e("CaptchaController: getTasksClient failure", exc);
        request.done("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_" + formatException(exc));
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

    private static String formatException(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        return exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase();
    }
}
