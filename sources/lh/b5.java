package lh;

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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hg;
import org.telegram.ui.ni0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                int i10 = f6Var.B1;
                if (f6Var.E1 != null) {
                    yf.r0 e9 = yf.r0.e(i10);
                    e9.k = !e9.k;
                    e9.a.edit().putBoolean("fill_shapes", e9.k).apply();
                    boolean z10 = yf.r0.e(i10).k;
                    for (int i11 = 0; i11 < f6Var.E1.getItemsCount(); i11++) {
                        View childAt = f6Var.E1.H.getChildAt(i11);
                        if (childAt instanceof c6) {
                            yf.l lVar = (yf.l) yf.l.b.get(i11);
                            ((c6) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                sb sbVar = (sb) this.b;
                Activity activity = sbVar.b;
                wa waVar = sbVar.x0;
                if (waVar != null && waVar.isFrontface()) {
                    sbVar.p();
                    sbVar.A0.setSelected(true);
                    sbVar.s.e(0.85f, 240L, null);
                    b70 F = b70.F(sbVar.r, sbVar.a, sbVar.A0);
                    t7 t7Var = new t7(activity, 1);
                    t7Var.d(sbVar.s.o);
                    t7Var.h = new t9(sbVar, 21);
                    F.q(t7Var);
                    F.o();
                    t7 t7Var2 = new t7(activity, 2);
                    t7Var2.b = 0.65f;
                    t7Var2.c = 1.0f;
                    t7Var2.d(sbVar.s.p);
                    t7Var2.h = new t9(sbVar, 0);
                    F.q(t7Var2);
                    F.p = new s9(sbVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((rh.d1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                rh.p pVar = ((rh.k) this.b).a;
                rh.t3 t3Var = pVar.s;
                org.telegram.ui.ActionBar.c6 c6Var = pVar.a;
                gi giVar = pVar.b;
                rh.p3 p3Var = pVar.r;
                int i12 = pVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (p3Var.k3() && !p3Var.m3()) {
                        if (p3Var.M3()) {
                            ArrayList<TL_iv.PageBlock> Z2 = p3Var.Z2();
                            if (!Z2.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
                                rn rnVar = n2Var instanceof rn ? (rn) n2Var : null;
                                ni0 ni0Var = pVar.K;
                                if (ni0Var != null) {
                                    ni0Var.h(false);
                                    pVar.K = null;
                                }
                                ni0 ni0Var2 = new ni0(pVar.getContext(), c6Var);
                                pVar.K = ni0Var2;
                                ni0Var2.setOnDismissListener(new ag.j0(pVar, 13));
                                long n12 = giVar.n1();
                                MessageObject messageObject = rnVar != null ? rnVar.j5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(n12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
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
                                MessageObject messageObject2 = new MessageObject(i12, tL_message, false, false);
                                if (messageObject != null && !messageObject.isTopicMainMessage) {
                                    messageObject2.replyMessageObject = messageObject;
                                }
                                messageObject2.sendPreview = true;
                                messageObject2.isOutOwnerCached = Boolean.TRUE;
                                messageObject2.generateLayout(null);
                                messageObject2.notime = true;
                                pVar.K.q(org.telegram.messenger.y1.m(messageObject2));
                                hg sendButton = t3Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                hg r10 = pVar.K.r(sendButton, true, new c5(pVar, 22));
                                if (r10 != null) {
                                    r10.setBackground(new rh.w1(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var))));
                                    ni0 ni0Var3 = pVar.K;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    ni0Var3.i0 = true;
                                    ni0Var3.U = dp;
                                }
                                b70 F2 = b70.F(pVar, c6Var, sendButton);
                                boolean z11 = rnVar != null && UserObject.isUserSelf(rnVar.i());
                                if (rnVar != null && rnVar.D6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.web.c0(pVar, n12, 1), false);
                                    if (!z11 && n12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new rh.d(pVar, 0), false);
                                    }
                                }
                                if (!z11) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new rh.d(pVar, 1), false);
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
                        } else if (t3Var != null) {
                            t3Var.setSendEnabled(p3Var.M3());
                            break;
                        }
                    }
                } else {
                    new ag.g2(giVar.b0, pVar.getContext(), pVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((uf.e) this.b).c.callOnClick();
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.b;
                int i13 = l0Var.L1;
                if (l0Var.O1 != null) {
                    yf.r0 e10 = yf.r0.e(i13);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z12 = yf.r0.e(i13).k;
                    for (int i14 = 0; i14 < l0Var.O1.getItemsCount(); i14++) {
                        View childAt2 = l0Var.O1.H.getChildAt(i14);
                        if (childAt2 instanceof zf.k0) {
                            yf.l lVar2 = (yf.l) yf.l.b.get(i14);
                            ((zf.k0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
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
