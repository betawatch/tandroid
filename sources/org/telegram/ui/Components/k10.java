package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k10 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final n11 c;
    public final boolean d;

    public k10(String str, n11 n11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = n11Var;
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
            k10[] k10VarArr = (k10[]) spanned.getSpans(0, spanned.length(), k10.class);
            int length = k10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                k10 k10Var = k10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = k10Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (k10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(k10Var);
                    int spanEnd = r42.getSpanEnd(k10Var);
                    String formatEntityFormattedDate = z10 ? LocaleController.formatEntityFormattedDate(k10Var.b) : k10Var.a;
                    r42.removeSpan(k10Var);
                    r42.replace(spanStart, spanEnd, formatEntityFormattedDate);
                    r42.setSpan(new k10(k10Var, z10), spanStart, formatEntityFormattedDate.length() + spanStart, 33);
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
        n11 n11Var = this.c;
        if (n11Var != null) {
            n11Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color);
    }

    public k10(k10 k10Var, boolean z10) {
        super(k10Var.a);
        this.a = k10Var.a;
        this.b = k10Var.b;
        this.c = k10Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
