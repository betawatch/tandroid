// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
