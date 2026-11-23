package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
