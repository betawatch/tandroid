package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b20 extends og.a {
    public CharSequence c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        int i10 = b20Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.c, b20Var.c)) {
            return false;
        }
        int i12 = this.a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            boolean z10 = dialogFilter == null;
            MessagesController.DialogFilter dialogFilter2 = b20Var.d;
            if (z10 != (dialogFilter2 == null)) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.id != dialogFilter2.id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z11 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = b20Var.e;
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
