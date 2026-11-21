package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ph0 extends ImageReceiver {
    public final /* synthetic */ rh0 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(rh0 rh0Var) {
        super(null);
        this.K1 = rh0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
