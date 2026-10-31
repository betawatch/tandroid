package bi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zf;
import org.telegram.ui.kh0;
import org.telegram.ui.un;
import vh.o8;
import vh.t7;
import vh.y6;
import vh.z6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean z10;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        int i12 = 1;
        int i13 = 0;
        switch (i10) {
            case 0:
                return ((n1) obj).length() != 0;
            case 1:
                return k2.a0((k2) obj, view);
            case 2:
                t tVar = ((p) obj).a;
                i4 i4Var = tVar.s;
                org.telegram.ui.ActionBar.p6 p6Var = tVar.a;
                bi biVar = tVar.b;
                d4 d4Var = tVar.r;
                int i14 = tVar.n;
                if (!d20.i(i14).q()) {
                    new kg.i1(biVar.W1, tVar.getContext(), tVar.n, 43, true).show();
                    return true;
                }
                if (d4Var.n3() && !d4Var.p3()) {
                    if (d4Var.P3()) {
                        ArrayList<TL_iv.PageBlock> c32 = d4Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                            un unVar = k2Var instanceof un ? (un) k2Var : null;
                            kh0 kh0Var = tVar.O;
                            if (kh0Var != null) {
                                kh0Var.g(false);
                                tVar.O = null;
                            }
                            kh0 kh0Var2 = new kh0(tVar.getContext(), p6Var);
                            tVar.O = kh0Var2;
                            kh0Var2.setOnDismissListener(new ag.x(tVar, i11));
                            long a12 = biVar.a1();
                            jj jjVar = unVar != null ? unVar.D5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = vp.r1(i14).y1(a12);
                            tL_message.from_id = vp.r1(i14).y1(d20.i(i14).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = d4Var.E2();
                            tL_message.rich_message.documents = d4Var.B2();
                            if (jjVar != null && !jjVar.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = jjVar.f1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            jj jjVar2 = new jj(i14, tL_message, false, false);
                            if (jjVar != null && !jjVar.p) {
                                jjVar2.C = jjVar;
                            }
                            jjVar2.z0 = true;
                            jjVar2.R2 = Boolean.TRUE;
                            jjVar2.n0(null);
                            jjVar2.u1 = true;
                            tVar.O.p(org.telegram.messenger.m5.j(jjVar2));
                            zf sendButton = i4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            zf q6 = tVar.O.q(sendButton, true, new ag.g(tVar, 4));
                            if (q6 != null) {
                                q6.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var))));
                                kh0 kh0Var3 = tVar.O;
                                int L = org.telegram.messenger.i0.L(44.0f);
                                kh0Var3.l0 = true;
                                kh0Var3.X = L;
                            }
                            z60 F = z60.F(tVar, p6Var, sendButton);
                            boolean z11 = unVar != null && h20.B(unVar.j());
                            if (unVar != null && unVar.L6()) {
                                int i15 = 0;
                                F.c(R.drawable.msg_calendar2, cd.L0(z11 ? 2131745531 : 2131745876, null), new e(tVar, a12, i15), false);
                                if (!z11 && a12 > 0) {
                                    F.c(R.drawable.msg_online, cd.L0(2131745603, null), new f(tVar, i15), false);
                                }
                            }
                            if (z11) {
                                z10 = true;
                            } else {
                                z10 = true;
                                F.c(R.drawable.input_notify_off, cd.L0(2131745600, null), new f(tVar, 1 == true ? 1 : 0), false);
                            }
                            F.Y();
                            tVar.O.o(F);
                            tVar.O.show();
                            try {
                                view.performHapticFeedback(3, 2);
                                return z10;
                            } catch (Exception unused) {
                                return z10;
                            }
                        }
                    } else if (i4Var != null) {
                        i4Var.setSendEnabled(d4Var.P3());
                    }
                }
                return false;
            case 3:
                ((eg.f) obj).c.callOnClick();
                return true;
            case 4:
                jg.r0 r0Var = (jg.r0) obj;
                int i16 = r0Var.y1;
                if (r0Var.B1 != null) {
                    ig.s0 e = ig.s0.e(i16);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z12 = ig.s0.e(i16).k;
                    while (i13 < r0Var.B1.getItemsCount()) {
                        View childAt = r0Var.B1.L.getChildAt(i13);
                        if (childAt instanceof jg.p0) {
                            ig.g gVar = (ig.g) ig.g.c.get(i13);
                            ((jg.p0) childAt).a(z12 ? gVar.m() : gVar.e(), z12, true);
                        }
                        i13++;
                    }
                }
                return true;
            case 5:
                vh.b4 b4Var = (vh.b4) obj;
                int i17 = b4Var.o1;
                if (b4Var.r1 != null) {
                    ig.s0 e7 = ig.s0.e(i17);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z13 = ig.s0.e(i17).k;
                    while (i13 < b4Var.r1.getItemsCount()) {
                        View childAt2 = b4Var.r1.L.getChildAt(i13);
                        if (childAt2 instanceof vh.z3) {
                            ig.g gVar2 = (ig.g) ig.g.c.get(i13);
                            ((vh.z3) childAt2).a(z13 ? gVar2.m() : gVar2.e(), z13, true);
                        }
                        i13++;
                    }
                }
                return true;
            default:
                o8 o8Var = (o8) obj;
                Activity activity = o8Var.b;
                t7 t7Var = o8Var.B0;
                if (t7Var == null || !t7Var.isFrontface()) {
                    return false;
                }
                o8Var.o();
                o8Var.E0.setSelected(true);
                o8Var.s.e(0.85f, 240L, null);
                z60 F2 = z60.F(o8Var.r, o8Var.a, o8Var.E0);
                vh.h5 h5Var = new vh.h5(activity, 1);
                h5Var.d(o8Var.s.o);
                h5Var.h = new z6(o8Var, 21);
                F2.q(h5Var);
                F2.o();
                vh.h5 h5Var2 = new vh.h5(activity, 2);
                h5Var2.b = 0.65f;
                h5Var2.c = 1.0f;
                h5Var2.d(o8Var.s.p);
                h5Var2.h = new z6(o8Var, i13);
                F2.q(h5Var2);
                F2.p = new y6(o8Var, i12);
                F2.s = 0;
                F2.V(5);
                F2.a0(org.telegram.messenger.i0.L(46.0f), -org.telegram.messenger.i0.L(4.0f));
                F2.P(-1155851493);
                F2.Z();
                return true;
        }
    }
}
