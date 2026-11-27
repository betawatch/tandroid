// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lib {
    public final /* synthetic */ byte a;

    public /* synthetic */ lib(byte b) {
        this.a = b;
    }

    public final int a(sib sibVar, int i) {
        switch (this.a) {
            case 0:
            case 3:
            default:
                return TLObject.FLAG_31;
            case 1:
                return 0;
            case 2:
                return i;
        }
    }

    public final int b(sib sibVar, int i) {
        switch (this.a) {
            case 0:
                return TLObject.FLAG_31;
            case 1:
            case 3:
            default:
                return 0;
            case 2:
                return i;
        }
    }

    public final int c(int i, int i2) {
        switch (this.a) {
            case 4:
                return i2;
            default:
                return i;
        }
    }
}
