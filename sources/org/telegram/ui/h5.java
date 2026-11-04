package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h5 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.u8 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final g5 n;
    public float r;
    public int s;
    public boolean w;

    public h5(int i3, View view) {
        this(18.0f, i3, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.q8 q8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (h5 h5Var : (h5[]) spannable.getSpans(0, spannable.length(), h5.class)) {
                h5Var.d(q8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.u8 u8Var = this.c;
        u8Var.q(chat);
        this.b.i0(chat, u8Var, null);
    }

    public final void c(long j10) {
        int i3 = this.e;
        if (j10 >= 0) {
            e(org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)));
        } else {
            b(org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 == view) {
            return;
        }
        g5 g5Var = this.n;
        ImageReceiver imageReceiver = this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(g5Var);
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
            view.addOnAttachStateChangeListener(g5Var);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
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
        org.telegram.ui.Components.u8 u8Var = this.c;
        u8Var.r(user);
        this.b.i0(user, u8Var, null);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.d);
    }

    public h5(float f10, int i3, View view) {
        this.h = true;
        this.n = new g5(this, 0);
        this.s = org.telegram.messenger.hs.e4;
        this.w = true;
        this.e = i3;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.K0 = true;
        this.c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        imageReceiver.J0(org.telegram.messenger.g0.L(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        d(view);
    }
}
