package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class ot implements id.c {
    public final /* synthetic */ ht a;

    public ot(ht htVar) {
        this.a = htVar;
    }

    @Override // id.c
    public final id.h getContext() {
        return id.i.a;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        boolean z9 = obj instanceof gd.f;
        ht htVar = this.a;
        if (z9) {
            htVar.a(null, ((gd.f) obj).a);
        } else {
            htVar.a(obj, null);
        }
    }
}
