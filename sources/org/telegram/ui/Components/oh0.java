package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oh0 extends ImageReceiver {
    public final /* synthetic */ qh0 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(qh0 qh0Var) {
        super(null);
        this.K1 = qh0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean y0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.y0(drawable, str, i7, z10, i10);
    }
}
