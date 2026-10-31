package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class se extends rf {
    public boolean a2;
    public float b2;
    public float c2;
    public boolean d2;
    public final /* synthetic */ ChatActivityEnterView e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(chatActivityEnterView, context, p6Var);
        this.e2 = chatActivityEnterView;
        this.a2 = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.e2;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar == null || unVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.a2) {
            return;
        }
        this.a2 = false;
        this.e2.F(true);
    }

    @Override // org.telegram.ui.Components.rf, org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.e2;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.n1((chatActivityEnterView.E0.getLineCount() <= 2 || chatActivityEnterView.E0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.t1(z10);
        }
    }

    @Override // org.telegram.ui.Components.rf, org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.e2;
            if (chatActivityEnterView.E0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = bi.l4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (bi.n5.d(z10, hashMap)) {
                                    org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
                                    boolean z11 = org.telegram.messenger.v2.a;
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    chatActivityEnterView.I0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bi.n5.f(z10, false));
                                org.telegram.messenger.k6.m(spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, null, 0);
                                o5[] o5VarArr = (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class);
                                if (o5VarArr != null) {
                                    for (o5 o5Var : o5VarArr) {
                                        o5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), f5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                vh0[] vh0VarArr = (vh0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, vh0.class);
                                if (vh0VarArr == null || vh0VarArr.length <= 0) {
                                    wh0.a(spannableStringBuilder);
                                } else {
                                    vh0[] vh0VarArr2 = (vh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vh0.class);
                                    for (int i11 = 0; i11 < vh0VarArr2.length; i11++) {
                                        spannableStringBuilder.removeSpan(vh0VarArr2[i11]);
                                        spannableStringBuilder.removeSpan(vh0VarArr2[i11].a);
                                    }
                                }
                                se seVar = chatActivityEnterView.E0;
                                seVar.setText(seVar.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.E0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.rf, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.e2;
        if (!chatActivityEnterView.r()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
                org.telegram.ui.ActionBar.a7.m(this, 36, org.telegram.ui.ActionBar.t6.jg, chatActivityEnterView.W3);
                chatActivityEnterView.Z2.b1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.b2 = motionEvent.getX();
            this.c2 = motionEvent.getY();
            this.d2 = true;
        } else if (this.d2 && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.b2) > org.telegram.messenger.i0.e || Math.abs(motionEvent.getY() - this.c2) > org.telegram.messenger.i0.e) {
                this.d2 = false;
            }
        } else if (this.d2) {
            if (chatActivityEnterView.Z2 != null) {
                org.telegram.ui.ActionBar.a7.m(this, 36, org.telegram.ui.ActionBar.t6.jg, chatActivityEnterView.W3);
                chatActivityEnterView.Z2.b1();
            }
            se seVar = chatActivityEnterView.E0;
            if (seVar != null && !org.telegram.messenger.i0.J3(seVar)) {
                chatActivityEnterView.E0.clearFocus();
                chatActivityEnterView.E0.requestFocus();
            }
        }
        return this.d2;
    }

    @Override // org.telegram.ui.Components.rf, org.telegram.ui.Components.qt
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.e2.y1.invalidate();
    }
}
