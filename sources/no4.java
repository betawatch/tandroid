// default package

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class no4 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final rmb c;
    public final boolean d;

    public no4(no4 no4Var, boolean z) {
        super(no4Var.a);
        this.a = no4Var.a;
        this.b = no4Var.b;
        this.c = no4Var.c;
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
            no4[] no4VarArr = (no4[]) spanned.getSpans(0, spanned.length(), no4.class);
            int length = no4VarArr.length;
            ?? r4 = 0;
            int i = 0;
            while (i < length) {
                no4 no4Var = no4VarArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = no4Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (no4Var.d != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(no4Var);
                    int spanEnd = r4.getSpanEnd(no4Var);
                    if (spanStart >= 0 && spanEnd >= spanStart) {
                        String A = z ? ob6.A(no4Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : no4Var.a;
                        r4.removeSpan(no4Var);
                        r4.replace(spanStart, spanEnd, A);
                        r4.setSpan(new no4(no4Var, z), spanStart, A.length() + spanStart, 33);
                    }
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
        rmb rmbVar = this.c;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        }
        textPaint.setUnderlineText(i == color);
    }

    public no4(String str, rmb rmbVar, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = rmbVar;
        this.d = false;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
