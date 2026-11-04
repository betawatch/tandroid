package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j11 implements TextWatcher {
    public final pu0 a = new pu0(this, 17);
    public final /* synthetic */ q11 b;

    public j11(q11 q11Var) {
        this.b = q11Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        q11 q11Var = this.b;
        String obj = q11Var.V1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        p11 p11Var = q11Var.Z1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = p11Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        p11Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                p11Var.r = false;
                if (p11Var.n >= 0) {
                    ConnectionsManager.getInstance(p11Var.a).cancelRequest(p11Var.n, true);
                    p11Var.n = -1;
                }
                p11Var.f = false;
                p11Var.d.clear();
                p11Var.h = false;
            } else {
                p11Var.r = true;
                p11Var.h = false;
            }
            p11Var.b();
        }
        org.telegram.ui.Components.f41 f41Var = q11Var.b2;
        if (f41Var != null) {
            f41Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        pu0 pu0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(pu0Var);
            a();
        } else {
            org.telegram.messenger.g0.r(pu0Var);
            org.telegram.messenger.g0.i3(pu0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
