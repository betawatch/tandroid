package fi;

import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.av0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x2 extends e3 {
    public final /* synthetic */ f3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(f3 f3Var) {
        super(f3Var);
        this.y = f3Var;
    }

    @Override // fi.e3
    public final void F(boolean z9) {
        f3 f3Var = this.y;
        org.telegram.ui.ActionBar.r0 r0Var = f3Var.G;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
        f3Var.s.e(z9, true);
    }

    @Override // v4.g0
    public final void f() {
        av0 av0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            av0Var.setStickerType(11);
            av0Var.d.setText(hd.M0(2131745761, null));
        } else {
            av0Var.setStickerType(1);
            av0Var.d.setText(hd.a0(null, null, 2131748165, this.f));
        }
    }
}
