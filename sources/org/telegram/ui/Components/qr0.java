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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class qr0 extends oj0 {
    public final Context c;
    public final jg.z1 e;
    public pr0 f;
    public final TLRPC.Chat n;
    public final /* synthetic */ xs0 s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public qr0(xs0 xs0Var, Context context) {
        this.s = xs0Var;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.e = z1Var;
        z1Var.a = new or0(this);
        this.n = xs0Var.F1.g();
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
            sr0[] sr0VarArr = this.s.m0;
            if (i7 >= sr0VarArr.length) {
                break;
            }
            if (sr0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.s.m0[i7].w.e(true, z9);
            }
            i7++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.g;
        pr0 pr0Var = new pr0(this, str, 0);
        this.f = pr0Var;
        p5Var.d(pr0Var, 300L);
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
            xs0 xs0Var = this.s;
            if (xs0Var.X0) {
                sr0 sr0Var = xs0Var.m0[0];
                if (sr0Var.E == 7 && sr0Var.h.getAdapter() != this) {
                    xs0Var.z1(false);
                }
            }
        }
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        xs0 xs0Var = this.s;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) E).peer)));
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
                spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.q6, xs0Var.H1), A1, str.length() + A1, 33);
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
        xs0 xs0Var = this.s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 9, 5, true, xs0Var.H1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, a5Var, xs0Var.H1);
        a5Var.setDelegate(new or0(this));
        return new xi0(a5Var);
    }
}
