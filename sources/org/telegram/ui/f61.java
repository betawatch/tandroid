package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f61 implements TextWatcher {
    public final my0 a = new my0(this, 19);
    public final /* synthetic */ m61 b;

    public f61(m61 m61Var) {
        this.b = m61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        m61 m61Var = this.b;
        String obj = m61Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        l61 l61Var = m61Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = l61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        l61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                l61Var.r = false;
                if (l61Var.n >= 0) {
                    ConnectionsManager.getInstance(l61Var.a).cancelRequest(l61Var.n, true);
                    l61Var.n = -1;
                }
                l61Var.f = false;
                l61Var.d.clear();
                l61Var.h = false;
            } else {
                l61Var.r = true;
                l61Var.h = false;
            }
            l61Var.b();
        }
        org.telegram.ui.Components.j71 j71Var = m61Var.i0;
        if (j71Var != null) {
            j71Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        my0 my0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(my0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(my0Var);
            AndroidUtilities.runOnUIThread(my0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
