package ai;

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
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d extends View {
    public static final long f0 = System.currentTimeMillis();
    public static final String[] g0 = new String[100];
    public float D;
    public long E;
    public final RectF F;
    public float G;
    public float H;
    public final n1 I;
    public final Path J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final WeakHashMap N;
    public final Path O;
    public final int[] P;
    public LinearGradient Q;
    public final Paint R;
    public final Paint.FontMetrics S;
    public r T;
    public float U;
    public float V;
    public float W;
    public final aa.n a;
    public long a0;
    public q0 b;
    public long b0;
    public final Paint c;
    public boolean c0;
    public final Paint d;
    public final int[] d0;
    public final TextPaint e;
    public final RectF e0;
    public final int[] f;
    public final int[] h;
    public final HashMap n;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList w;
    public float x;
    public float y;

    public d(Activity activity, aa.n nVar) {
        super(activity);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        new RectF();
        this.f = new int[2];
        this.h = new int[2];
        this.n = new HashMap();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new n1(0);
        this.J = new Path();
        this.K = Float.NaN;
        this.L = new RectF();
        this.M = new RectF();
        this.N = new WeakHashMap();
        this.O = new Path();
        this.P = new int[2];
        this.R = new Paint(1);
        this.S = new Paint.FontMetrics();
        this.U = Float.NaN;
        this.W = 0.45f;
        this.d0 = new int[2];
        this.e0 = new RectF();
        this.a = nVar;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f0;
    }

    public static float c(float[] fArr, long j3) {
        float min = Math.min(1.0f, (j3 - ((long) fArr[2])) / 180.0f);
        float f10 = fArr[1];
        float f11 = fArr[0] - f10;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * f11) + f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if ((r8 - ((long) r3)) < 200) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Canvas canvas, ViewGroup viewGroup, List list, long j3) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float min;
        float f19;
        float f20;
        float f21;
        float f22;
        String valueOf;
        String valueOf2;
        float sin;
        d dVar = this;
        Canvas canvas2 = canvas;
        List list2 = list;
        long j10 = j3;
        boolean z9 = false;
        int i7 = 0;
        while (i7 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    String key = qVar.getKey();
                    if (key != null) {
                        int indexOf = list2.indexOf(key);
                        HashMap hashMap = dVar.n;
                        float[] fArr = (float[]) hashMap.get(key);
                        if (indexOf >= 0) {
                            int i10 = 0;
                            f10 = 0.0f;
                            for (int i11 = 0; i11 < indexOf; i11++) {
                                if (list2.indexOf(list2.get(i11)) == i11) {
                                    i10++;
                                }
                            }
                            f11 = 1.0f;
                            int i12 = i10 + 1;
                            if (fArr == null) {
                                float f23 = i12;
                                fArr = new float[]{1.0f, 0.0f, j10, f23, f23, 0.0f};
                                hashMap.put(key, fArr);
                            } else {
                                if (fArr[0] != 1.0f) {
                                    fArr[1] = c(fArr, j10);
                                    fArr[0] = 1.0f;
                                    fArr[2] = j10;
                                }
                                float f24 = fArr[3];
                                float f25 = i12;
                                if (f24 != f25) {
                                    fArr[4] = f24;
                                    fArr[3] = f25;
                                    fArr[5] = j10;
                                }
                            }
                        } else {
                            f10 = 0.0f;
                            f11 = 1.0f;
                            if (fArr != null && fArr[0] != 0.0f) {
                                fArr[1] = c(fArr, j10);
                                fArr[0] = 0.0f;
                                fArr[2] = j10;
                            }
                        }
                        float c10 = fArr == null ? f10 : c(fArr, j10);
                        if (fArr != null && c10 < 0.001f && fArr[0] == f10) {
                            hashMap.remove(key);
                        }
                        float f26 = f11 - (0.1f * c10);
                        if (Math.abs(qVar.n - f26) > 5.0E-4f) {
                            qVar.n = f26;
                            qVar.invalidate();
                            if (qVar.getParent() instanceof View) {
                                ((View) qVar.getParent()).invalidate();
                            }
                        }
                        if (childAt.getAlpha() != f11) {
                            childAt.setAlpha(f11);
                        }
                        if (fArr != null) {
                            if (j10 - ((long) fArr[2]) >= 200) {
                                float f27 = fArr[5];
                                if (f27 != f10) {
                                }
                            }
                            z9 = true;
                        }
                        if (c10 > 0.004f && fArr != null) {
                            int[] iArr = dVar.f;
                            childAt.getLocationOnScreen(iArr);
                            int i13 = iArr[0];
                            int[] iArr2 = dVar.h;
                            float f28 = i13 - iArr2[0];
                            float f29 = iArr[1] - iArr2[1];
                            float width = childAt.getWidth();
                            childAt.getHeight();
                            if (fArr[0] == 1.0f) {
                                f12 = 0.004f;
                                f13 = f29;
                                double d = (j10 - ((long) fArr[2])) / 1000.0d;
                                if (d <= 0.0d) {
                                    f14 = 0.3f;
                                    f15 = f28;
                                    sin = f10;
                                } else {
                                    double d2 = 6.283185307179586d / 0.3f;
                                    double sqrt = d2 / Math.sqrt(0.6975f);
                                    double d10 = d * d2;
                                    f14 = 0.3f;
                                    f15 = f28;
                                    sin = (float) (1.0d - (((Math.sin(d10) * ((0.55f * sqrt) / d2)) + Math.cos(d10)) * Math.exp(((-0.55f) * sqrt) * d)));
                                }
                                f16 = (sin * 0.4f) + 0.6f;
                            } else {
                                f12 = 0.004f;
                                f13 = f29;
                                f14 = 0.3f;
                                f15 = f28;
                                f16 = (0.4f * c10) + 0.6f;
                            }
                            float f30 = f16;
                            boolean z10 = (fArr[0] != 1.0f || j3 - ((long) fArr[2]) >= 600) ? z9 : true;
                            float L = (f15 + width) - org.telegram.messenger.g0.L(9.5f);
                            float L2 = f13 + org.telegram.messenger.g0.L(9.5f);
                            float min2 = Math.min(1.0f, c10 * 1.2f);
                            float L3 = f13 + org.telegram.messenger.g0.L(9.5f);
                            if (Float.isNaN(dVar.G)) {
                                f17 = 1.0f;
                            } else {
                                float f31 = dVar.G;
                                dVar.G = f31;
                                float L4 = org.telegram.messenger.g0.L(10.0f);
                                float max = Math.max(f10, Math.min(1.0f, (L3 - (f31 - L4)) / L4));
                                f17 = 1.0f - ((3.0f - (max * 2.0f)) * (max * max));
                            }
                            float f32 = min2 * f17;
                            if (f32 > f12 && f30 > 0.01f) {
                                float L5 = org.telegram.messenger.g0.L(8.0f);
                                if (dVar.Q == null) {
                                    dVar.Q = new LinearGradient(0.0f, -L5, 0.0f, L5, 1946157055, 536870911, Shader.TileMode.CLAMP);
                                    Paint.Style style = Paint.Style.STROKE;
                                    Paint paint = dVar.R;
                                    paint.setStyle(style);
                                    paint.setShader(dVar.Q);
                                }
                                canvas2.save();
                                canvas2.translate(L, L2);
                                canvas2.scale(f30, f30);
                                Path path = dVar.O;
                                path.rewind();
                                path.addCircle(0.0f, 0.0f, L5, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                if (f32 < 0.999f) {
                                    float f33 = -L5;
                                    canvas2.saveLayerAlpha(f33, f33, L5, L5, (int) (f32 * 255.0f));
                                }
                                aa.n nVar = dVar.a;
                                l1 l1Var = ((s0) nVar.b).d;
                                int[] iArr3 = dVar.P;
                                l1Var.getLocationOnScreen(iArr3);
                                float f34 = 1.0f / f30;
                                canvas2.scale(f34, f34);
                                canvas2.translate(-L, -L2);
                                float f35 = iArr2[0] - iArr3[0];
                                float f36 = iArr2[1] - iArr3[1];
                                l1 l1Var2 = ((s0) nVar.b).d;
                                if (!l1Var2.j0(canvas2) && l1Var2.Y2 != null) {
                                    canvas2.save();
                                    canvas2.translate(-f35, -f36);
                                    Bitmap bitmap = l1Var2.Y2;
                                    if (bitmap != null) {
                                        l1Var2.y(canvas2, bitmap);
                                    }
                                    canvas2.restore();
                                } else if (a0.f() && l1Var2.j0(canvas2)) {
                                    canvas2.save();
                                    canvas2.translate(-f35, -f36);
                                    Object obj = l1Var2.H1;
                                    canvas2.save();
                                    canvas2.scale(9.0f, 9.0f);
                                    a0.c(canvas2, obj);
                                    canvas2.restore();
                                    canvas2.restore();
                                } else {
                                    j1 j1Var = l1Var2.n;
                                    canvas2.drawColor(i0.a.o(j1Var != null ? i0.a.f(0.5f, j1Var.b, j1Var.c) : -12947803, qs.B3));
                                }
                                canvas2.translate(L, L2);
                                canvas2.scale(f30, f30);
                                Paint paint2 = dVar.c;
                                paint2.setColor(788529151);
                                canvas2.drawCircle(0.0f, 0.0f, L5, paint2);
                                if (f32 < 0.999f) {
                                    canvas2.restore();
                                }
                                canvas2.restore();
                                float N = org.telegram.messenger.g0.N(0.6f);
                                Paint paint3 = dVar.d;
                                paint3.setStrokeWidth(N);
                                paint3.setColor(1207959551);
                                paint3.setAlpha((int) (71.0f * f32));
                                canvas2.drawCircle(0.0f, 0.0f, L5 - org.telegram.messenger.g0.N(f14), paint3);
                                float L6 = org.telegram.messenger.g0.L(10.0f);
                                TextPaint textPaint = dVar.e;
                                textPaint.setTextSize(L6);
                                textPaint.setColor(-1);
                                Paint.FontMetrics fontMetrics = dVar.S;
                                textPaint.getFontMetrics(fontMetrics);
                                float f37 = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
                                if (fArr[5] == 0.0f) {
                                    min = 1.0f;
                                    f18 = 1.0f;
                                } else {
                                    f18 = 1.0f;
                                    min = Math.min(1.0f, (j3 - ((long) r4)) / 200.0f);
                                }
                                String[] strArr = g0;
                                if (min < f18) {
                                    float f38 = (f18 - min) * f32;
                                    f21 = 4.0f;
                                    f22 = 89.0f;
                                    f19 = 0.5f;
                                    textPaint.setShadowLayer(org.telegram.messenger.g0.N(1.5f), 0.0f, org.telegram.messenger.g0.N(0.5f), Color.argb((int) (f38 * 89.0f), 0, 0, 0));
                                    textPaint.setAlpha((int) (f38 * 255.0f));
                                    int i14 = (int) fArr[4];
                                    if (i14 < 0 || i14 >= strArr.length) {
                                        valueOf2 = String.valueOf(i14);
                                    } else {
                                        valueOf2 = strArr[i14];
                                        if (valueOf2 == null) {
                                            valueOf2 = String.valueOf(i14);
                                            strArr[i14] = valueOf2;
                                        }
                                    }
                                    f20 = 0.0f;
                                    canvas2.drawText(valueOf2, 0.0f, f37 - (org.telegram.messenger.g0.L(4.0f) * min), textPaint);
                                } else {
                                    f19 = 0.5f;
                                    f20 = 0.0f;
                                    f21 = 4.0f;
                                    f22 = 89.0f;
                                }
                                float f39 = f32 * min;
                                textPaint.setShadowLayer(org.telegram.messenger.g0.N(1.5f), f20, org.telegram.messenger.g0.N(f19), Color.argb((int) (f39 * f22), 0, 0, 0));
                                textPaint.setAlpha((int) (f39 * 255.0f));
                                int i15 = (int) fArr[3];
                                if (i15 < 0 || i15 >= strArr.length) {
                                    valueOf = String.valueOf(i15);
                                } else {
                                    valueOf = strArr[i15];
                                    if (valueOf == null) {
                                        valueOf = String.valueOf(i15);
                                        strArr[i15] = valueOf;
                                    }
                                }
                                canvas2.drawText(valueOf, 0.0f, ((1.0f - min) * org.telegram.messenger.g0.L(f21)) + f37, textPaint);
                                textPaint.clearShadowLayer();
                                canvas2.restore();
                            }
                            z9 = z10;
                        }
                    }
                } else if (childAt instanceof ViewGroup) {
                    z9 |= dVar.a(canvas2, (ViewGroup) childAt, list, j3);
                }
                i7++;
                dVar = this;
                canvas2 = canvas;
                list2 = list;
                j10 = j3;
            }
            i7++;
            dVar = this;
            canvas2 = canvas;
            list2 = list;
            j10 = j3;
        }
        return z9;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0351, code lost:
    
        if (r8.isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0354, code lost:
    
        r10 = r7;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x056f, code lost:
    
        if (java.lang.Math.abs(r13.y - r11) > 0.003f) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        d dVar;
        ArrayList arrayList;
        boolean z9;
        float f10;
        RectF rectF;
        long min;
        float f11;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float pow;
        float f18;
        float f19;
        float f20;
        float c10;
        int i7;
        int size;
        boolean z12;
        float f21;
        int i10;
        float x10;
        float f22;
        RectF rectF2;
        float f23;
        float f24;
        RectF rectF3;
        q0 q0Var;
        RectF rectF4;
        c cVar;
        float f25;
        boolean z13;
        float f26;
        float f27;
        aa.n nVar = this.a;
        s0 s0Var = (s0) nVar.b;
        s0 s0Var2 = (s0) nVar.b;
        ArrayList arrayList3 = s0Var.d.I;
        long b10 = b();
        q0 q0Var2 = this.b;
        int[] iArr = this.h;
        RectF rectF5 = this.F;
        if (q0Var2 != null) {
            getLocationOnScreen(iArr);
            canvas.save();
            if (!Float.isNaN(this.K)) {
                canvas.clipRect(0.0f, this.K, getWidth(), getHeight());
            }
            if (this.y > 0.003f && !rectF5.isEmpty()) {
                Path path = this.J;
                path.rewind();
                path.addRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, Path.Direction.CW);
                a0.b(canvas, path);
            }
            z9 = a(canvas, this.b, arrayList3, b10);
            dVar = this;
            arrayList = arrayList3;
            canvas.restore();
        } else {
            dVar = this;
            arrayList = arrayList3;
            z9 = false;
        }
        long j3 = dVar.b0;
        if (j3 == 0) {
            min = 16;
            f10 = 2.0f;
            rectF = rectF5;
        } else {
            f10 = 2.0f;
            rectF = rectF5;
            min = Math.min(64L, b10 - j3);
        }
        long j10 = dVar.b0;
        if (j10 != 0 && b10 - j10 > 200) {
            dVar.V = (dVar.c0 || b10 - dVar.a0 < 900) ? 1.0f : 0.0f;
        }
        dVar.b0 = b10;
        r rVar = dVar.T;
        Paint paint = dVar.c;
        float f28 = 0.5f;
        if (rVar == null || Float.isNaN(dVar.U) || Float.isNaN(dVar.G) || !dVar.T.G) {
            f11 = 0.6f;
            z10 = true;
            z11 = false;
        } else {
            if (dVar.c0) {
                f25 = 0.6f;
                z10 = true;
            } else {
                f25 = 0.6f;
                z10 = true;
                z10 = true;
                if (b10 - dVar.a0 >= 900) {
                    z13 = false;
                    f26 = !z13 ? 1.0f : 0.0f;
                    f27 = dVar.V;
                    if (f27 >= f26) {
                        f11 = f25;
                        dVar.V = org.telegram.ui.Cells.f1.e(min, 120.0f, f27, f26);
                    } else {
                        f11 = f25;
                        if (f27 > f26) {
                            dVar.V = org.telegram.ui.Cells.f1.v(min, 250.0f, f27, f26);
                        }
                    }
                    float f29 = !dVar.c0 ? f11 : 0.45f;
                    float f30 = dVar.W;
                    float min2 = (Math.min(1.0f, min / 80.0f) * (f29 - f30)) + f30;
                    dVar.W = min2;
                    z11 = (!z13 || dVar.V > 0.0f || Math.abs(min2 - f29) > 0.004f) ? z10 ? 1 : 0 : false;
                    if (dVar.V > 0.004f) {
                        int computeVerticalScrollRange = dVar.T.computeVerticalScrollRange();
                        int computeVerticalScrollExtent = dVar.T.computeVerticalScrollExtent();
                        int computeVerticalScrollOffset = dVar.T.computeVerticalScrollOffset();
                        if (computeVerticalScrollRange > computeVerticalScrollExtent && computeVerticalScrollExtent > 0) {
                            r rVar2 = dVar.T;
                            int[] iArr2 = dVar.d0;
                            rVar2.getLocationOnScreen(iArr2);
                            dVar.getLocationOnScreen(iArr);
                            float paddingTop = dVar.T.getPaddingTop() + (iArr2[z10 ? 1 : 0] - iArr[z10 ? 1 : 0]);
                            float L = ((dVar.y <= 0.5f || rectF.isEmpty()) ? dVar.G - org.telegram.messenger.g0.L(10.0f) : Math.min(dVar.G - org.telegram.messenger.g0.L(10.0f), rectF.top - org.telegram.messenger.g0.L(6.0f))) - paddingTop;
                            if (L > org.telegram.messenger.g0.L(30.0f)) {
                                float max = Math.max(org.telegram.messenger.g0.L(28.0f), (computeVerticalScrollExtent * L) / computeVerticalScrollRange);
                                float z14 = com.google.android.recaptcha.internal.a.z(L, max, Math.max(0.0f, Math.min(1.0f, computeVerticalScrollOffset / (computeVerticalScrollRange - computeVerticalScrollExtent))), paddingTop);
                                float width = dVar.getWidth() - org.telegram.messenger.g0.L(3.0f);
                                RectF rectF6 = dVar.e0;
                                rectF6.set(width - org.telegram.messenger.g0.L(3.0f), z14, width, max + z14);
                                paint.setColor(-1);
                                paint.setAlpha((int) (dVar.W * 255.0f * dVar.V));
                                canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), paint);
                            }
                        }
                    }
                }
            }
            z13 = z10 ? 1 : 0;
            if (!z13) {
            }
            f27 = dVar.V;
            if (f27 >= f26) {
            }
            if (!dVar.c0) {
            }
            float f302 = dVar.W;
            float min22 = (Math.min(1.0f, min / 80.0f) * (f29 - f302)) + f302;
            dVar.W = min22;
            if (z13) {
            }
            if (dVar.V > 0.004f) {
            }
        }
        boolean z15 = z9 | z11;
        ArrayList arrayList4 = dVar.s;
        arrayList4.clear();
        int i11 = 0;
        while (true) {
            int size2 = arrayList.size();
            arrayList2 = dVar.r;
            if (i11 >= size2) {
                break;
            }
            String str = (String) arrayList.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    cVar = null;
                    break;
                }
                cVar = (c) arrayList2.get(i12);
                if (!cVar.d && !arrayList4.contains(cVar) && cVar.a.equals(str)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (cVar == null) {
                cVar = new c();
                cVar.b = Float.NaN;
                cVar.a = str;
            }
            arrayList4.add(cVar);
            i11++;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            c cVar2 = (c) arrayList2.get(i13);
            if (!cVar2.d && !arrayList4.contains(cVar2)) {
                cVar2.d = z10;
            }
            i13++;
            z10 = true;
        }
        ArrayList arrayList5 = dVar.w;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            if (((c) arrayList2.get(i14)).d) {
                arrayList5.add(Math.min(i14, arrayList5.size()), (c) arrayList2.get(i14));
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList5);
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            if (!((c) arrayList2.get(i16)).d) {
                i15++;
            }
        }
        float L2 = i15 == 0 ? org.telegram.messenger.g0.L(50.0f) : org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(34.0f) * i15);
        if (Float.isNaN(dVar.x)) {
            f12 = 0.0f;
        } else {
            float f31 = dVar.x;
            f12 = 0.0f;
            if (f31 != 0.0f) {
                f13 = com.google.android.recaptcha.internal.a.z(L2, f31, 0.25f, f31);
                dVar.x = f13;
                f14 = i15 <= 0 ? 1.0f : f12;
                long b11 = b();
                float min3 = dVar.E != 0 ? Math.min(64.0f, b11 - r9) : 16.0f;
                dVar.E = b11;
                f15 = dVar.y;
                if (f15 >= f14) {
                    dVar.y = org.telegram.ui.Cells.f1.e(min3, 260.0f, f15, f14);
                } else if (f15 > f14) {
                    dVar.y = org.telegram.ui.Cells.f1.v(min3, 260.0f, f15, f14);
                }
                if (dVar.y <= 0.003f) {
                    rectF4 = rectF;
                }
                float L3 = org.telegram.messenger.g0.L(44.0f);
                float width2 = dVar.getWidth() / f10;
                f16 = dVar.y;
                if (f16 >= 0.5f) {
                    pow = f16 * f10 * f16;
                    f17 = 34.0f;
                } else {
                    f17 = 34.0f;
                    pow = 1.0f - (((float) Math.pow((f16 * (-2.0f)) + f10, 2.0d)) / f10);
                }
                dVar = this;
                if (pow < 0.4f) {
                    f18 = f17;
                    f19 = com.google.android.recaptcha.internal.a.z(dVar.x, L3, (pow - 0.4f) / f11, L3);
                } else {
                    f18 = f17;
                    f19 = L3;
                }
                if (pow < 0.4f) {
                    f20 = L3;
                    c10 = 1.0f;
                } else {
                    f20 = L3;
                    c10 = com.google.android.recaptcha.internal.a.c(pow, 0.4f, 0.39999998f, f11);
                }
                float f32 = pow < 0.4f ? 1.0f : pow / 0.4f;
                dVar.D = f32;
                float min4 = Math.min(1.0f, f19 / Math.max(1.0f, dVar.x)) * c10;
                float height = (dVar.getHeight() - org.telegram.messenger.g0.N(18.666666f)) - (f20 / f10);
                float f33 = (f19 * c10) / f10;
                float f34 = (c10 * f20) / f10;
                rectF.set(width2 - f33, height - f34, f33 + width2, height + f34);
                float height2 = rectF.height() / f10;
                j1 j1Var = s0Var2.d.n;
                paint.setColor(j1Var == null ? j1Var.h : 872415231);
                paint.setAlpha((int) (Color.alpha(s0Var2.d.n == null ? r3.h : 872415231) * f32));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                paint.setColor(872415231);
                paint.setAlpha((int) (51.0f * f32));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                RectF rectF7 = rectF;
                dVar.I.a(height2, f32, 0, canvas, rectF7);
                RectF rectF8 = rectF7;
                canvas.save();
                canvas.clipRect(rectF8);
                i7 = 0;
                int i17 = 0;
                while (i7 < arrayList2.size()) {
                    c cVar3 = (c) arrayList2.get(i7);
                    int i18 = i7;
                    float b12 = org.telegram.messenger.camera.q.b(i17, f28, org.telegram.messenger.g0.L(f18), (width2 - (dVar.x / f10)) + org.telegram.messenger.g0.L(8.0f));
                    if (!cVar3.d) {
                        i17++;
                    }
                    if (Float.isNaN(cVar3.b)) {
                        cVar3.b = b12;
                    }
                    boolean z16 = cVar3.d;
                    if (!z16) {
                        float f35 = cVar3.b;
                        cVar3.b = com.google.android.recaptcha.internal.a.z(b12, f35, 0.3f, f35);
                    }
                    float f36 = cVar3.c;
                    float z17 = com.google.android.recaptcha.internal.a.z(z16 ? f12 : 1.0f, f36, 0.28f, f36);
                    cVar3.c = z17;
                    if (Math.abs(z17 - (z16 ? f12 : 1.0f)) > 0.004f || Math.abs(b12 - cVar3.b) > 0.5f) {
                        z15 = true;
                    }
                    Drawable U = s0Var2.d.U(cVar3.a);
                    if (U == null) {
                        i10 = i17;
                    } else {
                        float L4 = org.telegram.messenger.g0.L(26.0f);
                        if (cVar3.d) {
                            f22 = cVar3.c;
                            i10 = i17;
                            f21 = 1.0f;
                        } else {
                            float f37 = cVar3.c;
                            f21 = 1.0f;
                            if (f37 >= 1.0f) {
                                i10 = i17;
                                x10 = 1.0f;
                            } else {
                                float f38 = f37 - 1.0f;
                                i10 = i17;
                                x10 = com.google.android.recaptcha.internal.a.x(f38, 1.4f, f38, (2.4f * f38 * f38 * f38) + 1.0f);
                            }
                            f22 = x10;
                        }
                        float f39 = L4 * f22 * min4;
                        if (f39 >= f21) {
                            U.setAlpha(qs.e4);
                            float z18 = com.google.android.recaptcha.internal.a.z(cVar3.b, width2, min4, width2);
                            float f40 = f39 / f10;
                            U.setBounds((int) (z18 - f40), (int) (rectF8.centerY() - f40), (int) (z18 + f40), (int) (rectF8.centerY() + f40));
                            x.b(canvas, U);
                        }
                    }
                    i7 = i18 + 1;
                    i17 = i10;
                    f28 = 0.5f;
                }
                canvas.restore();
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (((c) arrayList2.get(size)).d && ((c) arrayList2.get(size)).c < 0.02f) {
                        arrayList2.remove(size);
                    }
                }
                if (Math.abs(dVar.x - L2) <= 0.5f) {
                    rectF4 = rectF8;
                }
                z12 = true;
                rectF2 = rectF8;
                f23 = dVar.y;
                f24 = dVar.H;
                rectF3 = dVar.L;
                if (f23 == f24 || !rectF2.equals(rectF3)) {
                    dVar.H = dVar.y;
                    rectF3.set(rectF2);
                    q0Var = dVar.b;
                    if (q0Var != null) {
                        q0Var.invalidate();
                    }
                }
                if (z12 && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                dVar.postInvalidateOnAnimation();
            }
        }
        f13 = L2;
        dVar.x = f13;
        if (i15 <= 0) {
        }
        long b112 = b();
        if (dVar.E != 0) {
        }
        dVar.E = b112;
        f15 = dVar.y;
        if (f15 >= f14) {
        }
        if (dVar.y <= 0.003f) {
        }
        float L32 = org.telegram.messenger.g0.L(44.0f);
        float width22 = dVar.getWidth() / f10;
        f16 = dVar.y;
        if (f16 >= 0.5f) {
        }
        dVar = this;
        if (pow < 0.4f) {
        }
        if (pow < 0.4f) {
        }
        if (pow < 0.4f) {
        }
        dVar.D = f32;
        float min42 = Math.min(1.0f, f19 / Math.max(1.0f, dVar.x)) * c10;
        float height3 = (dVar.getHeight() - org.telegram.messenger.g0.N(18.666666f)) - (f20 / f10);
        float f332 = (f19 * c10) / f10;
        float f342 = (c10 * f20) / f10;
        rectF.set(width22 - f332, height3 - f342, f332 + width22, height3 + f342);
        float height22 = rectF.height() / f10;
        j1 j1Var2 = s0Var2.d.n;
        paint.setColor(j1Var2 == null ? j1Var2.h : 872415231);
        paint.setAlpha((int) (Color.alpha(s0Var2.d.n == null ? r3.h : 872415231) * f32));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        paint.setColor(872415231);
        paint.setAlpha((int) (51.0f * f32));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        RectF rectF72 = rectF;
        dVar.I.a(height22, f32, 0, canvas, rectF72);
        RectF rectF82 = rectF72;
        canvas.save();
        canvas.clipRect(rectF82);
        i7 = 0;
        int i172 = 0;
        while (i7 < arrayList2.size()) {
        }
        canvas.restore();
        while (size >= 0) {
        }
        if (Math.abs(dVar.x - L2) <= 0.5f) {
        }
        z12 = true;
        rectF2 = rectF82;
        f23 = dVar.y;
        f24 = dVar.H;
        rectF3 = dVar.L;
        if (f23 == f24) {
        }
        dVar.H = dVar.y;
        rectF3.set(rectF2);
        q0Var = dVar.b;
        if (q0Var != null) {
        }
        if (z12) {
        }
        dVar.postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (this.y >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.r;
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        c cVar = (c) arrayList.get(i7);
                        if (!cVar.d) {
                            if (Math.abs(motionEvent.getX() - cVar.b) < org.telegram.messenger.g0.L(34.0f) / 2.0f) {
                                l1 l1Var = ((s0) this.a.b).d;
                                ArrayList arrayList2 = l1Var.I;
                                if (i10 >= 0 && i10 < arrayList2.size()) {
                                    arrayList2.remove(i10);
                                    l1Var.c();
                                    l1Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i10++;
                        }
                        i7++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
