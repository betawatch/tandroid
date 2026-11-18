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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        hr hrVar = (hr) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (hrVar.c2 == null) {
            Context context = hrVar.getContext();
            org.telegram.ui.ActionBar.i6 i6Var = hrVar.J0;
            ai.r2 r2Var = new ai.r2(context, 7);
            r2Var.setOrientation(1);
            ph0 ph0Var = new ph0(context);
            ph0Var.setAutoRepeat(true);
            ph0Var.f(R.raw.utyan_streaming, org.telegram.messenger.ks.x1, org.telegram.messenger.ks.x1, null);
            ph0Var.d();
            r2Var.addView(ph0Var, c8.ma.t(org.telegram.messenger.ks.x1, org.telegram.messenger.ks.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131744203, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
            r2Var.addView(textView, c8.ma.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, i6Var);
            textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131742999, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            r2Var.addView(textView2, c8.ma.t(-2, -2, 1, 28, 0, 28, 17));
            hrVar.c2 = r2Var;
        }
        arrayList.add(l41.k(hrVar.c2));
        arrayList.add(l41.C(null));
        arrayList.add(l41.u(org.telegram.messenger.gd.M0(2131743194, null)));
        String str2 = hrVar.X1;
        String M0 = org.telegram.messenger.gd.M0(2131743195, null);
        int i7 = gr.b;
        l41 K = l41.K(gr.class);
        K.m = str2;
        K.o = M0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = hrVar.Z1;
        String M02 = org.telegram.messenger.gd.M0(2131743196, null);
        l41 K2 = l41.K(gr.class);
        K2.m = spannableStringBuilder;
        K2.o = M02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (hrVar.b2) {
            str = org.telegram.messenger.gd.M0(hrVar.T1 ? 2131743191 : 2131743192, null);
        }
        arrayList.add(l41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        final is isVar = (is) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = isVar.Q;
        y2 y2Var = isVar.k0;
        ArrayList arrayList2 = isVar.W;
        hs hsVar = isVar.T;
        boolean z11 = isVar.S;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(isVar.h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(isVar.U);
            arrayList3.addAll(isVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z11) {
                    arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745627, null)));
                } else {
                    arrayList.add(l41.s(org.telegram.messenger.gd.M0(2131745627, null), org.telegram.messenger.gd.M0(isVar.Y ? 2131745145 : 2131745144, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.fs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    is isVar2 = isVar;
                                    isVar2.Y = !isVar2.Y;
                                    isVar2.O(true);
                                    break;
                                default:
                                    is isVar3 = isVar;
                                    isVar3.X = !isVar3.X;
                                    isVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!isVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    l41 w10 = l41.w((TLObject) arrayList3.get(i12));
                    w10.u = true;
                    w10.I = y2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z11) {
                return;
            }
            arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745561, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                l41 l41Var = new l41(33);
                l41Var.H = (org.telegram.messenger.fj) obj3;
                arrayList.add(l41Var);
            }
            if (isVar.e0) {
                arrayList.add(l41.p(1));
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
        isVar.a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                arrayList.add(l41.s(org.telegram.messenger.gd.M0(2131745625, null), org.telegram.messenger.gd.M0(isVar.X ? 2131745145 : 2131745144, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.fs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                is isVar2 = isVar;
                                isVar2.Y = !isVar2.Y;
                                isVar2.O(true);
                                break;
                            default:
                                is isVar3 = isVar;
                                isVar3.X = !isVar3.X;
                                isVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745625, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || isVar.X); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    l41 w11 = l41.w(user);
                    w11.r = true;
                    w11.u = true;
                    w11.I = y2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        isVar.b0 = arrayList.size();
        ArrayList arrayList6 = hsVar.h;
        if (arrayList6.isEmpty()) {
            if (hsVar.c || !hsVar.e) {
                if (!z11) {
                    arrayList.add(l41.p(30));
                }
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
            }
            z10 = false;
        } else {
            if (!z11) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745624, null)));
            }
            boolean z12 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    l41 w12 = l41.w(user2);
                    w12.r = true;
                    w12.s = true;
                    w12.u = true;
                    w12.I = y2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (hsVar.c || !hsVar.e) {
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
            }
            z10 = z12;
        }
        if (z10) {
            arrayList.add(l41.C(isVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        final mm0 mm0Var = (mm0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = mm0Var.S;
        ArrayList arrayList3 = mm0Var.Y;
        int i7 = mm0Var.Q;
        final int i10 = 0;
        if (TextUtils.isEmpty(mm0Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(l41.s(org.telegram.messenger.gd.M0(2131745544, null), org.telegram.messenger.gd.M0(mm0Var.X ? 2131745145 : 2131745144, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.js
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    mm0 mm0Var2 = mm0Var;
                                    mm0Var2.X = !mm0Var2.X;
                                    mm0Var2.O(true);
                                    if (mm0Var2.X) {
                                        org.telegram.messenger.g0.v1(mm0Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    mm0 mm0Var3 = mm0Var;
                                    mm0Var3.W = !mm0Var3.W;
                                    mm0Var3.O(true);
                                    if (mm0Var3.W) {
                                        org.telegram.messenger.g0.v1(mm0Var3.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745544, null)));
                }
                int size = arrayList3.size();
                if (!mm0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    l41 w10 = l41.w((TLObject) arrayList3.get(i11));
                    w10.J = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.mp.u1(i7).e8;
            org.telegram.messenger.no noVar = hashMap == null ? null : (org.telegram.messenger.no) hashMap.get(0L);
            if (noVar == null) {
                arrayList.add(l41.p(30));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
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
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745516, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(l41.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = mm0Var.T;
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
        ArrayList arrayList8 = mm0Var.U;
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
        ArrayList arrayList9 = mm0Var.V;
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
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745619, null)));
            } else {
                final int i17 = 1;
                arrayList.add(l41.s(org.telegram.messenger.gd.M0(2131745619, null), org.telegram.messenger.gd.M0(mm0Var.W ? 2131745145 : 2131745144, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.js
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                mm0 mm0Var2 = mm0Var;
                                mm0Var2.X = !mm0Var2.X;
                                mm0Var2.O(true);
                                if (mm0Var2.X) {
                                    org.telegram.messenger.g0.v1(mm0Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                mm0 mm0Var3 = mm0Var;
                                mm0Var3.W = !mm0Var3.W;
                                mm0Var3.O(true);
                                if (mm0Var3.W) {
                                    org.telegram.messenger.g0.v1(mm0Var3.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!mm0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(l41.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745561, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            l41 l41Var = new l41(33);
            l41Var.H = (org.telegram.messenger.fj) obj8;
            arrayList.add(l41Var);
        }
        if (mm0Var.b0) {
            arrayList.add(l41.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        ry ryVar = (ry) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        zx zxVar = ryVar.S1;
        if (zxVar == null || !(zxVar.getDrawable() instanceof org.telegram.messenger.h4)) {
            return;
        }
        org.telegram.messenger.h4 h4Var = (org.telegram.messenger.h4) ryVar.S1.getDrawable();
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
        String str = (String) ryVar.S1.getTag();
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
        qx qxVar = (qx) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = qxVar.s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            kx kxVar = (kx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kxVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == qxVar.d;
                int i10 = sx.b;
                l41 K = l41.K(sx.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = kxVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(sx.i(stickerSetCovered, kxVar, stickerSetCovered.set.id == qxVar.d));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        my myVar = (my) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = myVar.F;
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
                boolean z10 = tL_messages_stickerSet.set.id == myVar.d;
                int i10 = sx.b;
                l41 K = l41.K(sx.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = myVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            kx kxVar = (kx) obj4;
            TLRPC.StickerSet stickerSet = kxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(sx.i(kxVar.a, kxVar, stickerSet.id == myVar.d));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.a0;
        org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        v0Var.getClass();
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
                arrayList.add(l41.c(i7 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(l41.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.gd.M0(2131752078, null)));
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
            l41 K = l41.K(jg.j1.class);
            K.H = b6Var2;
            arrayList.add(K);
        }
        f30Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i7);
            l41 l41Var = new l41(33);
            l41Var.d = i11;
            l41Var.H = fjVar;
            arrayList.add(l41Var);
            i7 = i11;
        }
        if (f30Var.V || !f30Var.Y) {
            arrayList.add(l41.q(-2, 1));
            arrayList.add(l41.q(-3, 1));
            arrayList.add(l41.q(-4, 1));
        }
        if (f30Var.U || !z10) {
            return;
        }
        org.telegram.messenger.g0.g3(new mo(f30Var, 21));
    }

    private final void k(Object obj, Object obj2) {
        u60 u60Var = (u60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        y60 y60Var = u60Var.G;
        y60Var.f.setAlpha(1.0f);
        if (y60Var.u) {
            u60Var.c = bitmap;
        }
        ui.b bVar = y60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(y60Var.n, u60Var);
            ViewGroup viewGroup = y60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        mf0 mf0Var = (mf0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = mf0Var.e;
        ArrayList arrayList3 = mf0Var.n;
        int i7 = 0;
        if (mf0Var.d == null) {
            arrayList.add(l41.q(-1, 7));
            arrayList.add(l41.q(-2, 7));
            arrayList.add(l41.q(-3, 7));
            mf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(mf0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745527, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                l41 l41Var = new l41(33);
                l41Var.H = (org.telegram.messenger.fj) obj3;
                arrayList.add(l41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745528, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                l41 l41Var2 = new l41(33);
                l41Var2.H = (org.telegram.messenger.fj) obj4;
                arrayList.add(l41Var2);
            }
        }
        if (mf0Var.w || ((mf0Var.N && !mf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !mf0Var.s))) {
            arrayList.add(l41.q(mf0Var.M * 3, 7));
            arrayList.add(l41.q((mf0Var.M * 3) + 1, 7));
            arrayList.add(l41.q((mf0Var.M * 3) + 2, 7));
        }
        mf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        wk0 wk0Var = (wk0) this.b;
        wk0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        wk0Var.e = paint;
        Bitmap bitmap = wk0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        wk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        wk0Var.f = new Matrix();
        ui.b bVar = wk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, wk0Var.s);
        ViewGroup viewGroup = wk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        iw0 iw0Var = (iw0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        iw0Var.r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ri.b0(iw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).sendRequest(tL_stickers_renameStickerSet, new e2((org.telegram.messenger.x10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        y21 y21Var = (y21) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        j21 j21Var = y21Var.z1;
        x21 x21Var = y21Var.I1;
        if (str != null) {
            y21Var.P1 = false;
            y21Var.A1.setText(y21Var.S0(str));
            x21Var.D(j21Var);
        } else {
            if (y21Var.J) {
                return;
            }
            if (y21Var.P1) {
                y21Var.dismiss();
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.R4, 1, org.telegram.messenger.gd.M0(bool.booleanValue() ? 2131743710 : 2131743709, null));
                return;
            }
            org.telegram.messenger.f3.o(null, bool.booleanValue() ? 2131743710 : 2131743709, new lc((FrameLayout) y21Var.b, y21Var.J0), null);
            u21 u21Var = y21Var.x1.e;
            String str2 = y21Var.w1;
            y21Var.v1 = str2;
            u21Var.setText(y21.P0(str2, null, null));
            x21Var.D(j21Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0360 A[SYNTHETIC] */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i7;
        l41 i10;
        l41 i11;
        TL_iv.RichMessage richMessage;
        l41 i12;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        l41 i13;
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
        String str5;
        CharSequence charSequence;
        org.telegram.messenger.ve veVar;
        int i14 = this.a;
        boolean z12 = true;
        Object obj3 = this.b;
        int i15 = 0;
        switch (i14) {
            case 0:
                m0 m0Var = (m0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                boolean[] zArr = m0Var.l2;
                boolean[] zArr2 = m0Var.m2;
                l0 l0Var = m0Var.v2;
                arrayList.add(l41.C(null));
                arrayList.add(l41.m(m0Var.t2));
                arrayList.add(l41.C(null));
                z41Var.G = 1;
                z41Var.V();
                l0 l0Var2 = m0Var.u2;
                int selectedTab = l0Var2 != null ? l0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str6 = m0Var.n2;
                    if (str6 == null || str6.equalsIgnoreCase("und")) {
                        arrayList.add(e31.j(3, org.telegram.messenger.gd.M0(2131754986, null), null, null, null));
                    } else {
                        String P0 = y21.P0(m0Var.n2, null, zArr2);
                        String M0 = org.telegram.messenger.gd.M0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            P0 = y21.L0(P0);
                        }
                        arrayList.add(e31.j(3, substring2, P0, substring3, null));
                    }
                    arrayList.add(m0Var.r1() ? m0Var.s1(4, m0Var.U1, false) : i31.i(4, m0Var.T1, m0Var.Q2, new c(m0Var, 5), null, null));
                    String P02 = y21.P0(m0Var.o2, zArr, null);
                    String M02 = org.telegram.messenger.gd.M0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
                    int indexOf2 = M02.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = M02.substring(0, indexOf2);
                        substring = M02.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        P02 = y21.L0(P02);
                    }
                    StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(P02);
                    m10.append(m0Var.p2 != null ? a8.p0.s(new StringBuilder(" ("), m0Var.p2, ")") : "");
                    arrayList.add(e31.i(5, str, m10.toString(), substring, new c(m0Var, 6), m0Var.r2, new c(m0Var, 7), null));
                    if (m0Var.r1()) {
                        boolean z13 = m0Var.V1;
                        if (z13 || (richMessage3 = m0Var.X1) == null) {
                            richMessage3 = m0Var.U1;
                        }
                        i13 = m0Var.s1(6, richMessage3, z13);
                    } else {
                        boolean z14 = m0Var.V1;
                        i13 = i31.i(z14 ? 7 : 6, m0Var.W1, false, null, null, !z14 ? new c(m0Var, 8) : null);
                    }
                    arrayList.add(i13);
                } else if (selectedTab == 1) {
                    arrayList.add(l41.k(l0Var));
                    if (l0Var.getSelectedTone() instanceof i0) {
                        arrayList.add(l41.j(10, m0Var.x2));
                        z41Var.U();
                        arrayList.add(l41.B(11, null));
                        z41Var.V();
                    }
                    if ((l0Var.getSelectedTab() >= 0 || m0Var.r2) && (!(l0Var.getSelectedTone() instanceof i0) || TextUtils.equals(m0Var.y2.getText().toString(), m0Var.G2))) {
                        arrayList.add(e31.i(7, org.telegram.messenger.gd.M0(2131754984, null), null, null, null, m0Var.r2, new c(m0Var, 7), null));
                        if (m0Var.r1()) {
                            boolean z15 = m0Var.Y1;
                            if (z15 || (richMessage2 = m0Var.a2) == null) {
                                richMessage2 = m0Var.U1;
                            }
                            i12 = m0Var.s1(8, richMessage2, z15);
                        } else {
                            int i16 = 8;
                            boolean z16 = m0Var.Y1;
                            i12 = i31.i(z16 ? 7 : 6, m0Var.Z1, false, null, null, !z16 ? new c(m0Var, i16) : null);
                        }
                        arrayList.add(i12);
                    } else {
                        arrayList.add(e31.i(5, org.telegram.messenger.gd.M0(2131754987, null), null, null, null, m0Var.r2, new c(m0Var, 7), null));
                        arrayList.add(m0Var.r1() ? m0Var.s1(6, m0Var.U1, false) : i31.i(m0Var.Y1 ? 7 : 6, m0Var.T1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(e31.j(3, org.telegram.messenger.gd.M0(2131754987, null), null, null, null));
                    if (m0Var.r1()) {
                        i10 = m0Var.s1(4, m0Var.U1, false);
                        i7 = 5;
                    } else {
                        i7 = 5;
                        i10 = i31.i(4, m0Var.T1, m0Var.Q2, new c(m0Var, i7), null, null);
                    }
                    arrayList.add(i10);
                    arrayList.add(e31.j(i7, org.telegram.messenger.gd.M0(2131754984, null), null, null, null));
                    if (m0Var.r1()) {
                        boolean z17 = m0Var.b2;
                        if (z17 || (richMessage = m0Var.d2) == null) {
                            richMessage = m0Var.U1;
                        }
                        i11 = m0Var.s1(6, richMessage, z17);
                    } else {
                        boolean z18 = m0Var.b2;
                        i11 = i31.i(z18 ? 7 : 6, m0Var.c2, false, null, null, !z18 ? new c(m0Var, 8) : null);
                    }
                    arrayList.add(i11);
                }
                z41Var.U();
                if (m0Var.q1()) {
                    arrayList.add(l41.B(21, null));
                    z41Var.V();
                    arrayList.add(l41.j(20, m0Var.R2));
                    z41Var.U();
                    arrayList.add(l41.B(22, "Every message you send in this chat will be rewritten with these settings."));
                    break;
                } else {
                    arrayList.add(l41.C(null));
                    break;
                }
                break;
            case 1:
                v vVar = (v) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                z41Var2.G = 1;
                arrayList2.add(l41.C(null));
                FrameLayout frameLayout = vVar.W1;
                l41 l41Var = new l41(-4);
                l41Var.c = frameLayout;
                l41Var.A = -1;
                l41Var.e = true;
                arrayList2.add(l41Var);
                arrayList2.add(l41.C(null));
                arrayList2.add(l41.m(vVar.X1));
                arrayList2.add(l41.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(l41.m(vVar.Y1));
                arrayList2.add(l41.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = vVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = vVar.e2[vVar.d2];
                    z41Var2.V();
                    arrayList2.add(e31.i(3, org.telegram.messenger.gd.M0(2131755001, null), null, null, null, false, null, new s(vVar, 1)));
                    arrayList2.add(i31.i(4, aicomposetoneexample == null ? v.f1() : org.telegram.messenger.fj.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(e31.j(5, org.telegram.messenger.gd.M0(2131755004, null), null, null, null));
                    arrayList2.add(i31.i(6, aicomposetoneexample == null ? v.f1() : org.telegram.messenger.fj.h0(aicomposetoneexample.to, false), false, null, null, null));
                    z41Var2.U();
                    TLRPC.User c22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.mp.u1(vVar.a).c2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String o4 = org.telegram.messenger.o10.o(c22);
                    if (c22 == null) {
                        int i17 = tL_aiComposeTone.installs_count;
                        if (i17 > 0) {
                            arrayList2.add(l41.C(org.telegram.messenger.gd.G(i17, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.gd.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(o4)) {
                            z10 = false;
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131754999, org.telegram.messenger.o10.q(c22));
                        } else {
                            z10 = false;
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131754999, p5.c.k("@", o4));
                        }
                        sb2.append(a02);
                        arrayList2.add(l41.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.n6.Xc, vVar.J0, new org.telegram.ui.ci(16, vVar, tL_aiComposeTone), z10)));
                    }
                }
                arrayList2.add(l41.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                h0 h0Var = (h0) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(l41.C(null));
                arrayList3.add(l41.m(h0Var.T1));
                arrayList3.add(l41.C(null));
                arrayList3.add(l41.k(h0Var.W1));
                arrayList3.add(l41.C(null));
                arrayList3.add(l41.k(h0Var.X1));
                arrayList3.add(l41.C(null));
                if (h0Var.f2 != null) {
                    l41 e10 = l41.e(1, org.telegram.messenger.gd.M0(2131754998, null));
                    e10.s = true;
                    arrayList3.add(e10);
                    arrayList3.add(l41.C(null));
                }
                arrayList3.add(l41.m(h0Var.Y1));
                break;
            case 3:
                o0 o0Var = (o0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z19 = o0Var.X1;
                if (o0Var.U1 != null) {
                    arrayList4.add(l41.C(null));
                    arrayList4.add(l41.u(org.telegram.messenger.gd.M0(2131750991, null)));
                    l41 A = l41.A(o0Var.e1(0), org.telegram.messenger.gd.M0(z19 ? 2131750970 : 2131750968, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = o0Var.U1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z19 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !o0Var.Z1;
                    A.E = new ci.q(o0Var, 0, 11);
                    arrayList4.add(A);
                    if (o0Var.Z1) {
                        l41 z20 = l41.z(3, org.telegram.messenger.gd.M0(2131750973, null));
                        z20.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = o0Var.U1;
                        z20.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z20);
                        if (z19) {
                            l41 z21 = l41.z(4, org.telegram.messenger.gd.M0(2131750976, null));
                            z21.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = o0Var.U1;
                            z21.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z21);
                        }
                        l41 z22 = l41.z(5, org.telegram.messenger.gd.M0(z19 ? 2131750977 : 2131750975, null));
                        z22.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = o0Var.U1;
                        z22.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z22);
                        l41 z23 = l41.z(6, org.telegram.messenger.gd.M0(z19 ? 2131750981 : 2131750980, null));
                        z23.i = 1;
                        z23.L(o0Var.U1.leave);
                        arrayList4.add(z23);
                        if (z19) {
                            l41 z24 = l41.z(7, org.telegram.messenger.gd.M0(2131750979, null));
                            z24.i = 1;
                            z24.L(o0Var.U1.edit_rank);
                            arrayList4.add(z24);
                        }
                    }
                    l41 A2 = l41.A(o0Var.e1(1), org.telegram.messenger.gd.M0(z19 ? 2131750971 : 2131750972, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = o0Var.U1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !o0Var.a2;
                    A2.E = new ci.q(o0Var, 1, 11);
                    arrayList4.add(A2);
                    if (o0Var.a2) {
                        l41 z25 = l41.z(9, org.telegram.messenger.gd.M0(z19 ? 2131750984 : 2131750987, null));
                        z25.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = o0Var.U1;
                        z25.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z25);
                        str2 = null;
                        l41 z26 = l41.z(10, org.telegram.messenger.gd.M0(2131750983, null));
                        z26.i = 1;
                        z26.L(o0Var.U1.invites);
                        arrayList4.add(z26);
                        l41 z27 = l41.z(11, org.telegram.messenger.gd.M0(2131750988, null));
                        z27.i = 1;
                        z27.L(o0Var.U1.group_call);
                        arrayList4.add(z27);
                    } else {
                        str2 = null;
                    }
                    l41 A3 = l41.A(o0Var.e1(2), org.telegram.messenger.gd.M0(2131750969, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = o0Var.U1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !o0Var.b2;
                    A3.E = new ci.q(o0Var, 2, 11);
                    arrayList4.add(A3);
                    if (o0Var.b2) {
                        str3 = null;
                        l41 z28 = l41.z(13, org.telegram.messenger.gd.M0(2131750986, null));
                        z28.i = 1;
                        z28.L(o0Var.U1.delete);
                        arrayList4.add(z28);
                        l41 z29 = l41.z(14, org.telegram.messenger.gd.M0(2131750985, null));
                        z29.i = 1;
                        z29.L(o0Var.U1.edit);
                        arrayList4.add(z29);
                        l41 z30 = l41.z(15, org.telegram.messenger.gd.M0(2131750974, null));
                        z30.i = 1;
                        z30.L(o0Var.U1.pinned);
                        arrayList4.add(z30);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(l41.C(str3));
                    arrayList4.add(l41.u(org.telegram.messenger.gd.M0(2131750990, str3)));
                    l41 z31 = l41.z(16, org.telegram.messenger.gd.M0(2131750989, str3));
                    a0.h hVar = o0Var.W1;
                    int m11 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = o0Var.V1;
                    z31.L(m11 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z31);
                    if (o0Var.V1 != null) {
                        for (int i18 = 0; i18 < o0Var.V1.size(); i18++) {
                            long o10 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) o0Var.V1.get(i18)).peer);
                            TLRPC.User c23 = org.telegram.messenger.mp.u1(o0Var.a).c2(Long.valueOf(o10));
                            l41 l41Var2 = new l41(37);
                            l41Var2.d = (-1) - i18;
                            l41Var2.H = c23;
                            l41Var2.i = 1;
                            a0.h hVar2 = o0Var.W1;
                            l41Var2.L(hVar2 != null && hVar2.d(o10));
                            arrayList4.add(l41Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                bi.m6 m6Var = (bi.m6) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null) {
                    m6Var.a(org.telegram.messenger.fj.h0(tL_textWithEntities, false), null);
                    break;
                } else {
                    if (tL_error == null) {
                        tL_error = new TLRPC.TL_error();
                    }
                    m6Var.a(null, tL_error);
                    break;
                }
            case 5:
                ((ChatActivityEnterView) obj3).s0((Canvas) obj, (org.telegram.messenger.p10) obj2);
                break;
            case 6:
                cj cjVar = (cj) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                int i19 = cjVar.Q;
                ArrayList arrayList7 = cjVar.N;
                org.telegram.messenger.gp gpVar = cjVar.K;
                ArrayList arrayList8 = cjVar.L;
                HashSet hashSet = cjVar.J;
                ArrayList arrayList9 = cjVar.M;
                arrayList6.add(l41.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(cjVar.E)) {
                    z41Var3.V();
                    for (int i20 = 0; i20 < cjVar.I.size(); i20++) {
                        org.telegram.messenger.ve veVar2 = (org.telegram.messenger.ve) cjVar.I.get(i20);
                        veVar2.e.K5(null, true);
                        l41 i21 = org.telegram.ui.Cells.f7.i(veVar2, new ui(cjVar, i15));
                        i21.L(hashSet.contains(veVar2));
                        i21.d = -1;
                        arrayList6.add(i21);
                    }
                    if (cjVar.H) {
                        arrayList6.add(l41.q(11, 4));
                        arrayList6.add(l41.q(12, 4));
                        arrayList6.add(l41.q(13, 4));
                    }
                    z41Var3.U();
                    if (gpVar != null) {
                        ArrayList arrayList10 = gpVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        int i22 = 0;
                        while (i22 < size2) {
                            boolean z32 = z12;
                            if (i22 >= arrayList8.size()) {
                                veVar = new org.telegram.messenger.ve();
                                arrayList8.add(veVar);
                            } else {
                                veVar = (org.telegram.messenger.ve) arrayList8.get(i22);
                            }
                            if (veVar.e != arrayList10.get(i22)) {
                                cjVar.m0--;
                                veVar.e = (org.telegram.messenger.fj) arrayList10.get(i22);
                            }
                            i22++;
                            z12 = z32;
                        }
                    }
                    boolean z33 = z12;
                    if (gpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(l41.B(-98, null));
                        }
                        z41Var3.V();
                        arrayList6.add(l41.t(45, org.telegram.messenger.gd.M0(2131753902, null)));
                        for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                            org.telegram.messenger.ve veVar3 = (org.telegram.messenger.ve) arrayList8.get(i23);
                            l41 i24 = org.telegram.ui.Cells.f7.i(veVar3, new ui(cjVar, 0));
                            i24.L(hashSet.contains(veVar3));
                            arrayList6.add(i24);
                        }
                        if (gpVar.f) {
                            arrayList6.add(l41.q(41, 4));
                            arrayList6.add(l41.q(42, 4));
                            arrayList6.add(l41.q(43, 4));
                        }
                        if (!gpVar.f && !gpVar.e) {
                            l41 c10 = l41.c(cjVar.S, R.drawable.arrow_more, org.telegram.messenger.gd.M0(2131745144, null));
                            c10.r = z33;
                            arrayList6.add(c10);
                        }
                        z41Var3.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || cjVar.V >= 0 || cjVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(l41.B(-98, null));
                        }
                        z41Var3.V();
                        arrayList6.add(l41.t(((cjVar.V >= 0 || cjVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.gd.M0(2131753905, null)));
                        for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                            org.telegram.messenger.ve veVar4 = (org.telegram.messenger.ve) arrayList9.get(i25);
                            veVar4.e.K5(cjVar.E, true);
                            l41 i26 = org.telegram.ui.Cells.f7.i(veVar4, new ui(cjVar, 0));
                            i26.L(hashSet.contains(veVar4));
                            arrayList6.add(i26);
                        }
                        if (cjVar.V >= 0 || cjVar.a0) {
                            arrayList6.add(l41.q(21, 4));
                            arrayList6.add(l41.q(22, 4));
                            arrayList6.add(l41.q(23, 4));
                        }
                        if (cjVar.d0) {
                            l41 c11 = l41.c(i19, R.drawable.arrow_more, org.telegram.messenger.gd.M0(2131745144, null));
                            c11.r = true;
                            arrayList6.add(c11);
                        }
                        z41Var3.U();
                    }
                } else {
                    String lowerCase = cjVar.E.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    boolean z34 = false;
                    for (int i27 = 0; i27 < cjVar.I.size(); i27++) {
                        org.telegram.messenger.ve veVar5 = (org.telegram.messenger.ve) cjVar.I.get(i27);
                        String str7 = veVar5.a;
                        if (str7 != null) {
                            String lowerCase2 = str7.toLowerCase();
                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase2) || M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                z11 = true;
                                str4 = veVar5.b;
                                if (str4 != null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                    z11 = z11 || lowerCase3.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase3) || M33.startsWith(M3) || M33.contains(" ".concat(M3));
                                }
                                if (z11) {
                                    if (!z34) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(l41.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        z41Var3.V();
                                        arrayList6.add(l41.t(10, org.telegram.messenger.gd.M0(2131753903, str5)));
                                        z34 = true;
                                    }
                                    veVar5.e.K5(cjVar.E, true);
                                    l41 i28 = org.telegram.ui.Cells.f7.i(veVar5, new ui(cjVar, 0));
                                    i28.L(hashSet.contains(veVar5));
                                    i28.d = 10;
                                    arrayList6.add(i28);
                                }
                            }
                        }
                        z11 = false;
                        str4 = veVar5.b;
                        if (str4 != null) {
                        }
                        if (z11) {
                        }
                    }
                    z41Var3.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || cjVar.V >= 0 || cjVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(l41.B(-98, null));
                        }
                        z41Var3.V();
                        arrayList6.add(l41.t(((cjVar.V >= 0 || cjVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.gd.M0(2131753905, null)));
                        for (int i29 = 0; i29 < arrayList9.size(); i29++) {
                            org.telegram.messenger.ve veVar6 = (org.telegram.messenger.ve) arrayList9.get(i29);
                            veVar6.e.K5(cjVar.E, true);
                            l41 i30 = org.telegram.ui.Cells.f7.i(veVar6, new ui(cjVar, 0));
                            i30.L(hashSet.contains(veVar6));
                            arrayList6.add(i30);
                        }
                        if (cjVar.V >= 0 || cjVar.a0) {
                            arrayList6.add(l41.q(21, 4));
                            arrayList6.add(l41.q(22, 4));
                            arrayList6.add(l41.q(23, 4));
                        }
                        if (cjVar.d0) {
                            l41 c12 = l41.c(i19, R.drawable.arrow_more, org.telegram.messenger.gd.M0(2131745144, null));
                            c12.r = true;
                            arrayList6.add(c12);
                        }
                        z41Var3.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || cjVar.e0 >= 0 || cjVar.n0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(l41.B(-96, null));
                        }
                        z41Var3.V();
                        arrayList6.add(l41.t(((cjVar.e0 >= 0 || cjVar.n0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.gd.M0(2131753904, null)));
                        int size3 = arrayList7.size();
                        for (int i31 = 0; i31 < size3; i31++) {
                            org.telegram.messenger.ve veVar7 = (org.telegram.messenger.ve) arrayList7.get(i31);
                            veVar7.e.K5(cjVar.E, true);
                            l41 i32 = org.telegram.ui.Cells.f7.i(veVar7, new ui(cjVar, 0));
                            i32.L(hashSet.contains(veVar7));
                            arrayList6.add(i32);
                        }
                        if (cjVar.e0 >= 0 || cjVar.n0) {
                            arrayList6.add(l41.q(31, 4));
                            arrayList6.add(l41.q(32, 4));
                            arrayList6.add(l41.q(33, 4));
                        }
                        if (cjVar.h0) {
                            l41 c13 = l41.c(cjVar.R, R.drawable.arrow_more, org.telegram.messenger.gd.M0(2131745144, null));
                            c13.r = true;
                            arrayList6.add(c13);
                        }
                        z41Var3.U();
                    }
                }
                if (arrayList6.size() > size || cjVar.H) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(cjVar.E)) {
                    charSequence = null;
                    arrayList6.add(aj.i(org.telegram.messenger.gd.M0(2131748052, null), org.telegram.messenger.gd.M0(2131748053, null)));
                } else {
                    charSequence = null;
                    arrayList6.add(aj.i(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, cjVar.E.length() >= 3 ? 2131748049 : 2131748050, cjVar.E)), org.telegram.messenger.gd.M0(2131748051, null)));
                }
                arrayList6.add(l41.B(-99, charSequence));
                break;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z35 = ChatAttachAlertPhotoLayout.r1;
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
                ((ArrayList) obj).add(l41.j(-1, ((x20) obj3).U1));
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
                ((b51) obj3).Z((ArrayList) obj, (z41) obj2);
                break;
        }
    }
}
