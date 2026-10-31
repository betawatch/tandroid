package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vn implements org.telegram.messenger.mc {
    public boolean a;
    public final /* synthetic */ ag.n b;
    public final /* synthetic */ xn c;

    public vn(ag.p pVar, ag.n nVar) {
        this.c = pVar;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.mc
    public final void q(int i10, Drawable drawable) {
        bi0 bi0Var;
        rf.e eVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof bi0;
            ag.n nVar = this.b;
            if (z10 && (eVar = (bi0Var = (bi0) drawable).B0) != null && eVar.g()) {
                bi0Var.A0 = new cd(21, this, nVar);
            } else {
                xn.a(this.c);
                nVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.mc
    public final /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public final void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
