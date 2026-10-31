package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jy implements org.telegram.messenger.mc {
    public final /* synthetic */ ky a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.jj c;
    public final /* synthetic */ ly d;

    public jy(ly lyVar, ky kyVar, boolean z10, org.telegram.messenger.jj jjVar) {
        this.d = lyVar;
        this.a = kyVar;
        this.b = z10;
        this.c = jjVar;
    }

    @Override // org.telegram.messenger.mc
    public final void j(ImageReceiver imageReceiver) {
        org.telegram.messenger.jj jjVar;
        if (this.b && (jjVar = this.c) != null && jjVar.F2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.mc
    public final void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.mc
    public final /* synthetic */ void q(int i10, Drawable drawable) {
    }
}
