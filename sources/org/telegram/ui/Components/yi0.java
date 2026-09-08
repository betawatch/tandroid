package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yi0 extends ImageReceiver {
    public final /* synthetic */ aj0 a;

    public yi0(aj0 aj0Var) {
        this.a = aj0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
