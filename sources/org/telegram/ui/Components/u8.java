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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class u8 extends FrameLayout {
    public float A;
    public final /* synthetic */ v8 B;
    public long a;
    public TLRPC.Document b;
    public final jh.z3 c;
    public final c20 d;
    public final c20 e;
    public float f;
    public r8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final y5 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(v8 v8Var, Context context) {
        super(context);
        this.B = v8Var;
        this.d = new c20();
        this.e = new c20();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new y5(this, 200L, er.g);
        this.w = -1.0f;
        jh.z3 z3Var = new jh.z3(this, context, 6);
        this.c = z3Var;
        z3Var.getImageReceiver().setAutoRepeatCount(1);
        z3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z3Var, h7.z5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.s.c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f12, 0.0f, f14);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(r8 r8Var, boolean z10) {
        r8 r8Var2 = this.h;
        if (r8Var2 != null) {
            this.e.d(r8Var2.c, r8Var2.d, r8Var2.e, r8Var2.f);
            this.f = 0.0f;
            this.B.n = true;
        }
        this.h = r8Var;
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
        u8 u8Var;
        Canvas canvas2;
        k5 k5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.A = getMeasuredHeight() / 2.0f;
        v8 v8Var = this.B;
        float measuredWidth = v8Var.Q ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f10 = this.v ? 1.0f : 0.0f;
        y5 y5Var = this.s;
        y5Var.d(f10, false);
        float f11 = this.w;
        if (f11 >= 0.0f) {
            y5Var.d(f11, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, y5Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), v8Var.J);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), v8Var.J);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((v8Var.d - v8Var.c) / 2.0f) * v8Var.A) + getMeasuredHeight());
        r8 r8Var = this.h;
        if (r8Var != null) {
            int i10 = r8Var.c;
            int i11 = r8Var.d;
            int i12 = r8Var.e;
            int i13 = r8Var.f;
            c20 c20Var = this.d;
            c20Var.d(i10, i11, i12, i13);
            Paint paint = c20Var.c;
            float f12 = this.y;
            float f13 = this.x;
            float f14 = this.A;
            c20Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                u8Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                u8Var.a(canvas2, u8Var.y, u8Var.A, measuredWidth, u8Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!v8Var.Q ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), y5Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), v8Var.J) / 2.0f;
                jh.z3 z3Var = u8Var.c;
                k5Var = z3Var.e;
                if (k5Var != null) {
                    ImageReceiver imageReceiver = z3Var.a;
                    float f15 = u8Var.y - lerp2;
                    float f16 = u8Var.A - lerp2;
                    float f17 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f15, f16, f17, f17);
                    z3Var.a.setRoundRadius((int) (f17 * 0.13f));
                    z3Var.a.draw(canvas2);
                    return;
                }
                jh.y2 y2Var = k5Var.k;
                if (y2Var != null) {
                    y2Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                k5 k5Var2 = z3Var.e;
                float f18 = u8Var.y;
                float f19 = u8Var.A;
                k5Var2.setBounds((int) (f18 - lerp2), (int) (f19 - lerp2), (int) (f18 + lerp2), (int) (f19 + lerp2));
                z3Var.e.setColorFilter(u8Var.r);
                z3Var.e.draw(canvas2);
                return;
            }
            float f20 = this.y;
            float f21 = this.x;
            float f22 = f20 - f21;
            float f23 = this.A;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            c20 c20Var2 = this.e;
            c20Var2.b(f22, f24, f25, f26);
            Paint paint2 = c20Var2.c;
            paint2.setAlpha(255);
            u8Var = this;
            u8Var.a(canvas, this.y, this.A, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (u8Var.f * 255.0f));
            u8Var.a(canvas, u8Var.y, u8Var.A, measuredWidth, u8Var.x, paint);
            canvas = canvas;
            float f27 = u8Var.f + 0.064f;
            u8Var.f = f27;
            if (f27 > 1.0f) {
                u8Var.f = 1.0f;
            }
            invalidate();
        } else {
            u8Var = this;
        }
        canvas2 = canvas;
        if (!v8Var.Q) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!v8Var.Q ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), y5Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), v8Var.J) / 2.0f;
        jh.z3 z3Var2 = u8Var.c;
        k5Var = z3Var2.e;
        if (k5Var != null) {
        }
    }

    public long getDuration() {
        jh.z3 z3Var = this.c;
        ImageReceiver imageReceiver = z3Var.getImageReceiver();
        k5 k5Var = z3Var.e;
        if (k5Var != null) {
            imageReceiver = k5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().p();
    }

    public ImageReceiver getImageReceiver() {
        jh.z3 z3Var = this.c;
        ImageReceiver imageReceiver = z3Var.getImageReceiver();
        k5 k5Var = z3Var.e;
        if (k5Var == null) {
            return imageReceiver;
        }
        jh.y2 y2Var = k5Var.k;
        k5Var.setColorFilter(this.r);
        return y2Var;
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
        jh.y2 y2Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            jh.z3 z3Var = this.c;
            k5 k5Var = z3Var.e;
            if (k5Var != null && (y2Var = k5Var.k) != null) {
                y2Var.startAnimation();
            }
            z3Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
