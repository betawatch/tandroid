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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bs0 extends dk0 {
    public final Context c;
    public final jg.z1 e;
    public zr0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ it0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public bs0(it0 it0Var, Context context) {
        this.s = it0Var;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.e = z1Var;
        z1Var.a = new yr0(this);
        this.n = it0Var.G1.g();
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
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

    public final void F(String str, boolean z10) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, false, true, false, org.telegram.messenger.v3.T(this.n) ? this.n.id : 0L, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.s.n0;
            if (i7 >= ds0VarArr.length) {
                break;
            }
            if (ds0VarArr[i7].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.n0[i7].w.e(true, z10);
            }
            i7++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.g;
        zr0 zr0Var = new zr0(this, str, 0);
        this.f = zr0Var;
        q5Var.d(zr0Var, 300L);
    }

    @Override // v4.i0
    public final int b() {
        return this.h;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 22;
    }

    @Override // v4.i0
    public final void f() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            it0 it0Var = this.s;
            if (it0Var.Y0) {
                ds0 ds0Var = it0Var.n0[0];
                if (ds0Var.F == 7 && ds0Var.h.getAdapter() != this) {
                    it0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.User c22;
        SpannableStringBuilder spannableStringBuilder;
        it0 it0Var = this.s;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            c22 = g2Var.getMessagesController().c2(Long.valueOf(org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (!(E instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            c22 = g2Var.getMessagesController().c2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        }
        org.telegram.messenger.n10.o(c22);
        jg.z1 z1Var = this.e;
        z1Var.g.size();
        String str = z1Var.n;
        if (str != null) {
            String q10 = org.telegram.messenger.n10.q(c22);
            spannableStringBuilder = new SpannableStringBuilder(q10);
            int A1 = org.telegram.messenger.g0.A1(q10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.q6, it0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i7));
            b5Var.c(c22, spannableStringBuilder, null, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.c, 9, 5, true, it0Var.I1);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, b5Var, it0Var.I1);
        b5Var.setDelegate(new yr0(this));
        return new mj0(b5Var);
    }
}
