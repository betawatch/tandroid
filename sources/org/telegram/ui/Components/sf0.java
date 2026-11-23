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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sf0 extends View {
    public final HashSet E;
    public int F;
    public boolean G;
    public boolean H;
    public pf0 I;
    public pf0 J;
    public pf0 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public pf0 U;
    public float V;
    public float W;
    public final ArrayList a;
    public long a0;
    public final Paint b;
    public of0 b0;
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
    public rf0 y;

    public sf0(Context context, int i7) {
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
        this.w = (int) ((i7 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.L;
        return ((measuredWidth - ((f10 / 2.0f) * (r4 - 1))) - (f10 * 2.0f)) / this.s;
    }

    public static pf0 i(int i7, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            pf0 pf0Var = (pf0) list.get(i10);
            if (!pf0Var.o && pf0Var.a == i7) {
                return pf0Var;
            }
        }
        return null;
    }

    public final void a() {
        pf0 pf0Var = new pf0(this, qf0.J);
        pf0Var.a = 14;
        this.a.add(pf0Var);
    }

    public final void b() {
        pf0 pf0Var = new pf0(this, qf0.K);
        pf0Var.a = 16;
        this.a.add(pf0Var);
    }

    public final void c() {
        pf0 pf0Var = new pf0(this, qf0.L);
        pf0Var.a = 17;
        this.a.add(pf0Var);
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
        int i7 = this.F;
        if (i7 == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (i7 == 1) {
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
        } else if (i7 == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(j(13));
        } else if (i7 == 3 || i7 == 4) {
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
        } else if (i7 == 5) {
            m(0, arrayList);
            m(1, arrayList);
        }
        org.telegram.messenger.g0.g3(new bt(27, this, arrayList));
    }

    public final void e() {
        this.G = true;
    }

    public final boolean f() {
        int i7 = this.F;
        return i7 == 1 || i7 == 3;
    }

    public final void g() {
        int i7 = this.O;
        if (i7 == 0) {
            return;
        }
        if (!this.P) {
            this.b.setColor(i7);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f10 = this.L;
        float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.s - 1))) - (f10 * 2.0f)) / Math.max(1, this.s);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.w / 2.0f, this.P ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.n6.r1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
        this.Q = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.b0 == null) {
            this.b0 = new of0(this);
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

    public final pf0 j(int i7) {
        pf0 i10 = i(i7, this.a);
        if (i10 != null) {
            if (i7 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i7) {
            case 0:
                i10 = new pf0(this, qf0.d);
                break;
            case 1:
                i10 = new pf0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new pf0(this, qf0.h);
                break;
            case 3:
                i10 = new pf0(this, qf0.n);
                i10.t = true;
                i10.x = org.telegram.messenger.ks.e3;
                break;
            case 4:
                i10 = new pf0(this, qf0.r);
                break;
            case 5:
                i10 = new pf0(this, qf0.s);
                this.I = i10;
                i10.t = true;
                i10.x = 500;
                break;
            case 6:
                i10 = new pf0(this, qf0.w);
                i10.t = true;
                i10.x = 500;
                break;
            case 7:
                i10 = new pf0(this, qf0.x);
                i10.t = true;
                i10.v = org.telegram.messenger.ks.X4;
                break;
            case 8:
                i10 = new pf0(this, qf0.y);
                i10.t = true;
                i10.x = 500;
                break;
            case 9:
                i10 = new pf0(this, qf0.E);
                i10.t = true;
                i10.u = R.raw.profile_leave;
                i10.x = org.telegram.messenger.ks.X4;
                break;
            case 10:
                i10 = new pf0(this, qf0.F);
                i10.t = true;
                i10.u = R.raw.profile_voicechat;
                i10.x = 500;
                break;
            case 11:
                i10 = new pf0(this, qf0.G);
                i10.t = true;
                i10.u = R.raw.profile_voicechat;
                i10.x = 500;
                break;
            case 12:
                i10 = new pf0(this, qf0.H);
                break;
            case 13:
                i10 = new pf0(this, qf0.I);
                i10.t = true;
                i10.x = org.telegram.messenger.ks.X4;
                break;
        }
        if (i10 != null) {
            i10.a = i7;
        }
        return i10;
    }

    public final boolean k() {
        return this.E.contains(5) && this.I != null;
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
        if (this.E.contains(Integer.valueOf(i7))) {
            arrayList.add(j(i7));
        }
    }

    public final void n(int i7, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.E;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(j(i7));
    }

    public final void o(int i7, boolean z10) {
        HashSet hashSet = this.E;
        if (z10 ? hashSet.add(Integer.valueOf(i7)) : hashSet.remove(Integer.valueOf(i7))) {
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
        n80 n80Var;
        float f13;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        pf0 pf0Var;
        float f18;
        boolean z10;
        int i10;
        pf0 pf0Var2;
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
        float f20 = this.x - this.M;
        float f21 = this.N;
        float max = Math.max(0.0f, f20 - f21);
        if (max <= 0.0f) {
            l();
            return;
        }
        float f22 = this.L;
        float f23 = f22 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        pf0 pf0Var3 = null;
        int i11 = 0;
        float f24 = 2.0f;
        pf0 pf0Var4 = null;
        while (i11 < size) {
            pf0 pf0Var5 = (pf0) arrayList.get(i11);
            boolean z11 = pf0Var5.p;
            RectF rectF = pf0Var5.d;
            if (z11) {
                f14 = max;
                f15 = f21;
                f16 = f23;
                f17 = itemWidth;
            } else {
                if (!pf0Var5.o) {
                    rectF.set(f22, f21, f22 + itemWidth, f21 + max);
                    f22 += itemWidth + f23;
                    if (pf0Var3 == null) {
                        pf0Var3 = pf0Var5;
                    }
                    pf0Var4 = pf0Var5;
                }
                c6 c6Var = pf0Var5.e;
                f14 = max;
                RectF rectF2 = pf0Var5.c;
                f15 = f21;
                sf0 sf0Var = pf0Var5.y;
                float f25 = f22;
                RectF rectF3 = pf0Var5.f;
                f16 = f23;
                RectF rectF4 = pf0Var5.g;
                f17 = itemWidth;
                if (pf0Var5.o) {
                    pf0Var5.a();
                } else {
                    boolean z12 = sf0Var.e;
                    float f26 = sf0Var.L;
                    if (z12) {
                        pf0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        c6Var.e(true, 1.0f);
                    } else {
                        boolean z13 = true;
                        if (rectF3.isEmpty()) {
                            pf0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f26;
                            boolean z15 = rectF.right + 1.0f >= ((float) sf0Var.getMeasuredWidth()) - f26;
                            if (z14 && z15) {
                                pf0Var = pf0Var3;
                            } else {
                                z10 = z15;
                                pf0 pf0Var6 = sf0Var.J;
                                if (pf0Var6 != null) {
                                    pf0Var = pf0Var3;
                                } else {
                                    pf0Var = pf0Var3;
                                }
                                pf0 pf0Var7 = sf0Var.K;
                                if (pf0Var7 != null) {
                                }
                                i10 = pf0Var5.a;
                                if (((i10 != 5 && i10 != 6) || sf0Var.F != 0) && ((i10 != 3 && i10 != 2) || sf0Var.F != 1)) {
                                    if (!z14 && (pf0Var2 = sf0Var.J) != null && !pf0Var2.o) {
                                        z10 = true;
                                        z14 = false;
                                    } else if (z10) {
                                        pf0 pf0Var8 = sf0Var.K;
                                        if (pf0Var8 != null) {
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
                                    f18 = 0.0f;
                                    z13 = true;
                                    c6Var.e(true, 0.0f);
                                }
                                z10 = false;
                                z14 = true;
                                if (!z14) {
                                }
                                f18 = 0.0f;
                                z13 = true;
                                c6Var.e(true, 0.0f);
                            }
                            z10 = false;
                            z14 = false;
                            i10 = pf0Var5.a;
                            if (i10 != 5) {
                                if (!z14) {
                                }
                                if (z10) {
                                }
                                if (!z14) {
                                }
                                f18 = 0.0f;
                                z13 = true;
                                c6Var.e(true, 0.0f);
                            }
                            if (!z14) {
                            }
                            if (z10) {
                            }
                            if (!z14) {
                            }
                            f18 = 0.0f;
                            z13 = true;
                            c6Var.e(true, 0.0f);
                        } else {
                            pf0Var = pf0Var3;
                            f18 = 0.0f;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            c6Var.e(z13, f18);
                        }
                        pf0Var5.a();
                        rectF2.set(rectF);
                        f22 = f25;
                        pf0Var3 = pf0Var;
                    }
                }
                pf0Var = pf0Var3;
                f22 = f25;
                pf0Var3 = pf0Var;
            }
            i11++;
            max = f14;
            f21 = f15;
            f23 = f16;
            itemWidth = f17;
        }
        this.J = pf0Var3;
        this.K = pf0Var4;
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
            pf0 pf0Var9 = (pf0) arrayList.get(i12);
            boolean z16 = pf0Var9.p;
            lc lcVar = pf0Var9.b;
            RectF rectF5 = pf0Var9.d;
            if (z16) {
                f13 = l11;
            } else {
                RectF rectF6 = org.telegram.messenger.g0.P;
                rectF6.set(rectF5);
                rectF6.inset((1.0f - lcVar.a(0.04f)) * (rectF5.width() / 2.0f), (1.0f - lcVar.a(0.04f)) * (rectF5.height() / 2.0f));
                if (this.h != null) {
                    float b10 = pf0Var9.b() * l11;
                    int i13 = this.r;
                    ArrayList arrayList2 = this.n;
                    if (i13 == arrayList2.size()) {
                        fh.g c10 = this.h.c(this, wf0.o, false);
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
                    paint.setAlpha((int) (((int) (pf0Var9.b() * f13 * alpha)) * (this.Q != null ? 0.1f : 1.0f)));
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint);
                    if (this.Q != null) {
                        Paint paint2 = this.c;
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (pf0Var9.b() * f13 * alpha2));
                        float f28 = rectF6.left;
                        float f29 = rectF6.top;
                        i7 = i12;
                        Matrix matrix = this.R;
                        matrix.setTranslate(f28, f29);
                        this.Q.setLocalMatrix(matrix);
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
                pf0 pf0Var10 = (pf0) arrayList.get(i15);
                if (pf0Var10 != null) {
                    Rect rect = pf0Var10.h;
                    RectF rectF7 = pf0Var10.d;
                    if (!pf0Var10.p) {
                        float a10 = org.telegram.messenger.g0.B(this.O) > 0.72f ? c8.m9.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 1.0f;
                        int f30 = i0.a.f(a10, -16777216, -1);
                        if (this.T == null || this.S != f30) {
                            this.S = f30;
                            this.T = new PorterDuffColorFilter(f30, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = pf0Var10.b() * l12;
                        float centerX2 = rectF7.centerX();
                        float f31 = a10;
                        float centerY = rectF7.centerY();
                        float a11 = pf0Var10.b.a(f10) * l10;
                        canvas.scale(a11, a11, centerX2, centerY);
                        canvas.clipRect(rectF7);
                        float centerX3 = rectF7.centerX();
                        rectF7.centerY();
                        float L = org.telegram.messenger.g0.L(24.0f);
                        float f32 = 0.5f * L;
                        pf0Var10.l.p(rectF7.width() - org.telegram.messenger.g0.L(f24));
                        pf0Var10.m = pf0Var10.l.b.getLineCount() >= 3 ? 0.75f : pf0Var10.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, org.telegram.messenger.g0.N(1.33f) + com.google.android.gms.internal.vision.e2.w(pf0Var10.l.i(), pf0Var10.m, f27, 3.0f));
                        rect.set((int) (centerX3 - f32), (int) max2, (int) (centerX3 + f32), (int) (max2 + L));
                        nh0 nh0Var = pf0Var10.k;
                        if (nh0Var != null) {
                            nh0Var.setBounds(rect);
                        }
                        Drawable drawable = pf0Var10.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = pf0Var10.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float i16 = ((rect.bottom + rect.top) - ((pf0Var10.l.i() * pf0Var10.m) / f24)) - org.telegram.messenger.g0.L(4.66f);
                        canvas.save();
                        float f33 = pf0Var10.m;
                        f11 = f27;
                        float f34 = f24;
                        canvas.scale(f33, f33, centerX2, a8.p0.f(pf0Var10.l.i(), pf0Var10.m, f34, i16));
                        wy0 wy0Var = pf0Var10.l;
                        wy0Var.c(centerX2 - (wy0Var.k() / f34), i16, b11, f30, canvas);
                        canvas.restore();
                        float f35 = pf0Var10.q;
                        if (f35 != 1.0f) {
                            canvas.scale(f35, f35, rect.centerX(), rect.centerY());
                        }
                        float f36 = (1.0f - f31) * b11;
                        float f37 = f31 * b11;
                        nh0 nh0Var2 = pf0Var10.k;
                        if (nh0Var2 == null) {
                            h(canvas, pf0Var10.j, f36);
                            h(canvas, pf0Var10.i, f37);
                        } else if (pf0Var10.a == 1) {
                            h(canvas, pf0Var10.j, f36);
                            h(canvas, pf0Var10.k, f37);
                        } else {
                            h(canvas, nh0Var2, b11);
                        }
                        canvas.restore();
                        if (pf0Var10.x > 0) {
                            f12 = l10;
                            if (System.currentTimeMillis() > pf0Var10.x + pf0Var10.w) {
                                pf0Var10.s = false;
                                if (pf0Var10.s) {
                                    n80 n80Var2 = pf0Var10.r;
                                    if (n80Var2 != null && !n80Var2.d() && !pf0Var10.r.c()) {
                                        pf0Var10.r.a();
                                    }
                                } else {
                                    n80 n80Var3 = pf0Var10.r;
                                    if (n80Var3 == null) {
                                        n80 n80Var4 = new n80();
                                        pf0Var10.r = n80Var4;
                                        n80Var4.setCallback(this);
                                        pf0Var10.r.g(org.telegram.ui.ActionBar.n6.r1(0.1f, -1), org.telegram.ui.ActionBar.n6.r1(0.3f, -1), org.telegram.ui.ActionBar.n6.r1(0.35f, -1), org.telegram.ui.ActionBar.n6.r1(0.8f, -1));
                                        n80 n80Var5 = pf0Var10.r;
                                        n80Var5.D = true;
                                        n80Var5.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                                    } else if (n80Var3.c() || pf0Var10.r.d()) {
                                        n80 n80Var6 = pf0Var10.r;
                                        n80Var6.b = -1L;
                                        n80Var6.c = -1L;
                                    }
                                }
                                n80Var = pf0Var10.r;
                                if (n80Var == null) {
                                    n80Var.e(rectF7);
                                    pf0Var10.r.i(getRoundRadius());
                                    pf0Var10.r.setAlpha((int) (b11 * 255.0f));
                                    pf0Var10.r.draw(canvas);
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
                        if (pf0Var10.s) {
                        }
                        n80Var = pf0Var10.r;
                        if (n80Var == null) {
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.N + this.M), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pf0 pf0Var;
        if (this.x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    pf0 pf0Var2 = (pf0) arrayList.get(i7);
                    if (!pf0Var2.o && pf0Var2.d.contains(x10, y10)) {
                        this.U = pf0Var2;
                        this.V = x10;
                        this.W = y10;
                        this.a0 = System.currentTimeMillis();
                        this.U.b.c(true);
                        break;
                    }
                    i7++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x10 - this.V) > 20.0f || Math.abs(y10 - this.W) > 20.0f)) {
                    this.U.b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (pf0Var = this.U) != null) {
                pf0Var.b.c(false);
                if (action == 1 && this.U.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    pf0 pf0Var3 = this.U;
                    if (pf0Var3.t && !pf0Var3.s) {
                        pf0Var3.s = true;
                        invalidate();
                    }
                    pf0 pf0Var4 = this.U;
                    int i10 = pf0Var4.u;
                    if (i10 != 0) {
                        pf0Var4.d(i10, 0, 0);
                    }
                    this.U.w = System.currentTimeMillis();
                    pf0 pf0Var5 = this.U;
                    rf0 rf0Var = this.y;
                    if (rf0Var != null) {
                        int i11 = pf0Var5.v;
                        if (i11 == 0) {
                            int i12 = pf0Var5.a;
                            RectF rectF = pf0Var5.d;
                            ProfileActivity.l0(((org.telegram.ui.st0) rf0Var).b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new bt(28, this, pf0Var5), i11);
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

    public final void p(pf0 pf0Var, boolean z10) {
        if (!z10) {
            qf0 qf0Var = this.H ? qf0.e : qf0.f;
            pf0Var.d(0, qf0Var.b, qf0Var.c);
            pf0Var.c(org.telegram.messenger.gd.N0(qf0Var.a, null));
        } else if (this.H) {
            pf0Var.c(org.telegram.messenger.gd.N0(2131746491, null));
            pf0Var.d(R.raw.profile_unmuting, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        } else {
            pf0Var.c(org.telegram.messenger.gd.N0(2131746490, null));
            pf0Var.d(R.raw.profile_muting, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        }
    }

    public void setGlassFactory(dh.c cVar) {
        this.h = cVar;
        this.n.clear();
        this.r = 0;
        invalidate();
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.H != z10;
        this.H = z10;
        pf0 i7 = i(1, this.a);
        if (i7 != null) {
            p(i7, z11);
            invalidate();
        } else {
            this.E.add(1);
            d();
        }
    }

    public void setOnActionClickListener(rf0 rf0Var) {
        this.y = rf0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof n80);
    }
}
