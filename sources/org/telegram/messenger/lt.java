package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
