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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xs0 extends yk0 {
    public final Context c;
    public final pf.j1 e;
    public ws0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ hu0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public xs0(hu0 hu0Var, Context context) {
        this.s = hu0Var;
        this.c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.e = j1Var;
        j1Var.a = new vs0(this);
        this.n = hu0Var.z1.g();
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        pf.j1 j1Var = this.e;
        int size = j1Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) j1Var.g.get(i10);
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
            zs0[] zs0VarArr = this.s.g0;
            if (i10 >= zs0VarArr.length) {
                break;
            }
            if (zs0VarArr[i10].B == 7 && !TextUtils.isEmpty(str)) {
                this.s.g0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ws0 ws0Var = new ws0(this, str, 0);
        this.f = ws0Var;
        dispatchQueue.postRunnable(ws0Var, 300L);
    }

    @Override // f2.q0
    public final int h() {
        return this.h;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 22;
    }

    @Override // f2.q0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            hu0 hu0Var = this.s;
            if (hu0Var.R0) {
                zs0 zs0Var = hu0Var.g0[0];
                if (zs0Var.B == 7 && zs0Var.h.getAdapter() != this) {
                    hu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        hu0 hu0Var = this.s;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        pf.j1 j1Var = this.e;
        j1Var.g.size();
        String str = j1Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(hu0Var.h0(org.telegram.ui.ActionBar.g6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.setTag(Integer.valueOf(i10));
            y4Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.s;
        org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(9, 5, this.c, hu0Var.B1, true);
        y4Var.setBackgroundColor(hu0Var.h0(org.telegram.ui.ActionBar.g6.d6));
        y4Var.setDelegate(new vs0(this));
        return new lk0(y4Var);
    }
}
