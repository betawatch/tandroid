package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c71 implements TextWatcher {
    public final xz0 a = new xz0(this, 16);
    public final /* synthetic */ j71 b;

    public c71(j71 j71Var) {
        this.b = j71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        j71 j71Var = this.b;
        String obj = j71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        i71 i71Var = j71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = i71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        i71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                i71Var.r = false;
                if (i71Var.n >= 0) {
                    ConnectionsManager.getInstance(i71Var.a).cancelRequest(i71Var.n, true);
                    i71Var.n = -1;
                }
                i71Var.f = false;
                i71Var.d.clear();
                i71Var.h = false;
            } else {
                i71Var.r = true;
                i71Var.h = false;
            }
            i71Var.b();
        }
        org.telegram.ui.Components.v51 v51Var = j71Var.i0;
        if (v51Var != null) {
            v51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        xz0 xz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(xz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(xz0Var);
            AndroidUtilities.runOnUIThread(xz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
