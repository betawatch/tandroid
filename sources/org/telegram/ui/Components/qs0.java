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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qs0 extends sk0 {
    public final Context c;
    public final zf.m1 e;
    public ps0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ zt0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public qs0(zt0 zt0Var, Context context) {
        this.s = zt0Var;
        this.c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.e = m1Var;
        m1Var.a = new os0(this);
        this.n = zt0Var.F1.g();
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        zf.m1 m1Var = this.e;
        int size = m1Var.g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) m1Var.g.get(i10);
    }

    public final void F(String str, boolean z10) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, false, true, false, org.telegram.messenger.w3.T(this.n) ? this.n.id : 0L, false, 2, 0);
        f();
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.s.m0;
            if (i10 >= ss0VarArr.length) {
                break;
            }
            if (ss0VarArr[i10].E == 7 && !TextUtils.isEmpty(str)) {
                this.s.m0[i10].w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.g;
        ps0 ps0Var = new ps0(this, str, 0);
        this.f = ps0Var;
        r5Var.d(ps0Var, 300L);
    }

    @Override // s4.g0
    public final int b() {
        return this.h;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 22;
    }

    @Override // s4.g0
    public final void f() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            zt0 zt0Var = this.s;
            if (zt0Var.X0) {
                ss0 ss0Var = zt0Var.m0[0];
                if (ss0Var.E == 7 && ss0Var.h.getAdapter() != this) {
                    zt0Var.w1(false);
                }
            }
        }
        super.f();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.User Z1;
        SpannableStringBuilder spannableStringBuilder;
        zt0 zt0Var = this.s;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            Z1 = k2Var.getMessagesController().Z1(Long.valueOf(org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            Z1 = k2Var.getMessagesController().Z1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        org.telegram.messenger.h20.n(Z1);
        zf.m1 m1Var = this.e;
        m1Var.g.size();
        String str = m1Var.n;
        if (str != null) {
            String p5 = org.telegram.messenger.h20.p(Z1);
            spannableStringBuilder = new SpannableStringBuilder(p5);
            int A1 = org.telegram.messenger.i0.A1(p5, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, zt0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            e5Var.setTag(Integer.valueOf(i10));
            e5Var.c(Z1, spannableStringBuilder, null, false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.s;
        org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(9, 5, this.c, zt0Var.H1, true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, e5Var, zt0Var.H1);
        e5Var.setDelegate(new os0(this));
        return new ck0(e5Var);
    }
}
