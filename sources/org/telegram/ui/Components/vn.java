package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vn implements org.telegram.messenger.nc {
    public boolean a;
    public final /* synthetic */ ag.n b;
    public final /* synthetic */ xn c;

    public vn(ag.p pVar, ag.n nVar) {
        this.c = pVar;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.nc
    public final void s(int i10, Drawable drawable) {
        ci0 ci0Var;
        rf.e eVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof ci0;
            ag.n nVar = this.b;
            if (z10 && (eVar = (ci0Var = (ci0) drawable).B0) != null && eVar.g()) {
                ci0Var.A0 = new cd(21, this, nVar);
            } else {
                xn.a(this.c);
                nVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.nc
    public final /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public final void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
