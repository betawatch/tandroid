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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final dt a;
    public final v4.c0 b;
    public final z7 c;
    public int d;
    public final org.telegram.ui.Components.c6 e;
    public final ArrayList f;
    public vl0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public im0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = TLObject.FLAG_31;
        dt dtVar = new dt(this, context, i6Var, 6);
        this.a = dtVar;
        dtVar.setClipToPadding(false);
        dtVar.setClipChildren(false);
        dtVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        dtVar.setOverScrollMode(2);
        dtVar.setHorizontalScrollBarEnabled(false);
        dtVar.setItemAnimator(null);
        v4.c0 c0Var = new v4.c0(0, false);
        this.b = c0Var;
        dtVar.setLayoutManager(c0Var);
        z7 z7Var = new z7(this, 6);
        this.c = z7Var;
        dtVar.setAdapter(z7Var);
        dtVar.setOnItemClickListener(new h(this, 20));
        addView(dtVar, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.c6(dtVar, 0L, 320L, org.telegram.ui.Components.kr.h);
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
        dt dtVar = this.a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z10) {
                dtVar.y0(j3);
            } else {
                dtVar.v0(j3);
            }
        }
        dtVar.invalidate();
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
        bg.t.g(this.H, 0, 0, getWidth(), getHeight());
        bg.t.g(this.I, 0, 0, getWidth(), getHeight());
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
