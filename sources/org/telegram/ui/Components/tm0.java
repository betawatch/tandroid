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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tm0 extends View {
    public sm0 a;
    public final y5 b;
    public final lg.d c;
    public ig.q0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ um0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(um0 um0Var, Context context) {
        super(context);
        this.s = um0Var;
        this.b = new y5(this, 0L, 260L, er.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        h7.b6.a(this);
        jg.a aVar = um0Var.v;
        if (aVar != null) {
            lg.d c10 = aVar.c(this, null, false);
            c10.n(um0Var.w);
            c10.t(AndroidUtilities.dp(5.0f));
            lg.d m10 = c10.m();
            m10.p(AndroidUtilities.dp(6.0f));
            m10.o(AndroidUtilities.dp(4.0f));
            this.c = m10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.p = z10;
            y5 y5Var = this.b;
            if (z11) {
                sm0Var.i = sm0Var.N;
                sm0Var.g = sm0Var.O;
                sm0Var.h = sm0Var.P;
                y5Var.d(0.0f, true);
            } else {
                y5Var.d(1.0f, true);
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
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            sm0 sm0Var = this.a;
            if (sm0Var != null) {
                sm0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        um0 um0Var = this.s;
        Paint paint = um0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        sm0 sm0Var = this.a;
        int i10 = sm0Var.B;
        int i11 = (height - i10) / 2;
        lg.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, sm0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                ig.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.c6 c6Var = um0Var.c;
            paint.setColor((c6Var == null ? !org.telegram.ui.ActionBar.g6.I.q() : !c6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        sm0 sm0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (sm0Var != null ? sm0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
