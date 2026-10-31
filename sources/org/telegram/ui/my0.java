package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class my0 implements org.telegram.messenger.mc {
    public final /* synthetic */ Runnable[] a;

    public my0(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // org.telegram.messenger.mc
    public final void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.bi0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.A0 = new wv0(runnableArr, 9);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // org.telegram.messenger.mc
    public final /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public final /* synthetic */ void q(int i10, Drawable drawable) {
    }
}
