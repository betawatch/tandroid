package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ p6(v6 v6Var, int i7) {
        this.a = i7;
        this.b = v6Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                v6 v6Var = this.b;
                gp gpVar = v6Var.a2;
                z41Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(l41.D(org.telegram.messenger.g0.L(64.0f)));
                if (v6Var.V1 || v6Var.d2) {
                    L += v6Var.e1(true, arrayList, gd.M0(2131753903, null), v6Var.X1, false, false, -1);
                }
                if (!v6Var.V1) {
                    if (TextUtils.isEmpty(v6Var.n2) && !v6Var.d2) {
                        z41Var.V();
                        l41 c10 = l41.c(1, R.drawable.msg2_folder, gd.M0(2131744374, null));
                        c10.r = true;
                        arrayList.add(c10);
                        z41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!v6Var.d2 && gpVar != null) {
                        L += v6Var.e1(true, arrayList, gd.M0(2131753902, null), gpVar.c, gpVar.f, !gpVar.e, 2);
                    }
                    L = L + v6Var.e1(false, arrayList, gd.M0(2131753905, null), v6Var.Y1, v6Var.r2 || v6Var.q2, v6Var.p2, 3) + v6Var.e1(false, arrayList, gd.M0(2131753904, null), v6Var.Z1, v6Var.y2 || v6Var.x2, v6Var.w2, 4);
                }
                if (arrayList.size() <= ((v6Var.V1 || !TextUtils.isEmpty(v6Var.n2) || v6Var.d2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(v6Var.n2)) {
                        arrayList.add(aj.i(gd.M0(2131748052, null), gd.M0(2131748051, null)));
                    } else {
                        arrayList.add(aj.i(org.telegram.messenger.g0.W2(gd.a0(null, null, v6Var.n2.length() >= 3 ? 2131748049 : 2131748050, v6Var.n2)), gd.M0(2131748051, null)));
                    }
                }
                arrayList.add(l41.C(null));
                arrayList.add(l41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                v6 v6Var2 = this.b;
                ArrayList arrayList2 = v6Var2.Z1;
                v6Var2.x2 = false;
                v6Var2.y2 = false;
                if (messages_botresults == null) {
                    v6Var2.l2.O(true);
                    break;
                } else {
                    mp.u1(v6Var2.a).f4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList3 = messages_botresults.results;
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList3.get(i7);
                        i7++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i10 = v6Var2.E2;
                                v6Var2.E2 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = j10.i(v6Var2.a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new fj(v6Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    v6Var2.v2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(v6Var2.v2)) {
                        z10 = true;
                    }
                    v6Var2.w2 = z10;
                    v6Var2.l2.O(true);
                    break;
                }
                break;
        }
    }
}
