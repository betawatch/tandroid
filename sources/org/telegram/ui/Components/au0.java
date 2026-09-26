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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class au0 extends vl0 {
    public final Context c;
    public final gg.c2 e;
    public zt0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ jv0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public au0(jv0 jv0Var, Context context) {
        this.s = jv0Var;
        this.c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.a = new yt0(this);
        this.n = jv0Var.D1.g();
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vl0
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
            cu0[] cu0VarArr = this.s.k0;
            if (i10 >= cu0VarArr.length) {
                break;
            }
            if (cu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.k0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        zt0 zt0Var = new zt0(this, str, 0);
        this.f = zt0Var;
        dispatchQueue.postRunnable(zt0Var, 300L);
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
            jv0 jv0Var = this.s;
            if (jv0Var.V0) {
                cu0 cu0Var = jv0Var.k0[0];
                if (cu0Var.F == 7 && cu0Var.h.getAdapter() != this) {
                    jv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        jv0 jv0Var = this.s;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(jv0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
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
        jv0 jv0Var = this.s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.c, jv0Var.F1, true);
        b5Var.setBackgroundColor(jv0Var.h0(org.telegram.ui.ActionBar.h6.d6));
        b5Var.setDelegate(new yt0(this));
        return new gl0(b5Var);
    }
}
