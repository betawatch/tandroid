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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class c9 extends FrameLayout {
    public float E;
    public final /* synthetic */ d9 F;
    public long a;
    public TLRPC.Document b;
    public final gg.i1 c;
    public final x20 d;
    public final x20 e;
    public float f;
    public z8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final d6 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(d9 d9Var, Context context) {
        super(context);
        this.F = d9Var;
        this.d = new x20();
        this.e = new x20();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new d6(this, 200L, wr.g);
        this.w = -1.0f;
        gg.i1 i1Var = new gg.i1(this, context, 6);
        this.c = i1Var;
        i1Var.getImageReceiver().setAutoRepeatCount(1);
        i1Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(i1Var, w7.a6.e(70, 70, 17));
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

    public final void b(z8 z8Var, boolean z10) {
        z8 z8Var2 = this.h;
        if (z8Var2 != null) {
            this.e.d(z8Var2.c, z8Var2.d, z8Var2.e, z8Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = z8Var;
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
        c9 c9Var;
        Canvas canvas2;
        p5 p5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        d9 d9Var = this.F;
        float measuredWidth = d9Var.U ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f7 = this.v ? 1.0f : 0.0f;
        d6 d6Var = this.s;
        d6Var.d(f7, false);
        float f10 = this.w;
        if (f10 >= 0.0f) {
            d6Var.d(f10, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, d6Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), d9Var.N);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), d9Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((d9Var.d - d9Var.c) / 2.0f) * d9Var.E) + getMeasuredHeight());
        z8 z8Var = this.h;
        if (z8Var != null) {
            int i10 = z8Var.c;
            int i11 = z8Var.d;
            int i12 = z8Var.e;
            int i13 = z8Var.f;
            x20 x20Var = this.d;
            x20Var.d(i10, i11, i12, i13);
            Paint paint = x20Var.c;
            float f11 = this.y;
            float f12 = this.x;
            float f13 = this.E;
            x20Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                c9Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                c9Var.a(canvas2, c9Var.y, c9Var.E, measuredWidth, c9Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!d9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), d6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), d9Var.N) / 2.0f;
                gg.i1 i1Var = c9Var.c;
                p5Var = i1Var.e;
                if (p5Var != null) {
                    ImageReceiver imageReceiver = i1Var.a;
                    float f14 = c9Var.y - lerp2;
                    float f15 = c9Var.E - lerp2;
                    float f16 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    i1Var.a.setRoundRadius((int) (f16 * 0.13f));
                    i1Var.a.draw(canvas2);
                    return;
                }
                gg.h1 h1Var = p5Var.k;
                if (h1Var != null) {
                    h1Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                p5 p5Var2 = i1Var.e;
                float f17 = c9Var.y;
                float f18 = c9Var.E;
                p5Var2.setBounds((int) (f17 - lerp2), (int) (f18 - lerp2), (int) (f17 + lerp2), (int) (f18 + lerp2));
                i1Var.e.setColorFilter(c9Var.r);
                i1Var.e.draw(canvas2);
                return;
            }
            float f19 = this.y;
            float f20 = this.x;
            float f21 = f19 - f20;
            float f22 = this.E;
            float f23 = f22 - f20;
            float f24 = f19 + f20;
            float f25 = f22 + f20;
            x20 x20Var2 = this.e;
            x20Var2.b(f21, f23, f24, f25);
            Paint paint2 = x20Var2.c;
            paint2.setAlpha(255);
            c9Var = this;
            c9Var.a(canvas, this.y, this.E, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (c9Var.f * 255.0f));
            c9Var.a(canvas, c9Var.y, c9Var.E, measuredWidth, c9Var.x, paint);
            canvas = canvas;
            float f26 = c9Var.f + 0.064f;
            c9Var.f = f26;
            if (f26 > 1.0f) {
                c9Var.f = 1.0f;
            }
            invalidate();
        } else {
            c9Var = this;
        }
        canvas2 = canvas;
        if (!d9Var.U) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!d9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), d6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), d9Var.N) / 2.0f;
        gg.i1 i1Var2 = c9Var.c;
        p5Var = i1Var2.e;
        if (p5Var != null) {
        }
    }

    public long getDuration() {
        gg.i1 i1Var = this.c;
        ImageReceiver imageReceiver = i1Var.getImageReceiver();
        p5 p5Var = i1Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().r();
    }

    public ImageReceiver getImageReceiver() {
        gg.i1 i1Var = this.c;
        ImageReceiver imageReceiver = i1Var.getImageReceiver();
        p5 p5Var = i1Var.e;
        if (p5Var == null) {
            return imageReceiver;
        }
        gg.h1 h1Var = p5Var.k;
        p5Var.setColorFilter(this.r);
        return h1Var;
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
        gg.h1 h1Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            gg.i1 i1Var = this.c;
            p5 p5Var = i1Var.e;
            if (p5Var != null && (h1Var = p5Var.k) != null) {
                h1Var.startAnimation();
            }
            i1Var.a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
