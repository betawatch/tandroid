package hi;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class w2 extends d3 {
    public final /* synthetic */ e3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(e3 e3Var) {
        super(e3Var);
        this.y = e3Var;
    }

    @Override // hi.d3
    public final void F(boolean z10) {
        e3 e3Var = this.y;
        org.telegram.ui.ActionBar.r0 r0Var = e3Var.H;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z10);
        }
        e3Var.s.e(z10, true);
    }

    @Override // v4.i0
    public final void f() {
        kv0 kv0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            kv0Var.setStickerType(11);
            kv0Var.d.setText(gd.M0(2131745565, null));
        } else {
            kv0Var.setStickerType(1);
            kv0Var.d.setText(gd.a0(null, null, 2131747974, this.f));
        }
    }
}
