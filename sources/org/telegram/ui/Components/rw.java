package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rw extends gz {
    public final /* synthetic */ tz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(tz tzVar, Context context) {
        super(tzVar, context, 1);
        this.H = tzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
