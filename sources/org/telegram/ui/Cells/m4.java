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
import di.pb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.cz;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.my;
import org.telegram.messenger.yi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class m4 {
    public int A;
    public int B;
    public boolean C;
    public final r1 a;
    public k4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.d6 j;
    public q80 k;
    public final xh.e l;
    public int m;
    public final mc n;
    public l4 o;
    public boolean p;
    public xy0 q;
    public xy0 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public m4(r1 r1Var) {
        this.a = r1Var;
        this.l = xh.e.e(r1Var);
        this.j = new org.telegram.ui.Components.d6(r1Var, 0L, 350L, nr.h);
        this.n = new mc(r1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!((l4) obj).f.R0) {
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
        r1 r1Var;
        RectF rectF;
        Path path;
        float f10;
        float f11;
        float f12;
        float f13;
        Path path2;
        float f14;
        boolean o4;
        gj gjVar;
        float f15;
        long[] jArr;
        my myVar;
        int max;
        Canvas canvas2 = canvas;
        if (this.b == null) {
            return;
        }
        boolean z10 = this.i;
        org.telegram.ui.Components.d6 d6Var = this.j;
        float d = d6Var.d(z10);
        float d2 = d6Var.d(this.i);
        r1 r1Var2 = this.a;
        gj messageObject = r1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MIN_VALUE;
        float f18 = Float.MIN_VALUE;
        int i7 = 0;
        float f19 = Float.MAX_VALUE;
        while (true) {
            arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            l4 l4Var = (l4) arrayList.get(i7);
            ImageReceiver imageReceiver = l4Var.f;
            RadialProgress2 radialProgress2 = l4Var.H;
            int i10 = this.d;
            int i11 = l4Var.a;
            float f20 = d;
            int i12 = this.e;
            int i13 = l4Var.b;
            float f21 = d2;
            r1 r1Var3 = r1Var2;
            imageReceiver.y0(i10 + i11, i12 + i13, l4Var.c - i11, l4Var.d - i13);
            imageReceiver.h(canvas2, null);
            if (imageReceiver.m() != null) {
                imageReceiver.m().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!l4Var.y && l4Var.L != (max = Math.max(0, l4Var.K - round))) {
                    l4Var.L = max;
                    l4Var.M = new xy0(org.telegram.messenger.g0.g0(max, true, false), 12.0f, null);
                    if (f21 > 0.0f) {
                        float min = Math.min(this.d + l4Var.a, f19);
                        float min2 = Math.min(this.e + l4Var.b, f16);
                        f18 = Math.max(this.d + l4Var.c, f18);
                        f17 = Math.max(this.e + l4Var.d, f17);
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        float f22 = l4Var.a + this.d;
                        int i14 = this.e;
                        rectF2.set(f22, l4Var.b + i14, r10 + l4Var.c, i14 + l4Var.d);
                        path3.addRoundRect(rectF2, l4Var.s, Path.Direction.CW);
                        f16 = min2;
                        f19 = min;
                    }
                    radialProgress2.g(org.telegram.ui.ActionBar.m6.cf, org.telegram.ui.ActionBar.m6.df, org.telegram.ui.ActionBar.m6.ef, org.telegram.ui.ActionBar.m6.ff);
                    RectF rectF3 = radialProgress2.a;
                    float f23 = imageReceiver.L0;
                    float f24 = imageReceiver.N0 / 2.0f;
                    float f25 = radialProgress2.x;
                    float f26 = f16;
                    float f27 = f19;
                    float f28 = imageReceiver.M0;
                    float f29 = imageReceiver.O0 / 2.0f;
                    rectF3.set((f24 - f25) + f23, (f29 - f25) + f28, f24 + f25 + f23, f29 + f25 + f28);
                    o4 = messageObject.o4();
                    int i15 = messageObject.K1;
                    if (o4) {
                        gjVar = messageObject;
                        f15 = f17;
                        if (org.telegram.messenger.w7.G(i15).S(l4Var.w)) {
                            l4Var.b(3);
                        } else {
                            l4Var.b(l4Var.a());
                        }
                    } else {
                        az C = az.C(i15);
                        long[] x10 = fc.D().x(l4Var.G);
                        int e12 = messageObject.e1();
                        HashMap hashMap = C.a;
                        if (hashMap != null) {
                            Iterator it = hashMap.values().iterator();
                            my myVar2 = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    gjVar = messageObject;
                                    jArr = x10;
                                    f15 = f17;
                                    break;
                                }
                                ArrayList arrayList2 = (ArrayList) it.next();
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    gjVar = messageObject;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= size) {
                                            jArr = x10;
                                            f15 = f17;
                                            break;
                                        }
                                        Object obj = arrayList2.get(i16);
                                        int i17 = i16 + 1;
                                        my myVar3 = (my) obj;
                                        jArr = x10;
                                        ArrayList arrayList3 = myVar3.z;
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
                                                if (message != null && message.id == e12) {
                                                    myVar2 = myVar3;
                                                    break;
                                                }
                                                size2 = i19;
                                            }
                                            if (myVar2 != null) {
                                                break;
                                            }
                                            x10 = jArr;
                                            i16 = i17;
                                            f17 = f15;
                                        }
                                    }
                                    if (myVar2 != null) {
                                        break;
                                    }
                                    x10 = jArr;
                                    messageObject = gjVar;
                                    f17 = f15;
                                }
                            }
                            myVar = myVar2;
                        } else {
                            gjVar = messageObject;
                            jArr = x10;
                            f15 = f17;
                            myVar = null;
                        }
                        if (myVar != null && i7 >= 0 && i7 < myVar.z.size()) {
                            e12 = ((TLRPC.Message) myVar.z.get(i7)).id;
                        }
                        boolean z11 = C.c.indexOfKey(e12) >= 0 || C.d.indexOfKey(e12) >= 0;
                        if (jArr == null && z11) {
                            radialProgress2.p(true, 1.0f);
                            l4Var.b(l4Var.x ? 6 : l4Var.a());
                        }
                    }
                    canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f21) * 255.0f), 31);
                    radialProgress2.draw(canvas2);
                    canvas2.restore();
                    i7++;
                    f19 = f27;
                    d = f20;
                    r1Var2 = r1Var3;
                    d2 = f21;
                    f16 = f26;
                    messageObject = gjVar;
                    f17 = f15;
                }
            }
            if (f21 > 0.0f) {
            }
            radialProgress2.g(org.telegram.ui.ActionBar.m6.cf, org.telegram.ui.ActionBar.m6.df, org.telegram.ui.ActionBar.m6.ef, org.telegram.ui.ActionBar.m6.ff);
            RectF rectF32 = radialProgress2.a;
            float f232 = imageReceiver.L0;
            float f242 = imageReceiver.N0 / 2.0f;
            float f252 = radialProgress2.x;
            float f262 = f16;
            float f272 = f19;
            float f282 = imageReceiver.M0;
            float f292 = imageReceiver.O0 / 2.0f;
            rectF32.set((f242 - f252) + f232, (f292 - f252) + f282, f242 + f252 + f232, f292 + f252 + f282);
            o4 = messageObject.o4();
            int i152 = messageObject.K1;
            if (o4) {
            }
            canvas2.saveLayerAlpha(rectF32, (int) ((1.0f - f21) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i7++;
            f19 = f272;
            d = f20;
            r1Var2 = r1Var3;
            d2 = f21;
            f16 = f262;
            messageObject = gjVar;
            f17 = f15;
        }
        float f30 = d;
        float f31 = d2;
        r1 r1Var4 = r1Var2;
        if (f31 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f19, f16);
            int i20 = (int) (f18 - f19);
            int i21 = (int) (f17 - f16);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i20, i21, (int) (f31 * 255.0f), 31);
            this.l.c(canvas, r1Var4, i20, i21, 1.0f, r1Var4.Hc);
            canvas2 = canvas;
            r1Var = r1Var4;
            canvas2.restore();
            canvas2.restore();
            r1Var.invalidate();
        } else {
            r1Var = r1Var4;
        }
        int i22 = 0;
        while (true) {
            int size3 = arrayList.size();
            rectF = this.v;
            path = this.t;
            if (i22 >= size3) {
                break;
            }
            l4 l4Var2 = (l4) arrayList.get(i22);
            if (l4Var2.M != null) {
                float L = org.telegram.messenger.g0.L(11.4f) + l4Var2.M.c;
                float L2 = org.telegram.messenger.g0.L(17.0f);
                float L3 = org.telegram.messenger.g0.L(5.0f);
                float f32 = this.d + l4Var2.a + L3;
                float f33 = this.e + l4Var2.b + L3;
                rectF.set(f32, f33, L + f32, f33 + L2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (org.telegram.messenger.g0.L(11.32f) + this.r.c)) - L3 || rectF.top > this.e + L3) {
                    path.rewind();
                    float f34 = L2 / 2.0f;
                    path.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f14 = f31;
                    c(canvas2, f14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(1.0f, TLObject.FLAG_30));
                    l4Var2.M.c(this.d + l4Var2.a + L3 + org.telegram.messenger.g0.L(5.66f), this.e + l4Var2.b + L3 + f34, 1.0f, -1, canvas2);
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
            float A = com.google.android.gms.internal.vision.e2.A(f36, L4, 2.0f, f35);
            f10 = 11.32f;
            float f37 = this.e;
            f11 = 5.0f;
            float f38 = this.h;
            f12 = 17.0f;
            rectF.set(A, com.google.android.gms.internal.vision.e2.A(f38, L5, 2.0f, f37), org.telegram.messenger.f3.a(f36, L4, 2.0f, f35), org.telegram.messenger.f3.a(f38, L5, 2.0f, f37));
            path.rewind();
            float f39 = L5 / 2.0f;
            path.addRoundRect(rectF, f39, f39, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a10, a10, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f13 = f30;
            c(canvas2, f13);
            canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(f13, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (L4 / 2.0f)) + org.telegram.messenger.g0.L(14.0f), this.e + (this.h / 2.0f), f13, -1, canvas2);
            canvas2.restore();
            if (r1Var.getDelegate() == null || !r1Var.getDelegate().z1(r1Var, 5)) {
                q80 q80Var = this.k;
                if (q80Var != null && !q80Var.d() && !this.k.c()) {
                    this.k.a();
                }
            } else {
                q80 q80Var2 = this.k;
                if (q80Var2 == null) {
                    q80 q80Var3 = new q80();
                    this.k = q80Var3;
                    q80Var3.setCallback(r1Var);
                    this.k.g(org.telegram.ui.ActionBar.m6.r1(0.1f, -1), org.telegram.ui.ActionBar.m6.r1(0.3f, -1), org.telegram.ui.ActionBar.m6.r1(0.35f, -1), org.telegram.ui.ActionBar.m6.r1(0.8f, -1));
                    q80 q80Var4 = this.k;
                    q80Var4.D = true;
                    q80Var4.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                } else if (q80Var2.c() || this.k.d()) {
                    q80 q80Var5 = this.k;
                    q80Var5.b = -1L;
                    q80Var5.c = -1L;
                }
            }
            q80 q80Var6 = this.k;
            if (q80Var6 != null) {
                q80Var6.e(rectF);
                this.k.k(f39);
                this.k.setAlpha((int) (f13 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f13 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = r1Var.getTimeAlpha() * (1.0f - f13);
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
        canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - L6) - L8) + org.telegram.messenger.g0.L(5.66f), this.e + L8 + f42, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f10) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        r1 r1Var = this.a;
        int e12 = r1Var.getMessageObject() != null ? r1Var.getMessageObject().e1() : 0;
        int i7 = this.g;
        int i10 = this.h;
        int max = (int) Math.max(1.0f, i7 > i10 ? 100.0f : (i7 / i10) * 100.0f);
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
            l4 l4Var = (l4) arrayList.get(i13);
            if (l4Var.f.K() && l4Var.f.n() != null) {
                i14 |= 1 << i13;
            }
            i13++;
        }
        Bitmap bitmap = this.w;
        if (bitmap == null || this.z != e12 || this.y != i14 || this.A != max || this.B != max2) {
            this.y = i14;
            this.z = e12;
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
                l4 l4Var2 = (l4) arrayList.get(i15);
                l4Var2.f.y0(l4Var2.a, l4Var2.b, l4Var2.c - r4, l4Var2.d - r7);
                l4Var2.f.h(canvas2, null);
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

    public final l4 d(float f10, float f11) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((l4) arrayList.get(i7)).f.O(f10, f11)) {
                return (l4) arrayList.get(i7);
            }
            i7++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        xh.e eVar = this.l;
        if (eVar != null) {
            eVar.a(this.a);
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                return;
            }
            l4 l4Var = (l4) arrayList.get(i7);
            if (l4Var.N) {
                l4Var.N = false;
                l4Var.f.R();
            }
            i7++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        l4 l4Var;
        r1 r1Var;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            l4 d = d(x10, y10);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x10, y10)) {
                    z11 = true;
                    this.p = z11;
                }
            }
            z11 = false;
            this.p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            l4 d2 = d(x10, y10);
            if (d2 != null) {
                RadialProgress2 radialProgress22 = d2.H;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y10)) {
                    z10 = true;
                    l4Var = this.o;
                    if (l4Var != null && l4Var == d2) {
                        r1Var = this.a;
                        if (r1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            gj messageObject = r1Var.getMessageObject();
                            if (this.p || !z10 || d2.H.i.q != 3 || messageObject == null) {
                                m1 delegate = r1Var.getDelegate();
                                l4 l4Var2 = this.o;
                                ImageReceiver imageReceiver = l4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = l4Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.X1(r1Var, messageExtendedMedia);
                            } else if (messageObject.o4()) {
                                az.C(messageObject.K1).g(messageObject);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z10 = false;
            l4Var = this.o;
            if (l4Var != null) {
                r1Var = this.a;
                if (r1Var.getDelegate() != null) {
                    gj messageObject2 = r1Var.getMessageObject();
                    if (this.p) {
                    }
                    m1 delegate2 = r1Var.getDelegate();
                    l4 l4Var22 = this.o;
                    ImageReceiver imageReceiver2 = l4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = l4Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.X1(r1Var, messageExtendedMedia2);
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
    public final void g(gj gjVar) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i7;
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
        gj gjVar2;
        ArrayList arrayList;
        yi yiVar;
        m4 m4Var = this;
        if (gjVar == null || (message = gjVar.k) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (m4Var.b == null) {
                k4 k4Var = new k4();
                k4Var.a = new ArrayList();
                k4Var.b = new ArrayList();
                k4Var.c = new HashMap();
                k4Var.h = 800;
                k4Var.i = 814.0f;
                m4Var.b = k4Var;
            }
            m4Var.b.a.clear();
            m4Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            k4 k4Var2 = m4Var.b;
            float f15 = k4Var2.i;
            ArrayList arrayList2 = k4Var2.b;
            arrayList2.clear();
            HashMap hashMap = k4Var2.c;
            hashMap.clear();
            boolean z10 = false;
            k4Var2.e = 0;
            ArrayList arrayList3 = k4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                k4Var2.d = 0;
                k4Var2.g = 0.0f;
                k4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                i7 = 10;
            } else {
                k4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                boolean z11 = false;
                float f16 = 1.0f;
                while (i13 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i13);
                    yi yiVar2 = new yi();
                    yiVar2.h = i13 == size + (-1) ? true : z10;
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                        yiVar2.n = tL_messageExtendedMediaPreview.w;
                        yiVar2.o = tL_messageExtendedMediaPreview.h;
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
                                    yiVar2.n = w10 != null ? 100 : w10.w;
                                    yiVar2.o = w10 != null ? 100 : w10.h;
                                } else {
                                    i12 = i13;
                                    w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(z12), z12, null, z12);
                                    yiVar2.n = w10 != null ? 100 : w10.w;
                                    yiVar2.o = w10 != null ? 100 : w10.h;
                                }
                            } else {
                                i12 = i13;
                                if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) != null) {
                                    w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.Z0(z12), z12, null, z12);
                                    yiVar2.n = w10 != null ? 100 : w10.w;
                                    yiVar2.o = w10 != null ? 100 : w10.h;
                                }
                                w10 = null;
                                yiVar2.n = w10 != null ? 100 : w10.w;
                                yiVar2.o = w10 != null ? 100 : w10.h;
                            }
                        } else {
                            i12 = i13;
                            yiVar2.n = 100;
                            yiVar2.o = 100;
                        }
                    }
                    if (yiVar2.n <= 0 || yiVar2.o <= 0) {
                        yiVar2.n = 50;
                        yiVar2.o = 50;
                    }
                    float f17 = yiVar2.n / yiVar2.o;
                    yiVar2.g = f17;
                    if (f17 > 1.2f) {
                        sb2.append("w");
                    } else if (f17 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    float f18 = yiVar2.g;
                    f16 += f18;
                    if (f18 > 2.0f) {
                        z11 = true;
                    }
                    hashMap.put(messageExtendedMedia, yiVar2);
                    arrayList2.add(yiVar2);
                    i13 = i12 + 1;
                    z10 = false;
                }
                float f19 = 1.0f;
                int L = org.telegram.messenger.g0.L(120.0f);
                float L2 = org.telegram.messenger.g0.L(120.0f);
                Point point = org.telegram.messenger.g0.q;
                int min = (int) (L2 / (Math.min(point.x, point.y) / k4Var2.h));
                float L3 = org.telegram.messenger.g0.L(40.0f);
                float min2 = Math.min(point.x, point.y);
                float f20 = k4Var2.h;
                int i14 = (int) (L3 / (min2 / f20));
                float f21 = f20 / f15;
                float f22 = f16 / size;
                float L4 = org.telegram.messenger.g0.L(100.0f) / f15;
                if (size == 1) {
                    yi yiVar3 = (yi) arrayList2.get(0);
                    float f23 = yiVar3.g;
                    if (f23 >= 1.0f) {
                        f13 = k4Var2.h;
                        f14 = ((f13 / f23) / f13) * f15;
                    } else {
                        f13 = k4Var2.h * ((f23 * f15) / f15);
                        f14 = f15;
                    }
                    yiVar3.a(f14 / f15, 0, 0, 0, 0, (int) f13, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z11) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                yi yiVar4 = (yi) arrayList2.get(0);
                                yi yiVar5 = (yi) arrayList2.get(1);
                                String sb3 = sb2.toString();
                                if (sb3.equals("ww") && f22 > f21 * 1.4d) {
                                    float f24 = yiVar4.g;
                                    float f25 = yiVar5.g;
                                    if (f24 - f25 < 0.2d) {
                                        float f26 = k4Var2.h;
                                        float round = Math.round(Math.min(f26 / f24, Math.min(f26 / f25, f15 / 2.0f))) / f15;
                                        yiVar4.a(round, 0, 0, 0, 0, k4Var2.h, 7);
                                        yiVar5.a(round, 0, 0, 1, 1, k4Var2.h, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i15 = k4Var2.h / 2;
                                    float f27 = i15;
                                    float round2 = Math.round(Math.min(f27 / yiVar4.g, Math.min(f27 / yiVar5.g, f15))) / f15;
                                    yiVar4.a(round2, 0, 0, 0, 0, i15, 13);
                                    yiVar5.a(round2, 1, 1, 0, 0, i15, 14);
                                    k4Var2.e = 1;
                                } else {
                                    float f28 = k4Var2.h;
                                    float f29 = yiVar4.g;
                                    int max = (int) Math.max(f28 * 0.4f, Math.round((f28 / f29) / ((1.0f / yiVar5.g) + (1.0f / f29))));
                                    int i16 = k4Var2.h - max;
                                    if (i16 < min) {
                                        max -= min - i16;
                                    } else {
                                        min = i16;
                                    }
                                    float min3 = Math.min(f15, Math.round(Math.min(min / yiVar4.g, max / yiVar5.g))) / f15;
                                    yiVar4.a(min3, 0, 0, 0, 0, min, 13);
                                    yiVar5.a(min3, 1, 1, 0, 0, max, 14);
                                    k4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                yi yiVar6 = (yi) arrayList2.get(0);
                                yi yiVar7 = (yi) arrayList2.get(1);
                                yi yiVar8 = (yi) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f30 = yiVar7.g;
                                    float min4 = Math.min(f15 * 0.5f, Math.round((k4Var2.h * f30) / (yiVar8.g + f30)));
                                    float f31 = f15 - min4;
                                    int max2 = (int) Math.max(min, Math.min(k4Var2.h * 0.5f, Math.round(Math.min(yiVar8.g * min4, yiVar7.g * f31))));
                                    int round3 = Math.round(Math.min((yiVar6.g * f15) + i14, k4Var2.h - max2));
                                    yiVar6.a(1.0f, 0, 0, 0, 1, round3, 13);
                                    float f32 = f31 / f15;
                                    yiVar7.a(f32, 1, 1, 0, 0, max2, 6);
                                    float f33 = min4 / f15;
                                    yiVar8.a(f33, 1, 1, 1, 1, max2, 10);
                                    int i17 = k4Var2.h;
                                    yiVar8.i = i17;
                                    yiVar6.m = new float[]{f33, f32};
                                    yiVar7.i = i17 - round3;
                                    yiVar8.j = round3;
                                    k4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(k4Var2.h / yiVar6.g, 0.66f * f15)) / f15;
                                    yiVar6.a(round4, 0, 1, 0, 0, k4Var2.h, 7);
                                    int i18 = k4Var2.h / 2;
                                    float f34 = i18;
                                    float min5 = Math.min(f15 - round4, Math.round(Math.min(f34 / yiVar7.g, f34 / yiVar8.g))) / f15;
                                    float f35 = min5 < L4 ? L4 : min5;
                                    yiVar7.a(f35, 0, 0, 1, 1, i18, 9);
                                    yiVar8.a(f35, 1, 1, 1, 1, i18, 10);
                                    k4Var2.e = 1;
                                }
                            } else {
                                yi yiVar9 = (yi) arrayList2.get(0);
                                yi yiVar10 = (yi) arrayList2.get(1);
                                yi yiVar11 = (yi) arrayList2.get(2);
                                yi yiVar12 = (yi) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(k4Var2.h / yiVar9.g, f15 * 0.66f)) / f15;
                                    yiVar9.a(round5, 0, 2, 0, 0, k4Var2.h, 7);
                                    float round6 = Math.round(k4Var2.h / ((yiVar10.g + yiVar11.g) + yiVar12.g));
                                    float f36 = min;
                                    int max3 = (int) Math.max(f36, Math.min(k4Var2.h * 0.4f, yiVar10.g * round6));
                                    int max4 = (int) Math.max(Math.max(f36, k4Var2.h * 0.33f), yiVar12.g * round6);
                                    int i19 = (k4Var2.h - max3) - max4;
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
                                    yiVar10.a(f37, 0, 0, 1, 1, i21, 9);
                                    yiVar11.a(f37, 1, 1, 1, 1, i19, 8);
                                    yiVar12.a(f37, 2, 2, 1, 1, max4, 10);
                                    k4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f15 / ((1.0f / yiVar12.g) + ((1.0f / yiVar11.g) + (1.0f / yiVar10.g)))));
                                    float f38 = L;
                                    float f39 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f38, f39 / yiVar10.g) / f15);
                                    float min8 = Math.min(0.33f, Math.max(f38, f39 / yiVar11.g) / f15);
                                    float f40 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((yiVar9.g * f15) + i14, k4Var2.h - max5));
                                    yiVar9.a(min7 + min8 + f40, 0, 0, 0, 2, round7, 13);
                                    yiVar10.a(min7, 1, 1, 0, 0, max5, 6);
                                    yiVar11.a(min8, 1, 1, 1, 1, max5, 2);
                                    yiVar11.i = k4Var2.h;
                                    yiVar12.a(f40, 1, 1, 2, 2, max5, 10);
                                    int i22 = k4Var2.h;
                                    yiVar12.i = i22;
                                    yiVar10.i = i22 - round7;
                                    yiVar11.j = round7;
                                    yiVar12.j = round7;
                                    yiVar9.m = new float[]{min7, min8, f40};
                                    k4Var2.e = 1;
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
                            fArr2[i23] = Math.max(f12, ((yi) arrayList2.get(i23)).g);
                        } else {
                            f12 = f19;
                            fArr2[i23] = Math.min(f12, ((yi) arrayList2.get(i23)).g);
                        }
                        fArr2[i23] = Math.max(0.66667f, Math.min(1.7f, fArr2[i23]));
                        i23++;
                        f19 = f12;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i24 = 1; i24 < size2; i24++) {
                        int i25 = size2 - i24;
                        if (i24 <= 3 && i25 <= 3) {
                            float a10 = k4Var2.a(0, i24, fArr2);
                            float a11 = k4Var2.a(i24, size2, fArr2);
                            j4 j4Var = new j4();
                            j4Var.a = new int[]{i24, i25};
                            j4Var.b = new float[]{a10, a11};
                            arrayList4.add(j4Var);
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
                                        float a12 = k4Var2.a(0, i26, fArr2);
                                        int i30 = i26 + i27;
                                        float a13 = k4Var2.a(i26, i30, fArr2);
                                        float a14 = k4Var2.a(i30, size2, fArr2);
                                        j4 j4Var2 = new j4();
                                        j4Var2.a = new int[]{i26, i27, i29};
                                        i11 = i26;
                                        j4Var2.b = new float[]{a12, a13, a14};
                                        arrayList4.add(j4Var2);
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
                                            float a15 = k4Var2.a(0, i31, fArr2);
                                            int i37 = i31 + i32;
                                            float a16 = k4Var2.a(i31, i37, fArr2);
                                            int i38 = i37 + i34;
                                            float a17 = k4Var2.a(i37, i38, fArr2);
                                            float a18 = k4Var2.a(i38, size2, fArr2);
                                            j4 j4Var3 = new j4();
                                            j4Var3.a = new int[]{i31, i32, i34, i36};
                                            j4Var3.b = new float[]{a15, a16, a17, a18};
                                            arrayList4.add(j4Var3);
                                        }
                                        i34++;
                                        i33 = i10;
                                    }
                                }
                                i32++;
                            }
                        }
                    }
                    float f41 = (k4Var2.h / 3) * 4;
                    j4 j4Var4 = null;
                    float f42 = 0.0f;
                    int i39 = 0;
                    while (i39 < arrayList4.size()) {
                        j4 j4Var5 = (j4) arrayList4.get(i39);
                        float f43 = Float.MAX_VALUE;
                        float f44 = f41;
                        float f45 = 0.0f;
                        int i40 = 0;
                        while (true) {
                            float[] fArr3 = j4Var5.b;
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
                        int[] iArr = j4Var5.a;
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
                            if (j4Var4 != null || f11 < f42) {
                                f42 = f11;
                                j4Var4 = j4Var5;
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
                        if (j4Var4 != null) {
                        }
                        f42 = f11;
                        j4Var4 = j4Var5;
                        i39++;
                        f41 = f44;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (j4Var4 == null) {
                        i7 = 10;
                        m4Var = this;
                    } else {
                        int[] iArr2 = j4Var4.a;
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < iArr2.length) {
                            int i45 = iArr2[i43];
                            float f47 = j4Var4.b[i43];
                            int i46 = k4Var2.h;
                            int i47 = i45 - 1;
                            k4Var2.e = Math.max(k4Var2.e, i47);
                            yi yiVar13 = null;
                            int i48 = 0;
                            while (i48 < i45) {
                                int i49 = (int) (fArr4[i44] * f47);
                                i46 -= i49;
                                yi yiVar14 = (yi) arrayList2.get(i44);
                                int i50 = i43 == 0 ? 4 : 0;
                                j4 j4Var6 = j4Var4;
                                if (i43 == iArr2.length - 1) {
                                    i50 |= 8;
                                }
                                if (i48 == 0) {
                                    i50 |= 1;
                                }
                                if (i48 == i47) {
                                    i50 |= 2;
                                    yiVar13 = yiVar14;
                                }
                                int i51 = i48;
                                yiVar14.a(Math.max(L4, f47 / f15), i51, i48, i43, i43, i49, i50);
                                i44++;
                                i48 = i51 + 1;
                                j4Var4 = j4Var6;
                            }
                            yiVar13.e += i46;
                            yiVar13.i += i46;
                            i43++;
                            j4Var4 = j4Var4;
                        }
                    }
                }
                for (int i52 = 0; i52 < size; i52++) {
                    yi yiVar15 = (yi) arrayList2.get(i52);
                    if (yiVar15.b == k4Var2.e || (yiVar15.l & 2) != 0) {
                        yiVar15.i += ls.e3;
                    }
                    if ((yiVar15.l & 1) != 0) {
                        yiVar15.k = true;
                    }
                    if (yiVar15.k) {
                        int i53 = yiVar15.i;
                        if (i53 != 1000) {
                            yiVar15.i = i53 + ls.t1;
                        }
                        yiVar15.e += ls.t1;
                    } else if ((yiVar15.l & 2) != 0) {
                        int i54 = yiVar15.i;
                        if (i54 != 1000) {
                            yiVar15.i = i54 - 108;
                        } else {
                            int i55 = yiVar15.j;
                            if (i55 != 0) {
                                yiVar15.j = i55 + ls.t1;
                            }
                        }
                    }
                }
                int i56 = 0;
                while (i56 < size) {
                    yi yiVar16 = (yi) arrayList2.get(i56);
                    if (yiVar16.a == 0) {
                        yiVar16.i += ls.e3;
                    }
                    if ((yiVar16.l & 2) != 0) {
                        yiVar16.k = true;
                    }
                    k4Var2.e = Math.max(k4Var2.e, (int) yiVar16.b);
                    k4Var2.f = Math.max(k4Var2.f, (int) yiVar16.d);
                    byte b10 = yiVar16.c;
                    byte b11 = yiVar16.d;
                    byte b12 = yiVar16.a;
                    int i57 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i57];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i58 = 0;
                    while (i58 < size3) {
                        yi yiVar17 = (yi) arrayList2.get(i58);
                        if (yiVar17 != yiVar16 && yiVar17.b < b12) {
                            int min9 = Math.min((int) yiVar17.d, (int) b11) - b10;
                            int max6 = Math.max(yiVar17.c - b10, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + yiVar17.e;
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
                    yiVar16.q = f48;
                    i56 = i59 + 1;
                }
                for (int i61 = 0; i61 < size; i61++) {
                    yi yiVar18 = (yi) arrayList2.get(i61);
                    byte b13 = yiVar18.c;
                    int i62 = k4Var2.e + 1;
                    float[] fArr6 = new float[i62];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i63 = 0; i63 < size4; i63++) {
                        yi yiVar19 = (yi) arrayList2.get(i63);
                        if (yiVar19 != yiVar18 && yiVar19.d < b13) {
                            for (int i64 = yiVar19.a; i64 <= yiVar19.b; i64++) {
                                fArr6[i64] = fArr6[i64] + yiVar19.f;
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
                    yiVar18.p = f50;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i66 = 0; i66 < size5; i66++) {
                    yi yiVar20 = (yi) arrayList2.get(i66);
                    int i67 = yiVar20.e;
                    for (int i68 = yiVar20.c; i68 <= yiVar20.d; i68++) {
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
                k4Var2.d = i69;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i72 = 0; i72 < size6; i72++) {
                    yi yiVar21 = (yi) arrayList2.get(i72);
                    float f52 = yiVar21.f;
                    for (int i73 = yiVar21.a; i73 <= yiVar21.b; i73++) {
                        fArr7[i73] = fArr7[i73] + f52;
                    }
                }
                float f53 = fArr7[0];
                i7 = 10;
                for (int i74 = 1; i74 < 10; i74++) {
                    float f54 = fArr7[i74];
                    if (f53 < f54) {
                        f53 = f54;
                    }
                }
                k4Var2.g = f53;
                m4Var = this;
            }
            int i75 = m4Var.m;
            r1 r1Var = m4Var.a;
            if (i75 > 0) {
                m4Var.f = i75;
                gjVar2 = gjVar;
            } else {
                if (org.telegram.messenger.g0.Q1()) {
                    m4Var.f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
                    gjVar2 = gjVar;
                } else {
                    gjVar2 = gjVar;
                    m4Var.f = Math.min(r1Var.getParentWidth(), org.telegram.messenger.g0.q.y) - org.telegram.messenger.g0.L((r1Var.U(gjVar2) ? i7 : 0) + 64);
                }
                if (r1Var.b3()) {
                    m4Var.f -= org.telegram.messenger.g0.L(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i76 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = m4Var.c;
                if (i76 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i76);
                l4 l4Var = i76 >= arrayList.size() ? null : (l4) arrayList.get(i76);
                if (l4Var == null) {
                    k4 k4Var3 = m4Var.b;
                    if (messageExtendedMedia2 == null) {
                        k4Var3.getClass();
                        yiVar = null;
                    } else {
                        yiVar = (yi) k4Var3.c.get(messageExtendedMedia2);
                    }
                    l4 l4Var2 = new l4(m4Var.a, gjVar2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((yiVar.e / 1000.0f) * m4Var.f), (int) (yiVar.f * m4Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        l4Var2.G = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = gjVar2.k;
                        l4Var2.G = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(l4Var2.G)) {
                        org.telegram.messenger.a6.q(r1Var.a6).a(l4Var2.G, gjVar2, l4Var2);
                        if (gjVar2.o4()) {
                            l4Var2.H.p(false, messageExtendedMedia2.uploadProgress);
                        }
                    }
                    if (r1Var.O0 && !l4Var2.N) {
                        l4Var2.N = true;
                        l4Var2.f.P();
                    }
                    arrayList.add(l4Var2);
                } else {
                    l4Var.c(messageExtendedMedia2, gjVar2);
                }
                i76++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                l4 l4Var3 = size8 >= arrayList.size() ? null : (l4) arrayList.get(size8);
                if (l4Var3 != null) {
                    if (l4Var3.N) {
                        l4Var3.N = false;
                        l4Var3.f.R();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(gjVar);
            k4 k4Var4 = m4Var.b;
            m4Var.g = (int) ((k4Var4.d / 1000.0f) * m4Var.f);
            m4Var.h = (int) (k4Var4.g * k4Var4.i);
            if (m4Var.i) {
                xy0 xy0Var = new xy0(pb.b1(false, hd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                m4Var.q = xy0Var;
                if (xy0Var.c > m4Var.g - org.telegram.messenger.g0.L(30.0f)) {
                    m4Var.q = new xy0(pb.b1(false, hd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
            if (m4Var.r == null || m4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j3 = tL_messageMediaPaidMedia3.stars_amount;
                m4Var.s = j3;
                m4Var.r = new xy0(pb.U0(hd.H(',', "PaidMediaPrice", (int) j3), 0.9f, null), 12.0f, org.telegram.messenger.g0.o());
            }
        }
    }

    public final void h(gj gjVar) {
        float f10;
        boolean z10;
        boolean z11;
        int i7;
        r1 r1Var = this.a;
        boolean z12 = false;
        boolean z13 = r1Var.Ua > 0 || (r1Var.w1 && !TextUtils.isEmpty(gjVar.z));
        boolean z14 = ((r1Var.w1 || TextUtils.isEmpty(gjVar.z)) && r1Var.O.p && !r1Var.x7) ? false : true;
        int i10 = this.m;
        float f11 = 1000.0f;
        if (i10 > 0) {
            f10 = 1000.0f / this.b.d;
            this.f = i10;
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                this.f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
            } else {
                this.f = Math.min(r1Var.getParentWidth(), org.telegram.messenger.g0.q.y) - org.telegram.messenger.g0.L((r1Var.U(gjVar) ? 10 : 0) + 64);
            }
            if (r1Var.b3()) {
                this.f -= org.telegram.messenger.g0.L(52.0f);
            }
            f10 = 1.0f;
        }
        k4 k4Var = this.b;
        this.g = (int) ((k4Var.d / 1000.0f) * f10 * this.f);
        this.h = (int) (k4Var.g * k4Var.i);
        this.i = false;
        int L = org.telegram.messenger.g0.L(1.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        char c10 = 2;
        int L3 = org.telegram.messenger.g0.L(r11 - (cz.Y0 > 2 ? 2 : 0));
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L3);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            float f12 = f11;
            yi yiVar = null;
            if (i11 >= arrayList.size()) {
                break;
            }
            l4 l4Var = (l4) arrayList.get(i11);
            k4 k4Var2 = this.b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = l4Var.F;
            boolean z15 = z12;
            ImageReceiver imageReceiver = l4Var.f;
            if (messageExtendedMedia == null) {
                k4Var2.getClass();
            } else {
                yiVar = (yi) k4Var2.c.get(messageExtendedMedia);
            }
            if (yiVar == null) {
                z10 = z13;
                z11 = z14;
                i7 = L;
            } else {
                float f13 = (yiVar.q / f12) * f10;
                float f14 = this.f;
                int i12 = (int) (f13 * f14);
                z10 = z13;
                float f15 = yiVar.p;
                float f16 = this.b.i;
                int i13 = (int) (f15 * f16);
                int i14 = (int) ((yiVar.e / f12) * f10 * f14);
                int i15 = (int) (yiVar.f * f16);
                int i16 = i14;
                int i17 = yiVar.l;
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
                l4Var.a = i12;
                l4Var.b = i18;
                i7 = L;
                l4Var.c = i12 + i20;
                l4Var.d = i18 + i21;
                imageReceiver.y0(i12, i18, i20, i21);
                int i22 = yiVar.l;
                int i23 = i22 & 4;
                int i24 = (i23 == 0 || (i22 & 1) == 0 || z10) ? L2 : L3;
                int i25 = (i23 == 0 || (i22 & 2) == 0 || z10) ? L2 : L3;
                int i26 = i22 & 8;
                int i27 = (i26 == 0 || (i22 & 1) == 0 || z11) ? L2 : L3;
                int i28 = (i26 == 0 || (i22 & 2) == 0 || z11) ? L2 : L3;
                if (!z11) {
                    if (gjVar.P3()) {
                        i28 = L2;
                    } else {
                        i27 = L2;
                    }
                }
                if (!z10 && r1Var.F) {
                    if (gjVar.P3()) {
                        i25 = min;
                    } else {
                        i24 = min;
                    }
                }
                imageReceiver.K0(i24, i25, i28, i27);
                float[] fArr = l4Var.s;
                float f17 = i24;
                fArr[1] = f17;
                fArr[z15 ? 1 : 0] = f17;
                float f18 = i25;
                fArr[3] = f18;
                fArr[c11] = f18;
                float f19 = i28;
                fArr[5] = f19;
                fArr[4] = f19;
                float f20 = i27;
                fArr[7] = f20;
                fArr[6] = f20;
                if (gjVar != null && gjVar.o4()) {
                    l4Var.b(3);
                }
                this.i = (this.i || l4Var.h) ? true : z15 ? 1 : 0;
            }
            i11++;
            f11 = f12;
            c10 = c11;
            z12 = z15 ? 1 : 0;
            z13 = z10;
            L = i7;
            z14 = z11;
        }
        boolean z16 = z12;
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = gjVar == null ? null : (TLRPC.TL_messageMediaPaidMedia) gjVar.k.media;
            if (tL_messageMediaPaidMedia != null) {
                xy0 xy0Var = new xy0(pb.b1(z16, hd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                this.q = xy0Var;
                if (xy0Var.c > this.g - org.telegram.messenger.g0.L(30.0f)) {
                    this.q = new xy0(pb.b1(false, hd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
        }
    }
}
