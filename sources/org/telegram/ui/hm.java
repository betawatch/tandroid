package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.messenger.bp {
    public final /* synthetic */ hi a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ mm c;

    public hm(mm mmVar, hi hiVar, bn bnVar) {
        this.c = mmVar;
        this.a = hiVar;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.bp
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.bp
    public final void f(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
