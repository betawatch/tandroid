package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CaptchaController.Request b;

    public /* synthetic */ r0(CaptchaController.Request request, int i10) {
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
