// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class kr4 extends rr4 {
    public final /* synthetic */ sr4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr4(sr4 sr4Var) {
        super(sr4Var);
        this.y = sr4Var;
    }

    @Override // rr4
    public final void F(boolean z) {
        sr4 sr4Var = this.y;
        r7 r7Var = sr4Var.H;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
        sr4Var.s.e(z, true);
    }

    @Override // w39
    public final void f() {
        super.f();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        zya zyaVar = this.y.s;
        if (isEmpty) {
            zyaVar.setStickerType(11);
            zyaVar.d.setText(k96.M0(2131745568, null));
        } else {
            zyaVar.setStickerType(1);
            zyaVar.d.setText(k96.a0(null, null, 2131747974, this.f));
        }
    }
}
