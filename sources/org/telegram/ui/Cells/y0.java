package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final bh.p a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.u6 c;
    public float d;
    public int e;

    public y0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.c = u6Var;
        bh.p pVar = new bh.p(this, context);
        this.a = pVar;
        pVar.setWillNotDraw(false);
        addView(pVar, kb1.i(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ic, u6Var));
        pVar.addView(radialProgressView, kb1.i(32, 32, 17));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ic, this.c));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
