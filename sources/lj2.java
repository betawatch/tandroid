// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class lj2 extends kj2 {
    public SpannableStringBuilder c;

    @Override // kj2, android.text.SpannableString, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
    }

    @Override // kj2, android.text.SpannableString, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
    }

    @Override // kj2, android.text.SpannableString, android.text.Spanned
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
    }

    @Override // kj2, android.text.SpannableString, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpans(i, i2, cls) : spannableStringBuilder.getSpans(i, i2, cls);
    }

    @Override // kj2, android.text.SpannableString, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.nextSpanTransition(i, i2, cls) : spannableStringBuilder.nextSpanTransition(i, i2, cls);
    }
}
