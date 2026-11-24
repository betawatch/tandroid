// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ec1 implements OnFailureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gc1 b;

    public /* synthetic */ ec1(gc1 gc1Var, byte b) {
        this.a = b;
        this.b = gc1Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        byte b = this.a;
        String str = "MSG_NULL";
        gc1 gc1Var = this.b;
        switch (b) {
            case 0:
                fc4.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb.append(str);
                gc1Var.a(sb.toString());
                break;
            default:
                fc4.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb2.append(str);
                gc1Var.a(sb2.toString());
                break;
        }
    }
}
