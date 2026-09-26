package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class d71 implements TextWatcher {
    public final vz0 a = new vz0(this, 16);
    public final /* synthetic */ k71 b;

    public d71(k71 k71Var) {
        this.b = k71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k71 k71Var = this.b;
        String obj = k71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        j71 j71Var = k71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        j71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                j71Var.r = false;
                if (j71Var.n >= 0) {
                    ConnectionsManager.getInstance(j71Var.a).cancelRequest(j71Var.n, true);
                    j71Var.n = -1;
                }
                j71Var.f = false;
                j71Var.d.clear();
                j71Var.h = false;
            } else {
                j71Var.r = true;
                j71Var.h = false;
            }
            j71Var.b();
        }
        org.telegram.ui.Components.j61 j61Var = k71Var.i0;
        if (j61Var != null) {
            j61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        vz0 vz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(vz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(vz0Var);
            AndroidUtilities.runOnUIThread(vz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
