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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        og ogVar;
        boolean z10;
        eg egVar;
        qf qfVar;
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
                qf qfVar2 = chatActivityEnterView.E0;
                String obj = qfVar2 != null ? qfVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 1:
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar == null || nfVar.q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.s2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                og ogVar2 = chatActivityEnterView.Y2;
                if (ogVar2 != null) {
                    ogVar2.G0();
                    break;
                }
                break;
            case 3:
                int i14 = ChatActivityEnterView.m5;
                if (chatActivityEnterView.a2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        kg x10 = chatActivityEnterView.x();
                        chatActivityEnterView.b2 = x10;
                        ig.y d = ig.y.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.a2.link;
                        String str2 = x10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = x10.b;
                        sd sdVar = new sd(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, sdVar);
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
                if (chatActivityEnterView.S4 == BotForumHelper.SteamingSendButtonState.STOP && (ogVar = chatActivityEnterView.Y2) != null) {
                    ogVar.t1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.j3) {
                    if (!chatActivityEnterView.y2 || (qfVar = chatActivityEnterView.E0) == null || !qfVar.isFocused()) {
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
                            chatActivityEnterView.U0.B();
                            if (chatActivityEnterView.x3) {
                                chatActivityEnterView.K(true);
                            }
                        } else {
                            if (!chatActivityEnterView.D3 && (egVar = chatActivityEnterView.U0) != null) {
                                egVar.Q(false);
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
                    gk0 gk0Var = chatActivityEnterView.h1;
                    if (gk0Var != null) {
                        gk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.d3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        chatActivityEnterView.Y2.c2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
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
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.b3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.b3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j3 = chatActivityEnterView.P2;
                    org.telegram.ui.co coVar = chatActivityEnterView.O2;
                    mediaDataController.pushDraftVoiceMessage(j3, (coVar == null || !coVar.h4) ? 0L : coVar.d(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                    break;
                }
                break;
            case 7:
                fi.c0 c0Var = chatActivityEnterView.l0;
                boolean z14 = c0Var.v;
                c0Var.setOpened(!z14);
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
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.m0(false);
                            break;
                        }
                    }
                } else if (z14) {
                    of ofVar = chatActivityEnterView.m0;
                    if (ofVar != null) {
                        ofVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.m0 == null) {
                        of ofVar2 = new of(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = ofVar2;
                        bi.o0 o0Var = ofVar2.c;
                        chatActivityEnterView.getContext();
                        o0Var.setLayoutManager(new s4.c0());
                        bi.o0 o0Var2 = chatActivityEnterView.m0.c;
                        fi.b0 b0Var = new fi.b0();
                        b0Var.c = new ArrayList();
                        b0Var.d = new ArrayList();
                        b0Var.e = new ArrayList();
                        chatActivityEnterView.n0 = b0Var;
                        o0Var2.setAdapter(b0Var);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new pf(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.l1.addView(chatActivityEnterView.m0, w7.x5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.W4;
                        if (iVar != null) {
                            chatActivityEnterView.n0.E(iVar);
                        }
                        chatActivityEnterView.C1();
                    }
                    of ofVar3 = chatActivityEnterView.m0;
                    if (ofVar3.getVisibility() != 0) {
                        ofVar3.setVisibility(0);
                        ofVar3.c.u0(0);
                        ofVar3.n = true;
                        ofVar3.f = false;
                        break;
                    } else if (ofVar3.f) {
                        ofVar3.f = false;
                        ofVar3.a();
                        ofVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                og ogVar3 = chatActivityEnterView.Y2;
                if (ogVar3 != null && !ogVar3.l()) {
                    og ogVar4 = chatActivityEnterView.Y2;
                    wg wgVar = chatActivityEnterView.F0;
                    ogVar4.n1(wgVar, wgVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.co coVar2 = chatActivityEnterView.O2;
                if (BirthdayController.isToday(coVar2.a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + coVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + coVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + coVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().a8 == null || !chatActivityEnterView.getParentFragment().a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.J1, false);
                }
                TLRPC.User i15 = chatActivityEnterView.getParentFragment().i();
                if (i15 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().a8.birthday);
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, ug.t.j(chatActivityEnterView.Q, null, new bi.f4(chatActivityEnterView, b2Var, i15, z15)), 3));
                    break;
                }
                break;
            case 10:
                int i16 = ChatActivityEnterView.m5;
                chatActivityEnterView.J0();
                break;
            case 11:
                mf mfVar = chatActivityEnterView.N0;
                if (mfVar != null && mfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new l.d(chatActivityEnterView, 11), chatActivityEnterView.V3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                mf mfVar2 = chatActivityEnterView2.N0;
                if (mfVar2 != null && mfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                mf mfVar3 = chatActivityEnterView3.N0;
                if (mfVar3 != null && mfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        break;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.e2 == 0) {
                        if (chatActivityEnterView.Q1 != 0) {
                            z13 = false;
                            chatActivityEnterView.m1(0, true);
                            eg egVar2 = chatActivityEnterView.U0;
                            if (egVar2 != null) {
                                egVar2.t(false);
                            }
                            qf qfVar3 = chatActivityEnterView.E0;
                            if (qfVar3 != null) {
                                qfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.y3) {
                            chatActivityEnterView.n1(z13, true, z13, true);
                            chatActivityEnterView.k3 = true;
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.I0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        eg egVar3 = chatActivityEnterView.U0;
                        qf qfVar4 = chatActivityEnterView.E0;
                        boolean z16 = qfVar4 != null && qfVar4.length() > 0;
                        org.telegram.ui.co coVar3 = chatActivityEnterView.O2;
                        if (coVar3 != null) {
                            di.f4 f4Var = coVar3.y1;
                            if (f4Var != null) {
                                if (f4Var.V) {
                                    f4Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            coVar3.y1 = null;
                            if (z12) {
                                z11 = true;
                                egVar3.F(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        egVar3.F(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    qf qfVar5 = chatActivityEnterView.E0;
                    if (qfVar5 != null) {
                        qfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.m2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.e2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.e2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.t1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.o2) {
                    chatActivityEnterView.setFieldText("/");
                    qf qfVar6 = chatActivityEnterView.E0;
                    if (qfVar6 != null) {
                        qfVar6.requestFocus();
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
                org.telegram.ui.co coVar4 = chatActivityEnterView4.O2;
                if (!chatActivityEnterView4.k5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.t0()) {
                    if (chatActivityEnterView4.Y2.p() > AndroidUtilities.dp(20.0f)) {
                        int W0 = chatActivityEnterView4.Y2.W0();
                        int p5 = chatActivityEnterView4.Y2.p();
                        f7 = 20.0f;
                        if (p5 <= AndroidUtilities.dp(20.0f)) {
                            W0 += p5;
                        }
                        if (chatActivityEnterView4.W0) {
                            W0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (W0 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.u0 = new ie(chatActivityEnterView4, 4);
                            chatActivityEnterView4.P();
                            break;
                        }
                    } else {
                        f7 = 20.0f;
                    }
                    if (chatActivityEnterView4.Y2.H() != null) {
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
                                peer = chatActivityEnterView4.Y2.q();
                                chatFull = null;
                                f10 = 1.0f;
                            } else {
                                f10 = 1.0f;
                                MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.P2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.P2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Y2.H() != null && !chatActivityEnterView4.Y2.H().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Y2.H().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.P2)));
                            if (chatActivityEnterView4.k5) {
                            } else {
                                coVar4.getParentLayout().getOverlayContainerView();
                            }
                            ff ffVar2 = new ff(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.O2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.Y2.H(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, i13), chatActivityEnterView4.V3);
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
                            int i17 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || coVar4 == null) {
                                i10 = i17;
                            } else {
                                coVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i17;
                            }
                            int W02 = chatActivityEnterView4.Y2.W0();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int p10 = chatActivityEnterView4.Y2.p();
                            if (p10 <= AndroidUtilities.dp(f7)) {
                                W02 += p10;
                            }
                            if (chatActivityEnterView4.W0) {
                                W02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(f10);
                            if (measuredHeight < (((i17 * 2) + W02) - ((coVar4 == null || !coVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i17) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i18 = (coVar4 == null || !coVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((W02 - i18) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i18;
                            }
                            ff ffVar3 = chatActivityEnterView4.q0;
                            View view2 = ffVar3.u;
                            ll0 ll0Var = ffVar3.v;
                            TLRPC.Peer peer3 = ffVar3.r;
                            po0 po0Var = ffVar3.o;
                            ah.y yVar = ffVar3.t;
                            ArrayList arrayList2 = ffVar3.z;
                            int size = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj2 = arrayList2.get(i19);
                                i19++;
                                ((o1.k) obj2).c();
                            }
                            arrayList2.clear();
                            yVar.setPivotX(AndroidUtilities.dp(8.0f));
                            yVar.setPivotY(yVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            po0Var.setPivotX(0.0f);
                            po0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = ffVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                int i20 = 0;
                                while (i20 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i20).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    ll0 ll0Var2 = ll0Var;
                                    long j10 = peer4.channel_id;
                                    if (j10 == 0 || j10 != peer3.channel_id) {
                                        long j11 = peer4.user_id;
                                        if (j11 == 0 || j11 != peer3.user_id) {
                                            long j12 = peer4.chat_id;
                                            if (j12 == 0 || j12 != peer3.chat_id) {
                                                i20++;
                                                ll0Var = ll0Var2;
                                                arrayList3 = arrayList4;
                                            }
                                        }
                                    }
                                    ffVar3.w.h1(i20, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + ((i20 == arrayList4.size() + (-1) || ll0Var2.getMeasuredHeight() >= size2) ? 0 : ll0Var2.getMeasuredHeight() % dp));
                                    if (ll0Var2.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            }
                            yVar.setScaleX(0.25f);
                            yVar.setScaleY(0.25f);
                            po0Var.setAlpha(0.25f);
                            o1.k kVar = new o1.k(yVar, o1.h.o);
                            kVar.u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                            kVar.b(new mo0(ffVar3, 2));
                            o1.k kVar2 = new o1.k(yVar, o1.h.p);
                            kVar2.u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                            kVar2.b(new mo0(ffVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.k kVar3 = new o1.k(yVar, cVar);
                            kVar3.u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                            o1.k kVar4 = new o1.k(po0Var, cVar);
                            kVar4.u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                            for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                                arrayList2.add(kVar5);
                                kVar5.a(new no0(ffVar3, kVar5, 1));
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
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.r2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.k1();
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
