package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
