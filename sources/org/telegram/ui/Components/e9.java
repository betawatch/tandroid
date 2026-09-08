package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class e9 extends FrameLayout {
    public float E;
    public final /* synthetic */ f9 F;
    public long a;
    public TLRPC.Document b;
    public final bi.i5 c;
    public final o20 d;
    public final o20 e;
    public float f;
    public b9 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final e6 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(f9 f9Var, Context context) {
        super(context);
        this.F = f9Var;
        this.d = new o20();
        this.e = new o20();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new e6(this, 200L, pr.g);
        this.w = -1.0f;
        bi.i5 i5Var = new bi.i5(this, context, 7);
        this.c = i5Var;
        i5Var.getImageReceiver().setAutoRepeatCount(1);
        i5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(i5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.s.c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(b9 b9Var, boolean z10) {
        b9 b9Var2 = this.h;
        if (b9Var2 != null) {
            this.e.d(b9Var2.c, b9Var2.d, b9Var2.e, b9Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = b9Var;
        this.n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        e9 e9Var;
        Canvas canvas2;
        q5 q5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        f9 f9Var = this.F;
        float measuredWidth = f9Var.U ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f7 = this.v ? 1.0f : 0.0f;
        e6 e6Var = this.s;
        e6Var.d(f7, false);
        float f10 = this.w;
        if (f10 >= 0.0f) {
            e6Var.d(f10, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, e6Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), f9Var.N);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), f9Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((f9Var.d - f9Var.c) / 2.0f) * f9Var.E) + getMeasuredHeight());
        b9 b9Var = this.h;
        if (b9Var != null) {
            int i10 = b9Var.c;
            int i11 = b9Var.d;
            int i12 = b9Var.e;
            int i13 = b9Var.f;
            o20 o20Var = this.d;
            o20Var.d(i10, i11, i12, i13);
            Paint paint = o20Var.c;
            float f11 = this.y;
            float f12 = this.x;
            float f13 = this.E;
            o20Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                e9Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                e9Var.a(canvas2, e9Var.y, e9Var.E, measuredWidth, e9Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!f9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), e6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), f9Var.N) / 2.0f;
                bi.i5 i5Var = e9Var.c;
                q5Var = i5Var.e;
                if (q5Var != null) {
                    ImageReceiver imageReceiver = i5Var.a;
                    float f14 = e9Var.y - lerp2;
                    float f15 = e9Var.E - lerp2;
                    float f16 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    i5Var.a.setRoundRadius((int) (f16 * 0.13f));
                    i5Var.a.draw(canvas2);
                    return;
                }
                bi.y3 y3Var = q5Var.k;
                if (y3Var != null) {
                    y3Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                q5 q5Var2 = i5Var.e;
                float f17 = e9Var.y;
                float f18 = e9Var.E;
                q5Var2.setBounds((int) (f17 - lerp2), (int) (f18 - lerp2), (int) (f17 + lerp2), (int) (f18 + lerp2));
                i5Var.e.setColorFilter(e9Var.r);
                i5Var.e.draw(canvas2);
                return;
            }
            float f19 = this.y;
            float f20 = this.x;
            float f21 = f19 - f20;
            float f22 = this.E;
            float f23 = f22 - f20;
            float f24 = f19 + f20;
            float f25 = f22 + f20;
            o20 o20Var2 = this.e;
            o20Var2.b(f21, f23, f24, f25);
            Paint paint2 = o20Var2.c;
            paint2.setAlpha(255);
            e9Var = this;
            e9Var.a(canvas, this.y, this.E, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (e9Var.f * 255.0f));
            e9Var.a(canvas, e9Var.y, e9Var.E, measuredWidth, e9Var.x, paint);
            canvas = canvas;
            float f26 = e9Var.f + 0.064f;
            e9Var.f = f26;
            if (f26 > 1.0f) {
                e9Var.f = 1.0f;
            }
            invalidate();
        } else {
            e9Var = this;
        }
        canvas2 = canvas;
        if (!f9Var.U) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!f9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), e6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), f9Var.N) / 2.0f;
        bi.i5 i5Var2 = e9Var.c;
        q5Var = i5Var2.e;
        if (q5Var != null) {
        }
    }

    public long getDuration() {
        bi.i5 i5Var = this.c;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        q5 q5Var = i5Var.e;
        if (q5Var != null) {
            imageReceiver = q5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().p();
    }

    public ImageReceiver getImageReceiver() {
        bi.i5 i5Var = this.c;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        q5 q5Var = i5Var.e;
        if (q5Var == null) {
            return imageReceiver;
        }
        bi.y3 y3Var = q5Var.k;
        q5Var.setColorFilter(this.r);
        return y3Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.F.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.F.U) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z10) {
        bi.y3 y3Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            bi.i5 i5Var = this.c;
            q5 q5Var = i5Var.e;
            if (q5Var != null && (y3Var = q5Var.k) != null) {
                y3Var.startAnimation();
            }
            i5Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
