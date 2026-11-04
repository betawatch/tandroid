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
import ci.wb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.ky;
import org.telegram.messenger.ri;
import org.telegram.messenger.yy;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 a;
    public j4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.u5 j;
    public w70 k;
    public final yh.e l;
    public int m;
    public final gc n;
    public k4 o;
    public boolean p;
    public ly0 q;
    public ly0 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public l4(q1 q1Var) {
        this.a = q1Var;
        this.l = yh.e.e(q1Var);
        this.j = new org.telegram.ui.Components.u5(q1Var, 0L, 350L, xq.h);
        this.n = new gc(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (!((k4) obj).f.R0) {
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
        float f10;
        float f11;
        float f12;
        float f13;
        Path path2;
        float f14;
        boolean p42;
        zi ziVar;
        float f15;
        long[] jArr;
        ky kyVar;
        int max;
        Canvas canvas2 = canvas;
        if (this.b == null) {
            return;
        }
        boolean z10 = this.i;
        org.telegram.ui.Components.u5 u5Var = this.j;
        float d = u5Var.d(z10);
        float d10 = u5Var.d(this.i);
        q1 q1Var2 = this.a;
        zi messageObject = q1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MIN_VALUE;
        float f18 = Float.MIN_VALUE;
        int i3 = 0;
        float f19 = Float.MAX_VALUE;
        while (true) {
            arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i3);
            ImageReceiver imageReceiver = k4Var.f;
            RadialProgress2 radialProgress2 = k4Var.H;
            int i10 = this.d;
            int i11 = k4Var.a;
            float f20 = d;
            int i12 = this.e;
            int i13 = k4Var.b;
            float f21 = d10;
            q1 q1Var3 = q1Var2;
            imageReceiver.y0(i10 + i11, i12 + i13, k4Var.c - i11, k4Var.d - i13);
            imageReceiver.h(canvas2, null);
            if (imageReceiver.m() != null) {
                imageReceiver.m().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!k4Var.y && k4Var.L != (max = Math.max(0, k4Var.K - round))) {
                    k4Var.L = max;
                    k4Var.M = new ly0(org.telegram.messenger.g0.g0(max, true, false), 12.0f, null);
                    if (f21 > 0.0f) {
                        float min = Math.min(this.d + k4Var.a, f19);
                        float min2 = Math.min(this.e + k4Var.b, f16);
                        f18 = Math.max(this.d + k4Var.c, f18);
                        f17 = Math.max(this.e + k4Var.d, f17);
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        float f22 = k4Var.a + this.d;
                        int i14 = this.e;
                        rectF2.set(f22, k4Var.b + i14, r10 + k4Var.c, i14 + k4Var.d);
                        path3.addRoundRect(rectF2, k4Var.s, Path.Direction.CW);
                        f16 = min2;
                        f19 = min;
                    }
                    radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
                    RectF rectF3 = radialProgress2.a;
                    float f23 = imageReceiver.L0;
                    float f24 = imageReceiver.N0 / 2.0f;
                    float f25 = radialProgress2.x;
                    float f26 = f16;
                    float f27 = f19;
                    float f28 = imageReceiver.M0;
                    float f29 = imageReceiver.O0 / 2.0f;
                    rectF3.set((f24 - f25) + f23, (f29 - f25) + f28, f24 + f25 + f23, f29 + f25 + f28);
                    p42 = messageObject.p4();
                    int i15 = messageObject.I1;
                    if (p42) {
                        ziVar = messageObject;
                        f15 = f17;
                        if (org.telegram.messenger.w7.G(i15).T(k4Var.w)) {
                            k4Var.b(3);
                        } else {
                            k4Var.b(k4Var.a());
                        }
                    } else {
                        yy C = yy.C(i15);
                        long[] x10 = zb.D().x(k4Var.G);
                        int f110 = messageObject.f1();
                        HashMap hashMap = C.a;
                        if (hashMap != null) {
                            Iterator it = hashMap.values().iterator();
                            ky kyVar2 = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    ziVar = messageObject;
                                    jArr = x10;
                                    f15 = f17;
                                    break;
                                }
                                ArrayList arrayList2 = (ArrayList) it.next();
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    ziVar = messageObject;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= size) {
                                            jArr = x10;
                                            f15 = f17;
                                            break;
                                        }
                                        Object obj = arrayList2.get(i16);
                                        int i17 = i16 + 1;
                                        ky kyVar3 = (ky) obj;
                                        jArr = x10;
                                        ArrayList arrayList3 = kyVar3.z;
                                        if (arrayList3 == null) {
                                            x10 = jArr;
                                            i16 = i17;
                                        } else {
                                            int size2 = arrayList3.size();
                                            f15 = f17;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= size2) {
                                                    break;
                                                }
                                                Object obj2 = arrayList3.get(i18);
                                                i18++;
                                                int i19 = size2;
                                                TLRPC.Message message = (TLRPC.Message) obj2;
                                                if (message != null && message.id == f110) {
                                                    kyVar2 = kyVar3;
                                                    break;
                                                }
                                                size2 = i19;
                                            }
                                            if (kyVar2 != null) {
                                                break;
                                            }
                                            x10 = jArr;
                                            i16 = i17;
                                            f17 = f15;
                                        }
                                    }
                                    if (kyVar2 != null) {
                                        break;
                                    }
                                    x10 = jArr;
                                    messageObject = ziVar;
                                    f17 = f15;
                                }
                            }
                            kyVar = kyVar2;
                        } else {
                            ziVar = messageObject;
                            jArr = x10;
                            f15 = f17;
                            kyVar = null;
                        }
                        if (kyVar != null && i3 >= 0 && i3 < kyVar.z.size()) {
                            f110 = ((TLRPC.Message) kyVar.z.get(i3)).id;
                        }
                        boolean z11 = C.c.indexOfKey(f110) >= 0 || C.d.indexOfKey(f110) >= 0;
                        if (jArr == null && z11) {
                            radialProgress2.p(true, 1.0f);
                            k4Var.b(k4Var.x ? 6 : k4Var.a());
                        }
                    }
                    canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f21) * 255.0f), 31);
                    radialProgress2.draw(canvas2);
                    canvas2.restore();
                    i3++;
                    f19 = f27;
                    d = f20;
                    q1Var2 = q1Var3;
                    d10 = f21;
                    f16 = f26;
                    messageObject = ziVar;
                    f17 = f15;
                }
            }
            if (f21 > 0.0f) {
            }
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
            RectF rectF32 = radialProgress2.a;
            float f232 = imageReceiver.L0;
            float f242 = imageReceiver.N0 / 2.0f;
            float f252 = radialProgress2.x;
            float f262 = f16;
            float f272 = f19;
            float f282 = imageReceiver.M0;
            float f292 = imageReceiver.O0 / 2.0f;
            rectF32.set((f242 - f252) + f232, (f292 - f252) + f282, f242 + f252 + f232, f292 + f252 + f282);
            p42 = messageObject.p4();
            int i152 = messageObject.I1;
            if (p42) {
            }
            canvas2.saveLayerAlpha(rectF32, (int) ((1.0f - f21) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i3++;
            f19 = f272;
            d = f20;
            q1Var2 = q1Var3;
            d10 = f21;
            f16 = f262;
            messageObject = ziVar;
            f17 = f15;
        }
        float f30 = d;
        float f31 = d10;
        q1 q1Var4 = q1Var2;
        if (f31 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f19, f16);
            int i20 = (int) (f18 - f19);
            int i21 = (int) (f17 - f16);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i20, i21, (int) (f31 * 255.0f), 31);
            this.l.c(canvas, q1Var4, i20, i21, 1.0f, q1Var4.Fc);
            canvas2 = canvas;
            q1Var = q1Var4;
            canvas2.restore();
            canvas2.restore();
            q1Var.invalidate();
        } else {
            q1Var = q1Var4;
        }
        int i22 = 0;
        while (true) {
            int size3 = arrayList.size();
            rectF = this.v;
            path = this.t;
            if (i22 >= size3) {
                break;
            }
            k4 k4Var2 = (k4) arrayList.get(i22);
            if (k4Var2.M != null) {
                float L = org.telegram.messenger.g0.L(11.4f) + k4Var2.M.c;
                float L2 = org.telegram.messenger.g0.L(17.0f);
                float L3 = org.telegram.messenger.g0.L(5.0f);
                float f32 = this.d + k4Var2.a + L3;
                float f33 = this.e + k4Var2.b + L3;
                rectF.set(f32, f33, L + f32, f33 + L2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (org.telegram.messenger.g0.L(11.32f) + this.r.c)) - L3 || rectF.top > this.e + L3) {
                    path.rewind();
                    float f34 = L2 / 2.0f;
                    path.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f14 = f31;
                    c(canvas2, f14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(1.0f, TLObject.FLAG_30));
                    k4Var2.M.c(this.d + k4Var2.a + L3 + org.telegram.messenger.g0.L(5.66f), this.e + k4Var2.b + L3 + f34, 1.0f, -1, canvas2);
                    canvas2.restore();
                    i22++;
                    f31 = f14;
                }
            }
            f14 = f31;
            i22++;
            f31 = f14;
        }
        if (this.q == null || f30 <= 0.0f) {
            f10 = 11.32f;
            f11 = 5.0f;
            f12 = 17.0f;
            f13 = f30;
            path2 = path;
        } else {
            float a10 = this.n.a(0.05f);
            float L4 = org.telegram.messenger.g0.L(28.0f) + this.q.c;
            float L5 = org.telegram.messenger.g0.L(32.0f);
            float f35 = this.d;
            float f36 = this.g;
            float z12 = com.google.android.recaptcha.internal.a.z(f36, L4, 2.0f, f35);
            f10 = 11.32f;
            float f37 = this.e;
            f11 = 5.0f;
            float f38 = this.h;
            f12 = 17.0f;
            rectF.set(z12, com.google.android.recaptcha.internal.a.z(f38, L5, 2.0f, f37), org.telegram.messenger.k5.a(f36, L4, 2.0f, f35), org.telegram.messenger.k5.a(f38, L5, 2.0f, f37));
            path.rewind();
            float f39 = L5 / 2.0f;
            path.addRoundRect(rectF, f39, f39, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a10, a10, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f13 = f30;
            c(canvas2, f13);
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(f13, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (L4 / 2.0f)) + org.telegram.messenger.g0.L(14.0f), this.e + (this.h / 2.0f), f13, -1, canvas2);
            canvas2.restore();
            if (q1Var.getDelegate() == null || !q1Var.getDelegate().p1(q1Var, 5)) {
                w70 w70Var = this.k;
                if (w70Var != null && !w70Var.d() && !this.k.c()) {
                    this.k.a();
                }
            } else {
                w70 w70Var2 = this.k;
                if (w70Var2 == null) {
                    w70 w70Var3 = new w70();
                    this.k = w70Var3;
                    w70Var3.setCallback(q1Var);
                    this.k.g(org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.35f, -1), org.telegram.ui.ActionBar.k6.r1(0.8f, -1));
                    w70 w70Var4 = this.k;
                    w70Var4.D = true;
                    w70Var4.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                } else if (w70Var2.c() || this.k.d()) {
                    w70 w70Var5 = this.k;
                    w70Var5.b = -1L;
                    w70Var5.c = -1L;
                }
            }
            w70 w70Var6 = this.k;
            if (w70Var6 != null) {
                w70Var6.e(rectF);
                this.k.k(f39);
                this.k.setAlpha((int) (f13 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f13 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = q1Var.getTimeAlpha() * (1.0f - f13);
        float L6 = org.telegram.messenger.g0.L(f10) + this.r.c;
        float L7 = org.telegram.messenger.g0.L(f12);
        float L8 = org.telegram.messenger.g0.L(f11);
        float f40 = this.d + this.g;
        float f41 = this.e + L8;
        rectF.set((f40 - L6) - L8, f41, f40 - L8, f41 + L7);
        path2.rewind();
        float f42 = L7 / 2.0f;
        path2.addRoundRect(rectF, f42, f42, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path2);
        canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - L6) - L8) + org.telegram.messenger.g0.L(5.66f), this.e + L8 + f42, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f10) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        q1 q1Var = this.a;
        int f12 = q1Var.getMessageObject() != null ? q1Var.getMessageObject().f1() : 0;
        int i3 = this.g;
        int i10 = this.h;
        int max = (int) Math.max(1.0f, i3 > i10 ? 100.0f : (i3 / i10) * 100.0f);
        int i11 = this.h;
        int i12 = this.g;
        int max2 = (int) Math.max(1.0f, i11 <= i12 ? 100.0f * (i11 / i12) : 100.0f);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.c;
            if (i13 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i13);
            if (k4Var.f.K() && k4Var.f.n() != null) {
                i14 |= 1 << i13;
            }
            i13++;
        }
        Bitmap bitmap = this.w;
        if (bitmap == null || this.z != f12 || this.y != i14 || this.A != max || this.B != max2) {
            this.y = i14;
            this.z = f12;
            this.A = max;
            this.B = max2;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.w);
            float f11 = max / this.g;
            canvas2.scale(f11, f11);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                k4 k4Var2 = (k4) arrayList.get(i15);
                k4Var2.f.y0(k4Var2.a, k4Var2.b, k4Var2.c - r4, k4Var2.d - r7);
                k4Var2.f.h(canvas2, null);
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
            this.x.setAlpha((int) (f10 * 255.0f));
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
            canvas.restore();
        }
    }

    public final k4 d(float f10, float f11) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return null;
            }
            if (((k4) arrayList.get(i3)).f.O(f10, f11)) {
                return (k4) arrayList.get(i3);
            }
            i3++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        yh.e eVar = this.l;
        if (eVar != null) {
            eVar.a(this.a);
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return;
            }
            k4 k4Var = (k4) arrayList.get(i3);
            if (k4Var.N) {
                k4Var.N = false;
                k4Var.f.R();
            }
            i3++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        k4 k4Var;
        q1 q1Var;
        boolean z11;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            k4 d = d(x10, y9);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x10, y9)) {
                    z11 = true;
                    this.p = z11;
                }
            }
            z11 = false;
            this.p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            k4 d10 = d(x10, y9);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.H;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y9)) {
                    z10 = true;
                    k4Var = this.o;
                    if (k4Var != null && k4Var == d10) {
                        q1Var = this.a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            zi messageObject = q1Var.getMessageObject();
                            if (this.p || !z10 || d10.H.i.q != 3 || messageObject == null) {
                                l1 delegate = q1Var.getDelegate();
                                k4 k4Var2 = this.o;
                                ImageReceiver imageReceiver = k4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.M1(q1Var, messageExtendedMedia);
                            } else if (messageObject.p4()) {
                                yy.C(messageObject.I1).g(messageObject);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z10 = false;
            k4Var = this.o;
            if (k4Var != null) {
                q1Var = this.a;
                if (q1Var.getDelegate() != null) {
                    zi messageObject2 = q1Var.getMessageObject();
                    if (this.p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    k4 k4Var22 = this.o;
                    ImageReceiver imageReceiver2 = k4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = k4Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.M1(q1Var, messageExtendedMedia2);
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
    public final void g(zi ziVar) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i3;
        float[] fArr;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        zi ziVar2;
        ArrayList arrayList;
        ri riVar;
        l4 l4Var = this;
        if (ziVar == null || (message = ziVar.k) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (l4Var.b == null) {
                j4 j4Var = new j4();
                j4Var.a = new ArrayList();
                j4Var.b = new ArrayList();
                j4Var.c = new HashMap();
                j4Var.h = 800;
                j4Var.i = 814.0f;
                l4Var.b = j4Var;
            }
            l4Var.b.a.clear();
            l4Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            j4 j4Var2 = l4Var.b;
            float f15 = j4Var2.i;
            ArrayList arrayList2 = j4Var2.b;
            arrayList2.clear();
            HashMap hashMap = j4Var2.c;
            hashMap.clear();
            boolean z10 = false;
            j4Var2.e = 0;
            ArrayList arrayList3 = j4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                j4Var2.d = 0;
                j4Var2.g = 0.0f;
                j4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                i3 = 10;
            } else {
                j4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                boolean z11 = false;
                float f16 = 1.0f;
                while (i13 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i13);
                    ri riVar2 = new ri();
                    riVar2.h = i13 == size + (-1) ? true : z10;
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                        riVar2.n = tL_messageExtendedMediaPreview.w;
                        riVar2.o = tL_messageExtendedMediaPreview.h;
                        i12 = i13;
                    } else {
                        boolean z12 = z10;
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia2).photo;
                                if (photo == null) {
                                    i12 = i13;
                                    w10 = null;
                                    riVar2.n = w10 != null ? 100 : w10.w;
                                    riVar2.o = w10 != null ? 100 : w10.h;
                                } else {
                                    i12 = i13;
                                    w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(z12), z12, null, z12);
                                    riVar2.n = w10 != null ? 100 : w10.w;
                                    riVar2.o = w10 != null ? 100 : w10.h;
                                }
                            } else {
                                i12 = i13;
                                if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) != null) {
                                    w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.Z0(z12), z12, null, z12);
                                    riVar2.n = w10 != null ? 100 : w10.w;
                                    riVar2.o = w10 != null ? 100 : w10.h;
                                }
                                w10 = null;
                                riVar2.n = w10 != null ? 100 : w10.w;
                                riVar2.o = w10 != null ? 100 : w10.h;
                            }
                        } else {
                            i12 = i13;
                            riVar2.n = 100;
                            riVar2.o = 100;
                        }
                    }
                    if (riVar2.n <= 0 || riVar2.o <= 0) {
                        riVar2.n = 50;
                        riVar2.o = 50;
                    }
                    float f17 = riVar2.n / riVar2.o;
                    riVar2.g = f17;
                    if (f17 > 1.2f) {
                        sb2.append("w");
                    } else if (f17 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    float f18 = riVar2.g;
                    f16 += f18;
                    if (f18 > 2.0f) {
                        z11 = true;
                    }
                    hashMap.put(messageExtendedMedia, riVar2);
                    arrayList2.add(riVar2);
                    i13 = i12 + 1;
                    z10 = false;
                }
                float f19 = 1.0f;
                int L = org.telegram.messenger.g0.L(120.0f);
                float L2 = org.telegram.messenger.g0.L(120.0f);
                Point point = org.telegram.messenger.g0.q;
                int min = (int) (L2 / (Math.min(point.x, point.y) / j4Var2.h));
                float L3 = org.telegram.messenger.g0.L(40.0f);
                float min2 = Math.min(point.x, point.y);
                float f20 = j4Var2.h;
                int i14 = (int) (L3 / (min2 / f20));
                float f21 = f20 / f15;
                float f22 = f16 / size;
                float L4 = org.telegram.messenger.g0.L(100.0f) / f15;
                if (size == 1) {
                    ri riVar3 = (ri) arrayList2.get(0);
                    float f23 = riVar3.g;
                    if (f23 >= 1.0f) {
                        f13 = j4Var2.h;
                        f14 = ((f13 / f23) / f13) * f15;
                    } else {
                        f13 = j4Var2.h * ((f23 * f15) / f15);
                        f14 = f15;
                    }
                    riVar3.a(f14 / f15, 0, 0, 0, 0, (int) f13, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z11) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                ri riVar4 = (ri) arrayList2.get(0);
                                ri riVar5 = (ri) arrayList2.get(1);
                                String sb3 = sb2.toString();
                                if (sb3.equals("ww") && f22 > f21 * 1.4d) {
                                    float f24 = riVar4.g;
                                    float f25 = riVar5.g;
                                    if (f24 - f25 < 0.2d) {
                                        float f26 = j4Var2.h;
                                        float round = Math.round(Math.min(f26 / f24, Math.min(f26 / f25, f15 / 2.0f))) / f15;
                                        riVar4.a(round, 0, 0, 0, 0, j4Var2.h, 7);
                                        riVar5.a(round, 0, 0, 1, 1, j4Var2.h, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i15 = j4Var2.h / 2;
                                    float f27 = i15;
                                    float round2 = Math.round(Math.min(f27 / riVar4.g, Math.min(f27 / riVar5.g, f15))) / f15;
                                    riVar4.a(round2, 0, 0, 0, 0, i15, 13);
                                    riVar5.a(round2, 1, 1, 0, 0, i15, 14);
                                    j4Var2.e = 1;
                                } else {
                                    float f28 = j4Var2.h;
                                    float f29 = riVar4.g;
                                    int max = (int) Math.max(f28 * 0.4f, Math.round((f28 / f29) / ((1.0f / riVar5.g) + (1.0f / f29))));
                                    int i16 = j4Var2.h - max;
                                    if (i16 < min) {
                                        max -= min - i16;
                                    } else {
                                        min = i16;
                                    }
                                    float min3 = Math.min(f15, Math.round(Math.min(min / riVar4.g, max / riVar5.g))) / f15;
                                    riVar4.a(min3, 0, 0, 0, 0, min, 13);
                                    riVar5.a(min3, 1, 1, 0, 0, max, 14);
                                    j4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                ri riVar6 = (ri) arrayList2.get(0);
                                ri riVar7 = (ri) arrayList2.get(1);
                                ri riVar8 = (ri) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f30 = riVar7.g;
                                    float min4 = Math.min(f15 * 0.5f, Math.round((j4Var2.h * f30) / (riVar8.g + f30)));
                                    float f31 = f15 - min4;
                                    int max2 = (int) Math.max(min, Math.min(j4Var2.h * 0.5f, Math.round(Math.min(riVar8.g * min4, riVar7.g * f31))));
                                    int round3 = Math.round(Math.min((riVar6.g * f15) + i14, j4Var2.h - max2));
                                    riVar6.a(1.0f, 0, 0, 0, 1, round3, 13);
                                    float f32 = f31 / f15;
                                    riVar7.a(f32, 1, 1, 0, 0, max2, 6);
                                    float f33 = min4 / f15;
                                    riVar8.a(f33, 1, 1, 1, 1, max2, 10);
                                    int i17 = j4Var2.h;
                                    riVar8.i = i17;
                                    riVar6.m = new float[]{f33, f32};
                                    riVar7.i = i17 - round3;
                                    riVar8.j = round3;
                                    j4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(j4Var2.h / riVar6.g, 0.66f * f15)) / f15;
                                    riVar6.a(round4, 0, 1, 0, 0, j4Var2.h, 7);
                                    int i18 = j4Var2.h / 2;
                                    float f34 = i18;
                                    float min5 = Math.min(f15 - round4, Math.round(Math.min(f34 / riVar7.g, f34 / riVar8.g))) / f15;
                                    float f35 = min5 < L4 ? L4 : min5;
                                    riVar7.a(f35, 0, 0, 1, 1, i18, 9);
                                    riVar8.a(f35, 1, 1, 1, 1, i18, 10);
                                    j4Var2.e = 1;
                                }
                            } else {
                                ri riVar9 = (ri) arrayList2.get(0);
                                ri riVar10 = (ri) arrayList2.get(1);
                                ri riVar11 = (ri) arrayList2.get(2);
                                ri riVar12 = (ri) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(j4Var2.h / riVar9.g, f15 * 0.66f)) / f15;
                                    riVar9.a(round5, 0, 2, 0, 0, j4Var2.h, 7);
                                    float round6 = Math.round(j4Var2.h / ((riVar10.g + riVar11.g) + riVar12.g));
                                    float f36 = min;
                                    int max3 = (int) Math.max(f36, Math.min(j4Var2.h * 0.4f, riVar10.g * round6));
                                    int max4 = (int) Math.max(Math.max(f36, j4Var2.h * 0.33f), riVar12.g * round6);
                                    int i19 = (j4Var2.h - max3) - max4;
                                    if (i19 < org.telegram.messenger.g0.L(58.0f)) {
                                        int L5 = org.telegram.messenger.g0.L(58.0f) - i19;
                                        i19 = org.telegram.messenger.g0.L(58.0f);
                                        int i20 = L5 / 2;
                                        max3 -= i20;
                                        max4 -= L5 - i20;
                                    }
                                    int i21 = max3;
                                    float min6 = Math.min(f15 - round5, round6) / f15;
                                    float f37 = min6 < L4 ? L4 : min6;
                                    riVar10.a(f37, 0, 0, 1, 1, i21, 9);
                                    riVar11.a(f37, 1, 1, 1, 1, i19, 8);
                                    riVar12.a(f37, 2, 2, 1, 1, max4, 10);
                                    j4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f15 / ((1.0f / riVar12.g) + ((1.0f / riVar11.g) + (1.0f / riVar10.g)))));
                                    float f38 = L;
                                    float f39 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f38, f39 / riVar10.g) / f15);
                                    float min8 = Math.min(0.33f, Math.max(f38, f39 / riVar11.g) / f15);
                                    float f40 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((riVar9.g * f15) + i14, j4Var2.h - max5));
                                    riVar9.a(min7 + min8 + f40, 0, 0, 0, 2, round7, 13);
                                    riVar10.a(min7, 1, 1, 0, 0, max5, 6);
                                    riVar11.a(min8, 1, 1, 1, 1, max5, 2);
                                    riVar11.i = j4Var2.h;
                                    riVar12.a(f40, 1, 1, 2, 2, max5, 10);
                                    int i22 = j4Var2.h;
                                    riVar12.i = i22;
                                    riVar10.i = i22 - round7;
                                    riVar11.j = round7;
                                    riVar12.j = round7;
                                    riVar9.m = new float[]{min7, min8, f40};
                                    j4Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    int i23 = 0;
                    while (i23 < size) {
                        if (f22 > 1.1f) {
                            f12 = f19;
                            fArr2[i23] = Math.max(f12, ((ri) arrayList2.get(i23)).g);
                        } else {
                            f12 = f19;
                            fArr2[i23] = Math.min(f12, ((ri) arrayList2.get(i23)).g);
                        }
                        fArr2[i23] = Math.max(0.66667f, Math.min(1.7f, fArr2[i23]));
                        i23++;
                        f19 = f12;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i24 = 1; i24 < size2; i24++) {
                        int i25 = size2 - i24;
                        if (i24 <= 3 && i25 <= 3) {
                            float a10 = j4Var2.a(0, i24, fArr2);
                            float a11 = j4Var2.a(i24, size2, fArr2);
                            i4 i4Var = new i4();
                            i4Var.a = new int[]{i24, i25};
                            i4Var.b = new float[]{a10, a11};
                            arrayList4.add(i4Var);
                        }
                    }
                    int i26 = 1;
                    while (i26 < size2 - 1) {
                        int i27 = 1;
                        while (true) {
                            int i28 = size2 - i26;
                            if (i27 < i28) {
                                int i29 = i28 - i27;
                                if (i26 <= 3) {
                                    if (i27 <= (f22 < 0.85f ? 4 : 3) && i29 <= 3) {
                                        float a12 = j4Var2.a(0, i26, fArr2);
                                        int i30 = i26 + i27;
                                        float a13 = j4Var2.a(i26, i30, fArr2);
                                        float a14 = j4Var2.a(i30, size2, fArr2);
                                        i4 i4Var2 = new i4();
                                        i4Var2.a = new int[]{i26, i27, i29};
                                        i11 = i26;
                                        i4Var2.b = new float[]{a12, a13, a14};
                                        arrayList4.add(i4Var2);
                                        i27++;
                                        i26 = i11;
                                    }
                                }
                                i11 = i26;
                                i27++;
                                i26 = i11;
                            }
                        }
                        i26++;
                    }
                    for (int i31 = 1; i31 < size2 - 2; i31++) {
                        int i32 = 1;
                        while (true) {
                            int i33 = size2 - i31;
                            if (i32 < i33) {
                                int i34 = 1;
                                while (true) {
                                    int i35 = i33 - i32;
                                    if (i34 < i35) {
                                        int i36 = i35 - i34;
                                        if (i31 > 3 || i32 > 3 || i34 > 3 || i36 > 3) {
                                            i10 = i33;
                                        } else {
                                            i10 = i33;
                                            float a15 = j4Var2.a(0, i31, fArr2);
                                            int i37 = i31 + i32;
                                            float a16 = j4Var2.a(i31, i37, fArr2);
                                            int i38 = i37 + i34;
                                            float a17 = j4Var2.a(i37, i38, fArr2);
                                            float a18 = j4Var2.a(i38, size2, fArr2);
                                            i4 i4Var3 = new i4();
                                            i4Var3.a = new int[]{i31, i32, i34, i36};
                                            i4Var3.b = new float[]{a15, a16, a17, a18};
                                            arrayList4.add(i4Var3);
                                        }
                                        i34++;
                                        i33 = i10;
                                    }
                                }
                                i32++;
                            }
                        }
                    }
                    float f41 = (j4Var2.h / 3) * 4;
                    i4 i4Var4 = null;
                    float f42 = 0.0f;
                    int i39 = 0;
                    while (i39 < arrayList4.size()) {
                        i4 i4Var5 = (i4) arrayList4.get(i39);
                        float f43 = Float.MAX_VALUE;
                        float f44 = f41;
                        float f45 = 0.0f;
                        int i40 = 0;
                        while (true) {
                            float[] fArr3 = i4Var5.b;
                            fArr = fArr2;
                            if (i40 >= fArr3.length) {
                                break;
                            }
                            float f46 = fArr3[i40];
                            f45 += f46;
                            if (f46 < f43) {
                                f43 = f46;
                            }
                            i40++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f45 - f44);
                        int[] iArr = i4Var5.a;
                        if (iArr.length > 1) {
                            int i41 = iArr[0];
                            int i42 = iArr[1];
                            if (i41 <= i42) {
                                f10 = abs;
                                if (iArr.length <= 2 || i42 <= iArr[2]) {
                                    if (iArr.length > 3) {
                                    }
                                }
                            } else {
                                f10 = abs;
                            }
                            f11 = f10 * 1.2f;
                            if (f43 < min) {
                                f11 *= 1.5f;
                            }
                            if (i4Var4 != null || f11 < f42) {
                                f42 = f11;
                                i4Var4 = i4Var5;
                            }
                            i39++;
                            f41 = f44;
                            fArr2 = fArr;
                        } else {
                            f10 = abs;
                        }
                        f11 = f10;
                        if (f43 < min) {
                        }
                        if (i4Var4 != null) {
                        }
                        f42 = f11;
                        i4Var4 = i4Var5;
                        i39++;
                        f41 = f44;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (i4Var4 == null) {
                        i3 = 10;
                        l4Var = this;
                    } else {
                        int[] iArr2 = i4Var4.a;
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < iArr2.length) {
                            int i45 = iArr2[i43];
                            float f47 = i4Var4.b[i43];
                            int i46 = j4Var2.h;
                            int i47 = i45 - 1;
                            j4Var2.e = Math.max(j4Var2.e, i47);
                            ri riVar13 = null;
                            int i48 = 0;
                            while (i48 < i45) {
                                int i49 = (int) (fArr4[i44] * f47);
                                i46 -= i49;
                                ri riVar14 = (ri) arrayList2.get(i44);
                                int i50 = i43 == 0 ? 4 : 0;
                                i4 i4Var6 = i4Var4;
                                if (i43 == iArr2.length - 1) {
                                    i50 |= 8;
                                }
                                if (i48 == 0) {
                                    i50 |= 1;
                                }
                                if (i48 == i47) {
                                    i50 |= 2;
                                    riVar13 = riVar14;
                                }
                                int i51 = i48;
                                riVar14.a(Math.max(L4, f47 / f15), i51, i48, i43, i43, i49, i50);
                                i44++;
                                i48 = i51 + 1;
                                i4Var4 = i4Var6;
                            }
                            riVar13.e += i46;
                            riVar13.i += i46;
                            i43++;
                            i4Var4 = i4Var4;
                        }
                    }
                }
                for (int i52 = 0; i52 < size; i52++) {
                    ri riVar15 = (ri) arrayList2.get(i52);
                    if (riVar15.b == j4Var2.e || (riVar15.l & 2) != 0) {
                        riVar15.i += hs.e3;
                    }
                    if ((riVar15.l & 1) != 0) {
                        riVar15.k = true;
                    }
                    if (riVar15.k) {
                        int i53 = riVar15.i;
                        if (i53 != 1000) {
                            riVar15.i = i53 + hs.t1;
                        }
                        riVar15.e += hs.t1;
                    } else if ((riVar15.l & 2) != 0) {
                        int i54 = riVar15.i;
                        if (i54 != 1000) {
                            riVar15.i = i54 - 108;
                        } else {
                            int i55 = riVar15.j;
                            if (i55 != 0) {
                                riVar15.j = i55 + hs.t1;
                            }
                        }
                    }
                }
                int i56 = 0;
                while (i56 < size) {
                    ri riVar16 = (ri) arrayList2.get(i56);
                    if (riVar16.a == 0) {
                        riVar16.i += hs.e3;
                    }
                    if ((riVar16.l & 2) != 0) {
                        riVar16.k = true;
                    }
                    j4Var2.e = Math.max(j4Var2.e, (int) riVar16.b);
                    j4Var2.f = Math.max(j4Var2.f, (int) riVar16.d);
                    byte b10 = riVar16.c;
                    byte b11 = riVar16.d;
                    byte b12 = riVar16.a;
                    int i57 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i57];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i58 = 0;
                    while (i58 < size3) {
                        ri riVar17 = (ri) arrayList2.get(i58);
                        if (riVar17 != riVar16 && riVar17.b < b12) {
                            int min9 = Math.min((int) riVar17.d, (int) b11) - b10;
                            int max6 = Math.max(riVar17.c - b10, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + riVar17.e;
                                max6++;
                                i56 = i56;
                            }
                        }
                        i58++;
                        i56 = i56;
                    }
                    int i59 = i56;
                    float f48 = 0.0f;
                    for (int i60 = 0; i60 < i57; i60++) {
                        float f49 = fArr5[i60];
                        if (f48 < f49) {
                            f48 = f49;
                        }
                    }
                    riVar16.q = f48;
                    i56 = i59 + 1;
                }
                for (int i61 = 0; i61 < size; i61++) {
                    ri riVar18 = (ri) arrayList2.get(i61);
                    byte b13 = riVar18.c;
                    int i62 = j4Var2.e + 1;
                    float[] fArr6 = new float[i62];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i63 = 0; i63 < size4; i63++) {
                        ri riVar19 = (ri) arrayList2.get(i63);
                        if (riVar19 != riVar18 && riVar19.d < b13) {
                            for (int i64 = riVar19.a; i64 <= riVar19.b; i64++) {
                                fArr6[i64] = fArr6[i64] + riVar19.f;
                            }
                        }
                    }
                    float f50 = 0.0f;
                    for (int i65 = 0; i65 < i62; i65++) {
                        float f51 = fArr6[i65];
                        if (f50 < f51) {
                            f50 = f51;
                        }
                    }
                    riVar18.p = f50;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i66 = 0; i66 < size5; i66++) {
                    ri riVar20 = (ri) arrayList2.get(i66);
                    int i67 = riVar20.e;
                    for (int i68 = riVar20.c; i68 <= riVar20.d; i68++) {
                        iArr3[i68] = iArr3[i68] + i67;
                    }
                }
                int i69 = iArr3[0];
                for (int i70 = 1; i70 < 10; i70++) {
                    int i71 = iArr3[i70];
                    if (i69 < i71) {
                        i69 = i71;
                    }
                }
                j4Var2.d = i69;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i72 = 0; i72 < size6; i72++) {
                    ri riVar21 = (ri) arrayList2.get(i72);
                    float f52 = riVar21.f;
                    for (int i73 = riVar21.a; i73 <= riVar21.b; i73++) {
                        fArr7[i73] = fArr7[i73] + f52;
                    }
                }
                float f53 = fArr7[0];
                i3 = 10;
                for (int i74 = 1; i74 < 10; i74++) {
                    float f54 = fArr7[i74];
                    if (f53 < f54) {
                        f53 = f54;
                    }
                }
                j4Var2.g = f53;
                l4Var = this;
            }
            int i75 = l4Var.m;
            q1 q1Var = l4Var.a;
            if (i75 > 0) {
                l4Var.f = i75;
                ziVar2 = ziVar;
            } else {
                if (org.telegram.messenger.g0.Q1()) {
                    l4Var.f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
                    ziVar2 = ziVar;
                } else {
                    ziVar2 = ziVar;
                    l4Var.f = Math.min(q1Var.getParentWidth(), org.telegram.messenger.g0.q.y) - org.telegram.messenger.g0.L((q1Var.U(ziVar2) ? i3 : 0) + 64);
                }
                if (q1Var.X2()) {
                    l4Var.f -= org.telegram.messenger.g0.L(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i76 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = l4Var.c;
                if (i76 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i76);
                k4 k4Var = i76 >= arrayList.size() ? null : (k4) arrayList.get(i76);
                if (k4Var == null) {
                    j4 j4Var3 = l4Var.b;
                    if (messageExtendedMedia2 == null) {
                        j4Var3.getClass();
                        riVar = null;
                    } else {
                        riVar = (ri) j4Var3.c.get(messageExtendedMedia2);
                    }
                    k4 k4Var2 = new k4(l4Var.a, ziVar2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((riVar.e / 1000.0f) * l4Var.f), (int) (riVar.f * l4Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        k4Var2.G = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = ziVar2.k;
                        k4Var2.G = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(k4Var2.G)) {
                        org.telegram.messenger.z5.q(q1Var.Z5).a(k4Var2.G, ziVar2, k4Var2);
                        if (ziVar2.p4()) {
                            k4Var2.H.p(false, messageExtendedMedia2.uploadProgress);
                        }
                    }
                    if (q1Var.O0 && !k4Var2.N) {
                        k4Var2.N = true;
                        k4Var2.f.P();
                    }
                    arrayList.add(k4Var2);
                } else {
                    k4Var.c(messageExtendedMedia2, ziVar2);
                }
                i76++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                k4 k4Var3 = size8 >= arrayList.size() ? null : (k4) arrayList.get(size8);
                if (k4Var3 != null) {
                    if (k4Var3.N) {
                        k4Var3.N = false;
                        k4Var3.f.R();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(ziVar);
            j4 j4Var4 = l4Var.b;
            l4Var.g = (int) ((j4Var4.d / 1000.0f) * l4Var.f);
            l4Var.h = (int) (j4Var4.g * j4Var4.i);
            if (l4Var.i) {
                ly0 ly0Var = new ly0(wb.a1(false, bd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                l4Var.q = ly0Var;
                if (ly0Var.c > l4Var.g - org.telegram.messenger.g0.L(30.0f)) {
                    l4Var.q = new ly0(wb.a1(false, bd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
            if (l4Var.r == null || l4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j10 = tL_messageMediaPaidMedia3.stars_amount;
                l4Var.s = j10;
                l4Var.r = new ly0(wb.U0(bd.H(',', "PaidMediaPrice", (int) j10), 0.9f, null), 12.0f, org.telegram.messenger.g0.o());
            }
        }
    }

    public final void h(zi ziVar) {
        float f10;
        boolean z10;
        boolean z11;
        int i3;
        q1 q1Var = this.a;
        boolean z12 = false;
        boolean z13 = q1Var.Ta > 0 || (q1Var.v1 && !TextUtils.isEmpty(ziVar.z));
        boolean z14 = ((q1Var.v1 || TextUtils.isEmpty(ziVar.z)) && q1Var.O.p && !q1Var.w7) ? false : true;
        int i10 = this.m;
        float f11 = 1000.0f;
        if (i10 > 0) {
            f10 = 1000.0f / this.b.d;
            this.f = i10;
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                this.f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
            } else {
                this.f = Math.min(q1Var.getParentWidth(), org.telegram.messenger.g0.q.y) - org.telegram.messenger.g0.L((q1Var.U(ziVar) ? 10 : 0) + 64);
            }
            if (q1Var.X2()) {
                this.f -= org.telegram.messenger.g0.L(52.0f);
            }
            f10 = 1.0f;
        }
        j4 j4Var = this.b;
        this.g = (int) ((j4Var.d / 1000.0f) * f10 * this.f);
        this.h = (int) (j4Var.g * j4Var.i);
        this.i = false;
        int L = org.telegram.messenger.g0.L(1.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        char c2 = 2;
        int L3 = org.telegram.messenger.g0.L(r11 - (az.Y0 > 2 ? 2 : 0));
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L3);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            float f12 = f11;
            ri riVar = null;
            if (i11 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i11);
            j4 j4Var2 = this.b;
            char c10 = c2;
            TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var.F;
            boolean z15 = z12;
            ImageReceiver imageReceiver = k4Var.f;
            if (messageExtendedMedia == null) {
                j4Var2.getClass();
            } else {
                riVar = (ri) j4Var2.c.get(messageExtendedMedia);
            }
            if (riVar == null) {
                z10 = z13;
                z11 = z14;
                i3 = L;
            } else {
                float f13 = (riVar.q / f12) * f10;
                float f14 = this.f;
                int i12 = (int) (f13 * f14);
                z10 = z13;
                float f15 = riVar.p;
                float f16 = this.b.i;
                int i13 = (int) (f15 * f16);
                int i14 = (int) ((riVar.e / f12) * f10 * f14);
                int i15 = (int) (riVar.f * f16);
                int i16 = i14;
                int i17 = riVar.l;
                if ((i17 & 1) == 0) {
                    i12 += L;
                    i16 -= L;
                }
                if ((i17 & 4) == 0) {
                    i13 += L;
                    i15 -= L;
                }
                int i18 = i13;
                int i19 = i15;
                if ((i17 & 2) == 0) {
                    i16 -= L;
                }
                int i20 = i16;
                if ((i17 & 8) == 0) {
                    i19 -= L;
                }
                z11 = z14;
                int i21 = i19;
                k4Var.a = i12;
                k4Var.b = i18;
                i3 = L;
                k4Var.c = i12 + i20;
                k4Var.d = i18 + i21;
                imageReceiver.y0(i12, i18, i20, i21);
                int i22 = riVar.l;
                int i23 = i22 & 4;
                int i24 = (i23 == 0 || (i22 & 1) == 0 || z10) ? L2 : L3;
                int i25 = (i23 == 0 || (i22 & 2) == 0 || z10) ? L2 : L3;
                int i26 = i22 & 8;
                int i27 = (i26 == 0 || (i22 & 1) == 0 || z11) ? L2 : L3;
                int i28 = (i26 == 0 || (i22 & 2) == 0 || z11) ? L2 : L3;
                if (!z11) {
                    if (ziVar.Q3()) {
                        i28 = L2;
                    } else {
                        i27 = L2;
                    }
                }
                if (!z10 && q1Var.F) {
                    if (ziVar.Q3()) {
                        i25 = min;
                    } else {
                        i24 = min;
                    }
                }
                imageReceiver.K0(i24, i25, i28, i27);
                float[] fArr = k4Var.s;
                float f17 = i24;
                fArr[1] = f17;
                fArr[z15 ? 1 : 0] = f17;
                float f18 = i25;
                fArr[3] = f18;
                fArr[c10] = f18;
                float f19 = i28;
                fArr[5] = f19;
                fArr[4] = f19;
                float f20 = i27;
                fArr[7] = f20;
                fArr[6] = f20;
                if (ziVar != null && ziVar.p4()) {
                    k4Var.b(3);
                }
                this.i = (this.i || k4Var.h) ? true : z15 ? 1 : 0;
            }
            i11++;
            f11 = f12;
            c2 = c10;
            z12 = z15 ? 1 : 0;
            z13 = z10;
            L = i3;
            z14 = z11;
        }
        boolean z16 = z12;
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = ziVar == null ? null : (TLRPC.TL_messageMediaPaidMedia) ziVar.k.media;
            if (tL_messageMediaPaidMedia != null) {
                ly0 ly0Var = new ly0(wb.a1(z16, bd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                this.q = ly0Var;
                if (ly0Var.c > this.g - org.telegram.messenger.g0.L(30.0f)) {
                    this.q = new ly0(wb.a1(false, bd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
        }
    }
}
