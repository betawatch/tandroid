package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gf extends mg {
    public boolean g2;
    public final Paint h2;
    public LinearGradient i2;
    public final Matrix j2;
    public float k2;
    public float l2;
    public boolean m2;
    public final /* synthetic */ ChatActivityEnterView n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(chatActivityEnterView, context, h6Var);
        this.n2 = chatActivityEnterView;
        this.g2 = true;
        this.h2 = new Paint();
        this.j2 = new Matrix();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.n2;
        View view = chatActivityEnterView.j6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar == null || bnVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.F3.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.E3.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.F3.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.ot, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        ai.o1 o1Var;
        float f12;
        Canvas canvas2;
        ChatActivityEnterView chatActivityEnterView;
        boolean z10;
        int i7;
        float f13;
        LinearGradient linearGradient;
        float f14;
        float f15;
        LinearGradient linearGradient2;
        ChatActivityEnterView chatActivityEnterView2 = this.n2;
        boolean z11 = chatActivityEnterView2.F1 && getScrollY() > 0 && getLayout() != null;
        int i10 = -1;
        int saveLayer = z11 ? canvas.saveLayer(-org.telegram.messenger.g0.L(4.0f), getScrollY() - org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(4.0f) + getWidth(), org.telegram.messenger.g0.L(48.0f) + getHeight() + getScrollY(), null) : -1;
        ai.o1 o1Var2 = chatActivityEnterView2.o6;
        if (o1Var2 == null || !o1Var2.d) {
            ai.p0 p0Var = chatActivityEnterView2.j1;
            o1Var2 = p0Var != null ? p0Var.a : null;
        }
        boolean z12 = (o1Var2 == null || !o1Var2.d || getLayout() == null) ? false : true;
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z12) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            o1Var2.getClass();
            f10 = 48.0f;
            f11 = 4.0f;
            f12 = offsetY;
            o1Var = o1Var2;
            canvas2 = canvas;
            i10 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), height + offsetY + org.telegram.messenger.g0.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f10 = 48.0f;
            f11 = 4.0f;
            o1Var = o1Var2;
            f12 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z12) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            int[] iArr = o1Var.A;
            EditText editText = o1Var.b;
            LinearGradient linearGradient3 = o1Var.r;
            float f16 = o1Var.B;
            LinearGradient linearGradient4 = o1Var.s;
            Paint paint = o1Var.q;
            LinearGradient linearGradient5 = o1Var.t;
            z10 = z11;
            Paint paint2 = o1Var.p;
            chatActivityEnterView = chatActivityEnterView2;
            yu0 yu0Var = o1Var.c;
            if (o1Var.I) {
                i7 = saveLayer;
                linearGradient = linearGradient3;
            } else {
                o1Var.I = true;
                i7 = saveLayer;
                linearGradient = linearGradient3;
                if (o1Var.D) {
                    o1Var.e = SystemClock.uptimeMillis();
                }
                Runnable runnable = o1Var.H;
                o1Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
            float uptimeMillis = (SystemClock.uptimeMillis() - o1Var.e) / 1000.0f;
            float d = o1Var.d(uptimeMillis);
            float d2 = o1Var.d(uptimeMillis - o1Var.F);
            float f17 = -org.telegram.messenger.g0.L(8.0f);
            float f18 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f12);
            if (o1Var.C) {
                float d10 = o1Var.d(uptimeMillis - 0.28f);
                f14 = totalPaddingLeft;
                f15 = L2;
                o1Var.e(linearGradient5, d10, Math.max(d10 + 1.0f, o1Var.d(uptimeMillis - 0.12f)));
                float f19 = uptimeMillis - (o1Var.a / 1000.0f);
                paint.setAlpha(f19 <= 0.0f ? org.telegram.messenger.ls.e4 : (int) (Math.max(0.0f, 1.0f - (f19 / 0.18f)) * 255.0f));
            } else {
                f14 = totalPaddingLeft;
                f15 = L2;
                o1Var.e(linearGradient5, d2 - org.telegram.messenger.g0.L(f10), d2);
            }
            paint.setShader(linearGradient5);
            float f20 = f14;
            f13 = 1.0f;
            float f21 = f15;
            float f22 = f12;
            canvas.drawRect(f17, f18, L, f21, paint);
            if (o1Var.C) {
                float f23 = o1Var.E;
                o1Var.e(linearGradient4, d - f23, f23 + d);
            } else {
                o1Var.e(linearGradient4, d2 - f16, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f17, f18, L, f21, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i10);
            editText.getLocationInWindow(iArr);
            o1Var.z = o1Var.y - ((editText instanceof rt ? ((rt) editText).getOffsetY() : 0.0f) + ((editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY()));
            canvas2.save();
            canvas2.translate(f20, f22 + o1Var.z);
            if (o1Var.h != null) {
                if (d - (o1Var.C ? o1Var.E : f16) < o1Var.g) {
                    int saveLayer2 = canvas2.saveLayer(f17, o1Var.w - org.telegram.messenger.g0.L(2.0f), Math.max(L, o1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + o1Var.w + o1Var.x, null);
                    canvas2.drawBitmap(o1Var.h, 0.0f, 0.0f, o1Var.o);
                    if (o1Var.C) {
                        float f24 = o1Var.E;
                        linearGradient2 = linearGradient;
                        o1Var.e(linearGradient2, d - f24, f24 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        o1Var.e(linearGradient2, d, d + f16);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f17, f18, Math.max(L, o1Var.h.getWidth()), Math.max(f21, org.telegram.messenger.g0.L(40.0f) + o1Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer2);
                }
            }
            float f25 = org.telegram.messenger.g0.p;
            float max = Math.max(0.05f, (o1Var.a - (SystemClock.uptimeMillis() - o1Var.e)) / 1000.0f);
            while (true) {
                int i11 = o1Var.m;
                if (i11 >= o1Var.k) {
                    break;
                }
                float[] fArr = o1Var.i;
                int i12 = i11 * 3;
                if (fArr[i12 + 2] > d) {
                    break;
                }
                o1Var.m = i11 + 1;
                if (!o1Var.C) {
                    yu0Var.g(fArr[i12], fArr[i12 + 1], ((yu0Var.d() * 34.0f) + 10.0f) * f25, (-((yu0Var.d() * 20.0f) + 6.0f)) * f25, Math.min(max, (yu0Var.d() * 0.3f) + 0.26f), 0.0f);
                } else if (yu0Var.d() >= 0.45f) {
                    float[] fArr2 = o1Var.i;
                    yu0Var.g(fArr2[i12], fArr2[i12 + 1], ((yu0Var.d() * 60.0f) + 26.0f) * f25, (-((yu0Var.d() * 44.0f) + 10.0f)) * f25, Math.min(max, (yu0Var.d() * 0.14f) + 0.12f), 0.0f);
                }
            }
            while (true) {
                int i13 = o1Var.n;
                if (i13 >= o1Var.l) {
                    break;
                }
                float[] fArr3 = o1Var.j;
                int i14 = i13 * 3;
                if (fArr3[i14 + 2] > d) {
                    break;
                }
                float f26 = fArr3[i14];
                int i15 = i14 + 1;
                float f27 = fArr3[i15] - o1Var.z;
                o1Var.n = i13 + 1;
                float scrollY = editText.getScrollY();
                if (o1Var.j[i15] >= scrollY - org.telegram.messenger.g0.L(2.0f) && o1Var.j[i15] <= scrollY + o1Var.x + org.telegram.messenger.g0.L(2.0f)) {
                    yu0Var.h((((yu0Var.d() * 16.0f) + 6.0f) * f25) + f26, ((yu0Var.d() - 0.5f) * 14.0f * f25) + f27, f26, f27, Math.min(max, (yu0Var.d() * 0.08f) + o1Var.F + 0.04f));
                }
            }
            yu0Var.b(canvas2, 1.0f);
            canvas2.restore();
            if (uptimeMillis * 1000.0f >= o1Var.a + (o1Var.C ? 180.0f : 0.0f)) {
                o1Var.c();
            } else {
                editText.invalidate();
            }
        } else {
            chatActivityEnterView = chatActivityEnterView2;
            z10 = z11;
            i7 = saveLayer;
            f13 = 1.0f;
        }
        if (z10) {
            LinearGradient linearGradient6 = this.i2;
            Paint paint3 = this.h2;
            if (linearGradient6 == null) {
                LinearGradient linearGradient7 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -1291845632, 0}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
                this.i2 = linearGradient7;
                paint3.setShader(linearGradient7);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - org.telegram.messenger.g0.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.j2;
            matrix.setScale(f13, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.i2.setLocalMatrix(matrix);
            canvas2.drawRect(-org.telegram.messenger.g0.L(f11), getScrollY() - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i7);
        }
        if (getLayout() == null || !this.g2) {
            return;
        }
        this.g2 = false;
        chatActivityEnterView.P(true);
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.ot, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.n2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.T1((chatActivityEnterView.F0.getLineCount() <= 2 || chatActivityEnterView.F0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.Z1(z10);
        }
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.ot, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.n2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = oi.b4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (oi.a5.d(z10, hashMap)) {
                                    org.telegram.messenger.np.u1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.s2.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.l1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.a5.f(z10, false));
                                org.telegram.messenger.j6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                                if (y5VarArr != null) {
                                    for (y5 y5Var : y5VarArr) {
                                        y5Var.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), p5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                ih0[] ih0VarArr = (ih0[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, ih0.class);
                                if (ih0VarArr == null || ih0VarArr.length <= 0) {
                                    jh0.a(spannableStringBuilder);
                                } else {
                                    ih0[] ih0VarArr2 = (ih0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih0.class);
                                    for (int i10 = 0; i10 < ih0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(ih0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(ih0VarArr2[i10].a);
                                    }
                                }
                                gf gfVar = chatActivityEnterView.F0;
                                gfVar.setText(gfVar.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.F0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.F0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.n2;
        if (!chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.P3 != null) {
                org.telegram.ui.ActionBar.t6.l(this, 36, org.telegram.ui.ActionBar.m6.mg, chatActivityEnterView.M4);
                chatActivityEnterView.P3.o1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.k2 = motionEvent.getX();
            this.l2 = motionEvent.getY();
            this.m2 = true;
        } else if (this.m2 && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.k2) > org.telegram.messenger.g0.e || Math.abs(motionEvent.getY() - this.l2) > org.telegram.messenger.g0.e) {
                this.m2 = false;
            }
        } else if (this.m2) {
            if (chatActivityEnterView.P3 != null) {
                org.telegram.ui.ActionBar.t6.l(this, 36, org.telegram.ui.ActionBar.m6.mg, chatActivityEnterView.M4);
                chatActivityEnterView.P3.o1();
            }
            gf gfVar = chatActivityEnterView.F0;
            if (gfVar != null && !org.telegram.messenger.g0.I3(gfVar)) {
                chatActivityEnterView.F0.clearFocus();
                chatActivityEnterView.F0.requestFocus();
            }
        }
        return this.m2;
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.rt
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.n2.o2.invalidate();
    }
}
