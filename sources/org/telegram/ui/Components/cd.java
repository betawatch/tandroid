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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ cd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v28 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wf wfVar;
        boolean z9;
        mf mfVar;
        xe xeVar;
        boolean z10;
        boolean z11;
        ?? r10;
        float f10;
        TLRPC.Peer peer;
        int i7;
        int i10;
        bi.e5 e5Var;
        int i11;
        int i12 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i12) {
            case 0:
                xe xeVar2 = chatActivityEnterView.E0;
                String obj = xeVar2 != null ? xeVar2.getText().toString() : "";
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
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar == null || ueVar.p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                }
                break;
            case 2:
                wf wfVar2 = chatActivityEnterView.Z2;
                if (wfVar2 != null) {
                    wfVar2.C0();
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.s5;
                if (chatActivityEnterView.b2 != null) {
                    if (chatActivityEnterView.c0 - chatActivityEnterView.d0 >= 0) {
                        sf u10 = chatActivityEnterView.u();
                        chatActivityEnterView.c2 = u10;
                        kg.y d = kg.y.d(chatActivityEnterView.Q);
                        String str = chatActivityEnterView.b2.link;
                        String str2 = u10.a;
                        ArrayList<TLRPC.MessageEntity> arrayList = u10.b;
                        ad adVar = new ad(chatActivityEnterView, 15);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, adVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.b0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
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
                if (chatActivityEnterView.r5 == 3 && (wfVar = chatActivityEnterView.Z2) != null) {
                    wfVar.m1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.k3) {
                    if (!chatActivityEnterView.z2 || (xeVar = chatActivityEnterView.E0) == null || !xeVar.isFocused()) {
                        if (!chatActivityEnterView.z3) {
                            if (!chatActivityEnterView.E3) {
                                z9 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z9 = true;
                        } else if (chatActivityEnterView.R1 != 0) {
                            z9 = true;
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                            if (chatActivityEnterView.y3) {
                                chatActivityEnterView.E(true);
                            }
                        } else {
                            if (!chatActivityEnterView.E3 && (mfVar = chatActivityEnterView.U0) != null) {
                                mfVar.O(false);
                            }
                            z9 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.n1(chatActivityEnterView.z3 ^ z9, z9, false, z9);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    ki0 ki0Var = chatActivityEnterView.h1;
                    if (ki0Var != null) {
                        ki0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        chatActivityEnterView.Z2.Z1(2, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                        ge geVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.ij ijVar = MediaController.B().u0;
                        if (ijVar != null && ijVar == chatActivityEnterView.d3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.c3 != null) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.ui.Cells.f1.u(chatActivityEnterView.c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.c3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                    long j3 = chatActivityEnterView.Q2;
                    org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                    b02.B1(j3, (cnVar == null || !cnVar.v4) ? 0L : cnVar.b(), null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.E(true);
                    break;
                }
                break;
            case 7:
                hi.y yVar = chatActivityEnterView.l0;
                boolean z12 = yVar.w;
                yVar.setOpened(!z12);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.g0()) {
                    if (!z12) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.L0();
                            break;
                        } else {
                            org.telegram.messenger.g0.i3(new ad(chatActivityEnterView, 14), 275L);
                            chatActivityEnterView.k0(false);
                            break;
                        }
                    }
                } else if (z12) {
                    ve veVar = chatActivityEnterView.m0;
                    if (veVar != null) {
                        veVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.m0 == null) {
                        ve veVar2 = new ve(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = veVar2;
                        bi.q1 q1Var = veVar2.c;
                        chatActivityEnterView.getContext();
                        q1Var.setLayoutManager(new v4.b0());
                        bi.q1 q1Var2 = chatActivityEnterView.m0.c;
                        hi.x xVar = new hi.x();
                        xVar.c = new ArrayList();
                        xVar.d = new ArrayList();
                        xVar.e = new ArrayList();
                        chatActivityEnterView.n0 = xVar;
                        q1Var2.setAdapter(xVar);
                        chatActivityEnterView.m0.c.setOnItemClickListener(new we(chatActivityEnterView));
                        chatActivityEnterView.m0.c.setOnItemLongClickListener(new me(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.m1.addView(chatActivityEnterView.m0, c8.ha.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.b5;
                        if (hVar != null) {
                            chatActivityEnterView.n0.E(hVar);
                        }
                        chatActivityEnterView.E1();
                    }
                    ve veVar3 = chatActivityEnterView.m0;
                    if (veVar3.getVisibility() != 0) {
                        veVar3.setVisibility(0);
                        veVar3.c.v0(0);
                        veVar3.n = true;
                        veVar3.f = false;
                        break;
                    } else if (veVar3.f) {
                        veVar3.f = false;
                        veVar3.a();
                        veVar3.d(false);
                        break;
                    }
                }
                break;
            case 8:
                wf wfVar3 = chatActivityEnterView.Z2;
                if (wfVar3 != null && !wfVar3.c()) {
                    wf wfVar4 = chatActivityEnterView.Z2;
                    eg egVar = chatActivityEnterView.F0;
                    wfVar4.i1(egVar, ((org.telegram.ui.ActionBar.l5) egVar.c).getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).e7.edit();
                org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
                if (org.telegram.messenger.v1.d(cnVar2.q8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + cnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + cnVar2.a(), false);
                }
                if (org.telegram.messenger.qp.s1(chatActivityEnterView.Q).v7 && org.telegram.messenger.qp.s1(chatActivityEnterView.Q).w7) {
                    edit.putBoolean("show_gift_for_" + cnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).b2(org.telegram.messenger.p10.i(chatActivityEnterView.Q).e());
                if ((chatActivityEnterView.getParentFragment().q8 == null || !chatActivityEnterView.getParentFragment().q8.display_gifts_button) && (b22 == null || !b22.display_gifts_button)) {
                    org.telegram.messenger.g0.X3(chatActivityEnterView.K1, false);
                }
                TLRPC.User j10 = chatActivityEnterView.getParentFragment().j();
                if (j10 != null) {
                    boolean z13 = chatActivityEnterView.getParentFragment().q8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().q8.birthday);
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, chatActivityEnterView.getContext(), null);
                    u1Var.r(200L);
                    u1Var.setOnCancelListener(new bi.g0(chatActivityEnterView, wg.r.j(chatActivityEnterView.Q, null, new di.d3(chatActivityEnterView, u1Var, j10, z13)), 4));
                    break;
                }
                break;
            case 10:
                int i14 = ChatActivityEnterView.s5;
                chatActivityEnterView.J0();
                break;
            case 11:
                te teVar = chatActivityEnterView.N0;
                if (teVar != null && teVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                v4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new zd(chatActivityEnterView, 1), chatActivityEnterView.W3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                te teVar2 = chatActivityEnterView2.N0;
                if (teVar2 != null && teVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(true, 2147483646, 0, 0L, true);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                te teVar3 = chatActivityEnterView3.N0;
                if (teVar3 != null && teVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(false, 0, 0, 0L, true);
                break;
            case 14:
                org.telegram.ui.cn cnVar3 = chatActivityEnterView.P2;
                wd wdVar = chatActivityEnterView.Q0;
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView.U;
                if (i1Var == null || !i1Var.f) {
                    if (wdVar.x) {
                        l60 l60Var = chatActivityEnterView.Y4;
                        if (l60Var != null) {
                            l60Var.u();
                            chatActivityEnterView.Y4 = null;
                            break;
                        } else {
                            xe xeVar3 = chatActivityEnterView.E0;
                            if (xeVar3 != null && cnVar3 != null) {
                                xeVar3.m();
                                tt0 tt0Var = chatActivityEnterView.m1;
                                l60 l60Var2 = new l60(tt0Var != null ? tt0Var : chatActivityEnterView, chatActivityEnterView.W3, wdVar, false, false, true);
                                l60Var2.X = org.telegram.messenger.g0.L(280.0f);
                                org.telegram.ui.cn.B8(new i90(l60Var2, chatActivityEnterView.E0), cnVar3.h, true, true, true, true);
                                l60Var2.U = true;
                                l60Var2.p = new f(7, chatActivityEnterView, l60Var2);
                                chatActivityEnterView.Y4 = l60Var2;
                                l60Var2.Z();
                                break;
                            }
                        }
                    } else if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        break;
                    } else if (chatActivityEnterView.s0() && chatActivityEnterView.f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            mf mfVar2 = chatActivityEnterView.U0;
                            if (mfVar2 != null) {
                                mfVar2.t(false);
                            }
                            xe xeVar4 = chatActivityEnterView.E0;
                            if (xeVar4 != null) {
                                xeVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.z3) {
                            chatActivityEnterView.n1(false, true, false, true);
                            chatActivityEnterView.l3 = true;
                            org.telegram.messenger.g0.i3(new ad(chatActivityEnterView, 23), 200L);
                            break;
                        } else {
                            chatActivityEnterView.I0();
                            break;
                        }
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        mf mfVar3 = chatActivityEnterView.U0;
                        xe xeVar5 = chatActivityEnterView.E0;
                        boolean z14 = xeVar5 != null && xeVar5.length() > 0;
                        if (cnVar3 != null) {
                            fi.m3 m3Var = cnVar3.M1;
                            if (m3Var != null) {
                                if (m3Var.V) {
                                    m3Var.f(true);
                                }
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            cnVar3.M1 = null;
                            if (z11) {
                                z10 = true;
                                mfVar3.C(z14, z10);
                                break;
                            }
                        }
                        z10 = false;
                        mfVar3.C(z14, z10);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    xe xeVar6 = chatActivityEnterView.E0;
                    if (xeVar6 != null) {
                        xeVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.n2 != null) {
                    if (chatActivityEnterView.s0()) {
                        r10 = 1;
                        if (chatActivityEnterView.f2 == 1) {
                            if (chatActivityEnterView.s0() && chatActivityEnterView.f2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.t1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.p2) {
                    chatActivityEnterView.setFieldText("/");
                    xe xeVar7 = chatActivityEnterView.E0;
                    if (xeVar7 != null) {
                        xeVar7.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.z3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.cn cnVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.p5 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.s0()) {
                    if (chatActivityEnterView4.Z2.l() > org.telegram.messenger.g0.L(20.0f)) {
                        int S0 = chatActivityEnterView4.Z2.S0();
                        int l10 = chatActivityEnterView4.Z2.l();
                        if (l10 <= org.telegram.messenger.g0.L(20.0f)) {
                            S0 += l10;
                        }
                        if (chatActivityEnterView4.W0) {
                            S0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (S0 < org.telegram.messenger.g0.L(200.0f)) {
                            chatActivityEnterView4.u0 = new ad(chatActivityEnterView4, 0);
                            chatActivityEnterView4.L();
                            break;
                        }
                    }
                    if (chatActivityEnterView4.Z2.I() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        ne neVar = chatActivityEnterView4.q0;
                        if (neVar != null) {
                            neVar.e = false;
                            neVar.l(new r1.g[0]);
                            break;
                        } else {
                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView4.Q);
                            if (chatActivityEnterView4.p5) {
                                peer = chatActivityEnterView4.Z2.s();
                                f10 = 1.0f;
                            } else {
                                f10 = 1.0f;
                                org.telegram.messenger.qp.s1(chatActivityEnterView4.Q).M0(Long.valueOf(-chatActivityEnterView4.Q2));
                                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(chatActivityEnterView4.Q).N0(-chatActivityEnterView4.Q2);
                                r11 = N0;
                                peer = N0 != 0 ? N0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.Z2.I() != null && !chatActivityEnterView4.Z2.I().peers.isEmpty()) {
                                peer = chatActivityEnterView4.Z2.I().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.t3.V(s12.M0(Long.valueOf(-chatActivityEnterView4.Q2)));
                            if (chatActivityEnterView4.p5) {
                            } else {
                                cnVar4.getParentLayout().getOverlayContainerView();
                            }
                            ne neVar2 = new ne(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, s12, V, peer2, chatActivityEnterView4.Z2.I(), new a3.h(chatActivityEnterView4, r11, s12, 21), chatActivityEnterView4.W3);
                            chatActivityEnterView4.q0 = neVar2;
                            neVar2.e = true;
                            neVar2.c = org.telegram.messenger.qs.x3;
                            neVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.q0.setClippingEnabled(true);
                            chatActivityEnterView4.q0.setFocusable(true);
                            chatActivityEnterView4.q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.q0.setInputMethodMode(2);
                            chatActivityEnterView4.q0.setSoftInputMode(0);
                            chatActivityEnterView4.q0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.q0.b = false;
                            int i15 = -org.telegram.messenger.g0.L(4.0f);
                            int[] iArr = new int[2];
                            if (!org.telegram.messenger.g0.Q1() || cnVar4 == null) {
                                i7 = i15;
                            } else {
                                cnVar4.getFragmentView().getLocationInWindow(iArr);
                                i7 = iArr[0] + i15;
                            }
                            int S02 = chatActivityEnterView4.Z2.S0();
                            int measuredHeight = chatActivityEnterView4.q0.getContentView().getMeasuredHeight();
                            int l11 = chatActivityEnterView4.Z2.l();
                            float f11 = f10;
                            if (l11 <= org.telegram.messenger.g0.L(20.0f)) {
                                S02 += l11;
                            }
                            if (chatActivityEnterView4.W0) {
                                S02 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            org.telegram.messenger.g0.L(f11);
                            if (measuredHeight < (((i15 * 2) + S02) - ((cnVar4 == null || !cnVar4.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0)) - chatActivityEnterView4.q0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                i10 = ((iArr[1] - measuredHeight) - i15) - org.telegram.messenger.g0.L(2.0f);
                            } else {
                                i10 = (cnVar4 == null || !cnVar4.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0;
                                chatActivityEnterView4.q0.o.getLayoutParams().height = ((S02 - i10) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                            }
                            ne neVar3 = chatActivityEnterView4.q0;
                            View view2 = neVar3.u;
                            qj0 qj0Var = neVar3.v;
                            TLRPC.Peer peer3 = neVar3.r;
                            wm0 wm0Var = neVar3.o;
                            bi.e5 e5Var2 = neVar3.t;
                            ArrayList arrayList2 = neVar3.z;
                            int i16 = 1;
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj2 = arrayList2.get(i17);
                                i17++;
                                ((r1.g) obj2).d();
                            }
                            arrayList2.clear();
                            e5Var2.setPivotX(org.telegram.messenger.g0.L(8.0f));
                            e5Var2.setPivotY(e5Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                            wm0Var.setPivotX(0.0f);
                            wm0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = neVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.g0.L(54.0f);
                                int size2 = arrayList3.size() * L;
                                i11 = 2;
                                int i18 = 0;
                                while (i18 < arrayList3.size()) {
                                    TLRPC.Peer peer4 = arrayList3.get(i18).peer;
                                    qj0 qj0Var2 = qj0Var;
                                    bi.e5 e5Var3 = e5Var2;
                                    long j11 = peer4.channel_id;
                                    if (j11 == 0 || j11 != peer3.channel_id) {
                                        long j12 = peer4.user_id;
                                        if (j12 == 0 || j12 != peer3.user_id) {
                                            long j13 = peer4.chat_id;
                                            if (j13 == 0 || j13 != peer3.chat_id) {
                                                i18++;
                                                e5Var2 = e5Var3;
                                                qj0Var = qj0Var2;
                                                f11 = 1.0f;
                                            }
                                        }
                                    }
                                    neVar3.w.h1(i18, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + ((i18 == arrayList3.size() + (-1) || qj0Var2.getMeasuredHeight() >= size2) ? 0 : qj0Var2.getMeasuredHeight() % L));
                                    if (qj0Var2.computeVerticalScrollOffset() > 0) {
                                        view2.animate().cancel();
                                        e5Var = e5Var3;
                                        view2.animate().alpha(f11).setDuration(150L).start();
                                    } else {
                                        e5Var = e5Var3;
                                    }
                                }
                                e5Var = e5Var2;
                            } else {
                                e5Var = e5Var2;
                                i11 = 2;
                            }
                            e5Var.setScaleX(0.25f);
                            e5Var.setScaleY(0.25f);
                            wm0Var.setAlpha(0.25f);
                            r1.g gVar = new r1.g(e5Var, r1.g.q);
                            gVar.m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                            gVar.b(new tm0(neVar3, i11));
                            r1.g gVar2 = new r1.g(e5Var, r1.g.r);
                            gVar2.m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                            gVar2.b(new tm0(neVar3, 3));
                            r1.b bVar = r1.g.v;
                            r1.g gVar3 = new r1.g(e5Var, bVar);
                            gVar3.m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                            r1.g gVar4 = new r1.g(wm0Var, bVar);
                            gVar4.m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                            for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                                arrayList2.add(gVar5);
                                gVar5.a(new um0(neVar3, gVar5, i16));
                                gVar5.h();
                                i16 = 1;
                            }
                            ne neVar4 = chatActivityEnterView4.q0;
                            chatActivityEnterView4.s0 = i7;
                            chatActivityEnterView4.t0 = i10;
                            neVar4.showAtLocation(view, 51, i7, i10);
                            chatActivityEnterView4.p0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.r0 = new rd(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.p5) {
                        chatActivityEnterView4.l0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.l0(true, true, true);
                        break;
                    }
                }
                break;
            case 17:
                int i19 = ChatActivityEnterView.s5;
                chatActivityEnterView.a0();
                break;
            case 18:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView.U;
                if ((i1Var2 == null || !i1Var2.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.l2();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.U;
                if ((i1Var3 == null || !i1Var3.f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.e1();
                    break;
                }
                break;
            default:
                int i20 = ChatActivityEnterView.s5;
                chatActivityEnterView.J0();
                break;
        }
    }
}
