package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a0 extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ a0(c0 c0Var, int i10) {
        this.a = i10;
        this.b = c0Var;
    }

    @Override // r0.m0
    public final void c() {
        View view;
        int i10 = this.a;
        c0 c0Var = this.b;
        switch (i10) {
            case 0:
                if (c0Var.o && (view = c0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    c0Var.d.setTranslationY(0.0f);
                }
                c0Var.d.setVisibility(8);
                c0Var.d.setTransitioning(false);
                c0Var.s = null;
                of.b bVar = c0Var.k;
                if (bVar != null) {
                    bVar.j0(c0Var.j);
                    c0Var.j = null;
                    c0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c0Var.s = null;
                c0Var.d.requestLayout();
                break;
        }
    }
}
