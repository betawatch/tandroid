package fi;

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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ni0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        boolean z10;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                int i10 = e6Var.u1;
                if (e6Var.x1 != null) {
                    rg.s0 e = rg.s0.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z11 = rg.s0.e(i10).k;
                    for (int i11 = 0; i11 < e6Var.x1.getItemsCount(); i11++) {
                        View childAt = e6Var.x1.L.getChildAt(i11);
                        if (childAt instanceof b6) {
                            rg.l lVar = (rg.l) rg.l.b.get(i11);
                            ((b6) childAt).a(z11 ? lVar.m() : lVar.e(), z11, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                sb sbVar = (sb) this.b;
                Activity activity = sbVar.b;
                va vaVar = sbVar.B0;
                if (vaVar != null && vaVar.isFrontface()) {
                    sbVar.o();
                    sbVar.E0.setSelected(true);
                    sbVar.s.e(0.85f, 240L, null);
                    k80 F = k80.F(sbVar.r, sbVar.a, sbVar.E0);
                    q7 q7Var = new q7(activity, 1);
                    q7Var.d(sbVar.s.o);
                    q7Var.h = new q9(sbVar, 21);
                    F.q(q7Var);
                    F.o();
                    q7 q7Var2 = new q7(activity, 2);
                    q7Var2.b = 0.65f;
                    q7Var2.c = 1.0f;
                    q7Var2.d(sbVar.s.p);
                    q7Var2.h = new q9(sbVar, 0);
                    F.q(q7Var2);
                    F.p = new p9(sbVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((li.g1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                li.q qVar = ((li.l) this.b).a;
                li.a4 a4Var = qVar.s;
                org.telegram.ui.ActionBar.u6 u6Var = qVar.a;
                ti tiVar = qVar.b;
                li.v3 v3Var = qVar.r;
                int i12 = qVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (v3Var.q3() && !v3Var.s3()) {
                        if (v3Var.S3()) {
                            ArrayList<TL_iv.PageBlock> f32 = v3Var.f3();
                            if (!f32.isEmpty()) {
                                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                                un unVar = r2Var instanceof un ? (un) r2Var : null;
                                ni0 ni0Var = qVar.O;
                                if (ni0Var != null) {
                                    ni0Var.g(false);
                                    qVar.O = null;
                                }
                                ni0 ni0Var2 = new ni0(qVar.getContext(), u6Var);
                                qVar.O = ni0Var2;
                                ni0Var2.setOnDismissListener(new bi.cb(qVar, 7));
                                long s12 = tiVar.s1();
                                MessageObject messageObject = unVar != null ? unVar.z5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(s12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = f32;
                                richMessage.photos = v3Var.H2();
                                tL_message.rich_message.documents = v3Var.E2();
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
                                qVar.O.p(org.telegram.messenger.t.l(messageObject2));
                                vg sendButton = a4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                vg q5 = qVar.O.q(sendButton, true, new ig.d0(qVar, 9));
                                if (q5 != null) {
                                    q5.setBackground(new li.a2(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var))));
                                    ni0 ni0Var3 = qVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    z10 = true;
                                    ni0Var3.l0 = true;
                                    ni0Var3.X = dp;
                                } else {
                                    z10 = true;
                                }
                                k80 F2 = k80.F(qVar, u6Var, sendButton);
                                boolean z12 = (unVar == null || !UserObject.isUserSelf(unVar.i())) ? false : z10;
                                if (unVar != null && unVar.I6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z12 ? R.string.SetReminder : R.string.ScheduleMessage), new bi.r3(qVar, s12, 14), false);
                                    if (!z12 && s12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new li.d(qVar, 0), false);
                                    }
                                }
                                if (!z12) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new li.d(qVar, 1), false);
                                }
                                F2.Y();
                                qVar.O.o(F2);
                                qVar.O.show();
                                try {
                                    view.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                break;
                            }
                        } else if (a4Var != null) {
                            a4Var.setSendEnabled(v3Var.S3());
                        }
                    }
                    break;
                } else {
                    new tg.y0(tiVar.f0, qVar.getContext(), qVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((ng.f) this.b).c.callOnClick();
                break;
            default:
                sg.n0 n0Var = (sg.n0) this.b;
                int i13 = n0Var.E1;
                if (n0Var.H1 != null) {
                    rg.s0 e10 = rg.s0.e(i13);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z13 = rg.s0.e(i13).k;
                    for (int i14 = 0; i14 < n0Var.H1.getItemsCount(); i14++) {
                        View childAt2 = n0Var.H1.L.getChildAt(i14);
                        if (childAt2 instanceof sg.m0) {
                            rg.l lVar2 = (rg.l) rg.l.b.get(i14);
                            ((sg.m0) childAt2).a(z13 ? lVar2.m() : lVar2.e(), z13, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
