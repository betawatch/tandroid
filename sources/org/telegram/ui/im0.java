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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class im0 extends FrameLayout {
    public int E;
    public int F;
    public tl0 G;
    public fh.g H;
    public fh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final ct a;
    public final v4.b0 b;
    public final y7 c;
    public int d;
    public final org.telegram.ui.Components.u5 e;
    public final ArrayList f;
    public vl0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public im0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = TLObject.FLAG_31;
        ct ctVar = new ct(this, context, e6Var, 6);
        this.a = ctVar;
        ctVar.setClipToPadding(false);
        ctVar.setClipChildren(false);
        ctVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ctVar.setOverScrollMode(2);
        ctVar.setHorizontalScrollBarEnabled(false);
        ctVar.setItemAnimator(null);
        v4.b0 b0Var = new v4.b0(0, false);
        this.b = b0Var;
        ctVar.setLayoutManager(b0Var);
        y7 y7Var = new y7(this, 6);
        this.c = y7Var;
        ctVar.setAdapter(y7Var);
        ctVar.setOnItemClickListener(new h(this, 20));
        addView(ctVar, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.u5(ctVar, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(int i7, boolean z10) {
        int i10 = this.d;
        this.d = i7;
        if (!z10) {
            this.e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ct ctVar = this.a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z10) {
                ctVar.y0(j3);
            } else {
                ctVar.v0(j3);
            }
        }
        ctVar.invalidate();
    }

    public final void b(int i7) {
        View m10 = this.b.m(i7);
        if (m10 instanceof TextView) {
            ((TextView) m10).setTextColor(i7 == this.d ? this.F : this.E);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bg.s.g(this.H, 0, 0, getWidth(), getHeight());
        bg.s.g(this.I, 0, 0, getWidth(), getHeight());
        (this.J ? this.I : this.H).draw(canvas);
        canvas.save();
        canvas.clipPath(this.K);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f10 = L;
        path.addRoundRect(f10, f10, i7 - L, i10 - L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L, Path.Direction.CW);
    }
}
