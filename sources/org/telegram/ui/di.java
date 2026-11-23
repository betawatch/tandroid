package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class di implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.xi0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ch.p0 n;
    public final /* synthetic */ org.telegram.messenger.fj r;
    public final /* synthetic */ bn s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.fj fjVar) {
        this.s = bnVar;
        this.a = z10;
        this.b = z11;
        this.c = i7;
        this.d = z12;
        this.e = xi0Var;
        this.f = f10;
        this.h = f11;
        this.n = p0Var;
        this.r = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            bn bnVar = this.s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.b) {
                    bnVar.y8(new ci(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    bnVar.y8(new ah(4, this, this.r));
                }
                bnVar.P7(true);
            }
        }
    }
}
