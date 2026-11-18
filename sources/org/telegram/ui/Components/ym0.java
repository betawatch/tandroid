package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class ym0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static float[] l0;
    public static Path m0;
    public boolean E;
    public float F;
    public final org.telegram.ui.Cells.y G;
    public float H;
    public final int[] I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final org.telegram.ui.ActionBar.i6 O;
    public final x7 P;
    public boolean Q;
    public float R;
    public float S;
    public int T;
    public ArrayList U;
    public CharSequence V;
    public long W;
    public int a;
    public float a0;
    public final org.telegram.ui.ActionBar.u0 b;
    public int b0;
    public final Paint c;
    public StaticLayout[] c0;
    public final Paint d;
    public TextPaint d0;
    public final int e;
    public float e0;
    public final int f;
    public int f0;
    public long g0;
    public int h;
    public float h0;
    public final RectF i0;
    public int j0;
    public int k0;
    public final c6 n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public xm0 y;

    public ym0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i7 = this.f;
        return (int) (Math.abs(((i7 / 2.0f) + (this.W > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0)) - ((getMeasuredWidth() - (i7 / 2.0f)) - (this.W > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0))) - org.telegram.messenger.g0.L(66.0f));
    }

    private void setTimestampIndex(int i7) {
        if (this.j0 != i7) {
            this.j0 = i7;
            if (i7 < 0 || i7 >= this.U.size()) {
                return;
            }
            this.P.setText((CharSequence) ((Pair) this.U.get(this.j0)).second);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0175, code lost:
    
        if (r14.left >= r27.left) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de A[EDGE_INSN: B:70:0x01de->B:71:0x01de BREAK  A[LOOP:2: B:27:0x00a8->B:75:0x01d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        int i7;
        char c10;
        float floatValue;
        ?? r17;
        char c11;
        ym0 ym0Var = this;
        float L = org.telegram.messenger.g0.L(2.0f);
        ArrayList arrayList = ym0Var.U;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, L, L, paint);
            return;
        }
        float f10 = rectF.bottom;
        int i10 = ym0Var.f;
        float f11 = i10 / 2.0f;
        float measuredWidth = ym0Var.getMeasuredWidth() - (i10 / 2.0f);
        org.telegram.messenger.g0.P.set(rectF);
        float L2 = org.telegram.messenger.g0.L(ym0Var.a0 * 1.0f) / 2.0f;
        if (m0 == null) {
            m0 = new Path();
        }
        m0.reset();
        float L3 = org.telegram.messenger.g0.L(4.0f) / (measuredWidth - f11);
        int i11 = 0;
        while (true) {
            i7 = -1;
            if (i11 >= ym0Var.U.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) ym0Var.U.get(i11)).first).floatValue() >= L3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        boolean z10 = true;
        int size = ym0Var.U.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) ym0Var.U.get(size)).first).floatValue() >= L3) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        if (i7 < 0) {
            i7 = ym0Var.U.size();
        }
        int i12 = i11;
        while (i12 <= i7) {
            if (i12 == i11) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) ym0Var.U.get(i12 - 1)).first).floatValue();
            }
            float floatValue2 = i12 == i7 ? 1.0f : ((Float) ((Pair) ym0Var.U.get(i12)).first).floatValue();
            while (i12 != i7 && i12 != 0) {
                r17 = z10;
                if (i12 >= ym0Var.U.size() - 1 || ((Float) ((Pair) ym0Var.U.get(i12)).first).floatValue() - floatValue > L3) {
                    break;
                }
                i12++;
                floatValue2 = ((Float) ((Pair) ym0Var.U.get(i12)).first).floatValue();
                z10 = r17 == true ? 1 : 0;
            }
            r17 = z10;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.left = org.telegram.messenger.g0.T1(f11, measuredWidth, floatValue) + (i12 > 0 ? L2 : 0.0f);
            float T1 = org.telegram.messenger.g0.T1(f11, measuredWidth, floatValue2) - (i12 < i7 ? L2 : 0.0f);
            rectF2.right = T1;
            float f12 = rectF.right;
            char c12 = T1 > f12 ? r17 : c10;
            if (c12 != 0) {
                rectF2.right = f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF.left;
            if (f13 >= f14) {
                if (rectF2.left < f14) {
                    rectF2.left = f14;
                }
                if (l0 == null) {
                    l0 = new float[8];
                }
                if (i12 != i11) {
                    if (c12 != 0) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i12 >= i7) {
                        float[] fArr = l0;
                        float f15 = 0.7f * L * ym0Var.a0;
                        fArr[7] = f15;
                        fArr[6] = f15;
                        fArr[r17] = f15;
                        fArr[c10] = f15;
                        fArr[5] = L;
                        fArr[c11] = L;
                        fArr[3] = L;
                        fArr[2] = L;
                    } else {
                        float[] fArr2 = l0;
                        float f16 = 0.7f * L * ym0Var.a0;
                        fArr2[5] = f16;
                        fArr2[c11] = f16;
                        fArr2[3] = f16;
                        fArr2[2] = f16;
                        fArr2[7] = f16;
                        fArr2[6] = f16;
                        fArr2[r17] = f16;
                        fArr2[c10] = f16;
                    }
                    m0.addRoundRect(rectF2, l0, Path.Direction.CW);
                    if (c12 == 0) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = l0;
                fArr3[7] = L;
                fArr3[6] = L;
                fArr3[r17] = L;
                fArr3[c10] = L;
                float f17 = 0.7f * L * ym0Var.a0;
                fArr3[5] = f17;
                fArr3[c11] = f17;
                fArr3[3] = f17;
                fArr3[2] = f17;
                m0.addRoundRect(rectF2, l0, Path.Direction.CW);
                if (c12 == 0) {
                }
            }
            i12++;
            ym0Var = this;
            z10 = r17;
        }
        canvas.drawPath(m0, paint);
    }

    public final StaticLayout b(int i7, CharSequence charSequence) {
        if (this.d0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.d0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        }
        this.d0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jj, this.O));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.d0, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final int c() {
        return Math.max((int) (this.w * (getMeasuredWidth() - this.f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.G;
        int i7 = this.e;
        int i10 = this.f;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.Q = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.S) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i7) / 2;
                    if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i7 + measuredHeight) {
                        int x10 = ((int) motionEvent.getX()) - (i7 / 2);
                        this.h = x10;
                        if (x10 < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i10) {
                            this.h = getMeasuredWidth() - i10;
                        }
                    }
                    this.r = (int) (motionEvent.getX() - this.h);
                    this.x = true;
                }
            }
            if (this.x) {
                if (motionEvent.getAction() == 1) {
                    if (this.N) {
                        float measuredWidth = (getMeasuredWidth() - i10) / 2;
                        float f10 = this.h;
                        if (f10 >= measuredWidth) {
                            f(false, (f10 - measuredWidth) / measuredWidth);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)));
                        }
                    } else {
                        f(true, this.h / (getMeasuredWidth() - i10));
                    }
                }
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
                this.y.C();
                this.x = false;
                org.telegram.messenger.g0.h3(new gb0(this, 25), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.Q) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.S) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.R) > viewConfiguration.getScaledTouchSlop()) {
                    this.Q = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i7) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i7 + measuredHeight2) {
                            int x11 = ((int) motionEvent.getX()) - (i7 / 2);
                            this.h = x11;
                            if (x11 < c()) {
                                this.h = c();
                            } else if (this.h > getMeasuredWidth() - i10) {
                                this.h = getMeasuredWidth() - i10;
                            }
                        }
                        this.r = (int) (motionEvent.getX() - this.h);
                        this.x = true;
                        this.y.C();
                        if (yVar != null) {
                            yVar.setState(this.I);
                            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.x) {
                int x12 = (int) (motionEvent.getX() - this.r);
                this.h = x12;
                if (x12 < c()) {
                    this.h = c();
                } else if (this.h > getMeasuredWidth() - i10) {
                    this.h = getMeasuredWidth() - i10;
                }
                if (this.E) {
                    if (this.N) {
                        float measuredWidth2 = (getMeasuredWidth() - i10) / 2;
                        float f11 = this.h;
                        if (f11 >= measuredWidth2) {
                            f(false, (f11 - measuredWidth2) / measuredWidth2);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)));
                        }
                    } else {
                        f(false, this.h / (getMeasuredWidth() - i10));
                    }
                }
                if (yVar != null) {
                    yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z10, float f10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.s = f10;
            return;
        }
        this.s = -100.0f;
        boolean z11 = this.N;
        int i7 = this.f;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i7) / 2;
            ceil = f10 < 0.0f ? Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f10 * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i7) * f10);
        }
        int i10 = (int) ceil;
        int i11 = this.h;
        if (i11 != i10) {
            if (z10) {
                this.K = i11;
                this.J = 0.0f;
            }
            this.h = i10;
            if (i10 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i7) {
                this.h = getMeasuredWidth() - i7;
            }
            invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        xm0 xm0Var = this.y;
        if (xm0Var != null) {
            xm0Var.n(z10, f10);
        }
        if (this.L > 1) {
            int round = Math.round((r0 - 1) * f10);
            if (!z10 && round != this.T) {
                org.telegram.messenger.g0.a4(this);
            }
            this.T = round;
        }
    }

    public final void g(org.telegram.messenger.fj fjVar) {
        String str;
        if (fjVar == null) {
            this.U = null;
            this.b0 = -1;
            this.a0 = 0.0f;
            StaticLayout[] staticLayoutArr = this.c0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) fjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.U = null;
            this.b0 = -1;
            this.a0 = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.c0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        CharSequence charSequence = fjVar.z;
        if (fjVar.e5()) {
            if (fjVar.B == null && (str = fjVar.k.media.webpage.description) != null) {
                fjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.fj.h(fjVar.N3(), fjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = fjVar.B;
        }
        boolean z10 = charSequence != this.V;
        if (z10 || this.W != valueOf.longValue()) {
            this.V = charSequence;
            this.W = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.k0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.U = null;
                this.b0 = -1;
                this.a0 = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.c0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                p41[] p41VarArr = (p41[]) spanned.getSpans(0, spanned.length(), p41.class);
                this.U = new ArrayList();
                if (z10) {
                    this.a0 = 0.0f;
                }
                if (this.d0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.d0 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.d0.setColor(-1);
                }
                for (p41 p41Var : p41VarArr) {
                    if (p41Var != null && p41Var.getURL() != null && p41Var.d != null && p41Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(p41Var.getURL().substring(6)).intValue() >= 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p41Var.d);
                            org.telegram.messenger.j6.l(spannableStringBuilder, this.d0.getFontMetricsInt(), false);
                            this.U.add(new Pair(Float.valueOf((r4.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.U, new org.telegram.ui.pe(14));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.U = null;
                this.b0 = -1;
                this.a0 = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.c0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        return getMeasuredWidth() == 0 ? this.s : this.h / (getMeasuredWidth() - this.f);
    }

    public wm0 getSeekBarAccessibilityDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        int i7 = this.h;
        boolean z11 = this.N;
        int i10 = this.f;
        if (!z11 && this.L > 1) {
            i7 = (int) this.n.e(false, Math.round(i7 / r3) * ((getMeasuredWidth() - i10) / (this.L - 1.0f)));
        }
        int i11 = i7;
        int measuredHeight = getMeasuredHeight();
        int i12 = this.e;
        int i13 = (measuredHeight - i12) / 2;
        int i14 = org.telegram.ui.ActionBar.n6.Kj;
        org.telegram.ui.ActionBar.i6 i6Var = this.O;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i14, i6Var);
        Paint paint = this.c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i10 / 2.0f;
        int i15 = i10 / 2;
        float measuredWidth = getMeasuredWidth() - i15;
        float L = measuredHeight2 - (org.telegram.messenger.g0.L(this.M) / 2.0f);
        float L2 = (org.telegram.messenger.g0.L(this.M) / 2.0f) + measuredHeight2;
        RectF rectF = this.i0;
        rectF.set(f15, L, measuredWidth, L2);
        a(canvas2, rectF, paint);
        if (this.F > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Lj, i6Var));
            f10 = 0.0f;
            rectF.set(f15, L, (this.F * (getMeasuredWidth() - i10)) + f15, L2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z12 = this.N;
        Paint paint2 = this.d;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(1.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + (getMeasuredWidth() / 2), org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i11 > (getMeasuredWidth() - i10) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), i15 + i11, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i15 + i11, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f15 = f15;
        } else {
            float f16 = this.w;
            if (f16 >= f10) {
                float f17 = measuredWidth - f15;
                rectF.set((f16 * f17) + f15, L, i11 + f15, L2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, L, (this.w * f17) + f15, L2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, L, i11 + f15, L2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.y yVar = this.G;
        if (yVar != null) {
            int L3 = (i15 + i11) - org.telegram.messenger.g0.L(16.0f);
            int L4 = ((i12 / 2) + i13) - org.telegram.messenger.g0.L(16.0f);
            yVar.setBounds(L3, L4, org.telegram.messenger.g0.L(32.0f) + L3, org.telegram.messenger.g0.L(32.0f) + L4);
            yVar.draw(canvas2);
        }
        int L5 = org.telegram.messenger.g0.L(this.x ? 8.0f : 6.0f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f18 = this.H;
        float f19 = L5;
        if (f18 != f19) {
            f11 = 16.0f;
            if (f18 < f19) {
                f12 = 8.0f;
                float c10 = com.google.android.gms.internal.vision.e2.c(elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f18);
                this.H = c10;
                if (c10 > f19) {
                    this.H = f19;
                }
            } else {
                f12 = 8.0f;
                float w10 = org.telegram.messenger.n10.w(elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f18);
                this.H = w10;
                if (w10 < f19) {
                    this.H = f19;
                }
            }
            z10 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z10 = false;
        }
        float f20 = this.J;
        if (f20 < 1.0f) {
            float f21 = (elapsedRealtime / 225.0f) + f20;
            this.J = f21;
            if (f21 < 1.0f) {
                z10 = true;
            } else {
                this.J = 1.0f;
            }
        }
        float f22 = this.J;
        if (f22 < 1.0f) {
            float interpolation = 1.0f - xs.c.getInterpolation(Math.min(1.0f, f22 * 3.0f));
            float interpolation2 = xs.d.getInterpolation(this.J);
            if (interpolation > f10) {
                canvas2.drawCircle(i15 + this.K, (i12 / 2) + i13, this.H * interpolation, paint2);
            }
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.H * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.H, paint2);
        }
        ArrayList arrayList = this.U;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.U.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.U.get(size)).first).floatValue() - 0.001f <= progress) {
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.c0 == null) {
                this.c0 = new StaticLayout[2];
            }
            float L6 = (this.W > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0) + f15;
            float abs = Math.abs(L6 - ((getMeasuredWidth() - f15) - (this.W > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0))) - org.telegram.messenger.g0.L(66.0f);
            float f23 = this.h0;
            if (f23 > f10 && Math.abs(f23 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.c0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.c0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.h0 = abs;
            if (size != this.b0) {
                StaticLayout[] staticLayoutArr3 = this.c0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.x) {
                    org.telegram.messenger.g0.a4(this);
                }
                if (size < 0 || size >= this.U.size()) {
                    this.c0[0] = null;
                } else {
                    CharSequence charSequence = (CharSequence) ((Pair) this.U.get(size)).second;
                    if (charSequence == null) {
                        this.c0[0] = null;
                    } else {
                        this.c0[0] = b((int) abs, charSequence);
                    }
                }
                this.e0 = f10;
                if (size == -1) {
                    this.f0 = -1;
                } else {
                    int i16 = this.b0;
                    if (i16 == -1) {
                        this.f0 = 1;
                    } else if (size < i16) {
                        this.f0 = -1;
                    } else if (size > i16) {
                        this.f0 = 1;
                    }
                }
                this.b0 = size;
            }
            if (this.e0 < 1.0f) {
                this.e0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.g0)) / (this.U.size() > 8 ? 160.0f : 220.0f)) + this.e0, 1.0f);
                invalidate();
                this.g0 = SystemClock.elapsedRealtime();
            }
            if (this.a0 < 1.0f) {
                this.a0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.g0)) / 200.0f) + this.a0, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = lr.f.getInterpolation(this.e0);
            canvas2.save();
            canvas2.translate(L6 + org.telegram.messenger.g0.L(25.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            this.d0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jj, i6Var));
            if (this.c0[1] != null) {
                canvas2.save();
                if (this.f0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((org.telegram.messenger.g0.L(f11) * (-this.f0) * interpolation3) + org.telegram.messenger.g0.L(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.c0[1].getHeight()) / 2.0f);
                this.d0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.a0));
                canvas2.restore();
            }
            if (this.c0[0] != null) {
                canvas2.save();
                if (this.f0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, interpolation3, org.telegram.messenger.g0.L(f11) * this.f0, org.telegram.messenger.g0.L(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.c0[0].getHeight()) / 2.0f);
                this.d0.setAlpha((int) (interpolation3 * 255.0f * this.a0));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2);
        x7 x7Var = this.P;
        int measuredHeight = (x7Var.getMeasuredHeight() / 2) + L;
        int L2 = org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(25.0f) + (this.f / 2) + (this.W > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0);
        x7Var.layout(L2, measuredHeight - x7Var.getMeasuredHeight(), x7Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.k0 = timestampLabelWidth;
        this.P.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
        if (this.s == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.s);
        this.s = -100.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f10) {
        this.F = f10;
        invalidate();
    }

    public void setDelegate(xm0 xm0Var) {
        this.y = xm0Var;
    }

    public void setInnerColor(int i7) {
        this.c.setColor(i7);
    }

    public void setLineWidth(int i7) {
        this.M = i7;
    }

    public void setMinProgress(float f10) {
        this.w = f10;
        float progress = getProgress();
        float f11 = this.w;
        if (progress < f11) {
            e(false, f11);
        }
        invalidate();
    }

    public void setOuterColor(int i7) {
        this.d.setColor(i7);
        org.telegram.ui.Cells.y yVar = this.G;
        if (yVar != null) {
            org.telegram.ui.ActionBar.n6.H1(yVar, i0.a.o(i7, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(false, f10);
    }

    public void setReportChanges(boolean z10) {
        this.E = z10;
    }

    public void setSeparatorsCount(int i7) {
        this.L = i7;
    }

    public void setTwoSided(boolean z10) {
        this.N = z10;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint == null || paint.getColor() != this.a || (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mj, this.O)) == this.a) {
                return;
            }
            this.a = w02;
            setOuterColor(w02);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G;
    }

    public ym0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.n = new c6(this, 0L, 60L, lr.g);
        this.s = -100.0f;
        this.w = -1.0f;
        this.I = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.J = 1.0f;
        this.M = 3;
        this.a0 = 0.0f;
        this.b0 = -1;
        this.e0 = 1.0f;
        this.h0 = -1.0f;
        this.i0 = new RectF();
        this.j0 = -1;
        this.O = i6Var;
        setWillNotDraw(false);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i7 = org.telegram.ui.ActionBar.n6.Mj;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.a = w02;
        paint.setColor(w02);
        this.f = org.telegram.messenger.g0.L(32.0f);
        this.e = org.telegram.messenger.g0.L(24.0f);
        this.H = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), 40), 1, org.telegram.messenger.g0.L(16.0f));
        this.G = h02;
        h02.setCallback(this);
        h02.setVisible(true, false);
        x7 x7Var = new x7(this, context, context, 2);
        this.P = x7Var;
        x7Var.y = true;
        addView(x7Var, c8.ma.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(this, z10);
        this.b = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
