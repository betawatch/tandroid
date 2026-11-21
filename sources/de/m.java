package de;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
