package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e5 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.r8 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final d5 n;
    public float r;
    public int s;
    public boolean w;

    public e5(int i10, View view) {
        this(18.0f, i10, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.t8 t8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (e5 e5Var : (e5[]) spannable.getSpans(0, spannable.length(), e5.class)) {
                e5Var.d(t8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.r8 r8Var = this.c;
        r8Var.q(chat);
        this.b.i0(chat, r8Var, null);
    }

    public final void c(long j10) {
        int i10 = this.e;
        if (j10 >= 0) {
            e(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)));
        } else {
            b(org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 == view) {
            return;
        }
        d5 d5Var = this.n;
        ImageReceiver imageReceiver = this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(d5Var);
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
            view.addOnAttachStateChangeListener(d5Var);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        if (this.h) {
            int i15 = this.s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.i0.L(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.r, org.telegram.messenger.i0.L(this.d) / 2.0f, paint2);
        }
        float f10 = 0.0f + f7;
        float L = (((i12 + i14) / 2.0f) + this.r) - (org.telegram.messenger.i0.L(this.d) / 2.0f);
        float L2 = org.telegram.messenger.i0.L(this.d);
        float L3 = org.telegram.messenger.i0.L(this.d);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f10, L, L2, L3);
        imageReceiver.setAlpha(this.w ? paint.getAlpha() / 255.0f : 1.0f);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.r8 r8Var = this.c;
        r8Var.r(user);
        this.b.i0(user, r8Var, null);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(this.d);
    }

    public e5(float f7, int i10, View view) {
        this.h = true;
        this.n = new d5(this, 0);
        this.s = org.telegram.messenger.zs.e4;
        this.w = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.J0 = true;
        this.c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        imageReceiver.J0(org.telegram.messenger.i0.L(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), 855638016);
        d(view);
    }
}
