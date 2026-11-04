package gi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f60;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3 = this.a;
        Object obj = this.b;
        int i10 = 1;
        switch (i3) {
            case 0:
                m5 m5Var = (m5) obj;
                int i11 = m5Var.p1;
                if (m5Var.s1 != null) {
                    tg.k0 e10 = tg.k0.e(i11);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = tg.k0.e(i11).k;
                    for (int i12 = 0; i12 < m5Var.s1.getItemsCount(); i12++) {
                        View childAt = m5Var.s1.M.getChildAt(i12);
                        if (childAt instanceof j5) {
                            tg.g gVar = (tg.g) tg.g.c.get(i12);
                            ((j5) childAt).a(z10 ? gVar.m() : gVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                va vaVar = (va) obj;
                Activity activity = vaVar.b;
                y9 y9Var = vaVar.C0;
                if (y9Var == null || !y9Var.isFrontface()) {
                    break;
                } else {
                    vaVar.o();
                    vaVar.F0.setSelected(true);
                    vaVar.s.e(0.85f, 240L, null);
                    f60 F = f60.F(vaVar.r, vaVar.a, vaVar.F0);
                    z6 z6Var = new z6(activity, 1);
                    z6Var.d(vaVar.s.o);
                    z6Var.h = new w8(vaVar, 21);
                    F.q(z6Var);
                    F.o();
                    z6 z6Var2 = new z6(activity, 2);
                    z6Var2.b = 0.65f;
                    z6Var2.c = 1.0f;
                    z6Var2.d(vaVar.s.p);
                    z6Var2.h = new w8(vaVar, 0);
                    F.q(z6Var2);
                    F.p = new v8(vaVar, i10);
                    F.s = 0;
                    F.V(5);
                    F.a0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
            case 2:
                if (((mi.h1) obj).length() != 0) {
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                mi.p pVar = ((mi.l) obj).a;
                mi.y3 y3Var = pVar.s;
                org.telegram.ui.ActionBar.e6 e6Var2 = pVar.a;
                bi biVar = pVar.b;
                mi.t3 t3Var = pVar.r;
                int i13 = pVar.n;
                if (!h10.i(i13).q()) {
                    new vg.v0(biVar.X1, pVar.getContext(), pVar.n, 43, true).show();
                } else if (t3Var.n3() && !t3Var.p3()) {
                    if (t3Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = t3Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                            wm wmVar = d2Var instanceof wm ? (wm) d2Var : null;
                            vf0 vf0Var = pVar.P;
                            if (vf0Var != null) {
                                vf0Var.g(false);
                                pVar.P = null;
                            }
                            vf0 vf0Var2 = new vf0(pVar.getContext(), e6Var2);
                            pVar.P = vf0Var2;
                            vf0Var2.setOnDismissListener(new ci.ba(pVar, 7));
                            long b12 = biVar.b1();
                            zi ziVar = wmVar != null ? wmVar.E5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = hp.s1(i13).z1(b12);
                            tL_message.from_id = hp.s1(i13).z1(h10.i(i13).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = t3Var.E2();
                            tL_message.rich_message.documents = t3Var.B2();
                            if (ziVar != null && !ziVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = ziVar.f1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            zi ziVar2 = new zi(i13, tL_message, false, false);
                            if (ziVar != null && !ziVar.p) {
                                ziVar2.C = ziVar;
                            }
                            ziVar2.z0 = true;
                            ziVar2.U2 = Boolean.TRUE;
                            ziVar2.n0(null);
                            ziVar2.u1 = true;
                            pVar.P.p(org.telegram.messenger.k5.k(ziVar2));
                            bg sendButton = y3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            bg q10 = pVar.P.q(sendButton, true, new ii.m(pVar, 13));
                            if (q10 != null) {
                                e6Var = e6Var2;
                                q10.setBackground(new mi.b2(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var))));
                                vf0 vf0Var3 = pVar.P;
                                int L = org.telegram.messenger.g0.L(44.0f);
                                vf0Var3.m0 = true;
                                vf0Var3.Y = L;
                            } else {
                                e6Var = e6Var2;
                            }
                            f60 F2 = f60.F(pVar, e6Var, sendButton);
                            boolean z11 = wmVar != null && l10.B(wmVar.j());
                            if (wmVar != null && wmVar.R6()) {
                                int i14 = 0;
                                F2.c(R.drawable.msg_calendar2, bd.M0(z11 ? 2131745524 : 2131745869, null), new ci.e3(pVar, b12, 14), false);
                                if (!z11 && b12 > 0) {
                                    F2.c(R.drawable.msg_online, bd.M0(2131745596, null), new mi.d(pVar, i14), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, bd.M0(2131745593, null), new mi.d(pVar, i10), false);
                            }
                            F2.Y();
                            pVar.P.o(F2);
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
            case 5:
                ((pg.e) obj).c.callOnClick();
                break;
            default:
                ug.f0 f0Var = (ug.f0) obj;
                int i15 = f0Var.z1;
                if (f0Var.C1 != null) {
                    tg.k0 e11 = tg.k0.e(i15);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z12 = tg.k0.e(i15).k;
                    for (int i16 = 0; i16 < f0Var.C1.getItemsCount(); i16++) {
                        View childAt2 = f0Var.C1.M.getChildAt(i16);
                        if (childAt2 instanceof ug.e0) {
                            tg.g gVar2 = (tg.g) tg.g.c.get(i16);
                            ((ug.e0) childAt2).a(z12 ? gVar2.m() : gVar2.e(), z12, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
