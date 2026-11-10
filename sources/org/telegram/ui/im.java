package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class im implements org.telegram.messenger.ep {
    public final /* synthetic */ ji a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ nm c;

    public im(nm nmVar, ji jiVar, cn cnVar) {
        this.c = nmVar;
        this.a = jiVar;
        this.b = cnVar;
    }

    @Override // org.telegram.messenger.ep
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.ep
    public final void f(boolean z9) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
