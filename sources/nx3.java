// default package

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nx3 implements InputFilter {
    public final TextView a;
    public mx3 b;

    public nx3(TextView textView) {
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
            int b = gx3.a().b();
            if (b != 0) {
                if (b == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return gx3.a().e(0, charSequence.length(), charSequence);
                    }
                }
            }
            gx3 a = gx3.a();
            mx3 mx3Var = this.b;
            if (mx3Var == null) {
                mx3Var = new mx3(textView, this);
                this.b = mx3Var;
            }
            a.f(mx3Var);
            return charSequence;
        }
        return charSequence;
    }
}
