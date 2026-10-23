package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CaptchaController.Request b;

    public /* synthetic */ u0(CaptchaController.Request request, int i10) {
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
