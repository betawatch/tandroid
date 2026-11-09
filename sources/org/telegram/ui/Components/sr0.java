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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sr0 extends pj0 {
    public final Context c;
    public final jg.z1 e;
    public rr0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ zs0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public sr0(zs0 zs0Var, Context context) {
        this.s = zs0Var;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.e = z1Var;
        z1Var.a = new qr0(this);
        this.n = zs0Var.F1.g();
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.pj0
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
            ur0[] ur0VarArr = this.s.m0;
            if (i7 >= ur0VarArr.length) {
                break;
            }
            if (ur0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.s.m0[i7].w.e(true, z9);
            }
            i7++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.g;
        rr0 rr0Var = new rr0(this, str, 0);
        this.f = rr0Var;
        p5Var.d(rr0Var, 300L);
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
            zs0 zs0Var = this.s;
            if (zs0Var.X0) {
                ur0 ur0Var = zs0Var.m0[0];
                if (ur0Var.E == 7 && ur0Var.h.getAdapter() != this) {
                    zs0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        zs0 zs0Var = this.s;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
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
                spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.l6.q6, zs0Var.H1), A1, str.length() + A1, 33);
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
        zs0 zs0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 9, 5, true, zs0Var.H1);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, a5Var, zs0Var.H1);
        a5Var.setDelegate(new qr0(this));
        return new yi0(a5Var);
    }
}
