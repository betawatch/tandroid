package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k7 extends g7 {
    public final ArrayList f;
    public final /* synthetic */ u7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.g7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.h != null) {
            for (int i3 = 0; i3 < u7Var.h.b.size(); i3++) {
                t6 t6Var = (t6) u7Var.h.b.get(i3);
                n7 n7Var = new n7(1, true);
                n7Var.c = t6Var;
                arrayList2.add(n7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String H;
        if (d1Var.f != 1) {
            return;
        }
        y6 y6Var = (y6) d1Var.a;
        ArrayList arrayList = this.e;
        t6 t6Var = ((n7) arrayList.get(i3)).c;
        u7 u7Var = this.h;
        TLObject e22 = u7Var.e.getMessagesController().e2(t6Var.a);
        t6 t6Var2 = y6Var.a;
        boolean z10 = t6Var2 != null && t6Var2.a == t6Var.a;
        if (t6Var.a == Long.MAX_VALUE) {
            H = org.telegram.messenger.bd.M0(2131752647, null);
            y6Var.getImageView().getAvatarDrawable().g(14);
            y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
        } else {
            org.telegram.ui.Components.k9 imageView = y6Var.getImageView();
            H = imageView != null ? org.telegram.messenger.m5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), e22) : org.telegram.messenger.m5.H(null, null, e22);
        }
        y6Var.a = t6Var;
        y6Var.getImageView().setRoundRadius(org.telegram.messenger.g0.L(((e22 instanceof TLRPC.Chat) && ((TLRPC.Chat) e22).forum) ? 12.0f : 19.0f));
        String i02 = org.telegram.messenger.g0.i0(t6Var.c, false, false);
        boolean z11 = i3 < arrayList.size() - 1;
        org.telegram.ui.Components.h6 h6Var = y6Var.d;
        TextView textView = y6Var.c;
        textView.setText(org.telegram.messenger.i6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
        h6Var.c(i02, false, true);
        h6Var.setVisibility(0);
        y6Var.f = z11;
        y6Var.setWillNotDraw(!z11);
        y6Var.requestLayout();
        boolean contains = u7Var.h.l.contains(Long.valueOf(t6Var.a));
        org.telegram.ui.Components.wo woVar = y6Var.n;
        if (woVar != null || contains) {
            if (woVar == null) {
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(21, y6Var.getContext(), y6Var.b);
                y6Var.n = woVar2;
                woVar2.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                y6Var.n.setDrawUnchecked(false);
                y6Var.n.setDrawBackgroundAsArc(3);
                y6Var.addView(y6Var.n, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.n.a(contains, z10);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new org.telegram.ui.Components.bj0(i3 == 1 ? new y6(this.h.getContext(), null) : null);
    }
}
