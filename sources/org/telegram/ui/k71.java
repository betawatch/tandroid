package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k71 implements TextWatcher {
    public final f01 a = new f01(this, 16);
    public final /* synthetic */ r71 b;

    public k71(r71 r71Var) {
        this.b = r71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        r71 r71Var = this.b;
        String obj = r71Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        q71 q71Var = r71Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = q71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        q71Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                q71Var.r = false;
                if (q71Var.n >= 0) {
                    ConnectionsManager.getInstance(q71Var.a).cancelRequest(q71Var.n, true);
                    q71Var.n = -1;
                }
                q71Var.f = false;
                q71Var.d.clear();
                q71Var.h = false;
            } else {
                q71Var.r = true;
                q71Var.h = false;
            }
            q71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = r71Var.i0;
        if (w51Var != null) {
            w51Var.N(true);
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
