// default package

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l44 extends InputFilter.LengthFilter {
    public final /* synthetic */ n44 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l44(n44 n44Var) {
        super(128);
        this.a = n44Var;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && filter.length() == 0) {
            gm.z3(this.a.a);
            xx0.E.a();
        }
        return filter;
    }
}
