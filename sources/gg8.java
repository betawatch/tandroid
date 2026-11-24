// default package

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gg8 extends ng8 {
    public final /* synthetic */ ig8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg8(ig8 ig8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = ig8Var;
    }

    @Override // ng8
    public final void h(pz pzVar, ActionMode actionMode) {
        if (pzVar.isFocused() && pzVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) != null) {
                yv1.E6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override // ng8
    public final void j(boolean z) {
        this.G.d.o0(this, z);
    }

    @Override // ng8
    public final void k(ng8 ng8Var) {
        this.G.d.p0(ng8Var);
    }
}
