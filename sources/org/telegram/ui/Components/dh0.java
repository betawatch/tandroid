package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dh0 extends ImageReceiver {
    public final /* synthetic */ fh0 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh0(fh0 fh0Var) {
        super(null);
        this.K1 = fh0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.x0(drawable, str, i3, z10, i10);
    }
}
