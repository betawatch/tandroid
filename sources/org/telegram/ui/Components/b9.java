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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class b9 extends FrameLayout {
    public float E;
    public final /* synthetic */ c9 F;
    public long a;
    public TLRPC.Document b;
    public final ai.z5 c;
    public final o20 d;
    public final o20 e;
    public float f;
    public y8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final c6 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(c9 c9Var, Context context) {
        super(context);
        this.F = c9Var;
        this.d = new o20();
        this.e = new o20();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new c6(this, 200L, qr.g);
        this.w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.x5.e(70, 70, 17));
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

    public final void b(y8 y8Var, boolean z10) {
        y8 y8Var2 = this.h;
        if (y8Var2 != null) {
            this.e.d(y8Var2.c, y8Var2.d, y8Var2.e, y8Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = y8Var;
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
        b9 b9Var;
        Canvas canvas2;
        o5 o5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        c9 c9Var = this.F;
        float measuredWidth = c9Var.U ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f7 = this.v ? 1.0f : 0.0f;
        c6 c6Var = this.s;
        c6Var.d(f7, false);
        float f10 = this.w;
        if (f10 >= 0.0f) {
            c6Var.d(f10, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, c6Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), c9Var.N);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), c9Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((c9Var.d - c9Var.c) / 2.0f) * c9Var.E) + getMeasuredHeight());
        y8 y8Var = this.h;
        if (y8Var != null) {
            int i10 = y8Var.c;
            int i11 = y8Var.d;
            int i12 = y8Var.e;
            int i13 = y8Var.f;
            o20 o20Var = this.d;
            o20Var.d(i10, i11, i12, i13);
            Paint paint = o20Var.c;
            float f11 = this.y;
            float f12 = this.x;
            float f13 = this.E;
            o20Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                b9Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                b9Var.a(canvas2, b9Var.y, b9Var.E, measuredWidth, b9Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!c9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), c6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), c9Var.N) / 2.0f;
                ai.z5 z5Var = b9Var.c;
                o5Var = z5Var.e;
                if (o5Var != null) {
                    ImageReceiver imageReceiver = z5Var.a;
                    float f14 = b9Var.y - lerp2;
                    float f15 = b9Var.E - lerp2;
                    float f16 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    z5Var.a.setRoundRadius((int) (f16 * 0.13f));
                    z5Var.a.draw(canvas2);
                    return;
                }
                ai.l4 l4Var = o5Var.k;
                if (l4Var != null) {
                    l4Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                o5 o5Var2 = z5Var.e;
                float f17 = b9Var.y;
                float f18 = b9Var.E;
                o5Var2.setBounds((int) (f17 - lerp2), (int) (f18 - lerp2), (int) (f17 + lerp2), (int) (f18 + lerp2));
                z5Var.e.setColorFilter(b9Var.r);
                z5Var.e.draw(canvas2);
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
            b9Var = this;
            b9Var.a(canvas, this.y, this.E, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (b9Var.f * 255.0f));
            b9Var.a(canvas, b9Var.y, b9Var.E, measuredWidth, b9Var.x, paint);
            canvas = canvas;
            float f26 = b9Var.f + 0.064f;
            b9Var.f = f26;
            if (f26 > 1.0f) {
                b9Var.f = 1.0f;
            }
            invalidate();
        } else {
            b9Var = this;
        }
        canvas2 = canvas;
        if (!c9Var.U) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!c9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), c6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), c9Var.N) / 2.0f;
        ai.z5 z5Var2 = b9Var.c;
        o5Var = z5Var2.e;
        if (o5Var != null) {
        }
    }

    public long getDuration() {
        ai.z5 z5Var = this.c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        o5 o5Var = z5Var.e;
        if (o5Var != null) {
            imageReceiver = o5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().r();
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        o5 o5Var = z5Var.e;
        if (o5Var == null) {
            return imageReceiver;
        }
        ai.l4 l4Var = o5Var.k;
        o5Var.setColorFilter(this.r);
        return l4Var;
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
        ai.l4 l4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ai.z5 z5Var = this.c;
            o5 o5Var = z5Var.e;
            if (o5Var != null && (l4Var = o5Var.k) != null) {
                l4Var.startAnimation();
            }
            z5Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
