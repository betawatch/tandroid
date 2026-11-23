package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kx implements org.telegram.messenger.jc {
    public final /* synthetic */ lx a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.fj c;
    public final /* synthetic */ mx d;

    public kx(mx mxVar, lx lxVar, boolean z10, org.telegram.messenger.fj fjVar) {
        this.d = mxVar;
        this.a = lxVar;
        this.b = z10;
        this.c = fjVar;
    }

    @Override // org.telegram.messenger.jc
    public final void r(ImageReceiver imageReceiver) {
        org.telegram.messenger.fj fjVar;
        if (this.b && (fjVar = this.c) != null && fjVar.F2() && imageReceiver.C() != null && imageReceiver.C().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.C() != null) {
            imageReceiver2.C().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void J(int i7, Drawable drawable) {
    }
}
