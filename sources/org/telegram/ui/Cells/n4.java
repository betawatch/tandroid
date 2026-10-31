package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.cz;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.qz;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 a;
    public l4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.t5 j;
    public t80 k;
    public final nh.h l;
    public int m;
    public final dc n;
    public m4 o;
    public boolean p;
    public qz0 q;
    public qz0 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public n4(q1 q1Var) {
        this.a = q1Var;
        this.l = nh.h.e(q1Var);
        this.j = new org.telegram.ui.Components.t5(q1Var, 0L, 350L, gr.h);
        this.n = new dc(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((m4) obj).f.Q0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        ArrayList arrayList;
        q1 q1Var;
        RectF rectF;
        Path path;
        float f7;
        float f10;
        float f11;
        float f12;
        Path path2;
        float f13;
        boolean o42;
        jj jjVar;
        float f14;
        long[] jArr;
        cz czVar;
        int max;
        Canvas canvas2 = canvas;
        if (this.b == null) {
            return;
        }
        boolean z10 = this.i;
        org.telegram.ui.Components.t5 t5Var = this.j;
        float d = t5Var.d(z10);
        float d10 = t5Var.d(this.i);
        q1 q1Var2 = this.a;
        jj messageObject = q1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MIN_VALUE;
        float f17 = Float.MIN_VALUE;
        int i10 = 0;
        float f18 = Float.MAX_VALUE;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            m4 m4Var = (m4) arrayList.get(i10);
            ImageReceiver imageReceiver = m4Var.f;
            RadialProgress2 radialProgress2 = m4Var.G;
            int i11 = this.d;
            int i12 = m4Var.a;
            float f19 = d;
            int i13 = this.e;
            int i14 = m4Var.b;
            float f20 = d10;
            q1 q1Var3 = q1Var2;
            imageReceiver.y0(i11 + i12, i13 + i14, m4Var.c - i12, m4Var.d - i14);
            imageReceiver.h(canvas2, null);
            if (imageReceiver.m() != null) {
                imageReceiver.m().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!m4Var.y && m4Var.K != (max = Math.max(0, m4Var.J - round))) {
                    m4Var.K = max;
                    m4Var.L = new qz0(org.telegram.messenger.i0.g0(max, true, false), 12.0f, null);
                    if (f20 > 0.0f) {
                        float min = Math.min(this.d + m4Var.a, f18);
                        float min2 = Math.min(this.e + m4Var.b, f15);
                        f17 = Math.max(this.d + m4Var.c, f17);
                        f16 = Math.max(this.e + m4Var.d, f16);
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        float f21 = m4Var.a + this.d;
                        int i15 = this.e;
                        rectF2.set(f21, m4Var.b + i15, r10 + m4Var.c, i15 + m4Var.d);
                        path3.addRoundRect(rectF2, m4Var.s, Path.Direction.CW);
                        f15 = min2;
                        f18 = min;
                    }
                    radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
                    RectF rectF3 = radialProgress2.a;
                    float f22 = imageReceiver.K0;
                    float f23 = imageReceiver.M0 / 2.0f;
                    float f24 = radialProgress2.x;
                    float f25 = f15;
                    float f26 = f18;
                    float f27 = imageReceiver.L0;
                    float f28 = imageReceiver.N0 / 2.0f;
                    rectF3.set((f23 - f24) + f22, (f28 - f24) + f27, f23 + f24 + f22, f28 + f24 + f27);
                    o42 = messageObject.o4();
                    int i16 = messageObject.I1;
                    if (o42) {
                        jjVar = messageObject;
                        f14 = f16;
                        if (org.telegram.messenger.b8.G(i16).T(m4Var.w)) {
                            m4Var.b(3);
                        } else {
                            m4Var.b(m4Var.a());
                        }
                    } else {
                        qz C = qz.C(i16);
                        long[] x10 = hc.D().x(m4Var.F);
                        int f110 = messageObject.f1();
                        HashMap hashMap = C.a;
                        if (hashMap != null) {
                            Iterator it = hashMap.values().iterator();
                            cz czVar2 = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    jjVar = messageObject;
                                    jArr = x10;
                                    f14 = f16;
                                    break;
                                }
                                ArrayList arrayList2 = (ArrayList) it.next();
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    jjVar = messageObject;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= size) {
                                            jArr = x10;
                                            f14 = f16;
                                            break;
                                        }
                                        Object obj = arrayList2.get(i17);
                                        int i18 = i17 + 1;
                                        cz czVar3 = (cz) obj;
                                        jArr = x10;
                                        ArrayList arrayList3 = czVar3.z;
                                        if (arrayList3 == null) {
                                            x10 = jArr;
                                            i17 = i18;
                                        } else {
                                            int size2 = arrayList3.size();
                                            f14 = f16;
                                            int i19 = 0;
                                            while (true) {
                                                if (i19 >= size2) {
                                                    break;
                                                }
                                                Object obj2 = arrayList3.get(i19);
                                                i19++;
                                                int i20 = size2;
                                                TLRPC.Message message = (TLRPC.Message) obj2;
                                                if (message != null && message.id == f110) {
                                                    czVar2 = czVar3;
                                                    break;
                                                }
                                                size2 = i20;
                                            }
                                            if (czVar2 != null) {
                                                break;
                                            }
                                            x10 = jArr;
                                            i17 = i18;
                                            f16 = f14;
                                        }
                                    }
                                    if (czVar2 != null) {
                                        break;
                                    }
                                    x10 = jArr;
                                    messageObject = jjVar;
                                    f16 = f14;
                                }
                            }
                            czVar = czVar2;
                        } else {
                            jjVar = messageObject;
                            jArr = x10;
                            f14 = f16;
                            czVar = null;
                        }
                        if (czVar != null && i10 >= 0 && i10 < czVar.z.size()) {
                            f110 = ((TLRPC.Message) czVar.z.get(i10)).id;
                        }
                        boolean z11 = C.c.indexOfKey(f110) >= 0 || C.d.indexOfKey(f110) >= 0;
                        if (jArr == null && z11) {
                            radialProgress2.p(true, 1.0f);
                            m4Var.b(m4Var.x ? 6 : m4Var.a());
                        }
                    }
                    canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f20) * 255.0f), 31);
                    radialProgress2.draw(canvas2);
                    canvas2.restore();
                    i10++;
                    f18 = f26;
                    d = f19;
                    q1Var2 = q1Var3;
                    d10 = f20;
                    f15 = f25;
                    messageObject = jjVar;
                    f16 = f14;
                }
            }
            if (f20 > 0.0f) {
            }
            radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
            RectF rectF32 = radialProgress2.a;
            float f222 = imageReceiver.K0;
            float f232 = imageReceiver.M0 / 2.0f;
            float f242 = radialProgress2.x;
            float f252 = f15;
            float f262 = f18;
            float f272 = imageReceiver.L0;
            float f282 = imageReceiver.N0 / 2.0f;
            rectF32.set((f232 - f242) + f222, (f282 - f242) + f272, f232 + f242 + f222, f282 + f242 + f272);
            o42 = messageObject.o4();
            int i162 = messageObject.I1;
            if (o42) {
            }
            canvas2.saveLayerAlpha(rectF32, (int) ((1.0f - f20) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i10++;
            f18 = f262;
            d = f19;
            q1Var2 = q1Var3;
            d10 = f20;
            f15 = f252;
            messageObject = jjVar;
            f16 = f14;
        }
        float f29 = d;
        float f30 = d10;
        q1 q1Var4 = q1Var2;
        if (f30 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f18, f15);
            int i21 = (int) (f17 - f18);
            int i22 = (int) (f16 - f15);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i21, i22, (int) (f30 * 255.0f), 31);
            this.l.c(canvas, q1Var4, i21, i22, 1.0f, q1Var4.Ec);
            canvas2 = canvas;
            q1Var = q1Var4;
            canvas2.restore();
            canvas2.restore();
            q1Var.invalidate();
        } else {
            q1Var = q1Var4;
        }
        int i23 = 0;
        while (true) {
            int size3 = arrayList.size();
            rectF = this.v;
            path = this.t;
            if (i23 >= size3) {
                break;
            }
            m4 m4Var2 = (m4) arrayList.get(i23);
            if (m4Var2.L != null) {
                float L = org.telegram.messenger.i0.L(11.4f) + m4Var2.L.c;
                float L2 = org.telegram.messenger.i0.L(17.0f);
                float L3 = org.telegram.messenger.i0.L(5.0f);
                float f31 = this.d + m4Var2.a + L3;
                float f32 = this.e + m4Var2.b + L3;
                rectF.set(f31, f32, L + f31, f32 + L2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (org.telegram.messenger.i0.L(11.32f) + this.r.c)) - L3 || rectF.top > this.e + L3) {
                    path.rewind();
                    float f33 = L2 / 2.0f;
                    path.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f13 = f30;
                    c(canvas2, f13);
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(1.0f, TLObject.FLAG_30));
                    m4Var2.L.c(this.d + m4Var2.a + L3 + org.telegram.messenger.i0.L(5.66f), this.e + m4Var2.b + L3 + f33, 1.0f, -1, canvas2);
                    canvas2.restore();
                    i23++;
                    f30 = f13;
                }
            }
            f13 = f30;
            i23++;
            f30 = f13;
        }
        if (this.q == null || f29 <= 0.0f) {
            f7 = 11.32f;
            f10 = 5.0f;
            f11 = 17.0f;
            f12 = f29;
            path2 = path;
        } else {
            float a2 = this.n.a(0.05f);
            float L4 = org.telegram.messenger.i0.L(28.0f) + this.q.c;
            float L5 = org.telegram.messenger.i0.L(32.0f);
            float f34 = this.d;
            float f35 = this.g;
            float B = c3.i0.B(f35, L4, 2.0f, f34);
            f7 = 11.32f;
            float f36 = this.e;
            f10 = 5.0f;
            float f37 = this.h;
            f11 = 17.0f;
            rectF.set(B, c3.i0.B(f37, L5, 2.0f, f36), org.telegram.messenger.m5.a(f35, L4, 2.0f, f34), org.telegram.messenger.m5.a(f37, L5, 2.0f, f36));
            path.rewind();
            float f38 = L5 / 2.0f;
            path.addRoundRect(rectF, f38, f38, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f12 = f29;
            c(canvas2, f12);
            canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(f12, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (L4 / 2.0f)) + org.telegram.messenger.i0.L(14.0f), this.e + (this.h / 2.0f), f12, -1, canvas2);
            canvas2.restore();
            if (q1Var.getDelegate() == null || !q1Var.getDelegate().k1(q1Var, 5)) {
                t80 t80Var = this.k;
                if (t80Var != null && !t80Var.d() && !this.k.c()) {
                    this.k.a();
                }
            } else {
                t80 t80Var2 = this.k;
                if (t80Var2 == null) {
                    t80 t80Var3 = new t80();
                    this.k = t80Var3;
                    t80Var3.setCallback(q1Var);
                    this.k.g(org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.35f, -1), org.telegram.ui.ActionBar.t6.r1(0.8f, -1));
                    t80 t80Var4 = this.k;
                    t80Var4.D = true;
                    t80Var4.x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
                } else if (t80Var2.c() || this.k.d()) {
                    t80 t80Var5 = this.k;
                    t80Var5.b = -1L;
                    t80Var5.c = -1L;
                }
            }
            t80 t80Var6 = this.k;
            if (t80Var6 != null) {
                t80Var6.e(rectF);
                this.k.k(f38);
                this.k.setAlpha((int) (f12 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f12 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = q1Var.getTimeAlpha() * (1.0f - f12);
        float L6 = org.telegram.messenger.i0.L(f7) + this.r.c;
        float L7 = org.telegram.messenger.i0.L(f11);
        float L8 = org.telegram.messenger.i0.L(f10);
        float f39 = this.d + this.g;
        float f40 = this.e + L8;
        rectF.set((f39 - L6) - L8, f40, f39 - L8, f40 + L7);
        path2.rewind();
        float f41 = L7 / 2.0f;
        path2.addRoundRect(rectF, f41, f41, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path2);
        canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - L6) - L8) + org.telegram.messenger.i0.L(5.66f), this.e + L8 + f41, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f7) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        q1 q1Var = this.a;
        int f12 = q1Var.getMessageObject() != null ? q1Var.getMessageObject().f1() : 0;
        int i10 = this.g;
        int i11 = this.h;
        int max = (int) Math.max(1.0f, i10 > i11 ? 100.0f : (i10 / i11) * 100.0f);
        int i12 = this.h;
        int i13 = this.g;
        int max2 = (int) Math.max(1.0f, i12 <= i13 ? 100.0f * (i12 / i13) : 100.0f);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.c;
            if (i14 >= arrayList.size()) {
                break;
            }
            m4 m4Var = (m4) arrayList.get(i14);
            if (m4Var.f.K() && m4Var.f.n() != null) {
                i15 |= 1 << i14;
            }
            i14++;
        }
        Bitmap bitmap = this.w;
        if (bitmap == null || this.z != f12 || this.y != i15 || this.A != max || this.B != max2) {
            this.y = i15;
            this.z = f12;
            this.A = max;
            this.B = max2;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.w);
            float f10 = max / this.g;
            canvas2.scale(f10, f10);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                m4 m4Var2 = (m4) arrayList.get(i16);
                m4Var2.f.y0(m4Var2.a, m4Var2.b, m4Var2.c - r4, m4Var2.d - r7);
                m4Var2.f.h(canvas2, null);
            }
            Utilities.stackBlurBitmap(this.w, 12);
            if (this.x == null) {
                this.x = new Paint(3);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.5f);
                this.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
        if (this.w != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            canvas.scale(this.g / this.w.getWidth(), this.g / this.w.getWidth());
            this.x.setAlpha((int) (f7 * 255.0f));
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
            canvas.restore();
        }
    }

    public final m4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((m4) arrayList.get(i10)).f.O(f7, f10)) {
                return (m4) arrayList.get(i10);
            }
            i10++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        nh.h hVar = this.l;
        if (hVar != null) {
            hVar.a(this.a);
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return;
            }
            m4 m4Var = (m4) arrayList.get(i10);
            if (m4Var.M) {
                m4Var.M = false;
                m4Var.f.R();
            }
            i10++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        m4 m4Var;
        q1 q1Var;
        boolean z11;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            m4 d = d(x10, y3);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x10, y3)) {
                    z11 = true;
                    this.p = z11;
                }
            }
            z11 = false;
            this.p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y3)) {
                    z10 = true;
                    m4Var = this.o;
                    if (m4Var != null && m4Var == d10) {
                        q1Var = this.a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            jj messageObject = q1Var.getMessageObject();
                            if (this.p || !z10 || d10.G.i.q != 3 || messageObject == null) {
                                l1 delegate = q1Var.getDelegate();
                                m4 m4Var2 = this.o;
                                ImageReceiver imageReceiver = m4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = m4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.C1(q1Var, messageExtendedMedia);
                            } else if (messageObject.o4()) {
                                qz.C(messageObject.I1).g(messageObject);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z10 = false;
            m4Var = this.o;
            if (m4Var != null) {
                q1Var = this.a;
                if (q1Var.getDelegate() != null) {
                    jj messageObject2 = q1Var.getMessageObject();
                    if (this.p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    m4 m4Var22 = this.o;
                    ImageReceiver imageReceiver2 = m4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = m4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.C1(q1Var, messageExtendedMedia2);
                }
            }
            this.p = false;
            this.o = null;
        }
        this.n.c(this.o != null);
        return this.o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:398:0x0777, code lost:
    
        if (r3[2] > r3[3]) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x078a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(jj jjVar) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i10;
        float[] fArr;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        int i13;
        TLRPC.Document document;
        TLRPC.PhotoSize w9;
        jj jjVar2;
        ArrayList arrayList;
        bj bjVar;
        n4 n4Var = this;
        if (jjVar == null || (message = jjVar.k) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (n4Var.b == null) {
                l4 l4Var = new l4();
                l4Var.a = new ArrayList();
                l4Var.b = new ArrayList();
                l4Var.c = new HashMap();
                l4Var.h = 800;
                l4Var.i = 814.0f;
                n4Var.b = l4Var;
            }
            n4Var.b.a.clear();
            n4Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            l4 l4Var2 = n4Var.b;
            float f14 = l4Var2.i;
            ArrayList arrayList2 = l4Var2.b;
            arrayList2.clear();
            HashMap hashMap = l4Var2.c;
            hashMap.clear();
            boolean z10 = false;
            l4Var2.e = 0;
            ArrayList arrayList3 = l4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                l4Var2.d = 0;
                l4Var2.g = 0.0f;
                l4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                i10 = 10;
            } else {
                l4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i14 = 0;
                boolean z11 = false;
                float f15 = 1.0f;
                while (i14 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i14);
                    bj bjVar2 = new bj();
                    bjVar2.h = i14 == size + (-1) ? true : z10;
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                        bjVar2.n = tL_messageExtendedMediaPreview.w;
                        bjVar2.o = tL_messageExtendedMediaPreview.h;
                        i13 = i14;
                    } else {
                        boolean z12 = z10;
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia2).photo;
                                if (photo == null) {
                                    i13 = i14;
                                    w9 = null;
                                    bjVar2.n = w9 != null ? 100 : w9.w;
                                    bjVar2.o = w9 != null ? 100 : w9.h;
                                } else {
                                    i13 = i14;
                                    w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(z12), z12, null, z12);
                                    bjVar2.n = w9 != null ? 100 : w9.w;
                                    bjVar2.o = w9 != null ? 100 : w9.h;
                                }
                            } else {
                                i13 = i14;
                                if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) != null) {
                                    w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.Z0(z12), z12, null, z12);
                                    bjVar2.n = w9 != null ? 100 : w9.w;
                                    bjVar2.o = w9 != null ? 100 : w9.h;
                                }
                                w9 = null;
                                bjVar2.n = w9 != null ? 100 : w9.w;
                                bjVar2.o = w9 != null ? 100 : w9.h;
                            }
                        } else {
                            i13 = i14;
                            bjVar2.n = 100;
                            bjVar2.o = 100;
                        }
                    }
                    if (bjVar2.n <= 0 || bjVar2.o <= 0) {
                        bjVar2.n = 50;
                        bjVar2.o = 50;
                    }
                    float f16 = bjVar2.n / bjVar2.o;
                    bjVar2.g = f16;
                    if (f16 > 1.2f) {
                        sb2.append("w");
                    } else if (f16 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    float f17 = bjVar2.g;
                    f15 += f17;
                    if (f17 > 2.0f) {
                        z11 = true;
                    }
                    hashMap.put(messageExtendedMedia, bjVar2);
                    arrayList2.add(bjVar2);
                    i14 = i13 + 1;
                    z10 = false;
                }
                float f18 = 1.0f;
                int L = org.telegram.messenger.i0.L(120.0f);
                float L2 = org.telegram.messenger.i0.L(120.0f);
                Point point = org.telegram.messenger.i0.q;
                int min = (int) (L2 / (Math.min(point.x, point.y) / l4Var2.h));
                float L3 = org.telegram.messenger.i0.L(40.0f);
                float min2 = Math.min(point.x, point.y);
                float f19 = l4Var2.h;
                int i15 = (int) (L3 / (min2 / f19));
                float f20 = f19 / f14;
                float f21 = f15 / size;
                float L4 = org.telegram.messenger.i0.L(100.0f) / f14;
                if (size == 1) {
                    bj bjVar3 = (bj) arrayList2.get(0);
                    float f22 = bjVar3.g;
                    if (f22 >= 1.0f) {
                        f12 = l4Var2.h;
                        f13 = ((f12 / f22) / f12) * f14;
                    } else {
                        f12 = l4Var2.h * ((f22 * f14) / f14);
                        f13 = f14;
                    }
                    bjVar3.a(f13 / f14, 0, 0, 0, 0, (int) f12, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z11) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                bj bjVar4 = (bj) arrayList2.get(0);
                                bj bjVar5 = (bj) arrayList2.get(1);
                                String sb3 = sb2.toString();
                                if (sb3.equals("ww") && f21 > f20 * 1.4d) {
                                    float f23 = bjVar4.g;
                                    float f24 = bjVar5.g;
                                    if (f23 - f24 < 0.2d) {
                                        float f25 = l4Var2.h;
                                        float round = Math.round(Math.min(f25 / f23, Math.min(f25 / f24, f14 / 2.0f))) / f14;
                                        bjVar4.a(round, 0, 0, 0, 0, l4Var2.h, 7);
                                        bjVar5.a(round, 0, 0, 1, 1, l4Var2.h, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i16 = l4Var2.h / 2;
                                    float f26 = i16;
                                    float round2 = Math.round(Math.min(f26 / bjVar4.g, Math.min(f26 / bjVar5.g, f14))) / f14;
                                    bjVar4.a(round2, 0, 0, 0, 0, i16, 13);
                                    bjVar5.a(round2, 1, 1, 0, 0, i16, 14);
                                    l4Var2.e = 1;
                                } else {
                                    float f27 = l4Var2.h;
                                    float f28 = bjVar4.g;
                                    int max = (int) Math.max(f27 * 0.4f, Math.round((f27 / f28) / ((1.0f / bjVar5.g) + (1.0f / f28))));
                                    int i17 = l4Var2.h - max;
                                    if (i17 < min) {
                                        max -= min - i17;
                                    } else {
                                        min = i17;
                                    }
                                    float min3 = Math.min(f14, Math.round(Math.min(min / bjVar4.g, max / bjVar5.g))) / f14;
                                    bjVar4.a(min3, 0, 0, 0, 0, min, 13);
                                    bjVar5.a(min3, 1, 1, 0, 0, max, 14);
                                    l4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                bj bjVar6 = (bj) arrayList2.get(0);
                                bj bjVar7 = (bj) arrayList2.get(1);
                                bj bjVar8 = (bj) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f29 = bjVar7.g;
                                    float min4 = Math.min(f14 * 0.5f, Math.round((l4Var2.h * f29) / (bjVar8.g + f29)));
                                    float f30 = f14 - min4;
                                    int max2 = (int) Math.max(min, Math.min(l4Var2.h * 0.5f, Math.round(Math.min(bjVar8.g * min4, bjVar7.g * f30))));
                                    int round3 = Math.round(Math.min((bjVar6.g * f14) + i15, l4Var2.h - max2));
                                    bjVar6.a(1.0f, 0, 0, 0, 1, round3, 13);
                                    float f31 = f30 / f14;
                                    bjVar7.a(f31, 1, 1, 0, 0, max2, 6);
                                    float f32 = min4 / f14;
                                    bjVar8.a(f32, 1, 1, 1, 1, max2, 10);
                                    int i18 = l4Var2.h;
                                    bjVar8.i = i18;
                                    bjVar6.m = new float[]{f32, f31};
                                    bjVar7.i = i18 - round3;
                                    bjVar8.j = round3;
                                    l4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(l4Var2.h / bjVar6.g, 0.66f * f14)) / f14;
                                    bjVar6.a(round4, 0, 1, 0, 0, l4Var2.h, 7);
                                    int i19 = l4Var2.h / 2;
                                    float f33 = i19;
                                    float min5 = Math.min(f14 - round4, Math.round(Math.min(f33 / bjVar7.g, f33 / bjVar8.g))) / f14;
                                    float f34 = min5 < L4 ? L4 : min5;
                                    bjVar7.a(f34, 0, 0, 1, 1, i19, 9);
                                    bjVar8.a(f34, 1, 1, 1, 1, i19, 10);
                                    l4Var2.e = 1;
                                }
                            } else {
                                bj bjVar9 = (bj) arrayList2.get(0);
                                bj bjVar10 = (bj) arrayList2.get(1);
                                bj bjVar11 = (bj) arrayList2.get(2);
                                bj bjVar12 = (bj) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(l4Var2.h / bjVar9.g, f14 * 0.66f)) / f14;
                                    bjVar9.a(round5, 0, 2, 0, 0, l4Var2.h, 7);
                                    float round6 = Math.round(l4Var2.h / ((bjVar10.g + bjVar11.g) + bjVar12.g));
                                    float f35 = min;
                                    int max3 = (int) Math.max(f35, Math.min(l4Var2.h * 0.4f, bjVar10.g * round6));
                                    int max4 = (int) Math.max(Math.max(f35, l4Var2.h * 0.33f), bjVar12.g * round6);
                                    int i20 = (l4Var2.h - max3) - max4;
                                    if (i20 < org.telegram.messenger.i0.L(58.0f)) {
                                        int L5 = org.telegram.messenger.i0.L(58.0f) - i20;
                                        i20 = org.telegram.messenger.i0.L(58.0f);
                                        int i21 = L5 / 2;
                                        max3 -= i21;
                                        max4 -= L5 - i21;
                                    }
                                    int i22 = max3;
                                    float min6 = Math.min(f14 - round5, round6) / f14;
                                    float f36 = min6 < L4 ? L4 : min6;
                                    bjVar10.a(f36, 0, 0, 1, 1, i22, 9);
                                    bjVar11.a(f36, 1, 1, 1, 1, i20, 8);
                                    bjVar12.a(f36, 2, 2, 1, 1, max4, 10);
                                    l4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f14 / ((1.0f / bjVar12.g) + ((1.0f / bjVar11.g) + (1.0f / bjVar10.g)))));
                                    float f37 = L;
                                    float f38 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f37, f38 / bjVar10.g) / f14);
                                    float min8 = Math.min(0.33f, Math.max(f37, f38 / bjVar11.g) / f14);
                                    float f39 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((bjVar9.g * f14) + i15, l4Var2.h - max5));
                                    bjVar9.a(min7 + min8 + f39, 0, 0, 0, 2, round7, 13);
                                    bjVar10.a(min7, 1, 1, 0, 0, max5, 6);
                                    bjVar11.a(min8, 1, 1, 1, 1, max5, 2);
                                    bjVar11.i = l4Var2.h;
                                    bjVar12.a(f39, 1, 1, 2, 2, max5, 10);
                                    int i23 = l4Var2.h;
                                    bjVar12.i = i23;
                                    bjVar10.i = i23 - round7;
                                    bjVar11.j = round7;
                                    bjVar12.j = round7;
                                    bjVar9.m = new float[]{min7, min8, f39};
                                    l4Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    int i24 = 0;
                    while (i24 < size) {
                        if (f21 > 1.1f) {
                            f11 = f18;
                            fArr2[i24] = Math.max(f11, ((bj) arrayList2.get(i24)).g);
                        } else {
                            f11 = f18;
                            fArr2[i24] = Math.min(f11, ((bj) arrayList2.get(i24)).g);
                        }
                        fArr2[i24] = Math.max(0.66667f, Math.min(1.7f, fArr2[i24]));
                        i24++;
                        f18 = f11;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i25 = 1; i25 < size2; i25++) {
                        int i26 = size2 - i25;
                        if (i25 <= 3 && i26 <= 3) {
                            float a2 = l4Var2.a(0, i25, fArr2);
                            float a10 = l4Var2.a(i25, size2, fArr2);
                            k4 k4Var = new k4();
                            k4Var.a = new int[]{i25, i26};
                            k4Var.b = new float[]{a2, a10};
                            arrayList4.add(k4Var);
                        }
                    }
                    int i27 = 1;
                    while (i27 < size2 - 1) {
                        int i28 = 1;
                        while (true) {
                            int i29 = size2 - i27;
                            if (i28 < i29) {
                                int i30 = i29 - i28;
                                if (i27 <= 3) {
                                    if (i28 <= (f21 < 0.85f ? 4 : 3) && i30 <= 3) {
                                        float a11 = l4Var2.a(0, i27, fArr2);
                                        int i31 = i27 + i28;
                                        float a12 = l4Var2.a(i27, i31, fArr2);
                                        float a13 = l4Var2.a(i31, size2, fArr2);
                                        k4 k4Var2 = new k4();
                                        k4Var2.a = new int[]{i27, i28, i30};
                                        i12 = i27;
                                        k4Var2.b = new float[]{a11, a12, a13};
                                        arrayList4.add(k4Var2);
                                        i28++;
                                        i27 = i12;
                                    }
                                }
                                i12 = i27;
                                i28++;
                                i27 = i12;
                            }
                        }
                        i27++;
                    }
                    for (int i32 = 1; i32 < size2 - 2; i32++) {
                        int i33 = 1;
                        while (true) {
                            int i34 = size2 - i32;
                            if (i33 < i34) {
                                int i35 = 1;
                                while (true) {
                                    int i36 = i34 - i33;
                                    if (i35 < i36) {
                                        int i37 = i36 - i35;
                                        if (i32 > 3 || i33 > 3 || i35 > 3 || i37 > 3) {
                                            i11 = i34;
                                        } else {
                                            i11 = i34;
                                            float a14 = l4Var2.a(0, i32, fArr2);
                                            int i38 = i32 + i33;
                                            float a15 = l4Var2.a(i32, i38, fArr2);
                                            int i39 = i38 + i35;
                                            float a16 = l4Var2.a(i38, i39, fArr2);
                                            float a17 = l4Var2.a(i39, size2, fArr2);
                                            k4 k4Var3 = new k4();
                                            k4Var3.a = new int[]{i32, i33, i35, i37};
                                            k4Var3.b = new float[]{a14, a15, a16, a17};
                                            arrayList4.add(k4Var3);
                                        }
                                        i35++;
                                        i34 = i11;
                                    }
                                }
                                i33++;
                            }
                        }
                    }
                    float f40 = (l4Var2.h / 3) * 4;
                    k4 k4Var4 = null;
                    float f41 = 0.0f;
                    int i40 = 0;
                    while (i40 < arrayList4.size()) {
                        k4 k4Var5 = (k4) arrayList4.get(i40);
                        float f42 = Float.MAX_VALUE;
                        float f43 = f40;
                        float f44 = 0.0f;
                        int i41 = 0;
                        while (true) {
                            float[] fArr3 = k4Var5.b;
                            fArr = fArr2;
                            if (i41 >= fArr3.length) {
                                break;
                            }
                            float f45 = fArr3[i41];
                            f44 += f45;
                            if (f45 < f42) {
                                f42 = f45;
                            }
                            i41++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f44 - f43);
                        int[] iArr = k4Var5.a;
                        if (iArr.length > 1) {
                            int i42 = iArr[0];
                            int i43 = iArr[1];
                            if (i42 <= i43) {
                                f7 = abs;
                                if (iArr.length <= 2 || i43 <= iArr[2]) {
                                    if (iArr.length > 3) {
                                    }
                                }
                            } else {
                                f7 = abs;
                            }
                            f10 = f7 * 1.2f;
                            if (f42 < min) {
                                f10 *= 1.5f;
                            }
                            if (k4Var4 != null || f10 < f41) {
                                f41 = f10;
                                k4Var4 = k4Var5;
                            }
                            i40++;
                            f40 = f43;
                            fArr2 = fArr;
                        } else {
                            f7 = abs;
                        }
                        f10 = f7;
                        if (f42 < min) {
                        }
                        if (k4Var4 != null) {
                        }
                        f41 = f10;
                        k4Var4 = k4Var5;
                        i40++;
                        f40 = f43;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (k4Var4 == null) {
                        i10 = 10;
                        n4Var = this;
                    } else {
                        int[] iArr2 = k4Var4.a;
                        int i44 = 0;
                        int i45 = 0;
                        while (i44 < iArr2.length) {
                            int i46 = iArr2[i44];
                            float f46 = k4Var4.b[i44];
                            int i47 = l4Var2.h;
                            int i48 = i46 - 1;
                            l4Var2.e = Math.max(l4Var2.e, i48);
                            bj bjVar13 = null;
                            int i49 = 0;
                            while (i49 < i46) {
                                int i50 = (int) (fArr4[i45] * f46);
                                i47 -= i50;
                                bj bjVar14 = (bj) arrayList2.get(i45);
                                int i51 = i44 == 0 ? 4 : 0;
                                k4 k4Var6 = k4Var4;
                                if (i44 == iArr2.length - 1) {
                                    i51 |= 8;
                                }
                                if (i49 == 0) {
                                    i51 |= 1;
                                }
                                if (i49 == i48) {
                                    i51 |= 2;
                                    bjVar13 = bjVar14;
                                }
                                int i52 = i49;
                                bjVar14.a(Math.max(L4, f46 / f14), i52, i49, i44, i44, i50, i51);
                                i45++;
                                i49 = i52 + 1;
                                k4Var4 = k4Var6;
                            }
                            bjVar13.e += i47;
                            bjVar13.i += i47;
                            i44++;
                            k4Var4 = k4Var4;
                        }
                    }
                }
                for (int i53 = 0; i53 < size; i53++) {
                    bj bjVar15 = (bj) arrayList2.get(i53);
                    if (bjVar15.b == l4Var2.e || (bjVar15.l & 2) != 0) {
                        bjVar15.i += zs.e3;
                    }
                    if ((bjVar15.l & 1) != 0) {
                        bjVar15.k = true;
                    }
                    if (bjVar15.k) {
                        int i54 = bjVar15.i;
                        if (i54 != 1000) {
                            bjVar15.i = i54 + zs.t1;
                        }
                        bjVar15.e += zs.t1;
                    } else if ((bjVar15.l & 2) != 0) {
                        int i55 = bjVar15.i;
                        if (i55 != 1000) {
                            bjVar15.i = i55 - 108;
                        } else {
                            int i56 = bjVar15.j;
                            if (i56 != 0) {
                                bjVar15.j = i56 + zs.t1;
                            }
                        }
                    }
                }
                int i57 = 0;
                while (i57 < size) {
                    bj bjVar16 = (bj) arrayList2.get(i57);
                    if (bjVar16.a == 0) {
                        bjVar16.i += zs.e3;
                    }
                    if ((bjVar16.l & 2) != 0) {
                        bjVar16.k = true;
                    }
                    l4Var2.e = Math.max(l4Var2.e, (int) bjVar16.b);
                    l4Var2.f = Math.max(l4Var2.f, (int) bjVar16.d);
                    byte b10 = bjVar16.c;
                    byte b11 = bjVar16.d;
                    byte b12 = bjVar16.a;
                    int i58 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i58];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i59 = 0;
                    while (i59 < size3) {
                        bj bjVar17 = (bj) arrayList2.get(i59);
                        if (bjVar17 != bjVar16 && bjVar17.b < b12) {
                            int min9 = Math.min((int) bjVar17.d, (int) b11) - b10;
                            int max6 = Math.max(bjVar17.c - b10, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + bjVar17.e;
                                max6++;
                                i57 = i57;
                            }
                        }
                        i59++;
                        i57 = i57;
                    }
                    int i60 = i57;
                    float f47 = 0.0f;
                    for (int i61 = 0; i61 < i58; i61++) {
                        float f48 = fArr5[i61];
                        if (f47 < f48) {
                            f47 = f48;
                        }
                    }
                    bjVar16.q = f47;
                    i57 = i60 + 1;
                }
                for (int i62 = 0; i62 < size; i62++) {
                    bj bjVar18 = (bj) arrayList2.get(i62);
                    byte b13 = bjVar18.c;
                    int i63 = l4Var2.e + 1;
                    float[] fArr6 = new float[i63];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i64 = 0; i64 < size4; i64++) {
                        bj bjVar19 = (bj) arrayList2.get(i64);
                        if (bjVar19 != bjVar18 && bjVar19.d < b13) {
                            for (int i65 = bjVar19.a; i65 <= bjVar19.b; i65++) {
                                fArr6[i65] = fArr6[i65] + bjVar19.f;
                            }
                        }
                    }
                    float f49 = 0.0f;
                    for (int i66 = 0; i66 < i63; i66++) {
                        float f50 = fArr6[i66];
                        if (f49 < f50) {
                            f49 = f50;
                        }
                    }
                    bjVar18.p = f49;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i67 = 0; i67 < size5; i67++) {
                    bj bjVar20 = (bj) arrayList2.get(i67);
                    int i68 = bjVar20.e;
                    for (int i69 = bjVar20.c; i69 <= bjVar20.d; i69++) {
                        iArr3[i69] = iArr3[i69] + i68;
                    }
                }
                int i70 = iArr3[0];
                for (int i71 = 1; i71 < 10; i71++) {
                    int i72 = iArr3[i71];
                    if (i70 < i72) {
                        i70 = i72;
                    }
                }
                l4Var2.d = i70;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i73 = 0; i73 < size6; i73++) {
                    bj bjVar21 = (bj) arrayList2.get(i73);
                    float f51 = bjVar21.f;
                    for (int i74 = bjVar21.a; i74 <= bjVar21.b; i74++) {
                        fArr7[i74] = fArr7[i74] + f51;
                    }
                }
                float f52 = fArr7[0];
                i10 = 10;
                for (int i75 = 1; i75 < 10; i75++) {
                    float f53 = fArr7[i75];
                    if (f52 < f53) {
                        f52 = f53;
                    }
                }
                l4Var2.g = f52;
                n4Var = this;
            }
            int i76 = n4Var.m;
            q1 q1Var = n4Var.a;
            if (i76 > 0) {
                n4Var.f = i76;
                jjVar2 = jjVar;
            } else {
                if (org.telegram.messenger.i0.Q1()) {
                    n4Var.f = org.telegram.messenger.i0.Q0() - org.telegram.messenger.i0.L(122.0f);
                    jjVar2 = jjVar;
                } else {
                    jjVar2 = jjVar;
                    n4Var.f = Math.min(q1Var.getParentWidth(), org.telegram.messenger.i0.q.y) - org.telegram.messenger.i0.L((q1Var.V(jjVar2) ? i10 : 0) + 64);
                }
                if (q1Var.V2()) {
                    n4Var.f -= org.telegram.messenger.i0.L(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i77 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = n4Var.c;
                if (i77 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i77);
                m4 m4Var = i77 >= arrayList.size() ? null : (m4) arrayList.get(i77);
                if (m4Var == null) {
                    l4 l4Var3 = n4Var.b;
                    if (messageExtendedMedia2 == null) {
                        l4Var3.getClass();
                        bjVar = null;
                    } else {
                        bjVar = (bj) l4Var3.c.get(messageExtendedMedia2);
                    }
                    m4 m4Var2 = new m4(n4Var.a, jjVar2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((bjVar.e / 1000.0f) * n4Var.f), (int) (bjVar.f * n4Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        m4Var2.F = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = jjVar2.k;
                        m4Var2.F = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(m4Var2.F)) {
                        org.telegram.messenger.b6.q(q1Var.Y5).a(m4Var2.F, jjVar2, m4Var2);
                        if (jjVar2.o4()) {
                            m4Var2.G.p(false, messageExtendedMedia2.uploadProgress);
                        }
                    }
                    if (q1Var.N0 && !m4Var2.M) {
                        m4Var2.M = true;
                        m4Var2.f.P();
                    }
                    arrayList.add(m4Var2);
                } else {
                    m4Var.c(messageExtendedMedia2, jjVar2);
                }
                i77++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                m4 m4Var3 = size8 >= arrayList.size() ? null : (m4) arrayList.get(size8);
                if (m4Var3 != null) {
                    if (m4Var3.M) {
                        m4Var3.M = false;
                        m4Var3.f.R();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(jjVar);
            l4 l4Var4 = n4Var.b;
            n4Var.g = (int) ((l4Var4.d / 1000.0f) * n4Var.f);
            n4Var.h = (int) (l4Var4.g * l4Var4.i);
            if (n4Var.i) {
                qz0 qz0Var = new qz0(rh.h8.Z0(false, cd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                n4Var.q = qz0Var;
                if (qz0Var.c > n4Var.g - org.telegram.messenger.i0.L(30.0f)) {
                    n4Var.q = new qz0(rh.h8.Z0(false, cd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                }
            }
            if (n4Var.r == null || n4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j10 = tL_messageMediaPaidMedia3.stars_amount;
                n4Var.s = j10;
                n4Var.r = new qz0(rh.h8.T0(cd.H(',', "PaidMediaPrice", (int) j10), 0.9f, null), 12.0f, org.telegram.messenger.i0.o());
            }
        }
    }

    public final void h(jj jjVar) {
        float f7;
        boolean z10;
        boolean z11;
        int i10;
        q1 q1Var = this.a;
        boolean z12 = false;
        boolean z13 = q1Var.Sa > 0 || (q1Var.u1 && !TextUtils.isEmpty(jjVar.z));
        boolean z14 = ((q1Var.u1 || TextUtils.isEmpty(jjVar.z)) && q1Var.N.p && !q1Var.v7) ? false : true;
        int i11 = this.m;
        float f10 = 1000.0f;
        if (i11 > 0) {
            f7 = 1000.0f / this.b.d;
            this.f = i11;
        } else {
            if (org.telegram.messenger.i0.Q1()) {
                this.f = org.telegram.messenger.i0.Q0() - org.telegram.messenger.i0.L(122.0f);
            } else {
                this.f = Math.min(q1Var.getParentWidth(), org.telegram.messenger.i0.q.y) - org.telegram.messenger.i0.L((q1Var.V(jjVar) ? 10 : 0) + 64);
            }
            if (q1Var.V2()) {
                this.f -= org.telegram.messenger.i0.L(52.0f);
            }
            f7 = 1.0f;
        }
        l4 l4Var = this.b;
        this.g = (int) ((l4Var.d / 1000.0f) * f7 * this.f);
        this.h = (int) (l4Var.g * l4Var.i);
        this.i = false;
        int L = org.telegram.messenger.i0.L(1.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        char c10 = 2;
        int L3 = org.telegram.messenger.i0.L(r11 - (tz.Y0 > 2 ? 2 : 0));
        int min = Math.min(org.telegram.messenger.i0.L(3.0f), L3);
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            float f11 = f10;
            bj bjVar = null;
            if (i12 >= arrayList.size()) {
                break;
            }
            m4 m4Var = (m4) arrayList.get(i12);
            l4 l4Var2 = this.b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = m4Var.E;
            boolean z15 = z12;
            ImageReceiver imageReceiver = m4Var.f;
            if (messageExtendedMedia == null) {
                l4Var2.getClass();
            } else {
                bjVar = (bj) l4Var2.c.get(messageExtendedMedia);
            }
            if (bjVar == null) {
                z10 = z13;
                z11 = z14;
                i10 = L;
            } else {
                float f12 = (bjVar.q / f11) * f7;
                float f13 = this.f;
                int i13 = (int) (f12 * f13);
                z10 = z13;
                float f14 = bjVar.p;
                float f15 = this.b.i;
                int i14 = (int) (f14 * f15);
                int i15 = (int) ((bjVar.e / f11) * f7 * f13);
                int i16 = (int) (bjVar.f * f15);
                int i17 = i15;
                int i18 = bjVar.l;
                if ((i18 & 1) == 0) {
                    i13 += L;
                    i17 -= L;
                }
                if ((i18 & 4) == 0) {
                    i14 += L;
                    i16 -= L;
                }
                int i19 = i14;
                int i20 = i16;
                if ((i18 & 2) == 0) {
                    i17 -= L;
                }
                int i21 = i17;
                if ((i18 & 8) == 0) {
                    i20 -= L;
                }
                z11 = z14;
                int i22 = i20;
                m4Var.a = i13;
                m4Var.b = i19;
                i10 = L;
                m4Var.c = i13 + i21;
                m4Var.d = i19 + i22;
                imageReceiver.y0(i13, i19, i21, i22);
                int i23 = bjVar.l;
                int i24 = i23 & 4;
                int i25 = (i24 == 0 || (i23 & 1) == 0 || z10) ? L2 : L3;
                int i26 = (i24 == 0 || (i23 & 2) == 0 || z10) ? L2 : L3;
                int i27 = i23 & 8;
                int i28 = (i27 == 0 || (i23 & 1) == 0 || z11) ? L2 : L3;
                int i29 = (i27 == 0 || (i23 & 2) == 0 || z11) ? L2 : L3;
                if (!z11) {
                    if (jjVar.P3()) {
                        i29 = L2;
                    } else {
                        i28 = L2;
                    }
                }
                if (!z10 && q1Var.E) {
                    if (jjVar.P3()) {
                        i26 = min;
                    } else {
                        i25 = min;
                    }
                }
                imageReceiver.K0(i25, i26, i29, i28);
                float[] fArr = m4Var.s;
                float f16 = i25;
                fArr[1] = f16;
                fArr[z15 ? 1 : 0] = f16;
                float f17 = i26;
                fArr[3] = f17;
                fArr[c11] = f17;
                float f18 = i29;
                fArr[5] = f18;
                fArr[4] = f18;
                float f19 = i28;
                fArr[7] = f19;
                fArr[6] = f19;
                if (jjVar != null && jjVar.o4()) {
                    m4Var.b(3);
                }
                this.i = (this.i || m4Var.h) ? true : z15 ? 1 : 0;
            }
            i12++;
            f10 = f11;
            c10 = c11;
            z12 = z15 ? 1 : 0;
            z13 = z10;
            L = i10;
            z14 = z11;
        }
        boolean z16 = z12;
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = jjVar == null ? null : (TLRPC.TL_messageMediaPaidMedia) jjVar.k.media;
            if (tL_messageMediaPaidMedia != null) {
                qz0 qz0Var = new qz0(rh.h8.Z0(z16, cd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                this.q = qz0Var;
                if (qz0Var.c > this.g - org.telegram.messenger.i0.L(30.0f)) {
                    this.q = new qz0(rh.h8.Z0(false, cd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                }
            }
        }
    }
}
