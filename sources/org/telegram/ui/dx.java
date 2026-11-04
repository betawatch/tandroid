package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dx implements org.telegram.messenger.ec {
    public final /* synthetic */ ex a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.zi c;
    public final /* synthetic */ fx d;

    public dx(fx fxVar, ex exVar, boolean z10, org.telegram.messenger.zi ziVar) {
        this.d = fxVar;
        this.a = exVar;
        this.b = z10;
        this.c = ziVar;
    }

    @Override // org.telegram.messenger.ec
    public final void D(ImageReceiver imageReceiver) {
        org.telegram.messenger.zi ziVar;
        if (this.b && (ziVar = this.c) != null && ziVar.G2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.ec
    public final void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.ec
    public final /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
