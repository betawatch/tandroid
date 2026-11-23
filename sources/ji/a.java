package ji;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.o0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.rf;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
import org.telegram.ui.eh;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
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
                if (!eVar2.R && eVar2.W <= 0.0f && (eVar = ((o) eVar2.a.d).K) != null) {
                    g0.E2(eVar);
                    break;
                }
                break;
            default:
                if (eVar2.f0 == 0) {
                    eVar2.f0 = -1;
                    eVar2.invalidate();
                    int i10 = 3;
                    try {
                        eVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    o oVar = (o) eVar2.a.d;
                    String trim = oVar.n.trim();
                    if (!trim.isEmpty() && oVar.c == 4) {
                        rf rfVar = oVar.b;
                        h hVar = new h(oVar, i10);
                        e eVar3 = oVar.K;
                        ChatActivityEnterView chatActivityEnterView = rfVar.a;
                        h6 h6Var = chatActivityEnterView.M4;
                        bn bnVar = chatActivityEnterView.F3;
                        re reVar = chatActivityEnterView.K0;
                        if (reVar != null && reVar.getWidth() > 0) {
                            eg0 eg0Var = chatActivityEnterView.M0;
                            if (eg0Var != null) {
                                eg0Var.h(false);
                            }
                            g0.r(chatActivityEnterView.f6);
                            lf lfVar = new lf(chatActivityEnterView, chatActivityEnterView.getContext(), h6Var, eVar3);
                            chatActivityEnterView.M0 = lfVar;
                            lfVar.setOnDismissListener(new gd(chatActivityEnterView, 0));
                            androidx.activity.n nVar = eVar3 != null ? new androidx.activity.n(eVar3) : null;
                            boolean[] zArr = new boolean[1];
                            if (nVar != null) {
                                eg0 eg0Var2 = chatActivityEnterView.M0;
                                ab.q qVar = new ab.q();
                                qVar.c = zArr;
                                qVar.d = nVar;
                                qVar.b = new float[4];
                                eg0Var2.m0 = qVar;
                                eg0Var2.n0 = nVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = np.u1(chatActivityEnterView.R).B1(chatActivityEnterView.G3);
                            tL_message.from_id = np.u1(chatActivityEnterView.R).B1(k10.i(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            gj.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(si.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            gj gjVar = chatActivityEnterView.J3;
                            if (gjVar != null && !gjVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                gj gjVar2 = chatActivityEnterView.K3;
                                if (gjVar2 != null) {
                                    tL_messageReplyHeader.flags = 2 | tL_messageReplyHeader.flags;
                                    tL_messageReplyHeader.reply_to_top_id = gjVar2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.J3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            gj gjVar3 = new gj(chatActivityEnterView.R, tL_message, false, false);
                            gj gjVar4 = chatActivityEnterView.J3;
                            if (gjVar4 != null && !gjVar4.p) {
                                gjVar3.C = gjVar4;
                            }
                            gjVar3.B0 = true;
                            gjVar3.W2 = Boolean.TRUE;
                            gjVar3.D = 0;
                            gjVar3.n0(null);
                            gjVar3.w1 = true;
                            chatActivityEnterView.M0.r(f3.i(gjVar3));
                            hd hdVar = new hd(chatActivityEnterView, zArr, hVar, trim);
                            chatActivityEnterView.M0.s(reVar, true, new o0(hdVar, 6));
                            if (chatActivityEnterView.G3 >= 0) {
                                chatActivityEnterView.M0.c(bnVar);
                                chatActivityEnterView.M0.p(chatActivityEnterView.P6);
                            }
                            a70 G = a70.G(chatActivityEnterView, h6Var, reVar);
                            boolean z10 = bnVar != null && p10.C(bnVar.j());
                            if (bnVar != null && bnVar.S6()) {
                                G.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.N0(z10 ? 2131745318 : 2131745663, null), new eh(24, chatActivityEnterView, hdVar), false);
                            }
                            if (!z10 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.c(R.drawable.input_notify_off, org.telegram.messenger.hd.N0(2131745387, null), new og(hdVar, 18), false);
                            }
                            G.Z();
                            chatActivityEnterView.M0.q(G);
                            chatActivityEnterView.M0.show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
