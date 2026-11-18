package ch;

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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qq;
import org.telegram.ui.pl;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q0 {
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
    public n0 P;
    public boolean Q;
    public c1.c R;
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
    public final org.telegram.ui.Cells.z w;
    public fj x;
    public i6 y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final m0 X = new m0();
    public static int Y = 1;
    public static final a3.c Z = new a3.c(13);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = j10.t0;

    public q0(org.telegram.ui.Cells.z zVar) {
        this.w = zVar;
        n(this.y);
        this.q = ViewConfiguration.get(org.telegram.messenger.t0.b).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, org.telegram.messenger.g0.L(12.0f) + f10, rectF.top + org.telegram.messenger.g0.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - org.telegram.messenger.g0.L(12.0f), rectF.left + org.telegram.messenger.g0.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f11 = rectF.height() > ((float) org.telegram.messenger.g0.L(26.0f)) ? 1.4f : 0.0f;
        float N = rectF.right - org.telegram.messenger.g0.N(9.09f);
        float N2 = N - org.telegram.messenger.g0.N(0.056f);
        float N3 = org.telegram.messenger.g0.N(1.22f) + N;
        float N4 = org.telegram.messenger.g0.N(3.07f) + N;
        float N5 = org.telegram.messenger.g0.N(2.406f) + N;
        float N6 = org.telegram.messenger.g0.N(8.27f + f11) + N;
        float N7 = org.telegram.messenger.g0.N(8.923f + f11) + N;
        float N8 = org.telegram.messenger.g0.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - org.telegram.messenger.g0.N(1.753f);
        float N10 = org.telegram.messenger.g0.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - org.telegram.messenger.g0.N(0.663f);
        float f12 = 10.263f + f11;
        float N12 = org.telegram.messenger.g0.N(f12) + rectF.top;
        float N13 = rectF.bottom - org.telegram.messenger.g0.N(f12);
        float f13 = f11 + 11.333f;
        float N14 = org.telegram.messenger.g0.N(f13) + rectF.top;
        float N15 = rectF.bottom - org.telegram.messenger.g0.N(f13);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f14 = rectF.top;
        path.cubicTo(N5, N10, N3, f14, N2, f14);
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

    public static void n(i6 i6Var) {
        S.setColor(n6.w0(n6.Ze, i6Var));
        int w02 = n6.w0(n6.Ji, i6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        d9 d9Var;
        int i7;
        int i10;
        if (this.x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.t;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.u);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList2.get(i12);
            String str = n0Var.n;
            qq qqVar = n0Var.E;
            n0 n0Var2 = (n0) hashMap.get(str);
            if (n0Var2 != null) {
                hashMap.remove(n0Var.n);
                int i13 = n0Var.w;
                int i14 = n0Var2.w;
                if (i13 == i14 && n0Var.x == n0Var2.x && n0Var.z == n0Var2.z && n0Var.v == n0Var2.v && n0Var.o == n0Var2.o && n0Var.S == null && n0Var2.S == null) {
                    n0Var.b = 0;
                    i12++;
                } else {
                    n0Var.c = i14;
                    n0Var.d = n0Var2.x;
                    n0Var.e = n0Var2.z;
                    n0Var.h = n0Var2.M;
                    n0Var.f = n0Var2.N;
                    n0Var.g = n0Var2.O;
                    n0Var.b = 3;
                    int i15 = n0Var.v;
                    int i16 = n0Var2.v;
                    if (i15 != i16 && qqVar != null) {
                        qqVar.c(i16, false);
                        qqVar.c(n0Var.v, true);
                    }
                    d9 d9Var2 = n0Var.S;
                    if (d9Var2 != null || n0Var2.S != null) {
                        if (d9Var2 == null) {
                            n0Var.o(new ArrayList());
                        }
                        if (n0Var2.S == null) {
                            n0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = n0Var2.T;
                        ArrayList arrayList4 = n0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (0; i10 < arrayList3.size(); i10 + 1) {
                                TLObject tLObject = (TLObject) arrayList3.get(i10);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i10);
                                i10 = (tLObject == null || tLObject2 == null || j(tLObject) != j(tLObject2)) ? 0 : i10 + 1;
                            }
                        }
                        d9 d9Var3 = n0Var.S;
                        if (d9Var3 != null && (d9Var = n0Var2.S) != null) {
                            ValueAnimator valueAnimator = d9Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (d9Var3.w) {
                                    d9Var3.w = false;
                                    d9Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i7 = this.l;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = d9Var3.b[i17].h;
                                d9Var3.j(i17, i7, d9Var.b[i17].h);
                                i17++;
                            }
                            d9Var3.a(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                d9Var3.j(i18, i7, tLObjectArr[i18]);
                            }
                            d9Var3.d = true;
                            d9Var3.a(true, false);
                        }
                    }
                }
            } else {
                n0Var.b = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((n0) arrayList.get(i19)).k = ((n0) arrayList.get(i19)).m;
                ((n0) arrayList.get(i19)).a();
            }
            z10 = true;
        }
        if (this.h) {
            float f10 = this.f;
            if (f10 != this.b || this.g != this.c) {
                this.i = true;
                this.d = f10;
                this.e = this.g;
                z10 = true;
            }
        }
        if (this.C != this.o) {
            z10 = true;
        }
        int i20 = this.F;
        if (i20 == this.n) {
            return z10;
        }
        this.j = true;
        this.G = i20;
        return true;
    }

    public final void b(p0 p0Var) {
        int i7 = 0;
        if (p0Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(p0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.w);
                int i10 = W;
                W = i10 + 1;
                imageReceiver.w1 = Integer.toString(i10);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.l).r.get(p0Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(fc.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(p0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || p0Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (p0Var.f(((n0) arrayList.get(i7)).q)) {
                ((n0) arrayList.get(i7)).p();
                return;
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        fj fjVar;
        TLRPC.Message message;
        int i7 = 0;
        if (this.p || (fjVar = this.x) == null || (message = fjVar.k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.w;
        if (e2.s(zVar)) {
            y10 -= zVar.getPaddingTop();
            if (zVar instanceof v0) {
                x10 -= ((v0) zVar).k0 / 2.0f;
            }
        }
        float f10 = x10 - this.b;
        float f11 = y10 - this.c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i7 >= size) {
                    break;
                }
                if (f10 <= ((n0) arrayList.get(i7)).w || f10 >= ((n0) arrayList.get(i7)).w + ((n0) arrayList.get(i7)).z || f11 <= ((n0) arrayList.get(i7)).x || f11 >= ((n0) arrayList.get(i7)).x + ((n0) arrayList.get(i7)).A) {
                    i7++;
                } else {
                    this.N = motionEvent.getX();
                    this.O = y10;
                    this.P = (n0) arrayList.get(i7);
                    c1.c cVar = this.R;
                    if (cVar != null) {
                        org.telegram.messenger.g0.r(cVar);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    c1.c cVar2 = new c1.c(6, this, this.P);
                    this.R = cVar2;
                    org.telegram.messenger.g0.h3(cVar2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.Q;
            float f12 = this.q;
            if ((z10 && Math.abs(motionEvent.getX() - this.N) > f12) || Math.abs(y10 - this.O) > f12) {
                this.Q = false;
                n0 n0Var = this.P;
                if (n0Var != null) {
                    n0Var.X.c(false);
                }
                this.P = null;
                c1.c cVar3 = this.R;
                if (cVar3 != null) {
                    org.telegram.messenger.g0.r(cVar3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            c1.c cVar4 = this.R;
            if (cVar4 != null) {
                org.telegram.messenger.g0.r(cVar4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.a;
                float x11 = motionEvent.getX();
                if (e2.s(zVar)) {
                    ((q4) zVar).d(reactionCount, false, x11, y10);
                }
            }
            this.Q = false;
            n0 n0Var2 = this.P;
            if (n0Var2 != null) {
                n0Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f10, Integer num) {
        float f11;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        boolean z10 = this.p;
        ArrayList arrayList = this.t;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f14 = this.b;
        float f15 = this.c;
        if (this.p) {
            f14 = this.f;
            f15 = this.g;
        } else if (this.i) {
            float f16 = 1.0f - f10;
            f14 = (f14 * f10) + (this.d * f16);
            f15 = (f15 * f10) + (this.e * f16);
        }
        float f17 = f14;
        float f18 = f15;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList2.get(i10);
            if (this.z == null && num == null && this.A < 0.5f) {
                n0Var.c();
            }
            if (!Integer.valueOf(n0Var.q.hashCode()).equals(this.z) && (num == null || n0Var.q.hashCode() == num.intValue())) {
                canvas2.save();
                float f19 = n0Var.w;
                float f20 = n0Var.x;
                if (f10 != 1.0f && n0Var.b == 3) {
                    float f21 = 1.0f - f10;
                    f19 = (f19 * f10) + (n0Var.c * f21);
                    f20 = (f20 * f10) + (n0Var.d * f21);
                }
                if (f10 == 1.0f || n0Var.b != 1) {
                    f11 = 1.0f;
                } else {
                    float f22 = (f10 * 0.5f) + 0.5f;
                    canvas2.scale(f22, f22, (n0Var.z / 2.0f) + f17 + f19, (n0Var.A / 2.0f) + f18 + f20);
                    f11 = f10;
                }
                float f23 = f19 + f17;
                float f24 = f20 + f18;
                if (n0Var.b == 3) {
                    f12 = f11;
                    f13 = f10;
                } else {
                    f12 = f11;
                    f13 = 1.0f;
                }
                n0Var.d(canvas2, f23, f24, f13, f12, num != null, this.B, this.A);
                canvas2.restore();
            }
            i10++;
        }
        while (i7 < arrayList.size()) {
            n0 n0Var2 = (n0) arrayList.get(i7);
            float f25 = 1.0f - f10;
            float f26 = (f25 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f26, f26, (n0Var2.z / 2.0f) + n0Var2.w + f17, (n0Var2.A / 2.0f) + n0Var2.x + f18);
            ((n0) arrayList.get(i7)).d(canvas2, n0Var2.w + f17, n0Var2.x + f18, 1.0f, f25, false, this.B, this.A);
            canvas.restore();
            i7++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f10) {
        float f11;
        boolean z10 = this.p;
        ArrayList arrayList = this.t;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f12 = this.b;
        float f13 = this.c;
        float f14 = 1.0f;
        if (this.p) {
            f12 = this.f;
            f13 = this.g;
        } else if (this.i) {
            float f15 = 1.0f - f10;
            f12 = (f12 * f10) + (this.d * f15);
            f13 = (f13 * f10) + (this.e * f15);
        }
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList2.get(i7);
            if (n0Var.l) {
                canvas.save();
                float f16 = n0Var.w;
                float f17 = n0Var.x;
                if (f10 != f14) {
                    f11 = f14;
                    if (n0Var.b == 3) {
                        float f18 = f11 - f10;
                        f16 = (f16 * f10) + (n0Var.c * f18);
                        f17 = (f17 * f10) + (n0Var.d * f18);
                    }
                } else {
                    f11 = f14;
                }
                if (f10 != f14 && n0Var.b == 1) {
                    float f19 = (f10 * 0.5f) + 0.5f;
                    canvas.scale(f19, f19, (n0Var.z / 2.0f) + f12 + f16, (n0Var.A / 2.0f) + f13 + f17);
                }
                z11 = z11 || n0Var.f(canvas, f16 + f12, f17 + f13);
                canvas.restore();
            } else {
                f11 = f14;
            }
            i7++;
            f14 = f11;
        }
        float f20 = f14;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n0 n0Var2 = (n0) arrayList.get(i10);
            if (n0Var2.l) {
                float f21 = ((f20 - f10) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f21, f21, (n0Var2.z / 2.0f) + n0Var2.w + f12, (n0Var2.A / 2.0f) + n0Var2.x + f13);
                boolean z12 = z11 || ((n0) arrayList.get(i10)).f(canvas, ((float) n0Var2.w) + f12, ((float) n0Var2.x) + f13);
                canvas.restore();
                z11 = z12;
            }
        }
    }

    public final void f(pl plVar, Canvas canvas, int i7, Integer num) {
        if (this.p && this.t.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                return;
            }
            n0 n0Var = (n0) arrayList.get(i10);
            if ((num == null || n0Var.q.hashCode() == num.intValue()) && num != null) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(n0Var.s);
                float L = org.telegram.messenger.g0.L(140.0f);
                float L2 = org.telegram.messenger.g0.L(14.0f);
                float i11 = Utilities.i(rectF.left - org.telegram.messenger.g0.L(12.0f), ((this.w instanceof r1 ? ((r1) r8).getParentWidth() : org.telegram.messenger.g0.q.x) - L) - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                float f10 = rectF.top - L2;
                float f11 = i7;
                float f12 = f10 + f11;
                RectF rectF2 = this.L;
                rectF2.set(i11, (f10 - L) + f11, L + i11, f12);
                float interpolation = lr.h.getInterpolation(this.A);
                org.telegram.messenger.g0.Z1(rectF, rectF2, interpolation, rectF2);
                int i12 = n0Var.U;
                p0 p0Var = n0Var.r;
                View view = n0Var.V;
                if (n0Var.e0 == null && n0Var.f0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (n0Var.q != null && !p0Var.a) {
                        if (p0Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(i12).r.get(p0Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                lz f13 = u5.f(tL_availableReaction.static_icon, n6.a7, 1.0f, null);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                n0Var.e0 = imageReceiver;
                                imageReceiver.E0(7);
                                n0Var.e0.P();
                                n0Var.e0.J0(org.telegram.messenger.g0.L(14.0f));
                                ImageReceiver imageReceiver2 = n0Var.e0;
                                imageReceiver2.v0 = true;
                                imageReceiver2.u0 = true;
                                imageReceiver2.W(1);
                                ImageReceiver imageReceiver3 = n0Var.e0;
                                imageReceiver3.x0 = true;
                                imageReceiver3.q0(fc.b(tL_availableReaction.activate_animation), "140_140", f13, null, tL_availableReaction, 1);
                            }
                        } else if (p0Var.g != 0) {
                            o5 o5Var = new o5(24, i12, p0Var.g);
                            n0Var.f0 = o5Var;
                            o5Var.a(view);
                        }
                    }
                }
                this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver4 = n0Var.e0;
                    if (imageReceiver4 != null) {
                        imageReceiver4.A0(rectF2);
                        n0Var.e0.setAlpha(interpolation);
                        n0Var.e0.h(canvas, null);
                    } else {
                        o5 o5Var2 = n0Var.f0;
                        if (o5Var2 != null) {
                            o5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            n0Var.f0.setAlpha((int) (interpolation * 255.0f));
                            n0Var.f0.draw(canvas);
                        }
                    }
                    plVar.invalidate();
                }
            }
            i10++;
        }
    }

    public final float i(float f10) {
        if (!this.j) {
            return this.n;
        }
        return (this.n * f10) + ((1.0f - f10) * this.G);
    }

    public final n0 k(p0 p0Var) {
        String l10;
        if (p0Var.a) {
            l10 = "stars";
        } else {
            String str = p0Var.f;
            l10 = str != null ? str : Long.toString(p0Var.g);
        }
        return l(l10);
    }

    public final n0 l(String str) {
        return (n0) this.u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            return !(this.p && this.t.isEmpty()) && pc.e(8200) && pc.e(131072);
        }
        return false;
    }

    public final void o(int i7, int i10) {
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
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.s;
            if (i11 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i11);
            n0Var.getClass();
            m6 m6Var = n0Var.F;
            qq qqVar = n0Var.E;
            if (n0Var.R) {
                n0Var.z = org.telegram.messenger.g0.L(42.0f);
                n0Var.A = org.telegram.messenger.g0.L(26.0f);
                if (n0Var.t) {
                    n0Var.z = (int) (m6Var.d + org.telegram.messenger.g0.L(8.0f) + n0Var.z);
                } else if (qqVar != null && n0Var.v > 1) {
                    n0Var.z = f3.C(8.0f, (int) Math.ceil(qqVar.m), n0Var.z);
                }
            } else {
                n0Var.z = org.telegram.messenger.g0.L(n0Var.C != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f);
                if (n0Var.S != null && n0Var.T.size() > 0) {
                    n0Var.T.size();
                    n0Var.z = (int) ((org.telegram.messenger.g0.L(20.0f) * (n0Var.T.size() > 1 ? n0Var.T.size() - 1 : 0) * 0.8f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(1.0f) + n0Var.z);
                    n0Var.S.o = org.telegram.messenger.g0.L(26.0f);
                } else if (n0Var.t) {
                    n0Var.z = (int) (m6Var.d + org.telegram.messenger.g0.L(8.0f) + n0Var.z);
                } else if (((int) Math.ceil(qqVar.m)) > 0) {
                    n0Var.z = f3.C(8.0f, (int) Math.ceil(qqVar.m), n0Var.z);
                } else {
                    n0Var.z -= org.telegram.messenger.g0.L(1.0f);
                }
                n0Var.A = org.telegram.messenger.g0.L(26.0f);
            }
            if (n0Var.z + i12 > i7) {
                arrayList2.add(Integer.valueOf(i12));
                i14 = f3.C(4.0f, n0Var.A, i14);
                i15++;
                i12 = 0;
            }
            n0Var.w = i12;
            n0Var.x = i14;
            n0Var.y = i15;
            i12 = f3.C(4.0f, n0Var.z, i12);
            if (i12 > i13) {
                i13 = i12;
            }
            i11++;
        }
        arrayList2.add(Integer.valueOf(i12));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i16 = ((n0) arrayList.get(0)).x;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                if (((n0) arrayList.get(i18)).x != i16) {
                    int i19 = i18 - 1;
                    int i20 = i7 - (((n0) arrayList.get(i19)).w + ((n0) arrayList.get(i19)).z);
                    while (i17 < i18) {
                        ((n0) arrayList.get(i17)).w += i20;
                        i17++;
                    }
                    i17 = i18;
                }
            }
            int size = arrayList.size() - 1;
            int i21 = i7 - (((n0) arrayList.get(size)).w + ((n0) arrayList.get(size)).z);
            while (i17 <= size) {
                ((n0) arrayList.get(i17)).w += i21;
                i17++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                n0 n0Var2 = (n0) arrayList.get(i22);
                int i23 = n0Var2.y;
                n0Var2.w = (int) e2.A(i7, (i23 < 0 || i23 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(n0Var2.y)).intValue(), 2.0f, n0Var2.w);
            }
        }
        this.r = i12;
        if (i10 == 5 || i10 == 1) {
            this.o = i7;
        } else {
            this.o = i13;
        }
        this.m = i14 + (arrayList.size() == 0 ? 0 : org.telegram.messenger.g0.L(26.0f));
        this.a = 0.0f;
    }

    public final void p() {
        int i7 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.s;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i7)).b();
            i7++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).R();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.u;
        hashMap.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i7 >= arrayList.size()) {
                this.h = !this.p;
                this.f = this.b;
                this.g = this.c;
                this.C = this.o;
                this.F = this.n;
                return;
            }
            hashMap.put(((n0) arrayList.get(i7)).n, (n0) arrayList.get(i7));
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(fj fjVar, boolean z10, i6 i6Var) {
        int i7;
        TLRPC.TL_messageReactions tL_messageReactions;
        ?? r72;
        boolean z11;
        int i10;
        TLRPC.ReactionCount reactionCount;
        n0 n0Var;
        boolean z12;
        int i11;
        boolean z13 = z10;
        this.y = i6Var;
        this.J = z13;
        this.x = fjVar;
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r52 = 0;
        r52 = 0;
        r52 = 0;
        this.H = false;
        this.I = false;
        arrayList.clear();
        if (fjVar != null) {
            long B0 = fj.B0(fjVar.k);
            m0 m0Var = X;
            m0Var.a = B0;
            TLRPC.TL_messageReactions tL_messageReactions2 = fjVar.k.reactions;
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null) {
                int i12 = 0;
                for (int i13 = 0; i13 < fjVar.k.reactions.results.size(); i13++) {
                    i12 += fjVar.k.reactions.results.get(i13).count;
                }
                int i14 = this.l;
                TLRPC.ChatFull P0 = mp.u1(i14).P0(-fj.B0(fjVar.k));
                if (!fjVar.k.reactions.results.isEmpty() && P0 != null && P0.paid_reactions_available) {
                    boolean z14 = false;
                    for (int i15 = 0; i15 < fjVar.k.reactions.results.size(); i15++) {
                        TLRPC.Reaction reaction = fjVar.k.reactions.results.get(i15).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z14 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z14) {
                        z11 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z11) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i10 = -arrayList3.size();
                        while (i10 < fjVar.k.reactions.results.size()) {
                            if (i10 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i10);
                                reactionCount.chosen = r52;
                                reactionCount.count = r52 == true ? 1 : 0;
                            } else {
                                reactionCount = fjVar.k.reactions.results.get(i10);
                            }
                            int i16 = r52 == true ? 1 : 0;
                            while (true) {
                                if (i16 >= arrayList2.size()) {
                                    n0Var = null;
                                    break;
                                }
                                n0Var = (n0) arrayList2.get(i16);
                                if (n0Var.q.equals(reactionCount.reaction)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            o0 o0Var = new o0(this, n0Var, reactionCount, z13);
                            o0Var.Q = fjVar.z2();
                            arrayList.add(o0Var);
                            this.I = (this.I || o0Var.l) ? true : r52 == true ? 1 : 0;
                            if (!z13) {
                                TLRPC.Message message = fjVar.k;
                                if (message.reactions.recent_reactions != null) {
                                    if (fj.B0(message) > 0 && !o10.z(fj.B0(fjVar.k))) {
                                        ArrayList arrayList4 = new ArrayList();
                                        TLRPC.User f10 = j10.i(i14).f();
                                        TLRPC.User c22 = mp.u1(i14).c2(Long.valueOf(fj.B0(fjVar.k)));
                                        if (reactionCount.count == 2) {
                                            if (f10 != null) {
                                                arrayList4.add(f10);
                                            }
                                            if (c22 != null) {
                                                arrayList4.add(c22);
                                            }
                                        } else if (reactionCount.chosen) {
                                            if (f10 != null) {
                                                arrayList4.add(f10);
                                            }
                                        } else if (c22 != null) {
                                            arrayList4.add(c22);
                                        }
                                        o0Var.o(arrayList4);
                                        if (!arrayList4.isEmpty()) {
                                            z12 = false;
                                            o0Var.v = 0;
                                            o0Var.E.c(0, false);
                                            i11 = i14;
                                            if (this.D) {
                                            }
                                            i10++;
                                            r52 = z12;
                                            i14 = i11;
                                            z13 = z10;
                                        }
                                    } else if (reactionCount.count <= 3 && i12 <= 3) {
                                        int i17 = 0;
                                        ArrayList arrayList5 = null;
                                        while (i17 < fjVar.k.reactions.recent_reactions.size()) {
                                            TLRPC.MessagePeerReaction messagePeerReaction = fjVar.k.reactions.recent_reactions.get(i17);
                                            p0 d = p0.d(messagePeerReaction.reaction);
                                            p0 d2 = p0.d(reactionCount.reaction);
                                            int i18 = i17;
                                            int i19 = i14;
                                            TLObject g22 = mp.u1(i14).g2(fj.B1(messagePeerReaction.peer_id));
                                            if (d.equals(d2) && g22 != null) {
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(g22);
                                            }
                                            i17 = i18 + 1;
                                            i14 = i19;
                                        }
                                        i11 = i14;
                                        o0Var.o(arrayList5);
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            z12 = false;
                                            o0Var.v = 0;
                                            o0Var.E.c(0, false);
                                            if (this.D) {
                                                o0Var.a();
                                            }
                                            i10++;
                                            r52 = z12;
                                            i14 = i11;
                                            z13 = z10;
                                        }
                                        z12 = false;
                                        if (this.D) {
                                        }
                                        i10++;
                                        r52 = z12;
                                        i14 = i11;
                                        z13 = z10;
                                    }
                                    i11 = i14;
                                    z12 = false;
                                    if (this.D) {
                                    }
                                    i10++;
                                    r52 = z12;
                                    i14 = i11;
                                    z13 = z10;
                                }
                            }
                            z12 = r52 == true ? 1 : 0;
                            i11 = i14;
                            if (this.D) {
                            }
                            i10++;
                            r52 = z12;
                            i14 = i11;
                            z13 = z10;
                        }
                    }
                }
                z11 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z11) {
                }
                i10 = -arrayList32.size();
                while (i10 < fjVar.k.reactions.results.size()) {
                }
            }
            i7 = r52;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, m0Var);
                for (int i20 = i7; i20 < arrayList.size(); i20++) {
                    TLRPC.ReactionCount reactionCount2 = ((n0) arrayList.get(i20)).a;
                    int i21 = Y;
                    Y = i21 + 1;
                    reactionCount2.lastDrawnPosition = i21;
                }
            }
            TLRPC.Message message2 = fjVar.k;
            if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                for (int i22 = i7; i22 < tL_messageReactions.recent_reactions.size(); i22++) {
                    if (tL_messageReactions.recent_reactions.get(i22).unread) {
                        r72 = 1;
                        break;
                    }
                }
            }
            r72 = i7;
            this.H = r72;
        } else {
            i7 = 0;
        }
        for (int i23 = i7; i23 < arrayList2.size(); i23++) {
            ((n0) arrayList2.get(i23)).b();
        }
        this.p = arrayList.isEmpty();
    }
}
