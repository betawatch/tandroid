package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nh0 extends ImageReceiver {
    public final /* synthetic */ ph0 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(ph0 ph0Var) {
        super(null);
        this.K1 = ph0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
