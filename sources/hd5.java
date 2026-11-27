// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hd5 {
    public int A;
    public int B;
    public boolean C;
    public final wb2 a;
    public fd5 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final mm j;
    public va6 k;
    public final mpa l;
    public int m;
    public final v41 n;
    public gd5 o;
    public boolean p;
    public pkb q;
    public pkb r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public hd5(wb2 wb2Var) {
        this.a = wb2Var;
        this.l = mpa.e(wb2Var);
        this.j = new mm(wb2Var, 0L, 350L, k43.h);
        this.n = new v41(wb2Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((gd5) obj).f.R0) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        wb2 wb2Var;
        RectF rectF;
        Path path;
        float f;
        float f2;
        float f3;
        float f4;
        Path path2;
        float f5;
        r47 r47Var;
        float f6;
        long[] jArr;
        d7a d7aVar;
        int max;
        Canvas canvas2 = canvas;
        if (this.b != null) {
            boolean z = this.i;
            mm mmVar = this.j;
            float d = mmVar.d(z);
            float d2 = mmVar.d(this.i);
            wb2 wb2Var2 = this.a;
            r47 messageObject = wb2Var2.getMessageObject();
            Path path3 = this.u;
            path3.rewind();
            float f7 = Float.MAX_VALUE;
            float f8 = Float.MIN_VALUE;
            float f9 = Float.MIN_VALUE;
            int i = 0;
            float f10 = Float.MAX_VALUE;
            while (true) {
                arrayList = this.c;
                if (i >= arrayList.size()) {
                    break;
                }
                gd5 gd5Var = (gd5) arrayList.get(i);
                ImageReceiver imageReceiver = gd5Var.f;
                RadialProgress2 radialProgress2 = gd5Var.H;
                int i2 = this.d;
                int i3 = gd5Var.a;
                float f11 = d;
                int i4 = this.e;
                int i5 = gd5Var.b;
                float f12 = d2;
                wb2 wb2Var3 = wb2Var2;
                imageReceiver.i0(i2 + i3, i4 + i5, gd5Var.c - i3, gd5Var.d - i5);
                imageReceiver.h(canvas2, null);
                if (imageReceiver.m() != null) {
                    imageReceiver.m().getClass();
                    if (!gd5Var.y && gd5Var.L != (max = Math.max(0, gd5Var.K))) {
                        gd5Var.L = max;
                        gd5Var.M = new pkb(hl.g0(max, true, false), 12.0f, null);
                    }
                }
                if (f12 > 0.0f) {
                    float min = Math.min(this.d + gd5Var.a, f7);
                    float min2 = Math.min(this.e + gd5Var.b, f10);
                    f8 = Math.max(this.d + gd5Var.c, f8);
                    f9 = Math.max(this.e + gd5Var.d, f9);
                    RectF rectF2 = hl.P;
                    float f13 = gd5Var.a + this.d;
                    int i6 = this.e;
                    rectF2.set(f13, gd5Var.b + i6, r9 + gd5Var.c, i6 + gd5Var.d);
                    path3.addRoundRect(rectF2, gd5Var.s, Path.Direction.CW);
                    f7 = min;
                    f10 = min2;
                }
                radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
                RectF rectF3 = radialProgress2.a;
                float f14 = imageReceiver.L0;
                float f15 = imageReceiver.N0 / 2.0f;
                float f16 = radialProgress2.x;
                float f17 = f7;
                float f18 = f10;
                float f19 = imageReceiver.M0;
                float f20 = imageReceiver.O0 / 2.0f;
                rectF3.set((f15 - f16) + f14, (f20 - f16) + f19, f15 + f16 + f14, f20 + f16 + f19);
                boolean n4 = messageObject.n4();
                int i7 = messageObject.K1;
                if (n4) {
                    r7a B = r7a.B(i7);
                    long[] t = in5.z().t(gd5Var.G);
                    int e1 = messageObject.e1();
                    HashMap hashMap = B.a;
                    if (hashMap != null) {
                        Iterator it = hashMap.values().iterator();
                        d7a d7aVar2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                r47Var = messageObject;
                                jArr = t;
                                f6 = f8;
                                break;
                            }
                            ArrayList arrayList2 = (ArrayList) it.next();
                            if (arrayList2 != null) {
                                int size = arrayList2.size();
                                r47Var = messageObject;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size) {
                                        jArr = t;
                                        f6 = f8;
                                        break;
                                    }
                                    Object obj = arrayList2.get(i8);
                                    int i9 = i8 + 1;
                                    d7a d7aVar3 = (d7a) obj;
                                    jArr = t;
                                    ArrayList arrayList3 = d7aVar3.z;
                                    if (arrayList3 != null) {
                                        int size2 = arrayList3.size();
                                        f6 = f8;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size2) {
                                                break;
                                            }
                                            Object obj2 = arrayList3.get(i10);
                                            i10++;
                                            int i11 = size2;
                                            TLRPC.Message message = (TLRPC.Message) obj2;
                                            if (message != null && message.id == e1) {
                                                d7aVar2 = d7aVar3;
                                                break;
                                            }
                                            size2 = i11;
                                        }
                                        if (d7aVar2 != null) {
                                            break;
                                        }
                                        t = jArr;
                                        i8 = i9;
                                        f8 = f6;
                                    } else {
                                        t = jArr;
                                        i8 = i9;
                                    }
                                }
                                if (d7aVar2 != null) {
                                    break;
                                }
                                t = jArr;
                                messageObject = r47Var;
                                f8 = f6;
                            }
                        }
                        d7aVar = d7aVar2;
                    } else {
                        r47Var = messageObject;
                        jArr = t;
                        f6 = f8;
                        d7aVar = null;
                    }
                    if (d7aVar != null && i >= 0 && i < d7aVar.z.size()) {
                        e1 = ((TLRPC.Message) d7aVar.z.get(i)).id;
                    }
                    boolean z2 = B.c.indexOfKey(e1) >= 0 || B.d.indexOfKey(e1) >= 0;
                    if (jArr == null && z2) {
                        radialProgress2.o(true, 1.0f);
                        gd5Var.b(gd5Var.x ? 6 : gd5Var.a());
                    }
                } else {
                    r47Var = messageObject;
                    f6 = f8;
                    if (xb4.G(i7).S(gd5Var.w)) {
                        gd5Var.b(3);
                    } else {
                        gd5Var.b(gd5Var.a());
                    }
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f12) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i++;
                f10 = f18;
                d = f11;
                wb2Var2 = wb2Var3;
                d2 = f12;
                f7 = f17;
                messageObject = r47Var;
                f8 = f6;
            }
            float f21 = d;
            float f22 = d2;
            wb2 wb2Var4 = wb2Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f7, f10);
                int i12 = (int) (f8 - f7);
                int i13 = (int) (f9 - f10);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i12, i13, (int) (f22 * 255.0f), 31);
                this.l.c(canvas, wb2Var4, i12, i13, 1.0f, wb2Var4.Tc);
                canvas2 = canvas;
                wb2Var = wb2Var4;
                canvas2.restore();
                canvas2.restore();
                wb2Var.invalidate();
            } else {
                wb2Var = wb2Var4;
            }
            int i14 = 0;
            while (true) {
                int size3 = arrayList.size();
                rectF = this.v;
                path = this.t;
                if (i14 >= size3) {
                    break;
                }
                gd5 gd5Var2 = (gd5) arrayList.get(i14);
                if (gd5Var2.M != null) {
                    float L = hl.L(11.4f) + gd5Var2.M.c;
                    float L2 = hl.L(17.0f);
                    float L3 = hl.L(5.0f);
                    float f23 = this.d + gd5Var2.a + L3;
                    float f24 = this.e + gd5Var2.b + L3;
                    rectF.set(f23, f24, L + f23, f24 + L2);
                    if (this.r == null || rectF.right <= ((this.d + this.g) - (hl.L(11.32f) + this.r.c)) - L3 || rectF.top > this.e + L3) {
                        path.rewind();
                        float f25 = L2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f5 = f22;
                        c(canvas2, f5);
                        canvas2.drawColor(aob.p1(1.0f, TLObject.FLAG_30));
                        gd5Var2.M.c(this.d + gd5Var2.a + L3 + hl.L(5.66f), this.e + gd5Var2.b + L3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i14++;
                        f22 = f5;
                    }
                }
                f5 = f22;
                i14++;
                f22 = f5;
            }
            if (this.q == null || f21 <= 0.0f) {
                f = 11.32f;
                f2 = 5.0f;
                f3 = 17.0f;
                f4 = f21;
                path2 = path;
            } else {
                float a = this.n.a(0.05f);
                float L4 = hl.L(28.0f) + this.q.c;
                float L5 = hl.L(32.0f);
                float f26 = this.d;
                float f27 = this.g;
                float z3 = bp1.z(f27, L4, 2.0f, f26);
                f = 11.32f;
                float f28 = this.e;
                f2 = 5.0f;
                float f29 = this.h;
                f3 = 17.0f;
                rectF.set(z3, bp1.z(f29, L5, 2.0f, f28), qd4.e(f27, L4, 2.0f, f26), qd4.e(f29, L5, 2.0f, f28));
                path.rewind();
                float f30 = L5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a, a, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f4 = f21;
                c(canvas2, f4);
                canvas2.drawColor(aob.p1(f4, 1342177280));
                path2 = path;
                this.q.c((((this.g / 2.0f) + this.d) - (L4 / 2.0f)) + hl.L(14.0f), this.e + (this.h / 2.0f), f4, -1, canvas2);
                canvas2.restore();
                if (wb2Var.getDelegate() == null || !wb2Var.getDelegate().k1(wb2Var, 5)) {
                    va6 va6Var = this.k;
                    if (va6Var != null && !va6Var.d() && !this.k.c()) {
                        this.k.a();
                    }
                } else {
                    va6 va6Var2 = this.k;
                    if (va6Var2 == null) {
                        va6 va6Var3 = new va6();
                        this.k = va6Var3;
                        va6Var3.setCallback(wb2Var);
                        this.k.g(aob.p1(0.1f, -1), aob.p1(0.3f, -1), aob.p1(0.35f, -1), aob.p1(0.8f, -1));
                        va6 va6Var4 = this.k;
                        va6Var4.D = true;
                        va6Var4.x.setStrokeWidth(hl.N(1.25f));
                    } else if (va6Var2.c() || this.k.d()) {
                        va6 va6Var5 = this.k;
                        va6Var5.b = -1L;
                        va6Var5.c = -1L;
                    }
                }
                va6 va6Var6 = this.k;
                if (va6Var6 != null) {
                    va6Var6.e(rectF);
                    this.k.j(f30);
                    this.k.setAlpha((int) (f4 * 255.0f));
                    this.k.draw(canvas2);
                }
                canvas2.restore();
            }
            if (this.r == null || f4 >= 1.0f || !a()) {
                return;
            }
            float timeAlpha = wb2Var.getTimeAlpha() * (1.0f - f4);
            float L6 = hl.L(f) + this.r.c;
            float L7 = hl.L(f3);
            float L8 = hl.L(f2);
            float f31 = this.d + this.g;
            float f32 = this.e + L8;
            rectF.set((f31 - L6) - L8, f32, f31 - L8, f32 + L7);
            path2.rewind();
            float f33 = L7 / 2.0f;
            path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path2);
            canvas2.drawColor(aob.p1(timeAlpha, TLObject.FLAG_30));
            this.r.c(hl.L(5.66f) + (((this.d + this.g) - L6) - L8), f33 + this.e + L8, timeAlpha, -1, canvas2);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f) {
        ArrayList arrayList;
        if (this.b != null) {
            wb2 wb2Var = this.a;
            int e1 = wb2Var.getMessageObject() != null ? wb2Var.getMessageObject().e1() : 0;
            int i = this.g;
            int i2 = this.h;
            int max = (int) Math.max(1.0f, i > i2 ? 100.0f : (i / i2) * 100.0f);
            int i3 = this.h;
            int i4 = this.g;
            int max2 = (int) Math.max(1.0f, i3 <= i4 ? 100.0f * (i3 / i4) : 100.0f);
            int i5 = 0;
            int i6 = 0;
            while (true) {
                arrayList = this.c;
                if (i5 >= arrayList.size()) {
                    break;
                }
                gd5 gd5Var = (gd5) arrayList.get(i5);
                if (gd5Var.f.D() && gd5Var.f.n() != null) {
                    i6 |= 1 << i5;
                }
                i5++;
            }
            Bitmap bitmap = this.w;
            if (bitmap == null || this.z != e1 || this.y != i6 || this.A != max || this.B != max2) {
                this.y = i6;
                this.z = e1;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.w);
                float f2 = max / this.g;
                canvas2.scale(f2, f2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    gd5 gd5Var2 = (gd5) arrayList.get(i7);
                    gd5Var2.f.i0(gd5Var2.a, gd5Var2.b, gd5Var2.c - r4, gd5Var2.d - r7);
                    gd5Var2.f.h(canvas2, null);
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
                this.x.setAlpha((int) (f * 255.0f));
                canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
                canvas.restore();
            }
        }
    }

    public final gd5 d(float f, float f2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((gd5) arrayList.get(i)).f.H(f, f2)) {
                return (gd5) arrayList.get(i);
            }
            i++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        mpa mpaVar = this.l;
        if (mpaVar != null) {
            mpaVar.a(this.a);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            gd5 gd5Var = (gd5) arrayList.get(i);
            if (gd5Var.N) {
                gd5Var.N = false;
                gd5Var.f.K();
            }
            i++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z;
        gd5 gd5Var;
        wb2 wb2Var;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            gd5 d = d(x, y);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x, y)) {
                    z2 = true;
                    this.p = z2;
                }
            }
            z2 = false;
            this.p = z2;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gd5 d2 = d(x, y);
            if (d2 != null) {
                RadialProgress2 radialProgress22 = d2.H;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x, y)) {
                    z = true;
                    gd5Var = this.o;
                    if (gd5Var != null && gd5Var == d2) {
                        wb2Var = this.a;
                        if (wb2Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            r47 messageObject = wb2Var.getMessageObject();
                            if (this.p || !z || d2.H.i.q != 3 || messageObject == null) {
                                rb2 delegate = wb2Var.getDelegate();
                                gd5 gd5Var2 = this.o;
                                ImageReceiver imageReceiver = gd5Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = gd5Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.U(wb2Var, messageExtendedMedia);
                            } else if (messageObject.n4()) {
                                r7a.B(messageObject.K1).f(messageObject);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z = false;
            gd5Var = this.o;
            if (gd5Var != null) {
                wb2Var = this.a;
                if (wb2Var.getDelegate() != null) {
                    r47 messageObject2 = wb2Var.getMessageObject();
                    if (this.p) {
                    }
                    rb2 delegate2 = wb2Var.getDelegate();
                    gd5 gd5Var22 = this.o;
                    ImageReceiver imageReceiver2 = gd5Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = gd5Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.U(wb2Var, messageExtendedMedia2);
                }
            }
            this.p = false;
            this.o = null;
        }
        this.n.c(this.o != null);
        return this.o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x0736, code lost:
    
        if (r14 > r3[2]) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0740, code lost:
    
        if (r3[2] > r3[3]) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0751  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(r47 r47Var) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i;
        float[] fArr;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        float f5;
        int i4;
        int i5;
        int i6;
        TLRPC.Document document;
        TLRPC.PhotoSize w;
        r47 r47Var2;
        ArrayList<TLRPC.MessageExtendedMedia> arrayList;
        ArrayList arrayList2;
        j47 j47Var;
        hd5 hd5Var = this;
        if (r47Var == null || (message = r47Var.k) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            fd5 fd5Var = hd5Var.b;
            if (fd5Var == null) {
                fd5Var = new fd5();
                fd5Var.a = new ArrayList();
                fd5Var.b = new ArrayList();
                fd5Var.c = new HashMap();
                fd5Var.h = (short) 800;
                fd5Var.i = 814.0f;
                hd5Var.b = fd5Var;
            }
            fd5Var.a.clear();
            hd5Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            fd5 fd5Var2 = hd5Var.b;
            float f6 = fd5Var2.i;
            ArrayList arrayList3 = fd5Var2.b;
            arrayList3.clear();
            HashMap hashMap = fd5Var2.c;
            hashMap.clear();
            boolean z = false;
            fd5Var2.e = 0;
            ArrayList arrayList4 = fd5Var2.a;
            int size = arrayList4.size();
            if (size == 0) {
                fd5Var2.d = 0;
                fd5Var2.g = 0.0f;
                fd5Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                i = 10;
            } else {
                fd5Var2.h = (short) 800;
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                boolean z2 = false;
                float f7 = 1.0f;
                while (i7 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList4.get(i7);
                    j47 j47Var2 = new j47();
                    j47Var2.h = i7 == size + (-1) ? true : z;
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                        i5 = tL_messageExtendedMediaPreview.w;
                        i6 = tL_messageExtendedMediaPreview.h;
                        i4 = i7;
                    } else {
                        boolean z3 = z;
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia2).photo;
                                if (photo == null) {
                                    i4 = i7;
                                    w = null;
                                    if (w != null) {
                                        int i8 = w.w;
                                        i6 = w.h;
                                        i5 = i8;
                                    }
                                } else {
                                    i4 = i7;
                                    w = xb4.w(photo.sizes, hl.Y0(z3), z3, null, z3);
                                    if (w != null) {
                                    }
                                }
                            } else {
                                i4 = i7;
                                if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) != null) {
                                    w = xb4.w(document.thumbs, hl.Y0(z3), z3, null, z3);
                                    if (w != null) {
                                    }
                                }
                                w = null;
                                if (w != null) {
                                }
                            }
                        } else {
                            i4 = i7;
                        }
                        i5 = 100;
                        i6 = 100;
                    }
                    if (i5 <= 0 || i6 <= 0) {
                        i5 = 50;
                        i6 = 50;
                    }
                    float f8 = i5 / i6;
                    j47Var2.g = f8;
                    if (f8 > 1.2f) {
                        sb.append("w");
                    } else if (f8 < 0.8f) {
                        sb.append("n");
                    } else {
                        sb.append("q");
                    }
                    float f9 = j47Var2.g;
                    f7 += f9;
                    if (f9 > 2.0f) {
                        z2 = true;
                    }
                    hashMap.put(messageExtendedMedia, j47Var2);
                    arrayList3.add(j47Var2);
                    i7 = i4 + 1;
                    z = false;
                }
                float f10 = 1.0f;
                int L = hl.L(120.0f);
                float L2 = hl.L(120.0f);
                Point point = hl.q;
                int min = (int) (L2 / (Math.min(point.x, point.y) / fd5Var2.h));
                float L3 = hl.L(40.0f);
                float min2 = Math.min(point.x, point.y);
                float f11 = fd5Var2.h;
                int i9 = (int) (L3 / (min2 / f11));
                float f12 = f11 / f6;
                float f13 = f7 / size;
                float L4 = hl.L(100.0f) / f6;
                if (size == 1) {
                    j47 j47Var3 = (j47) arrayList3.get(0);
                    float f14 = j47Var3.g;
                    short s = fd5Var2.h;
                    if (f14 >= 1.0f) {
                        f4 = s;
                        f5 = ((f4 / f14) / f4) * f6;
                    } else {
                        f4 = s * ((f14 * f6) / f6);
                        f5 = f6;
                    }
                    j47Var3.a(f5 / f6, 0, 0, 0, 0, (int) f4, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z2) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                j47 j47Var4 = (j47) arrayList3.get(0);
                                j47 j47Var5 = (j47) arrayList3.get(1);
                                String sb2 = sb.toString();
                                if (sb2.equals("ww") && f13 > f12 * 1.4d) {
                                    float f15 = j47Var4.g;
                                    float f16 = j47Var5.g;
                                    if (f15 - f16 < 0.2d) {
                                        float f17 = fd5Var2.h;
                                        float round = Math.round(Math.min(f17 / f15, Math.min(f17 / f16, f6 / 2.0f))) / f6;
                                        j47Var4.a(round, 0, 0, 0, 0, fd5Var2.h, 7);
                                        j47Var5.a(round, 0, 0, 1, 1, fd5Var2.h, 11);
                                    }
                                }
                                if (sb2.equals("ww") || sb2.equals("qq")) {
                                    int i10 = fd5Var2.h / 2;
                                    float f18 = i10;
                                    float round2 = Math.round(Math.min(f18 / j47Var4.g, Math.min(f18 / j47Var5.g, f6))) / f6;
                                    j47Var4.a(round2, 0, 0, 0, 0, i10, 13);
                                    j47Var5.a(round2, 1, 1, 0, 0, i10, 14);
                                    fd5Var2.e = 1;
                                } else {
                                    float f19 = fd5Var2.h;
                                    float f20 = j47Var4.g;
                                    int max = (int) Math.max(f19 * 0.4f, Math.round((f19 / f20) / ((1.0f / j47Var5.g) + (1.0f / f20))));
                                    int i11 = fd5Var2.h - max;
                                    if (i11 < min) {
                                        max -= min - i11;
                                    } else {
                                        min = i11;
                                    }
                                    float min3 = Math.min(f6, Math.round(Math.min(min / j47Var4.g, max / j47Var5.g))) / f6;
                                    j47Var4.a(min3, 0, 0, 0, 0, min, 13);
                                    j47Var5.a(min3, 1, 1, 0, 0, max, 14);
                                    fd5Var2.e = 1;
                                }
                            } else if (size == 3) {
                                j47 j47Var6 = (j47) arrayList3.get(0);
                                j47 j47Var7 = (j47) arrayList3.get(1);
                                j47 j47Var8 = (j47) arrayList3.get(2);
                                if (sb.charAt(0) == 'n') {
                                    float f21 = j47Var7.g;
                                    float min4 = Math.min(f6 * 0.5f, Math.round((fd5Var2.h * f21) / (j47Var8.g + f21)));
                                    float f22 = f6 - min4;
                                    int max2 = (int) Math.max(min, Math.min(fd5Var2.h * 0.5f, Math.round(Math.min(j47Var8.g * min4, j47Var7.g * f22))));
                                    int round3 = Math.round(Math.min((j47Var6.g * f6) + i9, fd5Var2.h - max2));
                                    j47Var6.a(1.0f, 0, 0, 0, 1, round3, 13);
                                    float f23 = f22 / f6;
                                    j47Var7.a(f23, 1, 1, 0, 0, max2, 6);
                                    float f24 = min4 / f6;
                                    j47Var8.a(f24, 1, 1, 1, 1, max2, 10);
                                    short s2 = fd5Var2.h;
                                    j47Var8.i = s2;
                                    j47Var6.m = new float[]{f24, f23};
                                    j47Var7.i = s2 - round3;
                                    j47Var8.j = round3;
                                    fd5Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(fd5Var2.h / j47Var6.g, 0.66f * f6)) / f6;
                                    j47Var6.a(round4, 0, 1, 0, 0, fd5Var2.h, 7);
                                    int i12 = fd5Var2.h / 2;
                                    float f25 = i12;
                                    float min5 = Math.min(f6 - round4, Math.round(Math.min(f25 / j47Var7.g, f25 / j47Var8.g))) / f6;
                                    float f26 = min5 < L4 ? L4 : min5;
                                    j47Var7.a(f26, 0, 0, 1, 1, i12, 9);
                                    j47Var8.a(f26, 1, 1, 1, 1, i12, 10);
                                    fd5Var2.e = 1;
                                }
                            } else {
                                j47 j47Var9 = (j47) arrayList3.get(0);
                                j47 j47Var10 = (j47) arrayList3.get(1);
                                j47 j47Var11 = (j47) arrayList3.get(2);
                                j47 j47Var12 = (j47) arrayList3.get(3);
                                if (sb.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(fd5Var2.h / j47Var9.g, f6 * 0.66f)) / f6;
                                    j47Var9.a(round5, 0, 2, 0, 0, fd5Var2.h, 7);
                                    float round6 = Math.round(fd5Var2.h / ((j47Var10.g + j47Var11.g) + j47Var12.g));
                                    float f27 = min;
                                    int max3 = (int) Math.max(f27, Math.min(fd5Var2.h * 0.4f, j47Var10.g * round6));
                                    int max4 = (int) Math.max(Math.max(f27, fd5Var2.h * 0.33f), j47Var12.g * round6);
                                    int i13 = (fd5Var2.h - max3) - max4;
                                    if (i13 < hl.L(58.0f)) {
                                        int L5 = hl.L(58.0f) - i13;
                                        i13 = hl.L(58.0f);
                                        int i14 = L5 / 2;
                                        max3 -= i14;
                                        max4 -= L5 - i14;
                                    }
                                    int i15 = max3;
                                    float min6 = Math.min(f6 - round5, round6) / f6;
                                    float f28 = min6 < L4 ? L4 : min6;
                                    j47Var10.a(f28, 0, 0, 1, 1, i15, 9);
                                    j47Var11.a(f28, 1, 1, 1, 1, i13, 8);
                                    j47Var12.a(f28, 2, 2, 1, 1, max4, 10);
                                    fd5Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f6 / ((1.0f / j47Var12.g) + ((1.0f / j47Var11.g) + (1.0f / j47Var10.g)))));
                                    float f29 = L;
                                    float f30 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f29, f30 / j47Var10.g) / f6);
                                    float min8 = Math.min(0.33f, Math.max(f29, f30 / j47Var11.g) / f6);
                                    float f31 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((j47Var9.g * f6) + i9, fd5Var2.h - max5));
                                    j47Var9.a(min7 + min8 + f31, 0, 0, 0, 2, round7, 13);
                                    j47Var10.a(min7, 1, 1, 0, 0, max5, 6);
                                    j47Var11.a(min8, 1, 1, 1, 1, max5, 2);
                                    j47Var11.i = fd5Var2.h;
                                    j47Var12.a(f31, 1, 1, 2, 2, max5, 10);
                                    short s3 = fd5Var2.h;
                                    j47Var12.i = s3;
                                    j47Var10.i = s3 - round7;
                                    j47Var11.j = round7;
                                    j47Var12.j = round7;
                                    j47Var9.m = new float[]{min7, min8, f31};
                                    fd5Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList3.size();
                    float[] fArr2 = new float[size2];
                    int i16 = 0;
                    while (i16 < size) {
                        if (f13 > 1.1f) {
                            f3 = f10;
                            fArr2[i16] = Math.max(f3, ((j47) arrayList3.get(i16)).g);
                        } else {
                            f3 = f10;
                            fArr2[i16] = Math.min(f3, ((j47) arrayList3.get(i16)).g);
                        }
                        fArr2[i16] = Math.max(0.66667f, Math.min(1.7f, fArr2[i16]));
                        i16++;
                        f10 = f3;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (int i17 = 1; i17 < size2; i17++) {
                        int i18 = size2 - i17;
                        if (i17 <= 3 && i18 <= 3) {
                            float a = fd5Var2.a(0, i17, fArr2);
                            float a2 = fd5Var2.a(i17, size2, fArr2);
                            ed5 ed5Var = new ed5();
                            ed5Var.a = new int[]{i17, i18};
                            ed5Var.b = new float[]{a, a2};
                            arrayList5.add(ed5Var);
                        }
                    }
                    int i19 = 1;
                    while (i19 < size2 - 1) {
                        int i20 = 1;
                        while (true) {
                            int i21 = size2 - i19;
                            if (i20 < i21) {
                                int i22 = i21 - i20;
                                if (i19 <= 3) {
                                    if (i20 <= (f13 < 0.85f ? 4 : 3) && i22 <= 3) {
                                        float a3 = fd5Var2.a(0, i19, fArr2);
                                        int i23 = i19 + i20;
                                        float a4 = fd5Var2.a(i19, i23, fArr2);
                                        float a5 = fd5Var2.a(i23, size2, fArr2);
                                        ed5 ed5Var2 = new ed5();
                                        ed5Var2.a = new int[]{i19, i20, i22};
                                        i3 = i19;
                                        ed5Var2.b = new float[]{a3, a4, a5};
                                        arrayList5.add(ed5Var2);
                                        i20++;
                                        i19 = i3;
                                    }
                                }
                                i3 = i19;
                                i20++;
                                i19 = i3;
                            }
                        }
                        i19++;
                    }
                    for (int i24 = 1; i24 < size2 - 2; i24++) {
                        int i25 = 1;
                        while (true) {
                            int i26 = size2 - i24;
                            if (i25 < i26) {
                                int i27 = 1;
                                while (true) {
                                    int i28 = i26 - i25;
                                    if (i27 < i28) {
                                        int i29 = i28 - i27;
                                        if (i24 > 3 || i25 > 3 || i27 > 3 || i29 > 3) {
                                            i2 = i26;
                                        } else {
                                            i2 = i26;
                                            float a6 = fd5Var2.a(0, i24, fArr2);
                                            int i30 = i24 + i25;
                                            float a7 = fd5Var2.a(i24, i30, fArr2);
                                            int i31 = i30 + i27;
                                            float a8 = fd5Var2.a(i30, i31, fArr2);
                                            float a9 = fd5Var2.a(i31, size2, fArr2);
                                            ed5 ed5Var3 = new ed5();
                                            ed5Var3.a = new int[]{i24, i25, i27, i29};
                                            ed5Var3.b = new float[]{a6, a7, a8, a9};
                                            arrayList5.add(ed5Var3);
                                        }
                                        i27++;
                                        i26 = i2;
                                    }
                                }
                                i25++;
                            }
                        }
                    }
                    float f32 = (fd5Var2.h / 3) << 2;
                    ed5 ed5Var4 = null;
                    float f33 = 0.0f;
                    int i32 = 0;
                    while (i32 < arrayList5.size()) {
                        ed5 ed5Var5 = (ed5) arrayList5.get(i32);
                        float f34 = Float.MAX_VALUE;
                        float f35 = f32;
                        int i33 = 0;
                        float f36 = 0.0f;
                        while (true) {
                            float[] fArr3 = ed5Var5.b;
                            fArr = fArr2;
                            if (i33 >= fArr3.length) {
                                break;
                            }
                            float f37 = fArr3[i33];
                            f36 += f37;
                            if (f37 < f34) {
                                f34 = f37;
                            }
                            i33++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f36 - f35);
                        int[] iArr = ed5Var5.a;
                        if (iArr.length > 1) {
                            int i34 = iArr[0];
                            int i35 = iArr[1];
                            if (i34 <= i35) {
                                f = abs;
                                if (iArr.length > 2) {
                                }
                                if (iArr.length > 3) {
                                }
                            } else {
                                f = abs;
                            }
                            f2 = f * 1.2f;
                            if (f34 < min) {
                                f2 *= 1.5f;
                            }
                            if (ed5Var4 != null || f2 < f33) {
                                f33 = f2;
                                ed5Var4 = ed5Var5;
                            }
                            i32++;
                            f32 = f35;
                            fArr2 = fArr;
                        } else {
                            f = abs;
                        }
                        f2 = f;
                        if (f34 < min) {
                        }
                        if (ed5Var4 != null) {
                        }
                        f33 = f2;
                        ed5Var4 = ed5Var5;
                        i32++;
                        f32 = f35;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (ed5Var4 == null) {
                        i = 10;
                        hd5Var = this;
                    } else {
                        int[] iArr2 = ed5Var4.a;
                        int i36 = 0;
                        int i37 = 0;
                        while (i36 < iArr2.length) {
                            int i38 = iArr2[i36];
                            float f38 = ed5Var4.b[i36];
                            int i39 = fd5Var2.h;
                            int i40 = i38 - 1;
                            fd5Var2.e = Math.max(fd5Var2.e, i40);
                            j47 j47Var13 = null;
                            int i41 = 0;
                            while (i41 < i38) {
                                int i42 = (int) (fArr4[i37] * f38);
                                i39 -= i42;
                                j47 j47Var14 = (j47) arrayList3.get(i37);
                                int i43 = i36 == 0 ? 4 : 0;
                                ed5 ed5Var6 = ed5Var4;
                                if (i36 == iArr2.length - 1) {
                                    i43 |= 8;
                                }
                                if (i41 == 0) {
                                    i43 |= 1;
                                }
                                if (i41 == i40) {
                                    i43 |= 2;
                                    j47Var13 = j47Var14;
                                }
                                int i44 = i41;
                                j47Var14.a(Math.max(L4, f38 / f6), i44, i41, i36, i36, i42, i43);
                                i37++;
                                i41 = i44 + 1;
                                ed5Var4 = ed5Var6;
                            }
                            j47Var13.e += i39;
                            j47Var13.i += i39;
                            i36++;
                            ed5Var4 = ed5Var4;
                        }
                    }
                }
                for (int i45 = 0; i45 < size; i45++) {
                    j47 j47Var15 = (j47) arrayList3.get(i45);
                    if (j47Var15.b == fd5Var2.e || (j47Var15.l & 2) != 0) {
                        j47Var15.i += jn7.d3;
                    }
                    if ((j47Var15.l & 1) != 0) {
                        j47Var15.k = true;
                    }
                    if (j47Var15.k) {
                        int i46 = j47Var15.i;
                        if (i46 != 1000) {
                            j47Var15.i = i46 + jn7.s1;
                        }
                        j47Var15.e += jn7.s1;
                    } else if ((j47Var15.l & 2) != 0) {
                        int i47 = j47Var15.i;
                        if (i47 != 1000) {
                            j47Var15.i = i47 - 108;
                        } else {
                            int i48 = j47Var15.j;
                            if (i48 != 0) {
                                j47Var15.j = i48 + jn7.s1;
                            }
                        }
                    }
                }
                int i49 = 0;
                while (i49 < size) {
                    j47 j47Var16 = (j47) arrayList3.get(i49);
                    if (j47Var16.a == 0) {
                        j47Var16.i += jn7.d3;
                    }
                    if ((j47Var16.l & 2) != 0) {
                        j47Var16.k = true;
                    }
                    fd5Var2.e = Math.max(fd5Var2.e, (int) j47Var16.b);
                    fd5Var2.f = Math.max(fd5Var2.f, (int) j47Var16.d);
                    byte b = j47Var16.c;
                    byte b2 = j47Var16.d;
                    byte b3 = j47Var16.a;
                    int i50 = (b2 - b) + 1;
                    float[] fArr5 = new float[i50];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList3.size();
                    int i51 = 0;
                    while (i51 < size3) {
                        j47 j47Var17 = (j47) arrayList3.get(i51);
                        if (j47Var17 != j47Var16 && j47Var17.b < b3) {
                            int min9 = Math.min((int) j47Var17.d, (int) b2) - b;
                            int max6 = Math.max(j47Var17.c - b, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + j47Var17.e;
                                max6++;
                                i49 = i49;
                            }
                        }
                        i51++;
                        i49 = i49;
                    }
                    int i52 = i49;
                    float f39 = 0.0f;
                    for (int i53 = 0; i53 < i50; i53++) {
                        float f40 = fArr5[i53];
                        if (f39 < f40) {
                            f39 = f40;
                        }
                    }
                    j47Var16.o = f39;
                    i49 = i52 + 1;
                }
                for (int i54 = 0; i54 < size; i54++) {
                    j47 j47Var18 = (j47) arrayList3.get(i54);
                    byte b4 = j47Var18.c;
                    int i55 = fd5Var2.e + 1;
                    float[] fArr6 = new float[i55];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList3.size();
                    for (int i56 = 0; i56 < size4; i56++) {
                        j47 j47Var19 = (j47) arrayList3.get(i56);
                        if (j47Var19 != j47Var18 && j47Var19.d < b4) {
                            for (int i57 = j47Var19.a; i57 <= j47Var19.b; i57++) {
                                fArr6[i57] = fArr6[i57] + j47Var19.f;
                            }
                        }
                    }
                    float f41 = 0.0f;
                    for (int i58 = 0; i58 < i55; i58++) {
                        float f42 = fArr6[i58];
                        if (f41 < f42) {
                            f41 = f42;
                        }
                    }
                    j47Var18.n = f41;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList3.size();
                for (int i59 = 0; i59 < size5; i59++) {
                    j47 j47Var20 = (j47) arrayList3.get(i59);
                    int i60 = j47Var20.e;
                    for (int i61 = j47Var20.c; i61 <= j47Var20.d; i61++) {
                        iArr3[i61] = iArr3[i61] + i60;
                    }
                }
                int i62 = iArr3[0];
                for (int i63 = 1; i63 < 10; i63++) {
                    int i64 = iArr3[i63];
                    if (i62 < i64) {
                        i62 = i64;
                    }
                }
                fd5Var2.d = i62;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList3.size();
                for (int i65 = 0; i65 < size6; i65++) {
                    j47 j47Var21 = (j47) arrayList3.get(i65);
                    float f43 = j47Var21.f;
                    for (int i66 = j47Var21.a; i66 <= j47Var21.b; i66++) {
                        fArr7[i66] = fArr7[i66] + f43;
                    }
                }
                float f44 = fArr7[0];
                i = 10;
                for (int i67 = 1; i67 < 10; i67++) {
                    float f45 = fArr7[i67];
                    if (f44 < f45) {
                        f44 = f45;
                    }
                }
                fd5Var2.g = f44;
                hd5Var = this;
            }
            int i68 = hd5Var.m;
            wb2 wb2Var = hd5Var.a;
            if (i68 > 0) {
                hd5Var.f = i68;
                r47Var2 = r47Var;
            } else {
                if (hl.O1()) {
                    hd5Var.f = hl.P0() - hl.L(122.0f);
                    r47Var2 = r47Var;
                } else {
                    r47Var2 = r47Var;
                    hd5Var.f = Math.min(wb2Var.getParentWidth(), hl.q.y) - hl.L((wb2Var.W(r47Var2) ? i : 0) + 64);
                }
                if (wb2Var.b3()) {
                    hd5Var.f -= hl.L(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i69 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = tL_messageMediaPaidMedia3.extended_media;
                arrayList2 = hd5Var.c;
                if (i69 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = arrayList.get(i69);
                gd5 gd5Var = i69 >= arrayList2.size() ? null : (gd5) arrayList2.get(i69);
                if (gd5Var == null) {
                    fd5 fd5Var3 = hd5Var.b;
                    if (messageExtendedMedia2 == null) {
                        fd5Var3.getClass();
                        j47Var = null;
                    } else {
                        j47Var = (j47) fd5Var3.c.get(messageExtendedMedia2);
                    }
                    gd5 gd5Var2 = new gd5(wb2Var, r47Var2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((j47Var.e / 1000.0f) * hd5Var.f), (int) (j47Var.f * hd5Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        gd5Var2.G = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = r47Var2.k;
                        gd5Var2.G = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(gd5Var2.G)) {
                        lq3.q(wb2Var.a6).a(gd5Var2.G, r47Var2, gd5Var2);
                        if (r47Var2.n4()) {
                            gd5Var2.H.o(false, messageExtendedMedia2.uploadProgress);
                        }
                    }
                    if (wb2Var.O0 && !gd5Var2.N) {
                        gd5Var2.N = true;
                        gd5Var2.f.I();
                    }
                    arrayList2.add(gd5Var2);
                } else {
                    gd5Var.c(messageExtendedMedia2, r47Var2);
                }
                i69++;
            }
            int size8 = arrayList.size();
            while (size8 < arrayList2.size()) {
                gd5 gd5Var3 = size8 >= arrayList2.size() ? null : (gd5) arrayList2.get(size8);
                if (gd5Var3 != null) {
                    if (gd5Var3.N) {
                        gd5Var3.N = false;
                        gd5Var3.f.K();
                    }
                    arrayList2.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(r47Var);
            fd5 fd5Var4 = hd5Var.b;
            hd5Var.g = (int) ((fd5Var4.d / 1000.0f) * hd5Var.f);
            hd5Var.h = (int) (fd5Var4.g * fd5Var4.i);
            if (hd5Var.i) {
                pkb pkbVar = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, hl.o());
                hd5Var.q = pkbVar;
                if (pkbVar.c > hd5Var.g - hl.L(30.0f)) {
                    hd5Var.q = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, hl.o());
                }
            }
            if (hd5Var.r == null || hd5Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j = tL_messageMediaPaidMedia3.stars_amount;
                hd5Var.s = j;
                hd5Var.r = new pkb(nza.U0(ob6.H(',', "PaidMediaPrice", (int) j), 0.9f, null), 12.0f, hl.o());
            }
        }
    }

    public final void h(r47 r47Var) {
        float f;
        boolean z;
        boolean z2;
        int i;
        wb2 wb2Var = this.a;
        boolean z3 = false;
        boolean z4 = wb2Var.gb > 0 || (wb2Var.w1 && !TextUtils.isEmpty(r47Var.z));
        boolean z5 = ((wb2Var.w1 || TextUtils.isEmpty(r47Var.z)) && wb2Var.O.p && !wb2Var.x7) ? false : true;
        int i2 = this.m;
        float f2 = 1000.0f;
        if (i2 > 0) {
            f = 1000.0f / this.b.d;
            this.f = i2;
        } else {
            if (hl.O1()) {
                this.f = hl.P0() - hl.L(122.0f);
            } else {
                this.f = Math.min(wb2Var.getParentWidth(), hl.q.y) - hl.L((wb2Var.W(r47Var) ? 10 : 0) + 64);
            }
            if (wb2Var.b3()) {
                this.f -= hl.L(52.0f);
            }
            f = 1.0f;
        }
        fd5 fd5Var = this.b;
        this.g = (int) ((fd5Var.d / 1000.0f) * f * this.f);
        this.h = (int) (fd5Var.g * fd5Var.i);
        this.i = false;
        int L = hl.L(1.0f);
        int L2 = hl.L(4.0f);
        char c = 2;
        int L3 = hl.L(r11 - (xea.U0 > 2 ? 2 : 0));
        int min = Math.min(hl.L(3.0f), L3);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            float f3 = f2;
            j47 j47Var = null;
            if (i3 >= arrayList.size()) {
                break;
            }
            gd5 gd5Var = (gd5) arrayList.get(i3);
            fd5 fd5Var2 = this.b;
            char c2 = c;
            TLRPC.MessageExtendedMedia messageExtendedMedia = gd5Var.F;
            boolean z6 = z3;
            ImageReceiver imageReceiver = gd5Var.f;
            if (messageExtendedMedia == null) {
                fd5Var2.getClass();
            } else {
                j47Var = (j47) fd5Var2.c.get(messageExtendedMedia);
            }
            if (j47Var == null) {
                z = z4;
                z2 = z5;
                i = L;
            } else {
                float f4 = (j47Var.o / f3) * f;
                float f5 = this.f;
                int i4 = (int) (f4 * f5);
                z = z4;
                float f6 = j47Var.n;
                float f7 = this.b.i;
                int i5 = (int) (f6 * f7);
                int i6 = (int) ((j47Var.e / f3) * f * f5);
                int i7 = (int) (j47Var.f * f7);
                int i8 = i6;
                int i9 = j47Var.l;
                if ((i9 & 1) == 0) {
                    i4 += L;
                    i8 -= L;
                }
                if ((i9 & 4) == 0) {
                    i5 += L;
                    i7 -= L;
                }
                int i10 = i5;
                int i11 = i7;
                if ((i9 & 2) == 0) {
                    i8 -= L;
                }
                int i12 = i8;
                if ((i9 & 8) == 0) {
                    i11 -= L;
                }
                z2 = z5;
                int i13 = i11;
                gd5Var.a = i4;
                gd5Var.b = i10;
                i = L;
                gd5Var.c = i4 + i12;
                gd5Var.d = i10 + i13;
                imageReceiver.i0(i4, i10, i12, i13);
                int i14 = j47Var.l;
                int i15 = i14 & 4;
                int i16 = (i15 == 0 || (i14 & 1) == 0 || z) ? L2 : L3;
                int i17 = (i15 == 0 || (i14 & 2) == 0 || z) ? L2 : L3;
                int i18 = i14 & 8;
                int i19 = (i18 == 0 || (i14 & 1) == 0 || z2) ? L2 : L3;
                int i20 = (i18 == 0 || (i14 & 2) == 0 || z2) ? L2 : L3;
                if (!z2) {
                    if (r47Var.O3()) {
                        i20 = L2;
                    } else {
                        i19 = L2;
                    }
                }
                if (!z && wb2Var.F) {
                    if (r47Var.O3()) {
                        i17 = min;
                    } else {
                        i16 = min;
                    }
                }
                imageReceiver.r0(i16, i17, i20, i19);
                float[] fArr = gd5Var.s;
                float f8 = i16;
                fArr[1] = f8;
                fArr[z6 ? 1 : 0] = f8;
                float f9 = i17;
                fArr[3] = f9;
                fArr[c2] = f9;
                float f10 = i20;
                fArr[5] = f10;
                fArr[4] = f10;
                float f11 = i19;
                fArr[7] = f11;
                fArr[6] = f11;
                if (r47Var != null && r47Var.n4()) {
                    gd5Var.b(3);
                }
                this.i = (this.i || gd5Var.h) ? true : z6 ? 1 : 0;
            }
            i3++;
            f2 = f3;
            c = c2;
            z3 = z6 ? 1 : 0;
            z4 = z;
            L = i;
            z5 = z2;
        }
        boolean z7 = z3;
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = r47Var == null ? null : (TLRPC.TL_messageMediaPaidMedia) r47Var.k.media;
            if (tL_messageMediaPaidMedia != null) {
                pkb pkbVar = new pkb(nza.b1(z7, ob6.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, hl.o());
                this.q = pkbVar;
                if (pkbVar.c > this.g - hl.L(30.0f)) {
                    this.q = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, hl.o());
                }
            }
        }
    }
}
