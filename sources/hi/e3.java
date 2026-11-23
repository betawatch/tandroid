package hi;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.mv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e3 extends l3 {
    public final /* synthetic */ m3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(m3 m3Var) {
        super(m3Var);
        this.y = m3Var;
    }

    @Override // hi.l3
    public final void F(boolean z10) {
        m3 m3Var = this.y;
        org.telegram.ui.ActionBar.q0 q0Var = m3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        m3Var.s.e(z10, true);
    }

    @Override // v4.i0
    public final void f() {
        mv0 mv0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            mv0Var.setStickerType(11);
            mv0Var.d.setText(gd.N0(2131745564, null));
        } else {
            mv0Var.setStickerType(1);
            mv0Var.d.setText(gd.a0(null, null, 2131747973, this.f));
        }
    }
}
