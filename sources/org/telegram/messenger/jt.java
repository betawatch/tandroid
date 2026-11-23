package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class jt implements id.c {
    public final /* synthetic */ ct a;

    public jt(ct ctVar) {
        this.a = ctVar;
    }

    @Override // id.c
    public final id.h getContext() {
        return id.i.a;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        ct ctVar = this.a;
        if (z10) {
            ctVar.a(null, ((gd.f) obj).a);
        } else {
            ctVar.a(obj, null);
        }
    }
}
