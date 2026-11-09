package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        ah0 ah0Var;
        bg.i iVar;
        if (this.a) {
            return;
        }
        if ((i7 == 0 || i7 == 3) && drawable != null) {
            this.a = true;
            boolean z9 = drawable instanceof ah0;
            kg.g gVar = this.b;
            if (z9 && (iVar = (ah0Var = (ah0) drawable).B0) != null && iVar.g()) {
                ah0Var.A0 = new f(27, this, gVar);
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
