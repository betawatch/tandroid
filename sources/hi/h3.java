package hi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.d9;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ h6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ TL_payments.connectedBotStarRef h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h3(int i7, org.telegram.ui.ActionBar.w2 w2Var, h6 h6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i7;
        this.c = w2Var;
        this.d = h6Var;
        this.n = linearLayout;
        this.e = j3;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j3;
        switch (this.a) {
            case 0:
                ai.d0 d0Var = (ai.d0) this.n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    d0Var.run();
                    break;
                } else {
                    int i7 = this.b;
                    TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        qp.s1(i7).W2(a22, 0, true, new d3(this.c, this.f, i7, this.e, this.d, 0));
                        break;
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.n;
                int i10 = this.b;
                bi.n0 g10 = bi.n0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, p10.i(i10).f());
                org.telegram.ui.ActionBar.w2 w2Var = this.c;
                ViewGroup viewGroup = w2Var.b;
                h6 h6Var = this.d;
                k60 k60Var = new k60(viewGroup, h6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.id;
                        }
                    }
                    long j10 = j3;
                    int i12 = i10;
                    h6 h6Var2 = h6Var;
                    k60Var.g(tLObject, j10 == this.e, new d9(i12, j10, this.f, this.h, w2Var, h6Var2));
                    i10 = i12;
                    h6Var = h6Var2;
                }
                k60Var.t = false;
                k60Var.s = 0;
                k60Var.V(5);
                k60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                k60Var.Z();
                break;
        }
    }

    public /* synthetic */ h3(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.w2 w2Var, Context context, long j3, h6 h6Var, ai.d0 d0Var) {
        this.h = connectedbotstarref;
        this.b = i7;
        this.c = w2Var;
        this.f = context;
        this.e = j3;
        this.d = h6Var;
        this.n = d0Var;
    }
}
