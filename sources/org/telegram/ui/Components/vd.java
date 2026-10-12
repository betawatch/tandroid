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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pg pgVar;
        boolean z10;
        fg fgVar;
        rf rfVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r10;
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
                        chatActivityEnterView.Q0();
                        break;
                    }
                }
                break;
            case 2:
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    pgVar2.H0();
                    break;
                }
                break;
            case 3:
                int i15 = ChatActivityEnterView.n5;
                if (chatActivityEnterView.b2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        lg w9 = chatActivityEnterView.w();
                        chatActivityEnterView.c2 = w9;
                        ig.y d = ig.y.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.b2.link;
                        String str2 = w9.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = w9.b;
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
                    pgVar.u1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.k3) {
                    if (!chatActivityEnterView.z2 || (rfVar = chatActivityEnterView.E0) == null || !rfVar.isFocused()) {
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
                            chatActivityEnterView.U0.B();
                            if (chatActivityEnterView.y3) {
                                chatActivityEnterView.I(true);
                            }
                        } else {
                            if (!chatActivityEnterView.E3 && (fgVar = chatActivityEnterView.U0) != null) {
                                fgVar.O(false);
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
                    hl0 hl0Var = chatActivityEnterView.h1;
                    if (hl0Var != null) {
                        hl0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        chatActivityEnterView.Z2.a2(2, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
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
                            i2.d.t(chatActivityEnterView.c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                    mediaDataController.pushDraftVoiceMessage(j10, (foVar == null || !foVar.h4) ? 0L : foVar.d(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.I(true);
                    break;
                }
                break;
            case 7:
                fi.b0 b0Var = chatActivityEnterView.l0;
                boolean z14 = b0Var.v;
                b0Var.setOpened(!z14);
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
                            AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.k0(false);
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
                        bi.o0 o0Var = pfVar2.c;
                        chatActivityEnterView.getContext();
                        o0Var.setLayoutManager(new s4.b0());
                        bi.o0 o0Var2 = chatActivityEnterView.m0.c;
                        fi.a0 a0Var = new fi.a0();
                        a0Var.c = new ArrayList();
                        a0Var.d = new ArrayList();
                        a0Var.e = new ArrayList();
                        chatActivityEnterView.n0 = a0Var;
                        o0Var2.setAdapter(a0Var);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new qf(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new se(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.m1.addView(chatActivityEnterView.m0, w7.a6.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.X4;
                        if (hVar != null) {
                            chatActivityEnterView.n0.E(hVar);
                        }
                        chatActivityEnterView.A1();
                    }
                    pf pfVar3 = chatActivityEnterView.m0;
                    if (pfVar3.getVisibility() != 0) {
                        pfVar3.setVisibility(0);
                        pfVar3.c.u0(0);
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
                if (pgVar3 != null && !pgVar3.l()) {
                    pg pgVar4 = chatActivityEnterView.Z2;
                    xg xgVar = chatActivityEnterView.F0;
                    pgVar4.o1(xgVar, xgVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.fo foVar2 = chatActivityEnterView.P2;
                if (BirthdayController.isToday(foVar2.a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + foVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + foVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + foVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().a8 == null || !chatActivityEnterView.getParentFragment().a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i16 = chatActivityEnterView.getParentFragment().i();
                if (i16 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().a8.birthday);
                    org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(chatActivityEnterView.getContext(), 3, null);
                    a2Var.q(200L);
                    a2Var.setOnCancelListener(new org.telegram.ui.ga(chatActivityEnterView, ug.s.j(chatActivityEnterView.Q, null, new bi.i4(chatActivityEnterView, a2Var, i16, z15)), 3));
                    break;
                }
                break;
            case 10:
                int i17 = ChatActivityEnterView.n5;
                chatActivityEnterView.H0();
                break;
            case 11:
                nf nfVar = chatActivityEnterView.N0;
                if (nfVar != null && nfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new ji.w4(chatActivityEnterView, 13), chatActivityEnterView.W3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                nf nfVar2 = chatActivityEnterView2.N0;
                if (nfVar2 != null && nfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                nf nfVar3 = chatActivityEnterView3.N0;
                if (nfVar3 != null && nfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.o1 o1Var = chatActivityEnterView.U;
                if (o1Var == null || !o1Var.f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.s1();
                        break;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z13 = false;
                            chatActivityEnterView.k1(0, true);
                            fg fgVar2 = chatActivityEnterView.U0;
                            if (fgVar2 != null) {
                                fgVar2.u(false);
                            }
                            rf rfVar3 = chatActivityEnterView.E0;
                            if (rfVar3 != null) {
                                rfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.z3) {
                            chatActivityEnterView.l1(z13, true, z13, true);
                            chatActivityEnterView.l3 = true;
                            AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.G0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.r1(1, 0, true, true);
                        fg fgVar3 = chatActivityEnterView.U0;
                        rf rfVar4 = chatActivityEnterView.E0;
                        boolean z16 = rfVar4 != null && rfVar4.length() > 0;
                        org.telegram.ui.fo foVar3 = chatActivityEnterView.P2;
                        if (foVar3 != null) {
                            di.d4 d4Var = foVar3.y1;
                            if (d4Var != null) {
                                if (d4Var.V) {
                                    d4Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            foVar3.y1 = null;
                            if (z12) {
                                z11 = true;
                                fgVar3.D(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        fgVar3.D(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.u(false);
                    rf rfVar5 = chatActivityEnterView.E0;
                    if (rfVar5 != null) {
                        rfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.n2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r10 = 1;
                        if (chatActivityEnterView.f2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.f2 == 1) {
                                chatActivityEnterView.r1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.r1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.p2) {
                    chatActivityEnterView.setFieldText("/");
                    rf rfVar6 = chatActivityEnterView.E0;
                    if (rfVar6 != null) {
                        rfVar6.requestFocus();
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
                org.telegram.ui.fo foVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.l5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.r0()) {
                    if (chatActivityEnterView4.Z2.q() > AndroidUtilities.dp(20.0f)) {
                        int Y0 = chatActivityEnterView4.Z2.Y0();
                        int q6 = chatActivityEnterView4.Z2.q();
                        f7 = 20.0f;
                        if (q6 <= AndroidUtilities.dp(20.0f)) {
                            Y0 += q6;
                        }
                        if (chatActivityEnterView4.W0) {
                            Y0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (Y0 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.u0 = new je(chatActivityEnterView4, 4);
                            chatActivityEnterView4.N();
                            break;
                        }
                    } else {
                        f7 = 20.0f;
                    }
                    if (chatActivityEnterView4.Z2.K() != null) {
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
                            if (peer == null && chatActivityEnterView4.Z2.K() != null && !chatActivityEnterView4.Z2.K().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Z2.K().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                            if (chatActivityEnterView4.l5) {
                            } else {
                                foVar4.getParentLayout().getOverlayContainerView();
                            }
                            gf gfVar2 = new gf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.Z2.K(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, i14), chatActivityEnterView4.W3);
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
                            int i18 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || foVar4 == null) {
                                i10 = i18;
                            } else {
                                foVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i18;
                            }
                            int Y02 = chatActivityEnterView4.Z2.Y0();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int q10 = chatActivityEnterView4.Z2.q();
                            if (q10 <= AndroidUtilities.dp(f7)) {
                                Y02 += q10;
                            }
                            if (chatActivityEnterView4.W0) {
                                Y02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(f10);
                            if (measuredHeight < (((i18 * 2) + Y02) - ((foVar4 == null || !foVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i18) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i19 = (foVar4 == null || !foVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((Y02 - i19) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i19;
                            }
                            gf gfVar3 = chatActivityEnterView4.q0;
                            View view2 = gfVar3.u;
                            mm0 mm0Var = gfVar3.v;
                            TLRPC.Peer peer3 = gfVar3.r;
                            qp0 qp0Var = gfVar3.o;
                            ah.x xVar = gfVar3.t;
                            int i20 = 1;
                            ArrayList arrayList2 = gfVar3.z;
                            int size = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size) {
                                Object obj2 = arrayList2.get(i21);
                                i21++;
                                ((o1.k) obj2).c();
                            }
                            arrayList2.clear();
                            xVar.setPivotX(AndroidUtilities.dp(8.0f));
                            xVar.setPivotY(xVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            qp0Var.setPivotX(0.0f);
                            qp0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = gfVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                i12 = 2;
                                int i22 = 0;
                                while (i22 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i22).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    mm0 mm0Var2 = mm0Var;
                                    long j11 = peer4.channel_id;
                                    if (j11 == 0 || j11 != peer3.channel_id) {
                                        long j12 = peer4.user_id;
                                        if (j12 == 0 || j12 != peer3.user_id) {
                                            long j13 = peer4.chat_id;
                                            if (j13 == 0 || j13 != peer3.chat_id) {
                                                i22++;
                                                mm0Var = mm0Var2;
                                                arrayList3 = arrayList4;
                                                f10 = 1.0f;
                                            }
                                        }
                                    }
                                    gfVar3.w.h1(i22, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + ((i22 == arrayList4.size() + (-1) || mm0Var2.getMeasuredHeight() >= size2) ? 0 : mm0Var2.getMeasuredHeight() % dp));
                                    if (mm0Var2.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(f10).setDuration(150L).start();
                                    }
                                }
                            } else {
                                i12 = 2;
                            }
                            xVar.setScaleX(0.25f);
                            xVar.setScaleY(0.25f);
                            qp0Var.setAlpha(0.25f);
                            o1.k kVar = new o1.k(xVar, o1.h.o);
                            kVar.u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                            kVar.b(new np0(gfVar3, i12));
                            o1.k kVar2 = new o1.k(xVar, o1.h.p);
                            kVar2.u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                            kVar2.b(new np0(gfVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.k kVar3 = new o1.k(xVar, cVar);
                            kVar3.u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                            o1.k kVar4 = new o1.k(qp0Var, cVar);
                            kVar4.u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                            for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                                arrayList2.add(kVar5);
                                kVar5.a(new op0(gfVar3, kVar5, i20));
                                kVar5.h();
                                i20 = 1;
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
                    chatActivityEnterView4.r0 = new je(chatActivityEnterView4, 3);
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
                org.telegram.ui.ActionBar.o1 o1Var2 = chatActivityEnterView.U;
                if ((o1Var2 == null || !o1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.q2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.o1 o1Var3 = chatActivityEnterView.U;
                if ((o1Var3 == null || !o1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.l1();
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
