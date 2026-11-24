// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hb2 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public gb2 f;
    public final /* synthetic */ ib2 h;

    public hb2(ib2 ib2Var, Context context) {
        this.h = ib2Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f != 1;
    }

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        ib2 ib2Var = this.h;
        if (ib2Var.O) {
            this.d = arrayList;
            this.e = arrayList2;
            if (ib2Var.b.getAdapter() == ib2Var.e) {
                ib2Var.d.c();
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
            mp3 mp3Var = Utilities.g;
            gb2 gb2Var = new gb2(this, str, (byte) 0);
            this.f = gb2Var;
            mp3Var.d(gb2Var, 300L);
        }
    }

    @Override // y59
    public final int b() {
        return this.d.size();
    }

    @Override // y59
    public final int d(int i) {
        return 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i);
        String K = sd2.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        ij6 ij6Var = (ij6) u69Var.a;
        ij6Var.setTag(Integer.valueOf(i));
        ij6Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ij6 ij6Var = new ij6(this.c, 6, 2, false, null);
        anb.h(cmb.c6, null, ij6Var);
        return new b59(ij6Var);
    }
}
