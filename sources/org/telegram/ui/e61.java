package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e61 implements TextWatcher {
    public final ky0 a = new ky0(this, 18);
    public final /* synthetic */ l61 b;

    public e61(l61 l61Var) {
        this.b = l61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        l61 l61Var = this.b;
        String obj = l61Var.Y.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        k61 k61Var = l61Var.c0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = k61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        k61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                k61Var.r = false;
                if (k61Var.n >= 0) {
                    ConnectionsManager.getInstance(k61Var.a).cancelRequest(k61Var.n, true);
                    k61Var.n = -1;
                }
                k61Var.f = false;
                k61Var.d.clear();
                k61Var.h = false;
            } else {
                k61Var.r = true;
                k61Var.h = false;
            }
            k61Var.b();
        }
        org.telegram.ui.Components.z41 z41Var = l61Var.e0;
        if (z41Var != null) {
            z41Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ky0 ky0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            AndroidUtilities.runOnUIThread(ky0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
