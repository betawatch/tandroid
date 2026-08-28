package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ki implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.uj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ hg.r0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ qn s;

    public ki(qn qnVar, boolean z10, boolean z11, int i9, boolean z12, org.telegram.ui.Components.uj0 uj0Var, float f10, float f11, hg.r0 r0Var, MessageObject messageObject) {
        this.s = qnVar;
        this.a = z10;
        this.b = z11;
        this.c = i9;
        this.d = z12;
        this.e = uj0Var;
        this.f = f10;
        this.h = f11;
        this.n = r0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            qn qnVar = this.s;
            if (qnVar.Yb != null) {
                qnVar.Yb = null;
                if (this.b) {
                    qnVar.h8(new ji(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    qnVar.h8(new rd(16, this, this.r));
                }
                qnVar.A7(true);
            }
        }
    }
}
