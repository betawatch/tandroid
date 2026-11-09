package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
