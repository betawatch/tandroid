package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.lc;
import org.telegram.ui.j91;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a4 implements x10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a4(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.b = i7;
        this.f = connectedbotstarref;
        this.g = w2Var;
        this.c = context;
        this.d = j3;
        this.e = h6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder W2;
        int i10 = this.a;
        long j3 = this.d;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.f;
        switch (i10) {
            case 0:
                aa.r rVar = (aa.r) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                lc lcVar = (lc) obj2;
                String str = (String) obj;
                if (str != null) {
                    i4.g(j3);
                    rVar.run();
                    y4.q(context, this.b, h6Var, lcVar, str, null);
                    break;
                }
                break;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj2;
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.b;
                long j10 = this.d;
                if (connectedbotstarref2 != null) {
                    w2Var.dismiss();
                    ki.h3.K0(context2, i11, connectedbotstarref2, j10, h6Var2);
                    break;
                } else {
                    TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        mp.u1(i11).c3(c22, 0, true, new ki.v2(w2Var, context2, i11, j10, h6Var2, 1));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                y91 y91Var = ((j91) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.b) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        TLRPC.Chat O0 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                        i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
                        org.telegram.ui.Components.c5.f(i7, O0, tL_messages_invitedUsers);
                        break;
                    } else {
                        lc b02 = lc.b0(y91Var);
                        TLRPC.Chat O02 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                        b02.getClass();
                        if (arrayList.size() == 0) {
                            W2 = null;
                        } else if (arrayList.size() != 1) {
                            W2 = org.telegram.messenger.v3.V(O02) ? org.telegram.messenger.g0.W2(gd.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : org.telegram.messenger.g0.W2(gd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (org.telegram.messenger.v3.V(O02)) {
                            W2 = org.telegram.messenger.g0.W2(gd.a0("HasBeenAddedToChannel", null, 2131749171, "**" + o10.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            W2 = org.telegram.messenger.g0.W2(gd.a0("HasBeenAddedToGroup", null, 2131749170, "**" + o10.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        b02.V(arrayList, W2, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a4(long j3, aa.r rVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.d = j3;
        this.f = rVar;
        this.c = context;
        this.b = i7;
        this.e = h6Var;
        this.g = lcVar;
    }

    public /* synthetic */ a4(j91 j91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.f = j91Var;
        this.c = tL_messages_invitedUsers;
        this.e = iArr;
        this.b = i7;
        this.g = arrayList;
        this.d = j3;
    }
}
