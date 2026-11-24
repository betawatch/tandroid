// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ab1 extends bl0 {
    public final /* synthetic */ byte s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab1(int i, wjb wjbVar) {
        super(i, wjbVar);
        this.s = (byte) 2;
    }

    @Override // bl0, al0
    public final int L() {
        switch (this.s) {
            case 2:
                return c() ? 117440511 : 285212672;
            default:
                return super.L();
        }
    }

    @Override // bl0
    public final boolean c() {
        switch (this.s) {
            case 0:
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    @Override // bl0, al0
    public final int d1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.d1();
        }
    }

    @Override // bl0, al0
    public final int m0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.m0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab1(wjb wjbVar, int i, float f, byte b) {
        super(wjbVar, i, f);
        this.s = b;
    }
}
