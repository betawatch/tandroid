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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class v8 extends FrameLayout {
    public float B;
    public final /* synthetic */ w8 C;
    public long a;
    public TLRPC.Document b;
    public final nh.y3 c;
    public final p20 d;
    public final p20 e;
    public float f;
    public s8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final z5 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(w8 w8Var, Context context) {
        super(context);
        this.C = w8Var;
        this.d = new p20();
        this.e = new p20();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new z5(this, 200L, nr.g);
        this.w = -1.0f;
        nh.y3 y3Var = new nh.y3(this, context, 6);
        this.c = y3Var;
        y3Var.getImageReceiver().setAutoRepeatCount(1);
        y3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y3Var, k7.b6.e(70, 70, 17));
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

    public final void b(s8 s8Var, boolean z4) {
        s8 s8Var2 = this.h;
        if (s8Var2 != null) {
            this.e.d(s8Var2.c, s8Var2.d, s8Var2.e, s8Var2.f);
            this.f = 0.0f;
            this.C.n = true;
        }
        this.h = s8Var;
        this.n = z4;
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
        l5 l5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.B = getMeasuredHeight() / 2.0f;
        w8 w8Var = this.C;
        float measuredWidth = w8Var.R ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f10 = this.v ? 1.0f : 0.0f;
        z5 z5Var = this.s;
        z5Var.d(f10, false);
        float f11 = this.w;
        if (f11 >= 0.0f) {
            z5Var.d(f11, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, z5Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), w8Var.K);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), w8Var.K);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((w8Var.d - w8Var.c) / 2.0f) * w8Var.B) + getMeasuredHeight());
        s8 s8Var = this.h;
        if (s8Var != null) {
            int i10 = s8Var.c;
            int i11 = s8Var.d;
            int i12 = s8Var.e;
            int i13 = s8Var.f;
            p20 p20Var = this.d;
            p20Var.d(i10, i11, i12, i13);
            Paint paint = p20Var.c;
            float f12 = this.y;
            float f13 = this.x;
            float f14 = this.B;
            p20Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                v8Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                v8Var.a(canvas2, v8Var.y, v8Var.B, measuredWidth, v8Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!w8Var.R ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), z5Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), w8Var.K) / 2.0f;
                nh.y3 y3Var = v8Var.c;
                l5Var = y3Var.e;
                if (l5Var != null) {
                    ImageReceiver imageReceiver = y3Var.a;
                    float f15 = v8Var.y - lerp2;
                    float f16 = v8Var.B - lerp2;
                    float f17 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f15, f16, f17, f17);
                    y3Var.a.setRoundRadius((int) (f17 * 0.13f));
                    y3Var.a.draw(canvas2);
                    return;
                }
                nh.y2 y2Var = l5Var.k;
                if (y2Var != null) {
                    y2Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                l5 l5Var2 = y3Var.e;
                float f18 = v8Var.y;
                float f19 = v8Var.B;
                l5Var2.setBounds((int) (f18 - lerp2), (int) (f19 - lerp2), (int) (f18 + lerp2), (int) (f19 + lerp2));
                y3Var.e.setColorFilter(v8Var.r);
                y3Var.e.draw(canvas2);
                return;
            }
            float f20 = this.y;
            float f21 = this.x;
            float f22 = f20 - f21;
            float f23 = this.B;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            p20 p20Var2 = this.e;
            p20Var2.b(f22, f24, f25, f26);
            Paint paint2 = p20Var2.c;
            paint2.setAlpha(255);
            v8Var = this;
            v8Var.a(canvas, this.y, this.B, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (v8Var.f * 255.0f));
            v8Var.a(canvas, v8Var.y, v8Var.B, measuredWidth, v8Var.x, paint);
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
        if (!w8Var.R) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!w8Var.R ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), z5Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), w8Var.K) / 2.0f;
        nh.y3 y3Var2 = v8Var.c;
        l5Var = y3Var2.e;
        if (l5Var != null) {
        }
    }

    public long getDuration() {
        nh.y3 y3Var = this.c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        l5 l5Var = y3Var.e;
        if (l5Var != null) {
            imageReceiver = l5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().p();
    }

    public ImageReceiver getImageReceiver() {
        nh.y3 y3Var = this.c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        l5 l5Var = y3Var.e;
        if (l5Var == null) {
            return imageReceiver;
        }
        nh.y2 y2Var = l5Var.k;
        l5Var.setColorFilter(this.r);
        return y2Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.C.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.C.R) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z4) {
        nh.y2 y2Var;
        if (this.v == z4) {
            return;
        }
        this.v = z4;
        if (z4) {
            nh.y3 y3Var = this.c;
            l5 l5Var = y3Var.e;
            if (l5Var != null && (y2Var = l5Var.k) != null) {
                y2Var.startAnimation();
            }
            y3Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
