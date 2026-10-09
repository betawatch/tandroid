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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qg qgVar;
        boolean z10;
        gg ggVar;
        sf sfVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r92;
        float f7;
        float f10;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 22;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i13) {
            case 0:
                sf sfVar2 = chatActivityEnterView.E0;
                String obj = sfVar2 != null ? sfVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 1:
                pf pfVar = chatActivityEnterView.L0;
                if (pfVar == null || pfVar.q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.Q0();
                        break;
                    }
                }
                break;
            case 2:
                qg qgVar2 = chatActivityEnterView.Z2;
                if (qgVar2 != null) {
                    qgVar2.O0();
                    break;
                }
                break;
            case 3:
                int i15 = ChatActivityEnterView.n5;
                if (chatActivityEnterView.b2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        mg w10 = chatActivityEnterView.w();
                        chatActivityEnterView.c2 = w10;
                        hg.z d = hg.z.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.b2.link;
                        String str2 = w10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = w10.b;
                        vd vdVar = new vd(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, vdVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.b0.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 4:
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (qgVar = chatActivityEnterView.Z2) != null) {
                    qgVar.G1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.k3) {
                    if (!chatActivityEnterView.z2 || (sfVar = chatActivityEnterView.E0) == null || !sfVar.isFocused()) {
                        if (!chatActivityEnterView.z3) {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.R1 != 0) {
                            z10 = true;
                            chatActivityEnterView.k1(0, true);
                            chatActivityEnterView.U0.u(true);
                            chatActivityEnterView.U0.C();
                            if (chatActivityEnterView.y3) {
                                chatActivityEnterView.I(true);
                            }
                        } else {
                            if (!chatActivityEnterView.E3 && (ggVar = chatActivityEnterView.U0) != null) {
                                ggVar.O(false);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.l1(chatActivityEnterView.z3 ^ z10, z10, false, z10);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    ll0 ll0Var = chatActivityEnterView.h1;
                    if (ll0Var != null) {
                        ll0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        chatActivityEnterView.Z2.q2(2, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                        af afVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            hg.c.t(chatActivityEnterView.c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j3 = chatActivityEnterView.Q2;
                    org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                    mediaDataController.pushDraftVoiceMessage(j3, (znVar == null || !znVar.h4) ? 0L : znVar.d(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.I(true);
                    break;
                }
                break;
            case 7:
                ei.c0 c0Var = chatActivityEnterView.l0;
                boolean z14 = c0Var.v;
                c0Var.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.h0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.J0();
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.k0(false);
                            break;
                        }
                    }
                } else if (z14) {
                    qf qfVar = chatActivityEnterView.m0;
                    if (qfVar != null) {
                        qfVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.m0 == null) {
                        qf qfVar2 = new qf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = qfVar2;
                        ai.w0 w0Var = qfVar2.c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.d0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.c;
                        ei.b0 b0Var = new ei.b0();
                        b0Var.c = new ArrayList();
                        b0Var.d = new ArrayList();
                        b0Var.e = new ArrayList();
                        chatActivityEnterView.n0 = b0Var;
                        w0Var2.setAdapter(b0Var);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new rf(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new ue(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.m1.addView(chatActivityEnterView.m0, w7.x5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.n0.E(iVar);
                        }
                        chatActivityEnterView.A1();
                    }
                    qf qfVar3 = chatActivityEnterView.m0;
                    if (qfVar3.getVisibility() != 0) {
                        qfVar3.setVisibility(0);
                        qfVar3.c.u0(0);
                        qfVar3.n = true;
                        qfVar3.f = false;
                        break;
                    } else if (qfVar3.f) {
                        qfVar3.f = false;
                        qfVar3.a();
                        qfVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                qg qgVar3 = chatActivityEnterView.Z2;
                if (qgVar3 != null && !qgVar3.m()) {
                    qg qgVar4 = chatActivityEnterView.Z2;
                    yg ygVar = chatActivityEnterView.F0;
                    qgVar4.z1(ygVar, ygVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.zn znVar2 = chatActivityEnterView.P2;
                if (BirthdayController.isToday(znVar2.a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + znVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + znVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + znVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().a8 == null || !chatActivityEnterView.getParentFragment().a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i16 = chatActivityEnterView.getParentFragment().i();
                if (i16 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().a8.birthday);
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.ca(chatActivityEnterView, tg.s.j(chatActivityEnterView.Q, null, new ai.u4(chatActivityEnterView, b2Var, i16, z15)), 3));
                    break;
                }
                break;
            case 10:
                int i17 = ChatActivityEnterView.n5;
                chatActivityEnterView.H0();
                break;
            case 11:
                of ofVar = chatActivityEnterView.N0;
                if (ofVar != null && ofVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new l2.f(chatActivityEnterView, 10), chatActivityEnterView.W3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                of ofVar2 = chatActivityEnterView2.N0;
                if (ofVar2 != null && ofVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                of ofVar3 = chatActivityEnterView3.N0;
                if (ofVar3 != null && ofVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.s1();
                        break;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z13 = false;
                            chatActivityEnterView.k1(0, true);
                            gg ggVar2 = chatActivityEnterView.U0;
                            if (ggVar2 != null) {
                                ggVar2.u(false);
                            }
                            sf sfVar3 = chatActivityEnterView.E0;
                            if (sfVar3 != null) {
                                sfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.z3) {
                            chatActivityEnterView.l1(z13, true, z13, true);
                            chatActivityEnterView.l3 = true;
                            AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.G0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.r1(1, 0, true, true);
                        gg ggVar3 = chatActivityEnterView.U0;
                        sf sfVar4 = chatActivityEnterView.E0;
                        boolean z16 = sfVar4 != null && sfVar4.length() > 0;
                        org.telegram.ui.zn znVar3 = chatActivityEnterView.P2;
                        if (znVar3 != null) {
                            ci.d4 d4Var = znVar3.y1;
                            if (d4Var != null) {
                                if (d4Var.V) {
                                    d4Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            znVar3.y1 = null;
                            if (z12) {
                                z11 = true;
                                ggVar3.D(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        ggVar3.D(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.u(false);
                    sf sfVar5 = chatActivityEnterView.E0;
                    if (sfVar5 != null) {
                        sfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.n2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.f2 == 1) {
                                chatActivityEnterView.r1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.r1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.p2) {
                    chatActivityEnterView.setFieldText("/");
                    sf sfVar6 = chatActivityEnterView.E0;
                    if (sfVar6 != null) {
                        sfVar6.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.z3) {
                    chatActivityEnterView.l1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.zn znVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.l5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.r0()) {
                    if (chatActivityEnterView4.Z2.v() > AndroidUtilities.dp(20.0f)) {
                        int h12 = chatActivityEnterView4.Z2.h1();
                        int v = chatActivityEnterView4.Z2.v();
                        f7 = 20.0f;
                        if (v <= AndroidUtilities.dp(20.0f)) {
                            h12 += v;
                        }
                        if (chatActivityEnterView4.W0) {
                            h12 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (h12 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.u0 = new le(chatActivityEnterView4, 4);
                            chatActivityEnterView4.N();
                            break;
                        }
                    } else {
                        f7 = 20.0f;
                    }
                    if (chatActivityEnterView4.Z2.P() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        hf hfVar = chatActivityEnterView4.q0;
                        if (hfVar != null) {
                            hfVar.e = false;
                            hfVar.l(new o1.k[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                            if (chatActivityEnterView4.l5) {
                                peer = chatActivityEnterView4.Z2.x();
                                chatFull = null;
                                f10 = 1.0f;
                            } else {
                                f10 = 1.0f;
                                MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.Q2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.Q2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Z2.P() != null && !chatActivityEnterView4.Z2.P().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Z2.P().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                            if (chatActivityEnterView4.l5) {
                            } else {
                                znVar4.getParentLayout().getOverlayContainerView();
                            }
                            hf hfVar2 = new hf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.Z2.P(), new ai.r5(chatActivityEnterView4, chatFull, messagesController, i14), chatActivityEnterView4.W3);
                            chatActivityEnterView4.q0 = hfVar2;
                            hfVar2.e = true;
                            hfVar2.c = 220;
                            hfVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.q0.setClippingEnabled(true);
                            chatActivityEnterView4.q0.setFocusable(true);
                            chatActivityEnterView4.q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.q0.setInputMethodMode(2);
                            chatActivityEnterView4.q0.setSoftInputMode(0);
                            chatActivityEnterView4.q0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.q0.b = false;
                            int i18 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || znVar4 == null) {
                                i10 = i18;
                            } else {
                                znVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i18;
                            }
                            int h13 = chatActivityEnterView4.Z2.h1();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int v9 = chatActivityEnterView4.Z2.v();
                            if (v9 <= AndroidUtilities.dp(f7)) {
                                h13 += v9;
                            }
                            if (chatActivityEnterView4.W0) {
                                h13 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(f10);
                            if (measuredHeight < (((i18 * 2) + h13) - ((znVar4 == null || !znVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i18) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i19 = (znVar4 == null || !znVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((h13 - i19) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i19;
                            }
                            hf hfVar3 = chatActivityEnterView4.q0;
                            View view2 = hfVar3.u;
                            qm0 qm0Var = hfVar3.v;
                            TLRPC.Peer peer3 = hfVar3.r;
                            up0 up0Var = hfVar3.o;
                            ai.f0 f0Var = hfVar3.t;
                            int i20 = 1;
                            ArrayList arrayList2 = hfVar3.z;
                            int size = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size) {
                                Object obj2 = arrayList2.get(i21);
                                i21++;
                                ((o1.k) obj2).c();
                            }
                            arrayList2.clear();
                            f0Var.setPivotX(AndroidUtilities.dp(8.0f));
                            f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            up0Var.setPivotX(0.0f);
                            up0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = hfVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                i12 = 2;
                                int i22 = 0;
                                while (i22 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i22).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    qm0 qm0Var2 = qm0Var;
                                    long j10 = peer4.channel_id;
                                    if (j10 == 0 || j10 != peer3.channel_id) {
                                        long j11 = peer4.user_id;
                                        if (j11 == 0 || j11 != peer3.user_id) {
                                            long j12 = peer4.chat_id;
                                            if (j12 == 0 || j12 != peer3.chat_id) {
                                                i22++;
                                                qm0Var = qm0Var2;
                                                arrayList3 = arrayList4;
                                                f10 = 1.0f;
                                            }
                                        }
                                    }
                                    hfVar3.w.h1(i22, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + ((i22 == arrayList4.size() + (-1) || qm0Var2.getMeasuredHeight() >= size2) ? 0 : qm0Var2.getMeasuredHeight() % dp));
                                    if (qm0Var2.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(f10).setDuration(150L).start();
                                    }
                                }
                            } else {
                                i12 = 2;
                            }
                            f0Var.setScaleX(0.25f);
                            f0Var.setScaleY(0.25f);
                            up0Var.setAlpha(0.25f);
                            o1.k kVar = new o1.k(f0Var, o1.h.o);
                            kVar.u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                            kVar.b(new rp0(hfVar3, i12));
                            o1.k kVar2 = new o1.k(f0Var, o1.h.p);
                            kVar2.u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                            kVar2.b(new rp0(hfVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.k kVar3 = new o1.k(f0Var, cVar);
                            kVar3.u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                            o1.k kVar4 = new o1.k(up0Var, cVar);
                            kVar4.u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                            for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                                arrayList2.add(kVar5);
                                kVar5.a(new sp0(hfVar3, kVar5, i20));
                                kVar5.h();
                                i20 = 1;
                            }
                            hf hfVar4 = chatActivityEnterView4.q0;
                            chatActivityEnterView4.s0 = i10;
                            chatActivityEnterView4.t0 = i11;
                            hfVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.p0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.r0 = new le(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.l5) {
                        chatActivityEnterView4.l0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.l0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i23 = ChatActivityEnterView.n5;
                chatActivityEnterView.b0();
                break;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.F2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.w1();
                    break;
                }
                break;
            default:
                int i24 = ChatActivityEnterView.n5;
                chatActivityEnterView.H0();
                break;
        }
    }
}
