package org.telegram.ui.Components;

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
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ef0 extends View {
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public bf0 H;
    public bf0 I;
    public bf0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public bf0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList a;
    public af0 a0;
    public final Paint b;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public dh.c h;
    public final ArrayList n;
    public int r;
    public int s;
    public final int w;
    public float x;
    public df0 y;

    public ef0(Context context, int i7) {
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
        this.D = new HashSet();
        this.E = 6;
        this.H = null;
        this.N = 0;
        this.Q = new Matrix();
        this.T = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.K = org.telegram.messenger.g0.N(14.0f);
        float N = org.telegram.messenger.g0.N(12.0f);
        this.L = N;
        float N2 = org.telegram.messenger.g0.N(8.0f);
        this.M = N2;
        this.w = (int) ((i7 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.K;
        return ((measuredWidth - ((f10 / 2.0f) * (r4 - 1))) - (f10 * 2.0f)) / this.s;
    }

    public static bf0 i(int i7, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            bf0 bf0Var = (bf0) list.get(i10);
            if (!bf0Var.o && bf0Var.a == i7) {
                return bf0Var;
            }
        }
        return null;
    }

    public final void a() {
        bf0 bf0Var = new bf0(this, cf0.I);
        bf0Var.a = 14;
        this.a.add(bf0Var);
    }

    public final void b() {
        bf0 bf0Var = new bf0(this, cf0.J);
        bf0Var.a = 16;
        this.a.add(bf0Var);
    }

    public final void c() {
        bf0 bf0Var = new bf0(this, cf0.K);
        bf0Var.a = 17;
        this.a.add(bf0Var);
    }

    public final void d() {
        if (this.F) {
            return;
        }
        if (this.E == 6) {
            this.s = this.a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.D;
        boolean z9 = hashSet.contains(7) && !hashSet.contains(9);
        int i7 = this.E;
        if (i7 == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (i7 == 1) {
            if (z9) {
                m(7, arrayList);
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
            }
            m(1, arrayList);
            if (!z9) {
                m(2, arrayList);
                if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                    arrayList.add(j(3));
                }
            }
            n(4, 12, arrayList);
            if (z9) {
                arrayList.add(j(8));
            } else {
                m(12, arrayList);
                n(9, 12, arrayList);
            }
        } else if (i7 == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(j(13));
        } else if (i7 == 3 || i7 == 4) {
            if (z9) {
                m(7, arrayList);
            } else {
                m(0, arrayList);
            }
            m(1, arrayList);
            if (z9) {
                arrayList.add(j(8));
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
                m(12, arrayList);
                m(9, arrayList);
            }
        } else if (i7 == 5) {
            m(0, arrayList);
            m(1, arrayList);
        }
        org.telegram.messenger.g0.h3(new v80(3, this, arrayList));
    }

    public final void e() {
        this.F = true;
    }

    public final boolean f() {
        int i7 = this.E;
        return i7 == 1 || i7 == 3;
    }

    public final void g() {
        int i7 = this.N;
        if (i7 == 0) {
            return;
        }
        if (!this.O) {
            this.b.setColor(i7);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f10 = this.K;
        float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.s - 1))) - (f10 * 2.0f)) / Math.max(1, this.s);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.w / 2.0f, this.O ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.k6.r1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
        this.P = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.a0 == null) {
            this.a0 = new af0(this);
        }
        return this.a0;
    }

    public float getRoundRadius() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.S);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final bf0 j(int i7) {
        bf0 i10 = i(i7, this.a);
        if (i10 != null) {
            if (i7 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i7) {
            case 0:
                i10 = new bf0(this, cf0.d);
                break;
            case 1:
                i10 = new bf0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new bf0(this, cf0.h);
                break;
            case 3:
                i10 = new bf0(this, cf0.n);
                i10.t = true;
                i10.x = org.telegram.messenger.qs.e3;
                break;
            case 4:
                i10 = new bf0(this, cf0.r);
                break;
            case 5:
                i10 = new bf0(this, cf0.s);
                this.H = i10;
                i10.t = true;
                i10.x = 500;
                break;
            case 6:
                i10 = new bf0(this, cf0.w);
                i10.t = true;
                i10.x = 500;
                break;
            case 7:
                i10 = new bf0(this, cf0.x);
                i10.t = true;
                i10.v = org.telegram.messenger.qs.X4;
                break;
            case 8:
                i10 = new bf0(this, cf0.y);
                i10.t = true;
                i10.x = 500;
                break;
            case 9:
                i10 = new bf0(this, cf0.D);
                i10.t = true;
                i10.u = R.raw.profile_leave;
                i10.x = org.telegram.messenger.qs.X4;
                break;
            case 10:
                i10 = new bf0(this, cf0.E);
                i10.t = true;
                i10.u = R.raw.profile_voicechat;
                i10.x = 500;
                break;
            case 11:
                i10 = new bf0(this, cf0.F);
                i10.t = true;
                i10.u = R.raw.profile_voicechat;
                i10.x = 500;
                break;
            case 12:
                i10 = new bf0(this, cf0.G);
                break;
            case 13:
                i10 = new bf0(this, cf0.H);
                i10.t = true;
                i10.x = org.telegram.messenger.qs.X4;
                break;
        }
        if (i10 != null) {
            i10.a = i7;
        }
        return i10;
    }

    public final boolean k() {
        return this.D.contains(5) && this.H != null;
    }

    public final void l() {
        int i7 = this.r;
        while (true) {
            ArrayList arrayList = this.n;
            if (i7 >= arrayList.size()) {
                return;
            }
            fh.g gVar = (fh.g) arrayList.get(i7);
            if (!gVar.getBounds().isEmpty()) {
                gVar.setBounds(0, 0, 0, 0);
            }
            i7++;
        }
    }

    public final void m(int i7, ArrayList arrayList) {
        if (this.D.contains(Integer.valueOf(i7))) {
            arrayList.add(j(i7));
        }
    }

    public final void n(int i7, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.D;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(j(i7));
    }

    public final void o(int i7, boolean z9) {
        HashSet hashSet = this.D;
        if (z9 ? hashSet.add(Integer.valueOf(i7)) : hashSet.remove(Integer.valueOf(i7))) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        if (r2.o == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fe, code lost:
    
        if (r5.a != r8.a) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010b, code lost:
    
        if (r5.a == r8.a) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        a80 a80Var;
        float f13;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        bf0 bf0Var;
        float f18;
        boolean z9;
        int i10;
        bf0 bf0Var2;
        this.r = 0;
        float f19 = this.f;
        if (f19 >= 0.0f) {
            float y10 = f19 - getY();
            if (y10 <= 0.0f) {
                l();
                return;
            }
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y10);
        }
        float f20 = this.x - this.L;
        float f21 = this.M;
        float max = Math.max(0.0f, f20 - f21);
        if (max <= 0.0f) {
            l();
            return;
        }
        float f22 = this.K;
        float f23 = f22 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        bf0 bf0Var3 = null;
        int i11 = 0;
        float f24 = 2.0f;
        bf0 bf0Var4 = null;
        while (i11 < size) {
            bf0 bf0Var5 = (bf0) arrayList.get(i11);
            boolean z10 = bf0Var5.p;
            RectF rectF = bf0Var5.d;
            if (z10) {
                f14 = max;
                f15 = f21;
                f16 = f23;
                f17 = itemWidth;
            } else {
                if (!bf0Var5.o) {
                    rectF.set(f22, f21, f22 + itemWidth, f21 + max);
                    f22 += itemWidth + f23;
                    if (bf0Var3 == null) {
                        bf0Var3 = bf0Var5;
                    }
                    bf0Var4 = bf0Var5;
                }
                w5 w5Var = bf0Var5.e;
                f14 = max;
                RectF rectF2 = bf0Var5.c;
                f15 = f21;
                ef0 ef0Var = bf0Var5.y;
                float f25 = f22;
                RectF rectF3 = bf0Var5.f;
                f16 = f23;
                RectF rectF4 = bf0Var5.g;
                f17 = itemWidth;
                if (bf0Var5.o) {
                    bf0Var5.a();
                } else {
                    boolean z11 = ef0Var.e;
                    float f26 = ef0Var.K;
                    if (z11) {
                        bf0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        w5Var.e(true, 1.0f);
                    } else {
                        boolean z12 = true;
                        if (rectF3.isEmpty()) {
                            bf0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z13 = rectF.left - 1.0f <= f26;
                            boolean z14 = rectF.right + 1.0f >= ((float) ef0Var.getMeasuredWidth()) - f26;
                            if (z13 && z14) {
                                bf0Var = bf0Var3;
                            } else {
                                z9 = z14;
                                bf0 bf0Var6 = ef0Var.I;
                                if (bf0Var6 != null) {
                                    bf0Var = bf0Var3;
                                } else {
                                    bf0Var = bf0Var3;
                                }
                                bf0 bf0Var7 = ef0Var.J;
                                if (bf0Var7 != null) {
                                }
                                i10 = bf0Var5.a;
                                if (((i10 != 5 && i10 != 6) || ef0Var.E != 0) && ((i10 != 3 && i10 != 2) || ef0Var.E != 1)) {
                                    if (!z13 && (bf0Var2 = ef0Var.I) != null && !bf0Var2.o) {
                                        z9 = true;
                                        z13 = false;
                                    } else if (z9) {
                                        bf0 bf0Var8 = ef0Var.J;
                                        if (bf0Var8 != null) {
                                        }
                                    }
                                    if (!z13) {
                                        rectF4.left = rectF4.right;
                                    } else if (z9) {
                                        rectF4.right = rectF4.left;
                                    } else {
                                        float centerX = rectF3.centerX();
                                        rectF4.right = centerX;
                                        rectF4.left = centerX;
                                    }
                                    f18 = 0.0f;
                                    z12 = true;
                                    w5Var.e(true, 0.0f);
                                }
                                z9 = false;
                                z13 = true;
                                if (!z13) {
                                }
                                f18 = 0.0f;
                                z12 = true;
                                w5Var.e(true, 0.0f);
                            }
                            z9 = false;
                            z13 = false;
                            i10 = bf0Var5.a;
                            if (i10 != 5) {
                                if (!z13) {
                                }
                                if (z9) {
                                }
                                if (!z13) {
                                }
                                f18 = 0.0f;
                                z12 = true;
                                w5Var.e(true, 0.0f);
                            }
                            if (!z13) {
                            }
                            if (z9) {
                            }
                            if (!z13) {
                            }
                            f18 = 0.0f;
                            z12 = true;
                            w5Var.e(true, 0.0f);
                        } else {
                            bf0Var = bf0Var3;
                            f18 = 0.0f;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            w5Var.e(z12, f18);
                        }
                        bf0Var5.a();
                        rectF2.set(rectF);
                        f22 = f25;
                        bf0Var3 = bf0Var;
                    }
                }
                bf0Var = bf0Var3;
                f22 = f25;
                bf0Var3 = bf0Var;
            }
            i11++;
            max = f14;
            f21 = f15;
            f23 = f16;
            itemWidth = f17;
        }
        this.I = bf0Var3;
        this.J = bf0Var4;
        float f27 = this.w;
        float l10 = Utilities.l(max / f27);
        float l11 = Utilities.l((l10 - 0.2f) / 0.8f);
        if (l11 <= 0.0f) {
            l();
            return;
        }
        int i12 = 0;
        while (true) {
            f10 = 0.04f;
            if (i12 >= size) {
                break;
            }
            bf0 bf0Var9 = (bf0) arrayList.get(i12);
            boolean z15 = bf0Var9.p;
            ic icVar = bf0Var9.b;
            RectF rectF5 = bf0Var9.d;
            if (z15) {
                f13 = l11;
            } else {
                RectF rectF6 = org.telegram.messenger.g0.P;
                rectF6.set(rectF5);
                rectF6.inset((1.0f - icVar.a(0.04f)) * (rectF5.width() / 2.0f), (1.0f - icVar.a(0.04f)) * (rectF5.height() / 2.0f));
                if (this.h != null) {
                    float b10 = bf0Var9.b() * l11;
                    int i13 = this.r;
                    ArrayList arrayList2 = this.n;
                    if (i13 == arrayList2.size()) {
                        fh.g c10 = this.h.c(this, if0.o, false);
                        c10.r(roundRadius);
                        arrayList2.add(c10);
                    }
                    int i14 = this.r;
                    this.r = i14 + 1;
                    fh.g gVar = (fh.g) arrayList2.get(i14);
                    f13 = l11;
                    gVar.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(rectF6.bottom));
                    gVar.setAlpha((int) (b10 * 255.0f));
                    gVar.draw(canvas);
                } else {
                    f13 = l11;
                    Paint paint = this.b;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (((int) (bf0Var9.b() * f13 * alpha)) * (this.P != null ? 0.1f : 1.0f)));
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint);
                    if (this.P != null) {
                        Paint paint2 = this.c;
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (bf0Var9.b() * f13 * alpha2));
                        float f28 = rectF6.left;
                        float f29 = rectF6.top;
                        i7 = i12;
                        Matrix matrix = this.Q;
                        matrix.setTranslate(f28, f29);
                        this.P.setLocalMatrix(matrix);
                        canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint2);
                        paint2.setAlpha(alpha2);
                    } else {
                        i7 = i12;
                    }
                    paint.setAlpha(alpha);
                    i12 = i7 + 1;
                    l11 = f13;
                }
            }
            i7 = i12;
            i12 = i7 + 1;
            l11 = f13;
        }
        l();
        float l12 = Utilities.l((l10 - 0.4f) / 0.6f);
        if (l12 > 0.0f) {
            int i15 = 0;
            while (i15 < size) {
                bf0 bf0Var10 = (bf0) arrayList.get(i15);
                if (bf0Var10 != null) {
                    Rect rect = bf0Var10.h;
                    RectF rectF7 = bf0Var10.d;
                    if (!bf0Var10.p) {
                        float a10 = org.telegram.messenger.g0.B(this.N) > 0.72f ? c8.j9.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 1.0f;
                        int f30 = i0.a.f(a10, -16777216, -1);
                        if (this.S == null || this.R != f30) {
                            this.R = f30;
                            this.S = new PorterDuffColorFilter(f30, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = bf0Var10.b() * l12;
                        float centerX2 = rectF7.centerX();
                        float f31 = a10;
                        float centerY = rectF7.centerY();
                        float a11 = bf0Var10.b.a(f10) * l10;
                        canvas.scale(a11, a11, centerX2, centerY);
                        canvas.clipRect(rectF7);
                        float centerX3 = rectF7.centerX();
                        rectF7.centerY();
                        float L = org.telegram.messenger.g0.L(24.0f);
                        float f32 = 0.5f * L;
                        bf0Var10.l.p(rectF7.width() - org.telegram.messenger.g0.L(f24));
                        bf0Var10.m = bf0Var10.l.b.getLineCount() >= 3 ? 0.75f : bf0Var10.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, org.telegram.messenger.g0.N(1.33f) + com.google.android.recaptcha.internal.a.w(bf0Var10.l.i(), bf0Var10.m, f27, 3.0f));
                        rect.set((int) (centerX3 - f32), (int) max2, (int) (centerX3 + f32), (int) (max2 + L));
                        zg0 zg0Var = bf0Var10.k;
                        if (zg0Var != null) {
                            zg0Var.setBounds(rect);
                        }
                        Drawable drawable = bf0Var10.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = bf0Var10.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float i16 = ((rect.bottom + rect.top) - ((bf0Var10.l.i() * bf0Var10.m) / f24)) - org.telegram.messenger.g0.L(4.66f);
                        canvas.save();
                        float f33 = bf0Var10.m;
                        f11 = f27;
                        float f34 = f24;
                        canvas.scale(f33, f33, centerX2, a8.p0.f(bf0Var10.l.i(), bf0Var10.m, f34, i16));
                        my0 my0Var = bf0Var10.l;
                        my0Var.c(centerX2 - (my0Var.k() / f34), i16, b11, f30, canvas);
                        canvas.restore();
                        float f35 = bf0Var10.q;
                        if (f35 != 1.0f) {
                            canvas.scale(f35, f35, rect.centerX(), rect.centerY());
                        }
                        float f36 = (1.0f - f31) * b11;
                        float f37 = f31 * b11;
                        zg0 zg0Var2 = bf0Var10.k;
                        if (zg0Var2 == null) {
                            h(canvas, bf0Var10.j, f36);
                            h(canvas, bf0Var10.i, f37);
                        } else if (bf0Var10.a == 1) {
                            h(canvas, bf0Var10.j, f36);
                            h(canvas, bf0Var10.k, f37);
                        } else {
                            h(canvas, zg0Var2, b11);
                        }
                        canvas.restore();
                        if (bf0Var10.x > 0) {
                            f12 = l10;
                            if (System.currentTimeMillis() > bf0Var10.x + bf0Var10.w) {
                                bf0Var10.s = false;
                                if (bf0Var10.s) {
                                    a80 a80Var2 = bf0Var10.r;
                                    if (a80Var2 != null && !a80Var2.d() && !bf0Var10.r.c()) {
                                        bf0Var10.r.a();
                                    }
                                } else {
                                    a80 a80Var3 = bf0Var10.r;
                                    if (a80Var3 == null) {
                                        a80 a80Var4 = new a80();
                                        bf0Var10.r = a80Var4;
                                        a80Var4.setCallback(this);
                                        bf0Var10.r.g(org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.35f, -1), org.telegram.ui.ActionBar.k6.r1(0.8f, -1));
                                        a80 a80Var5 = bf0Var10.r;
                                        a80Var5.D = true;
                                        a80Var5.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                                    } else if (a80Var3.c() || bf0Var10.r.d()) {
                                        a80 a80Var6 = bf0Var10.r;
                                        a80Var6.b = -1L;
                                        a80Var6.c = -1L;
                                    }
                                }
                                a80Var = bf0Var10.r;
                                if (a80Var == null) {
                                    a80Var.e(rectF7);
                                    bf0Var10.r.i(getRoundRadius());
                                    bf0Var10.r.setAlpha((int) (b11 * 255.0f));
                                    bf0Var10.r.draw(canvas);
                                }
                                i15++;
                                l10 = f12;
                                f27 = f11;
                                f10 = 0.04f;
                                f24 = 2.0f;
                            }
                        } else {
                            f12 = l10;
                        }
                        if (bf0Var10.s) {
                        }
                        a80Var = bf0Var10.r;
                        if (a80Var == null) {
                        }
                        i15++;
                        l10 = f12;
                        f27 = f11;
                        f10 = 0.04f;
                        f24 = 2.0f;
                    }
                }
                f11 = f27;
                f12 = l10;
                i15++;
                l10 = f12;
                f27 = f11;
                f10 = 0.04f;
                f24 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.M + this.L), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bf0 bf0Var;
        if (this.x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.T = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    bf0 bf0Var2 = (bf0) arrayList.get(i7);
                    if (!bf0Var2.o && bf0Var2.d.contains(x10, y10)) {
                        this.T = bf0Var2;
                        this.U = x10;
                        this.V = y10;
                        this.W = System.currentTimeMillis();
                        this.T.b.c(true);
                        break;
                    }
                    i7++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y10 - this.V) > 20.0f)) {
                    this.T.b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (bf0Var = this.T) != null) {
                bf0Var.b.c(false);
                if (action == 1 && this.T.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    bf0 bf0Var3 = this.T;
                    if (bf0Var3.t && !bf0Var3.s) {
                        bf0Var3.s = true;
                        invalidate();
                    }
                    bf0 bf0Var4 = this.T;
                    int i10 = bf0Var4.u;
                    if (i10 != 0) {
                        bf0Var4.d(i10, 0, 0);
                    }
                    this.T.w = System.currentTimeMillis();
                    bf0 bf0Var5 = this.T;
                    df0 df0Var = this.y;
                    if (df0Var != null) {
                        int i11 = bf0Var5.v;
                        if (i11 == 0) {
                            int i12 = bf0Var5.a;
                            RectF rectF = bf0Var5.d;
                            ProfileActivity.m0(((org.telegram.ui.tt0) df0Var).b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new v80(4, this, bf0Var5), i11);
                        }
                    }
                }
                this.T = null;
                return true;
            }
            if (this.T != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(bf0 bf0Var, boolean z9) {
        if (!z9) {
            cf0 cf0Var = this.G ? cf0.e : cf0.f;
            bf0Var.d(0, cf0Var.b, cf0Var.c);
            bf0Var.c(org.telegram.messenger.hd.M0(cf0Var.a, null));
        } else if (this.G) {
            bf0Var.c(org.telegram.messenger.hd.M0(2131746686, null));
            bf0Var.d(R.raw.profile_unmuting, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        } else {
            bf0Var.c(org.telegram.messenger.hd.M0(2131746685, null));
            bf0Var.d(R.raw.profile_muting, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        }
    }

    public void setGlassFactory(dh.c cVar) {
        this.h = cVar;
        this.n.clear();
        this.r = 0;
        invalidate();
    }

    public void setNotifications(boolean z9) {
        boolean z10 = this.G != z9;
        this.G = z9;
        bf0 i7 = i(1, this.a);
        if (i7 != null) {
            p(i7, z10);
            invalidate();
        } else {
            this.D.add(1);
            d();
        }
    }

    public void setOnActionClickListener(df0 df0Var) {
        this.y = df0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof a80);
    }
}
