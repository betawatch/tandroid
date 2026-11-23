package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7 = this.a;
        Object obj = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                v5 v5Var = (v5) obj;
                int i11 = v5Var.p1;
                if (v5Var.s1 != null) {
                    sg.j0 e10 = sg.j0.e(i11);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = sg.j0.e(i11).k;
                    for (int i12 = 0; i12 < v5Var.s1.getItemsCount(); i12++) {
                        View childAt = v5Var.s1.M.getChildAt(i12);
                        if (childAt instanceof s5) {
                            sg.g gVar = (sg.g) sg.g.c.get(i12);
                            ((s5) childAt).a(z10 ? gVar.m() : gVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                nb nbVar = (nb) obj;
                Activity activity = nbVar.b;
                qa qaVar = nbVar.C0;
                if (qaVar == null || !qaVar.isFrontface()) {
                    break;
                } else {
                    nbVar.o();
                    nbVar.F0.setSelected(true);
                    nbVar.s.e(0.85f, 240L, null);
                    x60 G = x60.G(nbVar.r, nbVar.a, nbVar.F0);
                    g7 g7Var = new g7(activity, 1);
                    g7Var.d(nbVar.s.o);
                    g7Var.h = new n9(nbVar, 21);
                    G.q(g7Var);
                    G.o(true);
                    g7 g7Var2 = new g7(activity, 2);
                    g7Var2.b = 0.65f;
                    g7Var2.c = 1.0f;
                    g7Var2.d(nbVar.s.p);
                    g7Var2.h = new n9(nbVar, 0);
                    G.q(g7Var2);
                    G.p = new m9(nbVar, i10);
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
                oi.p pVar = ((oi.l) obj).a;
                oi.y3 y3Var = pVar.s;
                org.telegram.ui.ActionBar.i6 i6Var2 = pVar.a;
                ti tiVar = pVar.b;
                oi.t3 t3Var = pVar.r;
                int i13 = pVar.n;
                if (!i10.i(i13).q()) {
                    new ug.y0(tiVar.a2, pVar.getContext(), pVar.n, 43, true).show();
                } else if (t3Var.n3() && !t3Var.p3()) {
                    if (t3Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = t3Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
                            bn bnVar = g2Var instanceof bn ? (bn) g2Var : null;
                            dg0 dg0Var = pVar.P;
                            if (dg0Var != null) {
                                dg0Var.h(false);
                                pVar.P = null;
                            }
                            dg0 dg0Var2 = new dg0(pVar.getContext(), i6Var2);
                            pVar.P = dg0Var2;
                            dg0Var2.setOnDismissListener(new di.u9(pVar, 7));
                            long c12 = tiVar.c1();
                            fj fjVar = bnVar != null ? bnVar.F5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = mp.u1(i13).B1(c12);
                            tL_message.from_id = mp.u1(i13).B1(i10.i(i13).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = t3Var.E2();
                            tL_message.rich_message.documents = t3Var.B2();
                            if (fjVar != null && !fjVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = fjVar.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            fj fjVar2 = new fj(i13, tL_message, false, false);
                            if (fjVar != null && !fjVar.p) {
                                fjVar2.C = fjVar;
                            }
                            fjVar2.B0 = true;
                            fjVar2.W2 = Boolean.TRUE;
                            fjVar2.n0(null);
                            fjVar2.w1 = true;
                            pVar.P.r(org.telegram.messenger.f3.i(fjVar2));
                            tg sendButton = y3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            tg s5 = pVar.P.s(sendButton, true, new z4(pVar, 17));
                            if (s5 != null) {
                                i6Var = i6Var2;
                                s5.setBackground(new oi.a2(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var))));
                                dg0 dg0Var3 = pVar.P;
                                int L = org.telegram.messenger.g0.L(44.0f);
                                dg0Var3.p0 = true;
                                dg0Var3.Y = L;
                            } else {
                                i6Var = i6Var2;
                            }
                            x60 G2 = x60.G(pVar, i6Var, sendButton);
                            boolean z11 = bnVar != null && n10.C(bnVar.j());
                            if (bnVar != null && bnVar.S6()) {
                                int i14 = 0;
                                G2.c(R.drawable.msg_calendar2, gd.N0(z11 ? 2131745318 : 2131745663, null), new bi.e4(pVar, c12, 15), false);
                                if (!z11 && c12 > 0) {
                                    G2.c(R.drawable.msg_online, gd.N0(2131745390, null), new oi.d(pVar, i14), false);
                                }
                            }
                            if (!z11) {
                                G2.c(R.drawable.input_notify_off, gd.N0(2131745387, null), new oi.d(pVar, i10), false);
                            }
                            G2.Z();
                            pVar.P.q(G2);
                            pVar.P.show();
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
                tg.l0 l0Var = (tg.l0) obj;
                int i15 = l0Var.z1;
                if (l0Var.C1 != null) {
                    sg.j0 e11 = sg.j0.e(i15);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z12 = sg.j0.e(i15).k;
                    for (int i16 = 0; i16 < l0Var.C1.getItemsCount(); i16++) {
                        View childAt2 = l0Var.C1.M.getChildAt(i16);
                        if (childAt2 instanceof tg.k0) {
                            sg.g gVar2 = (sg.g) sg.g.c.get(i16);
                            ((tg.k0) childAt2).a(z12 ? gVar2.m() : gVar2.e(), z12, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
