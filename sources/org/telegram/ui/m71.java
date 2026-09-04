package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class m71 implements TextWatcher {
    public final f01 a = new f01(this, 16);
    public final /* synthetic */ t71 b;

    public m71(t71 t71Var) {
        this.b = t71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        t71 t71Var = this.b;
        String obj = t71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        s71 s71Var = t71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = s71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        s71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                s71Var.r = false;
                if (s71Var.n >= 0) {
                    ConnectionsManager.getInstance(s71Var.a).cancelRequest(s71Var.n, true);
                    s71Var.n = -1;
                }
                s71Var.f = false;
                s71Var.d.clear();
                s71Var.h = false;
            } else {
                s71Var.r = true;
                s71Var.h = false;
            }
            s71Var.b();
        }
        org.telegram.ui.Components.v51 v51Var = t71Var.i0;
        if (v51Var != null) {
            v51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        f01 f01Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(f01Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(f01Var);
            AndroidUtilities.runOnUIThread(f01Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
