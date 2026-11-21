package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i7 extends e7 {
    public final ArrayList f;
    public final /* synthetic */ s7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(s7 s7Var) {
        super(0);
        this.h = s7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // org.telegram.ui.e7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        s7 s7Var = this.h;
        if (s7Var.h != null) {
            for (int i7 = 0; i7 < s7Var.h.b.size(); i7++) {
                r6 r6Var = (r6) s7Var.h.b.get(i7);
                l7 l7Var = new l7(1, true);
                l7Var.c = r6Var;
                arrayList2.add(l7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String H;
        if (f1Var.f != 1) {
            return;
        }
        w6 w6Var = (w6) f1Var.a;
        ArrayList arrayList = this.e;
        r6 r6Var = ((l7) arrayList.get(i7)).c;
        s7 s7Var = this.h;
        TLObject g22 = s7Var.e.getMessagesController().g2(r6Var.a);
        r6 r6Var2 = w6Var.a;
        boolean z10 = r6Var2 != null && r6Var2.a == r6Var.a;
        if (r6Var.a == Long.MAX_VALUE) {
            H = org.telegram.messenger.gd.N0(2131752635, null);
            w6Var.getImageView().getAvatarDrawable().g(14);
            w6Var.getImageView().f(null, w6Var.getImageView().getAvatarDrawable());
        } else {
            org.telegram.ui.Components.q9 imageView = w6Var.getImageView();
            H = imageView != null ? org.telegram.messenger.n5.H(imageView.getImageReceiver(), imageView.getAvatarDrawable(), g22) : org.telegram.messenger.n5.H(null, null, g22);
        }
        w6Var.a = r6Var;
        w6Var.getImageView().setRoundRadius(org.telegram.messenger.g0.L(((g22 instanceof TLRPC.Chat) && ((TLRPC.Chat) g22).forum) ? 12.0f : 19.0f));
        String i02 = org.telegram.messenger.g0.i0(r6Var.c, false, false);
        boolean z11 = i7 < arrayList.size() - 1;
        org.telegram.ui.Components.o6 o6Var = w6Var.d;
        TextView textView = w6Var.c;
        textView.setText(org.telegram.messenger.j6.m(H, textView.getPaint().getFontMetricsInt(), false, null, 0));
        o6Var.c(i02, false, true);
        o6Var.setVisibility(0);
        w6Var.f = z11;
        w6Var.setWillNotDraw(!z11);
        w6Var.requestLayout();
        boolean contains = s7Var.h.l.contains(Long.valueOf(r6Var.a));
        org.telegram.ui.Components.op opVar = w6Var.n;
        if (opVar != null || contains) {
            if (opVar == null) {
                org.telegram.ui.Components.op opVar2 = new org.telegram.ui.Components.op(21, w6Var.getContext(), w6Var.b);
                w6Var.n = opVar2;
                opVar2.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
                w6Var.n.setDrawUnchecked(false);
                w6Var.n.setDrawBackgroundAsArc(3);
                w6Var.addView(w6Var.n, c8.ma.d(24, 24.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            w6Var.n.a(contains, z10);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.mj0(i7 == 1 ? new w6(this.h.getContext(), null) : null);
    }
}
