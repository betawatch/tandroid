package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xw extends gz {
    public final /* synthetic */ tz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(tz tzVar, Context context) {
        super(tzVar, context, 2);
        this.H = tzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
