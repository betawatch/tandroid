package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CaptchaController.Request b;

    public /* synthetic */ w0(CaptchaController.Request request, int i10) {
        this.a = i10;
        this.b = request;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                CaptchaController.lambda$request$3(this.b, exc);
                break;
            default:
                CaptchaController.lambda$request$1(this.b, exc);
                break;
        }
    }
}
