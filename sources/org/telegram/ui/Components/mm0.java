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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class mm0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static float[] k0;
    public static Path l0;
    public boolean D;
    public float E;
    public final org.telegram.ui.Cells.y F;
    public float G;
    public final int[] H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.h6 N;
    public final s7 O;
    public boolean P;
    public float Q;
    public float R;
    public int S;
    public ArrayList T;
    public CharSequence U;
    public long V;
    public float W;
    public int a;
    public int a0;
    public final org.telegram.ui.ActionBar.u0 b;
    public StaticLayout[] b0;
    public final Paint c;
    public TextPaint c0;
    public final Paint d;
    public float d0;
    public final int e;
    public int e0;
    public final int f;
    public long f0;
    public float g0;
    public int h;
    public final RectF h0;
    public int i0;
    public int j0;
    public final v5 n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public lm0 y;

    public mm0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i7 = this.f;
        return (int) (Math.abs(((i7 / 2.0f) + (this.V > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0)) - ((getMeasuredWidth() - (i7 / 2.0f)) - (this.V > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0))) - org.telegram.messenger.g0.L(66.0f));
    }

    private void setTimestampIndex(int i7) {
        if (this.i0 != i7) {
            this.i0 = i7;
            if (i7 < 0 || i7 >= this.T.size()) {
                return;
            }
            this.O.setText((CharSequence) ((Pair) this.T.get(this.i0)).second);
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
        mm0 mm0Var = this;
        float L = org.telegram.messenger.g0.L(2.0f);
        ArrayList arrayList = mm0Var.T;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, L, L, paint);
            return;
        }
        float f10 = rectF.bottom;
        int i10 = mm0Var.f;
        float f11 = i10 / 2.0f;
        float measuredWidth = mm0Var.getMeasuredWidth() - (i10 / 2.0f);
        org.telegram.messenger.g0.P.set(rectF);
        float L2 = org.telegram.messenger.g0.L(mm0Var.W * 1.0f) / 2.0f;
        if (l0 == null) {
            l0 = new Path();
        }
        l0.reset();
        float L3 = org.telegram.messenger.g0.L(4.0f) / (measuredWidth - f11);
        int i11 = 0;
        while (true) {
            i7 = -1;
            if (i11 >= mm0Var.T.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) mm0Var.T.get(i11)).first).floatValue() >= L3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        boolean z9 = true;
        int size = mm0Var.T.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) mm0Var.T.get(size)).first).floatValue() >= L3) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        if (i7 < 0) {
            i7 = mm0Var.T.size();
        }
        int i12 = i11;
        while (i12 <= i7) {
            if (i12 == i11) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) mm0Var.T.get(i12 - 1)).first).floatValue();
            }
            float floatValue2 = i12 == i7 ? 1.0f : ((Float) ((Pair) mm0Var.T.get(i12)).first).floatValue();
            while (i12 != i7 && i12 != 0) {
                r17 = z9;
                if (i12 >= mm0Var.T.size() - 1 || ((Float) ((Pair) mm0Var.T.get(i12)).first).floatValue() - floatValue > L3) {
                    break;
                }
                i12++;
                floatValue2 = ((Float) ((Pair) mm0Var.T.get(i12)).first).floatValue();
                z9 = r17 == true ? 1 : 0;
            }
            r17 = z9;
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
                if (k0 == null) {
                    k0 = new float[8];
                }
                if (i12 != i11) {
                    if (c12 != 0) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i12 >= i7) {
                        float[] fArr = k0;
                        float f15 = 0.7f * L * mm0Var.W;
                        fArr[7] = f15;
                        fArr[6] = f15;
                        fArr[r17] = f15;
                        fArr[c10] = f15;
                        fArr[5] = L;
                        fArr[c11] = L;
                        fArr[3] = L;
                        fArr[2] = L;
                    } else {
                        float[] fArr2 = k0;
                        float f16 = 0.7f * L * mm0Var.W;
                        fArr2[5] = f16;
                        fArr2[c11] = f16;
                        fArr2[3] = f16;
                        fArr2[2] = f16;
                        fArr2[7] = f16;
                        fArr2[6] = f16;
                        fArr2[r17] = f16;
                        fArr2[c10] = f16;
                    }
                    l0.addRoundRect(rectF2, k0, Path.Direction.CW);
                    if (c12 == 0) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = k0;
                fArr3[7] = L;
                fArr3[6] = L;
                fArr3[r17] = L;
                fArr3[c10] = L;
                float f17 = 0.7f * L * mm0Var.W;
                fArr3[5] = f17;
                fArr3[c11] = f17;
                fArr3[3] = f17;
                fArr3[2] = f17;
                l0.addRoundRect(rectF2, k0, Path.Direction.CW);
                if (c12 == 0) {
                }
            }
            i12++;
            mm0Var = this;
            z9 = r17;
        }
        canvas.drawPath(l0, paint);
    }

    public final StaticLayout b(int i7, CharSequence charSequence) {
        if (this.c0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.c0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        }
        this.c0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, this.N));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.c0, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final int c() {
        return Math.max((int) (this.w * (getMeasuredWidth() - this.f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.F;
        int i7 = this.e;
        int i10 = this.f;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.P = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.R) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
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
                    if (this.M) {
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
                this.y.D();
                this.x = false;
                org.telegram.messenger.g0.i3(new ob0(this, 22), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.P) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.R) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.Q) > viewConfiguration.getScaledTouchSlop()) {
                    this.P = true;
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
                        this.y.D();
                        if (yVar != null) {
                            yVar.setState(this.H);
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
                if (this.D) {
                    if (this.M) {
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

    public final void e(boolean z9, float f10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.s = f10;
            return;
        }
        this.s = -100.0f;
        boolean z10 = this.M;
        int i7 = this.f;
        if (z10) {
            float measuredWidth = (getMeasuredWidth() - i7) / 2;
            ceil = f10 < 0.0f ? Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f10 * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i7) * f10);
        }
        int i10 = (int) ceil;
        int i11 = this.h;
        if (i11 != i10) {
            if (z9) {
                this.J = i11;
                this.I = 0.0f;
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

    public final void f(boolean z9, float f10) {
        lm0 lm0Var = this.y;
        if (lm0Var != null) {
            lm0Var.l(z9, f10);
        }
        if (this.K > 1) {
            int round = Math.round((r0 - 1) * f10);
            if (!z9 && round != this.S) {
                org.telegram.messenger.g0.c4(this);
            }
            this.S = round;
        }
    }

    public final void g(org.telegram.messenger.ij ijVar) {
        String str;
        if (ijVar == null) {
            this.T = null;
            this.a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr = this.b0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) ijVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.T = null;
            this.a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.b0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        CharSequence charSequence = ijVar.z;
        if (ijVar.e5()) {
            if (ijVar.B == null && (str = ijVar.k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.N3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        boolean z9 = charSequence != this.U;
        if (z9 || this.V != valueOf.longValue()) {
            this.U = charSequence;
            this.V = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.j0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.T = null;
                this.a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.b0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                b41[] b41VarArr = (b41[]) spanned.getSpans(0, spanned.length(), b41.class);
                this.T = new ArrayList();
                if (z9) {
                    this.W = 0.0f;
                }
                if (this.c0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.c0 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.c0.setColor(-1);
                }
                for (b41 b41Var : b41VarArr) {
                    if (b41Var != null && b41Var.getURL() != null && b41Var.d != null && b41Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(b41Var.getURL().substring(6)).intValue() >= 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b41Var.d);
                            org.telegram.messenger.i6.l(spannableStringBuilder, this.c0.getFontMetricsInt(), false);
                            this.T.add(new Pair(Float.valueOf((r4.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.T, new org.telegram.ui.pe(15));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.T = null;
                this.a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.b0;
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

    public km0 getSeekBarAccessibilityDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        int i7 = this.h;
        boolean z10 = this.M;
        int i10 = this.f;
        if (!z10 && this.K > 1) {
            i7 = (int) this.n.e(false, Math.round(i7 / r3) * ((getMeasuredWidth() - i10) / (this.K - 1.0f)));
        }
        int i11 = i7;
        int measuredHeight = getMeasuredHeight();
        int i12 = this.e;
        int i13 = (measuredHeight - i12) / 2;
        int i14 = org.telegram.ui.ActionBar.m6.Hj;
        org.telegram.ui.ActionBar.h6 h6Var = this.N;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
        Paint paint = this.c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i10 / 2.0f;
        int i15 = i10 / 2;
        float measuredWidth = getMeasuredWidth() - i15;
        float L = measuredHeight2 - (org.telegram.messenger.g0.L(this.L) / 2.0f);
        float L2 = (org.telegram.messenger.g0.L(this.L) / 2.0f) + measuredHeight2;
        RectF rectF = this.h0;
        rectF.set(f15, L, measuredWidth, L2);
        a(canvas2, rectF, paint);
        if (this.E > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ij, h6Var));
            f10 = 0.0f;
            rectF.set(f15, L, (this.E * (getMeasuredWidth() - i10)) + f15, L2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = this.M;
        Paint paint2 = this.d;
        if (z11) {
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
        org.telegram.ui.Cells.y yVar = this.F;
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
        float f18 = this.G;
        float f19 = L5;
        if (f18 != f19) {
            f11 = 16.0f;
            if (f18 < f19) {
                f12 = 8.0f;
                float c10 = com.google.android.recaptcha.internal.a.c(elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f18);
                this.G = c10;
                if (c10 > f19) {
                    this.G = f19;
                }
            } else {
                f12 = 8.0f;
                float v = org.telegram.messenger.camera.q.v(elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f18);
                this.G = v;
                if (v < f19) {
                    this.G = f19;
                }
            }
            z9 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z9 = false;
        }
        float f20 = this.I;
        if (f20 < 1.0f) {
            float f21 = (elapsedRealtime / 225.0f) + f20;
            this.I = f21;
            if (f21 < 1.0f) {
                z9 = true;
            } else {
                this.I = 1.0f;
            }
        }
        float f22 = this.I;
        if (f22 < 1.0f) {
            float interpolation = 1.0f - js.c.getInterpolation(Math.min(1.0f, f22 * 3.0f));
            float interpolation2 = js.d.getInterpolation(this.I);
            if (interpolation > f10) {
                canvas2.drawCircle(i15 + this.J, (i12 / 2) + i13, this.G * interpolation, paint2);
            }
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.G * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.G, paint2);
        }
        ArrayList arrayList = this.T;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.T.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.T.get(size)).first).floatValue() - 0.001f <= progress) {
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.b0 == null) {
                this.b0 = new StaticLayout[2];
            }
            float L6 = (this.V > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0) + f15;
            float abs = Math.abs(L6 - ((getMeasuredWidth() - f15) - (this.V > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0))) - org.telegram.messenger.g0.L(66.0f);
            float f23 = this.g0;
            if (f23 > f10 && Math.abs(f23 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.b0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.b0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.g0 = abs;
            if (size != this.a0) {
                StaticLayout[] staticLayoutArr3 = this.b0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.x) {
                    org.telegram.messenger.g0.c4(this);
                }
                if (size < 0 || size >= this.T.size()) {
                    this.b0[0] = null;
                } else {
                    CharSequence charSequence = (CharSequence) ((Pair) this.T.get(size)).second;
                    if (charSequence == null) {
                        this.b0[0] = null;
                    } else {
                        this.b0[0] = b((int) abs, charSequence);
                    }
                }
                this.d0 = f10;
                if (size == -1) {
                    this.e0 = -1;
                } else {
                    int i16 = this.a0;
                    if (i16 == -1) {
                        this.e0 = 1;
                    } else if (size < i16) {
                        this.e0 = -1;
                    } else if (size > i16) {
                        this.e0 = 1;
                    }
                }
                this.a0 = size;
            }
            if (this.d0 < 1.0f) {
                this.d0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f0)) / (this.T.size() > 8 ? 160.0f : 220.0f)) + this.d0, 1.0f);
                invalidate();
                this.f0 = SystemClock.elapsedRealtime();
            }
            if (this.W < 1.0f) {
                this.W = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f0)) / 200.0f) + this.W, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = wq.f.getInterpolation(this.d0);
            canvas2.save();
            canvas2.translate(L6 + org.telegram.messenger.g0.L(25.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            this.c0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, h6Var));
            if (this.b0[1] != null) {
                canvas2.save();
                if (this.e0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((org.telegram.messenger.g0.L(f11) * (-this.e0) * interpolation3) + org.telegram.messenger.g0.L(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.b0[1].getHeight()) / 2.0f);
                this.c0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.W));
                canvas2.restore();
            }
            if (this.b0[0] != null) {
                canvas2.save();
                if (this.e0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation3, org.telegram.messenger.g0.L(f11) * this.e0, org.telegram.messenger.g0.L(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.b0[0].getHeight()) / 2.0f);
                this.c0.setAlpha((int) (interpolation3 * 255.0f * this.W));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z9) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2);
        s7 s7Var = this.O;
        int measuredHeight = (s7Var.getMeasuredHeight() / 2) + L;
        int L2 = org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(25.0f) + (this.f / 2) + (this.V > 600000 ? org.telegram.messenger.g0.L(42.0f) : 0);
        s7Var.layout(L2, measuredHeight - s7Var.getMeasuredHeight(), s7Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.j0 = timestampLabelWidth;
        this.O.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
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
        this.E = f10;
        invalidate();
    }

    public void setDelegate(lm0 lm0Var) {
        this.y = lm0Var;
    }

    public void setInnerColor(int i7) {
        this.c.setColor(i7);
    }

    public void setLineWidth(int i7) {
        this.L = i7;
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
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            org.telegram.ui.ActionBar.m6.H1(yVar, i0.a.o(i7, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(false, f10);
    }

    public void setReportChanges(boolean z9) {
        this.D = z9;
    }

    public void setSeparatorsCount(int i7) {
        this.K = i7;
    }

    public void setTwoSided(boolean z9) {
        this.M = z9;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint == null || paint.getColor() != this.a || (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.N)) == this.a) {
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
        return super.verifyDrawable(drawable) || drawable == this.F;
    }

    public mm0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        this.n = new v5(this, 0L, 60L, wq.g);
        this.s = -100.0f;
        this.w = -1.0f;
        this.H = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.I = 1.0f;
        this.L = 3;
        this.W = 0.0f;
        this.a0 = -1;
        this.d0 = 1.0f;
        this.g0 = -1.0f;
        this.h0 = new RectF();
        this.i0 = -1;
        this.N = h6Var;
        setWillNotDraw(false);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i7 = org.telegram.ui.ActionBar.m6.Jj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.a = w02;
        paint.setColor(w02);
        this.f = org.telegram.messenger.g0.L(32.0f);
        this.e = org.telegram.messenger.g0.L(24.0f);
        this.G = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), 40), 1, org.telegram.messenger.g0.L(16.0f));
        this.F = h02;
        h02.setCallback(this);
        h02.setVisible(true, false);
        s7 s7Var = new s7(this, context, context, 2);
        this.O = s7Var;
        s7Var.y = true;
        addView(s7Var, c8.ha.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(this, z9);
        this.b = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
