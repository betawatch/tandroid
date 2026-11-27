// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knc b;

    public /* synthetic */ gnc(knc kncVar, byte b) {
        this.a = b;
        this.b = kncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        knc kncVar;
        byte b = this.a;
        knc kncVar2 = this.b;
        switch (b) {
            case 0:
                if (!kncVar2.R && kncVar2.W <= 0.0f && (kncVar = ((snc) kncVar2.a.e).L) != null) {
                    hl.B2(kncVar);
                    break;
                }
                break;
            default:
                if (kncVar2.f0 == 0) {
                    kncVar2.f0 = -1;
                    kncVar2.invalidate();
                    try {
                        kncVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    snc sncVar = (snc) kncVar2.a.e;
                    String trim = sncVar.n.trim();
                    if (!trim.isEmpty() && sncVar.c == 4) {
                        c cVar = sncVar.b;
                        lnc lncVar = new lnc(sncVar, (byte) 1);
                        knc kncVar3 = sncVar.L;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        int i = ChatActivityEnterView.X7;
                        vnb vnbVar = chatActivityEnterView.K4;
                        zu1 zu1Var = chatActivityEnterView.E3;
                        bx1 bx1Var = chatActivityEnterView.K0;
                        if (bx1Var != null && bx1Var.getWidth() > 0) {
                            q67 q67Var = chatActivityEnterView.M0;
                            if (q67Var != null) {
                                q67Var.f(false);
                            }
                            hl.r(chatActivityEnterView.p6);
                            yx1 yx1Var = new yx1(chatActivityEnterView, chatActivityEnterView.getContext(), vnbVar, kncVar3);
                            chatActivityEnterView.M0 = yx1Var;
                            yx1Var.setOnDismissListener(new aw1(chatActivityEnterView, (byte) 0));
                            rx rxVar = kncVar3 != null ? new rx(kncVar3) : null;
                            boolean[] zArr = new boolean[1];
                            if (rxVar != null) {
                                q67 q67Var2 = chatActivityEnterView.M0;
                                vh4 vh4Var = new vh4();
                                vh4Var.c = zArr;
                                vh4Var.d = rxVar;
                                vh4Var.b = new float[4];
                                q67Var2.m0 = vh4Var;
                                q67Var2.n0 = rxVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = uc7.s1(chatActivityEnterView.R).y1(chatActivityEnterView.F3);
                            tL_message.from_id = uc7.s1(chatActivityEnterView.R).y1(yac.h(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            r47.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(ls6.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            r47 r47Var = chatActivityEnterView.I3;
                            if (r47Var != null && !r47Var.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                r47 r47Var2 = chatActivityEnterView.J3;
                                if (r47Var2 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = r47Var2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.I3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            r47 r47Var3 = new r47(chatActivityEnterView.R, tL_message, false, false);
                            r47 r47Var4 = chatActivityEnterView.I3;
                            if (r47Var4 != null && !r47Var4.p) {
                                r47Var3.C = r47Var4;
                            }
                            r47Var3.B0 = true;
                            r47Var3.W2 = Boolean.TRUE;
                            r47Var3.D = 0;
                            r47Var3.n0(null);
                            r47Var3.w1 = true;
                            chatActivityEnterView.M0.r(qd4.t(r47Var3));
                            bw1 bw1Var = new bw1(chatActivityEnterView, zArr, lncVar, trim, (byte) 0);
                            chatActivityEnterView.M0.s(bx1Var, true, new r81(bw1Var, (byte) 10));
                            if (chatActivityEnterView.F3 >= 0) {
                                chatActivityEnterView.M0.a(zu1Var);
                                chatActivityEnterView.M0.p(chatActivityEnterView.o7);
                            }
                            fu5 G = fu5.G(chatActivityEnterView, vnbVar, bx1Var);
                            byte b2 = (zu1Var == null || !lbc.D(zu1Var.h())) ? (byte) 0 : (byte) 1;
                            if (zu1Var != null && zu1Var.M4()) {
                                G.b(R.drawable.msg_calendar2, ob6.M0(b2 != 0 ? 2131745242 : 2131745587, null), new jj1(chatActivityEnterView, bw1Var, (byte) 26), false);
                            }
                            if (b2 == 0 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.b(R.drawable.input_notify_off, ob6.M0(2131745311, null), new go1(bw1Var, (byte) 11), false);
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
