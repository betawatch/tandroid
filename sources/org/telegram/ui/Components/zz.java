package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zz extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final uy0 c;
    public final boolean d;

    public zz(String str, uy0 uy0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
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
            zz[] zzVarArr = (zz[]) spanned.getSpans(0, spanned.length(), zz.class);
            int length = zzVarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                zz zzVar = zzVarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = zzVar.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (zzVar.d != z9 || (z9 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(zzVar);
                    int spanEnd = r42.getSpanEnd(zzVar);
                    String A = z9 ? org.telegram.messenger.id.A(zzVar.b, System.currentTimeMillis(), Locale.getDefault(), false) : zzVar.a;
                    r42.removeSpan(zzVar);
                    r42.replace(spanStart, spanEnd, A);
                    r42.setSpan(new zz(zzVar, z9), spanStart, A.length() + spanStart, 33);
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

    public zz(zz zzVar, boolean z9) {
        super(zzVar.a);
        this.a = zzVar.a;
        this.b = zzVar.b;
        this.c = zzVar.c;
        this.d = z9;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
