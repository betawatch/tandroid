package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j7 extends f7 {
    public final ArrayList f;
    public final /* synthetic */ t7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.f7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.h != null) {
            for (int i7 = 0; i7 < t7Var.h.b.size(); i7++) {
                s6 s6Var = (s6) t7Var.h.b.get(i7);
                m7 m7Var = new m7(1, true);
                m7Var.c = s6Var;
                arrayList2.add(m7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String H;
        if (d1Var.f != 1) {
            return;
        }
        x6 x6Var = (x6) d1Var.a;
        ArrayList arrayList = this.e;
        s6 s6Var = ((m7) arrayList.get(i7)).c;
        t7 t7Var = this.h;
        TLObject e22 = t7Var.e.getMessagesController().e2(s6Var.a);
        s6 s6Var2 = x6Var.a;
        boolean z9 = s6Var2 != null && s6Var2.a == s6Var.a;
        if (s6Var.a == Long.MAX_VALUE) {
            H = org.telegram.messenger.hd.M0(2131752647, null);
            x6Var.getImageView().getAvatarDrawable().g(14);
            x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
        } else {
            org.telegram.ui.Components.l9 imageView = x6Var.getImageView();
            H = imageView != null ? org.telegram.messenger.m5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), e22) : org.telegram.messenger.m5.H(null, null, e22);
        }
        x6Var.a = s6Var;
        x6Var.getImageView().setRoundRadius(org.telegram.messenger.g0.L(((e22 instanceof TLRPC.Chat) && ((TLRPC.Chat) e22).forum) ? 12.0f : 19.0f));
        String i02 = org.telegram.messenger.g0.i0(s6Var.c, false, false);
        boolean z10 = i7 < arrayList.size() - 1;
        org.telegram.ui.Components.j6 j6Var = x6Var.d;
        TextView textView = x6Var.c;
        textView.setText(org.telegram.messenger.i6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
        j6Var.c(i02, false, true);
        j6Var.setVisibility(0);
        x6Var.f = z10;
        x6Var.setWillNotDraw(!z10);
        x6Var.requestLayout();
        boolean contains = t7Var.h.l.contains(Long.valueOf(s6Var.a));
        org.telegram.ui.Components.wo woVar = x6Var.n;
        if (woVar != null || contains) {
            if (woVar == null) {
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(21, x6Var.getContext(), x6Var.b);
                x6Var.n = woVar2;
                woVar2.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                x6Var.n.setDrawUnchecked(false);
                x6Var.n.setDrawBackgroundAsArc(3);
                x6Var.addView(x6Var.n, c8.ha.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.n.a(contains, z9);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.xi0(i7 == 1 ? new x6(this.h.getContext(), null) : null);
    }
}
