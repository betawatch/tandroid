package ci;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements o1.f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ y3(View view, float f7, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                a4 a4Var = (a4) this.d;
                z3 z3Var = a4Var.b;
                if (!z10) {
                    z3Var.setTranslationY(this.c);
                    z3Var.K = false;
                    a4Var.d = null;
                    a4Var.e = null;
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

    public /* synthetic */ y3(a4 a4Var, float f7, Runnable runnable) {
        this.d = a4Var;
        this.c = f7;
        this.b = runnable;
    }
}
