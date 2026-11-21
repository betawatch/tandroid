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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class km0 extends FrameLayout {
    public int E;
    public int F;
    public vl0 G;
    public fh.g H;
    public fh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final et a;
    public final v4.c0 b;
    public final y7 c;
    public int d;
    public final org.telegram.ui.Components.d6 e;
    public final ArrayList f;
    public xl0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public km0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = TLObject.FLAG_31;
        et etVar = new et(this, context, h6Var, 6);
        this.a = etVar;
        etVar.setClipToPadding(false);
        etVar.setClipChildren(false);
        etVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        etVar.setOverScrollMode(2);
        etVar.setHorizontalScrollBarEnabled(false);
        etVar.setItemAnimator(null);
        v4.c0 c0Var = new v4.c0(0, false);
        this.b = c0Var;
        etVar.setLayoutManager(c0Var);
        y7 y7Var = new y7(this, 6);
        this.c = y7Var;
        etVar.setAdapter(y7Var);
        etVar.setOnItemClickListener(new h(this, 20));
        addView(etVar, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.d6(etVar, 0L, 320L, org.telegram.ui.Components.nr.h);
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
        et etVar = this.a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z10) {
                etVar.y0(j3);
            } else {
                etVar.v0(j3);
            }
        }
        etVar.invalidate();
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
