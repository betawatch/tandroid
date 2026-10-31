package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        cr crVar = (cr) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (crVar.Y1 == null) {
            Context context = crVar.getContext();
            org.telegram.ui.ActionBar.p6 p6Var = crVar.I0;
            jg.z2 z2Var = new jg.z2(context, 7);
            z2Var.setOrientation(1);
            ei0 ei0Var = new ei0(context);
            ei0Var.setAutoRepeat(true);
            ei0Var.f(R.raw.utyan_streaming, org.telegram.messenger.zs.x1, org.telegram.messenger.zs.x1, null);
            ei0Var.d();
            z2Var.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.x1, org.telegram.messenger.zs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131744464, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
            z2Var.addView(textView, w7.b6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, p6Var);
            textView2.setText(org.telegram.messenger.cd.a0(null, null, 2131743262, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            z2Var.addView(textView2, w7.b6.t(-2, -2, 1, 28, 0, 28, 17));
            crVar.Y1 = z2Var;
        }
        arrayList.add(a51.k(crVar.Y1));
        arrayList.add(a51.C(null));
        arrayList.add(a51.u(org.telegram.messenger.cd.L0(2131743457, null)));
        String str2 = crVar.T1;
        String L0 = org.telegram.messenger.cd.L0(2131743458, null);
        int i10 = br.b;
        a51 K = a51.K(br.class);
        K.l = str2;
        K.n = L0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = crVar.V1;
        String L02 = org.telegram.messenger.cd.L0(2131743459, null);
        a51 K2 = a51.K(br.class);
        K2.l = spannableStringBuilder;
        K2.n = L02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (crVar.X1) {
            str = org.telegram.messenger.cd.L0(crVar.P1 ? 2131743454 : 2131743455, null);
        }
        arrayList.add(a51.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        final gs gsVar = (gs) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i10 = gsVar.P;
        r2 r2Var = gsVar.j0;
        ArrayList arrayList2 = gsVar.V;
        fs fsVar = gsVar.S;
        boolean z11 = gsVar.R;
        HashSet hashSet = new HashSet();
        final int i11 = 0;
        final int i12 = 1;
        if (!TextUtils.isEmpty(gsVar.g0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(gsVar.T);
            arrayList3.addAll(gsVar.U);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z11) {
                    arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745839, null)));
                } else {
                    arrayList.add(a51.s(org.telegram.messenger.cd.L0(2131745839, null), org.telegram.messenger.cd.L0(gsVar.X ? 2131745358 : 2131745357, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.ds
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    gs gsVar2 = gsVar;
                                    gsVar2.X = !gsVar2.X;
                                    gsVar2.O(true);
                                    break;
                                default:
                                    gs gsVar3 = gsVar;
                                    gsVar3.W = !gsVar3.W;
                                    gsVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!gsVar.X && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    a51 w9 = a51.w((TLObject) arrayList3.get(i13));
                    w9.t = true;
                    w9.H = r2Var;
                    arrayList.add(w9);
                }
            }
            if (arrayList2.isEmpty() || z11) {
                return;
            }
            arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745773, null)));
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                a51 a51Var = new a51(33);
                a51Var.G = (org.telegram.messenger.jj) obj3;
                arrayList.add(a51Var);
            }
            if (gsVar.d0) {
                arrayList.add(a51.p(1));
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.ui.b0(i10).l1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(org.telegram.messenger.o5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (Z1 != null && Z1.bot) {
                    arrayList5.add(Z1);
                }
            }
        }
        gsVar.Z = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                arrayList.add(a51.s(org.telegram.messenger.cd.L0(2131745837, null), org.telegram.messenger.cd.L0(gsVar.W ? 2131745358 : 2131745357, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.ds
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                gs gsVar2 = gsVar;
                                gsVar2.X = !gsVar2.X;
                                gsVar2.O(true);
                                break;
                            default:
                                gs gsVar3 = gsVar;
                                gsVar3.W = !gsVar3.W;
                                gsVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745837, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || gsVar.W); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    a51 w10 = a51.w(user);
                    w10.q = true;
                    w10.t = true;
                    w10.H = r2Var;
                    arrayList.add(w10);
                }
            }
        }
        hashSet.clear();
        gsVar.a0 = arrayList.size();
        ArrayList arrayList6 = fsVar.h;
        if (arrayList6.isEmpty()) {
            if (fsVar.c || !fsVar.e) {
                if (!z11) {
                    arrayList.add(a51.p(30));
                }
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
            }
            z10 = false;
        } else {
            if (!z11) {
                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745836, null)));
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    a51 w11 = a51.w(user2);
                    w11.q = true;
                    w11.r = true;
                    w11.t = true;
                    w11.H = r2Var;
                    arrayList.add(w11);
                    z12 = true;
                }
            }
            if (fsVar.c || !fsVar.e) {
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
            }
            z10 = z12;
        }
        if (z10) {
            arrayList.add(a51.C(gsVar.Y));
        }
    }

    private final void d(Object obj, Object obj2) {
        final bn0 bn0Var = (bn0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = bn0Var.R;
        ArrayList arrayList3 = bn0Var.X;
        int i10 = bn0Var.P;
        final int i11 = 0;
        if (TextUtils.isEmpty(bn0Var.d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(a51.s(org.telegram.messenger.cd.L0(2131745756, null), org.telegram.messenger.cd.L0(bn0Var.W ? 2131745358 : 2131745357, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.hs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    bn0 bn0Var2 = bn0Var;
                                    bn0Var2.W = !bn0Var2.W;
                                    bn0Var2.O(true);
                                    if (bn0Var2.W) {
                                        org.telegram.messenger.i0.v1(bn0Var2.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    bn0 bn0Var3 = bn0Var;
                                    bn0Var3.V = !bn0Var3.V;
                                    bn0Var3.O(true);
                                    if (bn0Var3.V) {
                                        org.telegram.messenger.i0.v1(bn0Var3.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745756, null)));
                }
                int size = arrayList3.size();
                if (!bn0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    a51 w9 = a51.w((TLObject) arrayList3.get(i12));
                    w9.I = true;
                    arrayList.add(w9);
                }
            }
            HashMap hashMap = org.telegram.messenger.vp.r1(i10).Z7;
            org.telegram.messenger.wo woVar = hashMap == null ? null : (org.telegram.messenger.wo) hashMap.get(0L);
            if (woVar == null) {
                arrayList.add(a51.p(30));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = woVar.b;
            int size2 = arrayList5.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj3 = arrayList5.get(i13);
                i13++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(chat.id));
                    if (org.telegram.messenger.w3.r0(chat) && (L0 == null || org.telegram.messenger.w3.r0(L0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745728, null)));
            }
            int size3 = arrayList4.size();
            while (i11 < size3) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                arrayList.add(a51.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = bn0Var.S;
        int size4 = arrayList7.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj5 = arrayList7.get(i14);
            i14++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i15 = size4;
            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(chat2.id));
            if (org.telegram.messenger.w3.r0(chat2) && (L02 == null || org.telegram.messenger.w3.r0(L02))) {
                arrayList6.add(chat2);
            }
            size4 = i15;
        }
        ArrayList arrayList8 = bn0Var.T;
        int size5 = arrayList8.size();
        int i16 = 0;
        while (i16 < size5) {
            Object obj6 = arrayList8.get(i16);
            i16++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat L03 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(chat3.id));
            if (org.telegram.messenger.w3.r0(chat3) && (L03 == null || org.telegram.messenger.w3.r0(L03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = bn0Var.U;
        int size6 = arrayList9.size();
        int i17 = 0;
        while (i17 < size6) {
            Object obj7 = arrayList9.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat L04 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(chat4.id));
            if (org.telegram.messenger.w3.r0(chat4) && (L04 == null || org.telegram.messenger.w3.r0(L04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745831, null)));
            } else {
                final int i18 = 1;
                arrayList.add(a51.s(org.telegram.messenger.cd.L0(2131745831, null), org.telegram.messenger.cd.L0(bn0Var.V ? 2131745358 : 2131745357, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.hs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                bn0 bn0Var2 = bn0Var;
                                bn0Var2.W = !bn0Var2.W;
                                bn0Var2.O(true);
                                if (bn0Var2.W) {
                                    org.telegram.messenger.i0.v1(bn0Var2.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                bn0 bn0Var3 = bn0Var;
                                bn0Var3.V = !bn0Var3.V;
                                bn0Var3.O(true);
                                if (bn0Var3.V) {
                                    org.telegram.messenger.i0.v1(bn0Var3.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!bn0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(a51.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745773, null)));
        int size8 = arrayList2.size();
        int i20 = 0;
        while (i20 < size8) {
            Object obj8 = arrayList2.get(i20);
            i20++;
            a51 a51Var = new a51(33);
            a51Var.G = (org.telegram.messenger.jj) obj8;
            arrayList.add(a51Var);
        }
        if (bn0Var.a0) {
            arrayList.add(a51.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        vy vyVar = (vy) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ey eyVar = vyVar.R1;
        if (eyVar == null || !(eyVar.getDrawable() instanceof org.telegram.messenger.i4)) {
            return;
        }
        org.telegram.messenger.i4 i4Var = (org.telegram.messenger.i4) vyVar.R1.getDrawable();
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (i4Var.c.a != intValue) {
            org.telegram.messenger.j4 j4Var = i4Var.g;
            if (j4Var != null) {
                i4Var.c = j4Var;
            }
            org.telegram.messenger.j4 j4Var2 = i4Var.c;
            if (j4Var2.a != intValue) {
                j4Var2 = new org.telegram.messenger.j4(intValue, j4Var2.b);
            }
            i4Var.g = j4Var2;
            t5 t5Var = i4Var.e;
            if (t5Var != null) {
                t5Var.e(true, 0.0f);
            }
        }
        if (i4Var.d.a != intValue2) {
            org.telegram.messenger.j4 j4Var3 = i4Var.h;
            if (j4Var3 != null) {
                i4Var.d = j4Var3;
            }
            org.telegram.messenger.j4 j4Var4 = i4Var.d;
            if (j4Var4.a != intValue2) {
                j4Var4 = new org.telegram.messenger.j4(intValue2, j4Var4.b);
            }
            i4Var.h = j4Var4;
            t5 t5Var2 = i4Var.f;
            if (t5Var2 != null) {
                t5Var2.e(true, 0.0f);
            }
        }
        i4Var.invalidateSelf();
        String str = (String) vyVar.R1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            org.telegram.messenger.k6.j.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? (String) org.telegram.messenger.k4.a.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? (String) org.telegram.messenger.k4.a.get(num2.intValue()) : "");
            org.telegram.messenger.k6.j.put(str, sb2.toString());
        }
        org.telegram.messenger.k6.q();
    }

    private final void f(Object obj, Object obj2) {
        qy qyVar = (qy) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = qyVar.E;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z10 = tL_messages_stickerSet.set.id == qyVar.d;
                int i11 = wx.b;
                a51 K = a51.K(wx.class);
                long j10 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j10 >>> 32) ^ j10);
                K.B = j10;
                K.G = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = qyVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            nx nxVar = (nx) obj4;
            TLRPC.StickerSet stickerSet = nxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(wx.i(nxVar.a, nxVar, stickerSet.id == qyVar.d));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.x0 x0Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        x0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void h(Object obj, Object obj2) {
        ((ArrayList) obj).add(a51.j(-1, ((e30) this.b).Q1));
    }

    private final void i(Object obj, Object obj2) {
        l30 l30Var = (l30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        l30Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.oa.a(l30Var.a).f);
        if (l30Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < l30Var.c.size(); i10++) {
            String str = (String) l30Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(a51.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(a51.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.cd.L0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        th.r4 r4Var;
        m30 m30Var = (m30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = m30Var.Q;
        int i10 = 0;
        boolean z10 = m30Var.R && (r4Var = m30Var.S) != null && r4Var.i.size() > 0;
        if (z10) {
            th.r4 r4Var2 = m30Var.S;
            int i11 = zf.z0.b;
            a51 K = a51.K(zf.z0.class);
            K.G = r4Var2;
            arrayList.add(K);
        }
        m30Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i10);
            a51 a51Var = new a51(33);
            a51Var.d = i12;
            a51Var.G = jjVar;
            arrayList.add(a51Var);
            i10 = i12;
        }
        if (m30Var.U || !m30Var.X) {
            arrayList.add(a51.q(-2, 1));
            arrayList.add(a51.q(-3, 1));
            arrayList.add(a51.q(-4, 1));
        }
        if (m30Var.T || !z10) {
            return;
        }
        org.telegram.messenger.i0.g3(new ho(m30Var, 21));
    }

    private final void k(Object obj, Object obj2) {
        x60 x60Var = (x60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        z60 z60Var = x60Var.y;
        z60Var.f.setAlpha(1.0f);
        if (z60Var.u) {
            x60Var.c = bitmap;
        }
        hi.b bVar = z60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            yg.d.c(z60Var.n, x60Var);
            ViewGroup viewGroup = z60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        cg0 cg0Var = (cg0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = cg0Var.e;
        ArrayList arrayList3 = cg0Var.n;
        int i10 = 0;
        if (cg0Var.d == null) {
            arrayList.add(a51.q(-1, 7));
            arrayList.add(a51.q(-2, 7));
            arrayList.add(a51.q(-3, 7));
            cg0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(cg0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745739, null)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                a51 a51Var = new a51(33);
                a51Var.G = (org.telegram.messenger.jj) obj3;
                arrayList.add(a51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131745740, null)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                a51 a51Var2 = new a51(33);
                a51Var2.G = (org.telegram.messenger.jj) obj4;
                arrayList.add(a51Var2);
            }
        }
        if (cg0Var.w || ((cg0Var.M && !cg0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !cg0Var.s))) {
            arrayList.add(a51.q(cg0Var.L * 3, 7));
            arrayList.add(a51.q((cg0Var.L * 3) + 1, 7));
            arrayList.add(a51.q((cg0Var.L * 3) + 2, 7));
        }
        cg0Var.Q = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        nl0 nl0Var = (nl0) this.b;
        nl0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        nl0Var.e = paint;
        Bitmap bitmap = nl0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        nl0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        nl0Var.f = new Matrix();
        hi.b bVar = nl0Var.h;
        bVar.a((Bitmap) obj2);
        yg.d.c(bVar, nl0Var.s);
        ViewGroup viewGroup = nl0Var.D;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        cx0 cx0Var = (cx0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        cx0Var.n1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ui.Z(cx0Var.J1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_stickers_renameStickerSet, new x1((org.telegram.messenger.q20) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        m31 m31Var = (m31) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        x21 x21Var = m31Var.v1;
        l31 l31Var = m31Var.E1;
        if (str != null) {
            m31Var.L1 = false;
            m31Var.w1.setText(m31Var.Q0(str));
            l31Var.D(x21Var);
        } else {
            if (m31Var.I) {
                return;
            }
            if (m31Var.L1) {
                m31Var.dismiss();
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.P4, 1, org.telegram.messenger.cd.L0(bool.booleanValue() ? 2131743972 : 2131743971, null));
                return;
            }
            org.telegram.messenger.m5.o(null, bool.booleanValue() ? 2131743972 : 2131743971, new cc((FrameLayout) m31Var.b, m31Var.I0), null);
            i31 i31Var = m31Var.t1.e;
            String str2 = m31Var.s1;
            m31Var.r1 = str2;
            i31Var.setText(m31.O0(str2, null, null));
            l31Var.D(x21Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0370  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        a51 i10;
        TL_iv.RichMessage richMessage;
        a51 i11;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        a51 i12;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String a02;
        String str2;
        String str3;
        boolean z11;
        String str4;
        p51 p51Var;
        String str5;
        CharSequence charSequence;
        String str6;
        org.telegram.messenger.xe xeVar;
        int i13 = this.a;
        Object obj3 = this.b;
        boolean z12 = true;
        switch (i13) {
            case 0:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var2 = (p51) obj2;
                boolean[] zArr = g0Var.h2;
                boolean[] zArr2 = g0Var.i2;
                f0 f0Var = g0Var.p2;
                arrayList.add(a51.C(null));
                arrayList.add(a51.m(g0Var.n2));
                arrayList.add(a51.C(null));
                p51Var2.F = 1;
                p51Var2.V();
                f0 f0Var2 = g0Var.o2;
                int selectedTab = f0Var2 != null ? f0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = g0Var.j2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(r31.j(3, org.telegram.messenger.cd.L0(2131754986, null), null, null, null));
                    } else {
                        String O0 = m31.O0(g0Var.j2, null, zArr2);
                        String L0 = org.telegram.messenger.cd.L0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = L0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = L0.substring(0, indexOf);
                            substring3 = L0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            O0 = m31.K0(O0);
                        }
                        arrayList.add(r31.j(3, substring2, O0, substring3, null));
                    }
                    arrayList.add(g0Var.n1() ? g0Var.o1(4, g0Var.Q1, false) : v31.i(4, g0Var.P1, g0Var.H2, new c(g0Var, 4), null, null));
                    String O02 = m31.O0(g0Var.k2, zArr, null);
                    String L02 = org.telegram.messenger.cd.L0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
                    int indexOf2 = L02.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = L02.substring(0, indexOf2);
                        substring = L02.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        O02 = m31.K0(O02);
                    }
                    arrayList.add(r31.i(5, str, sc.e.A(O02, ""), substring, new c(g0Var, 5), g0Var.l2, new c(g0Var, 6), null));
                    if (g0Var.n1()) {
                        boolean z13 = g0Var.R1;
                        if (z13 || (richMessage3 = g0Var.T1) == null) {
                            richMessage3 = g0Var.Q1;
                        }
                        i12 = g0Var.o1(6, richMessage3, z13);
                    } else {
                        boolean z14 = g0Var.R1;
                        i12 = v31.i(z14 ? 7 : 6, g0Var.S1, false, null, null, !z14 ? new c(g0Var, 7) : null);
                    }
                    arrayList.add(i12);
                } else if (selectedTab == 1) {
                    arrayList.add(a51.k(f0Var));
                    if (f0Var.getSelectedTone() instanceof a0) {
                        arrayList.add(a51.j(10, g0Var.r2));
                        p51Var2.U();
                        arrayList.add(a51.B(11, null));
                        p51Var2.V();
                    }
                    if ((f0Var.getSelectedTab() >= 0 || g0Var.l2) && (!(f0Var.getSelectedTone() instanceof a0) || TextUtils.equals(g0Var.s2.getText().toString(), g0Var.A2))) {
                        arrayList.add(r31.i(7, org.telegram.messenger.cd.L0(2131754984, null), null, null, null, g0Var.l2, new c(g0Var, 6), null));
                        if (g0Var.n1()) {
                            boolean z15 = g0Var.U1;
                            if (z15 || (richMessage2 = g0Var.W1) == null) {
                                richMessage2 = g0Var.Q1;
                            }
                            i11 = g0Var.o1(8, richMessage2, z15);
                        } else {
                            boolean z16 = g0Var.U1;
                            i11 = v31.i(z16 ? 7 : 6, g0Var.V1, false, null, null, !z16 ? new c(g0Var, 7) : null);
                        }
                        arrayList.add(i11);
                    } else {
                        arrayList.add(r31.i(5, org.telegram.messenger.cd.L0(2131754987, null), null, null, null, g0Var.l2, new c(g0Var, 6), null));
                        arrayList.add(g0Var.n1() ? g0Var.o1(6, g0Var.Q1, false) : v31.i(g0Var.U1 ? 7 : 6, g0Var.P1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(r31.j(3, org.telegram.messenger.cd.L0(2131754987, null), null, null, null));
                    arrayList.add(g0Var.n1() ? g0Var.o1(4, g0Var.Q1, false) : v31.i(4, g0Var.P1, g0Var.H2, new c(g0Var, 4), null, null));
                    arrayList.add(r31.j(5, org.telegram.messenger.cd.L0(2131754984, null), null, null, null));
                    if (g0Var.n1()) {
                        boolean z17 = g0Var.X1;
                        if (z17 || (richMessage = g0Var.Z1) == null) {
                            richMessage = g0Var.Q1;
                        }
                        i10 = g0Var.o1(6, richMessage, z17);
                    } else {
                        boolean z18 = g0Var.X1;
                        i10 = v31.i(z18 ? 7 : 6, g0Var.Y1, false, null, null, !z18 ? new c(g0Var, 7) : null);
                    }
                    arrayList.add(i10);
                }
                p51Var2.U();
                arrayList.add(a51.C(null));
                break;
            case 1:
                r rVar = (r) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                p51 p51Var3 = (p51) obj2;
                p51Var3.F = 1;
                arrayList2.add(a51.C(null));
                FrameLayout frameLayout = rVar.S1;
                a51 a51Var = new a51(-4);
                a51Var.c = frameLayout;
                a51Var.z = -1;
                a51Var.e = true;
                arrayList2.add(a51Var);
                arrayList2.add(a51.C(null));
                arrayList2.add(a51.m(rVar.T1));
                arrayList2.add(a51.D(org.telegram.messenger.i0.L(1.0f)));
                arrayList2.add(a51.m(rVar.U1));
                arrayList2.add(a51.D(org.telegram.messenger.i0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = rVar.P1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.a2[rVar.Z1];
                    p51Var3.V();
                    arrayList2.add(r31.i(3, org.telegram.messenger.cd.L0(2131755001, null), null, null, null, false, null, new o(rVar, 1)));
                    arrayList2.add(v31.i(4, aicomposetoneexample == null ? r.e1() : org.telegram.messenger.jj.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(r31.j(5, org.telegram.messenger.cd.L0(2131755004, null), null, null, null));
                    arrayList2.add(v31.i(6, aicomposetoneexample == null ? r.e1() : org.telegram.messenger.jj.h0(aicomposetoneexample.to, false), false, null, null, null));
                    p51Var3.U();
                    TLRPC.User Z1 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.vp.r1(rVar.a).Z1(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String n10 = org.telegram.messenger.h20.n(Z1);
                    if (Z1 == null) {
                        int i14 = tL_aiComposeTone.installs_count;
                        if (i14 > 0) {
                            arrayList2.add(a51.C(org.telegram.messenger.cd.G(i14, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.cd.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(n10)) {
                            z10 = false;
                            a02 = org.telegram.messenger.cd.a0(null, null, 2131754999, org.telegram.messenger.h20.p(Z1));
                        } else {
                            z10 = false;
                            a02 = org.telegram.messenger.cd.a0(null, null, 2131754999, sc.e.h("@", n10));
                        }
                        sb2.append(a02);
                        arrayList2.add(a51.C(org.telegram.messenger.i0.P2(sb2.toString(), org.telegram.ui.ActionBar.t6.Uc, rVar.I0, new org.telegram.ui.zg(25, rVar, tL_aiComposeTone), z10)));
                    }
                }
                arrayList2.add(a51.D(org.telegram.messenger.i0.L(32.0f)));
                break;
            case 2:
                z zVar = (z) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(a51.C(null));
                arrayList3.add(a51.m(zVar.P1));
                arrayList3.add(a51.C(null));
                arrayList3.add(a51.k(zVar.S1));
                arrayList3.add(a51.C(null));
                arrayList3.add(a51.k(zVar.T1));
                arrayList3.add(a51.C(null));
                if (zVar.b2 != null) {
                    a51 e = a51.e(1, org.telegram.messenger.cd.L0(2131754998, null));
                    e.r = true;
                    arrayList3.add(e);
                    arrayList3.add(a51.C(null));
                }
                arrayList3.add(a51.m(zVar.U1));
                break;
            case 3:
                i0 i0Var = (i0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z19 = i0Var.T1;
                if (i0Var.Q1 != null) {
                    arrayList4.add(a51.C(null));
                    arrayList4.add(a51.u(org.telegram.messenger.cd.L0(2131751003, null)));
                    a51 A = a51.A(i0Var.d1(0), org.telegram.messenger.cd.L0(z19 ? 2131750982 : 2131750980, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.Q1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z19 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !i0Var.V1;
                    A.D = new bh.f(i0Var, 0, 4);
                    arrayList4.add(A);
                    if (i0Var.V1) {
                        a51 z20 = a51.z(3, org.telegram.messenger.cd.L0(2131750985, null));
                        z20.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.Q1;
                        z20.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z20);
                        if (z19) {
                            a51 z21 = a51.z(4, org.telegram.messenger.cd.L0(2131750988, null));
                            z21.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = i0Var.Q1;
                            z21.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z21);
                        }
                        a51 z22 = a51.z(5, org.telegram.messenger.cd.L0(z19 ? 2131750989 : 2131750987, null));
                        z22.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = i0Var.Q1;
                        z22.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z22);
                        a51 z23 = a51.z(6, org.telegram.messenger.cd.L0(z19 ? 2131750993 : 2131750992, null));
                        z23.i = 1;
                        z23.L(i0Var.Q1.leave);
                        arrayList4.add(z23);
                        if (z19) {
                            a51 z24 = a51.z(7, org.telegram.messenger.cd.L0(2131750991, null));
                            z24.i = 1;
                            z24.L(i0Var.Q1.edit_rank);
                            arrayList4.add(z24);
                        }
                    }
                    a51 A2 = a51.A(i0Var.d1(1), org.telegram.messenger.cd.L0(z19 ? 2131750983 : 2131750984, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = i0Var.Q1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !i0Var.W1;
                    A2.D = new bh.f(i0Var, 1, 4);
                    arrayList4.add(A2);
                    if (i0Var.W1) {
                        a51 z25 = a51.z(9, org.telegram.messenger.cd.L0(z19 ? 2131750996 : 2131750999, null));
                        z25.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = i0Var.Q1;
                        z25.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z25);
                        str2 = null;
                        a51 z26 = a51.z(10, org.telegram.messenger.cd.L0(2131750995, null));
                        z26.i = 1;
                        z26.L(i0Var.Q1.invites);
                        arrayList4.add(z26);
                        a51 z27 = a51.z(11, org.telegram.messenger.cd.L0(2131751000, null));
                        z27.i = 1;
                        z27.L(i0Var.Q1.group_call);
                        arrayList4.add(z27);
                    } else {
                        str2 = null;
                    }
                    a51 A3 = a51.A(i0Var.d1(2), org.telegram.messenger.cd.L0(2131750981, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = i0Var.Q1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !i0Var.X1;
                    A3.D = new bh.f(i0Var, 2, 4);
                    arrayList4.add(A3);
                    if (i0Var.X1) {
                        str3 = null;
                        a51 z28 = a51.z(13, org.telegram.messenger.cd.L0(2131750998, null));
                        z28.i = 1;
                        z28.L(i0Var.Q1.delete);
                        arrayList4.add(z28);
                        a51 z29 = a51.z(14, org.telegram.messenger.cd.L0(2131750997, null));
                        z29.i = 1;
                        z29.L(i0Var.Q1.edit);
                        arrayList4.add(z29);
                        a51 z30 = a51.z(15, org.telegram.messenger.cd.L0(2131750986, null));
                        z30.i = 1;
                        z30.L(i0Var.Q1.pinned);
                        arrayList4.add(z30);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(a51.C(str3));
                    arrayList4.add(a51.u(org.telegram.messenger.cd.L0(2131751002, str3)));
                    a51 z31 = a51.z(16, org.telegram.messenger.cd.L0(2131751001, str3));
                    a0.h hVar = i0Var.S1;
                    int m10 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = i0Var.R1;
                    z31.L(m10 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z31);
                    if (i0Var.R1 != null) {
                        for (int i15 = 0; i15 < i0Var.R1.size(); i15++) {
                            long o10 = org.telegram.messenger.o5.o(((TLRPC.ChannelParticipant) i0Var.R1.get(i15)).peer);
                            TLRPC.User Z12 = org.telegram.messenger.vp.r1(i0Var.a).Z1(Long.valueOf(o10));
                            a51 a51Var2 = new a51(37);
                            a51Var2.d = (-1) - i15;
                            a51Var2.G = Z12;
                            a51Var2.i = 1;
                            a0.h hVar2 = i0Var.S1;
                            a51Var2.L(hVar2 != null && hVar2.d(o10));
                            arrayList4.add(a51Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((ChatActivityEnterView) obj3).b0((Canvas) obj, (org.telegram.messenger.i20) obj2);
                break;
            case 5:
                mi miVar = (mi) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                p51 p51Var4 = (p51) obj2;
                int i16 = miVar.P;
                ArrayList arrayList7 = miVar.M;
                org.telegram.messenger.pp ppVar = miVar.J;
                ArrayList arrayList8 = miVar.K;
                HashSet hashSet = miVar.I;
                ArrayList arrayList9 = miVar.L;
                arrayList6.add(a51.E(-100, org.telegram.messenger.i0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(miVar.D)) {
                    p51Var4.V();
                    int i17 = 0;
                    while (i17 < miVar.H.size()) {
                        org.telegram.messenger.xe xeVar2 = (org.telegram.messenger.xe) miVar.H.get(i17);
                        xeVar2.e.J5(null, z12);
                        a51 i18 = org.telegram.ui.Cells.j7.i(xeVar2, new di(miVar, 0));
                        i18.L(hashSet.contains(xeVar2));
                        i18.d = -1;
                        arrayList6.add(i18);
                        i17++;
                        z12 = z12;
                    }
                    boolean z32 = z12;
                    if (miVar.G) {
                        arrayList6.add(a51.q(11, 4));
                        arrayList6.add(a51.q(12, 4));
                        arrayList6.add(a51.q(13, 4));
                    }
                    p51Var4.U();
                    if (ppVar != null) {
                        ArrayList arrayList10 = ppVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        for (int i19 = 0; i19 < size2; i19++) {
                            if (i19 >= arrayList8.size()) {
                                xeVar = new org.telegram.messenger.xe();
                                arrayList8.add(xeVar);
                            } else {
                                xeVar = (org.telegram.messenger.xe) arrayList8.get(i19);
                            }
                            if (xeVar.e != arrayList10.get(i19)) {
                                miVar.l0--;
                                xeVar.e = (org.telegram.messenger.jj) arrayList10.get(i19);
                            }
                        }
                    }
                    if (ppVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(a51.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        p51Var4.V();
                        arrayList6.add(a51.t(45, org.telegram.messenger.cd.L0(2131753904, str6)));
                        for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                            org.telegram.messenger.xe xeVar3 = (org.telegram.messenger.xe) arrayList8.get(i20);
                            a51 i21 = org.telegram.ui.Cells.j7.i(xeVar3, new di(miVar, 0));
                            i21.L(hashSet.contains(xeVar3));
                            arrayList6.add(i21);
                        }
                        if (ppVar.f) {
                            arrayList6.add(a51.q(41, 4));
                            arrayList6.add(a51.q(42, 4));
                            arrayList6.add(a51.q(43, 4));
                        }
                        if (!ppVar.f && !ppVar.e) {
                            a51 c10 = a51.c(miVar.R, R.drawable.arrow_more, org.telegram.messenger.cd.L0(2131745357, null));
                            c10.q = z32;
                            arrayList6.add(c10);
                        }
                        p51Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || miVar.U >= 0 || miVar.W)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(a51.B(-98, null));
                        }
                        p51Var4.V();
                        arrayList6.add(a51.t(((miVar.U >= 0 || miVar.W) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.cd.L0(2131753907, null)));
                        for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                            org.telegram.messenger.xe xeVar4 = (org.telegram.messenger.xe) arrayList9.get(i22);
                            xeVar4.e.J5(miVar.D, true);
                            a51 i23 = org.telegram.ui.Cells.j7.i(xeVar4, new di(miVar, 0));
                            i23.L(hashSet.contains(xeVar4));
                            arrayList6.add(i23);
                        }
                        if (miVar.U >= 0 || miVar.W) {
                            arrayList6.add(a51.q(21, 4));
                            arrayList6.add(a51.q(22, 4));
                            arrayList6.add(a51.q(23, 4));
                        }
                        if (miVar.c0) {
                            a51 c11 = a51.c(i16, R.drawable.arrow_more, org.telegram.messenger.cd.L0(2131745357, null));
                            c11.q = true;
                            arrayList6.add(c11);
                        }
                        p51Var4.U();
                    }
                } else {
                    String lowerCase = miVar.D.toLowerCase();
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    int i24 = 0;
                    boolean z33 = false;
                    while (i24 < miVar.H.size()) {
                        org.telegram.messenger.xe xeVar5 = (org.telegram.messenger.xe) miVar.H.get(i24);
                        String str8 = xeVar5.a;
                        if (str8 != null) {
                            String lowerCase2 = str8.toLowerCase();
                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || sc.e.y(" ", lowerCase, lowerCase2) || N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                z11 = true;
                                str4 = xeVar5.b;
                                if (str4 == null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    boolean z34 = z11;
                                    String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                    z11 = z34 || lowerCase3.startsWith(lowerCase) || sc.e.y(" ", lowerCase, lowerCase3) || N33.startsWith(N3) || N33.contains(" ".concat(N3));
                                }
                                if (z11) {
                                    p51Var = p51Var4;
                                } else {
                                    if (!z33) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(a51.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        p51Var4.V();
                                        arrayList6.add(a51.t(10, org.telegram.messenger.cd.L0(2131753905, str5)));
                                        z33 = true;
                                    }
                                    p51Var = p51Var4;
                                    xeVar5.e.J5(miVar.D, true);
                                    a51 i25 = org.telegram.ui.Cells.j7.i(xeVar5, new di(miVar, 0));
                                    i25.L(hashSet.contains(xeVar5));
                                    i25.d = 10;
                                    arrayList6.add(i25);
                                }
                                i24++;
                                p51Var4 = p51Var;
                            }
                        }
                        z11 = false;
                        str4 = xeVar5.b;
                        if (str4 == null) {
                        }
                        if (z11) {
                        }
                        i24++;
                        p51Var4 = p51Var;
                    }
                    p51 p51Var5 = p51Var4;
                    p51Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || miVar.U >= 0 || miVar.W)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(a51.B(-98, null));
                        }
                        p51Var5.V();
                        arrayList6.add(a51.t(((miVar.U >= 0 || miVar.W) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.cd.L0(2131753907, null)));
                        for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                            org.telegram.messenger.xe xeVar6 = (org.telegram.messenger.xe) arrayList9.get(i26);
                            xeVar6.e.J5(miVar.D, true);
                            a51 i27 = org.telegram.ui.Cells.j7.i(xeVar6, new di(miVar, 0));
                            i27.L(hashSet.contains(xeVar6));
                            arrayList6.add(i27);
                        }
                        if (miVar.U >= 0 || miVar.W) {
                            arrayList6.add(a51.q(21, 4));
                            arrayList6.add(a51.q(22, 4));
                            arrayList6.add(a51.q(23, 4));
                        }
                        if (miVar.c0) {
                            a51 c12 = a51.c(i16, R.drawable.arrow_more, org.telegram.messenger.cd.L0(2131745357, null));
                            c12.q = true;
                            arrayList6.add(c12);
                        }
                        p51Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || miVar.d0 >= 0 || miVar.m0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(a51.B(-96, null));
                        }
                        p51Var5.V();
                        arrayList6.add(a51.t(((miVar.d0 >= 0 || miVar.m0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.cd.L0(2131753906, null)));
                        int size3 = arrayList7.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            org.telegram.messenger.xe xeVar7 = (org.telegram.messenger.xe) arrayList7.get(i28);
                            xeVar7.e.J5(miVar.D, true);
                            a51 i29 = org.telegram.ui.Cells.j7.i(xeVar7, new di(miVar, 0));
                            i29.L(hashSet.contains(xeVar7));
                            arrayList6.add(i29);
                        }
                        if (miVar.d0 >= 0 || miVar.m0) {
                            arrayList6.add(a51.q(31, 4));
                            arrayList6.add(a51.q(32, 4));
                            arrayList6.add(a51.q(33, 4));
                        }
                        if (miVar.g0) {
                            a51 c13 = a51.c(miVar.Q, R.drawable.arrow_more, org.telegram.messenger.cd.L0(2131745357, null));
                            c13.q = true;
                            arrayList6.add(c13);
                        }
                        p51Var5.U();
                    }
                }
                if (arrayList6.size() > size || miVar.G) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(miVar.D)) {
                    charSequence = null;
                    String L03 = org.telegram.messenger.cd.L0(2131748262, null);
                    String L04 = org.telegram.messenger.cd.L0(2131748261, null);
                    int i30 = ki.b;
                    a51 K = a51.K(ki.class);
                    K.l = L03;
                    K.m = L04;
                    arrayList6.add(K);
                } else {
                    charSequence = null;
                    String L05 = org.telegram.messenger.cd.L0(2131748260, null);
                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, miVar.D.length() >= 3 ? 2131748258 : 2131748259, miVar.D));
                    int i31 = ki.b;
                    a51 K2 = a51.K(ki.class);
                    K2.l = L05;
                    K2.m = W2;
                    arrayList6.add(K2);
                }
                arrayList6.add(a51.B(-99, charSequence));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z35 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                b(obj, obj2);
                break;
            case 8:
                c(obj, obj2);
                break;
            case 9:
                d(obj, obj2);
                break;
            case 10:
                e(obj, obj2);
                break;
            case 11:
                ux uxVar = (ux) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = uxVar.s;
                int size4 = arrayList12.size();
                int i32 = 0;
                while (i32 < size4) {
                    Object obj4 = arrayList12.get(i32);
                    i32++;
                    nx nxVar = (nx) obj4;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nxVar.b;
                    if (tL_messages_stickerSet != null) {
                        boolean z36 = tL_messages_stickerSet.set.id == uxVar.d;
                        int i33 = wx.b;
                        a51 K3 = a51.K(wx.class);
                        long j10 = tL_messages_stickerSet.set.id;
                        K3.d = (int) ((j10 >>> 32) ^ j10);
                        K3.B = j10;
                        K3.G = tL_messages_stickerSet;
                        K3.e = z36;
                        arrayList11.add(K3);
                    } else {
                        TLRPC.StickerSetCovered stickerSetCovered = nxVar.a;
                        if (stickerSetCovered != null) {
                            arrayList11.add(wx.i(stickerSetCovered, nxVar, stickerSetCovered.set.id == uxVar.d));
                        }
                    }
                }
                break;
            case 12:
                f(obj, obj2);
                break;
            case 13:
                g(obj, obj2);
                break;
            case 14:
                h(obj, obj2);
                break;
            case 15:
                i(obj, obj2);
                break;
            case 16:
                j(obj, obj2);
                break;
            case 17:
                k(obj, obj2);
                break;
            case 18:
                l(obj, obj2);
                break;
            case 19:
                m(obj, obj2);
                break;
            case 20:
                n(obj, obj2);
                break;
            case 21:
                o(obj, obj2);
                break;
            default:
                ((r51) obj3).Y((ArrayList) obj, (p51) obj2);
                break;
        }
    }
}
