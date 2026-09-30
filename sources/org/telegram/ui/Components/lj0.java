package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class lj0 extends ImageReceiver {
    public final /* synthetic */ nj0 a;

    public lj0(nj0 nj0Var) {
        this.a = nj0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
