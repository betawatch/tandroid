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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class w8 extends View {
    public u8 a;
    public final d6 b;
    public boolean c;
    public boolean d;
    public final s10 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final /* synthetic */ y8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(y8 y8Var, Context context) {
        super(context);
        this.x = y8Var;
        d6 d6Var = new d6(400L, org.telegram.messenger.g0.H);
        this.b = d6Var;
        this.e = new s10();
        d6Var.a = this;
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
        d6 d6Var = this.b;
        d6Var.e(false, f10);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        u8 u8Var = this.a;
        if (u8Var != null) {
            int i7 = u8Var.c;
            int i10 = u8Var.d;
            int i11 = u8Var.e;
            int i12 = u8Var.f;
            s10 s10Var = this.e;
            s10Var.d(i7, i10, i11, i12);
            s10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = s10Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zf, false));
            }
            paint = this.s;
        }
        if (d6Var.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.N(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, com.google.android.gms.internal.vision.e2.z(1.0f, d6Var.c, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f)), paint);
        }
        if (this.w) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z10 = this.d && this.a == null;
            this.n = z10;
            this.h.setColorFilter(new PorterDuffColorFilter(z10 ? org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bf, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float T1 = org.telegram.messenger.g0.T1(1.05f, 0.92f, d6Var.c);
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
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bf, false), PorterDuff.Mode.MULTIPLY));
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
            this.r.setAlpha(Math.round(Utilities.i(d6Var.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(5.0f) * d6Var.c), measuredHeight, org.telegram.messenger.g0.L(1.5f), this.r);
            canvas.drawCircle((org.telegram.messenger.g0.L(5.0f) * d6Var.c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
