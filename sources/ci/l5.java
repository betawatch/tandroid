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
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.dj0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean z10;
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                int i10 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.u0 e7 = pg.u0.e(i10);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z11 = pg.u0.e(i10).k;
                    for (int i11 = 0; i11 < q6Var.I1.getItemsCount(); i11++) {
                        View childAt = q6Var.I1.L.getChildAt(i11);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.b.get(i11);
                            ((n6) childAt).a(z11 ? lVar.m() : lVar.e(), z11, true);
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
                    lcVar.o();
                    lcVar.E0.setSelected(true);
                    lcVar.s.e(0.85f, 240L, null);
                    p80 F = p80.F(lcVar.r, lcVar.a, lcVar.E0);
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
                org.telegram.ui.ActionBar.e6 e6Var = rVar.a;
                yi yiVar = rVar.b;
                ii.x3 x3Var = rVar.r;
                int i12 = rVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (x3Var.l3() && !x3Var.n3()) {
                        if (x3Var.N3()) {
                            ArrayList<TL_iv.PageBlock> a32 = x3Var.a3();
                            if (!a32.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
                                zn znVar = n2Var instanceof zn ? (zn) n2Var : null;
                                dj0 dj0Var = rVar.O;
                                if (dj0Var != null) {
                                    dj0Var.h(false);
                                    rVar.O = null;
                                }
                                dj0 dj0Var2 = new dj0(rVar.getContext(), e6Var);
                                rVar.O = dj0Var2;
                                dj0Var2.setOnDismissListener(new ai.g5(rVar, 4));
                                long p12 = yiVar.p1();
                                MessageObject messageObject = znVar != null ? znVar.n5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(p12);
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.flags2 |= 8192;
                                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                                tL_message.rich_message = richMessage;
                                richMessage.blocks = a32;
                                richMessage.photos = x3Var.C2();
                                tL_message.rich_message.documents = x3Var.z2();
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
                                rVar.O.q(org.telegram.messenger.q.k(messageObject2));
                                xg sendButton = c4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                xg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                                if (r10 != null) {
                                    r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var))));
                                    dj0 dj0Var3 = rVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    z10 = true;
                                    dj0Var3.m0 = true;
                                    dj0Var3.Y = dp;
                                } else {
                                    z10 = true;
                                }
                                p80 F2 = p80.F(rVar, e6Var, sendButton);
                                boolean z12 = (znVar == null || !UserObject.isUserSelf(znVar.i())) ? false : z10;
                                if (znVar != null && znVar.G6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z12 ? R.string.SetReminder : R.string.ScheduleMessage), new ai.j(rVar, p12, 11), false);
                                    if (!z12 && p12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ii.d(rVar, 0), false);
                                    }
                                }
                                if (!z12) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ii.d(rVar, 1), false);
                                }
                                F2.Y();
                                rVar.O.p(F2);
                                rVar.O.show();
                                try {
                                    view.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                break;
                            }
                        } else if (c4Var != null) {
                            c4Var.setSendEnabled(x3Var.N3());
                        }
                    }
                    break;
                } else {
                    new rg.y0(yiVar.f0, rVar.getContext(), rVar.n, 43, true).show();
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
                    boolean z13 = pg.u0.e(i13).k;
                    for (int i14 = 0; i14 < m0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof qg.l0) {
                            pg.l lVar2 = (pg.l) pg.l.b.get(i14);
                            ((qg.l0) childAt2).a(z13 ? lVar2.m() : lVar2.e(), z13, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
