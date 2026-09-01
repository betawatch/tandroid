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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pt0 extends sl0 {
    public final Context c;
    public final uf.k1 e;
    public ot0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ zu0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public pt0(zu0 zu0Var, Context context) {
        this.s = zu0Var;
        this.c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.e = k1Var;
        k1Var.a = new nt0(this);
        this.n = zu0Var.A1.g();
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        uf.k1 k1Var = this.e;
        int size = k1Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) k1Var.g.get(i10);
    }

    public final void F(String str, boolean z4) {
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
            rt0[] rt0VarArr = this.s.h0;
            if (i10 >= rt0VarArr.length) {
                break;
            }
            if (rt0VarArr[i10].C == 7 && !TextUtils.isEmpty(str)) {
                this.s.h0[i10].w.e(true, z4);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ot0 ot0Var = new ot0(this, str, 0);
        this.f = ot0Var;
        dispatchQueue.postRunnable(ot0Var, 300L);
    }

    @Override // f2.p0
    public final int h() {
        return this.h;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 22;
    }

    @Override // f2.p0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            zu0 zu0Var = this.s;
            if (zu0Var.S0) {
                rt0 rt0Var = zu0Var.h0[0];
                if (rt0Var.C == 7 && rt0Var.h.getAdapter() != this) {
                    zu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        zu0 zu0Var = this.s;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        uf.k1 k1Var = this.e;
        k1Var.g.size();
        String str = k1Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(zu0Var.h0(org.telegram.ui.ActionBar.k6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.c, zu0Var.C1, true);
        b5Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.d6));
        b5Var.setDelegate(new nt0(this));
        return new fl0(b5Var);
    }
}
