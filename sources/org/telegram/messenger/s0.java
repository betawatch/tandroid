package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CaptchaController.Request b;

    public /* synthetic */ s0(CaptchaController.Request request, int i10) {
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
