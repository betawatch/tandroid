package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ o6(u6 u6Var, int i7) {
        this.a = i7;
        this.b = u6Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                u6 u6Var = this.b;
                hp hpVar = u6Var.a2;
                c51Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(o41.D(org.telegram.messenger.g0.L(64.0f)));
                if (u6Var.V1 || u6Var.d2) {
                    L += u6Var.e1(true, arrayList, hd.N0(2131753902, null), u6Var.X1, false, false, -1);
                }
                if (!u6Var.V1) {
                    if (TextUtils.isEmpty(u6Var.n2) && !u6Var.d2) {
                        c51Var.V();
                        o41 c10 = o41.c(1, R.drawable.msg2_folder, hd.N0(2131744366, null));
                        c10.r = true;
                        arrayList.add(c10);
                        c51Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!u6Var.d2 && hpVar != null) {
                        L += u6Var.e1(true, arrayList, hd.N0(2131753901, null), hpVar.c, hpVar.f, !hpVar.e, 2);
                    }
                    L = L + u6Var.e1(false, arrayList, hd.N0(2131753904, null), u6Var.Y1, u6Var.r2 || u6Var.q2, u6Var.p2, 3) + u6Var.e1(false, arrayList, hd.N0(2131753903, null), u6Var.Z1, u6Var.y2 || u6Var.x2, u6Var.w2, 4);
                }
                if (arrayList.size() <= ((u6Var.V1 || !TextUtils.isEmpty(u6Var.n2) || u6Var.d2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(u6Var.n2)) {
                        arrayList.add(cj.i(hd.N0(2131748051, null), hd.N0(2131748050, null)));
                    } else {
                        arrayList.add(cj.i(org.telegram.messenger.g0.W2(hd.a0(null, null, u6Var.n2.length() >= 3 ? 2131748048 : 2131748049, u6Var.n2)), hd.N0(2131748050, null)));
                    }
                }
                arrayList.add(o41.C(null));
                arrayList.add(o41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                u6 u6Var2 = this.b;
                ArrayList arrayList2 = u6Var2.Z1;
                u6Var2.x2 = false;
                u6Var2.y2 = false;
                if (messages_botresults == null) {
                    u6Var2.l2.O(true);
                    break;
                } else {
                    np.u1(u6Var2.a).f4(messages_botresults.users, false);
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
                                int i10 = u6Var2.E2;
                                u6Var2.E2 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = k10.i(u6Var2.a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new gj(u6Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    u6Var2.v2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(u6Var2.v2)) {
                        z10 = true;
                    }
                    u6Var2.w2 = z10;
                    u6Var2.l2.O(true);
                    break;
                }
                break;
        }
    }
}
