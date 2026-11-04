package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ z(b0 b0Var, int i3) {
        this.a = i3;
        this.b = b0Var;
    }

    @Override // r0.m0
    public final void c() {
        View view;
        int i3 = this.a;
        b0 b0Var = this.b;
        switch (i3) {
            case 0:
                if (b0Var.o && (view = b0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.s = null;
                tf.b bVar = b0Var.k;
                if (bVar != null) {
                    bVar.v(b0Var.j);
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
