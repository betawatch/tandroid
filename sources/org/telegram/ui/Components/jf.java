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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jf extends gg {
    public boolean e;
    public float f;
    public float h;
    public boolean n;
    public final /* synthetic */ ChatActivityEnterView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(chatActivityEnterView, context, c6Var);
        this.r = chatActivityEnterView;
        this.e = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.r;
        View view = chatActivityEnterView.E4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar == null || tnVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.K2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.J2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.K2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.st, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.e) {
            return;
        }
        this.e = false;
        this.r.J(true);
    }

    @Override // org.telegram.ui.Components.gg, org.telegram.ui.Components.st, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.p1((chatActivityEnterView.A0.getLineCount() <= 2 || chatActivityEnterView.A0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.A0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.A0.getLineCount() > 2 && chatActivityEnterView.A0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.A0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.v1(z10);
        }
    }

    @Override // org.telegram.ui.Components.gg, org.telegram.ui.Components.st, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.r;
            if (chatActivityEnterView.A0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = th.v3.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (!th.u4.f(z10, hashMap)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(th.u4.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                                    if (y5VarArr != null) {
                                        for (y5 y5Var : y5VarArr) {
                                            y5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), p5.g());
                                        }
                                    }
                                    int max = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    pi0[] pi0VarArr = (pi0[]) chatActivityEnterView.A0.getText().getSpans(max, min, pi0.class);
                                    if (pi0VarArr == null || pi0VarArr.length <= 0) {
                                        qi0.a(spannableStringBuilder);
                                    } else {
                                        pi0[] pi0VarArr2 = (pi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pi0.class);
                                        for (int i11 = 0; i11 < pi0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(pi0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(pi0VarArr2[i11].a);
                                        }
                                    }
                                    jf jfVar = chatActivityEnterView.A0;
                                    jfVar.setText(jfVar.getText().replace(max, min, spannableStringBuilder));
                                    chatActivityEnterView.A0.setSelection(Math.min(max + spannableStringBuilder.length(), chatActivityEnterView.A0.getText().length()));
                                    return true;
                                }
                                if (MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                                    int max2 = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    chatActivityEnterView.K0(chatActivityEnterView.A0.getText().subSequence(0, Math.min(max2, min2)), htmlText, chatActivityEnterView.A0.getText().subSequence(Math.max(max2, min2), chatActivityEnterView.A0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.gg, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (!chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.U2 != null) {
                int i10 = org.telegram.ui.ActionBar.g6.vf;
                int i11 = ChatActivityEnterView.i5;
                setHandlesColor(chatActivityEnterView.i0(i10));
                chatActivityEnterView.U2.r1();
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
            if (chatActivityEnterView.U2 != null) {
                int i12 = org.telegram.ui.ActionBar.g6.vf;
                int i13 = ChatActivityEnterView.i5;
                setHandlesColor(chatActivityEnterView.i0(i12));
                chatActivityEnterView.U2.r1();
            }
            jf jfVar = chatActivityEnterView.A0;
            if (jfVar != null && !AndroidUtilities.showKeyboard(jfVar)) {
                chatActivityEnterView.A0.clearFocus();
                chatActivityEnterView.A0.requestFocus();
            }
        }
        return this.n;
    }

    @Override // org.telegram.ui.Components.gg, org.telegram.ui.Components.ut
    public final void setOffsetY(float f9) {
        super.setOffsetY(f9);
        this.r.t1.invalidate();
    }
}
