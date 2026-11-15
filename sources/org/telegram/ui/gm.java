package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gm implements org.telegram.messenger.bp {
    public final /* synthetic */ hi a;
    public final /* synthetic */ an b;
    public final /* synthetic */ lm c;

    public gm(lm lmVar, hi hiVar, an anVar) {
        this.c = lmVar;
        this.a = hiVar;
        this.b = anVar;
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
