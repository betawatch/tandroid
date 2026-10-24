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
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.qi0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                    j80 F = j80.F(vbVar.r, vbVar.a, vbVar.E0);
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
                org.telegram.ui.ActionBar.g6 g6Var = qVar.a;
                ti tiVar = qVar.b;
                ki.w3 w3Var = qVar.r;
                int i12 = qVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (w3Var.q3() && !w3Var.s3()) {
                        if (w3Var.S3()) {
                            ArrayList<TL_iv.PageBlock> f32 = w3Var.f3();
                            if (!f32.isEmpty()) {
                                org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
                                sn snVar = o2Var instanceof sn ? (sn) o2Var : null;
                                qi0 qi0Var = qVar.O;
                                if (qi0Var != null) {
                                    qi0Var.g(false);
                                    qVar.O = null;
                                }
                                qi0 qi0Var2 = new qi0(qVar.getContext(), g6Var);
                                qVar.O = qi0Var2;
                                qi0Var2.setOnDismissListener(new ai.cb(qVar, 7));
                                long s12 = tiVar.s1();
                                MessageObject messageObject = snVar != null ? snVar.z5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(s12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = f32;
                                richMessage.photos = w3Var.H2();
                                tL_message.rich_message.documents = w3Var.E2();
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
                                qVar.O.p(org.telegram.messenger.v0.k(messageObject2));
                                vg sendButton = b4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                vg q6 = qVar.O.q(sendButton, true, new hg.r0(qVar, 8));
                                if (q6 != null) {
                                    q6.setBackground(new ki.c2(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var))));
                                    qi0 qi0Var3 = qVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    z10 = true;
                                    qi0Var3.l0 = true;
                                    qi0Var3.X = dp;
                                } else {
                                    z10 = true;
                                }
                                j80 F2 = j80.F(qVar, g6Var, sendButton);
                                boolean z12 = (snVar == null || !UserObject.isUserSelf(snVar.i())) ? false : z10;
                                if (snVar != null && snVar.G6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z12 ? R.string.SetReminder : R.string.ScheduleMessage), new ai.v3(qVar, s12, 14), false);
                                    if (!z12 && s12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ki.d(qVar, 0), false);
                                    }
                                }
                                if (!z12) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ki.d(qVar, 1), false);
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
                        } else if (b4Var != null) {
                            b4Var.setSendEnabled(w3Var.S3());
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
