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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        tq tqVar = (tq) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (tqVar.Y1 == null) {
            Context context = tqVar.getContext();
            org.telegram.ui.ActionBar.g6 g6Var = tqVar.I0;
            bi.t tVar = new bi.t(context, 7);
            tVar.setOrientation(1);
            dh0 dh0Var = new dh0(context);
            dh0Var.setAutoRepeat(true);
            dh0Var.f(R.raw.utyan_streaming, org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, null);
            dh0Var.d();
            tVar.addView(dh0Var, c8.ha.t(org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131744438, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
            tVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.j5, g6Var);
            textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743236, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            tVar.addView(textView2, c8.ha.t(-2, -2, 1, 28, 0, 28, 17));
            tqVar.Y1 = tVar;
        }
        arrayList.add(y31.k(tqVar.Y1));
        arrayList.add(y31.C(null));
        arrayList.add(y31.u(org.telegram.messenger.id.M0(2131743431, null)));
        String str2 = tqVar.T1;
        String M0 = org.telegram.messenger.id.M0(2131743432, null);
        int i7 = sq.b;
        y31 K = y31.K(sq.class);
        K.l = str2;
        K.n = M0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = tqVar.V1;
        String M02 = org.telegram.messenger.id.M0(2131743433, null);
        y31 K2 = y31.K(sq.class);
        K2.l = spannableStringBuilder;
        K2.n = M02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (tqVar.X1) {
            str = org.telegram.messenger.id.M0(tqVar.P1 ? 2131743428 : 2131743429, null);
        }
        arrayList.add(y31.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z9;
        final vr vrVar = (vr) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = vrVar.P;
        s2 s2Var = vrVar.j0;
        ArrayList arrayList2 = vrVar.V;
        ur urVar = vrVar.S;
        boolean z10 = vrVar.R;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(vrVar.g0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(vrVar.T);
            arrayList3.addAll(vrVar.U);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z10) {
                    arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745822, null)));
                } else {
                    arrayList.add(y31.s(org.telegram.messenger.id.M0(2131745822, null), org.telegram.messenger.id.M0(vrVar.X ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.sr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    vr vrVar2 = vrVar;
                                    vrVar2.X = !vrVar2.X;
                                    vrVar2.O(true);
                                    break;
                                default:
                                    vr vrVar3 = vrVar;
                                    vrVar3.W = !vrVar3.W;
                                    vrVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!vrVar.X && !arrayList2.isEmpty() && !z10) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    y31 w10 = y31.w((TLObject) arrayList3.get(i12));
                    w10.t = true;
                    w10.H = s2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z10) {
                return;
            }
            arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745756, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                y31 y31Var = new y31(33);
                y31Var.G = (org.telegram.messenger.ij) obj3;
                arrayList.add(y31Var);
            }
            if (vrVar.d0) {
                arrayList.add(y31.p(1));
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.ui.b0(i7).l1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList4.get(i13)).peer)));
                if (a22 != null && a22.bot) {
                    arrayList5.add(a22);
                }
            }
        }
        vrVar.Z = arrayList.size();
        if (!arrayList5.isEmpty() && !z10) {
            if (arrayList5.size() > 5) {
                arrayList.add(y31.s(org.telegram.messenger.id.M0(2131745820, null), org.telegram.messenger.id.M0(vrVar.W ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.sr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                vr vrVar2 = vrVar;
                                vrVar2.X = !vrVar2.X;
                                vrVar2.O(true);
                                break;
                            default:
                                vr vrVar3 = vrVar;
                                vrVar3.W = !vrVar3.W;
                                vrVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745820, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || vrVar.W); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    y31 w11 = y31.w(user);
                    w11.q = true;
                    w11.t = true;
                    w11.H = s2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        vrVar.a0 = arrayList.size();
        ArrayList arrayList6 = urVar.h;
        if (arrayList6.isEmpty()) {
            if (urVar.c || !urVar.e) {
                if (!z10) {
                    arrayList.add(y31.p(30));
                }
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
            }
            z9 = false;
        } else {
            if (!z10) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745819, null)));
            }
            boolean z11 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    y31 w12 = y31.w(user2);
                    w12.q = true;
                    w12.r = true;
                    w12.t = true;
                    w12.H = s2Var;
                    arrayList.add(w12);
                    z11 = true;
                }
            }
            if (urVar.c || !urVar.e) {
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
            }
            z9 = z11;
        }
        if (z9) {
            arrayList.add(y31.C(vrVar.Y));
        }
    }

    private final void d(Object obj, Object obj2) {
        final bm0 bm0Var = (bm0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = bm0Var.R;
        ArrayList arrayList3 = bm0Var.X;
        int i7 = bm0Var.P;
        final int i10 = 0;
        if (TextUtils.isEmpty(bm0Var.d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(y31.s(org.telegram.messenger.id.M0(2131745739, null), org.telegram.messenger.id.M0(bm0Var.W ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.wr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    bm0 bm0Var2 = bm0Var;
                                    bm0Var2.W = !bm0Var2.W;
                                    bm0Var2.O(true);
                                    if (bm0Var2.W) {
                                        org.telegram.messenger.g0.v1(bm0Var2.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    bm0 bm0Var3 = bm0Var;
                                    bm0Var3.V = !bm0Var3.V;
                                    bm0Var3.O(true);
                                    if (bm0Var3.V) {
                                        org.telegram.messenger.g0.v1(bm0Var3.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745739, null)));
                }
                int size = arrayList3.size();
                if (!bm0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    y31 w10 = y31.w((TLObject) arrayList3.get(i11));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.qp.s1(i7).Y7;
            org.telegram.messenger.ro roVar = hashMap == null ? null : (org.telegram.messenger.ro) hashMap.get(0L);
            if (roVar == null) {
                arrayList.add(y31.p(30));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = roVar.b;
            int size2 = arrayList5.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList5.get(i12);
                i12++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(chat.id));
                    if (org.telegram.messenger.t3.r0(chat) && (M0 == null || org.telegram.messenger.t3.r0(M0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745711, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(y31.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = bm0Var.S;
        int size4 = arrayList7.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList7.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i14 = size4;
            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(chat2.id));
            if (org.telegram.messenger.t3.r0(chat2) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                arrayList6.add(chat2);
            }
            size4 = i14;
        }
        ArrayList arrayList8 = bm0Var.T;
        int size5 = arrayList8.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj6 = arrayList8.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(chat3.id));
            if (org.telegram.messenger.t3.r0(chat3) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = bm0Var.U;
        int size6 = arrayList9.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj7 = arrayList9.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(chat4.id));
            if (org.telegram.messenger.t3.r0(chat4) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745814, null)));
            } else {
                final int i17 = 1;
                arrayList.add(y31.s(org.telegram.messenger.id.M0(2131745814, null), org.telegram.messenger.id.M0(bm0Var.V ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.wr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                bm0 bm0Var2 = bm0Var;
                                bm0Var2.W = !bm0Var2.W;
                                bm0Var2.O(true);
                                if (bm0Var2.W) {
                                    org.telegram.messenger.g0.v1(bm0Var2.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                bm0 bm0Var3 = bm0Var;
                                bm0Var3.V = !bm0Var3.V;
                                bm0Var3.O(true);
                                if (bm0Var3.V) {
                                    org.telegram.messenger.g0.v1(bm0Var3.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!bm0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(y31.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745756, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            y31 y31Var = new y31(33);
            y31Var.G = (org.telegram.messenger.ij) obj8;
            arrayList.add(y31Var);
        }
        if (bm0Var.a0) {
            arrayList.add(y31.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        hy hyVar = (hy) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        qx qxVar = hyVar.R1;
        if (qxVar == null || !(qxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            return;
        }
        org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) hyVar.R1.getDrawable();
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (f4Var.c.a != intValue) {
            org.telegram.messenger.g4 g4Var = f4Var.g;
            if (g4Var != null) {
                f4Var.c = g4Var;
            }
            org.telegram.messenger.g4 g4Var2 = f4Var.c;
            if (g4Var2.a != intValue) {
                g4Var2 = new org.telegram.messenger.g4(intValue, g4Var2.b);
            }
            f4Var.g = g4Var2;
            w5 w5Var = f4Var.e;
            if (w5Var != null) {
                w5Var.e(true, 0.0f);
            }
        }
        if (f4Var.d.a != intValue2) {
            org.telegram.messenger.g4 g4Var3 = f4Var.h;
            if (g4Var3 != null) {
                f4Var.d = g4Var3;
            }
            org.telegram.messenger.g4 g4Var4 = f4Var.d;
            if (g4Var4.a != intValue2) {
                g4Var4 = new org.telegram.messenger.g4(intValue2, g4Var4.b);
            }
            f4Var.h = g4Var4;
            w5 w5Var2 = f4Var.f;
            if (w5Var2 != null) {
                w5Var2.e(true, 0.0f);
            }
        }
        f4Var.invalidateSelf();
        String str = (String) hyVar.R1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            org.telegram.messenger.i6.j.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? (String) org.telegram.messenger.h4.a.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? (String) org.telegram.messenger.h4.a.get(num2.intValue()) : "");
            org.telegram.messenger.i6.j.put(str, sb2.toString());
        }
        org.telegram.messenger.i6.q();
    }

    private final void f(Object obj, Object obj2) {
        cy cyVar = (cy) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = cyVar.E;
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
                boolean z9 = tL_messages_stickerSet.set.id == cyVar.d;
                int i10 = jx.b;
                y31 K = y31.K(jx.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.e = z9;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = cyVar.J;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            zw zwVar = (zw) obj4;
            TLRPC.StickerSet stickerSet = zwVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(jx.i(zwVar.a, zwVar, stickerSet.id == cyVar.d));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z9 = fragmentContextView.W;
        org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        v0Var.getClass();
        B.m0(z9, (floatValue * 2.8f) + 0.2f);
    }

    private final void h(Object obj, Object obj2) {
        ((ArrayList) obj).add(y31.j(-1, ((n20) this.b).Q1));
    }

    private final void i(Object obj, Object obj2) {
        u20 u20Var = (u20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        u20Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.oa.a(u20Var.a).f);
        if (u20Var.c.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < u20Var.c.size(); i7++) {
            String str = (String) u20Var.c.get(i7);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(y31.c(i7 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(y31.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.id.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        di.l6 l6Var;
        v20 v20Var = (v20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = v20Var.Q;
        int i7 = 0;
        boolean z9 = v20Var.R && (l6Var = v20Var.S) != null && l6Var.i.size() > 0;
        if (z9) {
            di.l6 l6Var2 = v20Var.S;
            int i10 = jg.k1.b;
            y31 K = y31.K(jg.k1.class);
            K.G = l6Var2;
            arrayList.add(K);
        }
        v20Var.T = z9;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i7);
            y31 y31Var = new y31(33);
            y31Var.d = i11;
            y31Var.G = ijVar;
            arrayList.add(y31Var);
            i7 = i11;
        }
        if (v20Var.U || !v20Var.X) {
            arrayList.add(y31.q(-2, 1));
            arrayList.add(y31.q(-3, 1));
            arrayList.add(y31.q(-4, 1));
        }
        if (v20Var.T || !z9) {
            return;
        }
        org.telegram.messenger.g0.h3(new gp(v20Var, 19));
    }

    private final void k(Object obj, Object obj2) {
        j60 j60Var = (j60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        l60 l60Var = j60Var.y;
        l60Var.f.setAlpha(1.0f);
        if (l60Var.u) {
            j60Var.c = bitmap;
        }
        ri.b bVar = l60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(l60Var.n, j60Var);
            ViewGroup viewGroup = l60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        af0 af0Var = (af0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = af0Var.e;
        ArrayList arrayList3 = af0Var.n;
        int i7 = 0;
        if (af0Var.d == null) {
            arrayList.add(y31.q(-1, 7));
            arrayList.add(y31.q(-2, 7));
            arrayList.add(y31.q(-3, 7));
            af0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(af0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745722, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                y31 y31Var = new y31(33);
                y31Var.G = (org.telegram.messenger.ij) obj3;
                arrayList.add(y31Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745723, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                y31 y31Var2 = new y31(33);
                y31Var2.G = (org.telegram.messenger.ij) obj4;
                arrayList.add(y31Var2);
            }
        }
        if (af0Var.w || ((af0Var.M && !af0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !af0Var.s))) {
            arrayList.add(y31.q(af0Var.L * 3, 7));
            arrayList.add(y31.q((af0Var.L * 3) + 1, 7));
            arrayList.add(y31.q((af0Var.L * 3) + 2, 7));
        }
        af0Var.Q = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        kk0 kk0Var = (kk0) this.b;
        kk0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        kk0Var.e = paint;
        Bitmap bitmap = kk0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        kk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        kk0Var.f = new Matrix();
        ri.b bVar = kk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, kk0Var.s);
        ViewGroup viewGroup = kk0Var.D;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        zv0 zv0Var = (zv0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        zv0Var.n1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ui.Z(zv0Var.J1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_stickers_renameStickerSet, new x1((org.telegram.messenger.c20) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        l21 l21Var = (l21) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        w11 w11Var = l21Var.v1;
        k21 k21Var = l21Var.E1;
        if (str != null) {
            l21Var.L1 = false;
            l21Var.w1.setText(l21Var.Q0(str));
            k21Var.D(w11Var);
        } else {
            if (l21Var.I) {
                return;
            }
            if (l21Var.L1) {
                l21Var.dismiss();
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.P4, 1, org.telegram.messenger.id.M0(bool.booleanValue() ? 2131743947 : 2131743946, null));
                return;
            }
            org.telegram.messenger.k5.p(null, bool.booleanValue() ? 2131743947 : 2131743946, new hc((FrameLayout) l21Var.b, l21Var.I0), null);
            h21 h21Var = l21Var.t1.e;
            String str2 = l21Var.s1;
            l21Var.r1 = str2;
            h21Var.setText(l21.O0(str2, null, null));
            k21Var.D(w11Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0379  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        y31 i7;
        TL_iv.RichMessage richMessage;
        y31 i10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        y31 i11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        int i12;
        boolean z9;
        String a02;
        String str2;
        String str3;
        boolean z10;
        String str4;
        m41 m41Var;
        String str5;
        CharSequence charSequence;
        String str6;
        org.telegram.messenger.xe xeVar;
        int i13;
        int i14 = this.a;
        Object obj3 = this.b;
        boolean z11 = true;
        switch (i14) {
            case 0:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var2 = (m41) obj2;
                boolean[] zArr = g0Var.h2;
                boolean[] zArr2 = g0Var.i2;
                f0 f0Var = g0Var.p2;
                arrayList.add(y31.C(null));
                arrayList.add(y31.m(g0Var.n2));
                arrayList.add(y31.C(null));
                m41Var2.F = 1;
                m41Var2.V();
                f0 f0Var2 = g0Var.o2;
                int selectedTab = f0Var2 != null ? f0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = g0Var.j2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(q21.j(3, org.telegram.messenger.id.M0(2131754986, null), null, null, null));
                    } else {
                        String O0 = l21.O0(g0Var.j2, null, zArr2);
                        String M0 = org.telegram.messenger.id.M0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            O0 = l21.K0(O0);
                        }
                        arrayList.add(q21.j(3, substring2, O0, substring3, null));
                    }
                    arrayList.add(g0Var.n1() ? g0Var.o1(4, g0Var.Q1, false) : u21.i(4, g0Var.P1, g0Var.H2, new c(g0Var, 4), null, null));
                    String O02 = l21.O0(g0Var.k2, zArr, null);
                    String M02 = org.telegram.messenger.id.M0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
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
                        O02 = l21.K0(O02);
                    }
                    arrayList.add(q21.i(5, str, rf.b.r(O02, ""), substring, new c(g0Var, 5), g0Var.l2, new c(g0Var, 6), null));
                    if (g0Var.n1()) {
                        boolean z12 = g0Var.R1;
                        if (z12 || (richMessage3 = g0Var.T1) == null) {
                            richMessage3 = g0Var.Q1;
                        }
                        i11 = g0Var.o1(6, richMessage3, z12);
                    } else {
                        boolean z13 = g0Var.R1;
                        i11 = u21.i(z13 ? 7 : 6, g0Var.S1, false, null, null, !z13 ? new c(g0Var, 7) : null);
                    }
                    arrayList.add(i11);
                } else if (selectedTab == 1) {
                    arrayList.add(y31.k(f0Var));
                    if (f0Var.getSelectedTone() instanceof b0) {
                        arrayList.add(y31.j(10, g0Var.r2));
                        m41Var2.U();
                        arrayList.add(y31.B(11, null));
                        m41Var2.V();
                    }
                    if ((f0Var.getSelectedTab() >= 0 || g0Var.l2) && (!(f0Var.getSelectedTone() instanceof b0) || TextUtils.equals(g0Var.s2.getText().toString(), g0Var.A2))) {
                        arrayList.add(q21.i(7, org.telegram.messenger.id.M0(2131754984, null), null, null, null, g0Var.l2, new c(g0Var, 6), null));
                        if (g0Var.n1()) {
                            boolean z14 = g0Var.U1;
                            if (z14 || (richMessage2 = g0Var.W1) == null) {
                                richMessage2 = g0Var.Q1;
                            }
                            i10 = g0Var.o1(8, richMessage2, z14);
                        } else {
                            boolean z15 = g0Var.U1;
                            i10 = u21.i(z15 ? 7 : 6, g0Var.V1, false, null, null, !z15 ? new c(g0Var, 7) : null);
                        }
                        arrayList.add(i10);
                    } else {
                        arrayList.add(q21.i(5, org.telegram.messenger.id.M0(2131754987, null), null, null, null, g0Var.l2, new c(g0Var, 6), null));
                        arrayList.add(g0Var.n1() ? g0Var.o1(6, g0Var.Q1, false) : u21.i(g0Var.U1 ? 7 : 6, g0Var.P1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(q21.j(3, org.telegram.messenger.id.M0(2131754987, null), null, null, null));
                    arrayList.add(g0Var.n1() ? g0Var.o1(4, g0Var.Q1, false) : u21.i(4, g0Var.P1, g0Var.H2, new c(g0Var, 4), null, null));
                    arrayList.add(q21.j(5, org.telegram.messenger.id.M0(2131754984, null), null, null, null));
                    if (g0Var.n1()) {
                        boolean z16 = g0Var.X1;
                        if (z16 || (richMessage = g0Var.Z1) == null) {
                            richMessage = g0Var.Q1;
                        }
                        i7 = g0Var.o1(6, richMessage, z16);
                    } else {
                        boolean z17 = g0Var.X1;
                        i7 = u21.i(z17 ? 7 : 6, g0Var.Y1, false, null, null, !z17 ? new c(g0Var, 7) : null);
                    }
                    arrayList.add(i7);
                }
                m41Var2.U();
                arrayList.add(y31.C(null));
                break;
            case 1:
                s sVar = (s) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                m41 m41Var3 = (m41) obj2;
                m41Var3.F = 1;
                arrayList2.add(y31.C(null));
                FrameLayout frameLayout = sVar.S1;
                y31 y31Var = new y31(-4);
                y31Var.c = frameLayout;
                y31Var.z = -1;
                y31Var.e = true;
                arrayList2.add(y31Var);
                arrayList2.add(y31.C(null));
                arrayList2.add(y31.m(sVar.T1));
                arrayList2.add(y31.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(y31.m(sVar.U1));
                arrayList2.add(y31.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = sVar.P1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = sVar.a2[sVar.Z1];
                    m41Var3.V();
                    arrayList2.add(q21.i(3, org.telegram.messenger.id.M0(2131755001, null), null, null, null, false, null, new p(sVar, 1)));
                    arrayList2.add(u21.i(4, aicomposetoneexample == null ? s.e1() : org.telegram.messenger.ij.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(q21.j(5, org.telegram.messenger.id.M0(2131755004, null), null, null, null));
                    arrayList2.add(u21.i(6, aicomposetoneexample == null ? s.e1() : org.telegram.messenger.ij.h0(aicomposetoneexample.to, false), false, null, null, null));
                    m41Var3.U();
                    TLRPC.User a22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.qp.s1(sVar.a).a2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String n10 = org.telegram.messenger.t10.n(a22);
                    if (a22 == null) {
                        int i15 = tL_aiComposeTone.installs_count;
                        if (i15 > 0) {
                            arrayList2.add(y31.C(org.telegram.messenger.id.G(i15, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.id.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(n10)) {
                            i12 = 1;
                            z9 = false;
                            a02 = org.telegram.messenger.id.a0(null, null, 2131754999, org.telegram.messenger.t10.p(a22));
                        } else {
                            i12 = 1;
                            z9 = false;
                            a02 = org.telegram.messenger.id.a0(null, null, 2131754999, rf.b.i("@", n10));
                        }
                        sb2.append(a02);
                        arrayList2.add(y31.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.l6.Uc, sVar.I0, new f(i12, sVar, tL_aiComposeTone), z9)));
                    }
                }
                arrayList2.add(y31.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                a0 a0Var = (a0) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(y31.C(null));
                arrayList3.add(y31.m(a0Var.P1));
                arrayList3.add(y31.C(null));
                arrayList3.add(y31.k(a0Var.S1));
                arrayList3.add(y31.C(null));
                arrayList3.add(y31.k(a0Var.T1));
                arrayList3.add(y31.C(null));
                if (a0Var.b2 != null) {
                    y31 e10 = y31.e(1, org.telegram.messenger.id.M0(2131754998, null));
                    e10.r = true;
                    arrayList3.add(e10);
                    arrayList3.add(y31.C(null));
                }
                arrayList3.add(y31.m(a0Var.U1));
                break;
            case 3:
                i0 i0Var = (i0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z18 = i0Var.T1;
                if (i0Var.Q1 != null) {
                    arrayList4.add(y31.C(null));
                    arrayList4.add(y31.u(org.telegram.messenger.id.M0(2131751002, null)));
                    y31 A = y31.A(i0Var.d1(0), org.telegram.messenger.id.M0(z18 ? 2131750981 : 2131750979, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.Q1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z18 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !i0Var.V1;
                    int i16 = 9;
                    A.D = new ai.v(i0Var, 0, i16);
                    arrayList4.add(A);
                    if (i0Var.V1) {
                        y31 z19 = y31.z(3, org.telegram.messenger.id.M0(2131750984, null));
                        z19.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.Q1;
                        z19.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z19);
                        if (z18) {
                            y31 z20 = y31.z(4, org.telegram.messenger.id.M0(2131750987, null));
                            z20.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = i0Var.Q1;
                            z20.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z20);
                        }
                        y31 z21 = y31.z(5, org.telegram.messenger.id.M0(z18 ? 2131750988 : 2131750986, null));
                        z21.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = i0Var.Q1;
                        z21.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z21);
                        y31 z22 = y31.z(6, org.telegram.messenger.id.M0(z18 ? 2131750992 : 2131750991, null));
                        z22.i = 1;
                        z22.L(i0Var.Q1.leave);
                        arrayList4.add(z22);
                        if (z18) {
                            y31 z23 = y31.z(7, org.telegram.messenger.id.M0(2131750990, null));
                            z23.i = 1;
                            z23.L(i0Var.Q1.edit_rank);
                            arrayList4.add(z23);
                        }
                    }
                    y31 A2 = y31.A(i0Var.d1(1), org.telegram.messenger.id.M0(z18 ? 2131750982 : 2131750983, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = i0Var.Q1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !i0Var.W1;
                    A2.D = new ai.v(i0Var, 1, i16);
                    arrayList4.add(A2);
                    if (i0Var.W1) {
                        y31 z24 = y31.z(9, org.telegram.messenger.id.M0(z18 ? 2131750995 : 2131750998, null));
                        z24.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = i0Var.Q1;
                        z24.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z24);
                        str2 = null;
                        y31 z25 = y31.z(10, org.telegram.messenger.id.M0(2131750994, null));
                        z25.i = 1;
                        z25.L(i0Var.Q1.invites);
                        arrayList4.add(z25);
                        y31 z26 = y31.z(11, org.telegram.messenger.id.M0(2131750999, null));
                        z26.i = 1;
                        z26.L(i0Var.Q1.group_call);
                        arrayList4.add(z26);
                    } else {
                        str2 = null;
                    }
                    y31 A3 = y31.A(i0Var.d1(2), org.telegram.messenger.id.M0(2131750980, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = i0Var.Q1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !i0Var.X1;
                    A3.D = new ai.v(i0Var, 2, i16);
                    arrayList4.add(A3);
                    if (i0Var.X1) {
                        str3 = null;
                        y31 z27 = y31.z(13, org.telegram.messenger.id.M0(2131750997, null));
                        z27.i = 1;
                        z27.L(i0Var.Q1.delete);
                        arrayList4.add(z27);
                        y31 z28 = y31.z(14, org.telegram.messenger.id.M0(2131750996, null));
                        z28.i = 1;
                        z28.L(i0Var.Q1.edit);
                        arrayList4.add(z28);
                        y31 z29 = y31.z(15, org.telegram.messenger.id.M0(2131750985, null));
                        z29.i = 1;
                        z29.L(i0Var.Q1.pinned);
                        arrayList4.add(z29);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(y31.C(str3));
                    arrayList4.add(y31.u(org.telegram.messenger.id.M0(2131751001, str3)));
                    y31 z30 = y31.z(16, org.telegram.messenger.id.M0(2131751000, str3));
                    a0.h hVar = i0Var.S1;
                    int m10 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = i0Var.R1;
                    z30.L(m10 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z30);
                    if (i0Var.R1 != null) {
                        for (int i17 = 0; i17 < i0Var.R1.size(); i17++) {
                            long o4 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) i0Var.R1.get(i17)).peer);
                            TLRPC.User a23 = org.telegram.messenger.qp.s1(i0Var.a).a2(Long.valueOf(o4));
                            y31 y31Var2 = new y31(37);
                            y31Var2.d = (-1) - i17;
                            y31Var2.G = a23;
                            y31Var2.i = 1;
                            a0.h hVar2 = i0Var.S1;
                            y31Var2.L(hVar2 != null && hVar2.d(o4));
                            arrayList4.add(y31Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((ChatActivityEnterView) obj3).c0((Canvas) obj, (org.telegram.messenger.u10) obj2);
                break;
            case 5:
                ni niVar = (ni) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                m41 m41Var4 = (m41) obj2;
                int i18 = niVar.P;
                ArrayList arrayList7 = niVar.M;
                org.telegram.messenger.kp kpVar = niVar.J;
                ArrayList arrayList8 = niVar.K;
                HashSet hashSet = niVar.I;
                ArrayList arrayList9 = niVar.L;
                arrayList6.add(y31.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(niVar.D)) {
                    m41Var4.V();
                    int i19 = 0;
                    while (i19 < niVar.H.size()) {
                        org.telegram.messenger.xe xeVar2 = (org.telegram.messenger.xe) niVar.H.get(i19);
                        xeVar2.e.K5(null, z11);
                        boolean z31 = z11;
                        y31 i20 = org.telegram.ui.Cells.f7.i(xeVar2, new fi(niVar, 0));
                        i20.L(hashSet.contains(xeVar2));
                        i20.d = -1;
                        arrayList6.add(i20);
                        i19++;
                        z11 = z31;
                    }
                    boolean z32 = z11;
                    if (niVar.G) {
                        arrayList6.add(y31.q(11, 4));
                        arrayList6.add(y31.q(12, 4));
                        arrayList6.add(y31.q(13, 4));
                    }
                    m41Var4.U();
                    if (kpVar != null) {
                        ArrayList arrayList10 = kpVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        for (int i21 = 0; i21 < size2; i21++) {
                            if (i21 >= arrayList8.size()) {
                                xeVar = new org.telegram.messenger.xe();
                                arrayList8.add(xeVar);
                            } else {
                                xeVar = (org.telegram.messenger.xe) arrayList8.get(i21);
                            }
                            if (xeVar.e != arrayList10.get(i21)) {
                                niVar.l0--;
                                xeVar.e = (org.telegram.messenger.ij) arrayList10.get(i21);
                            }
                        }
                    }
                    if (kpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(y31.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        m41Var4.V();
                        arrayList6.add(y31.t(45, org.telegram.messenger.id.M0(2131753904, str6)));
                        for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                            org.telegram.messenger.xe xeVar3 = (org.telegram.messenger.xe) arrayList8.get(i22);
                            y31 i23 = org.telegram.ui.Cells.f7.i(xeVar3, new fi(niVar, 0));
                            i23.L(hashSet.contains(xeVar3));
                            arrayList6.add(i23);
                        }
                        if (kpVar.f) {
                            arrayList6.add(y31.q(41, 4));
                            arrayList6.add(y31.q(42, 4));
                            arrayList6.add(y31.q(43, 4));
                        }
                        if (!kpVar.f && !kpVar.e) {
                            y31 c10 = y31.c(niVar.R, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c10.q = z32;
                            arrayList6.add(c10);
                        }
                        m41Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || niVar.U >= 0 || niVar.W)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(y31.B(-98, null));
                        }
                        m41Var4.V();
                        arrayList6.add(y31.t(((niVar.U >= 0 || niVar.W) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.id.M0(2131753907, null)));
                        for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                            org.telegram.messenger.xe xeVar4 = (org.telegram.messenger.xe) arrayList9.get(i24);
                            xeVar4.e.K5(niVar.D, true);
                            y31 i25 = org.telegram.ui.Cells.f7.i(xeVar4, new fi(niVar, 0));
                            i25.L(hashSet.contains(xeVar4));
                            arrayList6.add(i25);
                        }
                        if (niVar.U >= 0 || niVar.W) {
                            arrayList6.add(y31.q(21, 4));
                            arrayList6.add(y31.q(22, 4));
                            arrayList6.add(y31.q(23, 4));
                        }
                        if (niVar.c0) {
                            y31 c11 = y31.c(i18, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c11.q = true;
                            arrayList6.add(c11);
                        }
                        m41Var4.U();
                    }
                } else {
                    String lowerCase = niVar.D.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    int i26 = 0;
                    boolean z33 = false;
                    while (i26 < niVar.H.size()) {
                        org.telegram.messenger.xe xeVar5 = (org.telegram.messenger.xe) niVar.H.get(i26);
                        String str8 = xeVar5.a;
                        if (str8 != null) {
                            String lowerCase2 = str8.toLowerCase();
                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || jg.g.A(" ", lowerCase, lowerCase2) || O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                z10 = true;
                                str4 = xeVar5.b;
                                if (str4 == null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    boolean z34 = z10;
                                    String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                    z10 = z34 || lowerCase3.startsWith(lowerCase) || jg.g.A(" ", lowerCase, lowerCase3) || O33.startsWith(O3) || O33.contains(" ".concat(O3));
                                }
                                if (z10) {
                                    m41Var = m41Var4;
                                } else {
                                    if (!z33) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(y31.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        m41Var4.V();
                                        arrayList6.add(y31.t(10, org.telegram.messenger.id.M0(2131753905, str5)));
                                        z33 = true;
                                    }
                                    m41Var = m41Var4;
                                    xeVar5.e.K5(niVar.D, true);
                                    y31 i27 = org.telegram.ui.Cells.f7.i(xeVar5, new fi(niVar, 0));
                                    i27.L(hashSet.contains(xeVar5));
                                    i27.d = 10;
                                    arrayList6.add(i27);
                                }
                                i26++;
                                m41Var4 = m41Var;
                            }
                        }
                        z10 = false;
                        str4 = xeVar5.b;
                        if (str4 == null) {
                        }
                        if (z10) {
                        }
                        i26++;
                        m41Var4 = m41Var;
                    }
                    m41 m41Var5 = m41Var4;
                    m41Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || niVar.U >= 0 || niVar.W)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(y31.B(-98, null));
                        }
                        m41Var5.V();
                        arrayList6.add(y31.t(((niVar.U >= 0 || niVar.W) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.id.M0(2131753907, null)));
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            org.telegram.messenger.xe xeVar6 = (org.telegram.messenger.xe) arrayList9.get(i28);
                            xeVar6.e.K5(niVar.D, true);
                            y31 i29 = org.telegram.ui.Cells.f7.i(xeVar6, new fi(niVar, 0));
                            i29.L(hashSet.contains(xeVar6));
                            arrayList6.add(i29);
                        }
                        if (niVar.U >= 0 || niVar.W) {
                            arrayList6.add(y31.q(21, 4));
                            arrayList6.add(y31.q(22, 4));
                            arrayList6.add(y31.q(23, 4));
                        }
                        if (niVar.c0) {
                            y31 c12 = y31.c(i18, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c12.q = true;
                            arrayList6.add(c12);
                        }
                        m41Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || niVar.d0 >= 0 || niVar.m0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(y31.B(-96, null));
                        }
                        m41Var5.V();
                        arrayList6.add(y31.t(((niVar.d0 >= 0 || niVar.m0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.id.M0(2131753906, null)));
                        int size3 = arrayList7.size();
                        for (int i30 = 0; i30 < size3; i30++) {
                            org.telegram.messenger.xe xeVar7 = (org.telegram.messenger.xe) arrayList7.get(i30);
                            xeVar7.e.K5(niVar.D, true);
                            y31 i31 = org.telegram.ui.Cells.f7.i(xeVar7, new fi(niVar, 0));
                            i31.L(hashSet.contains(xeVar7));
                            arrayList6.add(i31);
                        }
                        if (niVar.d0 >= 0 || niVar.m0) {
                            arrayList6.add(y31.q(31, 4));
                            arrayList6.add(y31.q(32, 4));
                            arrayList6.add(y31.q(33, 4));
                        }
                        if (niVar.g0) {
                            y31 c13 = y31.c(niVar.Q, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c13.q = true;
                            arrayList6.add(c13);
                        }
                        m41Var5.U();
                    }
                }
                if (arrayList6.size() > size || niVar.G) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(niVar.D)) {
                    charSequence = null;
                    String M03 = org.telegram.messenger.id.M0(2131748245, null);
                    String M04 = org.telegram.messenger.id.M0(2131748244, null);
                    int i32 = li.b;
                    y31 K = y31.K(li.class);
                    K.l = M03;
                    K.m = M04;
                    arrayList6.add(K);
                } else {
                    charSequence = null;
                    String M05 = org.telegram.messenger.id.M0(2131748243, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, niVar.D.length() >= 3 ? 2131748241 : 2131748242, niVar.D));
                    int i33 = li.b;
                    y31 K2 = y31.K(li.class);
                    K2.l = M05;
                    K2.m = X2;
                    arrayList6.add(K2);
                }
                arrayList6.add(y31.B(-99, charSequence));
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
                hx hxVar = (hx) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = hxVar.s;
                int size4 = arrayList12.size();
                int i34 = 0;
                while (i34 < size4) {
                    Object obj4 = arrayList12.get(i34);
                    int i35 = i34 + 1;
                    zw zwVar = (zw) obj4;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zwVar.b;
                    if (tL_messages_stickerSet != null) {
                        boolean z36 = tL_messages_stickerSet.set.id == hxVar.d;
                        int i36 = jx.b;
                        y31 K3 = y31.K(jx.class);
                        long j3 = tL_messages_stickerSet.set.id;
                        i13 = i35;
                        K3.d = (int) (j3 ^ (j3 >>> 32));
                        K3.B = j3;
                        K3.G = tL_messages_stickerSet;
                        K3.e = z36;
                        arrayList11.add(K3);
                    } else {
                        i13 = i35;
                        TLRPC.StickerSetCovered stickerSetCovered = zwVar.a;
                        if (stickerSetCovered != null) {
                            arrayList11.add(jx.i(stickerSetCovered, zwVar, stickerSetCovered.set.id == hxVar.d));
                        }
                    }
                    i34 = i13;
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
                ((o41) obj3).Z((ArrayList) obj, (m41) obj2);
                break;
        }
    }
}
