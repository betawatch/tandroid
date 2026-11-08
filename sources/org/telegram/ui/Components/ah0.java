package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ah0 extends ImageReceiver {
    public final /* synthetic */ ch0 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah0(ch0 ch0Var) {
        super(null);
        this.J1 = ch0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i7, z9, i10);
    }
}
