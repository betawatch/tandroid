// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b61 extends la {
    public final /* synthetic */ d61 d;

    public b61(d61 d61Var) {
        this.d = d61Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 1 || i == 2 || i == 4;
    }

    @Override // j79
    public final int b() {
        return this.d.c.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((c61) this.d.c.get(i)).a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        d61 d61Var = this.d;
        ArrayList arrayList = d61Var.c;
        if (((c61) arrayList.get(i)).a == 2) {
            vac vacVar = (vac) f89Var.a;
            u51 u51Var = ((c61) arrayList.get(i)).c;
            TLObject b2 = d61Var.getMessagesController().b2(u51Var.a);
            String str = null;
            if (b2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) b2;
                str = user.self ? ob6.M0(2131745629, null) : lv2.m(0, user.first_name, user.last_name);
            } else if (b2 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) b2).title;
            }
            vacVar.setSelfAsSavedMessages(true);
            vacVar.d(b2, str, w51.f(u51Var.b), i == arrayList.size() - 1 || ((c61) arrayList.get(i + 1)).a == 2);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2 = null;
        if (i != 1) {
            if (i == 2) {
                View vacVar = new vac(4, 0, null, viewGroup.getContext(), false, false);
                yob.h(aob.d6, null, vacVar);
                view2 = vacVar;
            } else if (i == 3) {
                view = new rca(viewGroup.getContext(), (uh9) null);
            } else if (i == 4) {
                skb skbVar = new skb(viewGroup.getContext());
                skbVar.k(ob6.M0(2131747642, null), false);
                skbVar.g(-1, aob.p7);
                yob.h(aob.d6, null, skbVar);
                view = skbVar;
            }
            return qu6.h(view2, view2, -1, -2);
        }
        skb skbVar2 = new skb(viewGroup.getContext());
        skbVar2.o(R.drawable.msg_contact_add, ob6.M0(2131747650, null), true);
        skbVar2.g(aob.v6, aob.u6);
        yob.h(aob.d6, null, skbVar2);
        view = skbVar2;
        view2 = view;
        return qu6.h(view2, view2, -1, -2);
    }
}
