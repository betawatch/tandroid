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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:87|(3:89|(1:91)|92)|93|(2:95|(5:97|(1:99)(1:141)|(1:101)|(1:140)(5:105|106|107|(1:109)(1:137)|110)|(5:117|118|119|120|(1:122))(3:127|(3:129|(2:132|130)|133)(1:135)|134))(6:142|143|118|119|120|(0)(0)))|144|143|118|119|120|(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ac  */
    /* JADX WARN: Type inference failed for: r10v28, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r13v24, types: [android.view.View, org.telegram.ui.Components.yw0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, org.telegram.ui.Components.kq] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r9v35, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // org.telegram.ui.Components.oj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        int i10;
        int i11;
        ?? r62;
        int i12;
        u8 u8Var;
        ap0 ap0Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.cx cxVar;
        org.telegram.messenger.ro roVar;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        String str;
        bi0 bi0Var;
        long j3;
        TLRPC.StickerSet stickerSet2;
        ww0 ww0Var;
        int intValue;
        int intValue2;
        ?? r12;
        int i15;
        bi.a3 a3Var;
        CharSequence m10;
        x5[] x5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i16 = this.a;
        int i17 = 17;
        int i18 = 3;
        int i19 = 2;
        int i20 = 0;
        Object obj = this.b;
        boolean z13 = true;
        switch (i16) {
            case 0:
                ((m0) obj).P2.G(i7 - 1);
                break;
            case 1:
                ((v) obj).c2.G(i7 - 1);
                break;
            case 2:
                v8 v8Var = (v8) obj;
                org.telegram.ui.y7 y7Var = v8Var.i3;
                y8 y8Var = v8Var.k3;
                if (view instanceof w8) {
                    w8 w8Var = (w8) view;
                    if (!w8Var.d) {
                        u8 u8Var2 = w8Var.a;
                        v8Var.h3 = u8Var2.a;
                        y8Var.a.b(u8Var2, false);
                        if (y7Var != null) {
                            y7Var.f();
                        }
                        y8Var.s0();
                        break;
                    }
                }
                if (v8Var.h3 != 1 && (u8Var = v8Var.j3) != null) {
                    v8Var.h3 = 1;
                    y8Var.a.b(u8Var, true);
                    if (y7Var != null) {
                        y7Var.f();
                    }
                    y8Var.s0();
                    break;
                } else if (y8Var.T == null) {
                    if (!y8Var.a.w) {
                        y8Var.l0(true, true, true);
                    }
                    u8 u8Var3 = y8Var.a.h;
                    boolean[] zArr = {false};
                    org.telegram.messenger.g0.Y2(y8Var.getParentActivity(), y8Var.getClassGuid());
                    org.telegram.messenger.b9 b9Var = new org.telegram.messenger.b9(y8Var, y8Var.getParentActivity());
                    y8Var.T = b9Var;
                    b9Var.O();
                    y8Var.T.L0 = false;
                    y8Var.h = true;
                    y8Var.e.setBackground(new BitmapDrawable(y8Var.getParentActivity().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, y8Var.fragmentView)));
                    y8Var.h = false;
                    y8Var.e.setVisibility(0);
                    y8Var.e.setAlpha(0.0f);
                    y8Var.f = true;
                    y8Var.fragmentView.invalidate();
                    y8Var.e.animate().setListener(new n8(y8Var, 0)).alpha(1.0f).setDuration(200L).start();
                    y8Var.Z = new u8();
                    ?? o8Var = new o8(y8Var.getParentActivity(), false, new m8(y8Var, i19));
                    u8 u8Var4 = y8Var.a.h;
                    if (u8Var4 != null) {
                        u8 u8Var5 = y8Var.Z;
                        int i21 = u8Var4.f;
                        u8Var5.f = i21;
                        i10 = 3;
                        o8Var.e(i21, 3);
                        u8 u8Var6 = y8Var.Z;
                        int i22 = y8Var.a.h.e;
                        u8Var6.e = i22;
                        o8Var.e(i22, 2);
                        u8 u8Var7 = y8Var.Z;
                        int i23 = y8Var.a.h.d;
                        u8Var7.d = i23;
                        o8Var.e(i23, 1);
                        u8 u8Var8 = y8Var.Z;
                        int i24 = y8Var.a.h.c;
                        u8Var8.c = i24;
                        o8Var.e(i24, 0);
                    } else {
                        i10 = 3;
                    }
                    u8 u8Var9 = y8Var.Z;
                    if (u8Var9.f != 0) {
                        i12 = 4;
                    } else if (u8Var9.e != 0) {
                        i12 = i10;
                    } else if (u8Var9.d == 0) {
                        i11 = -1;
                        r62 = 0;
                        i12 = 1;
                        o8Var.f(i11, 4, i12, r62);
                        y8Var.a.b(y8Var.Z, true);
                        y8Var.s0();
                        ?? linearLayout = new LinearLayout(y8Var.getParentActivity());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(r62, org.telegram.messenger.g0.L(8.0f), r62, r62);
                        linearLayout.addView(o8Var);
                        FrameLayout frameLayout = new FrameLayout(y8Var.getParentActivity());
                        int i25 = org.telegram.ui.ActionBar.n6.Fi;
                        float[] fArr = new float[1];
                        fArr[r62] = 8.0f;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.f(i25, fArr));
                        TextView textView = new TextView(y8Var.getParentActivity());
                        i5.c.r(14.0f, 1, 2131745343, textView, null);
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
                        frameLayout.addView(textView, c8.ma.e(-2, -2, 17));
                        linearLayout.addView(frameLayout, c8.ma.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                        frameLayout.setOnClickListener(new y7(1, y8Var, zArr));
                        org.telegram.messenger.b9 b9Var2 = y8Var.T;
                        b9Var2.O = linearLayout;
                        b9Var2.Q0 = true;
                        b9Var2.p0 = false;
                        b9Var2.show();
                        y8Var.isLightStatusBar();
                        break;
                    } else {
                        i12 = 2;
                    }
                    i11 = -1;
                    r62 = 0;
                    o8Var.f(i11, 4, i12, r62);
                    y8Var.a.b(y8Var.Z, true);
                    y8Var.s0();
                    ?? linearLayout2 = new LinearLayout(y8Var.getParentActivity());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(r62, org.telegram.messenger.g0.L(8.0f), r62, r62);
                    linearLayout2.addView(o8Var);
                    FrameLayout frameLayout2 = new FrameLayout(y8Var.getParentActivity());
                    int i252 = org.telegram.ui.ActionBar.n6.Fi;
                    float[] fArr2 = new float[1];
                    fArr2[r62] = 8.0f;
                    frameLayout2.setBackground(org.telegram.ui.ActionBar.b6.f(i252, fArr2));
                    TextView textView2 = new TextView(y8Var.getParentActivity());
                    i5.c.r(14.0f, 1, 2131745343, textView2, null);
                    textView2.setGravity(17);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, null);
                    frameLayout2.addView(textView2, c8.ma.e(-2, -2, 17));
                    linearLayout2.addView(frameLayout2, c8.ma.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout2.setOnClickListener(new y7(1, y8Var, zArr));
                    org.telegram.messenger.b9 b9Var22 = y8Var.T;
                    b9Var22.O = linearLayout2;
                    b9Var22.Q0 = true;
                    b9Var22.p0 = false;
                    b9Var22.show();
                    y8Var.isLightStatusBar();
                }
                break;
            case 3:
                lp lpVar = (lp) obj;
                ck0 ck0Var = lpVar.w1;
                jp jpVar = lpVar.r1;
                if (jpVar.d.get(i7) != lpVar.G1 && lpVar.L1 == null) {
                    lpVar.G1 = (kp) jpVar.d.get(i7);
                    lpVar.T0();
                    jpVar.E(i7);
                    lpVar.b.postDelayed(new we(lpVar, i7, 1), 100L);
                    for (int i26 = 0; i26 < ck0Var.getChildCount(); i26++) {
                        j01 j01Var = (j01) ck0Var.getChildAt(i26);
                        if (j01Var != view && (ap0Var = j01Var.K) != null) {
                            org.telegram.messenger.g0.r(ap0Var);
                            j01Var.K.run();
                        }
                    }
                    if (!((kp) jpVar.d.get(i7)).a.a) {
                        ((j01) view).d();
                    }
                    lpVar.a1(true);
                    break;
                }
                break;
            case 4:
                cr crVar = (cr) obj;
                ck0 ck0Var2 = crVar.o1;
                if (i7 > 3) {
                    crVar.Z1 = (TLRPC.Peer) crVar.U1.get(i7 - 4);
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i27 = 0;
                    while (i27 < ck0Var2.getChildCount()) {
                        View childAt = ck0Var2.getChildAt(i27);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.h4)) {
                            ((org.telegram.ui.Cells.h4) childAt).c(false, z10);
                        }
                        i27++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                ry ryVar = ((bx) obj).G;
                int i28 = ryVar.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
                    ArrayList arrayList3 = org.telegram.messenger.ri.d0(i28).t0[1];
                    int i29 = -1;
                    for (int i30 = 0; i30 < arrayList3.size(); i30++) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) arrayList3.get(i30);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i29 = i30;
                            }
                        }
                    }
                    org.telegram.messenger.ri.d0(i28).g1(true, true);
                    bv bvVar = new bv(h2Var, ryVar.getContext(), h2Var == null ? ryVar.a2 : h2Var.getResourceProvider(), arrayList2);
                    if (i29 >= 0) {
                        bvVar.J1 = i29;
                    }
                    if (h2Var != null) {
                        h2Var.showDialog(bvVar);
                        break;
                    } else {
                        bvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                ry ryVar2 = ((jy) obj).w;
                ryVar2.u1.o(new h41(ryVar2.getContext(), new mw(ryVar2), ryVar2.y1, ryVar2.z1, ryVar2.A1, (TLRPC.StickerSetCovered) view.getTag(), ryVar2.a2));
                break;
            case 7:
                qz qzVar = (qz) obj;
                org.telegram.ui.zr zrVar = qzVar.u1;
                ArrayList arrayList4 = ((qz) qzVar.o1.e).v1;
                org.telegram.messenger.ro roVar2 = i7 < arrayList4.size() ? (org.telegram.messenger.ro) arrayList4.get(i7) : null;
                boolean z14 = view instanceof org.telegram.ui.ActionBar.q2 ? ((org.telegram.ui.ActionBar.q2) view).e : false;
                org.telegram.ui.cx cxVar2 = (org.telegram.ui.cx) ((org.telegram.ui.dv) zrVar.b).b;
                ArrayList arrayList5 = cxVar2.K2;
                ArrayList K0 = qz.K0(cxVar2, roVar2, arrayList5, true, false);
                if (!z14) {
                    int size = K0.size() + (roVar2 != null ? roVar2.h.size() : 0);
                    if ((size > cxVar2.getMessagesController().Q4 && !cxVar2.getUserConfig().q()) || size > cxVar2.getMessagesController().R4) {
                        Context context = cxVar2.fragmentView.getContext();
                        i13 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                        cxVar2.showDialog(new ug.l0(4, i13, context, cxVar2, null));
                        qzVar.dismiss();
                        break;
                    }
                }
                if (roVar2 == null) {
                    cxVar = cxVar2;
                    cxVar.presentFragment(new org.telegram.ui.kz(null, K0));
                } else if (z14) {
                    for (int i31 = 0; i31 < arrayList5.size(); i31++) {
                        roVar2.i.add((Long) arrayList5.get(i31));
                        roVar2.h.remove(arrayList5.get(i31));
                    }
                    org.telegram.messenger.ro roVar3 = roVar2;
                    org.telegram.ui.kz.z0(roVar3, roVar2.g, roVar2.b, roVar2.c, roVar2.n, roVar2.m, roVar2.h, roVar2.i, roVar2.j, false, false, true, true, false, cxVar2, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView l42 = cxVar2.l4();
                    if (l42 != null) {
                        l42.k(longValue, 21, Integer.valueOf(arrayList5.size()), roVar3, null, null);
                    }
                    cxVar = cxVar2;
                } else {
                    if (K0.isEmpty()) {
                        roVar = roVar2;
                    } else {
                        for (int i32 = 0; i32 < K0.size(); i32++) {
                            roVar2.i.remove(K0.get(i32));
                        }
                        roVar2.h.addAll(K0);
                        roVar = roVar2;
                        org.telegram.ui.kz.z0(roVar, roVar2.g, roVar2.b, roVar2.c, roVar2.n, roVar2.m, roVar2.h, roVar2.i, roVar2.j, false, false, true, true, false, cxVar2, null);
                    }
                    cxVar = cxVar2;
                    long longValue2 = K0.size() == 1 ? ((Long) K0.get(0)).longValue() : 0L;
                    UndoView l43 = cxVar.l4();
                    if (l43 != null) {
                        l43.k(longValue2, 20, Integer.valueOf(K0.size()), roVar, null, null);
                    }
                }
                cxVar.p4(true);
                qzVar.dismiss();
                break;
            case 8:
                g00 g00Var = (g00) obj;
                org.telegram.ui.ActionBar.h2 h2Var2 = g00Var.s1;
                ArrayList arrayList6 = g00Var.c2;
                ArrayList arrayList7 = g00Var.e2;
                if ((view instanceof org.telegram.ui.Cells.h4) && (i14 = (i7 - 1) - g00Var.n2) >= 0 && i14 < arrayList6.size()) {
                    long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList6.get(i14));
                    if (!arrayList7.contains(Long.valueOf(o4))) {
                        z11 = false;
                        z12 = true;
                        arrayList7.add(Long.valueOf(o4));
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else if (g00Var.d2.contains(Long.valueOf(o4))) {
                        int i33 = -g00Var.y2;
                        g00Var.y2 = i33;
                        org.telegram.messenger.g0.E3(i33, view, null);
                        org.telegram.messenger.q2.E.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o4 >= 0) {
                            arrayList8.add(h2Var2.getMessagesController().c2(Long.valueOf(o4)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat O0 = h2Var2.getMessagesController().O0(Long.valueOf(-o4));
                            String M0 = org.telegram.messenger.v3.V(O0) ? org.telegram.messenger.gd.M0(2131750660, null) : org.telegram.messenger.gd.M0(2131750661, null);
                            arrayList8.add(O0);
                            str = M0;
                        }
                        if (g00Var.z2 != o4 || System.currentTimeMillis() - g00Var.A2 > 1500) {
                            g00Var.z2 = o4;
                            g00Var.A2 = System.currentTimeMillis();
                            gc g10 = new lc(g00Var.g2, null).g(str, arrayList8);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList7.remove(Long.valueOf(o4));
                        z11 = false;
                        z12 = true;
                        ((org.telegram.ui.Cells.h4) view).c(false, true);
                    }
                    g00Var.i1(z12);
                    g00Var.j1();
                    g00Var.e1(z11);
                    break;
                }
                break;
            case 9:
                s20 s20Var = (s20) obj;
                if (i7 == s20Var.d2) {
                    s20Var.b2.a.n1(true);
                    s20Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (!s20Var.a2.contains(Long.valueOf(a5Var.getUserId()))) {
                        s20Var.b2.a.q1(a5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                ei0 ei0Var = (ei0) obj;
                ArrayList arrayList9 = ei0Var.n;
                int d = ei0Var.f.d(i7);
                if (d == 0) {
                    di0 di0Var = ei0Var.F;
                    if (di0Var != null) {
                        di0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList9.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i7));
                        break;
                    }
                } else if (d == 1 && (bi0Var = ei0Var.H) != null) {
                    bi0Var.e(ei0Var.J);
                    break;
                }
                break;
            case 11:
                vi0 vi0Var = (vi0) obj;
                ui0 ui0Var = vi0Var.h0;
                if (ui0Var != null && (view instanceof ti0)) {
                    ui0Var.g(vi0Var, ((ti0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                yo0 yo0Var = ((vo0) obj).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ri.d0(yo0Var.a).j1.get(i7);
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
                    yo0Var.Z0(j3, o4Var);
                    break;
                } else {
                    tL_dialog.id = j3;
                    yo0Var.V0(null, tL_dialog);
                    boolean z15 = yo0Var.Q1.h(j3) >= 0;
                    if (o4Var.x) {
                        o4Var.w.a(z15, true);
                        break;
                    }
                }
                break;
            case 13:
                jt0 jt0Var = (jt0) obj;
                int i34 = i7 - 1;
                if (i34 >= 0 && i34 < org.telegram.messenger.qd.g()) {
                    jt0Var.s1.b(jt0.K0(i34));
                    jt0Var.dismiss();
                    break;
                }
                break;
            case 14:
                qu0 qu0Var = (qu0) obj;
                l41 G = qu0Var.T1.G(i7 - 1);
                Object obj2 = G != null ? G.H : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.mp.u1(qu0Var.a).E3(qu0Var.j1, (TLRPC.User) obj2, null, 0, null, false, false);
                    break;
                }
                break;
            case 15:
                iv0 iv0Var = (iv0) obj;
                if (i7 < 1) {
                    iv0Var.getClass();
                    break;
                } else {
                    ev0[] ev0VarArr = iv0Var.g3;
                    if (ev0VarArr != null) {
                        ev0 ev0Var = ev0VarArr[i7 - 1];
                        int L = org.telegram.messenger.g0.L(64.0f);
                        if (iv0Var.getMeasuredWidth() - view.getRight() < L) {
                            iv0Var.w0(L - (iv0Var.getMeasuredWidth() - view.getRight()), 0, lr.h);
                        } else if (view.getLeft() < L) {
                            iv0Var.w0(-(L - view.getLeft()), 0, lr.h);
                        }
                        org.telegram.messenger.x10 x10Var = iv0Var.v3;
                        if (x10Var != null) {
                            x10Var.a(ev0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                iw0 iw0Var = (iw0) obj;
                if (view instanceof cw0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iw0Var.N1;
                    org.telegram.ui.ActionBar.h2 h2Var3 = iw0Var.G1;
                    org.telegram.ui.ActionBar.i6 i6Var = iw0Var.J0;
                    if (h2Var3 != null) {
                        Context context2 = h2Var3.getContext();
                        if (h2Var3 instanceof org.telegram.ui.bn) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, i6Var);
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            org.telegram.ui.Cells.c0.v(null, 2131744627, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                            arrayList11.add(0);
                            arrayList10.add(org.telegram.messenger.gd.M0(2131744634, null));
                            arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                            arrayList11.add(1);
                            org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                            fi.d0 d0Var = new fi.d0(h1Var, arrayList11, tL_messages_stickerSet, h2Var3, i6Var, 11);
                            for (int i35 = 0; i35 < arrayList10.size(); i35++) {
                                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i35)).intValue(), (CharSequence) arrayList10.get(i35), false, i6Var);
                                c10.setTag(Integer.valueOf(i35));
                                c10.setOnClickListener(d0Var);
                            }
                            h1Var.c = 100;
                            h1Var.g = true;
                            h1Var.setOutsideTouchable(true);
                            h1Var.setClippingEnabled(true);
                            h1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            h1Var.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            h1Var.setInputMethodMode(2);
                            h1Var.getContentView().setFocusableInTouchMode(true);
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            h1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                            h1Var.b();
                            break;
                        } else {
                            nw0.a(tL_messages_stickerSet, h2Var3, i6Var);
                            break;
                        }
                    }
                } else if (!iw0Var.M1) {
                    if (iw0Var.R1 != null) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) iw0Var.o1.f.get(i7);
                        if (stickerSetCovered4 != null) {
                            iw0Var.dismiss();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                            tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                            tL_inputStickerSetID2.id = stickerSet4.id;
                            new iw0(iw0Var.I1, iw0Var.G1, tL_inputStickerSetID2, null, null, iw0Var.J0).show();
                            break;
                        }
                    } else {
                        ArrayList arrayList13 = iw0Var.T1;
                        if (arrayList13 == null) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iw0Var.N1;
                            if (tL_messages_stickerSet2 != null && i7 >= 0 && i7 < tL_messages_stickerSet2.documents.size()) {
                                iw0Var.O1 = iw0Var.N1.documents.get(i7);
                                int i36 = 0;
                                while (true) {
                                    if (i36 < iw0Var.O1.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = iw0Var.O1.attributes.get(i36);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                            String str2 = documentAttribute.alt;
                                            if (str2 != null && str2.length() > 0) {
                                                TextView textView3 = iw0Var.B1;
                                                textView3.setText(org.telegram.messenger.j6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                                            }
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                                TextView textView4 = iw0Var.B1;
                                String str3 = (String) org.telegram.messenger.ri.d0(iw0Var.a).d0.f(iw0Var.O1.id);
                                textView4.setText(org.telegram.messenger.j6.m(str3 != null ? str3 : "", iw0Var.B1.getPaint().getFontMetricsInt(), false, null, 0));
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = iw0Var.N1;
                                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.ns.p().x(view)) {
                                    iw0Var.A1.getImageReceiver().t0(org.telegram.messenger.fc.b(iw0Var.O1), null, org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(iw0Var.O1.thumbs, 90, false, null, false), iw0Var.O1), null, "webp", iw0Var.N1, 1);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iw0Var.x1.getLayoutParams();
                                    layoutParams.topMargin = iw0Var.Z1;
                                    iw0Var.x1.setLayoutParams(layoutParams);
                                    iw0Var.x1.setVisibility(0);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(iw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                    animatorSet.setDuration(200L);
                                    animatorSet.start();
                                    break;
                                }
                            }
                        } else if (i7 >= 0 && i7 < arrayList13.size()) {
                            org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) iw0Var.T1.get(i7);
                            iw0Var.P1 = syVar;
                            if (syVar.c) {
                                TextView textView5 = iw0Var.B1;
                                textView5.setText(org.telegram.messenger.j6.m(syVar.b, textView5.getPaint().getFontMetricsInt(), false, null, 0));
                                iw0Var.A1.n(org.telegram.messenger.fc.g(iw0Var.P1.a), null, null, null, null, iw0Var.P1.e ? "tgs" : null, 0, null);
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) iw0Var.x1.getLayoutParams();
                                layoutParams2.topMargin = iw0Var.Z1;
                                iw0Var.x1.setLayoutParams(layoutParams2);
                                iw0Var.x1.setVisibility(0);
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(iw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                animatorSet2.setDuration(200L);
                                animatorSet2.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ?? r13 = (yw0) obj;
                String str4 = ((xw0) view).a;
                if (r13.s && (ww0Var = r13.c) != null && (ww0Var.getFieldText() instanceof Spanned)) {
                    if (r13.W != null) {
                        intValue = ((Spanned) r13.c.getFieldText()).getSpanStart(r13.W);
                        intValue2 = ((Spanned) r13.c.getFieldText()).getSpanEnd(r13.W);
                    } else {
                        Integer num = r13.b0;
                        if (num != null && r13.c0 != null) {
                            intValue = num.intValue();
                            intValue2 = r13.c0.intValue();
                            r13.c0 = null;
                            r13.b0 = null;
                        }
                    }
                    Editable editText = r13.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (r13.W != null) {
                            if (r13.c.getFieldText() instanceof Spannable) {
                                ((Spannable) r13.c.getFieldText()).removeSpan(r13.W);
                            }
                            r13.W = null;
                        }
                        String obj3 = editText.toString();
                        String substring = obj3.substring(intValue, intValue2);
                        int length = substring.length();
                        int i37 = intValue2 - length;
                        while (i37 >= 0) {
                            int i38 = i37 + length;
                            if (obj3.substring(i37, i38).equals(substring)) {
                                ?? fontMetricsInt = r13.c.getEditField() != null ? r13.c.getEditField().getPaint().getFontMetricsInt() : r15;
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
                                        TLRPC.Document e10 = o5.e(r13.a, parseLong);
                                        SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(e10));
                                        spannableString.setSpan(e10 == null ? new x5(parseLong, (Paint.FontMetricsInt) fontMetricsInt) : new x5(e10, (Paint.FontMetricsInt) fontMetricsInt), 0, spannableString.length(), 33);
                                        m10 = spannableString;
                                    } catch (Exception unused) {
                                        m10 = null;
                                    }
                                }
                                if (m10 == null || ((x5VarArr = (x5[]) editText.getSpans(i37, i38, x5.class)) != null && x5VarArr.length > 0)) {
                                    i15 = 3;
                                    r12 = 1;
                                    r13.performHapticFeedback(i15, r12);
                                    org.telegram.messenger.j6.a(str4);
                                    r13.s = false;
                                    r13.w = r12;
                                    r13.J = 0;
                                    a3Var = r13.d;
                                    if (a3Var != null) {
                                        a3Var.invalidate();
                                        break;
                                    }
                                } else {
                                    org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) editText.getSpans(i37, i38, org.telegram.messenger.g6.class);
                                    if (g6VarArr != null) {
                                        for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                                            editText.removeSpan(g6Var);
                                        }
                                    }
                                    editText.replace(i37, i38, "");
                                    editText.insert(i37, m10);
                                    i37 -= length;
                                    z13 = true;
                                    i18 = 3;
                                    i20 = 0;
                                    r15 = null;
                                }
                            } else {
                                r12 = z13;
                                i15 = i18;
                                r13.performHapticFeedback(i15, r12);
                                org.telegram.messenger.j6.a(str4);
                                r13.s = false;
                                r13.w = r12;
                                r13.J = 0;
                                a3Var = r13.d;
                                if (a3Var != null) {
                                }
                            }
                        }
                        r12 = z13;
                        i15 = i18;
                        r13.performHapticFeedback(i15, r12);
                        org.telegram.messenger.j6.a(str4);
                        r13.s = false;
                        r13.w = r12;
                        r13.J = 0;
                        a3Var = r13.d;
                        if (a3Var != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i7 != 0) {
                    v4.i0 adapter = editorAlert.n1.getAdapter();
                    zz0 zz0Var = editorAlert.s1;
                    if (adapter == zz0Var) {
                        int i39 = i7 - 1;
                        ArrayList arrayList14 = zz0Var.d;
                        themeEditorView.e = (i39 < 0 || i39 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i39);
                    } else {
                        a01 a01Var = editorAlert.t1;
                        int i40 = i7 - 1;
                        if (i40 < 0) {
                            a01Var.getClass();
                        } else if (i40 < a01Var.e.size()) {
                            arrayList = (ArrayList) a01Var.e.get(i40);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i7;
                    for (int i41 = 0; i41 < themeEditorView.e.size(); i41++) {
                        org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) themeEditorView.e.get(i41);
                        int i42 = w6Var.e;
                        if (i42 == org.telegram.ui.ActionBar.n6.Ee) {
                            final a8.r7 r7Var = themeEditorView.m;
                            org.telegram.ui.ActionBar.x2 j12 = org.telegram.messenger.n10.j((Activity) r7Var.c, false, 1, null);
                            j12.P = org.telegram.messenger.gd.M0(2131752112, null);
                            j12.Q = true;
                            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131752102, null), org.telegram.messenger.gd.M0(2131745461, null), org.telegram.messenger.gd.M0(2131745468, null), org.telegram.messenger.gd.M0(2131751589, null)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.k71
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i43) {
                                    a8.r7 r7Var2 = a8.r7.this;
                                    l71 l71Var = (l71) r7Var2.e;
                                    Activity activity = (Activity) r7Var2.c;
                                    try {
                                        if (i43 != 0) {
                                            if (i43 == 1) {
                                                r7Var2.G();
                                                return;
                                            } else if (i43 == 2) {
                                                l71Var.a();
                                                return;
                                            } else {
                                                if (i43 == 3) {
                                                    l71Var.b(null, null, false);
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
                            int x02 = org.telegram.ui.ActionBar.n6.x0(w6Var.i, i42, false);
                            w6Var.h = x02;
                            if (i41 == 0) {
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
                h41 h41Var = (h41) obj;
                v4.i0 adapter2 = h41Var.n.getAdapter();
                jg.c2 c2Var = h41Var.w;
                if (adapter2 == c2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) c2Var.L.get(i7);
                } else {
                    g41 g41Var = h41Var.s;
                    stickerSetCovered = i7 < g41Var.x ? (TLRPC.StickerSetCovered) g41Var.f.get(i7) : null;
                }
                if (stickerSetCovered != null) {
                    h41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
