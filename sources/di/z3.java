package di;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements o1.f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ z3(View view, float f7, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.d;
                a4 a4Var = b4Var.b;
                if (!z10) {
                    a4Var.setTranslationY(this.c);
                    a4Var.K = false;
                    b4Var.d = null;
                    b4Var.e = null;
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

    public /* synthetic */ z3(b4 b4Var, float f7, Runnable runnable) {
        this.d = b4Var;
        this.c = f7;
        this.b = runnable;
    }
}
