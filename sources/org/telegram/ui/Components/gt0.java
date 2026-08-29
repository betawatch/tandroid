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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gt0 extends il0 {
    public final Context c;
    public final rf.k1 e;
    public ft0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ qu0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public gt0(qu0 qu0Var, Context context) {
        this.s = qu0Var;
        this.c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.e = k1Var;
        k1Var.a = new et0(this);
        this.n = qu0Var.z1.g();
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        rf.k1 k1Var = this.e;
        int size = k1Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) k1Var.g.get(i10);
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
            it0[] it0VarArr = this.s.g0;
            if (i10 >= it0VarArr.length) {
                break;
            }
            if (it0VarArr[i10].B == 7 && !TextUtils.isEmpty(str)) {
                this.s.g0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ft0 ft0Var = new ft0(this, str, 0);
        this.f = ft0Var;
        dispatchQueue.postRunnable(ft0Var, 300L);
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
            qu0 qu0Var = this.s;
            if (qu0Var.R0) {
                it0 it0Var = qu0Var.g0[0];
                if (it0Var.B == 7 && it0Var.h.getAdapter() != this) {
                    qu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        qu0 qu0Var = this.s;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        rf.k1 k1Var = this.e;
        k1Var.g.size();
        String str = k1Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(qu0Var.h0(org.telegram.ui.ActionBar.g6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
            z4Var.setTag(Integer.valueOf(i10));
            z4Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = this.s;
        org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(9, 5, this.c, qu0Var.B1, true);
        z4Var.setBackgroundColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.d6));
        z4Var.setDelegate(new et0(this));
        return new vk0(z4Var);
    }
}
