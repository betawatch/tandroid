package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout {
    public final ag.y1 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public float c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = c6Var;
        ag.y1 y1Var = new ag.y1(this, context);
        this.a = y1Var;
        y1Var.setWillNotDraw(false);
        addView(y1Var, h7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ic, c6Var));
        y1Var.addView(radialProgressView, h7.z5.e(32, 32, 17));
    }

    public final void a(float f10, int i10) {
        if (this.c != f10) {
            invalidate();
        }
        this.c = f10;
        this.d = i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
    }
}
