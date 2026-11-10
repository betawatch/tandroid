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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jm0 extends FrameLayout {
    public int D;
    public int E;
    public ul0 F;
    public fh.g G;
    public fh.g H;
    public boolean I;
    public final Path J;
    public int K;
    public final ct a;
    public final v4.b0 b;
    public final x7 c;
    public int d;
    public final org.telegram.ui.Components.v5 e;
    public final ArrayList f;
    public wl0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public jm0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.J = new Path();
        this.K = TLObject.FLAG_31;
        ct ctVar = new ct(this, context, h6Var, 6);
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
        x7 x7Var = new x7(this, 6);
        this.c = x7Var;
        ctVar.setAdapter(x7Var);
        ctVar.setOnItemClickListener(new h(this, 20));
        addView(ctVar, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.v5(ctVar, 0L, 320L, org.telegram.ui.Components.wq.h);
    }

    public final void a(int i7, boolean z9) {
        int i10 = this.d;
        this.d = i7;
        if (!z9) {
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
            if (z9) {
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
            ((TextView) m10).setTextColor(i7 == this.d ? this.E : this.D);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bg.s.g(this.G, 0, 0, getWidth(), getHeight());
        bg.s.g(this.H, 0, 0, getWidth(), getHeight());
        (this.I ? this.H : this.G).draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
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
        Path path = this.J;
        path.rewind();
        float f10 = L;
        path.addRoundRect(f10, f10, i7 - L, i10 - L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L, Path.Direction.CW);
    }
}
