// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ah1 implements qac {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ah1(int i, long j, my0 my0Var, ylb ylbVar, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.d = i;
        this.f = connectedbotstarref;
        this.g = my0Var;
        this.c = context;
        this.b = j;
        this.e = ylbVar;
    }

    @Override // qac
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
                my0 my0Var = (my0) obj4;
                Context context = (Context) obj3;
                ylb ylbVar = (ylb) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i2 = this.d;
                long j2 = this.b;
                if (connectedbotstarref2 != null) {
                    my0Var.dismiss();
                    mh1.K0(context, i2, connectedbotstarref2, j2, ylbVar);
                    break;
                } else {
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(connectedbotstarref.bot_id));
                    if (W1 != null) {
                        oc7.r1(i2).b3(W1, 0, true, new yg1(my0Var, context, i2, j2, ylbVar, (byte) 1));
                        break;
                    }
                }
                break;
            case 1:
                ud7 ud7Var = (ud7) obj5;
                Context context2 = (Context) obj3;
                ylb ylbVar2 = (ylb) obj2;
                c41 c41Var = (c41) obj4;
                String str = (String) obj;
                if (str != null) {
                    yr7.g(j);
                    ud7Var.run();
                    fs7.q(context2, this.d, ylbVar2, c41Var, str, null);
                    break;
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                sxb sxbVar = ((cxb) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i3 = iArr[0] + 1;
                iArr[0] = i3;
                if (i3 == this.d) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        TLRPC.Chat L0 = sxbVar.getMessagesController().L0(Long.valueOf(j));
                        i = ((d) sxbVar).currentAccount;
                        ik.f(i, L0, tL_messages_invitedUsers);
                        break;
                    } else {
                        c41 b0 = c41.b0(sxbVar);
                        TLRPC.Chat L02 = sxbVar.getMessagesController().L0(Long.valueOf(j));
                        b0.getClass();
                        if (arrayList.size() == 0) {
                            S2 = null;
                        } else if (arrayList.size() != 1) {
                            S2 = sd2.V(L02) ? gm.S2(jb6.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : gm.S2(jb6.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (sd2.V(L02)) {
                            S2 = gm.S2(jb6.a0("HasBeenAddedToChannel", null, 2131749121, "**" + m9c.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            S2 = gm.S2(jb6.a0("HasBeenAddedToGroup", null, 2131749120, "**" + m9c.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        b0.V(arrayList, S2, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ah1(long j, ud7 ud7Var, Context context, int i, ylb ylbVar, c41 c41Var) {
        this.b = j;
        this.f = ud7Var;
        this.c = context;
        this.d = i;
        this.e = ylbVar;
        this.g = c41Var;
    }

    public /* synthetic */ ah1(cxb cxbVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, ArrayList arrayList, long j) {
        this.f = cxbVar;
        this.g = tL_messages_invitedUsers;
        this.c = iArr;
        this.d = i;
        this.e = arrayList;
        this.b = j;
    }
}
