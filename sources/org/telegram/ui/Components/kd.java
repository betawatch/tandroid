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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ kd(ChatActivityEnterView chatActivityEnterView, int i10) {
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
        eg egVar;
        boolean z4;
        uf ufVar;
        ff ffVar;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r92;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        int i10;
        int i11;
        int i12 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i12) {
            case 0:
                ff ffVar2 = chatActivityEnterView.B0;
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
                cf cfVar = chatActivityEnterView.I0;
                if (cfVar == null || cfVar.n0) {
                    AnimatorSet animatorSet = chatActivityEnterView.p2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.c0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                eg egVar2 = chatActivityEnterView.V2;
                if (egVar2 != null) {
                    egVar2.P0();
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.j5;
                if (chatActivityEnterView.X1 != null) {
                    if (chatActivityEnterView.W - chatActivityEnterView.a0 >= 0) {
                        ag x10 = chatActivityEnterView.x();
                        chatActivityEnterView.Y1 = x10;
                        vf.t d = vf.t.d(chatActivityEnterView.N);
                        String str = chatActivityEnterView.X1.link;
                        String str2 = x10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = x10.b;
                        id idVar = new id(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c3 = d.c(str);
                        if (c3 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c3.title;
                            d.b(c3, tL_inputBusinessChatLink, idVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.V;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.V.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 4:
                if (chatActivityEnterView.P4 == BotForumHelper.SteamingSendButtonState.STOP && (egVar = chatActivityEnterView.V2) != null) {
                    egVar.G1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.P0.getVisibility() == 0 && chatActivityEnterView.P0.getAlpha() == 1.0f && !chatActivityEnterView.g3) {
                    if (!chatActivityEnterView.v2 || (ffVar = chatActivityEnterView.B0) == null || !ffVar.isFocused()) {
                        if (!chatActivityEnterView.v3) {
                            if (!chatActivityEnterView.A3) {
                                z4 = true;
                                chatActivityEnterView.R0.Q(true);
                                if (chatActivityEnterView.A3) {
                                    chatActivityEnterView.n1(chatActivityEnterView.v3 ^ z4, z4, false, z4);
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.N1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.R0.t(true);
                            chatActivityEnterView.R0.B();
                            if (chatActivityEnterView.u3) {
                                chatActivityEnterView.J(true);
                            }
                        } else if (!chatActivityEnterView.A3 && (ufVar = chatActivityEnterView.R0) != null) {
                            ufVar.Q(false);
                        }
                        z4 = true;
                        if (chatActivityEnterView.A3) {
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.p2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    rk0 rk0Var = chatActivityEnterView.e1;
                    if (rk0Var != null) {
                        rk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.a3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.D3);
                        chatActivityEnterView.V2.u2(2, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                        oe oeVar = chatActivityEnterView.G0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Z2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.Y2 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.ui.yh.v(chatActivityEnterView.Y2, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.Y2).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.N);
                    long j10 = chatActivityEnterView.M2;
                    org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                    mediaDataController.pushDraftVoiceMessage(j10, (xnVar == null || !xnVar.e4) ? 0L : xnVar.b(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.J(true);
                    break;
                }
                break;
            case 7:
                sh.z zVar = chatActivityEnterView.i0;
                boolean z13 = zVar.v;
                zVar.setOpened(!z13);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.j0()) {
                    if (!z13) {
                        if (!chatActivityEnterView.T0 && !chatActivityEnterView.U0) {
                            chatActivityEnterView.L0();
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new id(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.m0(false);
                            break;
                        }
                    }
                } else if (z13) {
                    df dfVar = chatActivityEnterView.j0;
                    if (dfVar != null) {
                        dfVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.j0 == null) {
                        df dfVar2 = new df(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.j0 = dfVar2;
                        org.telegram.ui.c81 c81Var = dfVar2.c;
                        chatActivityEnterView.getContext();
                        c81Var.setLayoutManager(new f2.j0());
                        org.telegram.ui.c81 c81Var2 = chatActivityEnterView.j0.c;
                        sh.y yVar = new sh.y();
                        yVar.c = new ArrayList();
                        yVar.d = new ArrayList();
                        yVar.e = new ArrayList();
                        chatActivityEnterView.k0 = yVar;
                        c81Var2.setAdapter(yVar);
                        chatActivityEnterView.j0.c.setOnItemClickListener(new ef(chatActivityEnterView));
                        chatActivityEnterView.j0.c.setOnItemLongClickListener(new ie(chatActivityEnterView));
                        chatActivityEnterView.j0.setClipToPadding(false);
                        chatActivityEnterView.i1.addView(chatActivityEnterView.j0, k7.c6.e(-1, -1, 80));
                        chatActivityEnterView.j0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.T4;
                        if (hVar != null) {
                            chatActivityEnterView.k0.E(hVar);
                        }
                        chatActivityEnterView.C1();
                    }
                    df dfVar3 = chatActivityEnterView.j0;
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
                eg egVar3 = chatActivityEnterView.V2;
                if (egVar3 != null && !egVar3.k()) {
                    eg egVar4 = chatActivityEnterView.V2;
                    mg mgVar = chatActivityEnterView.C0;
                    egVar4.z1(mgVar, mgVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.N).getMainSettings().edit();
                org.telegram.ui.xn xnVar2 = chatActivityEnterView.L2;
                if (BirthdayController.isToday(xnVar2.X7)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + xnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + xnVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.N).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.N).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + xnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.N).getUserFull(UserConfig.getInstance(chatActivityEnterView.N).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().X7 == null || !chatActivityEnterView.getParentFragment().X7.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.G1, false);
                }
                TLRPC.User i14 = chatActivityEnterView.getParentFragment().i();
                if (i14 != null) {
                    boolean z14 = chatActivityEnterView.getParentFragment().X7 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().X7.birthday);
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(chatActivityEnterView.getContext(), 3, null);
                    d2Var.q(200L);
                    d2Var.setOnCancelListener(new mh.v(chatActivityEnterView, hg.p0.j(chatActivityEnterView.N, null, new oh.e3(chatActivityEnterView, d2Var, i14, z14)), 4));
                    break;
                }
                break;
            case 10:
                int i15 = ChatActivityEnterView.j5;
                chatActivityEnterView.J0();
                break;
            case 11:
                bf bfVar = chatActivityEnterView.K0;
                if (bfVar != null && bfVar.isShowing()) {
                    chatActivityEnterView.K0.dismiss();
                }
                z4.M(chatActivityEnterView.K2, chatActivityEnterView.L2.a(), new org.telegram.ui.Cells.f1(chatActivityEnterView, 2), chatActivityEnterView.S3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                bf bfVar2 = chatActivityEnterView2.K0;
                if (bfVar2 != null && bfVar2.isShowing()) {
                    chatActivityEnterView2.K0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                bf bfVar3 = chatActivityEnterView3.K0;
                if (bfVar3 != null && bfVar3.isShowing()) {
                    chatActivityEnterView3.K0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.r1 r1Var = chatActivityEnterView.R;
                if (r1Var == null || !r1Var.f) {
                    if (chatActivityEnterView.x0) {
                        chatActivityEnterView.u1();
                        break;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.b2 == 0) {
                        if (chatActivityEnterView.N1 != 0) {
                            z12 = false;
                            chatActivityEnterView.m1(0, true);
                            uf ufVar2 = chatActivityEnterView.R0;
                            if (ufVar2 != null) {
                                ufVar2.t(false);
                            }
                            ff ffVar3 = chatActivityEnterView.B0;
                            if (ffVar3 != null) {
                                ffVar3.requestFocus();
                            }
                        } else {
                            z12 = false;
                        }
                        if (chatActivityEnterView.v3) {
                            chatActivityEnterView.n1(z12, true, z12, true);
                            chatActivityEnterView.h3 = true;
                            AndroidUtilities.runOnUIThread(new id(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.I0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        uf ufVar3 = chatActivityEnterView.R0;
                        ff ffVar4 = chatActivityEnterView.B0;
                        boolean z15 = ffVar4 != null && ffVar4.length() > 0;
                        org.telegram.ui.xn xnVar3 = chatActivityEnterView.L2;
                        if (xnVar3 != null) {
                            qh.e3 e3Var = xnVar3.v1;
                            if (e3Var != null) {
                                if (e3Var.S) {
                                    e3Var.e(true);
                                }
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            xnVar3.v1 = null;
                            if (z11) {
                                z10 = true;
                                ufVar3.E(z15, z10);
                                break;
                            }
                        }
                        z10 = false;
                        ufVar3.E(z15, z10);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.N1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.R0.t(false);
                    ff ffVar5 = chatActivityEnterView.B0;
                    if (ffVar5 != null) {
                        ffVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.j2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.b2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.b2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.t1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.l2) {
                    chatActivityEnterView.setFieldText("/");
                    ff ffVar6 = chatActivityEnterView.B0;
                    if (ffVar6 != null) {
                        ffVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.v3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.xn xnVar4 = chatActivityEnterView4.L2;
                if (!chatActivityEnterView4.h5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.t0()) {
                    if (chatActivityEnterView4.V2.l() > AndroidUtilities.dp(20.0f)) {
                        int f12 = chatActivityEnterView4.V2.f1();
                        int l10 = chatActivityEnterView4.V2.l();
                        if (l10 <= AndroidUtilities.dp(20.0f)) {
                            f12 += l10;
                        }
                        if (chatActivityEnterView4.T0) {
                            f12 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (f12 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.r0 = new yd(chatActivityEnterView4, 4);
                            chatActivityEnterView4.P();
                            break;
                        }
                    }
                    if (chatActivityEnterView4.V2.F() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        ve veVar = chatActivityEnterView4.n0;
                        if (veVar != null) {
                            veVar.e = false;
                            veVar.l(new o1.j[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.N);
                            if (chatActivityEnterView4.h5) {
                                peer = chatActivityEnterView4.V2.p();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.N).getChat(Long.valueOf(-chatActivityEnterView4.M2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.N).getChatFull(-chatActivityEnterView4.M2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.V2.F() != null && !chatActivityEnterView4.V2.F().peers.isEmpty()) {
                                peer = chatActivityEnterView4.V2.F().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.M2)));
                            if (chatActivityEnterView4.h5) {
                            } else {
                                xnVar4.getParentLayout().getOverlayContainerView();
                            }
                            ve veVar2 = new ve(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.L2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.V2.F(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 17), chatActivityEnterView4.S3);
                            chatActivityEnterView4.n0 = veVar2;
                            veVar2.e = true;
                            veVar2.c = 220;
                            veVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.n0.setClippingEnabled(true);
                            chatActivityEnterView4.n0.setFocusable(true);
                            chatActivityEnterView4.n0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.n0.setInputMethodMode(2);
                            chatActivityEnterView4.n0.setSoftInputMode(0);
                            chatActivityEnterView4.n0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.n0.b = false;
                            int i16 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || xnVar4 == null) {
                                i10 = i16;
                            } else {
                                xnVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i16;
                            }
                            int f13 = chatActivityEnterView4.V2.f1();
                            int measuredHeight = chatActivityEnterView4.n0.getContentView().getMeasuredHeight();
                            int l11 = chatActivityEnterView4.V2.l();
                            if (l11 <= AndroidUtilities.dp(20.0f)) {
                                f13 += l11;
                            }
                            if (chatActivityEnterView4.T0) {
                                f13 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i16 * 2) + f13) - ((xnVar4 == null || !xnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.n0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i16) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i17 = (xnVar4 == null || !xnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.n0.o.getLayoutParams().height = ((f13 - i17) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i17;
                            }
                            ve veVar3 = chatActivityEnterView4.n0;
                            View view2 = veVar3.u;
                            sl0 sl0Var = veVar3.v;
                            TLRPC.Peer peer3 = veVar3.r;
                            to0 to0Var = veVar3.o;
                            eg.s2 s2Var = veVar3.t;
                            ArrayList arrayList2 = veVar3.z;
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj2 = arrayList2.get(i18);
                                i18++;
                                ((o1.j) obj2).c();
                            }
                            arrayList2.clear();
                            s2Var.setPivotX(AndroidUtilities.dp(8.0f));
                            s2Var.setPivotY(s2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            to0Var.setPivotX(0.0f);
                            to0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = veVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                int i19 = 0;
                                while (i19 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i19).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    int i20 = dp;
                                    long j11 = peer4.channel_id;
                                    if (j11 == 0 || j11 != peer3.channel_id) {
                                        long j12 = peer4.user_id;
                                        if (j12 == 0 || j12 != peer3.user_id) {
                                            long j13 = peer4.chat_id;
                                            if (j13 == 0 || j13 != peer3.chat_id) {
                                                i19++;
                                                arrayList3 = arrayList4;
                                                dp = i20;
                                            }
                                        }
                                    }
                                    veVar3.w.h1(i19, (size2 - ((arrayList4.size() - 2) * i20)) + AndroidUtilities.dp(7.0f) + ((i19 == arrayList4.size() + (-1) || sl0Var.getMeasuredHeight() >= size2) ? 0 : sl0Var.getMeasuredHeight() % i20));
                                    if (sl0Var.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            }
                            s2Var.setScaleX(0.25f);
                            s2Var.setScaleY(0.25f);
                            to0Var.setAlpha(0.25f);
                            o1.j jVar = new o1.j(s2Var, o1.h.o);
                            jVar.u = org.telegram.ui.yh.n(1.0f, 750.0f, 1.0f);
                            jVar.b(new qo0(veVar3, 2));
                            o1.j jVar2 = new o1.j(s2Var, o1.h.p);
                            jVar2.u = org.telegram.ui.yh.n(1.0f, 750.0f, 1.0f);
                            jVar2.b(new qo0(veVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.j jVar3 = new o1.j(s2Var, cVar);
                            jVar3.u = org.telegram.ui.yh.n(1.0f, 750.0f, 1.0f);
                            o1.j jVar4 = new o1.j(to0Var, cVar);
                            jVar4.u = org.telegram.ui.yh.n(1.0f, 750.0f, 1.0f);
                            for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                                arrayList2.add(jVar5);
                                jVar5.a(new ro0(veVar3, jVar5, 1));
                                jVar5.f();
                            }
                            ve veVar4 = chatActivityEnterView4.n0;
                            chatActivityEnterView4.p0 = i10;
                            chatActivityEnterView4.q0 = i11;
                            veVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.m0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.o0 = new yd(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.h5) {
                        chatActivityEnterView4.n0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i21 = ChatActivityEnterView.j5;
                chatActivityEnterView.d0();
                break;
            case 18:
                org.telegram.ui.ActionBar.r1 r1Var2 = chatActivityEnterView.R;
                if ((r1Var2 == null || !r1Var2.f) && chatActivityEnterView.C != 0.0f) {
                    chatActivityEnterView.V2.J2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.r1 r1Var3 = chatActivityEnterView.R;
                if ((r1Var3 == null || !r1Var3.f) && chatActivityEnterView.C != 0.0f) {
                    chatActivityEnterView.V2.w1();
                    break;
                }
                break;
            default:
                int i22 = ChatActivityEnterView.j5;
                chatActivityEnterView.J0();
                break;
        }
    }
}
