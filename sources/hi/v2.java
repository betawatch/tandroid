package hi;

import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nv0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v2 extends c3 {
    public final /* synthetic */ d3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(d3 d3Var) {
        super(d3Var);
        this.y = d3Var;
    }

    @Override // hi.c3
    public final void F(boolean z10) {
        d3 d3Var = this.y;
        org.telegram.ui.ActionBar.q0 q0Var = d3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        d3Var.s.e(z10, true);
    }

    @Override // v4.i0
    public final void f() {
        nv0 nv0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            nv0Var.setStickerType(11);
            nv0Var.d.setText(hd.N0(2131745564, null));
        } else {
            nv0Var.setStickerType(1);
            nv0Var.d.setText(hd.a0(null, null, 2131747973, this.f));
        }
    }
}
