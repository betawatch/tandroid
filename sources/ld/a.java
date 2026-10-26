package ld;

import a8.yd;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // ld.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // ld.h
    public f get(g gVar) {
        return yd.a(this, gVar);
    }

    @Override // ld.f
    public final g getKey() {
        return this.a;
    }

    @Override // ld.h
    public h minusKey(g gVar) {
        return yd.b(this, gVar);
    }

    @Override // ld.h
    public final h plus(h hVar) {
        return yd.c(this, hVar);
    }
}
