package og;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.i0;
import org.telegram.messenger.t2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends InputFilter.LengthFilter {
    public final /* synthetic */ m a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(128);
        this.a = mVar;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && filter.length() == 0) {
            i0.E3(this.a.a);
            t2.D.a();
        }
        return filter;
    }
}
