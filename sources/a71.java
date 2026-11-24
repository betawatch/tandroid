// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a71 extends ka {
    public final /* synthetic */ c71 d;

    public a71(c71 c71Var) {
        this.d = c71Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 1 || i == 2 || i == 4;
    }

    @Override // y59
    public final int b() {
        return this.d.c.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((b71) this.d.c.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        c71 c71Var = this.d;
        ArrayList arrayList = c71Var.c;
        if (((b71) arrayList.get(i)).a == 2) {
            w8c w8cVar = (w8c) u69Var.a;
            t61 t61Var = ((b71) arrayList.get(i)).c;
            TLObject a2 = c71Var.getMessagesController().a2(t61Var.a);
            String str = null;
            if (a2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) a2;
                str = user.self ? jb6.M0(2131745635, null) : bw2.m(0, user.first_name, user.last_name);
            } else if (a2 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) a2).title;
            }
            w8cVar.setSelfAsSavedMessages(true);
            w8cVar.d(a2, str, v61.f(t61Var.b), i == arrayList.size() - 1 || ((b71) arrayList.get(i + 1)).a == 2);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2 = null;
        if (i != 1) {
            if (i == 2) {
                View w8cVar = new w8c(4, 0, null, viewGroup.getContext(), false, false);
                anb.h(cmb.c6, null, w8cVar);
                view2 = w8cVar;
            } else if (i == 3) {
                view = new bba(viewGroup.getContext(), (hg9) null);
            } else if (i == 4) {
                xib xibVar = new xib(viewGroup.getContext());
                xibVar.k(jb6.M0(2131747648, null), false);
                xibVar.g(-1, cmb.o7);
                anb.h(cmb.c6, null, xibVar);
                view = xibVar;
            }
            return kt6.h(view2, view2, -1, -2);
        }
        xib xibVar2 = new xib(viewGroup.getContext());
        xibVar2.o(R.drawable.msg_contact_add, jb6.M0(2131747656, null), true);
        xibVar2.g(cmb.u6, cmb.t6);
        anb.h(cmb.c6, null, xibVar2);
        view = xibVar2;
        view2 = view;
        return kt6.h(view2, view2, -1, -2);
    }
}
