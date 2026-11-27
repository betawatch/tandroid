// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gh4 extends ka {
    public CharSequence c;
    public ac7 d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gh4)) {
            return false;
        }
        gh4 gh4Var = (gh4) obj;
        int i = gh4Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if ((i2 == 0 || i2 == 4 || i2 == 3 || i2 == 6) && !TextUtils.equals(this.c, gh4Var.c)) {
            return false;
        }
        int i3 = this.a;
        if (i3 == 2) {
            ac7 ac7Var = this.d;
            boolean z = ac7Var == null;
            ac7 ac7Var2 = gh4Var.d;
            if (z != (ac7Var2 == null)) {
                return false;
            }
            if (ac7Var != null && ac7Var.a != ac7Var2.a) {
                return false;
            }
        }
        if (i3 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z2 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = gh4Var.e;
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
