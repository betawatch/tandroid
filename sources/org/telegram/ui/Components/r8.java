package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r8 extends View {
    public p8 a;
    public final w5 b;
    public boolean c;
    public boolean d;
    public final f10 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final /* synthetic */ t8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(t8 t8Var, Context context) {
        super(context);
        this.x = t8Var;
        w5 w5Var = new w5(400L, org.telegram.messenger.g0.H);
        this.b = w5Var;
        this.e = new f10();
        w5Var.a = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        if (r14.n != (r14.d && r14.a == null)) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        float f10 = this.c ? 1.0f : 0.0f;
        w5 w5Var = this.b;
        w5Var.e(false, f10);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        p8 p8Var = this.a;
        if (p8Var != null) {
            int i7 = p8Var.c;
            int i10 = p8Var.d;
            int i11 = p8Var.e;
            int i12 = p8Var.f;
            f10 f10Var = this.e;
            f10Var.d(i7, i10, i11, i12);
            f10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = f10Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wf, false));
            }
            paint = this.s;
        }
        if (w5Var.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.N(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, com.google.android.recaptcha.internal.a.z(1.0f, w5Var.c, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f)), paint);
        }
        if (this.w) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z9 = this.d && this.a == null;
            this.n = z9;
            this.h.setColorFilter(new PorterDuffColorFilter(z9 ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yf, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float T1 = org.telegram.messenger.g0.T1(1.05f, 0.92f, w5Var.c);
            canvas.save();
            canvas.scale(T1, T1, measuredWidth, measuredHeight);
            this.h.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.d) {
            if (this.a == null) {
                if (this.f == null) {
                    Drawable drawable = getContext().getDrawable(R.drawable.msg_filled_plus);
                    this.f = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yf, false), PorterDuff.Mode.MULTIPLY));
                }
                this.f.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.f.getIntrinsicHeight() / 2.0f)), (int) ((this.f.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.f.getIntrinsicHeight() / 2.0f) + measuredHeight));
                this.f.draw(canvas);
                return;
            }
            if (this.r == null) {
                Paint paint3 = new Paint(1);
                this.r = paint3;
                paint3.setColor(-1);
            }
            this.r.setAlpha(Math.round(Utilities.i(w5Var.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(5.0f) * w5Var.c), measuredHeight, org.telegram.messenger.g0.L(1.5f), this.r);
            canvas.drawCircle((org.telegram.messenger.g0.L(5.0f) * w5Var.c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
