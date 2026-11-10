package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ma1 extends RadialProgressView {
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.m / 2;
    }
}
