package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewPropertyAnimator;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0334  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v20 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        qg qgVar;
        boolean z10;
        fg fgVar;
        rf rfVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r10;
        long j3;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        int i10;
        int i11;
        bi.ld ldVar;
        ArrayList<TLRPC.TL_sendAsPeer> arrayList;
        int i12 = this.a;
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
                break;
            case 1:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar == null || ofVar.q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.s2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                qg qgVar2 = chatActivityEnterView.Y2;
                if (qgVar2 != null) {
                    qgVar2.J0();
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.m5;
                if (chatActivityEnterView.a2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        mg x10 = chatActivityEnterView.x();
                        chatActivityEnterView.b2 = x10;
                        gg.b0 d = gg.b0.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.a2.link;
                        String str2 = x10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList2 = x10.b;
                        qd qdVar = new qd(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList2;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, qdVar);
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
                if (chatActivityEnterView.S4 == BotForumHelper.SteamingSendButtonState.STOP && (qgVar = chatActivityEnterView.Y2) != null) {
                    qgVar.y1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.j3) {
                    if (!chatActivityEnterView.y2 || (rfVar = chatActivityEnterView.E0) == null || !rfVar.isFocused()) {
                        if (!chatActivityEnterView.y3) {
                            if (!chatActivityEnterView.D3) {
                                z10 = true;
                                chatActivityEnterView.U0.Q(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.Q1 != 0) {
                            z10 = true;
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                            if (chatActivityEnterView.x3) {
                                chatActivityEnterView.K(true);
                            }
                        } else {
                            if (!chatActivityEnterView.D3 && (fgVar = chatActivityEnterView.U0) != null) {
                                fgVar.Q(false);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.D3) {
                            chatActivityEnterView.n1(chatActivityEnterView.y3 ^ z10, z10, false, z10);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.s2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    qk0 qk0Var = chatActivityEnterView.h1;
                    if (qk0Var != null) {
                        qk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.d3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        chatActivityEnterView.Y2.i2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
                        ye yeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.c3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.b3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            hc.b.v(chatActivityEnterView.b3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.b3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
                    mediaDataController.pushDraftVoiceMessage(j10, (eoVar == null || !eoVar.h4) ? 0L : eoVar.d(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                    break;
                }
                break;
            case 7:
                di.f0 f0Var = chatActivityEnterView.l0;
                boolean z14 = f0Var.v;
                f0Var.setOpened(!z14);
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
                            AndroidUtilities.runOnUIThread(new qd(chatActivityEnterView, 13), 275L);
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
                        bi.y1 y1Var = pfVar2.c;
                        chatActivityEnterView.getContext();
                        y1Var.setLayoutManager(new s4.c0());
                        bi.y1 y1Var2 = chatActivityEnterView.m0.c;
                        di.e0 e0Var = new di.e0();
                        e0Var.c = new ArrayList();
                        e0Var.d = new ArrayList();
                        e0Var.e = new ArrayList();
                        chatActivityEnterView.n0 = e0Var;
                        y1Var2.setAdapter(e0Var);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new qf(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new se(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.l1.addView(chatActivityEnterView.m0, w7.a6.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.W4;
                        if (iVar != null) {
                            chatActivityEnterView.n0.E(iVar);
                        }
                        chatActivityEnterView.C1();
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
                qg qgVar3 = chatActivityEnterView.Y2;
                if (qgVar3 != null && !qgVar3.l()) {
                    qg qgVar4 = chatActivityEnterView.Y2;
                    yg ygVar = chatActivityEnterView.F0;
                    qgVar4.s1(ygVar, ygVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.eo eoVar2 = chatActivityEnterView.O2;
                if (BirthdayController.isToday(eoVar2.a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + eoVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + eoVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + eoVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().a8 == null || !chatActivityEnterView.getParentFragment().a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.J1, false);
                }
                TLRPC.User i14 = chatActivityEnterView.getParentFragment().i();
                if (i14 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().a8.birthday);
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(chatActivityEnterView.getContext(), 3, null);
                    d2Var.q(200L);
                    d2Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, sg.s.j(chatActivityEnterView.Q, null, new je(chatActivityEnterView, d2Var, i14, z15)), 3));
                    break;
                }
                break;
            case 10:
                int i15 = ChatActivityEnterView.m5;
                chatActivityEnterView.J0();
                break;
            case 11:
                nf nfVar = chatActivityEnterView.N0;
                if (nfVar != null && nfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                d5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new o0.b(chatActivityEnterView), chatActivityEnterView.V3);
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
                org.telegram.ui.ActionBar.r1 r1Var = chatActivityEnterView.U;
                if (r1Var == null || !r1Var.f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        break;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.e2 == 0) {
                        if (chatActivityEnterView.Q1 != 0) {
                            z13 = false;
                            chatActivityEnterView.m1(0, true);
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
                        if (chatActivityEnterView.y3) {
                            chatActivityEnterView.n1(z13, true, z13, true);
                            chatActivityEnterView.k3 = true;
                            AndroidUtilities.runOnUIThread(new qd(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.I0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        fg fgVar3 = chatActivityEnterView.U0;
                        rf rfVar4 = chatActivityEnterView.E0;
                        boolean z16 = rfVar4 != null && rfVar4.length() > 0;
                        org.telegram.ui.eo eoVar3 = chatActivityEnterView.O2;
                        if (eoVar3 != null) {
                            bi.x4 x4Var = eoVar3.y1;
                            if (x4Var != null) {
                                if (x4Var.V) {
                                    x4Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            eoVar3.y1 = null;
                            if (z12) {
                                z11 = true;
                                fgVar3.E(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        fgVar3.E(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    rf rfVar5 = chatActivityEnterView.E0;
                    if (rfVar5 != null) {
                        rfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.m2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r10 = 1;
                        if (chatActivityEnterView.e2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.e2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.t1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.o2) {
                    chatActivityEnterView.setFieldText("/");
                    rf rfVar6 = chatActivityEnterView.E0;
                    if (rfVar6 != null) {
                        rfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.eo eoVar4 = chatActivityEnterView4.O2;
                if (!chatActivityEnterView4.k5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.t0()) {
                    if (chatActivityEnterView4.Y2.u() > AndroidUtilities.dp(20.0f)) {
                        int b12 = chatActivityEnterView4.Y2.b1();
                        int u10 = chatActivityEnterView4.Y2.u();
                        j3 = 0;
                        if (u10 <= AndroidUtilities.dp(20.0f)) {
                            b12 += u10;
                        }
                        if (chatActivityEnterView4.W0) {
                            b12 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (b12 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.u0 = new ie(chatActivityEnterView4, 4);
                            chatActivityEnterView4.P();
                            break;
                        }
                    } else {
                        j3 = 0;
                    }
                    if (chatActivityEnterView4.Y2.J() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        ff ffVar = chatActivityEnterView4.q0;
                        if (ffVar != null) {
                            ffVar.e = false;
                            ffVar.l(new o1.k[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                            if (chatActivityEnterView4.k5) {
                                peer = chatActivityEnterView4.Y2.w();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.P2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.P2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Y2.J() != null && !chatActivityEnterView4.Y2.J().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Y2.J().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.P2)));
                            if (chatActivityEnterView4.k5) {
                            } else {
                                eoVar4.getParentLayout().getOverlayContainerView();
                            }
                            ff ffVar2 = new ff(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.O2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.Y2.J(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 20), chatActivityEnterView4.V3);
                            chatActivityEnterView4.q0 = ffVar2;
                            ffVar2.e = true;
                            ffVar2.c = 220;
                            ffVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.q0.setClippingEnabled(true);
                            chatActivityEnterView4.q0.setFocusable(true);
                            chatActivityEnterView4.q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.q0.setInputMethodMode(2);
                            chatActivityEnterView4.q0.setSoftInputMode(0);
                            chatActivityEnterView4.q0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.q0.b = false;
                            int i16 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || eoVar4 == null) {
                                i10 = i16;
                            } else {
                                eoVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i16;
                            }
                            int b13 = chatActivityEnterView4.Y2.b1();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int u11 = chatActivityEnterView4.Y2.u();
                            if (u11 <= AndroidUtilities.dp(20.0f)) {
                                b13 += u11;
                            }
                            if (chatActivityEnterView4.W0) {
                                b13 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i16 * 2) + b13) - ((eoVar4 == null || !eoVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i16) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i17 = (eoVar4 == null || !eoVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((b13 - i17) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i17;
                            }
                            ff ffVar3 = chatActivityEnterView4.q0;
                            View view2 = ffVar3.u;
                            vl0 vl0Var = ffVar3.v;
                            TLRPC.Peer peer3 = ffVar3.r;
                            zo0 zo0Var = ffVar3.o;
                            bi.ld ldVar2 = ffVar3.t;
                            ArrayList arrayList3 = ffVar3.z;
                            int size = arrayList3.size();
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj2 = arrayList3.get(i18);
                                i18++;
                                ((o1.k) obj2).c();
                            }
                            arrayList3.clear();
                            ldVar2.setPivotX(AndroidUtilities.dp(8.0f));
                            ldVar2.setPivotY(ldVar2.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            zo0Var.setPivotX(0.0f);
                            zo0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = ffVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList4.size() * dp;
                                int i19 = 0;
                                while (i19 < arrayList4.size()) {
                                    TLRPC.Peer peer4 = arrayList4.get(i19).peer;
                                    vl0 vl0Var2 = vl0Var;
                                    int i20 = dp;
                                    long j11 = peer4.channel_id;
                                    if (j11 == j3 || j11 != peer3.channel_id) {
                                        long j12 = peer4.user_id;
                                        if (j12 == j3 || j12 != peer3.user_id) {
                                            long j13 = peer4.chat_id;
                                            arrayList = arrayList4;
                                            if (j13 == j3 || j13 != peer3.chat_id) {
                                                i19++;
                                                ldVar2 = ldVar2;
                                                vl0Var = vl0Var2;
                                                dp = i20;
                                                arrayList4 = arrayList;
                                            } else {
                                                ffVar3.w.h1(i19, (size2 - ((arrayList.size() - 2) * i20)) + AndroidUtilities.dp(7.0f) + ((i19 != arrayList.size() + (-1) || vl0Var2.getMeasuredHeight() >= size2) ? 0 : vl0Var2.getMeasuredHeight() % i20));
                                                if (vl0Var2.computeVerticalScrollOffset() > 0) {
                                                    view2.animate().cancel();
                                                    ViewPropertyAnimator alpha = view2.animate().alpha(1.0f);
                                                    ldVar = ldVar2;
                                                    alpha.setDuration(150L).start();
                                                }
                                                ldVar = ldVar2;
                                            }
                                        }
                                    }
                                    arrayList = arrayList4;
                                    ffVar3.w.h1(i19, (size2 - ((arrayList.size() - 2) * i20)) + AndroidUtilities.dp(7.0f) + ((i19 != arrayList.size() + (-1) || vl0Var2.getMeasuredHeight() >= size2) ? 0 : vl0Var2.getMeasuredHeight() % i20));
                                    if (vl0Var2.computeVerticalScrollOffset() > 0) {
                                    }
                                    ldVar = ldVar2;
                                }
                                ldVar = ldVar2;
                            } else {
                                ldVar = ldVar2;
                            }
                            ldVar.setScaleX(0.25f);
                            ldVar.setScaleY(0.25f);
                            zo0Var.setAlpha(0.25f);
                            o1.k kVar = new o1.k(ldVar, o1.h.o);
                            kVar.u = org.telegram.ui.Cells.r6.l(1.0f, 750.0f, 1.0f);
                            kVar.b(new vo0(ffVar3, 2));
                            o1.k kVar2 = new o1.k(ldVar, o1.h.p);
                            kVar2.u = org.telegram.ui.Cells.r6.l(1.0f, 750.0f, 1.0f);
                            kVar2.b(new vo0(ffVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.k kVar3 = new o1.k(ldVar, cVar);
                            kVar3.u = org.telegram.ui.Cells.r6.l(1.0f, 750.0f, 1.0f);
                            o1.k kVar4 = new o1.k(zo0Var, cVar);
                            kVar4.u = org.telegram.ui.Cells.r6.l(1.0f, 750.0f, 1.0f);
                            for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                                arrayList3.add(kVar5);
                                kVar5.a(new wo0(ffVar3, kVar5, 1));
                                kVar5.f();
                            }
                            ff ffVar4 = chatActivityEnterView4.q0;
                            chatActivityEnterView4.s0 = i10;
                            chatActivityEnterView4.t0 = i11;
                            ffVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.p0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.k5) {
                        chatActivityEnterView4.n0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i21 = ChatActivityEnterView.m5;
                chatActivityEnterView.d0();
                break;
            case 18:
                org.telegram.ui.ActionBar.r1 r1Var2 = chatActivityEnterView.U;
                if ((r1Var2 == null || !r1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.y2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.r1 r1Var3 = chatActivityEnterView.U;
                if ((r1Var3 == null || !r1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.p1();
                    break;
                }
                break;
            default:
                int i22 = ChatActivityEnterView.m5;
                chatActivityEnterView.J0();
                break;
        }
    }
}
