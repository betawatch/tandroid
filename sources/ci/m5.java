package ci;

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
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.wi;
import org.telegram.ui.wi0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                int i10 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.t0 e = pg.t0.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z10 = pg.t0.e(i10).k;
                    for (int i11 = 0; i11 < q6Var.I1.getItemsCount(); i11++) {
                        View childAt = q6Var.I1.L.getChildAt(i11);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.b.get(i11);
                            ((n6) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                lc lcVar = (lc) this.b;
                Activity activity = lcVar.b;
                ob obVar = lcVar.B0;
                if (obVar != null && obVar.isFrontface()) {
                    lcVar.p();
                    lcVar.E0.setSelected(true);
                    lcVar.s.e(0.85f, 240L, null);
                    o70 F = o70.F(lcVar.r, lcVar.a, lcVar.E0);
                    f8 f8Var = new f8(activity, 1);
                    f8Var.d(lcVar.s.o);
                    f8Var.h = new ia(lcVar, 21);
                    F.q(f8Var);
                    F.o();
                    f8 f8Var2 = new f8(activity, 2);
                    f8Var2.b = 0.65f;
                    f8Var2.c = 1.0f;
                    f8Var2.d(lcVar.s.p);
                    f8Var2.h = new ia(lcVar, 0);
                    F.q(f8Var2);
                    F.p = new ha(lcVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((ii.i1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                ii.r rVar = ((ii.m) this.b).a;
                ii.c4 c4Var = rVar.s;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.a;
                wi wiVar = rVar.b;
                ii.x3 x3Var = rVar.r;
                int i12 = rVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (x3Var.k3() && !x3Var.m3()) {
                        if (x3Var.M3()) {
                            ArrayList<TL_iv.PageBlock> Z2 = x3Var.Z2();
                            if (!Z2.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
                                xn xnVar = n2Var instanceof xn ? (xn) n2Var : null;
                                wi0 wi0Var = rVar.O;
                                if (wi0Var != null) {
                                    wi0Var.h(false);
                                    rVar.O = null;
                                }
                                wi0 wi0Var2 = new wi0(rVar.getContext(), d6Var);
                                rVar.O = wi0Var2;
                                wi0Var2.setOnDismissListener(new ai.f5(rVar, 4));
                                long n12 = wiVar.n1();
                                MessageObject messageObject = xnVar != null ? xnVar.n5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(n12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = Z2;
                                richMessage.photos = x3Var.B2();
                                tL_message.rich_message.documents = x3Var.y2();
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
                                rVar.O.q(org.telegram.messenger.z0.k(messageObject2));
                                ug sendButton = c4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                ug r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                                if (r10 != null) {
                                    r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                                    wi0 wi0Var3 = rVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    wi0Var3.m0 = true;
                                    wi0Var3.Y = dp;
                                }
                                o70 F2 = o70.F(rVar, d6Var, sendButton);
                                boolean z11 = xnVar != null && UserObject.isUserSelf(xnVar.i());
                                if (xnVar != null && xnVar.D6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new ai.j(rVar, n12, 10), false);
                                    if (!z11 && n12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ii.d(rVar, 0), false);
                                    }
                                }
                                if (!z11) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ii.d(rVar, 1), false);
                                }
                                F2.Y();
                                rVar.O.p(F2);
                                rVar.O.show();
                                try {
                                    view.performHapticFeedback(3, 2);
                                    break;
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                        } else if (c4Var != null) {
                            c4Var.setSendEnabled(x3Var.M3());
                            break;
                        }
                    }
                } else {
                    new rg.x0(wiVar.f0, rVar.getContext(), rVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((lg.f) this.b).c.callOnClick();
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.b;
                int i13 = p0Var.P1;
                if (p0Var.S1 != null) {
                    pg.t0 e7 = pg.t0.e(i13);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z12 = pg.t0.e(i13).k;
                    for (int i14 = 0; i14 < p0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = p0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof qg.o0) {
                            pg.l lVar2 = (pg.l) pg.l.b.get(i14);
                            ((qg.o0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
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
