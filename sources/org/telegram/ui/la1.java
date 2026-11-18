package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class la1 extends RadialProgressView {
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.m / 2;
    }
}
