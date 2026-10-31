package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ci0 extends ImageReceiver {
    public final /* synthetic */ ei0 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(ei0 ei0Var) {
        super(null);
        this.J1 = ei0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i10, z10, i11);
    }
}
