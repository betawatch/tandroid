package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ z2(b3 b3Var, int i3) {
        this.a = i3;
        this.b = b3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                a8.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                sb2.append(exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase());
                b3.a(this.b, sb2.toString());
                break;
            default:
                a8.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb3 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                sb3.append(exc == null ? "NULL" : exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase());
                b3.a(this.b, sb3.toString());
                break;
        }
    }
}
