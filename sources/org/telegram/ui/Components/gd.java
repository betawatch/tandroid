package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ gd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0836  */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ag agVar;
        boolean z10;
        qf qfVar;
        bf bfVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r92;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        int i10;
        int i11;
        int i12 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i12) {
            case 0:
                bf bfVar2 = chatActivityEnterView.A0;
                String obj = bfVar2 != null ? bfVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
                break;
            case 1:
                ye yeVar = chatActivityEnterView.H0;
                if (yeVar == null || yeVar.m0) {
                    AnimatorSet animatorSet = chatActivityEnterView.o2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.b0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                ag agVar2 = chatActivityEnterView.U2;
                if (agVar2 != null) {
                    agVar2.w0();
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.i5;
                if (chatActivityEnterView.W1 != null) {
                    if (chatActivityEnterView.V - chatActivityEnterView.W >= 0) {
                        wf y10 = chatActivityEnterView.y();
                        chatActivityEnterView.X1 = y10;
                        qf.v d = qf.v.d(chatActivityEnterView.M);
                        String str = chatActivityEnterView.W1.link;
                        String str2 = y10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = y10.b;
                        ed edVar = new ed(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, edVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.U;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.U.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 4:
                if (chatActivityEnterView.O4 == BotForumHelper.SteamingSendButtonState.STOP && (agVar = chatActivityEnterView.U2) != null) {
                    agVar.r1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.O0.getVisibility() == 0 && chatActivityEnterView.O0.getAlpha() == 1.0f && !chatActivityEnterView.f3) {
                    if (!chatActivityEnterView.u2 || (bfVar = chatActivityEnterView.A0) == null || !bfVar.isFocused()) {
                        if (!chatActivityEnterView.u3) {
                            if (!chatActivityEnterView.z3) {
                                z10 = true;
                                chatActivityEnterView.Q0.Q(true);
                                if (chatActivityEnterView.z3) {
                                    chatActivityEnterView.m1(chatActivityEnterView.u3 ^ z10, z10, false, z10);
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.Q0.u(true);
                            chatActivityEnterView.Q0.C();
                            if (chatActivityEnterView.t3) {
                                chatActivityEnterView.K(true);
                            }
                        } else if (!chatActivityEnterView.z3 && (qfVar = chatActivityEnterView.Q0) != null) {
                            qfVar.Q(false);
                        }
                        z10 = true;
                        if (chatActivityEnterView.z3) {
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.o2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    xj0 xj0Var = chatActivityEnterView.d1;
                    if (xj0Var != null) {
                        xj0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.Z2 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                        chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        ke keVar = chatActivityEnterView.F0;
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Y2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.X2 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.ui.Cells.pa.v(chatActivityEnterView.X2, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.X2).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                    long j10 = chatActivityEnterView.L2;
                    org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                    mediaDataController.pushDraftVoiceMessage(j10, (rnVar == null || !rnVar.d4) ? 0L : rnVar.b(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.e1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                    break;
                }
                break;
            case 7:
                nh.a0 a0Var = chatActivityEnterView.h0;
                boolean z14 = a0Var.v;
                a0Var.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.j0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.S0 && !chatActivityEnterView.T0) {
                            chatActivityEnterView.L0();
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new ed(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.m0(false);
                            break;
                        }
                    }
                } else if (z14) {
                    ze zeVar = chatActivityEnterView.i0;
                    if (zeVar != null) {
                        zeVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.i0 == null) {
                        ze zeVar2 = new ze(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.i0 = zeVar2;
                        hh.f1 f1Var = zeVar2.c;
                        chatActivityEnterView.getContext();
                        f1Var.setLayoutManager(new f2.k0());
                        hh.f1 f1Var2 = chatActivityEnterView.i0.c;
                        nh.z zVar = new nh.z();
                        zVar.c = new ArrayList();
                        zVar.d = new ArrayList();
                        zVar.e = new ArrayList();
                        chatActivityEnterView.j0 = zVar;
                        f1Var2.setAdapter(zVar);
                        chatActivityEnterView.i0.c.setOnItemClickListener(new af(chatActivityEnterView));
                        chatActivityEnterView.i0.c.setOnItemLongClickListener(new ee(chatActivityEnterView));
                        chatActivityEnterView.i0.setClipToPadding(false);
                        chatActivityEnterView.h1.addView(chatActivityEnterView.i0, h7.z5.e(-1, -1, 80));
                        chatActivityEnterView.i0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.S4;
                        if (hVar != null) {
                            chatActivityEnterView.j0.E(hVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    ze zeVar3 = chatActivityEnterView.i0;
                    if (zeVar3.getVisibility() != 0) {
                        zeVar3.setVisibility(0);
                        zeVar3.c.u0(0);
                        zeVar3.n = true;
                        zeVar3.f = false;
                        break;
                    } else if (zeVar3.f) {
                        zeVar3.f = false;
                        zeVar3.a();
                        zeVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                ag agVar3 = chatActivityEnterView.U2;
                if (agVar3 != null && !agVar3.g()) {
                    ag agVar4 = chatActivityEnterView.U2;
                    ig igVar = chatActivityEnterView.B0;
                    agVar4.l1(igVar, igVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.M).getMainSettings().edit();
                org.telegram.ui.rn rnVar2 = chatActivityEnterView.K2;
                if (BirthdayController.isToday(rnVar2.W7)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + rnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + rnVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.M).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.M).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + rnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.M).getUserFull(UserConfig.getInstance(chatActivityEnterView.M).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().W7 == null || !chatActivityEnterView.getParentFragment().W7.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.F1, false);
                }
                TLRPC.User i14 = chatActivityEnterView.getParentFragment().i();
                if (i14 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().W7 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().W7.birthday);
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new hh.x(chatActivityEnterView, cg.q0.j(chatActivityEnterView.M, null, new jh.d3(chatActivityEnterView, b2Var, i14, z15)), 4));
                    break;
                }
                break;
            case 10:
                int i15 = ChatActivityEnterView.i5;
                chatActivityEnterView.J0();
                break;
            case 11:
                xe xeVar = chatActivityEnterView.J0;
                if (xeVar != null && xeVar.isShowing()) {
                    chatActivityEnterView.J0.dismiss();
                }
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new o0.b(chatActivityEnterView, 5), chatActivityEnterView.R3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                xe xeVar2 = chatActivityEnterView2.J0;
                if (xeVar2 != null && xeVar2.isShowing()) {
                    chatActivityEnterView2.J0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                xe xeVar3 = chatActivityEnterView3.J0;
                if (xeVar3 != null && xeVar3.isShowing()) {
                    chatActivityEnterView3.J0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.Q;
                if (p1Var == null || !p1Var.f) {
                    if (chatActivityEnterView.w0) {
                        chatActivityEnterView.t1();
                        break;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.a2 == 0) {
                        if (chatActivityEnterView.M1 != 0) {
                            z13 = false;
                            chatActivityEnterView.l1(0, true);
                            qf qfVar2 = chatActivityEnterView.Q0;
                            if (qfVar2 != null) {
                                qfVar2.u(false);
                            }
                            bf bfVar3 = chatActivityEnterView.A0;
                            if (bfVar3 != null) {
                                bfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.u3) {
                            chatActivityEnterView.m1(z13, true, z13, true);
                            chatActivityEnterView.g3 = true;
                            AndroidUtilities.runOnUIThread(new ed(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.I0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        qf qfVar3 = chatActivityEnterView.Q0;
                        bf bfVar4 = chatActivityEnterView.A0;
                        boolean z16 = bfVar4 != null && bfVar4.length() > 0;
                        org.telegram.ui.rn rnVar3 = chatActivityEnterView.K2;
                        if (rnVar3 != null) {
                            lh.w3 w3Var = rnVar3.u1;
                            if (w3Var != null) {
                                if (w3Var.R) {
                                    w3Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            rnVar3.u1 = null;
                            if (z12) {
                                z11 = true;
                                qfVar3.F(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        qfVar3.F(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.Q0.u(false);
                    bf bfVar5 = chatActivityEnterView.A0;
                    if (bfVar5 != null) {
                        bfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.i2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.a2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.a2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.s1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.k2) {
                    chatActivityEnterView.setFieldText("/");
                    bf bfVar6 = chatActivityEnterView.A0;
                    if (bfVar6 != null) {
                        bfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.u3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.rn rnVar4 = chatActivityEnterView4.K2;
                if (!chatActivityEnterView4.g5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.t0()) {
                    if (chatActivityEnterView4.U2.i() > AndroidUtilities.dp(20.0f)) {
                        int P0 = chatActivityEnterView4.U2.P0();
                        int i16 = chatActivityEnterView4.U2.i();
                        if (i16 <= AndroidUtilities.dp(20.0f)) {
                            P0 += i16;
                        }
                        if (chatActivityEnterView4.S0) {
                            P0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (P0 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.q0 = new ud(chatActivityEnterView4, 4);
                            chatActivityEnterView4.P();
                            break;
                        }
                    }
                    if (chatActivityEnterView4.U2.y() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        re reVar = chatActivityEnterView4.m0;
                        if (reVar != null) {
                            reVar.e = false;
                            reVar.l(new o1.j[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.M);
                            if (chatActivityEnterView4.g5) {
                                peer = chatActivityEnterView4.U2.l();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.M).getChat(Long.valueOf(-chatActivityEnterView4.L2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.M).getChatFull(-chatActivityEnterView4.L2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.U2.y() != null && !chatActivityEnterView4.U2.y().peers.isEmpty()) {
                                peer = chatActivityEnterView4.U2.y().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.L2)));
                            if (chatActivityEnterView4.g5) {
                            } else {
                                rnVar4.getParentLayout().getOverlayContainerView();
                            }
                            re reVar2 = new re(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.K2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.U2.y(), new ag.l0(chatActivityEnterView4, chatFull, messagesController, 21), chatActivityEnterView4.R3);
                            chatActivityEnterView4.m0 = reVar2;
                            reVar2.e = true;
                            reVar2.c = 220;
                            reVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.m0.setClippingEnabled(true);
                            chatActivityEnterView4.m0.setFocusable(true);
                            chatActivityEnterView4.m0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.m0.setInputMethodMode(2);
                            chatActivityEnterView4.m0.setSoftInputMode(0);
                            chatActivityEnterView4.m0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.m0.b = false;
                            int i17 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || rnVar4 == null) {
                                i10 = i17;
                            } else {
                                rnVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i17;
                            }
                            int P02 = chatActivityEnterView4.U2.P0();
                            int measuredHeight = chatActivityEnterView4.m0.getContentView().getMeasuredHeight();
                            int i18 = chatActivityEnterView4.U2.i();
                            if (i18 <= AndroidUtilities.dp(20.0f)) {
                                P02 += i18;
                            }
                            if (chatActivityEnterView4.S0) {
                                P02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i17 * 2) + P02) - ((rnVar4 == null || !rnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.m0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i17) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i19 = (rnVar4 == null || !rnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.m0.o.getLayoutParams().height = ((P02 - i19) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i19;
                            }
                            re reVar3 = chatActivityEnterView4.m0;
                            View view2 = reVar3.u;
                            zk0 zk0Var = reVar3.v;
                            TLRPC.Peer peer3 = reVar3.r;
                            zn0 zn0Var = reVar3.o;
                            ag.p1 p1Var2 = reVar3.t;
                            ArrayList arrayList2 = reVar3.z;
                            int size = arrayList2.size();
                            int i20 = 0;
                            while (i20 < size) {
                                Object obj2 = arrayList2.get(i20);
                                i20++;
                                ((o1.j) obj2).c();
                            }
                            arrayList2.clear();
                            p1Var2.setPivotX(AndroidUtilities.dp(8.0f));
                            p1Var2.setPivotY(p1Var2.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            zn0Var.setPivotX(0.0f);
                            zn0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = reVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                int i21 = 0;
                                while (i21 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i21).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    int i22 = dp;
                                    long j11 = peer4.channel_id;
                                    if (j11 == 0 || j11 != peer3.channel_id) {
                                        long j12 = peer4.user_id;
                                        if (j12 == 0 || j12 != peer3.user_id) {
                                            long j13 = peer4.chat_id;
                                            if (j13 == 0 || j13 != peer3.chat_id) {
                                                i21++;
                                                arrayList3 = arrayList4;
                                                dp = i22;
                                            }
                                        }
                                    }
                                    reVar3.w.h1(i21, (size2 - ((arrayList4.size() - 2) * i22)) + AndroidUtilities.dp(7.0f) + ((i21 == arrayList4.size() + (-1) || zk0Var.getMeasuredHeight() >= size2) ? 0 : zk0Var.getMeasuredHeight() % i22));
                                    if (zk0Var.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            }
                            p1Var2.setScaleX(0.25f);
                            p1Var2.setScaleY(0.25f);
                            zn0Var.setAlpha(0.25f);
                            o1.j jVar = new o1.j(p1Var2, o1.h.o);
                            jVar.u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            jVar.b(new wn0(reVar3, 2));
                            o1.j jVar2 = new o1.j(p1Var2, o1.h.p);
                            jVar2.u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            jVar2.b(new wn0(reVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.j jVar3 = new o1.j(p1Var2, cVar);
                            jVar3.u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            o1.j jVar4 = new o1.j(zn0Var, cVar);
                            jVar4.u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                                arrayList2.add(jVar5);
                                jVar5.a(new xn0(reVar3, jVar5, 1));
                                jVar5.f();
                            }
                            re reVar4 = chatActivityEnterView4.m0;
                            chatActivityEnterView4.o0 = i10;
                            chatActivityEnterView4.p0 = i11;
                            reVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.l0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.n0 = new ud(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.g5) {
                        chatActivityEnterView4.n0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i23 = ChatActivityEnterView.i5;
                chatActivityEnterView.d0();
                break;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.Q;
                if ((p1Var3 == null || !p1Var3.f) && chatActivityEnterView.B != 0.0f) {
                    chatActivityEnterView.U2.q2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var4 = chatActivityEnterView.Q;
                if ((p1Var4 == null || !p1Var4.f) && chatActivityEnterView.B != 0.0f) {
                    chatActivityEnterView.U2.i1();
                    break;
                }
                break;
            default:
                int i24 = ChatActivityEnterView.i5;
                chatActivityEnterView.J0();
                break;
        }
    }
}
