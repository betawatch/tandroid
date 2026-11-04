package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mn implements org.telegram.messenger.ec {
    public boolean a;
    public final /* synthetic */ lg.g b;
    public final /* synthetic */ on c;

    public mn(lg.i iVar, lg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.ec
    public final void F0(int i3, Drawable drawable) {
        ch0 ch0Var;
        cg.h hVar;
        if (this.a) {
            return;
        }
        if ((i3 == 0 || i3 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof ch0;
            lg.g gVar = this.b;
            if (z10 && (hVar = (ch0Var = (ch0) drawable).C0) != null && hVar.g()) {
                ch0Var.B0 = new cl(2, this, gVar);
            } else {
                on.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.ec
    public final /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public final void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
