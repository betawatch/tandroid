package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class co implements org.telegram.messenger.jc {
    public boolean a;
    public final /* synthetic */ kg.g b;
    public final /* synthetic */ fo c;

    public co(kg.i iVar, kg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.jc
    public final void J(int i7, Drawable drawable) {
        nh0 nh0Var;
        bg.i iVar;
        if (this.a) {
            return;
        }
        if ((i7 == 0 || i7 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof nh0;
            kg.g gVar = this.b;
            if (z10 && (iVar = (nh0Var = (nh0) drawable).C0) != null && iVar.g()) {
                nh0Var.B0 = new xd(21, this, gVar);
            } else {
                fo.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public final void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
