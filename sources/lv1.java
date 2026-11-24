// default package

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lv1 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = ChatActivityEnterView.r7;
        for (int i6 = i; i6 < i2; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == '\n' || charAt == '\r') {
                StringBuilder sb = new StringBuilder(i2 - i);
                while (i < i2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 != '\n' && charAt2 != '\r') {
                        sb.append(charAt2);
                    }
                    i++;
                }
                return sb;
            }
        }
        return null;
    }
}
