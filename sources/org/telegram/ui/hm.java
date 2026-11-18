package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.messenger.ap {
    public final /* synthetic */ hi a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ mm c;

    public hm(mm mmVar, hi hiVar, bn bnVar) {
        this.c = mmVar;
        this.a = hiVar;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.ap
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.ap
    public final void f(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
