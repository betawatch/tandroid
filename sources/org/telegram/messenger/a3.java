package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
