// default package

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m71 extends i71 {
    public final ArrayList f;
    public final /* synthetic */ w71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(w71 w71Var) {
        super(0);
        this.h = w71Var;
        this.f = new ArrayList();
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // i71
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w71 w71Var = this.h;
        if (w71Var.h != null) {
            for (int i = 0; i < w71Var.h.b.size(); i++) {
                t61 t61Var = (t61) w71Var.h.b.get(i);
                p71 p71Var = new p71(1, true);
                p71Var.c = t61Var;
                arrayList2.add(p71Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String G;
        if (f89Var.f == 1) {
            y61 y61Var = (y61) f89Var.a;
            ArrayList arrayList = this.e;
            t61 t61Var = ((p71) arrayList.get(i)).c;
            w71 w71Var = this.h;
            TLObject b2 = w71Var.e.getMessagesController().b2(t61Var.a);
            t61 t61Var2 = y61Var.a;
            boolean z = t61Var2 != null && t61Var2.a == t61Var.a;
            if (t61Var.a == Long.MAX_VALUE) {
                G = ob6.M0(2131752628, null);
                y61Var.getImageView().getAvatarDrawable().f(14);
                y61Var.getImageView().f(null, y61Var.getImageView().getAvatarDrawable());
            } else {
                de0 imageView = y61Var.getImageView();
                G = imageView != null ? wf3.G(imageView.getImageReceiver(), imageView.getAvatarDrawable(), b2) : wf3.G(null, null, b2);
            }
            y61Var.a = t61Var;
            y61Var.getImageView().setRoundRadius(hl.L(((b2 instanceof TLRPC.Chat) && ((TLRPC.Chat) b2).forum) ? 12.0f : 19.0f));
            String i0 = hl.i0(t61Var.c, false, false);
            boolean z2 = i < arrayList.size() - 1;
            TextView textView = y61Var.c;
            textView.setText(pv3.m(G, textView.getPaint().getFontMetricsInt(), false, null, 0));
            in inVar = y61Var.d;
            inVar.c(i0, false, true);
            inVar.setVisibility(0);
            y61Var.f = z2;
            y61Var.setWillNotDraw(!z2);
            y61Var.requestLayout();
            boolean contains = w71Var.h.l.contains(Long.valueOf(t61Var.a));
            if (y61Var.n == null) {
                if (!contains) {
                    return;
                }
                og2 og2Var = new og2(21, y61Var.b, y61Var.getContext());
                y61Var.n = og2Var;
                og2Var.b(-1, aob.d6, aob.k7);
                y61Var.n.setDrawUnchecked(false);
                y61Var.n.setDrawBackgroundAsArc(3);
                y61Var.addView(y61Var.n, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y61Var.n.a(contains, z);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(i == 1 ? new y61(this.h.getContext(), null) : null);
    }
}
