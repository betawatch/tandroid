package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d00 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final wy0 c;
    public final boolean d;

    public d00(String str, wy0 wy0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = wy0Var;
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
            d00[] d00VarArr = (d00[]) spanned.getSpans(0, spanned.length(), d00.class);
            int length = d00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                d00 d00Var = d00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = d00Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (d00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(d00Var);
                    int spanEnd = r42.getSpanEnd(d00Var);
                    String A = z10 ? org.telegram.messenger.hd.A(d00Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : d00Var.a;
                    r42.removeSpan(d00Var);
                    r42.replace(spanStart, spanEnd, A);
                    r42.setSpan(new d00(d00Var, z10), spanStart, A.length() + spanStart, 33);
                }
                i7++;
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
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wy0 wy0Var = this.c;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i7 == color);
    }

    public d00(d00 d00Var, boolean z10) {
        super(d00Var.a);
        this.a = d00Var.a;
        this.b = d00Var.b;
        this.c = d00Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
