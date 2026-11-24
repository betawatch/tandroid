// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jk1 extends u51 {
    public final /* synthetic */ byte k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(vq8 vq8Var) {
        super((View) null);
        this.k = (byte) 2;
        this.l = vq8Var;
    }

    @Override // u51
    public final void b() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((rc2) obj).r2();
                break;
            case 1:
                ((rc2) obj).r2();
                break;
            default:
                ((vq8) obj).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk1(rc2 rc2Var, rc2 rc2Var2, byte b) {
        super(rc2Var);
        this.k = b;
        this.l = rc2Var2;
    }
}
