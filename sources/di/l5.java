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
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.fo;
import org.telegram.ui.gj0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                o6 o6Var = (o6) this.b;
                int i10 = o6Var.F1;
                if (o6Var.I1 != null) {
                    qg.s0 e = qg.s0.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z11 = qg.s0.e(i10).k;
                    for (int i11 = 0; i11 < o6Var.I1.getItemsCount(); i11++) {
                        View childAt = o6Var.I1.L.getChildAt(i11);
                        if (childAt instanceof l6) {
                            qg.l lVar = (qg.l) qg.l.b.get(i11);
                            ((l6) childAt).a(z11 ? lVar.m() : lVar.e(), z11, true);
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
                    kcVar.o();
                    kcVar.E0.setSelected(true);
                    kcVar.s.e(0.85f, 240L, null);
                    l80 F = l80.F(kcVar.r, kcVar.a, kcVar.E0);
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
                if (((ji.h1) this.b).length() != 0) {
                }
                break;
            case 3:
                break;
            case 4:
                ji.r rVar = ((ji.m) this.b).a;
                ji.c4 c4Var = rVar.s;
                org.telegram.ui.ActionBar.c6 c6Var = rVar.a;
                vi viVar = rVar.b;
                ji.x3 x3Var = rVar.r;
                int i12 = rVar.n;
                if (UserConfig.getInstance(i12).isPremium()) {
                    if (x3Var.l3() && !x3Var.n3()) {
                        if (x3Var.N3()) {
                            ArrayList<TL_iv.PageBlock> a32 = x3Var.a3();
                            if (!a32.isEmpty()) {
                                org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                                fo foVar = m2Var instanceof fo ? (fo) m2Var : null;
                                gj0 gj0Var = rVar.O;
                                if (gj0Var != null) {
                                    gj0Var.h(false);
                                    rVar.O = null;
                                }
                                gj0 gj0Var2 = new gj0(rVar.getContext(), c6Var);
                                rVar.O = gj0Var2;
                                gj0Var2.setOnDismissListener(new bi.t4(rVar, 4));
                                long p12 = viVar.p1();
                                MessageObject messageObject = foVar != null ? foVar.n5 : null;
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
                                rVar.O.q(org.telegram.messenger.g0.k(messageObject2));
                                wg sendButton = c4Var.getSendButton();
                                sendButton.setScaleX(1.0f);
                                sendButton.setScaleY(1.0f);
                                wg r10 = rVar.O.r(sendButton, true, new ah.g0(rVar, 28));
                                if (r10 != null) {
                                    r10.setBackground(new ji.c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var))));
                                    gj0 gj0Var3 = rVar.O;
                                    int dp = AndroidUtilities.dp(44.0f);
                                    z10 = true;
                                    gj0Var3.m0 = true;
                                    gj0Var3.Y = dp;
                                } else {
                                    z10 = true;
                                }
                                l80 F2 = l80.F(rVar, c6Var, sendButton);
                                boolean z12 = (foVar == null || !UserObject.isUserSelf(foVar.i())) ? false : z10;
                                if (foVar != null && foVar.G6()) {
                                    F2.c(R.drawable.msg_calendar2, LocaleController.getString(z12 ? R.string.SetReminder : R.string.ScheduleMessage), new bi.g(rVar, p12, 11), false);
                                    if (!z12 && p12 > 0) {
                                        F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ji.d(rVar, 0), false);
                                    }
                                }
                                if (!z12) {
                                    F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ji.d(rVar, 1), false);
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
                    new sg.y0(viVar.f0, rVar.getContext(), rVar.n, 43, true).show();
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
                    qg.s0 e7 = qg.s0.e(i13);
                    e7.k = !e7.k;
                    e7.a.edit().putBoolean("fill_shapes", e7.k).apply();
                    boolean z13 = qg.s0.e(i13).k;
                    for (int i14 = 0; i14 < o0Var.S1.getItemsCount(); i14++) {
                        View childAt2 = o0Var.S1.L.getChildAt(i14);
                        if (childAt2 instanceof rg.n0) {
                            qg.l lVar2 = (qg.l) qg.l.b.get(i14);
                            ((rg.n0) childAt2).a(z13 ? lVar2.m() : lVar2.e(), z13, true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
