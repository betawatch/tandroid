package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
