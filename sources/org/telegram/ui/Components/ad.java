package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ad(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v28 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uf ufVar;
        boolean z10;
        kf kfVar;
        ve veVar;
        boolean z11;
        boolean z12;
        ?? r10;
        float f10;
        TLRPC.Peer peer;
        int i3;
        int i10;
        ai.o2 o2Var;
        int i11;
        int i12 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i12) {
            case 0:
                ve veVar2 = chatActivityEnterView.F0;
                String obj = veVar2 != null ? veVar2.getText().toString() : "";
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
                se seVar = chatActivityEnterView.M0;
                if (seVar == null || seVar.q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.u2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.g0 == null) {
                        chatActivityEnterView.R0();
                        break;
                    }
                }
                break;
            case 2:
                uf ufVar2 = chatActivityEnterView.a3;
                if (ufVar2 != null) {
                    ufVar2.F0();
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.t5;
                if (chatActivityEnterView.c2 != null) {
                    if (chatActivityEnterView.d0 - chatActivityEnterView.e0 >= 0) {
                        qf u10 = chatActivityEnterView.u();
                        chatActivityEnterView.d2 = u10;
                        lg.z d = lg.z.d(chatActivityEnterView.R);
                        String str = chatActivityEnterView.c2.link;
                        String str2 = u10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = u10.b;
                        yc ycVar = new yc(chatActivityEnterView, 15);
                        TL_account.TL_businessChatLink c2 = d.c(str);
                        if (c2 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c2.title;
                            d.b(c2, tL_inputBusinessChatLink, ycVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.c0.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 4:
                if (chatActivityEnterView.s5 == 3 && (ufVar = chatActivityEnterView.a3) != null) {
                    ufVar.m1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.l3) {
                    if (!chatActivityEnterView.A2 || (veVar = chatActivityEnterView.F0) == null || !veVar.isFocused()) {
                        if (!chatActivityEnterView.A3) {
                            if (!chatActivityEnterView.F3) {
                                z10 = true;
                                chatActivityEnterView.V0.O(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.S1 != 0) {
                            z10 = true;
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                            if (chatActivityEnterView.z3) {
                                chatActivityEnterView.E(true);
                            }
                        } else {
                            if (!chatActivityEnterView.F3 && (kfVar = chatActivityEnterView.V0) != null) {
                                kfVar.O(false);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.F3) {
                            chatActivityEnterView.m1(chatActivityEnterView.A3 ^ z10, z10, false, z10);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.u2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    mi0 mi0Var = chatActivityEnterView.i1;
                    if (mi0Var != null) {
                        mi0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.I3);
                        chatActivityEnterView.a3.d2(2, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.T4, 0L, true);
                        ee eeVar = chatActivityEnterView.K0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.zi ziVar = MediaController.B().v0;
                        if (ziVar != null && ziVar == chatActivityEnterView.e3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.d3 != null) {
                        if (org.telegram.messenger.r2.a) {
                            k2.p1.w(chatActivityEnterView.d3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.d3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(chatActivityEnterView.R);
                    long j10 = chatActivityEnterView.R2;
                    org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                    b02.B1(j10, (wmVar == null || !wmVar.w4) ? 0L : wmVar.b(), null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.j1 = 0L;
                    chatActivityEnterView.l0(false);
                    chatActivityEnterView.E(true);
                    break;
                }
                break;
            case 7:
                ii.a0 a0Var = chatActivityEnterView.m0;
                boolean z13 = a0Var.w;
                a0Var.setOpened(!z13);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.g0()) {
                    if (!z13) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.K0();
                            break;
                        } else {
                            org.telegram.messenger.g0.i3(new yc(chatActivityEnterView, 14), 275L);
                            chatActivityEnterView.j0(false);
                            break;
                        }
                    }
                } else if (z13) {
                    te teVar = chatActivityEnterView.n0;
                    if (teVar != null) {
                        teVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.n0 == null) {
                        te teVar2 = new te(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.n0 = teVar2;
                        ci.j1 j1Var = teVar2.c;
                        chatActivityEnterView.getContext();
                        j1Var.setLayoutManager(new u4.b0());
                        ci.j1 j1Var2 = chatActivityEnterView.n0.c;
                        ii.z zVar = new ii.z();
                        zVar.c = new ArrayList();
                        zVar.d = new ArrayList();
                        zVar.e = new ArrayList();
                        chatActivityEnterView.o0 = zVar;
                        j1Var2.setAdapter(zVar);
                        chatActivityEnterView.n0.c.setOnItemClickListener(new ue(chatActivityEnterView));
                        chatActivityEnterView.n0.c.setOnItemLongClickListener(new ke(chatActivityEnterView));
                        chatActivityEnterView.n0.setClipToPadding(false);
                        chatActivityEnterView.n1.addView(chatActivityEnterView.n0, b8.mf.e(-1, -1, 80));
                        chatActivityEnterView.n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.c5;
                        if (hVar != null) {
                            chatActivityEnterView.o0.E(hVar);
                        }
                        chatActivityEnterView.D1();
                    }
                    te teVar3 = chatActivityEnterView.n0;
                    if (teVar3.getVisibility() != 0) {
                        teVar3.setVisibility(0);
                        teVar3.c.v0(0);
                        teVar3.n = true;
                        teVar3.f = false;
                        break;
                    } else if (teVar3.f) {
                        teVar3.f = false;
                        teVar3.a();
                        teVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                uf ufVar3 = chatActivityEnterView.a3;
                if (ufVar3 != null && !ufVar3.k()) {
                    uf ufVar4 = chatActivityEnterView.a3;
                    cg cgVar = chatActivityEnterView.G0;
                    ufVar4.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.c).getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(chatActivityEnterView.R).e7.edit();
                org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
                if (org.telegram.messenger.v1.d(wmVar2.r8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + wmVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + wmVar2.a(), false);
                }
                if (org.telegram.messenger.hp.s1(chatActivityEnterView.R).v7 && org.telegram.messenger.hp.s1(chatActivityEnterView.R).w7) {
                    edit.putBoolean("show_gift_for_" + wmVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(chatActivityEnterView.R).b2(org.telegram.messenger.h10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().r8 == null || !chatActivityEnterView.getParentFragment().r8.display_gifts_button) && (b22 == null || !b22.display_gifts_button)) {
                    org.telegram.messenger.g0.X3(chatActivityEnterView.L1, false);
                }
                TLRPC.User j11 = chatActivityEnterView.getParentFragment().j();
                if (j11 != null) {
                    boolean z14 = chatActivityEnterView.getParentFragment().r8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().r8.birthday);
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, chatActivityEnterView.getContext(), null);
                    s1Var.r(200L);
                    s1Var.setOnCancelListener(new ci.b0(chatActivityEnterView, xg.s.j(chatActivityEnterView.R, null, new ei.g3(chatActivityEnterView, s1Var, j11, z14)), 4));
                    break;
                }
                break;
            case 10:
                int i14 = ChatActivityEnterView.t5;
                chatActivityEnterView.I0();
                break;
            case 11:
                re reVar = chatActivityEnterView.O0;
                if (reVar != null && reVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                t4.L(chatActivityEnterView.P2, chatActivityEnterView.Q2.a(), new xd(chatActivityEnterView, 1), chatActivityEnterView.X3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                re reVar2 = chatActivityEnterView2.O0;
                if (reVar2 != null && reVar2.isShowing()) {
                    chatActivityEnterView2.O0.dismiss();
                }
                chatActivityEnterView2.S0(true, 2147483646, 0, 0L, true);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                re reVar3 = chatActivityEnterView3.O0;
                if (reVar3 != null && reVar3.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.S0(false, 0, 0, 0L, true);
                break;
            case 14:
                org.telegram.ui.wm wmVar3 = chatActivityEnterView.Q2;
                ud udVar = chatActivityEnterView.R0;
                org.telegram.ui.ActionBar.h1 h1Var = chatActivityEnterView.V;
                if (h1Var == null || !h1Var.f) {
                    if (udVar.x) {
                        f60 f60Var = chatActivityEnterView.Z4;
                        if (f60Var != null) {
                            f60Var.u();
                            chatActivityEnterView.Z4 = null;
                            break;
                        } else {
                            ve veVar3 = chatActivityEnterView.F0;
                            if (veVar3 != null && wmVar3 != null) {
                                veVar3.m();
                                qt0 qt0Var = chatActivityEnterView.n1;
                                f60 f60Var2 = new f60(qt0Var != null ? qt0Var : chatActivityEnterView, chatActivityEnterView.X3, udVar, false, false, true);
                                f60Var2.X = org.telegram.messenger.g0.L(280.0f);
                                org.telegram.ui.wm.A8(new d90(f60Var2, chatActivityEnterView.F0), wmVar3.h, true, true, true, true);
                                f60Var2.U = true;
                                f60Var2.p = new org.telegram.ui.lo(12, chatActivityEnterView, f60Var2);
                                chatActivityEnterView.Z4 = f60Var2;
                                f60Var2.Z();
                                break;
                            }
                        }
                    } else if (chatActivityEnterView.B0) {
                        chatActivityEnterView.t1();
                        break;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.g2 == 0) {
                        if (chatActivityEnterView.S1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            kf kfVar2 = chatActivityEnterView.V0;
                            if (kfVar2 != null) {
                                kfVar2.t(false);
                            }
                            ve veVar4 = chatActivityEnterView.F0;
                            if (veVar4 != null) {
                                veVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.A3) {
                            chatActivityEnterView.m1(false, true, false, true);
                            chatActivityEnterView.m3 = true;
                            org.telegram.messenger.g0.i3(new yc(chatActivityEnterView, 23), 200L);
                            break;
                        } else {
                            chatActivityEnterView.H0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        kf kfVar3 = chatActivityEnterView.V0;
                        ve veVar5 = chatActivityEnterView.F0;
                        boolean z15 = veVar5 != null && veVar5.length() > 0;
                        if (wmVar3 != null) {
                            gi.l3 l3Var = wmVar3.N1;
                            if (l3Var != null) {
                                if (l3Var.W) {
                                    l3Var.f(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            wmVar3.N1 = null;
                            if (z12) {
                                z11 = true;
                                kfVar3.C(z15, z11);
                                break;
                            }
                        }
                        z11 = false;
                        kfVar3.C(z15, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.S1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.V0.t(false);
                    ve veVar6 = chatActivityEnterView.F0;
                    if (veVar6 != null) {
                        veVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.o2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r10 = 1;
                        if (chatActivityEnterView.g2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.g2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.s1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.q2) {
                    chatActivityEnterView.setFieldText("/");
                    ve veVar7 = chatActivityEnterView.F0;
                    if (veVar7 != null) {
                        veVar7.requestFocus();
                    }
                    chatActivityEnterView.G0();
                }
                if (chatActivityEnterView.A3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.wm wmVar4 = chatActivityEnterView4.Q2;
                if (!chatActivityEnterView4.q5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.r0()) {
                    if (chatActivityEnterView4.a3.o() > org.telegram.messenger.g0.L(20.0f)) {
                        int O0 = chatActivityEnterView4.a3.O0();
                        int o10 = chatActivityEnterView4.a3.o();
                        if (o10 <= org.telegram.messenger.g0.L(20.0f)) {
                            O0 += o10;
                        }
                        if (chatActivityEnterView4.X0) {
                            O0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (O0 < org.telegram.messenger.g0.L(200.0f)) {
                            chatActivityEnterView4.v0 = new yc(chatActivityEnterView4, 0);
                            chatActivityEnterView4.L();
                            break;
                        }
                    }
                    if (chatActivityEnterView4.a3.M() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        le leVar = chatActivityEnterView4.r0;
                        if (leVar != null) {
                            leVar.e = false;
                            leVar.l(new q1.g[0]);
                            break;
                        } else {
                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView4.R);
                            if (chatActivityEnterView4.q5) {
                                peer = chatActivityEnterView4.a3.t();
                                f10 = 1.0f;
                            } else {
                                f10 = 1.0f;
                                org.telegram.messenger.hp.s1(chatActivityEnterView4.R).M0(Long.valueOf(-chatActivityEnterView4.R2));
                                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(chatActivityEnterView4.R).N0(-chatActivityEnterView4.R2);
                                r11 = N0;
                                peer = N0 != 0 ? N0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.a3.M() != null && !chatActivityEnterView4.a3.M().peers.isEmpty()) {
                                peer = chatActivityEnterView4.a3.M().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.t3.V(s12.M0(Long.valueOf(-chatActivityEnterView4.R2)));
                            if (chatActivityEnterView4.q5) {
                            } else {
                                wmVar4.getParentLayout().getOverlayContainerView();
                            }
                            le leVar2 = new le(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.Q2, s12, V, peer2, chatActivityEnterView4.a3.M(), new aa.a(chatActivityEnterView4, r11, s12, 21), chatActivityEnterView4.X3);
                            chatActivityEnterView4.r0 = leVar2;
                            leVar2.e = true;
                            leVar2.c = org.telegram.messenger.hs.x3;
                            leVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.r0.setClippingEnabled(true);
                            chatActivityEnterView4.r0.setFocusable(true);
                            chatActivityEnterView4.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.r0.setInputMethodMode(2);
                            chatActivityEnterView4.r0.setSoftInputMode(0);
                            chatActivityEnterView4.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.r0.b = false;
                            int i15 = -org.telegram.messenger.g0.L(4.0f);
                            int[] iArr = new int[2];
                            if (!org.telegram.messenger.g0.Q1() || wmVar4 == null) {
                                i3 = i15;
                            } else {
                                wmVar4.getFragmentView().getLocationInWindow(iArr);
                                i3 = iArr[0] + i15;
                            }
                            int O02 = chatActivityEnterView4.a3.O0();
                            int measuredHeight = chatActivityEnterView4.r0.getContentView().getMeasuredHeight();
                            int o11 = chatActivityEnterView4.a3.o();
                            float f11 = f10;
                            if (o11 <= org.telegram.messenger.g0.L(20.0f)) {
                                O02 += o11;
                            }
                            if (chatActivityEnterView4.X0) {
                                O02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            org.telegram.messenger.g0.L(f11);
                            if (measuredHeight < (((i15 * 2) + O02) - ((wmVar4 == null || !wmVar4.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0)) - chatActivityEnterView4.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i10 = ((iArr[1] - measuredHeight) - i15) - org.telegram.messenger.g0.L(2.0f);
                            } else {
                                i10 = (wmVar4 == null || !wmVar4.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0;
                                chatActivityEnterView4.r0.o.getLayoutParams().height = ((O02 - i10) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                            }
                            le leVar3 = chatActivityEnterView4.r0;
                            View view2 = leVar3.u;
                            tj0 tj0Var = leVar3.v;
                            TLRPC.Peer peer3 = leVar3.r;
                            ym0 ym0Var = leVar3.o;
                            ai.o2 o2Var2 = leVar3.t;
                            ArrayList arrayList2 = leVar3.z;
                            int i16 = 1;
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj2 = arrayList2.get(i17);
                                i17++;
                                ((q1.g) obj2).d();
                            }
                            arrayList2.clear();
                            o2Var2.setPivotX(org.telegram.messenger.g0.L(8.0f));
                            o2Var2.setPivotY(o2Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                            ym0Var.setPivotX(0.0f);
                            ym0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = leVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.g0.L(54.0f);
                                int size2 = arrayList3.size() * L;
                                i11 = 2;
                                int i18 = 0;
                                while (i18 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i18).peer;
                                    tj0 tj0Var2 = tj0Var;
                                    ai.o2 o2Var3 = o2Var2;
                                    long j12 = peer4.channel_id;
                                    if (j12 == 0 || j12 != peer3.channel_id) {
                                        long j13 = peer4.user_id;
                                        if (j13 == 0 || j13 != peer3.user_id) {
                                            long j14 = peer4.chat_id;
                                            if (j14 == 0 || j14 != peer3.chat_id) {
                                                i18++;
                                                o2Var2 = o2Var3;
                                                tj0Var = tj0Var2;
                                                f11 = 1.0f;
                                            }
                                        }
                                    }
                                    leVar3.w.h1(i18, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + ((i18 == arrayList3.size() + (-1) || tj0Var2.getMeasuredHeight() >= size2) ? 0 : tj0Var2.getMeasuredHeight() % L));
                                    if (tj0Var2.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        o2Var = o2Var3;
                                        view2.animate().alpha(f11).setDuration(150L).start();
                                    } else {
                                        o2Var = o2Var3;
                                    }
                                }
                                o2Var = o2Var2;
                            } else {
                                o2Var = o2Var2;
                                i11 = 2;
                            }
                            o2Var.setScaleX(0.25f);
                            o2Var.setScaleY(0.25f);
                            ym0Var.setAlpha(0.25f);
                            q1.g gVar = new q1.g(o2Var, q1.g.q);
                            gVar.m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                            gVar.b(new vm0(leVar3, i11));
                            q1.g gVar2 = new q1.g(o2Var, q1.g.r);
                            gVar2.m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                            gVar2.b(new vm0(leVar3, 3));
                            q1.b bVar = q1.g.v;
                            q1.g gVar3 = new q1.g(o2Var, bVar);
                            gVar3.m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                            q1.g gVar4 = new q1.g(ym0Var, bVar);
                            gVar4.m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                            for (q1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                                arrayList2.add(gVar5);
                                gVar5.a(new wm0(leVar3, gVar5, i16));
                                gVar5.h();
                                i16 = 1;
                            }
                            le leVar4 = chatActivityEnterView4.r0;
                            chatActivityEnterView4.t0 = i3;
                            chatActivityEnterView4.u0 = i10;
                            leVar4.showAtLocation(view, 51, i3, i10);
                            chatActivityEnterView4.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.s0 = new pd(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.q5) {
                        chatActivityEnterView4.k0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.k0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i19 = ChatActivityEnterView.t5;
                chatActivityEnterView.a0();
                break;
            case 18:
                org.telegram.ui.ActionBar.h1 h1Var2 = chatActivityEnterView.V;
                if ((h1Var2 == null || !h1Var2.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.a3.r2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.h1 h1Var3 = chatActivityEnterView.V;
                if ((h1Var3 == null || !h1Var3.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.a3.b1();
                    break;
                }
                break;
            default:
                int i20 = ChatActivityEnterView.t5;
                chatActivityEnterView.I0();
                break;
        }
    }
}
