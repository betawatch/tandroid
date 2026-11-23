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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        jr jrVar = (jr) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (jrVar.c2 == null) {
            Context context = jrVar.getContext();
            org.telegram.ui.ActionBar.h6 h6Var = jrVar.J0;
            ai.u2 u2Var = new ai.u2(context, 7);
            u2Var.setOrientation(1);
            rh0 rh0Var = new rh0(context);
            rh0Var.setAutoRepeat(true);
            rh0Var.f(R.raw.utyan_streaming, org.telegram.messenger.ls.x1, org.telegram.messenger.ls.x1, null);
            rh0Var.d();
            u2Var.addView(rh0Var, c8.ma.t(org.telegram.messenger.ls.x1, org.telegram.messenger.ls.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131744195, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
            u2Var.addView(textView, c8.ma.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, h6Var);
            textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131742991, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            u2Var.addView(textView2, c8.ma.t(-2, -2, 1, 28, 0, 28, 17));
            jrVar.c2 = u2Var;
        }
        arrayList.add(o41.k(jrVar.c2));
        arrayList.add(o41.C(null));
        arrayList.add(o41.u(org.telegram.messenger.hd.N0(2131743186, null)));
        String str2 = jrVar.X1;
        String N0 = org.telegram.messenger.hd.N0(2131743187, null);
        int i7 = ir.b;
        o41 K = o41.K(ir.class);
        K.m = str2;
        K.o = N0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = jrVar.Z1;
        String N02 = org.telegram.messenger.hd.N0(2131743188, null);
        o41 K2 = o41.K(ir.class);
        K2.m = spannableStringBuilder;
        K2.o = N02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (jrVar.b2) {
            str = org.telegram.messenger.hd.N0(jrVar.T1 ? 2131743183 : 2131743184, null);
        }
        arrayList.add(o41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        final ks ksVar = (ks) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = ksVar.Q;
        z2 z2Var = ksVar.k0;
        ArrayList arrayList2 = ksVar.W;
        js jsVar = ksVar.T;
        boolean z11 = ksVar.S;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(ksVar.h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(ksVar.U);
            arrayList3.addAll(ksVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z11) {
                    arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745626, null)));
                } else {
                    arrayList.add(o41.s(org.telegram.messenger.hd.N0(2131745626, null), org.telegram.messenger.hd.N0(ksVar.Y ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.hs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    ks ksVar2 = ksVar;
                                    ksVar2.Y = !ksVar2.Y;
                                    ksVar2.O(true);
                                    break;
                                default:
                                    ks ksVar3 = ksVar;
                                    ksVar3.X = !ksVar3.X;
                                    ksVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!ksVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    o41 w10 = o41.w((TLObject) arrayList3.get(i12));
                    w10.u = true;
                    w10.I = z2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z11) {
                return;
            }
            arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745560, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                o41 o41Var = new o41(33);
                o41Var.H = (org.telegram.messenger.gj) obj3;
                arrayList.add(o41Var);
            }
            if (ksVar.e0) {
                arrayList.add(o41.p(1));
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.si.d0(i7).m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList4.get(i13)).peer)));
                if (c22 != null && c22.bot) {
                    arrayList5.add(c22);
                }
            }
        }
        ksVar.a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                arrayList.add(o41.s(org.telegram.messenger.hd.N0(2131745624, null), org.telegram.messenger.hd.N0(ksVar.X ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.hs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                ks ksVar2 = ksVar;
                                ksVar2.Y = !ksVar2.Y;
                                ksVar2.O(true);
                                break;
                            default:
                                ks ksVar3 = ksVar;
                                ksVar3.X = !ksVar3.X;
                                ksVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745624, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || ksVar.X); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    o41 w11 = o41.w(user);
                    w11.r = true;
                    w11.u = true;
                    w11.I = z2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        ksVar.b0 = arrayList.size();
        ArrayList arrayList6 = jsVar.h;
        if (arrayList6.isEmpty()) {
            if (jsVar.c || !jsVar.e) {
                if (!z11) {
                    arrayList.add(o41.p(30));
                }
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
            }
            z10 = false;
        } else {
            if (!z11) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745623, null)));
            }
            boolean z12 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    o41 w12 = o41.w(user2);
                    w12.r = true;
                    w12.s = true;
                    w12.u = true;
                    w12.I = z2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (jsVar.c || !jsVar.e) {
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
            }
            z10 = z12;
        }
        if (z10) {
            arrayList.add(o41.C(ksVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        final pm0 pm0Var = (pm0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = pm0Var.S;
        ArrayList arrayList3 = pm0Var.Y;
        int i7 = pm0Var.Q;
        final int i10 = 0;
        if (TextUtils.isEmpty(pm0Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(o41.s(org.telegram.messenger.hd.N0(2131745543, null), org.telegram.messenger.hd.N0(pm0Var.X ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.ls
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    pm0 pm0Var2 = pm0Var;
                                    pm0Var2.X = !pm0Var2.X;
                                    pm0Var2.O(true);
                                    if (pm0Var2.X) {
                                        org.telegram.messenger.g0.v1(pm0Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    pm0 pm0Var3 = pm0Var;
                                    pm0Var3.W = !pm0Var3.W;
                                    pm0Var3.O(true);
                                    if (pm0Var3.W) {
                                        org.telegram.messenger.g0.v1(pm0Var3.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745543, null)));
                }
                int size = arrayList3.size();
                if (!pm0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    o41 w10 = o41.w((TLObject) arrayList3.get(i11));
                    w10.J = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.np.u1(i7).e8;
            org.telegram.messenger.oo ooVar = hashMap == null ? null : (org.telegram.messenger.oo) hashMap.get(0L);
            if (ooVar == null) {
                arrayList.add(o41.p(30));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = ooVar.b;
            int size2 = arrayList5.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList5.get(i12);
                i12++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(chat.id));
                    if (org.telegram.messenger.v3.r0(chat) && (O0 == null || org.telegram.messenger.v3.r0(O0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745515, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(o41.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = pm0Var.T;
        int size4 = arrayList7.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList7.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i14 = size4;
            TLRPC.Chat O02 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(chat2.id));
            if (org.telegram.messenger.v3.r0(chat2) && (O02 == null || org.telegram.messenger.v3.r0(O02))) {
                arrayList6.add(chat2);
            }
            size4 = i14;
        }
        ArrayList arrayList8 = pm0Var.U;
        int size5 = arrayList8.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj6 = arrayList8.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat O03 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(chat3.id));
            if (org.telegram.messenger.v3.r0(chat3) && (O03 == null || org.telegram.messenger.v3.r0(O03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = pm0Var.V;
        int size6 = arrayList9.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj7 = arrayList9.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat O04 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(chat4.id));
            if (org.telegram.messenger.v3.r0(chat4) && (O04 == null || org.telegram.messenger.v3.r0(O04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745618, null)));
            } else {
                final int i17 = 1;
                arrayList.add(o41.s(org.telegram.messenger.hd.N0(2131745618, null), org.telegram.messenger.hd.N0(pm0Var.W ? 2131745144 : 2131745143, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.ls
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                pm0 pm0Var2 = pm0Var;
                                pm0Var2.X = !pm0Var2.X;
                                pm0Var2.O(true);
                                if (pm0Var2.X) {
                                    org.telegram.messenger.g0.v1(pm0Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                pm0 pm0Var3 = pm0Var;
                                pm0Var3.W = !pm0Var3.W;
                                pm0Var3.O(true);
                                if (pm0Var3.W) {
                                    org.telegram.messenger.g0.v1(pm0Var3.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!pm0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(o41.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745560, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            o41 o41Var = new o41(33);
            o41Var.H = (org.telegram.messenger.gj) obj8;
            arrayList.add(o41Var);
        }
        if (pm0Var.b0) {
            arrayList.add(o41.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        ty tyVar = (ty) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        cy cyVar = tyVar.S1;
        if (cyVar == null || !(cyVar.getDrawable() instanceof org.telegram.messenger.h4)) {
            return;
        }
        org.telegram.messenger.h4 h4Var = (org.telegram.messenger.h4) tyVar.S1.getDrawable();
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
            d6 d6Var = h4Var.e;
            if (d6Var != null) {
                d6Var.e(true, 0.0f);
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
            d6 d6Var2 = h4Var.f;
            if (d6Var2 != null) {
                d6Var2.e(true, 0.0f);
            }
        }
        h4Var.invalidateSelf();
        String str = (String) tyVar.S1.getTag();
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
        sx sxVar = (sx) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = sxVar.s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            mx mxVar = (mx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mxVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == sxVar.d;
                int i10 = ux.b;
                o41 K = o41.K(ux.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = mxVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(ux.i(stickerSetCovered, mxVar, stickerSetCovered.set.id == sxVar.d));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        oy oyVar = (oy) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = oyVar.F;
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
                boolean z10 = tL_messages_stickerSet.set.id == oyVar.d;
                int i10 = ux.b;
                o41 K = o41.K(ux.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = oyVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            mx mxVar = (mx) obj4;
            TLRPC.StickerSet stickerSet = mxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(ux.i(mxVar.a, mxVar, stickerSet.id == oyVar.d));
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
        h30 h30Var = (h30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        h30Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.na.a(h30Var.a).f);
        if (h30Var.c.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < h30Var.c.size(); i7++) {
            String str = (String) h30Var.c.get(i7);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(o41.c(i7 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(o41.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.hd.N0(2131752077, null)));
    }

    private final void j(Object obj, Object obj2) {
        fi.b6 b6Var;
        i30 i30Var = (i30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = i30Var.R;
        int i7 = 0;
        boolean z10 = i30Var.S && (b6Var = i30Var.T) != null && b6Var.i.size() > 0;
        if (z10) {
            fi.b6 b6Var2 = i30Var.T;
            int i10 = jg.j1.b;
            o41 K = o41.K(jg.j1.class);
            K.H = b6Var2;
            arrayList.add(K);
        }
        i30Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i7);
            o41 o41Var = new o41(33);
            o41Var.d = i11;
            o41Var.H = gjVar;
            arrayList.add(o41Var);
            i7 = i11;
        }
        if (i30Var.V || !i30Var.Y) {
            arrayList.add(o41.q(-2, 1));
            arrayList.add(o41.q(-3, 1));
            arrayList.add(o41.q(-4, 1));
        }
        if (i30Var.U || !z10) {
            return;
        }
        org.telegram.messenger.g0.g3(new oo(i30Var, 21));
    }

    private final void k(Object obj, Object obj2) {
        w60 w60Var = (w60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        a70 a70Var = w60Var.G;
        a70Var.f.setAlpha(1.0f);
        if (a70Var.u) {
            w60Var.c = bitmap;
        }
        ui.b bVar = a70Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(a70Var.n, w60Var);
            ViewGroup viewGroup = a70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        of0 of0Var = (of0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = of0Var.e;
        ArrayList arrayList3 = of0Var.n;
        int i7 = 0;
        if (of0Var.d == null) {
            arrayList.add(o41.q(-1, 7));
            arrayList.add(o41.q(-2, 7));
            arrayList.add(o41.q(-3, 7));
            of0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(of0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745526, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                o41 o41Var = new o41(33);
                o41Var.H = (org.telegram.messenger.gj) obj3;
                arrayList.add(o41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745527, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                o41 o41Var2 = new o41(33);
                o41Var2.H = (org.telegram.messenger.gj) obj4;
                arrayList.add(o41Var2);
            }
        }
        if (of0Var.w || ((of0Var.N && !of0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !of0Var.s))) {
            arrayList.add(o41.q(of0Var.M * 3, 7));
            arrayList.add(o41.q((of0Var.M * 3) + 1, 7));
            arrayList.add(o41.q((of0Var.M * 3) + 2, 7));
        }
        of0Var.R = arrayList.isEmpty();
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
        kw0 kw0Var = (kw0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        kw0Var.r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.si.b0(kw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.k10.t0).sendRequest(tL_stickers_renameStickerSet, new f2((org.telegram.messenger.y10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        b31 b31Var = (b31) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        m21 m21Var = b31Var.z1;
        a31 a31Var = b31Var.I1;
        if (str != null) {
            b31Var.P1 = false;
            b31Var.A1.setText(b31Var.S0(str));
            a31Var.D(m21Var);
        } else {
            if (b31Var.J) {
                return;
            }
            if (b31Var.P1) {
                b31Var.dismiss();
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.S4, 1, org.telegram.messenger.hd.N0(bool.booleanValue() ? 2131743702 : 2131743701, null));
                return;
            }
            org.telegram.messenger.f3.o(null, bool.booleanValue() ? 2131743702 : 2131743701, new lc((FrameLayout) b31Var.b, b31Var.J0), null);
            x21 x21Var = b31Var.x1.e;
            String str2 = b31Var.w1;
            b31Var.v1 = str2;
            x21Var.setText(b31.P0(str2, null, null));
            a31Var.D(m21Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0321  */
    @Override // org.telegram.messenger.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i7;
        o41 i10;
        o41 i11;
        TL_iv.RichMessage richMessage;
        o41 i12;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        o41 i13;
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
        c51 c51Var;
        String str5;
        CharSequence charSequence;
        String str6;
        org.telegram.messenger.we weVar;
        int i14 = this.a;
        boolean z12 = true;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                n0 n0Var = (n0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var2 = (c51) obj2;
                boolean[] zArr = n0Var.l2;
                boolean[] zArr2 = n0Var.m2;
                m0 m0Var = n0Var.v2;
                arrayList.add(o41.C(null));
                arrayList.add(o41.m(n0Var.t2));
                arrayList.add(o41.C(null));
                c51Var2.G = 1;
                c51Var2.V();
                m0 m0Var2 = n0Var.u2;
                int selectedTab = m0Var2 != null ? m0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = n0Var.n2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(g31.j(3, org.telegram.messenger.hd.N0(2131754986, null), null, null, null));
                    } else {
                        String P0 = b31.P0(n0Var.n2, null, zArr2);
                        String N0 = org.telegram.messenger.hd.N0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = N0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = N0.substring(0, indexOf);
                            substring3 = N0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            P0 = b31.L0(P0);
                        }
                        arrayList.add(g31.j(3, substring2, P0, substring3, null));
                    }
                    arrayList.add(n0Var.r1() ? n0Var.s1(4, n0Var.U1, false) : k31.i(4, n0Var.T1, n0Var.Q2, new c(n0Var, 5), null, null));
                    String P02 = b31.P0(n0Var.o2, zArr, null);
                    String N02 = org.telegram.messenger.hd.N0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
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
                        P02 = b31.L0(P02);
                    }
                    StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(P02);
                    m10.append(n0Var.p2 != null ? a8.p0.s(new StringBuilder(" ("), n0Var.p2, ")") : "");
                    arrayList.add(g31.i(5, str, m10.toString(), substring, new c(n0Var, 6), n0Var.r2, new c(n0Var, 7), null));
                    if (n0Var.r1()) {
                        boolean z13 = n0Var.V1;
                        if (z13 || (richMessage3 = n0Var.X1) == null) {
                            richMessage3 = n0Var.U1;
                        }
                        i13 = n0Var.s1(6, richMessage3, z13);
                    } else {
                        boolean z14 = n0Var.V1;
                        i13 = k31.i(z14 ? 7 : 6, n0Var.W1, false, null, null, !z14 ? new c(n0Var, 8) : null);
                    }
                    arrayList.add(i13);
                } else if (selectedTab == 1) {
                    arrayList.add(o41.k(m0Var));
                    if (m0Var.getSelectedTone() instanceof j0) {
                        arrayList.add(o41.j(10, n0Var.x2));
                        c51Var2.U();
                        arrayList.add(o41.B(11, null));
                        c51Var2.V();
                    }
                    if ((m0Var.getSelectedTab() >= 0 || n0Var.r2) && (!(m0Var.getSelectedTone() instanceof j0) || TextUtils.equals(n0Var.y2.getText().toString(), n0Var.G2))) {
                        arrayList.add(g31.i(7, org.telegram.messenger.hd.N0(2131754984, null), null, null, null, n0Var.r2, new c(n0Var, 7), null));
                        if (n0Var.r1()) {
                            boolean z15 = n0Var.Y1;
                            if (z15 || (richMessage2 = n0Var.a2) == null) {
                                richMessage2 = n0Var.U1;
                            }
                            i12 = n0Var.s1(8, richMessage2, z15);
                        } else {
                            int i15 = 8;
                            boolean z16 = n0Var.Y1;
                            i12 = k31.i(z16 ? 7 : 6, n0Var.Z1, false, null, null, !z16 ? new c(n0Var, i15) : null);
                        }
                        arrayList.add(i12);
                    } else {
                        arrayList.add(g31.i(5, org.telegram.messenger.hd.N0(2131754987, null), null, null, null, n0Var.r2, new c(n0Var, 7), null));
                        arrayList.add(n0Var.r1() ? n0Var.s1(6, n0Var.U1, false) : k31.i(n0Var.Y1 ? 7 : 6, n0Var.T1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(g31.j(3, org.telegram.messenger.hd.N0(2131754987, null), null, null, null));
                    if (n0Var.r1()) {
                        i10 = n0Var.s1(4, n0Var.U1, false);
                        i7 = 5;
                    } else {
                        i7 = 5;
                        i10 = k31.i(4, n0Var.T1, n0Var.Q2, new c(n0Var, i7), null, null);
                    }
                    arrayList.add(i10);
                    arrayList.add(g31.j(i7, org.telegram.messenger.hd.N0(2131754984, null), null, null, null));
                    if (n0Var.r1()) {
                        boolean z17 = n0Var.b2;
                        if (z17 || (richMessage = n0Var.d2) == null) {
                            richMessage = n0Var.U1;
                        }
                        i11 = n0Var.s1(6, richMessage, z17);
                    } else {
                        boolean z18 = n0Var.b2;
                        i11 = k31.i(z18 ? 7 : 6, n0Var.c2, false, null, null, !z18 ? new c(n0Var, 8) : null);
                    }
                    arrayList.add(i11);
                }
                c51Var2.U();
                if (n0Var.q1()) {
                    arrayList.add(o41.B(21, null));
                    c51Var2.V();
                    arrayList.add(o41.j(20, n0Var.R2));
                    c51Var2.U();
                    arrayList.add(o41.B(22, "Every message you send in this chat will be rewritten with these settings."));
                    break;
                } else {
                    arrayList.add(o41.C(null));
                    break;
                }
                break;
            case 1:
                w wVar = (w) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                c51 c51Var3 = (c51) obj2;
                c51Var3.G = 1;
                arrayList2.add(o41.C(null));
                FrameLayout frameLayout = wVar.W1;
                o41 o41Var = new o41(-4);
                o41Var.c = frameLayout;
                o41Var.A = -1;
                o41Var.e = true;
                arrayList2.add(o41Var);
                arrayList2.add(o41.C(null));
                arrayList2.add(o41.m(wVar.X1));
                arrayList2.add(o41.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(o41.m(wVar.Y1));
                arrayList2.add(o41.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = wVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = wVar.e2[wVar.d2];
                    c51Var3.V();
                    arrayList2.add(g31.i(3, org.telegram.messenger.hd.N0(2131755001, null), null, null, null, false, null, new t(wVar, 1)));
                    arrayList2.add(k31.i(4, aicomposetoneexample == null ? w.f1() : org.telegram.messenger.gj.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(g31.j(5, org.telegram.messenger.hd.N0(2131755004, null), null, null, null));
                    arrayList2.add(k31.i(6, aicomposetoneexample == null ? w.f1() : org.telegram.messenger.gj.h0(aicomposetoneexample.to, false), false, null, null, null));
                    c51Var3.U();
                    TLRPC.User c22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.np.u1(wVar.a).c2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String o4 = org.telegram.messenger.p10.o(c22);
                    if (c22 == null) {
                        int i16 = tL_aiComposeTone.installs_count;
                        if (i16 > 0) {
                            arrayList2.add(o41.C(org.telegram.messenger.hd.G(i16, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.hd.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(o4)) {
                            z10 = false;
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131754999, org.telegram.messenger.p10.q(c22));
                        } else {
                            z10 = false;
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131754999, p5.c.k("@", o4));
                        }
                        sb2.append(a02);
                        arrayList2.add(o41.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.m6.Xc, wVar.J0, new org.telegram.ui.eh(18, wVar, tL_aiComposeTone), z10)));
                    }
                }
                arrayList2.add(o41.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                i0 i0Var = (i0) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(o41.C(null));
                arrayList3.add(o41.m(i0Var.T1));
                arrayList3.add(o41.C(null));
                arrayList3.add(o41.k(i0Var.W1));
                arrayList3.add(o41.C(null));
                arrayList3.add(o41.k(i0Var.X1));
                arrayList3.add(o41.C(null));
                if (i0Var.f2 != null) {
                    o41 e10 = o41.e(1, org.telegram.messenger.hd.N0(2131754998, null));
                    e10.s = true;
                    arrayList3.add(e10);
                    arrayList3.add(o41.C(null));
                }
                arrayList3.add(o41.m(i0Var.Y1));
                break;
            case 3:
                p0 p0Var = (p0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z19 = p0Var.X1;
                if (p0Var.U1 != null) {
                    arrayList4.add(o41.C(null));
                    arrayList4.add(o41.u(org.telegram.messenger.hd.N0(2131750990, null)));
                    o41 A = o41.A(p0Var.e1(0), org.telegram.messenger.hd.N0(z19 ? 2131750969 : 2131750967, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = p0Var.U1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z19 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !p0Var.Z1;
                    A.E = new ci.q(p0Var, 0, 11);
                    arrayList4.add(A);
                    if (p0Var.Z1) {
                        o41 z20 = o41.z(3, org.telegram.messenger.hd.N0(2131750972, null));
                        z20.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = p0Var.U1;
                        z20.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z20);
                        if (z19) {
                            o41 z21 = o41.z(4, org.telegram.messenger.hd.N0(2131750975, null));
                            z21.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = p0Var.U1;
                            z21.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z21);
                        }
                        o41 z22 = o41.z(5, org.telegram.messenger.hd.N0(z19 ? 2131750976 : 2131750974, null));
                        z22.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = p0Var.U1;
                        z22.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z22);
                        o41 z23 = o41.z(6, org.telegram.messenger.hd.N0(z19 ? 2131750980 : 2131750979, null));
                        z23.i = 1;
                        z23.L(p0Var.U1.leave);
                        arrayList4.add(z23);
                        if (z19) {
                            o41 z24 = o41.z(7, org.telegram.messenger.hd.N0(2131750978, null));
                            z24.i = 1;
                            z24.L(p0Var.U1.edit_rank);
                            arrayList4.add(z24);
                        }
                    }
                    o41 A2 = o41.A(p0Var.e1(1), org.telegram.messenger.hd.N0(z19 ? 2131750970 : 2131750971, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = p0Var.U1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !p0Var.a2;
                    A2.E = new ci.q(p0Var, 1, 11);
                    arrayList4.add(A2);
                    if (p0Var.a2) {
                        o41 z25 = o41.z(9, org.telegram.messenger.hd.N0(z19 ? 2131750983 : 2131750986, null));
                        z25.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = p0Var.U1;
                        z25.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z25);
                        str2 = null;
                        o41 z26 = o41.z(10, org.telegram.messenger.hd.N0(2131750982, null));
                        z26.i = 1;
                        z26.L(p0Var.U1.invites);
                        arrayList4.add(z26);
                        o41 z27 = o41.z(11, org.telegram.messenger.hd.N0(2131750987, null));
                        z27.i = 1;
                        z27.L(p0Var.U1.group_call);
                        arrayList4.add(z27);
                    } else {
                        str2 = null;
                    }
                    o41 A3 = o41.A(p0Var.e1(2), org.telegram.messenger.hd.N0(2131750968, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = p0Var.U1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !p0Var.b2;
                    A3.E = new ci.q(p0Var, 2, 11);
                    arrayList4.add(A3);
                    if (p0Var.b2) {
                        str3 = null;
                        o41 z28 = o41.z(13, org.telegram.messenger.hd.N0(2131750985, null));
                        z28.i = 1;
                        z28.L(p0Var.U1.delete);
                        arrayList4.add(z28);
                        o41 z29 = o41.z(14, org.telegram.messenger.hd.N0(2131750984, null));
                        z29.i = 1;
                        z29.L(p0Var.U1.edit);
                        arrayList4.add(z29);
                        o41 z30 = o41.z(15, org.telegram.messenger.hd.N0(2131750973, null));
                        z30.i = 1;
                        z30.L(p0Var.U1.pinned);
                        arrayList4.add(z30);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(o41.C(str3));
                    arrayList4.add(o41.u(org.telegram.messenger.hd.N0(2131750989, str3)));
                    o41 z31 = o41.z(16, org.telegram.messenger.hd.N0(2131750988, str3));
                    a0.h hVar = p0Var.W1;
                    int m11 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = p0Var.V1;
                    z31.L(m11 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z31);
                    if (p0Var.V1 != null) {
                        for (int i17 = 0; i17 < p0Var.V1.size(); i17++) {
                            long o10 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) p0Var.V1.get(i17)).peer);
                            TLRPC.User c23 = org.telegram.messenger.np.u1(p0Var.a).c2(Long.valueOf(o10));
                            o41 o41Var2 = new o41(37);
                            o41Var2.d = (-1) - i17;
                            o41Var2.H = c23;
                            o41Var2.i = 1;
                            a0.h hVar2 = p0Var.W1;
                            o41Var2.L(hVar2 != null && hVar2.d(o10));
                            arrayList4.add(o41Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                bi.o6 o6Var = (bi.o6) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null) {
                    o6Var.a(org.telegram.messenger.gj.h0(tL_textWithEntities, false), null);
                    break;
                } else {
                    if (tL_error == null) {
                        tL_error = new TLRPC.TL_error();
                    }
                    o6Var.a(null, tL_error);
                    break;
                }
            case 5:
                ((ChatActivityEnterView) obj3).w0((Canvas) obj, (org.telegram.messenger.q10) obj2);
                break;
            case 6:
                ej ejVar = (ej) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                c51 c51Var4 = (c51) obj2;
                int i18 = ejVar.Q;
                ArrayList arrayList7 = ejVar.N;
                org.telegram.messenger.hp hpVar = ejVar.K;
                ArrayList arrayList8 = ejVar.L;
                HashSet hashSet = ejVar.J;
                ArrayList arrayList9 = ejVar.M;
                arrayList6.add(o41.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(ejVar.E)) {
                    c51Var4.V();
                    int i19 = 0;
                    while (i19 < ejVar.I.size()) {
                        org.telegram.messenger.we weVar2 = (org.telegram.messenger.we) ejVar.I.get(i19);
                        weVar2.e.K5(null, z12);
                        boolean z32 = z12;
                        o41 i20 = org.telegram.ui.Cells.g7.i(weVar2, new wi(ejVar, 0));
                        i20.L(hashSet.contains(weVar2));
                        i20.d = -1;
                        arrayList6.add(i20);
                        i19++;
                        z12 = z32;
                    }
                    boolean z33 = z12;
                    if (ejVar.H) {
                        arrayList6.add(o41.q(11, 4));
                        arrayList6.add(o41.q(12, 4));
                        arrayList6.add(o41.q(13, 4));
                    }
                    c51Var4.U();
                    if (hpVar != null) {
                        ArrayList arrayList10 = hpVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        for (int i21 = 0; i21 < size2; i21++) {
                            if (i21 >= arrayList8.size()) {
                                weVar = new org.telegram.messenger.we();
                                arrayList8.add(weVar);
                            } else {
                                weVar = (org.telegram.messenger.we) arrayList8.get(i21);
                            }
                            if (weVar.e != arrayList10.get(i21)) {
                                ejVar.m0--;
                                weVar.e = (org.telegram.messenger.gj) arrayList10.get(i21);
                            }
                        }
                    }
                    if (hpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(o41.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        c51Var4.V();
                        arrayList6.add(o41.t(45, org.telegram.messenger.hd.N0(2131753901, str6)));
                        for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                            org.telegram.messenger.we weVar3 = (org.telegram.messenger.we) arrayList8.get(i22);
                            o41 i23 = org.telegram.ui.Cells.g7.i(weVar3, new wi(ejVar, 0));
                            i23.L(hashSet.contains(weVar3));
                            arrayList6.add(i23);
                        }
                        if (hpVar.f) {
                            arrayList6.add(o41.q(41, 4));
                            arrayList6.add(o41.q(42, 4));
                            arrayList6.add(o41.q(43, 4));
                        }
                        if (!hpVar.f && !hpVar.e) {
                            o41 c10 = o41.c(ejVar.S, R.drawable.arrow_more, org.telegram.messenger.hd.N0(2131745143, null));
                            c10.r = z33;
                            arrayList6.add(c10);
                        }
                        c51Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || ejVar.V >= 0 || ejVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(o41.B(-98, null));
                        }
                        c51Var4.V();
                        arrayList6.add(o41.t(((ejVar.V >= 0 || ejVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.hd.N0(2131753904, null)));
                        for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                            org.telegram.messenger.we weVar4 = (org.telegram.messenger.we) arrayList9.get(i24);
                            weVar4.e.K5(ejVar.E, true);
                            o41 i25 = org.telegram.ui.Cells.g7.i(weVar4, new wi(ejVar, 0));
                            i25.L(hashSet.contains(weVar4));
                            arrayList6.add(i25);
                        }
                        if (ejVar.V >= 0 || ejVar.a0) {
                            arrayList6.add(o41.q(21, 4));
                            arrayList6.add(o41.q(22, 4));
                            arrayList6.add(o41.q(23, 4));
                        }
                        if (ejVar.d0) {
                            o41 c11 = o41.c(i18, R.drawable.arrow_more, org.telegram.messenger.hd.N0(2131745143, null));
                            c11.r = true;
                            arrayList6.add(c11);
                        }
                        c51Var4.U();
                    }
                } else {
                    String lowerCase = ejVar.E.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    int i26 = 0;
                    boolean z34 = false;
                    while (i26 < ejVar.I.size()) {
                        org.telegram.messenger.we weVar5 = (org.telegram.messenger.we) ejVar.I.get(i26);
                        String str8 = weVar5.a;
                        if (str8 != null) {
                            String lowerCase2 = str8.toLowerCase();
                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase2) || M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                z11 = true;
                                str4 = weVar5.b;
                                if (str4 == null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    boolean z35 = z11;
                                    String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                    z11 = z35 || lowerCase3.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase3) || M33.startsWith(M3) || M33.contains(" ".concat(M3));
                                }
                                if (z11) {
                                    c51Var = c51Var4;
                                } else {
                                    if (!z34) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(o41.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        c51Var4.V();
                                        arrayList6.add(o41.t(10, org.telegram.messenger.hd.N0(2131753902, str5)));
                                        z34 = true;
                                    }
                                    c51Var = c51Var4;
                                    weVar5.e.K5(ejVar.E, true);
                                    o41 i27 = org.telegram.ui.Cells.g7.i(weVar5, new wi(ejVar, 0));
                                    i27.L(hashSet.contains(weVar5));
                                    i27.d = 10;
                                    arrayList6.add(i27);
                                }
                                i26++;
                                c51Var4 = c51Var;
                            }
                        }
                        z11 = false;
                        str4 = weVar5.b;
                        if (str4 == null) {
                        }
                        if (z11) {
                        }
                        i26++;
                        c51Var4 = c51Var;
                    }
                    c51 c51Var5 = c51Var4;
                    c51Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || ejVar.V >= 0 || ejVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(o41.B(-98, null));
                        }
                        c51Var5.V();
                        arrayList6.add(o41.t(((ejVar.V >= 0 || ejVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.hd.N0(2131753904, null)));
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            org.telegram.messenger.we weVar6 = (org.telegram.messenger.we) arrayList9.get(i28);
                            weVar6.e.K5(ejVar.E, true);
                            o41 i29 = org.telegram.ui.Cells.g7.i(weVar6, new wi(ejVar, 0));
                            i29.L(hashSet.contains(weVar6));
                            arrayList6.add(i29);
                        }
                        if (ejVar.V >= 0 || ejVar.a0) {
                            arrayList6.add(o41.q(21, 4));
                            arrayList6.add(o41.q(22, 4));
                            arrayList6.add(o41.q(23, 4));
                        }
                        if (ejVar.d0) {
                            o41 c12 = o41.c(i18, R.drawable.arrow_more, org.telegram.messenger.hd.N0(2131745143, null));
                            c12.r = true;
                            arrayList6.add(c12);
                        }
                        c51Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || ejVar.e0 >= 0 || ejVar.n0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(o41.B(-96, null));
                        }
                        c51Var5.V();
                        arrayList6.add(o41.t(((ejVar.e0 >= 0 || ejVar.n0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.hd.N0(2131753903, null)));
                        int size3 = arrayList7.size();
                        for (int i30 = 0; i30 < size3; i30++) {
                            org.telegram.messenger.we weVar7 = (org.telegram.messenger.we) arrayList7.get(i30);
                            weVar7.e.K5(ejVar.E, true);
                            o41 i31 = org.telegram.ui.Cells.g7.i(weVar7, new wi(ejVar, 0));
                            i31.L(hashSet.contains(weVar7));
                            arrayList6.add(i31);
                        }
                        if (ejVar.e0 >= 0 || ejVar.n0) {
                            arrayList6.add(o41.q(31, 4));
                            arrayList6.add(o41.q(32, 4));
                            arrayList6.add(o41.q(33, 4));
                        }
                        if (ejVar.h0) {
                            o41 c13 = o41.c(ejVar.R, R.drawable.arrow_more, org.telegram.messenger.hd.N0(2131745143, null));
                            c13.r = true;
                            arrayList6.add(c13);
                        }
                        c51Var5.U();
                    }
                }
                if (arrayList6.size() > size || ejVar.H) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(ejVar.E)) {
                    charSequence = null;
                    arrayList6.add(cj.i(org.telegram.messenger.hd.N0(2131748051, null), org.telegram.messenger.hd.N0(2131748052, null)));
                } else {
                    charSequence = null;
                    arrayList6.add(cj.i(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, ejVar.E.length() >= 3 ? 2131748048 : 2131748049, ejVar.E)), org.telegram.messenger.hd.N0(2131748050, null)));
                }
                arrayList6.add(o41.B(-99, charSequence));
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
                ((ArrayList) obj).add(o41.j(-1, ((a30) obj3).U1));
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
                ((e51) obj3).Z((ArrayList) obj, (c51) obj2);
                break;
        }
    }
}
