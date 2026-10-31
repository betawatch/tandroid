package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ d3(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                f8.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                sb2.append(exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase());
                this.b.a(sb2.toString());
                break;
            default:
                f8.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb3 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                sb3.append(exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase());
                this.b.a(sb3.toString());
                break;
        }
    }
}
