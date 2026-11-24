// default package

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jo4 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final wkb c;
    public final boolean d;

    public jo4(jo4 jo4Var, boolean z) {
        super(jo4Var.a);
        this.a = jo4Var.a;
        this.b = jo4Var.b;
        this.c = jo4Var.c;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static CharSequence a(CharSequence charSequence, boolean z) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            jo4[] jo4VarArr = (jo4[]) spanned.getSpans(0, spanned.length(), jo4.class);
            int length = jo4VarArr.length;
            ?? r4 = 0;
            int i = 0;
            while (i < length) {
                jo4 jo4Var = jo4VarArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = jo4Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (jo4Var.d != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(jo4Var);
                    int spanEnd = r4.getSpanEnd(jo4Var);
                    String A = z ? jb6.A(jo4Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : jo4Var.a;
                    r4.removeSpan(jo4Var);
                    r4.replace(spanStart, spanEnd, A);
                    r4.setSpan(new jo4(jo4Var, z), spanStart, A.length() + spanStart, 33);
                }
                i++;
                r4 = r4;
            }
        }
        return charSequence;
    }

    public static CharSequence b(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wkb wkbVar = this.c;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        }
        textPaint.setUnderlineText(i == color);
    }

    public jo4(String str, wkb wkbVar, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = wkbVar;
        this.d = false;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
