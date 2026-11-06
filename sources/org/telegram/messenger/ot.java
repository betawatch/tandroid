package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
