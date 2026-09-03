package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ij0 extends ImageReceiver {
    public final /* synthetic */ kj0 a;

    public ij0(kj0 kj0Var) {
        this.a = kj0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable != null) {
            this.a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
