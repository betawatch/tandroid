package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j31 implements TextWatcher {
    public final vv0 a = new vv0(this, 20);
    public final /* synthetic */ q31 b;

    public j31(q31 q31Var) {
        this.b = q31Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        q31 q31Var = this.b;
        String obj = q31Var.U1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        p31 p31Var = q31Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = p31Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        p31Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                p31Var.r = false;
                if (p31Var.n >= 0) {
                    ConnectionsManager.getInstance(p31Var.a).cancelRequest(p31Var.n, true);
                    p31Var.n = -1;
                }
                p31Var.f = false;
                p31Var.d.clear();
                p31Var.h = false;
            } else {
                p31Var.r = true;
                p31Var.h = false;
            }
            p31Var.b();
        }
        org.telegram.ui.Components.q51 q51Var = q31Var.a2;
        if (q51Var != null) {
            q51Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        vv0 vv0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.i0.r(vv0Var);
            a();
        } else {
            org.telegram.messenger.i0.r(vv0Var);
            org.telegram.messenger.i0.h3(vv0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
