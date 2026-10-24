package ei;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements o1.f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ s3(View view, float f7, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.d;
                t3 t3Var = u3Var.b;
                if (!z10) {
                    t3Var.setTranslationY(this.c);
                    t3Var.K = false;
                    u3Var.d = null;
                    u3Var.e = null;
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.lambda$shakeViewSpring$14(this.b, (View) this.d, this.c, hVar, z10, f7, f10);
                break;
        }
    }

    public /* synthetic */ s3(u3 u3Var, float f7, Runnable runnable) {
        this.d = u3Var;
        this.c = f7;
        this.b = runnable;
    }
}
