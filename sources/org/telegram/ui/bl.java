package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bl extends fi.m3 {
    public final /* synthetic */ cn W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(cn cnVar, Activity activity) {
        super(activity, 3);
        this.W0 = cnVar;
    }

    @Override // fi.m3, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.W0.Q1);
    }
}
