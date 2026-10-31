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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sf sfVar;
        boolean z10;
        gf gfVar;
        se seVar;
        boolean z11;
        boolean z12;
        ?? r62;
        long j10;
        float f7;
        TLRPC.Peer peer;
        int i10;
        int i11;
        jg.l0 l0Var;
        int i12;
        int i13 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i13) {
            case 0:
                se seVar2 = chatActivityEnterView.E0;
                String obj = seVar2 != null ? seVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 1:
                pe peVar = chatActivityEnterView.L0;
                if (peVar == null || peVar.p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.Q0();
                        break;
                    }
                }
                break;
            case 2:
                sf sfVar2 = chatActivityEnterView.Z2;
                if (sfVar2 != null) {
                    sfVar2.q0();
                    break;
                }
                break;
            case 3:
                int i14 = ChatActivityEnterView.s5;
                if (chatActivityEnterView.b2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        of t10 = chatActivityEnterView.t();
                        chatActivityEnterView.c2 = t10;
                        ag.s0 d = ag.s0.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.b2.link;
                        String str2 = t10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = t10.b;
                        tc tcVar = new tc(chatActivityEnterView, 15);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, tcVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.b0;
                        if (numberTextView != null) {
                            org.telegram.messenger.i0.F3(3.5f, numberTextView, null);
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
                if (chatActivityEnterView.r5 == 3 && (sfVar = chatActivityEnterView.Z2) != null) {
                    sfVar.i1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.k3) {
                    if (!chatActivityEnterView.z2 || (seVar = chatActivityEnterView.E0) == null || !seVar.isFocused()) {
                        if (!chatActivityEnterView.z3) {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.P(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.R1 != 0) {
                            z10 = true;
                            chatActivityEnterView.k1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.B();
                            if (chatActivityEnterView.y3) {
                                chatActivityEnterView.F(true);
                            }
                        } else {
                            if (!chatActivityEnterView.E3 && (gfVar = chatActivityEnterView.U0) != null) {
                                gfVar.P(false);
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
                    nj0 nj0Var = chatActivityEnterView.h1;
                    if (nj0Var != null) {
                        nj0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        chatActivityEnterView.Z2.V1(2, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                        be beVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.jj jjVar = MediaController.B().u0;
                        if (jjVar != null && jjVar == chatActivityEnterView.d3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.c3 != null) {
                        if (org.telegram.messenger.v2.a) {
                            a1.g.z(chatActivityEnterView.c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.c3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.un unVar = chatActivityEnterView.P2;
                    b02.B1(j11, (unVar == null || !unVar.v4) ? 0L : unVar.b(), null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.k0(false);
                    chatActivityEnterView.F(true);
                    break;
                }
                break;
            case 7:
                xh.w wVar = chatActivityEnterView.l0;
                boolean z13 = wVar.w;
                wVar.setOpened(!z13);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.f0()) {
                    if (!z13) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.J0();
                            break;
                        } else {
                            org.telegram.messenger.i0.h3(new tc(chatActivityEnterView, 14), 275L);
                            chatActivityEnterView.i0(false);
                            break;
                        }
                    }
                } else if (z13) {
                    qe qeVar = chatActivityEnterView.m0;
                    if (qeVar != null) {
                        qeVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.m0 == null) {
                        qe qeVar2 = new qe(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = qeVar2;
                        org.telegram.ui.nb0 nb0Var = qeVar2.c;
                        chatActivityEnterView.getContext();
                        nb0Var.setLayoutManager(new s4.a0());
                        org.telegram.ui.nb0 nb0Var2 = chatActivityEnterView.m0.c;
                        xh.v vVar = new xh.v();
                        vVar.c = new ArrayList();
                        vVar.d = new ArrayList();
                        vVar.e = new ArrayList();
                        chatActivityEnterView.n0 = vVar;
                        nb0Var2.setAdapter(vVar);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new vd(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.m1.addView(chatActivityEnterView.m0, w7.b6.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.b5;
                        if (hVar != null) {
                            chatActivityEnterView.n0.E(hVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    qe qeVar3 = chatActivityEnterView.m0;
                    if (qeVar3.getVisibility() != 0) {
                        qeVar3.setVisibility(0);
                        qeVar3.c.v0(0);
                        qeVar3.n = true;
                        qeVar3.f = false;
                        break;
                    } else if (qeVar3.f) {
                        qeVar3.f = false;
                        qeVar3.a();
                        qeVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                sf sfVar3 = chatActivityEnterView.Z2;
                if (sfVar3 != null && !sfVar3.m()) {
                    sf sfVar4 = chatActivityEnterView.Z2;
                    ag agVar = chatActivityEnterView.F0;
                    sfVar4.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.c).getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).f7.edit();
                org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                if (org.telegram.messenger.y1.d(unVar2.q8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + unVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + unVar2.a(), false);
                }
                if (org.telegram.messenger.vp.r1(chatActivityEnterView.Q).w7 && org.telegram.messenger.vp.r1(chatActivityEnterView.Q).x7) {
                    edit.putBoolean("show_gift_for_" + unVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).a2(org.telegram.messenger.d20.i(chatActivityEnterView.Q).e());
                if ((chatActivityEnterView.getParentFragment().q8 == null || !chatActivityEnterView.getParentFragment().q8.display_gifts_button) && (a2 == null || !a2.display_gifts_button)) {
                    org.telegram.messenger.i0.W3(chatActivityEnterView.K1, false);
                }
                TLRPC.User j12 = chatActivityEnterView.getParentFragment().j();
                if (j12 != null) {
                    boolean z14 = chatActivityEnterView.getParentFragment().q8 != null && org.telegram.messenger.y1.e(chatActivityEnterView.getParentFragment().q8.birthday);
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, chatActivityEnterView.getContext(), null);
                    x1Var.r(200L);
                    x1Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, mg.k0.j(chatActivityEnterView.Q, null, new nd(chatActivityEnterView, x1Var, j12, z14)), 3));
                    break;
                }
                break;
            case 10:
                int i15 = ChatActivityEnterView.s5;
                chatActivityEnterView.H0();
                break;
            case 11:
                oe oeVar = chatActivityEnterView.N0;
                if (oeVar != null && oeVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                s4.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new k2.m0(chatActivityEnterView), chatActivityEnterView.W3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                oe oeVar2 = chatActivityEnterView2.N0;
                if (oeVar2 != null && oeVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(true, 2147483646, 0, 0L, true);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                oe oeVar3 = chatActivityEnterView3.N0;
                if (oeVar3 != null && oeVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(false, 0, 0, 0L, true);
                break;
            case 14:
                org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
                rd rdVar = chatActivityEnterView.Q0;
                org.telegram.ui.ActionBar.m1 m1Var = chatActivityEnterView.U;
                if (m1Var == null || !m1Var.f) {
                    if (rdVar.x) {
                        z60 z60Var = chatActivityEnterView.Y4;
                        if (z60Var != null) {
                            z60Var.u();
                            chatActivityEnterView.Y4 = null;
                            break;
                        } else {
                            se seVar3 = chatActivityEnterView.E0;
                            if (seVar3 != null && unVar3 != null) {
                                seVar3.m();
                                uu0 uu0Var = chatActivityEnterView.m1;
                                z60 z60Var2 = new z60(uu0Var != null ? uu0Var : chatActivityEnterView, chatActivityEnterView.W3, rdVar, false, false, true);
                                z60Var2.X = org.telegram.messenger.i0.L(280.0f);
                                org.telegram.ui.un.t8(new z90(z60Var2, chatActivityEnterView.E0), unVar3.h, true, true, true, true);
                                z60Var2.U = true;
                                z60Var2.p = new cd(1, chatActivityEnterView, z60Var2);
                                chatActivityEnterView.Y4 = z60Var2;
                                z60Var2.Z();
                                break;
                            }
                        }
                    } else if (chatActivityEnterView.A0) {
                        chatActivityEnterView.s1();
                        break;
                    } else if (chatActivityEnterView.q0() && chatActivityEnterView.f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.k1(0, true);
                            gf gfVar2 = chatActivityEnterView.U0;
                            if (gfVar2 != null) {
                                gfVar2.t(false);
                            }
                            se seVar4 = chatActivityEnterView.E0;
                            if (seVar4 != null) {
                                seVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.z3) {
                            chatActivityEnterView.l1(false, true, false, true);
                            chatActivityEnterView.l3 = true;
                            org.telegram.messenger.i0.h3(new tc(chatActivityEnterView, 23), 200L);
                            break;
                        } else {
                            chatActivityEnterView.G0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.r1(1, 0, true, true);
                        gf gfVar3 = chatActivityEnterView.U0;
                        se seVar5 = chatActivityEnterView.E0;
                        boolean z15 = seVar5 != null && seVar5.length() > 0;
                        if (unVar3 != null) {
                            vh.p2 p2Var = unVar3.M1;
                            if (p2Var != null) {
                                if (p2Var.V) {
                                    p2Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            unVar3.M1 = null;
                            if (z12) {
                                z11 = true;
                                gfVar3.D(z15, z11);
                                break;
                            }
                        }
                        z11 = false;
                        gfVar3.D(z15, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.t(false);
                    se seVar6 = chatActivityEnterView.E0;
                    if (seVar6 != null) {
                        seVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.n2 != null) {
                    if (chatActivityEnterView.q0()) {
                        r62 = 1;
                        if (chatActivityEnterView.f2 == 1) {
                            if (chatActivityEnterView.q0() && chatActivityEnterView.f2 == 1) {
                                chatActivityEnterView.r1(0, 1, true, false);
                            }
                        }
                    } else {
                        r62 = 1;
                    }
                    chatActivityEnterView.r1(r62, r62, r62, r62);
                } else if (chatActivityEnterView.p2) {
                    chatActivityEnterView.setFieldText("/");
                    se seVar7 = chatActivityEnterView.E0;
                    if (seVar7 != null) {
                        seVar7.requestFocus();
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
                org.telegram.ui.un unVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.p5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.q0()) {
                    if (chatActivityEnterView4.Z2.r() > org.telegram.messenger.i0.L(20.0f)) {
                        int H0 = chatActivityEnterView4.Z2.H0();
                        int r10 = chatActivityEnterView4.Z2.r();
                        j10 = 0;
                        if (r10 <= org.telegram.messenger.i0.L(20.0f)) {
                            H0 += r10;
                        }
                        if (chatActivityEnterView4.W0) {
                            H0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (H0 < org.telegram.messenger.i0.L(200.0f)) {
                            chatActivityEnterView4.u0 = new tc(chatActivityEnterView4, 0);
                            chatActivityEnterView4.L();
                            break;
                        }
                    } else {
                        j10 = 0;
                    }
                    if (chatActivityEnterView4.Z2.F() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        ie ieVar = chatActivityEnterView4.q0;
                        if (ieVar != null) {
                            ieVar.e = false;
                            ieVar.l(new o1.j[0]);
                            break;
                        } else {
                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView4.Q);
                            if (chatActivityEnterView4.p5) {
                                peer = chatActivityEnterView4.Z2.u();
                                f7 = 1.0f;
                            } else {
                                f7 = 1.0f;
                                org.telegram.messenger.vp.r1(chatActivityEnterView4.Q).L0(Long.valueOf(-chatActivityEnterView4.Q2));
                                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(chatActivityEnterView4.Q).M0(-chatActivityEnterView4.Q2);
                                r10 = M0;
                                peer = M0 != 0 ? M0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Z2.F() != null && !chatActivityEnterView4.Z2.F().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Z2.F().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.w3.V(r12.L0(Long.valueOf(-chatActivityEnterView4.Q2)));
                            if (chatActivityEnterView4.p5) {
                            } else {
                                unVar4.getParentLayout().getOverlayContainerView();
                            }
                            ie ieVar2 = new ie(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, r12, V, peer2, chatActivityEnterView4.Z2.F(), new androidx.car.app.utils.a(chatActivityEnterView4, r10, r12, 13), chatActivityEnterView4.W3);
                            chatActivityEnterView4.q0 = ieVar2;
                            ieVar2.e = true;
                            ieVar2.c = org.telegram.messenger.zs.x3;
                            ieVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.q0.setClippingEnabled(true);
                            chatActivityEnterView4.q0.setFocusable(true);
                            chatActivityEnterView4.q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.q0.setInputMethodMode(2);
                            chatActivityEnterView4.q0.setSoftInputMode(0);
                            chatActivityEnterView4.q0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.q0.b = false;
                            int i16 = -org.telegram.messenger.i0.L(4.0f);
                            int[] iArr = new int[2];
                            if (!org.telegram.messenger.i0.Q1() || unVar4 == null) {
                                i10 = i16;
                            } else {
                                unVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i16;
                            }
                            int H02 = chatActivityEnterView4.Z2.H0();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int r11 = chatActivityEnterView4.Z2.r();
                            float f10 = f7;
                            if (r11 <= org.telegram.messenger.i0.L(20.0f)) {
                                H02 += r11;
                            }
                            if (chatActivityEnterView4.W0) {
                                H02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            org.telegram.messenger.i0.L(f10);
                            if (measuredHeight < (((i16 * 2) + H02) - ((unVar4 == null || !unVar4.isInBubbleMode()) ? org.telegram.messenger.i0.m : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i11 = ((iArr[1] - measuredHeight) - i16) - org.telegram.messenger.i0.L(2.0f);
                            } else {
                                i11 = (unVar4 == null || !unVar4.isInBubbleMode()) ? org.telegram.messenger.i0.m : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((H02 - i11) - org.telegram.messenger.i0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                            }
                            ie ieVar3 = chatActivityEnterView4.q0;
                            View view2 = ieVar3.u;
                            tk0 tk0Var = ieVar3.v;
                            TLRPC.Peer peer3 = ieVar3.r;
                            wn0 wn0Var = ieVar3.o;
                            jg.l0 l0Var2 = ieVar3.t;
                            ArrayList arrayList2 = ieVar3.z;
                            int i17 = 1;
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj2 = arrayList2.get(i18);
                                i18++;
                                ((o1.j) obj2).d();
                            }
                            arrayList2.clear();
                            l0Var2.setPivotX(org.telegram.messenger.i0.L(8.0f));
                            l0Var2.setPivotY(l0Var2.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f));
                            wn0Var.setPivotX(0.0f);
                            wn0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = ieVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.i0.L(54.0f);
                                int size2 = arrayList3.size() * L;
                                i12 = 2;
                                int i19 = 0;
                                while (i19 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i19).peer;
                                    long j13 = peer4.channel_id;
                                    if (j13 == j10 || j13 != peer3.channel_id) {
                                        long j14 = peer4.user_id;
                                        if (j14 == j10 || j14 != peer3.user_id) {
                                            long j15 = peer4.chat_id;
                                            if (j15 == j10 || j15 != peer3.chat_id) {
                                                i19++;
                                                l0Var2 = l0Var2;
                                                f10 = 1.0f;
                                            }
                                        }
                                    }
                                    ieVar3.w.h1(i19, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.i0.L(7.0f) + ((i19 == arrayList3.size() + (-1) || tk0Var.getMeasuredHeight() >= size2) ? 0 : tk0Var.getMeasuredHeight() % L));
                                    if (tk0Var.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        l0Var = l0Var2;
                                        view2.animate().alpha(f10).setDuration(150L).start();
                                    }
                                    l0Var = l0Var2;
                                }
                                l0Var = l0Var2;
                            } else {
                                l0Var = l0Var2;
                                i12 = 2;
                            }
                            l0Var.setScaleX(0.25f);
                            l0Var.setScaleY(0.25f);
                            wn0Var.setAlpha(0.25f);
                            o1.j jVar = new o1.j(l0Var, o1.j.q);
                            jVar.m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                            jVar.b(new tn0(ieVar3, i12));
                            o1.j jVar2 = new o1.j(l0Var, o1.j.r);
                            jVar2.m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                            jVar2.b(new tn0(ieVar3, 3));
                            o1.c cVar = o1.j.v;
                            o1.j jVar3 = new o1.j(l0Var, cVar);
                            jVar3.m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                            o1.j jVar4 = new o1.j(wn0Var, cVar);
                            jVar4.m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                            for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                                arrayList2.add(jVar5);
                                jVar5.a(new un0(ieVar3, jVar5, i17));
                                jVar5.h();
                                i17 = 1;
                            }
                            ie ieVar4 = chatActivityEnterView4.q0;
                            chatActivityEnterView4.s0 = i10;
                            chatActivityEnterView4.t0 = i11;
                            ieVar4.showAtLocation(view, 51, i10, i11);
                            chatActivityEnterView4.p0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.r0 = new ld(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.p5) {
                        chatActivityEnterView4.j0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.j0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i20 = ChatActivityEnterView.s5;
                chatActivityEnterView.Z();
                break;
            case 18:
                org.telegram.ui.ActionBar.m1 m1Var2 = chatActivityEnterView.U;
                if ((m1Var2 == null || !m1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.h2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.m1 m1Var3 = chatActivityEnterView.U;
                if ((m1Var3 == null || !m1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.a1();
                    break;
                }
                break;
            default:
                int i21 = ChatActivityEnterView.s5;
                chatActivityEnterView.H0();
                break;
        }
    }
}
