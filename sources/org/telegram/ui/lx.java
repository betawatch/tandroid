package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.messenger.kc {
    public final /* synthetic */ mx a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.gj c;
    public final /* synthetic */ nx d;

    public lx(nx nxVar, mx mxVar, boolean z10, org.telegram.messenger.gj gjVar) {
        this.d = nxVar;
        this.a = mxVar;
        this.b = z10;
        this.c = gjVar;
    }

    @Override // org.telegram.messenger.kc
    public final void V(ImageReceiver imageReceiver) {
        org.telegram.messenger.gj gjVar;
        if (this.b && (gjVar = this.c) != null && gjVar.F2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.kc
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.kc
    public final /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
