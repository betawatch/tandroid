package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class di0 extends ImageReceiver {
    public final /* synthetic */ fi0 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(fi0 fi0Var) {
        super(null);
        this.J1 = fi0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i10, z10, i11);
    }
}
