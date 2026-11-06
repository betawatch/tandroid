package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final bi.x5 a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.f6 c;
    public float d;
    public int e;

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = f6Var;
        bi.x5 x5Var = new bi.x5(this, context);
        this.a = x5Var;
        x5Var.setWillNotDraw(false);
        addView(x5Var, c8.ha.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i1(f6Var) ? org.telegram.ui.ActionBar.k6.Ka : org.telegram.ui.ActionBar.k6.Wc, f6Var));
        x5Var.addView(radialProgressView, c8.ha.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.e = i7;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z9) {
        this.a.setVisibility(z9 ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i1(f6Var) ? org.telegram.ui.ActionBar.k6.Ka : org.telegram.ui.ActionBar.k6.Wc, f6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
