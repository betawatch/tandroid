// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ma2 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public la2 f;
    public final /* synthetic */ na2 h;

    public ma2(na2 na2Var, Context context) {
        this.h = na2Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f != 1;
    }

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        na2 na2Var = this.h;
        if (na2Var.O) {
            this.d = arrayList;
            this.e = arrayList2;
            if (na2Var.b.getAdapter() == na2Var.e) {
                na2Var.d.c();
            }
            super.f();
        }
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.f();
        } else {
            to3 to3Var = Utilities.g;
            la2 la2Var = new la2(this, str, (byte) 0);
            this.f = la2Var;
            to3Var.d(la2Var, 300L);
        }
    }

    @Override // j79
    public final int b() {
        return this.d.size();
    }

    @Override // j79
    public final int d(int i) {
        return 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i);
        String K = xc2.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        lj6 lj6Var = (lj6) f89Var.a;
        lj6Var.setTag(Integer.valueOf(i));
        lj6Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        lj6 lj6Var = new lj6(this.c, 6, 2, false, null);
        yob.h(aob.d6, null, lj6Var);
        return new n69(lj6Var);
    }
}
