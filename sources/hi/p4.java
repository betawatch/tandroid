package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i7 = this.a;
        Object obj = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                m5 m5Var = (m5) obj;
                int i11 = m5Var.p1;
                if (m5Var.s1 != null) {
                    sg.k0 e10 = sg.k0.e(i11);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = sg.k0.e(i11).k;
                    for (int i12 = 0; i12 < m5Var.s1.getItemsCount(); i12++) {
                        View childAt = m5Var.s1.M.getChildAt(i12);
                        if (childAt instanceof j5) {
                            sg.g gVar = (sg.g) sg.g.c.get(i12);
                            ((j5) childAt).a(z10 ? gVar.m() : gVar.e(), z10, true);
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
                    m60 F = m60.F(saVar.r, saVar.a, saVar.F0);
                    x6 x6Var = new x6(activity, 1);
                    x6Var.d(saVar.s.o);
                    x6Var.h = new t8(saVar, 21);
                    F.q(x6Var);
                    F.o();
                    x6 x6Var2 = new x6(activity, 2);
                    x6Var2.b = 0.65f;
                    x6Var2.c = 1.0f;
                    x6Var2.d(saVar.s.p);
                    x6Var2.h = new t8(saVar, 0);
                    F.q(x6Var2);
                    F.p = new s8(saVar, i10);
                    F.s = 0;
                    F.V(5);
                    F.a0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
            case 2:
                ((og.f) obj).c.callOnClick();
                break;
            case 3:
                if (((oi.e1) obj).length() != 0) {
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                oi.o oVar = ((oi.k) obj).a;
                oi.v3 v3Var = oVar.s;
                org.telegram.ui.ActionBar.e6 e6Var2 = oVar.a;
                ki kiVar = oVar.b;
                oi.q3 q3Var = oVar.r;
                int i13 = oVar.n;
                if (!m10.i(i13).q()) {
                    new ug.x0(kiVar.a2, oVar.getContext(), oVar.n, 43, true).show();
                } else if (q3Var.n3() && !q3Var.p3()) {
                    if (q3Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = q3Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                            an anVar = e2Var instanceof an ? (an) e2Var : null;
                            bg0 bg0Var = oVar.P;
                            if (bg0Var != null) {
                                bg0Var.h(false);
                                oVar.P = null;
                            }
                            bg0 bg0Var2 = new bg0(oVar.getContext(), e6Var2);
                            oVar.P = bg0Var2;
                            bg0Var2.setOnDismissListener(new di.q9(oVar, 7));
                            long b12 = kiVar.b1();
                            gj gjVar = anVar != null ? anVar.E5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = np.s1(i13).z1(b12);
                            tL_message.from_id = np.s1(i13).z1(m10.i(i13).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = q3Var.E2();
                            tL_message.rich_message.documents = q3Var.B2();
                            int i14 = 16;
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
                            oVar.P.r(org.telegram.messenger.k5.j(gjVar2));
                            jg sendButton = v3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            jg s5 = oVar.P.s(sendButton, true, new p5(oVar, i14));
                            if (s5 != null) {
                                e6Var = e6Var2;
                                s5.setBackground(new oi.y1(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var))));
                                bg0 bg0Var3 = oVar.P;
                                int L = org.telegram.messenger.g0.L(44.0f);
                                bg0Var3.p0 = true;
                                bg0Var3.Y = L;
                            } else {
                                e6Var = e6Var2;
                            }
                            m60 F2 = m60.F(oVar, e6Var, sendButton);
                            boolean z11 = anVar != null && q10.B(anVar.j());
                            if (anVar != null && anVar.S6()) {
                                int i15 = 0;
                                F2.c(R.drawable.msg_calendar2, hd.M0(z11 ? 2131745514 : 2131745859, null), new di.x2(oVar, b12, 14), false);
                                if (!z11 && b12 > 0) {
                                    F2.c(R.drawable.msg_online, hd.M0(2131745586, null), new oi.d(oVar, i15), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, hd.M0(2131745583, null), new oi.d(oVar, i10), false);
                            }
                            F2.Y();
                            oVar.P.q(F2);
                            oVar.P.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    } else if (v3Var != null) {
                        v3Var.setSendEnabled(q3Var.P3());
                        break;
                    }
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                int i16 = g0Var.z1;
                if (g0Var.C1 != null) {
                    sg.k0 e11 = sg.k0.e(i16);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z12 = sg.k0.e(i16).k;
                    for (int i17 = 0; i17 < g0Var.C1.getItemsCount(); i17++) {
                        View childAt2 = g0Var.C1.M.getChildAt(i17);
                        if (childAt2 instanceof tg.f0) {
                            sg.g gVar2 = (sg.g) sg.g.c.get(i17);
                            ((tg.f0) childAt2).a(z12 ? gVar2.m() : gVar2.e(), z12, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
