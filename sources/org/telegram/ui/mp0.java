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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mp0 extends FrameLayout {
    public int B;
    public xo0 C;
    public pg.b D;
    public pg.b E;
    public boolean F;
    public final Path G;
    public int H;
    public final /* synthetic */ np0 I;
    public final lh.e1 a;
    public final f2.i0 b;
    public final a8 c;
    public int d;
    public final org.telegram.ui.Components.z5 e;
    public final ArrayList f;
    public zo0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public final Paint w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(np0 np0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.I = np0Var;
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.G = new Path();
        this.H = TLObject.FLAG_31;
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 29);
        this.a = e1Var;
        e1Var.setClipToPadding(false);
        e1Var.setClipChildren(false);
        e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        e1Var.setOverScrollMode(2);
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setItemAnimator(null);
        f2.i0 i0Var = new f2.i0(0, false);
        this.b = i0Var;
        e1Var.setLayoutManager(i0Var);
        a8 a8Var = new a8(this, 5);
        this.c = a8Var;
        e1Var.setAdapter(a8Var);
        e1Var.setOnItemClickListener(new j(this, 20));
        addView(e1Var, k7.b6.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.z5(e1Var, 0L, 320L, org.telegram.ui.Components.mr.h);
    }

    public final void a(int i10, boolean z4) {
        int i11 = this.d;
        this.d = i10;
        if (!z4) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        lh.e1 e1Var = this.a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z4) {
                e1Var.x0(clamp);
            } else {
                e1Var.u0(clamp);
            }
        }
        e1Var.invalidate();
    }

    public final void b(int i10) {
        View m9 = this.b.m(i10);
        if (m9 instanceof TextView) {
            ((TextView) m9).setTextColor(i10 == this.d ? this.B : this.y);
            m9.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kf.r.g(this.D, 0, 0, getWidth(), getHeight());
        kf.r.g(this.E, 0, 0, getWidth(), getHeight());
        (this.F ? this.E : this.D).draw(canvas);
        canvas.save();
        canvas.clipPath(this.G);
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
        Path path = this.G;
        path.rewind();
        float f10 = dp;
        path.addRoundRect(f10, f10, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
