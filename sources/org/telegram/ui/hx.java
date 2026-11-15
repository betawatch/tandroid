package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hx implements org.telegram.messenger.kc {
    public final /* synthetic */ ix a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.gj c;
    public final /* synthetic */ jx d;

    public hx(jx jxVar, ix ixVar, boolean z10, org.telegram.messenger.gj gjVar) {
        this.d = jxVar;
        this.a = ixVar;
        this.b = z10;
        this.c = gjVar;
    }

    @Override // org.telegram.messenger.kc
    public final void A(ImageReceiver imageReceiver) {
        org.telegram.messenger.gj gjVar;
        if (this.b && (gjVar = this.c) != null && gjVar.F2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.kc
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.kc
    public final /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
