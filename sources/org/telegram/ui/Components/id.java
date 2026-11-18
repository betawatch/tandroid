package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i7;
        int i10;
        int i11;
        cg cgVar;
        gf gfVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        xi0 xi0Var;
        ph0 ph0Var;
        int i12;
        int i13;
        int i14;
        float f10;
        kg kgVar;
        boolean z10;
        int i15 = this.a;
        int i16 = 4;
        boolean z11 = false;
        int i17 = 2;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i15) {
            case 0:
                org.telegram.ui.ActionBar.j1 j1Var = chatActivityEnterView.V;
                if ((j1Var == null || !j1Var.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.N3.n1();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.j1 j1Var2 = chatActivityEnterView.V;
                if ((j1Var2 == null || !j1Var2.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.N3.B2();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.bn bnVar = chatActivityEnterView2.D3;
                if (!chatActivityEnterView2.k7 ? chatActivityEnterView2.getTranslationY() == 0.0f : !chatActivityEnterView2.O0()) {
                    if (chatActivityEnterView2.N3.n() > org.telegram.messenger.g0.L(20.0f)) {
                        int b12 = chatActivityEnterView2.N3.b1();
                        int n10 = chatActivityEnterView2.N3.n();
                        if (n10 <= org.telegram.messenger.g0.L(20.0f)) {
                            b12 += n10;
                        }
                        if (chatActivityEnterView2.X0) {
                            b12 -= chatActivityEnterView2.getEmojiPadding();
                        }
                        if (b12 < org.telegram.messenger.g0.L(200.0f)) {
                            chatActivityEnterView2.v0 = new dd(chatActivityEnterView2, 7);
                            chatActivityEnterView2.U();
                            break;
                        }
                    }
                    if (chatActivityEnterView2.N3.J() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        xe xeVar = chatActivityEnterView2.r0;
                        if (xeVar != null) {
                            xeVar.e = false;
                            xeVar.l(new r1.g[0]);
                            break;
                        } else {
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R);
                            if (chatActivityEnterView2.k7) {
                                peer = chatActivityEnterView2.N3.t();
                            } else {
                                org.telegram.messenger.mp.u1(chatActivityEnterView2.R).O0(Long.valueOf(-chatActivityEnterView2.E3));
                                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R).P0(-chatActivityEnterView2.E3);
                                r14 = P0;
                                peer = P0 != 0 ? P0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView2.N3.J() != null && !chatActivityEnterView2.N3.J().peers.isEmpty()) {
                                peer = chatActivityEnterView2.N3.J().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.v3.V(u12.O0(Long.valueOf(-chatActivityEnterView2.E3)));
                            if (chatActivityEnterView2.k7) {
                            } else {
                                bnVar.getParentLayout().getOverlayContainerView();
                            }
                            xe xeVar2 = new xe(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.D3, u12, V, peer2, chatActivityEnterView2.N3.J(), new a3.h(chatActivityEnterView2, r14, u12, 24), chatActivityEnterView2.K4);
                            chatActivityEnterView2.r0 = xeVar2;
                            xeVar2.e = true;
                            xeVar2.c = org.telegram.messenger.ks.x3;
                            xeVar2.setOutsideTouchable(true);
                            chatActivityEnterView2.r0.setClippingEnabled(true);
                            chatActivityEnterView2.r0.setFocusable(true);
                            chatActivityEnterView2.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView2.r0.setInputMethodMode(2);
                            chatActivityEnterView2.r0.setSoftInputMode(0);
                            chatActivityEnterView2.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView2.r0.b = false;
                            int i18 = -org.telegram.messenger.g0.L(4.0f);
                            int[] iArr = new int[2];
                            if (!org.telegram.messenger.g0.Q1() || bnVar == null) {
                                i7 = i18;
                            } else {
                                bnVar.getFragmentView().getLocationInWindow(iArr);
                                i7 = iArr[0] + i18;
                            }
                            int b13 = chatActivityEnterView2.N3.b1();
                            int measuredHeight = chatActivityEnterView2.r0.getContentView().getMeasuredHeight();
                            int n11 = chatActivityEnterView2.N3.n();
                            if (n11 <= org.telegram.messenger.g0.L(20.0f)) {
                                b13 += n11;
                            }
                            if (chatActivityEnterView2.X0) {
                                b13 -= chatActivityEnterView2.getEmojiPadding();
                            }
                            org.telegram.messenger.g0.L(1.0f);
                            if (measuredHeight < (((i18 * 2) + b13) - ((bnVar == null || !bnVar.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0)) - chatActivityEnterView2.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView2.getLocationInWindow(iArr);
                                i10 = ((iArr[1] - measuredHeight) - i18) - org.telegram.messenger.g0.L(2.0f);
                            } else {
                                int i19 = (bnVar == null || !bnVar.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0;
                                chatActivityEnterView2.r0.o.getLayoutParams().height = ((b13 - i19) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                                i10 = i19;
                            }
                            xe xeVar3 = chatActivityEnterView2.r0;
                            View view2 = xeVar3.u;
                            ck0 ck0Var = xeVar3.v;
                            TLRPC.Peer peer3 = xeVar3.r;
                            in0 in0Var = xeVar3.o;
                            bi.a3 a3Var = xeVar3.t;
                            ArrayList arrayList = xeVar3.z;
                            int size = arrayList.size();
                            int i20 = 0;
                            while (i20 < size) {
                                Object obj = arrayList.get(i20);
                                i20++;
                                ((r1.g) obj).d();
                            }
                            arrayList.clear();
                            a3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                            a3Var.setPivotY(a3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                            in0Var.setPivotX(0.0f);
                            in0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = xeVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.g0.L(54.0f);
                                int size2 = arrayList2.size() * L;
                                i11 = 2;
                                int i21 = 0;
                                while (i21 < arrayList2.size()) {
                                    TLRPC.Peer peer4 = arrayList2.get(i21).peer;
                                    View view3 = view2;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = arrayList2;
                                    long j3 = peer4.channel_id;
                                    if (j3 == 0 || j3 != peer3.channel_id) {
                                        long j10 = peer4.user_id;
                                        if (j10 == 0 || j10 != peer3.user_id) {
                                            long j11 = peer4.chat_id;
                                            if (j11 == 0 || j11 != peer3.chat_id) {
                                                i21++;
                                                view2 = view3;
                                                arrayList2 = arrayList3;
                                            }
                                        }
                                    }
                                    xeVar3.w.h1(i21, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + ((i21 == arrayList3.size() + (-1) || ck0Var.getMeasuredHeight() >= size2) ? 0 : ck0Var.getMeasuredHeight() % L));
                                    if (ck0Var.computeVerticalScrollOffset() > 0) {
                                        view3.animate().cancel();
                                        view3.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            } else {
                                i11 = 2;
                            }
                            a3Var.setScaleX(0.25f);
                            a3Var.setScaleY(0.25f);
                            in0Var.setAlpha(0.25f);
                            r1.g gVar = new r1.g(a3Var, r1.g.q);
                            gVar.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            gVar.b(new en0(xeVar3, i11));
                            r1.g gVar2 = new r1.g(a3Var, r1.g.r);
                            gVar2.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            gVar2.b(new en0(xeVar3, 3));
                            r1.b bVar = r1.g.v;
                            r1.g gVar3 = new r1.g(a3Var, bVar);
                            gVar3.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            r1.g gVar4 = new r1.g(in0Var, bVar);
                            gVar4.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                                arrayList.add(gVar5);
                                gVar5.a(new fn0(xeVar3, gVar5, 1));
                                gVar5.h();
                            }
                            xe xeVar4 = chatActivityEnterView2.r0;
                            chatActivityEnterView2.t0 = i7;
                            chatActivityEnterView2.u0 = i10;
                            xeVar4.showAtLocation(view, 51, i7, i10);
                            chatActivityEnterView2.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView2.s0 = new dd(chatActivityEnterView2, 6);
                    if (chatActivityEnterView2.k7) {
                        chatActivityEnterView2.H0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView2.H0(true, true, true);
                        break;
                    }
                }
                break;
            case 3:
                int i22 = ChatActivityEnterView.n7;
                chatActivityEnterView.g1();
                break;
            case 4:
                gf gfVar2 = chatActivityEnterView.F0;
                String obj2 = gfVar2 != null ? gfVar2.getText().toString() : "";
                int indexOf = obj2.indexOf(32);
                if (indexOf != -1 && indexOf != obj2.length() - 1) {
                    chatActivityEnterView.setFieldText(obj2.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
                break;
            case 5:
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var == null || eg0Var.u0) {
                    AnimatorSet animatorSet = chatActivityEnterView.h3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.g0 == null) {
                        chatActivityEnterView.r1();
                        break;
                    }
                }
                break;
            case 6:
                kg kgVar2 = chatActivityEnterView.N3;
                if (kgVar2 != null) {
                    kgVar2.J0();
                    break;
                }
                break;
            case 7:
                int i23 = ChatActivityEnterView.n7;
                if (chatActivityEnterView.P2 != null) {
                    if (chatActivityEnterView.d0 - chatActivityEnterView.e0 >= 0) {
                        gg C = chatActivityEnterView.C();
                        chatActivityEnterView.Q2 = C;
                        kg.y d = kg.y.d(chatActivityEnterView.R);
                        String str = chatActivityEnterView.P2.link;
                        String str2 = C.a;
                        ArrayList<TLRPC.MessageEntity> arrayList4 = C.b;
                        dd ddVar = new dd(chatActivityEnterView, 29);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList4;
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
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.Y3) {
                    if (!chatActivityEnterView.n3 || (gfVar = chatActivityEnterView.F0) == null || !gfVar.isFocused()) {
                        if (chatActivityEnterView.n4) {
                            if (chatActivityEnterView.F2 != 0) {
                                chatActivityEnterView.L1(0, true);
                                chatActivityEnterView.V0.t(true);
                                chatActivityEnterView.V0.A();
                                if (chatActivityEnterView.m4) {
                                    chatActivityEnterView.P(true);
                                }
                            } else if (!chatActivityEnterView.s4 && (cgVar = chatActivityEnterView.V0) != null) {
                                cgVar.P(false);
                            }
                        } else if (!chatActivityEnterView.s4) {
                            chatActivityEnterView.V0.P(true);
                        }
                        if (!chatActivityEnterView.s4) {
                            chatActivityEnterView.M1(!chatActivityEnterView.n4, true, false, true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (chatActivityEnterView.l1 && chatActivityEnterView.t3 && (recordCircle = chatActivityEnterView.B2) != null && ChatActivityEnterView.this.g5) {
                    chatActivityEnterView.l0(false, false);
                    ai.n0 n0Var = chatActivityEnterView.j1;
                    if (n0Var == null || !n0Var.o()) {
                        ai.n0 n0Var2 = chatActivityEnterView.j1;
                        if (n0Var2 != null && n0Var2.n()) {
                            gf gfVar3 = chatActivityEnterView.F0;
                            if (gfVar3 != null) {
                                gfVar3.setText("");
                            }
                            chatActivityEnterView.j1.j();
                        }
                    } else {
                        ai.n0 n0Var3 = chatActivityEnterView.j1;
                        if (n0Var3.o0 && n0Var3.o()) {
                            n0Var3.r();
                        }
                    }
                    if (chatActivityEnterView.t3) {
                        chatActivityEnterView.t3 = false;
                        chatActivityEnterView.W1 = 0L;
                        chatActivityEnterView.o2(2, true);
                        break;
                    }
                }
                break;
            case 10:
                AnimatorSet animatorSet2 = chatActivityEnterView.h3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView.Q1;
                    int[] iArr3 = chatActivityEnterView.P1;
                    if (!chatActivityEnterView.I1 || chatActivityEnterView.S1 || (xi0Var = chatActivityEnterView.i1) == null || chatActivityEnterView.P3 == null || xi0Var.getVisibility() != 0 || chatActivityEnterView.i1.getWidth() <= 0 || (ph0Var = chatActivityEnterView.h1) == null) {
                        chatActivityEnterView.o1();
                        break;
                    } else if (chatActivityEnterView.i1.T0 == null) {
                        ph0Var.getLocationInWindow(iArr3);
                        chatActivityEnterView.i1.getLocationInWindow(iArr2);
                        float width = (chatActivityEnterView.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                        float height = ((chatActivityEnterView.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - org.telegram.messenger.g0.L(3.0f);
                        TLRPC.TL_document tL_document = chatActivityEnterView.P3;
                        chatActivityEnterView.x5 = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.ci(24, chatActivityEnterView, tL_document), 100L);
                        try {
                            chatActivityEnterView.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        pg pgVar = chatActivityEnterView.C2;
                        if (pgVar != null) {
                            pgVar.invalidate();
                        }
                        chatActivityEnterView.C5 = 0.0f;
                        chatActivityEnterView.B5 = 0.0f;
                        ValueAnimator valueAnimator = chatActivityEnterView.A5;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.A5 = ofFloat;
                        ofFloat.setDuration(160L);
                        chatActivityEnterView.A5.setInterpolator(lr.g);
                        chatActivityEnterView.A5.addUpdateListener(new pd(chatActivityEnterView, 9));
                        chatActivityEnterView.A5.start();
                        xi0 xi0Var2 = chatActivityEnterView.i1;
                        ve veVar = new ve(chatActivityEnterView);
                        vu0 vu0Var = xi0Var2.J0;
                        RectF rectF = xi0Var2.f0;
                        if (xi0Var2.T0 == null && !xi0Var2.X0) {
                            int width2 = xi0Var2.getWidth();
                            int height2 = xi0Var2.getHeight();
                            if (!xi0Var2.d0 || width2 <= 0 || height2 <= 0) {
                                veVar.a();
                                break;
                            } else {
                                xi0Var2.setPlaying(false);
                                xi0Var2.p0 = false;
                                xi0Var2.W = false;
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                    float f11 = width2;
                                    rectF.set(0.0f, 0.0f, f11, height2);
                                    xi0Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                    int[] iArr4 = new int[width2 * height2];
                                    createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                    int i24 = width2;
                                    int i25 = height2;
                                    xi0Var2.a1 = xi0Var2.f();
                                    xi0Var2.Z0 = width < f11 / 2.0f;
                                    int max = Math.max(1, Math.round(org.telegram.messenger.g0.p * 0.75f));
                                    int i26 = 0;
                                    int i27 = 0;
                                    int i28 = 0;
                                    while (i26 < i25) {
                                        int i29 = 0;
                                        while (i29 < i24) {
                                            int i30 = iArr4[(i26 * i24) + i29];
                                            int i31 = i29;
                                            int i32 = i26;
                                            if ((i30 >>> 24) > 60) {
                                                if (xi0Var2.e(i30)) {
                                                    i27++;
                                                } else {
                                                    i28++;
                                                }
                                            }
                                            i29 = i31 + max;
                                            i26 = i32;
                                        }
                                        i26 += max;
                                    }
                                    float f12 = i27 > 1100 ? 1100.0f / i27 : 1.0f;
                                    float min = i28 > 0 ? Math.min(1.0f, 360.0f / i28) : 0.0f;
                                    vu0Var.a();
                                    vu0Var.S = 0.0f;
                                    vu0Var.R = 0.0f;
                                    vu0Var.e(xi0Var2.a1);
                                    float f13 = org.telegram.messenger.g0.p;
                                    int i33 = 0;
                                    int i34 = 0;
                                    int i35 = 0;
                                    while (i33 < i25) {
                                        float f14 = f12;
                                        int i36 = 0;
                                        while (i36 < i24) {
                                            int i37 = i24;
                                            int i38 = iArr4[(i33 * i24) + i36];
                                            int i39 = i25;
                                            float f15 = min;
                                            if ((i38 >>> 24) > 60) {
                                                i35++;
                                                int i40 = i35 * 7;
                                                if (xi0.c(i40 + 3) <= (xi0Var2.e(i38) ? f14 : f15)) {
                                                    float f16 = xi0Var2.Z0 ? i36 / f11 : 1.0f - (i36 / f11);
                                                    float c11 = (((xi0.c(i40 + 13) * 0.04f) + (0.42f * f16)) * 760.0f) / 1000.0f;
                                                    float c12 = xi0.c(i40 + 11);
                                                    float c13 = xi0.c(i40 + 12);
                                                    float f17 = i36;
                                                    i12 = i36;
                                                    float f18 = c12 - 0.5f;
                                                    float f19 = max;
                                                    i13 = max;
                                                    float f20 = (f18 * f19) + f17;
                                                    float f21 = c13 - 0.5f;
                                                    i14 = i33;
                                                    float f22 = (f21 * f19) + i33;
                                                    f10 = f11;
                                                    xi0Var2.J0.i(f20, f22, org.telegram.ui.Cells.c0.g(c12, 0.25f, 0.25f, width - f20, f20), Math.min(f22, height) - (((xi0.c(i40 + 14) * 9.0f) + 3.0f) * f13), com.google.android.gms.internal.vision.e2.x(f21, 4.0f, f13, width), com.google.android.gms.internal.vision.e2.x(f18, 4.0f, f13, height), com.google.android.gms.internal.vision.e2.B(f16, 0.3f, 0.8f, (xi0.c(i40 + 15) * 0.2f) + 0.45f), c11);
                                                    i34++;
                                                    i36 = i12 + i13;
                                                    min = f15;
                                                    i24 = i37;
                                                    i33 = i14;
                                                    i25 = i39;
                                                    max = i13;
                                                    f11 = f10;
                                                }
                                            }
                                            i12 = i36;
                                            i13 = max;
                                            i14 = i33;
                                            f10 = f11;
                                            i36 = i12 + i13;
                                            min = f15;
                                            i24 = i37;
                                            i33 = i14;
                                            i25 = i39;
                                            max = i13;
                                            f11 = f10;
                                        }
                                        i33 += max;
                                        f12 = f14;
                                    }
                                    xi0Var2.T0 = createBitmap;
                                    xi0Var2.U0 = i34;
                                    xi0Var2.W0 = veVar;
                                    xi0Var2.V0 = SystemClock.uptimeMillis();
                                    xi0Var2.invalidate();
                                    break;
                                } catch (Throwable unused4) {
                                    veVar.a();
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                ki.z zVar = chatActivityEnterView.m0;
                boolean z12 = zVar.w;
                zVar.setOpened(!z12);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView.D0()) {
                    if (!z12) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.i1();
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 27), 275L);
                            chatActivityEnterView.G0(false);
                            break;
                        }
                    }
                } else if (z12) {
                    ef efVar = chatActivityEnterView.n0;
                    if (efVar != null) {
                        efVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.n0 == null) {
                        ef efVar2 = new ef(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.n0 = efVar2;
                        di.b1 b1Var = efVar2.c;
                        chatActivityEnterView.getContext();
                        b1Var.setLayoutManager(new v4.c0());
                        di.b1 b1Var2 = chatActivityEnterView.n0.c;
                        ki.y yVar = new ki.y();
                        yVar.c = new ArrayList();
                        yVar.d = new ArrayList();
                        yVar.e = new ArrayList();
                        chatActivityEnterView.o0 = yVar;
                        b1Var2.setAdapter(yVar);
                        chatActivityEnterView.n0.c.setOnItemClickListener(new ff(chatActivityEnterView));
                        chatActivityEnterView.n0.c.setOnItemLongClickListener(new ve(chatActivityEnterView));
                        chatActivityEnterView.n0.setClipToPadding(false);
                        chatActivityEnterView.a2.addView(chatActivityEnterView.n0, c8.ma.e(-1, -1, 80));
                        chatActivityEnterView.n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.W6;
                        if (hVar != null) {
                            chatActivityEnterView.o0.E(hVar);
                        }
                        chatActivityEnterView.f2();
                    }
                    ef efVar3 = chatActivityEnterView.n0;
                    if (efVar3.getVisibility() != 0) {
                        efVar3.setVisibility(0);
                        efVar3.c.v0(0);
                        efVar3.n = true;
                        efVar3.f = false;
                        break;
                    } else if (efVar3.f) {
                        efVar3.f = false;
                        efVar3.a();
                        efVar3.d(false);
                        break;
                    }
                }
                break;
            case 12:
                if (chatActivityEnterView.m7 == 3 && (kgVar = chatActivityEnterView.N3) != null) {
                    kgVar.w1();
                    break;
                }
                break;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit();
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
                if (org.telegram.messenger.v1.d(bnVar2.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + bnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + bnVar2.a(), false);
                }
                if (org.telegram.messenger.mp.u1(chatActivityEnterView.R).y7 && org.telegram.messenger.mp.u1(chatActivityEnterView.R).z7) {
                    edit.putBoolean("show_gift_for_" + bnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).d2(org.telegram.messenger.j10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().s8 == null || !chatActivityEnterView.getParentFragment().s8.display_gifts_button) && (d2 == null || !d2.display_gifts_button)) {
                    org.telegram.messenger.g0.V3(chatActivityEnterView.y2, false);
                }
                TLRPC.User j12 = chatActivityEnterView.getParentFragment().j();
                if (j12 != null) {
                    if (chatActivityEnterView.getParentFragment().s8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().s8.birthday)) {
                        z11 = true;
                    }
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, chatActivityEnterView.getContext(), null);
                    u1Var.r(200L);
                    u1Var.setOnCancelListener(new di.z(chatActivityEnterView, wg.s.j(chatActivityEnterView.R, null, new fi.w2(chatActivityEnterView, u1Var, j12, z11)), i16));
                    break;
                }
                break;
            case 14:
                int i41 = ChatActivityEnterView.n7;
                chatActivityEnterView.g1();
                break;
            case 15:
                kg kgVar3 = chatActivityEnterView.N3;
                if (kgVar3 != null && !kgVar3.k()) {
                    kg kgVar4 = chatActivityEnterView.N3;
                    tg tgVar = chatActivityEnterView.G0;
                    kgVar4.s1(tgVar, ((org.telegram.ui.ActionBar.n5) tgVar.c).getText(), true);
                    break;
                }
                break;
            case 16:
                cf cfVar = chatActivityEnterView.O0;
                if (cfVar != null && cfVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                b5.J(chatActivityEnterView.C3, chatActivityEnterView.D3.a(), new je(chatActivityEnterView, i17), chatActivityEnterView.K4);
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                cf cfVar2 = chatActivityEnterView3.O0;
                if (cfVar2 != null && cfVar2.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.s1(true, 2147483646, 0, 0L, true);
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                cf cfVar3 = chatActivityEnterView4.O0;
                if (cfVar3 != null && cfVar3.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.s1(false, 0, 0, 0L, true);
                break;
            case 19:
                if (chatActivityEnterView.F2 != 0) {
                    chatActivityEnterView.L1(0, false);
                    chatActivityEnterView.V0.t(false);
                    gf gfVar4 = chatActivityEnterView.F0;
                    if (gfVar4 != null) {
                        gfVar4.requestFocus();
                    }
                }
                if (chatActivityEnterView.b3 != null) {
                    if (!chatActivityEnterView.O0() || chatActivityEnterView.T2 != 1) {
                        chatActivityEnterView.T1(1, 1, true, true);
                    } else if (chatActivityEnterView.O0() && chatActivityEnterView.T2 == 1) {
                        chatActivityEnterView.T1(0, 1, true, false);
                    }
                } else if (chatActivityEnterView.d3) {
                    chatActivityEnterView.setFieldText("/");
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.requestFocus();
                    }
                    chatActivityEnterView.e1();
                }
                if (chatActivityEnterView.n4) {
                    chatActivityEnterView.M1(false, false, false, true);
                    break;
                }
                break;
            case 20:
                int i42 = ChatActivityEnterView.n7;
                chatActivityEnterView.q0();
                break;
            default:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.D3;
                fe feVar = chatActivityEnterView.R0;
                if (!chatActivityEnterView.m0()) {
                    org.telegram.ui.ActionBar.j1 j1Var3 = chatActivityEnterView.V;
                    if (j1Var3 == null || !j1Var3.f) {
                        if (feVar.x) {
                            y60 y60Var = chatActivityEnterView.T6;
                            if (y60Var != null) {
                                y60Var.v();
                                chatActivityEnterView.T6 = null;
                                break;
                            } else {
                                gf gfVar6 = chatActivityEnterView.F0;
                                if (gfVar6 != null && bnVar3 != null) {
                                    gfVar6.m();
                                    FrameLayout frameLayout = chatActivityEnterView.a2;
                                    y60 y60Var2 = new y60(frameLayout != null ? frameLayout : chatActivityEnterView, chatActivityEnterView.K4, feVar, false, false, true);
                                    y60Var2.a0 = org.telegram.messenger.g0.L(280.0f);
                                    org.telegram.ui.bn.C8(new u90(y60Var2, chatActivityEnterView.F0), bnVar3.h, true, true, true, true);
                                    y60Var2.X = true;
                                    y60Var2.p = new org.telegram.ui.ci(25, chatActivityEnterView, y60Var2);
                                    chatActivityEnterView.T6 = y60Var2;
                                    y60Var2.a0();
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.B0) {
                            chatActivityEnterView.U1();
                            break;
                        } else if (!chatActivityEnterView.O0() || chatActivityEnterView.T2 != 0) {
                            chatActivityEnterView.T1(1, 0, true, true);
                            cg cgVar2 = chatActivityEnterView.V0;
                            gf gfVar7 = chatActivityEnterView.F0;
                            boolean z13 = gfVar7 != null && gfVar7.length() > 0;
                            if (bnVar3 != null) {
                                hi.m3 m3Var = bnVar3.N1;
                                if (m3Var != null) {
                                    if (m3Var.W) {
                                        m3Var.f(true);
                                    }
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bnVar3.N1 = null;
                                if (z10) {
                                    z11 = true;
                                }
                            }
                            cgVar2.C(z13, z11);
                            break;
                        } else {
                            if (chatActivityEnterView.F2 != 0) {
                                chatActivityEnterView.L1(0, true);
                                cg cgVar3 = chatActivityEnterView.V0;
                                if (cgVar3 != null) {
                                    cgVar3.t(false);
                                }
                                gf gfVar8 = chatActivityEnterView.F0;
                                if (gfVar8 != null) {
                                    gfVar8.requestFocus();
                                }
                            }
                            if (chatActivityEnterView.n4) {
                                chatActivityEnterView.M1(false, true, false, true);
                                chatActivityEnterView.Z3 = true;
                                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 28), 200L);
                                break;
                            } else {
                                chatActivityEnterView.f1();
                                break;
                            }
                        }
                    }
                } else if (chatActivityEnterView.B6 == null) {
                    chatActivityEnterView.C6 = true;
                    float f23 = chatActivityEnterView.B0 ? 0.5f : 1.0f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    chatActivityEnterView.B6 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.rf(chatActivityEnterView, f23, 2));
                    chatActivityEnterView.B6.addListener(new org.telegram.ui.ActionBar.t0(chatActivityEnterView, f23, 5));
                    chatActivityEnterView.B6.setDuration(180L);
                    chatActivityEnterView.B6.setInterpolator(lr.i);
                    chatActivityEnterView.B6.start();
                    break;
                }
                break;
        }
    }
}
