package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l11 {
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final boolean d;
    public qz0 e;
    public final ImageReceiver g;
    public f5 h;
    public gg.d i;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public final Paint o;
    public final Path p;
    public final RectF q;
    public final dc r;
    public Runnable s;
    public long t;
    public final r8 f = new r8((org.telegram.ui.ActionBar.p6) null);
    public final Path j = new Path();

    public l11(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.o = paint;
        Path path = new Path();
        this.p = path;
        this.q = new RectF();
        this.a = i10;
        this.b = view;
        this.c = p6Var;
        this.d = z10;
        this.r = new dc(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.i0.L(1.75f), -org.telegram.messenger.i0.L(4.0f));
        path.lineTo(org.telegram.messenger.i0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.i0.L(1.75f), org.telegram.messenger.i0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.P();
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.a(this.b);
        }
    }

    public final void b() {
        this.g.R();
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.n(this.b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        qz0 qz0Var = this.e;
        if (qz0Var == null) {
            return;
        }
        qz0Var.p = i10 - org.telegram.messenger.i0.L(144.66f);
        float k10 = this.e.k() + org.telegram.messenger.i0.L(48.66f);
        float f15 = i10;
        float f16 = (f15 - k10) / 2.0f;
        int i11 = this.l;
        int i12 = (int) k10;
        boolean z11 = this.d;
        Path path = this.j;
        if (i11 == i12 && this.k == i10 && this.n == z10 && this.m == z11) {
            f14 = k10;
            f13 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            f13 = 2.0f;
            rectF.set(f16, org.telegram.messenger.i0.L(4.5f), f16 + k10, org.telegram.messenger.i0.L(28.5f));
            if (z10) {
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
            }
            if (z11) {
                float f17 = f15 / 2.0f;
                float f18 = 1.833f;
                float L = f17 - org.telegram.messenger.i0.L(1.833f);
                while (L > 0.0f) {
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(L - org.telegram.messenger.i0.L(3.66f), org.telegram.messenger.i0.L(15.5f), L, org.telegram.messenger.i0.L(17.5f));
                    path.addRoundRect(rectF2, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), Path.Direction.CW);
                    L -= org.telegram.messenger.i0.L(8.33f);
                    f18 = f18;
                    f15 = f15;
                    k10 = k10;
                }
                float f19 = f15;
                f14 = k10;
                int L2 = org.telegram.messenger.i0.L(f18);
                while (true) {
                    f17 += L2;
                    if (f17 >= f19) {
                        break;
                    }
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(f17, org.telegram.messenger.i0.L(15.5f), org.telegram.messenger.i0.L(3.66f) + f17, org.telegram.messenger.i0.L(17.5f));
                    path.addRoundRect(rectF3, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), Path.Direction.CW);
                    L2 = org.telegram.messenger.i0.L(8.33f);
                }
            } else {
                f14 = k10;
            }
            this.l = i12;
            this.k = i10;
            this.m = z11;
            this.n = z10;
        }
        canvas.save();
        float f20 = f7 / f13;
        canvas.translate(f20, f10);
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var);
        int alpha = W0.getAlpha();
        W0.setAlpha((int) (alpha * f12 * f11));
        canvas.drawPath(path, W0);
        W0.setAlpha(alpha);
        if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
            Paint W02 = org.telegram.ui.ActionBar.t6.W0("paintChatActionBackgroundDarken", p6Var);
            int alpha2 = W02.getAlpha();
            W02.setAlpha((int) (alpha2 * f12 * f11));
            canvas.drawPath(path, W02);
            W02.setAlpha(alpha2);
        }
        canvas.restore();
        float f21 = f20 + f16;
        float f22 = f21 + f14;
        this.q.set(f21 - org.telegram.messenger.i0.L(4.0f), f10 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + f22, org.telegram.messenger.i0.L(32.0f) + f10);
        if (z10) {
            f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.setBounds((int) (org.telegram.messenger.i0.L(2.66f) + f21), (int) (org.telegram.messenger.i0.L(6.5f) + f10), (int) (org.telegram.messenger.i0.L(22.66f) + f21), (int) (org.telegram.messenger.i0.L(26.5f) + f10));
                this.h.setAlpha((int) (255.0f * f12));
                this.h.draw(canvas);
            } else {
                gg.d dVar = this.i;
                if (dVar != null) {
                    dVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, p6Var));
                }
                float L3 = org.telegram.messenger.i0.L(20.0f);
                float L4 = org.telegram.messenger.i0.L(20.0f);
                ImageReceiver imageReceiver = this.g;
                imageReceiver.y0(org.telegram.messenger.i0.L(2.66f) + f21, org.telegram.messenger.i0.L(6.5f) + f10, L3, L4);
                imageReceiver.setAlpha(f12);
                imageReceiver.h(canvas, null);
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.za : org.telegram.ui.ActionBar.t6.Wc, p6Var);
            this.e.c(f21 + org.telegram.messenger.i0.L(27.66f), org.telegram.messenger.i0.L(16.5f) + f10, f12, w02, canvas);
            canvas.save();
            canvas.translate(f22 - org.telegram.messenger.i0.L(11.25f), org.telegram.messenger.i0.L(16.5f) + f10);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.75f * f12, w02);
            Paint paint = this.o;
            paint.setColor(r12);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.66f));
            canvas.drawPath(this.p, paint);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        int action;
        Runnable runnable;
        if (this.e != null) {
            if (this.q.contains(motionEvent.getX(), motionEvent.getY() - (z10 ? this.b.getPaddingTop() : 0))) {
                z11 = true;
                action = motionEvent.getAction();
                dc dcVar = this.r;
                if (action != 0) {
                    dcVar.c(z11);
                } else if (motionEvent.getAction() == 2) {
                    if (dcVar.i && !z11) {
                        dcVar.c(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (dcVar.i && (runnable = this.s) != null) {
                        runnable.run();
                    }
                    dcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    dcVar.c(false);
                }
                return dcVar.i;
            }
        }
        z11 = false;
        action = motionEvent.getAction();
        dc dcVar2 = this.r;
        if (action != 0) {
        }
        return dcVar2.i;
    }

    public final boolean e(org.telegram.messenger.jj jjVar) {
        f5 f5Var = this.h;
        View view = this.b;
        if (f5Var != null) {
            f5Var.n(view);
            this.h = null;
        }
        this.l = 0;
        this.t = 0L;
        this.i = null;
        if (jjVar == null) {
            this.e = null;
            this.t = 0L;
        } else {
            int i10 = this.a;
            boolean p02 = org.telegram.messenger.w3.p0(org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-org.telegram.messenger.jj.B0(jjVar.k))));
            ImageReceiver imageReceiver = this.g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.i0.L(10.0f));
                long v12 = org.telegram.messenger.jj.v1(jjVar.k);
                TLObject d22 = org.telegram.messenger.vp.r1(i10).d2(v12);
                this.t = v12;
                if (d22 == null) {
                    this.e = null;
                    return false;
                }
                r8 r8Var = this.f;
                r8Var.l(d22);
                imageReceiver.i0(d22, r8Var, null);
                this.e = new qz0(org.telegram.messenger.o5.m(d22), 14.0f, org.telegram.messenger.i0.o());
            } else {
                imageReceiver.J0(0);
                long Z1 = jjVar.Z1();
                this.t = Z1;
                TLRPC.TL_forumTopic f7 = org.telegram.messenger.vp.r1(i10).r7.f(-org.telegram.messenger.jj.B0(jjVar.k), Z1);
                if (f7 == null) {
                    this.e = null;
                    return false;
                }
                if (Z1 == 1) {
                    gg.d c10 = gg.e.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.c), false);
                    this.i = c10;
                    imageReceiver.w0(c10);
                } else if (f7.icon_emoji_id != 0) {
                    this.h = new f5(0, i10, f7.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(gg.e.e(f7));
                }
                this.e = new qz0(f7.title, 14.0f, org.telegram.messenger.i0.o());
            }
        }
        return this.e != null;
    }
}
