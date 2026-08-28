package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s00 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final vz0 c;
    public final boolean d;

    public s00(String str, vz0 vz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = vz0Var;
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
            int i9 = 0;
            s00[] s00VarArr = (s00[]) spanned.getSpans(0, spanned.length(), s00.class);
            int length = s00VarArr.length;
            ?? r42 = 0;
            while (i9 < length) {
                s00 s00Var = s00VarArr[i9];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = s00Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (s00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(s00Var);
                    int spanEnd = r42.getSpanEnd(s00Var);
                    String formatEntityFormattedDate = z10 ? LocaleController.formatEntityFormattedDate(s00Var.b) : s00Var.a;
                    r42.removeSpan(s00Var);
                    r42.replace(spanStart, spanEnd, formatEntityFormattedDate);
                    r42.setSpan(new s00(s00Var, z10), spanStart, formatEntityFormattedDate.length() + spanStart, 33);
                }
                i9++;
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
        int i9 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.c;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i9 == color);
    }

    public s00(s00 s00Var, boolean z10) {
        super(s00Var.a);
        this.a = s00Var.a;
        this.b = s00Var.b;
        this.c = s00Var.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
