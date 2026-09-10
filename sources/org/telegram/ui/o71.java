package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o71 implements TextWatcher {
    public final k01 a = new k01(this, 16);
    public final /* synthetic */ v71 b;

    public o71(v71 v71Var) {
        this.b = v71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        v71 v71Var = this.b;
        String obj = v71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        u71 u71Var = v71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = u71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        u71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                u71Var.r = false;
                if (u71Var.n >= 0) {
                    ConnectionsManager.getInstance(u71Var.a).cancelRequest(u71Var.n, true);
                    u71Var.n = -1;
                }
                u71Var.f = false;
                u71Var.d.clear();
                u71Var.h = false;
            } else {
                u71Var.r = true;
                u71Var.h = false;
            }
            u71Var.b();
        }
        org.telegram.ui.Components.j61 j61Var = v71Var.i0;
        if (j61Var != null) {
            j61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        k01 k01Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(k01Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(k01Var);
            AndroidUtilities.runOnUIThread(k01Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
