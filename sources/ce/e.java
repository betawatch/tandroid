package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
