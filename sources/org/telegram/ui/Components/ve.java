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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ve extends tf {
    public boolean b2;
    public float c2;
    public float d2;
    public boolean e2;
    public final /* synthetic */ ChatActivityEnterView f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(chatActivityEnterView, context, e6Var);
        this.f2 = chatActivityEnterView;
        this.b2 = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f2;
        View view = chatActivityEnterView.K4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar == null || wmVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.Q2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.P2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.Q2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.b2) {
            return;
        }
        this.b2 = false;
        this.f2.E(true);
    }

    @Override // org.telegram.ui.Components.tf, org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.o1((chatActivityEnterView.F0.getLineCount() <= 2 || chatActivityEnterView.F0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.u1(z10);
        }
    }

    @Override // org.telegram.ui.Components.tf, org.telegram.ui.Components.xs, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        if (i3 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = mi.b4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (mi.b5.d(z10, hashMap)) {
                                    org.telegram.messenger.hp.s1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.r2.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.J0(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mi.b5.f(z10, false));
                                org.telegram.messenger.i6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
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
                                ve veVar = chatActivityEnterView.F0;
                                veVar.setText(veVar.getText().replace(max2, min2, spannableStringBuilder));
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
        return super.onTextContextMenuItem(i3);
    }

    @Override // org.telegram.ui.Components.tf, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.s()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.a3 != null) {
                org.telegram.ui.ActionBar.r6.m(this, 36, org.telegram.ui.ActionBar.k6.jg, chatActivityEnterView.X3);
                chatActivityEnterView.a3.e1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.c2 = motionEvent.getX();
            this.d2 = motionEvent.getY();
            this.e2 = true;
        } else if (this.e2 && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.c2) > org.telegram.messenger.g0.e || Math.abs(motionEvent.getY() - this.d2) > org.telegram.messenger.g0.e) {
                this.e2 = false;
            }
        } else if (this.e2) {
            if (chatActivityEnterView.a3 != null) {
                org.telegram.ui.ActionBar.r6.m(this, 36, org.telegram.ui.ActionBar.k6.jg, chatActivityEnterView.X3);
                chatActivityEnterView.a3.e1();
            }
            ve veVar = chatActivityEnterView.F0;
            if (veVar != null && !org.telegram.messenger.g0.K3(veVar)) {
                chatActivityEnterView.F0.clearFocus();
                chatActivityEnterView.F0.requestFocus();
            }
        }
        return this.e2;
    }

    @Override // org.telegram.ui.Components.tf, org.telegram.ui.Components.bt
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f2.z1.invalidate();
    }
}
