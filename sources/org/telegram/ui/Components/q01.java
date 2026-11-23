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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q01 {
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.i6 c;
    public final boolean d;
    public wy0 e;
    public final ImageReceiver g;
    public o5 h;
    public qg.b i;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public final Paint o;
    public final Path p;
    public final RectF q;
    public final lc r;
    public Runnable s;
    public long t;
    public final a9 f = new a9((org.telegram.ui.ActionBar.i6) null);
    public final Path j = new Path();

    public q01(int i7, View view, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.o = paint;
        Path path = new Path();
        this.p = path;
        this.q = new RectF();
        this.a = i7;
        this.b = view;
        this.c = i6Var;
        this.d = z10;
        this.r = new lc(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(1.75f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.L(1.75f), org.telegram.messenger.g0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.Q();
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.a(this.b);
        }
    }

    public final void b() {
        this.g.S();
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.n(this.b);
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        wy0 wy0Var = this.e;
        if (wy0Var == null) {
            return;
        }
        wy0Var.p = i7 - org.telegram.messenger.g0.L(144.66f);
        float k10 = this.e.k() + org.telegram.messenger.g0.L(48.66f);
        float f16 = i7;
        float f17 = (f16 - k10) / 2.0f;
        int i10 = this.l;
        int i11 = (int) k10;
        boolean z11 = this.d;
        Path path = this.j;
        if (i10 == i11 && this.k == i7 && this.n == z10 && this.m == z11) {
            f15 = k10;
            f14 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            f14 = 2.0f;
            rectF.set(f17, org.telegram.messenger.g0.L(4.5f), f17 + k10, org.telegram.messenger.g0.L(28.5f));
            if (z10) {
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
            }
            if (z11) {
                float f18 = f16 / 2.0f;
                float f19 = 1.833f;
                float L = f18 - org.telegram.messenger.g0.L(1.833f);
                while (L > 0.0f) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(L - org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(15.5f), L, org.telegram.messenger.g0.L(17.5f));
                    path.addRoundRect(rectF2, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), Path.Direction.CW);
                    L -= org.telegram.messenger.g0.L(8.33f);
                    f19 = f19;
                    f16 = f16;
                    k10 = k10;
                }
                float f20 = f16;
                f15 = k10;
                int L2 = org.telegram.messenger.g0.L(f19);
                while (true) {
                    f18 += L2;
                    if (f18 >= f20) {
                        break;
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(f18, org.telegram.messenger.g0.L(15.5f), org.telegram.messenger.g0.L(3.66f) + f18, org.telegram.messenger.g0.L(17.5f));
                    path.addRoundRect(rectF3, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), Path.Direction.CW);
                    L2 = org.telegram.messenger.g0.L(8.33f);
                }
            } else {
                f15 = k10;
            }
            this.l = i11;
            this.k = i7;
            this.m = z11;
            this.n = z10;
        }
        canvas.save();
        float f21 = f10 / f14;
        canvas.translate(f21, f11);
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var);
        int alpha = W0.getAlpha();
        W0.setAlpha((int) (alpha * f13 * f12));
        canvas.drawPath(path, W0);
        W0.setAlpha(alpha);
        if (i6Var != null ? i6Var.h() : org.telegram.ui.ActionBar.n6.d1()) {
            Paint W02 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackgroundDarken", i6Var);
            int alpha2 = W02.getAlpha();
            W02.setAlpha((int) (alpha2 * f13 * f12));
            canvas.drawPath(path, W02);
            W02.setAlpha(alpha2);
        }
        canvas.restore();
        float f22 = f21 + f17;
        float f23 = f22 + f15;
        this.q.set(f22 - org.telegram.messenger.g0.L(4.0f), f11 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f23, org.telegram.messenger.g0.L(32.0f) + f11);
        if (z10) {
            o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.setBounds((int) (org.telegram.messenger.g0.L(2.66f) + f22), (int) (org.telegram.messenger.g0.L(6.5f) + f11), (int) (org.telegram.messenger.g0.L(22.66f) + f22), (int) (org.telegram.messenger.g0.L(26.5f) + f11));
                this.h.setAlpha((int) (255.0f * f13));
                this.h.draw(canvas);
            } else {
                qg.b bVar = this.i;
                if (bVar != null) {
                    bVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v8, i6Var));
                }
                float L3 = org.telegram.messenger.g0.L(20.0f);
                float L4 = org.telegram.messenger.g0.L(20.0f);
                ImageReceiver imageReceiver = this.g;
                imageReceiver.z0(org.telegram.messenger.g0.L(2.66f) + f22, org.telegram.messenger.g0.L(6.5f) + f11, L3, L4);
                imageReceiver.setAlpha(f13);
                imageReceiver.h(canvas, null);
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i1(i6Var) ? org.telegram.ui.ActionBar.n6.za : org.telegram.ui.ActionBar.n6.Zc, i6Var);
            this.e.c(f22 + org.telegram.messenger.g0.L(27.66f), org.telegram.messenger.g0.L(16.5f) + f11, f13, w02, canvas);
            canvas.save();
            canvas.translate(f23 - org.telegram.messenger.g0.L(11.25f), org.telegram.messenger.g0.L(16.5f) + f11);
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.75f * f13, w02);
            Paint paint = this.o;
            paint.setColor(r12);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
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
                lc lcVar = this.r;
                if (action != 0) {
                    lcVar.c(z11);
                } else if (motionEvent.getAction() == 2) {
                    if (lcVar.i && !z11) {
                        lcVar.c(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (lcVar.i && (runnable = this.s) != null) {
                        runnable.run();
                    }
                    lcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    lcVar.c(false);
                }
                return lcVar.i;
            }
        }
        z11 = false;
        action = motionEvent.getAction();
        lc lcVar2 = this.r;
        if (action != 0) {
        }
        return lcVar2.i;
    }

    public final boolean e(org.telegram.messenger.fj fjVar) {
        o5 o5Var = this.h;
        View view = this.b;
        if (o5Var != null) {
            o5Var.n(view);
            this.h = null;
        }
        this.l = 0;
        this.t = 0L;
        this.i = null;
        if (fjVar == null) {
            this.e = null;
            this.t = 0L;
        } else {
            int i7 = this.a;
            boolean p02 = org.telegram.messenger.v3.p0(org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-org.telegram.messenger.fj.B0(fjVar.k))));
            ImageReceiver imageReceiver = this.g;
            if (p02) {
                imageReceiver.K0(org.telegram.messenger.g0.L(10.0f));
                long u12 = org.telegram.messenger.fj.u1(fjVar.k);
                TLObject g22 = org.telegram.messenger.mp.u1(i7).g2(u12);
                this.t = u12;
                if (g22 == null) {
                    this.e = null;
                    return false;
                }
                a9 a9Var = this.f;
                a9Var.l(g22);
                imageReceiver.j0(g22, a9Var, null);
                this.e = new wy0(org.telegram.messenger.n5.m(g22), 14.0f, org.telegram.messenger.g0.o());
            } else {
                imageReceiver.K0(0);
                long Y1 = fjVar.Y1();
                this.t = Y1;
                TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(i7).t7.f(-org.telegram.messenger.fj.B0(fjVar.k), Y1);
                if (f10 == null) {
                    this.e = null;
                    return false;
                }
                if (Y1 == 1) {
                    qg.b d = qg.c.d(view.getContext(), 0.75f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v8, this.c), false);
                    this.i = d;
                    imageReceiver.x0(d);
                } else if (f10.icon_emoji_id != 0) {
                    this.h = new o5(0, i7, f10.icon_emoji_id);
                    imageReceiver.S();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.x0(qg.c.f(f10));
                }
                this.e = new wy0(f10.title, 14.0f, org.telegram.messenger.g0.o());
            }
        }
        return this.e != null;
    }
}
