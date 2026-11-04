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
import android.os.Build;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gf0 extends View {
    public final HashSet E;
    public int F;
    public boolean G;
    public boolean H;
    public df0 I;
    public df0 J;
    public df0 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public df0 U;
    public float V;
    public float W;
    public final ArrayList a;
    public long a0;
    public final Paint b;
    public cf0 b0;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public eh.c h;
    public final ArrayList n;
    public int r;
    public int s;
    public final int w;
    public float x;
    public ff0 y;

    public gf0(Context context, int i3) {
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
        this.F = 6;
        this.I = null;
        this.O = 0;
        this.R = new Matrix();
        this.U = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.L = org.telegram.messenger.g0.N(14.0f);
        float N = org.telegram.messenger.g0.N(12.0f);
        this.M = N;
        float N2 = org.telegram.messenger.g0.N(8.0f);
        this.N = N2;
        this.w = (int) ((i3 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.L;
        return ((measuredWidth - ((f10 / 2.0f) * (r4 - 1))) - (f10 * 2.0f)) / this.s;
    }

    public static df0 i(int i3, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            df0 df0Var = (df0) list.get(i10);
            if (!df0Var.o && df0Var.a == i3) {
                return df0Var;
            }
        }
        return null;
    }

    public final void a() {
        df0 df0Var = new df0(this, ef0.J);
        df0Var.a = 14;
        this.a.add(df0Var);
    }

    public final void b() {
        df0 df0Var = new df0(this, ef0.K);
        df0Var.a = 16;
        this.a.add(df0Var);
    }

    public final void c() {
        df0 df0Var = new df0(this, ef0.L);
        df0Var.a = 17;
        this.a.add(df0Var);
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
        boolean z10 = hashSet.contains(7) && !hashSet.contains(9);
        int i3 = this.F;
        if (i3 == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (i3 == 1) {
            if (z10) {
                m(7, arrayList);
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
            }
            m(1, arrayList);
            if (!z10) {
                m(2, arrayList);
                if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                    arrayList.add(j(3));
                }
            }
            n(4, 12, arrayList);
            if (z10) {
                arrayList.add(j(8));
            } else {
                m(12, arrayList);
                n(9, 12, arrayList);
            }
        } else if (i3 == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(j(13));
        } else if (i3 == 3 || i3 == 4) {
            if (z10) {
                m(7, arrayList);
            } else {
                m(0, arrayList);
            }
            m(1, arrayList);
            if (z10) {
                arrayList.add(j(8));
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
                m(12, arrayList);
                m(9, arrayList);
            }
        } else if (i3 == 5) {
            m(0, arrayList);
            m(1, arrayList);
        }
        org.telegram.messenger.g0.h3(new j50(8, this, arrayList));
    }

    public final void e() {
        this.G = true;
    }

    public final boolean f() {
        int i3 = this.F;
        return i3 == 1 || i3 == 3;
    }

    public final void g() {
        int i3 = this.O;
        if (i3 == 0) {
            return;
        }
        if (!this.P) {
            this.b.setColor(i3);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f10 = this.L;
        float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.s - 1))) - (f10 * 2.0f)) / Math.max(1, this.s);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.w / 2.0f, this.P ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.k6.r1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
        this.Q = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.b0 == null) {
            this.b0 = new cf0(this);
        }
        return this.b0;
    }

    public float getRoundRadius() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.T);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final df0 j(int i3) {
        df0 i10 = i(i3, this.a);
        if (i10 != null) {
            if (i3 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i3) {
            case 0:
                i10 = new df0(this, ef0.d);
                break;
            case 1:
                i10 = new df0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new df0(this, ef0.h);
                break;
            case 3:
                i10 = new df0(this, ef0.n);
                i10.t = true;
                i10.x = org.telegram.messenger.hs.e3;
                break;
            case 4:
                i10 = new df0(this, ef0.r);
                break;
            case 5:
                i10 = new df0(this, ef0.s);
                this.I = i10;
                i10.t = true;
                i10.x = 500;
                break;
            case 6:
                i10 = new df0(this, ef0.w);
                i10.t = true;
                i10.x = 500;
                break;
            case 7:
                i10 = new df0(this, ef0.x);
                i10.t = true;
                i10.v = org.telegram.messenger.hs.X4;
                break;
            case 8:
                i10 = new df0(this, ef0.y);
                i10.t = true;
                i10.x = 500;
                break;
            case 9:
                i10 = new df0(this, ef0.E);
                i10.t = true;
                i10.u = R.raw.profile_leave;
                i10.x = org.telegram.messenger.hs.X4;
                break;
            case 10:
                i10 = new df0(this, ef0.F);
                i10.t = true;
                i10.u = R.raw.profile_voicechat;
                i10.x = 500;
                break;
            case 11:
                i10 = new df0(this, ef0.G);
                i10.t = true;
                i10.u = R.raw.profile_voicechat;
                i10.x = 500;
                break;
            case 12:
                i10 = new df0(this, ef0.H);
                break;
            case 13:
                i10 = new df0(this, ef0.I);
                i10.t = true;
                i10.x = org.telegram.messenger.hs.X4;
                break;
        }
        if (i10 != null) {
            i10.a = i3;
        }
        return i10;
    }

    public final boolean k() {
        return this.E.contains(5) && this.I != null;
    }

    public final void l() {
        int i3 = this.r;
        while (true) {
            ArrayList arrayList = this.n;
            if (i3 >= arrayList.size()) {
                return;
            }
            gh.g gVar = (gh.g) arrayList.get(i3);
            if (!gVar.getBounds().isEmpty()) {
                gVar.setBounds(0, 0, 0, 0);
            }
            i3++;
        }
    }

    public final void m(int i3, ArrayList arrayList) {
        if (this.E.contains(Integer.valueOf(i3))) {
            arrayList.add(j(i3));
        }
    }

    public final void n(int i3, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i3);
        HashSet hashSet = this.E;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(j(i3));
    }

    public final void o(int i3, boolean z10) {
        HashSet hashSet = this.E;
        if (z10 ? hashSet.add(Integer.valueOf(i3)) : hashSet.remove(Integer.valueOf(i3))) {
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
        float f13;
        float f14;
        int i3;
        float f15;
        float f16;
        float f17;
        float f18;
        df0 df0Var;
        float f19;
        boolean z10;
        int i10;
        df0 df0Var2;
        this.r = 0;
        float f20 = this.f;
        if (f20 >= 0.0f) {
            float y9 = f20 - getY();
            if (y9 <= 0.0f) {
                l();
                return;
            }
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y9);
        }
        float f21 = this.x - this.M;
        float f22 = this.N;
        float max = Math.max(0.0f, f21 - f22);
        if (max <= 0.0f) {
            l();
            return;
        }
        float f23 = this.L;
        float f24 = f23 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        df0 df0Var3 = null;
        int i11 = 0;
        float f25 = 2.0f;
        df0 df0Var4 = null;
        while (i11 < size) {
            df0 df0Var5 = (df0) arrayList.get(i11);
            boolean z11 = df0Var5.p;
            RectF rectF = df0Var5.d;
            if (z11) {
                f15 = max;
                f16 = f22;
                f17 = f24;
                f18 = itemWidth;
            } else {
                if (!df0Var5.o) {
                    rectF.set(f23, f22, f23 + itemWidth, f22 + max);
                    f23 += itemWidth + f24;
                    if (df0Var3 == null) {
                        df0Var3 = df0Var5;
                    }
                    df0Var4 = df0Var5;
                }
                u5 u5Var = df0Var5.e;
                f15 = max;
                RectF rectF2 = df0Var5.c;
                f16 = f22;
                gf0 gf0Var = df0Var5.y;
                float f26 = f23;
                RectF rectF3 = df0Var5.f;
                f17 = f24;
                RectF rectF4 = df0Var5.g;
                f18 = itemWidth;
                if (df0Var5.o) {
                    df0Var5.a();
                } else {
                    boolean z12 = gf0Var.e;
                    float f27 = gf0Var.L;
                    if (z12) {
                        df0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        u5Var.e(true, 1.0f);
                    } else {
                        boolean z13 = true;
                        if (rectF3.isEmpty()) {
                            df0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f27;
                            boolean z15 = rectF.right + 1.0f >= ((float) gf0Var.getMeasuredWidth()) - f27;
                            if (z14 && z15) {
                                df0Var = df0Var3;
                            } else {
                                z10 = z15;
                                df0 df0Var6 = gf0Var.J;
                                if (df0Var6 != null) {
                                    df0Var = df0Var3;
                                } else {
                                    df0Var = df0Var3;
                                }
                                df0 df0Var7 = gf0Var.K;
                                if (df0Var7 != null) {
                                }
                                i10 = df0Var5.a;
                                if (((i10 != 5 && i10 != 6) || gf0Var.F != 0) && ((i10 != 3 && i10 != 2) || gf0Var.F != 1)) {
                                    if (!z14 && (df0Var2 = gf0Var.J) != null && !df0Var2.o) {
                                        z10 = true;
                                        z14 = false;
                                    } else if (z10) {
                                        df0 df0Var8 = gf0Var.K;
                                        if (df0Var8 != null) {
                                        }
                                    }
                                    if (!z14) {
                                        rectF4.left = rectF4.right;
                                    } else if (z10) {
                                        rectF4.right = rectF4.left;
                                    } else {
                                        float centerX = rectF3.centerX();
                                        rectF4.right = centerX;
                                        rectF4.left = centerX;
                                    }
                                    f19 = 0.0f;
                                    z13 = true;
                                    u5Var.e(true, 0.0f);
                                }
                                z10 = false;
                                z14 = true;
                                if (!z14) {
                                }
                                f19 = 0.0f;
                                z13 = true;
                                u5Var.e(true, 0.0f);
                            }
                            z10 = false;
                            z14 = false;
                            i10 = df0Var5.a;
                            if (i10 != 5) {
                                if (!z14) {
                                }
                                if (z10) {
                                }
                                if (!z14) {
                                }
                                f19 = 0.0f;
                                z13 = true;
                                u5Var.e(true, 0.0f);
                            }
                            if (!z14) {
                            }
                            if (z10) {
                            }
                            if (!z14) {
                            }
                            f19 = 0.0f;
                            z13 = true;
                            u5Var.e(true, 0.0f);
                        } else {
                            df0Var = df0Var3;
                            f19 = 0.0f;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            u5Var.e(z13, f19);
                        }
                        df0Var5.a();
                        rectF2.set(rectF);
                        f23 = f26;
                        df0Var3 = df0Var;
                    }
                }
                df0Var = df0Var3;
                f23 = f26;
                df0Var3 = df0Var;
            }
            i11++;
            max = f15;
            f22 = f16;
            f24 = f17;
            itemWidth = f18;
        }
        this.J = df0Var3;
        this.K = df0Var4;
        float f28 = this.w;
        float l10 = Utilities.l(max / f28);
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
            df0 df0Var9 = (df0) arrayList.get(i12);
            boolean z16 = df0Var9.p;
            gc gcVar = df0Var9.b;
            RectF rectF5 = df0Var9.d;
            if (z16) {
                f14 = l11;
            } else {
                RectF rectF6 = org.telegram.messenger.g0.P;
                rectF6.set(rectF5);
                rectF6.inset((1.0f - gcVar.a(0.04f)) * (rectF5.width() / 2.0f), (1.0f - gcVar.a(0.04f)) * (rectF5.height() / 2.0f));
                if (this.h != null) {
                    float b10 = df0Var9.b() * l11;
                    int i13 = this.r;
                    ArrayList arrayList2 = this.n;
                    if (i13 == arrayList2.size()) {
                        gh.g c2 = this.h.c(this, kf0.o, false);
                        c2.r(roundRadius);
                        arrayList2.add(c2);
                    }
                    int i14 = this.r;
                    this.r = i14 + 1;
                    gh.g gVar = (gh.g) arrayList2.get(i14);
                    f14 = l11;
                    gVar.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(rectF6.bottom));
                    gVar.setAlpha((int) (b10 * 255.0f));
                    gVar.draw(canvas);
                } else {
                    f14 = l11;
                    Paint paint = this.b;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (((int) (df0Var9.b() * f14 * alpha)) * (this.Q != null ? 0.1f : 1.0f)));
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint);
                    if (this.Q != null) {
                        Paint paint2 = this.c;
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (df0Var9.b() * f14 * alpha2));
                        float f29 = rectF6.left;
                        float f30 = rectF6.top;
                        i3 = i12;
                        Matrix matrix = this.R;
                        matrix.setTranslate(f29, f30);
                        this.Q.setLocalMatrix(matrix);
                        canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint2);
                        paint2.setAlpha(alpha2);
                    } else {
                        i3 = i12;
                    }
                    paint.setAlpha(alpha);
                    i12 = i3 + 1;
                    l11 = f14;
                }
            }
            i3 = i12;
            i12 = i3 + 1;
            l11 = f14;
        }
        l();
        float l12 = Utilities.l((l10 - 0.4f) / 0.6f);
        if (l12 > 0.0f) {
            int i15 = 0;
            while (i15 < size) {
                df0 df0Var10 = (df0) arrayList.get(i15);
                if (df0Var10 != null) {
                    Rect rect = df0Var10.h;
                    RectF rectF7 = df0Var10.d;
                    if (!df0Var10.p) {
                        boolean z17 = org.telegram.messenger.g0.B(this.O) > 0.72f;
                        float a10 = (!z17 || Build.VERSION.SDK_INT >= 31) ? !z17 ? 1.0f : b8.be.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int f31 = i0.a.f(a10, -16777216, -1);
                        if (this.T == null || this.S != f31) {
                            this.S = f31;
                            this.T = new PorterDuffColorFilter(f31, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = df0Var10.b() * l12;
                        float centerX2 = rectF7.centerX();
                        float centerY = rectF7.centerY();
                        float a11 = df0Var10.b.a(f10) * l10;
                        canvas.scale(a11, a11, centerX2, centerY);
                        canvas.clipRect(rectF7);
                        float centerX3 = rectF7.centerX();
                        rectF7.centerY();
                        float L = org.telegram.messenger.g0.L(24.0f);
                        float f32 = 0.5f * L;
                        df0Var10.l.p(rectF7.width() - org.telegram.messenger.g0.L(f25));
                        df0Var10.m = df0Var10.l.b.getLineCount() >= 3 ? 0.75f : df0Var10.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, org.telegram.messenger.g0.N(1.33f) + com.google.android.recaptcha.internal.a.c(df0Var10.l.i(), df0Var10.m, f28, 3.0f));
                        rect.set((int) (centerX3 - f32), (int) max2, (int) (centerX3 + f32), (int) (max2 + L));
                        ch0 ch0Var = df0Var10.k;
                        if (ch0Var != null) {
                            ch0Var.setBounds(rect);
                        }
                        Drawable drawable = df0Var10.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = df0Var10.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float i16 = ((rect.bottom + rect.top) - ((df0Var10.l.i() * df0Var10.m) / f25)) - org.telegram.messenger.g0.L(4.66f);
                        canvas.save();
                        float f33 = df0Var10.m;
                        f11 = f28;
                        float f34 = f25;
                        canvas.scale(f33, f33, centerX2, a1.g.e(df0Var10.l.i(), df0Var10.m, f34, i16));
                        ly0 ly0Var = df0Var10.l;
                        f12 = l10;
                        ly0Var.c(centerX2 - (ly0Var.k() / f34), i16, b11, f31, canvas);
                        canvas.restore();
                        float f35 = df0Var10.q;
                        if (f35 != 1.0f) {
                            canvas.scale(f35, f35, rect.centerX(), rect.centerY());
                        }
                        float f36 = (1.0f - a10) * b11;
                        float f37 = a10 * b11;
                        ch0 ch0Var2 = df0Var10.k;
                        if (ch0Var2 == null) {
                            h(canvas, df0Var10.j, f36);
                            h(canvas, df0Var10.i, f37);
                        } else if (df0Var10.a == 1) {
                            h(canvas, df0Var10.j, f36);
                            h(canvas, df0Var10.k, f37);
                        } else {
                            h(canvas, ch0Var2, b11);
                        }
                        canvas.restore();
                        if (df0Var10.x > 0) {
                            f13 = l12;
                            if (System.currentTimeMillis() > df0Var10.x + df0Var10.w) {
                                df0Var10.s = false;
                            }
                        } else {
                            f13 = l12;
                        }
                        if (df0Var10.s) {
                            w70 w70Var = df0Var10.r;
                            if (w70Var == null) {
                                w70 w70Var2 = new w70();
                                df0Var10.r = w70Var2;
                                w70Var2.setCallback(this);
                                df0Var10.r.g(org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.35f, -1), org.telegram.ui.ActionBar.k6.r1(0.8f, -1));
                                w70 w70Var3 = df0Var10.r;
                                w70Var3.D = true;
                                w70Var3.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                            } else if (w70Var.c() || df0Var10.r.d()) {
                                w70 w70Var4 = df0Var10.r;
                                w70Var4.b = -1L;
                                w70Var4.c = -1L;
                            }
                        } else {
                            w70 w70Var5 = df0Var10.r;
                            if (w70Var5 != null && !w70Var5.d() && !df0Var10.r.c()) {
                                df0Var10.r.a();
                            }
                        }
                        w70 w70Var6 = df0Var10.r;
                        if (w70Var6 != null) {
                            w70Var6.e(rectF7);
                            df0Var10.r.i(getRoundRadius());
                            df0Var10.r.setAlpha((int) (b11 * 255.0f));
                            df0Var10.r.draw(canvas);
                        }
                        i15++;
                        l12 = f13;
                        f28 = f11;
                        l10 = f12;
                        f10 = 0.04f;
                        f25 = 2.0f;
                    }
                }
                f11 = f28;
                f12 = l10;
                f13 = l12;
                i15++;
                l12 = f13;
                f28 = f11;
                l10 = f12;
                f10 = 0.04f;
                f25 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.N + this.M), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        df0 df0Var;
        if (this.x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    df0 df0Var2 = (df0) arrayList.get(i3);
                    if (!df0Var2.o && df0Var2.d.contains(x10, y9)) {
                        this.U = df0Var2;
                        this.V = x10;
                        this.W = y9;
                        this.a0 = System.currentTimeMillis();
                        this.U.b.c(true);
                        break;
                    }
                    i3++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x10 - this.V) > 20.0f || Math.abs(y9 - this.W) > 20.0f)) {
                    this.U.b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (df0Var = this.U) != null) {
                df0Var.b.c(false);
                if (action == 1 && this.U.d.contains(x10, y9)) {
                    if (System.currentTimeMillis() - this.a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    df0 df0Var3 = this.U;
                    if (df0Var3.t && !df0Var3.s) {
                        df0Var3.s = true;
                        invalidate();
                    }
                    df0 df0Var4 = this.U;
                    int i10 = df0Var4.u;
                    if (i10 != 0) {
                        df0Var4.d(i10, 0, 0);
                    }
                    this.U.w = System.currentTimeMillis();
                    df0 df0Var5 = this.U;
                    ff0 ff0Var = this.y;
                    if (ff0Var != null) {
                        int i11 = df0Var5.v;
                        if (i11 == 0) {
                            int i12 = df0Var5.a;
                            RectF rectF = df0Var5.d;
                            ProfileActivity.m0(((org.telegram.ui.jt0) ff0Var).b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new j50(9, this, df0Var5), i11);
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

    public final void p(df0 df0Var, boolean z10) {
        if (!z10) {
            ef0 ef0Var = this.H ? ef0.e : ef0.f;
            df0Var.d(0, ef0Var.b, ef0Var.c);
            df0Var.c(org.telegram.messenger.bd.M0(ef0Var.a, null));
        } else if (this.H) {
            df0Var.c(org.telegram.messenger.bd.M0(2131746695, null));
            df0Var.d(R.raw.profile_unmuting, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        } else {
            df0Var.c(org.telegram.messenger.bd.M0(2131746694, null));
            df0Var.d(R.raw.profile_muting, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        }
    }

    public void setGlassFactory(eh.c cVar) {
        this.h = cVar;
        this.n.clear();
        this.r = 0;
        invalidate();
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.H != z10;
        this.H = z10;
        df0 i3 = i(1, this.a);
        if (i3 != null) {
            p(i3, z11);
            invalidate();
        } else {
            this.E.add(1);
            d();
        }
    }

    public void setOnActionClickListener(ff0 ff0Var) {
        this.y = ff0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof w70);
    }
}
