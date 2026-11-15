package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vn implements org.telegram.messenger.kc {
    public boolean a;
    public final /* synthetic */ kg.g b;
    public final /* synthetic */ xn c;

    public vn(kg.i iVar, kg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.kc
    public final void O(int i7, Drawable drawable) {
        ch0 ch0Var;
        bg.i iVar;
        if (this.a) {
            return;
        }
        if ((i7 == 0 || i7 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof ch0;
            kg.g gVar = this.b;
            if (z10 && (iVar = (ch0Var = (ch0) drawable).C0) != null && iVar.g()) {
                ch0Var.B0 = new od(21, this, gVar);
            } else {
                xn.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.kc
    public final /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
