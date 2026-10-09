package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n71 implements TextWatcher {
    public final nz0 a = new nz0(this, 17);
    public final /* synthetic */ u71 b;

    public n71(u71 u71Var) {
        this.b = u71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        u71 u71Var = this.b;
        String obj = u71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        t71 t71Var = u71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = t71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        t71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                t71Var.r = false;
                if (t71Var.n >= 0) {
                    ConnectionsManager.getInstance(t71Var.a).cancelRequest(t71Var.n, true);
                    t71Var.n = -1;
                }
                t71Var.f = false;
                t71Var.d.clear();
                t71Var.h = false;
            } else {
                t71Var.r = true;
                t71Var.h = false;
            }
            t71Var.b();
        }
        org.telegram.ui.Components.c71 c71Var = u71Var.i0;
        if (c71Var != null) {
            c71Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        nz0 nz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(nz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(nz0Var);
            AndroidUtilities.runOnUIThread(nz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
