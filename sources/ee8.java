// default package

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ee8 extends le8 {
    public final /* synthetic */ ge8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee8(ge8 ge8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = ge8Var;
    }

    @Override // le8
    public final void h(py pyVar, ActionMode actionMode) {
        if (pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) != null) {
                mu1.x6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override // le8
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override // le8
    public final void k(le8 le8Var) {
        this.G.d.o0(le8Var);
    }
}
