package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ix implements org.telegram.messenger.lc {
    public final /* synthetic */ jx a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.ij c;
    public final /* synthetic */ kx d;

    public ix(kx kxVar, jx jxVar, boolean z9, org.telegram.messenger.ij ijVar) {
        this.d = kxVar;
        this.a = jxVar;
        this.b = z9;
        this.c = ijVar;
    }

    @Override // org.telegram.messenger.lc
    public final void O(ImageReceiver imageReceiver) {
        org.telegram.messenger.ij ijVar;
        if (this.b && (ijVar = this.c) != null && ijVar.F2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.lc
    public final /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
