// default package

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dy3 implements InputFilter {
    public final TextView a;
    public cy3 b;

    public dy3(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1 != 3) goto L24;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int b = wx3.a().b();
            if (b != 0) {
                if (b == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return wx3.a().e(0, charSequence.length(), charSequence);
                    }
                }
            }
            wx3 a = wx3.a();
            cy3 cy3Var = this.b;
            if (cy3Var == null) {
                cy3Var = new cy3(textView, this);
                this.b = cy3Var;
            }
            a.f(cy3Var);
            return charSequence;
        }
        return charSequence;
    }
}
