package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.wj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ig.q0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ rn s;

    public mi(rn rnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.wj0 wj0Var, float f10, float f11, ig.q0 q0Var, MessageObject messageObject) {
        this.s = rnVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = wj0Var;
        this.f = f10;
        this.h = f11;
        this.n = q0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            rn rnVar = this.s;
            if (rnVar.Yb != null) {
                rnVar.Yb = null;
                if (this.b) {
                    rnVar.h8(new li(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    rnVar.h8(new rd(16, this, this.r));
                }
                rnVar.A7(true);
            }
        }
    }
}
