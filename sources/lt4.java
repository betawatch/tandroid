// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lt4 extends st4 {
    public final /* synthetic */ tt4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt4(tt4 tt4Var) {
        super(tt4Var);
        this.y = tt4Var;
    }

    @Override // st4
    public final void F(boolean z) {
        tt4 tt4Var = this.y;
        r7 r7Var = tt4Var.H;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
        tt4Var.s.e(z, true);
    }

    @Override // y59
    public final void f() {
        super.f();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        a1b a1bVar = this.y.s;
        if (isEmpty) {
            a1bVar.setStickerType(11);
            a1bVar.d.setText(jb6.M0(2131745494, null));
        } else {
            a1bVar.setStickerType(1);
            a1bVar.d.setText(jb6.a0(null, null, 2131747900, this.f));
        }
    }
}
