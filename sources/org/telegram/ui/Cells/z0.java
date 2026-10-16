package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z0 extends FrameLayout {
    public final ah.v a;
    public final org.telegram.ui.ActionBar.c6 b;
    public float c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = c6Var;
        ah.v vVar = new ah.v(this, context);
        this.a = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.ic, c6Var));
        vVar.addView(radialProgressView, w7.z5.e(32, 32, 17));
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
