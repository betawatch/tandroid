package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class z extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ z(b0 b0Var, int i7) {
        this.a = i7;
        this.b = b0Var;
    }

    @Override // r0.m0
    public final void c() {
        View view;
        int i7 = this.a;
        b0 b0Var = this.b;
        switch (i7) {
            case 0:
                if (b0Var.o && (view = b0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.s = null;
                q4.q qVar = b0Var.k;
                if (qVar != null) {
                    qVar.c(b0Var.j);
                    b0Var.j = null;
                    b0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                b0Var.s = null;
                b0Var.d.requestLayout();
                break;
        }
    }
}
