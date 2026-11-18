package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
