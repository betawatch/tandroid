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
import bi.a4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.rc;
import org.telegram.messenger.rz;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y8;
import org.telegram.ui.ol;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class p0 {
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
    public m0 P;
    public boolean Q;
    public a4 R;
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
    public ij x;
    public f6 y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final l0 X = new l0();
    public static int Y = 1;
    public static final a3.c Z = new a3.c(16);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = p10.s0;

    public p0(org.telegram.ui.Cells.z zVar) {
        this.w = zVar;
        n(this.y);
        this.q = ViewConfiguration.get(t0.b).getScaledTouchSlop();
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

    public static void n(f6 f6Var) {
        S.setColor(k6.w0(k6.We, f6Var));
        int w02 = k6.w0(k6.Gi, f6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        y8 y8Var;
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
            ((m0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.u);
        int i12 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i12);
            String str = m0Var.n;
            bq bqVar = m0Var.E;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null) {
                hashMap.remove(m0Var.n);
                int i13 = m0Var.w;
                int i14 = m0Var2.w;
                if (i13 == i14 && m0Var.x == m0Var2.x && m0Var.z == m0Var2.z && m0Var.v == m0Var2.v && m0Var.o == m0Var2.o && m0Var.S == null && m0Var2.S == null) {
                    m0Var.b = 0;
                    i12++;
                } else {
                    m0Var.c = i14;
                    m0Var.d = m0Var2.x;
                    m0Var.e = m0Var2.z;
                    m0Var.h = m0Var2.M;
                    m0Var.f = m0Var2.N;
                    m0Var.g = m0Var2.O;
                    m0Var.b = 3;
                    int i15 = m0Var.v;
                    int i16 = m0Var2.v;
                    if (i15 != i16 && bqVar != null) {
                        bqVar.c(i16, false);
                        bqVar.c(m0Var.v, true);
                    }
                    y8 y8Var2 = m0Var.S;
                    if (y8Var2 != null || m0Var2.S != null) {
                        if (y8Var2 == null) {
                            m0Var.o(new ArrayList());
                        }
                        if (m0Var2.S == null) {
                            m0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = m0Var2.T;
                        ArrayList arrayList4 = m0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (0; i10 < arrayList3.size(); i10 + 1) {
                                TLObject tLObject = (TLObject) arrayList3.get(i10);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i10);
                                i10 = (tLObject == null || tLObject2 == null || j(tLObject) != j(tLObject2)) ? 0 : i10 + 1;
                            }
                        }
                        y8 y8Var3 = m0Var.S;
                        if (y8Var3 != null && (y8Var = m0Var2.S) != null) {
                            ValueAnimator valueAnimator = y8Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (y8Var3.w) {
                                    y8Var3.w = false;
                                    y8Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i7 = this.l;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = y8Var3.b[i17].h;
                                y8Var3.j(i17, i7, y8Var.b[i17].h);
                                i17++;
                            }
                            y8Var3.a(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                y8Var3.j(i18, i7, tLObjectArr[i18]);
                            }
                            y8Var3.d = true;
                            y8Var3.a(true, false);
                        }
                    }
                }
            } else {
                m0Var.b = 1;
            }
            z9 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((m0) arrayList.get(i19)).k = ((m0) arrayList.get(i19)).m;
                ((m0) arrayList.get(i19)).a();
            }
            z9 = true;
        }
        if (this.h) {
            float f10 = this.f;
            if (f10 != this.b || this.g != this.c) {
                this.i = true;
                this.d = f10;
                this.e = this.g;
                z9 = true;
            }
        }
        if (this.C != this.o) {
            z9 = true;
        }
        int i20 = this.F;
        if (i20 == this.n) {
            return z9;
        }
        this.j = true;
        this.G = i20;
        return true;
    }

    public final void b(o0 o0Var) {
        int i7 = 0;
        if (o0Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.w);
                int i10 = W;
                W = i10 + 1;
                imageReceiver.v1 = Integer.toString(i10);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.l).r.get(o0Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(hc.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || o0Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (o0Var.f(((m0) arrayList.get(i7)).q)) {
                ((m0) arrayList.get(i7)).p();
                return;
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        ij ijVar;
        TLRPC.Message message;
        int i7 = 0;
        if (this.p || (ijVar = this.x) == null || (message = ijVar.k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.w;
        if (com.google.android.recaptcha.internal.a.u(zVar)) {
            y10 -= zVar.getPaddingTop();
            if (zVar instanceof org.telegram.ui.Cells.t0) {
                x10 -= ((org.telegram.ui.Cells.t0) zVar).j0 / 2.0f;
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
                if (f10 <= ((m0) arrayList.get(i7)).w || f10 >= ((m0) arrayList.get(i7)).w + ((m0) arrayList.get(i7)).z || f11 <= ((m0) arrayList.get(i7)).x || f11 >= ((m0) arrayList.get(i7)).x + ((m0) arrayList.get(i7)).A) {
                    i7++;
                } else {
                    this.N = motionEvent.getX();
                    this.O = y10;
                    this.P = (m0) arrayList.get(i7);
                    a4 a4Var = this.R;
                    if (a4Var != null) {
                        org.telegram.messenger.g0.r(a4Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    a4 a4Var2 = new a4(20, this, this.P);
                    this.R = a4Var2;
                    org.telegram.messenger.g0.i3(a4Var2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z9 = this.Q;
            float f12 = this.q;
            if ((z9 && Math.abs(motionEvent.getX() - this.N) > f12) || Math.abs(y10 - this.O) > f12) {
                this.Q = false;
                m0 m0Var = this.P;
                if (m0Var != null) {
                    m0Var.X.c(false);
                }
                this.P = null;
                a4 a4Var3 = this.R;
                if (a4Var3 != null) {
                    org.telegram.messenger.g0.r(a4Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a4 a4Var4 = this.R;
            if (a4Var4 != null) {
                org.telegram.messenger.g0.r(a4Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.a;
                float x11 = motionEvent.getX();
                if (com.google.android.recaptcha.internal.a.u(zVar)) {
                    ((p4) zVar).e(reactionCount, false, x11, y10);
                }
            }
            this.Q = false;
            m0 m0Var2 = this.P;
            if (m0Var2 != null) {
                m0Var2.X.c(false);
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
        boolean z9 = this.p;
        ArrayList arrayList = this.t;
        if (z9 && arrayList.isEmpty()) {
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
            m0 m0Var = (m0) arrayList2.get(i10);
            if (this.z == null && num == null && this.A < 0.5f) {
                m0Var.c();
            }
            if (!Integer.valueOf(m0Var.q.hashCode()).equals(this.z) && (num == null || m0Var.q.hashCode() == num.intValue())) {
                canvas2.save();
                float f19 = m0Var.w;
                float f20 = m0Var.x;
                if (f10 != 1.0f && m0Var.b == 3) {
                    float f21 = 1.0f - f10;
                    f19 = (f19 * f10) + (m0Var.c * f21);
                    f20 = (f20 * f10) + (m0Var.d * f21);
                }
                if (f10 == 1.0f || m0Var.b != 1) {
                    f11 = 1.0f;
                } else {
                    float f22 = (f10 * 0.5f) + 0.5f;
                    canvas2.scale(f22, f22, (m0Var.z / 2.0f) + f17 + f19, (m0Var.A / 2.0f) + f18 + f20);
                    f11 = f10;
                }
                float f23 = f19 + f17;
                float f24 = f20 + f18;
                if (m0Var.b == 3) {
                    f12 = f11;
                    f13 = f10;
                } else {
                    f12 = f11;
                    f13 = 1.0f;
                }
                m0Var.d(canvas2, f23, f24, f13, f12, num != null, this.B, this.A);
                canvas2.restore();
            }
            i10++;
        }
        while (i7 < arrayList.size()) {
            m0 m0Var2 = (m0) arrayList.get(i7);
            float f25 = 1.0f - f10;
            float f26 = (f25 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f26, f26, (m0Var2.z / 2.0f) + m0Var2.w + f17, (m0Var2.A / 2.0f) + m0Var2.x + f18);
            ((m0) arrayList.get(i7)).d(canvas2, m0Var2.w + f17, m0Var2.x + f18, 1.0f, f25, false, this.B, this.A);
            canvas.restore();
            i7++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f10) {
        float f11;
        boolean z9 = this.p;
        ArrayList arrayList = this.t;
        if (z9 && arrayList.isEmpty()) {
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
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i7);
            if (m0Var.l) {
                canvas.save();
                float f16 = m0Var.w;
                float f17 = m0Var.x;
                if (f10 != f14) {
                    f11 = f14;
                    if (m0Var.b == 3) {
                        float f18 = f11 - f10;
                        f16 = (f16 * f10) + (m0Var.c * f18);
                        f17 = (f17 * f10) + (m0Var.d * f18);
                    }
                } else {
                    f11 = f14;
                }
                if (f10 != f14 && m0Var.b == 1) {
                    float f19 = (f10 * 0.5f) + 0.5f;
                    canvas.scale(f19, f19, (m0Var.z / 2.0f) + f12 + f16, (m0Var.A / 2.0f) + f13 + f17);
                }
                z10 = z10 || m0Var.f(canvas, f16 + f12, f17 + f13);
                canvas.restore();
            } else {
                f11 = f14;
            }
            i7++;
            f14 = f11;
        }
        float f20 = f14;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m0 m0Var2 = (m0) arrayList.get(i10);
            if (m0Var2.l) {
                float f21 = ((f20 - f10) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f21, f21, (m0Var2.z / 2.0f) + m0Var2.w + f12, (m0Var2.A / 2.0f) + m0Var2.x + f13);
                boolean z11 = z10 || ((m0) arrayList.get(i10)).f(canvas, ((float) m0Var2.w) + f12, ((float) m0Var2.x) + f13);
                canvas.restore();
                z10 = z11;
            }
        }
    }

    public final void f(ol olVar, Canvas canvas, int i7, Integer num) {
        if (this.p && this.t.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                return;
            }
            m0 m0Var = (m0) arrayList.get(i10);
            if ((num == null || m0Var.q.hashCode() == num.intValue()) && num != null) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(m0Var.s);
                float L = org.telegram.messenger.g0.L(140.0f);
                float L2 = org.telegram.messenger.g0.L(14.0f);
                float i11 = Utilities.i(rectF.left - org.telegram.messenger.g0.L(12.0f), ((this.w instanceof q1 ? ((q1) r8).getParentWidth() : org.telegram.messenger.g0.q.x) - L) - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                float f10 = rectF.top - L2;
                float f11 = i7;
                float f12 = f10 + f11;
                RectF rectF2 = this.L;
                rectF2.set(i11, (f10 - L) + f11, L + i11, f12);
                float interpolation = xq.h.getInterpolation(this.A);
                org.telegram.messenger.g0.Z1(rectF, rectF2, interpolation, rectF2);
                int i12 = m0Var.U;
                o0 o0Var = m0Var.r;
                View view = m0Var.V;
                if (m0Var.e0 == null && m0Var.f0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (m0Var.q != null && !o0Var.a) {
                        if (o0Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i12).r.get(o0Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                rz f13 = t5.f(tL_availableReaction.static_icon, k6.a7, 1.0f, null);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                m0Var.e0 = imageReceiver;
                                imageReceiver.E0(7);
                                m0Var.e0.P();
                                m0Var.e0.J0(org.telegram.messenger.g0.L(14.0f));
                                ImageReceiver imageReceiver2 = m0Var.e0;
                                imageReceiver2.u0 = true;
                                imageReceiver2.t0 = true;
                                imageReceiver2.W(1);
                                ImageReceiver imageReceiver3 = m0Var.e0;
                                imageReceiver3.w0 = true;
                                imageReceiver3.q0(hc.b(tL_availableReaction.activate_animation), "140_140", f13, null, tL_availableReaction, 1);
                            }
                        } else if (o0Var.g != 0) {
                            i5 i5Var = new i5(24, i12, o0Var.g);
                            m0Var.f0 = i5Var;
                            i5Var.a(view);
                        }
                    }
                }
                this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver4 = m0Var.e0;
                    if (imageReceiver4 != null) {
                        imageReceiver4.A0(rectF2);
                        m0Var.e0.setAlpha(interpolation);
                        m0Var.e0.h(canvas, null);
                    } else {
                        i5 i5Var2 = m0Var.f0;
                        if (i5Var2 != null) {
                            i5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            m0Var.f0.setAlpha((int) (interpolation * 255.0f));
                            m0Var.f0.draw(canvas);
                        }
                    }
                    olVar.invalidate();
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

    public final m0 k(o0 o0Var) {
        String l10;
        if (o0Var.a) {
            l10 = "stars";
        } else {
            String str = o0Var.f;
            l10 = str != null ? str : Long.toString(o0Var.g);
        }
        return l(l10);
    }

    public final m0 l(String str) {
        return (m0) this.u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            return !(this.p && this.t.isEmpty()) && rc.e(8200) && rc.e(131072);
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
            m0 m0Var = (m0) arrayList.get(i11);
            m0Var.getClass();
            i6 i6Var = m0Var.F;
            bq bqVar = m0Var.E;
            if (m0Var.R) {
                m0Var.z = org.telegram.messenger.g0.L(42.0f);
                m0Var.A = org.telegram.messenger.g0.L(26.0f);
                if (m0Var.t) {
                    m0Var.z = (int) (i6Var.d + org.telegram.messenger.g0.L(8.0f) + m0Var.z);
                } else if (bqVar != null && m0Var.v > 1) {
                    m0Var.z = k5.C(8.0f, (int) Math.ceil(bqVar.m), m0Var.z);
                }
            } else {
                m0Var.z = org.telegram.messenger.g0.L(m0Var.C != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f);
                if (m0Var.S != null && m0Var.T.size() > 0) {
                    m0Var.T.size();
                    m0Var.z = (int) ((org.telegram.messenger.g0.L(20.0f) * (m0Var.T.size() > 1 ? m0Var.T.size() - 1 : 0) * 0.8f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(1.0f) + m0Var.z);
                    m0Var.S.o = org.telegram.messenger.g0.L(26.0f);
                } else if (m0Var.t) {
                    m0Var.z = (int) (i6Var.d + org.telegram.messenger.g0.L(8.0f) + m0Var.z);
                } else if (((int) Math.ceil(bqVar.m)) > 0) {
                    m0Var.z = k5.C(8.0f, (int) Math.ceil(bqVar.m), m0Var.z);
                } else {
                    m0Var.z -= org.telegram.messenger.g0.L(1.0f);
                }
                m0Var.A = org.telegram.messenger.g0.L(26.0f);
            }
            if (m0Var.z + i12 > i7) {
                arrayList2.add(Integer.valueOf(i12));
                i14 = k5.C(4.0f, m0Var.A, i14);
                i15++;
                i12 = 0;
            }
            m0Var.w = i12;
            m0Var.x = i14;
            m0Var.y = i15;
            i12 = k5.C(4.0f, m0Var.z, i12);
            if (i12 > i13) {
                i13 = i12;
            }
            i11++;
        }
        arrayList2.add(Integer.valueOf(i12));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i16 = ((m0) arrayList.get(0)).x;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                if (((m0) arrayList.get(i18)).x != i16) {
                    int i19 = i18 - 1;
                    int i20 = i7 - (((m0) arrayList.get(i19)).w + ((m0) arrayList.get(i19)).z);
                    while (i17 < i18) {
                        ((m0) arrayList.get(i17)).w += i20;
                        i17++;
                    }
                    i17 = i18;
                }
            }
            int size = arrayList.size() - 1;
            int i21 = i7 - (((m0) arrayList.get(size)).w + ((m0) arrayList.get(size)).z);
            while (i17 <= size) {
                ((m0) arrayList.get(i17)).w += i21;
                i17++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                m0 m0Var2 = (m0) arrayList.get(i22);
                int i23 = m0Var2.y;
                m0Var2.w = (int) com.google.android.recaptcha.internal.a.A(i7, (i23 < 0 || i23 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(m0Var2.y)).intValue(), 2.0f, m0Var2.w);
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
            ((m0) arrayList.get(i7)).b();
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
            hashMap.put(((m0) arrayList.get(i7)).n, (m0) arrayList.get(i7));
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
    public final void r(ij ijVar, boolean z9, f6 f6Var) {
        int i7;
        TLRPC.TL_messageReactions tL_messageReactions;
        ?? r72;
        boolean z10;
        int i10;
        TLRPC.ReactionCount reactionCount;
        m0 m0Var;
        boolean z11;
        int i11;
        boolean z12 = z9;
        this.y = f6Var;
        this.J = z12;
        this.x = ijVar;
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r52 = 0;
        r52 = 0;
        r52 = 0;
        this.H = false;
        this.I = false;
        arrayList.clear();
        if (ijVar != null) {
            long B0 = ij.B0(ijVar.k);
            l0 l0Var = X;
            l0Var.a = B0;
            TLRPC.TL_messageReactions tL_messageReactions2 = ijVar.k.reactions;
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null) {
                int i12 = 0;
                for (int i13 = 0; i13 < ijVar.k.reactions.results.size(); i13++) {
                    i12 += ijVar.k.reactions.results.get(i13).count;
                }
                int i14 = this.l;
                TLRPC.ChatFull N0 = qp.s1(i14).N0(-ij.B0(ijVar.k));
                if (!ijVar.k.reactions.results.isEmpty() && N0 != null && N0.paid_reactions_available) {
                    boolean z13 = false;
                    for (int i15 = 0; i15 < ijVar.k.reactions.results.size(); i15++) {
                        TLRPC.Reaction reaction = ijVar.k.reactions.results.get(i15).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z13 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z13) {
                        z10 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z10) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i10 = -arrayList3.size();
                        while (i10 < ijVar.k.reactions.results.size()) {
                            if (i10 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i10);
                                reactionCount.chosen = r52;
                                reactionCount.count = r52 == true ? 1 : 0;
                            } else {
                                reactionCount = ijVar.k.reactions.results.get(i10);
                            }
                            int i16 = r52 == true ? 1 : 0;
                            while (true) {
                                if (i16 >= arrayList2.size()) {
                                    m0Var = null;
                                    break;
                                }
                                m0Var = (m0) arrayList2.get(i16);
                                if (m0Var.q.equals(reactionCount.reaction)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            n0 n0Var = new n0(this, m0Var, reactionCount, z12);
                            n0Var.Q = ijVar.A2();
                            arrayList.add(n0Var);
                            this.I = (this.I || n0Var.l) ? true : r52 == true ? 1 : 0;
                            if (!z12) {
                                TLRPC.Message message = ijVar.k;
                                if (message.reactions.recent_reactions != null) {
                                    if (ij.B0(message) > 0 && !t10.y(ij.B0(ijVar.k))) {
                                        ArrayList arrayList4 = new ArrayList();
                                        TLRPC.User f10 = p10.i(i14).f();
                                        TLRPC.User a22 = qp.s1(i14).a2(Long.valueOf(ij.B0(ijVar.k)));
                                        if (reactionCount.count == 2) {
                                            if (f10 != null) {
                                                arrayList4.add(f10);
                                            }
                                            if (a22 != null) {
                                                arrayList4.add(a22);
                                            }
                                        } else if (reactionCount.chosen) {
                                            if (f10 != null) {
                                                arrayList4.add(f10);
                                            }
                                        } else if (a22 != null) {
                                            arrayList4.add(a22);
                                        }
                                        n0Var.o(arrayList4);
                                        if (!arrayList4.isEmpty()) {
                                            z11 = false;
                                            n0Var.v = 0;
                                            n0Var.E.c(0, false);
                                            i11 = i14;
                                            if (this.D) {
                                            }
                                            i10++;
                                            r52 = z11;
                                            i14 = i11;
                                            z12 = z9;
                                        }
                                    } else if (reactionCount.count <= 3 && i12 <= 3) {
                                        int i17 = 0;
                                        ArrayList arrayList5 = null;
                                        while (i17 < ijVar.k.reactions.recent_reactions.size()) {
                                            TLRPC.MessagePeerReaction messagePeerReaction = ijVar.k.reactions.recent_reactions.get(i17);
                                            o0 d = o0.d(messagePeerReaction.reaction);
                                            o0 d2 = o0.d(reactionCount.reaction);
                                            int i18 = i17;
                                            int i19 = i14;
                                            TLObject e22 = qp.s1(i14).e2(ij.C1(messagePeerReaction.peer_id));
                                            if (d.equals(d2) && e22 != null) {
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(e22);
                                            }
                                            i17 = i18 + 1;
                                            i14 = i19;
                                        }
                                        i11 = i14;
                                        n0Var.o(arrayList5);
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            z11 = false;
                                            n0Var.v = 0;
                                            n0Var.E.c(0, false);
                                            if (this.D) {
                                                n0Var.a();
                                            }
                                            i10++;
                                            r52 = z11;
                                            i14 = i11;
                                            z12 = z9;
                                        }
                                        z11 = false;
                                        if (this.D) {
                                        }
                                        i10++;
                                        r52 = z11;
                                        i14 = i11;
                                        z12 = z9;
                                    }
                                    i11 = i14;
                                    z11 = false;
                                    if (this.D) {
                                    }
                                    i10++;
                                    r52 = z11;
                                    i14 = i11;
                                    z12 = z9;
                                }
                            }
                            z11 = r52 == true ? 1 : 0;
                            i11 = i14;
                            if (this.D) {
                            }
                            i10++;
                            r52 = z11;
                            i14 = i11;
                            z12 = z9;
                        }
                    }
                }
                z10 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z10) {
                }
                i10 = -arrayList32.size();
                while (i10 < ijVar.k.reactions.results.size()) {
                }
            }
            i7 = r52;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, l0Var);
                for (int i20 = i7; i20 < arrayList.size(); i20++) {
                    TLRPC.ReactionCount reactionCount2 = ((m0) arrayList.get(i20)).a;
                    int i21 = Y;
                    Y = i21 + 1;
                    reactionCount2.lastDrawnPosition = i21;
                }
            }
            TLRPC.Message message2 = ijVar.k;
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
            ((m0) arrayList2.get(i23)).b();
        }
        this.p = arrayList.isEmpty();
    }
}
