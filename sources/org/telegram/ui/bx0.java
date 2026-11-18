package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bx0 implements org.telegram.messenger.jc {
    public final /* synthetic */ Runnable[] a;

    public bx0(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // org.telegram.messenger.jc
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.mh0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.B0 = new ru0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
