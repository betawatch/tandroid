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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ xc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d9  */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        sf sfVar;
        xe xeVar;
        oi0 oi0Var;
        fh0 fh0Var;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        cg cgVar;
        ?? r82;
        float f10;
        TLRPC.Peer peer;
        int i14;
        int i15;
        ArrayList<TLRPC.TL_sendAsPeer> arrayList;
        boolean z11;
        int i16 = this.a;
        int i17 = 28;
        int i18 = 8;
        float f11 = 4.0f;
        boolean z12 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i16) {
            case 0:
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView.V;
                if ((i1Var == null || !i1Var.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.H3.B2();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView.V;
                if ((i1Var2 == null || !i1Var2.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.H3.n1();
                    break;
                }
                break;
            case 2:
                int i19 = ChatActivityEnterView.N6;
                chatActivityEnterView.Y0();
                break;
            case 3:
                xe xeVar2 = chatActivityEnterView.F0;
                String obj = xeVar2 != null ? xeVar2.getText().toString() : "";
                int indexOf = obj.indexOf(32);
                if (indexOf != -1 && indexOf != obj.length() - 1) {
                    chatActivityEnterView.setFieldText(obj.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView.setFieldText("");
                    break;
                }
            case 4:
                org.telegram.ui.bg0 bg0Var = chatActivityEnterView.M0;
                if (bg0Var == null || bg0Var.u0) {
                    AnimatorSet animatorSet = chatActivityEnterView.b3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.g0 == null) {
                        chatActivityEnterView.j1();
                        break;
                    }
                }
                break;
            case 5:
                cg cgVar2 = chatActivityEnterView.H3;
                if (cgVar2 != null) {
                    cgVar2.J0();
                    break;
                }
                break;
            case 6:
                int i20 = ChatActivityEnterView.N6;
                if (chatActivityEnterView.J2 != null) {
                    if (chatActivityEnterView.d0 - chatActivityEnterView.e0 >= 0) {
                        xf A = chatActivityEnterView.A();
                        chatActivityEnterView.K2 = A;
                        kg.y d = kg.y.d(chatActivityEnterView.R);
                        String str = chatActivityEnterView.J2.link;
                        String str2 = A.a;
                        ArrayList<TLRPC.MessageEntity> arrayList2 = A.b;
                        uc ucVar = new uc(chatActivityEnterView, 20);
                        TL_account.TL_businessChatLink c10 = d.c(str);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList2;
                            tL_inputBusinessChatLink.title = c10.title;
                            d.b(c10, tL_inputBusinessChatLink, ucVar);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView.c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.F3(3.5f, numberTextView, null);
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
            case 7:
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.S3) {
                    if (!chatActivityEnterView.h3 || (xeVar = chatActivityEnterView.F0) == null || !xeVar.isFocused()) {
                        if (!chatActivityEnterView.h4) {
                            if (!chatActivityEnterView.m4) {
                                z10 = true;
                                chatActivityEnterView.V0.P(true);
                            }
                            z10 = true;
                        } else if (chatActivityEnterView.z2 != 0) {
                            z10 = true;
                            chatActivityEnterView.D1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                            if (chatActivityEnterView.g4) {
                                chatActivityEnterView.N(true);
                            }
                        } else {
                            if (!chatActivityEnterView.m4 && (sfVar = chatActivityEnterView.V0) != null) {
                                sfVar.P(false);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.m4) {
                            chatActivityEnterView.E1(chatActivityEnterView.h4 ^ z10, z10, false, z10);
                            break;
                        }
                    }
                }
                break;
            case 8:
                AnimatorSet animatorSet2 = chatActivityEnterView.b3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr = chatActivityEnterView.K1;
                    int[] iArr2 = chatActivityEnterView.J1;
                    if (!chatActivityEnterView.C1 || chatActivityEnterView.M1 || (oi0Var = chatActivityEnterView.i1) == null || chatActivityEnterView.J3 == null || oi0Var.getVisibility() != 0 || chatActivityEnterView.i1.getWidth() <= 0 || (fh0Var = chatActivityEnterView.h1) == null) {
                        chatActivityEnterView.g1();
                        break;
                    } else if (chatActivityEnterView.i1.T0 == null) {
                        fh0Var.getLocationInWindow(iArr2);
                        chatActivityEnterView.i1.getLocationInWindow(iArr);
                        float width = (chatActivityEnterView.h1.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
                        float height = ((chatActivityEnterView.h1.getHeight() / 2.0f) + (iArr2[1] - iArr[1])) - org.telegram.messenger.g0.L(3.0f);
                        TLRPC.TL_document tL_document = chatActivityEnterView.J3;
                        chatActivityEnterView.r5 = null;
                        org.telegram.messenger.g0.i3(new org.telegram.ui.zg(i17, chatActivityEnterView, tL_document), 100L);
                        try {
                            chatActivityEnterView.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        gg ggVar = chatActivityEnterView.w2;
                        if (ggVar != null) {
                            ggVar.invalidate();
                        }
                        chatActivityEnterView.w5 = 0.0f;
                        chatActivityEnterView.v5 = 0.0f;
                        ValueAnimator valueAnimator = chatActivityEnterView.u5;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.u5 = ofFloat;
                        ofFloat.setDuration(160L);
                        chatActivityEnterView.u5.setInterpolator(er.g);
                        chatActivityEnterView.u5.addUpdateListener(new gd(chatActivityEnterView, i18));
                        chatActivityEnterView.u5.start();
                        oi0 oi0Var2 = chatActivityEnterView.i1;
                        me meVar = new me(chatActivityEnterView);
                        nu0 nu0Var = oi0Var2.J0;
                        RectF rectF = oi0Var2.f0;
                        if (oi0Var2.T0 == null && !oi0Var2.X0) {
                            int width2 = oi0Var2.getWidth();
                            int height2 = oi0Var2.getHeight();
                            if (!oi0Var2.d0 || width2 <= 0 || height2 <= 0) {
                                meVar.a();
                                break;
                            } else {
                                oi0Var2.setPlaying(false);
                                oi0Var2.p0 = false;
                                oi0Var2.W = false;
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                    float f12 = width2;
                                    rectF.set(0.0f, 0.0f, f12, height2);
                                    oi0Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                    int[] iArr3 = new int[width2 * height2];
                                    createBitmap.getPixels(iArr3, 0, width2, 0, 0, width2, height2);
                                    int i21 = width2;
                                    int i22 = height2;
                                    oi0Var2.a1 = oi0Var2.f();
                                    oi0Var2.Z0 = width < f12 / 2.0f;
                                    int max = Math.max(1, Math.round(org.telegram.messenger.g0.p * 0.75f));
                                    int i23 = 0;
                                    int i24 = 0;
                                    for (int i25 = 0; i25 < i22; i25 += max) {
                                        int i26 = 0;
                                        while (i26 < i21) {
                                            int i27 = iArr3[(i25 * i21) + i26];
                                            float f13 = f12;
                                            if ((i27 >>> 24) > 60) {
                                                if (oi0Var2.e(i27)) {
                                                    i23++;
                                                } else {
                                                    i24++;
                                                }
                                            }
                                            i26 += max;
                                            f12 = f13;
                                        }
                                    }
                                    float f14 = f12;
                                    float f15 = i23 > 1100 ? 1100.0f / i23 : 1.0f;
                                    float min = i24 > 0 ? Math.min(1.0f, 360.0f / i24) : 0.0f;
                                    nu0Var.a();
                                    nu0Var.S = 0.0f;
                                    nu0Var.R = 0.0f;
                                    nu0Var.e(oi0Var2.a1);
                                    float f16 = org.telegram.messenger.g0.p;
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i28 < i22) {
                                        int i31 = 0;
                                        while (i31 < i21) {
                                            int i32 = iArr3[(i28 * i21) + i31];
                                            float f17 = f15;
                                            float f18 = min;
                                            if ((i32 >>> 24) > 60) {
                                                i30++;
                                                int i33 = i30 * 7;
                                                if (oi0.c(i33 + 3) <= (oi0Var2.e(i32) ? f17 : f18)) {
                                                    float f19 = oi0Var2.Z0 ? i31 / f14 : 1.0f - (i31 / f14);
                                                    float c11 = (((oi0.c(i33 + 13) * 0.04f) + (0.42f * f19)) * 760.0f) / 1000.0f;
                                                    float c12 = oi0.c(i33 + 11);
                                                    float c13 = oi0.c(i33 + 12);
                                                    float f20 = c12 - 0.5f;
                                                    i7 = i21;
                                                    float f21 = max;
                                                    float f22 = (f20 * f21) + i31;
                                                    i10 = i22;
                                                    float f23 = c13 - 0.5f;
                                                    i11 = max;
                                                    float f24 = (f23 * f21) + i28;
                                                    i12 = i28;
                                                    i13 = i30;
                                                    float f25 = f11;
                                                    oi0Var2.J0.i(f22, f24, org.telegram.ui.Cells.y0.f(c12, 0.25f, 0.25f, width - f22, f22), Math.min(f24, height) - (((oi0.c(i33 + 14) * 9.0f) + 3.0f) * f16), com.google.android.gms.internal.vision.e2.x(f23, f25, f16, width), com.google.android.gms.internal.vision.e2.x(f20, f25, f16, height), com.google.android.gms.internal.vision.e2.B(f19, 0.3f, 0.8f, (oi0.c(i33 + 15) * 0.2f) + 0.45f), c11);
                                                    i29++;
                                                    i31 += i11;
                                                    f15 = f17;
                                                    i28 = i12;
                                                    min = f18;
                                                    max = i11;
                                                    i21 = i7;
                                                    i22 = i10;
                                                    i30 = i13;
                                                    f11 = 4.0f;
                                                }
                                            }
                                            i7 = i21;
                                            i10 = i22;
                                            i11 = max;
                                            i12 = i28;
                                            i13 = i30;
                                            i31 += i11;
                                            f15 = f17;
                                            i28 = i12;
                                            min = f18;
                                            max = i11;
                                            i21 = i7;
                                            i22 = i10;
                                            i30 = i13;
                                            f11 = 4.0f;
                                        }
                                        i28 += max;
                                        i30 = i30;
                                        f11 = 4.0f;
                                    }
                                    oi0Var2.T0 = createBitmap;
                                    oi0Var2.U0 = i29;
                                    oi0Var2.W0 = meVar;
                                    oi0Var2.V0 = SystemClock.uptimeMillis();
                                    oi0Var2.invalidate();
                                    break;
                                } catch (Throwable unused3) {
                                    meVar.a();
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 9:
                ki.a0 a0Var = chatActivityEnterView.m0;
                boolean z13 = a0Var.w;
                a0Var.setOpened(!z13);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused4) {
                }
                if (chatActivityEnterView.v0()) {
                    if (!z13) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.a1();
                            break;
                        } else {
                            org.telegram.messenger.g0.i3(new uc(chatActivityEnterView, 19), 275L);
                            chatActivityEnterView.y0(false);
                            break;
                        }
                    }
                } else if (z13) {
                    ve veVar = chatActivityEnterView.n0;
                    if (veVar != null) {
                        veVar.c();
                        break;
                    }
                } else {
                    if (chatActivityEnterView.n0 == null) {
                        ve veVar2 = new ve(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.n0 = veVar2;
                        di.c1 c1Var = veVar2.c;
                        chatActivityEnterView.getContext();
                        c1Var.setLayoutManager(new v4.b0());
                        di.c1 c1Var2 = chatActivityEnterView.n0.c;
                        ki.z zVar = new ki.z();
                        zVar.c = new ArrayList();
                        zVar.d = new ArrayList();
                        zVar.e = new ArrayList();
                        chatActivityEnterView.o0 = zVar;
                        c1Var2.setAdapter(zVar);
                        chatActivityEnterView.n0.c.setOnItemClickListener(new we(chatActivityEnterView));
                        chatActivityEnterView.n0.c.setOnItemLongClickListener(new me(chatActivityEnterView));
                        chatActivityEnterView.n0.setClipToPadding(false);
                        chatActivityEnterView.U1.addView(chatActivityEnterView.n0, c8.ja.e(-1, -1, 80));
                        chatActivityEnterView.n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.w6;
                        if (hVar != null) {
                            chatActivityEnterView.o0.E(hVar);
                        }
                        chatActivityEnterView.W1();
                    }
                    ve veVar3 = chatActivityEnterView.n0;
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
            case 10:
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(chatActivityEnterView.R).f7.edit();
                org.telegram.ui.an anVar = chatActivityEnterView.x3;
                if (org.telegram.messenger.v1.d(anVar.r8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + anVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + anVar.a(), false);
                }
                if (org.telegram.messenger.np.s1(chatActivityEnterView.R).w7 && org.telegram.messenger.np.s1(chatActivityEnterView.R).x7) {
                    edit.putBoolean("show_gift_for_" + anVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull b22 = org.telegram.messenger.np.s1(chatActivityEnterView.R).b2(org.telegram.messenger.m10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().r8 == null || !chatActivityEnterView.getParentFragment().r8.display_gifts_button) && (b22 == null || !b22.display_gifts_button)) {
                    org.telegram.messenger.g0.W3(chatActivityEnterView.s2, false);
                }
                TLRPC.User j3 = chatActivityEnterView.getParentFragment().j();
                if (j3 != null) {
                    boolean z14 = chatActivityEnterView.getParentFragment().r8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().r8.birthday);
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, chatActivityEnterView.getContext(), null);
                    t1Var.r(200L);
                    t1Var.setOnCancelListener(new di.z(chatActivityEnterView, wg.q.j(chatActivityEnterView.R, null, new fi.y2(chatActivityEnterView, t1Var, j3, z14)), 4));
                    break;
                }
                break;
            case 11:
                if (chatActivityEnterView.M6 == 3 && (cgVar = chatActivityEnterView.H3) != null) {
                    cgVar.w1();
                    break;
                }
                break;
            case 12:
                int i34 = ChatActivityEnterView.N6;
                chatActivityEnterView.Y0();
                break;
            case 13:
                cg cgVar3 = chatActivityEnterView.H3;
                if (cgVar3 != null && !cgVar3.l()) {
                    cg cgVar4 = chatActivityEnterView.H3;
                    kg kgVar = chatActivityEnterView.G0;
                    cgVar4.s1(kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.c).getText(), true);
                    break;
                }
                break;
            case 14:
                te teVar = chatActivityEnterView.O0;
                if (teVar != null && teVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                t4.J(chatActivityEnterView.w3, chatActivityEnterView.x3.a(), new ae(chatActivityEnterView, 2), chatActivityEnterView.E4);
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                te teVar2 = chatActivityEnterView2.O0;
                if (teVar2 != null && teVar2.isShowing()) {
                    chatActivityEnterView2.O0.dismiss();
                }
                chatActivityEnterView2.k1(true, 2147483646, 0, 0L, true);
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                te teVar3 = chatActivityEnterView3.O0;
                if (teVar3 != null && teVar3.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.k1(false, 0, 0, 0L, true);
                break;
            case 17:
                if (chatActivityEnterView.z2 != 0) {
                    chatActivityEnterView.D1(0, false);
                    chatActivityEnterView.V0.t(false);
                    xe xeVar3 = chatActivityEnterView.F0;
                    if (xeVar3 != null) {
                        xeVar3.requestFocus();
                    }
                }
                if (chatActivityEnterView.V2 != null) {
                    if (chatActivityEnterView.G0()) {
                        r82 = 1;
                        if (chatActivityEnterView.N2 == 1) {
                            if (chatActivityEnterView.G0() && chatActivityEnterView.N2 == 1) {
                                chatActivityEnterView.L1(0, 1, true, false);
                            }
                        }
                    } else {
                        r82 = 1;
                    }
                    chatActivityEnterView.L1(r82, r82, r82, r82);
                } else if (chatActivityEnterView.X2) {
                    chatActivityEnterView.setFieldText("/");
                    xe xeVar4 = chatActivityEnterView.F0;
                    if (xeVar4 != null) {
                        xeVar4.requestFocus();
                    }
                    chatActivityEnterView.W0();
                }
                if (chatActivityEnterView.h4) {
                    chatActivityEnterView.E1(false, false, false, true);
                    break;
                }
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                org.telegram.ui.an anVar2 = chatActivityEnterView4.x3;
                if (!chatActivityEnterView4.K6 ? chatActivityEnterView4.getTranslationY() == 0.0f : !chatActivityEnterView4.G0()) {
                    if (chatActivityEnterView4.H3.n() > org.telegram.messenger.g0.L(20.0f)) {
                        int b12 = chatActivityEnterView4.H3.b1();
                        int n10 = chatActivityEnterView4.H3.n();
                        f10 = 20.0f;
                        if (n10 <= org.telegram.messenger.g0.L(20.0f)) {
                            b12 += n10;
                        }
                        if (chatActivityEnterView4.X0) {
                            b12 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (b12 < org.telegram.messenger.g0.L(200.0f)) {
                            chatActivityEnterView4.v0 = new nd(chatActivityEnterView4, 8);
                            chatActivityEnterView4.S();
                            break;
                        }
                    } else {
                        f10 = 20.0f;
                    }
                    if (chatActivityEnterView4.H3.O() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused5) {
                        }
                        oe oeVar = chatActivityEnterView4.r0;
                        if (oeVar != null) {
                            oeVar.e = false;
                            oeVar.l(new r1.g[0]);
                            break;
                        } else {
                            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(chatActivityEnterView4.R);
                            if (chatActivityEnterView4.K6) {
                                peer = chatActivityEnterView4.H3.s();
                            } else {
                                org.telegram.messenger.np.s1(chatActivityEnterView4.R).M0(Long.valueOf(-chatActivityEnterView4.y3));
                                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(chatActivityEnterView4.R).N0(-chatActivityEnterView4.y3);
                                r15 = N0;
                                peer = N0 != 0 ? N0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView4.H3.O() != null && !chatActivityEnterView4.H3.O().peers.isEmpty()) {
                                peer = chatActivityEnterView4.H3.O().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = org.telegram.messenger.t3.V(s12.M0(Long.valueOf(-chatActivityEnterView4.y3)));
                            if (chatActivityEnterView4.K6) {
                            } else {
                                anVar2.getParentLayout().getOverlayContainerView();
                            }
                            oe oeVar2 = new oe(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.x3, s12, V, peer2, chatActivityEnterView4.H3.O(), new a3.h(chatActivityEnterView4, r15, s12, 24), chatActivityEnterView4.E4);
                            chatActivityEnterView4.r0 = oeVar2;
                            oeVar2.e = true;
                            oeVar2.c = org.telegram.messenger.ns.x3;
                            oeVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.r0.setClippingEnabled(true);
                            chatActivityEnterView4.r0.setFocusable(true);
                            chatActivityEnterView4.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView4.r0.setInputMethodMode(2);
                            chatActivityEnterView4.r0.setSoftInputMode(0);
                            chatActivityEnterView4.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.r0.b = false;
                            int i35 = -org.telegram.messenger.g0.L(4.0f);
                            int[] iArr4 = new int[2];
                            if (!org.telegram.messenger.g0.Q1() || anVar2 == null) {
                                i14 = i35;
                            } else {
                                anVar2.getFragmentView().getLocationInWindow(iArr4);
                                i14 = iArr4[0] + i35;
                            }
                            int b13 = chatActivityEnterView4.H3.b1();
                            int measuredHeight = chatActivityEnterView4.r0.getContentView().getMeasuredHeight();
                            int n11 = chatActivityEnterView4.H3.n();
                            int i36 = 1;
                            if (n11 <= org.telegram.messenger.g0.L(f10)) {
                                b13 += n11;
                            }
                            if (chatActivityEnterView4.X0) {
                                b13 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            org.telegram.messenger.g0.L(1.0f);
                            if (measuredHeight < (((i35 * 2) + b13) - ((anVar2 == null || !anVar2.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0)) - chatActivityEnterView4.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr4);
                                i15 = ((iArr4[1] - measuredHeight) - i35) - org.telegram.messenger.g0.L(2.0f);
                            } else {
                                int i37 = (anVar2 == null || !anVar2.isInBubbleMode()) ? org.telegram.messenger.g0.m : 0;
                                chatActivityEnterView4.r0.o.getLayoutParams().height = ((b13 - i37) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                i15 = i37;
                            }
                            oe oeVar3 = chatActivityEnterView4.r0;
                            View view2 = oeVar3.u;
                            uj0 uj0Var = oeVar3.v;
                            TLRPC.Peer peer3 = oeVar3.r;
                            zm0 zm0Var = oeVar3.o;
                            bi.g2 g2Var = oeVar3.t;
                            ArrayList arrayList3 = oeVar3.z;
                            int size = arrayList3.size();
                            int i38 = 0;
                            while (i38 < size) {
                                Object obj2 = arrayList3.get(i38);
                                i38++;
                                ((r1.g) obj2).d();
                            }
                            arrayList3.clear();
                            g2Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                            g2Var.setPivotY(g2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                            zm0Var.setPivotX(0.0f);
                            zm0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = oeVar3.s.peers;
                            if (peer3 != null) {
                                int L = org.telegram.messenger.g0.L(54.0f);
                                int size2 = arrayList4.size() * L;
                                int i39 = 0;
                                while (i39 < arrayList4.size()) {
                                    TLRPC.Peer peer4 = arrayList4.get(i39).peer;
                                    uj0 uj0Var2 = uj0Var;
                                    int i40 = L;
                                    long j10 = peer4.channel_id;
                                    if (j10 == 0 || j10 != peer3.channel_id) {
                                        long j11 = peer4.user_id;
                                        if (j11 == 0 || j11 != peer3.user_id) {
                                            long j12 = peer4.chat_id;
                                            arrayList = arrayList4;
                                            if (j12 == 0 || j12 != peer3.chat_id) {
                                                i39++;
                                                uj0Var = uj0Var2;
                                                L = i40;
                                                arrayList4 = arrayList;
                                            } else {
                                                oeVar3.w.h1(i39, (size2 - ((arrayList.size() - 2) * i40)) + org.telegram.messenger.g0.L(7.0f) + ((i39 != arrayList.size() + (-1) || uj0Var2.getMeasuredHeight() >= size2) ? 0 : uj0Var2.getMeasuredHeight() % i40));
                                                if (uj0Var2.computeVerticalScrollOffset() > 0) {
                                                    view2.animate().cancel();
                                                    view2.animate().alpha(1.0f).setDuration(150L).start();
                                                }
                                            }
                                        }
                                    }
                                    arrayList = arrayList4;
                                    oeVar3.w.h1(i39, (size2 - ((arrayList.size() - 2) * i40)) + org.telegram.messenger.g0.L(7.0f) + ((i39 != arrayList.size() + (-1) || uj0Var2.getMeasuredHeight() >= size2) ? 0 : uj0Var2.getMeasuredHeight() % i40));
                                    if (uj0Var2.computeVerticalScrollOffset() > 0) {
                                    }
                                }
                            }
                            g2Var.setScaleX(0.25f);
                            g2Var.setScaleY(0.25f);
                            zm0Var.setAlpha(0.25f);
                            r1.g gVar = new r1.g(g2Var, r1.g.q);
                            gVar.m = org.telegram.ui.Cells.y0.n(1.0f, 750.0f, 1.0f);
                            gVar.b(new wm0(oeVar3, 2));
                            r1.g gVar2 = new r1.g(g2Var, r1.g.r);
                            gVar2.m = org.telegram.ui.Cells.y0.n(1.0f, 750.0f, 1.0f);
                            gVar2.b(new wm0(oeVar3, 3));
                            r1.b bVar = r1.g.v;
                            r1.g gVar3 = new r1.g(g2Var, bVar);
                            gVar3.m = org.telegram.ui.Cells.y0.n(1.0f, 750.0f, 1.0f);
                            r1.g gVar4 = new r1.g(zm0Var, bVar);
                            gVar4.m = org.telegram.ui.Cells.y0.n(1.0f, 750.0f, 1.0f);
                            for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                                arrayList3.add(gVar5);
                                gVar5.a(new xm0(oeVar3, gVar5, i36));
                                gVar5.h();
                                i36 = 1;
                            }
                            oe oeVar4 = chatActivityEnterView4.r0;
                            chatActivityEnterView4.t0 = i14;
                            chatActivityEnterView4.u0 = i15;
                            oeVar4.showAtLocation(view, 51, i14, i15);
                            chatActivityEnterView4.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView4.s0 = new nd(chatActivityEnterView4, 7);
                    if (chatActivityEnterView4.K6) {
                        chatActivityEnterView4.z0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView4.z0(true, true, true);
                        break;
                    }
                }
                break;
            case 19:
                int i41 = ChatActivityEnterView.N6;
                chatActivityEnterView.j0();
                break;
            default:
                org.telegram.ui.an anVar3 = chatActivityEnterView.x3;
                wd wdVar = chatActivityEnterView.R0;
                org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.V;
                if (i1Var3 == null || !i1Var3.f) {
                    if (wdVar.x) {
                        m60 m60Var = chatActivityEnterView.t6;
                        if (m60Var != null) {
                            m60Var.u();
                            chatActivityEnterView.t6 = null;
                            break;
                        } else {
                            xe xeVar5 = chatActivityEnterView.F0;
                            if (xeVar5 != null && anVar3 != null) {
                                xeVar5.m();
                                st0 st0Var = chatActivityEnterView.U1;
                                m60 m60Var2 = new m60(st0Var != null ? st0Var : chatActivityEnterView, chatActivityEnterView.E4, wdVar, false, false, true);
                                m60Var2.X = org.telegram.messenger.g0.L(280.0f);
                                org.telegram.ui.an.C8(new j90(m60Var2, chatActivityEnterView.F0), anVar3.h, true, true, true, true);
                                m60Var2.U = true;
                                m60Var2.p = new org.telegram.ui.zg(29, chatActivityEnterView, m60Var2);
                                chatActivityEnterView.t6 = m60Var2;
                                m60Var2.Z();
                                break;
                            }
                        }
                    } else if (chatActivityEnterView.B0) {
                        chatActivityEnterView.M1();
                        break;
                    } else if (!chatActivityEnterView.G0() || chatActivityEnterView.N2 != 0) {
                        chatActivityEnterView.L1(1, 0, true, true);
                        sf sfVar2 = chatActivityEnterView.V0;
                        xe xeVar6 = chatActivityEnterView.F0;
                        boolean z15 = xeVar6 != null && xeVar6.length() > 0;
                        if (anVar3 != null) {
                            hi.l3 l3Var = anVar3.N1;
                            if (l3Var != null) {
                                if (l3Var.W) {
                                    l3Var.f(true);
                                }
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            anVar3.N1 = null;
                            if (z11) {
                                z12 = true;
                            }
                        }
                        sfVar2.C(z15, z12);
                        break;
                    } else {
                        if (chatActivityEnterView.z2 != 0) {
                            chatActivityEnterView.D1(0, true);
                            sf sfVar3 = chatActivityEnterView.V0;
                            if (sfVar3 != null) {
                                sfVar3.t(false);
                            }
                            xe xeVar7 = chatActivityEnterView.F0;
                            if (xeVar7 != null) {
                                xeVar7.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.h4) {
                            chatActivityEnterView.E1(false, true, false, true);
                            chatActivityEnterView.T3 = true;
                            org.telegram.messenger.g0.i3(new uc(chatActivityEnterView, 28), 200L);
                            break;
                        } else {
                            chatActivityEnterView.X0();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
