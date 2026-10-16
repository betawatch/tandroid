package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t10 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final q11 c;
    public final boolean d;

    public t10(String str, q11 q11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = q11Var;
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
            t10[] t10VarArr = (t10[]) spanned.getSpans(0, spanned.length(), t10.class);
            int length = t10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                t10 t10Var = t10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = t10Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (t10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(t10Var);
                    int spanEnd = r42.getSpanEnd(t10Var);
                    String formatEntityFormattedDate = z10 ? LocaleController.formatEntityFormattedDate(t10Var.b) : t10Var.a;
                    r42.removeSpan(t10Var);
                    r42.replace(spanStart, spanEnd, formatEntityFormattedDate);
                    r42.setSpan(new t10(t10Var, z10), spanStart, formatEntityFormattedDate.length() + spanStart, 33);
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
        q11 q11Var = this.c;
        if (q11Var != null) {
            q11Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color);
    }

    public t10(t10 t10Var, boolean z10) {
        super(t10Var.a);
        this.a = t10Var.a;
        this.b = t10Var.b;
        this.c = t10Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
