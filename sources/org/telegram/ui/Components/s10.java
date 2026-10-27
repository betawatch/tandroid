package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s10 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final z11 c;
    public final boolean d;

    public s10(String str, z11 z11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = z11Var;
        this.d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static CharSequence a(CharSequence charSequence, boolean z10) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            s10[] s10VarArr = (s10[]) spanned.getSpans(0, spanned.length(), s10.class);
            int length = s10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                s10 s10Var = s10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = s10Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (s10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(s10Var);
                    int spanEnd = r42.getSpanEnd(s10Var);
                    String formatEntityFormattedDate = z10 ? LocaleController.formatEntityFormattedDate(s10Var.b) : s10Var.a;
                    r42.removeSpan(s10Var);
                    r42.replace(spanStart, spanEnd, formatEntityFormattedDate);
                    r42.setSpan(new s10(s10Var, z10), spanStart, formatEntityFormattedDate.length() + spanStart, 33);
                }
                i10++;
                r42 = r42;
            }
        }
        return charSequence;
    }

    public static CharSequence b(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        z11 z11Var = this.c;
        if (z11Var != null) {
            z11Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color);
    }

    public s10(s10 s10Var, boolean z10) {
        super(s10Var.a);
        this.a = s10Var.a;
        this.b = s10Var.b;
        this.c = s10Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
