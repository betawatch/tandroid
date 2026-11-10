package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.ii0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ch.o0 n;
    public final /* synthetic */ org.telegram.messenger.ij r;
    public final /* synthetic */ cn s;

    public fi(cn cnVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.s = cnVar;
        this.a = z9;
        this.b = z10;
        this.c = i7;
        this.d = z11;
        this.e = ii0Var;
        this.f = f10;
        this.h = f11;
        this.n = o0Var;
        this.r = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            cn cnVar = this.s;
            if (cnVar.Hc != null) {
                cnVar.Hc = null;
                if (this.b) {
                    cnVar.x8(new ei(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    cnVar.x8(new oe(16, this, this.r));
                }
                cnVar.P7(true);
            }
        }
    }
}
