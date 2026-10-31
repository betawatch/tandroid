package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final fg.i a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.p6 c;
    public float d;
    public int e;

    public v0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = p6Var;
        fg.i iVar = new fg.i(this, context);
        this.a = iVar;
        iVar.setWillNotDraw(false);
        addView(iVar, w7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.Ka : org.telegram.ui.ActionBar.t6.Wc, p6Var));
        iVar.addView(radialProgressView, w7.b6.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.d != f7) {
            invalidate();
        }
        this.d = f7;
        this.e = i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.Ka : org.telegram.ui.ActionBar.t6.Wc, p6Var));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
