package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class a61 implements TextWatcher {
    public final qy0 a = new qy0(this, 17);
    public final /* synthetic */ h61 b;

    public a61(h61 h61Var) {
        this.b = h61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        h61 h61Var = this.b;
        String obj = h61Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        g61 g61Var = h61Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = g61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        g61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                g61Var.r = false;
                if (g61Var.n >= 0) {
                    ConnectionsManager.getInstance(g61Var.a).cancelRequest(g61Var.n, true);
                    g61Var.n = -1;
                }
                g61Var.f = false;
                g61Var.d.clear();
                g61Var.h = false;
            } else {
                g61Var.r = true;
                g61Var.h = false;
            }
            g61Var.b();
        }
        org.telegram.ui.Components.u61 u61Var = h61Var.i0;
        if (u61Var != null) {
            u61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        qy0 qy0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(qy0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(qy0Var);
            AndroidUtilities.runOnUIThread(qy0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
