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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d9 extends View {
    public b9 a;
    public final e6 b;
    public boolean c;
    public boolean d;
    public final o20 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean v;
    public final /* synthetic */ f9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(f9 f9Var, Context context) {
        super(context);
        this.w = f9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.b = e6Var;
        this.e = new o20();
        e6Var.a = this;
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
        float f7 = this.c ? 1.0f : 0.0f;
        e6 e6Var = this.b;
        e6Var.d(f7, false);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        b9 b9Var = this.a;
        if (b9Var != null) {
            int i10 = b9Var.c;
            int i11 = b9Var.d;
            int i12 = b9Var.e;
            int i13 = b9Var.f;
            o20 o20Var = this.e;
            o20Var.d(i10, i11, i12, i13);
            o20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = o20Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.He, false));
            }
            paint = this.s;
        }
        if (e6Var.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dpf2(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, com.google.android.gms.internal.vision.e2.z(1.0f, e6Var.c, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)), paint);
        }
        if (this.v) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z10 = this.d && this.a == null;
            this.n = z10;
            this.h.setColorFilter(new PorterDuffColorFilter(z10 ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Je, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float lerp = AndroidUtilities.lerp(1.05f, 0.92f, e6Var.c);
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
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Je, false), PorterDuff.Mode.MULTIPLY));
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
            this.r.setAlpha(Math.round(Utilities.clamp(e6Var.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(5.0f) * e6Var.c), measuredHeight, AndroidUtilities.dp(1.5f), this.r);
            canvas.drawCircle((AndroidUtilities.dp(5.0f) * e6Var.c) + measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.w.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
