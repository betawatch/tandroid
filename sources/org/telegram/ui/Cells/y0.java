package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout {
    public final bg.d1 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public float c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = c6Var;
        bg.d1 d1Var = new bg.d1(this, context);
        this.a = d1Var;
        d1Var.setWillNotDraw(false);
        addView(d1Var, i7.f6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ic, c6Var));
        d1Var.addView(radialProgressView, i7.f6.e(32, 32, 17));
    }

    public final void a(float f9, int i10) {
        if (this.c != f9) {
            invalidate();
        }
        this.c = f9;
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
