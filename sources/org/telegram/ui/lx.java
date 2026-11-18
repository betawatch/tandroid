package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.messenger.jc {
    public final /* synthetic */ mx a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.fj c;
    public final /* synthetic */ nx d;

    public lx(nx nxVar, mx mxVar, boolean z10, org.telegram.messenger.fj fjVar) {
        this.d = nxVar;
        this.a = mxVar;
        this.b = z10;
        this.c = fjVar;
    }

    @Override // org.telegram.messenger.jc
    public final void V(ImageReceiver imageReceiver) {
        org.telegram.messenger.fj fjVar;
        if (this.b && (fjVar = this.c) != null && fjVar.F2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
