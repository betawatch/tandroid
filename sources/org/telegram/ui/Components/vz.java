package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vz extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final ty0 c;
    public final boolean d;

    public vz(String str, ty0 ty0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = ty0Var;
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
            vz[] vzVarArr = (vz[]) spanned.getSpans(0, spanned.length(), vz.class);
            int length = vzVarArr.length;
            ?? r42 = 0;
            int i3 = 0;
            while (i3 < length) {
                vz vzVar = vzVarArr[i3];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = vzVar.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (vzVar.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(vzVar);
                    int spanEnd = r42.getSpanEnd(vzVar);
                    String A = z10 ? org.telegram.messenger.bd.A(vzVar.b, System.currentTimeMillis(), Locale.getDefault(), false) : vzVar.a;
                    r42.removeSpan(vzVar);
                    r42.replace(spanStart, spanEnd, A);
                    r42.setSpan(new vz(vzVar, z10), spanStart, A.length() + spanStart, 33);
                }
                i3++;
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
        int i3 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.c;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i3 == color);
    }

    public vz(vz vzVar, boolean z10) {
        super(vzVar.a);
        this.a = vzVar.a;
        this.b = vzVar.b;
        this.c = vzVar.c;
        this.d = z10;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
