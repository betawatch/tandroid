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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lh0 extends View {
    public float B;
    public kh0 C;
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public ih0 H;
    public ih0 I;
    public ih0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public ih0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList a;
    public hh0 a0;
    public final Paint b;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public final Path h;
    public final Path n;
    public org.telegram.ui.vz0 r;
    public float s;
    public float v;
    public RenderNode w;
    public int x;
    public final int y;

    public lh0(Context context, int i10) {
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
        this.B = 0.0f;
        this.C = null;
        this.D = new HashSet();
        this.E = 6;
        this.H = null;
        this.N = 0;
        this.Q = new Matrix();
        this.T = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.K = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.L = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.M = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.K;
        return ((measuredWidth - ((f10 / 2.0f) * (r4 - 1))) - (f10 * 2.0f)) / this.x;
    }

    public static ih0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ih0 ih0Var = (ih0) list.get(i11);
            if (!ih0Var.o && ih0Var.a == i10) {
                return ih0Var;
            }
        }
        return null;
    }

    public final void a() {
        ih0 ih0Var = new ih0(this, jh0.F);
        ih0Var.a = 14;
        this.a.add(ih0Var);
    }

    public final void b() {
        ih0 ih0Var = new ih0(this, jh0.G);
        ih0Var.a = 16;
        this.a.add(ih0Var);
    }

    public final void c() {
        ih0 ih0Var = new ih0(this, jh0.H);
        ih0Var.a = 17;
        this.a.add(ih0Var);
    }

    public final void d() {
        if (this.F) {
            return;
        }
        if (this.E == 6) {
            this.x = this.a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.D;
        boolean z4 = hashSet.contains(7) && !hashSet.contains(9);
        int i10 = this.E;
        if (i10 == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (i10 == 1) {
            if (z4) {
                m(7, arrayList);
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
            }
            m(1, arrayList);
            if (!z4) {
                m(2, arrayList);
                if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                    arrayList.add(k(3));
                }
            }
            n(4, 12, arrayList);
            if (z4) {
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
            if (z4) {
                m(7, arrayList);
            } else {
                m(0, arrayList);
            }
            m(1, arrayList);
            if (z4) {
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
        AndroidUtilities.runOnUIThread(new a90(6, this, arrayList));
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
        float f10 = this.K;
        float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.x - 1))) - (f10 * 2.0f)) / Math.max(1, this.x);
        RadialGradient radialGradient = new RadialGradient(max / 2.0f, this.y / 2.0f, this.O ? max * 0.65f : 1.0f, org.telegram.ui.ActionBar.k6.l1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
        this.P = radialGradient;
        this.c.setShader(radialGradient);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.a0 == null) {
            this.a0 = new hh0(this);
        }
        return this.a0;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.S);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.w != null) {
            this.w = null;
            this.r = null;
            invalidate();
        }
    }

    public final ih0 k(int i10) {
        ih0 j10 = j(i10, this.a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new ih0(this, jh0.d);
                break;
            case 1:
                j10 = new ih0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new ih0(this, jh0.h);
                break;
            case 3:
                j10 = new ih0(this, jh0.n);
                j10.t = true;
                j10.x = 200;
                break;
            case 4:
                j10 = new ih0(this, jh0.r);
                break;
            case 5:
                j10 = new ih0(this, jh0.s);
                this.H = j10;
                j10.t = true;
                j10.x = 500;
                break;
            case 6:
                j10 = new ih0(this, jh0.v);
                j10.t = true;
                j10.x = 500;
                break;
            case 7:
                j10 = new ih0(this, jh0.w);
                j10.t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new ih0(this, jh0.x);
                j10.t = true;
                j10.x = 500;
                break;
            case 9:
                j10 = new ih0(this, jh0.y);
                j10.t = true;
                j10.u = R.raw.profile_leave;
                j10.x = 300;
                break;
            case 10:
                j10 = new ih0(this, jh0.B);
                j10.t = true;
                j10.u = R.raw.profile_voicechat;
                j10.x = 500;
                break;
            case 11:
                j10 = new ih0(this, jh0.C);
                j10.t = true;
                j10.u = R.raw.profile_voicechat;
                j10.x = 500;
                break;
            case 12:
                j10 = new ih0(this, jh0.D);
                break;
            case 13:
                j10 = new ih0(this, jh0.E);
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
        return this.D.contains(5) && this.H != null;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.D.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.D;
        if (!hashSet.contains(valueOf) || hashSet.contains(Integer.valueOf(i11))) {
            return;
        }
        arrayList.add(k(i10));
    }

    public final void o(int i10, boolean z4) {
        HashSet hashSet = this.D;
        if (z4 ? hashSet.add(Integer.valueOf(i10)) : hashSet.remove(Integer.valueOf(i10))) {
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
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        int i11;
        ih0 ih0Var;
        float f16;
        boolean z4;
        boolean z10;
        int i12;
        ih0 ih0Var2;
        float f17 = this.f;
        if (f17 >= 0.0f) {
            float y10 = f17 - getY();
            if (y10 <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y10);
            }
        }
        float f18 = this.B - this.L;
        float f19 = this.M;
        float max = Math.max(0.0f, f18 - f19);
        if (max <= 0.0f) {
            return;
        }
        float f20 = this.K;
        float f21 = f20 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        RenderNode renderNode = this.w;
        Path path = this.n;
        if (renderNode != null) {
            path.rewind();
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ih0 ih0Var3 = null;
        ih0 ih0Var4 = null;
        int i13 = 0;
        float f22 = 2.0f;
        while (i13 < size) {
            ih0 ih0Var5 = (ih0) arrayList.get(i13);
            boolean z11 = ih0Var5.p;
            float f23 = max;
            rc rcVar = ih0Var5.b;
            float f24 = f21;
            RectF rectF = ih0Var5.d;
            if (z11) {
                f14 = f19;
                f15 = itemWidth;
                i11 = i13;
            } else {
                if (!ih0Var5.o) {
                    rectF.set(f20, f19, f20 + itemWidth, f19 + f23);
                    f20 += itemWidth + f24;
                    if (ih0Var3 == null) {
                        ih0Var3 = ih0Var5;
                    }
                    ih0Var4 = ih0Var5;
                }
                z5 z5Var = ih0Var5.e;
                f14 = f19;
                RectF rectF2 = ih0Var5.c;
                float f25 = f20;
                lh0 lh0Var = ih0Var5.y;
                f15 = itemWidth;
                RectF rectF3 = ih0Var5.f;
                i11 = i13;
                RectF rectF4 = ih0Var5.g;
                ih0 ih0Var6 = ih0Var3;
                if (ih0Var5.o) {
                    ih0Var5.a();
                } else {
                    boolean z12 = lh0Var.e;
                    float f26 = lh0Var.K;
                    if (z12) {
                        ih0Var5.n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        z5Var.d(1.0f, true);
                    } else {
                        if (rectF3.isEmpty()) {
                            ih0Var5.n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z13 = rectF.left - 1.0f <= f26;
                            boolean z14 = rectF.right + 1.0f >= ((float) lh0Var.getMeasuredWidth()) - f26;
                            if (z13 && z14) {
                                ih0Var = ih0Var4;
                            } else {
                                z10 = z14;
                                ih0 ih0Var7 = lh0Var.I;
                                if (ih0Var7 != null) {
                                    ih0Var = ih0Var4;
                                } else {
                                    ih0Var = ih0Var4;
                                }
                                ih0 ih0Var8 = lh0Var.J;
                                if (ih0Var8 != null) {
                                }
                                i12 = ih0Var5.a;
                                if (((i12 != 5 && i12 != 6) || lh0Var.E != 0) && ((i12 != 3 && i12 != 2) || lh0Var.E != 1)) {
                                    if (!z13 && (ih0Var2 = lh0Var.I) != null && !ih0Var2.o) {
                                        z10 = true;
                                        z13 = false;
                                    } else if (z10) {
                                        ih0 ih0Var9 = lh0Var.J;
                                        if (ih0Var9 != null) {
                                        }
                                    }
                                    if (!z13) {
                                        rectF4.left = rectF4.right;
                                    } else if (z10) {
                                        rectF4.right = rectF4.left;
                                    } else {
                                        float centerX = rectF3.centerX();
                                        rectF4.right = centerX;
                                        rectF4.left = centerX;
                                    }
                                    f16 = 0.0f;
                                    z4 = true;
                                    z5Var.d(0.0f, true);
                                }
                                z10 = false;
                                z13 = true;
                                if (!z13) {
                                }
                                f16 = 0.0f;
                                z4 = true;
                                z5Var.d(0.0f, true);
                            }
                            z10 = false;
                            z13 = false;
                            i12 = ih0Var5.a;
                            if (i12 != 5) {
                                if (!z13) {
                                }
                                if (z10) {
                                }
                                if (!z13) {
                                }
                                f16 = 0.0f;
                                z4 = true;
                                z5Var.d(0.0f, true);
                            }
                            if (!z13) {
                            }
                            if (z10) {
                            }
                            if (!z13) {
                            }
                            f16 = 0.0f;
                            z4 = true;
                            z5Var.d(0.0f, true);
                        } else {
                            ih0Var = ih0Var4;
                            f16 = 0.0f;
                            z4 = true;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            z5Var.d(f16, z4);
                        }
                        ih0Var5.a();
                        rectF2.set(rectF);
                        if (this.w != null) {
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set(rectF);
                            rectF5.inset((1.0f - rcVar.a(0.04f)) * (rectF.width() / 2.0f), (1.0f - rcVar.a(0.04f)) * (rectF.height() / 2.0f));
                            rectF5.inset(-1.0f, -1.0f);
                            path.addRoundRect(rectF5, roundRadius, roundRadius, Path.Direction.CCW);
                        }
                        f20 = f25;
                        ih0Var3 = ih0Var6;
                        ih0Var4 = ih0Var;
                    }
                }
                ih0Var = ih0Var4;
                if (this.w != null) {
                }
                f20 = f25;
                ih0Var3 = ih0Var6;
                ih0Var4 = ih0Var;
            }
            i13 = i11 + 1;
            max = f23;
            f21 = f24;
            f19 = f14;
            itemWidth = f15;
        }
        this.I = ih0Var3;
        this.J = ih0Var4;
        float f27 = this.y;
        float clamp01 = Utilities.clamp01(max / f27);
        float clamp012 = Utilities.clamp01((clamp01 - 0.2f) / 0.8f);
        if (clamp012 <= 0.0f) {
            return;
        }
        int i14 = 0;
        while (i14 < size) {
            ih0 ih0Var10 = (ih0) arrayList.get(i14);
            boolean z15 = ih0Var10.p;
            rc rcVar2 = ih0Var10.b;
            RectF rectF6 = ih0Var10.d;
            if (z15) {
                f13 = clamp012;
                i10 = i14;
            } else {
                RectF rectF7 = AndroidUtilities.rectTmp;
                rectF7.set(rectF6);
                rectF7.inset((1.0f - rcVar2.a(0.04f)) * (rectF6.width() / 2.0f), (1.0f - rcVar2.a(0.04f)) * (rectF6.height() / 2.0f));
                Paint paint = this.b;
                int alpha = paint.getAlpha();
                float b10 = (int) (ih0Var10.b() * clamp012 * alpha);
                paint.setAlpha((int) ((this.P != null ? 0.1f : 1.0f) * b10));
                if (!SharedConfig.shadowsInSections || AndroidUtilities.computePerceivedBrightness(this.N) <= 0.72f || this.d >= 0.5f) {
                    f13 = clamp012;
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else {
                    f13 = clamp012;
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, org.telegram.ui.ActionBar.k6.l1((b10 / 255.0f) * (this.P != null ? 0.1f : 1.0f), TLObject.FLAG_29));
                }
                canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint);
                if (this.P != null) {
                    Paint paint2 = this.c;
                    int alpha2 = paint2.getAlpha();
                    paint2.setAlpha((int) (ih0Var10.b() * f13 * alpha2));
                    float f28 = rectF7.left;
                    float f29 = rectF7.top;
                    i10 = i14;
                    Matrix matrix = this.Q;
                    matrix.setTranslate(f28, f29);
                    this.P.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint2);
                    paint2.setAlpha(alpha2);
                } else {
                    i10 = i14;
                }
                paint.setAlpha(alpha);
            }
            i14 = i10 + 1;
            clamp012 = f13;
        }
        RenderNode renderNode2 = this.w;
        if (renderNode2 != null && Build.VERSION.SDK_INT >= 29 && renderNode2.hasDisplayList() && canvas.isHardwareAccelerated()) {
            canvas.save();
            org.telegram.ui.vz0 vz0Var = this.r;
            if (vz0Var != null) {
                View view = (View) vz0Var.getParent();
                float x10 = view.getX();
                float y11 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.h;
                path2.rewind();
                path2.addRoundRect(x10, y11, x10 + scaleX, y11 + scaleY, view.getScaleX() * this.r.getRoundRadiusForExpand(), view.getScaleY() * this.r.getRoundRadiusForExpand(), Path.Direction.CCW);
                canvas.clipPath(path2);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, this.v);
            float f30 = this.s;
            canvas.scale(f30, f30);
            canvas.drawRenderNode(this.w);
            canvas.restore();
        }
        float clamp013 = Utilities.clamp01((clamp01 - 0.4f) / 0.6f);
        if (clamp013 > 0.0f) {
            int i15 = 0;
            while (i15 < size) {
                ih0 ih0Var11 = (ih0) arrayList.get(i15);
                if (ih0Var11 != null) {
                    Rect rect = ih0Var11.h;
                    RectF rectF8 = ih0Var11.d;
                    if (!ih0Var11.p) {
                        boolean z16 = AndroidUtilities.computePerceivedBrightness(this.N) > 0.72f;
                        float a2 = (!z16 || Build.VERSION.SDK_INT >= 31) ? !z16 ? 1.0f : k7.o.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int d = i0.a.d(a2, -16777216, -1);
                        if (this.S == null || this.R != d) {
                            this.R = d;
                            this.S = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float b11 = ih0Var11.b() * clamp013;
                        float centerX2 = rectF8.centerX();
                        float centerY = rectF8.centerY();
                        float f31 = a2;
                        f11 = clamp01;
                        float a10 = ih0Var11.b.a(0.04f) * f11;
                        canvas.scale(a10, a10, centerX2, centerY);
                        canvas.clipRect(rectF8);
                        float centerX3 = rectF8.centerX();
                        rectF8.centerY();
                        float dp = AndroidUtilities.dp(24.0f);
                        float f32 = dp * 0.5f;
                        ih0Var11.l.q(rectF8.width() - AndroidUtilities.dp(f22));
                        ih0Var11.m = ih0Var11.l.b.getLineCount() >= 3 ? 0.75f : ih0Var11.l.b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        float max2 = Math.max(0.0f, AndroidUtilities.dpf2(1.33f) + e2.c.d(ih0Var11.l.j(), ih0Var11.m, f27, 3.0f));
                        rect.set((int) (centerX3 - f32), (int) max2, (int) (centerX3 + f32), (int) (max2 + dp));
                        ij0 ij0Var = ih0Var11.k;
                        if (ij0Var != null) {
                            ij0Var.setBounds(rect);
                        }
                        Drawable drawable = ih0Var11.i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = ih0Var11.j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float j10 = ((rect.bottom + rect.top) - ((ih0Var11.l.j() * ih0Var11.m) / f22)) - AndroidUtilities.dp(4.66f);
                        canvas.save();
                        float f33 = ih0Var11.m;
                        f10 = f27;
                        canvas.scale(f33, f33, centerX2, android.support.v4.media.a.d(ih0Var11.l.j(), ih0Var11.m, 2.0f, j10));
                        l01 l01Var = ih0Var11.l;
                        l01Var.c(centerX2 - (l01Var.l() / 2.0f), j10, b11, d, canvas);
                        canvas.restore();
                        float f34 = ih0Var11.q;
                        if (f34 != 1.0f) {
                            canvas.scale(f34, f34, rect.centerX(), rect.centerY());
                        }
                        float f35 = (1.0f - f31) * b11;
                        float f36 = f31 * b11;
                        ij0 ij0Var2 = ih0Var11.k;
                        if (ij0Var2 == null) {
                            h(canvas, ih0Var11.j, f35);
                            h(canvas, ih0Var11.i, f36);
                        } else if (ih0Var11.a == 1) {
                            h(canvas, ih0Var11.j, f35);
                            h(canvas, ih0Var11.k, f36);
                        } else {
                            h(canvas, ij0Var2, b11);
                        }
                        canvas.restore();
                        if (ih0Var11.x > 0 && System.currentTimeMillis() > ih0Var11.x + ih0Var11.w) {
                            ih0Var11.s = false;
                        }
                        if (ih0Var11.s) {
                            k90 k90Var = ih0Var11.r;
                            if (k90Var == null) {
                                k90 k90Var2 = new k90();
                                ih0Var11.r = k90Var2;
                                k90Var2.setCallback(this);
                                ih0Var11.r.f(org.telegram.ui.ActionBar.k6.l1(0.1f, -1), org.telegram.ui.ActionBar.k6.l1(0.3f, -1), org.telegram.ui.ActionBar.k6.l1(0.35f, -1), org.telegram.ui.ActionBar.k6.l1(0.8f, -1));
                                k90 k90Var3 = ih0Var11.r;
                                k90Var3.C = true;
                                k90Var3.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                            } else if (k90Var.b() || ih0Var11.r.c()) {
                                k90 k90Var4 = ih0Var11.r;
                                f12 = clamp013;
                                k90Var4.b = -1L;
                                k90Var4.c = -1L;
                            }
                            f12 = clamp013;
                        } else {
                            f12 = clamp013;
                            k90 k90Var5 = ih0Var11.r;
                            if (k90Var5 != null && !k90Var5.c() && !ih0Var11.r.b()) {
                                ih0Var11.r.a();
                            }
                        }
                        k90 k90Var6 = ih0Var11.r;
                        if (k90Var6 != null) {
                            k90Var6.d(rectF8);
                            ih0Var11.r.h(getRoundRadius());
                            ih0Var11.r.setAlpha((int) (b11 * 255.0f));
                            ih0Var11.r.draw(canvas);
                        }
                        i15++;
                        clamp013 = f12;
                        f27 = f10;
                        clamp01 = f11;
                        f22 = 2.0f;
                    }
                }
                f10 = f27;
                f11 = clamp01;
                f12 = clamp013;
                i15++;
                clamp013 = f12;
                f27 = f10;
                clamp01 = f11;
                f22 = 2.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.y + this.M + this.L), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ih0 ih0Var;
        if (this.B >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
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
                    ih0 ih0Var2 = (ih0) arrayList.get(i10);
                    if (!ih0Var2.o && ih0Var2.d.contains(x10, y10)) {
                        this.T = ih0Var2;
                        this.U = x10;
                        this.V = y10;
                        this.W = System.currentTimeMillis();
                        this.T.b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y10 - this.V) > 20.0f)) {
                    this.T.b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (ih0Var = this.T) != null) {
                ih0Var.b.c(false);
                if (action == 1 && this.T.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ih0 ih0Var3 = this.T;
                    if (ih0Var3.t && !ih0Var3.s) {
                        ih0Var3.s = true;
                        invalidate();
                    }
                    ih0 ih0Var4 = this.T;
                    int i11 = ih0Var4.u;
                    if (i11 != 0) {
                        ih0Var4.d(i11, 0, 0);
                    }
                    this.T.w = System.currentTimeMillis();
                    ih0 ih0Var5 = this.T;
                    kh0 kh0Var = this.C;
                    if (kh0Var != null) {
                        int i12 = ih0Var5.v;
                        if (i12 == 0) {
                            int i13 = ih0Var5.a;
                            RectF rectF = ih0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.rx0) kh0Var).b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new a90(7, this, ih0Var5), i12);
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

    public final void p(ih0 ih0Var, boolean z4) {
        if (!z4) {
            jh0 jh0Var = this.G ? jh0.e : jh0.f;
            ih0Var.d(0, jh0Var.b, jh0Var.c);
            ih0Var.c(LocaleController.getString(jh0Var.a));
        } else if (this.G) {
            jh0 jh0Var2 = jh0.e;
            ih0Var.c(LocaleController.getString(jh0Var2.a));
            ih0Var.d(R.raw.profile_unmuting, jh0Var2.b, jh0Var2.c);
        } else {
            jh0 jh0Var3 = jh0.f;
            ih0Var.c(LocaleController.getString(jh0Var3.a));
            ih0Var.d(R.raw.profile_muting, jh0Var3.b, jh0Var3.c);
        }
    }

    public void setNotifications(boolean z4) {
        boolean z10 = this.G != z4;
        this.G = z4;
        ih0 j10 = j(1, this.a);
        if (j10 != null) {
            p(j10, z10);
            invalidate();
        } else {
            this.D.add(1);
            d();
        }
    }

    public void setOnActionClickListener(kh0 kh0Var) {
        this.C = kh0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof k90);
    }
}
