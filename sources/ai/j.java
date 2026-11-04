package ai;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.m9;
import org.telegram.messenger.o9;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends ma implements o9 {
    public final r31 Q1;
    public final LongSparseArray R1;
    public ArrayList S1;
    public boolean T1;
    public f41 U1;
    public int V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, null, false, false, 2, null);
        int i3 = 0;
        this.R1 = new LongSparseArray();
        this.S1 = new ArrayList();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
        this.V1 = x02;
        v0(x02);
        q9.c(this.a).f.add(this);
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Q1 = r31.j(-1, linearLayout);
        this.l1.setPadding(this.u0, org.telegram.messenger.g0.L(9.0f), this.u0, org.telegram.messenger.g0.L(9.0f));
        this.l1.setOverScrollMode(2);
        this.U1.O(false);
        ArrayList arrayList = q9.c(this.a).c;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            m9 m9Var = (m9) obj;
            i iVar = new i(context, m9Var);
            iVar.a.setOnClickListener(new h(this, context, m9Var, 0));
            linearLayout.addView(iVar, mf.o(-1, -2));
            this.R1.put(m9Var.b, iVar);
        }
        g(arrayList);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new c(this, 1), this.J0);
        this.U1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        ArrayList arrayList = this.S1;
        if (arrayList == null) {
            return null;
        }
        return bd.a0(null, null, 2131750426, Integer.valueOf(arrayList.size()));
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        q9.c(this.a).f.remove(this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.o9
    public final void g(ArrayList arrayList) {
        this.S1 = new ArrayList(arrayList);
        this.m1.setTitle(O0());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            m9 m9Var = (m9) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = m9Var.f;
            int i10 = tL_starGiftAuctionState != null ? tL_starGiftAuctionState.next_round_at : 0;
            i iVar = (i) this.R1.get(m9Var.b);
            if (iVar != null) {
                iVar.b(this.T1);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.a).getCurrentTime());
                iVar.a(max, this.T1);
                iVar.f.a(max);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
            if (x02 != this.V1) {
                this.V1 = x02;
                v0(x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.T1 = true;
    }
}
