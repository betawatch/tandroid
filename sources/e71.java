// default package

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e71 extends a71 {
    public final ArrayList f;
    public final /* synthetic */ o71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(o71 o71Var) {
        super(0);
        this.h = o71Var;
        this.f = new ArrayList();
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // a71
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        o71 o71Var = this.h;
        if (o71Var.h != null) {
            for (int i = 0; i < o71Var.h.b.size(); i++) {
                l61 l61Var = (l61) o71Var.h.b.get(i);
                h71 h71Var = new h71(1, true);
                h71Var.c = l61Var;
                arrayList2.add(h71Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String G;
        if (s49Var.f == 1) {
            q61 q61Var = (q61) s49Var.a;
            ArrayList arrayList = this.e;
            l61 l61Var = ((h71) arrayList.get(i)).c;
            o71 o71Var = this.h;
            TLObject Z1 = o71Var.e.getMessagesController().Z1(l61Var.a);
            l61 l61Var2 = q61Var.a;
            boolean z = l61Var2 != null && l61Var2.a == l61Var.a;
            if (l61Var.a == Long.MAX_VALUE) {
                G = k96.M0(2131752635, null);
                q61Var.getImageView().getAvatarDrawable().f(14);
                q61Var.getImageView().f(null, q61Var.getImageView().getAvatarDrawable());
            } else {
                be0 imageView = q61Var.getImageView();
                G = imageView != null ? cf3.G(imageView.getImageReceiver(), imageView.getAvatarDrawable(), Z1) : cf3.G(null, null, Z1);
            }
            q61Var.a = l61Var;
            q61Var.getImageView().setRoundRadius(gl.L(((Z1 instanceof TLRPC.Chat) && ((TLRPC.Chat) Z1).forum) ? 12.0f : 19.0f));
            String i0 = gl.i0(l61Var.c, false, false);
            boolean z2 = i < arrayList.size() - 1;
            TextView textView = q61Var.c;
            textView.setText(vu3.m(G, textView.getPaint().getFontMetricsInt(), false, null, 0));
            hn hnVar = q61Var.d;
            hnVar.c(i0, false, true);
            hnVar.setVisibility(0);
            q61Var.f = z2;
            q61Var.setWillNotDraw(!z2);
            q61Var.requestLayout();
            boolean contains = o71Var.h.l.contains(Long.valueOf(l61Var.a));
            if (q61Var.n == null) {
                if (!contains) {
                    return;
                }
                wf2 wf2Var = new wf2(21, q61Var.b, q61Var.getContext());
                q61Var.n = wf2Var;
                wf2Var.b(-1, bkb.c6, bkb.j7);
                q61Var.n.setDrawUnchecked(false);
                q61Var.n.setDrawBackgroundAsArc(3);
                q61Var.addView(q61Var.n, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            q61Var.n.a(contains, z);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(i == 1 ? new q61(this.h.getContext(), null) : null);
    }
}
