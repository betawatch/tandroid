package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
