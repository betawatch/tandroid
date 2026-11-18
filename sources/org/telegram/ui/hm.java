package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
