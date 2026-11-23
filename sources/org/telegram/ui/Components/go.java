package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class go implements org.telegram.messenger.kc {
    public boolean a;
    public final /* synthetic */ kg.g b;
    public final /* synthetic */ io c;

    public go(kg.i iVar, kg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.kc
    public final void G0(int i7, Drawable drawable) {
        oh0 oh0Var;
        bg.i iVar;
        if (this.a) {
            return;
        }
        if ((i7 == 0 || i7 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof oh0;
            kg.g gVar = this.b;
            if (z10 && (iVar = (oh0Var = (oh0) drawable).C0) != null && iVar.g()) {
                oh0Var.B0 = new mf(19, this, gVar);
            } else {
                io.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.kc
    public final /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
