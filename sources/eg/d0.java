package eg;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.q70;
import org.telegram.ui.ti0;
import org.telegram.ui.xn;
import qh.a5;
import qh.ba;
import qh.f8;
import qh.f9;
import qh.g8;
import qh.k6;
import qh.y4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                int i10 = c1Var.M1;
                if (c1Var.P1 != null) {
                    dg.e1 e6 = dg.e1.e(i10);
                    e6.k = !e6.k;
                    e6.a.edit().putBoolean("fill_shapes", e6.k).apply();
                    boolean z4 = dg.e1.e(i10).k;
                    for (int i11 = 0; i11 < c1Var.P1.getItemsCount(); i11++) {
                        View childAt = c1Var.P1.I.getChildAt(i11);
                        if (childAt instanceof a1) {
                            dg.l lVar = (dg.l) dg.l.b.get(i11);
                            ((a1) childAt).a(z4 ? lVar.m() : lVar.e(), z4, true);
                        }
                    }
                }
                return true;
            case 1:
                a5 a5Var = (a5) this.b;
                int i12 = a5Var.C1;
                if (a5Var.F1 != null) {
                    dg.e1 e10 = dg.e1.e(i12);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = dg.e1.e(i12).k;
                    for (int i13 = 0; i13 < a5Var.F1.getItemsCount(); i13++) {
                        View childAt2 = a5Var.F1.I.getChildAt(i13);
                        if (childAt2 instanceof y4) {
                            dg.l lVar2 = (dg.l) dg.l.b.get(i13);
                            ((y4) childAt2).a(z10 ? lVar2.m() : lVar2.e(), z10, true);
                        }
                    }
                }
                return true;
            case 2:
                ba baVar = (ba) this.b;
                Activity activity = baVar.b;
                f9 f9Var = baVar.y0;
                if (f9Var == null || !f9Var.isFrontface()) {
                    return false;
                }
                baVar.p();
                baVar.B0.setSelected(true);
                baVar.s.e(0.85f, 240L, null);
                q70 F = q70.F(baVar.r, baVar.a, baVar.B0);
                k6 k6Var = new k6(activity, 1);
                k6Var.d(baVar.s.o);
                k6Var.h = new g8(baVar, 21);
                F.q(k6Var);
                F.o();
                k6 k6Var2 = new k6(activity, 2);
                k6Var2.b = 0.65f;
                k6Var2.c = 1.0f;
                k6Var2.d(baVar.s.p);
                k6Var2.h = new g8(baVar, 0);
                F.q(k6Var2);
                F.p = new f8(baVar, 1);
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                return ((wh.e1) this.b).length() != 0;
            case 4:
                return wh.z1.W((wh.z1) this.b, view);
            case 5:
                wh.q qVar = ((wh.l) this.b).a;
                wh.v3 v3Var = qVar.s;
                g6 g6Var = qVar.a;
                mi miVar = qVar.b;
                wh.r3 r3Var = qVar.r;
                int i14 = qVar.n;
                if (!UserConfig.getInstance(i14).isPremium()) {
                    new fg.n1(miVar.c0, qVar.getContext(), qVar.n, 43, true).show();
                    return true;
                }
                if (r3Var.j3() && !r3Var.l3()) {
                    if (r3Var.L3()) {
                        ArrayList<TL_iv.PageBlock> Y2 = r3Var.Y2();
                        if (!Y2.isEmpty()) {
                            org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
                            xn xnVar = p2Var instanceof xn ? (xn) p2Var : null;
                            ti0 ti0Var = qVar.L;
                            if (ti0Var != null) {
                                ti0Var.h(false);
                                qVar.L = null;
                            }
                            ti0 ti0Var2 = new ti0(qVar.getContext(), g6Var);
                            qVar.L = ti0Var2;
                            ti0Var2.setOnDismissListener(new fg.d0(qVar, 13));
                            long n12 = miVar.n1();
                            MessageObject messageObject = xnVar != null ? xnVar.k5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i14).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i14).getPeer(UserConfig.getInstance(i14).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Y2;
                            richMessage.photos = r3Var.A2();
                            tL_message.rich_message.documents = r3Var.x2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i14, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            qVar.L.q(org.telegram.messenger.y3.m(messageObject2));
                            lg sendButton = v3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            lg r10 = qVar.L.r(sendButton, true, new org.telegram.ui.Components.voip.o(qVar, 26));
                            if (r10 != null) {
                                r10.setBackground(new wh.y1(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var))));
                                ti0 ti0Var3 = qVar.L;
                                int dp = AndroidUtilities.dp(44.0f);
                                ti0Var3.j0 = true;
                                ti0Var3.V = dp;
                            }
                            q70 F2 = q70.F(qVar, g6Var, sendButton);
                            boolean z11 = xnVar != null && UserObject.isUserSelf(xnVar.i());
                            if (xnVar != null && xnVar.D6()) {
                                F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new wh.d(qVar, n12, 0), false);
                                if (!z11 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new wh.e(qVar, 0), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new wh.e(qVar, 1), false);
                            }
                            F2.Y();
                            qVar.L.p(F2);
                            qVar.L.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    } else if (v3Var != null) {
                        v3Var.setSendEnabled(r3Var.L3());
                    }
                }
                return false;
            default:
                ((zf.e) this.b).c.callOnClick();
                return true;
        }
    }
}
