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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hu0 extends yl0 {
    public final Context c;
    public final gg.c2 e;
    public gu0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ qv0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public hu0(qv0 qv0Var, Context context) {
        this.s = qv0Var;
        this.c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.a = new fu0(this);
        this.n = qv0Var.D1.g();
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.yl0
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
            ju0[] ju0VarArr = this.s.k0;
            if (i10 >= ju0VarArr.length) {
                break;
            }
            if (ju0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.k0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        gu0 gu0Var = new gu0(this, str, 0);
        this.f = gu0Var;
        dispatchQueue.postRunnable(gu0Var, 300L);
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
            qv0 qv0Var = this.s;
            if (qv0Var.V0) {
                ju0 ju0Var = qv0Var.k0[0];
                if (ju0Var.F == 7 && ju0Var.h.getAdapter() != this) {
                    qv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        qv0 qv0Var = this.s;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(qv0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var = this.s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.c, qv0Var.F1, true);
        b5Var.setBackgroundColor(qv0Var.h0(org.telegram.ui.ActionBar.i6.d6));
        b5Var.setDelegate(new fu0(this));
        return new il0(b5Var);
    }
}
