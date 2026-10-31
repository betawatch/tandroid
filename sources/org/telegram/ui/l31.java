package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l31 implements TextWatcher {
    public final wv0 a = new wv0(this, 20);
    public final /* synthetic */ s31 b;

    public l31(s31 s31Var) {
        this.b = s31Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        s31 s31Var = this.b;
        String obj = s31Var.U1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        r31 r31Var = s31Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = r31Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        r31Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                r31Var.r = false;
                if (r31Var.n >= 0) {
                    ConnectionsManager.getInstance(r31Var.a).cancelRequest(r31Var.n, true);
                    r31Var.n = -1;
                }
                r31Var.f = false;
                r31Var.d.clear();
                r31Var.h = false;
            } else {
                r31Var.r = true;
                r31Var.h = false;
            }
            r31Var.b();
        }
        org.telegram.ui.Components.p51 p51Var = s31Var.a2;
        if (p51Var != null) {
            p51Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        wv0 wv0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.i0.r(wv0Var);
            a();
        } else {
            org.telegram.messenger.i0.r(wv0Var);
            org.telegram.messenger.i0.h3(wv0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
