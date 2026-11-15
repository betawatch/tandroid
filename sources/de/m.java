package de;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
