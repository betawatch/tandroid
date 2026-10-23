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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class lu0 extends im0 {
    public final Context c;
    public final hg.a2 e;
    public ku0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ uv0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public lu0(uv0 uv0Var, Context context) {
        this.s = uv0Var;
        this.c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.e = a2Var;
        a2Var.a = new ju0(this);
        this.n = uv0Var.D1.g();
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.e;
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
            nu0[] nu0VarArr = this.s.k0;
            if (i10 >= nu0VarArr.length) {
                break;
            }
            if (nu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.k0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ku0 ku0Var = new ku0(this, str, 0);
        this.f = ku0Var;
        dispatchQueue.postRunnable(ku0Var, 300L);
    }

    @Override // s4.g0
    public final int h() {
        return this.h;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 22;
    }

    @Override // s4.g0
    public final void l() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            uv0 uv0Var = this.s;
            if (uv0Var.V0) {
                nu0 nu0Var = uv0Var.k0[0];
                if (nu0Var.F == 7 && nu0Var.h.getAdapter() != this) {
                    uv0Var.o1(false);
                }
            }
        }
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        uv0 uv0Var = this.s;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        UserObject.getPublicUsername(user);
        hg.a2 a2Var = this.e;
        a2Var.g.size();
        String str = a2Var.n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(uv0Var.i0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        uv0 uv0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.c, uv0Var.F1, true);
        a5Var.setBackgroundColor(uv0Var.i0(org.telegram.ui.ActionBar.h6.d6));
        a5Var.setDelegate(new ju0(this));
        return new tl0(a5Var);
    }
}
