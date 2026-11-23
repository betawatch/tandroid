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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:87|(3:89|(1:91)|92)|93|(2:95|(5:97|(1:99)(1:141)|(1:101)|(1:140)(5:105|106|107|(1:109)(1:137)|110)|(5:117|118|119|120|(1:122))(3:127|(3:129|(2:132|130)|133)(1:135)|134))(6:142|143|118|119|120|(0)(0)))|144|143|118|119|120|(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ae  */
    /* JADX WARN: Type inference failed for: r10v34, types: [android.view.View, org.telegram.ui.Components.ax0] */
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
    public final void c(int i7, View view) {
        int i10;
        int i11;
        int i12;
        u8 u8Var;
        cp0 cp0Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.so soVar;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        String str;
        di0 di0Var;
        long j3;
        TLRPC.StickerSet stickerSet2;
        yw0 yw0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r12;
        bi.e3 e3Var;
        CharSequence m10;
        y5[] y5VarArr;
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
                ((n0) obj).P2.G(i7 - 1);
                break;
            case 1:
                ((w) obj).c2.G(i7 - 1);
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
                    org.telegram.messenger.c9 c9Var = new org.telegram.messenger.c9(y8Var, y8Var.getParentActivity());
                    y8Var.T = c9Var;
                    c9Var.O();
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
                    o8 o8Var = new o8(y8Var.getParentActivity(), false, new l8(y8Var, i19));
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
                        i12 = 1;
                        o8Var.f(i11, 4, i12, false);
                        y8Var.a.b(y8Var.Z, true);
                        y8Var.s0();
                        ?? linearLayout = new LinearLayout(y8Var.getParentActivity());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                        linearLayout.addView(o8Var);
                        FrameLayout frameLayout = new FrameLayout(y8Var.getParentActivity());
                        frameLayout.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 8.0f));
                        TextView textView = new TextView(y8Var.getParentActivity());
                        i5.c.r(14.0f, 1, 2131745342, textView, null);
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
                        frameLayout.addView(textView, c8.ma.e(-2, -2, 17));
                        linearLayout.addView(frameLayout, c8.ma.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                        frameLayout.setOnClickListener(new m8(0, y8Var, zArr));
                        org.telegram.messenger.c9 c9Var2 = y8Var.T;
                        c9Var2.O = linearLayout;
                        c9Var2.Q0 = true;
                        c9Var2.p0 = false;
                        c9Var2.show();
                        y8Var.isLightStatusBar();
                        break;
                    } else {
                        i12 = 2;
                    }
                    i11 = -1;
                    o8Var.f(i11, 4, i12, false);
                    y8Var.a.b(y8Var.Z, true);
                    y8Var.s0();
                    ?? linearLayout2 = new LinearLayout(y8Var.getParentActivity());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                    linearLayout2.addView(o8Var);
                    FrameLayout frameLayout2 = new FrameLayout(y8Var.getParentActivity());
                    frameLayout2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 8.0f));
                    TextView textView2 = new TextView(y8Var.getParentActivity());
                    i5.c.r(14.0f, 1, 2131745342, textView2, null);
                    textView2.setGravity(17);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Ji, null);
                    frameLayout2.addView(textView2, c8.ma.e(-2, -2, 17));
                    linearLayout2.addView(frameLayout2, c8.ma.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout2.setOnClickListener(new m8(0, y8Var, zArr));
                    org.telegram.messenger.c9 c9Var22 = y8Var.T;
                    c9Var22.O = linearLayout2;
                    c9Var22.Q0 = true;
                    c9Var22.p0 = false;
                    c9Var22.show();
                    y8Var.isLightStatusBar();
                }
                break;
            case 3:
                np npVar = (np) obj;
                ek0 ek0Var = npVar.w1;
                lp lpVar = npVar.r1;
                if (lpVar.d.get(i7) != npVar.G1 && npVar.L1 == null) {
                    npVar.G1 = (mp) lpVar.d.get(i7);
                    npVar.T0();
                    lpVar.E(i7);
                    npVar.b.postDelayed(new we(npVar, i7, 1), 100L);
                    for (int i25 = 0; i25 < ek0Var.getChildCount(); i25++) {
                        k01 k01Var = (k01) ek0Var.getChildAt(i25);
                        if (k01Var != view && (cp0Var = k01Var.K) != null) {
                            org.telegram.messenger.g0.r(cp0Var);
                            k01Var.K.run();
                        }
                    }
                    if (!((mp) lpVar.d.get(i7)).a.a) {
                        ((k01) view).d();
                    }
                    npVar.a1(true);
                    break;
                }
                break;
            case 4:
                er erVar = (er) obj;
                ek0 ek0Var2 = erVar.o1;
                if (i7 > 3) {
                    erVar.Z1 = (TLRPC.Peer) erVar.U1.get(i7 - 4);
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
                ty tyVar = ((dx) obj).G;
                int i27 = tyVar.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.g2 g2Var = tyVar.Z1;
                    ArrayList arrayList3 = org.telegram.messenger.si.d0(i27).t0[1];
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
                    org.telegram.messenger.si.d0(i27).g1(true, true);
                    ev evVar = new ev(g2Var, tyVar.getContext(), g2Var == null ? tyVar.a2 : g2Var.getResourceProvider(), arrayList2);
                    if (i28 >= 0) {
                        evVar.J1 = i28;
                    }
                    if (g2Var != null) {
                        g2Var.showDialog(evVar);
                        break;
                    } else {
                        evVar.show();
                        break;
                    }
                }
                break;
            case 6:
                ty tyVar2 = ((ly) obj).w;
                tyVar2.u1.o(new k41(tyVar2.getContext(), new ow(tyVar2), tyVar2.y1, tyVar2.z1, tyVar2.A1, (TLRPC.StickerSetCovered) view.getTag(), tyVar2.a2));
                break;
            case 7:
                sz szVar = (sz) obj;
                org.telegram.ui.zr zrVar = szVar.u1;
                ArrayList arrayList4 = ((sz) szVar.o1.e).v1;
                org.telegram.messenger.so soVar2 = i7 < arrayList4.size() ? (org.telegram.messenger.so) arrayList4.get(i7) : null;
                boolean z14 = view instanceof org.telegram.ui.ActionBar.p2 ? ((org.telegram.ui.ActionBar.p2) view).e : false;
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) ((org.telegram.ui.dv) zrVar.b).b;
                ArrayList arrayList5 = cxVar.K2;
                ArrayList K0 = sz.K0(cxVar, soVar2, arrayList5, true, false);
                if (!z14) {
                    int size = K0.size() + (soVar2 != null ? soVar2.h.size() : 0);
                    if ((size > cxVar.getMessagesController().Q4 && !cxVar.getUserConfig().q()) || size > cxVar.getMessagesController().R4) {
                        Context context = cxVar.fragmentView.getContext();
                        i13 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                        cxVar.showDialog(new ug.k0(4, i13, context, cxVar, null));
                        szVar.dismiss();
                        break;
                    }
                }
                if (soVar2 == null) {
                    cxVar.presentFragment(new org.telegram.ui.kz(null, K0));
                } else if (z14) {
                    for (int i30 = 0; i30 < arrayList5.size(); i30++) {
                        soVar2.i.add((Long) arrayList5.get(i30));
                        soVar2.h.remove(arrayList5.get(i30));
                    }
                    org.telegram.messenger.so soVar3 = soVar2;
                    org.telegram.ui.kz.z0(soVar3, soVar2.g, soVar2.b, soVar2.c, soVar2.n, soVar2.m, soVar2.h, soVar2.i, soVar2.j, false, false, true, true, false, cxVar, null);
                    long longValue = arrayList5.size() == 1 ? ((Long) arrayList5.get(0)).longValue() : 0L;
                    UndoView l42 = cxVar.l4();
                    if (l42 != null) {
                        l42.k(longValue, 21, Integer.valueOf(arrayList5.size()), soVar3, null, null);
                    }
                    cxVar = cxVar;
                } else {
                    if (K0.isEmpty()) {
                        soVar = soVar2;
                    } else {
                        for (int i31 = 0; i31 < K0.size(); i31++) {
                            soVar2.i.remove(K0.get(i31));
                        }
                        soVar2.h.addAll(K0);
                        soVar = soVar2;
                        org.telegram.ui.kz.z0(soVar, soVar2.g, soVar2.b, soVar2.c, soVar2.n, soVar2.m, soVar2.h, soVar2.i, soVar2.j, false, false, true, true, false, cxVar, null);
                    }
                    cxVar = cxVar;
                    long longValue2 = K0.size() == 1 ? ((Long) K0.get(0)).longValue() : 0L;
                    org.telegram.messenger.so soVar4 = soVar;
                    UndoView l43 = cxVar.l4();
                    if (l43 != null) {
                        l43.k(longValue2, 20, Integer.valueOf(K0.size()), soVar4, null, null);
                    }
                }
                cxVar.p4(true);
                szVar.dismiss();
                break;
            case 8:
                i00 i00Var = (i00) obj;
                org.telegram.ui.ActionBar.g2 g2Var2 = i00Var.s1;
                ArrayList arrayList6 = i00Var.c2;
                ArrayList arrayList7 = i00Var.e2;
                if ((view instanceof org.telegram.ui.Cells.i4) && (i14 = (i7 - 1) - i00Var.n2) >= 0 && i14 < arrayList6.size()) {
                    long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList6.get(i14));
                    if (!arrayList7.contains(Long.valueOf(o4))) {
                        z11 = true;
                        z12 = false;
                        arrayList7.add(Long.valueOf(o4));
                        ((org.telegram.ui.Cells.i4) view).c(true, true);
                    } else if (i00Var.d2.contains(Long.valueOf(o4))) {
                        int i32 = -i00Var.y2;
                        i00Var.y2 = i32;
                        org.telegram.messenger.g0.E3(i32, view, null);
                        org.telegram.messenger.q2.E.a();
                        ArrayList arrayList8 = new ArrayList();
                        if (o4 >= 0) {
                            arrayList8.add(g2Var2.getMessagesController().c2(Long.valueOf(o4)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(-o4));
                            String N0 = org.telegram.messenger.v3.V(O0) ? org.telegram.messenger.hd.N0(2131750659, null) : org.telegram.messenger.hd.N0(2131750660, null);
                            arrayList8.add(O0);
                            str = N0;
                        }
                        if (i00Var.z2 != o4 || System.currentTimeMillis() - i00Var.A2 > 1500) {
                            i00Var.z2 = o4;
                            i00Var.A2 = System.currentTimeMillis();
                            gc g10 = new lc(i00Var.g2, null).g(str, arrayList8);
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
                    i00Var.i1(z11);
                    i00Var.j1();
                    i00Var.e1(z12);
                    break;
                }
                break;
            case 9:
                v20 v20Var = (v20) obj;
                if (i7 == v20Var.d2) {
                    v20Var.b2.a.n1(true);
                    v20Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!v20Var.a2.contains(Long.valueOf(b5Var.getUserId()))) {
                        v20Var.b2.a.q1(b5Var.getUserId(), true);
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
                        fi0Var.a(org.telegram.messenger.gj.B1(((TLRPC.MessagePeerReaction) arrayList9.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList9.get(i7));
                        break;
                    }
                } else if (d == 1 && (di0Var = gi0Var.H) != null) {
                    di0Var.e(gi0Var.J);
                    break;
                }
                break;
            case 11:
                xi0 xi0Var = (xi0) obj;
                wi0 wi0Var = xi0Var.h0;
                if (wi0Var != null && (view instanceof vi0)) {
                    wi0Var.g(xi0Var, ((vi0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                ap0 ap0Var = ((xo0) obj).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.si.d0(ap0Var.a).j1.get(i7);
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
                    ap0Var.Z0(j3, p4Var);
                    break;
                } else {
                    tL_dialog.id = j3;
                    ap0Var.V0(null, tL_dialog);
                    boolean z15 = ap0Var.Q1.h(j3) >= 0;
                    if (p4Var.x) {
                        p4Var.w.a(z15, true);
                        break;
                    }
                }
                break;
            case 13:
                mt0 mt0Var = (mt0) obj;
                int i33 = i7 - 1;
                if (i33 >= 0 && i33 < org.telegram.messenger.rd.g()) {
                    mt0Var.s1.b(mt0.K0(i33));
                    mt0Var.dismiss();
                    break;
                }
                break;
            case 14:
                tu0 tu0Var = (tu0) obj;
                o41 G = tu0Var.T1.G(i7 - 1);
                Object obj2 = G != null ? G.H : null;
                if (obj2 instanceof TLRPC.User) {
                    org.telegram.messenger.np.u1(tu0Var.a).E3(tu0Var.j1, (TLRPC.User) obj2, null, 0, null, false, false);
                    break;
                }
                break;
            case 15:
                lv0 lv0Var = (lv0) obj;
                if (i7 < 1) {
                    lv0Var.getClass();
                    break;
                } else {
                    hv0[] hv0VarArr = lv0Var.g3;
                    if (hv0VarArr != null) {
                        hv0 hv0Var = hv0VarArr[i7 - 1];
                        int L = org.telegram.messenger.g0.L(64.0f);
                        if (lv0Var.getMeasuredWidth() - view.getRight() < L) {
                            lv0Var.w0(L - (lv0Var.getMeasuredWidth() - view.getRight()), 0, nr.h);
                        } else if (view.getLeft() < L) {
                            lv0Var.w0(-(L - view.getLeft()), 0, nr.h);
                        }
                        org.telegram.messenger.y10 y10Var = lv0Var.v3;
                        if (y10Var != null) {
                            y10Var.a(hv0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                kw0 kw0Var = (kw0) obj;
                if (view instanceof ew0) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
                    org.telegram.ui.ActionBar.g2 g2Var3 = kw0Var.G1;
                    org.telegram.ui.ActionBar.h6 h6Var = kw0Var.J0;
                    if (g2Var3 != null) {
                        Context context2 = g2Var3.getContext();
                        if (g2Var3 instanceof org.telegram.ui.bn) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context2, h6Var);
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            org.telegram.ui.Cells.c0.v(null, 2131744619, arrayList10, R.drawable.menu_sticker_add, arrayList12);
                            arrayList11.add(0);
                            arrayList10.add(org.telegram.messenger.hd.N0(2131744626, null));
                            arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_select));
                            arrayList11.add(1);
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                            fi.d0 d0Var = new fi.d0(g1Var, arrayList11, tL_messages_stickerSet, g2Var3, h6Var, 11);
                            for (int i34 = 0; i34 < arrayList10.size(); i34++) {
                                org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList12.get(i34)).intValue(), (CharSequence) arrayList10.get(i34), false, h6Var);
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
                            pw0.a(tL_messages_stickerSet, g2Var3, h6Var);
                            break;
                        }
                    }
                } else if (!kw0Var.M1) {
                    if (kw0Var.R1 != null) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) kw0Var.o1.f.get(i7);
                        if (stickerSetCovered4 != null) {
                            kw0Var.dismiss();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet4 = stickerSetCovered4.set;
                            tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                            tL_inputStickerSetID2.id = stickerSet4.id;
                            new kw0(kw0Var.I1, kw0Var.G1, tL_inputStickerSetID2, null, null, kw0Var.J0).show();
                            break;
                        }
                    } else {
                        ArrayList arrayList13 = kw0Var.T1;
                        if (arrayList13 == null) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kw0Var.N1;
                            if (tL_messages_stickerSet2 != null && i7 >= 0 && i7 < tL_messages_stickerSet2.documents.size()) {
                                kw0Var.O1 = kw0Var.N1.documents.get(i7);
                                int i35 = 0;
                                while (true) {
                                    if (i35 < kw0Var.O1.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = kw0Var.O1.attributes.get(i35);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                            String str2 = documentAttribute.alt;
                                            if (str2 != null && str2.length() > 0) {
                                                TextView textView3 = kw0Var.B1;
                                                textView3.setText(org.telegram.messenger.j6.m(documentAttribute.alt, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                                            }
                                        } else {
                                            i35++;
                                        }
                                    }
                                }
                                TextView textView4 = kw0Var.B1;
                                String str3 = (String) org.telegram.messenger.si.d0(kw0Var.a).d0.f(kw0Var.O1.id);
                                textView4.setText(org.telegram.messenger.j6.m(str3 != null ? str3 : "", kw0Var.B1.getPaint().getFontMetricsInt(), false, null, 0));
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = kw0Var.N1;
                                if ((tL_messages_stickerSet3 == null || (stickerSet2 = tL_messages_stickerSet3.set) == null || !stickerSet2.emojis) && !org.telegram.ui.ns.p().x(view)) {
                                    kw0Var.A1.getImageReceiver().t0(org.telegram.messenger.gc.b(kw0Var.O1), null, org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(kw0Var.O1.thumbs, 90, false, null, false), kw0Var.O1), null, "webp", kw0Var.N1, 1);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kw0Var.x1.getLayoutParams();
                                    layoutParams.topMargin = kw0Var.Z1;
                                    kw0Var.x1.setLayoutParams(layoutParams);
                                    kw0Var.x1.setVisibility(0);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(kw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                    animatorSet.setDuration(200L);
                                    animatorSet.start();
                                    break;
                                }
                            }
                        } else if (i7 >= 0 && i7 < arrayList13.size()) {
                            org.telegram.messenger.ty tyVar3 = (org.telegram.messenger.ty) kw0Var.T1.get(i7);
                            kw0Var.P1 = tyVar3;
                            if (tyVar3.c) {
                                TextView textView5 = kw0Var.B1;
                                textView5.setText(org.telegram.messenger.j6.m(tyVar3.b, textView5.getPaint().getFontMetricsInt(), false, null, 0));
                                kw0Var.A1.n(org.telegram.messenger.gc.g(kw0Var.P1.a), null, null, null, null, kw0Var.P1.e ? "tgs" : null, 0, null);
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) kw0Var.x1.getLayoutParams();
                                layoutParams2.topMargin = kw0Var.Z1;
                                kw0Var.x1.setLayoutParams(layoutParams2);
                                kw0Var.x1.setVisibility(0);
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(kw0Var.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                animatorSet2.setDuration(200L);
                                animatorSet2.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ?? r10 = (ax0) obj;
                String str4 = ((zw0) view).a;
                if (r10.s && (yw0Var = r10.c) != null && (yw0Var.getFieldText() instanceof Spanned)) {
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
                                        TLRPC.Document e10 = p5.e(r10.a, parseLong);
                                        SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(e10));
                                        spannableString.setSpan(e10 == null ? new y5(parseLong, (Paint.FontMetricsInt) fontMetricsInt) : new y5(e10, (Paint.FontMetricsInt) fontMetricsInt), 0, spannableString.length(), 33);
                                        m10 = spannableString;
                                    } catch (Exception unused) {
                                        m10 = null;
                                    }
                                }
                                if (m10 == null || ((y5VarArr = (y5[]) editText.getSpans(i36, i37, y5.class)) != null && y5VarArr.length > 0)) {
                                    i15 = 3;
                                    r12 = 1;
                                    r10.performHapticFeedback(i15, r12);
                                    org.telegram.messenger.j6.a(str4);
                                    r10.s = false;
                                    r10.w = r12;
                                    r10.J = 0;
                                    e3Var = r10.d;
                                    if (e3Var != null) {
                                        e3Var.invalidate();
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
                                e3Var = r10.d;
                                if (e3Var != null) {
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
                        e3Var = r10.d;
                        if (e3Var != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i7 != 0) {
                    v4.i0 adapter = editorAlert.n1.getAdapter();
                    b01 b01Var = editorAlert.s1;
                    if (adapter == b01Var) {
                        int i38 = i7 - 1;
                        ArrayList arrayList14 = b01Var.d;
                        themeEditorView.e = (i38 < 0 || i38 >= arrayList14.size()) ? null : (ArrayList) arrayList14.get(i38);
                    } else {
                        c01 c01Var = editorAlert.t1;
                        int i39 = i7 - 1;
                        if (i39 < 0) {
                            c01Var.getClass();
                        } else if (i39 < c01Var.e.size()) {
                            arrayList = (ArrayList) c01Var.e.get(i39);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i7;
                    for (int i40 = 0; i40 < themeEditorView.e.size(); i40++) {
                        org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) themeEditorView.e.get(i40);
                        int i41 = v6Var.e;
                        if (i41 == org.telegram.ui.ActionBar.m6.Ee) {
                            final a8.r7 r7Var = themeEditorView.m;
                            org.telegram.ui.ActionBar.w2 j12 = org.telegram.messenger.o10.j((Activity) r7Var.c, false, 1, null);
                            j12.P = org.telegram.messenger.hd.N0(2131752111, null);
                            j12.Q = true;
                            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131752101, null), org.telegram.messenger.hd.N0(2131745460, null), org.telegram.messenger.hd.N0(2131745467, null), org.telegram.messenger.hd.N0(2131751588, null)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.n71
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i42) {
                                    a8.r7 r7Var2 = a8.r7.this;
                                    o71 o71Var = (o71) r7Var2.e;
                                    Activity activity = (Activity) r7Var2.c;
                                    try {
                                        if (i42 != 0) {
                                            if (i42 == 1) {
                                                r7Var2.G();
                                                return;
                                            } else if (i42 == 2) {
                                                o71Var.a();
                                                return;
                                            } else {
                                                if (i42 == 3) {
                                                    o71Var.b(null, null, false);
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
                            int x02 = org.telegram.ui.ActionBar.m6.x0(v6Var.i, i41, false);
                            v6Var.h = x02;
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
                g11 g11Var = (g11) obj;
                ArrayList arrayList15 = g11Var.U;
                if (i7 >= 0 && i7 < arrayList15.size()) {
                    d11 d11Var = (d11) arrayList15.get(i7);
                    long j13 = d11Var.a;
                    if (j13 != 0) {
                        if (g11Var.V == j13) {
                            j13 = 0;
                        }
                        g11Var.V = j13;
                    } else {
                        g11Var.W = d11Var.b.equals(g11Var.W) ? null : d11Var.b;
                    }
                    org.telegram.messenger.g0.d0(g11Var.S, new fi.e(i17));
                    g11Var.l(false);
                    g11Var.n();
                    break;
                }
                break;
            default:
                k41 k41Var = (k41) obj;
                v4.i0 adapter2 = k41Var.n.getAdapter();
                jg.c2 c2Var = k41Var.w;
                if (adapter2 == c2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) c2Var.L.get(i7);
                } else {
                    j41 j41Var = k41Var.s;
                    stickerSetCovered = i7 < j41Var.x ? (TLRPC.StickerSetCovered) j41Var.f.get(i7) : null;
                }
                if (stickerSetCovered != null) {
                    k41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
