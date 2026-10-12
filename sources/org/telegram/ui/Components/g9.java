package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class g9 extends FrameLayout {
    public float E;
    public final /* synthetic */ h9 F;
    public long a;
    public TLRPC.Document b;
    public final bi.k5 c;
    public final b30 d;
    public final b30 e;
    public float f;
    public d9 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final g6 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(h9 h9Var, Context context) {
        super(context);
        this.F = h9Var;
        this.d = new b30();
        this.e = new b30();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new g6(this, 200L, es.g);
        this.w = -1.0f;
        bi.k5 k5Var = new bi.k5(this, context, 7);
        this.c = k5Var;
        k5Var.getImageReceiver().setAutoRepeatCount(1);
        k5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(k5Var, w7.a6.e(70, 70, 17));
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

    public final void b(d9 d9Var, boolean z10) {
        d9 d9Var2 = this.h;
        if (d9Var2 != null) {
            this.e.d(d9Var2.c, d9Var2.d, d9Var2.e, d9Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = d9Var;
        this.n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        g9 g9Var;
        Canvas canvas2;
        s5 s5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        h9 h9Var = this.F;
        float measuredWidth = h9Var.U ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f7 = this.v ? 1.0f : 0.0f;
        g6 g6Var = this.s;
        g6Var.d(f7, false);
        float f10 = this.w;
        if (f10 >= 0.0f) {
            g6Var.d(f10, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, g6Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), h9Var.N);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), h9Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((h9Var.d - h9Var.c) / 2.0f) * h9Var.E) + getMeasuredHeight());
        d9 d9Var = this.h;
        if (d9Var != null) {
            int i10 = d9Var.c;
            int i11 = d9Var.d;
            int i12 = d9Var.e;
            int i13 = d9Var.f;
            b30 b30Var = this.d;
            b30Var.d(i10, i11, i12, i13);
            Paint paint = b30Var.c;
            float f11 = this.y;
            float f12 = this.x;
            float f13 = this.E;
            b30Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                g9Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                g9Var.a(canvas2, g9Var.y, g9Var.E, measuredWidth, g9Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!h9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), g6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), h9Var.N) / 2.0f;
                bi.k5 k5Var = g9Var.c;
                s5Var = k5Var.e;
                if (s5Var != null) {
                    ImageReceiver imageReceiver = k5Var.a;
                    float f14 = g9Var.y - lerp2;
                    float f15 = g9Var.E - lerp2;
                    float f16 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    k5Var.a.setRoundRadius((int) (f16 * 0.13f));
                    k5Var.a.draw(canvas2);
                    return;
                }
                bi.b4 b4Var = s5Var.k;
                if (b4Var != null) {
                    b4Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                s5 s5Var2 = k5Var.e;
                float f17 = g9Var.y;
                float f18 = g9Var.E;
                s5Var2.setBounds((int) (f17 - lerp2), (int) (f18 - lerp2), (int) (f17 + lerp2), (int) (f18 + lerp2));
                k5Var.e.setColorFilter(g9Var.r);
                k5Var.e.draw(canvas2);
                return;
            }
            float f19 = this.y;
            float f20 = this.x;
            float f21 = f19 - f20;
            float f22 = this.E;
            float f23 = f22 - f20;
            float f24 = f19 + f20;
            float f25 = f22 + f20;
            b30 b30Var2 = this.e;
            b30Var2.b(f21, f23, f24, f25);
            Paint paint2 = b30Var2.c;
            paint2.setAlpha(255);
            g9Var = this;
            g9Var.a(canvas, this.y, this.E, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (g9Var.f * 255.0f));
            g9Var.a(canvas, g9Var.y, g9Var.E, measuredWidth, g9Var.x, paint);
            canvas = canvas;
            float f26 = g9Var.f + 0.064f;
            g9Var.f = f26;
            if (f26 > 1.0f) {
                g9Var.f = 1.0f;
            }
            invalidate();
        } else {
            g9Var = this;
        }
        canvas2 = canvas;
        if (!h9Var.U) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!h9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), g6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), h9Var.N) / 2.0f;
        bi.k5 k5Var2 = g9Var.c;
        s5Var = k5Var2.e;
        if (s5Var != null) {
        }
    }

    public long getDuration() {
        bi.k5 k5Var = this.c;
        ImageReceiver imageReceiver = k5Var.getImageReceiver();
        s5 s5Var = k5Var.e;
        if (s5Var != null) {
            imageReceiver = s5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().r();
    }

    public ImageReceiver getImageReceiver() {
        bi.k5 k5Var = this.c;
        ImageReceiver imageReceiver = k5Var.getImageReceiver();
        s5 s5Var = k5Var.e;
        if (s5Var == null) {
            return imageReceiver;
        }
        bi.b4 b4Var = s5Var.k;
        s5Var.setColorFilter(this.r);
        return b4Var;
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
        bi.b4 b4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            bi.k5 k5Var = this.c;
            s5 s5Var = k5Var.e;
            if (s5Var != null && (b4Var = s5Var.k) != null) {
                b4Var.startAnimation();
            }
            k5Var.a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
