package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
