package de;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
