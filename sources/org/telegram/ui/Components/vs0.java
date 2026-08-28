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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vs0 extends vk0 {
    public final Context c;
    public final of.v1 e;
    public us0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ eu0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public vs0(eu0 eu0Var, Context context) {
        this.s = eu0Var;
        this.c = context;
        of.v1 v1Var = new of.v1(true);
        this.e = v1Var;
        v1Var.a = new ts0(this);
        this.n = eu0Var.z1.g();
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final TLObject E(int i9) {
        of.v1 v1Var = this.e;
        int size = v1Var.g.size();
        if (i9 < 0 || i9 >= size) {
            return null;
        }
        return (TLObject) v1Var.g.get(i9);
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
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.s.g0;
            if (i9 >= xs0VarArr.length) {
                break;
            }
            if (xs0VarArr[i9].B == 7 && !TextUtils.isEmpty(str)) {
                this.s.g0[i9].w.e(true, z10);
            }
            i9++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        us0 us0Var = new us0(this, str, 0);
        this.f = us0Var;
        dispatchQueue.postRunnable(us0Var, 300L);
    }

    @Override // f2.r0
    public final int h() {
        return this.h;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 22;
    }

    @Override // f2.r0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            eu0 eu0Var = this.s;
            if (eu0Var.R0) {
                xs0 xs0Var = eu0Var.g0[0];
                if (xs0Var.B == 7 && xs0Var.h.getAdapter() != this) {
                    eu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        eu0 eu0Var = this.s;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        TLObject E = E(i9);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        of.v1 v1Var = this.e;
        v1Var.g.size();
        String str = v1Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(eu0Var.h0(org.telegram.ui.ActionBar.f6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i9));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.c, eu0Var.B1, true);
        b5Var.setBackgroundColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.d6));
        b5Var.setDelegate(new ts0(this));
        return new ik0(b5Var);
    }
}
