package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l71 implements TextWatcher {
    public final g01 a = new g01(this, 16);
    public final /* synthetic */ s71 b;

    public l71(s71 s71Var) {
        this.b = s71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        s71 s71Var = this.b;
        String obj = s71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        r71 r71Var = s71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = r71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        r71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                r71Var.r = false;
                if (r71Var.n >= 0) {
                    ConnectionsManager.getInstance(r71Var.a).cancelRequest(r71Var.n, true);
                    r71Var.n = -1;
                }
                r71Var.f = false;
                r71Var.d.clear();
                r71Var.h = false;
            } else {
                r71Var.r = true;
                r71Var.h = false;
            }
            r71Var.b();
        }
        org.telegram.ui.Components.x51 x51Var = s71Var.i0;
        if (x51Var != null) {
            x51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        g01 g01Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(g01Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(g01Var);
            AndroidUtilities.runOnUIThread(g01Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
