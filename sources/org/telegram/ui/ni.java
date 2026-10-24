package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ni implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.i1 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ sn s;

    public ni(sn snVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.s = snVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = gl0Var;
        this.f = f7;
        this.h = f10;
        this.n = i1Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            sn snVar = this.s;
            if (snVar.pc != null) {
                snVar.pc = null;
                if (this.b) {
                    snVar.k8(new mi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    snVar.k8(new eh(7, this, this.r));
                }
                snVar.D7(true);
            }
        }
    }
}
