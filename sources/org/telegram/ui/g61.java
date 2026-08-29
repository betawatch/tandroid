package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g61 implements TextWatcher {
    public final ky0 a = new ky0(this, 18);
    public final /* synthetic */ n61 b;

    public g61(n61 n61Var) {
        this.b = n61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        n61 n61Var = this.b;
        String obj = n61Var.Y.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        m61 m61Var = n61Var.c0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = m61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        m61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                m61Var.r = false;
                if (m61Var.n >= 0) {
                    ConnectionsManager.getInstance(m61Var.a).cancelRequest(m61Var.n, true);
                    m61Var.n = -1;
                }
                m61Var.f = false;
                m61Var.d.clear();
                m61Var.h = false;
            } else {
                m61Var.r = true;
                m61Var.h = false;
            }
            m61Var.b();
        }
        org.telegram.ui.Components.k51 k51Var = n61Var.e0;
        if (k51Var != null) {
            k51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ky0 ky0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            AndroidUtilities.runOnUIThread(ky0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
