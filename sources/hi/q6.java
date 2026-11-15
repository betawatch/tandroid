package hi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ q6(v6 v6Var, int i7) {
        this.a = i7;
        this.b = v6Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                v6 v6Var = this.b;
                hp hpVar = v6Var.a2;
                p41Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(b41.D(org.telegram.messenger.g0.L(64.0f)));
                if (v6Var.V1 || v6Var.d2) {
                    L += v6Var.d1(true, arrayList, hd.M0(2131753905, null), v6Var.X1, false, false, -1);
                }
                if (!v6Var.V1) {
                    if (TextUtils.isEmpty(v6Var.n2) && !v6Var.d2) {
                        p41Var.V();
                        b41 c10 = b41.c(1, R.drawable.msg2_folder, hd.M0(2131744609, null));
                        c10.q = true;
                        arrayList.add(c10);
                        p41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!v6Var.d2 && hpVar != null) {
                        L += v6Var.d1(true, arrayList, hd.M0(2131753904, null), hpVar.c, hpVar.f, !hpVar.e, 2);
                    }
                    L = L + v6Var.d1(false, arrayList, hd.M0(2131753907, null), v6Var.Y1, v6Var.r2 || v6Var.q2, v6Var.p2, 3) + v6Var.d1(false, arrayList, hd.M0(2131753906, null), v6Var.Z1, v6Var.y2 || v6Var.x2, v6Var.w2, 4);
                }
                if (arrayList.size() <= ((v6Var.V1 || !TextUtils.isEmpty(v6Var.n2) || v6Var.d2) ? 1 : 2)) {
                    if (TextUtils.isEmpty(v6Var.n2)) {
                        String M0 = hd.M0(2131748243, null);
                        String M02 = hd.M0(2131748244, null);
                        int i7 = ti.b;
                        b41 K = b41.K(ti.class);
                        K.l = M0;
                        K.m = M02;
                        arrayList.add(K);
                    } else {
                        String M03 = hd.M0(2131748243, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, v6Var.n2.length() >= 3 ? 2131748241 : 2131748242, v6Var.n2));
                        int i10 = ti.b;
                        b41 K2 = b41.K(ti.class);
                        K2.l = M03;
                        K2.m = X2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(b41.C(null));
                arrayList.add(b41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
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
                    np.s1(v6Var2.a).Y3(messages_botresults.users, false);
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
                                int i12 = v6Var2.E2;
                                v6Var2.E2 = i12 - 1;
                                tL_message.id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = m10.i(v6Var2.a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new gj(v6Var2.a, tL_message, false, true));
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
