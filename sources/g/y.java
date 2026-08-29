package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y extends o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ y(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // r0.n0
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
                ze.b bVar = a0Var.k;
                if (bVar != null) {
                    bVar.O(a0Var.j);
                    a0Var.j = null;
                    a0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.a;
                    r0.z.c(actionBarOverlayLayout);
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
