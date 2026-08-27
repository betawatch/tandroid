package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d61 implements TextWatcher {
    public final ky0 a = new ky0(this, 18);
    public final /* synthetic */ k61 b;

    public d61(k61 k61Var) {
        this.b = k61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k61 k61Var = this.b;
        String obj = k61Var.Y.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        j61 j61Var = k61Var.c0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        j61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                j61Var.r = false;
                if (j61Var.n >= 0) {
                    ConnectionsManager.getInstance(j61Var.a).cancelRequest(j61Var.n, true);
                    j61Var.n = -1;
                }
                j61Var.f = false;
                j61Var.d.clear();
                j61Var.h = false;
            } else {
                j61Var.r = true;
                j61Var.h = false;
            }
            j61Var.b();
        }
        org.telegram.ui.Components.b51 b51Var = k61Var.e0;
        if (b51Var != null) {
            b51Var.N(true);
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
