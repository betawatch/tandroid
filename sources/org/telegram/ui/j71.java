package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class j71 implements TextWatcher {
    public final e01 a = new e01(this, 16);
    public final /* synthetic */ q71 b;

    public j71(q71 q71Var) {
        this.b = q71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        q71 q71Var = this.b;
        String obj = q71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        p71 p71Var = q71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = p71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        p71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                p71Var.r = false;
                if (p71Var.n >= 0) {
                    ConnectionsManager.getInstance(p71Var.a).cancelRequest(p71Var.n, true);
                    p71Var.n = -1;
                }
                p71Var.f = false;
                p71Var.d.clear();
                p71Var.h = false;
            } else {
                p71Var.r = true;
                p71Var.h = false;
            }
            p71Var.b();
        }
        org.telegram.ui.Components.l61 l61Var = q71Var.i0;
        if (l61Var != null) {
            l61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        e01 e01Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(e01Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(e01Var);
            AndroidUtilities.runOnUIThread(e01Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
