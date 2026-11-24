// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l39 {
    public static int W;
    public float A;
    public boolean B;
    public int C;
    public boolean D;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float N;
    public float O;
    public i39 P;
    public boolean Q;
    public ey8 R;
    public float a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final float q;
    public int r;
    public final hg0 w;
    public k47 x;
    public ylb y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final h39 X = new h39();
    public static int Y = 1;
    public static final qx7 Z = new qx7((byte) 11);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = z8c.t0;

    public l39(hg0 hg0Var) {
        this.w = hg0Var;
        n(this.y);
        this.q = ViewConfiguration.get(a.b).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f = rectF.left;
        rectF2.set(f, rectF.top, gm.L(12.0f) + f, rectF.top + gm.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - gm.L(12.0f), rectF.left + gm.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f2 = rectF.height() > ((float) gm.L(26.0f)) ? 1.4f : 0.0f;
        float N = rectF.right - gm.N(9.09f);
        float N2 = N - gm.N(0.056f);
        float N3 = gm.N(1.22f) + N;
        float N4 = gm.N(3.07f) + N;
        float N5 = gm.N(2.406f) + N;
        float N6 = gm.N(8.27f + f2) + N;
        float N7 = gm.N(8.923f + f2) + N;
        float N8 = gm.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - gm.N(1.753f);
        float N10 = gm.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - gm.N(0.663f);
        float f3 = 10.263f + f2;
        float N12 = gm.N(f3) + rectF.top;
        float N13 = rectF.bottom - gm.N(f3);
        float f4 = f2 + 11.333f;
        float N14 = gm.N(f4) + rectF.top;
        float N15 = rectF.bottom - gm.N(f4);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f5 = rectF.top;
        path.cubicTo(N5, N10, N3, f5, N2, f5);
        path.close();
    }

    public static long j(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static void n(ylb ylbVar) {
        S.setColor(cmb.v0(cmb.Ye, ylbVar));
        int v0 = cmb.v0(cmb.Ii, ylbVar);
        TextPaint textPaint = V;
        textPaint.setColor(v0);
        hg9.o(textPaint, gm.L(12.0f));
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        gd0 gd0Var;
        int i;
        int i2;
        if (this.x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i3 = 0;
        while (true) {
            arrayList = this.t;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((i39) arrayList.get(i3)).b();
            i3++;
        }
        arrayList.clear();
        hashMap.putAll(this.u);
        int i4 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i4 >= arrayList2.size()) {
                break;
            }
            i39 i39Var = (i39) arrayList2.get(i4);
            String str = i39Var.n;
            ty2 ty2Var = i39Var.E;
            i39 i39Var2 = (i39) hashMap.get(str);
            if (i39Var2 != null) {
                hashMap.remove(i39Var.n);
                int i5 = i39Var.w;
                int i6 = i39Var2.w;
                if (i5 == i6 && i39Var.x == i39Var2.x && i39Var.z == i39Var2.z && i39Var.v == i39Var2.v && i39Var.o == i39Var2.o && i39Var.S == null && i39Var2.S == null) {
                    i39Var.b = (byte) 0;
                    i4++;
                } else {
                    i39Var.c = i6;
                    i39Var.d = i39Var2.x;
                    i39Var.e = i39Var2.z;
                    i39Var.h = i39Var2.M;
                    i39Var.f = i39Var2.N;
                    i39Var.g = i39Var2.O;
                    i39Var.b = (byte) 3;
                    int i7 = i39Var.v;
                    int i8 = i39Var2.v;
                    if (i7 != i8 && ty2Var != null) {
                        ty2Var.c(i8, false);
                        ty2Var.c(i39Var.v, true);
                    }
                    if (i39Var.S == null) {
                        if (i39Var2.S != null) {
                            i39Var.o(new ArrayList());
                        }
                    }
                    if (i39Var2.S == null) {
                        i39Var2.o(new ArrayList());
                    }
                    ArrayList arrayList3 = i39Var2.T;
                    ArrayList arrayList4 = i39Var.T;
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (0; i2 < arrayList3.size(); i2 + 1) {
                            TLObject tLObject = (TLObject) arrayList3.get(i2);
                            TLObject tLObject2 = (TLObject) arrayList4.get(i2);
                            i2 = (tLObject == null || tLObject2 == null || j(tLObject) != j(tLObject2)) ? 0 : i2 + 1;
                        }
                    }
                    gd0 gd0Var2 = i39Var.S;
                    if (gd0Var2 != null && (gd0Var = i39Var2.S) != null) {
                        ValueAnimator valueAnimator = gd0Var.f;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (gd0Var2.w) {
                                gd0Var2.w = false;
                                gd0Var2.k();
                            }
                        }
                        TLObject[] tLObjectArr = new TLObject[3];
                        int i9 = 0;
                        while (true) {
                            i = this.l;
                            if (i9 >= 3) {
                                break;
                            }
                            tLObjectArr[i9] = gd0Var2.b[i9].h;
                            gd0Var2.j(i9, i, gd0Var.b[i9].h);
                            i9++;
                        }
                        gd0Var2.a(false, true);
                        for (int i10 = 0; i10 < 3; i10++) {
                            gd0Var2.j(i10, i, tLObjectArr[i10]);
                        }
                        gd0Var2.d = true;
                        gd0Var2.a(true, false);
                    }
                }
            } else {
                i39Var.b = (byte) 1;
            }
            z = true;
            i4++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((i39) arrayList.get(i11)).k = ((i39) arrayList.get(i11)).m;
                ((i39) arrayList.get(i11)).a();
            }
            z = true;
        }
        if (this.h) {
            float f = this.f;
            if (f != this.b || this.g != this.c) {
                this.i = true;
                this.d = f;
                this.e = this.g;
                z = true;
            }
        }
        if (this.C != this.o) {
            z = true;
        }
        int i12 = this.F;
        if (i12 == this.n) {
            return z;
        }
        this.j = true;
        this.G = i12;
        return true;
    }

    public final void b(k39 k39Var) {
        int i = 0;
        if (k39Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(k39Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.p0(this.w);
                int i2 = W;
                W = i2 + 1;
                imageReceiver.w1 = Integer.toString(i2);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.l).r.get(k39Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.d0(gn5.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.M(0);
                imageReceiver.I();
                hashMap.put(k39Var, imageReceiver);
                return;
            }
        }
        if (!this.J || k39Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                return;
            }
            if (k39Var.f(((i39) arrayList.get(i)).q)) {
                ((i39) arrayList.get(i)).p();
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        k47 k47Var;
        TLRPC.Message message;
        int i = 0;
        if (this.p || (k47Var = this.x) == null || (message = k47Var.k) == null || message.reactions == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        hg0 hg0Var = this.w;
        float paddingTop = y - hg0Var.getPaddingTop();
        if (hg0Var instanceof cm1) {
            x -= ((cm1) hg0Var).k0 / 2.0f;
        }
        float f = x - this.b;
        float f2 = paddingTop - this.c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (f <= ((i39) arrayList.get(i)).w || f >= ((i39) arrayList.get(i)).w + ((i39) arrayList.get(i)).z || f2 <= ((i39) arrayList.get(i)).x || f2 >= ((i39) arrayList.get(i)).x + ((i39) arrayList.get(i)).A) {
                    i++;
                } else {
                    this.N = motionEvent.getX();
                    this.O = paddingTop;
                    this.P = (i39) arrayList.get(i);
                    ey8 ey8Var = this.R;
                    if (ey8Var != null) {
                        gm.r(ey8Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    ey8 ey8Var2 = new ey8(this, this.P, (byte) 10);
                    this.R = ey8Var2;
                    gm.d3(ey8Var2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z = this.Q;
            float f3 = this.q;
            if ((z && Math.abs(motionEvent.getX() - this.N) > f3) || Math.abs(paddingTop - this.O) > f3) {
                this.Q = false;
                i39 i39Var = this.P;
                if (i39Var != null) {
                    i39Var.X.c(false);
                }
                this.P = null;
                ey8 ey8Var3 = this.R;
                if (ey8Var3 != null) {
                    gm.r(ey8Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ey8 ey8Var4 = this.R;
            if (ey8Var4 != null) {
                gm.r(ey8Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                ((mk5) hg0Var).c(this.P.a, false, motionEvent.getX(), paddingTop);
            }
            this.Q = false;
            i39 i39Var2 = this.P;
            if (i39Var2 != null) {
                i39Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f, Integer num) {
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        boolean z = this.p;
        ArrayList arrayList = this.t;
        if (z && arrayList.isEmpty()) {
            return;
        }
        float f5 = this.b;
        float f6 = this.c;
        if (this.p) {
            f5 = this.f;
            f6 = this.g;
        } else if (this.i) {
            float f7 = 1.0f - f;
            f5 = (f5 * f) + (this.d * f7);
            f6 = (f6 * f) + (this.e * f7);
        }
        float f8 = f5;
        float f9 = f6;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i2 >= arrayList2.size()) {
                break;
            }
            i39 i39Var = (i39) arrayList2.get(i2);
            if (this.z == null && num == null && this.A < 0.5f) {
                i39Var.c();
            }
            if (!Integer.valueOf(i39Var.q.hashCode()).equals(this.z) && (num == null || i39Var.q.hashCode() == num.intValue())) {
                canvas2.save();
                float f10 = i39Var.w;
                float f11 = i39Var.x;
                if (f != 1.0f && i39Var.b == 3) {
                    float f12 = 1.0f - f;
                    f10 = (f10 * f) + (i39Var.c * f12);
                    f11 = (f11 * f) + (i39Var.d * f12);
                }
                if (f == 1.0f || i39Var.b != 1) {
                    f2 = 1.0f;
                } else {
                    float f13 = (f * 0.5f) + 0.5f;
                    canvas2.scale(f13, f13, (i39Var.z / 2.0f) + f8 + f10, (i39Var.A / 2.0f) + f9 + f11);
                    f2 = f;
                }
                float f14 = f10 + f8;
                float f15 = f11 + f9;
                if (i39Var.b == 3) {
                    f3 = f2;
                    f4 = f;
                } else {
                    f3 = f2;
                    f4 = 1.0f;
                }
                i39Var.d(canvas2, f14, f15, f4, f3, num != null, this.B, this.A);
                canvas2.restore();
            }
            i2++;
        }
        while (i < arrayList.size()) {
            i39 i39Var2 = (i39) arrayList.get(i);
            float f16 = 1.0f - f;
            float f17 = (f16 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f17, f17, (i39Var2.z / 2.0f) + i39Var2.w + f8, (i39Var2.A / 2.0f) + i39Var2.x + f9);
            ((i39) arrayList.get(i)).d(canvas2, i39Var2.w + f8, i39Var2.x + f9, 1.0f, f16, false, this.B, this.A);
            canvas.restore();
            i++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f) {
        float f2;
        boolean z = this.p;
        ArrayList arrayList = this.t;
        if (z && arrayList.isEmpty()) {
            return;
        }
        float f3 = this.b;
        float f4 = this.c;
        float f5 = 1.0f;
        if (this.p) {
            f3 = this.f;
            f4 = this.g;
        } else if (this.i) {
            float f6 = 1.0f - f;
            f3 = (f3 * f) + (this.d * f6);
            f4 = (f4 * f) + (this.e * f6);
        }
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            i39 i39Var = (i39) arrayList2.get(i);
            if (i39Var.l) {
                canvas.save();
                float f7 = i39Var.w;
                float f8 = i39Var.x;
                if (f != f5) {
                    f2 = f5;
                    if (i39Var.b == 3) {
                        float f9 = f2 - f;
                        f7 = (f7 * f) + (i39Var.c * f9);
                        f8 = (f8 * f) + (i39Var.d * f9);
                    }
                } else {
                    f2 = f5;
                }
                if (f != f5 && i39Var.b == 1) {
                    float f10 = (f * 0.5f) + 0.5f;
                    canvas.scale(f10, f10, (i39Var.z / 2.0f) + f3 + f7, (i39Var.A / 2.0f) + f4 + f8);
                }
                z2 = z2 || i39Var.f(canvas, f7 + f3, f8 + f4);
                canvas.restore();
            } else {
                f2 = f5;
            }
            i++;
            f5 = f2;
        }
        float f11 = f5;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i39 i39Var2 = (i39) arrayList.get(i2);
            if (i39Var2.l) {
                float f12 = ((f11 - f) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f12, f12, (i39Var2.z / 2.0f) + i39Var2.w + f3, (i39Var2.A / 2.0f) + i39Var2.x + f4);
                boolean z3 = z2 || ((i39) arrayList.get(i2)).f(canvas, ((float) i39Var2.w) + f3, ((float) i39Var2.x) + f4);
                canvas.restore();
                z2 = z3;
            }
        }
    }

    public final void f(mu1 mu1Var, Canvas canvas, int i, Integer num) {
        if (this.p && this.t.isEmpty()) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i2 >= arrayList.size()) {
                return;
            }
            i39 i39Var = (i39) arrayList.get(i2);
            if (num != null && i39Var.q.hashCode() == num.intValue()) {
                RectF rectF = gm.P;
                rectF.set(i39Var.s);
                float L = gm.L(140.0f);
                float L2 = gm.L(14.0f);
                float i3 = Utilities.i(rectF.left - gm.L(12.0f), ((this.w instanceof rc2 ? ((rc2) r8).getParentWidth() : gm.q.x) - L) - gm.L(24.0f), gm.L(24.0f));
                float f = rectF.top - L2;
                float f2 = i;
                float f3 = f + f2;
                RectF rectF2 = this.L;
                rectF2.set(i3, (f - L) + f2, L + i3, f3);
                float interpolation = d53.h.getInterpolation(this.A);
                gm.X1(rectF, rectF2, interpolation, rectF2);
                int i4 = i39Var.U;
                k39 k39Var = i39Var.r;
                View view = i39Var.V;
                if (i39Var.e0 == null && i39Var.f0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (i39Var.q != null && !k39Var.a) {
                        if (k39Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i4).r.get(k39Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                meb f4 = eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                i39Var.e0 = imageReceiver;
                                imageReceiver.m0(7);
                                i39Var.e0.I();
                                i39Var.e0.q0(gm.L(14.0f));
                                ImageReceiver imageReceiver2 = i39Var.e0;
                                imageReceiver2.v0 = true;
                                imageReceiver2.u0 = true;
                                imageReceiver2.M(1);
                                ImageReceiver imageReceiver3 = i39Var.e0;
                                imageReceiver3.x0 = true;
                                imageReceiver3.d0(gn5.b(tL_availableReaction.activate_animation), "140_140", f4, null, tL_availableReaction, 1);
                            }
                        } else if (k39Var.g != 0) {
                            vm vmVar = new vm(24, i4, k39Var.g);
                            i39Var.f0 = vmVar;
                            vmVar.b(view);
                        }
                    }
                }
                this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver4 = i39Var.e0;
                    if (imageReceiver4 != null) {
                        imageReceiver4.k0(rectF2);
                        i39Var.e0.setAlpha(interpolation);
                        i39Var.e0.h(canvas, null);
                    } else {
                        vm vmVar2 = i39Var.f0;
                        if (vmVar2 != null) {
                            vmVar2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            i39Var.f0.setAlpha((int) (interpolation * 255.0f));
                            i39Var.f0.draw(canvas);
                        }
                    }
                    mu1Var.invalidate();
                }
            }
            i2++;
        }
    }

    public final float i(float f) {
        if (!this.j) {
            return this.n;
        }
        return (this.n * f) + ((1.0f - f) * this.G);
    }

    public final i39 k(k39 k39Var) {
        String l;
        if (k39Var.a) {
            l = "stars";
        } else {
            String str = k39Var.f;
            l = str != null ? str : Long.toString(k39Var.g);
        }
        return l(l);
    }

    public final i39 l(String str) {
        return (i39) this.u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            return !(this.p && this.t.isEmpty()) && e86.e(8200) && e86.e(131072);
        }
        return false;
    }

    public final void o(int i, int i2) {
        ArrayList arrayList;
        this.m = 0;
        this.o = 0;
        this.k = 0;
        this.n = 0;
        if (this.p) {
            return;
        }
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.s;
            if (i3 >= arrayList.size()) {
                break;
            }
            i39 i39Var = (i39) arrayList.get(i3);
            i39Var.getClass();
            ho hoVar = i39Var.F;
            ty2 ty2Var = i39Var.E;
            if (i39Var.R) {
                i39Var.z = gm.L(42.0f);
                i39Var.A = gm.L(26.0f);
                if (i39Var.t) {
                    i39Var.z = (int) (hoVar.d + gm.L(8.0f) + i39Var.z);
                } else if (ty2Var != null && i39Var.v > 1) {
                    i39Var.z = hg9.v(8.0f, (int) Math.ceil(ty2Var.m), i39Var.z);
                }
            } else {
                i39Var.z = gm.L(i39Var.C != null ? 6.0f : 4.0f) + gm.L(20.0f) + gm.L(8.0f);
                if (i39Var.S != null && i39Var.T.size() > 0) {
                    i39Var.T.size();
                    i39Var.z = (int) ((gm.L(20.0f) * (i39Var.T.size() > 1 ? i39Var.T.size() - 1 : 0) * 0.8f) + gm.L(20.0f) + gm.L(2.0f) + gm.L(1.0f) + i39Var.z);
                    i39Var.S.o = gm.L(26.0f);
                } else if (i39Var.t) {
                    i39Var.z = (int) (hoVar.d + gm.L(8.0f) + i39Var.z);
                } else {
                    int ceil = (int) Math.ceil(ty2Var.m);
                    int i8 = i39Var.z;
                    if (ceil > 0) {
                        i39Var.z = hg9.v(8.0f, (int) Math.ceil(ty2Var.m), i8);
                    } else {
                        i39Var.z = i8 - gm.L(1.0f);
                    }
                }
                i39Var.A = gm.L(26.0f);
            }
            if (i39Var.z + i4 > i) {
                arrayList2.add(Integer.valueOf(i4));
                i6 = hg9.v(4.0f, i39Var.A, i6);
                i7++;
                i4 = 0;
            }
            i39Var.w = i4;
            i39Var.x = i6;
            i39Var.y = i7;
            i4 = hg9.v(4.0f, i39Var.z, i4);
            if (i4 > i5) {
                i5 = i4;
            }
            i3++;
        }
        arrayList2.add(Integer.valueOf(i4));
        if (i2 == 5 && !arrayList.isEmpty()) {
            int i9 = ((i39) arrayList.get(0)).x;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((i39) arrayList.get(i11)).x != i9) {
                    int i12 = i11 - 1;
                    int i13 = i - (((i39) arrayList.get(i12)).w + ((i39) arrayList.get(i12)).z);
                    while (i10 < i11) {
                        ((i39) arrayList.get(i10)).w += i13;
                        i10++;
                    }
                    i10 = i11;
                }
            }
            int size = arrayList.size() - 1;
            int i14 = i - (((i39) arrayList.get(size)).w + ((i39) arrayList.get(size)).z);
            while (i10 <= size) {
                ((i39) arrayList.get(i10)).w += i14;
                i10++;
            }
        } else if (i2 == 1 && !arrayList.isEmpty()) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i39 i39Var2 = (i39) arrayList.get(i15);
                int i16 = i39Var2.y;
                i39Var2.w = (int) aq1.z(i, (i16 < 0 || i16 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(i39Var2.y)).intValue(), 2.0f, i39Var2.w);
            }
        }
        this.r = i4;
        if (i2 == 5 || i2 == 1) {
            this.o = i;
        } else {
            this.o = i5;
        }
        this.m = i6 + (arrayList.size() == 0 ? 0 : gm.L(26.0f));
        this.a = 0.0f;
    }

    public final void p() {
        int i = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                break;
            }
            ((i39) arrayList.get(i)).b();
            i++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).K();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.u;
        hashMap.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                this.h = !this.p;
                this.f = this.b;
                this.g = this.c;
                this.C = this.o;
                this.F = this.n;
                return;
            }
            hashMap.put(((i39) arrayList.get(i)).n, (i39) arrayList.get(i));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(k47 k47Var, boolean z, ylb ylbVar) {
        int i;
        ?? r7;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z2;
        int i2;
        TLRPC.ReactionCount reactionCount;
        i39 i39Var;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4 = z;
        this.y = ylbVar;
        this.J = z4;
        this.x = k47Var;
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        this.H = false;
        this.I = false;
        arrayList.clear();
        if (k47Var != null) {
            long B0 = k47.B0(k47Var.k);
            h39 h39Var = X;
            h39Var.a = B0;
            TLRPC.TL_messageReactions tL_messageReactions2 = k47Var.k.reactions;
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null) {
                int i6 = 0;
                for (int i7 = 0; i7 < k47Var.k.reactions.results.size(); i7++) {
                    i6 += k47Var.k.reactions.results.get(i7).count;
                }
                int i8 = this.l;
                TLRPC.ChatFull M0 = oc7.r1(i8).M0(-k47.B0(k47Var.k));
                if (!k47Var.k.reactions.results.isEmpty() && M0 != null && M0.paid_reactions_available) {
                    boolean z5 = false;
                    for (int i9 = 0; i9 < k47Var.k.reactions.results.size(); i9++) {
                        TLRPC.Reaction reaction = k47Var.k.reactions.results.get(i9).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z5 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z5) {
                        z2 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z2) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i2 = -arrayList3.size();
                        while (i2 < k47Var.k.reactions.results.size()) {
                            if (i2 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i2);
                                reactionCount.chosen = r5;
                                reactionCount.count = r5 == true ? 1 : 0;
                            } else {
                                reactionCount = k47Var.k.reactions.results.get(i2);
                            }
                            int i10 = r5 == true ? 1 : 0;
                            while (true) {
                                if (i10 >= arrayList2.size()) {
                                    i39Var = null;
                                    break;
                                }
                                i39Var = (i39) arrayList2.get(i10);
                                if (i39Var.q.equals(reactionCount.reaction)) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            j39 j39Var = new j39(this, i39Var, reactionCount, z4);
                            j39Var.Q = k47Var.z2();
                            arrayList.add(j39Var);
                            this.I = (this.I || j39Var.l) ? true : r5 == true ? 1 : 0;
                            if (!z4) {
                                TLRPC.Message message = k47Var.k;
                                if (message.reactions.recent_reactions != null) {
                                    long B02 = k47.B0(message);
                                    ty2 ty2Var = j39Var.E;
                                    if (B02 <= 0 || m9c.A(k47.B0(k47Var.k))) {
                                        i3 = i8;
                                        if (reactionCount.count <= 3 && i6 <= 3) {
                                            int i11 = 0;
                                            ArrayList arrayList4 = null;
                                            while (i11 < k47Var.k.reactions.recent_reactions.size()) {
                                                TLRPC.MessagePeerReaction messagePeerReaction = k47Var.k.reactions.recent_reactions.get(i11);
                                                k39 d = k39.d(messagePeerReaction.reaction);
                                                k39 d2 = k39.d(reactionCount.reaction);
                                                int i12 = i11;
                                                int i13 = i6;
                                                int i14 = i2;
                                                TLObject a2 = oc7.r1(i3).a2(k47.B1(messagePeerReaction.peer_id));
                                                if (d.equals(d2) && a2 != null) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.add(a2);
                                                }
                                                i11 = i12 + 1;
                                                i6 = i13;
                                                i2 = i14;
                                            }
                                            i4 = i6;
                                            i5 = i2;
                                            j39Var.o(arrayList4);
                                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                z3 = false;
                                                j39Var.v = 0;
                                                ty2Var.c(0, false);
                                                if (!this.D) {
                                                    j39Var.a();
                                                }
                                                i2 = i5 + 1;
                                                r5 = z3;
                                                i8 = i3;
                                                i6 = i4;
                                                z4 = z;
                                            }
                                            z3 = false;
                                            if (!this.D) {
                                            }
                                            i2 = i5 + 1;
                                            r5 = z3;
                                            i8 = i3;
                                            i6 = i4;
                                            z4 = z;
                                        }
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        TLRPC.User f = z8c.h(i8).f();
                                        TLRPC.User W1 = oc7.r1(i8).W1(Long.valueOf(k47.B0(k47Var.k)));
                                        i3 = i8;
                                        if (reactionCount.count == 2) {
                                            if (f != null) {
                                                arrayList5.add(f);
                                            }
                                            if (W1 != null) {
                                                arrayList5.add(W1);
                                            }
                                        } else if (reactionCount.chosen) {
                                            if (f != null) {
                                                arrayList5.add(f);
                                            }
                                        } else if (W1 != null) {
                                            arrayList5.add(W1);
                                        }
                                        j39Var.o(arrayList5);
                                        if (!arrayList5.isEmpty()) {
                                            j39Var.v = 0;
                                            ty2Var.c(0, false);
                                        }
                                    }
                                    i4 = i6;
                                    i5 = i2;
                                    z3 = false;
                                    if (!this.D) {
                                    }
                                    i2 = i5 + 1;
                                    r5 = z3;
                                    i8 = i3;
                                    i6 = i4;
                                    z4 = z;
                                }
                            }
                            z3 = r5 == true ? 1 : 0;
                            i3 = i8;
                            i4 = i6;
                            i5 = i2;
                            if (!this.D) {
                            }
                            i2 = i5 + 1;
                            r5 = z3;
                            i8 = i3;
                            i6 = i4;
                            z4 = z;
                        }
                    }
                }
                z2 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z2) {
                }
                i2 = -arrayList32.size();
                while (i2 < k47Var.k.reactions.results.size()) {
                }
            }
            i = r5;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, h39Var);
                for (int i15 = i; i15 < arrayList.size(); i15++) {
                    TLRPC.ReactionCount reactionCount2 = ((i39) arrayList.get(i15)).a;
                    int i16 = Y;
                    Y = i16 + 1;
                    reactionCount2.lastDrawnPosition = i16;
                }
            }
            TLRPC.Message message2 = k47Var.k;
            if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                for (int i17 = i; i17 < tL_messageReactions.recent_reactions.size(); i17++) {
                    if (tL_messageReactions.recent_reactions.get(i17).unread) {
                        r7 = 1;
                        break;
                    }
                }
            }
            r7 = i;
            this.H = r7;
        } else {
            i = 0;
        }
        for (int i18 = i; i18 < arrayList2.size(); i18++) {
            ((i39) arrayList2.get(i18)).b();
        }
        this.p = arrayList.isEmpty();
    }
}
