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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i7) {
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
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, View view) {
        int i10;
        m8 m8Var;
        ro0 ro0Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.so soVar;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        String str;
        sh0 sh0Var;
        long j3;
        TLRPC.StickerSet stickerSet2;
        pw0 pw0Var;
        int intValue;
        int intValue2;
        int i13;
        ?? r12;
        bi.g2 g2Var;
        CharSequence m10;
        p5[] p5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i14 = this.a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i18 = 0;
        boolean z13 = true;
        Object obj = this.b;
        switch (i14) {
            case 0:
                ((d0) obj).K2.G(i7 - 1);
                return;
            case 1:
                ((q) obj).c2.G(i7 - 1);
                return;
            case 2:
                n8 n8Var = (n8) obj;
                org.telegram.ui.y7 y7Var = n8Var.i3;
                q8 q8Var = n8Var.k3;
                if (view instanceof o8) {
                    o8 o8Var = (o8) view;
                    if (!o8Var.d) {
                        m8 m8Var2 = o8Var.a;
                        n8Var.h3 = m8Var2.a;
                        q8Var.a.b(m8Var2, false);
                        if (y7Var != null) {
                            y7Var.f();
                        }
                        q8Var.s0();
                        return;
                    }
                }
                if (n8Var.h3 != 1 && (m8Var = n8Var.j3) != null) {
                    n8Var.h3 = 1;
                    q8Var.a.b(m8Var, true);
                    if (y7Var != null) {
                        y7Var.f();
                    }
                    q8Var.s0();
                    return;
                }
                if (q8Var.T != null) {
                    return;
                }
                if (!q8Var.a.w) {
                    q8Var.l0(true, true, true);
                }
                m8 m8Var3 = q8Var.a.h;
                boolean[] zArr = {false};
                org.telegram.messenger.g0.Z2(q8Var.getParentActivity(), q8Var.getClassGuid());
                org.telegram.messenger.b9 b9Var = new org.telegram.messenger.b9(q8Var, q8Var.getParentActivity());
                q8Var.T = b9Var;
                b9Var.O();
                q8Var.T.L0 = false;
                q8Var.h = true;
                q8Var.e.setBackground(new BitmapDrawable(q8Var.getParentActivity().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, q8Var.fragmentView)));
                q8Var.h = false;
                q8Var.e.setVisibility(0);
                q8Var.e.setAlpha(0.0f);
                q8Var.f = true;
                q8Var.fragmentView.invalidate();
                q8Var.e.animate().setListener(new f8(q8Var, 0)).alpha(1.0f).setDuration(200L).start();
                q8Var.Z = new m8();
                g8 g8Var = new g8(q8Var.getParentActivity(), false, new e8(q8Var, i17));
                m8 m8Var4 = q8Var.a.h;
                if (m8Var4 != null) {
                    m8 m8Var5 = q8Var.Z;
                    int i19 = m8Var4.f;
                    m8Var5.f = i19;
                    i10 = 3;
                    g8Var.e(i19, 3);
                    m8 m8Var6 = q8Var.Z;
                    int i20 = q8Var.a.h.e;
                    m8Var6.e = i20;
                    g8Var.e(i20, 2);
                    m8 m8Var7 = q8Var.Z;
                    int i21 = q8Var.a.h.d;
                    m8Var7.d = i21;
                    g8Var.e(i21, 1);
                    m8 m8Var8 = q8Var.Z;
                    int i22 = q8Var.a.h.c;
                    m8Var8.c = i22;
                    g8Var.e(i22, 0);
                } else {
                    i10 = 3;
                }
                m8 m8Var9 = q8Var.Z;
                g8Var.f(-1, 4, m8Var9.f != 0 ? 4 : m8Var9.e != 0 ? i10 : m8Var9.d != 0 ? 2 : 1, false);
                q8Var.a.b(q8Var.Z, true);
                q8Var.s0();
                LinearLayout linearLayout = new LinearLayout(q8Var.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                linearLayout.addView(g8Var);
                FrameLayout frameLayout = new FrameLayout(q8Var.getParentActivity());
                frameLayout.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
                TextView textView = new TextView(q8Var.getParentActivity());
                i5.c.w(textView, 1, 14.0f, null, 2131745538);
                textView.setGravity(17);
                textView.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
                frameLayout.addView(textView, c8.ja.e(-2, -2, 17));
                linearLayout.addView(frameLayout, c8.ja.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                frameLayout.setOnClickListener(new n2(5, q8Var, zArr));
                org.telegram.messenger.b9 b9Var2 = q8Var.T;
                b9Var2.O = linearLayout;
                b9Var2.Q0 = true;
                b9Var2.p0 = false;
                b9Var2.show();
                q8Var.isLightStatusBar();
                return;
            case 3:
                ep epVar = (ep) obj;
                uj0 uj0Var = epVar.w1;
                cp cpVar = epVar.r1;
                if (cpVar.d.get(i7) == epVar.G1 || epVar.L1 != null) {
                    return;
                }
                epVar.G1 = (dp) cpVar.d.get(i7);
                epVar.S0();
                cpVar.E(i7);
                epVar.b.postDelayed(new ne(epVar, i7, 1), 100L);
                for (int i23 = 0; i23 < uj0Var.getChildCount(); i23++) {
                    b01 b01Var = (b01) uj0Var.getChildAt(i23);
                    if (b01Var != view && (ro0Var = b01Var.K) != null) {
                        org.telegram.messenger.g0.r(ro0Var);
                        b01Var.K.run();
                    }
                }
                if (!((dp) cpVar.d.get(i7)).a.a) {
                    ((b01) view).d();
                }
                epVar.Z0(true);
                return;
            case 4:
                vq vqVar = (vq) obj;
                uj0 uj0Var2 = vqVar.o1;
                if (i7 <= 3) {
                    return;
                }
                vqVar.Z1 = (TLRPC.Peer) vqVar.U1.get(i7 - 4);
                if (view instanceof org.telegram.ui.Cells.h4) {
                    z10 = true;
                    ((org.telegram.ui.Cells.h4) view).c(true, true);
                } else {
                    z10 = true;
                }
                int i24 = 0;
                while (i24 < uj0Var2.getChildCount()) {
                    View childAt = uj0Var2.getChildAt(i24);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.h4)) {
                        ((org.telegram.ui.Cells.h4) childAt).c(false, z10);
                    }
                    i24++;
                    z10 = true;
                }
                return;
            case 5:
                ly lyVar = ((vw) obj).G;
                int i25 = lyVar.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
                    ArrayList arrayList3 = org.telegram.messenger.si.b0(i25).t0[1];
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
                    org.telegram.messenger.si.b0(i25).d1(true, true);
                    wu wuVar = new wu(e2Var, lyVar.getContext(), e2Var == null ? lyVar.a2 : e2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        wuVar.J1 = i15;
                    }
                    if (e2Var != null) {
                        e2Var.showDialog(wuVar);
                        return;
                    } else {
                        wuVar.show();
                        return;
                    }
                }
                return;
            case 6:
                ly lyVar2 = ((dy) obj).w;
                lyVar2.u1.o(new x31(lyVar2.getContext(), new gw(lyVar2), lyVar2.y1, lyVar2.z1, lyVar2.A1, (TLRPC.StickerSetCovered) view.getTag(), lyVar2.a2));
                return;
            case 7:
                jz jzVar = (jz) obj;
                org.telegram.ui.zr zrVar = jzVar.u1;
                ArrayList arrayList4 = ((jz) jzVar.o1.e).v1;
                org.telegram.messenger.so soVar2 = i7 < arrayList4.size() ? (org.telegram.messenger.so) arrayList4.get(i7) : null;
                boolean z14 = view instanceof org.telegram.ui.ActionBar.n2 ? ((org.telegram.ui.ActionBar.n2) view).e : false;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) ((org.telegram.ui.p9) zrVar.b).b;
                ArrayList arrayList5 = ywVar.K2;
                ArrayList J0 = jz.J0(ywVar, soVar2, arrayList5, true, false);
                if (!z14) {
                    int size = J0.size() + (soVar2 != null ? soVar2.h.size() : 0);
                    if ((size > ywVar.getMessagesController().O4 && !ywVar.getUserConfig().q()) || size > ywVar.getMessagesController().P4) {
                        Context context = ywVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        ywVar.showDialog(new ug.j0(4, i11, context, ywVar, null));
                        jzVar.dismiss();
                        return;
                    }
                }
                if (soVar2 == null) {
                    ywVar.presentFragment(new org.telegram.ui.hz(null, J0));
                } else if (z14) {
                    for (int i27 = 0; i27 < arrayList5.size(); i27++) {
                        soVar2.i.add((Long) arrayList5.get(i27));
                        soVar2.h.remove(arrayList5.get(i27));
                    }
                    org.telegram.messenger.so soVar3 = soVar2;
                    org.telegram.ui.hz.z0(soVar3, soVar2.g, soVar2.b, soVar2.c, soVar2.n, soVar2.m, soVar2.h, soVar2.i, soVar2.j, false, false, true, true, false, ywVar, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView k42 = ywVar.k4();
                    if (k42 != null) {
                        k42.k(longValue, 21, Integer.valueOf(arrayList5.size()), soVar3, null, null);
                    }
                } else {
                    if (J0.isEmpty()) {
                        soVar = soVar2;
                    } else {
                        for (int i28 = 0; i28 < J0.size(); i28++) {
                            soVar2.i.remove(J0.get(i28));
                        }
                        soVar2.h.addAll(J0);
                        soVar = soVar2;
                        org.telegram.ui.hz.z0(soVar, soVar2.g, soVar2.b, soVar2.c, soVar2.n, soVar2.m, soVar2.h, soVar2.i, soVar2.j, false, false, true, true, false, ywVar, null);
                    }
                    long longValue2 = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                    org.telegram.messenger.so soVar4 = soVar;
                    UndoView k43 = ywVar.k4();
                    if (k43 != null) {
                        k43.k(longValue2, 20, Integer.valueOf(J0.size()), soVar4, null, null);
                    }
                }
                ywVar.n4(true);
                jzVar.dismiss();
                return;
            case 8:
                zz zzVar = (zz) obj;
                org.telegram.ui.ActionBar.e2 e2Var2 = zzVar.s1;
                ArrayList arrayList6 = zzVar.c2;
                ArrayList arrayList7 = zzVar.e2;
                if (!(view instanceof org.telegram.ui.Cells.h4) || (i12 = (i7 - 1) - zzVar.n2) < 0 || i12 >= arrayList6.size()) {
                    return;
                }
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList6.get(i12));
                if (!arrayList7.contains(Long.valueOf(o4))) {
                    z11 = false;
                    z12 = true;
                    arrayList7.add(Long.valueOf(o4));
                    ((org.telegram.ui.Cells.h4) view).c(true, true);
                } else {
                    if (zzVar.d2.contains(Long.valueOf(o4))) {
                        int i29 = -zzVar.y2;
                        zzVar.y2 = i29;
                        org.telegram.messenger.g0.F3(i29, view, null);
                        org.telegram.messenger.p2.E.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o4 >= 0) {
                            arrayList8.add(e2Var2.getMessagesController().a2(Long.valueOf(o4)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat M0 = e2Var2.getMessagesController().M0(Long.valueOf(-o4));
                            String M02 = org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.hd.M0(2131750676, null) : org.telegram.messenger.hd.M0(2131750677, null);
                            arrayList8.add(M0);
                            str = M02;
                        }
                        if (zzVar.z2 != o4 || System.currentTimeMillis() - zzVar.A2 > 1500) {
                            zzVar.z2 = o4;
                            zzVar.A2 = System.currentTimeMillis();
                            xb g10 = new cc(zzVar.g2, null).g(str, arrayList8);
                            g10.j = 1500;
                            g10.j();
                            return;
                        }
                        return;
                    }
                    arrayList7.remove(Long.valueOf(o4));
                    z11 = false;
                    z12 = true;
                    ((org.telegram.ui.Cells.h4) view).c(false, true);
                }
                zzVar.h1(z12);
                zzVar.i1();
                zzVar.d1(z11);
                return;
            case 9:
                k20 k20Var = (k20) obj;
                if (i7 == k20Var.d2) {
                    k20Var.b2.a.m1(true);
                    k20Var.dismiss();
                    return;
                } else {
                    if (view instanceof org.telegram.ui.Cells.a5) {
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                        if (k20Var.a2.contains(Long.valueOf(a5Var.getUserId()))) {
                            return;
                        }
                        k20Var.b2.a.p1(a5Var.getUserId(), true);
                        return;
                    }
                    return;
                }
            case 10:
                vh0 vh0Var = (vh0) obj;
                ArrayList arrayList9 = vh0Var.n;
                int d = vh0Var.f.d(i7);
                if (d == 0) {
                    uh0 uh0Var = vh0Var.F;
                    if (uh0Var != null) {
                        uh0Var.a(org.telegram.messenger.gj.B1(((TLRPC.MessagePeerReaction) arrayList9.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i7));
                        return;
                    }
                    return;
                }
                if (d != 1 || (sh0Var = vh0Var.H) == null) {
                    return;
                }
                sh0Var.d(vh0Var.J);
                return;
            case 11:
                mi0 mi0Var = (mi0) obj;
                li0 li0Var = mi0Var.h0;
                if (li0Var == null || !(view instanceof ki0)) {
                    return;
                }
                li0Var.h(mi0Var, ((ki0) view).e, false, false);
                return;
            case 12:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                po0 po0Var = ((mo0) obj).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.si.b0(po0Var.a).j1.get(i7);
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
                if (o4Var.F) {
                    po0Var.Y0(j3, o4Var);
                    return;
                }
                tL_dialog.id = j3;
                po0Var.U0(null, tL_dialog);
                boolean z15 = po0Var.Q1.h(j3) >= 0;
                if (o4Var.x) {
                    o4Var.w.a(z15, true);
                    return;
                }
                return;
            case 13:
                bt0 bt0Var = (bt0) obj;
                int i30 = i7 - 1;
                if (i30 < 0 || i30 >= org.telegram.messenger.rd.g()) {
                    return;
                }
                bt0Var.s1.c(bt0.J0(i30));
                bt0Var.dismiss();
                return;
            case 14:
                iu0 iu0Var = (iu0) obj;
                b41 G = iu0Var.T1.G(i7 - 1);
                Object obj2 = G != null ? G.G : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.np.s1(iu0Var.a).x3(iu0Var.j1, (TLRPC.User) obj2, null, 0, null, false, false);
                    return;
                }
                return;
            case 15:
                av0 av0Var = (av0) obj;
                if (i7 < 1) {
                    av0Var.getClass();
                    return;
                }
                wu0[] wu0VarArr = av0Var.g3;
                if (wu0VarArr == null) {
                    return;
                }
                wu0 wu0Var = wu0VarArr[i7 - 1];
                int L = org.telegram.messenger.g0.L(64.0f);
                if (av0Var.getMeasuredWidth() - view.getRight() < L) {
                    av0Var.w0(L - (av0Var.getMeasuredWidth() - view.getRight()), 0, er.h);
                } else if (view.getLeft() < L) {
                    av0Var.w0(-(L - view.getLeft()), 0, er.h);
                }
                org.telegram.messenger.z10 z10Var = av0Var.v3;
                if (z10Var != null) {
                    z10Var.a(wu0Var);
                    return;
                }
                return;
            case 16:
                bw0 bw0Var = (bw0) obj;
                if (view instanceof uv0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
                    org.telegram.ui.ActionBar.e2 e2Var3 = bw0Var.G1;
                    org.telegram.ui.ActionBar.e6 e6Var = bw0Var.J0;
                    if (e2Var3 == null) {
                        return;
                    }
                    Context context2 = e2Var3.getContext();
                    if (!(e2Var3 instanceof org.telegram.ui.an)) {
                        gw0.a(tL_messages_stickerSet, e2Var3, e6Var);
                        return;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, e6Var);
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    org.telegram.ui.Cells.y0.s(null, 2131744862, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                    arrayList11.add(0);
                    arrayList10.add(org.telegram.messenger.hd.M0(2131744869, null));
                    arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                    arrayList11.add(1);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    fi.d0 d0Var = new fi.d0(g1Var, arrayList11, tL_messages_stickerSet, e2Var3, e6Var2, 11);
                    for (int i31 = 0; i31 < arrayList10.size(); i31++) {
                        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i31)).intValue(), (CharSequence) arrayList10.get(i31), false, e6Var3);
                        e6Var2 = e6Var3;
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
                if (bw0Var.M1) {
                    return;
                }
                if (bw0Var.R1 != null) {
                    TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) bw0Var.o1.f.get(i7);
                    if (stickerSetCovered4 != null) {
                        bw0Var.dismiss();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        new bw0(bw0Var.I1, bw0Var.G1, tL_inputStickerSetID2, null, null, bw0Var.J0).show();
                        return;
                    }
                    return;
                }
                ArrayList arrayList13 = bw0Var.T1;
                if (arrayList13 != null) {
                    if (i7 < 0 || i7 >= arrayList13.size()) {
                        return;
                    }
                    org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) bw0Var.T1.get(i7);
                    bw0Var.P1 = xyVar;
                    if (xyVar.c) {
                        TextView textView2 = bw0Var.B1;
                        textView2.setText(org.telegram.messenger.j6.m(xyVar.b, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        bw0Var.A1.n(org.telegram.messenger.gc.g(bw0Var.P1.a), null, null, null, null, bw0Var.P1.e ? "tgs" : null, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bw0Var.x1.getLayoutParams();
                        layoutParams.topMargin = bw0Var.Z1;
                        bw0Var.x1.setLayoutParams(layoutParams);
                        bw0Var.x1.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(bw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = bw0Var.N1;
                if (tL_messages_stickerSet2 == null || i7 < 0 || i7 >= tL_messages_stickerSet2.documents.size()) {
                    return;
                }
                bw0Var.O1 = bw0Var.N1.documents.get(i7);
                int i32 = 0;
                while (true) {
                    if (i32 < bw0Var.O1.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = bw0Var.O1.attributes.get(i32);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str2 = documentAttribute.alt;
                            if (str2 != null && str2.length() > 0) {
                                TextView textView3 = bw0Var.B1;
                                textView3.setText(org.telegram.messenger.j6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            i32++;
                        }
                    }
                }
                TextView textView4 = bw0Var.B1;
                String str3 = (String) org.telegram.messenger.si.b0(bw0Var.a).d0.f(bw0Var.O1.id);
                textView4.setText(org.telegram.messenger.j6.m(str3 != null ? str3 : "", bw0Var.B1.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = bw0Var.N1;
                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.ns.p().x(view)) {
                    bw0Var.A1.getImageReceiver().t0(org.telegram.messenger.gc.b(bw0Var.O1), null, org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(bw0Var.O1.thumbs, 90, false, null, false), bw0Var.O1), null, "webp", bw0Var.N1, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bw0Var.x1.getLayoutParams();
                    layoutParams2.topMargin = bw0Var.Z1;
                    bw0Var.x1.setLayoutParams(layoutParams2);
                    bw0Var.x1.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(bw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    return;
                }
                return;
            case 17:
                rw0 rw0Var = (rw0) obj;
                String str4 = ((qw0) view).a;
                if (!rw0Var.s || (pw0Var = rw0Var.c) == null || !(pw0Var.getFieldText() instanceof Spanned)) {
                    return;
                }
                if (rw0Var.W != null) {
                    intValue = ((Spanned) rw0Var.c.getFieldText()).getSpanStart(rw0Var.W);
                    intValue2 = ((Spanned) rw0Var.c.getFieldText()).getSpanEnd(rw0Var.W);
                } else {
                    Integer num = rw0Var.b0;
                    if (num == null || rw0Var.c0 == null) {
                        return;
                    }
                    intValue = num.intValue();
                    intValue2 = rw0Var.c0.intValue();
                    rw0Var.c0 = null;
                    rw0Var.b0 = null;
                }
                Editable editText = rw0Var.c.getEditText();
                if (editText == null || intValue < 0 || intValue2 < 0 || intValue > editText.length() || intValue2 > editText.length()) {
                    return;
                }
                if (rw0Var.W != null) {
                    if (rw0Var.c.getFieldText() instanceof Spannable) {
                        ((Spannable) rw0Var.c.getFieldText()).removeSpan(rw0Var.W);
                    }
                    rw0Var.W = null;
                }
                String obj3 = editText.toString();
                String substring = obj3.substring(intValue, intValue2);
                int length = substring.length();
                int i33 = intValue2 - length;
                while (i33 >= 0) {
                    int i34 = i33 + length;
                    if (obj3.substring(i33, i34).equals(substring)) {
                        Paint.FontMetricsInt fontMetricsInt2 = rw0Var.c.getEditField() != null ? rw0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                        if (fontMetricsInt2 == null) {
                            Paint paint = new Paint();
                            paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                            fontMetricsInt2 = paint.getFontMetricsInt();
                        }
                        if (str4 == null || !str4.startsWith("animated_")) {
                            m10 = org.telegram.messenger.j6.m(str4, fontMetricsInt2, z13, fontMetricsInt, i18);
                        } else {
                            try {
                                long parseLong = Long.parseLong(str4.substring(9));
                                TLRPC.Document e10 = g5.e(rw0Var.a, parseLong);
                                SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(e10));
                                spannableString.setSpan(e10 == null ? new p5(parseLong, fontMetricsInt2) : new p5(e10, fontMetricsInt2), 0, spannableString.length(), 33);
                                m10 = spannableString;
                            } catch (Exception unused) {
                                m10 = null;
                            }
                        }
                        if (m10 == null || ((p5VarArr = (p5[]) editText.getSpans(i33, i34, p5.class)) != null && p5VarArr.length > 0)) {
                            i13 = 3;
                            r12 = 1;
                            rw0Var.performHapticFeedback(i13, r12);
                            org.telegram.messenger.j6.a(str4);
                            rw0Var.s = false;
                            rw0Var.w = r12;
                            rw0Var.J = 0;
                            g2Var = rw0Var.d;
                            if (g2Var != null) {
                                g2Var.invalidate();
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) editText.getSpans(i33, i34, org.telegram.messenger.g6.class);
                        if (g6VarArr != null) {
                            for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                                editText.removeSpan(g6Var);
                            }
                        }
                        editText.replace(i33, i34, "");
                        editText.insert(i33, m10);
                        i33 -= length;
                        z13 = true;
                        i16 = 3;
                        fontMetricsInt = null;
                        i18 = 0;
                    } else {
                        i13 = i16;
                        r12 = z13;
                        rw0Var.performHapticFeedback(i13, r12);
                        org.telegram.messenger.j6.a(str4);
                        rw0Var.s = false;
                        rw0Var.w = r12;
                        rw0Var.J = 0;
                        g2Var = rw0Var.d;
                        if (g2Var != null) {
                        }
                    }
                }
                i13 = i16;
                r12 = z13;
                rw0Var.performHapticFeedback(i13, r12);
                org.telegram.messenger.j6.a(str4);
                rw0Var.s = false;
                rw0Var.w = r12;
                rw0Var.J = 0;
                g2Var = rw0Var.d;
                if (g2Var != null) {
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i7 == 0) {
                    return;
                }
                v4.h0 adapter = editorAlert.n1.getAdapter();
                sz0 sz0Var = editorAlert.s1;
                if (adapter == sz0Var) {
                    int i35 = i7 - 1;
                    ArrayList arrayList14 = sz0Var.d;
                    themeEditorView.e = (i35 < 0 || i35 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i35);
                } else {
                    tz0 tz0Var = editorAlert.t1;
                    int i36 = i7 - 1;
                    if (i36 < 0) {
                        tz0Var.getClass();
                    } else if (i36 < tz0Var.e.size()) {
                        arrayList = (ArrayList) tz0Var.e.get(i36);
                        themeEditorView.e = arrayList;
                    }
                    arrayList = null;
                    themeEditorView.e = arrayList;
                }
                themeEditorView.f = i7;
                for (int i37 = 0; i37 < themeEditorView.e.size(); i37++) {
                    org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) themeEditorView.e.get(i37);
                    int i38 = s6Var.e;
                    if (i38 == org.telegram.ui.ActionBar.j6.Ee) {
                        final a8.r7 r7Var = themeEditorView.m;
                        org.telegram.ui.ActionBar.u2 i39 = org.telegram.messenger.i20.i((Activity) r7Var.c, false, 1, null);
                        i39.P = org.telegram.messenger.hd.M0(2131752123, null);
                        i39.Q = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131752113, null), org.telegram.messenger.hd.M0(2131745656, null), org.telegram.messenger.hd.M0(2131745663, null), org.telegram.messenger.hd.M0(2131751600, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a71
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i40) {
                                a8.r7 r7Var2 = a8.r7.this;
                                b71 b71Var = (b71) r7Var2.e;
                                Activity activity = (Activity) r7Var2.c;
                                try {
                                    if (i40 != 0) {
                                        if (i40 == 1) {
                                            r7Var2.A();
                                            return;
                                        } else if (i40 == 2) {
                                            b71Var.a();
                                            return;
                                        } else {
                                            if (i40 == 3) {
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
                        i39.M = charSequenceArr;
                        i39.N = null;
                        i39.L = onClickListener;
                        i39.show();
                        return;
                    }
                    int x02 = org.telegram.ui.ActionBar.j6.x0(s6Var.i, i38, false);
                    s6Var.h = x02;
                    if (i37 == 0) {
                        editorAlert.m1.c(x02);
                    }
                }
                editorAlert.L0(true);
                return;
            case 19:
                ArrayList arrayList15 = ((v01) obj).S;
                if (i7 < 0 || i7 >= arrayList15.size()) {
                    return;
                }
                ((r01) arrayList15.get(i7)).getClass();
                throw null;
            default:
                x31 x31Var = (x31) obj;
                v4.h0 adapter2 = x31Var.n.getAdapter();
                jg.c2 c2Var = x31Var.w;
                if (adapter2 == c2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) c2Var.L.get(i7);
                } else {
                    w31 w31Var = x31Var.s;
                    stickerSetCovered = i7 < w31Var.x ? (TLRPC.StickerSetCovered) w31Var.f.get(i7) : null;
                }
                if (stickerSetCovered != null) {
                    x31Var.b(stickerSetCovered.set, null);
                    return;
                }
                return;
        }
    }
}
