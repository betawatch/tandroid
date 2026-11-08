package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v4;
import org.telegram.ui.i91;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f3(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.v2 v2Var, f6 f6Var) {
        this.b = i7;
        this.d = connectedbotstarref;
        this.e = v2Var;
        this.f = context;
        this.c = j3;
        this.g = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder X2;
        int i10 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj4;
                Context context = (Context) obj3;
                f6 f6Var = (f6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.b;
                long j3 = this.c;
                if (connectedbotstarref2 != null) {
                    v2Var.dismiss();
                    q3.K0(context, i11, connectedbotstarref2, j3, f6Var);
                    break;
                } else {
                    TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        qp.s1(i11).W2(a22, 0, true, new d3(v2Var, context, i11, j3, f6Var, 1));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                w91 w91Var = ((i91) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.c;
                    if (!isEmpty) {
                        TLRPC.Chat M0 = w91Var.getMessagesController().M0(Long.valueOf(j10));
                        i7 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
                        v4.f(i7, M0, tL_messages_invitedUsers);
                        break;
                    } else {
                        hc a02 = hc.a0(w91Var);
                        TLRPC.Chat M02 = w91Var.getMessagesController().M0(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            X2 = null;
                        } else if (arrayList.size() != 1) {
                            X2 = org.telegram.messenger.t3.V(M02) ? org.telegram.messenger.g0.X2(id.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : org.telegram.messenger.g0.X2(id.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (org.telegram.messenger.t3.V(M02)) {
                            X2 = org.telegram.messenger.g0.X2(id.a0("HasBeenAddedToChannel", null, 2131749365, "**" + t10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(id.a0("HasBeenAddedToGroup", null, 2131749364, "**" + t10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        a02.V(arrayList, X2, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f3(i91 i91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.d = i91Var;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.b = i7;
        this.g = arrayList;
        this.c = j3;
    }
}
