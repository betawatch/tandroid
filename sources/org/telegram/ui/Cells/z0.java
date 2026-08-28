package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z0 extends FrameLayout {
    public final fh.v a;
    public final org.telegram.ui.ActionBar.b6 b;
    public float c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = b6Var;
        fh.v vVar = new fh.v(this, context);
        this.a = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, g7.e6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, b6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ic, b6Var));
        vVar.addView(radialProgressView, g7.e6.e(32, 32, 17));
    }

    public final void a(float f10, int i9) {
        if (this.c != f10) {
            invalidate();
        }
        this.c = f10;
        this.d = i9;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
    }
}
