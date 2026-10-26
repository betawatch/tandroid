package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class no0 extends View {
    public mo0 a;
    public final h6 b;
    public final eh.d c;
    public bh.x0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ oo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(oo0 oo0Var, Context context) {
        super(context);
        this.s = oo0Var;
        this.b = new h6(this, 0L, 260L, ds.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        gb1.b(this);
        ch.b bVar = oo0Var.v;
        if (bVar != null) {
            eh.d c10 = bVar.c(this, null, false);
            c10.v(oo0Var.w);
            c10.A(AndroidUtilities.dp(5.0f));
            eh.d u10 = c10.u();
            org.telegram.messenger.vh.s(u10, AndroidUtilities.dp(6.0f), 4.0f);
            this.c = u10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        mo0 mo0Var = this.a;
        if (mo0Var != null) {
            mo0Var.p = z10;
            h6 h6Var = this.b;
            if (z11) {
                mo0Var.i = mo0Var.N;
                mo0Var.g = mo0Var.O;
                mo0Var.h = mo0Var.P;
                h6Var.d(0.0f, true);
            } else {
                h6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r) {
            return;
        }
        mo0 mo0Var = this.a;
        if (mo0Var != null) {
            mo0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            mo0 mo0Var = this.a;
            if (mo0Var != null) {
                mo0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        oo0 oo0Var = this.s;
        Paint paint = oo0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        mo0 mo0Var = this.a;
        int i10 = mo0Var.B;
        int i11 = (height - i10) / 2;
        eh.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, mo0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                bh.y0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.u6 u6Var = oo0Var.c;
            paint.setColor((u6Var == null ? !org.telegram.ui.ActionBar.y6.I.q() : !u6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        mo0 mo0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (mo0Var != null ? mo0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
