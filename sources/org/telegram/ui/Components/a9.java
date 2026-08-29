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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class a9 extends FrameLayout {
    public float A;
    public final /* synthetic */ b9 B;
    public long a;
    public TLRPC.Document b;
    public final lh.y3 c;
    public final k20 d;
    public final k20 e;
    public float f;
    public x8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final d6 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(b9 b9Var, Context context) {
        super(context);
        this.B = b9Var;
        this.d = new k20();
        this.e = new k20();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new d6(this, 200L, jr.g);
        this.w = -1.0f;
        lh.y3 y3Var = new lh.y3(this, context, 6);
        this.c = y3Var;
        y3Var.getImageReceiver().setAutoRepeatCount(1);
        y3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y3Var, i7.f6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f9, float f10, float f11, float f12, Paint paint) {
        float f13 = this.s.c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f9, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9 - f12, f10 - f12, f9 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(x8 x8Var, boolean z10) {
        x8 x8Var2 = this.h;
        if (x8Var2 != null) {
            this.e.d(x8Var2.c, x8Var2.d, x8Var2.e, x8Var2.f);
            this.f = 0.0f;
            this.B.n = true;
        }
        this.h = x8Var;
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
        a9 a9Var;
        Canvas canvas2;
        p5 p5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.A = getMeasuredHeight() / 2.0f;
        b9 b9Var = this.B;
        float measuredWidth = b9Var.Q ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f9 = this.v ? 1.0f : 0.0f;
        d6 d6Var = this.s;
        d6Var.d(f9, false);
        float f10 = this.w;
        if (f10 >= 0.0f) {
            d6Var.d(f10, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, d6Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), b9Var.J);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), b9Var.J);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((b9Var.d - b9Var.c) / 2.0f) * b9Var.A) + getMeasuredHeight());
        x8 x8Var = this.h;
        if (x8Var != null) {
            int i10 = x8Var.c;
            int i11 = x8Var.d;
            int i12 = x8Var.e;
            int i13 = x8Var.f;
            k20 k20Var = this.d;
            k20Var.d(i10, i11, i12, i13);
            Paint paint = k20Var.c;
            float f11 = this.y;
            float f12 = this.x;
            float f13 = this.A;
            k20Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                a9Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                a9Var.a(canvas2, a9Var.y, a9Var.A, measuredWidth, a9Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!b9Var.Q ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), d6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), b9Var.J) / 2.0f;
                lh.y3 y3Var = a9Var.c;
                p5Var = y3Var.e;
                if (p5Var != null) {
                    ImageReceiver imageReceiver = y3Var.a;
                    float f14 = a9Var.y - lerp2;
                    float f15 = a9Var.A - lerp2;
                    float f16 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    y3Var.a.setRoundRadius((int) (f16 * 0.13f));
                    y3Var.a.draw(canvas2);
                    return;
                }
                lh.x2 x2Var = p5Var.k;
                if (x2Var != null) {
                    x2Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                p5 p5Var2 = y3Var.e;
                float f17 = a9Var.y;
                float f18 = a9Var.A;
                p5Var2.setBounds((int) (f17 - lerp2), (int) (f18 - lerp2), (int) (f17 + lerp2), (int) (f18 + lerp2));
                y3Var.e.setColorFilter(a9Var.r);
                y3Var.e.draw(canvas2);
                return;
            }
            float f19 = this.y;
            float f20 = this.x;
            float f21 = f19 - f20;
            float f22 = this.A;
            float f23 = f22 - f20;
            float f24 = f19 + f20;
            float f25 = f22 + f20;
            k20 k20Var2 = this.e;
            k20Var2.b(f21, f23, f24, f25);
            Paint paint2 = k20Var2.c;
            paint2.setAlpha(255);
            a9Var = this;
            a9Var.a(canvas, this.y, this.A, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (a9Var.f * 255.0f));
            a9Var.a(canvas, a9Var.y, a9Var.A, measuredWidth, a9Var.x, paint);
            canvas = canvas;
            float f26 = a9Var.f + 0.064f;
            a9Var.f = f26;
            if (f26 > 1.0f) {
                a9Var.f = 1.0f;
            }
            invalidate();
        } else {
            a9Var = this;
        }
        canvas2 = canvas;
        if (!b9Var.Q) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!b9Var.Q ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), d6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), b9Var.J) / 2.0f;
        lh.y3 y3Var2 = a9Var.c;
        p5Var = y3Var2.e;
        if (p5Var != null) {
        }
    }

    public long getDuration() {
        lh.y3 y3Var = this.c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        p5 p5Var = y3Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().p();
    }

    public ImageReceiver getImageReceiver() {
        lh.y3 y3Var = this.c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        p5 p5Var = y3Var.e;
        if (p5Var == null) {
            return imageReceiver;
        }
        lh.x2 x2Var = p5Var.k;
        p5Var.setColorFilter(this.r);
        return x2Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.B.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.B.Q) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z10) {
        lh.x2 x2Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            lh.y3 y3Var = this.c;
            p5 p5Var = y3Var.e;
            if (p5Var != null && (x2Var = p5Var.k) != null) {
                x2Var.startAnimation();
            }
            y3Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
