package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.ActionBar.h6 h6Var;
        int i7 = this.a;
        Object obj = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                k5 k5Var = (k5) obj;
                int i11 = k5Var.p1;
                if (k5Var.s1 != null) {
                    sg.k0 e10 = sg.k0.e(i11);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = sg.k0.e(i11).k;
                    for (int i12 = 0; i12 < k5Var.s1.getItemsCount(); i12++) {
                        View childAt = k5Var.s1.M.getChildAt(i12);
                        if (childAt instanceof h5) {
                            sg.g gVar = (sg.g) sg.g.c.get(i12);
                            ((h5) childAt).a(z10 ? gVar.m() : gVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                sa saVar = (sa) obj;
                Activity activity = saVar.b;
                v9 v9Var = saVar.C0;
                if (v9Var == null || !v9Var.isFrontface()) {
                    break;
                } else {
                    saVar.o();
                    saVar.F0.setSelected(true);
                    saVar.s.e(0.85f, 240L, null);
                    a70 G = a70.G(saVar.r, saVar.a, saVar.F0);
                    w6 w6Var = new w6(activity, 1);
                    w6Var.d(saVar.s.o);
                    w6Var.h = new s8(saVar, 21);
                    G.q(w6Var);
                    G.o(true);
                    w6 w6Var2 = new w6(activity, 2);
                    w6Var2.b = 0.65f;
                    w6Var2.c = 1.0f;
                    w6Var2.d(saVar.s.p);
                    w6Var2.h = new s8(saVar, 0);
                    G.q(w6Var2);
                    G.p = new r8(saVar, i10);
                    G.s = 0;
                    G.W(5);
                    G.b0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                    G.Q(-1155851493);
                    G.a0();
                    break;
                }
            case 2:
                ((og.f) obj).c.callOnClick();
                break;
            case 3:
                if (((oi.f1) obj).length() != 0) {
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                oi.o oVar = ((oi.k) obj).a;
                oi.y3 y3Var = oVar.s;
                org.telegram.ui.ActionBar.h6 h6Var2 = oVar.a;
                ui uiVar = oVar.b;
                oi.t3 t3Var = oVar.r;
                int i13 = oVar.n;
                if (!k10.i(i13).q()) {
                    new ug.y0(uiVar.a2, oVar.getContext(), oVar.n, 43, true).show();
                } else if (t3Var.n3() && !t3Var.p3()) {
                    if (t3Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = t3Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
                            bn bnVar = g2Var instanceof bn ? (bn) g2Var : null;
                            eg0 eg0Var = oVar.P;
                            if (eg0Var != null) {
                                eg0Var.h(false);
                                oVar.P = null;
                            }
                            eg0 eg0Var2 = new eg0(oVar.getContext(), h6Var2);
                            oVar.P = eg0Var2;
                            eg0Var2.setOnDismissListener(new di.u9(oVar, 7));
                            long c12 = uiVar.c1();
                            gj gjVar = bnVar != null ? bnVar.F5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = np.u1(i13).B1(c12);
                            tL_message.from_id = np.u1(i13).B1(k10.i(i13).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = t3Var.E2();
                            tL_message.rich_message.documents = t3Var.B2();
                            if (gjVar != null && !gjVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            gj gjVar2 = new gj(i13, tL_message, false, false);
                            if (gjVar != null && !gjVar.p) {
                                gjVar2.C = gjVar;
                            }
                            gjVar2.B0 = true;
                            gjVar2.W2 = Boolean.TRUE;
                            gjVar2.n0(null);
                            gjVar2.w1 = true;
                            oVar.P.r(org.telegram.messenger.f3.i(gjVar2));
                            ug sendButton = y3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            ug s5 = oVar.P.s(sendButton, true, new o4(oVar, 17));
                            if (s5 != null) {
                                h6Var = h6Var2;
                                s5.setBackground(new oi.a2(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var))));
                                eg0 eg0Var3 = oVar.P;
                                int L = org.telegram.messenger.g0.L(44.0f);
                                eg0Var3.p0 = true;
                                eg0Var3.Y = L;
                            } else {
                                h6Var = h6Var2;
                            }
                            a70 G2 = a70.G(oVar, h6Var, sendButton);
                            boolean z11 = bnVar != null && p10.C(bnVar.j());
                            if (bnVar != null && bnVar.S6()) {
                                int i14 = 0;
                                G2.c(R.drawable.msg_calendar2, hd.N0(z11 ? 2131745318 : 2131745663, null), new bi.c4(oVar, c12, 15), false);
                                if (!z11 && c12 > 0) {
                                    G2.c(R.drawable.msg_online, hd.N0(2131745390, null), new oi.d(oVar, i14), false);
                                }
                            }
                            if (!z11) {
                                G2.c(R.drawable.input_notify_off, hd.N0(2131745387, null), new oi.d(oVar, i10), false);
                            }
                            G2.Z();
                            oVar.P.q(G2);
                            oVar.P.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    } else if (y3Var != null) {
                        y3Var.setSendEnabled(t3Var.P3());
                        break;
                    }
                }
                break;
            default:
                tg.h0 h0Var = (tg.h0) obj;
                int i15 = h0Var.z1;
                if (h0Var.C1 != null) {
                    sg.k0 e11 = sg.k0.e(i15);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z12 = sg.k0.e(i15).k;
                    for (int i16 = 0; i16 < h0Var.C1.getItemsCount(); i16++) {
                        View childAt2 = h0Var.C1.M.getChildAt(i16);
                        if (childAt2 instanceof tg.g0) {
                            sg.g gVar2 = (sg.g) sg.g.c.get(i16);
                            ((tg.g0) childAt2).a(z12 ? gVar2.m() : gVar2.e(), z12, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
