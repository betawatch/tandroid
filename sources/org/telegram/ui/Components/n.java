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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:87|(3:89|(1:91)|92)|93|(2:95|(5:97|(1:99)(1:141)|(1:101)|(1:140)(5:105|106|107|(1:109)(1:137)|110)|(5:117|118|119|120|(1:122))(3:127|(3:129|(2:132|130)|133)(1:135)|134))(6:142|143|118|119|120|(0)(0)))|144|143|118|119|120|(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ae  */
    /* JADX WARN: Type inference failed for: r10v34, types: [android.view.View, org.telegram.ui.Components.zw0] */
    /* JADX WARN: Type inference failed for: r11v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r9v29, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r9v34 */
    @Override // org.telegram.ui.Components.qj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, View view) {
        int i10;
        int i11;
        int i12;
        t8 t8Var;
        bp0 bp0Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.ro roVar;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        String str;
        di0 di0Var;
        long j3;
        TLRPC.StickerSet stickerSet2;
        xw0 xw0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r12;
        bi.g3 g3Var;
        CharSequence m10;
        x5[] x5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i16 = this.a;
        int i17 = 17;
        int i18 = 3;
        int i19 = 2;
        int i20 = 0;
        boolean z13 = true;
        Object obj = this.b;
        switch (i16) {
            case 0:
                ((m0) obj).P2.G(i7 - 1);
                break;
            case 1:
                ((v) obj).c2.G(i7 - 1);
                break;
            case 2:
                u8 u8Var = (u8) obj;
                org.telegram.ui.z7 z7Var = u8Var.i3;
                x8 x8Var = u8Var.k3;
                if (view instanceof v8) {
                    v8 v8Var = (v8) view;
                    if (!v8Var.d) {
                        t8 t8Var2 = v8Var.a;
                        u8Var.h3 = t8Var2.a;
                        x8Var.a.b(t8Var2, false);
                        if (z7Var != null) {
                            z7Var.f();
                        }
                        x8Var.s0();
                        break;
                    }
                }
                if (u8Var.h3 != 1 && (t8Var = u8Var.j3) != null) {
                    u8Var.h3 = 1;
                    x8Var.a.b(t8Var, true);
                    if (z7Var != null) {
                        z7Var.f();
                    }
                    x8Var.s0();
                    break;
                } else if (x8Var.T == null) {
                    if (!x8Var.a.w) {
                        x8Var.l0(true, true, true);
                    }
                    t8 t8Var3 = x8Var.a.h;
                    boolean[] zArr = {false};
                    org.telegram.messenger.g0.Y2(x8Var.getParentActivity(), x8Var.getClassGuid());
                    org.telegram.messenger.b9 b9Var = new org.telegram.messenger.b9(x8Var, x8Var.getParentActivity());
                    x8Var.T = b9Var;
                    b9Var.O();
                    x8Var.T.L0 = false;
                    x8Var.h = true;
                    x8Var.e.setBackground(new BitmapDrawable(x8Var.getParentActivity().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, x8Var.fragmentView)));
                    x8Var.h = false;
                    x8Var.e.setVisibility(0);
                    x8Var.e.setAlpha(0.0f);
                    x8Var.f = true;
                    x8Var.fragmentView.invalidate();
                    x8Var.e.animate().setListener(new m8(x8Var, 0)).alpha(1.0f).setDuration(200L).start();
                    x8Var.Z = new t8();
                    n8 n8Var = new n8(x8Var.getParentActivity(), false, new k8(x8Var, i19));
                    t8 t8Var4 = x8Var.a.h;
                    if (t8Var4 != null) {
                        t8 t8Var5 = x8Var.Z;
                        int i21 = t8Var4.f;
                        t8Var5.f = i21;
                        i10 = 3;
                        n8Var.e(i21, 3);
                        t8 t8Var6 = x8Var.Z;
                        int i22 = x8Var.a.h.e;
                        t8Var6.e = i22;
                        n8Var.e(i22, 2);
                        t8 t8Var7 = x8Var.Z;
                        int i23 = x8Var.a.h.d;
                        t8Var7.d = i23;
                        n8Var.e(i23, 1);
                        t8 t8Var8 = x8Var.Z;
                        int i24 = x8Var.a.h.c;
                        t8Var8.c = i24;
                        n8Var.e(i24, 0);
                    } else {
                        i10 = 3;
                    }
                    t8 t8Var9 = x8Var.Z;
                    if (t8Var9.f != 0) {
                        i12 = 4;
                    } else if (t8Var9.e != 0) {
                        i12 = i10;
                    } else if (t8Var9.d == 0) {
                        i11 = -1;
                        i12 = 1;
                        n8Var.f(i11, 4, i12, false);
                        x8Var.a.b(x8Var.Z, true);
                        x8Var.s0();
                        ?? linearLayout = new LinearLayout(x8Var.getParentActivity());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                        linearLayout.addView(n8Var);
                        FrameLayout frameLayout = new FrameLayout(x8Var.getParentActivity());
                        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
                        TextView textView = new TextView(x8Var.getParentActivity());
                        i5.c.r(14.0f, 1, 2131745342, textView, null);
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
                        frameLayout.addView(textView, c8.na.e(-2, -2, 17));
                        linearLayout.addView(frameLayout, c8.na.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                        frameLayout.setOnClickListener(new l8(0, x8Var, zArr));
                        org.telegram.messenger.b9 b9Var2 = x8Var.T;
                        b9Var2.O = linearLayout;
                        b9Var2.Q0 = true;
                        b9Var2.p0 = false;
                        b9Var2.show();
                        x8Var.isLightStatusBar();
                        break;
                    } else {
                        i12 = 2;
                    }
                    i11 = -1;
                    n8Var.f(i11, 4, i12, false);
                    x8Var.a.b(x8Var.Z, true);
                    x8Var.s0();
                    ?? linearLayout2 = new LinearLayout(x8Var.getParentActivity());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                    linearLayout2.addView(n8Var);
                    FrameLayout frameLayout2 = new FrameLayout(x8Var.getParentActivity());
                    frameLayout2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
                    TextView textView2 = new TextView(x8Var.getParentActivity());
                    i5.c.r(14.0f, 1, 2131745342, textView2, null);
                    textView2.setGravity(17);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, null);
                    frameLayout2.addView(textView2, c8.na.e(-2, -2, 17));
                    linearLayout2.addView(frameLayout2, c8.na.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout2.setOnClickListener(new l8(0, x8Var, zArr));
                    org.telegram.messenger.b9 b9Var22 = x8Var.T;
                    b9Var22.O = linearLayout2;
                    b9Var22.Q0 = true;
                    b9Var22.p0 = false;
                    b9Var22.show();
                    x8Var.isLightStatusBar();
                }
                break;
            case 3:
                kp kpVar = (kp) obj;
                ek0 ek0Var = kpVar.w1;
                ip ipVar = kpVar.r1;
                if (ipVar.d.get(i7) != kpVar.G1 && kpVar.L1 == null) {
                    kpVar.G1 = (jp) ipVar.d.get(i7);
                    kpVar.T0();
                    ipVar.E(i7);
                    kpVar.b.postDelayed(new xe(kpVar, i7, 1), 100L);
                    for (int i25 = 0; i25 < ek0Var.getChildCount(); i25++) {
                        j01 j01Var = (j01) ek0Var.getChildAt(i25);
                        if (j01Var != view && (bp0Var = j01Var.K) != null) {
                            org.telegram.messenger.g0.r(bp0Var);
                            j01Var.K.run();
                        }
                    }
                    if (!((jp) ipVar.d.get(i7)).a.a) {
                        ((j01) view).d();
                    }
                    kpVar.a1(true);
                    break;
                }
                break;
            case 4:
                br brVar = (br) obj;
                ek0 ek0Var2 = brVar.o1;
                if (i7 > 3) {
                    brVar.Z1 = (TLRPC.Peer) brVar.U1.get(i7 - 4);
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.i4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i26 = 0;
                    while (i26 < ek0Var2.getChildCount()) {
                        View childAt = ek0Var2.getChildAt(i26);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.i4)) {
                            ((org.telegram.ui.Cells.i4) childAt).c(false, z10);
                        }
                        i26++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                qy qyVar = ((ax) obj).G;
                int i27 = qyVar.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
                    ArrayList arrayList3 = org.telegram.messenger.ri.d0(i27).t0[1];
                    int i28 = -1;
                    for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) arrayList3.get(i29);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i28 = i29;
                            }
                        }
                    }
                    org.telegram.messenger.ri.d0(i27).g1(true, true);
                    bv bvVar = new bv(g2Var, qyVar.getContext(), g2Var == null ? qyVar.a2 : g2Var.getResourceProvider(), arrayList2);
                    if (i28 >= 0) {
                        bvVar.J1 = i28;
                    }
                    if (g2Var != null) {
                        g2Var.showDialog(bvVar);
                        break;
                    } else {
                        bvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                qy qyVar2 = ((iy) obj).w;
                qyVar2.u1.o(new j41(qyVar2.getContext(), new lw(qyVar2), qyVar2.y1, qyVar2.z1, qyVar2.A1, (TLRPC.StickerSetCovered) view.getTag(), qyVar2.a2));
                break;
            case 7:
                pz pzVar = (pz) obj;
                org.telegram.ui.zr zrVar = pzVar.u1;
                ArrayList arrayList4 = ((pz) pzVar.o1.e).v1;
                org.telegram.messenger.ro roVar2 = i7 < arrayList4.size() ? (org.telegram.messenger.ro) arrayList4.get(i7) : null;
                boolean z14 = view instanceof org.telegram.ui.ActionBar.p2 ? ((org.telegram.ui.ActionBar.p2) view).e : false;
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) ((org.telegram.ui.cv) zrVar.b).b;
                ArrayList arrayList5 = bxVar.K2;
                ArrayList K0 = pz.K0(bxVar, roVar2, arrayList5, true, false);
                if (!z14) {
                    int size = K0.size() + (roVar2 != null ? roVar2.h.size() : 0);
                    if ((size > bxVar.getMessagesController().Q4 && !bxVar.getUserConfig().q()) || size > bxVar.getMessagesController().R4) {
                        Context context = bxVar.fragmentView.getContext();
                        i13 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                        bxVar.showDialog(new ug.k0(4, i13, context, bxVar, null));
                        pzVar.dismiss();
                        break;
                    }
                }
                if (roVar2 == null) {
                    bxVar.presentFragment(new org.telegram.ui.jz(null, K0));
                } else if (z14) {
                    for (int i30 = 0; i30 < arrayList5.size(); i30++) {
                        roVar2.i.add((Long) arrayList5.get(i30));
                        roVar2.h.remove(arrayList5.get(i30));
                    }
                    org.telegram.messenger.ro roVar3 = roVar2;
                    org.telegram.ui.jz.z0(roVar3, roVar2.g, roVar2.b, roVar2.c, roVar2.n, roVar2.m, roVar2.h, roVar2.i, roVar2.j, false, false, true, true, false, bxVar, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView l42 = bxVar.l4();
                    if (l42 != null) {
                        l42.k(longValue, 21, Integer.valueOf(arrayList5.size()), roVar3, null, null);
                    }
                    bxVar = bxVar;
                } else {
                    if (K0.isEmpty()) {
                        roVar = roVar2;
                    } else {
                        for (int i31 = 0; i31 < K0.size(); i31++) {
                            roVar2.i.remove(K0.get(i31));
                        }
                        roVar2.h.addAll(K0);
                        roVar = roVar2;
                        org.telegram.ui.jz.z0(roVar, roVar2.g, roVar2.b, roVar2.c, roVar2.n, roVar2.m, roVar2.h, roVar2.i, roVar2.j, false, false, true, true, false, bxVar, null);
                    }
                    bxVar = bxVar;
                    long longValue2 = K0.size() == 1 ? ((Long) K0.get(0)).longValue() : 0L;
                    org.telegram.messenger.ro roVar4 = roVar;
                    UndoView l43 = bxVar.l4();
                    if (l43 != null) {
                        l43.k(longValue2, 20, Integer.valueOf(K0.size()), roVar4, null, null);
                    }
                }
                bxVar.p4(true);
                pzVar.dismiss();
                break;
            case 8:
                g00 g00Var = (g00) obj;
                org.telegram.ui.ActionBar.g2 g2Var2 = g00Var.s1;
                ArrayList arrayList6 = g00Var.c2;
                ArrayList arrayList7 = g00Var.e2;
                if ((view instanceof org.telegram.ui.Cells.i4) && (i14 = (i7 - 1) - g00Var.n2) >= 0 && i14 < arrayList6.size()) {
                    long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList6.get(i14));
                    if (!arrayList7.contains(Long.valueOf(o4))) {
                        z11 = true;
                        z12 = false;
                        arrayList7.add(Long.valueOf(o4));
                        ((org.telegram.ui.Cells.i4) view).c(true, true);
                    } else if (g00Var.d2.contains(Long.valueOf(o4))) {
                        int i32 = -g00Var.y2;
                        g00Var.y2 = i32;
                        org.telegram.messenger.g0.E3(i32, view, null);
                        org.telegram.messenger.q2.E.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o4 >= 0) {
                            arrayList8.add(g2Var2.getMessagesController().c2(Long.valueOf(o4)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(-o4));
                            String N0 = org.telegram.messenger.v3.V(O0) ? org.telegram.messenger.gd.N0(2131750659, null) : org.telegram.messenger.gd.N0(2131750660, null);
                            arrayList8.add(O0);
                            str = N0;
                        }
                        if (g00Var.z2 != o4 || System.currentTimeMillis() - g00Var.A2 > 1500) {
                            g00Var.z2 = o4;
                            g00Var.A2 = System.currentTimeMillis();
                            fc g10 = new kc(g00Var.g2, null).g(str, arrayList8);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList7.remove(Long.valueOf(o4));
                        z11 = true;
                        z12 = false;
                        ((org.telegram.ui.Cells.i4) view).c(false, true);
                    }
                    g00Var.i1(z11);
                    g00Var.j1();
                    g00Var.e1(z12);
                    break;
                }
                break;
            case 9:
                s20 s20Var = (s20) obj;
                if (i7 == s20Var.d2) {
                    s20Var.b2.a.n1(true);
                    s20Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!s20Var.a2.contains(Long.valueOf(b5Var.getUserId()))) {
                        s20Var.b2.a.q1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                gi0 gi0Var = (gi0) obj;
                ArrayList arrayList9 = gi0Var.n;
                int d = gi0Var.f.d(i7);
                if (d == 0) {
                    fi0 fi0Var = gi0Var.F;
                    if (fi0Var != null) {
                        fi0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList9.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i7));
                        break;
                    }
                } else if (d == 1 && (di0Var = gi0Var.H) != null) {
                    di0Var.d(gi0Var.J);
                    break;
                }
                break;
            case 11:
                xi0 xi0Var = (xi0) obj;
                wi0 wi0Var = xi0Var.h0;
                if (wi0Var != null && (view instanceof vi0)) {
                    wi0Var.h(xi0Var, ((vi0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                zo0 zo0Var = ((wo0) obj).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ri.d0(zo0Var.a).j1.get(i7);
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
                if (p4Var.F) {
                    zo0Var.Z0(j3, p4Var);
                    break;
                } else {
                    tL_dialog.id = j3;
                    zo0Var.V0(null, tL_dialog);
                    boolean z15 = zo0Var.Q1.h(j3) >= 0;
                    if (p4Var.x) {
                        p4Var.w.a(z15, true);
                        break;
                    }
                }
                break;
            case 13:
                lt0 lt0Var = (lt0) obj;
                int i33 = i7 - 1;
                if (i33 >= 0 && i33 < org.telegram.messenger.qd.g()) {
                    lt0Var.s1.c(lt0.K0(i33));
                    lt0Var.dismiss();
                    break;
                }
                break;
            case 14:
                su0 su0Var = (su0) obj;
                n41 G = su0Var.T1.G(i7 - 1);
                Object obj2 = G != null ? G.H : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.mp.u1(su0Var.a).E3(su0Var.j1, (TLRPC.User) obj2, null, 0, null, false, false);
                    break;
                }
                break;
            case 15:
                kv0 kv0Var = (kv0) obj;
                if (i7 < 1) {
                    kv0Var.getClass();
                    break;
                } else {
                    gv0[] gv0VarArr = kv0Var.g3;
                    if (gv0VarArr != null) {
                        gv0 gv0Var = gv0VarArr[i7 - 1];
                        int L = org.telegram.messenger.g0.L(64.0f);
                        if (kv0Var.getMeasuredWidth() - view.getRight() < L) {
                            kv0Var.w0(L - (kv0Var.getMeasuredWidth() - view.getRight()), 0, kr.h);
                        } else if (view.getLeft() < L) {
                            kv0Var.w0(-(L - view.getLeft()), 0, kr.h);
                        }
                        org.telegram.messenger.w10 w10Var = kv0Var.v3;
                        if (w10Var != null) {
                            w10Var.a(gv0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                jw0 jw0Var = (jw0) obj;
                if (view instanceof dw0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jw0Var.N1;
                    org.telegram.ui.ActionBar.g2 g2Var3 = jw0Var.G1;
                    org.telegram.ui.ActionBar.i6 i6Var = jw0Var.J0;
                    if (g2Var3 != null) {
                        Context context2 = g2Var3.getContext();
                        if (g2Var3 instanceof org.telegram.ui.bn) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, i6Var);
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            org.telegram.ui.Cells.c0.v(null, 2131744621, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                            arrayList11.add(0);
                            arrayList10.add(org.telegram.messenger.gd.N0(2131744628, null));
                            arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                            arrayList11.add(1);
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                            fi.d0 d0Var = new fi.d0(g1Var, arrayList11, tL_messages_stickerSet, g2Var3, i6Var, 11);
                            for (int i34 = 0; i34 < arrayList10.size(); i34++) {
                                org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i34)).intValue(), (CharSequence) arrayList10.get(i34), false, i6Var);
                                c10.setTag(Integer.valueOf(i34));
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
                            break;
                        } else {
                            ow0.a(tL_messages_stickerSet, g2Var3, i6Var);
                            break;
                        }
                    }
                } else if (!jw0Var.M1) {
                    if (jw0Var.R1 != null) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) jw0Var.o1.f.get(i7);
                        if (stickerSetCovered4 != null) {
                            jw0Var.dismiss();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                            tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                            tL_inputStickerSetID2.id = stickerSet4.id;
                            new jw0(jw0Var.I1, jw0Var.G1, tL_inputStickerSetID2, null, null, jw0Var.J0).show();
                            break;
                        }
                    } else {
                        ArrayList arrayList13 = jw0Var.T1;
                        if (arrayList13 == null) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = jw0Var.N1;
                            if (tL_messages_stickerSet2 != null && i7 >= 0 && i7 < tL_messages_stickerSet2.documents.size()) {
                                jw0Var.O1 = jw0Var.N1.documents.get(i7);
                                int i35 = 0;
                                while (true) {
                                    if (i35 < jw0Var.O1.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = jw0Var.O1.attributes.get(i35);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                            String str2 = documentAttribute.alt;
                                            if (str2 != null && str2.length() > 0) {
                                                TextView textView3 = jw0Var.B1;
                                                textView3.setText(org.telegram.messenger.j6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                                            }
                                        } else {
                                            i35++;
                                        }
                                    }
                                }
                                TextView textView4 = jw0Var.B1;
                                String str3 = (String) org.telegram.messenger.ri.d0(jw0Var.a).d0.f(jw0Var.O1.id);
                                textView4.setText(org.telegram.messenger.j6.m(str3 != null ? str3 : "", jw0Var.B1.getPaint().getFontMetricsInt(), false, null, 0));
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = jw0Var.N1;
                                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.ns.p().x(view)) {
                                    jw0Var.A1.getImageReceiver().u0(org.telegram.messenger.fc.b(jw0Var.O1), null, org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(jw0Var.O1.thumbs, 90, false, null, false), jw0Var.O1), null, "webp", jw0Var.N1, 1);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jw0Var.x1.getLayoutParams();
                                    layoutParams.topMargin = jw0Var.Z1;
                                    jw0Var.x1.setLayoutParams(layoutParams);
                                    jw0Var.x1.setVisibility(0);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(jw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                    animatorSet.setDuration(200L);
                                    animatorSet.start();
                                    break;
                                }
                            }
                        } else if (i7 >= 0 && i7 < arrayList13.size()) {
                            org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) jw0Var.T1.get(i7);
                            jw0Var.P1 = syVar;
                            if (syVar.c) {
                                TextView textView5 = jw0Var.B1;
                                textView5.setText(org.telegram.messenger.j6.m(syVar.b, textView5.getPaint().getFontMetricsInt(), false, null, 0));
                                jw0Var.A1.n(org.telegram.messenger.fc.g(jw0Var.P1.a), null, null, null, null, jw0Var.P1.e ? "tgs" : null, 0, null);
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) jw0Var.x1.getLayoutParams();
                                layoutParams2.topMargin = jw0Var.Z1;
                                jw0Var.x1.setLayoutParams(layoutParams2);
                                jw0Var.x1.setVisibility(0);
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(jw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                animatorSet2.setDuration(200L);
                                animatorSet2.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ?? r10 = (zw0) obj;
                String str4 = ((yw0) view).a;
                if (r10.s && (xw0Var = r10.c) != null && (xw0Var.getFieldText() instanceof Spanned)) {
                    if (r10.W != null) {
                        intValue = ((Spanned) r10.c.getFieldText()).getSpanStart(r10.W);
                        intValue2 = ((Spanned) r10.c.getFieldText()).getSpanEnd(r10.W);
                    } else {
                        Integer num = r10.b0;
                        if (num != null && r10.c0 != null) {
                            intValue = num.intValue();
                            intValue2 = r10.c0.intValue();
                            r10.c0 = null;
                            r10.b0 = null;
                        }
                    }
                    Editable editText = r10.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (r10.W != null) {
                            if (r10.c.getFieldText() instanceof Spannable) {
                                ((Spannable) r10.c.getFieldText()).removeSpan(r10.W);
                            }
                            r10.W = null;
                        }
                        String obj3 = editText.toString();
                        String substring = obj3.substring(intValue, intValue2);
                        int length = substring.length();
                        int i36 = intValue2 - length;
                        while (i36 >= 0) {
                            int i37 = i36 + length;
                            if (obj3.substring(i36, i37).equals(substring)) {
                                ?? fontMetricsInt = r10.c.getEditField() != null ? r10.c.getEditField().getPaint().getFontMetricsInt() : r15;
                                if (fontMetricsInt == 0) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                                    fontMetricsInt = paint.getFontMetricsInt();
                                }
                                if (str4 == null || !str4.startsWith("animated_")) {
                                    m10 = org.telegram.messenger.j6.m(str4, fontMetricsInt, z13, r15, i20);
                                } else {
                                    try {
                                        long parseLong = Long.parseLong(str4.substring(9));
                                        TLRPC.Document e10 = o5.e(r10.a, parseLong);
                                        SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(e10));
                                        spannableString.setSpan(e10 == null ? new x5(parseLong, (Paint.FontMetricsInt) fontMetricsInt) : new x5(e10, (Paint.FontMetricsInt) fontMetricsInt), 0, spannableString.length(), 33);
                                        m10 = spannableString;
                                    } catch (Exception unused) {
                                        m10 = null;
                                    }
                                }
                                if (m10 == null || ((x5VarArr = (x5[]) editText.getSpans(i36, i37, x5.class)) != null && x5VarArr.length > 0)) {
                                    i15 = 3;
                                    r12 = 1;
                                    r10.performHapticFeedback(i15, r12);
                                    org.telegram.messenger.j6.a(str4);
                                    r10.s = false;
                                    r10.w = r12;
                                    r10.J = 0;
                                    g3Var = r10.d;
                                    if (g3Var != null) {
                                        g3Var.invalidate();
                                        break;
                                    }
                                } else {
                                    org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) editText.getSpans(i36, i37, org.telegram.messenger.g6.class);
                                    if (g6VarArr != null) {
                                        for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                                            editText.removeSpan(g6Var);
                                        }
                                    }
                                    editText.replace(i36, i37, "");
                                    editText.insert(i36, m10);
                                    i36 -= length;
                                    i18 = 3;
                                    i20 = 0;
                                    z13 = true;
                                    r15 = null;
                                }
                            } else {
                                i15 = i18;
                                r12 = z13;
                                r10.performHapticFeedback(i15, r12);
                                org.telegram.messenger.j6.a(str4);
                                r10.s = false;
                                r10.w = r12;
                                r10.J = 0;
                                g3Var = r10.d;
                                if (g3Var != null) {
                                }
                            }
                        }
                        i15 = i18;
                        r12 = z13;
                        r10.performHapticFeedback(i15, r12);
                        org.telegram.messenger.j6.a(str4);
                        r10.s = false;
                        r10.w = r12;
                        r10.J = 0;
                        g3Var = r10.d;
                        if (g3Var != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i7 != 0) {
                    v4.i0 adapter = editorAlert.n1.getAdapter();
                    a01 a01Var = editorAlert.s1;
                    if (adapter == a01Var) {
                        int i38 = i7 - 1;
                        ArrayList arrayList14 = a01Var.d;
                        themeEditorView.e = (i38 < 0 || i38 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i38);
                    } else {
                        b01 b01Var = editorAlert.t1;
                        int i39 = i7 - 1;
                        if (i39 < 0) {
                            b01Var.getClass();
                        } else if (i39 < b01Var.e.size()) {
                            arrayList = (ArrayList) b01Var.e.get(i39);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i7;
                    for (int i40 = 0; i40 < themeEditorView.e.size(); i40++) {
                        org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) themeEditorView.e.get(i40);
                        int i41 = w6Var.e;
                        if (i41 == org.telegram.ui.ActionBar.n6.Ee) {
                            final a8.r7 r7Var = themeEditorView.m;
                            org.telegram.ui.ActionBar.w2 j12 = org.telegram.messenger.m10.j((Activity) r7Var.c, false, 1, null);
                            j12.P = org.telegram.messenger.gd.N0(2131752111, null);
                            j12.Q = true;
                            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131752101, null), org.telegram.messenger.gd.N0(2131745460, null), org.telegram.messenger.gd.N0(2131745467, null), org.telegram.messenger.gd.N0(2131751588, null)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.o71
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i42) {
                                    a8.r7 r7Var2 = a8.r7.this;
                                    p71 p71Var = (p71) r7Var2.e;
                                    Activity activity = (Activity) r7Var2.c;
                                    try {
                                        if (i42 != 0) {
                                            if (i42 == 1) {
                                                r7Var2.F();
                                                return;
                                            } else if (i42 == 2) {
                                                p71Var.a();
                                                return;
                                            } else {
                                                if (i42 == 3) {
                                                    p71Var.b(null, null, false);
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
                            j12.M = charSequenceArr;
                            j12.N = null;
                            j12.L = onClickListener;
                            j12.show();
                            break;
                        } else {
                            int x02 = org.telegram.ui.ActionBar.n6.x0(w6Var.i, i41, false);
                            w6Var.h = x02;
                            if (i40 == 0) {
                                editorAlert.m1.c(x02);
                            }
                        }
                    }
                    editorAlert.M0(true);
                    break;
                }
                break;
            case 19:
                f11 f11Var = (f11) obj;
                ArrayList arrayList15 = f11Var.U;
                if (i7 >= 0 && i7 < arrayList15.size()) {
                    c11 c11Var = (c11) arrayList15.get(i7);
                    long j13 = c11Var.a;
                    if (j13 != 0) {
                        if (f11Var.V == j13) {
                            j13 = 0;
                        }
                        f11Var.V = j13;
                    } else {
                        f11Var.W = c11Var.b.equals(f11Var.W) ? null : c11Var.b;
                    }
                    org.telegram.messenger.g0.d0(f11Var.S, new fi.e(i17));
                    f11Var.l(false);
                    f11Var.n();
                    break;
                }
                break;
            default:
                j41 j41Var = (j41) obj;
                v4.i0 adapter2 = j41Var.n.getAdapter();
                jg.c2 c2Var = j41Var.w;
                if (adapter2 == c2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) c2Var.L.get(i7);
                } else {
                    i41 i41Var = j41Var.s;
                    stickerSetCovered = i7 < i41Var.x ? (TLRPC.StickerSetCovered) i41Var.f.get(i7) : null;
                }
                if (stickerSetCovered != null) {
                    j41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
