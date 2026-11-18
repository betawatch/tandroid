package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ a3(c3 c3Var, int i7) {
        this.a = i7;
        this.b = c3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                a8.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                sb2.append(exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase());
                c3.a(this.b, sb2.toString());
                break;
            default:
                a8.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb3 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                sb3.append(exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase());
                c3.a(this.b, sb3.toString());
                break;
        }
    }
}
