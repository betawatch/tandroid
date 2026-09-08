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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dh0 extends View {
    public float E;
    public ch0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public ah0 K;
    public ah0 L;
    public ah0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public ah0 W;
    public final ArrayList a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public long c0;
    public float d;
    public zg0 d0;
    public boolean e;
    public float f;
    public final Path h;
    public final Path n;
    public org.telegram.ui.n01 r;
    public float s;
    public float v;
    public RenderNode w;
    public int x;
    public final int y;

    public dh0(Context context, int i10) {
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

    public static ah0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ah0 ah0Var = (ah0) list.get(i11);
            if (!ah0Var.o && ah0Var.a == i10) {
                return ah0Var;
            }
        }
        return null;
    }

    public final void a() {
        ah0 ah0Var = new ah0(this, bh0.I);
        ah0Var.a = 14;
        this.a.add(ah0Var);
    }

    public final void b() {
        ah0 ah0Var = new ah0(this, bh0.J);
        ah0Var.a = 16;
        this.a.add(ah0Var);
    }

    public final void c() {
        ah0 ah0Var = new ah0(this, bh0.K);
        ah0Var.a = 17;
        this.a.add(ah0Var);
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
        AndroidUtilities.runOnUIThread(new zu(25, this, arrayList));
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
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.y / 2.0f, this.R ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.j6.l1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
        this.S = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.d0 == null) {
            this.d0 = new zg0(this);
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

    public final ah0 k(int i10) {
        ah0 j3 = j(i10, this.a);
        if (j3 != null) {
            if (i10 == 1) {
                p(j3, false);
            }
            return j3;
        }
        switch (i10) {
            case 0:
                j3 = new ah0(this, bh0.d);
                break;
            case 1:
                j3 = new ah0(this);
                p(j3, false);
                break;
            case 2:
                j3 = new ah0(this, bh0.h);
                break;
            case 3:
                j3 = new ah0(this, bh0.n);
                j3.t = true;
                j3.x = 200;
                break;
            case 4:
                j3 = new ah0(this, bh0.r);
                break;
            case 5:
                j3 = new ah0(this, bh0.s);
                this.K = j3;
                j3.t = true;
                j3.x = 500;
                break;
            case 6:
                j3 = new ah0(this, bh0.v);
                j3.t = true;
                j3.x = 500;
                break;
            case 7:
                j3 = new ah0(this, bh0.w);
                j3.t = true;
                j3.v = 300;
                break;
            case 8:
                j3 = new ah0(this, bh0.x);
                j3.t = true;
                j3.x = 500;
                break;
            case 9:
                j3 = new ah0(this, bh0.y);
                j3.t = true;
                j3.u = R.raw.profile_leave;
                j3.x = 300;
                break;
            case 10:
                j3 = new ah0(this, bh0.E);
                j3.t = true;
                j3.u = R.raw.profile_voicechat;
                j3.x = 500;
                break;
            case 11:
                j3 = new ah0(this, bh0.F);
                j3.t = true;
                j3.u = R.raw.profile_voicechat;
                j3.x = 500;
                break;
            case 12:
                j3 = new ah0(this, bh0.G);
                break;
            case 13:
                j3 = new ah0(this, bh0.H);
                j3.t = true;
                j3.x = 300;
                break;
        }
        if (j3 != null) {
            j3.a = i10;
        }
        return j3;
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
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        ah0 ah0Var;
        float f15;
        boolean z10;
        boolean z11;
        int i12;
        ah0 ah0Var2;
        float f16 = this.f;
        if (f16 >= 0.0f) {
            float y3 = f16 - getY();
            if (y3 <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y3);
            }
        }
        float f17 = this.E - this.O;
        float f18 = this.P;
        float max = Math.max(0.0f, f17 - f18);
        if (max <= 0.0f) {
            return;
        }
        float f19 = this.N;
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
        ah0 ah0Var3 = null;
        ah0 ah0Var4 = null;
        int i13 = 0;
        float f21 = 2.0f;
        while (i13 < size) {
            ah0 ah0Var5 = (ah0) arrayList.get(i13);
            boolean z12 = ah0Var5.p;
            float f22 = max;
            zc zcVar = ah0Var5.b;
            float f23 = f20;
            RectF rectF = ah0Var5.d;
            if (z12) {
                f13 = f18;
                f14 = itemWidth;
                i11 = i13;
            } else {
                if (!ah0Var5.o) {
                    rectF.set(f19, f18, f19 + itemWidth, f18 + f22);
                    f19 += itemWidth + f23;
                    if (ah0Var3 == null) {
                        ah0Var3 = ah0Var5;
                    }
                    ah0Var4 = ah0Var5;
                }
                e6 e6Var = ah0Var5.e;
                f13 = f18;
                RectF rectF2 = ah0Var5.c;
                float f24 = f19;
                dh0 dh0Var = ah0Var5.y;
                f14 = itemWidth;
                RectF rectF3 = ah0Var5.f;
                i11 = i13;
                RectF rectF4 = ah0Var5.g;
                ah0 ah0Var6 = ah0Var3;
                if (ah0Var5.o) {
                    ah0Var5.a();
                } else {
                    boolean z13 = dh0Var.e;
                    float f25 = dh0Var.N;
                    if (z13) {
                        ah0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        e6Var.d(1.0f, true);
                    } else {
                        if (rectF3.isEmpty()) {
                            ah0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f25;
                            boolean z15 = rectF.right + 1.0f >= ((float) dh0Var.getMeasuredWidth()) - f25;
                            if (z14 && z15) {
                                ah0Var = ah0Var4;
                            } else {
                                z11 = z15;
                                ah0 ah0Var7 = dh0Var.L;
                                if (ah0Var7 != null) {
                                    ah0Var = ah0Var4;
                                } else {
                                    ah0Var = ah0Var4;
                                }
                                ah0 ah0Var8 = dh0Var.M;
                                if (ah0Var8 != null) {
                                }
                                i12 = ah0Var5.a;
                                if (((i12 != 5 && i12 != 6) || dh0Var.H != 0) && ((i12 != 3 && i12 != 2) || dh0Var.H != 1)) {
                                    if (!z14 && (ah0Var2 = dh0Var.L) != null && !ah0Var2.o) {
                                        z11 = true;
                                        z14 = false;
                                    } else if (z11) {
                                        ah0 ah0Var9 = dh0Var.M;
                                        if (ah0Var9 != null) {
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
                                    e6Var.d(0.0f, true);
                                }
                                z11 = false;
                                z14 = true;
                                if (!z14) {
                                }
                                f15 = 0.0f;
                                z10 = true;
                                e6Var.d(0.0f, true);
                            }
                            z11 = false;
                            z14 = false;
                            i12 = ah0Var5.a;
                            if (i12 != 5) {
                                if (!z14) {
                                }
                                if (z11) {
                                }
                                if (!z14) {
                                }
                                f15 = 0.0f;
                                z10 = true;
                                e6Var.d(0.0f, true);
                            }
                            if (!z14) {
                            }
                            if (z11) {
                            }
                            if (!z14) {
                            }
                            f15 = 0.0f;
                            z10 = true;
                            e6Var.d(0.0f, true);
                        } else {
                            ah0Var = ah0Var4;
                            f15 = 0.0f;
                            z10 = true;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            e6Var.d(f15, z10);
                        }
                        ah0Var5.a();
                        rectF2.set(rectF);
                        if (this.w != null) {
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set(rectF);
                            rectF5.inset((1.0f - zcVar.a(0.04f)) * (rectF.width() / 2.0f), (1.0f - zcVar.a(0.04f)) * (rectF.height() / 2.0f));
                            rectF5.inset(-1.0f, -1.0f);
                            path.addRoundRect(rectF5, roundRadius, roundRadius, Path.Direction.CCW);
                        }
                        f19 = f24;
                        ah0Var3 = ah0Var6;
                        ah0Var4 = ah0Var;
                    }
                }
                ah0Var = ah0Var4;
                if (this.w != null) {
                }
                f19 = f24;
                ah0Var3 = ah0Var6;
                ah0Var4 = ah0Var;
            }
            i13 = i11 + 1;
            max = f22;
            f20 = f23;
            f18 = f13;
            itemWidth = f14;
        }
        this.L = ah0Var3;
        this.M = ah0Var4;
        float f26 = this.y;
        float clamp01 = Utilities.clamp01(max / f26);
        float clamp012 = Utilities.clamp01((clamp01 - 0.2f) / 0.8f);
        if (clamp012 <= 0.0f) {
            return;
        }
        int i14 = 0;
        while (i14 < size) {
            ah0 ah0Var10 = (ah0) arrayList.get(i14);
            boolean z16 = ah0Var10.p;
            zc zcVar2 = ah0Var10.b;
            RectF rectF6 = ah0Var10.d;
            if (z16) {
                f12 = clamp012;
                i10 = i14;
            } else {
                RectF rectF7 = AndroidUtilities.rectTmp;
                rectF7.set(rectF6);
                rectF7.inset((1.0f - zcVar2.a(0.04f)) * (rectF6.width() / 2.0f), (1.0f - zcVar2.a(0.04f)) * (rectF6.height() / 2.0f));
                Paint paint = this.b;
                int alpha = paint.getAlpha();
                float b10 = (int) (ah0Var10.b() * clamp012 * alpha);
                paint.setAlpha((int) ((this.S != null ? 0.1f : 1.0f) * b10));
                if (!SharedConfig.shadowsInSections || AndroidUtilities.computePerceivedBrightness(this.Q) <= 0.72f || this.d >= 0.5f) {
                    f12 = clamp012;
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else {
                    f12 = clamp012;
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, org.telegram.ui.ActionBar.j6.l1((b10 / 255.0f) * (this.S != null ? 0.1f : 1.0f), TLObject.FLAG_29));
                }
                canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint);
                if (this.S != null) {
                    Paint paint2 = this.c;
                    int alpha2 = paint2.getAlpha();
                    paint2.setAlpha((int) (ah0Var10.b() * f12 * alpha2));
                    float f27 = rectF7.left;
                    float f28 = rectF7.top;
                    i10 = i14;
                    Matrix matrix = this.T;
                    matrix.setTranslate(f27, f28);
                    this.S.setLocalMatrix(matrix);
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
            org.telegram.ui.n01 n01Var = this.r;
            if (n01Var != null) {
                View view = (View) n01Var.getParent();
                float x10 = view.getX();
                float y10 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.h;
                path2.rewind();
                path2.addRoundRect(x10, y10, x10 + scaleX, y10 + scaleY, view.getScaleX() * this.r.getRoundRadiusForExpand(), view.getScaleY() * this.r.getRoundRadiusForExpand(), Path.Direction.CCW);
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
                ah0 ah0Var11 = (ah0) arrayList.get(i15);
                if (ah0Var11 != null) {
                    Rect rect = ah0Var11.h;
                    RectF rectF8 = ah0Var11.d;
                    if (!ah0Var11.p) {
                        boolean z17 = AndroidUtilities.computePerceivedBrightness(this.Q) > 0.72f;
                        float a2 = (!z17 || Build.VERSION.SDK_INT >= 31) ? !z17 ? 1.0f : w7.p.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int d = i0.a.d(a2, -16777216, -1);
                        if (this.V == null || this.U != d) {
                            this.U = d;
                            this.V = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = ah0Var11.b() * clamp013;
                        float centerX2 = rectF8.centerX();
                        float centerY = rectF8.centerY();
                        float f30 = a2;
                        f10 = clamp01;
                        float a10 = ah0Var11.b.a(0.04f) * f10;
                        canvas.scale(a10, a10, centerX2, centerY);
                        canvas.clipRect(rectF8);
                        float centerX3 = rectF8.centerX();
                        rectF8.centerY();
                        float dp = AndroidUtilities.dp(24.0f);
                        float f31 = dp * 0.5f;
                        ah0Var11.l.q(rectF8.width() - AndroidUtilities.dp(f21));
                        ah0Var11.m = ah0Var11.l.b.getLineCount() >= 3 ? 0.75f : ah0Var11.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, AndroidUtilities.dpf2(1.33f) + com.google.android.gms.internal.vision.e2.v(ah0Var11.l.j(), ah0Var11.m, f26, 3.0f));
                        rect.set((int) (centerX3 - f31), (int) max2, (int) (centerX3 + f31), (int) (max2 + dp));
                        xi0 xi0Var = ah0Var11.k;
                        if (xi0Var != null) {
                            xi0Var.setBounds(rect);
                        }
                        Drawable drawable = ah0Var11.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = ah0Var11.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float j3 = ((rect.bottom + rect.top) - ((ah0Var11.l.j() * ah0Var11.m) / f21)) - AndroidUtilities.dp(4.66f);
                        canvas.save();
                        float f32 = ah0Var11.m;
                        f7 = f26;
                        canvas.scale(f32, f32, centerX2, a4.a.A(ah0Var11.l.j(), ah0Var11.m, 2.0f, j3));
                        f01 f01Var = ah0Var11.l;
                        f01Var.c(centerX2 - (f01Var.l() / 2.0f), j3, b11, d, canvas);
                        canvas.restore();
                        float f33 = ah0Var11.q;
                        if (f33 != 1.0f) {
                            canvas.scale(f33, f33, rect.centerX(), rect.centerY());
                        }
                        float f34 = (1.0f - f30) * b11;
                        float f35 = f30 * b11;
                        xi0 xi0Var2 = ah0Var11.k;
                        if (xi0Var2 == null) {
                            h(canvas, ah0Var11.j, f34);
                            h(canvas, ah0Var11.i, f35);
                        } else if (ah0Var11.a == 1) {
                            h(canvas, ah0Var11.j, f34);
                            h(canvas, ah0Var11.k, f35);
                        } else {
                            h(canvas, xi0Var2, b11);
                        }
                        canvas.restore();
                        if (ah0Var11.x > 0 && System.currentTimeMillis() > ah0Var11.x + ah0Var11.w) {
                            ah0Var11.s = false;
                        }
                        if (ah0Var11.s) {
                            h90 h90Var = ah0Var11.r;
                            if (h90Var == null) {
                                h90 h90Var2 = new h90();
                                ah0Var11.r = h90Var2;
                                h90Var2.setCallback(this);
                                ah0Var11.r.f(org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.35f, -1), org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
                                h90 h90Var3 = ah0Var11.r;
                                h90Var3.C = true;
                                h90Var3.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                            } else if (h90Var.b() || ah0Var11.r.c()) {
                                h90 h90Var4 = ah0Var11.r;
                                f11 = clamp013;
                                h90Var4.b = -1L;
                                h90Var4.c = -1L;
                            }
                            f11 = clamp013;
                        } else {
                            f11 = clamp013;
                            h90 h90Var5 = ah0Var11.r;
                            if (h90Var5 != null && !h90Var5.c() && !ah0Var11.r.b()) {
                                ah0Var11.r.a();
                            }
                        }
                        h90 h90Var6 = ah0Var11.r;
                        if (h90Var6 != null) {
                            h90Var6.d(rectF8);
                            ah0Var11.r.h(getRoundRadius());
                            ah0Var11.r.setAlpha((int) (b11 * 255.0f));
                            ah0Var11.r.draw(canvas);
                        }
                        i15++;
                        clamp013 = f11;
                        f26 = f7;
                        clamp01 = f10;
                        f21 = 2.0f;
                    }
                }
                f7 = f26;
                f10 = clamp01;
                f11 = clamp013;
                i15++;
                clamp013 = f11;
                f26 = f7;
                clamp01 = f10;
                f21 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.y + this.P + this.O), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ah0 ah0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
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
                    ah0 ah0Var2 = (ah0) arrayList.get(i10);
                    if (!ah0Var2.o && ah0Var2.d.contains(x10, y3)) {
                        this.W = ah0Var2;
                        this.a0 = x10;
                        this.b0 = y3;
                        this.c0 = System.currentTimeMillis();
                        this.W.b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x10 - this.a0) > 20.0f || Math.abs(y3 - this.b0) > 20.0f)) {
                    this.W.b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (ah0Var = this.W) != null) {
                ah0Var.b.c(false);
                if (action == 1 && this.W.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ah0 ah0Var3 = this.W;
                    if (ah0Var3.t && !ah0Var3.s) {
                        ah0Var3.s = true;
                        invalidate();
                    }
                    ah0 ah0Var4 = this.W;
                    int i11 = ah0Var4.u;
                    if (i11 != 0) {
                        ah0Var4.d(i11, 0, 0);
                    }
                    this.W.w = System.currentTimeMillis();
                    ah0 ah0Var5 = this.W;
                    ch0 ch0Var = this.F;
                    if (ch0Var != null) {
                        int i12 = ah0Var5.v;
                        if (i12 == 0) {
                            int i13 = ah0Var5.a;
                            RectF rectF = ah0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new zu(26, this, ah0Var5), i12);
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

    public final void p(ah0 ah0Var, boolean z10) {
        if (!z10) {
            bh0 bh0Var = this.J ? bh0.e : bh0.f;
            ah0Var.d(0, bh0Var.b, bh0Var.c);
            ah0Var.c(LocaleController.getString(bh0Var.a));
        } else if (this.J) {
            bh0 bh0Var2 = bh0.e;
            ah0Var.c(LocaleController.getString(bh0Var2.a));
            ah0Var.d(R.raw.profile_unmuting, bh0Var2.b, bh0Var2.c);
        } else {
            bh0 bh0Var3 = bh0.f;
            ah0Var.c(LocaleController.getString(bh0Var3.a));
            ah0Var.d(R.raw.profile_muting, bh0Var3.b, bh0Var3.c);
        }
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.J != z10;
        this.J = z10;
        ah0 j3 = j(1, this.a);
        if (j3 != null) {
            p(j3, z11);
            invalidate();
        } else {
            this.G.add(1);
            d();
        }
    }

    public void setOnActionClickListener(ch0 ch0Var) {
        this.F = ch0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof h90);
    }
}
