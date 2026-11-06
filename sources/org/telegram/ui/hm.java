package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hm extends vf.b {
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ lm e;

    public hm(lm lmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = lmVar;
        this.d = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z9) {
        if (z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new ej(this.e.a, 9), 250L);
    }

    @Override // vf.b
    public final void d() {
        lm lmVar = this.e;
        an anVar = lmVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        anVar.Wb = q1Var.getMessageObject().f1();
        an anVar2 = lmVar.a;
        anVar2.Xb = 2;
        anVar2.Yb = null;
        q1Var.invalidate();
    }
}
