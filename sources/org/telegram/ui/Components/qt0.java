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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qt0 extends ll0 {
    public final Context c;
    public final gg.c2 e;
    public pt0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ zu0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public qt0(zu0 zu0Var, Context context) {
        this.s = zu0Var;
        this.c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.a = new ot0(this);
        this.n = zu0Var.D1.g();
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.e;
        int size = c2Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) c2Var.g.get(i10);
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
            st0[] st0VarArr = this.s.k0;
            if (i10 >= st0VarArr.length) {
                break;
            }
            if (st0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.k0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        pt0 pt0Var = new pt0(this, str, 0);
        this.f = pt0Var;
        dispatchQueue.postRunnable(pt0Var, 300L);
    }

    @Override // s4.h0
    public final int h() {
        return this.h;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 22;
    }

    @Override // s4.h0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            zu0 zu0Var = this.s;
            if (zu0Var.V0) {
                st0 st0Var = zu0Var.k0[0];
                if (st0Var.F == 7 && st0Var.h.getAdapter() != this) {
                    zu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        zu0 zu0Var = this.s;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        gg.c2 c2Var = this.e;
        c2Var.g.size();
        String str = c2Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(zu0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.c, zu0Var.F1, true);
        a5Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        a5Var.setDelegate(new ot0(this));
        return new wk0(a5Var);
    }
}
