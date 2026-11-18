package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k00 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final dz0 c;
    public final boolean d;

    public k00(String str, dz0 dz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = dz0Var;
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
            k00[] k00VarArr = (k00[]) spanned.getSpans(0, spanned.length(), k00.class);
            int length = k00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                k00 k00Var = k00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = k00Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (k00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(k00Var);
                    int spanEnd = r42.getSpanEnd(k00Var);
                    String A = z10 ? org.telegram.messenger.gd.A(k00Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : k00Var.a;
                    r42.removeSpan(k00Var);
                    r42.replace(spanStart, spanEnd, A);
                    r42.setSpan(new k00(k00Var, z10), spanStart, A.length() + spanStart, 33);
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
        dz0 dz0Var = this.c;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i7 == color);
    }

    public k00(k00 k00Var, boolean z10) {
        super(k00Var.a);
        this.a = k00Var.a;
        this.b = k00Var.b;
        this.c = k00Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
