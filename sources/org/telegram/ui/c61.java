package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class c61 implements TextWatcher {
    public final sy0 a = new sy0(this, 17);
    public final /* synthetic */ j61 b;

    public c61(j61 j61Var) {
        this.b = j61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        j61 j61Var = this.b;
        String obj = j61Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        i61 i61Var = j61Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = i61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        i61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                i61Var.r = false;
                if (i61Var.n >= 0) {
                    ConnectionsManager.getInstance(i61Var.a).cancelRequest(i61Var.n, true);
                    i61Var.n = -1;
                }
                i61Var.f = false;
                i61Var.d.clear();
                i61Var.h = false;
            } else {
                i61Var.r = true;
                i61Var.h = false;
            }
            i61Var.b();
        }
        org.telegram.ui.Components.s61 s61Var = j61Var.i0;
        if (s61Var != null) {
            s61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        sy0 sy0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(sy0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(sy0Var);
            AndroidUtilities.runOnUIThread(sy0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
