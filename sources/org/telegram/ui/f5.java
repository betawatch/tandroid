package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f5 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.w8 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final e5 n;
    public float r;
    public int s;
    public boolean w;

    public f5(int i7, View view) {
        this(18.0f, i7, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.r8 r8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (f5 f5Var : (f5[]) spannable.getSpans(0, spannable.length(), f5.class)) {
                f5Var.d(r8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.w8 w8Var = this.c;
        w8Var.q(chat);
        this.b.i0(chat, w8Var, null);
    }

    public final void c(long j3) {
        int i7 = this.e;
        if (j3 >= 0) {
            e(org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)));
        } else {
            b(org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 == view) {
            return;
        }
        e5 e5Var = this.n;
        ImageReceiver imageReceiver = this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(e5Var);
            if (this.f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.R();
            }
        }
        View view3 = this.f;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        this.f = view;
        imageReceiver.H0(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(e5Var);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        if (this.h) {
            int i14 = this.s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.a;
            if (i14 != alpha) {
                int alpha2 = paint.getAlpha();
                this.s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(this.s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.g0.L(this.d) / 2.0f) + 0.0f + f10, ((i11 + i13) / 2.0f) + this.r, org.telegram.messenger.g0.L(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f10;
        float L = (((i11 + i13) / 2.0f) + this.r) - (org.telegram.messenger.g0.L(this.d) / 2.0f);
        float L2 = org.telegram.messenger.g0.L(this.d);
        float L3 = org.telegram.messenger.g0.L(this.d);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f11, L, L2, L3);
        imageReceiver.setAlpha(this.w ? paint.getAlpha() / 255.0f : 1.0f);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.w8 w8Var = this.c;
        w8Var.r(user);
        this.b.i0(user, w8Var, null);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.d);
    }

    public f5(float f10, int i7, View view) {
        this.h = true;
        this.n = new e5(this, 0);
        this.s = org.telegram.messenger.qs.e4;
        this.w = true;
        this.e = i7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.J0 = true;
        this.c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        imageReceiver.J0(org.telegram.messenger.g0.L(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        d(view);
    }
}
