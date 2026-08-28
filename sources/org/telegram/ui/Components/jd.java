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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0837  */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        eg egVar;
        boolean z10;
        uf ufVar;
        ff ffVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r92;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        int i9;
        int i10;
        int i11 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i11) {
            case 0:
                ff ffVar2 = chatActivityEnterView.A0;
                String obj = ffVar2 != null ? ffVar2.getText().toString() : "";
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
                cf cfVar = chatActivityEnterView.H0;
                if (cfVar == null || cfVar.m0) {
                    AnimatorSet animatorSet = chatActivityEnterView.o2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.b0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                eg egVar2 = chatActivityEnterView.U2;
                if (egVar2 != null) {
                    egVar2.x0();
                    break;
                }
                break;
            case 3:
                int i12 = ChatActivityEnterView.i5;
                if (chatActivityEnterView.W1 != null) {
                    if (chatActivityEnterView.V - chatActivityEnterView.W >= 0) {
                        ag x10 = chatActivityEnterView.x();
                        chatActivityEnterView.X1 = x10;
                        pf.u d = pf.u.d(chatActivityEnterView.M);
                        String str = chatActivityEnterView.W1.link;
                        String str2 = x10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = x10.b;
                        hd hdVar = new hd(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, hdVar);
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
                if (chatActivityEnterView.O4 == BotForumHelper.SteamingSendButtonState.STOP && (egVar = chatActivityEnterView.U2) != null) {
                    egVar.q1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.O0.getVisibility() == 0 && chatActivityEnterView.O0.getAlpha() == 1.0f && !chatActivityEnterView.f3) {
                    if (!chatActivityEnterView.u2 || (ffVar = chatActivityEnterView.A0) == null || !ffVar.isFocused()) {
                        if (!chatActivityEnterView.u3) {
                            if (!chatActivityEnterView.z3) {
                                z10 = true;
                                chatActivityEnterView.Q0.P(true);
                                if (chatActivityEnterView.z3) {
                                    chatActivityEnterView.n1(chatActivityEnterView.u3 ^ z10, z10, false, z10);
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.Q0.t(true);
                            chatActivityEnterView.Q0.A();
                            if (chatActivityEnterView.t3) {
                                chatActivityEnterView.J(true);
                            }
                        } else if (!chatActivityEnterView.z3 && (ufVar = chatActivityEnterView.Q0) != null) {
                            ufVar.P(false);
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
                    vj0 vj0Var = chatActivityEnterView.d1;
                    if (vj0Var != null) {
                        vj0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.Z2 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                        chatActivityEnterView.U2.U1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        oe oeVar = chatActivityEnterView.F0;
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Y2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.X2 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            j3.r0.x(chatActivityEnterView.X2, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.X2).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                    long j10 = chatActivityEnterView.L2;
                    org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                    mediaDataController.pushDraftVoiceMessage(j10, (qnVar == null || !qnVar.d4) ? 0L : qnVar.b(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.e1 = 0L;
                    chatActivityEnterView.n0(false);
                    chatActivityEnterView.J(true);
                    break;
                }
                break;
            case 7:
                mh.c0 c0Var = chatActivityEnterView.h0;
                boolean z14 = c0Var.v;
                c0Var.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.i0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.S0 && !chatActivityEnterView.T0) {
                            chatActivityEnterView.L0();
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new hd(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.l0(false);
                            break;
                        }
                    }
                } else if (z14) {
                    df dfVar = chatActivityEnterView.i0;
                    if (dfVar != null) {
                        dfVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.i0 == null) {
                        df dfVar2 = new df(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.i0 = dfVar2;
                        gh.f1 f1Var = dfVar2.c;
                        chatActivityEnterView.getContext();
                        f1Var.setLayoutManager(new f2.m0());
                        gh.f1 f1Var2 = chatActivityEnterView.i0.c;
                        mh.b0 b0Var = new mh.b0();
                        b0Var.c = new ArrayList();
                        b0Var.d = new ArrayList();
                        b0Var.e = new ArrayList();
                        chatActivityEnterView.j0 = b0Var;
                        f1Var2.setAdapter(b0Var);
                        chatActivityEnterView.i0.c.setOnItemClickListener(new ef(chatActivityEnterView));
                        chatActivityEnterView.i0.c.setOnItemLongClickListener(new ie(chatActivityEnterView));
                        chatActivityEnterView.i0.setClipToPadding(false);
                        chatActivityEnterView.h1.addView(chatActivityEnterView.i0, g7.e6.e(-1, -1, 80));
                        chatActivityEnterView.i0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.S4;
                        if (hVar != null) {
                            chatActivityEnterView.j0.E(hVar);
                        }
                        chatActivityEnterView.C1();
                    }
                    df dfVar3 = chatActivityEnterView.i0;
                    if (dfVar3.getVisibility() != 0) {
                        dfVar3.setVisibility(0);
                        dfVar3.c.u0(0);
                        dfVar3.n = true;
                        dfVar3.f = false;
                        break;
                    } else if (dfVar3.f) {
                        dfVar3.f = false;
                        dfVar3.a();
                        dfVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                eg egVar3 = chatActivityEnterView.U2;
                if (egVar3 != null && !egVar3.g()) {
                    eg egVar4 = chatActivityEnterView.U2;
                    mg mgVar = chatActivityEnterView.B0;
                    egVar4.k1(mgVar, mgVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.M).getMainSettings().edit();
                org.telegram.ui.qn qnVar2 = chatActivityEnterView.K2;
                if (BirthdayController.isToday(qnVar2.W7)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + qnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + qnVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.M).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.M).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + qnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.M).getUserFull(UserConfig.getInstance(chatActivityEnterView.M).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().W7 == null || !chatActivityEnterView.getParentFragment().W7.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.F1, false);
                }
                TLRPC.User i13 = chatActivityEnterView.getParentFragment().i();
                if (i13 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().W7 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().W7.birthday);
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(chatActivityEnterView.getContext(), 3, null);
                    c2Var.q(200L);
                    c2Var.setOnCancelListener(new gh.x(chatActivityEnterView, bg.u0.j(chatActivityEnterView.M, null, new ih.e3(chatActivityEnterView, c2Var, i13, z15)), 4));
                    break;
                }
                break;
            case 10:
                int i14 = ChatActivityEnterView.i5;
                chatActivityEnterView.I0();
                break;
            case 11:
                bf bfVar = chatActivityEnterView.J0;
                if (bfVar != null && bfVar.isShowing()) {
                    chatActivityEnterView.J0.dismiss();
                }
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new m5.c0(chatActivityEnterView, 12), chatActivityEnterView.R3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                bf bfVar2 = chatActivityEnterView2.J0;
                if (bfVar2 != null && bfVar2.isShowing()) {
                    chatActivityEnterView2.J0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                bf bfVar3 = chatActivityEnterView3.J0;
                if (bfVar3 != null && bfVar3.isShowing()) {
                    chatActivityEnterView3.J0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.q1 q1Var = chatActivityEnterView.Q;
                if (q1Var == null || !q1Var.f) {
                    if (chatActivityEnterView.w0) {
                        chatActivityEnterView.u1();
                        break;
                    } else if (chatActivityEnterView.s0() && chatActivityEnterView.a2 == 0) {
                        if (chatActivityEnterView.M1 != 0) {
                            z13 = false;
                            chatActivityEnterView.m1(0, true);
                            uf ufVar2 = chatActivityEnterView.Q0;
                            if (ufVar2 != null) {
                                ufVar2.t(false);
                            }
                            ff ffVar3 = chatActivityEnterView.A0;
                            if (ffVar3 != null) {
                                ffVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.u3) {
                            chatActivityEnterView.n1(z13, true, z13, true);
                            chatActivityEnterView.g3 = true;
                            AndroidUtilities.runOnUIThread(new hd(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.H0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        uf ufVar3 = chatActivityEnterView.Q0;
                        ff ffVar4 = chatActivityEnterView.A0;
                        boolean z16 = ffVar4 != null && ffVar4.length() > 0;
                        org.telegram.ui.qn qnVar3 = chatActivityEnterView.K2;
                        if (qnVar3 != null) {
                            kh.x3 x3Var = qnVar3.u1;
                            if (x3Var != null) {
                                if (x3Var.R) {
                                    x3Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            qnVar3.u1 = null;
                            if (z12) {
                                z11 = true;
                                ufVar3.E(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        ufVar3.E(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.Q0.t(false);
                    ff ffVar5 = chatActivityEnterView.A0;
                    if (ffVar5 != null) {
                        ffVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.i2 != null) {
                    if (chatActivityEnterView.s0()) {
                        r92 = 1;
                        if (chatActivityEnterView.a2 == 1) {
                            if (chatActivityEnterView.s0() && chatActivityEnterView.a2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.t1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.k2) {
                    chatActivityEnterView.setFieldText("/");
                    ff ffVar6 = chatActivityEnterView.A0;
                    if (ffVar6 != null) {
                        ffVar6.requestFocus();
                    }
                    chatActivityEnterView.G0();
                }
                if (chatActivityEnterView.u3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.qn qnVar4 = chatActivityEnterView4.K2;
                if (!chatActivityEnterView4.g5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.s0()) {
                    if (chatActivityEnterView4.U2.j() > AndroidUtilities.dp(20.0f)) {
                        int N0 = chatActivityEnterView4.U2.N0();
                        int j11 = chatActivityEnterView4.U2.j();
                        if (j11 <= AndroidUtilities.dp(20.0f)) {
                            N0 += j11;
                        }
                        if (chatActivityEnterView4.S0) {
                            N0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (N0 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.q0 = new yd(chatActivityEnterView4, 4);
                            chatActivityEnterView4.O();
                            break;
                        }
                    }
                    if (chatActivityEnterView4.U2.A() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        ve veVar = chatActivityEnterView4.m0;
                        if (veVar != null) {
                            veVar.e = false;
                            veVar.l(new o1.j[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.M);
                            if (chatActivityEnterView4.g5) {
                                peer = chatActivityEnterView4.U2.k();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.M).getChat(Long.valueOf(-chatActivityEnterView4.L2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.M).getChatFull(-chatActivityEnterView4.L2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.U2.A() != null && !chatActivityEnterView4.U2.A().peers.isEmpty()) {
                                peer = chatActivityEnterView4.U2.A().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.L2)));
                            if (chatActivityEnterView4.g5) {
                            } else {
                                qnVar4.getParentLayout().getOverlayContainerView();
                            }
                            ve veVar2 = new ve(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.K2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.U2.A(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 21), chatActivityEnterView4.R3);
                            chatActivityEnterView4.m0 = veVar2;
                            veVar2.e = true;
                            veVar2.c = 220;
                            veVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.m0.setClippingEnabled(true);
                            chatActivityEnterView4.m0.setFocusable(true);
                            chatActivityEnterView4.m0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.m0.setInputMethodMode(2);
                            chatActivityEnterView4.m0.setSoftInputMode(0);
                            chatActivityEnterView4.m0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.m0.b = false;
                            int i15 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || qnVar4 == null) {
                                i9 = i15;
                            } else {
                                qnVar4.getFragmentView().getLocationInWindow(iArr);
                                i9 = iArr[0] + i15;
                            }
                            int N02 = chatActivityEnterView4.U2.N0();
                            int measuredHeight = chatActivityEnterView4.m0.getContentView().getMeasuredHeight();
                            int j12 = chatActivityEnterView4.U2.j();
                            if (j12 <= AndroidUtilities.dp(20.0f)) {
                                N02 += j12;
                            }
                            if (chatActivityEnterView4.S0) {
                                N02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i15 * 2) + N02) - ((qnVar4 == null || !qnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.m0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i10 = ((iArr[1] - measuredHeight) - i15) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i16 = (qnVar4 == null || !qnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.m0.o.getLayoutParams().height = ((N02 - i16) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i10 = i16;
                            }
                            ve veVar3 = chatActivityEnterView4.m0;
                            View view2 = veVar3.u;
                            wk0 wk0Var = veVar3.v;
                            TLRPC.Peer peer3 = veVar3.r;
                            yn0 yn0Var = veVar3.o;
                            fh.d2 d2Var = veVar3.t;
                            ArrayList arrayList2 = veVar3.z;
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj2 = arrayList2.get(i17);
                                i17++;
                                ((o1.j) obj2).c();
                            }
                            arrayList2.clear();
                            d2Var.setPivotX(AndroidUtilities.dp(8.0f));
                            d2Var.setPivotY(d2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            yn0Var.setPivotX(0.0f);
                            yn0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = veVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                int i18 = 0;
                                while (i18 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i18).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    int i19 = dp;
                                    long j13 = peer4.channel_id;
                                    if (j13 == 0 || j13 != peer3.channel_id) {
                                        long j14 = peer4.user_id;
                                        if (j14 == 0 || j14 != peer3.user_id) {
                                            long j15 = peer4.chat_id;
                                            if (j15 == 0 || j15 != peer3.chat_id) {
                                                i18++;
                                                arrayList3 = arrayList4;
                                                dp = i19;
                                            }
                                        }
                                    }
                                    veVar3.w.h1(i18, (size2 - ((arrayList4.size() - 2) * i19)) + AndroidUtilities.dp(7.0f) + ((i18 == arrayList4.size() + (-1) || wk0Var.getMeasuredHeight() >= size2) ? 0 : wk0Var.getMeasuredHeight() % i19));
                                    if (wk0Var.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            }
                            d2Var.setScaleX(0.25f);
                            d2Var.setScaleY(0.25f);
                            yn0Var.setAlpha(0.25f);
                            o1.j jVar = new o1.j(d2Var, o1.h.o);
                            jVar.u = org.telegram.ui.Cells.j2.i(1.0f, 750.0f, 1.0f);
                            jVar.b(new vn0(veVar3, 2));
                            o1.j jVar2 = new o1.j(d2Var, o1.h.p);
                            jVar2.u = org.telegram.ui.Cells.j2.i(1.0f, 750.0f, 1.0f);
                            jVar2.b(new vn0(veVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.j jVar3 = new o1.j(d2Var, cVar);
                            jVar3.u = org.telegram.ui.Cells.j2.i(1.0f, 750.0f, 1.0f);
                            o1.j jVar4 = new o1.j(yn0Var, cVar);
                            jVar4.u = org.telegram.ui.Cells.j2.i(1.0f, 750.0f, 1.0f);
                            for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                                arrayList2.add(jVar5);
                                jVar5.a(new wn0(veVar3, jVar5, 1));
                                jVar5.f();
                            }
                            ve veVar4 = chatActivityEnterView4.m0;
                            chatActivityEnterView4.o0 = i9;
                            chatActivityEnterView4.p0 = i10;
                            veVar4.showAtLocation(view, 51, i9, i10);
                            chatActivityEnterView4.l0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.n0 = new yd(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.g5) {
                        chatActivityEnterView4.m0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.m0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i20 = ChatActivityEnterView.i5;
                chatActivityEnterView.c0();
                break;
            case 18:
                org.telegram.ui.ActionBar.q1 q1Var2 = chatActivityEnterView.Q;
                if ((q1Var2 == null || !q1Var2.f) && chatActivityEnterView.B != 0.0f) {
                    chatActivityEnterView.U2.d2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.q1 q1Var3 = chatActivityEnterView.Q;
                if ((q1Var3 == null || !q1Var3.f) && chatActivityEnterView.B != 0.0f) {
                    chatActivityEnterView.U2.h1();
                    break;
                }
                break;
            default:
                int i21 = ChatActivityEnterView.i5;
                chatActivityEnterView.I0();
                break;
        }
    }
}
