package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.m91;
import org.telegram.ui.y81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f3(int i3, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.t2 t2Var, e6 e6Var) {
        this.b = i3;
        this.d = connectedbotstarref;
        this.e = t2Var;
        this.f = context;
        this.c = j10;
        this.g = e6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3;
        SpannableStringBuilder X2;
        int i10 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj4;
                Context context = (Context) obj3;
                e6 e6Var = (e6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.b;
                long j10 = this.c;
                if (connectedbotstarref2 != null) {
                    t2Var.dismiss();
                    q3.K0(context, i11, connectedbotstarref2, j10, e6Var);
                    break;
                } else {
                    TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        hp.s1(i11).W2(a22, 0, true, new d3(t2Var, context, i11, j10, e6Var, 1));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                m91 m91Var = ((y81) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.c;
                    if (!isEmpty) {
                        TLRPC.Chat M0 = m91Var.getMessagesController().M0(Long.valueOf(j11));
                        i3 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
                        t4.f(i3, M0, tL_messages_invitedUsers);
                        break;
                    } else {
                        fc a02 = fc.a0(m91Var);
                        TLRPC.Chat M02 = m91Var.getMessagesController().M0(Long.valueOf(j11));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            X2 = null;
                        } else if (arrayList.size() != 1) {
                            X2 = org.telegram.messenger.t3.V(M02) ? org.telegram.messenger.g0.X2(bd.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : org.telegram.messenger.g0.X2(bd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (org.telegram.messenger.t3.V(M02)) {
                            X2 = org.telegram.messenger.g0.X2(bd.a0("HasBeenAddedToChannel", null, 2131749372, "**" + l10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(bd.a0("HasBeenAddedToGroup", null, 2131749371, "**" + l10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        a02.V(arrayList, X2, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f3(y81 y81Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i3, ArrayList arrayList, long j10) {
        this.d = y81Var;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.b = i3;
        this.g = arrayList;
        this.c = j10;
    }
}
