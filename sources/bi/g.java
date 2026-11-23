package bi;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.messenger.s9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ra;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g extends ra implements s9 {
    public final n41 T1;
    public final LongSparseArray U1;
    public ArrayList V1;
    public boolean W1;
    public b51 X1;
    public int Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, null, false, false, 2, null);
        int i7 = 0;
        this.U1 = new LongSparseArray();
        this.V1 = new ArrayList();
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false);
        this.Y1 = x02;
        v0(x02);
        u9.c(this.a).f.add(this);
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = n41.j(-1, linearLayout);
        this.o1.setPadding(this.u0, org.telegram.messenger.g0.L(9.0f), this.u0, org.telegram.messenger.g0.L(9.0f));
        this.o1.setOverScrollMode(2);
        this.X1.O(false);
        ArrayList arrayList = u9.c(this.a).c;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q9 q9Var = (q9) obj;
            f fVar = new f(context, q9Var);
            fVar.a.setOnClickListener(new ah.h(this, context, q9Var, 1));
            linearLayout.addView(fVar, na.o(-1, -2));
            this.U1.put(q9Var.b, fVar);
        }
        g(arrayList);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.o1, getContext(), this.a, 0, true, new b(this, 1), this.J0);
        this.X1 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        ArrayList arrayList = this.V1;
        if (arrayList == null) {
            return null;
        }
        return gd.a0(null, null, 2131750401, Integer.valueOf(arrayList.size()));
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        u9.c(this.a).f.remove(this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.s9
    public final void g(ArrayList arrayList) {
        this.V1 = new ArrayList(arrayList);
        this.p1.setTitle(P0());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q9 q9Var = (q9) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f;
            int i10 = tL_starGiftAuctionState != null ? tL_starGiftAuctionState.next_round_at : 0;
            f fVar = (f) this.U1.get(q9Var.b);
            if (fVar != null) {
                fVar.b(this.W1);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.a).getCurrentTime());
                fVar.a(max, this.W1);
                fVar.f.a(max);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false);
            if (x02 != this.Y1) {
                this.Y1 = x02;
                v0(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.W1 = true;
    }
}
