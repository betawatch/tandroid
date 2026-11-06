package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gm implements org.telegram.messenger.ep {
    public final /* synthetic */ hi a;
    public final /* synthetic */ an b;
    public final /* synthetic */ lm c;

    public gm(lm lmVar, hi hiVar, an anVar) {
        this.c = lmVar;
        this.a = hiVar;
        this.b = anVar;
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
