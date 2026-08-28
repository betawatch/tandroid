package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s4 extends FrameLayout {
    public final int a;

    public s4(Context context) {
        this(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(54.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public s4(Context context, int i9, int i10) {
        super(context);
        this.a = i10;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i9);
        addView(radialProgressView, g7.e6.e(-2, -2, 17));
    }
}
