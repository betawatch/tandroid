package nh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ p3(View view, float f9, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f9;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                r3 r3Var = (r3) this.d;
                q3 q3Var = r3Var.b;
                if (!z10) {
                    q3Var.setTranslationY(this.c);
                    q3Var.G = false;
                    r3Var.d = null;
                    r3Var.e = null;
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.lambda$shakeViewSpring$14(this.b, (View) this.d, this.c, iVar, z10, f9, f10);
                break;
        }
    }

    public /* synthetic */ p3(r3 r3Var, float f9, Runnable runnable) {
        this.d = r3Var;
        this.c = f9;
        this.b = runnable;
    }
}
