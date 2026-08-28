package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u8 extends View {
    public s8 a;
    public final y5 b;
    public boolean c;
    public boolean d;
    public final z10 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean v;
    public final /* synthetic */ w8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(w8 w8Var, Context context) {
        super(context);
        this.w = w8Var;
        y5 y5Var = new y5(400L, AndroidUtilities.overshootInterpolator);
        this.b = y5Var;
        this.e = new z10();
        y5Var.a = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
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
        y5 y5Var = this.b;
        y5Var.d(f10, false);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        s8 s8Var = this.a;
        if (s8Var != null) {
            int i9 = s8Var.c;
            int i10 = s8Var.d;
            int i11 = s8Var.e;
            int i12 = s8Var.f;
            z10 z10Var = this.e;
            z10Var.d(i9, i10, i11, i12);
            z10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = z10Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.He, false));
            }
            paint = this.s;
        }
        if (y5Var.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dpf2(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, e2.c.z(1.0f, y5Var.c, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)), paint);
        }
        if (this.v) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z10 = this.d && this.a == null;
            this.n = z10;
            this.h.setColorFilter(new PorterDuffColorFilter(z10 ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Je, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float lerp = AndroidUtilities.lerp(1.05f, 0.92f, y5Var.c);
            canvas.save();
            canvas.scale(lerp, lerp, measuredWidth, measuredHeight);
            this.h.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.d) {
            if (this.a == null) {
                if (this.f == null) {
                    Drawable drawable = getContext().getDrawable(R.drawable.msg_filled_plus);
                    this.f = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Je, false), PorterDuff.Mode.MULTIPLY));
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
            this.r.setAlpha(Math.round(Utilities.clamp(y5Var.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(5.0f) * y5Var.c), measuredHeight, AndroidUtilities.dp(1.5f), this.r);
            canvas.drawCircle((AndroidUtilities.dp(5.0f) * y5Var.c) + measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.w.L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
