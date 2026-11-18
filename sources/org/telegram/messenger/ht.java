package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
