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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        gr grVar = (gr) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (grVar.c2 == null) {
            Context context = grVar.getContext();
            org.telegram.ui.ActionBar.i6 i6Var = grVar.J0;
            ai.l2 l2Var = new ai.l2(context, 7);
            l2Var.setOrientation(1);
            qh0 qh0Var = new qh0(context);
            qh0Var.setAutoRepeat(true);
            qh0Var.f(R.raw.utyan_streaming, org.telegram.messenger.ks.x1, org.telegram.messenger.ks.x1, null);
            qh0Var.d();
            l2Var.addView(qh0Var, c8.na.t(org.telegram.messenger.ks.x1, org.telegram.messenger.ks.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131744193, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
            l2Var.addView(textView, c8.na.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, i6Var);
            textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131742986, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            l2Var.addView(textView2, c8.na.t(-2, -2, 1, 28, 0, 28, 17));
            grVar.c2 = l2Var;
        }
        arrayList.add(n41.k(grVar.c2));
        arrayList.add(n41.C(null));
        arrayList.add(n41.u(org.telegram.messenger.gd.N0(2131743181, null)));
        String str2 = grVar.X1;
        String N0 = org.telegram.messenger.gd.N0(2131743182, null);
        int i7 = fr.b;
        n41 K = n41.K(fr.class);
        K.m = str2;
        K.o = N0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = grVar.Z1;
        String N02 = org.telegram.messenger.gd.N0(2131743183, null);
        n41 K2 = n41.K(fr.class);
        K2.m = spannableStringBuilder;
        K2.o = N02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (grVar.b2) {
            str = org.telegram.messenger.gd.N0(grVar.T1 ? 2131743178 : 2131743179, null);
        }
        arrayList.add(n41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        final hs hsVar = (hs) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = hsVar.Q;
        y2 y2Var = hsVar.k0;
        ArrayList arrayList2 = hsVar.W;
        gs gsVar = hsVar.T;
        boolean z11 = hsVar.S;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(hsVar.h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(hsVar.U);
            arrayList3.addAll(hsVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z11) {
                    arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745626, null)));
                } else {
                    arrayList.add(n41.s(org.telegram.messenger.gd.N0(2131745626, null), org.telegram.messenger.gd.N0(hsVar.Y ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.es
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    hs hsVar2 = hsVar;
                                    hsVar2.Y = !hsVar2.Y;
                                    hsVar2.O(true);
                                    break;
                                default:
                                    hs hsVar3 = hsVar;
                                    hsVar3.X = !hsVar3.X;
                                    hsVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!hsVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    n41 w10 = n41.w((TLObject) arrayList3.get(i12));
                    w10.u = true;
                    w10.I = y2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z11) {
                return;
            }
            arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745560, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                n41 n41Var = new n41(33);
                n41Var.H = (org.telegram.messenger.fj) obj3;
                arrayList.add(n41Var);
            }
            if (hsVar.e0) {
                arrayList.add(n41.p(1));
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.ri.d0(i7).m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList4.get(i13)).peer)));
                if (c22 != null && c22.bot) {
                    arrayList5.add(c22);
                }
            }
        }
        hsVar.a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                arrayList.add(n41.s(org.telegram.messenger.gd.N0(2131745624, null), org.telegram.messenger.gd.N0(hsVar.X ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.es
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                hs hsVar2 = hsVar;
                                hsVar2.Y = !hsVar2.Y;
                                hsVar2.O(true);
                                break;
                            default:
                                hs hsVar3 = hsVar;
                                hsVar3.X = !hsVar3.X;
                                hsVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745624, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || hsVar.X); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    n41 w11 = n41.w(user);
                    w11.r = true;
                    w11.u = true;
                    w11.I = y2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        hsVar.b0 = arrayList.size();
        ArrayList arrayList6 = gsVar.h;
        if (arrayList6.isEmpty()) {
            if (gsVar.c || !gsVar.e) {
                if (!z11) {
                    arrayList.add(n41.p(30));
                }
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
            }
            z10 = false;
        } else {
            if (!z11) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745623, null)));
            }
            boolean z12 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    n41 w12 = n41.w(user2);
                    w12.r = true;
                    w12.s = true;
                    w12.u = true;
                    w12.I = y2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (gsVar.c || !gsVar.e) {
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
            }
            z10 = z12;
        }
        if (z10) {
            arrayList.add(n41.C(hsVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        final om0 om0Var = (om0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = om0Var.S;
        ArrayList arrayList3 = om0Var.Y;
        int i7 = om0Var.Q;
        final int i10 = 0;
        if (TextUtils.isEmpty(om0Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(n41.s(org.telegram.messenger.gd.N0(2131745543, null), org.telegram.messenger.gd.N0(om0Var.X ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.is
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    om0 om0Var2 = om0Var;
                                    om0Var2.X = !om0Var2.X;
                                    om0Var2.O(true);
                                    if (om0Var2.X) {
                                        org.telegram.messenger.g0.v1(om0Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    om0 om0Var3 = om0Var;
                                    om0Var3.W = !om0Var3.W;
                                    om0Var3.O(true);
                                    if (om0Var3.W) {
                                        org.telegram.messenger.g0.v1(om0Var3.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745543, null)));
                }
                int size = arrayList3.size();
                if (!om0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    n41 w10 = n41.w((TLObject) arrayList3.get(i11));
                    w10.J = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.mp.u1(i7).e8;
            org.telegram.messenger.no noVar = hashMap == null ? null : (org.telegram.messenger.no) hashMap.get(0L);
            if (noVar == null) {
                arrayList.add(n41.p(30));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = noVar.b;
            int size2 = arrayList5.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList5.get(i12);
                i12++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(chat.id));
                    if (org.telegram.messenger.v3.r0(chat) && (O0 == null || org.telegram.messenger.v3.r0(O0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745515, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(n41.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = om0Var.T;
        int size4 = arrayList7.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList7.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i14 = size4;
            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(chat2.id));
            if (org.telegram.messenger.v3.r0(chat2) && (O02 == null || org.telegram.messenger.v3.r0(O02))) {
                arrayList6.add(chat2);
            }
            size4 = i14;
        }
        ArrayList arrayList8 = om0Var.U;
        int size5 = arrayList8.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj6 = arrayList8.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat O03 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(chat3.id));
            if (org.telegram.messenger.v3.r0(chat3) && (O03 == null || org.telegram.messenger.v3.r0(O03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = om0Var.V;
        int size6 = arrayList9.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj7 = arrayList9.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat O04 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(chat4.id));
            if (org.telegram.messenger.v3.r0(chat4) && (O04 == null || org.telegram.messenger.v3.r0(O04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745618, null)));
            } else {
                final int i17 = 1;
                arrayList.add(n41.s(org.telegram.messenger.gd.N0(2131745618, null), org.telegram.messenger.gd.N0(om0Var.W ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.is
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                om0 om0Var2 = om0Var;
                                om0Var2.X = !om0Var2.X;
                                om0Var2.O(true);
                                if (om0Var2.X) {
                                    org.telegram.messenger.g0.v1(om0Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                om0 om0Var3 = om0Var;
                                om0Var3.W = !om0Var3.W;
                                om0Var3.O(true);
                                if (om0Var3.W) {
                                    org.telegram.messenger.g0.v1(om0Var3.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!om0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(n41.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745560, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            n41 n41Var = new n41(33);
            n41Var.H = (org.telegram.messenger.fj) obj8;
            arrayList.add(n41Var);
        }
        if (om0Var.b0) {
            arrayList.add(n41.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        qy qyVar = (qy) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        yx yxVar = qyVar.S1;
        if (yxVar == null || !(yxVar.getDrawable() instanceof org.telegram.messenger.h4)) {
            return;
        }
        org.telegram.messenger.h4 h4Var = (org.telegram.messenger.h4) qyVar.S1.getDrawable();
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (h4Var.c.a != intValue) {
            org.telegram.messenger.i4 i4Var = h4Var.g;
            if (i4Var != null) {
                h4Var.c = i4Var;
            }
            org.telegram.messenger.i4 i4Var2 = h4Var.c;
            if (i4Var2.a != intValue) {
                i4Var2 = new org.telegram.messenger.i4(intValue, i4Var2.b);
            }
            h4Var.g = i4Var2;
            c6 c6Var = h4Var.e;
            if (c6Var != null) {
                c6Var.e(true, 0.0f);
            }
        }
        if (h4Var.d.a != intValue2) {
            org.telegram.messenger.i4 i4Var3 = h4Var.h;
            if (i4Var3 != null) {
                h4Var.d = i4Var3;
            }
            org.telegram.messenger.i4 i4Var4 = h4Var.d;
            if (i4Var4.a != intValue2) {
                i4Var4 = new org.telegram.messenger.i4(intValue2, i4Var4.b);
            }
            h4Var.h = i4Var4;
            c6 c6Var2 = h4Var.f;
            if (c6Var2 != null) {
                c6Var2.e(true, 0.0f);
            }
        }
        h4Var.invalidateSelf();
        String str = (String) qyVar.S1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            org.telegram.messenger.j6.j.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? (String) org.telegram.messenger.j4.a.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? (String) org.telegram.messenger.j4.a.get(num2.intValue()) : "");
            org.telegram.messenger.j6.j.put(str, sb2.toString());
        }
        org.telegram.messenger.j6.q();
    }

    private final void f(Object obj, Object obj2) {
        px pxVar = (px) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = pxVar.s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            jx jxVar = (jx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jxVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == pxVar.d;
                int i10 = rx.b;
                n41 K = n41.K(rx.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = jxVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(rx.i(stickerSetCovered, jxVar, stickerSetCovered.set.id == pxVar.d));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        ly lyVar = (ly) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = lyVar.F;
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i7);
            i7++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z10 = tL_messages_stickerSet.set.id == lyVar.d;
                int i10 = rx.b;
                n41 K = n41.K(rx.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = lyVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            jx jxVar = (jx) obj4;
            TLRPC.StickerSet stickerSet = jxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(rx.i(jxVar.a, jxVar, stickerSet.id == lyVar.d));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.a0;
        org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        u0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void i(Object obj, Object obj2) {
        e30 e30Var = (e30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        e30Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.ma.a(e30Var.a).f);
        if (e30Var.c.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < e30Var.c.size(); i7++) {
            String str = (String) e30Var.c.get(i7);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(n41.c(i7 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(n41.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.gd.N0(2131752077, null)));
    }

    private final void j(Object obj, Object obj2) {
        fi.b6 b6Var;
        f30 f30Var = (f30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = f30Var.R;
        int i7 = 0;
        boolean z10 = f30Var.S && (b6Var = f30Var.T) != null && b6Var.i.size() > 0;
        if (z10) {
            fi.b6 b6Var2 = f30Var.T;
            int i10 = jg.j1.b;
            n41 K = n41.K(jg.j1.class);
            K.H = b6Var2;
            arrayList.add(K);
        }
        f30Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i7);
            n41 n41Var = new n41(33);
            n41Var.d = i11;
            n41Var.H = fjVar;
            arrayList.add(n41Var);
            i7 = i11;
        }
        if (f30Var.V || !f30Var.Y) {
            arrayList.add(n41.q(-2, 1));
            arrayList.add(n41.q(-3, 1));
            arrayList.add(n41.q(-4, 1));
        }
        if (f30Var.U || !z10) {
            return;
        }
        org.telegram.messenger.g0.g3(new lo(f30Var, 21));
    }

    private final void k(Object obj, Object obj2) {
        t60 t60Var = (t60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        x60 x60Var = t60Var.G;
        x60Var.f.setAlpha(1.0f);
        if (x60Var.u) {
            t60Var.c = bitmap;
        }
        ui.b bVar = x60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(x60Var.n, t60Var);
            ViewGroup viewGroup = x60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        nf0 nf0Var = (nf0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = nf0Var.e;
        ArrayList arrayList3 = nf0Var.n;
        int i7 = 0;
        if (nf0Var.d == null) {
            arrayList.add(n41.q(-1, 7));
            arrayList.add(n41.q(-2, 7));
            arrayList.add(n41.q(-3, 7));
            nf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(nf0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745526, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                n41 n41Var = new n41(33);
                n41Var.H = (org.telegram.messenger.fj) obj3;
                arrayList.add(n41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745527, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                n41 n41Var2 = new n41(33);
                n41Var2.H = (org.telegram.messenger.fj) obj4;
                arrayList.add(n41Var2);
            }
        }
        if (nf0Var.w || ((nf0Var.N && !nf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !nf0Var.s))) {
            arrayList.add(n41.q(nf0Var.M * 3, 7));
            arrayList.add(n41.q((nf0Var.M * 3) + 1, 7));
            arrayList.add(n41.q((nf0Var.M * 3) + 2, 7));
        }
        nf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        yk0 yk0Var = (yk0) this.b;
        yk0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        yk0Var.e = paint;
        Bitmap bitmap = yk0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        yk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        yk0Var.f = new Matrix();
        ui.b bVar = yk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, yk0Var.s);
        ViewGroup viewGroup = yk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        jw0 jw0Var = (jw0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        jw0Var.r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ri.b0(jw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.i10.t0).sendRequest(tL_stickers_renameStickerSet, new e2((org.telegram.messenger.w10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        a31 a31Var = (a31) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        l21 l21Var = a31Var.z1;
        z21 z21Var = a31Var.I1;
        if (str != null) {
            a31Var.P1 = false;
            a31Var.A1.setText(a31Var.S0(str));
            z21Var.D(l21Var);
        } else {
            if (a31Var.J) {
                return;
            }
            if (a31Var.P1) {
                a31Var.dismiss();
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.S4, 1, org.telegram.messenger.gd.N0(bool.booleanValue() ? 2131743700 : 2131743699, null));
                return;
            }
            org.telegram.messenger.f3.o(null, bool.booleanValue() ? 2131743700 : 2131743699, new kc((FrameLayout) a31Var.b, a31Var.J0), null);
            w21 w21Var = a31Var.x1.e;
            String str2 = a31Var.w1;
            a31Var.v1 = str2;
            w21Var.setText(a31.P0(str2, null, null));
            z21Var.D(l21Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0321  */
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i7;
        n41 i10;
        n41 i11;
        TL_iv.RichMessage richMessage;
        n41 i12;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        n41 i13;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String a02;
        String str2;
        String str3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z11;
        String str4;
        b51 b51Var;
        String str5;
        CharSequence charSequence;
        String str6;
        org.telegram.messenger.ve veVar;
        int i14 = this.a;
        boolean z12 = true;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                m0 m0Var = (m0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var2 = (b51) obj2;
                boolean[] zArr = m0Var.l2;
                boolean[] zArr2 = m0Var.m2;
                l0 l0Var = m0Var.v2;
                arrayList.add(n41.C(null));
                arrayList.add(n41.m(m0Var.t2));
                arrayList.add(n41.C(null));
                b51Var2.G = 1;
                b51Var2.V();
                l0 l0Var2 = m0Var.u2;
                int selectedTab = l0Var2 != null ? l0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = m0Var.n2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(f31.j(3, org.telegram.messenger.gd.N0(2131754986, null), null, null, null));
                    } else {
                        String P0 = a31.P0(m0Var.n2, null, zArr2);
                        String N0 = org.telegram.messenger.gd.N0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = N0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = N0.substring(0, indexOf);
                            substring3 = N0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            P0 = a31.L0(P0);
                        }
                        arrayList.add(f31.j(3, substring2, P0, substring3, null));
                    }
                    arrayList.add(m0Var.r1() ? m0Var.s1(4, m0Var.U1, false) : j31.i(4, m0Var.T1, m0Var.Q2, new c(m0Var, 5), null, null));
                    String P02 = a31.P0(m0Var.o2, zArr, null);
                    String N02 = org.telegram.messenger.gd.N0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
                    int indexOf2 = N02.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = N02.substring(0, indexOf2);
                        substring = N02.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        P02 = a31.L0(P02);
                    }
                    StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(P02);
                    m10.append(m0Var.p2 != null ? a8.p0.s(new StringBuilder(" ("), m0Var.p2, ")") : "");
                    arrayList.add(f31.i(5, str, m10.toString(), substring, new c(m0Var, 6), m0Var.r2, new c(m0Var, 7), null));
                    if (m0Var.r1()) {
                        boolean z13 = m0Var.V1;
                        if (z13 || (richMessage3 = m0Var.X1) == null) {
                            richMessage3 = m0Var.U1;
                        }
                        i13 = m0Var.s1(6, richMessage3, z13);
                    } else {
                        boolean z14 = m0Var.V1;
                        i13 = j31.i(z14 ? 7 : 6, m0Var.W1, false, null, null, !z14 ? new c(m0Var, 8) : null);
                    }
                    arrayList.add(i13);
                } else if (selectedTab == 1) {
                    arrayList.add(n41.k(l0Var));
                    if (l0Var.getSelectedTone() instanceof i0) {
                        arrayList.add(n41.j(10, m0Var.x2));
                        b51Var2.U();
                        arrayList.add(n41.B(11, null));
                        b51Var2.V();
                    }
                    if ((l0Var.getSelectedTab() >= 0 || m0Var.r2) && (!(l0Var.getSelectedTone() instanceof i0) || TextUtils.equals(m0Var.y2.getText().toString(), m0Var.G2))) {
                        arrayList.add(f31.i(7, org.telegram.messenger.gd.N0(2131754984, null), null, null, null, m0Var.r2, new c(m0Var, 7), null));
                        if (m0Var.r1()) {
                            boolean z15 = m0Var.Y1;
                            if (z15 || (richMessage2 = m0Var.a2) == null) {
                                richMessage2 = m0Var.U1;
                            }
                            i12 = m0Var.s1(8, richMessage2, z15);
                        } else {
                            int i15 = 8;
                            boolean z16 = m0Var.Y1;
                            i12 = j31.i(z16 ? 7 : 6, m0Var.Z1, false, null, null, !z16 ? new c(m0Var, i15) : null);
                        }
                        arrayList.add(i12);
                    } else {
                        arrayList.add(f31.i(5, org.telegram.messenger.gd.N0(2131754987, null), null, null, null, m0Var.r2, new c(m0Var, 7), null));
                        arrayList.add(m0Var.r1() ? m0Var.s1(6, m0Var.U1, false) : j31.i(m0Var.Y1 ? 7 : 6, m0Var.T1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(f31.j(3, org.telegram.messenger.gd.N0(2131754987, null), null, null, null));
                    if (m0Var.r1()) {
                        i10 = m0Var.s1(4, m0Var.U1, false);
                        i7 = 5;
                    } else {
                        i7 = 5;
                        i10 = j31.i(4, m0Var.T1, m0Var.Q2, new c(m0Var, i7), null, null);
                    }
                    arrayList.add(i10);
                    arrayList.add(f31.j(i7, org.telegram.messenger.gd.N0(2131754984, null), null, null, null));
                    if (m0Var.r1()) {
                        boolean z17 = m0Var.b2;
                        if (z17 || (richMessage = m0Var.d2) == null) {
                            richMessage = m0Var.U1;
                        }
                        i11 = m0Var.s1(6, richMessage, z17);
                    } else {
                        boolean z18 = m0Var.b2;
                        i11 = j31.i(z18 ? 7 : 6, m0Var.c2, false, null, null, !z18 ? new c(m0Var, 8) : null);
                    }
                    arrayList.add(i11);
                }
                b51Var2.U();
                if (m0Var.q1()) {
                    arrayList.add(n41.B(21, null));
                    b51Var2.V();
                    arrayList.add(n41.j(20, m0Var.R2));
                    b51Var2.U();
                    arrayList.add(n41.B(22, "Every message you send in this chat will be rewritten with these settings."));
                    break;
                } else {
                    arrayList.add(n41.C(null));
                    break;
                }
                break;
            case 1:
                v vVar = (v) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                b51Var3.G = 1;
                arrayList2.add(n41.C(null));
                FrameLayout frameLayout = vVar.W1;
                n41 n41Var = new n41(-4);
                n41Var.c = frameLayout;
                n41Var.A = -1;
                n41Var.e = true;
                arrayList2.add(n41Var);
                arrayList2.add(n41.C(null));
                arrayList2.add(n41.m(vVar.X1));
                arrayList2.add(n41.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(n41.m(vVar.Y1));
                arrayList2.add(n41.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = vVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = vVar.e2[vVar.d2];
                    b51Var3.V();
                    arrayList2.add(f31.i(3, org.telegram.messenger.gd.N0(2131755001, null), null, null, null, false, null, new s(vVar, 1)));
                    arrayList2.add(j31.i(4, aicomposetoneexample == null ? v.f1() : org.telegram.messenger.fj.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(f31.j(5, org.telegram.messenger.gd.N0(2131755004, null), null, null, null));
                    arrayList2.add(j31.i(6, aicomposetoneexample == null ? v.f1() : org.telegram.messenger.fj.h0(aicomposetoneexample.to, false), false, null, null, null));
                    b51Var3.U();
                    TLRPC.User c22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.mp.u1(vVar.a).c2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String o4 = org.telegram.messenger.n10.o(c22);
                    if (c22 == null) {
                        int i16 = tL_aiComposeTone.installs_count;
                        if (i16 > 0) {
                            arrayList2.add(n41.C(org.telegram.messenger.gd.G(i16, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.gd.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(o4)) {
                            z10 = false;
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131754999, org.telegram.messenger.n10.q(c22));
                        } else {
                            z10 = false;
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131754999, p5.c.k("@", o4));
                        }
                        sb2.append(a02);
                        arrayList2.add(n41.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.n6.Xc, vVar.J0, new org.telegram.ui.ah(20, vVar, tL_aiComposeTone), z10)));
                    }
                }
                arrayList2.add(n41.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                h0 h0Var = (h0) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(n41.C(null));
                arrayList3.add(n41.m(h0Var.T1));
                arrayList3.add(n41.C(null));
                arrayList3.add(n41.k(h0Var.W1));
                arrayList3.add(n41.C(null));
                arrayList3.add(n41.k(h0Var.X1));
                arrayList3.add(n41.C(null));
                if (h0Var.f2 != null) {
                    n41 e10 = n41.e(1, org.telegram.messenger.gd.N0(2131754998, null));
                    e10.s = true;
                    arrayList3.add(e10);
                    arrayList3.add(n41.C(null));
                }
                arrayList3.add(n41.m(h0Var.Y1));
                break;
            case 3:
                o0 o0Var = (o0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z19 = o0Var.X1;
                if (o0Var.U1 != null) {
                    arrayList4.add(n41.C(null));
                    arrayList4.add(n41.u(org.telegram.messenger.gd.N0(2131750990, null)));
                    n41 A = n41.A(o0Var.e1(0), org.telegram.messenger.gd.N0(z19 ? 2131750969 : 2131750967, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = o0Var.U1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z19 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !o0Var.Z1;
                    A.E = new ci.q(o0Var, 0, 11);
                    arrayList4.add(A);
                    if (o0Var.Z1) {
                        n41 z20 = n41.z(3, org.telegram.messenger.gd.N0(2131750972, null));
                        z20.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = o0Var.U1;
                        z20.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z20);
                        if (z19) {
                            n41 z21 = n41.z(4, org.telegram.messenger.gd.N0(2131750975, null));
                            z21.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = o0Var.U1;
                            z21.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z21);
                        }
                        n41 z22 = n41.z(5, org.telegram.messenger.gd.N0(z19 ? 2131750976 : 2131750974, null));
                        z22.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = o0Var.U1;
                        z22.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z22);
                        n41 z23 = n41.z(6, org.telegram.messenger.gd.N0(z19 ? 2131750980 : 2131750979, null));
                        z23.i = 1;
                        z23.L(o0Var.U1.leave);
                        arrayList4.add(z23);
                        if (z19) {
                            n41 z24 = n41.z(7, org.telegram.messenger.gd.N0(2131750978, null));
                            z24.i = 1;
                            z24.L(o0Var.U1.edit_rank);
                            arrayList4.add(z24);
                        }
                    }
                    n41 A2 = n41.A(o0Var.e1(1), org.telegram.messenger.gd.N0(z19 ? 2131750970 : 2131750971, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = o0Var.U1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !o0Var.a2;
                    A2.E = new ci.q(o0Var, 1, 11);
                    arrayList4.add(A2);
                    if (o0Var.a2) {
                        n41 z25 = n41.z(9, org.telegram.messenger.gd.N0(z19 ? 2131750983 : 2131750986, null));
                        z25.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = o0Var.U1;
                        z25.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z25);
                        str2 = null;
                        n41 z26 = n41.z(10, org.telegram.messenger.gd.N0(2131750982, null));
                        z26.i = 1;
                        z26.L(o0Var.U1.invites);
                        arrayList4.add(z26);
                        n41 z27 = n41.z(11, org.telegram.messenger.gd.N0(2131750987, null));
                        z27.i = 1;
                        z27.L(o0Var.U1.group_call);
                        arrayList4.add(z27);
                    } else {
                        str2 = null;
                    }
                    n41 A3 = n41.A(o0Var.e1(2), org.telegram.messenger.gd.N0(2131750968, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = o0Var.U1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !o0Var.b2;
                    A3.E = new ci.q(o0Var, 2, 11);
                    arrayList4.add(A3);
                    if (o0Var.b2) {
                        str3 = null;
                        n41 z28 = n41.z(13, org.telegram.messenger.gd.N0(2131750985, null));
                        z28.i = 1;
                        z28.L(o0Var.U1.delete);
                        arrayList4.add(z28);
                        n41 z29 = n41.z(14, org.telegram.messenger.gd.N0(2131750984, null));
                        z29.i = 1;
                        z29.L(o0Var.U1.edit);
                        arrayList4.add(z29);
                        n41 z30 = n41.z(15, org.telegram.messenger.gd.N0(2131750973, null));
                        z30.i = 1;
                        z30.L(o0Var.U1.pinned);
                        arrayList4.add(z30);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(n41.C(str3));
                    arrayList4.add(n41.u(org.telegram.messenger.gd.N0(2131750989, str3)));
                    n41 z31 = n41.z(16, org.telegram.messenger.gd.N0(2131750988, str3));
                    a0.h hVar = o0Var.W1;
                    int m11 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = o0Var.V1;
                    z31.L(m11 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z31);
                    if (o0Var.V1 != null) {
                        for (int i17 = 0; i17 < o0Var.V1.size(); i17++) {
                            long o10 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) o0Var.V1.get(i17)).peer);
                            TLRPC.User c23 = org.telegram.messenger.mp.u1(o0Var.a).c2(Long.valueOf(o10));
                            n41 n41Var2 = new n41(37);
                            n41Var2.d = (-1) - i17;
                            n41Var2.H = c23;
                            n41Var2.i = 1;
                            a0.h hVar2 = o0Var.W1;
                            n41Var2.L(hVar2 != null && hVar2.d(o10));
                            arrayList4.add(n41Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                bi.r6 r6Var = (bi.r6) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null) {
                    r6Var.a(org.telegram.messenger.fj.h0(tL_textWithEntities, false), null);
                    break;
                } else {
                    if (tL_error == null) {
                        tL_error = new TLRPC.TL_error();
                    }
                    r6Var.a(null, tL_error);
                    break;
                }
            case 5:
                ((ChatActivityEnterView) obj3).w0((Canvas) obj, (org.telegram.messenger.o10) obj2);
                break;
            case 6:
                dj djVar = (dj) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                b51 b51Var4 = (b51) obj2;
                int i18 = djVar.Q;
                ArrayList arrayList7 = djVar.N;
                org.telegram.messenger.gp gpVar = djVar.K;
                ArrayList arrayList8 = djVar.L;
                HashSet hashSet = djVar.J;
                ArrayList arrayList9 = djVar.M;
                arrayList6.add(n41.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(djVar.E)) {
                    b51Var4.V();
                    int i19 = 0;
                    while (i19 < djVar.I.size()) {
                        org.telegram.messenger.ve veVar2 = (org.telegram.messenger.ve) djVar.I.get(i19);
                        veVar2.e.K5(null, z12);
                        boolean z32 = z12;
                        n41 i20 = org.telegram.ui.Cells.f7.i(veVar2, new vi(djVar, 0));
                        i20.L(hashSet.contains(veVar2));
                        i20.d = -1;
                        arrayList6.add(i20);
                        i19++;
                        z12 = z32;
                    }
                    boolean z33 = z12;
                    if (djVar.H) {
                        arrayList6.add(n41.q(11, 4));
                        arrayList6.add(n41.q(12, 4));
                        arrayList6.add(n41.q(13, 4));
                    }
                    b51Var4.U();
                    if (gpVar != null) {
                        ArrayList arrayList10 = gpVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        for (int i21 = 0; i21 < size2; i21++) {
                            if (i21 >= arrayList8.size()) {
                                veVar = new org.telegram.messenger.ve();
                                arrayList8.add(veVar);
                            } else {
                                veVar = (org.telegram.messenger.ve) arrayList8.get(i21);
                            }
                            if (veVar.e != arrayList10.get(i21)) {
                                djVar.m0--;
                                veVar.e = (org.telegram.messenger.fj) arrayList10.get(i21);
                            }
                        }
                    }
                    if (gpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(n41.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        b51Var4.V();
                        arrayList6.add(n41.t(45, org.telegram.messenger.gd.N0(2131753901, str6)));
                        for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                            org.telegram.messenger.ve veVar3 = (org.telegram.messenger.ve) arrayList8.get(i22);
                            n41 i23 = org.telegram.ui.Cells.f7.i(veVar3, new vi(djVar, 0));
                            i23.L(hashSet.contains(veVar3));
                            arrayList6.add(i23);
                        }
                        if (gpVar.f) {
                            arrayList6.add(n41.q(41, 4));
                            arrayList6.add(n41.q(42, 4));
                            arrayList6.add(n41.q(43, 4));
                        }
                        if (!gpVar.f && !gpVar.e) {
                            n41 c10 = n41.c(djVar.S, R.drawable.arrow_more, org.telegram.messenger.gd.N0(2131745143, null));
                            c10.r = z33;
                            arrayList6.add(c10);
                        }
                        b51Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || djVar.V >= 0 || djVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(n41.B(-98, null));
                        }
                        b51Var4.V();
                        arrayList6.add(n41.t(((djVar.V >= 0 || djVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.gd.N0(2131753904, null)));
                        for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                            org.telegram.messenger.ve veVar4 = (org.telegram.messenger.ve) arrayList9.get(i24);
                            veVar4.e.K5(djVar.E, true);
                            n41 i25 = org.telegram.ui.Cells.f7.i(veVar4, new vi(djVar, 0));
                            i25.L(hashSet.contains(veVar4));
                            arrayList6.add(i25);
                        }
                        if (djVar.V >= 0 || djVar.a0) {
                            arrayList6.add(n41.q(21, 4));
                            arrayList6.add(n41.q(22, 4));
                            arrayList6.add(n41.q(23, 4));
                        }
                        if (djVar.d0) {
                            n41 c11 = n41.c(i18, R.drawable.arrow_more, org.telegram.messenger.gd.N0(2131745143, null));
                            c11.r = true;
                            arrayList6.add(c11);
                        }
                        b51Var4.U();
                    }
                } else {
                    String lowerCase = djVar.E.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    int i26 = 0;
                    boolean z34 = false;
                    while (i26 < djVar.I.size()) {
                        org.telegram.messenger.ve veVar5 = (org.telegram.messenger.ve) djVar.I.get(i26);
                        String str8 = veVar5.a;
                        if (str8 != null) {
                            String lowerCase2 = str8.toLowerCase();
                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase2) || M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                z11 = true;
                                str4 = veVar5.b;
                                if (str4 == null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    boolean z35 = z11;
                                    String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                    z11 = z35 || lowerCase3.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase3) || M33.startsWith(M3) || M33.contains(" ".concat(M3));
                                }
                                if (z11) {
                                    b51Var = b51Var4;
                                } else {
                                    if (!z34) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(n41.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        b51Var4.V();
                                        arrayList6.add(n41.t(10, org.telegram.messenger.gd.N0(2131753902, str5)));
                                        z34 = true;
                                    }
                                    b51Var = b51Var4;
                                    veVar5.e.K5(djVar.E, true);
                                    n41 i27 = org.telegram.ui.Cells.f7.i(veVar5, new vi(djVar, 0));
                                    i27.L(hashSet.contains(veVar5));
                                    i27.d = 10;
                                    arrayList6.add(i27);
                                }
                                i26++;
                                b51Var4 = b51Var;
                            }
                        }
                        z11 = false;
                        str4 = veVar5.b;
                        if (str4 == null) {
                        }
                        if (z11) {
                        }
                        i26++;
                        b51Var4 = b51Var;
                    }
                    b51 b51Var5 = b51Var4;
                    b51Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || djVar.V >= 0 || djVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(n41.B(-98, null));
                        }
                        b51Var5.V();
                        arrayList6.add(n41.t(((djVar.V >= 0 || djVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.gd.N0(2131753904, null)));
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            org.telegram.messenger.ve veVar6 = (org.telegram.messenger.ve) arrayList9.get(i28);
                            veVar6.e.K5(djVar.E, true);
                            n41 i29 = org.telegram.ui.Cells.f7.i(veVar6, new vi(djVar, 0));
                            i29.L(hashSet.contains(veVar6));
                            arrayList6.add(i29);
                        }
                        if (djVar.V >= 0 || djVar.a0) {
                            arrayList6.add(n41.q(21, 4));
                            arrayList6.add(n41.q(22, 4));
                            arrayList6.add(n41.q(23, 4));
                        }
                        if (djVar.d0) {
                            n41 c12 = n41.c(i18, R.drawable.arrow_more, org.telegram.messenger.gd.N0(2131745143, null));
                            c12.r = true;
                            arrayList6.add(c12);
                        }
                        b51Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || djVar.e0 >= 0 || djVar.n0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(n41.B(-96, null));
                        }
                        b51Var5.V();
                        arrayList6.add(n41.t(((djVar.e0 >= 0 || djVar.n0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.gd.N0(2131753903, null)));
                        int size3 = arrayList7.size();
                        for (int i30 = 0; i30 < size3; i30++) {
                            org.telegram.messenger.ve veVar7 = (org.telegram.messenger.ve) arrayList7.get(i30);
                            veVar7.e.K5(djVar.E, true);
                            n41 i31 = org.telegram.ui.Cells.f7.i(veVar7, new vi(djVar, 0));
                            i31.L(hashSet.contains(veVar7));
                            arrayList6.add(i31);
                        }
                        if (djVar.e0 >= 0 || djVar.n0) {
                            arrayList6.add(n41.q(31, 4));
                            arrayList6.add(n41.q(32, 4));
                            arrayList6.add(n41.q(33, 4));
                        }
                        if (djVar.h0) {
                            n41 c13 = n41.c(djVar.R, R.drawable.arrow_more, org.telegram.messenger.gd.N0(2131745143, null));
                            c13.r = true;
                            arrayList6.add(c13);
                        }
                        b51Var5.U();
                    }
                }
                if (arrayList6.size() > size || djVar.H) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(djVar.E)) {
                    charSequence = null;
                    arrayList6.add(bj.i(org.telegram.messenger.gd.N0(2131748051, null), org.telegram.messenger.gd.N0(2131748052, null)));
                } else {
                    charSequence = null;
                    arrayList6.add(bj.i(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, djVar.E.length() >= 3 ? 2131748048 : 2131748049, djVar.E)), org.telegram.messenger.gd.N0(2131748050, null)));
                }
                arrayList6.add(n41.B(-99, charSequence));
                break;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z36 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 8:
                b(obj, obj2);
                break;
            case 9:
                c(obj, obj2);
                break;
            case 10:
                d(obj, obj2);
                break;
            case 11:
                e(obj, obj2);
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
                ((ArrayList) obj).add(n41.j(-1, ((x20) obj3).U1));
                break;
            case 16:
                i(obj, obj2);
                break;
            case 17:
                j(obj, obj2);
                break;
            case 18:
                k(obj, obj2);
                break;
            case 19:
                l(obj, obj2);
                break;
            case 20:
                m(obj, obj2);
                break;
            case 21:
                n(obj, obj2);
                break;
            case 22:
                o(obj, obj2);
                break;
            default:
                ((d51) obj3).Z((ArrayList) obj, (b51) obj2);
                break;
        }
    }
}
