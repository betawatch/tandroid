// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class aw5 extends c79 {
    public final Context c;
    public final /* synthetic */ bw5 d;

    public aw5(bw5 bw5Var, Context context) {
        this.d = bw5Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return this.d.s1.size();
    }

    @Override // j79
    public final int d(int i) {
        return 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLObject M0;
        String str;
        bw5 bw5Var = this.d;
        long B1 = r47.B1((TLRPC.Peer) bw5Var.s1.get(i));
        int i2 = bw5Var.a;
        if (B1 > 0) {
            M0 = uc7.s1(i2).X1(Long.valueOf(B1));
            str = ob6.M0(2131743001, null);
        } else {
            M0 = uc7.s1(i2).M0(Long.valueOf(-B1));
            str = null;
        }
        int i3 = bw5Var.v1;
        View view = f89Var.a;
        if (i3 == 0) {
            ((nea) view).c(B1, B1 == r47.B1(bw5Var.w1), null);
        } else {
            ((bd5) view).e(M0, null, str, i != b() - 1);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View bd5Var;
        int i2 = this.d.v1;
        if (i2 == 0) {
            bd5Var = new nea(2, null, this.c);
            bd5Var.setLayoutParams(new r79(hl.L(80.0f), hl.L(100.0f)));
        } else {
            bd5Var = new bd5(2, 0, null, this.c, false, i2 == 2);
        }
        return new n69(bd5Var);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        f89Var.b();
        long B1 = r47.B1(this.d.w1);
        View view = f89Var.a;
        if (!(view instanceof bd5)) {
            nea neaVar = (nea) view;
            neaVar.b(B1 == neaVar.getCurrentDialog(), false);
        } else {
            bd5 bd5Var = (bd5) view;
            Object object = bd5Var.getObject();
            bd5Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
