// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fg1 implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ fg1(int i, nx0 nx0Var, vnb vnbVar, LinearLayout linearLayout, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i;
        this.c = nx0Var;
        this.d = vnbVar;
        this.n = linearLayout;
        this.e = j;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        byte b = this.a;
        Object obj = this.n;
        Object obj2 = this.c;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj3;
                nx0 nx0Var = (nx0) obj2;
                o97 o97Var = (o97) obj;
                if (!connectedbotstarref.revoked) {
                    o97Var.run();
                    break;
                } else {
                    int i = this.b;
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(connectedbotstarref.bot_id));
                    if (X1 != null) {
                        uc7.s1(i).f3(X1, 0, true, new bg1(nx0Var, this.f, i, this.e, this.d, (byte) 0));
                        break;
                    }
                }
                break;
            case 1:
                nx0 nx0Var2 = (nx0) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj3;
                int i2 = this.b;
                kt0 g = kt0.g(i2);
                g.n();
                g.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, yac.h(i2).f());
                ViewGroup viewGroup = nx0Var2.b;
                vnb vnbVar = this.d;
                fu5 fu5Var = new fu5(viewGroup, vnbVar, linearLayout, false, false, true);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i3);
                    if (tLObject instanceof TLRPC.User) {
                        j = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (xc2.V(chat)) {
                                j = -chat.id;
                            }
                        }
                        i3 = i4;
                    }
                    vnb vnbVar2 = vnbVar;
                    TL_payments.connectedBotStarRef connectedbotstarref3 = connectedbotstarref2;
                    fu5Var.f(tLObject, j == this.e, new he(i2, j, nx0Var2, vnbVar2, this.f, connectedbotstarref3));
                    connectedbotstarref2 = connectedbotstarref3;
                    i3 = i4;
                    vnbVar = vnbVar2;
                }
                fu5Var.t = false;
                fu5Var.s = (short) 0;
                fu5Var.W(5);
                fu5Var.b0(hl.L(24.0f), 0.0f);
                fu5Var.a0();
                break;
            default:
                a77 a77Var = (a77) obj3;
                pcc pccVar = (pcc) obj;
                if (((zu1) obj2) != null && a77Var.r1.e0) {
                    int i5 = this.b;
                    if (!uc7.s1(i5).x2()) {
                        jxa v = jxa.v(i5, false);
                        oj m = v.e ? oj.m(v.m()) : null;
                        if (!a77Var.m1 && (m == null || m.b < a77Var.v1.b)) {
                            long a = a77Var.v1.a();
                            long j2 = this.e;
                            new dza(this.f, this.d, a, 13, ro4.i(i5, j2), null, j2).show();
                            break;
                        } else {
                            pccVar.a(new b77(a77Var.v1, a77Var.w1));
                            a77Var.dismiss();
                            break;
                        }
                    } else {
                        i5.b(i5);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ fg1(a77 a77Var, zu1 zu1Var, int i, Context context, vnb vnbVar, long j, pcc pccVar) {
        this.h = a77Var;
        this.c = zu1Var;
        this.b = i;
        this.f = context;
        this.d = vnbVar;
        this.e = j;
        this.n = pccVar;
    }

    public /* synthetic */ fg1(TL_payments.connectedBotStarRef connectedbotstarref, int i, nx0 nx0Var, Context context, long j, vnb vnbVar, o97 o97Var) {
        this.h = connectedbotstarref;
        this.b = i;
        this.c = nx0Var;
        this.f = context;
        this.e = j;
        this.d = vnbVar;
        this.n = o97Var;
    }
}
