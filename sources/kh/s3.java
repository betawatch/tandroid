package kh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements o1.f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ s3(View view, float f10, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.d;
                t3 t3Var = u3Var.b;
                if (!z10) {
                    t3Var.setTranslationY(this.c);
                    t3Var.G = false;
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
                AndroidUtilities.lambda$shakeViewSpring$14(this.b, (View) this.d, this.c, hVar, z10, f10, f11);
                break;
        }
    }

    public /* synthetic */ s3(u3 u3Var, float f10, Runnable runnable) {
        this.d = u3Var;
        this.c = f10;
        this.b = runnable;
    }
}
