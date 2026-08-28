package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k71 extends View {
    public j71 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public nz0 e;
    public boolean f;
    public ho0 h;
    public final y5 n;
    public final /* synthetic */ m71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(m71 m71Var, Context context) {
        super(context);
        this.r = m71Var;
        this.c = new RectF();
        this.n = new y5(this, 360L, gr.h);
    }

    @Override // android.view.View
    public int getId() {
        return this.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        CharSequence charSequence;
        nz0 nz0Var;
        Canvas canvas2;
        int i17;
        int i18;
        int i19;
        int i20;
        m71 m71Var = this.r;
        TextPaint textPaint = m71Var.d;
        TextPaint textPaint2 = m71Var.e;
        Paint paint = m71Var.f;
        org.telegram.ui.ActionBar.b6 b6Var = m71Var.f0;
        TextPaint textPaint3 = m71Var.c;
        canvas.save();
        float e10 = this.n.e(this.f);
        if (e10 > 0.0f) {
            if (this.h == null) {
                this.h = new ho0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e10);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i21 = this.a.a;
        if (i21 != Integer.MAX_VALUE) {
            int i22 = m71.o0;
        }
        int i23 = m71Var.I;
        if (i23 != -1) {
            i10 = m71Var.C;
            i9 = i23;
        } else {
            i9 = m71Var.C;
            i10 = m71Var.d0;
        }
        if (i21 == i9) {
            i11 = m71Var.M;
            f10 = 0.0f;
            i12 = m71Var.N;
            i13 = org.telegram.ui.ActionBar.f6.T9;
            i14 = org.telegram.ui.ActionBar.f6.U9;
        } else {
            f10 = 0.0f;
            i11 = m71Var.N;
            i12 = m71Var.M;
            i13 = org.telegram.ui.ActionBar.f6.U9;
            i14 = org.telegram.ui.ActionBar.f6.T9;
        }
        if (m71Var.A == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.f6.v0(m71Var.N, b6Var));
        } else if ((m71Var.F || i23 != -1) && (i21 == i9 || i21 == i10)) {
            textPaint3.setColor(i0.a.d(m71Var.G, org.telegram.ui.ActionBar.f6.v0(i12, b6Var), org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (m71Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i24 = m71.o0;
                i15 = (int) ((dp * f10) + 0);
                int i25 = this.a.c;
                if (i15 == 0) {
                    int i26 = m71.o0;
                    i16 = AndroidUtilities.dp(f10) + i15;
                } else {
                    i16 = 0;
                }
                this.b = i25 + i16;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence != null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
                    j71 j71Var = this.a;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(j71Var.b, textPaint3.getFontMetricsInt(), false);
                    j71Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    nz0 nz0Var2 = this.e;
                    if (nz0Var2 != null) {
                        t5.release(nz0Var2.j, nz0Var2.k);
                    }
                    nz0 nz0Var3 = new nz0(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    nz0Var3.s(this);
                    this.e = nz0Var3;
                }
                nz0Var = this.e;
                if (nz0Var == null) {
                    nz0Var.p = AndroidUtilities.dp(400.0f);
                    i19 = i10;
                    i18 = i9;
                    i17 = measuredWidth;
                    nz0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i17 = measuredWidth;
                    i18 = i9;
                    i19 = i10;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (m71Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(m71Var.P, b6Var));
                        if (org.telegram.ui.ActionBar.f6.c1(i13) && org.telegram.ui.ActionBar.f6.c1(i14)) {
                            int v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
                            if ((m71Var.F || m71Var.H != -1) && ((i20 = this.a.a) == i18 || i20 == i19)) {
                                paint.setColor(i0.a.d(m71Var.G, org.telegram.ui.ActionBar.f6.v0(i14, b6Var), v02));
                            } else {
                                paint.setColor(v02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i17 + this.a.c;
                        int y10 = org.telegram.messenger.ll.y(20.0f, getMeasuredHeight(), 2);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (m71Var.n) {
                                int i27 = m71.o0;
                                paint.setAlpha((int) 0.0f);
                                float dp3 = AndroidUtilities.dp(20.0f) + y10;
                                RectF rectF = this.c;
                                rectF.set(dp2, y10, dp2 + i15, dp3);
                                float f11 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f11, f11, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (m71Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i28 = m71.o0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i29 = m71.o0;
                                    }
                                }
                            } else {
                                int i30 = m71.o0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + y10;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, y10, dp2 + i15, dp32);
                        float f112 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f112, f112, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i31 = m71.o0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i32 = m71.o0;
                }
                canvas.restore();
            }
            int i33 = m71.o0;
        }
        i15 = 0;
        int i252 = this.a.c;
        if (i15 == 0) {
        }
        this.b = i252 + i16;
        int measuredWidth2 = (getMeasuredWidth() - this.b) / 2;
        charSequence = this.a.b;
        if (charSequence != null) {
        }
        nz0Var = this.e;
        if (nz0Var == null) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j71 j71Var = this.a;
        accessibilityNodeInfo.setSelected((j71Var == null || (i9 = this.r.C) == -1 || j71Var.a != i9) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        j71 j71Var = this.a;
        m71 m71Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(m71Var.r * 2) + j71Var.a(m71Var.c) + m71Var.E, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
