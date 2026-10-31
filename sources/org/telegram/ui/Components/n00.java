package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n00 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final yz0 c;
    public final boolean d;

    public n00(String str, yz0 yz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = yz0Var;
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
            n00[] n00VarArr = (n00[]) spanned.getSpans(0, spanned.length(), n00.class);
            int length = n00VarArr.length;
            ?? r42 = 0;
            int i10 = 0;
            while (i10 < length) {
                n00 n00Var = n00VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = n00Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (n00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(n00Var);
                    int spanEnd = r42.getSpanEnd(n00Var);
                    String A = z10 ? org.telegram.messenger.cd.A(n00Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : n00Var.a;
                    r42.removeSpan(n00Var);
                    r42.replace(spanStart, spanEnd, A);
                    r42.setSpan(new n00(n00Var, z10), spanStart, A.length() + spanStart, 33);
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
        yz0 yz0Var = this.c;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color);
    }

    public n00(n00 n00Var, boolean z10) {
        super(n00Var.a);
        this.a = n00Var.a;
        this.b = n00Var.b;
        this.c = n00Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
