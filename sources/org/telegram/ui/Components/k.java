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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
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
    @Override // org.telegram.ui.Components.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, View view) {
        int i11;
        ?? r92;
        int i12;
        k8 k8Var;
        uo0 uo0Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.ap apVar;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        String str;
        si0 si0Var;
        long j10;
        TLRPC.StickerSet stickerSet2;
        qx0 qx0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r12;
        jg.l0 l0Var;
        CharSequence m10;
        o5[] o5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i16 = this.a;
        int i17 = -1;
        int i18 = 3;
        int i19 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i20 = 0;
        Object obj = this.b;
        boolean z13 = true;
        switch (i16) {
            case 0:
                ((g0) obj).G2.G(i10 - 1);
                break;
            case 1:
                ((r) obj).Y1.G(i10 - 1);
                break;
            case 2:
                l8 l8Var = (l8) obj;
                org.telegram.ui.x7 x7Var = l8Var.h3;
                o8 o8Var = l8Var.j3;
                if (view instanceof m8) {
                    m8 m8Var = (m8) view;
                    if (!m8Var.d) {
                        k8 k8Var2 = m8Var.a;
                        l8Var.g3 = k8Var2.a;
                        o8Var.a.b(k8Var2, false);
                        if (x7Var != null) {
                            x7Var.f();
                        }
                        o8Var.r0();
                        break;
                    }
                }
                if (l8Var.g3 != 1 && (k8Var = l8Var.i3) != null) {
                    l8Var.g3 = 1;
                    o8Var.a.b(k8Var, true);
                    if (x7Var != null) {
                        x7Var.f();
                    }
                    o8Var.r0();
                    break;
                } else if (o8Var.S == null) {
                    if (!o8Var.a.w) {
                        o8Var.k0(true, true, true);
                    }
                    k8 k8Var3 = o8Var.a.h;
                    boolean[] zArr = {false};
                    org.telegram.messenger.i0.Y2(o8Var.getParentActivity(), o8Var.getClassGuid());
                    org.telegram.messenger.h9 h9Var = new org.telegram.messenger.h9(o8Var, o8Var.getParentActivity());
                    o8Var.S = h9Var;
                    h9Var.O();
                    o8Var.S.K0 = false;
                    o8Var.h = true;
                    o8Var.e.setBackground(new BitmapDrawable(o8Var.getParentActivity().getResources(), org.telegram.messenger.i0.j2(12.0f, 10, o8Var.fragmentView)));
                    o8Var.h = false;
                    o8Var.e.setVisibility(0);
                    o8Var.e.setAlpha(0.0f);
                    o8Var.f = true;
                    o8Var.fragmentView.invalidate();
                    o8Var.e.animate().setListener(new d8(o8Var, 0)).alpha(1.0f).setDuration(200L).start();
                    o8Var.Y = new k8();
                    e8 e8Var = new e8(o8Var.getParentActivity(), false, new c8(o8Var, i19));
                    k8 k8Var4 = o8Var.a.h;
                    if (k8Var4 != null) {
                        k8 k8Var5 = o8Var.Y;
                        int i21 = k8Var4.f;
                        k8Var5.f = i21;
                        i11 = 3;
                        e8Var.e(i21, 3);
                        k8 k8Var6 = o8Var.Y;
                        int i22 = o8Var.a.h.e;
                        k8Var6.e = i22;
                        e8Var.e(i22, 2);
                        k8 k8Var7 = o8Var.Y;
                        int i23 = o8Var.a.h.d;
                        k8Var7.d = i23;
                        e8Var.e(i23, 1);
                        k8 k8Var8 = o8Var.Y;
                        int i24 = o8Var.a.h.c;
                        k8Var8.c = i24;
                        e8Var.e(i24, 0);
                    } else {
                        i11 = 3;
                    }
                    k8 k8Var9 = o8Var.Y;
                    if (k8Var9.f != 0) {
                        i12 = 4;
                    } else if (k8Var9.e != 0) {
                        i12 = i11;
                    } else if (k8Var9.d == 0) {
                        r92 = 0;
                        i12 = 1;
                        e8Var.f(-1, 4, i12, r92);
                        o8Var.a.b(o8Var.Y, true);
                        o8Var.r0();
                        LinearLayout linearLayout = new LinearLayout(o8Var.getParentActivity());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(r92, org.telegram.messenger.i0.L(8.0f), r92, r92);
                        linearLayout.addView(e8Var);
                        FrameLayout frameLayout = new FrameLayout(o8Var.getParentActivity());
                        int i25 = org.telegram.ui.ActionBar.t6.Ci;
                        float[] fArr = new float[1];
                        fArr[r92] = 8.0f;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.f(i25, fArr));
                        TextView textView = new TextView(o8Var.getParentActivity());
                        sc.e.u(textView, 1, 14.0f, null, 2131745555);
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
                        frameLayout.addView(textView, w7.b6.e(-2, -2, 17));
                        linearLayout.addView(frameLayout, w7.b6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.ud(20, o8Var, zArr));
                        org.telegram.messenger.h9 h9Var2 = o8Var.S;
                        h9Var2.N = linearLayout;
                        h9Var2.P0 = true;
                        h9Var2.o0 = false;
                        h9Var2.show();
                        o8Var.isLightStatusBar();
                        break;
                    } else {
                        i12 = 2;
                    }
                    r92 = 0;
                    e8Var.f(-1, 4, i12, r92);
                    o8Var.a.b(o8Var.Y, true);
                    o8Var.r0();
                    LinearLayout linearLayout2 = new LinearLayout(o8Var.getParentActivity());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(r92, org.telegram.messenger.i0.L(8.0f), r92, r92);
                    linearLayout2.addView(e8Var);
                    FrameLayout frameLayout2 = new FrameLayout(o8Var.getParentActivity());
                    int i252 = org.telegram.ui.ActionBar.t6.Ci;
                    float[] fArr2 = new float[1];
                    fArr2[r92] = 8.0f;
                    frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.f(i252, fArr2));
                    TextView textView2 = new TextView(o8Var.getParentActivity());
                    sc.e.u(textView2, 1, 14.0f, null, 2131745555);
                    textView2.setGravity(17);
                    textView2.setTypeface(org.telegram.messenger.i0.o());
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, null);
                    frameLayout2.addView(textView2, w7.b6.e(-2, -2, 17));
                    linearLayout2.addView(frameLayout2, w7.b6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout2.setOnClickListener(new org.telegram.ui.ud(20, o8Var, zArr));
                    org.telegram.messenger.h9 h9Var22 = o8Var.S;
                    h9Var22.N = linearLayout2;
                    h9Var22.P0 = true;
                    h9Var22.o0 = false;
                    h9Var22.show();
                    o8Var.isLightStatusBar();
                }
                break;
            case 3:
                dp dpVar = (dp) obj;
                tk0 tk0Var = dpVar.s1;
                bp bpVar = dpVar.n1;
                if (bpVar.d.get(i10) != dpVar.C1 && dpVar.H1 == null) {
                    dpVar.C1 = (cp) bpVar.d.get(i10);
                    dpVar.S0();
                    bpVar.E(i10);
                    dpVar.b.postDelayed(new le(dpVar, i10, 1), 100L);
                    for (int i26 = 0; i26 < tk0Var.getChildCount(); i26++) {
                        e11 e11Var = (e11) tk0Var.getChildAt(i26);
                        if (e11Var != view && (uo0Var = e11Var.J) != null) {
                            org.telegram.messenger.i0.r(uo0Var);
                            e11Var.J.run();
                        }
                    }
                    if (!((cp) bpVar.d.get(i10)).a.a) {
                        ((e11) view).d();
                    }
                    dpVar.Z0(true);
                    break;
                }
                break;
            case 4:
                yq yqVar = (yq) obj;
                tk0 tk0Var2 = yqVar.k1;
                if (i10 > 3) {
                    yqVar.V1 = (TLRPC.Peer) yqVar.Q1.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.j4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.j4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i27 = 0;
                    while (i27 < tk0Var2.getChildCount()) {
                        View childAt = tk0Var2.getChildAt(i27);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.j4)) {
                            ((org.telegram.ui.Cells.j4) childAt).c(false, z10);
                        }
                        i27++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                vy vyVar = ((ex) obj).F;
                int i28 = vyVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
                    ArrayList arrayList3 = org.telegram.messenger.ui.b0(i28).s0[1];
                    for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) arrayList3.get(i29);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i17 = i29;
                            }
                        }
                    }
                    org.telegram.messenger.ui.b0(i28).d1(true, true);
                    cv cvVar = new cv(k2Var, vyVar.getContext(), k2Var == null ? vyVar.Z1 : k2Var.getResourceProvider(), arrayList2);
                    if (i17 >= 0) {
                        cvVar.F1 = i17;
                    }
                    if (k2Var != null) {
                        k2Var.showDialog(cvVar);
                        break;
                    } else {
                        cvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                vy vyVar2 = ((ny) obj).w;
                vyVar2.t1.o(new w41(vyVar2.getContext(), new ow(vyVar2), vyVar2.x1, vyVar2.y1, vyVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), vyVar2.Z1));
                break;
            case 7:
                uz uzVar = (uz) obj;
                org.telegram.ui.tt ttVar = uzVar.q1;
                ArrayList arrayList4 = ((uz) uzVar.k1.e).r1;
                org.telegram.messenger.ap apVar2 = i10 < arrayList4.size() ? (org.telegram.messenger.ap) arrayList4.get(i10) : null;
                boolean z14 = view instanceof org.telegram.ui.ActionBar.s2 ? ((org.telegram.ui.ActionBar.s2) view).e : false;
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) ((org.telegram.ui.ar) ttVar.b).b;
                ArrayList arrayList5 = ayVar.I2;
                ArrayList J0 = uz.J0(ayVar, apVar2, arrayList5, true, false);
                if (!z14) {
                    int size = J0.size() + (apVar2 != null ? apVar2.h.size() : 0);
                    if ((size > ayVar.getMessagesController().O4 && !ayVar.getUserConfig().q()) || size > ayVar.getMessagesController().P4) {
                        Context context = ayVar.fragmentView.getContext();
                        i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        ayVar.showDialog(new kg.q0(4, i13, context, ayVar, null));
                        uzVar.dismiss();
                        break;
                    }
                }
                if (apVar2 == null) {
                    ayVar.presentFragment(new org.telegram.ui.i00(null, J0));
                } else if (z14) {
                    for (int i30 = 0; i30 < arrayList5.size(); i30++) {
                        apVar2.i.add((Long) arrayList5.get(i30));
                        apVar2.h.remove(arrayList5.get(i30));
                    }
                    org.telegram.messenger.ap apVar3 = apVar2;
                    org.telegram.ui.i00.y0(apVar3, apVar2.g, apVar2.b, apVar2.c, apVar2.n, apVar2.m, apVar2.h, apVar2.i, apVar2.j, false, false, true, true, false, ayVar, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView j42 = ayVar.j4();
                    if (j42 != null) {
                        j42.k(longValue, 21, Integer.valueOf(arrayList5.size()), apVar3, null, null);
                    }
                } else {
                    if (J0.isEmpty()) {
                        apVar = apVar2;
                    } else {
                        for (int i31 = 0; i31 < J0.size(); i31++) {
                            apVar2.i.remove(J0.get(i31));
                        }
                        apVar2.h.addAll(J0);
                        apVar = apVar2;
                        org.telegram.ui.i00.y0(apVar, apVar2.g, apVar2.b, apVar2.c, apVar2.n, apVar2.m, apVar2.h, apVar2.i, apVar2.j, false, false, true, true, false, ayVar, null);
                    }
                    long longValue2 = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                    org.telegram.messenger.ap apVar4 = apVar;
                    UndoView j43 = ayVar.j4();
                    if (j43 != null) {
                        j43.k(longValue2, 20, Integer.valueOf(J0.size()), apVar4, null, null);
                    }
                }
                ayVar.m4(true);
                uzVar.dismiss();
                break;
            case 8:
                j00 j00Var = (j00) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = j00Var.o1;
                ArrayList arrayList6 = j00Var.Y1;
                ArrayList arrayList7 = j00Var.a2;
                if ((view instanceof org.telegram.ui.Cells.j4) && (i14 = (i10 - 1) - j00Var.j2) >= 0 && i14 < arrayList6.size()) {
                    long o10 = org.telegram.messenger.o5.o((TLRPC.Peer) arrayList6.get(i14));
                    if (!arrayList7.contains(Long.valueOf(o10))) {
                        z11 = false;
                        z12 = true;
                        arrayList7.add(Long.valueOf(o10));
                        ((org.telegram.ui.Cells.j4) view).c(true, true);
                    } else if (j00Var.Z1.contains(Long.valueOf(o10))) {
                        int i32 = -j00Var.u2;
                        j00Var.u2 = i32;
                        org.telegram.messenger.i0.F3(i32, view, null);
                        org.telegram.messenger.t2.D.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o10 >= 0) {
                            arrayList8.add(k2Var2.getMessagesController().Z1(Long.valueOf(o10)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat L0 = k2Var2.getMessagesController().L0(Long.valueOf(-o10));
                            String L02 = org.telegram.messenger.w3.V(L0) ? org.telegram.messenger.cd.L0(2131750677, null) : org.telegram.messenger.cd.L0(2131750678, null);
                            arrayList8.add(L0);
                            str = L02;
                        }
                        if (j00Var.v2 != o10 || System.currentTimeMillis() - j00Var.w2 > 1500) {
                            j00Var.v2 = o10;
                            j00Var.w2 = System.currentTimeMillis();
                            wb g10 = new cc(j00Var.c2, null).g(str, arrayList8);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList7.remove(Long.valueOf(o10));
                        z11 = false;
                        z12 = true;
                        ((org.telegram.ui.Cells.j4) view).c(false, true);
                    }
                    j00Var.h1(z12);
                    j00Var.i1();
                    j00Var.d1(z11);
                    break;
                }
                break;
            case 9:
                z20 z20Var = (z20) obj;
                if (i10 == z20Var.Z1) {
                    z20Var.X1.a.l1(true);
                    z20Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.e5) {
                    org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
                    if (!z20Var.W1.contains(Long.valueOf(e5Var.getUserId()))) {
                        z20Var.X1.a.o1(e5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                vi0 vi0Var = (vi0) obj;
                ArrayList arrayList9 = vi0Var.n;
                int d = vi0Var.f.d(i10);
                if (d == 0) {
                    ui0 ui0Var = vi0Var.E;
                    if (ui0Var != null) {
                        ui0Var.c(org.telegram.messenger.jj.C1(((TLRPC.MessagePeerReaction) arrayList9.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i10));
                        break;
                    }
                } else if (d == 1 && (si0Var = vi0Var.G) != null) {
                    si0Var.l(vi0Var.I);
                    break;
                }
                break;
            case 11:
                mj0 mj0Var = (mj0) obj;
                lj0 lj0Var = mj0Var.g0;
                if (lj0Var != null && (view instanceof kj0)) {
                    lj0Var.x(mj0Var, ((kj0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                op0 op0Var = ((lp0) obj).K;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(op0Var.a).i1.get(i10);
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
                if (q4Var.E) {
                    op0Var.Y0(j10, q4Var);
                    break;
                } else {
                    tL_dialog.id = j10;
                    op0Var.U0(null, tL_dialog);
                    boolean z15 = op0Var.M1.h(j10) >= 0;
                    if (q4Var.x) {
                        q4Var.w.a(z15, true);
                        break;
                    }
                }
                break;
            case 13:
                du0 du0Var = (du0) obj;
                int i33 = i10 - 1;
                if (i33 >= 0 && i33 < org.telegram.messenger.nd.g()) {
                    du0Var.o1.d(du0.J0(i33));
                    du0Var.dismiss();
                    break;
                }
                break;
            case 14:
                jv0 jv0Var = (jv0) obj;
                a51 G = jv0Var.P1.G(i10 - 1);
                Object obj2 = G != null ? G.G : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.vp.r1(jv0Var.a).u3(jv0Var.f1, (TLRPC.User) obj2, null, 0, null, false, false);
                    break;
                }
                break;
            case 15:
                bw0 bw0Var = (bw0) obj;
                if (i10 < 1) {
                    bw0Var.getClass();
                    break;
                } else {
                    xv0[] xv0VarArr = bw0Var.f3;
                    if (xv0VarArr != null) {
                        xv0 xv0Var = xv0VarArr[i10 - 1];
                        int L = org.telegram.messenger.i0.L(64.0f);
                        if (bw0Var.getMeasuredWidth() - view.getRight() < L) {
                            bw0Var.w0(L - (bw0Var.getMeasuredWidth() - view.getRight()), 0, gr.h);
                        } else if (view.getLeft() < L) {
                            bw0Var.w0(-(L - view.getLeft()), 0, gr.h);
                        }
                        org.telegram.messenger.q20 q20Var = bw0Var.u3;
                        if (q20Var != null) {
                            q20Var.a(xv0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                cx0 cx0Var = (cx0) obj;
                if (view instanceof ww0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
                    org.telegram.ui.ActionBar.k2 k2Var3 = cx0Var.C1;
                    org.telegram.ui.ActionBar.p6 p6Var = cx0Var.I0;
                    if (k2Var3 != null) {
                        Context context2 = k2Var3.getContext();
                        if (k2Var3 instanceof org.telegram.ui.un) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, p6Var);
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            org.telegram.ui.Cells.f1.t(null, 2131744880, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                            arrayList11.add(0);
                            arrayList10.add(org.telegram.messenger.cd.L0(2131744887, null));
                            arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                            arrayList11.add(1);
                            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                            bi.c cVar = new bi.c(k1Var, arrayList11, tL_messages_stickerSet, k2Var3, p6Var2, 7);
                            for (int i34 = 0; i34 < arrayList10.size(); i34++) {
                                org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                                org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i34)).intValue(), (CharSequence) arrayList10.get(i34), false, p6Var3);
                                p6Var2 = p6Var3;
                                c10.setTag(Integer.valueOf(i34));
                                c10.setOnClickListener(cVar);
                            }
                            k1Var.c = 100;
                            k1Var.g = true;
                            k1Var.setOutsideTouchable(true);
                            k1Var.setClippingEnabled(true);
                            k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            k1Var.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            k1Var.setInputMethodMode(2);
                            k1Var.getContentView().setFocusableInTouchMode(true);
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            k1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                            k1Var.b();
                            break;
                        } else {
                            hx0.a(tL_messages_stickerSet, k2Var3, p6Var);
                            break;
                        }
                    }
                } else if (!cx0Var.I1) {
                    if (cx0Var.N1 != null) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) cx0Var.k1.f.get(i10);
                        if (stickerSetCovered4 != null) {
                            cx0Var.dismiss();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                            tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                            tL_inputStickerSetID2.id = stickerSet4.id;
                            new cx0(cx0Var.E1, cx0Var.C1, tL_inputStickerSetID2, null, null, cx0Var.I0).show();
                            break;
                        }
                    } else {
                        ArrayList arrayList13 = cx0Var.P1;
                        if (arrayList13 == null) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.J1;
                            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                                cx0Var.K1 = cx0Var.J1.documents.get(i10);
                                int i35 = 0;
                                while (true) {
                                    if (i35 < cx0Var.K1.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = cx0Var.K1.attributes.get(i35);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                            String str2 = documentAttribute.alt;
                                            if (str2 != null && str2.length() > 0) {
                                                TextView textView3 = cx0Var.x1;
                                                textView3.setText(org.telegram.messenger.k6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                                            }
                                        } else {
                                            i35++;
                                        }
                                    }
                                }
                                TextView textView4 = cx0Var.x1;
                                String str3 = (String) org.telegram.messenger.ui.b0(cx0Var.a).c0.f(cx0Var.K1.id);
                                textView4.setText(org.telegram.messenger.k6.m(str3 != null ? str3 : "", cx0Var.x1.getPaint().getFontMetricsInt(), false, null, 0));
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = cx0Var.J1;
                                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.lt.p().x(view)) {
                                    cx0Var.w1.getImageReceiver().t0(org.telegram.messenger.ic.b(cx0Var.K1), null, org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(cx0Var.K1.thumbs, 90, false, null, false), cx0Var.K1), null, "webp", cx0Var.J1, 1);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cx0Var.t1.getLayoutParams();
                                    layoutParams.topMargin = cx0Var.V1;
                                    cx0Var.t1.setLayoutParams(layoutParams);
                                    cx0Var.t1.setVisibility(0);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(cx0Var.t1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                    animatorSet.setDuration(200L);
                                    animatorSet.start();
                                    break;
                                }
                            }
                        } else if (i10 >= 0 && i10 < arrayList13.size()) {
                            org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) cx0Var.P1.get(i10);
                            cx0Var.L1 = jzVar;
                            if (jzVar.c) {
                                TextView textView5 = cx0Var.x1;
                                textView5.setText(org.telegram.messenger.k6.m(jzVar.b, textView5.getPaint().getFontMetricsInt(), false, null, 0));
                                cx0Var.w1.o(org.telegram.messenger.ic.g(cx0Var.L1.a), null, null, null, null, cx0Var.L1.e ? "tgs" : null, 0, null);
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cx0Var.t1.getLayoutParams();
                                layoutParams2.topMargin = cx0Var.V1;
                                cx0Var.t1.setLayoutParams(layoutParams2);
                                cx0Var.t1.setVisibility(0);
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(cx0Var.t1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                animatorSet2.setDuration(200L);
                                animatorSet2.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                sx0 sx0Var = (sx0) obj;
                String str4 = ((rx0) view).a;
                if (sx0Var.s && (qx0Var = sx0Var.c) != null && (qx0Var.getFieldText() instanceof Spanned)) {
                    if (sx0Var.V != null) {
                        intValue = ((Spanned) sx0Var.c.getFieldText()).getSpanStart(sx0Var.V);
                        intValue2 = ((Spanned) sx0Var.c.getFieldText()).getSpanEnd(sx0Var.V);
                    } else {
                        Integer num = sx0Var.a0;
                        if (num != null && sx0Var.b0 != null) {
                            intValue = num.intValue();
                            intValue2 = sx0Var.b0.intValue();
                            sx0Var.b0 = null;
                            sx0Var.a0 = null;
                        }
                    }
                    Editable editText = sx0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (sx0Var.V != null) {
                            if (sx0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) sx0Var.c.getFieldText()).removeSpan(sx0Var.V);
                            }
                            sx0Var.V = null;
                        }
                        String obj3 = editText.toString();
                        String substring = obj3.substring(intValue, intValue2);
                        int length = substring.length();
                        int i36 = intValue2 - length;
                        while (i36 >= 0) {
                            int i37 = i36 + length;
                            if (obj3.substring(i36, i37).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = sx0Var.c.getEditField() != null ? sx0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                                if (fontMetricsInt2 == null) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(org.telegram.messenger.i0.L(18.0f));
                                    fontMetricsInt2 = paint.getFontMetricsInt();
                                }
                                if (str4 == null || !str4.startsWith("animated_")) {
                                    m10 = org.telegram.messenger.k6.m(str4, fontMetricsInt2, z13, fontMetricsInt, i20);
                                } else {
                                    try {
                                        long parseLong = Long.parseLong(str4.substring(9));
                                        TLRPC.Document e = f5.e(sx0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(org.telegram.messenger.jj.U(e));
                                        spannableString.setSpan(e == null ? new o5(parseLong, fontMetricsInt2) : new o5(e, fontMetricsInt2), 0, spannableString.length(), 33);
                                        m10 = spannableString;
                                    } catch (Exception unused) {
                                        m10 = null;
                                    }
                                }
                                if (m10 == null || ((o5VarArr = (o5[]) editText.getSpans(i36, i37, o5.class)) != null && o5VarArr.length > 0)) {
                                    i15 = 3;
                                    r12 = 1;
                                    sx0Var.performHapticFeedback(i15, r12);
                                    org.telegram.messenger.k6.a(str4);
                                    sx0Var.s = false;
                                    sx0Var.w = r12;
                                    sx0Var.I = 0;
                                    l0Var = sx0Var.d;
                                    if (l0Var != null) {
                                        l0Var.invalidate();
                                        break;
                                    }
                                } else {
                                    org.telegram.messenger.h6[] h6VarArr = (org.telegram.messenger.h6[]) editText.getSpans(i36, i37, org.telegram.messenger.h6.class);
                                    if (h6VarArr != null) {
                                        for (org.telegram.messenger.h6 h6Var : h6VarArr) {
                                            editText.removeSpan(h6Var);
                                        }
                                    }
                                    editText.replace(i36, i37, "");
                                    editText.insert(i36, m10);
                                    i36 -= length;
                                    z13 = true;
                                    i18 = 3;
                                    fontMetricsInt = null;
                                    i20 = 0;
                                }
                            } else {
                                i15 = i18;
                                r12 = z13;
                                sx0Var.performHapticFeedback(i15, r12);
                                org.telegram.messenger.k6.a(str4);
                                sx0Var.s = false;
                                sx0Var.w = r12;
                                sx0Var.I = 0;
                                l0Var = sx0Var.d;
                                if (l0Var != null) {
                                }
                            }
                        }
                        i15 = i18;
                        r12 = z13;
                        sx0Var.performHapticFeedback(i15, r12);
                        org.telegram.messenger.k6.a(str4);
                        sx0Var.s = false;
                        sx0Var.w = r12;
                        sx0Var.I = 0;
                        l0Var = sx0Var.d;
                        if (l0Var != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    s4.g0 adapter = editorAlert.j1.getAdapter();
                    u01 u01Var = editorAlert.o1;
                    if (adapter == u01Var) {
                        int i38 = i10 - 1;
                        ArrayList arrayList14 = u01Var.d;
                        themeEditorView.e = (i38 < 0 || i38 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i38);
                    } else {
                        v01 v01Var = editorAlert.p1;
                        int i39 = i10 - 1;
                        if (i39 < 0) {
                            v01Var.getClass();
                        } else if (i39 < v01Var.e.size()) {
                            arrayList = (ArrayList) v01Var.e.get(i39);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i10;
                    for (int i40 = 0; i40 < themeEditorView.e.size(); i40++) {
                        org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) themeEditorView.e.get(i40);
                        int i41 = c7Var.e;
                        if (i41 == org.telegram.ui.ActionBar.t6.Be) {
                            final bh.d dVar = themeEditorView.m;
                            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h((Activity) dVar.b, false, 1, null);
                            h.O = org.telegram.messenger.cd.L0(2131752123, null);
                            h.P = true;
                            CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131752113, null), org.telegram.messenger.cd.L0(2131745673, null), org.telegram.messenger.cd.L0(2131745680, null), org.telegram.messenger.cd.L0(2131751601, null)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a81
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i42) {
                                    bh.d dVar2 = bh.d.this;
                                    b81 b81Var = (b81) dVar2.d;
                                    Activity activity = (Activity) dVar2.b;
                                    try {
                                        if (i42 != 0) {
                                            if (i42 == 1) {
                                                dVar2.G();
                                                return;
                                            } else if (i42 == 2) {
                                                b81Var.a();
                                                return;
                                            } else {
                                                if (i42 == 3) {
                                                    b81Var.b(null, null, false);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        try {
                                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                            File q02 = org.telegram.messenger.i0.q0(null, false);
                                            if (q02 != null) {
                                                if (Build.VERSION.SDK_INT >= 24) {
                                                    org.telegram.messenger.w0.d();
                                                    intent.putExtra("output", FileProvider.d(activity, "org.telegram.messenger.beta.provider", q02));
                                                    intent.addFlags(2);
                                                    intent.addFlags(1);
                                                } else {
                                                    intent.putExtra("output", Uri.fromFile(q02));
                                                }
                                                dVar2.a = q02.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.f8.g(e10, true);
                                    }
                                }
                            };
                            h.L = charSequenceArr;
                            h.M = null;
                            h.K = onClickListener;
                            h.show();
                            break;
                        } else {
                            int x02 = org.telegram.ui.ActionBar.t6.x0(c7Var.i, i41, false);
                            c7Var.h = x02;
                            if (i40 == 0) {
                                editorAlert.i1.c(x02);
                            }
                        }
                    }
                    editorAlert.L0(true);
                    break;
                }
                break;
            default:
                w41 w41Var = (w41) obj;
                s4.g0 adapter2 = w41Var.n.getAdapter();
                zf.o1 o1Var = w41Var.w;
                if (adapter2 == o1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) o1Var.K.get(i10);
                } else {
                    v41 v41Var = w41Var.s;
                    stickerSetCovered = i10 < v41Var.x ? (TLRPC.StickerSetCovered) v41Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    w41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
