package ii;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ci.d8;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 c;
    public final /* synthetic */ e6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ TL_payments.connectedBotStarRef h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h3(int i3, org.telegram.ui.ActionBar.t2 t2Var, e6 e6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i3;
        this.c = t2Var;
        this.d = e6Var;
        this.n = linearLayout;
        this.e = j10;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        switch (this.a) {
            case 0:
                ai.z3 z3Var = (ai.z3) this.n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    z3Var.run();
                    break;
                } else {
                    int i3 = this.b;
                    TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        hp.s1(i3).W2(a22, 0, true, new d3(this.c, this.f, i3, this.e, this.d, 0));
                        break;
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.n;
                int i10 = this.b;
                ci.i0 g7 = ci.i0.g(i10);
                g7.n();
                g7.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g7.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g7.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, h10.i(i10).f());
                org.telegram.ui.ActionBar.t2 t2Var = this.c;
                ViewGroup viewGroup = t2Var.b;
                e6 e6Var = this.d;
                f60 f60Var = new f60(viewGroup, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j10 = -chat.id;
                        }
                    }
                    long j11 = j10;
                    int i12 = i10;
                    e6 e6Var2 = e6Var;
                    f60Var.g(tLObject, j11 == this.e, new d8(i12, j11, this.f, this.h, t2Var, e6Var2));
                    i10 = i12;
                    e6Var = e6Var2;
                }
                f60Var.t = false;
                f60Var.s = 0;
                f60Var.V(5);
                f60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                f60Var.Z();
                break;
        }
    }

    public /* synthetic */ h3(TL_payments.connectedBotStarRef connectedbotstarref, int i3, org.telegram.ui.ActionBar.t2 t2Var, Context context, long j10, e6 e6Var, ai.z3 z3Var) {
        this.h = connectedbotstarref;
        this.b = i3;
        this.c = t2Var;
        this.f = context;
        this.e = j10;
        this.d = e6Var;
        this.n = z3Var;
    }
}
