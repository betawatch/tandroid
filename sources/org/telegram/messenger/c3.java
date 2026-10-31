package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e3 d;

    public /* synthetic */ c3(String str, String str2, e3 e3Var, int i10) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = e3Var;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        RecaptchaAction recaptchaAction;
        int i10 = this.a;
        e3 e3Var = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (i10) {
            case 0:
                RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
                str2.getClass();
                int i11 = 1;
                switch (str2) {
                    case "SIGNUP":
                    case "signup":
                        recaptchaAction = RecaptchaAction.SIGNUP;
                        break;
                    case "LOGIN":
                    case "login":
                        recaptchaAction = RecaptchaAction.LOGIN;
                        break;
                    default:
                        recaptchaAction = RecaptchaAction.custom(str2);
                        break;
                }
                recaptchaTasksClient.executeTask(recaptchaAction).addOnSuccessListener(new c3(str2, str, e3Var, i11)).addOnFailureListener(new d3(e3Var, 1));
                break;
            default:
                String str3 = (String) obj;
                a1.g.z(str3, a1.g.v("CaptchaController: got token for {action=", str2, ", key_id=", str, "}: "));
                if (str3 != null) {
                    e3Var.a(str3);
                    break;
                } else {
                    e3Var.a("RECAPTCHA_FAILED_TOKEN_NULL");
                    break;
                }
        }
    }
}
