package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout {
    public final ag.l a;
    public final org.telegram.ui.ActionBar.g6 b;
    public float c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.b = g6Var;
        ag.l lVar = new ag.l(this, context);
        this.a = lVar;
        lVar.setWillNotDraw(false);
        addView(lVar, k7.c6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ic, g6Var));
        lVar.addView(radialProgressView, k7.c6.e(32, 32, 17));
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

    public void setProgressVisible(boolean z4) {
        this.a.setVisibility(z4 ? 0 : 4);
    }
}
