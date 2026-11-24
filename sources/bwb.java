// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bwb {
    public final int a;
    public final View b;
    public final ylb c;
    public final boolean d;
    public uib e;
    public final ImageReceiver g;
    public vm h;
    public mo4 i;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public final Paint o;
    public final Path p;
    public final RectF q;
    public final u51 r;
    public Runnable s;
    public long t;
    public final pc0 f = new pc0((ylb) null);
    public final Path j = new Path();

    public bwb(int i, View view, ylb ylbVar, boolean z) {
        Paint paint = new Paint(1);
        this.o = paint;
        Path path = new Path();
        this.p = path;
        this.q = new RectF();
        this.a = i;
        this.b = view;
        this.c = ylbVar;
        this.d = z;
        this.r = new u51(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-gm.L(1.75f), -gm.L(4.0f));
        path.lineTo(gm.L(1.75f), 0.0f);
        path.lineTo(-gm.L(1.75f), gm.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.I();
        vm vmVar = this.h;
        if (vmVar != null) {
            vmVar.b(this.b);
        }
    }

    public final void b() {
        this.g.K();
        vm vmVar = this.h;
        if (vmVar != null) {
            vmVar.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        uib uibVar = this.e;
        if (uibVar != null) {
            uibVar.p = i - gm.L(144.66f);
            float j = this.e.j() + gm.L(48.66f);
            float f7 = i;
            float f8 = (f7 - j) / 2.0f;
            int i2 = this.l;
            int i3 = (int) j;
            boolean z2 = this.d;
            Path path = this.j;
            if (i2 == i3 && this.k == i && this.n == z && this.m == z2) {
                f6 = j;
                f5 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = gm.P;
                f5 = 2.0f;
                rectF.set(f8, gm.L(4.5f), f8 + j, gm.L(28.5f));
                if (z) {
                    path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                }
                if (z2) {
                    float f9 = f7 / 2.0f;
                    float f10 = 1.833f;
                    float L = f9 - gm.L(1.833f);
                    while (L > 0.0f) {
                        RectF rectF2 = gm.P;
                        rectF2.set(L - gm.L(3.66f), gm.L(15.5f), L, gm.L(17.5f));
                        path.addRoundRect(rectF2, gm.L(1.0f), gm.L(1.0f), Path.Direction.CW);
                        L -= gm.L(8.33f);
                        f10 = f10;
                        f7 = f7;
                        j = j;
                    }
                    float f11 = f7;
                    f6 = j;
                    int L2 = gm.L(f10);
                    while (true) {
                        f9 += L2;
                        if (f9 >= f11) {
                            break;
                        }
                        RectF rectF3 = gm.P;
                        rectF3.set(f9, gm.L(15.5f), gm.L(3.66f) + f9, gm.L(17.5f));
                        path.addRoundRect(rectF3, gm.L(1.0f), gm.L(1.0f), Path.Direction.CW);
                        L2 = gm.L(8.33f);
                    }
                } else {
                    f6 = j;
                }
                this.l = i3;
                this.k = i;
                this.m = z2;
                this.n = z;
            }
            canvas.save();
            float f12 = f / f5;
            canvas.translate(f12, f2);
            ylb ylbVar = this.c;
            Paint U0 = cmb.U0("paintChatActionBackground", ylbVar);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f4 * f3));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (ylbVar != null ? ylbVar.g() : cmb.b1()) {
                Paint U02 = cmb.U0("paintChatActionBackgroundDarken", ylbVar);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f4 * f3));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f13 = f12 + f8;
            float f14 = f13 + f6;
            this.q.set(f13 - gm.L(4.0f), f2 - gm.L(4.0f), gm.L(4.0f) + f14, gm.L(32.0f) + f2);
            if (z) {
                vm vmVar = this.h;
                if (vmVar != null) {
                    vmVar.setBounds((int) (gm.L(2.66f) + f13), (int) (gm.L(6.5f) + f2), (int) (gm.L(22.66f) + f13), (int) (gm.L(26.5f) + f2));
                    this.h.setAlpha((int) (255.0f * f4));
                    this.h.draw(canvas);
                } else {
                    mo4 mo4Var = this.i;
                    if (mo4Var != null) {
                        mo4Var.a(cmb.v0(cmb.u8, ylbVar));
                    }
                    float L3 = gm.L(20.0f);
                    float L4 = gm.L(20.0f);
                    ImageReceiver imageReceiver = this.g;
                    imageReceiver.i0(gm.L(2.66f) + f13, gm.L(6.5f) + f2, L3, L4);
                    imageReceiver.setAlpha(f4);
                    imageReceiver.h(canvas, null);
                }
                int v0 = cmb.v0(cmb.g1(ylbVar) ? cmb.ya : cmb.Yc, ylbVar);
                this.e.c(f13 + gm.L(27.66f), gm.L(16.5f) + f2, f4, v0, canvas);
                canvas.save();
                canvas.translate(f14 - gm.L(11.25f), gm.L(16.5f) + f2);
                int p1 = cmb.p1(0.75f * f4, v0);
                Paint paint = this.o;
                paint.setColor(p1);
                paint.setStrokeWidth(gm.L(1.66f));
                canvas.drawPath(this.p, paint);
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(MotionEvent motionEvent, boolean z) {
        boolean z2;
        int action;
        Runnable runnable;
        if (this.e != null) {
            if (this.q.contains(motionEvent.getX(), motionEvent.getY() - (z ? this.b.getPaddingTop() : 0))) {
                z2 = true;
                action = motionEvent.getAction();
                u51 u51Var = this.r;
                if (action != 0) {
                    u51Var.c(z2);
                } else if (motionEvent.getAction() == 2) {
                    if (u51Var.i && !z2) {
                        u51Var.c(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (u51Var.i && (runnable = this.s) != null) {
                        runnable.run();
                    }
                    u51Var.c(false);
                } else if (motionEvent.getAction() == 3) {
                    u51Var.c(false);
                }
                return u51Var.i;
            }
        }
        z2 = false;
        action = motionEvent.getAction();
        u51 u51Var2 = this.r;
        if (action != 0) {
        }
        return u51Var2.i;
    }

    public final boolean e(k47 k47Var) {
        vm vmVar = this.h;
        View view = this.b;
        uib uibVar = null;
        if (vmVar != null) {
            vmVar.o(view);
            this.h = null;
        }
        this.l = 0;
        this.t = 0L;
        this.i = null;
        if (k47Var == null) {
            this.e = null;
            this.t = 0L;
        } else {
            int i = this.a;
            boolean p0 = sd2.p0(oc7.r1(i).L0(Long.valueOf(-k47.B0(k47Var.k))));
            ImageReceiver imageReceiver = this.g;
            if (p0) {
                imageReceiver.q0(gm.L(10.0f));
                long u1 = k47.u1(k47Var.k);
                TLObject a2 = oc7.r1(i).a2(u1);
                this.t = u1;
                if (a2 == null) {
                    this.e = null;
                    return false;
                }
                pc0 pc0Var = this.f;
                pc0Var.k(a2);
                imageReceiver.U(a2, pc0Var, null);
                uibVar = new uib(pg3.l(a2), 14.0f, gm.o());
                this.e = uibVar;
            } else {
                imageReceiver.q0(0);
                long Y1 = k47Var.Y1();
                this.t = Y1;
                TLRPC.TL_forumTopic f = oc7.r1(i).g4.f(-k47.B0(k47Var.k), Y1);
                if (f == null) {
                    this.e = null;
                    return false;
                }
                if (Y1 == 1) {
                    mo4 d = no4.d(view.getContext(), 0.75f, cmb.v0(cmb.u8, this.c), false);
                    this.i = d;
                    imageReceiver.g0(d);
                } else if (f.icon_emoji_id != 0) {
                    this.h = new vm(0, i, f.icon_emoji_id);
                    imageReceiver.K();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.g0(no4.f(f));
                }
                uibVar = new uib(f.title, 14.0f, gm.o());
                this.e = uibVar;
            }
        }
        return uibVar != null;
    }
}
