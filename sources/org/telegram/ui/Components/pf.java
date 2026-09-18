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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pf extends mg {
    public boolean e;
    public float f;
    public float h;
    public boolean n;
    public final /* synthetic */ ChatActivityEnterView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(chatActivityEnterView, context, e6Var);
        this.r = chatActivityEnterView;
        this.e = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.r;
        View view = chatActivityEnterView.I4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.zn znVar = chatActivityEnterView.O2;
        if (znVar == null || znVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.O2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.N2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.bu, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.e) {
            return;
        }
        this.e = false;
        this.r.K(true);
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.bu, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.o1((chatActivityEnterView.E0.getLineCount() <= 2 || chatActivityEnterView.E0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.u1(z10);
        }
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.bu, android.widget.EditText, android.widget.TextView
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
                            ArrayList z10 = ii.d4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (!ii.c5.f(z10, hashMap)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.c5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                                    if (z5VarArr != null) {
                                        for (z5 z5Var : z5VarArr) {
                                            z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                        }
                                    }
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    cj0[] cj0VarArr = (cj0[]) chatActivityEnterView.E0.getText().getSpans(max, min, cj0.class);
                                    if (cj0VarArr == null || cj0VarArr.length <= 0) {
                                        dj0.a(spannableStringBuilder);
                                    } else {
                                        cj0[] cj0VarArr2 = (cj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cj0.class);
                                        for (int i11 = 0; i11 < cj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(cj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(cj0VarArr2[i11].a);
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
                                    chatActivityEnterView.K0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max2, min2)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max2, min2), chatActivityEnterView.E0.getText().length()));
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

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (!chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.Y2 != null) {
                int i10 = org.telegram.ui.ActionBar.j6.vf;
                int i11 = ChatActivityEnterView.m5;
                setHandlesColor(chatActivityEnterView.i0(i10));
                chatActivityEnterView.Y2.r1();
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
            if (chatActivityEnterView.Y2 != null) {
                int i12 = org.telegram.ui.ActionBar.j6.vf;
                int i13 = ChatActivityEnterView.m5;
                setHandlesColor(chatActivityEnterView.i0(i12));
                chatActivityEnterView.Y2.r1();
            }
            pf pfVar = chatActivityEnterView.E0;
            if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                chatActivityEnterView.E0.clearFocus();
                chatActivityEnterView.E0.requestFocus();
            }
        }
        return this.n;
    }

    @Override // org.telegram.ui.Components.mg, org.telegram.ui.Components.du
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.r.x1.invalidate();
    }
}
