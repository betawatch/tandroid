package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c00 extends rg.a {
    public CharSequence c;
    public org.telegram.messenger.vo d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        int i7 = c00Var.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.c, c00Var.c)) {
            return false;
        }
        int i11 = this.a;
        if (i11 == 2) {
            org.telegram.messenger.vo voVar = this.d;
            boolean z9 = voVar == null;
            org.telegram.messenger.vo voVar2 = c00Var.d;
            if (z9 != (voVar2 == null)) {
                return false;
            }
            if (voVar != null && voVar.a != voVar2.a) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z10 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = c00Var.e;
            if (z10 != (tL_dialogFilterSuggested2 == null)) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.id != tL_dialogFilterSuggested2.filter.id) {
                return false;
            }
        }
        return true;
    }
}
