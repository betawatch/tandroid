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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ff extends dg {
    public boolean e;
    public float f;
    public float h;
    public boolean n;
    public final /* synthetic */ ChatActivityEnterView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(chatActivityEnterView, context, b6Var);
        this.r = chatActivityEnterView;
        this.e = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.r;
        View view = chatActivityEnterView.E4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar == null || qnVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.K2.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.J2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.K2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.e) {
            return;
        }
        this.e = false;
        this.r.J(true);
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i9) {
        if (i9 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.r;
            if (chatActivityEnterView.A0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = qh.u3.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (!qh.t4.f(z10, hashMap)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qh.t4.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                                    if (t5VarArr != null) {
                                        for (t5 t5Var : t5VarArr) {
                                            t5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), k5.g());
                                        }
                                    }
                                    int max = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    ei0[] ei0VarArr = (ei0[]) chatActivityEnterView.A0.getText().getSpans(max, min, ei0.class);
                                    if (ei0VarArr == null || ei0VarArr.length <= 0) {
                                        fi0.a(spannableStringBuilder);
                                    } else {
                                        ei0[] ei0VarArr2 = (ei0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ei0.class);
                                        for (int i10 = 0; i10 < ei0VarArr2.length; i10++) {
                                            spannableStringBuilder.removeSpan(ei0VarArr2[i10]);
                                            spannableStringBuilder.removeSpan(ei0VarArr2[i10].a);
                                        }
                                    }
                                    ff ffVar = chatActivityEnterView.A0;
                                    ffVar.setText(ffVar.getText().replace(max, min, spannableStringBuilder));
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
        return super.onTextContextMenuItem(i9);
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.r;
        if (!chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.U2 != null) {
                int i9 = org.telegram.ui.ActionBar.f6.vf;
                int i10 = ChatActivityEnterView.i5;
                setHandlesColor(chatActivityEnterView.h0(i9));
                chatActivityEnterView.U2.i1();
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
                int i11 = org.telegram.ui.ActionBar.f6.vf;
                int i12 = ChatActivityEnterView.i5;
                setHandlesColor(chatActivityEnterView.h0(i11));
                chatActivityEnterView.U2.i1();
            }
            ff ffVar = chatActivityEnterView.A0;
            if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                chatActivityEnterView.A0.clearFocus();
                chatActivityEnterView.A0.requestFocus();
            }
        }
        return this.n;
    }

    @Override // org.telegram.ui.Components.dg, org.telegram.ui.Components.ot
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.r.t1.invalidate();
    }
}
