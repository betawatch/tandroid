package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bi0 extends View {
    public float E;
    public ai0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public yh0 K;
    public yh0 L;
    public yh0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public yh0 W;
    public final ArrayList a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public long c0;
    public float d;
    public xh0 d0;
    public boolean e;
    public float f;
    public final Path h;
    public final Path n;
    public org.telegram.ui.wz0 r;
    public float s;
    public float v;
    public RenderNode w;
    public int x;
    public final int y;

    public bi0(Context context, int i10) {
        super(context);
        this.a = new ArrayList();
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint();
        this.e = true;
        this.f = -1.0f;
        this.h = new Path();
        this.n = new Path();
        this.x = 0;
        this.E = 0.0f;
        this.F = null;
        this.G = new HashSet();
        this.H = 6;
        this.K = null;
        this.Q = 0;
        this.T = new Matrix();
        this.W = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.N = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.O = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.P = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        return ((measuredWidth - ((f7 / 2.0f) * (r4 - 1))) - (f7 * 2.0f)) / this.x;
    }

    public static yh0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            yh0 yh0Var = (yh0) list.get(i11);
            if (!yh0Var.o && yh0Var.a == i10) {
                return yh0Var;
            }
        }
        return null;
    }

    public final void a() {
        yh0 yh0Var = new yh0(this, zh0.I);
        yh0Var.a = 14;
        this.a.add(yh0Var);
    }

    public final void b() {
        yh0 yh0Var = new yh0(this, zh0.J);
        yh0Var.a = 16;
        this.a.add(yh0Var);
    }

    public final void c() {
        yh0 yh0Var = new yh0(this, zh0.K);
        yh0Var.a = 17;
        this.a.add(yh0Var);
    }

    public final void d() {
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.x = this.a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.G;
        boolean z10 = hashSet.contains(7) && !hashSet.contains(9);
        int i10 = this.H;
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
                    arrayList.add(k(3));
                }
            }
            n(4, 12, arrayList);
            if (z10) {
                arrayList.add(k(8));
            } else {
                m(12, arrayList);
                n(9, 12, arrayList);
            }
        } else if (i10 == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(k(13));
        } else if (i10 == 3 || i10 == 4) {
            if (z10) {
                m(7, arrayList);
            } else {
                m(0, arrayList);
            }
            m(1, arrayList);
            if (z10) {
                arrayList.add(k(8));
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
        AndroidUtilities.runOnUIThread(new t90(6, this, arrayList));
    }

    public final void e() {
        this.I = true;
    }

    public final boolean f() {
        int i10 = this.H;
        return i10 == 1 || i10 == 3;
    }

    public final void g() {
        int i10 = this.Q;
        if (i10 == 0) {
            return;
        }
        if (!this.R) {
            this.b.setColor(i10);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f7 = this.N;
        float max = ((measuredWidth - ((f7 / 2.0f) * Math.max(0, this.x - 1))) - (f7 * 2.0f)) / Math.max(1, this.x);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.y / 2.0f, this.R ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.y6.o1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
        this.S = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.d0 == null) {
            this.d0 = new xh0(this);
        }
        return this.d0;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f7) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.V);
        drawable.setAlpha((int) (f7 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.w != null) {
            this.w = null;
            this.r = null;
            invalidate();
        }
    }

    public final yh0 k(int i10) {
        yh0 j10 = j(i10, this.a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new yh0(this, zh0.d);
                break;
            case 1:
                j10 = new yh0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new yh0(this, zh0.h);
                break;
            case 3:
                j10 = new yh0(this, zh0.n);
                j10.t = true;
                j10.x = 200;
                break;
            case 4:
                j10 = new yh0(this, zh0.r);
                break;
            case 5:
                j10 = new yh0(this, zh0.s);
                this.K = j10;
                j10.t = true;
                j10.x = 500;
                break;
            case 6:
                j10 = new yh0(this, zh0.v);
                j10.t = true;
                j10.x = 500;
                break;
            case 7:
                j10 = new yh0(this, zh0.w);
                j10.t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new yh0(this, zh0.x);
                j10.t = true;
                j10.x = 500;
                break;
            case 9:
                j10 = new yh0(this, zh0.y);
                j10.t = true;
                j10.u = R.raw.profile_leave;
                j10.x = 300;
                break;
            case 10:
                j10 = new yh0(this, zh0.E);
                j10.t = true;
                j10.u = R.raw.profile_voicechat;
                j10.x = 500;
                break;
            case 11:
                j10 = new yh0(this, zh0.F);
                j10.t = true;
                j10.u = R.raw.profile_voicechat;
                j10.x = 500;
                break;
            case 12:
                j10 = new yh0(this, zh0.G);
                break;
            case 13:
                j10 = new yh0(this, zh0.H);
                j10.t = true;
                j10.x = 300;
                break;
        }
        if (j10 != null) {
            j10.a = i10;
        }
        return j10;
    }

    public final boolean l() {
        return this.G.contains(5) && this.K != null;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.G.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.G;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i11))) {
            return;
        }
        arrayList.add(k(i10));
    }

    public final void o(int i10, boolean z10) {
        HashSet hashSet = this.G;
        if (z10 ? hashSet.add(Integer.valueOf(i10)) : hashSet.remove(Integer.valueOf(i10))) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x014d, code lost:
    
        if (r3.o == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0104, code lost:
    
        if (r13.a != r7.a) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0111, code lost:
    
        if (r13.a == r7.a) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        yh0 yh0Var;
        float f14;
        boolean z10;
        boolean z11;
        int i12;
        yh0 yh0Var2;
        float f15 = this.f;
        if (f15 >= 0.0f) {
            float y3 = f15 - getY();
            if (y3 <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y3);
            }
        }
        float f16 = this.E - this.O;
        float f17 = this.P;
        float max = Math.max(0.0f, f16 - f17);
        if (max <= 0.0f) {
            return;
        }
        float f18 = this.N;
        float f19 = f18 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        RenderNode renderNode = this.w;
        Path path = this.n;
        if (renderNode != null) {
            path.rewind();
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        yh0 yh0Var3 = null;
        float f20 = 2.0f;
        yh0 yh0Var4 = null;
        int i13 = 0;
        while (i13 < size) {
            yh0 yh0Var5 = (yh0) arrayList.get(i13);
            boolean z12 = yh0Var5.p;
            float f21 = max;
            xc xcVar = yh0Var5.b;
            float f22 = f19;
            RectF rectF = yh0Var5.d;
            if (z12) {
                f12 = f17;
                f13 = itemWidth;
                i11 = i13;
            } else {
                if (!yh0Var5.o) {
                    rectF.set(f18, f17, f18 + itemWidth, f17 + f21);
                    f18 += itemWidth + f22;
                    if (yh0Var3 == null) {
                        yh0Var3 = yh0Var5;
                    }
                    yh0Var4 = yh0Var5;
                }
                h6 h6Var = yh0Var5.e;
                f12 = f17;
                RectF rectF2 = yh0Var5.c;
                float f23 = f18;
                bi0 bi0Var = yh0Var5.y;
                f13 = itemWidth;
                RectF rectF3 = yh0Var5.f;
                i11 = i13;
                RectF rectF4 = yh0Var5.g;
                yh0 yh0Var6 = yh0Var3;
                if (yh0Var5.o) {
                    yh0Var5.a();
                } else {
                    boolean z13 = bi0Var.e;
                    float f24 = bi0Var.N;
                    if (z13) {
                        yh0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        h6Var.d(1.0f, true);
                    } else {
                        if (rectF3.isEmpty()) {
                            yh0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f24;
                            boolean z15 = rectF.right + 1.0f >= ((float) bi0Var.getMeasuredWidth()) - f24;
                            if (z14 && z15) {
                                yh0Var = yh0Var4;
                            } else {
                                z11 = z15;
                                yh0 yh0Var7 = bi0Var.L;
                                if (yh0Var7 != null) {
                                    yh0Var = yh0Var4;
                                } else {
                                    yh0Var = yh0Var4;
                                }
                                yh0 yh0Var8 = bi0Var.M;
                                if (yh0Var8 != null) {
                                }
                                i12 = yh0Var5.a;
                                if (((i12 != 5 && i12 != 6) || bi0Var.H != 0) && ((i12 != 3 && i12 != 2) || bi0Var.H != 1)) {
                                    if (!z14 && (yh0Var2 = bi0Var.L) != null && !yh0Var2.o) {
                                        z11 = true;
                                        z14 = false;
                                    } else if (z11) {
                                        yh0 yh0Var9 = bi0Var.M;
                                        if (yh0Var9 != null) {
                                        }
                                    }
                                    if (!z14) {
                                        rectF4.left = rectF4.right;
                                    } else if (z11) {
                                        rectF4.right = rectF4.left;
                                    } else {
                                        float centerX = rectF3.centerX();
                                        rectF4.right = centerX;
                                        rectF4.left = centerX;
                                    }
                                    f14 = 0.0f;
                                    z10 = true;
                                    h6Var.d(0.0f, true);
                                }
                                z11 = false;
                                z14 = true;
                                if (!z14) {
                                }
                                f14 = 0.0f;
                                z10 = true;
                                h6Var.d(0.0f, true);
                            }
                            z11 = false;
                            z14 = false;
                            i12 = yh0Var5.a;
                            if (i12 != 5) {
                                if (!z14) {
                                }
                                if (z11) {
                                }
                                if (!z14) {
                                }
                                f14 = 0.0f;
                                z10 = true;
                                h6Var.d(0.0f, true);
                            }
                            if (!z14) {
                            }
                            if (z11) {
                            }
                            if (!z14) {
                            }
                            f14 = 0.0f;
                            z10 = true;
                            h6Var.d(0.0f, true);
                        } else {
                            yh0Var = yh0Var4;
                            f14 = 0.0f;
                            z10 = true;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            h6Var.d(f14, z10);
                        }
                        yh0Var5.a();
                        rectF2.set(rectF);
                        if (this.w != null) {
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set(rectF);
                            rectF5.inset((1.0f - xcVar.a(0.04f)) * (rectF.width() / 2.0f), (1.0f - xcVar.a(0.04f)) * (rectF.height() / 2.0f));
                            rectF5.inset(-1.0f, -1.0f);
                            path.addRoundRect(rectF5, roundRadius, roundRadius, Path.Direction.CCW);
                        }
                        f18 = f23;
                        yh0Var3 = yh0Var6;
                        yh0Var4 = yh0Var;
                    }
                }
                yh0Var = yh0Var4;
                if (this.w != null) {
                }
                f18 = f23;
                yh0Var3 = yh0Var6;
                yh0Var4 = yh0Var;
            }
            i13 = i11 + 1;
            max = f21;
            f19 = f22;
            f17 = f12;
            itemWidth = f13;
        }
        this.L = yh0Var3;
        this.M = yh0Var4;
        float f25 = this.y;
        float clamp01 = Utilities.clamp01(max / f25);
        float clamp012 = Utilities.clamp01((clamp01 - 0.2f) / 0.8f);
        if (clamp012 <= 0.0f) {
            return;
        }
        int i14 = 0;
        while (i14 < size) {
            yh0 yh0Var10 = (yh0) arrayList.get(i14);
            boolean z16 = yh0Var10.p;
            xc xcVar2 = yh0Var10.b;
            RectF rectF6 = yh0Var10.d;
            if (z16) {
                f11 = clamp012;
                i10 = i14;
            } else {
                RectF rectF7 = AndroidUtilities.rectTmp;
                rectF7.set(rectF6);
                rectF7.inset((1.0f - xcVar2.a(0.04f)) * (rectF6.width() / 2.0f), (1.0f - xcVar2.a(0.04f)) * (rectF6.height() / 2.0f));
                Paint paint = this.b;
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (((int) (yh0Var10.b() * clamp012 * alpha)) * (this.S != null ? 0.1f : 1.0f)));
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint);
                if (this.S != null) {
                    Paint paint2 = this.c;
                    int alpha2 = paint2.getAlpha();
                    f11 = clamp012;
                    paint2.setAlpha((int) (yh0Var10.b() * clamp012 * alpha2));
                    float f26 = rectF7.left;
                    float f27 = rectF7.top;
                    i10 = i14;
                    Matrix matrix = this.T;
                    matrix.setTranslate(f26, f27);
                    this.S.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint2);
                    paint2.setAlpha(alpha2);
                } else {
                    f11 = clamp012;
                    i10 = i14;
                }
                paint.setAlpha(alpha);
            }
            i14 = i10 + 1;
            clamp012 = f11;
        }
        RenderNode renderNode2 = this.w;
        if (renderNode2 != null && Build.VERSION.SDK_INT >= 29 && renderNode2.hasDisplayList() && canvas.isHardwareAccelerated()) {
            canvas.save();
            org.telegram.ui.wz0 wz0Var = this.r;
            if (wz0Var != null) {
                View view = (View) wz0Var.getParent();
                float x9 = view.getX();
                float y10 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.h;
                path2.rewind();
                path2.addRoundRect(x9, y10, x9 + scaleX, y10 + scaleY, view.getScaleX() * this.r.getRoundRadiusForExpand(), view.getScaleY() * this.r.getRoundRadiusForExpand(), Path.Direction.CCW);
                canvas.clipPath(path2);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, this.v);
            float f28 = this.s;
            canvas.scale(f28, f28);
            canvas.drawRenderNode(this.w);
            canvas.restore();
        }
        float clamp013 = Utilities.clamp01((clamp01 - 0.4f) / 0.6f);
        if (clamp013 > 0.0f) {
            int i15 = 0;
            while (i15 < size) {
                yh0 yh0Var11 = (yh0) arrayList.get(i15);
                if (yh0Var11 != null) {
                    Rect rect = yh0Var11.h;
                    RectF rectF8 = yh0Var11.d;
                    if (!yh0Var11.p) {
                        boolean z17 = AndroidUtilities.computePerceivedBrightness(this.Q) > 0.72f;
                        float a2 = (!z17 || Build.VERSION.SDK_INT >= 31) ? !z17 ? 1.0f : a8.ee.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int f29 = i0.a.f(a2, -16777216, -1);
                        if (this.V == null || this.U != f29) {
                            this.U = f29;
                            this.V = new PorterDuffColorFilter(f29, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b10 = yh0Var11.b() * clamp013;
                        float centerX2 = rectF8.centerX();
                        float centerY = rectF8.centerY();
                        float f30 = a2;
                        f10 = clamp01;
                        float a10 = yh0Var11.b.a(0.04f) * f10;
                        canvas.scale(a10, a10, centerX2, centerY);
                        canvas.clipRect(rectF8);
                        float centerX3 = rectF8.centerX();
                        rectF8.centerY();
                        float dp = AndroidUtilities.dp(24.0f);
                        float f31 = 0.5f * dp;
                        yh0Var11.l.q(rectF8.width() - AndroidUtilities.dp(f20));
                        yh0Var11.m = yh0Var11.l.b.getLineCount() >= 3 ? 0.75f : yh0Var11.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, AndroidUtilities.dpf2(1.33f) + c3.h0.f(yh0Var11.l.j(), yh0Var11.m, f25, 3.0f));
                        rect.set((int) (centerX3 - f31), (int) max2, (int) (centerX3 + f31), (int) (max2 + dp));
                        xj0 xj0Var = yh0Var11.k;
                        if (xj0Var != null) {
                            xj0Var.setBounds(rect);
                        }
                        Drawable drawable = yh0Var11.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = yh0Var11.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float j10 = ((rect.bottom + rect.top) - ((yh0Var11.l.j() * yh0Var11.m) / f20)) - AndroidUtilities.dp(4.66f);
                        canvas.save();
                        float f32 = yh0Var11.m;
                        f7 = f25;
                        float f33 = f20;
                        canvas.scale(f32, f32, centerX2, a1.g.C(yh0Var11.l.j(), yh0Var11.m, f33, j10));
                        q11 q11Var = yh0Var11.l;
                        q11Var.c(centerX2 - (q11Var.l() / f33), j10, b10, f29, canvas);
                        canvas.restore();
                        float f34 = yh0Var11.q;
                        if (f34 != 1.0f) {
                            canvas.scale(f34, f34, rect.centerX(), rect.centerY());
                        }
                        float f35 = (1.0f - f30) * b10;
                        float f36 = f30 * b10;
                        xj0 xj0Var2 = yh0Var11.k;
                        if (xj0Var2 == null) {
                            h(canvas, yh0Var11.j, f35);
                            h(canvas, yh0Var11.i, f36);
                        } else if (yh0Var11.a == 1) {
                            h(canvas, yh0Var11.j, f35);
                            h(canvas, yh0Var11.k, f36);
                        } else {
                            h(canvas, xj0Var2, b10);
                        }
                        canvas.restore();
                        if (yh0Var11.x > 0 && System.currentTimeMillis() > yh0Var11.x + yh0Var11.w) {
                            yh0Var11.s = false;
                        }
                        if (yh0Var11.s) {
                            da0 da0Var = yh0Var11.r;
                            if (da0Var == null) {
                                da0 da0Var2 = new da0();
                                yh0Var11.r = da0Var2;
                                da0Var2.setCallback(this);
                                yh0Var11.r.g(org.telegram.ui.ActionBar.y6.o1(0.1f, -1), org.telegram.ui.ActionBar.y6.o1(0.3f, -1), org.telegram.ui.ActionBar.y6.o1(0.35f, -1), org.telegram.ui.ActionBar.y6.o1(0.8f, -1));
                                da0 da0Var3 = yh0Var11.r;
                                da0Var3.D = true;
                                da0Var3.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                            } else if (da0Var.c() || yh0Var11.r.d()) {
                                da0 da0Var4 = yh0Var11.r;
                                da0Var4.b = -1L;
                                da0Var4.c = -1L;
                            }
                        } else {
                            da0 da0Var5 = yh0Var11.r;
                            if (da0Var5 != null && !da0Var5.d() && !yh0Var11.r.c()) {
                                yh0Var11.r.a();
                            }
                        }
                        da0 da0Var6 = yh0Var11.r;
                        if (da0Var6 != null) {
                            da0Var6.e(rectF8);
                            yh0Var11.r.i(getRoundRadius());
                            yh0Var11.r.setAlpha((int) (b10 * 255.0f));
                            yh0Var11.r.draw(canvas);
                        }
                        i15++;
                        f25 = f7;
                        clamp01 = f10;
                        f20 = 2.0f;
                    }
                }
                f7 = f25;
                f10 = clamp01;
                i15++;
                f25 = f7;
                clamp01 = f10;
                f20 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.y + this.P + this.O), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yh0 yh0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.W = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    yh0 yh0Var2 = (yh0) arrayList.get(i10);
                    if (!yh0Var2.o && yh0Var2.d.contains(x9, y3)) {
                        this.W = yh0Var2;
                        this.a0 = x9;
                        this.b0 = y3;
                        this.c0 = System.currentTimeMillis();
                        this.W.b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x9 - this.a0) > 20.0f || Math.abs(y3 - this.b0) > 20.0f)) {
                    this.W.b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (yh0Var = this.W) != null) {
                yh0Var.b.c(false);
                if (action == 1 && this.W.d.contains(x9, y3)) {
                    if (System.currentTimeMillis() - this.c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    yh0 yh0Var3 = this.W;
                    if (yh0Var3.t && !yh0Var3.s) {
                        yh0Var3.s = true;
                        invalidate();
                    }
                    yh0 yh0Var4 = this.W;
                    int i11 = yh0Var4.u;
                    if (i11 != 0) {
                        yh0Var4.d(i11, 0, 0);
                    }
                    this.W.w = System.currentTimeMillis();
                    yh0 yh0Var5 = this.W;
                    ai0 ai0Var = this.F;
                    if (ai0Var != null) {
                        int i12 = yh0Var5.v;
                        if (i12 == 0) {
                            int i13 = yh0Var5.a;
                            RectF rectF = yh0Var5.d;
                            ProfileActivity.e0(((org.telegram.ui.wx0) ai0Var).b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new t90(7, this, yh0Var5), i12);
                        }
                    }
                }
                this.W = null;
                return true;
            }
            if (this.W != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(yh0 yh0Var, boolean z10) {
        if (!z10) {
            zh0 zh0Var = this.J ? zh0.e : zh0.f;
            yh0Var.d(0, zh0Var.b, zh0Var.c);
            yh0Var.c(LocaleController.getString(zh0Var.a));
        } else if (this.J) {
            zh0 zh0Var2 = zh0.e;
            yh0Var.c(LocaleController.getString(zh0Var2.a));
            yh0Var.d(R.raw.profile_unmuting, zh0Var2.b, zh0Var2.c);
        } else {
            zh0 zh0Var3 = zh0.f;
            yh0Var.c(LocaleController.getString(zh0Var3.a));
            yh0Var.d(R.raw.profile_muting, zh0Var3.b, zh0Var3.c);
        }
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.J != z10;
        this.J = z10;
        yh0 j10 = j(1, this.a);
        if (j10 != null) {
            p(j10, z11);
            invalidate();
        } else {
            this.G.add(1);
            d();
        }
    }

    public void setOnActionClickListener(ai0 ai0Var) {
        this.F = ai0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof da0);
    }
}
