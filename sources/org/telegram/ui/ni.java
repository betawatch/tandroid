package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ni implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.cl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.i1 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ qn s;

    public ni(qn qnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.s = qnVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = cl0Var;
        this.f = f7;
        this.h = f10;
        this.n = i1Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            qn qnVar = this.s;
            if (qnVar.cc != null) {
                qnVar.cc = null;
                if (this.b) {
                    qnVar.k8(new mi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    qnVar.k8(new eh(7, this, this.r));
                }
                qnVar.D7(true);
            }
        }
    }
}
