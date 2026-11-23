package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ y6(e7 e7Var, int i7) {
        this.a = i7;
        this.b = e7Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                e7 e7Var = this.b;
                gp gpVar = e7Var.a2;
                b51Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(n41.D(org.telegram.messenger.g0.L(64.0f)));
                if (e7Var.V1 || e7Var.d2) {
                    L += e7Var.e1(true, arrayList, gd.N0(2131753902, null), e7Var.X1, false, false, -1);
                }
                if (!e7Var.V1) {
                    if (TextUtils.isEmpty(e7Var.n2) && !e7Var.d2) {
                        b51Var.V();
                        n41 c10 = n41.c(1, R.drawable.msg2_folder, gd.N0(2131744365, null));
                        c10.r = true;
                        arrayList.add(c10);
                        b51Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!e7Var.d2 && gpVar != null) {
                        L += e7Var.e1(true, arrayList, gd.N0(2131753901, null), gpVar.c, gpVar.f, !gpVar.e, 2);
                    }
                    L = L + e7Var.e1(false, arrayList, gd.N0(2131753904, null), e7Var.Y1, e7Var.r2 || e7Var.q2, e7Var.p2, 3) + e7Var.e1(false, arrayList, gd.N0(2131753903, null), e7Var.Z1, e7Var.y2 || e7Var.x2, e7Var.w2, 4);
                }
                if (arrayList.size() <= ((e7Var.V1 || !TextUtils.isEmpty(e7Var.n2) || e7Var.d2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(e7Var.n2)) {
                        arrayList.add(bj.i(gd.N0(2131748051, null), gd.N0(2131748050, null)));
                    } else {
                        arrayList.add(bj.i(org.telegram.messenger.g0.W2(gd.a0(null, null, e7Var.n2.length() >= 3 ? 2131748048 : 2131748049, e7Var.n2)), gd.N0(2131748050, null)));
                    }
                }
                arrayList.add(n41.C(null));
                arrayList.add(n41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                e7 e7Var2 = this.b;
                ArrayList arrayList2 = e7Var2.Z1;
                e7Var2.x2 = false;
                e7Var2.y2 = false;
                if (messages_botresults == null) {
                    e7Var2.l2.O(true);
                    break;
                } else {
                    mp.u1(e7Var2.a).f4(messages_botresults.users, false);
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
                                int i10 = e7Var2.E2;
                                e7Var2.E2 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = i10.i(e7Var2.a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new fj(e7Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    e7Var2.v2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(e7Var2.v2)) {
                        z10 = true;
                    }
                    e7Var2.w2 = z10;
                    e7Var2.l2.O(true);
                    break;
                }
                break;
        }
    }
}
