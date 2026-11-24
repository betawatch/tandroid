// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bj1 extends n41 {
    public final /* synthetic */ byte k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj1(uo8 uo8Var) {
        super((View) null);
        this.k = (byte) 2;
        this.l = uo8Var;
    }

    @Override // n41
    public final void b() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((gb2) obj).r2();
                break;
            case 1:
                ((gb2) obj).r2();
                break;
            default:
                ((uo8) obj).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj1(gb2 gb2Var, gb2 gb2Var2, byte b) {
        super(gb2Var);
        this.k = b;
        this.l = gb2Var2;
    }
}
