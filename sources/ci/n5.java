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
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w70;
import org.telegram.ui.cj0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                r6 r6Var = (r6) this.b;
                int i10 = r6Var.F1;
                if (r6Var.I1 != null) {
                    pg.u0 e = pg.u0.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z10 = pg.u0.e(i10).k;
                    for (int i11 = 0; i11 < r6Var.I1.getItemsCount(); i11++) {
                        View childAt = r6Var.I1.L.getChildAt(i11);
                        if (childAt instanceof o6) {
                            pg.l lVar = (pg.l) pg.l.b.get(i11);
                            ((o6) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                    break;
                }
                break;
            case 1:
                oc ocVar = (oc) this.b;
                Activity activity = ocVar.b;
                rb rbVar = ocVar.B0;
                if (rbVar != null && rbVar.isFrontface()) {
                    ocVar.p();
                    ocVar.E0.setSelected(true);
                    ocVar.s.e(0.85f, 240L, null);
                    w70 F = w70.F(ocVar.r, ocVar.a, ocVar.E0);
                    i8 i8Var = new i8(activity, 1);
                    i8Var.d(ocVar.s.o);
                    i8Var.h = new la(ocVar, 21);
                    F.q(i8Var);
                    F.o();
                    i8 i8Var2 = new i8(activity, 2);
                    i8Var2.b = 0.65f;
                    i8Var2.c = 1.0f;
                    i8Var2.d(ocVar.s.p);
                    i8Var2.h = new la(ocVar, 0);
                    F.q(i8Var2);
                    F.p = new ka(ocVar, 1);
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
                ii.b4 b4Var = rVar.s;
                org.telegram.ui.ActionBar.e6 e6Var = rVar.a;
                vi viVar = rVar.b;
                ii.w3 w3Var = rVar.r;
                int i12 = rVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (w3Var.l3() && !w3Var.n3()) {
                        if (w3Var.N3()) {
                            ArrayList<TL_iv.PageBlock> a32 = w3Var.a3();
                            if (!a32.isEmpty()) {
                                org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                                zn znVar = n2Var instanceof zn ? (zn) n2Var : null;
                                cj0 cj0Var = rVar.O;
                                if (cj0Var != null) {
                                    cj0Var.h(false);
                                    rVar.O = null;
                                }
                                cj0 cj0Var2 = new cj0(rVar.getContext(), e6Var);
                                rVar.O = cj0Var2;
                                cj0Var2.setOnDismissListener(new ai.g5(rVar, 4));
                                long n12 = viVar.n1();
                                MessageObject messageObject = znVar != null ? znVar.n5 : null;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = 0;
                                tL_message.out = true;
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(n12);
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
                                rVar.O.q(org.telegram.messenger.q.l(messageObject2));
                                ug sendButton = b4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                ug r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                                if (r10 != null) {
                                    r10.setBackground(new ii.c2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var))));
                                    cj0 cj0Var3 = rVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    cj0Var3.m0 = true;
                                    cj0Var3.Y = dp;
                                }
                                w70 F2 = w70.F(rVar, e6Var, sendButton);
                                boolean z11 = znVar != null && UserObject.isUserSelf(znVar.i());
                                if (znVar != null && znVar.D6()) {
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
                        } else if (b4Var != null) {
                            b4Var.setSendEnabled(w3Var.N3());
                            break;
                        }
                    }
                } else {
                    new rg.x0(viVar.f0, rVar.getContext(), rVar.n, 43, true).show();
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
                    pg.u0 e7 = pg.u0.e(i13);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
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
