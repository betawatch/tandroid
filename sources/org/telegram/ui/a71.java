package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a71 implements TextWatcher {
    public final sz0 a = new sz0(this, 16);
    public final /* synthetic */ h71 b;

    public a71(h71 h71Var) {
        this.b = h71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        h71 h71Var = this.b;
        String obj = h71Var.Z.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        g71 g71Var = h71Var.d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = g71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        g71Var.c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                g71Var.r = false;
                if (g71Var.n >= 0) {
                    ConnectionsManager.getInstance(g71Var.a).cancelRequest(g71Var.n, true);
                    g71Var.n = -1;
                }
                g71Var.f = false;
                g71Var.d.clear();
                g71Var.h = false;
            } else {
                g71Var.r = true;
                g71Var.h = false;
            }
            g71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = h71Var.f0;
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
