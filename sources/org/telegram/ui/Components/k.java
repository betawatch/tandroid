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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:69|(3:71|(1:73)|74)|75|(2:77|(5:79|(1:81)(1:123)|(1:83)|(1:122)(5:87|88|89|(1:91)(1:119)|92)|(5:99|100|101|102|(1:104))(3:109|(3:111|(2:114|112)|115)(1:117)|116))(6:124|125|100|101|102|(0)(0)))|126|125|100|101|102|(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0266  */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    @Override // org.telegram.ui.Components.fj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3, View view) {
        int i10;
        ?? r9;
        int i11;
        n8 n8Var;
        sp0 sp0Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.mo moVar;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        String str;
        rh0 rh0Var;
        long j10;
        TLRPC.StickerSet stickerSet2;
        mw0 mw0Var;
        int intValue;
        int intValue2;
        int i14;
        ?? r12;
        kw0 kw0Var;
        CharSequence m10;
        p5[] p5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i15 = this.a;
        int i16 = -1;
        int i17 = 3;
        int i18 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i19 = 0;
        Object obj = this.b;
        boolean z13 = true;
        switch (i15) {
            case 0:
                ((e0) obj).H2.G(i3 - 1);
                break;
            case 1:
                ((r) obj).Z1.G(i3 - 1);
                break;
            case 2:
                o8 o8Var = (o8) obj;
                org.telegram.ui.y7 y7Var = o8Var.i3;
                r8 r8Var = o8Var.k3;
                if (view instanceof p8) {
                    p8 p8Var = (p8) view;
                    if (!p8Var.d) {
                        n8 n8Var2 = p8Var.a;
                        o8Var.h3 = n8Var2.a;
                        r8Var.a.b(n8Var2, false);
                        if (y7Var != null) {
                            y7Var.f();
                        }
                        r8Var.s0();
                        break;
                    }
                }
                if (o8Var.h3 != 1 && (n8Var = o8Var.j3) != null) {
                    o8Var.h3 = 1;
                    r8Var.a.b(n8Var, true);
                    if (y7Var != null) {
                        y7Var.f();
                    }
                    r8Var.s0();
                    break;
                } else if (r8Var.T == null) {
                    if (!r8Var.a.w) {
                        r8Var.l0(true, true, true);
                    }
                    n8 n8Var3 = r8Var.a.h;
                    boolean[] zArr = {false};
                    org.telegram.messenger.g0.Z2(r8Var.getParentActivity(), r8Var.getClassGuid());
                    org.telegram.messenger.b9 b9Var = new org.telegram.messenger.b9(r8Var, r8Var.getParentActivity());
                    r8Var.T = b9Var;
                    b9Var.N();
                    r8Var.T.L0 = false;
                    r8Var.h = true;
                    r8Var.e.setBackground(new BitmapDrawable(r8Var.getParentActivity().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, r8Var.fragmentView)));
                    r8Var.h = false;
                    r8Var.e.setVisibility(0);
                    r8Var.e.setAlpha(0.0f);
                    r8Var.f = true;
                    r8Var.fragmentView.invalidate();
                    r8Var.e.animate().setListener(new g8(r8Var, 0)).alpha(1.0f).setDuration(200L).start();
                    r8Var.Z = new n8();
                    h8 h8Var = new h8(r8Var.getParentActivity(), false, new f8(r8Var, i18));
                    n8 n8Var4 = r8Var.a.h;
                    if (n8Var4 != null) {
                        n8 n8Var5 = r8Var.Z;
                        int i20 = n8Var4.f;
                        n8Var5.f = i20;
                        i10 = 3;
                        h8Var.e(i20, 3);
                        n8 n8Var6 = r8Var.Z;
                        int i21 = r8Var.a.h.e;
                        n8Var6.e = i21;
                        h8Var.e(i21, 2);
                        n8 n8Var7 = r8Var.Z;
                        int i22 = r8Var.a.h.d;
                        n8Var7.d = i22;
                        h8Var.e(i22, 1);
                        n8 n8Var8 = r8Var.Z;
                        int i23 = r8Var.a.h.c;
                        n8Var8.c = i23;
                        h8Var.e(i23, 0);
                    } else {
                        i10 = 3;
                    }
                    n8 n8Var9 = r8Var.Z;
                    if (n8Var9.f != 0) {
                        i11 = 4;
                    } else if (n8Var9.e != 0) {
                        i11 = i10;
                    } else if (n8Var9.d == 0) {
                        r9 = 0;
                        i11 = 1;
                        h8Var.f(-1, 4, i11, r9);
                        r8Var.a.b(r8Var.Z, true);
                        r8Var.s0();
                        LinearLayout linearLayout = new LinearLayout(r8Var.getParentActivity());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(r9, org.telegram.messenger.g0.L(8.0f), r9, r9);
                        linearLayout.addView(h8Var);
                        FrameLayout frameLayout = new FrameLayout(r8Var.getParentActivity());
                        int i24 = org.telegram.ui.ActionBar.k6.Ci;
                        float[] fArr = new float[1];
                        fArr[r9] = 8.0f;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.f(i24, fArr));
                        TextView textView = new TextView(r8Var.getParentActivity());
                        k2.p1.u(textView, 1, 14.0f, null, 2131745548);
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
                        frameLayout.addView(textView, b8.mf.e(-2, -2, 17));
                        linearLayout.addView(frameLayout, b8.mf.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                        frameLayout.setOnClickListener(new q2(r8Var, zArr));
                        org.telegram.messenger.b9 b9Var2 = r8Var.T;
                        b9Var2.O = linearLayout;
                        b9Var2.Q0 = true;
                        b9Var2.p0 = false;
                        b9Var2.show();
                        r8Var.isLightStatusBar();
                        break;
                    } else {
                        i11 = 2;
                    }
                    r9 = 0;
                    h8Var.f(-1, 4, i11, r9);
                    r8Var.a.b(r8Var.Z, true);
                    r8Var.s0();
                    LinearLayout linearLayout2 = new LinearLayout(r8Var.getParentActivity());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(r9, org.telegram.messenger.g0.L(8.0f), r9, r9);
                    linearLayout2.addView(h8Var);
                    FrameLayout frameLayout2 = new FrameLayout(r8Var.getParentActivity());
                    int i242 = org.telegram.ui.ActionBar.k6.Ci;
                    float[] fArr2 = new float[1];
                    fArr2[r9] = 8.0f;
                    frameLayout2.setBackground(org.telegram.ui.ActionBar.y5.f(i242, fArr2));
                    TextView textView2 = new TextView(r8Var.getParentActivity());
                    k2.p1.u(textView2, 1, 14.0f, null, 2131745548);
                    textView2.setGravity(17);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, null);
                    frameLayout2.addView(textView2, b8.mf.e(-2, -2, 17));
                    linearLayout2.addView(frameLayout2, b8.mf.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout2.setOnClickListener(new q2(r8Var, zArr));
                    org.telegram.messenger.b9 b9Var22 = r8Var.T;
                    b9Var22.O = linearLayout2;
                    b9Var22.Q0 = true;
                    b9Var22.p0 = false;
                    b9Var22.show();
                    r8Var.isLightStatusBar();
                }
                break;
            case 3:
                vo voVar = (vo) obj;
                tj0 tj0Var = voVar.t1;
                to toVar = voVar.o1;
                if (toVar.d.get(i3) != voVar.D1 && voVar.I1 == null) {
                    voVar.D1 = (uo) toVar.d.get(i3);
                    voVar.S0();
                    toVar.E(i3);
                    voVar.b.postDelayed(new oe(voVar, i3, 1), 100L);
                    for (int i25 = 0; i25 < tj0Var.getChildCount(); i25++) {
                        yz0 yz0Var = (yz0) tj0Var.getChildAt(i25);
                        if (yz0Var != view && (sp0Var = yz0Var.K) != null) {
                            org.telegram.messenger.g0.r(sp0Var);
                            yz0Var.K.run();
                        }
                    }
                    if (!((uo) toVar.d.get(i3)).a.a) {
                        ((yz0) view).d();
                    }
                    voVar.Z0(true);
                    break;
                }
                break;
            case 4:
                oq oqVar = (oq) obj;
                tj0 tj0Var2 = oqVar.l1;
                if (i3 > 3) {
                    oqVar.W1 = (TLRPC.Peer) oqVar.R1.get(i3 - 4);
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i26 = 0;
                    while (i26 < tj0Var2.getChildCount()) {
                        View childAt = tj0Var2.getChildAt(i26);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.h4)) {
                            ((org.telegram.ui.Cells.h4) childAt).c(false, z10);
                        }
                        i26++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                ey eyVar = ((ow) obj).G;
                int i27 = eyVar.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
                    ArrayList arrayList3 = org.telegram.messenger.li.b0(i27).t0[1];
                    for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) arrayList3.get(i28);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i16 = i28;
                            }
                        }
                    }
                    org.telegram.messenger.li.b0(i27).d1(true, true);
                    pu puVar = new pu(d2Var, eyVar.getContext(), d2Var == null ? eyVar.a2 : d2Var.getResourceProvider(), arrayList2);
                    if (i16 >= 0) {
                        puVar.G1 = i16;
                    }
                    if (d2Var != null) {
                        d2Var.showDialog(puVar);
                        break;
                    } else {
                        puVar.show();
                        break;
                    }
                }
                break;
            case 6:
                ey eyVar2 = ((vx) obj).w;
                eyVar2.u1.o(new n31(eyVar2.getContext(), new zv(eyVar2), eyVar2.y1, eyVar2.z1, eyVar2.A1, (TLRPC.StickerSetCovered) view.getTag(), eyVar2.a2));
                break;
            case 7:
                cz czVar = (cz) obj;
                org.telegram.ui.ur urVar = czVar.r1;
                ArrayList arrayList4 = ((cz) czVar.l1.e).s1;
                org.telegram.messenger.mo moVar2 = i3 < arrayList4.size() ? (org.telegram.messenger.mo) arrayList4.get(i3) : null;
                boolean z14 = view instanceof org.telegram.ui.ActionBar.m2 ? ((org.telegram.ui.ActionBar.m2) view).e : false;
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) ((org.telegram.ui.o9) urVar.b).b;
                ArrayList arrayList5 = uwVar.J2;
                ArrayList J0 = cz.J0(uwVar, moVar2, arrayList5, true, false);
                if (!z14) {
                    int size = J0.size() + (moVar2 != null ? moVar2.h.size() : 0);
                    if ((size > uwVar.getMessagesController().N4 && !uwVar.getUserConfig().q()) || size > uwVar.getMessagesController().O4) {
                        Context context = uwVar.fragmentView.getContext();
                        i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        uwVar.showDialog(new vg.i0(4, i12, context, uwVar, null));
                        czVar.dismiss();
                        break;
                    }
                }
                if (moVar2 == null) {
                    uwVar.presentFragment(new org.telegram.ui.ez(null, J0));
                } else if (z14) {
                    for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                        moVar2.i.add((Long) arrayList5.get(i29));
                        moVar2.h.remove(arrayList5.get(i29));
                    }
                    org.telegram.messenger.mo moVar3 = moVar2;
                    org.telegram.ui.ez.z0(moVar3, moVar2.g, moVar2.b, moVar2.c, moVar2.n, moVar2.m, moVar2.h, moVar2.i, moVar2.j, false, false, true, true, false, uwVar, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView k42 = uwVar.k4();
                    if (k42 != null) {
                        k42.k(longValue, 21, Integer.valueOf(arrayList5.size()), moVar3, null, null);
                    }
                } else {
                    if (J0.isEmpty()) {
                        moVar = moVar2;
                    } else {
                        for (int i30 = 0; i30 < J0.size(); i30++) {
                            moVar2.i.remove(J0.get(i30));
                        }
                        moVar2.h.addAll(J0);
                        moVar = moVar2;
                        org.telegram.ui.ez.z0(moVar, moVar2.g, moVar2.b, moVar2.c, moVar2.n, moVar2.m, moVar2.h, moVar2.i, moVar2.j, false, false, true, true, false, uwVar, null);
                    }
                    long longValue2 = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                    org.telegram.messenger.mo moVar4 = moVar;
                    UndoView k43 = uwVar.k4();
                    if (k43 != null) {
                        k43.k(longValue2, 20, Integer.valueOf(J0.size()), moVar4, null, null);
                    }
                }
                uwVar.n4(true);
                czVar.dismiss();
                break;
            case 8:
                rz rzVar = (rz) obj;
                org.telegram.ui.ActionBar.d2 d2Var2 = rzVar.p1;
                ArrayList arrayList6 = rzVar.Z1;
                ArrayList arrayList7 = rzVar.b2;
                if ((view instanceof org.telegram.ui.Cells.h4) && (i13 = (i3 - 1) - rzVar.k2) >= 0 && i13 < arrayList6.size()) {
                    long o10 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList6.get(i13));
                    if (!arrayList7.contains(Long.valueOf(o10))) {
                        z11 = false;
                        z12 = true;
                        arrayList7.add(Long.valueOf(o10));
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else if (rzVar.a2.contains(Long.valueOf(o10))) {
                        int i31 = -rzVar.v2;
                        rzVar.v2 = i31;
                        org.telegram.messenger.g0.G3(i31, view, null);
                        org.telegram.messenger.p2.E.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o10 >= 0) {
                            arrayList8.add(d2Var2.getMessagesController().a2(Long.valueOf(o10)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat M0 = d2Var2.getMessagesController().M0(Long.valueOf(-o10));
                            String M02 = org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.bd.M0(2131750677, null) : org.telegram.messenger.bd.M0(2131750678, null);
                            arrayList8.add(M0);
                            str = M02;
                        }
                        if (rzVar.w2 != o10 || System.currentTimeMillis() - rzVar.x2 > 1500) {
                            rzVar.w2 = o10;
                            rzVar.x2 = System.currentTimeMillis();
                            ac g7 = new fc(rzVar.d2, null).g(str, arrayList8);
                            g7.j = 1500;
                            g7.j();
                            break;
                        }
                    } else {
                        arrayList7.remove(Long.valueOf(o10));
                        z11 = false;
                        z12 = true;
                        ((org.telegram.ui.Cells.h4) view).c(false, true);
                    }
                    rzVar.h1(z12);
                    rzVar.i1();
                    rzVar.d1(z11);
                    break;
                }
                break;
            case 9:
                d20 d20Var = (d20) obj;
                if (i3 == d20Var.a2) {
                    d20Var.Y1.a.l1(true);
                    d20Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (!d20Var.X1.contains(Long.valueOf(a5Var.getUserId()))) {
                        d20Var.Y1.a.o1(a5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                uh0 uh0Var = (uh0) obj;
                ArrayList arrayList9 = uh0Var.n;
                int d = uh0Var.f.d(i3);
                if (d == 0) {
                    th0 th0Var = uh0Var.F;
                    if (th0Var != null) {
                        th0Var.f(org.telegram.messenger.zi.C1(((TLRPC.MessagePeerReaction) arrayList9.get(i3)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i3));
                        break;
                    }
                } else if (d == 1 && (rh0Var = uh0Var.H) != null) {
                    rh0Var.k(uh0Var.J);
                    break;
                }
                break;
            case 11:
                li0 li0Var = (li0) obj;
                ki0 ki0Var = li0Var.h0;
                if (ki0Var != null && (view instanceof ji0)) {
                    ki0Var.z(li0Var, ((ji0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                oo0 oo0Var = ((lo0) obj).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.li.b0(oo0Var.a).j1.get(i3);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j11 = peer.user_id;
                if (j11 != 0) {
                    j10 = j11;
                } else {
                    long j12 = peer.channel_id;
                    if (j12 == 0) {
                        j12 = peer.chat_id;
                        if (j12 == 0) {
                            j10 = 0;
                        }
                    }
                    j10 = -j12;
                }
                if (o4Var.F) {
                    oo0Var.Y0(j10, o4Var);
                    break;
                } else {
                    tL_dialog.id = j10;
                    oo0Var.U0(null, tL_dialog);
                    boolean z15 = oo0Var.N1.h(j10) >= 0;
                    if (o4Var.x) {
                        o4Var.w.a(z15, true);
                        break;
                    }
                }
                break;
            case 13:
                zs0 zs0Var = (zs0) obj;
                int i32 = i3 - 1;
                if (i32 >= 0 && i32 < org.telegram.messenger.ld.g()) {
                    zs0Var.p1.c(zs0.J0(i32));
                    zs0Var.dismiss();
                    break;
                }
                break;
            case 14:
                gu0 gu0Var = (gu0) obj;
                r31 G = gu0Var.Q1.G(i3 - 1);
                Object obj2 = G != null ? G.G : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.hp.s1(gu0Var.a).x3(gu0Var.g1, (TLRPC.User) obj2, null, 0, null, false, false);
                    break;
                }
                break;
            case 15:
                xu0 xu0Var = (xu0) obj;
                if (i3 < 1) {
                    xu0Var.getClass();
                    break;
                } else {
                    tu0[] tu0VarArr = xu0Var.g3;
                    if (tu0VarArr != null) {
                        tu0 tu0Var = tu0VarArr[i3 - 1];
                        int L = org.telegram.messenger.g0.L(64.0f);
                        if (xu0Var.getMeasuredWidth() - view.getRight() < L) {
                            xu0Var.w0(L - (xu0Var.getMeasuredWidth() - view.getRight()), 0, xq.h);
                        } else if (view.getLeft() < L) {
                            xu0Var.w0(-(L - view.getLeft()), 0, xq.h);
                        }
                        org.telegram.messenger.u10 u10Var = xu0Var.v3;
                        if (u10Var != null) {
                            u10Var.a(tu0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                xv0 xv0Var = (xv0) obj;
                if (view instanceof rv0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
                    org.telegram.ui.ActionBar.d2 d2Var3 = xv0Var.D1;
                    org.telegram.ui.ActionBar.e6 e6Var = xv0Var.J0;
                    if (d2Var3 != null) {
                        Context context2 = d2Var3.getContext();
                        if (d2Var3 instanceof org.telegram.ui.wm) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, e6Var);
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            org.telegram.ui.Cells.f1.x(null, 2131744872, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                            arrayList11.add(0);
                            arrayList10.add(org.telegram.messenger.bd.M0(2131744879, null));
                            arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                            arrayList11.add(1);
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            ei.f0 f0Var = new ei.f0(f1Var, arrayList11, tL_messages_stickerSet, d2Var3, e6Var2, 11);
                            for (int i33 = 0; i33 < arrayList10.size(); i33++) {
                                org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i33)).intValue(), (CharSequence) arrayList10.get(i33), false, e6Var3);
                                e6Var2 = e6Var3;
                                c2.setTag(Integer.valueOf(i33));
                                c2.setOnClickListener(f0Var);
                            }
                            f1Var.c = 100;
                            f1Var.g = true;
                            f1Var.setOutsideTouchable(true);
                            f1Var.setClippingEnabled(true);
                            f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            f1Var.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            f1Var.setInputMethodMode(2);
                            f1Var.getContentView().setFocusableInTouchMode(true);
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            f1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                            f1Var.b();
                            break;
                        } else {
                            cw0.a(tL_messages_stickerSet, d2Var3, e6Var);
                            break;
                        }
                    }
                } else if (!xv0Var.J1) {
                    if (xv0Var.O1 != null) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) xv0Var.l1.f.get(i3);
                        if (stickerSetCovered4 != null) {
                            xv0Var.dismiss();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                            tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                            tL_inputStickerSetID2.id = stickerSet4.id;
                            new xv0(xv0Var.F1, xv0Var.D1, tL_inputStickerSetID2, null, null, xv0Var.J0).show();
                            break;
                        }
                    } else {
                        ArrayList arrayList13 = xv0Var.Q1;
                        if (arrayList13 == null) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                            if (tL_messages_stickerSet2 != null && i3 >= 0 && i3 < tL_messages_stickerSet2.documents.size()) {
                                xv0Var.L1 = xv0Var.K1.documents.get(i3);
                                int i34 = 0;
                                while (true) {
                                    if (i34 < xv0Var.L1.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = xv0Var.L1.attributes.get(i34);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                            String str2 = documentAttribute.alt;
                                            if (str2 != null && str2.length() > 0) {
                                                TextView textView3 = xv0Var.y1;
                                                textView3.setText(org.telegram.messenger.i6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                                            }
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                                TextView textView4 = xv0Var.y1;
                                String str3 = (String) org.telegram.messenger.li.b0(xv0Var.a).d0.f(xv0Var.L1.id);
                                textView4.setText(org.telegram.messenger.i6.m(str3 != null ? str3 : "", xv0Var.y1.getPaint().getFontMetricsInt(), false, null, 0));
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xv0Var.K1;
                                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.is.p().x(view)) {
                                    xv0Var.x1.getImageReceiver().t0(org.telegram.messenger.ac.b(xv0Var.L1), null, org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(xv0Var.L1.thumbs, 90, false, null, false), xv0Var.L1), null, "webp", xv0Var.K1, 1);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xv0Var.u1.getLayoutParams();
                                    layoutParams.topMargin = xv0Var.W1;
                                    xv0Var.u1.setLayoutParams(layoutParams);
                                    xv0Var.u1.setVisibility(0);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(xv0Var.u1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                    animatorSet.setDuration(200L);
                                    animatorSet.start();
                                    break;
                                }
                            }
                        } else if (i3 >= 0 && i3 < arrayList13.size()) {
                            org.telegram.messenger.ry ryVar = (org.telegram.messenger.ry) xv0Var.Q1.get(i3);
                            xv0Var.M1 = ryVar;
                            if (ryVar.c) {
                                TextView textView5 = xv0Var.y1;
                                textView5.setText(org.telegram.messenger.i6.m(ryVar.b, textView5.getPaint().getFontMetricsInt(), false, null, 0));
                                xv0Var.x1.n(org.telegram.messenger.ac.g(xv0Var.M1.a), null, null, null, null, xv0Var.M1.e ? "tgs" : null, 0, null);
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xv0Var.u1.getLayoutParams();
                                layoutParams2.topMargin = xv0Var.W1;
                                xv0Var.u1.setLayoutParams(layoutParams2);
                                xv0Var.u1.setVisibility(0);
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(xv0Var.u1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                animatorSet2.setDuration(200L);
                                animatorSet2.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ow0 ow0Var = (ow0) obj;
                String str4 = ((nw0) view).a;
                if (ow0Var.s && (mw0Var = ow0Var.c) != null && (mw0Var.getFieldText() instanceof Spanned)) {
                    if (ow0Var.W != null) {
                        intValue = ((Spanned) ow0Var.c.getFieldText()).getSpanStart(ow0Var.W);
                        intValue2 = ((Spanned) ow0Var.c.getFieldText()).getSpanEnd(ow0Var.W);
                    } else {
                        Integer num = ow0Var.b0;
                        if (num != null && ow0Var.c0 != null) {
                            intValue = num.intValue();
                            intValue2 = ow0Var.c0.intValue();
                            ow0Var.c0 = null;
                            ow0Var.b0 = null;
                        }
                    }
                    Editable editText = ow0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (ow0Var.W != null) {
                            if (ow0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) ow0Var.c.getFieldText()).removeSpan(ow0Var.W);
                            }
                            ow0Var.W = null;
                        }
                        String obj3 = editText.toString();
                        String substring = obj3.substring(intValue, intValue2);
                        int length = substring.length();
                        int i35 = intValue2 - length;
                        while (i35 >= 0) {
                            int i36 = i35 + length;
                            if (obj3.substring(i35, i36).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = ow0Var.c.getEditField() != null ? ow0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                                if (fontMetricsInt2 == null) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                                    fontMetricsInt2 = paint.getFontMetricsInt();
                                }
                                if (str4 == null || !str4.startsWith("animated_")) {
                                    m10 = org.telegram.messenger.i6.m(str4, fontMetricsInt2, z13, fontMetricsInt, i19);
                                } else {
                                    try {
                                        long parseLong = Long.parseLong(str4.substring(9));
                                        TLRPC.Document e10 = g5.e(ow0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(org.telegram.messenger.zi.U(e10));
                                        spannableString.setSpan(e10 == null ? new p5(parseLong, fontMetricsInt2) : new p5(e10, fontMetricsInt2), 0, spannableString.length(), 33);
                                        m10 = spannableString;
                                    } catch (Exception unused) {
                                        m10 = null;
                                    }
                                }
                                if (m10 == null || ((p5VarArr = (p5[]) editText.getSpans(i35, i36, p5.class)) != null && p5VarArr.length > 0)) {
                                    i14 = 3;
                                    r12 = 1;
                                    ow0Var.performHapticFeedback(i14, r12);
                                    org.telegram.messenger.i6.a(str4);
                                    ow0Var.s = false;
                                    ow0Var.w = r12;
                                    ow0Var.J = 0;
                                    kw0Var = ow0Var.d;
                                    if (kw0Var != null) {
                                        kw0Var.invalidate();
                                        break;
                                    }
                                } else {
                                    org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) editText.getSpans(i35, i36, org.telegram.messenger.f6.class);
                                    if (f6VarArr != null) {
                                        for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                                            editText.removeSpan(f6Var);
                                        }
                                    }
                                    editText.replace(i35, i36, "");
                                    editText.insert(i35, m10);
                                    i35 -= length;
                                    z13 = true;
                                    i17 = 3;
                                    fontMetricsInt = null;
                                    i19 = 0;
                                }
                            } else {
                                i14 = i17;
                                r12 = z13;
                                ow0Var.performHapticFeedback(i14, r12);
                                org.telegram.messenger.i6.a(str4);
                                ow0Var.s = false;
                                ow0Var.w = r12;
                                ow0Var.J = 0;
                                kw0Var = ow0Var.d;
                                if (kw0Var != null) {
                                }
                            }
                        }
                        i14 = i17;
                        r12 = z13;
                        ow0Var.performHapticFeedback(i14, r12);
                        org.telegram.messenger.i6.a(str4);
                        ow0Var.s = false;
                        ow0Var.w = r12;
                        ow0Var.J = 0;
                        kw0Var = ow0Var.d;
                        if (kw0Var != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i3 != 0) {
                    u4.h0 adapter = editorAlert.k1.getAdapter();
                    pz0 pz0Var = editorAlert.p1;
                    if (adapter == pz0Var) {
                        int i37 = i3 - 1;
                        ArrayList arrayList14 = pz0Var.d;
                        themeEditorView.e = (i37 < 0 || i37 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i37);
                    } else {
                        qz0 qz0Var = editorAlert.q1;
                        int i38 = i3 - 1;
                        if (i38 < 0) {
                            qz0Var.getClass();
                        } else if (i38 < qz0Var.e.size()) {
                            arrayList = (ArrayList) qz0Var.e.get(i38);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i3;
                    for (int i39 = 0; i39 < themeEditorView.e.size(); i39++) {
                        org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i39);
                        int i40 = t6Var.e;
                        if (i40 == org.telegram.ui.ActionBar.k6.Be) {
                            final b8.ke keVar = themeEditorView.m;
                            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h((Activity) keVar.c, false, 1, null);
                            h.P = org.telegram.messenger.bd.M0(2131752123, null);
                            h.Q = true;
                            CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131752113, null), org.telegram.messenger.bd.M0(2131745666, null), org.telegram.messenger.bd.M0(2131745673, null), org.telegram.messenger.bd.M0(2131751601, null)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.r61
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i41) {
                                    b8.ke keVar2 = b8.ke.this;
                                    s61 s61Var = (s61) keVar2.e;
                                    Activity activity = (Activity) keVar2.c;
                                    try {
                                        if (i41 != 0) {
                                            if (i41 == 1) {
                                                keVar2.B();
                                                return;
                                            } else if (i41 == 2) {
                                                s61Var.a();
                                                return;
                                            } else {
                                                if (i41 == 3) {
                                                    s61Var.b(null, null, false);
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
                                                keVar2.b = q02.getAbsolutePath();
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
                            h.M = charSequenceArr;
                            h.N = null;
                            h.L = onClickListener;
                            h.show();
                            break;
                        } else {
                            int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.i, i40, false);
                            t6Var.h = x02;
                            if (i39 == 0) {
                                editorAlert.j1.c(x02);
                            }
                        }
                    }
                    editorAlert.L0(true);
                    break;
                }
                break;
            default:
                n31 n31Var = (n31) obj;
                u4.h0 adapter2 = n31Var.n.getAdapter();
                kg.y1 y1Var = n31Var.w;
                if (adapter2 == y1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) y1Var.L.get(i3);
                } else {
                    m31 m31Var = n31Var.s;
                    stickerSetCovered = i3 < m31Var.x ? (TLRPC.StickerSetCovered) m31Var.f.get(i3) : null;
                }
                if (stickerSetCovered != null) {
                    n31Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
