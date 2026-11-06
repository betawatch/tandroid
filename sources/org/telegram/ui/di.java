package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class di implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.ii0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ch.o0 n;
    public final /* synthetic */ org.telegram.messenger.ij r;
    public final /* synthetic */ an s;

    public di(an anVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.s = anVar;
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
            an anVar = this.s;
            if (anVar.Fc != null) {
                anVar.Fc = null;
                if (this.b) {
                    anVar.w8(new ci(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    anVar.w8(new qf(15, this, this.r));
                }
                anVar.O7(true);
            }
        }
    }
}
