package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d10 extends hg.b {
    public CharSequence c;
    public org.telegram.messenger.ap d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        int i10 = d10Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.c, d10Var.c)) {
            return false;
        }
        int i12 = this.a;
        if (i12 == 2) {
            org.telegram.messenger.ap apVar = this.d;
            boolean z10 = apVar == null;
            org.telegram.messenger.ap apVar2 = d10Var.d;
            if (z10 != (apVar2 == null)) {
                return false;
            }
            if (apVar != null && apVar.a != apVar2.a) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z11 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = d10Var.e;
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
