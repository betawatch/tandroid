package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z0 extends FrameLayout {
    public final ci.m6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public float c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        ci.m6 m6Var = new ci.m6(this, context);
        this.a = m6Var;
        m6Var.setWillNotDraw(false);
        addView(m6Var, w7.x5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ic, e6Var));
        m6Var.addView(radialProgressView, w7.x5.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.c != f7) {
            invalidate();
        }
        this.c = f7;
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
