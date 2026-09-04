package di;

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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.cj0;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n5(Object obj, int i10) {
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
                    qg.s0 e7 = qg.s0.e(i10);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z10 = qg.s0.e(i10).k;
                    for (int i11 = 0; i11 < q6Var.I1.getItemsCount(); i11++) {
                        View childAt = q6Var.I1.L.getChildAt(i11);
                        if (childAt instanceof n6) {
                            qg.l lVar = (qg.l) qg.l.b.get(i11);
                            ((n6) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                pc pcVar = (pc) this.b;
                Activity activity = pcVar.b;
                sb sbVar = pcVar.B0;
                if (sbVar != null && sbVar.isFrontface()) {
                    pcVar.p();
                    pcVar.E0.setSelected(true);
                    pcVar.s.e(0.85f, 240L, null);
                    n70 F = n70.F(pcVar.r, pcVar.a, pcVar.E0);
                    i8 i8Var = new i8(activity, 1);
                    i8Var.d(pcVar.s.o);
                    i8Var.h = new la(pcVar, 21);
                    F.q(i8Var);
                    F.o();
                    i8 i8Var2 = new i8(activity, 2);
                    i8Var2.b = 0.65f;
                    i8Var2.c = 1.0f;
                    i8Var2.d(pcVar.s.p);
                    i8Var2.h = new la(pcVar, 0);
                    F.q(i8Var2);
                    F.p = new ka(pcVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((ji.h1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                ji.r rVar = ((ji.m) this.b).a;
                ji.a4 a4Var = rVar.s;
                org.telegram.ui.ActionBar.f6 f6Var = rVar.a;
                vi viVar = rVar.b;
                ji.v3 v3Var = rVar.r;
                int i12 = rVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (v3Var.j3() && !v3Var.l3()) {
                        if (v3Var.L3()) {
                            ArrayList<TL_iv.PageBlock> Y2 = v3Var.Y2();
                            if (!Y2.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                                co coVar = n2Var instanceof co ? (co) n2Var : null;
                                cj0 cj0Var = rVar.O;
                                if (cj0Var != null) {
                                    cj0Var.h(false);
                                    rVar.O = null;
                                }
                                cj0 cj0Var2 = new cj0(rVar.getContext(), f6Var);
                                rVar.O = cj0Var2;
                                cj0Var2.setOnDismissListener(new bi.r4(rVar, 4));
                                long n12 = viVar.n1();
                                MessageObject messageObject = coVar != null ? coVar.n5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(n12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = Y2;
                                richMessage.photos = v3Var.A2();
                                tL_message.rich_message.documents = v3Var.x2();
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
                                rVar.O.q(org.telegram.messenger.w1.l(messageObject2));
                                vg sendButton = a4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                vg r10 = rVar.O.r(sendButton, true, new ah.h0(rVar, 28));
                                if (r10 != null) {
                                    r10.setBackground(new ji.b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                                    cj0 cj0Var3 = rVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    cj0Var3.m0 = true;
                                    cj0Var3.Y = dp;
                                }
                                n70 F2 = n70.F(rVar, f6Var, sendButton);
                                boolean z11 = coVar != null && UserObject.isUserSelf(coVar.i());
                                if (coVar != null && coVar.D6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new bi.g(rVar, n12, 10), false);
                                    if (!z11 && n12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ji.d(rVar, 0), false);
                                    }
                                }
                                if (!z11) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ji.d(rVar, 1), false);
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
                        } else if (a4Var != null) {
                            a4Var.setSendEnabled(v3Var.L3());
                            break;
                        }
                    }
                } else {
                    new sg.a1(viVar.f0, rVar.getContext(), rVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((mg.f) this.b).c.callOnClick();
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.b;
                int i13 = o0Var.P1;
                if (o0Var.S1 != null) {
                    qg.s0 e10 = qg.s0.e(i13);
                    e10.k = !e10.k;
                    e10.a.edit().putBoolean("fill_shapes", e10.k).apply();
                    boolean z12 = qg.s0.e(i13).k;
                    for (int i14 = 0; i14 < o0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = o0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof rg.n0) {
                            qg.l lVar2 = (qg.l) qg.l.b.get(i14);
                            ((rg.n0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
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
