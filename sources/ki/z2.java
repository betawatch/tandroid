package ki;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.s4;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ i6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ TL_payments.connectedBotStarRef h;
    public final /* synthetic */ Object n;

    public /* synthetic */ z2(int i7, org.telegram.ui.ActionBar.w2 w2Var, i6 i6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i7;
        this.c = w2Var;
        this.d = i6Var;
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
                ai.j jVar = (ai.j) this.n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    jVar.run();
                    break;
                } else {
                    int i7 = this.b;
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        mp.u1(i7).c3(c22, 0, true, new w2(this.c, this.f, i7, this.e, this.d, 0));
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
                arrayList.add(0, i10.i(i10).f());
                org.telegram.ui.ActionBar.w2 w2Var = this.c;
                ViewGroup viewGroup = w2Var.b;
                i6 i6Var = this.d;
                x60 x60Var = new x60(viewGroup, i6Var, linearLayout, false, false, true);
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
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.id;
                        }
                    }
                    long j10 = j3;
                    int i12 = i10;
                    i6 i6Var2 = i6Var;
                    x60Var.g(tLObject, j10 == this.e, new s4(i12, j10, this.f, this.h, w2Var, i6Var2));
                    i10 = i12;
                    i6Var = i6Var2;
                }
                x60Var.t = false;
                x60Var.s = 0;
                x60Var.W(5);
                x60Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                x60Var.a0();
                break;
        }
    }

    public /* synthetic */ z2(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.w2 w2Var, Context context, long j3, i6 i6Var, ai.j jVar) {
        this.h = connectedbotstarref;
        this.b = i7;
        this.c = w2Var;
        this.f = context;
        this.e = j3;
        this.d = i6Var;
        this.n = jVar;
    }
}
