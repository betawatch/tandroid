package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class di implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.mi0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ch.p0 n;
    public final /* synthetic */ org.telegram.messenger.gj r;
    public final /* synthetic */ an s;

    public di(an anVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.mi0 mi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.gj gjVar) {
        this.s = anVar;
        this.a = z10;
        this.b = z11;
        this.c = i7;
        this.d = z12;
        this.e = mi0Var;
        this.f = f10;
        this.h = f11;
        this.n = p0Var;
        this.r = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            an anVar = this.s;
            if (anVar.Ic != null) {
                anVar.Ic = null;
                if (this.b) {
                    anVar.y8(new ci(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    anVar.y8(new zg(4, this, this.r));
                }
                anVar.P7(true);
            }
        }
    }
}
