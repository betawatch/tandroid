package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
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
            for (int i10 = 0; i10 < t7Var.h.b.size(); i10++) {
                s6 s6Var = (s6) t7Var.h.b.get(i10);
                m7 m7Var = new m7(1, true);
                m7Var.c = s6Var;
                arrayList2.add(m7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String H;
        if (c1Var.f != 1) {
            return;
        }
        x6 x6Var = (x6) c1Var.a;
        ArrayList arrayList = this.e;
        s6 s6Var = ((m7) arrayList.get(i10)).c;
        t7 t7Var = this.h;
        TLObject d22 = t7Var.e.getMessagesController().d2(s6Var.a);
        s6 s6Var2 = x6Var.a;
        boolean z10 = s6Var2 != null && s6Var2.a == s6Var.a;
        if (s6Var.a == Long.MAX_VALUE) {
            H = org.telegram.messenger.cd.L0(2131752647, null);
            x6Var.getImageView().getAvatarDrawable().g(14);
            x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
        } else {
            org.telegram.ui.Components.g9 imageView = x6Var.getImageView();
            H = imageView != null ? org.telegram.messenger.o5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), d22) : org.telegram.messenger.o5.H(null, null, d22);
        }
        x6Var.a = s6Var;
        x6Var.getImageView().setRoundRadius(org.telegram.messenger.i0.L(((d22 instanceof TLRPC.Chat) && ((TLRPC.Chat) d22).forum) ? 12.0f : 19.0f));
        String i02 = org.telegram.messenger.i0.i0(s6Var.c, false, false);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.f6 f6Var = x6Var.d;
        TextView textView = x6Var.c;
        textView.setText(org.telegram.messenger.k6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
        f6Var.c(i02, false, true);
        f6Var.setVisibility(0);
        x6Var.f = z11;
        x6Var.setWillNotDraw(!z11);
        x6Var.requestLayout();
        boolean contains = t7Var.h.l.contains(Long.valueOf(s6Var.a));
        org.telegram.ui.Components.ep epVar = x6Var.n;
        if (epVar != null || contains) {
            if (epVar == null) {
                org.telegram.ui.Components.ep epVar2 = new org.telegram.ui.Components.ep(21, x6Var.getContext(), x6Var.b);
                x6Var.n = epVar2;
                epVar2.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
                x6Var.n.setDrawUnchecked(false);
                x6Var.n.setDrawBackgroundAsArc(3);
                x6Var.addView(x6Var.n, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.n.a(contains, z10);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.ck0(i10 == 1 ? new x6(this.h.getContext(), null) : null);
    }
}
