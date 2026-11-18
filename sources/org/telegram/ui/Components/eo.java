package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class eo implements org.telegram.messenger.jc {
    public boolean a;
    public final /* synthetic */ kg.g b;
    public final /* synthetic */ go c;

    public eo(kg.i iVar, kg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.jc
    public final void G0(int i7, Drawable drawable) {
        mh0 mh0Var;
        bg.i iVar;
        if (this.a) {
            return;
        }
        if ((i7 == 0 || i7 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof mh0;
            kg.g gVar = this.b;
            if (z10 && (iVar = (mh0Var = (mh0) drawable).C0) != null && iVar.g()) {
                mh0Var.B0 = new mg(17, this, gVar);
            } else {
                go.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
