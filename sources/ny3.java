// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ny3 extends View {
    public static final long g0 = System.currentTimeMillis();
    public static final String[] h0 = new String[100];
    public float E;
    public long F;
    public final RectF G;
    public float H;
    public float I;
    public final so4 J;
    public final Path K;
    public float L;
    public final RectF M;
    public final RectF N;
    public final WeakHashMap O;
    public final Path P;
    public final int[] Q;
    public LinearGradient R;
    public final Paint S;
    public final Paint.FontMetrics T;
    public yy8 U;
    public float V;
    public float W;
    public final xh4 a;
    public float a0;
    public pz8 b;
    public long b0;
    public final Paint c;
    public long c0;
    public final Paint d;
    public boolean d0;
    public final TextPaint e;
    public final int[] e0;
    public final int[] f;
    public final RectF f0;
    public final int[] h;
    public final HashMap n;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList w;
    public float x;
    public float y;

    public ny3(Activity activity, xh4 xh4Var) {
        super(activity);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new int[2];
        this.h = new int[2];
        this.n = new HashMap();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.G = new RectF();
        this.H = Float.NaN;
        this.I = -1.0f;
        this.J = new so4();
        this.K = new Path();
        this.L = Float.NaN;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new WeakHashMap();
        this.P = new Path();
        this.Q = new int[2];
        this.S = new Paint(1);
        this.T = new Paint.FontMetrics();
        this.V = Float.NaN;
        this.a0 = 0.45f;
        this.e0 = new int[2];
        this.f0 = new RectF();
        this.a = xh4Var;
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static float b(float[] fArr, long j) {
        float min = Math.min(1.0f, (j - ((long) fArr[2])) / 180.0f);
        float f = fArr[1];
        float f2 = fArr[0] - f;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * f2) + f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        if ((r8 - ((long) r3)) < 200) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Canvas canvas, ViewGroup viewGroup, ArrayList arrayList, long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float min;
        float f9;
        float f10;
        float f11;
        float f12;
        String valueOf;
        String valueOf2;
        float sin;
        ny3 ny3Var = this;
        Canvas canvas2 = canvas;
        ArrayList arrayList2 = arrayList;
        long j2 = j;
        boolean z = false;
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof xy8) {
                    xy8 xy8Var = (xy8) childAt;
                    String key = xy8Var.getKey();
                    if (key != null) {
                        int indexOf = arrayList2.indexOf(key);
                        HashMap hashMap = ny3Var.n;
                        float[] fArr = (float[]) hashMap.get(key);
                        if (indexOf >= 0) {
                            int i2 = 0;
                            f = 0.0f;
                            for (int i3 = 0; i3 < indexOf; i3++) {
                                if (arrayList2.indexOf(arrayList2.get(i3)) == i3) {
                                    i2++;
                                }
                            }
                            f2 = 1.0f;
                            int i4 = i2 + 1;
                            if (fArr == null) {
                                float f13 = i4;
                                float[] fArr2 = {1.0f, 0.0f, j2, f13, f13, 0.0f};
                                hashMap.put(key, fArr2);
                                fArr = fArr2;
                            } else {
                                if (fArr[0] != 1.0f) {
                                    fArr[1] = b(fArr, j2);
                                    fArr[0] = 1.0f;
                                    fArr[2] = j2;
                                }
                                float f14 = fArr[3];
                                float f15 = i4;
                                if (f14 != f15) {
                                    fArr[4] = f14;
                                    fArr[3] = f15;
                                    fArr[5] = j2;
                                }
                            }
                        } else {
                            f = 0.0f;
                            f2 = 1.0f;
                            if (fArr != null && fArr[0] != 0.0f) {
                                fArr[1] = b(fArr, j2);
                                fArr[0] = 0.0f;
                                fArr[2] = j2;
                            }
                        }
                        float b = fArr == null ? f : b(fArr, j2);
                        if (fArr != null && b < 0.001f && fArr[0] == f) {
                            hashMap.remove(key);
                        }
                        float f16 = f2 - (0.1f * b);
                        if (Math.abs(xy8Var.n - f16) > 5.0E-4f) {
                            xy8Var.n = f16;
                            xy8Var.invalidate();
                            if (xy8Var.getParent() instanceof View) {
                                ((View) xy8Var.getParent()).invalidate();
                            }
                        }
                        if (childAt.getAlpha() != f2) {
                            childAt.setAlpha(f2);
                        }
                        if (fArr != null) {
                            if (j2 - ((long) fArr[2]) >= 200) {
                                float f17 = fArr[5];
                                if (f17 != f) {
                                }
                            }
                            z = true;
                        }
                        if (b > 0.004f && fArr != null) {
                            int[] iArr = ny3Var.f;
                            childAt.getLocationOnScreen(iArr);
                            int i5 = iArr[0];
                            int[] iArr2 = ny3Var.h;
                            float f18 = i5 - iArr2[0];
                            float f19 = iArr[1] - iArr2[1];
                            float width = childAt.getWidth();
                            childAt.getHeight();
                            if (fArr[0] == 1.0f) {
                                f3 = 0.004f;
                                f4 = f19;
                                double d = (j2 - ((long) fArr[2])) / 1000.0d;
                                if (d <= 0.0d) {
                                    sin = f;
                                } else {
                                    double d2 = 20.943950191694146d * d;
                                    sin = (float) (1.0d - (((Math.sin(d2) * 0.6585527928740355d) + Math.cos(d2)) * Math.exp((-13.79269689255487d) * d)));
                                }
                                f5 = (sin * 0.4f) + 0.6f;
                            } else {
                                f3 = 0.004f;
                                f4 = f19;
                                f5 = (0.4f * b) + 0.6f;
                            }
                            boolean z2 = (fArr[0] != 1.0f || j2 - ((long) fArr[2]) >= 600) ? z : true;
                            float L = (f18 + width) - hl.L(9.5f);
                            float L2 = f4 + hl.L(9.5f);
                            float min2 = Math.min(1.0f, b * 1.2f);
                            float L3 = f4 + hl.L(9.5f);
                            if (Float.isNaN(ny3Var.H)) {
                                f6 = 1.0f;
                            } else {
                                float f20 = ny3Var.H;
                                ny3Var.H = f20;
                                float L4 = hl.L(10.0f);
                                float max = Math.max(f, Math.min(1.0f, (L3 - (f20 - L4)) / L4));
                                f6 = 1.0f - ((3.0f - (max * 2.0f)) * (max * max));
                            }
                            float f21 = min2 * f6;
                            if (f21 > f3 && f5 > 0.01f) {
                                float L5 = hl.L(8.0f);
                                if (ny3Var.R == null) {
                                    ny3Var.R = new LinearGradient(0.0f, -L5, 0.0f, L5, 1946157055, 536870911, Shader.TileMode.CLAMP);
                                    Paint.Style style = Paint.Style.STROKE;
                                    Paint paint = ny3Var.S;
                                    paint.setStyle(style);
                                    paint.setShader(ny3Var.R);
                                }
                                canvas2.save();
                                canvas2.translate(L, L2);
                                canvas2.scale(f5, f5);
                                Path path = ny3Var.P;
                                path.rewind();
                                path.addCircle(0.0f, 0.0f, L5, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                if (f21 < 0.999f) {
                                    float f22 = f5;
                                    float f23 = -L5;
                                    f7 = f22;
                                    canvas2.saveLayerAlpha(f23, f23, L5, L5, (int) (f21 * 255.0f));
                                } else {
                                    f7 = f5;
                                }
                                xh4 xh4Var = ny3Var.a;
                                f09 f09Var = ((rz8) xh4Var.b).d;
                                int[] iArr3 = ny3Var.Q;
                                f09Var.getLocationOnScreen(iArr3);
                                float f24 = 1.0f / f7;
                                canvas2.scale(f24, f24);
                                canvas2.translate(-L, -L2);
                                float f25 = iArr2[0] - iArr3[0];
                                float f26 = iArr2[1] - iArr3[1];
                                f09 f09Var2 = ((rz8) xh4Var.b).d;
                                if (!f09Var2.j0(canvas2) && f09Var2.Z2 != null) {
                                    canvas2.save();
                                    canvas2.translate(-f25, -f26);
                                    Bitmap bitmap = f09Var2.Z2;
                                    if (bitmap != null) {
                                        f09Var2.y(canvas2, bitmap);
                                    }
                                    canvas2.restore();
                                } else if (zz.o() && f09Var2.j0(canvas2)) {
                                    canvas2.save();
                                    canvas2.translate(-f25, -f26);
                                    Object obj = f09Var2.I1;
                                    canvas2.save();
                                    canvas2.scale(9.0f, 9.0f);
                                    zz.h(canvas2, obj);
                                    canvas2.restore();
                                    canvas2.restore();
                                } else {
                                    d09 d09Var = f09Var2.n;
                                    canvas2.drawColor(vm2.o(d09Var != null ? vm2.f(0.5f, d09Var.b, d09Var.c) : -12947803, jn7.A3));
                                }
                                canvas2.translate(L, L2);
                                canvas2.scale(f7, f7);
                                Paint paint2 = ny3Var.c;
                                paint2.setColor(788529151);
                                canvas2.drawCircle(0.0f, 0.0f, L5, paint2);
                                if (f21 < 0.999f) {
                                    canvas2.restore();
                                }
                                canvas2.restore();
                                float N = hl.N(0.6f);
                                Paint paint3 = ny3Var.d;
                                paint3.setStrokeWidth(N);
                                paint3.setColor(1207959551);
                                paint3.setAlpha((int) (71.0f * f21));
                                canvas2.drawCircle(0.0f, 0.0f, L5 - hl.N(0.3f), paint3);
                                float L6 = hl.L(10.0f);
                                TextPaint textPaint = ny3Var.e;
                                textPaint.setTextSize(L6);
                                textPaint.setColor(-1);
                                Paint.FontMetrics fontMetrics = ny3Var.T;
                                textPaint.getFontMetrics(fontMetrics);
                                float f27 = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
                                if (fArr[5] == 0.0f) {
                                    min = 1.0f;
                                    f8 = 1.0f;
                                } else {
                                    f8 = 1.0f;
                                    min = Math.min(1.0f, (j2 - ((long) r4)) / 200.0f);
                                }
                                String[] strArr = h0;
                                if (min < f8) {
                                    float f28 = (f8 - min) * f21;
                                    f12 = 4.0f;
                                    f9 = 0.5f;
                                    f10 = 89.0f;
                                    textPaint.setShadowLayer(hl.N(1.5f), 0.0f, hl.N(0.5f), Color.argb((int) (f28 * 89.0f), 0, 0, 0));
                                    textPaint.setAlpha((int) (f28 * 255.0f));
                                    int i6 = (int) fArr[4];
                                    if (i6 < 0 || i6 >= strArr.length) {
                                        valueOf2 = String.valueOf(i6);
                                    } else {
                                        valueOf2 = strArr[i6];
                                        if (valueOf2 == null) {
                                            valueOf2 = String.valueOf(i6);
                                            strArr[i6] = valueOf2;
                                        }
                                    }
                                    f11 = 0.0f;
                                    canvas2.drawText(valueOf2, 0.0f, f27 - (hl.L(4.0f) * min), textPaint);
                                } else {
                                    f9 = 0.5f;
                                    f10 = 89.0f;
                                    f11 = 0.0f;
                                    f12 = 4.0f;
                                }
                                float f29 = f21 * min;
                                textPaint.setShadowLayer(hl.N(1.5f), f11, hl.N(f9), Color.argb((int) (f29 * f10), 0, 0, 0));
                                textPaint.setAlpha((int) (f29 * 255.0f));
                                int i7 = (int) fArr[3];
                                if (i7 < 0 || i7 >= strArr.length) {
                                    valueOf = String.valueOf(i7);
                                } else {
                                    valueOf = strArr[i7];
                                    if (valueOf == null) {
                                        valueOf = String.valueOf(i7);
                                        strArr[i7] = valueOf;
                                    }
                                }
                                canvas2.drawText(valueOf, 0.0f, ((1.0f - min) * hl.L(f12)) + f27, textPaint);
                                textPaint.clearShadowLayer();
                                canvas2.restore();
                            }
                            z = z2;
                        }
                    }
                } else if (childAt instanceof ViewGroup) {
                    z |= ny3Var.a(canvas2, (ViewGroup) childAt, arrayList, j2);
                }
            }
            i++;
            ny3Var = this;
            canvas2 = canvas;
            arrayList2 = arrayList;
            j2 = j;
        }
        return z;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x034e, code lost:
    
        if (r12.isEmpty() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x054b, code lost:
    
        if (java.lang.Math.abs(r10.y - r22) > r16) goto L219;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        ny3 ny3Var;
        float f;
        float f2;
        ArrayList arrayList;
        boolean z;
        float f3;
        ArrayList arrayList2;
        long min;
        boolean z2;
        RectF rectF;
        boolean z3;
        boolean z4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float pow;
        float B;
        float f11;
        float f12;
        int i;
        int size;
        float x;
        RectF rectF2;
        float f13;
        float f14;
        RectF rectF3;
        pz8 pz8Var;
        my3 my3Var;
        RectF rectF4;
        boolean z5;
        RectF rectF5;
        float f15;
        float f16;
        xh4 xh4Var = this.a;
        rz8 rz8Var = (rz8) xh4Var.b;
        rz8 rz8Var2 = (rz8) xh4Var.b;
        ArrayList arrayList5 = rz8Var.d.J;
        long currentTimeMillis = System.currentTimeMillis();
        long j = g0;
        long j2 = currentTimeMillis - j;
        pz8 pz8Var2 = this.b;
        int[] iArr = this.h;
        RectF rectF6 = this.G;
        if (pz8Var2 != null) {
            getLocationOnScreen(iArr);
            canvas.save();
            if (Float.isNaN(this.L)) {
                f2 = 0.003f;
            } else {
                f2 = 0.003f;
                canvas.clipRect(0.0f, this.L, getWidth(), getHeight());
            }
            if (this.y <= f2 || rectF6.isEmpty()) {
                f = 2.0f;
            } else {
                Path path = this.K;
                path.rewind();
                f = 2.0f;
                path.addRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, Path.Direction.CW);
                zz.d(canvas, path);
            }
            z = a(canvas, this.b, arrayList5, j2);
            ny3Var = this;
            arrayList = arrayList5;
            canvas.restore();
        } else {
            ny3Var = this;
            f = 2.0f;
            f2 = 0.003f;
            arrayList = arrayList5;
            z = false;
        }
        long j3 = ny3Var.c0;
        if (j3 == 0) {
            min = 16;
            f3 = 0.0f;
            arrayList2 = arrayList;
        } else {
            f3 = 0.0f;
            arrayList2 = arrayList;
            min = Math.min(64L, j2 - j3);
        }
        long j4 = ny3Var.c0;
        if (j4 != 0 && j2 - j4 > 200) {
            ny3Var.W = (ny3Var.d0 || j2 - ny3Var.b0 < 900) ? 1.0f : f3;
        }
        ny3Var.c0 = j2;
        yy8 yy8Var = ny3Var.U;
        float f17 = 0.5f;
        Paint paint = ny3Var.c;
        if (yy8Var == null || Float.isNaN(ny3Var.V) || Float.isNaN(ny3Var.H) || !ny3Var.U.H) {
            z2 = z;
            rectF = rectF6;
            z3 = true;
            z4 = false;
        } else {
            if (ny3Var.d0) {
                rectF4 = rectF6;
                z3 = true;
            } else {
                RectF rectF7 = rectF6;
                z3 = true;
                z3 = true;
                rectF4 = rectF7;
                if (j2 - ny3Var.b0 >= 900) {
                    z5 = false;
                    rectF5 = rectF7;
                    f15 = !z5 ? 1.0f : f3;
                    f16 = ny3Var.W;
                    if (f16 >= f15) {
                        ny3Var.W = qu6.z(min, 120.0f, f16, f15);
                    } else if (f16 > f15) {
                        ny3Var.W = bp1.x(min, 250.0f, f16, f15);
                    }
                    float f18 = !ny3Var.d0 ? 0.6f : 0.45f;
                    float f19 = ny3Var.a0;
                    float min2 = (Math.min(1.0f, min / 80.0f) * (f18 - f19)) + f19;
                    ny3Var.a0 = min2;
                    z4 = (!z5 || ny3Var.W > f3 || Math.abs(min2 - f18) > 0.004f) ? z3 ? 1 : 0 : false;
                    if (ny3Var.W > 0.004f) {
                        int computeVerticalScrollRange = ny3Var.U.computeVerticalScrollRange();
                        int computeVerticalScrollExtent = ny3Var.U.computeVerticalScrollExtent();
                        int computeVerticalScrollOffset = ny3Var.U.computeVerticalScrollOffset();
                        if (computeVerticalScrollRange > computeVerticalScrollExtent && computeVerticalScrollExtent > 0) {
                            yy8 yy8Var2 = ny3Var.U;
                            int[] iArr2 = ny3Var.e0;
                            yy8Var2.getLocationOnScreen(iArr2);
                            ny3Var.getLocationOnScreen(iArr);
                            float paddingTop = ny3Var.U.getPaddingTop() + (iArr2[z3 ? 1 : 0] - iArr[z3 ? 1 : 0]);
                            float L = ((ny3Var.y <= 0.5f || rectF5.isEmpty()) ? ny3Var.H - hl.L(10.0f) : Math.min(ny3Var.H - hl.L(10.0f), rectF5.top - hl.L(6.0f))) - paddingTop;
                            if (L > hl.L(30.0f)) {
                                z2 = z;
                                float max = Math.max(hl.L(28.0f), (computeVerticalScrollExtent * L) / computeVerticalScrollRange);
                                float A = qd4.A(L, max, qu6.w(computeVerticalScrollOffset, computeVerticalScrollRange - computeVerticalScrollExtent, 1.0f, f3), paddingTop);
                                float width = ny3Var.getWidth() - hl.L(3.0f);
                                RectF rectF8 = ny3Var.f0;
                                rectF8.set(width - hl.L(3.0f), A, width, max + A);
                                paint.setColor(-1);
                                paint.setAlpha((int) (ny3Var.a0 * 255.0f * ny3Var.W));
                                canvas.drawRoundRect(rectF8, hl.N(1.5f), hl.N(1.5f), paint);
                                rectF = rectF5;
                            }
                        }
                    }
                    z2 = z;
                    rectF = rectF5;
                }
            }
            z5 = z3 ? 1 : 0;
            rectF5 = rectF4;
            if (!z5) {
            }
            f16 = ny3Var.W;
            if (f16 >= f15) {
            }
            if (!ny3Var.d0) {
            }
            float f192 = ny3Var.a0;
            float min22 = (Math.min(1.0f, min / 80.0f) * (f18 - f192)) + f192;
            ny3Var.a0 = min22;
            if (z5) {
            }
            if (ny3Var.W > 0.004f) {
            }
            z2 = z;
            rectF = rectF5;
        }
        boolean z6 = z2 | z4;
        ArrayList arrayList6 = ny3Var.s;
        arrayList6.clear();
        int i2 = 0;
        while (true) {
            int size2 = arrayList2.size();
            arrayList3 = ny3Var.r;
            arrayList4 = arrayList2;
            if (i2 >= size2) {
                break;
            }
            String str = (String) arrayList4.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    my3Var = null;
                    break;
                }
                my3Var = (my3) arrayList3.get(i3);
                if (!my3Var.d && !arrayList6.contains(my3Var) && my3Var.a.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (my3Var == null) {
                my3Var = new my3();
                my3Var.b = Float.NaN;
                my3Var.a = str;
            }
            arrayList6.add(my3Var);
            i2++;
            arrayList2 = arrayList4;
        }
        int i4 = 0;
        while (i4 < arrayList3.size()) {
            my3 my3Var2 = (my3) arrayList3.get(i4);
            if (!my3Var2.d && !arrayList6.contains(my3Var2)) {
                my3Var2.d = z3;
            }
            i4++;
            z3 = true;
        }
        ArrayList arrayList7 = ny3Var.w;
        arrayList7.clear();
        arrayList7.addAll(arrayList6);
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            if (((my3) arrayList3.get(i5)).d) {
                arrayList7.add(Math.min(i5, arrayList7.size()), (my3) arrayList3.get(i5));
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList7);
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            if (!((my3) arrayList3.get(i7)).d) {
                i6++;
            }
        }
        float L2 = i6 == 0 ? hl.L(50.0f) : hl.L(16.0f) + (hl.L(34.0f) * i6);
        if (Float.isNaN(ny3Var.x)) {
            f4 = 0.0f;
        } else {
            float f20 = ny3Var.x;
            f4 = 0.0f;
            if (f20 != 0.0f) {
                f5 = qd4.A(L2, f20, 0.25f, f20);
                ny3Var.x = f5;
                f6 = i6 <= 0 ? 1.0f : f4;
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                float min3 = ny3Var.F != 0 ? Math.min(64.0f, currentTimeMillis2 - r7) : 16.0f;
                ny3Var.F = currentTimeMillis2;
                f7 = ny3Var.y;
                if (f7 >= f6) {
                    f7 = qu6.z(min3, 260.0f, f7, f6);
                    ny3Var.y = f7;
                } else if (f7 > f6) {
                    f7 = bp1.x(min3, 260.0f, f7, f6);
                    ny3Var.y = f7;
                }
                if (f7 <= f2) {
                    rectF2 = rectF;
                }
                float L3 = hl.L(44.0f);
                float width2 = ny3Var.getWidth() / f;
                f8 = ny3Var.y;
                if (f8 >= 0.5f) {
                    pow = f8 * f * f8;
                    f9 = 34.0f;
                    f10 = L2;
                } else {
                    f9 = 34.0f;
                    f10 = L2;
                    pow = 1.0f - (((float) Math.pow((f8 * (-2.0f)) + f, 2.0d)) / f);
                }
                if (pow < 0.4f) {
                    f12 = qd4.A(ny3Var.x, L3, (pow - 0.4f) / 0.6f, L3);
                    B = 1.0f;
                    f11 = 1.0f;
                } else {
                    float f21 = pow / 0.4f;
                    B = c00.B(pow, 0.4f, 0.39999998f, 0.6f);
                    f11 = f21;
                    f12 = L3;
                }
                ny3Var.E = f11;
                float f22 = f9;
                float min4 = Math.min(1.0f, f12 / Math.max(1.0f, ny3Var.x)) * B;
                float height = (ny3Var.getHeight() - hl.N(18.666666f)) - (L3 / f);
                float f23 = (f12 * B) / f;
                float f24 = (B * L3) / f;
                float f25 = f6;
                rectF.set(width2 - f23, height - f24, f23 + width2, height + f24);
                float height2 = rectF.height() / f;
                d09 d09Var = rz8Var2.d.n;
                paint.setColor(d09Var == null ? d09Var.h : 872415231);
                paint.setAlpha((int) (Color.alpha(rz8Var2.d.n == null ? r3.h : 872415231) * f11));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                paint.setColor(872415231);
                paint.setAlpha((int) (51.0f * f11));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                RectF rectF9 = rectF;
                ny3Var.J.a(height2, f11, 0, canvas, rectF9);
                RectF rectF10 = rectF9;
                canvas.save();
                canvas.clipRect(rectF10);
                int i8 = 0;
                i = 0;
                while (i < arrayList3.size()) {
                    my3 my3Var3 = (my3) arrayList3.get(i);
                    float v = uh9.v(i8, f17, hl.L(f22), (width2 - (ny3Var.x / f)) + hl.L(8.0f));
                    if (!my3Var3.d) {
                        i8++;
                    }
                    if (Float.isNaN(my3Var3.b)) {
                        my3Var3.b = v;
                    }
                    boolean z7 = my3Var3.d;
                    if (!z7) {
                        float f26 = my3Var3.b;
                        my3Var3.b = qd4.A(v, f26, 0.3f, f26);
                    }
                    float f27 = my3Var3.c;
                    int i9 = i8;
                    float A2 = qd4.A(z7 ? f4 : 1.0f, f27, 0.28f, f27);
                    my3Var3.c = A2;
                    if (Math.abs(A2 - (z7 ? f4 : 1.0f)) > 0.004f || Math.abs(v - my3Var3.b) > 0.5f) {
                        z6 = true;
                    }
                    Drawable U = rz8Var2.d.U(my3Var3.a);
                    if (U != null) {
                        float L4 = hl.L(26.0f);
                        boolean z8 = my3Var3.d;
                        float f28 = my3Var3.c;
                        if (!z8) {
                            if (f28 >= 1.0f) {
                                x = 1.0f;
                            } else {
                                float f29 = f28 - 1.0f;
                                x = c00.x(f29, 1.4f, f29, (2.4f * f29 * f29 * f29) + 1.0f);
                            }
                            f28 = x;
                        }
                        float f30 = L4 * f28 * min4;
                        if (f30 >= 1.0f) {
                            U.setAlpha(jn7.d4);
                            float A3 = qd4.A(my3Var3.b, width2, min4, width2);
                            float f31 = f30 / f;
                            U.setBounds((int) (A3 - f31), (int) (rectF10.centerY() - f31), (int) (A3 + f31), (int) (rectF10.centerY() + f31));
                            dz8.b(canvas, U);
                        }
                    }
                    i++;
                    i8 = i9;
                    f17 = 0.5f;
                }
                canvas.restore();
                for (size = arrayList3.size() - 1; size >= 0; size--) {
                    if (((my3) arrayList3.get(size)).d && ((my3) arrayList3.get(size)).c < 0.02f) {
                        arrayList3.remove(size);
                    }
                }
                if (Math.abs(ny3Var.x - f10) <= 0.5f) {
                    rectF2 = rectF10;
                }
                z6 = true;
                rectF2 = rectF10;
                f13 = ny3Var.y;
                f14 = ny3Var.I;
                rectF3 = ny3Var.M;
                if (f13 == f14 || !rectF2.equals(rectF3)) {
                    ny3Var.I = ny3Var.y;
                    rectF3.set(rectF2);
                    pz8Var = ny3Var.b;
                    if (pz8Var != null) {
                        pz8Var.invalidate();
                    }
                }
                if (z6 && arrayList3.isEmpty() && arrayList4.isEmpty()) {
                    return;
                }
                ny3Var.postInvalidateOnAnimation();
            }
        }
        f5 = L2;
        ny3Var.x = f5;
        if (i6 <= 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j;
        if (ny3Var.F != 0) {
        }
        ny3Var.F = currentTimeMillis22;
        f7 = ny3Var.y;
        if (f7 >= f6) {
        }
        if (f7 <= f2) {
        }
        float L32 = hl.L(44.0f);
        float width22 = ny3Var.getWidth() / f;
        f8 = ny3Var.y;
        if (f8 >= 0.5f) {
        }
        if (pow < 0.4f) {
        }
        ny3Var.E = f11;
        float f222 = f9;
        float min42 = Math.min(1.0f, f12 / Math.max(1.0f, ny3Var.x)) * B;
        float height3 = (ny3Var.getHeight() - hl.N(18.666666f)) - (L32 / f);
        float f232 = (f12 * B) / f;
        float f242 = (B * L32) / f;
        float f252 = f6;
        rectF.set(width22 - f232, height3 - f242, f232 + width22, height3 + f242);
        float height22 = rectF.height() / f;
        d09 d09Var2 = rz8Var2.d.n;
        paint.setColor(d09Var2 == null ? d09Var2.h : 872415231);
        paint.setAlpha((int) (Color.alpha(rz8Var2.d.n == null ? r3.h : 872415231) * f11));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        paint.setColor(872415231);
        paint.setAlpha((int) (51.0f * f11));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        RectF rectF92 = rectF;
        ny3Var.J.a(height22, f11, 0, canvas, rectF92);
        RectF rectF102 = rectF92;
        canvas.save();
        canvas.clipRect(rectF102);
        int i82 = 0;
        i = 0;
        while (i < arrayList3.size()) {
        }
        canvas.restore();
        while (size >= 0) {
        }
        if (Math.abs(ny3Var.x - f10) <= 0.5f) {
        }
        z6 = true;
        rectF2 = rectF102;
        f13 = ny3Var.y;
        f14 = ny3Var.I;
        rectF3 = ny3Var.M;
        if (f13 == f14) {
        }
        ny3Var.I = ny3Var.y;
        rectF3.set(rectF2);
        pz8Var = ny3Var.b;
        if (pz8Var != null) {
        }
        if (z6) {
        }
        ny3Var.postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (this.y >= 0.5f) {
            if (this.G.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = this.r;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        my3 my3Var = (my3) arrayList.get(i);
                        if (!my3Var.d) {
                            if (Math.abs(motionEvent.getX() - my3Var.b) < hl.L(34.0f) / 2.0f) {
                                f09 f09Var = ((rz8) this.a.b).d;
                                ArrayList arrayList2 = f09Var.J;
                                if (i2 >= 0 && i2 < arrayList2.size()) {
                                    arrayList2.remove(i2);
                                    f09Var.c();
                                    f09Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i2++;
                        }
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
