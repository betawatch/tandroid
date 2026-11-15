package ji;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.he;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.zg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i7) {
        this.a = i7;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        int i7 = this.a;
        e eVar2 = this.b;
        switch (i7) {
            case 0:
                if (!eVar2.R && eVar2.W <= 0.0f && (eVar = ((m) eVar2.a.d).K) != null) {
                    g0.E2(eVar);
                    break;
                }
                break;
            default:
                if (eVar2.f0 == 0) {
                    eVar2.f0 = -1;
                    eVar2.invalidate();
                    try {
                        eVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    m mVar = (m) eVar2.a.d;
                    String trim = mVar.n.trim();
                    if (!trim.isEmpty() && mVar.c == 4) {
                        gf gfVar = mVar.b;
                        f fVar = new f(mVar, 0);
                        e eVar3 = mVar.K;
                        ChatActivityEnterView chatActivityEnterView = gfVar.a;
                        e6 e6Var = chatActivityEnterView.E4;
                        an anVar = chatActivityEnterView.x3;
                        he heVar = chatActivityEnterView.K0;
                        if (heVar != null && heVar.getWidth() > 0) {
                            bg0 bg0Var = chatActivityEnterView.M0;
                            if (bg0Var != null) {
                                bg0Var.h(false);
                            }
                            g0.r(chatActivityEnterView.X5);
                            bf bfVar = new bf(chatActivityEnterView, chatActivityEnterView.getContext(), e6Var, eVar3);
                            chatActivityEnterView.M0 = bfVar;
                            bfVar.setOnDismissListener(new wc(chatActivityEnterView, 0));
                            androidx.activity.n nVar = eVar3 != null ? new androidx.activity.n(eVar3) : null;
                            boolean[] zArr = new boolean[1];
                            if (nVar != null) {
                                bg0 bg0Var2 = chatActivityEnterView.M0;
                                ab.q qVar = new ab.q();
                                qVar.c = zArr;
                                qVar.d = nVar;
                                qVar.b = new float[4];
                                bg0Var2.m0 = qVar;
                                bg0Var2.n0 = nVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = np.s1(chatActivityEnterView.R).z1(chatActivityEnterView.y3);
                            tL_message.from_id = np.s1(chatActivityEnterView.R).z1(m10.i(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            gj.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(si.b0(chatActivityEnterView.R).W(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            gj gjVar = chatActivityEnterView.B3;
                            if (gjVar != null && !gjVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                gj gjVar2 = chatActivityEnterView.C3;
                                if (gjVar2 != null) {
                                    tL_messageReplyHeader.flags = 2 | tL_messageReplyHeader.flags;
                                    tL_messageReplyHeader.reply_to_top_id = gjVar2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.B3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            gj gjVar3 = new gj(chatActivityEnterView.R, tL_message, false, false);
                            gj gjVar4 = chatActivityEnterView.B3;
                            if (gjVar4 != null && !gjVar4.p) {
                                gjVar3.C = gjVar4;
                            }
                            gjVar3.B0 = true;
                            gjVar3.W2 = Boolean.TRUE;
                            gjVar3.D = 0;
                            gjVar3.n0(null);
                            gjVar3.w1 = true;
                            chatActivityEnterView.M0.r(k5.j(gjVar3));
                            yc ycVar = new yc(chatActivityEnterView, zArr, fVar, trim);
                            chatActivityEnterView.M0.s(heVar, true, new e0(ycVar, 6));
                            if (chatActivityEnterView.y3 >= 0) {
                                chatActivityEnterView.M0.c(anVar);
                                chatActivityEnterView.M0.p(chatActivityEnterView.n6);
                            }
                            m60 F = m60.F(chatActivityEnterView, e6Var, heVar);
                            boolean z10 = anVar != null && q10.B(anVar.j());
                            if (anVar != null && anVar.S6()) {
                                F.c(R.drawable.msg_calendar2, hd.M0(z10 ? 2131745514 : 2131745859, null), new zg(26, chatActivityEnterView, ycVar), false);
                            }
                            if (!z10 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                F.c(R.drawable.input_notify_off, hd.M0(2131745583, null), new dg(ycVar, 18), false);
                            }
                            F.Y();
                            chatActivityEnterView.M0.q(F);
                            chatActivityEnterView.M0.show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
