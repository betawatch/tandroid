package di;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class g extends f {
    public SpannableStringBuilder b;

    @Override // di.f, android.text.SpannableString, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
    }

    @Override // di.f, android.text.SpannableString, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
    }

    @Override // di.f, android.text.SpannableString, android.text.Spanned
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
    }

    @Override // di.f, android.text.SpannableString, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpans(i10, i11, cls) : spannableStringBuilder.getSpans(i10, i11, cls);
    }

    @Override // di.f, android.text.SpannableString, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.nextSpanTransition(i10, i11, cls) : spannableStringBuilder.nextSpanTransition(i10, i11, cls);
    }
}
