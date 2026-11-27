// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j49 extends c79 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ n49 d;

    public j49(n49 n49Var, Context context) {
        this.d = n49Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 3 || i == 2;
    }

    @Override // j79
    public final int b() {
        n49 n49Var = this.d;
        return n49Var.f + (n49Var.e < 0 ? n49Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        n49 n49Var = this.d;
        if (i == n49Var.c) {
            return 2;
        }
        if (i == n49Var.e) {
            return 3;
        }
        return i == b() - 1 ? 4 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        if (d(i) != 1) {
            return;
        }
        xa0 xa0Var = (xa0) f89Var.a;
        n49 n49Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) n49Var.getMediaDataController().h.get(i - n49Var.d);
        String str = tL_availableReaction.reaction;
        i2 = ((e) n49Var).currentAccount;
        boolean contains = str.contains(ls6.d0(i2).S());
        i3 = ((e) n49Var).currentAccount;
        xa0Var.a(tL_availableReaction, contains, i3);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        wk5 wk5Var;
        View view;
        n49 n49Var = this.d;
        Context context = this.c;
        if (i == 0) {
            wk5Var = ((e) n49Var).parentLayout;
            sqb sqbVar = new sqb(context, wk5Var, 2);
            sqbVar.setImportantForAccessibility(4);
            sqbVar.x = n49Var;
            view = sqbVar;
        } else if (i == 2) {
            ilb ilbVar = new ilb(context);
            ilbVar.setText(ob6.M0(2131751317, null));
            view = ilbVar;
        } else if (i == 3) {
            m49 m49Var = new m49(n49Var, context);
            m49Var.a(false);
            view = m49Var;
        } else if (i != 4) {
            view = new xa0(context, true, true);
        } else {
            View t62Var = new t62(context, (byte) 22);
            t62Var.setTag(-33024);
            view = t62Var;
        }
        return new n69(view);
    }
}
