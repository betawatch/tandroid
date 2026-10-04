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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.xi;
import org.telegram.ui.yn;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                    pg.u0 e7 = pg.u0.e(i10);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z10 = pg.u0.e(i10).k;
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
                kc kcVar = (kc) this.b;
                Activity activity = kcVar.b;
                nb nbVar = kcVar.B0;
                if (nbVar != null && nbVar.isFrontface()) {
                    kcVar.p();
                    kcVar.E0.setSelected(true);
                    kcVar.s.e(0.85f, 240L, null);
                    b80 F = b80.F(kcVar.r, kcVar.a, kcVar.E0);
                    e8 e8Var = new e8(activity, 1);
                    e8Var.d(kcVar.s.o);
                    e8Var.h = new ha(kcVar, 21);
                    F.q(e8Var);
                    F.o();
                    e8 e8Var2 = new e8(activity, 2);
                    e8Var2.b = 0.65f;
                    e8Var2.c = 1.0f;
                    e8Var2.d(kcVar.s.p);
                    e8Var2.h = new ha(kcVar, 0);
                    F.q(e8Var2);
                    F.p = new ga(kcVar, 1);
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
                xi xiVar = rVar.b;
                ii.x3 x3Var = rVar.r;
                int i12 = rVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (x3Var.m3() && !x3Var.o3()) {
                        if (x3Var.O3()) {
                            ArrayList<TL_iv.PageBlock> b32 = x3Var.b3();
                            if (!b32.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
                                yn ynVar = n2Var instanceof yn ? (yn) n2Var : null;
                                zi0 zi0Var = rVar.O;
                                if (zi0Var != null) {
                                    zi0Var.h(false);
                                    rVar.O = null;
                                }
                                zi0 zi0Var2 = new zi0(rVar.getContext(), d6Var);
                                rVar.O = zi0Var2;
                                zi0Var2.setOnDismissListener(new ai.f5(rVar, 4));
                                long l1 = xiVar.l1();
                                MessageObject messageObject = ynVar != null ? ynVar.l5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(l1);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = b32;
                                richMessage.photos = x3Var.D2();
                                tL_message.rich_message.documents = x3Var.A2();
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
                                rVar.O.q(org.telegram.messenger.f0.k(messageObject2));
                                wg sendButton = c4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                wg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                                if (r10 != null) {
                                    r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var))));
                                    zi0 zi0Var3 = rVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    zi0Var3.m0 = true;
                                    zi0Var3.Y = dp;
                                }
                                b80 F2 = b80.F(rVar, d6Var, sendButton);
                                boolean z11 = ynVar != null && UserObject.isUserSelf(ynVar.i());
                                if (ynVar != null && ynVar.D6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new ai.j(rVar, l1, 10), false);
                                    if (!z11 && l1 > 0) {
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
                            c4Var.setSendEnabled(x3Var.O3());
                            break;
                        }
                    }
                } else {
                    new rg.y0(xiVar.f0, rVar.getContext(), rVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((lg.f) this.b).c.callOnClick();
                break;
            default:
                qg.m0 m0Var = (qg.m0) this.b;
                int i13 = m0Var.P1;
                if (m0Var.S1 != null) {
                    pg.u0 e10 = pg.u0.e(i13);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z12 = pg.u0.e(i13).k;
                    for (int i14 = 0; i14 < m0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof qg.l0) {
                            pg.l lVar2 = (pg.l) pg.l.b.get(i14);
                            ((qg.l0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
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
