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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pg pgVar;
        boolean z10;
        fg fgVar;
        rf rfVar;
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
        int i12 = this.a;
        int i13 = 22;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i12) {
            case 0:
                rf rfVar2 = chatActivityEnterView.E0;
                String obj = rfVar2 != null ? rfVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 1:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar == null || ofVar.q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    pgVar2.J0();
                    break;
                }
                break;
            case 3:
                int i14 = ChatActivityEnterView.n5;
                if (chatActivityEnterView.b2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        lg x10 = chatActivityEnterView.x();
                        chatActivityEnterView.c2 = x10;
                        hg.z d = hg.z.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.b2.link;
                        String str2 = x10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = x10.b;
                        td tdVar = new td(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, tdVar);
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
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (pgVar = chatActivityEnterView.Z2) != null) {
                    pgVar.z1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.k3) {
                    if (!chatActivityEnterView.z2 || (rfVar = chatActivityEnterView.E0) == null || !rfVar.isFocused()) {
                        if (!chatActivityEnterView.z3) {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.M(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.R1 != 0) {
                            z10 = true;
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                            if (chatActivityEnterView.y3) {
                                chatActivityEnterView.I(true);
                            }
                        } else {
                            if (!chatActivityEnterView.E3 && (fgVar = chatActivityEnterView.U0) != null) {
                                fgVar.M(false);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.m1(chatActivityEnterView.z3 ^ z10, z10, false, z10);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    tk0 tk0Var = chatActivityEnterView.h1;
                    if (tk0Var != null) {
                        tk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        chatActivityEnterView.Z2.k2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        ze zeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        zeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j3 = chatActivityEnterView.Q2;
                    org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                    mediaDataController.pushDraftVoiceMessage(j3, (ynVar == null || !ynVar.f4) ? 0L : ynVar.d(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.I(true);
                    break;
                }
                break;
            case 7:
                ei.d0 d0Var = chatActivityEnterView.l0;
                boolean z14 = d0Var.v;
                d0Var.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.j0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.L0();
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.m0(false);
                            break;
                        }
                    }
                } else if (z14) {
                    pf pfVar = chatActivityEnterView.m0;
                    if (pfVar != null) {
                        pfVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.m0 == null) {
                        pf pfVar2 = new pf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = pfVar2;
                        ai.w0 w0Var = pfVar2.c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.c0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.c;
                        ei.c0 c0Var = new ei.c0();
                        c0Var.c = new ArrayList();
                        c0Var.d = new ArrayList();
                        c0Var.e = new ArrayList();
                        chatActivityEnterView.n0 = c0Var;
                        w0Var2.setAdapter(c0Var);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new qf(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new te(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.m1.addView(chatActivityEnterView.m0, w7.z5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.n0.E(iVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    pf pfVar3 = chatActivityEnterView.m0;
                    if (pfVar3.getVisibility() != 0) {
                        pfVar3.setVisibility(0);
                        pfVar3.c.v0(0);
                        pfVar3.n = true;
                        pfVar3.f = false;
                        break;
                    } else if (pfVar3.f) {
                        pfVar3.f = false;
                        pfVar3.a();
                        pfVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                pg pgVar3 = chatActivityEnterView.Z2;
                if (pgVar3 != null && !pgVar3.m()) {
                    pg pgVar4 = chatActivityEnterView.Z2;
                    xg xgVar = chatActivityEnterView.F0;
                    pgVar4.t1(xgVar, xgVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.yn ynVar2 = chatActivityEnterView.P2;
                if (BirthdayController.isToday(ynVar2.Y7)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + ynVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + ynVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + ynVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().Y7 == null || !chatActivityEnterView.getParentFragment().Y7.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i15 = chatActivityEnterView.getParentFragment().i();
                if (i15 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().Y7 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().Y7.birthday);
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.da(chatActivityEnterView, tg.s.j(chatActivityEnterView.Q, null, new ai.t4(chatActivityEnterView, b2Var, i15, z15)), 3));
                    break;
                }
                break;
            case 10:
                int i16 = ChatActivityEnterView.n5;
                chatActivityEnterView.J0();
                break;
            case 11:
                nf nfVar = chatActivityEnterView.N0;
                if (nfVar != null && nfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new n2.c(chatActivityEnterView, 5), chatActivityEnterView.W3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                nf nfVar2 = chatActivityEnterView2.N0;
                if (nfVar2 != null && nfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                nf nfVar3 = chatActivityEnterView3.N0;
                if (nfVar3 != null && nfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.t1();
                        break;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z13 = false;
                            chatActivityEnterView.l1(0, true);
                            fg fgVar2 = chatActivityEnterView.U0;
                            if (fgVar2 != null) {
                                fgVar2.t(false);
                            }
                            rf rfVar3 = chatActivityEnterView.E0;
                            if (rfVar3 != null) {
                                rfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.z3) {
                            chatActivityEnterView.m1(z13, true, z13, true);
                            chatActivityEnterView.l3 = true;
                            AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.I0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        fg fgVar3 = chatActivityEnterView.U0;
                        rf rfVar4 = chatActivityEnterView.E0;
                        boolean z16 = rfVar4 != null && rfVar4.length() > 0;
                        org.telegram.ui.yn ynVar3 = chatActivityEnterView.P2;
                        if (ynVar3 != null) {
                            ci.e4 e4Var = ynVar3.w1;
                            if (e4Var != null) {
                                if (e4Var.V) {
                                    e4Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ynVar3.w1 = null;
                            if (z12) {
                                z11 = true;
                                fgVar3.B(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        fgVar3.B(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    rf rfVar5 = chatActivityEnterView.E0;
                    if (rfVar5 != null) {
                        rfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.n2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.f2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.s1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.p2) {
                    chatActivityEnterView.setFieldText("/");
                    rf rfVar6 = chatActivityEnterView.E0;
                    if (rfVar6 != null) {
                        rfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.z3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.yn ynVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.l5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.t0()) {
                    if (chatActivityEnterView4.Z2.q() > AndroidUtilities.dp(20.0f)) {
                        int b12 = chatActivityEnterView4.Z2.b1();
                        int q6 = chatActivityEnterView4.Z2.q();
                        f7 = 20.0f;
                        if (q6 <= AndroidUtilities.dp(20.0f)) {
                            b12 += q6;
                        }
                        if (chatActivityEnterView4.W0) {
                            b12 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (b12 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.u0 = new ke(chatActivityEnterView4, 4);
                            chatActivityEnterView4.N();
                            break;
                        }
                    } else {
                        f7 = 20.0f;
                    }
                    if (chatActivityEnterView4.Z2.I() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        gf gfVar = chatActivityEnterView4.q0;
                        if (gfVar != null) {
                            gfVar.e = false;
                            gfVar.l(new o1.k[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                            if (chatActivityEnterView4.l5) {
                                peer = chatActivityEnterView4.Z2.v();
                                chatFull = null;
                                f10 = 1.0f;
                            } else {
                                f10 = 1.0f;
                                MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.Q2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.Q2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Z2.I() != null && !chatActivityEnterView4.Z2.I().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Z2.I().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                            if (chatActivityEnterView4.l5) {
                            } else {
                                ynVar4.getParentLayout().getOverlayContainerView();
                            }
                            gf gfVar2 = new gf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.Z2.I(), new ai.q5(chatActivityEnterView4, chatFull, messagesController, i13), chatActivityEnterView4.W3);
                            chatActivityEnterView4.q0 = gfVar2;
                            gfVar2.e = true;
                            gfVar2.c = 220;
                            gfVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.q0.setClippingEnabled(true);
                            chatActivityEnterView4.q0.setFocusable(true);
                            chatActivityEnterView4.q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.q0.setInputMethodMode(2);
                            chatActivityEnterView4.q0.setSoftInputMode(0);
                            chatActivityEnterView4.q0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.q0.b = false;
                            int i17 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || ynVar4 == null) {
                                i10 = i17;
                            } else {
                                ynVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i17;
                            }
                            int b13 = chatActivityEnterView4.Z2.b1();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int q10 = chatActivityEnterView4.Z2.q();
                            if (q10 <= AndroidUtilities.dp(f7)) {
                                b13 += q10;
                            }
                            if (chatActivityEnterView4.W0) {
                                b13 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(f10);
                            if (measuredHeight < (((i17 * 2) + b13) - ((ynVar4 == null || !ynVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i17) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i18 = (ynVar4 == null || !ynVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((b13 - i18) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i18;
                            }
                            gf gfVar3 = chatActivityEnterView4.q0;
                            View view2 = gfVar3.u;
                            zl0 zl0Var = gfVar3.v;
                            TLRPC.Peer peer3 = gfVar3.r;
                            jp0 jp0Var = gfVar3.o;
                            ai.f0 f0Var = gfVar3.t;
                            ArrayList arrayList2 = gfVar3.z;
                            int size = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj2 = arrayList2.get(i19);
                                i19++;
                                ((o1.k) obj2).c();
                            }
                            arrayList2.clear();
                            f0Var.setPivotX(AndroidUtilities.dp(8.0f));
                            f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            jp0Var.setPivotX(0.0f);
                            jp0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = gfVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                int i20 = 0;
                                while (i20 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i20).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    zl0 zl0Var2 = zl0Var;
                                    long j10 = peer4.channel_id;
                                    if (j10 == 0 || j10 != peer3.channel_id) {
                                        long j11 = peer4.user_id;
                                        if (j11 == 0 || j11 != peer3.user_id) {
                                            long j12 = peer4.chat_id;
                                            if (j12 == 0 || j12 != peer3.chat_id) {
                                                i20++;
                                                zl0Var = zl0Var2;
                                                arrayList3 = arrayList4;
                                            }
                                        }
                                    }
                                    gfVar3.w.h1(i20, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + ((i20 == arrayList4.size() + (-1) || zl0Var2.getMeasuredHeight() >= size2) ? 0 : zl0Var2.getMeasuredHeight() % dp));
                                    if (zl0Var2.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            }
                            f0Var.setScaleX(0.25f);
                            f0Var.setScaleY(0.25f);
                            jp0Var.setAlpha(0.25f);
                            o1.k kVar = new o1.k(f0Var, o1.h.o);
                            kVar.u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                            kVar.b(new gp0(gfVar3, 2));
                            o1.k kVar2 = new o1.k(f0Var, o1.h.p);
                            kVar2.u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                            kVar2.b(new gp0(gfVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.k kVar3 = new o1.k(f0Var, cVar);
                            kVar3.u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                            o1.k kVar4 = new o1.k(jp0Var, cVar);
                            kVar4.u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                            for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                                arrayList2.add(kVar5);
                                kVar5.a(new hp0(gfVar3, kVar5, 1));
                                kVar5.f();
                            }
                            gf gfVar4 = chatActivityEnterView4.q0;
                            chatActivityEnterView4.s0 = i10;
                            chatActivityEnterView4.t0 = i11;
                            gfVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.p0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.r0 = new ke(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.l5) {
                        chatActivityEnterView4.n0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i21 = ChatActivityEnterView.n5;
                chatActivityEnterView.d0();
                break;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.A2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.q1();
                    break;
                }
                break;
            default:
                int i22 = ChatActivityEnterView.n5;
                chatActivityEnterView.J0();
                break;
        }
    }
}
