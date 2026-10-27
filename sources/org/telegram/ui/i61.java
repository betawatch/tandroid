package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i61 implements TextWatcher {
    public final oy0 a = new oy0(this, 19);
    public final /* synthetic */ p61 b;

    public i61(p61 p61Var) {
        this.b = p61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        p61 p61Var = this.b;
        String obj = p61Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        o61 o61Var = p61Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = o61Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        o61Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                o61Var.r = false;
                if (o61Var.n >= 0) {
                    ConnectionsManager.getInstance(o61Var.a).cancelRequest(o61Var.n, true);
                    o61Var.n = -1;
                }
                o61Var.f = false;
                o61Var.d.clear();
                o61Var.h = false;
            } else {
                o61Var.r = true;
                o61Var.h = false;
            }
            o61Var.b();
        }
        org.telegram.ui.Components.k71 k71Var = p61Var.i0;
        if (k71Var != null) {
            k71Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        oy0 oy0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(oy0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(oy0Var);
            AndroidUtilities.runOnUIThread(oy0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
