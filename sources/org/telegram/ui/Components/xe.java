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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class xe extends vf {
    public boolean a2;
    public float b2;
    public float c2;
    public boolean d2;
    public final /* synthetic */ ChatActivityEnterView e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.e2 = chatActivityEnterView;
        this.a2 = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.dt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.e2;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar == null || anVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.zs, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.dt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.a2) {
            return;
        }
        this.a2 = false;
        this.e2.E(true);
    }

    @Override // org.telegram.ui.Components.vf, org.telegram.ui.Components.zs, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.e2;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z9 = false;
            chatActivityEnterView.p1((chatActivityEnterView.E0.getLineCount() <= 2 || chatActivityEnterView.E0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z9 = true;
            }
            chatActivityEnterView.v1(z9);
        }
    }

    @Override // org.telegram.ui.Components.vf, org.telegram.ui.Components.zs, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.e2;
            if (chatActivityEnterView.E0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z9 = li.b4.z(htmlText, hashMap);
                            if (!z9.isEmpty()) {
                                if (li.a5.d(z9, hashMap)) {
                                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                                    boolean z10 = org.telegram.messenger.r2.a;
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    chatActivityEnterView.K0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.a5.f(z9, false));
                                org.telegram.messenger.i6.m(spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, null, 0);
                                r5[] r5VarArr = (r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r5.class);
                                if (r5VarArr != null) {
                                    for (r5 r5Var : r5VarArr) {
                                        r5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), i5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                tg0[] tg0VarArr = (tg0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, tg0.class);
                                if (tg0VarArr == null || tg0VarArr.length <= 0) {
                                    ug0.a(spannableStringBuilder);
                                } else {
                                    tg0[] tg0VarArr2 = (tg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tg0.class);
                                    for (int i10 = 0; i10 < tg0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(tg0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(tg0VarArr2[i10].a);
                                    }
                                }
                                xe xeVar = chatActivityEnterView.E0;
                                xeVar.setText(xeVar.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.E0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
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

    @Override // org.telegram.ui.Components.vf, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.e2;
        if (!chatActivityEnterView.s()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
                org.telegram.ui.ActionBar.r6.m(this, 36, org.telegram.ui.ActionBar.k6.jg, chatActivityEnterView.W3);
                chatActivityEnterView.Z2.f1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.b2 = motionEvent.getX();
            this.c2 = motionEvent.getY();
            this.d2 = true;
        } else if (this.d2 && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.b2) > org.telegram.messenger.g0.e || Math.abs(motionEvent.getY() - this.c2) > org.telegram.messenger.g0.e) {
                this.d2 = false;
            }
        } else if (this.d2) {
            if (chatActivityEnterView.Z2 != null) {
                org.telegram.ui.ActionBar.r6.m(this, 36, org.telegram.ui.ActionBar.k6.jg, chatActivityEnterView.W3);
                chatActivityEnterView.Z2.f1();
            }
            xe xeVar = chatActivityEnterView.E0;
            if (xeVar != null && !org.telegram.messenger.g0.K3(xeVar)) {
                chatActivityEnterView.E0.clearFocus();
                chatActivityEnterView.E0.requestFocus();
            }
        }
        return this.d2;
    }

    @Override // org.telegram.ui.Components.vf, org.telegram.ui.Components.dt
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.e2.y1.invalidate();
    }
}
