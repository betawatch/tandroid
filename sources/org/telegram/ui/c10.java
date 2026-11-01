package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c10 extends hg.b {
    public CharSequence c;
    public org.telegram.messenger.bp d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        int i10 = c10Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.c, c10Var.c)) {
            return false;
        }
        int i12 = this.a;
        if (i12 == 2) {
            org.telegram.messenger.bp bpVar = this.d;
            boolean z10 = bpVar == null;
            org.telegram.messenger.bp bpVar2 = c10Var.d;
            if (z10 != (bpVar2 == null)) {
                return false;
            }
            if (bpVar != null && bpVar.a != bpVar2.a) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z11 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = c10Var.e;
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
