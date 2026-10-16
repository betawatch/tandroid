package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class aj implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.i1 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ fo s;

    public aj(fo foVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.s = foVar;
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
            fo foVar = this.s;
            if (foVar.cc != null) {
                foVar.cc = null;
                if (this.b) {
                    foVar.k8(new zi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    foVar.k8(new jd(18, this, this.r));
                }
                foVar.D7(true);
            }
        }
    }
}
