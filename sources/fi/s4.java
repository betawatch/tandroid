package fi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.l60;
import org.telegram.ui.cn;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i7 = this.a;
        Object obj = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj;
                int i11 = o5Var.o1;
                if (o5Var.r1 != null) {
                    sg.l0 e10 = sg.l0.e(i11);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z9 = sg.l0.e(i11).k;
                    for (int i12 = 0; i12 < o5Var.r1.getItemsCount(); i12++) {
                        View childAt = o5Var.r1.L.getChildAt(i12);
                        if (childAt instanceof l5) {
                            sg.g gVar = (sg.g) sg.g.c.get(i12);
                            ((l5) childAt).a(z9 ? gVar.m() : gVar.e(), z9, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                va vaVar = (va) obj;
                Activity activity = vaVar.b;
                y9 y9Var = vaVar.B0;
                if (y9Var == null || !y9Var.isFrontface()) {
                    break;
                } else {
                    vaVar.o();
                    vaVar.E0.setSelected(true);
                    vaVar.s.e(0.85f, 240L, null);
                    l60 F = l60.F(vaVar.r, vaVar.a, vaVar.E0);
                    y6 y6Var = new y6(activity, 1);
                    y6Var.d(vaVar.s.o);
                    y6Var.h = new v8(vaVar, 21);
                    F.q(y6Var);
                    F.o();
                    y6 y6Var2 = new y6(activity, 2);
                    y6Var2.b = 0.65f;
                    y6Var2.c = 1.0f;
                    y6Var2.d(vaVar.s.p);
                    y6Var2.h = new v8(vaVar, 0);
                    F.q(y6Var2);
                    F.p = new u8(vaVar, i10);
                    F.s = 0;
                    F.V(5);
                    F.a0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
            case 2:
                if (((li.g1) obj).length() != 0) {
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                li.p pVar = ((li.l) obj).a;
                li.y3 y3Var = pVar.s;
                org.telegram.ui.ActionBar.g6 g6Var2 = pVar.a;
                di diVar = pVar.b;
                li.t3 t3Var = pVar.r;
                int i13 = pVar.n;
                if (!p10.i(i13).q()) {
                    new ug.w0(diVar.W1, pVar.getContext(), pVar.n, 43, true).show();
                } else if (t3Var.n3() && !t3Var.p3()) {
                    if (t3Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = t3Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                            cn cnVar = f2Var instanceof cn ? (cn) f2Var : null;
                            dg0 dg0Var = pVar.O;
                            if (dg0Var != null) {
                                dg0Var.g(false);
                                pVar.O = null;
                            }
                            dg0 dg0Var2 = new dg0(pVar.getContext(), g6Var2);
                            pVar.O = dg0Var2;
                            dg0Var2.setOnDismissListener(new bi.eb(pVar, 7));
                            long b12 = diVar.b1();
                            ij ijVar = cnVar != null ? cnVar.D5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = qp.s1(i13).z1(b12);
                            tL_message.from_id = qp.s1(i13).z1(p10.i(i13).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = t3Var.E2();
                            tL_message.rich_message.documents = t3Var.B2();
                            if (ijVar != null && !ijVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = ijVar.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            ij ijVar2 = new ij(i13, tL_message, false, false);
                            if (ijVar != null && !ijVar.p) {
                                ijVar2.C = ijVar;
                            }
                            ijVar2.z0 = true;
                            ijVar2.U2 = Boolean.TRUE;
                            ijVar2.n0(null);
                            ijVar2.u1 = true;
                            pVar.O.p(org.telegram.messenger.k5.k(ijVar2));
                            dg sendButton = y3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            dg q10 = pVar.O.q(sendButton, true, new ii.g(pVar, 10));
                            if (q10 != null) {
                                g6Var = g6Var2;
                                q10.setBackground(new li.a2(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var))));
                                dg0 dg0Var3 = pVar.O;
                                int L = org.telegram.messenger.g0.L(44.0f);
                                dg0Var3.l0 = true;
                                dg0Var3.X = L;
                            } else {
                                g6Var = g6Var2;
                            }
                            l60 F2 = l60.F(pVar, g6Var, sendButton);
                            boolean z10 = cnVar != null && t10.B(cnVar.j());
                            if (cnVar != null && cnVar.S6()) {
                                int i14 = 0;
                                F2.c(R.drawable.msg_calendar2, id.M0(z10 ? 2131745514 : 2131745859, null), new bi.r3(pVar, b12, 13), false);
                                if (!z10 && b12 > 0) {
                                    F2.c(R.drawable.msg_online, id.M0(2131745586, null), new li.d(pVar, i14), false);
                                }
                            }
                            if (!z10) {
                                F2.c(R.drawable.input_notify_off, id.M0(2131745583, null), new li.d(pVar, i10), false);
                            }
                            F2.Y();
                            pVar.O.o(F2);
                            pVar.O.show();
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
            case 5:
                ((og.f) obj).c.callOnClick();
                break;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                int i15 = g0Var.y1;
                if (g0Var.B1 != null) {
                    sg.l0 e11 = sg.l0.e(i15);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z11 = sg.l0.e(i15).k;
                    for (int i16 = 0; i16 < g0Var.B1.getItemsCount(); i16++) {
                        View childAt2 = g0Var.B1.L.getChildAt(i16);
                        if (childAt2 instanceof tg.f0) {
                            sg.g gVar2 = (sg.g) sg.g.c.get(i16);
                            ((tg.f0) childAt2).a(z11 ? gVar2.m() : gVar2.e(), z11, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
