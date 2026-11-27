// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mib extends qib {
    public int d;

    @Override // qib
    public final int a(zib zibVar, sib sibVar, lib libVar, int i, boolean z) {
        return Math.max(0, this.a - libVar.a(sibVar, i));
    }

    @Override // qib
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // qib
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // qib
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
