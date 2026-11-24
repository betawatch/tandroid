// default package

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a34 extends InputFilter.LengthFilter {
    public final /* synthetic */ c34 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a34(c34 c34Var) {
        super(128);
        this.a = c34Var;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && filter.length() == 0) {
            gl.A3(this.a.a);
            pw0.E.a();
        }
        return filter;
    }
}
