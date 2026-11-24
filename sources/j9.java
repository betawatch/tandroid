// default package

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j9 extends fy0 implements it4 {
    public final c4c S1;
    public final LongSparseArray T1;
    public ArrayList U1;
    public boolean V1;
    public l5c W1;
    public int X1;

    public j9(Context context) {
        super(context, null, false, false, 2, null);
        this.T1 = new LongSparseArray();
        this.U1 = new ArrayList();
        int i = 0;
        int w0 = bkb.w0(null, bkb.Z6, false);
        this.X1 = w0;
        s0(w0);
        kt4.c(this.a).f.add(this);
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        K();
        LinearLayout linearLayout = new LinearLayout(context);
        byte b = 1;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.S1 = c4c.j(-1, linearLayout);
        this.n1.setPadding(this.u0, gl.L(9.0f), this.u0, gl.L(9.0f));
        this.n1.setOverScrollMode(2);
        this.W1.O(false);
        ArrayList arrayList = kt4.c(this.a).c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gt4 gt4Var = (gt4) obj;
            i9 i9Var = new i9(context, gt4Var);
            i9Var.a.setOnClickListener(new b0(this, context, gt4Var, b));
            linearLayout.addView(i9Var, nme.o(-1, -2));
            this.T1.put(gt4Var.b, i9Var);
        }
        c(arrayList);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 4), this.J0);
        this.W1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        ArrayList arrayList = this.U1;
        if (arrayList == null) {
            return null;
        }
        return k96.a0(null, null, 2131750402, Integer.valueOf(arrayList.size()));
    }

    @Override // it4
    public final void c(ArrayList arrayList) {
        this.U1 = new ArrayList(arrayList);
        this.o1.setTitle(J0());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gt4 gt4Var = (gt4) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var.f;
            int i2 = tL_starGiftAuctionState != null ? tL_starGiftAuctionState.next_round_at : 0;
            i9 i9Var = (i9) this.T1.get(gt4Var.b);
            if (i9Var != null) {
                i9Var.b(this.V1);
                long max = Math.max(0, i2 - ConnectionsManager.getInstance(this.a).getCurrentTime());
                i9Var.a(max, this.V1);
                i9Var.f.a(max);
            }
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        kt4.c(this.a).f.remove(this);
        super.dismiss();
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            int w0 = bkb.w0(null, bkb.Z6, false);
            if (w0 != this.X1) {
                this.X1 = w0;
                s0(w0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // fx0
    public final void x() {
        this.V1 = true;
    }
}
