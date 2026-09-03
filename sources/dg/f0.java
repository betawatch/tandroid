package dg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.p70;
import org.telegram.ui.ui0;
import org.telegram.ui.zn;
import ph.a5;
import ph.c5;
import ph.da;
import ph.g8;
import ph.h8;
import ph.i9;
import ph.n6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                int i10 = e1Var.M1;
                if (e1Var.P1 != null) {
                    cg.f1 e = cg.f1.e(i10);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z4 = cg.f1.e(i10).k;
                    for (int i11 = 0; i11 < e1Var.P1.getItemsCount(); i11++) {
                        View childAt = e1Var.P1.I.getChildAt(i11);
                        if (childAt instanceof c1) {
                            cg.l lVar = (cg.l) cg.l.b.get(i11);
                            ((c1) childAt).a(z4 ? lVar.m() : lVar.e(), z4, true);
                        }
                    }
                }
                return true;
            case 1:
                c5 c5Var = (c5) this.b;
                int i12 = c5Var.C1;
                if (c5Var.F1 != null) {
                    cg.f1 e6 = cg.f1.e(i12);
                    e6.k = !e6.k;
                    e6.a.edit().putBoolean("fill_shapes", e6.k).apply();
                    boolean z10 = cg.f1.e(i12).k;
                    for (int i13 = 0; i13 < c5Var.F1.getItemsCount(); i13++) {
                        View childAt2 = c5Var.F1.I.getChildAt(i13);
                        if (childAt2 instanceof a5) {
                            cg.l lVar2 = (cg.l) cg.l.b.get(i13);
                            ((a5) childAt2).a(z10 ? lVar2.m() : lVar2.e(), z10, true);
                        }
                    }
                }
                return true;
            case 2:
                da daVar = (da) this.b;
                Activity activity = daVar.b;
                i9 i9Var = daVar.y0;
                if (i9Var == null || !i9Var.isFrontface()) {
                    return false;
                }
                daVar.p();
                daVar.B0.setSelected(true);
                daVar.s.e(0.85f, 240L, null);
                p70 F = p70.F(daVar.r, daVar.a, daVar.B0);
                n6 n6Var = new n6(activity, 1);
                n6Var.d(daVar.s.o);
                n6Var.h = new h8(daVar, 21);
                F.q(n6Var);
                F.o();
                n6 n6Var2 = new n6(activity, 2);
                n6Var2.b = 0.65f;
                n6Var2.c = 1.0f;
                n6Var2.d(daVar.s.p);
                n6Var2.h = new h8(daVar, 0);
                F.q(n6Var2);
                F.p = new g8(daVar, 1);
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                return ((vh.e1) this.b).length() != 0;
            case 4:
                return vh.y1.W((vh.y1) this.b, view);
            case 5:
                vh.q qVar = ((vh.l) this.b).a;
                vh.w3 w3Var = qVar.s;
                f6 f6Var = qVar.a;
                li liVar = qVar.b;
                vh.s3 s3Var = qVar.r;
                int i14 = qVar.n;
                if (!UserConfig.getInstance(i14).isPremium()) {
                    new eg.o1(liVar.c0, qVar.getContext(), qVar.n, 43, true).show();
                    return true;
                }
                if (s3Var.j3() && !s3Var.l3()) {
                    if (s3Var.L3()) {
                        ArrayList<TL_iv.PageBlock> Y2 = s3Var.Y2();
                        if (!Y2.isEmpty()) {
                            org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                            zn znVar = p2Var instanceof zn ? (zn) p2Var : null;
                            ui0 ui0Var = qVar.L;
                            if (ui0Var != null) {
                                ui0Var.h(false);
                                qVar.L = null;
                            }
                            ui0 ui0Var2 = new ui0(qVar.getContext(), f6Var);
                            qVar.L = ui0Var2;
                            ui0Var2.setOnDismissListener(new eg.d0(qVar, 13));
                            long n12 = liVar.n1();
                            MessageObject messageObject = znVar != null ? znVar.k5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i14).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i14).getPeer(UserConfig.getInstance(i14).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Y2;
                            richMessage.photos = s3Var.A2();
                            tL_message.rich_message.documents = s3Var.x2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i14, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            qVar.L.q(org.telegram.messenger.y3.m(messageObject2));
                            lg sendButton = w3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            lg r10 = qVar.L.r(sendButton, true, new oh.n(qVar, 26));
                            if (r10 != null) {
                                r10.setBackground(new vh.x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(j6.Oh, f6Var))));
                                ui0 ui0Var3 = qVar.L;
                                int dp = AndroidUtilities.dp(44.0f);
                                ui0Var3.j0 = true;
                                ui0Var3.V = dp;
                            }
                            p70 F2 = p70.F(qVar, f6Var, sendButton);
                            boolean z11 = znVar != null && UserObject.isUserSelf(znVar.i());
                            if (znVar != null && znVar.D6()) {
                                F2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new vh.d(qVar, n12, 0), false);
                                if (!z11 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new vh.e(qVar, 0), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new vh.e(qVar, 1), false);
                            }
                            F2.Y();
                            qVar.L.p(F2);
                            qVar.L.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    } else if (w3Var != null) {
                        w3Var.setSendEnabled(s3Var.L3());
                    }
                }
                return false;
            default:
                ((yf.e) this.b).c.callOnClick();
                return true;
        }
    }
}
