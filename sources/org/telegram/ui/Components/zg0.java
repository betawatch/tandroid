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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zg0 extends View {
    public float A;
    public yg0 B;
    public final HashSet C;
    public int D;
    public boolean E;
    public boolean F;
    public wg0 G;
    public wg0 H;
    public wg0 I;
    public final float J;
    public final float K;
    public final float L;
    public int M;
    public boolean N;
    public RadialGradient O;
    public final Matrix P;
    public int Q;
    public PorterDuffColorFilter R;
    public wg0 S;
    public float T;
    public float U;
    public long V;
    public vg0 W;
    public final ArrayList a;
    public final Paint b;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public final Path h;
    public final Path n;
    public org.telegram.ui.iz0 r;
    public float s;
    public float v;
    public RenderNode w;
    public int x;
    public final int y;

    public zg0(Context context, int i10) {
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
        this.A = 0.0f;
        this.B = null;
        this.C = new HashSet();
        this.D = 6;
        this.G = null;
        this.M = 0;
        this.P = new Matrix();
        this.S = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.J = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.K = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.L = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f9 = this.J;
        return ((measuredWidth - ((f9 / 2.0f) * (r4 - 1))) - (f9 * 2.0f)) / this.x;
    }

    public static wg0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            wg0 wg0Var = (wg0) list.get(i11);
            if (!wg0Var.o && wg0Var.a == i10) {
                return wg0Var;
            }
        }
        return null;
    }

    public final void a() {
        wg0 wg0Var = new wg0(this, xg0.E);
        wg0Var.a = 14;
        this.a.add(wg0Var);
    }

    public final void b() {
        wg0 wg0Var = new wg0(this, xg0.F);
        wg0Var.a = 16;
        this.a.add(wg0Var);
    }

    public final void c() {
        wg0 wg0Var = new wg0(this, xg0.G);
        wg0Var.a = 17;
        this.a.add(wg0Var);
    }

    public final void d() {
        if (this.E) {
            return;
        }
        if (this.D == 6) {
            this.x = this.a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.C;
        boolean z10 = hashSet.contains(7) && !hashSet.contains(9);
        int i10 = this.D;
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
        AndroidUtilities.runOnUIThread(new gt(28, this, arrayList));
    }

    public final void e() {
        this.E = true;
    }

    public final boolean f() {
        int i10 = this.D;
        return i10 == 1 || i10 == 3;
    }

    public final void g() {
        int i10 = this.M;
        if (i10 == 0) {
            return;
        }
        if (!this.N) {
            this.b.setColor(i10);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f9 = this.J;
        float max = ((measuredWidth - ((f9 / 2.0f) * Math.max(0, this.x - 1))) - (f9 * 2.0f)) / Math.max(1, this.x);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.y / 2.0f, this.N ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.g6.l1(0.8f, this.M), this.M, Shader.TileMode.CLAMP);
        this.O = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.W == null) {
            this.W = new vg0(this);
        }
        return this.W;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f9) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.R);
        drawable.setAlpha((int) (f9 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.w != null) {
            this.w = null;
            this.r = null;
            invalidate();
        }
    }

    public final wg0 k(int i10) {
        wg0 j10 = j(i10, this.a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new wg0(this, xg0.d);
                break;
            case 1:
                j10 = new wg0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new wg0(this, xg0.h);
                break;
            case 3:
                j10 = new wg0(this, xg0.n);
                j10.t = true;
                j10.x = 200;
                break;
            case 4:
                j10 = new wg0(this, xg0.r);
                break;
            case 5:
                j10 = new wg0(this, xg0.s);
                this.G = j10;
                j10.t = true;
                j10.x = 500;
                break;
            case 6:
                j10 = new wg0(this, xg0.v);
                j10.t = true;
                j10.x = 500;
                break;
            case 7:
                j10 = new wg0(this, xg0.w);
                j10.t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new wg0(this, xg0.x);
                j10.t = true;
                j10.x = 500;
                break;
            case 9:
                j10 = new wg0(this, xg0.y);
                j10.t = true;
                j10.u = R.raw.profile_leave;
                j10.x = 300;
                break;
            case 10:
                j10 = new wg0(this, xg0.A);
                j10.t = true;
                j10.u = R.raw.profile_voicechat;
                j10.x = 500;
                break;
            case 11:
                j10 = new wg0(this, xg0.B);
                j10.t = true;
                j10.u = R.raw.profile_voicechat;
                j10.x = 500;
                break;
            case 12:
                j10 = new wg0(this, xg0.C);
                break;
            case 13:
                j10 = new wg0(this, xg0.D);
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
        return this.C.contains(5) && this.G != null;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.C.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.C;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i11))) {
            return;
        }
        arrayList.add(k(i10));
    }

    public final void o(int i10, boolean z10) {
        HashSet hashSet = this.C;
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
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        wg0 wg0Var;
        float f15;
        boolean z10;
        boolean z11;
        int i12;
        wg0 wg0Var2;
        float f16 = this.f;
        if (f16 >= 0.0f) {
            float y8 = f16 - getY();
            if (y8 <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y8);
            }
        }
        float f17 = this.A - this.K;
        float f18 = this.L;
        float max = Math.max(0.0f, f17 - f18);
        if (max <= 0.0f) {
            return;
        }
        float f19 = this.J;
        float f20 = f19 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        RenderNode renderNode = this.w;
        Path path = this.n;
        if (renderNode != null) {
            path.rewind();
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        wg0 wg0Var3 = null;
        wg0 wg0Var4 = null;
        int i13 = 0;
        float f21 = 2.0f;
        while (i13 < size) {
            wg0 wg0Var5 = (wg0) arrayList.get(i13);
            boolean z12 = wg0Var5.p;
            float f22 = max;
            uc ucVar = wg0Var5.b;
            float f23 = f20;
            RectF rectF = wg0Var5.d;
            if (z12) {
                f13 = f18;
                f14 = itemWidth;
                i11 = i13;
            } else {
                if (!wg0Var5.o) {
                    rectF.set(f19, f18, f19 + itemWidth, f18 + f22);
                    f19 += itemWidth + f23;
                    if (wg0Var3 == null) {
                        wg0Var3 = wg0Var5;
                    }
                    wg0Var4 = wg0Var5;
                }
                d6 d6Var = wg0Var5.e;
                f13 = f18;
                RectF rectF2 = wg0Var5.c;
                float f24 = f19;
                zg0 zg0Var = wg0Var5.y;
                f14 = itemWidth;
                RectF rectF3 = wg0Var5.f;
                i11 = i13;
                RectF rectF4 = wg0Var5.g;
                wg0 wg0Var6 = wg0Var3;
                if (wg0Var5.o) {
                    wg0Var5.a();
                } else {
                    boolean z13 = zg0Var.e;
                    float f25 = zg0Var.J;
                    if (z13) {
                        wg0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        d6Var.d(1.0f, true);
                    } else {
                        if (rectF3.isEmpty()) {
                            wg0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f25;
                            boolean z15 = rectF.right + 1.0f >= ((float) zg0Var.getMeasuredWidth()) - f25;
                            if (z14 && z15) {
                                wg0Var = wg0Var4;
                            } else {
                                z11 = z15;
                                wg0 wg0Var7 = zg0Var.H;
                                if (wg0Var7 != null) {
                                    wg0Var = wg0Var4;
                                } else {
                                    wg0Var = wg0Var4;
                                }
                                wg0 wg0Var8 = zg0Var.I;
                                if (wg0Var8 != null) {
                                }
                                i12 = wg0Var5.a;
                                if (((i12 != 5 && i12 != 6) || zg0Var.D != 0) && ((i12 != 3 && i12 != 2) || zg0Var.D != 1)) {
                                    if (!z14 && (wg0Var2 = zg0Var.H) != null && !wg0Var2.o) {
                                        z11 = true;
                                        z14 = false;
                                    } else if (z11) {
                                        wg0 wg0Var9 = zg0Var.I;
                                        if (wg0Var9 != null) {
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
                                    f15 = 0.0f;
                                    z10 = true;
                                    d6Var.d(0.0f, true);
                                }
                                z11 = false;
                                z14 = true;
                                if (!z14) {
                                }
                                f15 = 0.0f;
                                z10 = true;
                                d6Var.d(0.0f, true);
                            }
                            z11 = false;
                            z14 = false;
                            i12 = wg0Var5.a;
                            if (i12 != 5) {
                                if (!z14) {
                                }
                                if (z11) {
                                }
                                if (!z14) {
                                }
                                f15 = 0.0f;
                                z10 = true;
                                d6Var.d(0.0f, true);
                            }
                            if (!z14) {
                            }
                            if (z11) {
                            }
                            if (!z14) {
                            }
                            f15 = 0.0f;
                            z10 = true;
                            d6Var.d(0.0f, true);
                        } else {
                            wg0Var = wg0Var4;
                            f15 = 0.0f;
                            z10 = true;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            d6Var.d(f15, z10);
                        }
                        wg0Var5.a();
                        rectF2.set(rectF);
                        if (this.w != null) {
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set(rectF);
                            rectF5.inset((1.0f - ucVar.a(0.04f)) * (rectF.width() / 2.0f), (1.0f - ucVar.a(0.04f)) * (rectF.height() / 2.0f));
                            rectF5.inset(-1.0f, -1.0f);
                            path.addRoundRect(rectF5, roundRadius, roundRadius, Path.Direction.CCW);
                        }
                        f19 = f24;
                        wg0Var3 = wg0Var6;
                        wg0Var4 = wg0Var;
                    }
                }
                wg0Var = wg0Var4;
                if (this.w != null) {
                }
                f19 = f24;
                wg0Var3 = wg0Var6;
                wg0Var4 = wg0Var;
            }
            i13 = i11 + 1;
            max = f22;
            f20 = f23;
            f18 = f13;
            itemWidth = f14;
        }
        this.H = wg0Var3;
        this.I = wg0Var4;
        float f26 = this.y;
        float clamp01 = Utilities.clamp01(max / f26);
        float clamp012 = Utilities.clamp01((clamp01 - 0.2f) / 0.8f);
        if (clamp012 <= 0.0f) {
            return;
        }
        int i14 = 0;
        while (i14 < size) {
            wg0 wg0Var10 = (wg0) arrayList.get(i14);
            boolean z16 = wg0Var10.p;
            uc ucVar2 = wg0Var10.b;
            RectF rectF6 = wg0Var10.d;
            if (z16) {
                f12 = clamp012;
                i10 = i14;
            } else {
                RectF rectF7 = AndroidUtilities.rectTmp;
                rectF7.set(rectF6);
                rectF7.inset((1.0f - ucVar2.a(0.04f)) * (rectF6.width() / 2.0f), (1.0f - ucVar2.a(0.04f)) * (rectF6.height() / 2.0f));
                Paint paint = this.b;
                int alpha = paint.getAlpha();
                float b10 = (int) (wg0Var10.b() * clamp012 * alpha);
                paint.setAlpha((int) ((this.O != null ? 0.1f : 1.0f) * b10));
                if (!SharedConfig.shadowsInSections || AndroidUtilities.computePerceivedBrightness(this.M) <= 0.72f || this.d >= 0.5f) {
                    f12 = clamp012;
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else {
                    f12 = clamp012;
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.l1((b10 / 255.0f) * (this.O != null ? 0.1f : 1.0f), TLObject.FLAG_29));
                }
                canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint);
                if (this.O != null) {
                    Paint paint2 = this.c;
                    int alpha2 = paint2.getAlpha();
                    paint2.setAlpha((int) (wg0Var10.b() * f12 * alpha2));
                    float f27 = rectF7.left;
                    float f28 = rectF7.top;
                    i10 = i14;
                    Matrix matrix = this.P;
                    matrix.setTranslate(f27, f28);
                    this.O.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint2);
                    paint2.setAlpha(alpha2);
                } else {
                    i10 = i14;
                }
                paint.setAlpha(alpha);
            }
            i14 = i10 + 1;
            clamp012 = f12;
        }
        RenderNode renderNode2 = this.w;
        if (renderNode2 != null && Build.VERSION.SDK_INT >= 29 && renderNode2.hasDisplayList() && canvas.isHardwareAccelerated()) {
            canvas.save();
            org.telegram.ui.iz0 iz0Var = this.r;
            if (iz0Var != null) {
                View view = (View) iz0Var.getParent();
                float x4 = view.getX();
                float y10 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.h;
                path2.rewind();
                path2.addRoundRect(x4, y10, x4 + scaleX, y10 + scaleY, view.getScaleX() * this.r.getRoundRadiusForExpand(), view.getScaleY() * this.r.getRoundRadiusForExpand(), Path.Direction.CCW);
                canvas.clipPath(path2);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, this.v);
            float f29 = this.s;
            canvas.scale(f29, f29);
            canvas.drawRenderNode(this.w);
            canvas.restore();
        }
        float clamp013 = Utilities.clamp01((clamp01 - 0.4f) / 0.6f);
        if (clamp013 > 0.0f) {
            int i15 = 0;
            while (i15 < size) {
                wg0 wg0Var11 = (wg0) arrayList.get(i15);
                if (wg0Var11 != null) {
                    Rect rect = wg0Var11.h;
                    RectF rectF8 = wg0Var11.d;
                    if (!wg0Var11.p) {
                        boolean z17 = AndroidUtilities.computePerceivedBrightness(this.M) > 0.72f;
                        float a2 = (!z17 || Build.VERSION.SDK_INT >= 31) ? !z17 ? 1.0f : i7.w.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int d = i0.a.d(a2, -16777216, -1);
                        if (this.R == null || this.Q != d) {
                            this.Q = d;
                            this.R = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = wg0Var11.b() * clamp013;
                        float centerX2 = rectF8.centerX();
                        float centerY = rectF8.centerY();
                        float f30 = a2;
                        f10 = clamp01;
                        float a10 = wg0Var11.b.a(0.04f) * f10;
                        canvas.scale(a10, a10, centerX2, centerY);
                        canvas.clipRect(rectF8);
                        float centerX3 = rectF8.centerX();
                        rectF8.centerY();
                        float dp = AndroidUtilities.dp(24.0f);
                        float f31 = dp * 0.5f;
                        wg0Var11.l.q(rectF8.width() - AndroidUtilities.dp(f21));
                        wg0Var11.m = wg0Var11.l.b.getLineCount() >= 3 ? 0.75f : wg0Var11.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, AndroidUtilities.dpf2(1.33f) + com.google.android.recaptcha.internal.a.w(wg0Var11.l.j(), wg0Var11.m, f26, 3.0f));
                        rect.set((int) (centerX3 - f31), (int) max2, (int) (centerX3 + f31), (int) (max2 + dp));
                        xi0 xi0Var = wg0Var11.k;
                        if (xi0Var != null) {
                            xi0Var.setBounds(rect);
                        }
                        Drawable drawable = wg0Var11.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = wg0Var11.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float j10 = ((rect.bottom + rect.top) - ((wg0Var11.l.j() * wg0Var11.m) / f21)) - AndroidUtilities.dp(4.66f);
                        canvas.save();
                        float f32 = wg0Var11.m;
                        f9 = f26;
                        canvas.scale(f32, f32, centerX2, a4.w.d(wg0Var11.l.j(), wg0Var11.m, 2.0f, j10));
                        zz0 zz0Var = wg0Var11.l;
                        zz0Var.c(centerX2 - (zz0Var.l() / 2.0f), j10, b11, d, canvas);
                        canvas.restore();
                        float f33 = wg0Var11.q;
                        if (f33 != 1.0f) {
                            canvas.scale(f33, f33, rect.centerX(), rect.centerY());
                        }
                        float f34 = (1.0f - f30) * b11;
                        float f35 = f30 * b11;
                        xi0 xi0Var2 = wg0Var11.k;
                        if (xi0Var2 == null) {
                            h(canvas, wg0Var11.j, f34);
                            h(canvas, wg0Var11.i, f35);
                        } else if (wg0Var11.a == 1) {
                            h(canvas, wg0Var11.j, f34);
                            h(canvas, wg0Var11.k, f35);
                        } else {
                            h(canvas, xi0Var2, b11);
                        }
                        canvas.restore();
                        if (wg0Var11.x > 0 && System.currentTimeMillis() > wg0Var11.x + wg0Var11.w) {
                            wg0Var11.s = false;
                        }
                        if (wg0Var11.s) {
                            c90 c90Var = wg0Var11.r;
                            if (c90Var == null) {
                                c90 c90Var2 = new c90();
                                wg0Var11.r = c90Var2;
                                c90Var2.setCallback(this);
                                wg0Var11.r.f(org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.35f, -1), org.telegram.ui.ActionBar.g6.l1(0.8f, -1));
                                c90 c90Var3 = wg0Var11.r;
                                c90Var3.C = true;
                                c90Var3.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                            } else if (c90Var.b() || wg0Var11.r.c()) {
                                c90 c90Var4 = wg0Var11.r;
                                f11 = clamp013;
                                c90Var4.b = -1L;
                                c90Var4.c = -1L;
                            }
                            f11 = clamp013;
                        } else {
                            f11 = clamp013;
                            c90 c90Var5 = wg0Var11.r;
                            if (c90Var5 != null && !c90Var5.c() && !wg0Var11.r.b()) {
                                wg0Var11.r.a();
                            }
                        }
                        c90 c90Var6 = wg0Var11.r;
                        if (c90Var6 != null) {
                            c90Var6.d(rectF8);
                            wg0Var11.r.h(getRoundRadius());
                            wg0Var11.r.setAlpha((int) (b11 * 255.0f));
                            wg0Var11.r.draw(canvas);
                        }
                        i15++;
                        clamp013 = f11;
                        f26 = f9;
                        clamp01 = f10;
                        f21 = 2.0f;
                    }
                }
                f9 = f26;
                f10 = clamp01;
                f11 = clamp013;
                i15++;
                clamp013 = f11;
                f26 = f9;
                clamp01 = f10;
                f21 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.y + this.L + this.K), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wg0 wg0Var;
        if (this.A >= AndroidUtilities.dp(8.0f)) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.S = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    wg0 wg0Var2 = (wg0) arrayList.get(i10);
                    if (!wg0Var2.o && wg0Var2.d.contains(x4, y8)) {
                        this.S = wg0Var2;
                        this.T = x4;
                        this.U = y8;
                        this.V = System.currentTimeMillis();
                        this.S.b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.S != null && (Math.abs(x4 - this.T) > 20.0f || Math.abs(y8 - this.U) > 20.0f)) {
                    this.S.b.c(false);
                    this.S = null;
                }
            } else if ((action == 1 || action == 3) && (wg0Var = this.S) != null) {
                wg0Var.b.c(false);
                if (action == 1 && this.S.d.contains(x4, y8)) {
                    if (System.currentTimeMillis() - this.V > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    wg0 wg0Var3 = this.S;
                    if (wg0Var3.t && !wg0Var3.s) {
                        wg0Var3.s = true;
                        invalidate();
                    }
                    wg0 wg0Var4 = this.S;
                    int i11 = wg0Var4.u;
                    if (i11 != 0) {
                        wg0Var4.d(i11, 0, 0);
                    }
                    this.S.w = System.currentTimeMillis();
                    wg0 wg0Var5 = this.S;
                    yg0 yg0Var = this.B;
                    if (yg0Var != null) {
                        int i12 = wg0Var5.v;
                        if (i12 == 0) {
                            int i13 = wg0Var5.a;
                            RectF rectF = wg0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.ex0) yg0Var).b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new gt(29, this, wg0Var5), i12);
                        }
                    }
                }
                this.S = null;
                return true;
            }
            if (this.S != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(wg0 wg0Var, boolean z10) {
        if (!z10) {
            xg0 xg0Var = this.F ? xg0.e : xg0.f;
            wg0Var.d(0, xg0Var.b, xg0Var.c);
            wg0Var.c(LocaleController.getString(xg0Var.a));
        } else if (this.F) {
            xg0 xg0Var2 = xg0.e;
            wg0Var.c(LocaleController.getString(xg0Var2.a));
            wg0Var.d(R.raw.profile_unmuting, xg0Var2.b, xg0Var2.c);
        } else {
            xg0 xg0Var3 = xg0.f;
            wg0Var.c(LocaleController.getString(xg0Var3.a));
            wg0Var.d(R.raw.profile_muting, xg0Var3.b, xg0Var3.c);
        }
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.F != z10;
        this.F = z10;
        wg0 j10 = j(1, this.a);
        if (j10 != null) {
            p(j10, z11);
            invalidate();
        } else {
            this.C.add(1);
            d();
        }
    }

    public void setOnActionClickListener(yg0 yg0Var) {
        this.B = yg0Var;
    }

    public void setParentExpanded(float f9) {
        if (this.d != f9) {
            this.d = f9;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof c90);
    }
}
