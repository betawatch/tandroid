package bi;

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
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                int i10 = r7Var.F1;
                if (r7Var.I1 != null) {
                    og.x0 e = og.x0.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z10 = og.x0.e(i10).k;
                    for (int i11 = 0; i11 < r7Var.I1.getItemsCount(); i11++) {
                        View childAt = r7Var.I1.L.getChildAt(i11);
                        if (childAt instanceof o7) {
                            og.l lVar = (og.l) og.l.b.get(i11);
                            ((o7) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ce ceVar = (ce) this.b;
                Activity activity = ceVar.b;
                bd bdVar = ceVar.B0;
                if (bdVar != null && bdVar.isFrontface()) {
                    ceVar.p();
                    ceVar.E0.setSelected(true);
                    ceVar.s.e(0.85f, 240L, null);
                    w70 F = w70.F(ceVar.r, ceVar.a, ceVar.E0);
                    k9 k9Var = new k9(activity, 1);
                    k9Var.d(ceVar.s.o);
                    k9Var.h = new ub(ceVar, 21);
                    F.q(k9Var);
                    F.o();
                    k9 k9Var2 = new k9(activity, 2);
                    k9Var2.b = 0.65f;
                    k9Var2.c = 1.0f;
                    k9Var2.d(ceVar.s.p);
                    k9Var2.h = new ub(ceVar, 0);
                    F.q(k9Var2);
                    F.p = new tb(ceVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((hi.k1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                hi.s sVar = ((hi.n) this.b).a;
                hi.e4 e4Var = sVar.s;
                org.telegram.ui.ActionBar.f6 f6Var = sVar.a;
                yi yiVar = sVar.b;
                hi.z3 z3Var = sVar.r;
                int i12 = sVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (z3Var.j3() && !z3Var.l3()) {
                        if (z3Var.L3()) {
                            ArrayList<TL_iv.PageBlock> Y2 = z3Var.Y2();
                            if (!Y2.isEmpty()) {
                                org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
                                eo eoVar = p2Var instanceof eo ? (eo) p2Var : null;
                                cj0 cj0Var = sVar.O;
                                if (cj0Var != null) {
                                    cj0Var.h(false);
                                    sVar.O = null;
                                }
                                cj0 cj0Var2 = new cj0(sVar.getContext(), f6Var);
                                sVar.O = cj0Var2;
                                cj0Var2.setOnDismissListener(new gg.o(sVar, 2));
                                long n12 = yiVar.n1();
                                MessageObject messageObject = eoVar != null ? eoVar.n5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(n12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = Y2;
                                richMessage.photos = z3Var.A2();
                                tL_message.rich_message.documents = z3Var.x2();
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
                                sVar.O.q(org.telegram.messenger.a2.l(messageObject2));
                                xg sendButton = e4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                xg r10 = sVar.O.r(sendButton, true, new ai.u(sVar, 22));
                                if (r10 != null) {
                                    r10.setBackground(new hi.f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                                    cj0 cj0Var3 = sVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    cj0Var3.m0 = true;
                                    cj0Var3.Y = dp;
                                }
                                w70 F2 = w70.F(sVar, f6Var, sendButton);
                                boolean z11 = eoVar != null && UserObject.isUserSelf(eoVar.i());
                                if (eoVar != null && eoVar.D6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new va(sVar, n12, 5), false);
                                    if (!z11 && n12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new hi.e(sVar, 0), false);
                                    }
                                }
                                if (!z11) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hi.e(sVar, 1), false);
                                }
                                F2.Y();
                                sVar.O.p(F2);
                                sVar.O.show();
                                try {
                                    view.performHapticFeedback(3, 2);
                                    break;
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                        } else if (e4Var != null) {
                            e4Var.setSendEnabled(z3Var.L3());
                            break;
                        }
                    }
                } else {
                    new qg.a1(yiVar.f0, sVar.getContext(), sVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((kg.f) this.b).c.callOnClick();
                break;
            default:
                pg.m0 m0Var = (pg.m0) this.b;
                int i13 = m0Var.P1;
                if (m0Var.S1 != null) {
                    og.x0 e7 = og.x0.e(i13);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z12 = og.x0.e(i13).k;
                    for (int i14 = 0; i14 < m0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof pg.l0) {
                            og.l lVar2 = (og.l) og.l.b.get(i14);
                            ((pg.l0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
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
