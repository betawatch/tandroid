package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bm0 extends FrameLayout {
    public int E;
    public int F;
    public ml0 G;
    public gh.g H;
    public gh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final xs a;
    public final u4.b0 b;
    public final y7 c;
    public int d;
    public final org.telegram.ui.Components.u5 e;
    public final ArrayList f;
    public ol0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public bm0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = TLObject.FLAG_31;
        xs xsVar = new xs(this, context, e6Var, 6);
        this.a = xsVar;
        xsVar.setClipToPadding(false);
        xsVar.setClipChildren(false);
        xsVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        xsVar.setOverScrollMode(2);
        xsVar.setHorizontalScrollBarEnabled(false);
        xsVar.setItemAnimator(null);
        u4.b0 b0Var = new u4.b0(0, false);
        this.b = b0Var;
        xsVar.setLayoutManager(b0Var);
        y7 y7Var = new y7(this, 6);
        this.c = y7Var;
        xsVar.setAdapter(y7Var);
        xsVar.setOnItemClickListener(new h(this, 20));
        addView(xsVar, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.u5(xsVar, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(int i3, boolean z10) {
        int i10 = this.d;
        this.d = i3;
        if (!z10) {
            this.e.e(true, i3);
        }
        b(i10);
        if (i3 != i10) {
            b(i3);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        xs xsVar = this.a;
        if (!isEmpty) {
            int j10 = Utilities.j(i3, arrayList.size() - 1, 0);
            if (z10) {
                xsVar.y0(j10);
            } else {
                xsVar.v0(j10);
            }
        }
        xsVar.invalidate();
    }

    public final void b(int i3) {
        View m10 = this.b.m(i3);
        if (m10 instanceof TextView) {
            ((TextView) m10).setTextColor(i3 == this.d ? this.F : this.E);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cg.r.g(this.H, 0, 0, getWidth(), getHeight());
        cg.r.g(this.I, 0, 0, getWidth(), getHeight());
        (this.J ? this.I : this.H).draw(canvas);
        canvas.save();
        canvas.clipPath(this.K);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f10 = L;
        path.addRoundRect(f10, f10, i3 - L, i10 - L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L, Path.Direction.CW);
    }
}
