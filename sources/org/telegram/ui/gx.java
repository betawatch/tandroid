package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gx implements org.telegram.messenger.lc {
    public final /* synthetic */ hx a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.ij c;
    public final /* synthetic */ ix d;

    public gx(ix ixVar, hx hxVar, boolean z9, org.telegram.messenger.ij ijVar) {
        this.d = ixVar;
        this.a = hxVar;
        this.b = z9;
        this.c = ijVar;
    }

    @Override // org.telegram.messenger.lc
    public final void O(ImageReceiver imageReceiver) {
        org.telegram.messenger.ij ijVar;
        if (this.b && (ijVar = this.c) != null && ijVar.G2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
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
