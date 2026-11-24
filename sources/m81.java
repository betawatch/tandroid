// default package

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m81 extends h81 {
    public final ArrayList f;
    public final /* synthetic */ w81 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m81(w81 w81Var) {
        super(0);
        this.h = w81Var;
        this.f = new ArrayList();
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // h81
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w81 w81Var = this.h;
        if (w81Var.h != null) {
            for (int i = 0; i < w81Var.h.b.size(); i++) {
                s71 s71Var = (s71) w81Var.h.b.get(i);
                p81 p81Var = new p81(1, true);
                p81Var.c = s71Var;
                arrayList2.add(p81Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String G;
        if (u69Var.f == 1) {
            x71 x71Var = (x71) u69Var.a;
            ArrayList arrayList = this.e;
            s71 s71Var = ((p81) arrayList.get(i)).c;
            w81 w81Var = this.h;
            TLObject a2 = w81Var.e.getMessagesController().a2(s71Var.a);
            s71 s71Var2 = x71Var.a;
            boolean z = s71Var2 != null && s71Var2.a == s71Var.a;
            if (s71Var.a == Long.MAX_VALUE) {
                G = jb6.M0(2131752600, null);
                x71Var.getImageView().getAvatarDrawable().f(14);
                x71Var.getImageView().f(null, x71Var.getImageView().getAvatarDrawable());
            } else {
                bf0 imageView = x71Var.getImageView();
                G = imageView != null ? pg3.G(imageView.getImageReceiver(), imageView.getAvatarDrawable(), a2) : pg3.G(null, null, a2);
            }
            x71Var.a = s71Var;
            x71Var.getImageView().setRoundRadius(gm.L(((a2 instanceof TLRPC.Chat) && ((TLRPC.Chat) a2).forum) ? 12.0f : 19.0f));
            String i0 = gm.i0(s71Var.c, false, false);
            boolean z2 = i < arrayList.size() - 1;
            TextView textView = x71Var.c;
            textView.setText(gw3.m(G, textView.getPaint().getFontMetricsInt(), false, null, 0));
            io ioVar = x71Var.d;
            ioVar.c(i0, false, true);
            ioVar.setVisibility(0);
            x71Var.f = z2;
            x71Var.setWillNotDraw(!z2);
            x71Var.requestLayout();
            boolean contains = w81Var.h.l.contains(Long.valueOf(s71Var.a));
            if (x71Var.n == null) {
                if (!contains) {
                    return;
                }
                jh2 jh2Var = new jh2(21, x71Var.b, x71Var.getContext());
                x71Var.n = jh2Var;
                jh2Var.b(-1, cmb.c6, cmb.j7);
                x71Var.n.setDrawUnchecked(false);
                x71Var.n.setDrawBackgroundAsArc(3);
                x71Var.addView(x71Var.n, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x71Var.n.a(contains, z);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(i == 1 ? new x71(this.h.getContext(), null) : null);
    }
}
