package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:77|(3:79|(1:81)|82)|83|(2:85|(5:87|(1:89)(1:131)|(1:91)|(1:130)(5:95|96|97|(1:99)(1:127)|100)|(5:107|108|109|110|(2:112|113)(1:114))(3:117|(3:119|(2:122|120)|123)(1:125)|124))(6:132|133|108|109|110|(0)(0)))|134|133|108|109|110|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v49 */
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        int i10;
        p8 p8Var;
        kr0 kr0Var;
        boolean z9;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.vo voVar;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        String str;
        ph0 ph0Var;
        long j3;
        TLRPC.StickerSet stickerSet2;
        nw0 nw0Var;
        int intValue;
        int intValue2;
        int i13;
        ?? r12;
        bi.e5 e5Var;
        CharSequence m10;
        r5[] r5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i14 = this.a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i18 = 0;
        boolean z12 = true;
        Object obj = this.b;
        switch (i14) {
            case 0:
                ((g0) obj).G2.G(i7 - 1);
                return;
            case 1:
                ((s) obj).Y1.G(i7 - 1);
                return;
            case 2:
                q8 q8Var = (q8) obj;
                org.telegram.ui.x7 x7Var = q8Var.h3;
                t8 t8Var = q8Var.j3;
                if (view instanceof r8) {
                    r8 r8Var = (r8) view;
                    if (!r8Var.d) {
                        p8 p8Var2 = r8Var.a;
                        q8Var.g3 = p8Var2.a;
                        t8Var.a.b(p8Var2, false);
                        if (x7Var != null) {
                            x7Var.f();
                        }
                        t8Var.s0();
                        return;
                    }
                }
                if (q8Var.g3 != 1 && (p8Var = q8Var.i3) != null) {
                    q8Var.g3 = 1;
                    t8Var.a.b(p8Var, true);
                    if (x7Var != null) {
                        x7Var.f();
                    }
                    t8Var.s0();
                    return;
                }
                if (t8Var.S != null) {
                    return;
                }
                if (!t8Var.a.w) {
                    t8Var.l0(true, true, true);
                }
                p8 p8Var3 = t8Var.a.h;
                boolean[] zArr = {false};
                org.telegram.messenger.g0.Z2(t8Var.getParentActivity(), t8Var.getClassGuid());
                org.telegram.messenger.c9 c9Var = new org.telegram.messenger.c9(t8Var, t8Var.getParentActivity());
                t8Var.S = c9Var;
                c9Var.N();
                t8Var.S.K0 = false;
                t8Var.h = true;
                t8Var.e.setBackground(new BitmapDrawable(t8Var.getParentActivity().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, t8Var.fragmentView)));
                t8Var.h = false;
                t8Var.e.setVisibility(0);
                t8Var.e.setAlpha(0.0f);
                t8Var.f = true;
                t8Var.fragmentView.invalidate();
                t8Var.e.animate().setListener(new i8(t8Var, 0)).alpha(1.0f).setDuration(200L).start();
                t8Var.Y = new p8();
                j8 j8Var = new j8(t8Var.getParentActivity(), false, new h8(t8Var, i17));
                p8 p8Var4 = t8Var.a.h;
                if (p8Var4 != null) {
                    p8 p8Var5 = t8Var.Y;
                    int i19 = p8Var4.f;
                    p8Var5.f = i19;
                    i10 = 3;
                    j8Var.e(i19, 3);
                    p8 p8Var6 = t8Var.Y;
                    int i20 = t8Var.a.h.e;
                    p8Var6.e = i20;
                    j8Var.e(i20, 2);
                    p8 p8Var7 = t8Var.Y;
                    int i21 = t8Var.a.h.d;
                    p8Var7.d = i21;
                    j8Var.e(i21, 1);
                    p8 p8Var8 = t8Var.Y;
                    int i22 = t8Var.a.h.c;
                    p8Var8.c = i22;
                    j8Var.e(i22, 0);
                } else {
                    i10 = 3;
                }
                p8 p8Var9 = t8Var.Y;
                j8Var.f(-1, 4, p8Var9.f != 0 ? 4 : p8Var9.e != 0 ? i10 : p8Var9.d != 0 ? 2 : 1, false);
                t8Var.a.b(t8Var.Y, true);
                t8Var.s0();
                LinearLayout linearLayout = new LinearLayout(t8Var.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                linearLayout.addView(j8Var);
                FrameLayout frameLayout = new FrameLayout(t8Var.getParentActivity());
                frameLayout.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 8.0f));
                TextView textView = new TextView(t8Var.getParentActivity());
                jg.g.v(textView, 1, 14.0f, null, 2131745538);
                textView.setGravity(17);
                textView.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
                frameLayout.addView(textView, c8.ha.e(-2, -2, 17));
                linearLayout.addView(frameLayout, c8.ha.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                frameLayout.setOnClickListener(new org.telegram.ui.ActionBar.l1(28, t8Var, zArr));
                org.telegram.messenger.c9 c9Var2 = t8Var.S;
                c9Var2.N = linearLayout;
                c9Var2.P0 = true;
                c9Var2.o0 = false;
                c9Var2.show();
                t8Var.isLightStatusBar();
                return;
            case 3:
                vo voVar2 = (vo) obj;
                qj0 qj0Var = voVar2.s1;
                to toVar = voVar2.n1;
                if (toVar.d.get(i7) == voVar2.C1 || voVar2.H1 != null) {
                    return;
                }
                voVar2.C1 = (uo) toVar.d.get(i7);
                voVar2.S0();
                toVar.E(i7);
                voVar2.b.postDelayed(new qe(voVar2, i7, 1), 100L);
                for (int i23 = 0; i23 < qj0Var.getChildCount(); i23++) {
                    a01 a01Var = (a01) qj0Var.getChildAt(i23);
                    if (a01Var != view && (kr0Var = a01Var.J) != null) {
                        org.telegram.messenger.g0.r(kr0Var);
                        a01Var.J.run();
                    }
                }
                if (!((uo) toVar.d.get(i7)).a.a) {
                    ((a01) view).d();
                }
                voVar2.Z0(true);
                return;
            case 4:
                oq oqVar = (oq) obj;
                qj0 qj0Var2 = oqVar.k1;
                if (i7 <= 3) {
                    return;
                }
                oqVar.V1 = (TLRPC.Peer) oqVar.Q1.get(i7 - 4);
                if (view instanceof org.telegram.ui.Cells.h4) {
                    z9 = true;
                    ((org.telegram.ui.Cells.h4) view).c(true, true);
                } else {
                    z9 = true;
                }
                int i24 = 0;
                while (i24 < qj0Var2.getChildCount()) {
                    View childAt = qj0Var2.getChildAt(i24);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.h4)) {
                        ((org.telegram.ui.Cells.h4) childAt).c(false, z9);
                    }
                    i24++;
                    z9 = true;
                }
                return;
            case 5:
                hy hyVar = ((qw) obj).F;
                int i25 = hyVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
                    ArrayList arrayList3 = org.telegram.messenger.ui.b0(i25).s0[1];
                    for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) arrayList3.get(i26);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i15 = i26;
                            }
                        }
                    }
                    org.telegram.messenger.ui.b0(i25).d1(true, true);
                    ru ruVar = new ru(f2Var, hyVar.getContext(), f2Var == null ? hyVar.Z1 : f2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        ruVar.F1 = i15;
                    }
                    if (f2Var != null) {
                        f2Var.showDialog(ruVar);
                        return;
                    } else {
                        ruVar.show();
                        return;
                    }
                }
                return;
            case 6:
                hy hyVar2 = ((yx) obj).w;
                hyVar2.t1.o(new u31(hyVar2.getContext(), new bw(hyVar2), hyVar2.x1, hyVar2.y1, hyVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), hyVar2.Z1));
                return;
            case 7:
                gz gzVar = (gz) obj;
                org.telegram.ui.yr yrVar = gzVar.q1;
                ArrayList arrayList4 = ((gz) gzVar.k1.e).r1;
                org.telegram.messenger.vo voVar3 = i7 < arrayList4.size() ? (org.telegram.messenger.vo) arrayList4.get(i7) : null;
                boolean z13 = view instanceof org.telegram.ui.ActionBar.o2 ? ((org.telegram.ui.ActionBar.o2) view).e : false;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) ((org.telegram.ui.w9) yrVar.b).b;
                ArrayList arrayList5 = ywVar.J2;
                ArrayList J0 = gz.J0(ywVar, voVar3, arrayList5, true, false);
                if (!z13) {
                    int size = J0.size() + (voVar3 != null ? voVar3.h.size() : 0);
                    if ((size > ywVar.getMessagesController().N4 && !ywVar.getUserConfig().q()) || size > ywVar.getMessagesController().O4) {
                        Context context = ywVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                        ywVar.showDialog(new ug.i0(4, i11, context, ywVar, null));
                        gzVar.dismiss();
                        return;
                    }
                }
                if (voVar3 == null) {
                    ywVar.presentFragment(new org.telegram.ui.iz(null, J0));
                } else if (z13) {
                    for (int i27 = 0; i27 < arrayList5.size(); i27++) {
                        voVar3.i.add((Long) arrayList5.get(i27));
                        voVar3.h.remove(arrayList5.get(i27));
                    }
                    org.telegram.messenger.vo voVar4 = voVar3;
                    org.telegram.ui.iz.z0(voVar4, voVar3.g, voVar3.b, voVar3.c, voVar3.n, voVar3.m, voVar3.h, voVar3.i, voVar3.j, false, false, true, true, false, ywVar, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView k42 = ywVar.k4();
                    if (k42 != null) {
                        k42.k(longValue, 21, Integer.valueOf(arrayList5.size()), voVar4, null, null);
                    }
                } else {
                    if (J0.isEmpty()) {
                        voVar = voVar3;
                    } else {
                        for (int i28 = 0; i28 < J0.size(); i28++) {
                            voVar3.i.remove(J0.get(i28));
                        }
                        voVar3.h.addAll(J0);
                        voVar = voVar3;
                        org.telegram.ui.iz.z0(voVar, voVar3.g, voVar3.b, voVar3.c, voVar3.n, voVar3.m, voVar3.h, voVar3.i, voVar3.j, false, false, true, true, false, ywVar, null);
                    }
                    long longValue2 = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                    org.telegram.messenger.vo voVar5 = voVar;
                    UndoView k43 = ywVar.k4();
                    if (k43 != null) {
                        k43.k(longValue2, 20, Integer.valueOf(J0.size()), voVar5, null, null);
                    }
                }
                ywVar.n4(true);
                gzVar.dismiss();
                return;
            case 8:
                wz wzVar = (wz) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = wzVar.o1;
                ArrayList arrayList6 = wzVar.Y1;
                ArrayList arrayList7 = wzVar.a2;
                if (!(view instanceof org.telegram.ui.Cells.h4) || (i12 = (i7 - 1) - wzVar.j2) < 0 || i12 >= arrayList6.size()) {
                    return;
                }
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList6.get(i12));
                if (!arrayList7.contains(Long.valueOf(o4))) {
                    z10 = false;
                    z11 = true;
                    arrayList7.add(Long.valueOf(o4));
                    ((org.telegram.ui.Cells.h4) view).c(true, true);
                } else {
                    if (wzVar.Z1.contains(Long.valueOf(o4))) {
                        int i29 = -wzVar.u2;
                        wzVar.u2 = i29;
                        org.telegram.messenger.g0.G3(i29, view, null);
                        org.telegram.messenger.p2.D.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o4 >= 0) {
                            arrayList8.add(f2Var2.getMessagesController().a2(Long.valueOf(o4)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat M0 = f2Var2.getMessagesController().M0(Long.valueOf(-o4));
                            String M02 = org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.id.M0(2131750676, null) : org.telegram.messenger.id.M0(2131750677, null);
                            arrayList8.add(M0);
                            str = M02;
                        }
                        if (wzVar.v2 != o4 || System.currentTimeMillis() - wzVar.w2 > 1500) {
                            wzVar.v2 = o4;
                            wzVar.w2 = System.currentTimeMillis();
                            cc g10 = new hc(wzVar.c2, null).g(str, arrayList8);
                            g10.j = 1500;
                            g10.j();
                            return;
                        }
                        return;
                    }
                    arrayList7.remove(Long.valueOf(o4));
                    z10 = false;
                    z11 = true;
                    ((org.telegram.ui.Cells.h4) view).c(false, true);
                }
                wzVar.h1(z11);
                wzVar.i1();
                wzVar.d1(z10);
                return;
            case 9:
                i20 i20Var = (i20) obj;
                if (i7 == i20Var.Z1) {
                    i20Var.X1.a.m1(true);
                    i20Var.dismiss();
                    return;
                } else {
                    if (view instanceof org.telegram.ui.Cells.a5) {
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                        if (i20Var.W1.contains(Long.valueOf(a5Var.getUserId()))) {
                            return;
                        }
                        i20Var.X1.a.p1(a5Var.getUserId(), true);
                        return;
                    }
                    return;
                }
            case 10:
                sh0 sh0Var = (sh0) obj;
                ArrayList arrayList9 = sh0Var.n;
                int d = sh0Var.f.d(i7);
                if (d == 0) {
                    rh0 rh0Var = sh0Var.E;
                    if (rh0Var != null) {
                        rh0Var.d(org.telegram.messenger.ij.B1(((TLRPC.MessagePeerReaction) arrayList9.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i7));
                        return;
                    }
                    return;
                }
                if (d != 1 || (ph0Var = sh0Var.G) == null) {
                    return;
                }
                ph0Var.j(sh0Var.I);
                return;
            case 11:
                ji0 ji0Var = (ji0) obj;
                ii0 ii0Var = ji0Var.g0;
                if (ii0Var == null || !(view instanceof hi0)) {
                    return;
                }
                ii0Var.i(ji0Var, ((hi0) view).e, false, false);
                return;
            case 12:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                no0 no0Var = ((ko0) obj).K;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(no0Var.a).i1.get(i7);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j10 = peer.user_id;
                if (j10 != 0) {
                    j3 = j10;
                } else {
                    long j11 = peer.channel_id;
                    if (j11 == 0) {
                        j11 = peer.chat_id;
                        if (j11 == 0) {
                            j3 = 0;
                        }
                    }
                    j3 = -j11;
                }
                if (o4Var.E) {
                    no0Var.Y0(j3, o4Var);
                    return;
                }
                tL_dialog.id = j3;
                no0Var.U0(null, tL_dialog);
                boolean z14 = no0Var.M1.h(j3) >= 0;
                if (o4Var.x) {
                    o4Var.w.a(z14, true);
                    return;
                }
                return;
            case 13:
                ct0 ct0Var = (ct0) obj;
                int i30 = i7 - 1;
                if (i30 < 0 || i30 >= org.telegram.messenger.sd.g()) {
                    return;
                }
                ct0Var.o1.d(ct0.J0(i30));
                ct0Var.dismiss();
                return;
            case 14:
                ju0 ju0Var = (ju0) obj;
                y31 G = ju0Var.P1.G(i7 - 1);
                Object obj2 = G != null ? G.G : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.qp.s1(ju0Var.a).x3(ju0Var.f1, (TLRPC.User) obj2, null, 0, null, false, false);
                    return;
                }
                return;
            case 15:
                av0 av0Var = (av0) obj;
                if (i7 < 1) {
                    av0Var.getClass();
                    return;
                }
                wu0[] wu0VarArr = av0Var.f3;
                if (wu0VarArr == null) {
                    return;
                }
                wu0 wu0Var = wu0VarArr[i7 - 1];
                int L = org.telegram.messenger.g0.L(64.0f);
                if (av0Var.getMeasuredWidth() - view.getRight() < L) {
                    av0Var.w0(L - (av0Var.getMeasuredWidth() - view.getRight()), 0, xq.h);
                } else if (view.getLeft() < L) {
                    av0Var.w0(-(L - view.getLeft()), 0, xq.h);
                }
                org.telegram.messenger.c20 c20Var = av0Var.u3;
                if (c20Var != null) {
                    c20Var.a(wu0Var);
                    return;
                }
                return;
            case 16:
                zv0 zv0Var = (zv0) obj;
                if (view instanceof tv0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
                    org.telegram.ui.ActionBar.f2 f2Var3 = zv0Var.C1;
                    org.telegram.ui.ActionBar.g6 g6Var = zv0Var.I0;
                    if (f2Var3 == null) {
                        return;
                    }
                    Context context2 = f2Var3.getContext();
                    if (!(f2Var3 instanceof org.telegram.ui.cn)) {
                        ew0.a(tL_messages_stickerSet, f2Var3, g6Var);
                        return;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, g6Var);
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    org.telegram.ui.Cells.f1.t(null, 2131744862, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                    arrayList11.add(0);
                    arrayList10.add(org.telegram.messenger.id.M0(2131744869, null));
                    arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                    arrayList11.add(1);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    di.d0 d0Var = new di.d0(g1Var, arrayList11, tL_messages_stickerSet, f2Var3, g6Var2, 11);
                    for (int i31 = 0; i31 < arrayList10.size(); i31++) {
                        org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i31)).intValue(), (CharSequence) arrayList10.get(i31), false, g6Var3);
                        g6Var2 = g6Var3;
                        c10.setTag(Integer.valueOf(i31));
                        c10.setOnClickListener(d0Var);
                    }
                    g1Var.c = 100;
                    g1Var.g = true;
                    g1Var.setOutsideTouchable(true);
                    g1Var.setClippingEnabled(true);
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    g1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    g1Var.setInputMethodMode(2);
                    g1Var.getContentView().setFocusableInTouchMode(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    g1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                    g1Var.b();
                    return;
                }
                if (zv0Var.I1) {
                    return;
                }
                if (zv0Var.N1 != null) {
                    TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) zv0Var.k1.f.get(i7);
                    if (stickerSetCovered4 != null) {
                        zv0Var.dismiss();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        new zv0(zv0Var.E1, zv0Var.C1, tL_inputStickerSetID2, null, null, zv0Var.I0).show();
                        return;
                    }
                    return;
                }
                ArrayList arrayList13 = zv0Var.P1;
                if (arrayList13 != null) {
                    if (i7 < 0 || i7 >= arrayList13.size()) {
                        return;
                    }
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) zv0Var.P1.get(i7);
                    zv0Var.L1 = zyVar;
                    if (zyVar.c) {
                        TextView textView2 = zv0Var.x1;
                        textView2.setText(org.telegram.messenger.i6.m(zyVar.b, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        zv0Var.w1.n(org.telegram.messenger.hc.g(zv0Var.L1.a), null, null, null, null, zv0Var.L1.e ? "tgs" : null, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zv0Var.t1.getLayoutParams();
                        layoutParams.topMargin = zv0Var.V1;
                        zv0Var.t1.setLayoutParams(layoutParams);
                        zv0Var.t1.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(zv0Var.t1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = zv0Var.J1;
                if (tL_messages_stickerSet2 == null || i7 < 0 || i7 >= tL_messages_stickerSet2.documents.size()) {
                    return;
                }
                zv0Var.K1 = zv0Var.J1.documents.get(i7);
                int i32 = 0;
                while (true) {
                    if (i32 < zv0Var.K1.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = zv0Var.K1.attributes.get(i32);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str2 = documentAttribute.alt;
                            if (str2 != null && str2.length() > 0) {
                                TextView textView3 = zv0Var.x1;
                                textView3.setText(org.telegram.messenger.i6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            i32++;
                        }
                    }
                }
                TextView textView4 = zv0Var.x1;
                String str3 = (String) org.telegram.messenger.ui.b0(zv0Var.a).c0.f(zv0Var.K1.id);
                textView4.setText(org.telegram.messenger.i6.m(str3 != null ? str3 : "", zv0Var.x1.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = zv0Var.J1;
                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.ms.p().x(view)) {
                    zv0Var.w1.getImageReceiver().t0(org.telegram.messenger.hc.b(zv0Var.K1), null, org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(zv0Var.K1.thumbs, 90, false, null, false), zv0Var.K1), null, "webp", zv0Var.J1, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zv0Var.t1.getLayoutParams();
                    layoutParams2.topMargin = zv0Var.V1;
                    zv0Var.t1.setLayoutParams(layoutParams2);
                    zv0Var.t1.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(zv0Var.t1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    return;
                }
                return;
            case 17:
                pw0 pw0Var = (pw0) obj;
                String str4 = ((ow0) view).a;
                if (!pw0Var.s || (nw0Var = pw0Var.c) == null || !(nw0Var.getFieldText() instanceof Spanned)) {
                    return;
                }
                if (pw0Var.V != null) {
                    intValue = ((Spanned) pw0Var.c.getFieldText()).getSpanStart(pw0Var.V);
                    intValue2 = ((Spanned) pw0Var.c.getFieldText()).getSpanEnd(pw0Var.V);
                } else {
                    Integer num = pw0Var.a0;
                    if (num == null || pw0Var.b0 == null) {
                        return;
                    }
                    intValue = num.intValue();
                    intValue2 = pw0Var.b0.intValue();
                    pw0Var.b0 = null;
                    pw0Var.a0 = null;
                }
                Editable editText = pw0Var.c.getEditText();
                if (editText == null || intValue < 0 || intValue2 < 0 || intValue > editText.length() || intValue2 > editText.length()) {
                    return;
                }
                if (pw0Var.V != null) {
                    if (pw0Var.c.getFieldText() instanceof Spannable) {
                        ((Spannable) pw0Var.c.getFieldText()).removeSpan(pw0Var.V);
                    }
                    pw0Var.V = null;
                }
                String obj3 = editText.toString();
                String substring = obj3.substring(intValue, intValue2);
                int length = substring.length();
                int i33 = intValue2 - length;
                while (i33 >= 0) {
                    int i34 = i33 + length;
                    if (obj3.substring(i33, i34).equals(substring)) {
                        Paint.FontMetricsInt fontMetricsInt2 = pw0Var.c.getEditField() != null ? pw0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                        if (fontMetricsInt2 == null) {
                            Paint paint = new Paint();
                            paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                            fontMetricsInt2 = paint.getFontMetricsInt();
                        }
                        if (str4 == null || !str4.startsWith("animated_")) {
                            m10 = org.telegram.messenger.i6.m(str4, fontMetricsInt2, z12, fontMetricsInt, i18);
                        } else {
                            try {
                                long parseLong = Long.parseLong(str4.substring(9));
                                TLRPC.Document e10 = i5.e(pw0Var.a, parseLong);
                                SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(e10));
                                spannableString.setSpan(e10 == null ? new r5(parseLong, fontMetricsInt2) : new r5(e10, fontMetricsInt2), 0, spannableString.length(), 33);
                                m10 = spannableString;
                            } catch (Exception unused) {
                                m10 = null;
                            }
                        }
                        if (m10 == null || ((r5VarArr = (r5[]) editText.getSpans(i33, i34, r5.class)) != null && r5VarArr.length > 0)) {
                            i13 = 3;
                            r12 = 1;
                            pw0Var.performHapticFeedback(i13, r12);
                            org.telegram.messenger.i6.a(str4);
                            pw0Var.s = false;
                            pw0Var.w = r12;
                            pw0Var.I = 0;
                            e5Var = pw0Var.d;
                            if (e5Var != null) {
                                e5Var.invalidate();
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) editText.getSpans(i33, i34, org.telegram.messenger.f6.class);
                        if (f6VarArr != null) {
                            for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                                editText.removeSpan(f6Var);
                            }
                        }
                        editText.replace(i33, i34, "");
                        editText.insert(i33, m10);
                        i33 -= length;
                        z12 = true;
                        i16 = 3;
                        fontMetricsInt = null;
                        i18 = 0;
                    } else {
                        i13 = i16;
                        r12 = z12;
                        pw0Var.performHapticFeedback(i13, r12);
                        org.telegram.messenger.i6.a(str4);
                        pw0Var.s = false;
                        pw0Var.w = r12;
                        pw0Var.I = 0;
                        e5Var = pw0Var.d;
                        if (e5Var != null) {
                        }
                    }
                }
                i13 = i16;
                r12 = z12;
                pw0Var.performHapticFeedback(i13, r12);
                org.telegram.messenger.i6.a(str4);
                pw0Var.s = false;
                pw0Var.w = r12;
                pw0Var.I = 0;
                e5Var = pw0Var.d;
                if (e5Var != null) {
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i7 == 0) {
                    return;
                }
                v4.g0 adapter = editorAlert.j1.getAdapter();
                rz0 rz0Var = editorAlert.o1;
                if (adapter == rz0Var) {
                    int i35 = i7 - 1;
                    ArrayList arrayList14 = rz0Var.d;
                    themeEditorView.e = (i35 < 0 || i35 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i35);
                } else {
                    sz0 sz0Var = editorAlert.p1;
                    int i36 = i7 - 1;
                    if (i36 < 0) {
                        sz0Var.getClass();
                    } else if (i36 < sz0Var.e.size()) {
                        arrayList = (ArrayList) sz0Var.e.get(i36);
                        themeEditorView.e = arrayList;
                    }
                    arrayList = null;
                    themeEditorView.e = arrayList;
                }
                themeEditorView.f = i7;
                for (int i37 = 0; i37 < themeEditorView.e.size(); i37++) {
                    org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) themeEditorView.e.get(i37);
                    int i38 = u6Var.e;
                    if (i38 == org.telegram.ui.ActionBar.l6.Be) {
                        final a8.r7 r7Var = themeEditorView.m;
                        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h((Activity) r7Var.c, false, 1, null);
                        h.O = org.telegram.messenger.id.M0(2131752123, null);
                        h.P = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131752113, null), org.telegram.messenger.id.M0(2131745656, null), org.telegram.messenger.id.M0(2131745663, null), org.telegram.messenger.id.M0(2131751600, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a71
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i39) {
                                a8.r7 r7Var2 = a8.r7.this;
                                b71 b71Var = (b71) r7Var2.e;
                                Activity activity = (Activity) r7Var2.c;
                                try {
                                    if (i39 != 0) {
                                        if (i39 == 1) {
                                            r7Var2.A();
                                            return;
                                        } else if (i39 == 2) {
                                            b71Var.a();
                                            return;
                                        } else {
                                            if (i39 == 3) {
                                                b71Var.b(null, null, false);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    try {
                                        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                        File q02 = org.telegram.messenger.g0.q0(null, false);
                                        if (q02 != null) {
                                            if (Build.VERSION.SDK_INT >= 24) {
                                                org.telegram.messenger.t0.d();
                                                intent.putExtra("output", FileProvider.d(activity, "org.telegram.messenger.beta.provider", q02));
                                                intent.addFlags(2);
                                                intent.addFlags(1);
                                            } else {
                                                intent.putExtra("output", Uri.fromFile(q02));
                                            }
                                            r7Var2.b = q02.getAbsolutePath();
                                        }
                                        activity.startActivityForResult(intent, 10);
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                            }
                        };
                        h.L = charSequenceArr;
                        h.M = null;
                        h.K = onClickListener;
                        h.show();
                        return;
                    }
                    int x02 = org.telegram.ui.ActionBar.l6.x0(u6Var.i, i38, false);
                    u6Var.h = x02;
                    if (i37 == 0) {
                        editorAlert.i1.c(x02);
                    }
                }
                editorAlert.L0(true);
                return;
            case 19:
                ArrayList arrayList15 = ((t01) obj).R;
                if (i7 < 0 || i7 >= arrayList15.size()) {
                    return;
                }
                ((p01) arrayList15.get(i7)).getClass();
                throw null;
            default:
                u31 u31Var = (u31) obj;
                v4.g0 adapter2 = u31Var.n.getAdapter();
                jg.d2 d2Var = u31Var.w;
                if (adapter2 == d2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) d2Var.K.get(i7);
                } else {
                    t31 t31Var = u31Var.s;
                    stickerSetCovered = i7 < t31Var.x ? (TLRPC.StickerSetCovered) t31Var.f.get(i7) : null;
                }
                if (stickerSetCovered != null) {
                    u31Var.b(stickerSetCovered.set, null);
                    return;
                }
                return;
        }
    }
}
