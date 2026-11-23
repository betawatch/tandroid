package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class ht implements id.c {
    public final /* synthetic */ bt a;

    public ht(bt btVar) {
        this.a = btVar;
    }

    @Override // id.c
    public final id.h getContext() {
        return id.i.a;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        bt btVar = this.a;
        if (z10) {
            btVar.a(null, ((gd.f) obj).a);
        } else {
            btVar.a(obj, null);
        }
    }
}
