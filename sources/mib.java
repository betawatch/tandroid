// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
