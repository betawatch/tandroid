package ji;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.n0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ah;
import org.telegram.ui.bn;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                if (!eVar2.R && eVar2.W <= 0.0f && (eVar = ((n) eVar2.a.d).K) != null) {
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
                    n nVar = (n) eVar2.a.d;
                    String trim = nVar.n.trim();
                    if (!trim.isEmpty() && nVar.c == 4) {
                        qf qfVar = nVar.b;
                        i iVar = new i(nVar, i10);
                        e eVar3 = nVar.K;
                        ChatActivityEnterView chatActivityEnterView = qfVar.a;
                        i6 i6Var = chatActivityEnterView.M4;
                        bn bnVar = chatActivityEnterView.F3;
                        se seVar = chatActivityEnterView.K0;
                        if (seVar != null && seVar.getWidth() > 0) {
                            dg0 dg0Var = chatActivityEnterView.M0;
                            if (dg0Var != null) {
                                dg0Var.h(false);
                            }
                            g0.r(chatActivityEnterView.f6);
                            mf mfVar = new mf(chatActivityEnterView, chatActivityEnterView.getContext(), i6Var, eVar3);
                            chatActivityEnterView.M0 = mfVar;
                            mfVar.setOnDismissListener(new gd(chatActivityEnterView, 0));
                            androidx.activity.n nVar2 = eVar3 != null ? new androidx.activity.n(eVar3) : null;
                            boolean[] zArr = new boolean[1];
                            if (nVar2 != null) {
                                dg0 dg0Var2 = chatActivityEnterView.M0;
                                ab.q qVar = new ab.q();
                                qVar.c = zArr;
                                qVar.d = nVar2;
                                qVar.b = new float[4];
                                dg0Var2.m0 = qVar;
                                dg0Var2.n0 = nVar2;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = mp.u1(chatActivityEnterView.R).B1(chatActivityEnterView.G3);
                            tL_message.from_id = mp.u1(chatActivityEnterView.R).B1(i10.i(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            fj.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(ri.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            fj fjVar = chatActivityEnterView.J3;
                            if (fjVar != null && !fjVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                fj fjVar2 = chatActivityEnterView.K3;
                                if (fjVar2 != null) {
                                    tL_messageReplyHeader.flags = 2 | tL_messageReplyHeader.flags;
                                    tL_messageReplyHeader.reply_to_top_id = fjVar2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.J3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            fj fjVar3 = new fj(chatActivityEnterView.R, tL_message, false, false);
                            fj fjVar4 = chatActivityEnterView.J3;
                            if (fjVar4 != null && !fjVar4.p) {
                                fjVar3.C = fjVar4;
                            }
                            fjVar3.B0 = true;
                            fjVar3.W2 = Boolean.TRUE;
                            fjVar3.D = 0;
                            fjVar3.n0(null);
                            fjVar3.w1 = true;
                            chatActivityEnterView.M0.r(f3.i(fjVar3));
                            hd hdVar = new hd(chatActivityEnterView, zArr, iVar, trim);
                            chatActivityEnterView.M0.s(seVar, true, new n0(hdVar, 6));
                            if (chatActivityEnterView.G3 >= 0) {
                                chatActivityEnterView.M0.c(bnVar);
                                chatActivityEnterView.M0.p(chatActivityEnterView.P6);
                            }
                            x60 G = x60.G(chatActivityEnterView, i6Var, seVar);
                            boolean z10 = bnVar != null && n10.C(bnVar.j());
                            if (bnVar != null && bnVar.S6()) {
                                G.c(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(z10 ? 2131745318 : 2131745663, null), new ah(26, chatActivityEnterView, hdVar), false);
                            }
                            if (!z10 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.c(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new ng(hdVar, 18), false);
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
