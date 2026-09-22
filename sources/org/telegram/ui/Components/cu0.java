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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class cu0 extends xl0 {
    public final Context c;
    public final gg.c2 e;
    public bu0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ lv0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public cu0(lv0 lv0Var, Context context) {
        this.s = lv0Var;
        this.c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.a = new au0(this);
        this.n = lv0Var.D1.g();
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.xl0
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
            eu0[] eu0VarArr = this.s.k0;
            if (i10 >= eu0VarArr.length) {
                break;
            }
            if (eu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.k0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        bu0 bu0Var = new bu0(this, str, 0);
        this.f = bu0Var;
        dispatchQueue.postRunnable(bu0Var, 300L);
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
            lv0 lv0Var = this.s;
            if (lv0Var.V0) {
                eu0 eu0Var = lv0Var.k0[0];
                if (eu0Var.F == 7 && eu0Var.h.getAdapter() != this) {
                    lv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        lv0 lv0Var = this.s;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(lv0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
            c5Var.setTag(Integer.valueOf(i10));
            c5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = this.s;
        org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(9, 5, this.c, lv0Var.F1, true);
        c5Var.setBackgroundColor(lv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        c5Var.setDelegate(new au0(this));
        return new il0(c5Var);
    }
}
