package lh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements o1.f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ r3(View view, float f10, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                t3 t3Var = (t3) this.d;
                s3 s3Var = t3Var.b;
                if (!z10) {
                    s3Var.setTranslationY(this.c);
                    s3Var.G = false;
                    t3Var.d = null;
                    t3Var.e = null;
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.lambda$shakeViewSpring$14(this.b, (View) this.d, this.c, hVar, z10, f10, f11);
                break;
        }
    }

    public /* synthetic */ r3(t3 t3Var, float f10, Runnable runnable) {
        this.d = t3Var;
        this.c = f10;
        this.b = runnable;
    }
}
