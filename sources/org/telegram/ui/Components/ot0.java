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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ot0 extends ql0 {
    public final Context c;
    public final tf.j1 e;
    public nt0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ yu0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public ot0(yu0 yu0Var, Context context) {
        this.s = yu0Var;
        this.c = context;
        tf.j1 j1Var = new tf.j1(true);
        this.e = j1Var;
        j1Var.a = new mt0(this);
        this.n = yu0Var.A1.g();
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        tf.j1 j1Var = this.e;
        int size = j1Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) j1Var.g.get(i10);
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
            qt0[] qt0VarArr = this.s.h0;
            if (i10 >= qt0VarArr.length) {
                break;
            }
            if (qt0VarArr[i10].C == 7 && !TextUtils.isEmpty(str)) {
                this.s.h0[i10].w.e(true, z4);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        nt0 nt0Var = new nt0(this, str, 0);
        this.f = nt0Var;
        dispatchQueue.postRunnable(nt0Var, 300L);
    }

    @Override // f2.o0
    public final int h() {
        return this.h;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 22;
    }

    @Override // f2.o0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            yu0 yu0Var = this.s;
            if (yu0Var.S0) {
                qt0 qt0Var = yu0Var.h0[0];
                if (qt0Var.C == 7 && qt0Var.h.getAdapter() != this) {
                    yu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        yu0 yu0Var = this.s;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        tf.j1 j1Var = this.e;
        j1Var.g.size();
        String str = j1Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(yu0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.c, yu0Var.C1, true);
        a5Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        a5Var.setDelegate(new mt0(this));
        return new dl0(a5Var);
    }
}
