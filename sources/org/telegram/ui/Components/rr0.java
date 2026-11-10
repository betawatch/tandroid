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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rr0 extends oj0 {
    public final Context c;
    public final jg.z1 e;
    public qr0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ ys0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public rr0(ys0 ys0Var, Context context) {
        this.s = ys0Var;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.e = z1Var;
        z1Var.a = new pr0(this);
        this.n = ys0Var.F1.g();
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.e;
        int size = z1Var.g.size();
        if (i7 < 0 || i7 >= size) {
            return null;
        }
        return (TLObject) z1Var.g.get(i7);
    }

    public final void F(String str, boolean z9) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, false, true, false, org.telegram.messenger.t3.T(this.n) ? this.n.id : 0L, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.s.m0;
            if (i7 >= tr0VarArr.length) {
                break;
            }
            if (tr0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.s.m0[i7].w.e(true, z9);
            }
            i7++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.g;
        qr0 qr0Var = new qr0(this, str, 0);
        this.f = qr0Var;
        p5Var.d(qr0Var, 300L);
    }

    @Override // v4.g0
    public final int b() {
        return this.h;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 22;
    }

    @Override // v4.g0
    public final void f() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            ys0 ys0Var = this.s;
            if (ys0Var.X0) {
                tr0 tr0Var = ys0Var.m0[0];
                if (tr0Var.E == 7 && tr0Var.h.getAdapter() != this) {
                    ys0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        ys0 ys0Var = this.s;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.x1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        org.telegram.messenger.t10.n(a22);
        jg.z1 z1Var = this.e;
        z1Var.g.size();
        String str = z1Var.n;
        if (str != null) {
            String p10 = org.telegram.messenger.t10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.m6.q6, ys0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 9, 5, true, ys0Var.H1);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, a5Var, ys0Var.H1);
        a5Var.setDelegate(new pr0(this));
        return new xi0(a5Var);
    }
}
