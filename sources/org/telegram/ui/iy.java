package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class iy implements org.telegram.messenger.nc {
    public final /* synthetic */ jy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.kj c;
    public final /* synthetic */ ky d;

    public iy(ky kyVar, jy jyVar, boolean z10, org.telegram.messenger.kj kjVar) {
        this.d = kyVar;
        this.a = jyVar;
        this.b = z10;
        this.c = kjVar;
    }

    @Override // org.telegram.messenger.nc
    public final void j(ImageReceiver imageReceiver) {
        org.telegram.messenger.kj kjVar;
        if (this.b && (kjVar = this.c) != null && kjVar.F2() && imageReceiver.B() != null && imageReceiver.B().y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.nc
    public final void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.nc
    public final /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
