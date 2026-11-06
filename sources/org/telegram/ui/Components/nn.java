package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class nn implements org.telegram.messenger.lc {
    public boolean a;
    public final /* synthetic */ kg.g b;
    public final /* synthetic */ pn c;

    public nn(kg.i iVar, kg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.lc
    public final void t0(int i7, Drawable drawable) {
        zg0 zg0Var;
        bg.i iVar;
        if (this.a) {
            return;
        }
        if ((i7 == 0 || i7 == 3) && drawable != null) {
            this.a = true;
            boolean z9 = drawable instanceof zg0;
            kg.g gVar = this.b;
            if (z9 && (iVar = (zg0Var = (zg0) drawable).B0) != null && iVar.g()) {
                zg0Var.A0 = new f(27, this, gVar);
            } else {
                pn.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public final /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }
}
