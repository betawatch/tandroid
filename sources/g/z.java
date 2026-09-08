package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class z extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ z(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // r0.m0
    public final void c() {
        View view;
        int i10 = this.a;
        b0 b0Var = this.b;
        switch (i10) {
            case 0:
                if (b0Var.o && (view = b0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.s = null;
                n4.y yVar = b0Var.k;
                if (yVar != null) {
                    yVar.I(b0Var.j);
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
