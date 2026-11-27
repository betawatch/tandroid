// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kj1 extends v41 {
    public final /* synthetic */ byte k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(gs8 gs8Var) {
        super((View) null);
        this.k = (byte) 2;
        this.l = gs8Var;
    }

    @Override // v41
    public final void b() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((wb2) obj).r2();
                break;
            case 1:
                ((wb2) obj).r2();
                break;
            default:
                ((gs8) obj).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj1(wb2 wb2Var, wb2 wb2Var2, byte b) {
        super(wb2Var);
        this.k = b;
        this.l = wb2Var2;
    }
}
