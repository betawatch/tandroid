package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b71 implements TextWatcher {
    public final sz0 a = new sz0(this, 16);
    public final /* synthetic */ i71 b;

    public b71(i71 i71Var) {
        this.b = i71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        i71 i71Var = this.b;
        String obj = i71Var.Z.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        h71 h71Var = i71Var.d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = h71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        h71Var.c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                h71Var.r = false;
                if (h71Var.n >= 0) {
                    ConnectionsManager.getInstance(h71Var.a).cancelRequest(h71Var.n, true);
                    h71Var.n = -1;
                }
                h71Var.f = false;
                h71Var.d.clear();
                h71Var.h = false;
            } else {
                h71Var.r = true;
                h71Var.h = false;
            }
            h71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = i71Var.f0;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        sz0 sz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(sz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(sz0Var);
            AndroidUtilities.runOnUIThread(sz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
