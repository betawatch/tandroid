// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1a implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r1a b;

    public /* synthetic */ o1a(r1a r1aVar, byte b) {
        this.a = b;
        this.b = r1aVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                r1a r1aVar = this.b;
                pc7 pc7Var = r1aVar.Z1;
                l9cVar.G = true;
                int L = hl.L(64.0f);
                arrayList.add(b8c.D(hl.L(64.0f)));
                if (r1aVar.U1 || r1aVar.c2) {
                    L += r1aVar.Z0(true, arrayList, ob6.M0(2131753898, null), r1aVar.W1, false, false, -1);
                }
                if (!r1aVar.U1) {
                    if (TextUtils.isEmpty(r1aVar.l2) && !r1aVar.c2) {
                        l9cVar.V();
                        b8c c = b8c.c(1, R.drawable.msg2_folder, ob6.M0(2131744263, null));
                        c.r = true;
                        arrayList.add(c);
                        l9cVar.U();
                        L += hl.L(50.0f);
                    }
                    if (!r1aVar.c2 && pc7Var != null) {
                        L += r1aVar.Z0(true, arrayList, ob6.M0(2131753897, null), pc7Var.c, pc7Var.f, !pc7Var.e, 2);
                    }
                    L = L + r1aVar.Z0(false, arrayList, ob6.M0(2131753900, null), r1aVar.X1, r1aVar.p2 || r1aVar.o2, r1aVar.n2, 3) + r1aVar.Z0(false, arrayList, ob6.M0(2131753899, null), r1aVar.Y1, r1aVar.w2 || r1aVar.v2, r1aVar.u2, 4);
                }
                if (arrayList.size() <= ((r1aVar.U1 || !TextUtils.isEmpty(r1aVar.l2) || r1aVar.c2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(r1aVar.l2)) {
                        arrayList.add(v12.i(ob6.M0(2131747975, null), ob6.M0(2131747974, null)));
                    } else {
                        arrayList.add(v12.i(hl.S2(ob6.a0(null, null, r1aVar.l2.length() >= 3 ? 2131747972 : 2131747973, r1aVar.l2)), ob6.M0(2131747974, null)));
                    }
                }
                arrayList.add(b8c.C(null));
                arrayList.add(b8c.D(Math.max(0, hl.L(24.0f) + (((hl.q.y - (hl.L(12.0f) + L)) - hl.m) - a.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                r1a r1aVar2 = this.b;
                ArrayList arrayList2 = r1aVar2.Y1;
                r1aVar2.v2 = false;
                r1aVar2.w2 = false;
                if (messages_botresults == null) {
                    r1aVar2.j2.O(true);
                    break;
                } else {
                    uc7.s1(r1aVar2.a).j4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList3 = messages_botresults.results;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList3.get(i);
                        i++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i2 = r1aVar2.C2;
                                r1aVar2.C2 = i2 - 1;
                                tL_message.id = i2;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = yac.h(r1aVar2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new r47(r1aVar2.a, tL_message, false, true));
                            }
                        }
                    }
                    r1aVar2.t2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(r1aVar2.t2)) {
                        z = true;
                    }
                    r1aVar2.u2 = z;
                    r1aVar2.j2.O(true);
                    break;
                }
                break;
        }
    }
}
