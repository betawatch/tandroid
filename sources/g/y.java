package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class y extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ y(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // r0.m0
    public final void c() {
        View view;
        int i10 = this.a;
        a0 a0Var = this.b;
        switch (i10) {
            case 0:
                if (a0Var.o && (view = a0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.s = null;
                n4.s sVar = a0Var.k;
                if (sVar != null) {
                    sVar.w(a0Var.j);
                    a0Var.j = null;
                    a0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                a0Var.s = null;
                a0Var.d.requestLayout();
                break;
        }
    }
}
