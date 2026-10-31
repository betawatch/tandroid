package mh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.i5;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final j a;
    public final q1 b;
    public final ImageReceiver c;
    public final long d;
    public b e;
    public b f;
    public Paint g;
    public final StaticLayout h;
    public float i;
    public float j;
    public ValueAnimator k;
    public float l;
    public boolean m;
    public ValueAnimator n;
    public float o;
    public boolean p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        r8 r8Var = new r8((p6) null);
        int i10 = d20.s0;
        this.l = 1.0f;
        this.m = true;
        this.o = 0.0f;
        this.p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.a);
        this.c = imageReceiver2;
        this.a = jVar;
        q1 q1Var = jVar.D;
        this.b = q1Var;
        this.d = j10;
        r8Var.p = 1.0f;
        if (o5.E(j10)) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            r8Var.r(Z1);
            if (h20.B(Z1)) {
                str2 = cd.L0(2131745918, null);
                r8Var.g(1);
                r8Var.p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, r8Var, 0L, null, Z1, 0);
                imageReceiver.J0(i0.L(i.a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, i0.L(r2), i0.L(r2));
                Paint X1 = q1Var.X1("paintChatActionText");
                if (str2 != null || X1 == null) {
                }
                int L = i0.q.x - i0.L(48);
                TextPaint textPaint = new TextPaint(X1);
                this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(r5, 0, r5.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            imageReceiver = imageReceiver2;
            str = Z1 != null ? i5.m(0, Z1.first_name, Z1.last_name) : "";
            imageReceiver.i0(Z1, r8Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            str = L0 != null ? L0.title : "";
            r8Var.q(L0);
            imageReceiver.i0(L0, r8Var, null);
        }
        str2 = str;
        imageReceiver.J0(i0.L(i.a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, i0.L(r2), i0.L(r2));
        Paint X12 = q1Var.X1("paintChatActionText");
        if (str2 != null) {
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        float f13 = f10 / 2.0f;
        float f14 = f7 - f13;
        float f15 = f7 + f13;
        float f16 = f12 - f11;
        if (f10 <= f16) {
            return f14 < f11 ? f11 + f13 : f15 > f12 ? f12 - f13 : f7;
        }
        float f17 = (f11 + f12) / 2.0f;
        float f18 = f10 - f16;
        float max = Math.max(0.0f, f11 - f14);
        float max2 = Math.max(0.0f, f15 - f12);
        float f19 = max + max2;
        return f19 < 0.1f ? f17 : a1.g.c(f18, 2.0f, (max - max2) / f19, f17);
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7 - f11, f10 - f11);
        int i10 = i.a;
        float f13 = 21;
        canvas.scale(f11 / i0.L(f13), f11 / i0.L(f13));
        float f14 = ((this.l * 0.25f) + 0.75f) * f12;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setAlpha(f14);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.n) {
            this.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.k) {
            this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.a.invalidateSelf();
    }
}
