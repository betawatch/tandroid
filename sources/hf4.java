// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hf4 extends ja {
    public CharSequence c;
    public t97 d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hf4)) {
            return false;
        }
        hf4 hf4Var = (hf4) obj;
        int i = hf4Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if ((i2 == 0 || i2 == 4 || i2 == 3 || i2 == 6) && !TextUtils.equals(this.c, hf4Var.c)) {
            return false;
        }
        int i3 = this.a;
        if (i3 == 2) {
            t97 t97Var = this.d;
            boolean z = t97Var == null;
            t97 t97Var2 = hf4Var.d;
            if (z != (t97Var2 == null)) {
                return false;
            }
            if (t97Var != null && t97Var.a != t97Var2.a) {
                return false;
            }
        }
        if (i3 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z2 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = hf4Var.e;
            if (z2 != (tL_dialogFilterSuggested2 == null)) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.id != tL_dialogFilterSuggested2.filter.id) {
                return false;
            }
        }
        return true;
    }
}
