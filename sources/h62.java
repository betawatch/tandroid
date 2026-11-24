// default package

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h62 extends le8 {
    public final /* synthetic */ s20 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(s20 s20Var, Context context, int i) {
        super(context, i, null, null);
        this.G = s20Var;
    }

    @Override // le8
    public final void h(py pyVar, ActionMode actionMode) {
        if (pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) != null) {
                mu1.v6(menu, ((mu1) ((k62) this.G.e).b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override // le8
    public final void j(boolean z) {
        ((k62) this.G.e).b0(this, z);
    }

    @Override // le8
    public final void k(le8 le8Var) {
        ((k62) this.G.e).c0(le8Var);
    }

    @Override // le8
    public final void l(py pyVar) {
        ((k62) this.G.e).b.c1(pyVar, true);
    }
}
