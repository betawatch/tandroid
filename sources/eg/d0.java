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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.q70;
import org.telegram.ui.ti0;
import org.telegram.ui.xn;
import qh.b5;
import qh.ca;
import qh.g8;
import qh.g9;
import qh.h8;
import qh.m6;
import qh.z4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                b5 b5Var = (b5) this.b;
                int i12 = b5Var.C1;
                if (b5Var.F1 != null) {
                    dg.e1 e10 = dg.e1.e(i12);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = dg.e1.e(i12).k;
                    for (int i13 = 0; i13 < b5Var.F1.getItemsCount(); i13++) {
                        View childAt2 = b5Var.F1.I.getChildAt(i13);
                        if (childAt2 instanceof z4) {
                            dg.l lVar2 = (dg.l) dg.l.b.get(i13);
                            ((z4) childAt2).a(z10 ? lVar2.m() : lVar2.e(), z10, true);
                        }
                    }
                }
                return true;
            case 2:
                ca caVar = (ca) this.b;
                Activity activity = caVar.b;
                g9 g9Var = caVar.y0;
                if (g9Var == null || !g9Var.isFrontface()) {
                    return false;
                }
                caVar.p();
                caVar.B0.setSelected(true);
                caVar.s.e(0.85f, 240L, null);
                q70 F = q70.F(caVar.r, caVar.a, caVar.B0);
                m6 m6Var = new m6(activity, 1);
                m6Var.d(caVar.s.o);
                m6Var.h = new h8(caVar, 21);
                F.q(m6Var);
                F.o();
                m6 m6Var2 = new m6(activity, 2);
                m6Var2.b = 0.65f;
                m6Var2.c = 1.0f;
                m6Var2.d(caVar.s.p);
                m6Var2.h = new h8(caVar, 0);
                F.q(m6Var2);
                F.p = new g8(caVar, 1);
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
                if (r3Var.k3() && !r3Var.m3()) {
                    if (r3Var.M3()) {
                        ArrayList<TL_iv.PageBlock> Z2 = r3Var.Z2();
                        if (!Z2.isEmpty()) {
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
                            richMessage.blocks = Z2;
                            richMessage.photos = r3Var.B2();
                            tL_message.rich_message.documents = r3Var.y2();
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
                                r10.setBackground(new wh.y1(k6.b0(AndroidUtilities.dp(22.0f), k6.v0(k6.Oh, g6Var))));
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
                        v3Var.setSendEnabled(r3Var.M3());
                    }
                }
                return false;
            default:
                ((zf.e) this.b).c.callOnClick();
                return true;
        }
    }
}
