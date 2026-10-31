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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hg0 extends View {
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public eg0 H;
    public eg0 I;
    public eg0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public eg0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList a;
    public dg0 a0;
    public final Paint b;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public tg.b h;
    public final ArrayList n;
    public int r;
    public int s;
    public final int w;
    public float x;
    public gg0 y;

    public hg0(Context context, int i10) {
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
        this.K = org.telegram.messenger.i0.N(14.0f);
        float N = org.telegram.messenger.i0.N(12.0f);
        this.L = N;
        float N2 = org.telegram.messenger.i0.N(8.0f);
        this.M = N2;
        this.w = (int) ((i10 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.K;
        return ((measuredWidth - ((f7 / 2.0f) * (r4 - 1))) - (f7 * 2.0f)) / this.s;
    }

    public static eg0 i(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            eg0 eg0Var = (eg0) list.get(i11);
            if (!eg0Var.o && eg0Var.a == i10) {
                return eg0Var;
            }
        }
        return null;
    }

    public final void a() {
        eg0 eg0Var = new eg0(this, fg0.I);
        eg0Var.a = 14;
        this.a.add(eg0Var);
    }

    public final void b() {
        eg0 eg0Var = new eg0(this, fg0.J);
        eg0Var.a = 16;
        this.a.add(eg0Var);
    }

    public final void c() {
        eg0 eg0Var = new eg0(this, fg0.K);
        eg0Var.a = 17;
        this.a.add(eg0Var);
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
        boolean z10 = hashSet.contains(7) && !hashSet.contains(9);
        int i10 = this.E;
        if (i10 == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (i10 == 1) {
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
        } else if (i10 == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(j(13));
        } else if (i10 == 3 || i10 == 4) {
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
        } else if (i10 == 5) {
            m(0, arrayList);
            m(1, arrayList);
        }
        org.telegram.messenger.i0.g3(new at(27, this, arrayList));
    }

    public final void e() {
        this.F = true;
    }

    public final boolean f() {
        int i10 = this.E;
        return i10 == 1 || i10 == 3;
    }

    public final void g() {
        int i10 = this.N;
        if (i10 == 0) {
            return;
        }
        if (!this.O) {
            this.b.setColor(i10);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f7 = this.K;
        float max = ((measuredWidth - ((f7 / 2.0f) * Math.max(0, this.s - 1))) - (f7 * 2.0f)) / Math.max(1, this.s);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.w / 2.0f, this.O ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.t6.r1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
        this.P = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.a0 == null) {
            this.a0 = new dg0(this);
        }
        return this.a0;
    }

    public float getRoundRadius() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f7) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.S);
        drawable.setAlpha((int) (f7 * 255.0f));
        drawable.draw(canvas);
    }

    public final eg0 j(int i10) {
        eg0 i11 = i(i10, this.a);
        if (i11 != null) {
            if (i10 == 1) {
                p(i11, false);
            }
            return i11;
        }
        switch (i10) {
            case 0:
                i11 = new eg0(this, fg0.d);
                break;
            case 1:
                i11 = new eg0(this);
                p(i11, false);
                break;
            case 2:
                i11 = new eg0(this, fg0.h);
                break;
            case 3:
                i11 = new eg0(this, fg0.n);
                i11.t = true;
                i11.x = org.telegram.messenger.zs.e3;
                break;
            case 4:
                i11 = new eg0(this, fg0.r);
                break;
            case 5:
                i11 = new eg0(this, fg0.s);
                this.H = i11;
                i11.t = true;
                i11.x = 500;
                break;
            case 6:
                i11 = new eg0(this, fg0.w);
                i11.t = true;
                i11.x = 500;
                break;
            case 7:
                i11 = new eg0(this, fg0.x);
                i11.t = true;
                i11.v = org.telegram.messenger.zs.X4;
                break;
            case 8:
                i11 = new eg0(this, fg0.y);
                i11.t = true;
                i11.x = 500;
                break;
            case 9:
                i11 = new eg0(this, fg0.D);
                i11.t = true;
                i11.u = R.raw.profile_leave;
                i11.x = org.telegram.messenger.zs.X4;
                break;
            case 10:
                i11 = new eg0(this, fg0.E);
                i11.t = true;
                i11.u = R.raw.profile_voicechat;
                i11.x = 500;
                break;
            case 11:
                i11 = new eg0(this, fg0.F);
                i11.t = true;
                i11.u = R.raw.profile_voicechat;
                i11.x = 500;
                break;
            case 12:
                i11 = new eg0(this, fg0.G);
                break;
            case 13:
                i11 = new eg0(this, fg0.H);
                i11.t = true;
                i11.x = org.telegram.messenger.zs.X4;
                break;
        }
        if (i11 != null) {
            i11.a = i10;
        }
        return i11;
    }

    public final boolean k() {
        return this.D.contains(5) && this.H != null;
    }

    public final void l() {
        int i10 = this.r;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            vg.f fVar = (vg.f) arrayList.get(i10);
            if (!fVar.getBounds().isEmpty()) {
                fVar.setBounds(0, 0, 0, 0);
            }
            i10++;
        }
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.D.contains(Integer.valueOf(i10))) {
            arrayList.add(j(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.D;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i11))) {
            return;
        }
        arrayList.add(j(i10));
    }

    public final void o(int i10, boolean z10) {
        HashSet hashSet = this.D;
        if (z10 ? hashSet.add(Integer.valueOf(i10)) : hashSet.remove(Integer.valueOf(i10))) {
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
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        eg0 eg0Var;
        float f18;
        boolean z10;
        int i11;
        eg0 eg0Var2;
        this.r = 0;
        float f19 = this.f;
        if (f19 >= 0.0f) {
            float y3 = f19 - getY();
            if (y3 <= 0.0f) {
                l();
                return;
            }
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y3);
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
        eg0 eg0Var3 = null;
        int i12 = 0;
        float f24 = 2.0f;
        eg0 eg0Var4 = null;
        while (i12 < size) {
            eg0 eg0Var5 = (eg0) arrayList.get(i12);
            boolean z11 = eg0Var5.p;
            RectF rectF = eg0Var5.d;
            if (z11) {
                f14 = max;
                f15 = f21;
                f16 = f23;
                f17 = itemWidth;
            } else {
                if (!eg0Var5.o) {
                    rectF.set(f22, f21, f22 + itemWidth, f21 + max);
                    f22 += itemWidth + f23;
                    if (eg0Var3 == null) {
                        eg0Var3 = eg0Var5;
                    }
                    eg0Var4 = eg0Var5;
                }
                t5 t5Var = eg0Var5.e;
                f14 = max;
                RectF rectF2 = eg0Var5.c;
                f15 = f21;
                hg0 hg0Var = eg0Var5.y;
                float f25 = f22;
                RectF rectF3 = eg0Var5.f;
                f16 = f23;
                RectF rectF4 = eg0Var5.g;
                f17 = itemWidth;
                if (eg0Var5.o) {
                    eg0Var5.a();
                } else {
                    boolean z12 = hg0Var.e;
                    float f26 = hg0Var.K;
                    if (z12) {
                        eg0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        t5Var.e(true, 1.0f);
                    } else {
                        boolean z13 = true;
                        if (rectF3.isEmpty()) {
                            eg0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f26;
                            boolean z15 = rectF.right + 1.0f >= ((float) hg0Var.getMeasuredWidth()) - f26;
                            if (z14 && z15) {
                                eg0Var = eg0Var3;
                            } else {
                                z10 = z15;
                                eg0 eg0Var6 = hg0Var.I;
                                if (eg0Var6 != null) {
                                    eg0Var = eg0Var3;
                                } else {
                                    eg0Var = eg0Var3;
                                }
                                eg0 eg0Var7 = hg0Var.J;
                                if (eg0Var7 != null) {
                                }
                                i11 = eg0Var5.a;
                                if (((i11 != 5 && i11 != 6) || hg0Var.E != 0) && ((i11 != 3 && i11 != 2) || hg0Var.E != 1)) {
                                    if (!z14 && (eg0Var2 = hg0Var.I) != null && !eg0Var2.o) {
                                        z10 = true;
                                        z14 = false;
                                    } else if (z10) {
                                        eg0 eg0Var8 = hg0Var.J;
                                        if (eg0Var8 != null) {
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
                                    t5Var.e(true, 0.0f);
                                }
                                z10 = false;
                                z14 = true;
                                if (!z14) {
                                }
                                f18 = 0.0f;
                                z13 = true;
                                t5Var.e(true, 0.0f);
                            }
                            z10 = false;
                            z14 = false;
                            i11 = eg0Var5.a;
                            if (i11 != 5) {
                                if (!z14) {
                                }
                                if (z10) {
                                }
                                if (!z14) {
                                }
                                f18 = 0.0f;
                                z13 = true;
                                t5Var.e(true, 0.0f);
                            }
                            if (!z14) {
                            }
                            if (z10) {
                            }
                            if (!z14) {
                            }
                            f18 = 0.0f;
                            z13 = true;
                            t5Var.e(true, 0.0f);
                        } else {
                            eg0Var = eg0Var3;
                            f18 = 0.0f;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            t5Var.e(z13, f18);
                        }
                        eg0Var5.a();
                        rectF2.set(rectF);
                        f22 = f25;
                        eg0Var3 = eg0Var;
                    }
                }
                eg0Var = eg0Var3;
                f22 = f25;
                eg0Var3 = eg0Var;
            }
            i12++;
            max = f14;
            f21 = f15;
            f23 = f16;
            itemWidth = f17;
        }
        this.I = eg0Var3;
        this.J = eg0Var4;
        float f27 = this.w;
        float l4 = Utilities.l(max / f27);
        float l10 = Utilities.l((l4 - 0.2f) / 0.8f);
        if (l10 <= 0.0f) {
            l();
            return;
        }
        int i13 = 0;
        while (true) {
            f7 = 0.04f;
            if (i13 >= size) {
                break;
            }
            eg0 eg0Var9 = (eg0) arrayList.get(i13);
            boolean z16 = eg0Var9.p;
            dc dcVar = eg0Var9.b;
            RectF rectF5 = eg0Var9.d;
            if (z16) {
                f13 = l10;
            } else {
                RectF rectF6 = org.telegram.messenger.i0.P;
                rectF6.set(rectF5);
                rectF6.inset((1.0f - dcVar.a(0.04f)) * (rectF5.width() / 2.0f), (1.0f - dcVar.a(0.04f)) * (rectF5.height() / 2.0f));
                if (this.h != null) {
                    float b10 = eg0Var9.b() * l10;
                    int i14 = this.r;
                    ArrayList arrayList2 = this.n;
                    if (i14 == arrayList2.size()) {
                        vg.f c10 = this.h.c(this, kg0.o, false);
                        c10.q(roundRadius);
                        arrayList2.add(c10);
                    }
                    int i15 = this.r;
                    this.r = i15 + 1;
                    vg.f fVar = (vg.f) arrayList2.get(i15);
                    f13 = l10;
                    fVar.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(rectF6.bottom));
                    fVar.setAlpha((int) (b10 * 255.0f));
                    fVar.draw(canvas);
                } else {
                    f13 = l10;
                    Paint paint = this.b;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (((int) (eg0Var9.b() * f13 * alpha)) * (this.P != null ? 0.1f : 1.0f)));
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint);
                    if (this.P != null) {
                        Paint paint2 = this.c;
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (eg0Var9.b() * f13 * alpha2));
                        float f28 = rectF6.left;
                        float f29 = rectF6.top;
                        i10 = i13;
                        Matrix matrix = this.Q;
                        matrix.setTranslate(f28, f29);
                        this.P.setLocalMatrix(matrix);
                        canvas.drawRoundRect(rectF6, roundRadius, roundRadius, paint2);
                        paint2.setAlpha(alpha2);
                    } else {
                        i10 = i13;
                    }
                    paint.setAlpha(alpha);
                    i13 = i10 + 1;
                    l10 = f13;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            l10 = f13;
        }
        l();
        float l11 = Utilities.l((l4 - 0.4f) / 0.6f);
        if (l11 > 0.0f) {
            int i16 = 0;
            while (i16 < size) {
                eg0 eg0Var10 = (eg0) arrayList.get(i16);
                if (eg0Var10 != null) {
                    Rect rect = eg0Var10.h;
                    RectF rectF7 = eg0Var10.d;
                    if (!eg0Var10.p) {
                        boolean z17 = org.telegram.messenger.i0.B(this.N) > 0.72f;
                        float a2 = (!z17 || Build.VERSION.SDK_INT >= 31) ? !z17 ? 1.0f : w7.u.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int f30 = i0.b.f(a2, -16777216, -1);
                        if (this.S == null || this.R != f30) {
                            this.R = f30;
                            this.S = new PorterDuffColorFilter(f30, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = eg0Var10.b() * l11;
                        float centerX2 = rectF7.centerX();
                        float centerY = rectF7.centerY();
                        float a10 = eg0Var10.b.a(f7) * l4;
                        canvas.scale(a10, a10, centerX2, centerY);
                        canvas.clipRect(rectF7);
                        float centerX3 = rectF7.centerX();
                        rectF7.centerY();
                        float L = org.telegram.messenger.i0.L(24.0f);
                        float f31 = 0.5f * L;
                        eg0Var10.l.p(rectF7.width() - org.telegram.messenger.i0.L(f24));
                        eg0Var10.m = eg0Var10.l.b.getLineCount() >= 3 ? 0.75f : eg0Var10.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, org.telegram.messenger.i0.N(1.33f) + c3.i0.g(eg0Var10.l.i(), eg0Var10.m, f27, 3.0f));
                        rect.set((int) (centerX3 - f31), (int) max2, (int) (centerX3 + f31), (int) (max2 + L));
                        bi0 bi0Var = eg0Var10.k;
                        if (bi0Var != null) {
                            bi0Var.setBounds(rect);
                        }
                        Drawable drawable = eg0Var10.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = eg0Var10.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float i17 = ((rect.bottom + rect.top) - ((eg0Var10.l.i() * eg0Var10.m) / f24)) - org.telegram.messenger.i0.L(4.66f);
                        canvas.save();
                        float f32 = eg0Var10.m;
                        f10 = f27;
                        float f33 = f24;
                        canvas.scale(f32, f32, centerX2, a1.g.A(eg0Var10.l.i(), eg0Var10.m, f33, i17));
                        qz0 qz0Var = eg0Var10.l;
                        f11 = l4;
                        qz0Var.c(centerX2 - (qz0Var.k() / f33), i17, b11, f30, canvas);
                        canvas.restore();
                        float f34 = eg0Var10.q;
                        if (f34 != 1.0f) {
                            canvas.scale(f34, f34, rect.centerX(), rect.centerY());
                        }
                        float f35 = (1.0f - a2) * b11;
                        float f36 = a2 * b11;
                        bi0 bi0Var2 = eg0Var10.k;
                        if (bi0Var2 == null) {
                            h(canvas, eg0Var10.j, f35);
                            h(canvas, eg0Var10.i, f36);
                        } else if (eg0Var10.a == 1) {
                            h(canvas, eg0Var10.j, f35);
                            h(canvas, eg0Var10.k, f36);
                        } else {
                            h(canvas, bi0Var2, b11);
                        }
                        canvas.restore();
                        if (eg0Var10.x > 0) {
                            f12 = l11;
                            if (System.currentTimeMillis() > eg0Var10.x + eg0Var10.w) {
                                eg0Var10.s = false;
                            }
                        } else {
                            f12 = l11;
                        }
                        if (eg0Var10.s) {
                            t80 t80Var = eg0Var10.r;
                            if (t80Var == null) {
                                t80 t80Var2 = new t80();
                                eg0Var10.r = t80Var2;
                                t80Var2.setCallback(this);
                                eg0Var10.r.g(org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.35f, -1), org.telegram.ui.ActionBar.t6.r1(0.8f, -1));
                                t80 t80Var3 = eg0Var10.r;
                                t80Var3.D = true;
                                t80Var3.x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
                            } else if (t80Var.c() || eg0Var10.r.d()) {
                                t80 t80Var4 = eg0Var10.r;
                                t80Var4.b = -1L;
                                t80Var4.c = -1L;
                            }
                        } else {
                            t80 t80Var5 = eg0Var10.r;
                            if (t80Var5 != null && !t80Var5.d() && !eg0Var10.r.c()) {
                                eg0Var10.r.a();
                            }
                        }
                        t80 t80Var6 = eg0Var10.r;
                        if (t80Var6 != null) {
                            t80Var6.e(rectF7);
                            eg0Var10.r.i(getRoundRadius());
                            eg0Var10.r.setAlpha((int) (b11 * 255.0f));
                            eg0Var10.r.draw(canvas);
                        }
                        i16++;
                        l11 = f12;
                        f27 = f10;
                        l4 = f11;
                        f7 = 0.04f;
                        f24 = 2.0f;
                    }
                }
                f10 = f27;
                f11 = l4;
                f12 = l11;
                i16++;
                l11 = f12;
                f27 = f10;
                l4 = f11;
                f7 = 0.04f;
                f24 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.M + this.L), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        eg0 eg0Var;
        if (this.x >= org.telegram.messenger.i0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.T = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    eg0 eg0Var2 = (eg0) arrayList.get(i10);
                    if (!eg0Var2.o && eg0Var2.d.contains(x10, y3)) {
                        this.T = eg0Var2;
                        this.U = x10;
                        this.V = y3;
                        this.W = System.currentTimeMillis();
                        this.T.b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y3 - this.V) > 20.0f)) {
                    this.T.b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (eg0Var = this.T) != null) {
                eg0Var.b.c(false);
                if (action == 1 && this.T.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    eg0 eg0Var3 = this.T;
                    if (eg0Var3.t && !eg0Var3.s) {
                        eg0Var3.s = true;
                        invalidate();
                    }
                    eg0 eg0Var4 = this.T;
                    int i11 = eg0Var4.u;
                    if (i11 != 0) {
                        eg0Var4.d(i11, 0, 0);
                    }
                    this.T.w = System.currentTimeMillis();
                    eg0 eg0Var5 = this.T;
                    gg0 gg0Var = this.y;
                    if (gg0Var != null) {
                        int i12 = eg0Var5.v;
                        if (i12 == 0) {
                            int i13 = eg0Var5.a;
                            RectF rectF = eg0Var5.d;
                            ProfileActivity.l0(((org.telegram.ui.bv0) gg0Var).b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new at(28, this, eg0Var5), i12);
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

    public final void p(eg0 eg0Var, boolean z10) {
        if (!z10) {
            fg0 fg0Var = this.G ? fg0.e : fg0.f;
            eg0Var.d(0, fg0Var.b, fg0Var.c);
            eg0Var.c(org.telegram.messenger.cd.L0(fg0Var.a, null));
        } else if (this.G) {
            eg0Var.c(org.telegram.messenger.cd.L0(2131746702, null));
            eg0Var.d(R.raw.profile_unmuting, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        } else {
            eg0Var.c(org.telegram.messenger.cd.L0(2131746701, null));
            eg0Var.d(R.raw.profile_muting, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        }
    }

    public void setGlassFactory(tg.b bVar) {
        this.h = bVar;
        this.n.clear();
        this.r = 0;
        invalidate();
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.G != z10;
        this.G = z10;
        eg0 i10 = i(1, this.a);
        if (i10 != null) {
            p(i10, z11);
            invalidate();
        } else {
            this.D.add(1);
            d();
        }
    }

    public void setOnActionClickListener(gg0 gg0Var) {
        this.y = gg0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof t80);
    }
}
