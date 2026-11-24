// default package

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.math.BigDecimal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g32 implements InputFilter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g32(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                mc9 mc9Var = (mc9) obj;
                if (mc9Var.m2 && !mc9Var.i2) {
                    lc9 lc9Var = mc9Var.e2;
                    if (lc9Var != null && charSequence != null && i2 > i && i3 == i4) {
                        lc9Var.O(charSequence.subSequence(i, i2));
                    }
                    break;
                }
                break;
            case 2:
                y0b y0bVar = (y0b) obj;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(y0bVar.getText()) || i3 == 0) {
                    }
                }
                break;
            default:
                qpc qpcVar = (qpc) obj;
                String str = spanned.subSequence(0, i3).toString() + ((Object) charSequence.subSequence(i, i2)) + ((Object) spanned.subSequence(i4, spanned.length()));
                int i5 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                if (qpcVar.l0) {
                    BigDecimal i0 = qpcVar.i0();
                    valueOf = valueOf.multiply(i0);
                    i5 = qpc.h0(i0);
                }
                int max = Math.max(str.indexOf(46), str.indexOf(44));
                if (max < 0 || (str.length() - max) - 1 <= i5) {
                    if (qpc.t0(str).compareTo(valueOf) > 0) {
                        break;
                    } else if (i != i2) {
                        boolean z = false;
                        for (int i6 = 0; i6 < str.length(); i6++) {
                            char charAt = str.charAt(i6);
                            if (charAt == '.' || charAt == ',') {
                                if (z) {
                                    break;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        if (i3 != 0 || (!str.startsWith(".") && !str.startsWith(","))) {
                            if (str.startsWith("00")) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
                break;
        }
        return spanned.subSequence(i3, i4);
    }
}
