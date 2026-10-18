package ei;

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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ni0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean z10;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                int i10 = f6Var.F1;
                if (f6Var.I1 != null) {
                    qg.u0 e = qg.u0.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z11 = qg.u0.e(i10).k;
                    for (int i11 = 0; i11 < f6Var.I1.getItemsCount(); i11++) {
                        View childAt = f6Var.I1.L.getChildAt(i11);
                        if (childAt instanceof c6) {
                            qg.l lVar = (qg.l) qg.l.b.get(i11);
                            ((c6) childAt).a(z11 ? lVar.m() : lVar.e(), z11, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                vb vbVar = (vb) this.b;
                Activity activity = vbVar.b;
                ya yaVar = vbVar.B0;
                if (yaVar != null && yaVar.isFrontface()) {
                    vbVar.o();
                    vbVar.E0.setSelected(true);
                    vbVar.s.e(0.85f, 240L, null);
                    i80 F = i80.F(vbVar.r, vbVar.a, vbVar.E0);
                    u7 u7Var = new u7(activity, 1);
                    u7Var.d(vbVar.s.o);
                    u7Var.h = new u9(vbVar, 21);
                    F.q(u7Var);
                    F.o();
                    u7 u7Var2 = new u7(activity, 2);
                    u7Var2.b = 0.65f;
                    u7Var2.c = 1.0f;
                    u7Var2.d(vbVar.s.p);
                    u7Var2.h = new u9(vbVar, 0);
                    F.q(u7Var2);
                    F.p = new t9(vbVar, 1);
                    F.s = 0;
                    F.V(5);
                    F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                    F.P(-1155851493);
                    F.Z();
                    break;
                }
                break;
            case 2:
                if (((ki.h1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                ki.q qVar = ((ki.l) this.b).a;
                ki.b4 b4Var = qVar.s;
                org.telegram.ui.ActionBar.d6 d6Var = qVar.a;
                ti tiVar = qVar.b;
                ki.w3 w3Var = qVar.r;
                int i12 = qVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (w3Var.l3() && !w3Var.n3()) {
                        if (w3Var.N3()) {
                            ArrayList<TL_iv.PageBlock> a32 = w3Var.a3();
                            if (!a32.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                                sn snVar = n2Var instanceof sn ? (sn) n2Var : null;
                                ni0 ni0Var = qVar.O;
                                if (ni0Var != null) {
                                    ni0Var.h(false);
                                    qVar.O = null;
                                }
                                ni0 ni0Var2 = new ni0(qVar.getContext(), d6Var);
                                qVar.O = ni0Var2;
                                ni0Var2.setOnDismissListener(new ai.bb(qVar, 7));
                                long p12 = tiVar.p1();
                                MessageObject messageObject = snVar != null ? snVar.n5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(p12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = a32;
                                richMessage.photos = w3Var.C2();
                                tL_message.rich_message.documents = w3Var.z2();
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
                                qVar.O.q(org.telegram.messenger.g0.k(messageObject2));
                                vg sendButton = b4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                vg r10 = qVar.O.r(sendButton, true, new hg.r0(qVar, 8));
                                if (r10 != null) {
                                    r10.setBackground(new ki.c2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                                    ni0 ni0Var3 = qVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    z10 = true;
                                    ni0Var3.m0 = true;
                                    ni0Var3.Y = dp;
                                } else {
                                    z10 = true;
                                }
                                i80 F2 = i80.F(qVar, d6Var, sendButton);
                                boolean z12 = (snVar == null || !UserObject.isUserSelf(snVar.i())) ? false : z10;
                                if (snVar != null && snVar.G6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z12 ? R.string.SetReminder : R.string.ScheduleMessage), new ai.t3(qVar, p12, 14), false);
                                    if (!z12 && p12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ki.d(qVar, 0), false);
                                    }
                                }
                                if (!z12) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ki.d(qVar, 1), false);
                                }
                                F2.Y();
                                qVar.O.p(F2);
                                qVar.O.show();
                                try {
                                    view.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                break;
                            }
                        } else if (b4Var != null) {
                            b4Var.setSendEnabled(w3Var.N3());
                        }
                    }
                    break;
                } else {
                    new sg.y0(tiVar.f0, qVar.getContext(), qVar.n, 43, true).show();
                    break;
                }
                break;
            case 5:
                ((mg.f) this.b).c.callOnClick();
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.b;
                int i13 = m0Var.P1;
                if (m0Var.S1 != null) {
                    qg.u0 e7 = qg.u0.e(i13);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z13 = qg.u0.e(i13).k;
                    for (int i14 = 0; i14 < m0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof rg.l0) {
                            qg.l lVar2 = (qg.l) qg.l.b.get(i14);
                            ((rg.l0) childAt2).a(z13 ? lVar2.m() : lVar2.e(), z13, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
