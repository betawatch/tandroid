package ki;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import di.u7;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 c;
    public final /* synthetic */ e6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ TL_payments.connectedBotStarRef h;
    public final /* synthetic */ Object n;

    public /* synthetic */ e3(int i7, org.telegram.ui.ActionBar.u2 u2Var, e6 e6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i7;
        this.c = u2Var;
        this.d = e6Var;
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
                ai.r rVar = (ai.r) this.n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    rVar.run();
                    break;
                } else {
                    int i7 = this.b;
                    TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        np.s1(i7).W2(a22, 0, true, new a3(this.c, this.f, i7, this.e, this.d, 0));
                        break;
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.n;
                int i10 = this.b;
                di.e0 g10 = di.e0.g(i10);
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
                arrayList.add(0, m10.i(i10).f());
                org.telegram.ui.ActionBar.u2 u2Var = this.c;
                ViewGroup viewGroup = u2Var.b;
                e6 e6Var = this.d;
                m60 m60Var = new m60(viewGroup, e6Var, linearLayout, false, false, true);
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
                    e6 e6Var2 = e6Var;
                    m60Var.g(tLObject, j10 == this.e, new u7(i12, j10, this.f, this.h, u2Var, e6Var2));
                    i10 = i12;
                    e6Var = e6Var2;
                }
                m60Var.t = false;
                m60Var.s = 0;
                m60Var.V(5);
                m60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                m60Var.Z();
                break;
        }
    }

    public /* synthetic */ e3(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.u2 u2Var, Context context, long j3, e6 e6Var, ai.r rVar) {
        this.h = connectedbotstarref;
        this.b = i7;
        this.c = u2Var;
        this.f = context;
        this.e = j3;
        this.d = e6Var;
        this.n = rVar;
    }
}
