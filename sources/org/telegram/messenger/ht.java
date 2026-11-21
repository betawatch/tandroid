package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
