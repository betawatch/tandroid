// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
