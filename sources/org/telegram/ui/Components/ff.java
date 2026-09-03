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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ff extends dg {
    public boolean e;
    public float f;
    public float h;
    public boolean n;
    public final /* synthetic */ ChatActivityEnterView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(chatActivityEnterView, context, g6Var);
        this.r = chatActivityEnterView;
        this.e = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.r;
        View view = chatActivityEnterView.F4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar == null || xnVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.L2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.K2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.L2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.xt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.e) {
            return;
        }
        this.e = false;
        this.r.J(true);
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.xt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (chatActivityEnterView.Q != chatActivityEnterView.B0.getLineCount()) {
            boolean z4 = false;
            chatActivityEnterView.p1((chatActivityEnterView.B0.getLineCount() <= 2 || chatActivityEnterView.B0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.B0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.B0.getLineCount() > 2 && chatActivityEnterView.B0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.B0.getText().toString().trim())) {
                z4 = true;
            }
            chatActivityEnterView.v1(z4);
        }
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.xt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.r;
            if (chatActivityEnterView.B0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z4 = wh.x3.z(htmlText, hashMap);
                            if (!z4.isEmpty()) {
                                if (!wh.w4.f(z4, hashMap)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wh.w4.j(z4, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                                    if (u5VarArr != null) {
                                        for (u5 u5Var : u5VarArr) {
                                            u5Var.applyFontMetrics(chatActivityEnterView.B0.getPaint().getFontMetricsInt(), l5.g());
                                        }
                                    }
                                    int max = Math.max(0, chatActivityEnterView.B0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.B0.getText().length(), chatActivityEnterView.B0.getSelectionEnd());
                                    aj0[] aj0VarArr = (aj0[]) chatActivityEnterView.B0.getText().getSpans(max, min, aj0.class);
                                    if (aj0VarArr == null || aj0VarArr.length <= 0) {
                                        bj0.a(spannableStringBuilder);
                                    } else {
                                        aj0[] aj0VarArr2 = (aj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), aj0.class);
                                        for (int i11 = 0; i11 < aj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(aj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(aj0VarArr2[i11].a);
                                        }
                                    }
                                    ff ffVar = chatActivityEnterView.B0;
                                    ffVar.setText(ffVar.getText().replace(max, min, spannableStringBuilder));
                                    chatActivityEnterView.B0.setSelection(Math.min(max + spannableStringBuilder.length(), chatActivityEnterView.B0.getText().length()));
                                    return true;
                                }
                                if (MessagesController.getInstance(chatActivityEnterView.N).richEditorAvailable()) {
                                    int max2 = Math.max(0, chatActivityEnterView.B0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.B0.getText().length(), chatActivityEnterView.B0.getSelectionEnd());
                                    chatActivityEnterView.K0(chatActivityEnterView.B0.getText().subSequence(0, Math.min(max2, min2)), htmlText, chatActivityEnterView.B0.getText().subSequence(Math.max(max2, min2), chatActivityEnterView.B0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (!chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.V2 != null) {
                int i10 = org.telegram.ui.ActionBar.k6.vf;
                int i11 = ChatActivityEnterView.j5;
                setHandlesColor(chatActivityEnterView.i0(i10));
                chatActivityEnterView.V2.x1();
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
            if (chatActivityEnterView.V2 != null) {
                int i12 = org.telegram.ui.ActionBar.k6.vf;
                int i13 = ChatActivityEnterView.j5;
                setHandlesColor(chatActivityEnterView.i0(i12));
                chatActivityEnterView.V2.x1();
            }
            ff ffVar = chatActivityEnterView.B0;
            if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                chatActivityEnterView.B0.clearFocus();
                chatActivityEnterView.B0.requestFocus();
            }
        }
        return this.n;
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.zt
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.r.u1.invalidate();
    }
}
