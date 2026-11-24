// default package

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class im4 extends URLSpan {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final vib c;
    public final boolean d;

    public im4(im4 im4Var, boolean z) {
        super(im4Var.a);
        this.a = im4Var.a;
        this.b = im4Var.b;
        this.c = im4Var.c;
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
            im4[] im4VarArr = (im4[]) spanned.getSpans(0, spanned.length(), im4.class);
            int length = im4VarArr.length;
            ?? r4 = 0;
            int i = 0;
            while (i < length) {
                im4 im4Var = im4VarArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = im4Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (im4Var.d != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(im4Var);
                    int spanEnd = r4.getSpanEnd(im4Var);
                    String A = z ? k96.A(im4Var.b, System.currentTimeMillis(), Locale.getDefault(), false) : im4Var.a;
                    r4.removeSpan(im4Var);
                    r4.replace(spanStart, spanEnd, A);
                    r4.setSpan(new im4(im4Var, z), spanStart, A.length() + spanStart, 33);
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
        vib vibVar = this.c;
        if (vibVar != null) {
            vibVar.a(textPaint);
        }
        textPaint.setUnderlineText(i == color);
    }

    public im4(String str, vib vibVar, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = vibVar;
        this.d = false;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
