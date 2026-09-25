package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jj0 extends ImageReceiver {
    public final /* synthetic */ lj0 a;

    public jj0(lj0 lj0Var) {
        this.a = lj0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
