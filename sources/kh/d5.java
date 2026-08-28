package kh;

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
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.x60;
import org.telegram.ui.li0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.b;
                int i9 = g6Var.B1;
                if (g6Var.E1 != null) {
                    xf.s0 e10 = xf.s0.e(i9);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z10 = xf.s0.e(i9).k;
                    for (int i10 = 0; i10 < g6Var.E1.getItemsCount(); i10++) {
                        View childAt = g6Var.E1.H.getChildAt(i10);
                        if (childAt instanceof d6) {
                            xf.l lVar = (xf.l) xf.l.b.get(i10);
                            ((d6) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                wb wbVar = (wb) this.b;
                Activity activity = wbVar.b;
                za zaVar = wbVar.x0;
                if (zaVar != null && zaVar.isFrontface()) {
                    wbVar.p();
                    wbVar.A0.setSelected(true);
                    wbVar.s.e(0.85f, 240L, null);
                    x60 F = x60.F(wbVar.r, wbVar.a, wbVar.A0);
                    u7 u7Var = new u7(activity, 1);
                    u7Var.d(wbVar.s.o);
                    u7Var.h = new w9(wbVar, 21);
                    F.q(u7Var);
                    F.o();
                    u7 u7Var2 = new u7(activity, 2);
                    u7Var2.b = 0.65f;
                    u7Var2.c = 1.0f;
                    u7Var2.d(wbVar.s.p);
                    u7Var2.h = new w9(wbVar, 0);
                    F.q(u7Var2);
                    F.p = new v9(wbVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((qh.d1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                qh.p pVar = ((qh.k) this.b).a;
                qh.s3 s3Var = pVar.s;
                org.telegram.ui.ActionBar.b6 b6Var = pVar.a;
                ki kiVar = pVar.b;
                qh.o3 o3Var = pVar.r;
                int i11 = pVar.n;
                if (UserConfig.getInstance(i11).isPremium()) {
                    if (o3Var.k3() && !o3Var.m3()) {
                        if (o3Var.M3()) {
                            ArrayList<TL_iv.PageBlock> Z2 = o3Var.Z2();
                            if (!Z2.isEmpty()) {
                                org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
                                qn qnVar = o2Var instanceof qn ? (qn) o2Var : null;
                                li0 li0Var = pVar.K;
                                if (li0Var != null) {
                                    li0Var.h(false);
                                    pVar.K = null;
                                }
                                li0 li0Var2 = new li0(pVar.getContext(), b6Var);
                                pVar.K = li0Var2;
                                li0Var2.setOnDismissListener(new eh.l(pVar, 11));
                                long n12 = kiVar.n1();
                                MessageObject messageObject = qnVar != null ? qnVar.j5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i11).getPeer(n12);
                                tL_message.from_id = MessagesController.getInstance(i11).getPeer(UserConfig.getInstance(i11).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = Z2;
                                richMessage.photos = o3Var.B2();
                                tL_message.rich_message.documents = o3Var.y2();
                                if (messageObject != null && !messageObject.isTopicMainMessage) {
                                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                    tL_messageReplyHeader.flags |= 16;
                                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                    tL_message.reply_to = tL_messageReplyHeader;
                                }
                                MessageObject messageObject2 = new MessageObject(i11, tL_message, false, false);
                                if (messageObject != null && !messageObject.isTopicMainMessage) {
                                    messageObject2.replyMessageObject = messageObject;
                                }
                                messageObject2.sendPreview = true;
                                messageObject2.isOutOwnerCached = Boolean.TRUE;
                                messageObject2.generateLayout(null);
                                messageObject2.notime = true;
                                pVar.K.q(org.telegram.messenger.l0.k(messageObject2));
                                lg sendButton = s3Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                lg r10 = pVar.K.r(sendButton, true, new x8(pVar, 20));
                                if (r10 != null) {
                                    r10.setBackground(new qh.w1(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var))));
                                    li0 li0Var3 = pVar.K;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    li0Var3.i0 = true;
                                    li0Var3.U = dp;
                                }
                                x60 F2 = x60.F(pVar, b6Var, sendButton);
                                boolean z11 = qnVar != null && UserObject.isUserSelf(qnVar.i());
                                if (qnVar != null && qnVar.D6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.web.b0(pVar, n12, 1), false);
                                    if (!z11 && n12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new qh.d(pVar, 0), false);
                                    }
                                }
                                if (!z11) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new qh.d(pVar, 1), false);
                                }
                                F2.Y();
                                pVar.K.p(F2);
                                pVar.K.show();
                                try {
                                    view.performHapticFeedback(3, 2);
                                    break;
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                        } else if (s3Var != null) {
                            s3Var.setSendEnabled(o3Var.M3());
                            break;
                        }
                    }
                } else {
                    new zf.x0(kiVar.b0, pVar.getContext(), pVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((tf.e) this.b).c.callOnClick();
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.b;
                int i12 = l0Var.L1;
                if (l0Var.O1 != null) {
                    xf.s0 e11 = xf.s0.e(i12);
                    e11.k = !e11.k;
                    e11.a.edit().putBoolean("fill_shapes", e11.k).apply();
                    boolean z12 = xf.s0.e(i12).k;
                    for (int i13 = 0; i13 < l0Var.O1.getItemsCount(); i13++) {
                        View childAt2 = l0Var.O1.H.getChildAt(i13);
                        if (childAt2 instanceof yf.k0) {
                            xf.l lVar2 = (xf.l) xf.l.b.get(i13);
                            ((yf.k0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
        return true;
    }
}
