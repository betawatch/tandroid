// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dg1 implements pcc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dg1(int i, long j, nx0 nx0Var, vnb vnbVar, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.d = i;
        this.f = connectedbotstarref;
        this.g = nx0Var;
        this.c = context;
        this.b = j;
        this.e = vnbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        int i;
        SpannableStringBuilder S2;
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                nx0 nx0Var = (nx0) obj4;
                Context context = (Context) obj3;
                vnb vnbVar = (vnb) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i2 = this.d;
                long j2 = this.b;
                if (connectedbotstarref2 != null) {
                    nx0Var.dismiss();
                    ng1.K0(context, i2, connectedbotstarref2, j2, vnbVar);
                    break;
                } else {
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(connectedbotstarref.bot_id));
                    if (X1 != null) {
                        uc7.s1(i2).f3(X1, 0, true, new bg1(nx0Var, context, i2, j2, vnbVar, (byte) 1));
                        break;
                    }
                }
                break;
            case 1:
                fd7 fd7Var = (fd7) obj5;
                Context context2 = (Context) obj3;
                vnb vnbVar2 = (vnb) obj2;
                d31 d31Var = (d31) obj4;
                String str = (String) obj;
                if (str != null) {
                    vs7.g(j);
                    fd7Var.run();
                    it7.t(context2, this.d, vnbVar2, d31Var, str, null);
                    break;
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                tzb tzbVar = ((dzb) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i3 = iArr[0] + 1;
                iArr[0] = i3;
                if (i3 == this.d) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        TLRPC.Chat M0 = tzbVar.getMessagesController().M0(Long.valueOf(j));
                        i = ((e) tzbVar).currentAccount;
                        jj.f(i, M0, tL_messages_invitedUsers);
                        break;
                    } else {
                        d31 b0 = d31.b0(tzbVar);
                        TLRPC.Chat M02 = tzbVar.getMessagesController().M0(Long.valueOf(j));
                        b0.getClass();
                        if (arrayList.size() == 0) {
                            S2 = null;
                        } else if (arrayList.size() != 1) {
                            S2 = xc2.V(M02) ? hl.S2(ob6.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : hl.S2(ob6.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (xc2.V(M02)) {
                            S2 = hl.S2(ob6.a0("HasBeenAddedToChannel", null, 2131749118, "**" + lbc.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            S2 = hl.S2(ob6.a0("HasBeenAddedToGroup", null, 2131749117, "**" + lbc.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        b0.V(arrayList, S2, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ dg1(long j, fd7 fd7Var, Context context, int i, vnb vnbVar, d31 d31Var) {
        this.b = j;
        this.f = fd7Var;
        this.c = context;
        this.d = i;
        this.e = vnbVar;
        this.g = d31Var;
    }

    public /* synthetic */ dg1(dzb dzbVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, ArrayList arrayList, long j) {
        this.f = dzbVar;
        this.g = tL_messages_invitedUsers;
        this.c = iArr;
        this.d = i;
        this.e = arrayList;
        this.b = j;
    }
}
