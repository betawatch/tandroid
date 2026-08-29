package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ni implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.fk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ kg.q0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ tn s;

    public ni(tn tnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f9, float f10, kg.q0 q0Var, MessageObject messageObject) {
        this.s = tnVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = fk0Var;
        this.f = f9;
        this.h = f10;
        this.n = q0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            tn tnVar = this.s;
            if (tnVar.Yb != null) {
                tnVar.Yb = null;
                if (this.b) {
                    tnVar.h8(new mi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    tnVar.h8(new vf(13, this, this.r));
                }
                tnVar.A7(true);
            }
        }
    }
}
