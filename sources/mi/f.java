package mi;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f extends e {
    public SpannableStringBuilder b;

    @Override // mi.e, android.text.SpannableString, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
    }

    @Override // mi.e, android.text.SpannableString, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
    }

    @Override // mi.e, android.text.SpannableString, android.text.Spanned
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
    }

    @Override // mi.e, android.text.SpannableString, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpans(i10, i11, cls) : spannableStringBuilder.getSpans(i10, i11, cls);
    }

    @Override // mi.e, android.text.SpannableString, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.nextSpanTransition(i10, i11, cls) : spannableStringBuilder.nextSpanTransition(i10, i11, cls);
    }
}
