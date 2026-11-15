package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q11 implements TextWatcher {
    public final pu0 a = new pu0(this, 18);
    public final /* synthetic */ x11 b;

    public q11(x11 x11Var) {
        this.b = x11Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        x11 x11Var = this.b;
        String obj = x11Var.Y1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        w11 w11Var = x11Var.c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = w11Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        w11Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                w11Var.r = false;
                if (w11Var.n >= 0) {
                    ConnectionsManager.getInstance(w11Var.a).cancelRequest(w11Var.n, true);
                    w11Var.n = -1;
                }
                w11Var.f = false;
                w11Var.d.clear();
                w11Var.h = false;
            } else {
                w11Var.r = true;
                w11Var.h = false;
            }
            w11Var.b();
        }
        org.telegram.ui.Components.p41 p41Var = x11Var.e2;
        if (p41Var != null) {
            p41Var.O(true);
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
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
