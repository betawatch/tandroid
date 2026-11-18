package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4(Object obj, int i7) {
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
                l5 l5Var = (l5) obj;
                int i11 = l5Var.p1;
                if (l5Var.s1 != null) {
                    sg.k0 e10 = sg.k0.e(i11);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = sg.k0.e(i11).k;
                    for (int i12 = 0; i12 < l5Var.s1.getItemsCount(); i12++) {
                        View childAt = l5Var.s1.M.getChildAt(i12);
                        if (childAt instanceof i5) {
                            sg.g gVar = (sg.g) sg.g.c.get(i12);
                            ((i5) childAt).a(z10 ? gVar.m() : gVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ta taVar = (ta) obj;
                Activity activity = taVar.b;
                w9 w9Var = taVar.C0;
                if (w9Var == null || !w9Var.isFrontface()) {
                    break;
                } else {
                    taVar.o();
                    taVar.F0.setSelected(true);
                    taVar.s.e(0.85f, 240L, null);
                    y60 G = y60.G(taVar.r, taVar.a, taVar.F0);
                    x6 x6Var = new x6(activity, 1);
                    x6Var.d(taVar.s.o);
                    x6Var.h = new t8(taVar, 21);
                    G.q(x6Var);
                    G.o(true);
                    x6 x6Var2 = new x6(activity, 2);
                    x6Var2.b = 0.65f;
                    x6Var2.c = 1.0f;
                    x6Var2.d(taVar.s.p);
                    x6Var2.h = new t8(taVar, 0);
                    G.q(x6Var2);
                    G.p = new s8(taVar, i10);
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
                if (((oi.e1) obj).length() != 0) {
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                oi.o oVar = ((oi.k) obj).a;
                oi.x3 x3Var = oVar.s;
                org.telegram.ui.ActionBar.i6 i6Var2 = oVar.a;
                si siVar = oVar.b;
                oi.s3 s3Var = oVar.r;
                int i13 = oVar.n;
                if (!j10.i(i13).q()) {
                    new ug.z0(siVar.a2, oVar.getContext(), oVar.n, 43, true).show();
                } else if (s3Var.n3() && !s3Var.p3()) {
                    if (s3Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = s3Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
                            bn bnVar = h2Var instanceof bn ? (bn) h2Var : null;
                            eg0 eg0Var = oVar.P;
                            if (eg0Var != null) {
                                eg0Var.h(false);
                                oVar.P = null;
                            }
                            eg0 eg0Var2 = new eg0(oVar.getContext(), i6Var2);
                            oVar.P = eg0Var2;
                            eg0Var2.setOnDismissListener(new di.t9(oVar, 7));
                            long c12 = siVar.c1();
                            fj fjVar = bnVar != null ? bnVar.F5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = mp.u1(i13).B1(c12);
                            tL_message.from_id = mp.u1(i13).B1(j10.i(i13).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = s3Var.E2();
                            tL_message.rich_message.documents = s3Var.B2();
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
                            oVar.P.r(org.telegram.messenger.f3.i(fjVar2));
                            sg sendButton = x3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            sg s5 = oVar.P.s(sendButton, true, new o0(oVar, 18));
                            if (s5 != null) {
                                i6Var = i6Var2;
                                s5.setBackground(new oi.y1(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var))));
                                eg0 eg0Var3 = oVar.P;
                                int L = org.telegram.messenger.g0.L(44.0f);
                                eg0Var3.p0 = true;
                                eg0Var3.Y = L;
                            } else {
                                i6Var = i6Var2;
                            }
                            y60 G2 = y60.G(oVar, i6Var, sendButton);
                            boolean z11 = bnVar != null && o10.C(bnVar.j());
                            if (bnVar != null && bnVar.S6()) {
                                int i14 = 0;
                                G2.c(R.drawable.msg_calendar2, gd.M0(z11 ? 2131745319 : 2131745664, null), new bi.y3(oVar, c12, 15), false);
                                if (!z11 && c12 > 0) {
                                    G2.c(R.drawable.msg_online, gd.M0(2131745391, null), new oi.d(oVar, i14), false);
                                }
                            }
                            if (!z11) {
                                G2.c(R.drawable.input_notify_off, gd.M0(2131745388, null), new oi.d(oVar, i10), false);
                            }
                            G2.Z();
                            oVar.P.q(G2);
                            oVar.P.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    } else if (x3Var != null) {
                        x3Var.setSendEnabled(s3Var.P3());
                        break;
                    }
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                int i15 = g0Var.z1;
                if (g0Var.C1 != null) {
                    sg.k0 e11 = sg.k0.e(i15);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z12 = sg.k0.e(i15).k;
                    for (int i16 = 0; i16 < g0Var.C1.getItemsCount(); i16++) {
                        View childAt2 = g0Var.C1.M.getChildAt(i16);
                        if (childAt2 instanceof tg.f0) {
                            sg.g gVar2 = (sg.g) sg.g.c.get(i16);
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
