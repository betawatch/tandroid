package gi;

import android.text.TextUtils;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v2 extends c3 {
    public final /* synthetic */ d3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(d3 d3Var) {
        super(d3Var);
        this.y = d3Var;
    }

    @Override // gi.c3
    public final void F(boolean z10) {
        d3 d3Var = this.y;
        org.telegram.ui.ActionBar.q0 q0Var = d3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        d3Var.s.e(z10, true);
    }

    @Override // u4.h0
    public final void f() {
        zu0 zu0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            zu0Var.setStickerType(11);
            zu0Var.d.setText(bd.M0(2131745770, null));
        } else {
            zu0Var.setStickerType(1);
            zu0Var.d.setText(bd.a0(null, null, 2131748174, this.f));
        }
    }
}
