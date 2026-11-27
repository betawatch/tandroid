// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ib1 extends cl0 {
    public final /* synthetic */ byte s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib1(int i, vnb vnbVar) {
        super(i, vnbVar);
        this.s = (byte) 2;
    }

    @Override // cl0, bl0
    public final int X() {
        switch (this.s) {
            case 2:
                return c() ? 117440511 : 285212672;
            default:
                return super.X();
        }
    }

    @Override // cl0
    public final boolean c() {
        switch (this.s) {
            case 0:
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    @Override // cl0, bl0
    public final int x0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.x0();
        }
    }

    @Override // cl0, bl0
    public final int x1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.x1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib1(vnb vnbVar, int i, float f, byte b) {
        super(vnbVar, i, f);
        this.s = b;
    }
}
