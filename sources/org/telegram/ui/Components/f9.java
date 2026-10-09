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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class f9 extends FrameLayout {
    public float E;
    public final /* synthetic */ g9 F;
    public long a;
    public TLRPC.Document b;
    public final ai.z5 c;
    public final f30 d;
    public final f30 e;
    public float f;
    public c9 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final g6 s;
    public boolean v;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(g9 g9Var, Context context) {
        super(context);
        this.F = g9Var;
        this.d = new f30();
        this.e = new f30();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new g6(this, 200L, hs.g);
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

    public final void b(c9 c9Var, boolean z10) {
        c9 c9Var2 = this.h;
        if (c9Var2 != null) {
            this.e.d(c9Var2.c, c9Var2.d, c9Var2.e, c9Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = c9Var;
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
        f9 f9Var;
        Canvas canvas2;
        s5 s5Var;
        this.y = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        g9 g9Var = this.F;
        float measuredWidth = g9Var.U ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f7 = this.v ? 1.0f : 0.0f;
        g6 g6Var = this.s;
        g6Var.d(f7, false);
        float f10 = this.w;
        if (f10 >= 0.0f) {
            g6Var.d(f10, true);
        }
        float lerp = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, g6Var.c);
        this.x = lerp;
        this.x = AndroidUtilities.lerp(lerp, AndroidUtilities.dp(21.0f), g9Var.N);
        this.y = AndroidUtilities.lerp(this.y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), g9Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((g9Var.d - g9Var.c) / 2.0f) * g9Var.E) + getMeasuredHeight());
        c9 c9Var = this.h;
        if (c9Var != null) {
            int i10 = c9Var.c;
            int i11 = c9Var.d;
            int i12 = c9Var.e;
            int i13 = c9Var.f;
            f30 f30Var = this.d;
            f30Var.d(i10, i11, i12, i13);
            Paint paint = f30Var.c;
            float f11 = this.y;
            float f12 = this.x;
            float f13 = this.E;
            f30Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                f9Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                f9Var.a(canvas2, f9Var.y, f9Var.E, measuredWidth, f9Var.x, paint);
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(!g9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), g6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), g9Var.N) / 2.0f;
                ai.z5 z5Var = f9Var.c;
                s5Var = z5Var.e;
                if (s5Var != null) {
                    ImageReceiver imageReceiver = z5Var.a;
                    float f14 = f9Var.y - lerp2;
                    float f15 = f9Var.E - lerp2;
                    float f16 = lerp2 * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    z5Var.a.setRoundRadius((int) (f16 * 0.13f));
                    z5Var.a.draw(canvas2);
                    return;
                }
                ai.m4 m4Var = s5Var.k;
                if (m4Var != null) {
                    m4Var.setRoundRadius((int) (2.0f * lerp2 * 0.13f));
                }
                s5 s5Var2 = z5Var.e;
                float f17 = f9Var.y;
                float f18 = f9Var.E;
                s5Var2.setBounds((int) (f17 - lerp2), (int) (f18 - lerp2), (int) (f17 + lerp2), (int) (f18 + lerp2));
                z5Var.e.setColorFilter(f9Var.r);
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
            f30 f30Var2 = this.e;
            f30Var2.b(f21, f23, f24, f25);
            Paint paint2 = f30Var2.c;
            paint2.setAlpha(255);
            f9Var = this;
            f9Var.a(canvas, this.y, this.E, measuredWidth, this.x, paint2);
            paint.setAlpha((int) (f9Var.f * 255.0f));
            f9Var.a(canvas, f9Var.y, f9Var.E, measuredWidth, f9Var.x, paint);
            canvas = canvas;
            float f26 = f9Var.f + 0.064f;
            f9Var.f = f26;
            if (f26 > 1.0f) {
                f9Var.f = 1.0f;
            }
            invalidate();
        } else {
            f9Var = this;
        }
        canvas2 = canvas;
        if (!g9Var.U) {
        }
        float lerp22 = AndroidUtilities.lerp(AndroidUtilities.lerp(!g9Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : AndroidUtilities.dp(70.0f), (int) (getMeasuredWidth() * 0.7f), g6Var.c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), g9Var.N) / 2.0f;
        ai.z5 z5Var2 = f9Var.c;
        s5Var = z5Var2.e;
        if (s5Var != null) {
        }
    }

    public long getDuration() {
        ai.z5 z5Var = this.c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.e;
        if (s5Var != null) {
            imageReceiver = s5Var.k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().r();
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.e;
        if (s5Var == null) {
            return imageReceiver;
        }
        ai.m4 m4Var = s5Var.k;
        s5Var.setColorFilter(this.r);
        return m4Var;
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
        ai.m4 m4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ai.z5 z5Var = this.c;
            s5 s5Var = z5Var.e;
            if (s5Var != null && (m4Var = s5Var.k) != null) {
                m4Var.startAnimation();
            }
            z5Var.a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
