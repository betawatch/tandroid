package gi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bp;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ s6(x6 x6Var, int i3) {
        this.a = i3;
        this.b = x6Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                x6 x6Var = this.b;
                bp bpVar = x6Var.X1;
                f41Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(r31.D(org.telegram.messenger.g0.L(64.0f)));
                if (x6Var.S1 || x6Var.a2) {
                    L += x6Var.d1(true, arrayList, bd.M0(2131753905, null), x6Var.U1, false, false, -1);
                }
                if (!x6Var.S1) {
                    if (TextUtils.isEmpty(x6Var.k2) && !x6Var.a2) {
                        f41Var.V();
                        r31 c2 = r31.c(1, R.drawable.msg2_folder, bd.M0(2131744619, null));
                        c2.q = true;
                        arrayList.add(c2);
                        f41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!x6Var.a2 && bpVar != null) {
                        L += x6Var.d1(true, arrayList, bd.M0(2131753904, null), bpVar.c, bpVar.f, !bpVar.e, 2);
                    }
                    L = L + x6Var.d1(false, arrayList, bd.M0(2131753907, null), x6Var.V1, x6Var.o2 || x6Var.n2, x6Var.m2, 3) + x6Var.d1(false, arrayList, bd.M0(2131753906, null), x6Var.W1, x6Var.v2 || x6Var.u2, x6Var.t2, 4);
                }
                if (arrayList.size() <= ((x6Var.S1 || !TextUtils.isEmpty(x6Var.k2) || x6Var.a2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(x6Var.k2)) {
                        String M0 = bd.M0(2131748251, null);
                        String M02 = bd.M0(2131748252, null);
                        int i3 = li.b;
                        r31 K = r31.K(li.class);
                        K.l = M0;
                        K.m = M02;
                        arrayList.add(K);
                    } else {
                        String M03 = bd.M0(2131748251, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, x6Var.k2.length() >= 3 ? 2131748249 : 2131748250, x6Var.k2));
                        int i10 = li.b;
                        r31 K2 = r31.K(li.class);
                        K2.l = M03;
                        K2.m = X2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(r31.C(null));
                arrayList.add(r31.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                x6 x6Var2 = this.b;
                ArrayList arrayList2 = x6Var2.W1;
                x6Var2.u2 = false;
                x6Var2.v2 = false;
                if (messages_botresults == null) {
                    x6Var2.i2.O(true);
                    break;
                } else {
                    hp.s1(x6Var2.a).Y3(messages_botresults.users, false);
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
                                int i12 = x6Var2.B2;
                                x6Var2.B2 = i12 - 1;
                                tL_message.id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = h10.i(x6Var2.a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new zi(x6Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    x6Var2.s2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(x6Var2.s2)) {
                        z10 = true;
                    }
                    x6Var2.t2 = z10;
                    x6Var2.i2.O(true);
                    break;
                }
                break;
        }
    }
}
