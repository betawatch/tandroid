package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xe extends bg {
    public boolean g2;
    public float h2;
    public float i2;
    public boolean j2;
    public final /* synthetic */ ChatActivityEnterView k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(chatActivityEnterView, context, e6Var);
        this.k2 = chatActivityEnterView;
        this.g2 = true;
        new Paint();
        new Matrix();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.k2;
        View view = chatActivityEnterView.b6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar == null || anVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.x3.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.w3.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.x3.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.ft, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2 = this.k2;
        ai.m0 m0Var = chatActivityEnterView2.j1;
        ai.k1 k1Var = m0Var != null ? m0Var.a : null;
        boolean z10 = (k1Var == null || !k1Var.d || getLayout() == null) ? false : true;
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z10) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            k1Var.getClass();
            canvas2 = canvas;
            i7 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f) + height + offsetY, null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        super.onDraw(canvas);
        if (z10) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            LinearGradient linearGradient = k1Var.r;
            EditText editText = k1Var.b;
            int[] iArr = k1Var.A;
            LinearGradient linearGradient2 = k1Var.s;
            Paint paint = k1Var.q;
            LinearGradient linearGradient3 = k1Var.t;
            float f10 = k1Var.B;
            nu0 nu0Var = k1Var.c;
            Paint paint2 = k1Var.p;
            int i10 = i7;
            if (!k1Var.D) {
                k1Var.D = true;
                ai.e0 e0Var = k1Var.C;
                k1Var.C = null;
                if (e0Var != null) {
                    e0Var.run();
                }
            }
            float uptimeMillis = (SystemClock.uptimeMillis() - k1Var.e) / 1000.0f;
            float b10 = k1Var.b(uptimeMillis);
            float b11 = k1Var.b(uptimeMillis - 0.06f);
            float f11 = -org.telegram.messenger.g0.L(8.0f);
            float f12 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, offsetY);
            k1Var.c(linearGradient3, b11 - org.telegram.messenger.g0.L(48.0f), b11);
            paint.setShader(linearGradient3);
            chatActivityEnterView = chatActivityEnterView2;
            canvas.drawRect(f11, f12, L, L2, paint);
            k1Var.c(linearGradient2, b11 - f10, b11);
            paint2.setShader(linearGradient2);
            canvas.drawRect(f11, f12, L, L2, paint2);
            canvas.restore();
            canvas.restoreToCount(i10);
            editText.getLocationInWindow(iArr);
            k1Var.z = k1Var.y - ((editText instanceof kt ? ((kt) editText).getOffsetY() : 0.0f) + ((editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY()));
            canvas.save();
            canvas.translate(totalPaddingLeft, offsetY + k1Var.z);
            if (k1Var.h != null && b10 - f10 < k1Var.g) {
                int saveLayer = canvas.saveLayer(f11, k1Var.w - org.telegram.messenger.g0.L(2.0f), Math.max(L, k1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + k1Var.w + k1Var.x, null);
                canvas.drawBitmap(k1Var.h, 0.0f, 0.0f, k1Var.o);
                k1Var.c(linearGradient, b10, b10 + f10);
                paint2.setShader(linearGradient);
                canvas.drawRect(f11, f12, Math.max(L, k1Var.h.getWidth()), Math.max(L2, org.telegram.messenger.g0.L(40.0f) + k1Var.h.getHeight()), paint2);
                canvas.restoreToCount(saveLayer);
            }
            float f13 = org.telegram.messenger.g0.p;
            float max = Math.max(0.05f, (k1Var.a - (SystemClock.uptimeMillis() - k1Var.e)) / 1000.0f);
            while (true) {
                int i11 = k1Var.m;
                if (i11 >= k1Var.k) {
                    break;
                }
                float[] fArr = k1Var.i;
                int i12 = i11 * 3;
                if (fArr[i12 + 2] > b10) {
                    break;
                }
                nu0Var.g(fArr[i12], fArr[i12 + 1], ((nu0Var.d() * 34.0f) + 10.0f) * f13, (-((nu0Var.d() * 20.0f) + 6.0f)) * f13, Math.min(max, (nu0Var.d() * 0.3f) + 0.26f), 0.0f);
                k1Var.m++;
            }
            while (true) {
                int i13 = k1Var.n;
                if (i13 >= k1Var.l) {
                    break;
                }
                float[] fArr2 = k1Var.j;
                int i14 = i13 * 3;
                if (fArr2[i14 + 2] > b10) {
                    break;
                }
                float f14 = fArr2[i14];
                int i15 = i14 + 1;
                float f15 = fArr2[i15] - k1Var.z;
                k1Var.n = i13 + 1;
                float scrollY = editText.getScrollY();
                if (k1Var.j[i15] >= scrollY - org.telegram.messenger.g0.L(2.0f) && k1Var.j[i15] <= scrollY + k1Var.x + org.telegram.messenger.g0.L(2.0f)) {
                    nu0Var.h((((nu0Var.d() * 16.0f) + 6.0f) * f13) + f14, ((nu0Var.d() - 0.5f) * 14.0f * f13) + f15, f14, f15, Math.min(max, (nu0Var.d() * 0.08f) + 0.099999994f));
                }
            }
            nu0Var.b(canvas, 1.0f);
            canvas.restore();
            if (uptimeMillis * 1000.0f >= k1Var.a) {
                k1Var.a();
            } else {
                editText.invalidate();
            }
        } else {
            chatActivityEnterView = chatActivityEnterView2;
        }
        if (getLayout() == null || !this.g2) {
            return;
        }
        this.g2 = false;
        chatActivityEnterView.N(true);
    }

    @Override // org.telegram.ui.Components.bg, org.telegram.ui.Components.ft, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.k2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.H1((chatActivityEnterView.F0.getLineCount() <= 2 || chatActivityEnterView.F0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.N1(z10);
        }
    }

    @Override // org.telegram.ui.Components.bg, org.telegram.ui.Components.ft, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.k2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = oi.y3.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (oi.y4.d(z10, hashMap)) {
                                    org.telegram.messenger.np.s1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.r2.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.Z0(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.y4.f(z10, false));
                                org.telegram.messenger.j6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class);
                                if (p5VarArr != null) {
                                    for (p5 p5Var : p5VarArr) {
                                        p5Var.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), g5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                wg0[] wg0VarArr = (wg0[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, wg0.class);
                                if (wg0VarArr == null || wg0VarArr.length <= 0) {
                                    xg0.a(spannableStringBuilder);
                                } else {
                                    wg0[] wg0VarArr2 = (wg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg0.class);
                                    for (int i10 = 0; i10 < wg0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(wg0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(wg0VarArr2[i10].a);
                                    }
                                }
                                xe xeVar = chatActivityEnterView.F0;
                                xeVar.setText(xeVar.getText().replace(max2, min2, spannableStringBuilder));
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

    @Override // org.telegram.ui.Components.bg, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.k2;
        if (!chatActivityEnterView.y()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.H3 != null) {
                org.telegram.ui.ActionBar.q6.l(this, 36, org.telegram.ui.ActionBar.j6.mg, chatActivityEnterView.E4);
                chatActivityEnterView.H3.o1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.h2 = motionEvent.getX();
            this.i2 = motionEvent.getY();
            this.j2 = true;
        } else if (this.j2 && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.h2) > org.telegram.messenger.g0.e || Math.abs(motionEvent.getY() - this.i2) > org.telegram.messenger.g0.e) {
                this.j2 = false;
            }
        } else if (this.j2) {
            if (chatActivityEnterView.H3 != null) {
                org.telegram.ui.ActionBar.q6.l(this, 36, org.telegram.ui.ActionBar.j6.mg, chatActivityEnterView.E4);
                chatActivityEnterView.H3.o1();
            }
            xe xeVar = chatActivityEnterView.F0;
            if (xeVar != null && !org.telegram.messenger.g0.J3(xeVar)) {
                chatActivityEnterView.F0.clearFocus();
                chatActivityEnterView.F0.requestFocus();
            }
        }
        return this.j2;
    }

    @Override // org.telegram.ui.Components.bg, org.telegram.ui.Components.kt
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.k2.g2.invalidate();
    }
}
