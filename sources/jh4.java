// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jh4 extends ja {
    public CharSequence c;
    public ub7 d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh4)) {
            return false;
        }
        jh4 jh4Var = (jh4) obj;
        int i = jh4Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if ((i2 == 0 || i2 == 4 || i2 == 3 || i2 == 6) && !TextUtils.equals(this.c, jh4Var.c)) {
            return false;
        }
        int i3 = this.a;
        if (i3 == 2) {
            ub7 ub7Var = this.d;
            boolean z = ub7Var == null;
            ub7 ub7Var2 = jh4Var.d;
            if (z != (ub7Var2 == null)) {
                return false;
            }
            if (ub7Var != null && ub7Var.a != ub7Var2.a) {
                return false;
            }
        }
        if (i3 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z2 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = jh4Var.e;
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
