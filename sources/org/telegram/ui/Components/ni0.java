package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ni0 extends ImageReceiver {
    public final /* synthetic */ pi0 a;

    public ni0(pi0 pi0Var) {
        this.a = pi0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        if (drawable != null) {
            this.a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
    }
}
