package bi;

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
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends View {
    public static final long g0 = System.currentTimeMillis();
    public static final String[] h0 = new String[100];
    public float E;
    public long F;
    public final RectF G;
    public float H;
    public float I;
    public final c1 J;
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
    public m U;
    public float V;
    public float W;
    public final bb.c a;
    public float a0;
    public h0 b;
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

    public c(Activity activity, bb.c cVar) {
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
        this.G = new RectF();
        this.H = Float.NaN;
        this.I = -1.0f;
        this.J = new c1(0);
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
        this.a = cVar;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - g0;
    }

    public static float c(float[] fArr, long j10) {
        float min = Math.min(1.0f, (j10 - ((long) fArr[2])) / 180.0f);
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
    public final boolean a(Canvas canvas, ViewGroup viewGroup, List list, long j10) {
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
        c cVar = this;
        Canvas canvas2 = canvas;
        List list2 = list;
        long j11 = j10;
        boolean z10 = false;
        int i3 = 0;
        while (i3 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof l) {
                    l lVar = (l) childAt;
                    String key = lVar.getKey();
                    if (key != null) {
                        int indexOf = list2.indexOf(key);
                        HashMap hashMap = cVar.n;
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
                                fArr = new float[]{1.0f, 0.0f, j11, f23, f23, 0.0f};
                                hashMap.put(key, fArr);
                            } else {
                                if (fArr[0] != 1.0f) {
                                    fArr[1] = c(fArr, j11);
                                    fArr[0] = 1.0f;
                                    fArr[2] = j11;
                                }
                                float f24 = fArr[3];
                                float f25 = i12;
                                if (f24 != f25) {
                                    fArr[4] = f24;
                                    fArr[3] = f25;
                                    fArr[5] = j11;
                                }
                            }
                        } else {
                            f10 = 0.0f;
                            f11 = 1.0f;
                            if (fArr != null && fArr[0] != 0.0f) {
                                fArr[1] = c(fArr, j11);
                                fArr[0] = 0.0f;
                                fArr[2] = j11;
                            }
                        }
                        float c2 = fArr == null ? f10 : c(fArr, j11);
                        if (fArr != null && c2 < 0.001f && fArr[0] == f10) {
                            hashMap.remove(key);
                        }
                        float f26 = f11 - (0.1f * c2);
                        if (Math.abs(lVar.n - f26) > 5.0E-4f) {
                            lVar.n = f26;
                            lVar.invalidate();
                            if (lVar.getParent() instanceof View) {
                                ((View) lVar.getParent()).invalidate();
                            }
                        }
                        if (childAt.getAlpha() != f11) {
                            childAt.setAlpha(f11);
                        }
                        if (fArr != null) {
                            if (j11 - ((long) fArr[2]) >= 200) {
                                float f27 = fArr[5];
                                if (f27 != f10) {
                                }
                            }
                            z10 = true;
                        }
                        if (c2 > 0.004f && fArr != null) {
                            int[] iArr = cVar.f;
                            childAt.getLocationOnScreen(iArr);
                            int i13 = iArr[0];
                            int[] iArr2 = cVar.h;
                            float f28 = i13 - iArr2[0];
                            float f29 = iArr[1] - iArr2[1];
                            float width = childAt.getWidth();
                            childAt.getHeight();
                            if (fArr[0] == 1.0f) {
                                f12 = 0.004f;
                                f13 = f29;
                                double d = (j11 - ((long) fArr[2])) / 1000.0d;
                                if (d <= 0.0d) {
                                    f14 = 0.3f;
                                    f15 = f28;
                                    sin = f10;
                                } else {
                                    double d10 = 6.283185307179586d / 0.3f;
                                    double sqrt = d10 / Math.sqrt(0.6975f);
                                    double d11 = d * d10;
                                    f14 = 0.3f;
                                    f15 = f28;
                                    sin = (float) (1.0d - (((Math.sin(d11) * ((0.55f * sqrt) / d10)) + Math.cos(d11)) * Math.exp(((-0.55f) * sqrt) * d)));
                                }
                                f16 = (sin * 0.4f) + 0.6f;
                            } else {
                                f12 = 0.004f;
                                f13 = f29;
                                f14 = 0.3f;
                                f15 = f28;
                                f16 = (0.4f * c2) + 0.6f;
                            }
                            float f30 = f16;
                            boolean z11 = (fArr[0] != 1.0f || j10 - ((long) fArr[2]) >= 600) ? z10 : true;
                            float L = (f15 + width) - org.telegram.messenger.g0.L(9.5f);
                            float L2 = f13 + org.telegram.messenger.g0.L(9.5f);
                            float min2 = Math.min(1.0f, c2 * 1.2f);
                            float L3 = f13 + org.telegram.messenger.g0.L(9.5f);
                            if (Float.isNaN(cVar.H)) {
                                f17 = 1.0f;
                            } else {
                                float f31 = cVar.H;
                                cVar.H = f31;
                                float L4 = org.telegram.messenger.g0.L(10.0f);
                                float max = Math.max(f10, Math.min(1.0f, (L3 - (f31 - L4)) / L4));
                                f17 = 1.0f - ((3.0f - (max * 2.0f)) * (max * max));
                            }
                            float f32 = min2 * f17;
                            if (f32 > f12 && f30 > 0.01f) {
                                float L5 = org.telegram.messenger.g0.L(8.0f);
                                if (cVar.R == null) {
                                    cVar.R = new LinearGradient(0.0f, -L5, 0.0f, L5, 1946157055, 536870911, Shader.TileMode.CLAMP);
                                    Paint.Style style = Paint.Style.STROKE;
                                    Paint paint = cVar.S;
                                    paint.setStyle(style);
                                    paint.setShader(cVar.R);
                                }
                                canvas2.save();
                                canvas2.translate(L, L2);
                                canvas2.scale(f30, f30);
                                Path path = cVar.P;
                                path.rewind();
                                path.addCircle(0.0f, 0.0f, L5, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                if (f32 < 0.999f) {
                                    float f33 = -L5;
                                    canvas2.saveLayerAlpha(f33, f33, L5, L5, (int) (f32 * 255.0f));
                                }
                                bb.c cVar2 = cVar.a;
                                a1 a1Var = ((j0) cVar2.b).d;
                                int[] iArr3 = cVar.Q;
                                a1Var.getLocationOnScreen(iArr3);
                                float f34 = 1.0f / f30;
                                canvas2.scale(f34, f34);
                                canvas2.translate(-L, -L2);
                                float f35 = iArr2[0] - iArr3[0];
                                float f36 = iArr2[1] - iArr3[1];
                                a1 a1Var2 = ((j0) cVar2.b).d;
                                if (!a1Var2.j0(canvas2) && a1Var2.Z2 != null) {
                                    canvas2.save();
                                    canvas2.translate(-f35, -f36);
                                    Bitmap bitmap = a1Var2.Z2;
                                    if (bitmap != null) {
                                        a1Var2.y(canvas2, bitmap);
                                    }
                                    canvas2.restore();
                                } else if (v.f() && a1Var2.j0(canvas2)) {
                                    canvas2.save();
                                    canvas2.translate(-f35, -f36);
                                    Object obj = a1Var2.I1;
                                    canvas2.save();
                                    canvas2.scale(9.0f, 9.0f);
                                    v.c(canvas2, obj);
                                    canvas2.restore();
                                    canvas2.restore();
                                } else {
                                    y0 y0Var = a1Var2.n;
                                    canvas2.drawColor(i0.a.o(y0Var != null ? i0.a.f(0.5f, y0Var.b, y0Var.c) : -12947803, hs.B3));
                                }
                                canvas2.translate(L, L2);
                                canvas2.scale(f30, f30);
                                Paint paint2 = cVar.c;
                                paint2.setColor(788529151);
                                canvas2.drawCircle(0.0f, 0.0f, L5, paint2);
                                if (f32 < 0.999f) {
                                    canvas2.restore();
                                }
                                canvas2.restore();
                                float N = org.telegram.messenger.g0.N(0.6f);
                                Paint paint3 = cVar.d;
                                paint3.setStrokeWidth(N);
                                paint3.setColor(1207959551);
                                paint3.setAlpha((int) (71.0f * f32));
                                canvas2.drawCircle(0.0f, 0.0f, L5 - org.telegram.messenger.g0.N(f14), paint3);
                                float L6 = org.telegram.messenger.g0.L(10.0f);
                                TextPaint textPaint = cVar.e;
                                textPaint.setTextSize(L6);
                                textPaint.setColor(-1);
                                Paint.FontMetrics fontMetrics = cVar.T;
                                textPaint.getFontMetrics(fontMetrics);
                                float f37 = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
                                if (fArr[5] == 0.0f) {
                                    min = 1.0f;
                                    f18 = 1.0f;
                                } else {
                                    f18 = 1.0f;
                                    min = Math.min(1.0f, (j10 - ((long) r4)) / 200.0f);
                                }
                                String[] strArr = h0;
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
                            z10 = z11;
                        }
                    }
                } else if (childAt instanceof ViewGroup) {
                    z10 |= cVar.a(canvas2, (ViewGroup) childAt, list, j10);
                }
                i3++;
                cVar = this;
                canvas2 = canvas;
                list2 = list;
                j11 = j10;
            }
            i3++;
            cVar = this;
            canvas2 = canvas;
            list2 = list;
            j11 = j10;
        }
        return z10;
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
        c cVar;
        ArrayList arrayList;
        boolean z10;
        float f10;
        RectF rectF;
        long min;
        float f11;
        boolean z11;
        boolean z12;
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
        float A;
        int i3;
        int size;
        boolean z13;
        float f21;
        int i10;
        float v;
        float f22;
        RectF rectF2;
        float f23;
        float f24;
        RectF rectF3;
        h0 h0Var;
        RectF rectF4;
        b bVar;
        float f25;
        boolean z14;
        float f26;
        float f27;
        bb.c cVar2 = this.a;
        j0 j0Var = (j0) cVar2.b;
        j0 j0Var2 = (j0) cVar2.b;
        ArrayList arrayList3 = j0Var.d.J;
        long b10 = b();
        h0 h0Var2 = this.b;
        int[] iArr = this.h;
        RectF rectF5 = this.G;
        if (h0Var2 != null) {
            getLocationOnScreen(iArr);
            canvas.save();
            if (!Float.isNaN(this.L)) {
                canvas.clipRect(0.0f, this.L, getWidth(), getHeight());
            }
            if (this.y > 0.003f && !rectF5.isEmpty()) {
                Path path = this.K;
                path.rewind();
                path.addRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, Path.Direction.CW);
                v.b(canvas, path);
            }
            z10 = a(canvas, this.b, arrayList3, b10);
            cVar = this;
            arrayList = arrayList3;
            canvas.restore();
        } else {
            cVar = this;
            arrayList = arrayList3;
            z10 = false;
        }
        long j10 = cVar.c0;
        if (j10 == 0) {
            min = 16;
            f10 = 2.0f;
            rectF = rectF5;
        } else {
            f10 = 2.0f;
            rectF = rectF5;
            min = Math.min(64L, b10 - j10);
        }
        long j11 = cVar.c0;
        if (j11 != 0 && b10 - j11 > 200) {
            cVar.W = (cVar.d0 || b10 - cVar.b0 < 900) ? 1.0f : 0.0f;
        }
        cVar.c0 = b10;
        m mVar = cVar.U;
        Paint paint = cVar.c;
        float f28 = 0.5f;
        if (mVar == null || Float.isNaN(cVar.V) || Float.isNaN(cVar.H) || !cVar.U.H) {
            f11 = 0.6f;
            z11 = true;
            z12 = false;
        } else {
            if (cVar.d0) {
                f25 = 0.6f;
                z11 = true;
            } else {
                f25 = 0.6f;
                z11 = true;
                z11 = true;
                if (b10 - cVar.b0 >= 900) {
                    z14 = false;
                    f26 = !z14 ? 1.0f : 0.0f;
                    f27 = cVar.W;
                    if (f27 >= f26) {
                        f11 = f25;
                        cVar.W = f1.h(min, 120.0f, f27, f26);
                    } else {
                        f11 = f25;
                        if (f27 > f26) {
                            cVar.W = f1.y(min, 250.0f, f27, f26);
                        }
                    }
                    float f29 = !cVar.d0 ? f11 : 0.45f;
                    float f30 = cVar.a0;
                    float min2 = (Math.min(1.0f, min / 80.0f) * (f29 - f30)) + f30;
                    cVar.a0 = min2;
                    z12 = (!z14 || cVar.W > 0.0f || Math.abs(min2 - f29) > 0.004f) ? z11 ? 1 : 0 : false;
                    if (cVar.W > 0.004f) {
                        int computeVerticalScrollRange = cVar.U.computeVerticalScrollRange();
                        int computeVerticalScrollExtent = cVar.U.computeVerticalScrollExtent();
                        int computeVerticalScrollOffset = cVar.U.computeVerticalScrollOffset();
                        if (computeVerticalScrollRange > computeVerticalScrollExtent && computeVerticalScrollExtent > 0) {
                            m mVar2 = cVar.U;
                            int[] iArr2 = cVar.e0;
                            mVar2.getLocationOnScreen(iArr2);
                            cVar.getLocationOnScreen(iArr);
                            float paddingTop = cVar.U.getPaddingTop() + (iArr2[z11 ? 1 : 0] - iArr[z11 ? 1 : 0]);
                            float L = ((cVar.y <= 0.5f || rectF.isEmpty()) ? cVar.H - org.telegram.messenger.g0.L(10.0f) : Math.min(cVar.H - org.telegram.messenger.g0.L(10.0f), rectF.top - org.telegram.messenger.g0.L(6.0f))) - paddingTop;
                            if (L > org.telegram.messenger.g0.L(30.0f)) {
                                float max = Math.max(org.telegram.messenger.g0.L(28.0f), (computeVerticalScrollExtent * L) / computeVerticalScrollRange);
                                float y9 = com.google.android.recaptcha.internal.a.y(L, max, Math.max(0.0f, Math.min(1.0f, computeVerticalScrollOffset / (computeVerticalScrollRange - computeVerticalScrollExtent))), paddingTop);
                                float width = cVar.getWidth() - org.telegram.messenger.g0.L(3.0f);
                                RectF rectF6 = cVar.f0;
                                rectF6.set(width - org.telegram.messenger.g0.L(3.0f), y9, width, max + y9);
                                paint.setColor(-1);
                                paint.setAlpha((int) (cVar.a0 * 255.0f * cVar.W));
                                canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), paint);
                            }
                        }
                    }
                }
            }
            z14 = z11 ? 1 : 0;
            if (!z14) {
            }
            f27 = cVar.W;
            if (f27 >= f26) {
            }
            if (!cVar.d0) {
            }
            float f302 = cVar.a0;
            float min22 = (Math.min(1.0f, min / 80.0f) * (f29 - f302)) + f302;
            cVar.a0 = min22;
            if (z14) {
            }
            if (cVar.W > 0.004f) {
            }
        }
        boolean z15 = z10 | z12;
        ArrayList arrayList4 = cVar.s;
        arrayList4.clear();
        int i11 = 0;
        while (true) {
            int size2 = arrayList.size();
            arrayList2 = cVar.r;
            if (i11 >= size2) {
                break;
            }
            String str = (String) arrayList.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    bVar = null;
                    break;
                }
                bVar = (b) arrayList2.get(i12);
                if (!bVar.d && !arrayList4.contains(bVar) && bVar.a.equals(str)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (bVar == null) {
                bVar = new b();
                bVar.b = Float.NaN;
                bVar.a = str;
            }
            arrayList4.add(bVar);
            i11++;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            b bVar2 = (b) arrayList2.get(i13);
            if (!bVar2.d && !arrayList4.contains(bVar2)) {
                bVar2.d = z11;
            }
            i13++;
            z11 = true;
        }
        ArrayList arrayList5 = cVar.w;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            if (((b) arrayList2.get(i14)).d) {
                arrayList5.add(Math.min(i14, arrayList5.size()), (b) arrayList2.get(i14));
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList5);
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            if (!((b) arrayList2.get(i16)).d) {
                i15++;
            }
        }
        float L2 = i15 == 0 ? org.telegram.messenger.g0.L(50.0f) : org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(34.0f) * i15);
        if (Float.isNaN(cVar.x)) {
            f12 = 0.0f;
        } else {
            float f31 = cVar.x;
            f12 = 0.0f;
            if (f31 != 0.0f) {
                f13 = com.google.android.recaptcha.internal.a.y(L2, f31, 0.25f, f31);
                cVar.x = f13;
                f14 = i15 <= 0 ? 1.0f : f12;
                long b11 = b();
                float min3 = cVar.F != 0 ? Math.min(64.0f, b11 - r9) : 16.0f;
                cVar.F = b11;
                f15 = cVar.y;
                if (f15 >= f14) {
                    cVar.y = f1.h(min3, 260.0f, f15, f14);
                } else if (f15 > f14) {
                    cVar.y = f1.y(min3, 260.0f, f15, f14);
                }
                if (cVar.y <= 0.003f) {
                    rectF4 = rectF;
                }
                float L3 = org.telegram.messenger.g0.L(44.0f);
                float width2 = cVar.getWidth() / f10;
                f16 = cVar.y;
                if (f16 >= 0.5f) {
                    pow = f16 * f10 * f16;
                    f17 = 34.0f;
                } else {
                    f17 = 34.0f;
                    pow = 1.0f - (((float) Math.pow((f16 * (-2.0f)) + f10, 2.0d)) / f10);
                }
                cVar = this;
                if (pow < 0.4f) {
                    f18 = f17;
                    f19 = com.google.android.recaptcha.internal.a.y(cVar.x, L3, (pow - 0.4f) / f11, L3);
                } else {
                    f18 = f17;
                    f19 = L3;
                }
                if (pow < 0.4f) {
                    f20 = L3;
                    A = 1.0f;
                } else {
                    f20 = L3;
                    A = a1.g.A(pow, 0.4f, 0.39999998f, f11);
                }
                float f32 = pow < 0.4f ? 1.0f : pow / 0.4f;
                cVar.E = f32;
                float min4 = Math.min(1.0f, f19 / Math.max(1.0f, cVar.x)) * A;
                float height = (cVar.getHeight() - org.telegram.messenger.g0.N(18.666666f)) - (f20 / f10);
                float f33 = (f19 * A) / f10;
                float f34 = (A * f20) / f10;
                rectF.set(width2 - f33, height - f34, f33 + width2, height + f34);
                float height2 = rectF.height() / f10;
                y0 y0Var = j0Var2.d.n;
                paint.setColor(y0Var == null ? y0Var.h : 872415231);
                paint.setAlpha((int) (Color.alpha(j0Var2.d.n == null ? r3.h : 872415231) * f32));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                paint.setColor(872415231);
                paint.setAlpha((int) (51.0f * f32));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                RectF rectF7 = rectF;
                cVar.J.a(height2, f32, 0, canvas, rectF7);
                RectF rectF8 = rectF7;
                canvas.save();
                canvas.clipRect(rectF8);
                i3 = 0;
                int i17 = 0;
                while (i3 < arrayList2.size()) {
                    b bVar3 = (b) arrayList2.get(i3);
                    int i18 = i3;
                    float b12 = org.telegram.messenger.camera.q.b(i17, f28, org.telegram.messenger.g0.L(f18), (width2 - (cVar.x / f10)) + org.telegram.messenger.g0.L(8.0f));
                    if (!bVar3.d) {
                        i17++;
                    }
                    if (Float.isNaN(bVar3.b)) {
                        bVar3.b = b12;
                    }
                    boolean z16 = bVar3.d;
                    if (!z16) {
                        float f35 = bVar3.b;
                        bVar3.b = com.google.android.recaptcha.internal.a.y(b12, f35, 0.3f, f35);
                    }
                    float f36 = bVar3.c;
                    float y10 = com.google.android.recaptcha.internal.a.y(z16 ? f12 : 1.0f, f36, 0.28f, f36);
                    bVar3.c = y10;
                    if (Math.abs(y10 - (z16 ? f12 : 1.0f)) > 0.004f || Math.abs(b12 - bVar3.b) > 0.5f) {
                        z15 = true;
                    }
                    Drawable U = j0Var2.d.U(bVar3.a);
                    if (U == null) {
                        i10 = i17;
                    } else {
                        float L4 = org.telegram.messenger.g0.L(26.0f);
                        if (bVar3.d) {
                            f22 = bVar3.c;
                            i10 = i17;
                            f21 = 1.0f;
                        } else {
                            float f37 = bVar3.c;
                            f21 = 1.0f;
                            if (f37 >= 1.0f) {
                                i10 = i17;
                                v = 1.0f;
                            } else {
                                float f38 = f37 - 1.0f;
                                i10 = i17;
                                v = com.google.android.recaptcha.internal.a.v(f38, 1.4f, f38, (2.4f * f38 * f38 * f38) + 1.0f);
                            }
                            f22 = v;
                        }
                        float f39 = L4 * f22 * min4;
                        if (f39 >= f21) {
                            U.setAlpha(hs.e4);
                            float y11 = com.google.android.recaptcha.internal.a.y(bVar3.b, width2, min4, width2);
                            float f40 = f39 / f10;
                            U.setBounds((int) (y11 - f40), (int) (rectF8.centerY() - f40), (int) (y11 + f40), (int) (rectF8.centerY() + f40));
                            s.b(canvas, U);
                        }
                    }
                    i3 = i18 + 1;
                    i17 = i10;
                    f28 = 0.5f;
                }
                canvas.restore();
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (((b) arrayList2.get(size)).d && ((b) arrayList2.get(size)).c < 0.02f) {
                        arrayList2.remove(size);
                    }
                }
                if (Math.abs(cVar.x - L2) <= 0.5f) {
                    rectF4 = rectF8;
                }
                z13 = true;
                rectF2 = rectF8;
                f23 = cVar.y;
                f24 = cVar.I;
                rectF3 = cVar.M;
                if (f23 == f24 || !rectF2.equals(rectF3)) {
                    cVar.I = cVar.y;
                    rectF3.set(rectF2);
                    h0Var = cVar.b;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                if (z13 && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                cVar.postInvalidateOnAnimation();
            }
        }
        f13 = L2;
        cVar.x = f13;
        if (i15 <= 0) {
        }
        long b112 = b();
        if (cVar.F != 0) {
        }
        cVar.F = b112;
        f15 = cVar.y;
        if (f15 >= f14) {
        }
        if (cVar.y <= 0.003f) {
        }
        float L32 = org.telegram.messenger.g0.L(44.0f);
        float width22 = cVar.getWidth() / f10;
        f16 = cVar.y;
        if (f16 >= 0.5f) {
        }
        cVar = this;
        if (pow < 0.4f) {
        }
        if (pow < 0.4f) {
        }
        if (pow < 0.4f) {
        }
        cVar.E = f32;
        float min42 = Math.min(1.0f, f19 / Math.max(1.0f, cVar.x)) * A;
        float height3 = (cVar.getHeight() - org.telegram.messenger.g0.N(18.666666f)) - (f20 / f10);
        float f332 = (f19 * A) / f10;
        float f342 = (A * f20) / f10;
        rectF.set(width22 - f332, height3 - f342, f332 + width22, height3 + f342);
        float height22 = rectF.height() / f10;
        y0 y0Var2 = j0Var2.d.n;
        paint.setColor(y0Var2 == null ? y0Var2.h : 872415231);
        paint.setAlpha((int) (Color.alpha(j0Var2.d.n == null ? r3.h : 872415231) * f32));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        paint.setColor(872415231);
        paint.setAlpha((int) (51.0f * f32));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        RectF rectF72 = rectF;
        cVar.J.a(height22, f32, 0, canvas, rectF72);
        RectF rectF82 = rectF72;
        canvas.save();
        canvas.clipRect(rectF82);
        i3 = 0;
        int i172 = 0;
        while (i3 < arrayList2.size()) {
        }
        canvas.restore();
        while (size >= 0) {
        }
        if (Math.abs(cVar.x - L2) <= 0.5f) {
        }
        z13 = true;
        rectF2 = rectF82;
        f23 = cVar.y;
        f24 = cVar.I;
        rectF3 = cVar.M;
        if (f23 == f24) {
        }
        cVar.I = cVar.y;
        rectF3.set(rectF2);
        h0Var = cVar.b;
        if (h0Var != null) {
        }
        if (z13) {
        }
        cVar.postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3 = 0;
        if (this.y >= 0.5f) {
            if (this.G.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.r;
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i3);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.b) < org.telegram.messenger.g0.L(34.0f) / 2.0f) {
                                a1 a1Var = ((j0) this.a.b).d;
                                ArrayList arrayList2 = a1Var.J;
                                if (i10 >= 0 && i10 < arrayList2.size()) {
                                    arrayList2.remove(i10);
                                    a1Var.c();
                                    a1Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i10++;
                        }
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
