package de;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m implements id.c, kd.d {
    public final id.c a;
    public final id.h b;

    public m(id.c cVar, id.h hVar) {
        this.a = cVar;
        this.b = hVar;
    }

    @Override // kd.d
    public final kd.d getCallerFrame() {
        id.c cVar = this.a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override // id.c
    public final id.h getContext() {
        return this.b;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
