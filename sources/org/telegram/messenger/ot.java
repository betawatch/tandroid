package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
