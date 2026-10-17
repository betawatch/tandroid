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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class pf extends ng {
    public boolean e;
    public float f;
    public float h;
    public boolean n;
    public final /* synthetic */ ChatActivityEnterView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(chatActivityEnterView, context, d6Var);
        this.r = chatActivityEnterView;
        this.e = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.r;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar == null || snVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.iu, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.e) {
            return;
        }
        this.e = false;
        this.r.I(true);
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.iu, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.n1((chatActivityEnterView.E0.getLineCount() <= 2 || chatActivityEnterView.E0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.t1(z10);
        }
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.iu, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.r;
            if (chatActivityEnterView.E0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = ki.d4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (!ki.c5.f(z10, hashMap)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ki.c5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    a6[] a6VarArr = (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class);
                                    if (a6VarArr != null) {
                                        for (a6 a6Var : a6VarArr) {
                                            a6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), r5.g());
                                        }
                                    }
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    oj0[] oj0VarArr = (oj0[]) chatActivityEnterView.E0.getText().getSpans(max, min, oj0.class);
                                    if (oj0VarArr == null || oj0VarArr.length <= 0) {
                                        pj0.a(spannableStringBuilder);
                                    } else {
                                        oj0[] oj0VarArr2 = (oj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oj0.class);
                                        for (int i11 = 0; i11 < oj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(oj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(oj0VarArr2[i11].a);
                                        }
                                    }
                                    pf pfVar = chatActivityEnterView.E0;
                                    pfVar.setText(pfVar.getText().replace(max, min, spannableStringBuilder));
                                    chatActivityEnterView.E0.setSelection(Math.min(max + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
                                    return true;
                                }
                                if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    chatActivityEnterView.I0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max2, min2)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max2, min2), chatActivityEnterView.E0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (!chatActivityEnterView.t()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
                int i10 = org.telegram.ui.ActionBar.h6.vf;
                int i11 = ChatActivityEnterView.n5;
                setHandlesColor(chatActivityEnterView.g0(i10));
                chatActivityEnterView.Z2.m1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f = motionEvent.getX();
            this.h = motionEvent.getY();
            this.n = true;
        } else if (this.n && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                this.n = false;
            }
        } else if (this.n) {
            if (chatActivityEnterView.Z2 != null) {
                int i12 = org.telegram.ui.ActionBar.h6.vf;
                int i13 = ChatActivityEnterView.n5;
                setHandlesColor(chatActivityEnterView.g0(i12));
                chatActivityEnterView.Z2.m1();
            }
            pf pfVar = chatActivityEnterView.E0;
            if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                chatActivityEnterView.E0.clearFocus();
                chatActivityEnterView.E0.requestFocus();
            }
        }
        return this.n;
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.ku
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.r.y1.invalidate();
    }
}
