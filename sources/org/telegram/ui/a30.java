package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class a30 extends View {
    public a30(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
    }
}
