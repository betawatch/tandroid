package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ru0 extends lm0 {
    public final Context c;
    public final ig.a2 e;
    public qu0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ aw0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public ru0(aw0 aw0Var, Context context) {
        this.s = aw0Var;
        this.c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.e = a2Var;
        a2Var.a = new pu0(this);
        this.n = aw0Var.F1.g();
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        ig.a2 a2Var = this.e;
        int size = a2Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) a2Var.g.get(i10);
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
            tu0[] tu0VarArr = this.s.m0;
            if (i10 >= tu0VarArr.length) {
                break;
            }
            if (tu0VarArr[i10].E == 7 && !TextUtils.isEmpty(str)) {
                this.s.m0[i10].v.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        qu0 qu0Var = new qu0(this, str, 0);
        this.f = qu0Var;
        dispatchQueue2.postRunnable(qu0Var, 300L);
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
            aw0 aw0Var = this.s;
            if (aw0Var.X0) {
                tu0 tu0Var = aw0Var.m0[0];
                if (tu0Var.E == 7 && tu0Var.h.getAdapter() != this) {
                    aw0Var.v1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        aw0 aw0Var = this.s;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = r2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = r2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        ig.a2 a2Var = this.e;
        a2Var.g.size();
        String str = a2Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.q6, aw0Var.H1), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
            f5Var.setTag(Integer.valueOf(i10));
            f5Var.c(user, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        aw0 aw0Var = this.s;
        org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(9, 5, this.c, aw0Var.H1, true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f5Var, aw0Var.H1);
        f5Var.setDelegate(new pu0(this));
        return new vl0(f5Var);
    }
}
