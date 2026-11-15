package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class lt implements id.c {
    public final /* synthetic */ et a;

    public lt(et etVar) {
        this.a = etVar;
    }

    @Override // id.c
    public final id.h getContext() {
        return id.i.a;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        et etVar = this.a;
        if (z10) {
            etVar.a(null, ((gd.f) obj).a);
        } else {
            etVar.a(obj, null);
        }
    }
}
