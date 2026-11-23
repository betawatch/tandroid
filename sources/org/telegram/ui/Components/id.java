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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        fg fgVar;
        gf gfVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        zi0 zi0Var;
        rh0 rh0Var;
        int i12;
        int i13;
        int i14;
        float f10;
        ng ngVar;
        boolean z10;
        int i15 = this.a;
        int i16 = 4;
        int i17 = 27;
        boolean z11 = false;
        int i18 = 2;
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
                    chatActivityEnterView.P3.B2();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.bn bnVar = chatActivityEnterView2.F3;
                if (!chatActivityEnterView2.p7 ? chatActivityEnterView2.getTranslationY() == 0.0f : !chatActivityEnterView2.S0()) {
                    if (chatActivityEnterView2.P3.n() > org.telegram.messenger.g0.L(20.0f)) {
                        int b12 = chatActivityEnterView2.P3.b1();
                        int n10 = chatActivityEnterView2.P3.n();
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
                    if (chatActivityEnterView2.P3.J() != null) {
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
                            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(chatActivityEnterView2.R);
                            if (chatActivityEnterView2.p7) {
                                peer = chatActivityEnterView2.P3.t();
                            } else {
                                org.telegram.messenger.np.u1(chatActivityEnterView2.R).O0(Long.valueOf(-chatActivityEnterView2.G3));
                                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(chatActivityEnterView2.R).P0(-chatActivityEnterView2.G3);
                                r15 = P0;
                                peer = P0 != 0 ? P0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView2.P3.J() != null && !chatActivityEnterView2.P3.J().peers.isEmpty()) {
                                peer = chatActivityEnterView2.P3.J().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.v3.V(u12.O0(Long.valueOf(-chatActivityEnterView2.G3)));
                            if (chatActivityEnterView2.p7) {
                            } else {
                                bnVar.getParentLayout().getOverlayContainerView();
                            }
                            xe xeVar2 = new xe(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.F3, u12, V, peer2, chatActivityEnterView2.P3.J(), new a3.h(chatActivityEnterView2, r15, u12, 24), chatActivityEnterView2.M4);
                            chatActivityEnterView2.r0 = xeVar2;
                            xeVar2.e = true;
                            xeVar2.c = org.telegram.messenger.ls.x3;
                            xeVar2.setOutsideTouchable(true);
                            chatActivityEnterView2.r0.setClippingEnabled(true);
                            chatActivityEnterView2.r0.setFocusable(true);
                            chatActivityEnterView2.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView2.r0.setInputMethodMode(2);
                            chatActivityEnterView2.r0.setSoftInputMode(0);
                            chatActivityEnterView2.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView2.r0.b = false;
                            int i19 = -org.telegram.messenger.g0.L(4.0f);
                            int[] iArr = new int[2];
                            if (!org.telegram.messenger.g0.Q1() || bnVar == null) {
                                i7 = i19;
                            } else {
                                bnVar.getFragmentView().getLocationInWindow(iArr);
                                i7 = iArr[0] + i19;
                            }
                            int b13 = chatActivityEnterView2.P3.b1();
                            int measuredHeight = chatActivityEnterView2.r0.getContentView().getMeasuredHeight();
                            int n11 = chatActivityEnterView2.P3.n();
                            if (n11 <= org.telegram.messenger.g0.L(20.0f)) {
                                b13 += n11;
                            }
                            if (chatActivityEnterView2.X0) {
                                b13 -= chatActivityEnterView2.getEmojiPadding();
                            }
                            org.telegram.messenger.g0.L(1.0f);
                            if (measuredHeight < (((i19 * 2) + b13) - ((bnVar == null || !bnVar.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0)) - chatActivityEnterView2.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView2.getLocationInWindow(iArr);
                                i10 = ((iArr[1] - measuredHeight) - i19) - org.telegram.messenger.g0.L(2.0f);
                            } else {
                                int i20 = (bnVar == null || !bnVar.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0;
                                chatActivityEnterView2.r0.o.getLayoutParams().height = ((b13 - i20) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                                i10 = i20;
                            }
                            xe xeVar3 = chatActivityEnterView2.r0;
                            View view2 = xeVar3.u;
                            ek0 ek0Var = xeVar3.v;
                            TLRPC.Peer peer3 = xeVar3.r;
                            kn0 kn0Var = xeVar3.o;
                            bi.e3 e3Var = xeVar3.t;
                            ArrayList arrayList = xeVar3.z;
                            int size = arrayList.size();
                            int i21 = 0;
                            while (i21 < size) {
                                Object obj = arrayList.get(i21);
                                i21++;
                                ((r1.g) obj).d();
                            }
                            arrayList.clear();
                            e3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                            e3Var.setPivotY(e3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                            kn0Var.setPivotX(0.0f);
                            kn0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = xeVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.g0.L(54.0f);
                                int size2 = arrayList2.size() * L;
                                i11 = 2;
                                int i22 = 0;
                                while (i22 < arrayList2.size()) {
                                    TLRPC.Peer peer4 = arrayList2.get(i22).peer;
                                    View view3 = view2;
                                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = arrayList2;
                                    long j3 = peer4.channel_id;
                                    if (j3 == 0 || j3 != peer3.channel_id) {
                                        long j10 = peer4.user_id;
                                        if (j10 == 0 || j10 != peer3.user_id) {
                                            long j11 = peer4.chat_id;
                                            if (j11 == 0 || j11 != peer3.chat_id) {
                                                i22++;
                                                view2 = view3;
                                                arrayList2 = arrayList3;
                                            }
                                        }
                                    }
                                    xeVar3.w.h1(i22, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + ((i22 == arrayList3.size() + (-1) || ek0Var.getMeasuredHeight() >= size2) ? 0 : ek0Var.getMeasuredHeight() % L));
                                    if (ek0Var.computeVerticalScrollOffset() > 0) {
                                        view3.animate().cancel();
                                        view3.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            } else {
                                i11 = 2;
                            }
                            e3Var.setScaleX(0.25f);
                            e3Var.setScaleY(0.25f);
                            kn0Var.setAlpha(0.25f);
                            r1.g gVar = new r1.g(e3Var, r1.g.q);
                            gVar.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            gVar.b(new hn0(xeVar3, i11));
                            r1.g gVar2 = new r1.g(e3Var, r1.g.r);
                            gVar2.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            gVar2.b(new hn0(xeVar3, 3));
                            r1.b bVar = r1.g.v;
                            r1.g gVar3 = new r1.g(e3Var, bVar);
                            gVar3.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            r1.g gVar4 = new r1.g(kn0Var, bVar);
                            gVar4.m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                            for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                                arrayList.add(gVar5);
                                gVar5.a(new in0(xeVar3, gVar5, 1));
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
                    if (chatActivityEnterView2.p7) {
                        chatActivityEnterView2.L0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView2.L0(true, true, true);
                        break;
                    }
                }
                break;
            case 3:
                int i23 = ChatActivityEnterView.s7;
                chatActivityEnterView.k1();
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
                    AnimatorSet animatorSet = chatActivityEnterView.j3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.g0 == null) {
                        chatActivityEnterView.v1();
                        break;
                    }
                }
                break;
            case 6:
                ng ngVar2 = chatActivityEnterView.P3;
                if (ngVar2 != null) {
                    ngVar2.J0();
                    break;
                }
                break;
            case 7:
                int i24 = ChatActivityEnterView.s7;
                if (chatActivityEnterView.R2 != null) {
                    if (chatActivityEnterView.d0 - chatActivityEnterView.e0 >= 0) {
                        jg C = chatActivityEnterView.C();
                        chatActivityEnterView.S2 = C;
                        kg.z d = kg.z.d(chatActivityEnterView.R);
                        String str = chatActivityEnterView.R2.link;
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
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.a4) {
                    if (!chatActivityEnterView.p3 || (gfVar = chatActivityEnterView.F0) == null || !gfVar.isFocused()) {
                        if (chatActivityEnterView.p4) {
                            if (chatActivityEnterView.H2 != 0) {
                                chatActivityEnterView.P1(0, true);
                                chatActivityEnterView.V0.t(true);
                                chatActivityEnterView.V0.A();
                                if (chatActivityEnterView.o4) {
                                    chatActivityEnterView.P(true);
                                }
                            } else if (!chatActivityEnterView.u4 && (fgVar = chatActivityEnterView.V0) != null) {
                                fgVar.P(false);
                            }
                        } else if (!chatActivityEnterView.u4) {
                            chatActivityEnterView.V0.P(true);
                        }
                        if (!chatActivityEnterView.u4) {
                            chatActivityEnterView.Q1(!chatActivityEnterView.p4, true, false, true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                int i25 = ChatActivityEnterView.s7;
                if (chatActivityEnterView.i0() && chatActivityEnterView.v3 && (recordCircle = chatActivityEnterView.D2) != null && ChatActivityEnterView.this.i5) {
                    chatActivityEnterView.n0(false, false);
                    ai.p0 p0Var = chatActivityEnterView.j1;
                    if (p0Var == null || !p0Var.p()) {
                        ai.p0 p0Var2 = chatActivityEnterView.j1;
                        if (p0Var2 != null && p0Var2.o()) {
                            gf gfVar3 = chatActivityEnterView.F0;
                            if (gfVar3 != null) {
                                gfVar3.setText("");
                            }
                            chatActivityEnterView.j1.k();
                        }
                    } else {
                        ai.p0 p0Var3 = chatActivityEnterView.j1;
                        if (p0Var3.o0 && p0Var3.p()) {
                            p0Var3.s();
                        }
                    }
                    if (chatActivityEnterView.v3) {
                        chatActivityEnterView.v3 = false;
                        chatActivityEnterView.Y1 = 0L;
                        chatActivityEnterView.s2(2, true);
                        break;
                    }
                }
                break;
            case 10:
                AnimatorSet animatorSet2 = chatActivityEnterView.j3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView.S1;
                    int[] iArr3 = chatActivityEnterView.R1;
                    if (!chatActivityEnterView.K1 || chatActivityEnterView.U1 || (zi0Var = chatActivityEnterView.i1) == null || chatActivityEnterView.R3 == null || zi0Var.getVisibility() != 0 || chatActivityEnterView.i1.getWidth() <= 0 || (rh0Var = chatActivityEnterView.h1) == null) {
                        chatActivityEnterView.s1();
                        break;
                    } else if (chatActivityEnterView.i1.T0 == null) {
                        rh0Var.getLocationInWindow(iArr3);
                        chatActivityEnterView.i1.getLocationInWindow(iArr2);
                        float width = (chatActivityEnterView.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                        float height = ((chatActivityEnterView.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - org.telegram.messenger.g0.L(3.0f);
                        TLRPC.TL_document tL_document = chatActivityEnterView.R3;
                        chatActivityEnterView.z5 = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.eh(26, chatActivityEnterView, tL_document), 100L);
                        try {
                            chatActivityEnterView.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        rg rgVar = chatActivityEnterView.E2;
                        if (rgVar != null) {
                            rgVar.invalidate();
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
                        chatActivityEnterView.C5.setInterpolator(nr.g);
                        chatActivityEnterView.C5.addUpdateListener(new pd(chatActivityEnterView, 9));
                        chatActivityEnterView.C5.start();
                        zi0 zi0Var2 = chatActivityEnterView.i1;
                        ve veVar = new ve(chatActivityEnterView);
                        yu0 yu0Var = zi0Var2.J0;
                        RectF rectF = zi0Var2.f0;
                        if (zi0Var2.T0 == null && !zi0Var2.X0) {
                            int width2 = zi0Var2.getWidth();
                            int height2 = zi0Var2.getHeight();
                            if (!zi0Var2.d0 || width2 <= 0 || height2 <= 0) {
                                veVar.a();
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
                                    int i26 = width2;
                                    int i27 = height2;
                                    zi0Var2.a1 = zi0Var2.f();
                                    zi0Var2.Z0 = width < f11 / 2.0f;
                                    int max = Math.max(1, Math.round(org.telegram.messenger.g0.p * 0.75f));
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i28 < i27) {
                                        int i31 = 0;
                                        while (i31 < i26) {
                                            int i32 = iArr4[(i28 * i26) + i31];
                                            int i33 = i31;
                                            int i34 = i28;
                                            if ((i32 >>> 24) > 60) {
                                                if (zi0Var2.e(i32)) {
                                                    i29++;
                                                } else {
                                                    i30++;
                                                }
                                            }
                                            i31 = i33 + max;
                                            i28 = i34;
                                        }
                                        i28 += max;
                                    }
                                    float f12 = i29 > 1100 ? 1100.0f / i29 : 1.0f;
                                    float min = i30 > 0 ? Math.min(1.0f, 360.0f / i30) : 0.0f;
                                    yu0Var.a();
                                    yu0Var.S = 0.0f;
                                    yu0Var.R = 0.0f;
                                    yu0Var.e(zi0Var2.a1);
                                    float f13 = org.telegram.messenger.g0.p;
                                    int i35 = 0;
                                    int i36 = 0;
                                    int i37 = 0;
                                    while (i35 < i27) {
                                        float f14 = f12;
                                        int i38 = 0;
                                        while (i38 < i26) {
                                            int i39 = i26;
                                            int i40 = iArr4[(i35 * i26) + i38];
                                            int i41 = i27;
                                            float f15 = min;
                                            if ((i40 >>> 24) > 60) {
                                                i37++;
                                                int i42 = i37 * 7;
                                                if (zi0.c(i42 + 3) <= (zi0Var2.e(i40) ? f14 : f15)) {
                                                    float f16 = zi0Var2.Z0 ? i38 / f11 : 1.0f - (i38 / f11);
                                                    float c11 = (((zi0.c(i42 + 13) * 0.04f) + (0.42f * f16)) * 760.0f) / 1000.0f;
                                                    float c12 = zi0.c(i42 + 11);
                                                    float c13 = zi0.c(i42 + 12);
                                                    float f17 = i38;
                                                    i12 = i38;
                                                    float f18 = c12 - 0.5f;
                                                    float f19 = max;
                                                    i13 = max;
                                                    float f20 = (f18 * f19) + f17;
                                                    float f21 = c13 - 0.5f;
                                                    i14 = i35;
                                                    float f22 = (f21 * f19) + i35;
                                                    f10 = f11;
                                                    zi0Var2.J0.i(f20, f22, org.telegram.ui.Cells.c0.g(c12, 0.25f, 0.25f, width - f20, f20), Math.min(f22, height) - (((zi0.c(i42 + 14) * 9.0f) + 3.0f) * f13), com.google.android.gms.internal.vision.e2.x(f21, 4.0f, f13, width), com.google.android.gms.internal.vision.e2.x(f18, 4.0f, f13, height), com.google.android.gms.internal.vision.e2.B(f16, 0.3f, 0.8f, (zi0.c(i42 + 15) * 0.2f) + 0.45f), c11);
                                                    i36++;
                                                    i38 = i12 + i13;
                                                    min = f15;
                                                    i26 = i39;
                                                    i35 = i14;
                                                    i27 = i41;
                                                    max = i13;
                                                    f11 = f10;
                                                }
                                            }
                                            i12 = i38;
                                            i13 = max;
                                            i14 = i35;
                                            f10 = f11;
                                            i38 = i12 + i13;
                                            min = f15;
                                            i26 = i39;
                                            i35 = i14;
                                            i27 = i41;
                                            max = i13;
                                            f11 = f10;
                                        }
                                        i35 += max;
                                        f12 = f14;
                                    }
                                    zi0Var2.T0 = createBitmap;
                                    zi0Var2.U0 = i36;
                                    zi0Var2.W0 = veVar;
                                    zi0Var2.V0 = SystemClock.uptimeMillis();
                                    zi0Var2.invalidate();
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
                            chatActivityEnterView.m1();
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 27), 275L);
                            chatActivityEnterView.K0(false);
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
                        ki.x xVar = new ki.x();
                        xVar.c = new ArrayList();
                        xVar.d = new ArrayList();
                        xVar.e = new ArrayList();
                        chatActivityEnterView.o0 = xVar;
                        b1Var2.setAdapter(xVar);
                        chatActivityEnterView.n0.c.setOnItemClickListener(new ff(chatActivityEnterView));
                        chatActivityEnterView.n0.c.setOnItemLongClickListener(new ve(chatActivityEnterView));
                        chatActivityEnterView.n0.setClipToPadding(false);
                        chatActivityEnterView.c2.addView(chatActivityEnterView.n0, c8.ma.e(-1, -1, 80));
                        chatActivityEnterView.n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.Y6;
                        if (hVar != null) {
                            chatActivityEnterView.o0.E(hVar);
                        }
                        chatActivityEnterView.j2();
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
                if (chatActivityEnterView.r7 == 3 && (ngVar = chatActivityEnterView.P3) != null) {
                    ngVar.w1();
                    break;
                }
                break;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(chatActivityEnterView.R).h7.edit();
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                if (org.telegram.messenger.v1.d(bnVar2.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + bnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + bnVar2.a(), false);
                }
                if (org.telegram.messenger.np.u1(chatActivityEnterView.R).y7 && org.telegram.messenger.np.u1(chatActivityEnterView.R).z7) {
                    edit.putBoolean("show_gift_for_" + bnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull d2 = org.telegram.messenger.np.u1(chatActivityEnterView.R).d2(org.telegram.messenger.k10.i(chatActivityEnterView.R).e());
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
                    t1Var.setOnCancelListener(new di.z(chatActivityEnterView, wg.s.j(chatActivityEnterView.R, null, new fi.w2(chatActivityEnterView, t1Var, j12, z11)), i16));
                    break;
                }
                break;
            case 14:
                int i43 = ChatActivityEnterView.s7;
                chatActivityEnterView.k1();
                break;
            case 15:
                ng ngVar3 = chatActivityEnterView.P3;
                if (ngVar3 != null && !ngVar3.k()) {
                    ng ngVar4 = chatActivityEnterView.P3;
                    vg vgVar = chatActivityEnterView.G0;
                    ngVar4.s1(vgVar, ((org.telegram.ui.ActionBar.m5) vgVar.c).getText(), true);
                    break;
                }
                break;
            case 16:
                cf cfVar = chatActivityEnterView.O0;
                if (cfVar != null && cfVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                c5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new je(chatActivityEnterView, i18), chatActivityEnterView.M4);
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                cf cfVar2 = chatActivityEnterView3.O0;
                if (cfVar2 != null && cfVar2.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.w1(true, 2147483646, 0, 0L, true);
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                cf cfVar3 = chatActivityEnterView4.O0;
                if (cfVar3 != null && cfVar3.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.w1(false, 0, 0, 0L, true);
                break;
            case 19:
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.P1(0, false);
                    chatActivityEnterView.V0.t(false);
                    gf gfVar4 = chatActivityEnterView.F0;
                    if (gfVar4 != null) {
                        gfVar4.requestFocus();
                    }
                }
                if (chatActivityEnterView.d3 != null) {
                    if (!chatActivityEnterView.S0() || chatActivityEnterView.V2 != 1) {
                        chatActivityEnterView.X1(1, 1, true, true);
                    } else if (chatActivityEnterView.S0() && chatActivityEnterView.V2 == 1) {
                        chatActivityEnterView.X1(0, 1, true, false);
                    }
                } else if (chatActivityEnterView.f3) {
                    chatActivityEnterView.setFieldText("/");
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.requestFocus();
                    }
                    chatActivityEnterView.i1();
                }
                if (chatActivityEnterView.p4) {
                    chatActivityEnterView.Q1(false, false, false, true);
                    break;
                }
                break;
            case 20:
                int i44 = ChatActivityEnterView.s7;
                chatActivityEnterView.u0();
                break;
            default:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
                fe feVar = chatActivityEnterView.R0;
                if (!chatActivityEnterView.o0()) {
                    org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.V;
                    if (i1Var3 == null || !i1Var3.f) {
                        if (feVar.x) {
                            a70 a70Var = chatActivityEnterView.V6;
                            if (a70Var != null) {
                                a70Var.v();
                                chatActivityEnterView.V6 = null;
                                break;
                            } else {
                                gf gfVar6 = chatActivityEnterView.F0;
                                if (gfVar6 != null && bnVar3 != null) {
                                    gfVar6.m();
                                    FrameLayout frameLayout = chatActivityEnterView.c2;
                                    a70 a70Var2 = new a70(frameLayout != null ? frameLayout : chatActivityEnterView, chatActivityEnterView.M4, feVar, false, false, true);
                                    a70Var2.a0 = org.telegram.messenger.g0.L(280.0f);
                                    org.telegram.ui.bn.C8(new w90(a70Var2, chatActivityEnterView.F0), bnVar3.h, true, true, true, true);
                                    a70Var2.X = true;
                                    a70Var2.p = new org.telegram.ui.eh(i17, chatActivityEnterView, a70Var2);
                                    chatActivityEnterView.V6 = a70Var2;
                                    a70Var2.a0();
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView.B0) {
                            chatActivityEnterView.Y1();
                            break;
                        } else if (!chatActivityEnterView.S0() || chatActivityEnterView.V2 != 0) {
                            chatActivityEnterView.X1(1, 0, true, true);
                            fg fgVar2 = chatActivityEnterView.V0;
                            gf gfVar7 = chatActivityEnterView.F0;
                            boolean z13 = gfVar7 != null && gfVar7.length() > 0;
                            if (bnVar3 != null) {
                                hi.l3 l3Var = bnVar3.N1;
                                if (l3Var != null) {
                                    if (l3Var.W) {
                                        l3Var.f(true);
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
                            fgVar2.C(z13, z11);
                            break;
                        } else {
                            if (chatActivityEnterView.H2 != 0) {
                                chatActivityEnterView.P1(0, true);
                                fg fgVar3 = chatActivityEnterView.V0;
                                if (fgVar3 != null) {
                                    fgVar3.t(false);
                                }
                                gf gfVar8 = chatActivityEnterView.F0;
                                if (gfVar8 != null) {
                                    gfVar8.requestFocus();
                                }
                            }
                            if (chatActivityEnterView.p4) {
                                chatActivityEnterView.Q1(false, true, false, true);
                                chatActivityEnterView.b4 = true;
                                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 28), 200L);
                                break;
                            } else {
                                chatActivityEnterView.j1();
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
                    chatActivityEnterView.D6.setInterpolator(nr.i);
                    chatActivityEnterView.D6.start();
                    break;
                }
                break;
        }
    }
}
