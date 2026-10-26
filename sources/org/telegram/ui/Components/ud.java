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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        og ogVar;
        boolean z10;
        dg dgVar;
        pf pfVar;
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
                pf pfVar2 = chatActivityEnterView.E0;
                String obj = pfVar2 != null ? pfVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 1:
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar == null || mfVar.p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.Q0();
                        break;
                    }
                }
                break;
            case 2:
                og ogVar2 = chatActivityEnterView.Z2;
                if (ogVar2 != null) {
                    ogVar2.z0();
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.r5;
                if (chatActivityEnterView.b2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        jg u10 = chatActivityEnterView.u();
                        chatActivityEnterView.c2 = u10;
                        jg.z d = jg.z.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.b2.link;
                        String str2 = u10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = u10.b;
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
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (ogVar = chatActivityEnterView.Z2) != null) {
                    ogVar.j1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.k3) {
                    if (!chatActivityEnterView.z2 || (pfVar = chatActivityEnterView.E0) == null || !pfVar.isFocused()) {
                        if (!chatActivityEnterView.z3) {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.j1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.B();
                            if (chatActivityEnterView.y3) {
                                chatActivityEnterView.G(true);
                            }
                            z10 = true;
                        } else {
                            if (!chatActivityEnterView.E3 && (dgVar = chatActivityEnterView.U0) != null) {
                                dgVar.O(false);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.k1(chatActivityEnterView.z3 ^ z10, z10, false, z10);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    gl0 gl0Var = chatActivityEnterView.h1;
                    if (gl0Var != null) {
                        gl0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        chatActivityEnterView.Z2.P1(2, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            ic.a.w(chatActivityEnterView.c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.un unVar = chatActivityEnterView.P2;
                    mediaDataController.pushDraftVoiceMessage(j10, (unVar == null || !unVar.t4) ? 0L : unVar.b(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.l0(false);
                    chatActivityEnterView.G(true);
                    break;
                }
                break;
            case 7:
                hi.i0 i0Var = chatActivityEnterView.l0;
                boolean z14 = i0Var.v;
                i0Var.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.g0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.J0();
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.j0(false);
                            break;
                        }
                    }
                } else if (z14) {
                    nf nfVar = chatActivityEnterView.m0;
                    if (nfVar != null) {
                        nfVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.m0 == null) {
                        nf nfVar2 = new nf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = nfVar2;
                        bi.r1 r1Var = nfVar2.c;
                        chatActivityEnterView.getContext();
                        r1Var.setLayoutManager(new s4.c0());
                        bi.r1 r1Var2 = chatActivityEnterView.m0.c;
                        hi.h0 h0Var = new hi.h0();
                        h0Var.c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.e = new ArrayList();
                        chatActivityEnterView.n0 = h0Var;
                        r1Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new of(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.m1.addView(chatActivityEnterView.m0, gb1.i(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.b5;
                        if (hVar != null) {
                            chatActivityEnterView.n0.E(hVar);
                        }
                        chatActivityEnterView.z1();
                    }
                    nf nfVar3 = chatActivityEnterView.m0;
                    if (nfVar3.getVisibility() != 0) {
                        nfVar3.setVisibility(0);
                        nfVar3.c.v0(0);
                        nfVar3.n = true;
                        nfVar3.f = false;
                        break;
                    } else if (nfVar3.f) {
                        nfVar3.f = false;
                        nfVar3.a();
                        nfVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                og ogVar3 = chatActivityEnterView.Z2;
                if (ogVar3 != null && !ogVar3.f()) {
                    og ogVar4 = chatActivityEnterView.Z2;
                    wg wgVar = chatActivityEnterView.F0;
                    ogVar4.e1(wgVar, wgVar.a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                if (BirthdayController.isToday(unVar2.m8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + unVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + unVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + unVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().m8 == null || !chatActivityEnterView.getParentFragment().m8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i14 = chatActivityEnterView.getParentFragment().i();
                if (i14 != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().m8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().m8.birthday);
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(chatActivityEnterView.getContext(), 3, null);
                    e2Var.r(200L);
                    e2Var.setOnCancelListener(new bi.f0(chatActivityEnterView, vg.s.j(chatActivityEnterView.Q, null, new di.k3(chatActivityEnterView, e2Var, i14, z15)), 4));
                    break;
                }
                break;
            case 10:
                int i15 = ChatActivityEnterView.r5;
                chatActivityEnterView.H0();
                break;
            case 11:
                lf lfVar = chatActivityEnterView.N0;
                if (lfVar != null && lfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new jg.s0(chatActivityEnterView, 17), chatActivityEnterView.W3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                lf lfVar2 = chatActivityEnterView2.N0;
                if (lfVar2 != null && lfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                lf lfVar3 = chatActivityEnterView3.N0;
                if (lfVar3 != null && lfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.q1 q1Var = chatActivityEnterView.U;
                if (q1Var == null || !q1Var.f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.r1();
                        break;
                    } else if (chatActivityEnterView.q0() && chatActivityEnterView.f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z13 = false;
                            chatActivityEnterView.j1(0, true);
                            dg dgVar2 = chatActivityEnterView.U0;
                            if (dgVar2 != null) {
                                dgVar2.t(false);
                            }
                            pf pfVar3 = chatActivityEnterView.E0;
                            if (pfVar3 != null) {
                                pfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.z3) {
                            chatActivityEnterView.k1(z13, true, z13, true);
                            chatActivityEnterView.l3 = true;
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 22), 200L);
                            break;
                        } else {
                            chatActivityEnterView.G0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.q1(1, 0, true, true);
                        dg dgVar3 = chatActivityEnterView.U0;
                        pf pfVar4 = chatActivityEnterView.E0;
                        boolean z16 = pfVar4 != null && pfVar4.length() > 0;
                        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
                        if (unVar3 != null) {
                            fi.v3 v3Var = unVar3.K1;
                            if (v3Var != null) {
                                if (v3Var.V) {
                                    v3Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            unVar3.K1 = null;
                            if (z12) {
                                z11 = true;
                                dgVar3.C(z16, z11);
                                break;
                            }
                        }
                        z11 = false;
                        dgVar3.C(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.j1(0, false);
                    chatActivityEnterView.U0.t(false);
                    pf pfVar5 = chatActivityEnterView.E0;
                    if (pfVar5 != null) {
                        pfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.n2 != null) {
                    if (chatActivityEnterView.q0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f2 == 1) {
                            if (chatActivityEnterView.q0() && chatActivityEnterView.f2 == 1) {
                                chatActivityEnterView.q1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.q1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.p2) {
                    chatActivityEnterView.setFieldText("/");
                    pf pfVar6 = chatActivityEnterView.E0;
                    if (pfVar6 != null) {
                        pfVar6.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.z3) {
                    chatActivityEnterView.k1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.un unVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.p5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.q0()) {
                    if (chatActivityEnterView4.Z2.g() > AndroidUtilities.dp(20.0f)) {
                        int N0 = chatActivityEnterView4.Z2.N0();
                        int g7 = chatActivityEnterView4.Z2.g();
                        if (g7 <= AndroidUtilities.dp(20.0f)) {
                            N0 += g7;
                        }
                        if (chatActivityEnterView4.W0) {
                            N0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (N0 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.u0 = new ie(chatActivityEnterView4, 4);
                            chatActivityEnterView4.M();
                            break;
                        }
                    }
                    if (chatActivityEnterView4.Z2.B() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        ef efVar = chatActivityEnterView4.q0;
                        if (efVar != null) {
                            efVar.e = false;
                            efVar.l(new o1.j[0]);
                            break;
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                            if (chatActivityEnterView4.p5) {
                                peer = chatActivityEnterView4.Z2.k();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.Q2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.Q2);
                                chatFull = chatFull2;
                                peer = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Z2.B() != null && !chatActivityEnterView4.Z2.B().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Z2.B().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                            if (chatActivityEnterView4.p5) {
                            } else {
                                unVar4.getParentLayout().getOverlayContainerView();
                            }
                            ef efVar2 = new ef(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer2, chatActivityEnterView4.Z2.B(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 23), chatActivityEnterView4.W3);
                            chatActivityEnterView4.q0 = efVar2;
                            efVar2.e = true;
                            efVar2.c = 220;
                            efVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.q0.setClippingEnabled(true);
                            chatActivityEnterView4.q0.setFocusable(true);
                            chatActivityEnterView4.q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.q0.setInputMethodMode(2);
                            chatActivityEnterView4.q0.setSoftInputMode(0);
                            chatActivityEnterView4.q0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.q0.b = false;
                            int i16 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || unVar4 == null) {
                                i10 = i16;
                            } else {
                                unVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i16;
                            }
                            int N02 = chatActivityEnterView4.Z2.N0();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int g10 = chatActivityEnterView4.Z2.g();
                            if (g10 <= AndroidUtilities.dp(20.0f)) {
                                N02 += g10;
                            }
                            if (chatActivityEnterView4.W0) {
                                N02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i16 * 2) + N02) - ((unVar4 == null || !unVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i16) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i17 = (unVar4 == null || !unVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((N02 - i17) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i11 = i17;
                            }
                            ef efVar3 = chatActivityEnterView4.q0;
                            View view2 = efVar3.u;
                            mm0 mm0Var = efVar3.v;
                            TLRPC.Peer peer3 = efVar3.r;
                            vp0 vp0Var = efVar3.o;
                            bh.r rVar = efVar3.t;
                            int i18 = 1;
                            ArrayList arrayList2 = efVar3.z;
                            int size = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj2 = arrayList2.get(i19);
                                i19++;
                                ((o1.j) obj2).c();
                            }
                            arrayList2.clear();
                            rVar.setPivotX(AndroidUtilities.dp(8.0f));
                            rVar.setPivotY(rVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            vp0Var.setPivotX(0.0f);
                            vp0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = efVar3.s.peers;
                            if (peer3 != null) {
                                int dp = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * dp;
                                int i20 = 0;
                                while (i20 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i20).peer;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                    int i21 = dp;
                                    long j11 = peer4.channel_id;
                                    if (j11 == 0 || j11 != peer3.channel_id) {
                                        long j12 = peer4.user_id;
                                        if (j12 == 0 || j12 != peer3.user_id) {
                                            long j13 = peer4.chat_id;
                                            if (j13 == 0 || j13 != peer3.chat_id) {
                                                i20++;
                                                arrayList3 = arrayList4;
                                                dp = i21;
                                            }
                                        }
                                    }
                                    efVar3.w.h1(i20, (size2 - ((arrayList4.size() - 2) * i21)) + AndroidUtilities.dp(7.0f) + ((i20 == arrayList4.size() + (-1) || mm0Var.getMeasuredHeight() >= size2) ? 0 : mm0Var.getMeasuredHeight() % i21));
                                    if (mm0Var.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        view2.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            }
                            rVar.setScaleX(0.25f);
                            rVar.setScaleY(0.25f);
                            vp0Var.setAlpha(0.25f);
                            o1.j jVar = new o1.j(rVar, o1.h.o);
                            jVar.u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                            jVar.b(new sp0(efVar3, 2));
                            o1.j jVar2 = new o1.j(rVar, o1.h.p);
                            jVar2.u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                            jVar2.b(new sp0(efVar3, 3));
                            o1.c cVar = o1.h.t;
                            o1.j jVar3 = new o1.j(rVar, cVar);
                            jVar3.u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                            o1.j jVar4 = new o1.j(vp0Var, cVar);
                            jVar4.u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                            for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                                arrayList2.add(jVar5);
                                jVar5.a(new tp0(efVar3, jVar5, i18));
                                jVar5.h();
                                i18 = 1;
                            }
                            ef efVar4 = chatActivityEnterView4.q0;
                            chatActivityEnterView4.s0 = i10;
                            chatActivityEnterView4.t0 = i11;
                            efVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.p0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.p5) {
                        chatActivityEnterView4.k0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.k0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i22 = ChatActivityEnterView.r5;
                chatActivityEnterView.a0();
                break;
            case 18:
                org.telegram.ui.ActionBar.q1 q1Var2 = chatActivityEnterView.U;
                if ((q1Var2 == null || !q1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.c2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.q1 q1Var3 = chatActivityEnterView.U;
                if ((q1Var3 == null || !q1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.a1();
                    break;
                }
                break;
            default:
                int i23 = ChatActivityEnterView.r5;
                chatActivityEnterView.H0();
                break;
        }
    }
}
