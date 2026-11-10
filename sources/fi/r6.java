package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.kp;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6 b;

    public /* synthetic */ r6(w6 w6Var, int i7) {
        this.a = i7;
        this.b = w6Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        boolean z9 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                w6 w6Var = this.b;
                kp kpVar = w6Var.Z1;
                m41Var.F = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(x31.D(org.telegram.messenger.g0.L(64.0f)));
                if (w6Var.U1 || w6Var.c2) {
                    L += w6Var.d1(true, arrayList, id.M0(2131753905, null), w6Var.W1, false, false, -1);
                }
                if (!w6Var.U1) {
                    if (TextUtils.isEmpty(w6Var.m2) && !w6Var.c2) {
                        m41Var.V();
                        x31 c10 = x31.c(1, R.drawable.msg2_folder, id.M0(2131744609, null));
                        c10.q = true;
                        arrayList.add(c10);
                        m41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!w6Var.c2 && kpVar != null) {
                        L += w6Var.d1(true, arrayList, id.M0(2131753904, null), kpVar.c, kpVar.f, !kpVar.e, 2);
                    }
                    L = L + w6Var.d1(false, arrayList, id.M0(2131753907, null), w6Var.X1, w6Var.q2 || w6Var.p2, w6Var.o2, 3) + w6Var.d1(false, arrayList, id.M0(2131753906, null), w6Var.Y1, w6Var.x2 || w6Var.w2, w6Var.v2, 4);
                }
                if (arrayList.size() <= ((w6Var.U1 || !TextUtils.isEmpty(w6Var.m2) || w6Var.c2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(w6Var.m2)) {
                        String M0 = id.M0(2131748243, null);
                        String M02 = id.M0(2131748244, null);
                        int i7 = ki.b;
                        x31 K = x31.K(ki.class);
                        K.l = M0;
                        K.m = M02;
                        arrayList.add(K);
                    } else {
                        String M03 = id.M0(2131748243, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.a0(null, null, w6Var.m2.length() >= 3 ? 2131748241 : 2131748242, w6Var.m2));
                        int i10 = ki.b;
                        x31 K2 = x31.K(ki.class);
                        K2.l = M03;
                        K2.m = X2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(x31.C(null));
                arrayList.add(x31.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                w6 w6Var2 = this.b;
                ArrayList arrayList2 = w6Var2.Y1;
                w6Var2.w2 = false;
                w6Var2.x2 = false;
                if (messages_botresults == null) {
                    w6Var2.k2.O(true);
                    break;
                } else {
                    qp.s1(w6Var2.a).Y3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList3 = messages_botresults.results;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList3.get(i11);
                        i11++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i12 = w6Var2.D2;
                                w6Var2.D2 = i12 - 1;
                                tL_message.id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = p10.i(w6Var2.a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new ij(w6Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    w6Var2.u2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(w6Var2.u2)) {
                        z9 = true;
                    }
                    w6Var2.v2 = z9;
                    w6Var2.k2.O(true);
                    break;
                }
                break;
        }
    }
}
