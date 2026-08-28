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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class v8 extends FrameLayout {
    public float A;
    public final /* synthetic */ w8 B;
    public long a;
    public TLRPC.Document b;
    public final ih.d4 c;
    public final z10 d;
    public final z10 e;
    public float f;
    public s8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final y5 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(w8 w8Var, Context context) {
        super(context);
        this.B = w8Var;
        this.d = new z10();
        this.e = new z10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new y5(this, 200L, gr.g);
        this.w = -1.0f;
        ih.d4 d4Var = new ih.d4(this, context, 6);
        this.c = d4Var;
        d4Var.getImageReceiver().setAutoRepeatCount(1);
        d4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(d4Var, g7.e6.e(70, 70, 17));
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

    public final void b(s8 s8Var, boolean z10) {
        s8 s8Var2 = this.h;
        if (s8Var2 != null) {
            this.e.d(s8Var2.c, s8Var2.d, s8Var2.e, s8Var2.f);
            this.f = 0.0f;
            this.B.n = true;
        }
        this.h = s8Var;
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
        v8 v8Var;
        Canvas canvas2;
        k5 k5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.A = getMeasuredHeight() / 2.0f;
        w8 w8Var = this.B;
        float measuredWidth = w8Var.Q ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f10 = this.v ? 1.0f : 0.0f;
        y5 y5Var = this.s;
        y5Var.d(f10, false);
        float f11 = this.w;
        if (f11 >= 0.0f) {
            y5Var.d(f11, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, y5Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), w8Var.J);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), w8Var.J);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((w8Var.d - w8Var.c) / 2.0f) * w8Var.A) + getMeasuredHeight());
        s8 s8Var = this.h;
        if (s8Var != null) {
            int i9 = s8Var.c;
            int i10 = s8Var.d;
            int i11 = s8Var.e;
            int i12 = s8Var.f;
            z10 z10Var = this.d;
            z10Var.d(i9, i10, i11, i12);
            Paint paint = z10Var.c;
            float f12 = this.y;
            float f13 = this.x;
            float f14 = this.A;
            z10Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                v8Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                v8Var.a(canvas2, v8Var.y, v8Var.A, measuredWidth, v8Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!w8Var.Q ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), y5Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), w8Var.J) / 2.0f;
                ih.d4 d4Var = v8Var.c;
                k5Var = d4Var.e;
                if (k5Var != null) {
                    ImageReceiver imageReceiver = d4Var.a;
                    float f15 = v8Var.y - lerp2;
                    float f16 = v8Var.A - lerp2;
                    float f17 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f15, f16, f17, f17);
                    d4Var.a.setRoundRadius((int) (f17 * 0.13f));
                    d4Var.a.draw(canvas2);
                    return;
                }
                ih.z2 z2Var = k5Var.k;
                if (z2Var != null) {
                    z2Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                k5 k5Var2 = d4Var.e;
                float f18 = v8Var.y;
                float f19 = v8Var.A;
                k5Var2.setBounds((int) (f18 - lerp2), (int) (f19 - lerp2), (int) (f18 + lerp2), (int) (f19 + lerp2));
                d4Var.e.setColorFilter(v8Var.r);
                d4Var.e.draw(canvas2);
                return;
            }
            float f20 = this.y;
            float f21 = this.x;
            float f22 = f20 - f21;
            float f23 = this.A;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            z10 z10Var2 = this.e;
            z10Var2.b(f22, f24, f25, f26);
            Paint paint2 = z10Var2.c;
            paint2.setAlpha(255);
            v8Var = this;
            v8Var.a(canvas, this.y, this.A, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (v8Var.f * 255.0f));
            v8Var.a(canvas, v8Var.y, v8Var.A, measuredWidth, v8Var.x, paint);
            canvas = canvas;
            float f27 = v8Var.f + 0.064f;
            v8Var.f = f27;
            if (f27 > 1.0f) {
                v8Var.f = 1.0f;
            }
            invalidate();
        } else {
            v8Var = this;
        }
        canvas2 = canvas;
        if (!w8Var.Q) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!w8Var.Q ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), y5Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), w8Var.J) / 2.0f;
        ih.d4 d4Var2 = v8Var.c;
        k5Var = d4Var2.e;
        if (k5Var != null) {
        }
    }

    public long getDuration() {
        ih.d4 d4Var = this.c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        k5 k5Var = d4Var.e;
        if (k5Var != null) {
            imageReceiver = k5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().p();
    }

    public ImageReceiver getImageReceiver() {
        ih.d4 d4Var = this.c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        k5 k5Var = d4Var.e;
        if (k5Var == null) {
            return imageReceiver;
        }
        ih.z2 z2Var = k5Var.k;
        k5Var.setColorFilter(this.r);
        return z2Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.B.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.B.Q) {
            super.onMeasure(i9, i10);
        } else {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z10) {
        ih.z2 z2Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ih.d4 d4Var = this.c;
            k5 k5Var = d4Var.e;
            if (k5Var != null && (z2Var = k5Var.k) != null) {
                z2Var.startAnimation();
            }
            d4Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
