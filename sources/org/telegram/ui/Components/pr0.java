package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pr0 extends sj0 {
    public final Context c;
    public final kg.v1 e;
    public or0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ ws0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public pr0(ws0 ws0Var, Context context) {
        this.s = ws0Var;
        this.c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.e = v1Var;
        v1Var.a = new nr0(this);
        this.n = ws0Var.G1.g();
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i3) {
        kg.v1 v1Var = this.e;
        int size = v1Var.g.size();
        if (i3 < 0 || i3 >= size) {
            return null;
        }
        return (TLObject) v1Var.g.get(i3);
    }

    public final void F(String str, boolean z10) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, false, true, false, org.telegram.messenger.t3.T(this.n) ? this.n.id : 0L, false, 2, 0);
        f();
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.s.n0;
            if (i3 >= rr0VarArr.length) {
                break;
            }
            if (rr0VarArr[i3].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.n0[i3].w.e(true, z10);
            }
            i3++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.g;
        or0 or0Var = new or0(this, str, 0);
        this.f = or0Var;
        p5Var.e(or0Var, 300L);
    }

    @Override // u4.h0
    public final int b() {
        return this.h;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 22;
    }

    @Override // u4.h0
    public final void f() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            ws0 ws0Var = this.s;
            if (ws0Var.Y0) {
                rr0 rr0Var = ws0Var.n0[0];
                if (rr0Var.F == 7 && rr0Var.h.getAdapter() != this) {
                    ws0Var.z1(false);
                }
            }
        }
        super.f();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        ws0 ws0Var = this.s;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        TLObject E = E(i3);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = d2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            a22 = d2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        org.telegram.messenger.l10.n(a22);
        kg.v1 v1Var = this.e;
        v1Var.g.size();
        String str = v1Var.n;
        if (str != null) {
            String p10 = org.telegram.messenger.l10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.q6, ws0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i3));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 9, 5, true, ws0Var.I1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, a5Var, ws0Var.I1);
        a5Var.setDelegate(new nr0(this));
        return new bj0(a5Var);
    }
}
