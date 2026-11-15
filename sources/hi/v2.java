package hi;

import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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

    @Override // v4.h0
    public final void f() {
        cv0 cv0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            cv0Var.setStickerType(11);
            cv0Var.d.setText(hd.M0(2131745760, null));
        } else {
            cv0Var.setStickerType(1);
            cv0Var.d.setText(hd.a0(null, null, 2131748166, this.f));
        }
    }
}
