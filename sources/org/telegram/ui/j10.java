package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j10 extends wf.a {
    public CharSequence c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj;
        int i9 = j10Var.a;
        int i10 = this.a;
        if (i9 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.c, j10Var.c)) {
            return false;
        }
        int i11 = this.a;
        if (i11 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            boolean z10 = dialogFilter == null;
            MessagesController.DialogFilter dialogFilter2 = j10Var.d;
            if (z10 != (dialogFilter2 == null)) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.id != dialogFilter2.id) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            boolean z11 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = j10Var.e;
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
