package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
