package de;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
