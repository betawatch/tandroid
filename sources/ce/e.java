package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class e extends kd.c {
    public d a;
    public be.t b;
    public be.b c;
    public boolean d;
    public /* synthetic */ Object e;
    public int f;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= TLObject.FLAG_31;
        return x.c(null, null, false, this);
    }
}
