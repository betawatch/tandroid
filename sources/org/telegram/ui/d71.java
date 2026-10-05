package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class d71 implements TextWatcher {
    public final hz0 a = new hz0(this, 17);
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
        org.telegram.ui.Components.w61 w61Var = k71Var.i0;
        if (w61Var != null) {
            w61Var.N(true);
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
