// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ic1 extends bm0 {
    public final /* synthetic */ byte s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(int i, ylb ylbVar) {
        super(i, ylbVar);
        this.s = (byte) 2;
    }

    @Override // bm0, am0
    public final int V() {
        switch (this.s) {
            case 2:
                return c() ? 117440511 : 285212672;
            default:
                return super.V();
        }
    }

    @Override // bm0
    public final boolean c() {
        switch (this.s) {
            case 0:
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    @Override // bm0, am0
    public final int r1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.r1();
        }
    }

    @Override // bm0, am0
    public final int u0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.u0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(ylb ylbVar, int i, float f, byte b) {
        super(ylbVar, i, f);
        this.s = b;
    }
}
