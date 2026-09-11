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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class qf extends ng {
    public boolean e;
    public float f;
    public float h;
    public boolean n;
    public final /* synthetic */ ChatActivityEnterView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.r = chatActivityEnterView;
        this.e = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.r;
        View view = chatActivityEnterView.I4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar == null || coVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.O2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.N2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.zt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.e) {
            return;
        }
        this.e = false;
        this.r.K(true);
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.zt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.p1((chatActivityEnterView.E0.getLineCount() <= 2 || chatActivityEnterView.E0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.v1(z10);
        }
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.zt, android.widget.EditText, android.widget.TextView
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
                            ArrayList z10 = ji.d4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (!ji.f5.f(z10, hashMap)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.f5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                                    if (z5VarArr != null) {
                                        for (z5 z5Var : z5VarArr) {
                                            z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                        }
                                    }
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    ri0[] ri0VarArr = (ri0[]) chatActivityEnterView.E0.getText().getSpans(max, min, ri0.class);
                                    if (ri0VarArr == null || ri0VarArr.length <= 0) {
                                        si0.a(spannableStringBuilder);
                                    } else {
                                        ri0[] ri0VarArr2 = (ri0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ri0.class);
                                        for (int i11 = 0; i11 < ri0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(ri0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(ri0VarArr2[i11].a);
                                        }
                                    }
                                    qf qfVar = chatActivityEnterView.E0;
                                    qfVar.setText(qfVar.getText().replace(max, min, spannableStringBuilder));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (!chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.Y2 != null) {
                int i10 = org.telegram.ui.ActionBar.j6.vf;
                int i11 = ChatActivityEnterView.m5;
                setHandlesColor(chatActivityEnterView.i0(i10));
                chatActivityEnterView.Y2.l1();
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
                chatActivityEnterView.Y2.l1();
            }
            qf qfVar = chatActivityEnterView.E0;
            if (qfVar != null && !AndroidUtilities.showKeyboard(qfVar)) {
                chatActivityEnterView.E0.clearFocus();
                chatActivityEnterView.E0.requestFocus();
            }
        }
        return this.n;
    }

    @Override // org.telegram.ui.Components.ng, org.telegram.ui.Components.bu
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.r.x1.invalidate();
    }
}
