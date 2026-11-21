package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h00 extends rg.a {
    public CharSequence c;
    public org.telegram.messenger.ro d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        int i7 = h00Var.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.c, h00Var.c)) {
            return false;
        }
        int i11 = this.a;
        if (i11 == 2) {
            org.telegram.messenger.ro roVar = this.d;
            boolean z10 = roVar == null;
            org.telegram.messenger.ro roVar2 = h00Var.d;
            if (z10 != (roVar2 == null)) {
                return false;
            }
            if (roVar != null && roVar.a != roVar2.a) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z11 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = h00Var.e;
            if (z11 != (tL_dialogFilterSuggested2 == null)) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.id != tL_dialogFilterSuggested2.filter.id) {
                return false;
            }
        }
        return true;
    }
}
