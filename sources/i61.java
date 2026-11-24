// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
    public final boolean E() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.E();
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
