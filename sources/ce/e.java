package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
