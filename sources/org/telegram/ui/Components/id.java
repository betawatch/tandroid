package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r1v127, types: [org.telegram.ui.Components.mg] */
    /* JADX WARN: Type inference failed for: r1v98, types: [di.b1, org.telegram.ui.Components.ek0] */
    /* JADX WARN: Type inference failed for: r3v38, types: [org.telegram.ui.Components.cu0] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i7;
        int i10;
        int i11;
        eg egVar;
        hf hfVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        zi0 zi0Var;
        qh0 qh0Var;
        int i12;
        int i13;
        int i14;
        float f10;
        mg mgVar;
        ?? r52;
        int i15 = this.a;
        int i16 = 4;
        int i17 = 28;
        int i18 = 29;
        int i19 = 0;
        r8 = false;
        boolean z10 = false;
        r8 = false;
        boolean z11 = false;
        int i20 = 2;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i15) {
            case 0:
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView.V;
                if ((i1Var == null || !i1Var.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.P3.n1();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView.V;
                if ((i1Var2 == null || !i1Var2.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.P3.v2();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.bn bnVar = chatActivityEnterView2.F3;
                if (!chatActivityEnterView2.p7 ? chatActivityEnterView2.getTranslationY() == 0.0f : !chatActivityEnterView2.T0()) {
                    if (chatActivityEnterView2.P3.n() > org.telegram.messenger.g0.L(20.0f)) {
                        int X0 = chatActivityEnterView2.P3.X0();
                        int n10 = chatActivityEnterView2.P3.n();
                        if (n10 <= org.telegram.messenger.g0.L(20.0f)) {
                            X0 += n10;
                        }
                        if (chatActivityEnterView2.X0) {
                            X0 -= chatActivityEnterView2.getEmojiPadding();
                        }
                        if (X0 < org.telegram.messenger.g0.L(200.0f)) {
                            chatActivityEnterView2.v0 = new dd(chatActivityEnterView2, 7);
                            chatActivityEnterView2.U();
                            break;
                        }
                    }
                    if (chatActivityEnterView2.P3.H() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        ye yeVar = chatActivityEnterView2.r0;
                        if (yeVar != null) {
                            yeVar.e = false;
                            yeVar.l(new r1.g[0]);
                            break;
                        } else {
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R);
                            if (chatActivityEnterView2.p7) {
                                peer = chatActivityEnterView2.P3.o();
                            } else {
                                org.telegram.messenger.mp.u1(chatActivityEnterView2.R).O0(Long.valueOf(-chatActivityEnterView2.G3));
                                ?? P0 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R).P0(-chatActivityEnterView2.G3);
                                peer = P0 != 0 ? P0.default_send_as : null;
                                r3 = P0;
                            }
                            if (peer == null && chatActivityEnterView2.P3.H() != null && !chatActivityEnterView2.P3.H().peers.isEmpty()) {
                                peer = chatActivityEnterView2.P3.H().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.v3.V(u12.O0(Long.valueOf(-chatActivityEnterView2.G3)));
                            if (chatActivityEnterView2.p7) {
                            } else {
                                bnVar.getParentLayout().getOverlayContainerView();
                            }
                            ye yeVar2 = new ye(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.F3, u12, V, peer2, chatActivityEnterView2.P3.H(), new a3.h(chatActivityEnterView2, r3, u12, 24), chatActivityEnterView2.M4);
                            chatActivityEnterView2.r0 = yeVar2;
                            yeVar2.e = true;
                            yeVar2.c = org.telegram.messenger.ks.x3;
                            yeVar2.setOutsideTouchable(true);
                            chatActivityEnterView2.r0.setClippingEnabled(true);
                            chatActivityEnterView2.r0.setFocusable(true);
                            chatActivityEnterView2.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView2.r0.setInputMethodMode(2);
                            chatActivityEnterView2.r0.setSoftInputMode(0);
                            chatActivityEnterView2.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView2.r0.b = false;
                            int i21 = -org.telegram.messenger.g0.L(4.0f);
                            int[] iArr = new int[2];
                            if (!org.telegram.messenger.g0.Q1() || bnVar == null) {
                                i7 = i21;
                            } else {
                                bnVar.getFragmentView().getLocationInWindow(iArr);
                                i7 = iArr[0] + i21;
                            }
                            int X02 = chatActivityEnterView2.P3.X0();
                            int measuredHeight = chatActivityEnterView2.r0.getContentView().getMeasuredHeight();
                            int n11 = chatActivityEnterView2.P3.n();
                            if (n11 <= org.telegram.messenger.g0.L(20.0f)) {
                                X02 += n11;
                            }
                            if (chatActivityEnterView2.X0) {
                                X02 -= chatActivityEnterView2.getEmojiPadding();
                            }
                            org.telegram.messenger.g0.L(1.0f);
                            if (measuredHeight < (((i21 * 2) + X02) - ((bnVar == null || !bnVar.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0)) - chatActivityEnterView2.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView2.getLocationInWindow(iArr);
                                i10 = ((iArr[1] - measuredHeight) - i21) - org.telegram.messenger.g0.L(2.0f);
                            } else {
                                int i22 = (bnVar == null || !bnVar.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0;
                                chatActivityEnterView2.r0.o.getLayoutParams().height = ((X02 - i22) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                                i10 = i22;
                            }
                            ye yeVar3 = chatActivityEnterView2.r0;
                            View view2 = yeVar3.u;
                            ek0 ek0Var = yeVar3.v;
                            TLRPC.Peer peer3 = yeVar3.r;
                            jn0 jn0Var = yeVar3.o;
                            bi.g3 g3Var = yeVar3.t;
                            ArrayList arrayList = yeVar3.z;
                            int size = arrayList.size();
                            int i23 = 0;
                            while (i23 < size) {
                                Object obj = arrayList.get(i23);
                                i23++;
                                ((r1.g) obj).d();
                            }
                            arrayList.clear();
                            g3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                            g3Var.setPivotY(g3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                            jn0Var.setPivotX(0.0f);
                            jn0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = yeVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.g0.L(54.0f);
                                int size2 = arrayList2.size() * L;
                                i11 = 2;
                                int i24 = 0;
                                while (i24 < arrayList2.size()) {
                                    TLRPC.Peer peer4 = arrayList2.get(i24).peer;
                                    View view3 = view2;
                                    ek0 ek0Var2 = ek0Var;
                                    long j3 = peer4.channel_id;
                                    if (j3 == 0 || j3 != peer3.channel_id) {
                                        long j10 = peer4.user_id;
                                        if (j10 == 0 || j10 != peer3.user_id) {
                                            long j11 = peer4.chat_id;
                                            if (j11 == 0 || j11 != peer3.chat_id) {
                                                i24++;
                                                view2 = view3;
                                                ek0Var = ek0Var2;
                                            }
                                        }
                                    }
                                    yeVar3.w.h1(i24, (size2 - ((arrayList2.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + ((i24 == arrayList2.size() + (-1) || ek0Var2.getMeasuredHeight() >= size2) ? 0 : ek0Var2.getMeasuredHeight() % L));
                                    if (ek0Var2.computeVerticalScrollOffset() > 0) {
                                        view3.animate().cancel();
                                        view3.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            } else {
                                i11 = 2;
                            }
                            g3Var.setScaleX(0.25f);
                            g3Var.setScaleY(0.25f);
                            jn0Var.setAlpha(0.25f);
                            r1.g gVar = new r1.g(g3Var, r1.g.q);
                            gVar.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            gVar.b(new gn0(yeVar3, i11));
                            r1.g gVar2 = new r1.g(g3Var, r1.g.r);
                            gVar2.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            gVar2.b(new gn0(yeVar3, 3));
                            r1.b bVar = r1.g.v;
                            r1.g gVar3 = new r1.g(g3Var, bVar);
                            gVar3.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            r1.g gVar4 = new r1.g(jn0Var, bVar);
                            gVar4.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                                arrayList.add(gVar5);
                                gVar5.a(new hn0(yeVar3, gVar5, 1));
                                gVar5.h();
                            }
                            ye yeVar4 = chatActivityEnterView2.r0;
                            chatActivityEnterView2.t0 = i7;
                            chatActivityEnterView2.u0 = i10;
                            yeVar4.showAtLocation(view, 51, i7, i10);
                            chatActivityEnterView2.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView2.s0 = new dd(chatActivityEnterView2, 6);
                    if (chatActivityEnterView2.p7) {
                        chatActivityEnterView2.M0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView2.M0(true, true, true);
                        break;
                    }
                }
                break;
            case 3:
                int i25 = ChatActivityEnterView.s7;
                chatActivityEnterView.l1();
                break;
            case 4:
                hf hfVar2 = chatActivityEnterView.F0;
                String obj2 = hfVar2 != null ? hfVar2.getText().toString() : "";
                int indexOf = obj2.indexOf(32);
                if (indexOf != -1 && indexOf != obj2.length() - 1) {
                    chatActivityEnterView.setFieldText(obj2.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 5:
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var == null || dg0Var.u0) {
                    AnimatorSet animatorSet = chatActivityEnterView.j3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.g0 == null) {
                        chatActivityEnterView.w1();
                        break;
                    }
                }
                break;
            case 6:
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    mgVar2.z0();
                    break;
                }
                break;
            case 7:
                int i26 = ChatActivityEnterView.s7;
                if (chatActivityEnterView.R2 != null) {
                    if (chatActivityEnterView.d0 - chatActivityEnterView.e0 >= 0) {
                        ig C = chatActivityEnterView.C();
                        chatActivityEnterView.S2 = C;
                        kg.z d = kg.z.d(chatActivityEnterView.R);
                        String str = chatActivityEnterView.R2.link;
                        String str2 = C.a;
                        ArrayList<TLRPC.MessageEntity> arrayList3 = C.b;
                        dd ddVar = new dd(chatActivityEnterView, 29);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList3;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, ddVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.c0.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 8:
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.a4) {
                    if (!chatActivityEnterView.p3 || (hfVar = chatActivityEnterView.F0) == null || !hfVar.isFocused()) {
                        if (chatActivityEnterView.p4) {
                            if (chatActivityEnterView.H2 != 0) {
                                chatActivityEnterView.R1(0, true);
                                chatActivityEnterView.V0.t(true);
                                chatActivityEnterView.V0.A();
                                if (chatActivityEnterView.o4) {
                                    chatActivityEnterView.P(true);
                                }
                            } else if (!chatActivityEnterView.u4 && (egVar = chatActivityEnterView.V0) != null) {
                                egVar.P(false);
                            }
                        } else if (!chatActivityEnterView.u4) {
                            chatActivityEnterView.V0.P(true);
                        }
                        if (!chatActivityEnterView.u4) {
                            chatActivityEnterView.S1(!chatActivityEnterView.p4, true, false, true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                int i27 = ChatActivityEnterView.s7;
                if (chatActivityEnterView.i0() && chatActivityEnterView.v3 && (recordCircle = chatActivityEnterView.D2) != null && ChatActivityEnterView.this.i5) {
                    chatActivityEnterView.n0(false, false);
                    ai.l0 l0Var = chatActivityEnterView.j1;
                    if (l0Var == null || !l0Var.n()) {
                        ai.l0 l0Var2 = chatActivityEnterView.j1;
                        if (l0Var2 != null && l0Var2.m()) {
                            hf hfVar3 = chatActivityEnterView.F0;
                            if (hfVar3 != null) {
                                hfVar3.setText("");
                            }
                            chatActivityEnterView.j1.j();
                        }
                    } else {
                        ai.l0 l0Var3 = chatActivityEnterView.j1;
                        if (l0Var3.o0 && l0Var3.n()) {
                            l0Var3.q();
                        }
                    }
                    if (chatActivityEnterView.v3) {
                        chatActivityEnterView.v3 = false;
                        chatActivityEnterView.Y1 = 0L;
                        chatActivityEnterView.u2(2, true);
                        break;
                    }
                }
                break;
            case 10:
                AnimatorSet animatorSet2 = chatActivityEnterView.j3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView.S1;
                    int[] iArr3 = chatActivityEnterView.R1;
                    if (!chatActivityEnterView.K1 || chatActivityEnterView.U1 || (zi0Var = chatActivityEnterView.i1) == null || chatActivityEnterView.R3 == null || zi0Var.getVisibility() != 0 || chatActivityEnterView.i1.getWidth() <= 0 || (qh0Var = chatActivityEnterView.h1) == null) {
                        chatActivityEnterView.t1();
                        break;
                    } else if (chatActivityEnterView.i1.T0 == null) {
                        qh0Var.getLocationInWindow(iArr3);
                        chatActivityEnterView.i1.getLocationInWindow(iArr2);
                        float width = (chatActivityEnterView.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                        float height = ((chatActivityEnterView.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - org.telegram.messenger.g0.L(3.0f);
                        TLRPC.TL_document tL_document = chatActivityEnterView.R3;
                        chatActivityEnterView.z5 = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.ah(i17, chatActivityEnterView, tL_document), 100L);
                        try {
                            chatActivityEnterView.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        qg qgVar = chatActivityEnterView.E2;
                        if (qgVar != null) {
                            qgVar.invalidate();
                        }
                        chatActivityEnterView.E5 = 0.0f;
                        chatActivityEnterView.D5 = 0.0f;
                        ValueAnimator valueAnimator = chatActivityEnterView.C5;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.C5 = ofFloat;
                        ofFloat.setDuration(160L);
                        chatActivityEnterView.C5.setInterpolator(kr.g);
                        chatActivityEnterView.C5.addUpdateListener(new pd(chatActivityEnterView, 9));
                        chatActivityEnterView.C5.start();
                        zi0 zi0Var2 = chatActivityEnterView.i1;
                        we weVar = new we(chatActivityEnterView);
                        xu0 xu0Var = zi0Var2.J0;
                        RectF rectF = zi0Var2.f0;
                        if (zi0Var2.T0 == null && !zi0Var2.X0) {
                            int width2 = zi0Var2.getWidth();
                            int height2 = zi0Var2.getHeight();
                            if (!zi0Var2.d0 || width2 <= 0 || height2 <= 0) {
                                weVar.a();
                                break;
                            } else {
                                zi0Var2.setPlaying(false);
                                zi0Var2.p0 = false;
                                zi0Var2.W = false;
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                    float f11 = width2;
                                    rectF.set(0.0f, 0.0f, f11, height2);
                                    zi0Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                    int[] iArr4 = new int[width2 * height2];
                                    createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                    int i28 = width2;
                                    int i29 = height2;
                                    zi0Var2.a1 = zi0Var2.f();
                                    zi0Var2.Z0 = width < f11 / 2.0f;
                                    int max = Math.max(1, Math.round(org.telegram.messenger.g0.p * 0.75f));
                                    int i30 = 0;
                                    int i31 = 0;
                                    int i32 = 0;
                                    while (i30 < i29) {
                                        while (i19 < i28) {
                                            int i33 = iArr4[(i30 * i28) + i19];
                                            int i34 = i19;
                                            int i35 = i30;
                                            if ((i33 >>> 24) > 60) {
                                                if (zi0Var2.e(i33)) {
                                                    i31++;
                                                } else {
                                                    i32++;
                                                }
                                            }
                                            i19 = i34 + max;
                                            i30 = i35;
                                        }
                                        i30 += max;
                                        i19 = 0;
                                    }
                                    float f12 = i31 > 1100 ? 1100.0f / i31 : 1.0f;
                                    float min = i32 > 0 ? Math.min(1.0f, 360.0f / i32) : 0.0f;
                                    xu0Var.a();
                                    xu0Var.S = 0.0f;
                                    xu0Var.R = 0.0f;
                                    xu0Var.e(zi0Var2.a1);
                                    float f13 = org.telegram.messenger.g0.p;
                                    int i36 = 0;
                                    int i37 = 0;
                                    int i38 = 0;
                                    while (i36 < i29) {
                                        float f14 = f12;
                                        int i39 = 0;
                                        while (i39 < i28) {
                                            int i40 = i28;
                                            int i41 = iArr4[(i36 * i28) + i39];
                                            float f15 = min;
                                            int i42 = i29;
                                            if ((i41 >>> 24) > 60) {
                                                i38++;
                                                int i43 = i38 * 7;
                                                if (zi0.c(i43 + 3) <= (zi0Var2.e(i41) ? f14 : f15)) {
                                                    float f16 = zi0Var2.Z0 ? i39 / f11 : 1.0f - (i39 / f11);
                                                    float c11 = (((zi0.c(i43 + 13) * 0.04f) + (0.42f * f16)) * 760.0f) / 1000.0f;
                                                    float c12 = zi0.c(i43 + 11);
                                                    float c13 = zi0.c(i43 + 12);
                                                    float f17 = i39;
                                                    i12 = i39;
                                                    float f18 = c12 - 0.5f;
                                                    float f19 = max;
                                                    i13 = max;
                                                    float f20 = (f18 * f19) + f17;
                                                    float f21 = c13 - 0.5f;
                                                    i14 = i36;
                                                    float f22 = (f21 * f19) + i36;
                                                    f10 = f11;
                                                    zi0Var2.J0.i(f20, f22, org.telegram.ui.Cells.c0.g(c12, 0.25f, 0.25f, width - f20, f20), Math.min(f22, height) - (((zi0.c(i43 + 14) * 9.0f) + 3.0f) * f13), com.google.android.gms.internal.vision.e2.x(f21, 4.0f, f13, width), com.google.android.gms.internal.vision.e2.x(f18, 4.0f, f13, height), com.google.android.gms.internal.vision.e2.B(f16, 0.3f, 0.8f, (zi0.c(i43 + 15) * 0.2f) + 0.45f), c11);
                                                    i37++;
                                                    i39 = i12 + i13;
                                                    f11 = f10;
                                                    min = f15;
                                                    i28 = i40;
                                                    i36 = i14;
                                                    i29 = i42;
                                                    max = i13;
                                                }
                                            }
                                            i12 = i39;
                                            i13 = max;
                                            i14 = i36;
                                            f10 = f11;
                                            i39 = i12 + i13;
                                            f11 = f10;
                                            min = f15;
                                            i28 = i40;
                                            i36 = i14;
                                            i29 = i42;
                                            max = i13;
                                        }
                                        i36 += max;
                                        f12 = f14;
                                    }
                                    zi0Var2.T0 = createBitmap;
                                    zi0Var2.U0 = i37;
                                    zi0Var2.W0 = weVar;
                                    zi0Var2.V0 = SystemClock.uptimeMillis();
                                    zi0Var2.invalidate();
                                    break;
                                } catch (Throwable unused4) {
                                    weVar.a();
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                ki.y yVar = chatActivityEnterView.m0;
                boolean z12 = yVar.w;
                yVar.setOpened(!z12);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView.H0()) {
                    if (!z12) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.n1();
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 27), 275L);
                            chatActivityEnterView.L0(false);
                            break;
                        }
                    }
                } else if (z12) {
                    ff ffVar = chatActivityEnterView.n0;
                    if (ffVar != null) {
                        ffVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.n0 == null) {
                        ff ffVar2 = new ff(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.n0 = ffVar2;
                        di.b1 b1Var = ffVar2.c;
                        chatActivityEnterView.getContext();
                        b1Var.setLayoutManager(new v4.c0());
                        ?? r12 = chatActivityEnterView.n0.c;
                        ki.x xVar = new ki.x();
                        xVar.c = new ArrayList();
                        xVar.d = new ArrayList();
                        xVar.e = new ArrayList();
                        chatActivityEnterView.o0 = xVar;
                        r12.setAdapter(xVar);
                        chatActivityEnterView.n0.c.setOnItemClickListener(new gf(chatActivityEnterView));
                        chatActivityEnterView.n0.c.setOnItemLongClickListener(new we(chatActivityEnterView));
                        chatActivityEnterView.n0.setClipToPadding(false);
                        chatActivityEnterView.c2.addView(chatActivityEnterView.n0, c8.na.e(-1, -1, 80));
                        chatActivityEnterView.n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.Y6;
                        if (hVar != null) {
                            chatActivityEnterView.o0.E(hVar);
                        }
                        chatActivityEnterView.l2();
                    }
                    ff ffVar3 = chatActivityEnterView.n0;
                    if (ffVar3.getVisibility() != 0) {
                        ffVar3.setVisibility(0);
                        ffVar3.c.v0(0);
                        ffVar3.n = true;
                        ffVar3.f = false;
                        break;
                    } else if (ffVar3.f) {
                        ffVar3.f = false;
                        ffVar3.a();
                        ffVar3.d(false);
                        break;
                    }
                }
                break;
            case 12:
                if (chatActivityEnterView.r7 == 3 && (mgVar = chatActivityEnterView.P3) != null) {
                    mgVar.w1();
                    break;
                }
                break;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit();
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                if (org.telegram.messenger.v1.d(bnVar2.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + bnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + bnVar2.a(), false);
                }
                if (org.telegram.messenger.mp.u1(chatActivityEnterView.R).y7 && org.telegram.messenger.mp.u1(chatActivityEnterView.R).z7) {
                    edit.putBoolean("show_gift_for_" + bnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).d2(org.telegram.messenger.i10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().s8 == null || !chatActivityEnterView.getParentFragment().s8.display_gifts_button) && (d2 == null || !d2.display_gifts_button)) {
                    org.telegram.messenger.g0.V3(chatActivityEnterView.A2, false);
                }
                TLRPC.User j12 = chatActivityEnterView.getParentFragment().j();
                if (j12 != null) {
                    if (chatActivityEnterView.getParentFragment().s8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().s8.birthday)) {
                        z11 = true;
                    }
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, chatActivityEnterView.getContext(), null);
                    t1Var.r(200L);
                    t1Var.setOnCancelListener(new di.z(chatActivityEnterView, wg.r.j(chatActivityEnterView.R, null, new fi.w2(chatActivityEnterView, t1Var, j12, z11)), i16));
                    break;
                }
                break;
            case 14:
                int i44 = ChatActivityEnterView.s7;
                chatActivityEnterView.l1();
                break;
            case 15:
                mg mgVar3 = chatActivityEnterView.P3;
                if (mgVar3 != null && !mgVar3.j()) {
                    ?? r13 = chatActivityEnterView.P3;
                    ug ugVar = chatActivityEnterView.G0;
                    r13.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.c).getText(), true);
                    break;
                }
                break;
            case 16:
                df dfVar = chatActivityEnterView.O0;
                if (dfVar != null && dfVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                b5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new ke(chatActivityEnterView, i20), chatActivityEnterView.M4);
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                df dfVar2 = chatActivityEnterView3.O0;
                if (dfVar2 != null && dfVar2.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.x1(true, 2147483646, 0, 0L, true);
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                df dfVar3 = chatActivityEnterView4.O0;
                if (dfVar3 != null && dfVar3.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.x1(false, 0, 0, 0L, true);
                break;
            case 19:
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.R1(0, false);
                    chatActivityEnterView.V0.t(false);
                    hf hfVar4 = chatActivityEnterView.F0;
                    if (hfVar4 != null) {
                        hfVar4.requestFocus();
                    }
                }
                if (chatActivityEnterView.d3 != null) {
                    if (!chatActivityEnterView.T0() || chatActivityEnterView.V2 != 1) {
                        chatActivityEnterView.Z1(1, 1, true, true);
                    } else if (chatActivityEnterView.T0() && chatActivityEnterView.V2 == 1) {
                        chatActivityEnterView.Z1(0, 1, true, false);
                    }
                } else if (chatActivityEnterView.f3) {
                    chatActivityEnterView.setFieldText("/");
                    hf hfVar5 = chatActivityEnterView.F0;
                    if (hfVar5 != null) {
                        hfVar5.requestFocus();
                    }
                    chatActivityEnterView.j1();
                }
                if (chatActivityEnterView.p4) {
                    chatActivityEnterView.S1(false, false, false, true);
                    break;
                }
                break;
            case 20:
                int i45 = ChatActivityEnterView.s7;
                chatActivityEnterView.u0();
                break;
            default:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
                ge geVar = chatActivityEnterView.R0;
                if (!chatActivityEnterView.o0()) {
                    org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.V;
                    if (i1Var3 == null || !i1Var3.f) {
                        if (geVar.x) {
                            x60 x60Var = chatActivityEnterView.V6;
                            if (x60Var != null) {
                                x60Var.v();
                                chatActivityEnterView.V6 = null;
                                break;
                            } else {
                                hf hfVar6 = chatActivityEnterView.F0;
                                if (hfVar6 != null && bnVar3 != null) {
                                    hfVar6.m();
                                    ?? r32 = chatActivityEnterView.c2;
                                    x60 x60Var2 = new x60(r32 != null ? r32 : chatActivityEnterView, chatActivityEnterView.M4, geVar, false, false, true);
                                    x60Var2.a0 = org.telegram.messenger.g0.L(280.0f);
                                    org.telegram.ui.bn.C8(new t90(x60Var2, chatActivityEnterView.F0), bnVar3.h, true, true, true, true);
                                    x60Var2.X = true;
                                    x60Var2.p = new org.telegram.ui.ah(i18, chatActivityEnterView, x60Var2);
                                    chatActivityEnterView.V6 = x60Var2;
                                    x60Var2.a0();
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.B0) {
                            chatActivityEnterView.a2();
                            break;
                        } else if (!chatActivityEnterView.T0() || chatActivityEnterView.V2 != 0) {
                            chatActivityEnterView.Z1(1, 0, true, true);
                            eg egVar2 = chatActivityEnterView.V0;
                            hf hfVar7 = chatActivityEnterView.F0;
                            boolean z13 = hfVar7 != null && hfVar7.length() > 0;
                            if (bnVar3 != null) {
                                hi.u3 u3Var = bnVar3.N1;
                                if (u3Var != null) {
                                    if (u3Var.W) {
                                        u3Var.f(true);
                                    }
                                    r52 = true;
                                } else {
                                    r52 = false;
                                }
                                bnVar3.N1 = null;
                                if (r52 != false) {
                                    z10 = true;
                                }
                            }
                            egVar2.C(z13, z10);
                            break;
                        } else {
                            if (chatActivityEnterView.H2 != 0) {
                                chatActivityEnterView.R1(0, true);
                                eg egVar3 = chatActivityEnterView.V0;
                                if (egVar3 != null) {
                                    egVar3.t(false);
                                }
                                hf hfVar8 = chatActivityEnterView.F0;
                                if (hfVar8 != null) {
                                    hfVar8.requestFocus();
                                }
                            }
                            if (chatActivityEnterView.p4) {
                                chatActivityEnterView.S1(false, true, false, true);
                                chatActivityEnterView.b4 = true;
                                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 28), 200L);
                                break;
                            } else {
                                chatActivityEnterView.k1();
                                break;
                            }
                        }
                    }
                } else if (chatActivityEnterView.D6 == null) {
                    chatActivityEnterView.E6 = true;
                    float f23 = chatActivityEnterView.B0 ? 0.5f : 1.0f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    chatActivityEnterView.D6 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.rf(chatActivityEnterView, f23, 2));
                    chatActivityEnterView.D6.addListener(new org.telegram.ui.ActionBar.s0(chatActivityEnterView, f23, 5));
                    chatActivityEnterView.D6.setDuration(180L);
                    chatActivityEnterView.D6.setInterpolator(kr.i);
                    chatActivityEnterView.D6.start();
                    break;
                }
                break;
        }
    }
}
