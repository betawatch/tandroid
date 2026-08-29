package bg;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import nh.g9;
import nh.gb;
import nh.h9;
import nh.i7;
import nh.ka;
import nh.r5;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.og;
import org.telegram.ui.ki0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                int i10 = g1Var.L1;
                if (g1Var.O1 != null) {
                    ag.h1 e10 = ag.h1.e(i10);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = ag.h1.e(i10).k;
                    for (int i11 = 0; i11 < g1Var.O1.getItemsCount(); i11++) {
                        View childAt = g1Var.O1.H.getChildAt(i11);
                        if (childAt instanceof e1) {
                            ag.l lVar = (ag.l) ag.l.b.get(i11);
                            ((e1) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                }
                return true;
            case 1:
                t5 t5Var = (t5) this.b;
                int i12 = t5Var.B1;
                if (t5Var.E1 != null) {
                    ag.h1 e11 = ag.h1.e(i12);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z11 = ag.h1.e(i12).k;
                    for (int i13 = 0; i13 < t5Var.E1.getItemsCount(); i13++) {
                        View childAt2 = t5Var.E1.H.getChildAt(i13);
                        if (childAt2 instanceof r5) {
                            ag.l lVar2 = (ag.l) ag.l.b.get(i13);
                            ((r5) childAt2).a(z11 ? lVar2.m() : lVar2.e(), z11, true);
                        }
                    }
                }
                return true;
            case 2:
                gb gbVar = (gb) this.b;
                Activity activity = gbVar.b;
                ka kaVar = gbVar.x0;
                if (kaVar == null || !kaVar.isFrontface()) {
                    return false;
                }
                gbVar.p();
                gbVar.A0.setSelected(true);
                gbVar.s.e(0.85f, 240L, null);
                j70 F = j70.F(gbVar.r, gbVar.a, gbVar.A0);
                i7 i7Var = new i7(activity, 1);
                i7Var.d(gbVar.s.o);
                i7Var.h = new h9(gbVar, 21);
                F.q(i7Var);
                F.o();
                i7 i7Var2 = new i7(activity, 2);
                i7Var2.b = 0.65f;
                i7Var2.c = 1.0f;
                i7Var2.d(gbVar.s.p);
                i7Var2.h = new h9(gbVar, 0);
                F.q(i7Var2);
                F.p = new g9(gbVar, 1);
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                return ((th.d1) this.b).length() != 0;
            case 4:
                return th.x1.W((th.x1) this.b, view);
            case 5:
                th.p pVar = ((th.k) this.b).a;
                th.t3 t3Var = pVar.s;
                c6 c6Var = pVar.a;
                ni niVar = pVar.b;
                th.p3 p3Var = pVar.r;
                int i14 = pVar.n;
                if (!UserConfig.getInstance(i14).isPremium()) {
                    new cg.p1(niVar.b0, pVar.getContext(), pVar.n, 43, true).show();
                    return true;
                }
                if (p3Var.k3() && !p3Var.m3()) {
                    if (p3Var.M3()) {
                        ArrayList<TL_iv.PageBlock> Z2 = p3Var.Z2();
                        if (!Z2.isEmpty()) {
                            org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
                            tn tnVar = o2Var instanceof tn ? (tn) o2Var : null;
                            ki0 ki0Var = pVar.K;
                            if (ki0Var != null) {
                                ki0Var.h(false);
                                pVar.K = null;
                            }
                            ki0 ki0Var2 = new ki0(pVar.getContext(), c6Var);
                            pVar.K = ki0Var2;
                            ki0Var2.setOnDismissListener(new cg.d0(pVar, 13));
                            long n12 = niVar.n1();
                            MessageObject messageObject = tnVar != null ? tnVar.j5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i14).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i14).getPeer(UserConfig.getInstance(i14).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Z2;
                            richMessage.photos = p3Var.B2();
                            tL_message.rich_message.documents = p3Var.y2();
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
                            pVar.K.q(org.telegram.messenger.x3.n(messageObject2));
                            og sendButton = t3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            og r6 = pVar.K.r(sendButton, true, new mh.n(pVar, 26));
                            if (r6 != null) {
                                r6.setBackground(new th.w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(g6.Oh, c6Var))));
                                ki0 ki0Var3 = pVar.K;
                                int dp = AndroidUtilities.dp(44.0f);
                                ki0Var3.i0 = true;
                                ki0Var3.U = dp;
                            }
                            j70 F2 = j70.F(pVar, c6Var, sendButton);
                            boolean z12 = tnVar != null && UserObject.isUserSelf(tnVar.i());
                            if (tnVar != null && tnVar.D6()) {
                                F2.c(R.drawable.msg_calendar2, LocaleController.getString(z12 ? R.string.SetReminder : R.string.ScheduleMessage), new qh.m0(pVar, n12, 1), false);
                                if (!z12 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new th.d(pVar, 0), false);
                                }
                            }
                            if (!z12) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new th.d(pVar, 1), false);
                            }
                            F2.Y();
                            pVar.K.p(F2);
                            pVar.K.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    } else if (t3Var != null) {
                        t3Var.setSendEnabled(p3Var.M3());
                    }
                }
                return false;
            default:
                ((wf.e) this.b).c.callOnClick();
                return true;
        }
    }
}
