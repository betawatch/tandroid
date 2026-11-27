// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ap8 extends View {
    public final HashSet E;
    public byte F;
    public boolean G;
    public boolean H;
    public xo8 I;
    public xo8 J;
    public xo8 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public xo8 U;
    public float V;
    public float W;
    public final ArrayList a;
    public long a0;
    public final Paint b;
    public w4 b0;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public ll0 h;
    public final ArrayList n;
    public int r;
    public int s;
    public final int w;
    public float x;
    public zo8 y;

    public ap8(Context context, int i) {
        super(context);
        this.a = new ArrayList();
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint();
        this.e = true;
        this.f = -1.0f;
        this.n = new ArrayList();
        this.s = 0;
        this.x = 0.0f;
        this.y = null;
        this.E = new HashSet();
        this.F = (byte) 6;
        this.I = null;
        this.O = 0;
        this.R = new Matrix();
        this.U = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.L = hl.N(14.0f);
        float N = hl.N(12.0f);
        this.M = N;
        float N2 = hl.N(8.0f);
        this.N = N2;
        this.w = (int) ((i - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f = this.L;
        return ((measuredWidth - ((f / 2.0f) * (r5 - 1))) - (f * 2.0f)) / this.s;
    }

    public static xo8 i(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xo8 xo8Var = (xo8) arrayList.get(i2);
            if (!xo8Var.o && xo8Var.a == i) {
                return xo8Var;
            }
        }
        return null;
    }

    public final void a() {
        xo8 xo8Var = new xo8(this, yo8.J);
        xo8Var.a = (byte) 14;
        this.a.add(xo8Var);
    }

    public final void b() {
        xo8 xo8Var = new xo8(this, yo8.K);
        xo8Var.a = (byte) 16;
        this.a.add(xo8Var);
    }

    public final void c() {
        xo8 xo8Var = new xo8(this, yo8.L);
        xo8Var.a = (byte) 17;
        this.a.add(xo8Var);
    }

    public final void d() {
        if (this.G) {
            return;
        }
        if (this.F == 6) {
            this.s = this.a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.E;
        boolean z = hashSet.contains(7) && !hashSet.contains(9);
        byte b = this.F;
        if (b == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (b == 1) {
            if (z) {
                m(7, arrayList);
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
            }
            m(1, arrayList);
            if (!z) {
                m(2, arrayList);
                if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                    arrayList.add(j(3));
                }
            }
            n(4, 12, arrayList);
            if (z) {
                arrayList.add(j(8));
            } else {
                m(12, arrayList);
                n(9, 12, arrayList);
            }
        } else if (b == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(j(13));
        } else if (b == 3 || b == 4) {
            if (z) {
                m(7, arrayList);
            } else {
                m(0, arrayList);
            }
            m(1, arrayList);
            if (z) {
                arrayList.add(j(8));
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
                m(12, arrayList);
                m(9, arrayList);
            }
        } else if (b == 5) {
            m(0, arrayList);
            m(1, arrayList);
        }
        hl.c3(new a58(this, arrayList, (byte) 28));
    }

    public final void e() {
        this.G = true;
    }

    public final boolean f() {
        byte b = this.F;
        return b == 1 || b == 3;
    }

    public final void g() {
        int i = this.O;
        if (i != 0) {
            if (!this.P) {
                this.b.setColor(i);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f = this.L;
            float max = ((measuredWidth - ((f / 2.0f) * Math.max(0, this.s - 1))) - (f * 2.0f)) / Math.max(1, this.s);
            RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.w / 2.0f, this.P ? max * 0.65f : 1.0f, aob.p1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
            this.Q = radialGradient;
            this.c.setShader(radialGradient);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        w4 w4Var = this.b0;
        if (w4Var != null) {
            return w4Var;
        }
        w4 w4Var2 = new w4(this);
        this.b0 = w4Var2;
        return w4Var2;
    }

    public float getRoundRadius() {
        return hl.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.T);
        drawable.setAlpha((int) (f * 255.0f));
        drawable.draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xo8 j(int i) {
        xo8 i2 = i(i, this.a);
        if (i2 != null) {
            if (i == 1) {
                p(i2, false);
            }
            return i2;
        }
        switch (i) {
            case 0:
                i2 = new xo8(this, yo8.d);
                break;
            case 1:
                i2 = new xo8(this);
                p(i2, false);
                break;
            case 2:
                i2 = new xo8(this, yo8.h);
                break;
            case 3:
                i2 = new xo8(this, yo8.n);
                i2.t = true;
                i2.x = (short) 200;
                break;
            case 4:
                i2 = new xo8(this, yo8.r);
                break;
            case 5:
                i2 = new xo8(this, yo8.s);
                this.I = i2;
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 6:
                i2 = new xo8(this, yo8.w);
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 7:
                i2 = new xo8(this, yo8.x);
                i2.t = true;
                i2.v = (short) 300;
                break;
            case 8:
                i2 = new xo8(this, yo8.y);
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 9:
                i2 = new xo8(this, yo8.E);
                i2.t = true;
                i2.u = R.raw.profile_leave;
                i2.x = (short) 300;
                break;
            case 10:
                i2 = new xo8(this, yo8.F);
                i2.t = true;
                i2.u = R.raw.profile_voicechat;
                i2.x = (short) 500;
                break;
            case 11:
                i2 = new xo8(this, yo8.G);
                i2.t = true;
                i2.u = R.raw.profile_voicechat;
                i2.x = (short) 500;
                break;
            case 12:
                i2 = new xo8(this, yo8.H);
                break;
            case 13:
                i2 = new xo8(this, yo8.I);
                i2.t = true;
                i2.x = (short) 300;
                break;
        }
        if (i2 != null) {
            i2.a = i;
        }
        return i2;
    }

    public final boolean k() {
        return this.E.contains(5) && this.I != null;
    }

    public final void l() {
        int i = this.r;
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            jl0 jl0Var = (jl0) arrayList.get(i);
            if (!jl0Var.getBounds().isEmpty()) {
                jl0Var.setBounds(0, 0, 0, 0);
            }
            i++;
        }
    }

    public final void m(int i, ArrayList arrayList) {
        if (this.E.contains(Integer.valueOf(i))) {
            arrayList.add(j(i));
        }
    }

    public final void n(int i, int i2, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i);
        HashSet hashSet = this.E;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i2))) {
            return;
        }
        arrayList.add(j(i));
    }

    public final void o(int i, boolean z) {
        HashSet hashSet = this.E;
        if (z ? hashSet.add(Integer.valueOf(i)) : hashSet.remove(Integer.valueOf(i))) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x013e, code lost:
    
        if (r2.o == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fd, code lost:
    
        if (r5.a != r8.a) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010a, code lost:
    
        if (r5.a == r8.a) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        float f7;
        float f8;
        xo8 xo8Var;
        float f9;
        boolean z;
        byte b;
        xo8 xo8Var2;
        this.r = 0;
        float f10 = this.f;
        if (f10 >= 0.0f) {
            float y = f10 - getY();
            if (y <= 0.0f) {
                l();
                return;
            }
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y);
        }
        float f11 = this.x - this.M;
        float f12 = this.N;
        float max = Math.max(0.0f, f11 - f12);
        if (max <= 0.0f) {
            l();
            return;
        }
        float f13 = this.L;
        float f14 = f13 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        xo8 xo8Var3 = null;
        int i2 = 0;
        float f15 = 2.0f;
        xo8 xo8Var4 = null;
        while (i2 < size) {
            xo8 xo8Var5 = (xo8) arrayList.get(i2);
            boolean z2 = xo8Var5.p;
            RectF rectF = xo8Var5.d;
            if (z2) {
                f5 = max;
                f6 = f12;
                f7 = f14;
                f8 = itemWidth;
            } else {
                if (!xo8Var5.o) {
                    rectF.set(f13, f12, f13 + itemWidth, f12 + max);
                    f13 += itemWidth + f14;
                    if (xo8Var3 == null) {
                        xo8Var3 = xo8Var5;
                    }
                    xo8Var4 = xo8Var5;
                }
                mm mmVar = xo8Var5.e;
                f5 = max;
                RectF rectF2 = xo8Var5.c;
                f6 = f12;
                ap8 ap8Var = xo8Var5.y;
                float f16 = f13;
                RectF rectF3 = xo8Var5.g;
                f7 = f14;
                RectF rectF4 = xo8Var5.f;
                f8 = itemWidth;
                if (xo8Var5.o) {
                    xo8Var5.a();
                } else {
                    boolean z3 = ap8Var.e;
                    float f17 = ap8Var.L;
                    if (z3) {
                        xo8Var5.n = false;
                        rectF2.set(rectF);
                        rectF3.set(rectF);
                        rectF4.set(rectF);
                        mmVar.e(true, 1.0f);
                    } else {
                        boolean z4 = true;
                        if (rectF4.isEmpty()) {
                            xo8Var5.n = true;
                            rectF4.set(rectF);
                            rectF3.set(rectF);
                            boolean z5 = rectF.left - 1.0f <= f17;
                            boolean z6 = rectF.right + 1.0f >= ((float) ap8Var.getMeasuredWidth()) - f17;
                            if (z5 && z6) {
                                xo8Var = xo8Var3;
                            } else {
                                z = z6;
                                xo8 xo8Var6 = ap8Var.J;
                                if (xo8Var6 != null) {
                                    xo8Var = xo8Var3;
                                } else {
                                    xo8Var = xo8Var3;
                                }
                                xo8 xo8Var7 = ap8Var.K;
                                if (xo8Var7 != null) {
                                }
                                b = xo8Var5.a;
                                if (((b != 5 && b != 6) || ap8Var.F != 0) && ((b != 3 && b != 2) || ap8Var.F != 1)) {
                                    if (!z5 && (xo8Var2 = ap8Var.J) != null && !xo8Var2.o) {
                                        z = true;
                                        z5 = false;
                                    } else if (z) {
                                        xo8 xo8Var8 = ap8Var.K;
                                        if (xo8Var8 != null) {
                                        }
                                    }
                                    if (!z5) {
                                        rectF3.left = rectF3.right;
                                    } else if (z) {
                                        rectF3.right = rectF3.left;
                                    } else {
                                        float centerX = rectF4.centerX();
                                        rectF3.right = centerX;
                                        rectF3.left = centerX;
                                    }
                                    f9 = 0.0f;
                                    z4 = true;
                                    mmVar.e(true, 0.0f);
                                }
                                z = false;
                                z5 = true;
                                if (!z5) {
                                }
                                f9 = 0.0f;
                                z4 = true;
                                mmVar.e(true, 0.0f);
                            }
                            z = false;
                            z5 = false;
                            b = xo8Var5.a;
                            if (b != 5) {
                                if (!z5) {
                                }
                                if (z) {
                                }
                                if (!z5) {
                                }
                                f9 = 0.0f;
                                z4 = true;
                                mmVar.e(true, 0.0f);
                            }
                            if (!z5) {
                            }
                            if (z) {
                            }
                            if (!z5) {
                            }
                            f9 = 0.0f;
                            z4 = true;
                            mmVar.e(true, 0.0f);
                        } else {
                            xo8Var = xo8Var3;
                            f9 = 0.0f;
                        }
                        if (!rectF.equals(rectF4)) {
                            rectF3.set(rectF2);
                            rectF4.set(rectF);
                            mmVar.e(z4, f9);
                        }
                        xo8Var5.a();
                        rectF2.set(rectF);
                        f13 = f16;
                        xo8Var3 = xo8Var;
                    }
                }
                xo8Var = xo8Var3;
                f13 = f16;
                xo8Var3 = xo8Var;
            }
            i2++;
            max = f5;
            f12 = f6;
            f14 = f7;
            itemWidth = f8;
        }
        this.J = xo8Var3;
        this.K = xo8Var4;
        float f18 = this.w;
        float l = Utilities.l(max / f18);
        float l2 = Utilities.l((l - 0.2f) / 0.8f);
        if (l2 <= 0.0f) {
            l();
            return;
        }
        int i3 = 0;
        while (true) {
            f = 0.04f;
            if (i3 >= size) {
                break;
            }
            xo8 xo8Var9 = (xo8) arrayList.get(i3);
            boolean z7 = xo8Var9.p;
            v41 v41Var = xo8Var9.b;
            RectF rectF5 = xo8Var9.d;
            if (z7) {
                f4 = l2;
            } else {
                RectF rectF6 = hl.P;
                rectF6.set(rectF5);
                rectF6.inset((1.0f - v41Var.a(0.04f)) * (rectF5.width() / 2.0f), (1.0f - v41Var.a(0.04f)) * (rectF5.height() / 2.0f));
                if (this.h != null) {
                    float b2 = xo8Var9.b() * l2;
                    int i4 = this.r;
                    ArrayList arrayList2 = this.n;
                    if (i4 == arrayList2.size()) {
                        jl0 c = this.h.c(this, qs8.o, false);
                        c.r(roundRadius);
                        arrayList2.add(c);
                    }
                    int i5 = this.r;
                    this.r = i5 + 1;
                    jl0 jl0Var = (jl0) arrayList2.get(i5);
                    f4 = l2;
                    jl0Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(rectF6.bottom));
                    jl0Var.setAlpha((int) (b2 * 255.0f));
                    jl0Var.draw(canvas);
                } else {
                    f4 = l2;
                    Paint paint = this.b;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (((int) (xo8Var9.b() * f4 * alpha)) * (this.Q != null ? 0.1f : 1.0f)));
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint);
                    if (this.Q != null) {
                        Paint paint2 = this.c;
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (xo8Var9.b() * f4 * alpha2));
                        float f19 = rectF6.left;
                        float f20 = rectF6.top;
                        i = i3;
                        Matrix matrix = this.R;
                        matrix.setTranslate(f19, f20);
                        this.Q.setLocalMatrix(matrix);
                        canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint2);
                        paint2.setAlpha(alpha2);
                    } else {
                        i = i3;
                    }
                    paint.setAlpha(alpha);
                    i3 = i + 1;
                    l2 = f4;
                }
            }
            i = i3;
            i3 = i + 1;
            l2 = f4;
        }
        l();
        float l3 = Utilities.l((l - 0.4f) / 0.6f);
        if (l3 > 0.0f) {
            int i6 = 0;
            while (i6 < size) {
                xo8 xo8Var10 = (xo8) arrayList.get(i6);
                if (xo8Var10 != null) {
                    Rect rect = xo8Var10.h;
                    RectF rectF7 = xo8Var10.d;
                    if (!xo8Var10.p) {
                        float a = hl.B(this.O) > 0.72f ? ete.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 1.0f;
                        int f21 = vm2.f(a, -16777216, -1);
                        if (this.T == null || this.S != f21) {
                            this.S = f21;
                            this.T = new PorterDuffColorFilter(f21, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b3 = xo8Var10.b() * l3;
                        float centerX2 = rectF7.centerX();
                        float f22 = a;
                        float centerY = rectF7.centerY();
                        float a2 = xo8Var10.b.a(f) * l;
                        canvas.scale(a2, a2, centerX2, centerY);
                        canvas.clipRect(rectF7);
                        float centerX3 = rectF7.centerX();
                        rectF7.centerY();
                        float L = hl.L(24.0f);
                        float f23 = 0.5f * L;
                        xo8Var10.l.o(rectF7.width() - hl.L(f15));
                        xo8Var10.m = xo8Var10.l.b.getLineCount() >= 3 ? 0.75f : xo8Var10.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, hl.N(1.33f) + c00.c(xo8Var10.l.h(), xo8Var10.m, f18, 3.0f));
                        rect.set((int) (centerX3 - f23), (int) max2, (int) (centerX3 + f23), (int) (max2 + L));
                        b29 b29Var = xo8Var10.k;
                        if (b29Var != null) {
                            b29Var.setBounds(rect);
                        }
                        Drawable drawable = xo8Var10.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = xo8Var10.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float h = ((rect.bottom + rect.top) - ((xo8Var10.l.h() * xo8Var10.m) / f15)) - hl.L(4.66f);
                        canvas.save();
                        float f24 = xo8Var10.m;
                        f2 = f18;
                        float f25 = f15;
                        canvas.scale(f24, f24, centerX2, qu6.d(xo8Var10.l.h(), xo8Var10.m, f25, h));
                        pkb pkbVar = xo8Var10.l;
                        pkbVar.c(centerX2 - (pkbVar.j() / f25), h, b3, f21, canvas);
                        canvas.restore();
                        float f26 = xo8Var10.q;
                        if (f26 != 1.0f) {
                            canvas.scale(f26, f26, rect.centerX(), rect.centerY());
                        }
                        float f27 = (1.0f - f22) * b3;
                        float f28 = f22 * b3;
                        b29 b29Var2 = xo8Var10.k;
                        if (b29Var2 == null) {
                            h(canvas, xo8Var10.j, f27);
                            h(canvas, xo8Var10.i, f28);
                        } else if (xo8Var10.a == 1) {
                            h(canvas, xo8Var10.j, f27);
                            h(canvas, xo8Var10.k, f28);
                        } else {
                            h(canvas, b29Var2, b3);
                        }
                        canvas.restore();
                        if (xo8Var10.x > 0) {
                            f3 = l;
                            if (System.currentTimeMillis() > xo8Var10.x + xo8Var10.w) {
                                xo8Var10.s = false;
                            }
                        } else {
                            f3 = l;
                        }
                        boolean z8 = xo8Var10.s;
                        va6 va6Var = xo8Var10.r;
                        if (z8) {
                            if (va6Var == null) {
                                va6 va6Var2 = new va6();
                                xo8Var10.r = va6Var2;
                                va6Var2.setCallback(this);
                                xo8Var10.r.g(aob.p1(0.1f, -1), aob.p1(0.3f, -1), aob.p1(0.35f, -1), aob.p1(0.8f, -1));
                                va6 va6Var3 = xo8Var10.r;
                                va6Var3.D = true;
                                va6Var3.x.setStrokeWidth(hl.N(1.25f));
                            } else if (va6Var.c() || xo8Var10.r.d()) {
                                va6 va6Var4 = xo8Var10.r;
                                va6Var4.b = -1L;
                                va6Var4.c = -1L;
                            }
                        } else if (va6Var != null && !va6Var.d() && !xo8Var10.r.c()) {
                            xo8Var10.r.a();
                        }
                        va6 va6Var5 = xo8Var10.r;
                        if (va6Var5 != null) {
                            va6Var5.e(rectF7);
                            xo8Var10.r.h(getRoundRadius());
                            xo8Var10.r.setAlpha((int) (b3 * 255.0f));
                            xo8Var10.r.draw(canvas);
                        }
                        i6++;
                        l = f3;
                        f18 = f2;
                        f = 0.04f;
                        f15 = 2.0f;
                    }
                }
                f2 = f18;
                f3 = l;
                i6++;
                l = f3;
                f18 = f2;
                f = 0.04f;
                f15 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.N + this.M), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xo8 xo8Var;
        if (this.x >= hl.L(8.0f)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    xo8 xo8Var2 = (xo8) arrayList.get(i);
                    if (!xo8Var2.o && xo8Var2.d.contains(x, y)) {
                        this.U = xo8Var2;
                        this.V = x;
                        this.W = y;
                        this.a0 = System.currentTimeMillis();
                        this.U.b.c(true);
                        break;
                    }
                    i++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x - this.V) > 20.0f || Math.abs(y - this.W) > 20.0f)) {
                    this.U.b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (xo8Var = this.U) != null) {
                xo8Var.b.c(false);
                if (action == 1 && this.U.d.contains(x, y)) {
                    if (System.currentTimeMillis() - this.a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    xo8 xo8Var3 = this.U;
                    if (xo8Var3.t && !xo8Var3.s) {
                        xo8Var3.s = true;
                        invalidate();
                    }
                    xo8 xo8Var4 = this.U;
                    int i2 = xo8Var4.u;
                    if (i2 != 0) {
                        xo8Var4.d(i2, 0, 0);
                    }
                    this.U.w = System.currentTimeMillis();
                    xo8 xo8Var5 = this.U;
                    zo8 zo8Var = this.y;
                    if (zo8Var != null) {
                        short s = xo8Var5.v;
                        if (s == 0) {
                            byte b = xo8Var5.a;
                            RectF rectF = xo8Var5.d;
                            float f = rectF.left;
                            float f2 = rectF.top;
                            ProfileActivity profileActivity = ((bp8) zo8Var).b;
                            RectF rectF2 = ProfileActivity.Z6;
                            profileActivity.u2(f, f2, b);
                        } else {
                            postDelayed(new a58(this, xo8Var5, (byte) 29), s);
                        }
                    }
                }
                this.U = null;
                return true;
            }
            if (this.U != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(xo8 xo8Var, boolean z) {
        boolean z2 = this.H;
        if (!z) {
            yo8 yo8Var = z2 ? yo8.e : yo8.f;
            xo8Var.d(0, yo8Var.b, yo8Var.c);
            xo8Var.c(ob6.M0(yo8Var.a, null));
        } else if (z2) {
            xo8Var.c(ob6.M0(2131746414, null));
            xo8Var.d(R.raw.profile_unmuting, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        } else {
            xo8Var.c(ob6.M0(2131746413, null));
            xo8Var.d(R.raw.profile_muting, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        }
    }

    public void setGlassFactory(ll0 ll0Var) {
        this.h = ll0Var;
        this.n.clear();
        this.r = 0;
        invalidate();
    }

    public void setNotifications(boolean z) {
        boolean z2 = this.H != z;
        this.H = z;
        xo8 i = i(1, this.a);
        if (i != null) {
            p(i, z2);
            invalidate();
        } else {
            this.E.add(1);
            d();
        }
    }

    public void setOnActionClickListener(zo8 zo8Var) {
        this.y = zo8Var;
    }

    public void setParentExpanded(float f) {
        if (this.d != f) {
            this.d = f;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof va6);
    }
}
