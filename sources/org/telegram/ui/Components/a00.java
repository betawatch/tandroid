package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a00 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final uy0 c;
    public final boolean d;

    public a00(String str, uy0 uy0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = uy0Var;
        this.d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static CharSequence a(CharSequence charSequence, boolean z9) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            a00[] a00VarArr = (a00[]) spanned.getSpans(0, spanned.length(), a00.class);
            int length = a00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                a00 a00Var = a00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = a00Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (a00Var.d != z9 || (z9 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(a00Var);
                    int spanEnd = r42.getSpanEnd(a00Var);
                    String A = z9 ? org.telegram.messenger.id.A(a00Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : a00Var.a;
                    r42.removeSpan(a00Var);
                    r42.replace(spanStart, spanEnd, A);
                    r42.setSpan(new a00(a00Var, z9), spanStart, A.length() + spanStart, 33);
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
        uy0 uy0Var = this.c;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i7 == color);
    }

    public a00(a00 a00Var, boolean z9) {
        super(a00Var.a);
        this.a = a00Var.a;
        this.b = a00Var.b;
        this.c = a00Var.c;
        this.d = z9;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
