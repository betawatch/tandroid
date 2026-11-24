// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i61 extends fx0 {
    public static final /* synthetic */ int m1 = 0;
    public final /* synthetic */ byte l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i61(int i, wjb wjbVar, Context context, boolean z) {
        super(i, wjbVar, context, z);
        this.l1 = (byte) 2;
    }

    @Override // fx0
    public final boolean F() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.F();
        }
    }

    @Override // fx0
    public final void p0() {
        switch (this.l1) {
            case 2:
                super.p0();
                try {
                    int v0 = bkb.v0(bkb.g5, this.J0);
                    if (this.H0 != v0) {
                        L(v0);
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            default:
                super.p0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i61(byte b, Context context, boolean z) {
        super(context, z);
        this.l1 = b;
    }
}
