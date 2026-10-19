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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hp0 extends FrameLayout {
    public int E;
    public so0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final /* synthetic */ ip0 L;
    public final g10 a;
    public final s4.b0 b;
    public final z7 c;
    public int d;
    public final org.telegram.ui.Components.f6 e;
    public final ArrayList f;
    public uo0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public final Paint w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(ip0 ip0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = ip0Var;
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.J = new Path();
        this.K = TLObject.FLAG_31;
        g10 g10Var = new g10(this, context, d6Var, 2);
        this.a = g10Var;
        g10Var.setClipToPadding(false);
        g10Var.setClipChildren(false);
        g10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        g10Var.setOverScrollMode(2);
        g10Var.setHorizontalScrollBarEnabled(false);
        g10Var.setItemAnimator(null);
        s4.b0 b0Var = new s4.b0(0, false);
        this.b = b0Var;
        g10Var.setLayoutManager(b0Var);
        z7 z7Var = new z7(this, 5);
        this.c = z7Var;
        g10Var.setAdapter(z7Var);
        g10Var.setOnItemClickListener(new i(this, 21));
        addView(g10Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.f6(g10Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        g10 g10Var = this.a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                g10Var.x0(clamp);
            } else {
                g10Var.u0(clamp);
            }
        }
        g10Var.invalidate();
    }

    public final void b(int i10) {
        View m10 = this.b.m(i10);
        if (m10 instanceof TextView) {
            ((TextView) m10).setTextColor(i10 == this.d ? this.E : this.y);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zf.p.g(this.G, 0, 0, getWidth(), getHeight());
        zf.p.g(this.H, 0, 0, getWidth(), getHeight());
        (this.I ? this.H : this.G).draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(f7, f7, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
