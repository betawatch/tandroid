package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class su0 extends pm0 {
    public final Context c;
    public final gg.b2 e;
    public ru0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ bw0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public su0(bw0 bw0Var, Context context) {
        this.s = bw0Var;
        this.c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.e = b2Var;
        b2Var.a = new qu0(this);
        this.n = bw0Var.D1.g();
    }

    @Override // s4.i0
    public final void A(s4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.e;
        int size = b2Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) b2Var.g.get(i10);
    }

    public final void F(String str, boolean z10) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, false, true, false, ChatObject.isChannel(this.n) ? this.n.id : 0L, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.s.k0;
            if (i10 >= uu0VarArr.length) {
                break;
            }
            if (uu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.k0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ru0 ru0Var = new ru0(this, str, 0);
        this.f = ru0Var;
        dispatchQueue.postRunnable(ru0Var, 300L);
    }

    @Override // s4.i0
    public final int h() {
        return this.h;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return 22;
    }

    @Override // s4.i0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            bw0 bw0Var = this.s;
            if (bw0Var.V0) {
                uu0 uu0Var = bw0Var.k0[0];
                if (uu0Var.F == 7 && uu0Var.h.getAdapter() != this) {
                    bw0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        bw0 bw0Var = this.s;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        gg.b2 b2Var = this.e;
        b2Var.g.size();
        String str = b2Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(bw0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.c, bw0Var.F1, true);
        b5Var.setBackgroundColor(bw0Var.h0(org.telegram.ui.ActionBar.i6.d6));
        b5Var.setDelegate(new qu0(this));
        return new am0(b5Var);
    }
}
