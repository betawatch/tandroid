package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d10 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final h01 c;
    public final boolean d;

    public d10(String str, h01 h01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = h01Var;
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
            d10[] d10VarArr = (d10[]) spanned.getSpans(0, spanned.length(), d10.class);
            int length = d10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                d10 d10Var = d10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = d10Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (d10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(d10Var);
                    int spanEnd = r42.getSpanEnd(d10Var);
                    String formatEntityFormattedDate = z10 ? LocaleController.formatEntityFormattedDate(d10Var.b) : d10Var.a;
                    r42.removeSpan(d10Var);
                    r42.replace(spanStart, spanEnd, formatEntityFormattedDate);
                    r42.setSpan(new d10(d10Var, z10), spanStart, formatEntityFormattedDate.length() + spanStart, 33);
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
        h01 h01Var = this.c;
        if (h01Var != null) {
            h01Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color);
    }

    public d10(d10 d10Var, boolean z10) {
        super(d10Var.a);
        this.a = d10Var.a;
        this.b = d10Var.b;
        this.c = d10Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
