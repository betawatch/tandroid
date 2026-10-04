package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class f71 implements TextWatcher {
    public final hz0 a = new hz0(this, 17);
    public final /* synthetic */ m71 b;

    public f71(m71 m71Var) {
        this.b = m71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        m71 m71Var = this.b;
        String obj = m71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        l71 l71Var = m71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = l71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        l71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                l71Var.r = false;
                if (l71Var.n >= 0) {
                    ConnectionsManager.getInstance(l71Var.a).cancelRequest(l71Var.n, true);
                    l71Var.n = -1;
                }
                l71Var.f = false;
                l71Var.d.clear();
                l71Var.h = false;
            } else {
                l71Var.r = true;
                l71Var.h = false;
            }
            l71Var.b();
        }
        org.telegram.ui.Components.u61 u61Var = m71Var.i0;
        if (u61Var != null) {
            u61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        hz0 hz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(hz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(hz0Var);
            AndroidUtilities.runOnUIThread(hz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
