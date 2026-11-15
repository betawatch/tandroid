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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ar arVar = (ar) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (arVar.c2 == null) {
            Context context = arVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = arVar.J0;
            ai.q2 q2Var = new ai.q2(context, 7);
            q2Var.setOrientation(1);
            fh0 fh0Var = new fh0(context);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_streaming, org.telegram.messenger.ns.x1, org.telegram.messenger.ns.x1, null);
            fh0Var.d();
            q2Var.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.x1, org.telegram.messenger.ns.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131744438, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
            q2Var.addView(textView, c8.ja.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.j5, e6Var);
            textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131743236, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            q2Var.addView(textView2, c8.ja.t(-2, -2, 1, 28, 0, 28, 17));
            arVar.c2 = q2Var;
        }
        arrayList.add(b41.k(arVar.c2));
        arrayList.add(b41.C(null));
        arrayList.add(b41.u(org.telegram.messenger.hd.M0(2131743431, null)));
        String str2 = arVar.X1;
        String M0 = org.telegram.messenger.hd.M0(2131743432, null);
        int i7 = zq.b;
        b41 K = b41.K(zq.class);
        K.l = str2;
        K.n = M0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = arVar.Z1;
        String M02 = org.telegram.messenger.hd.M0(2131743433, null);
        b41 K2 = b41.K(zq.class);
        K2.l = spannableStringBuilder;
        K2.n = M02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (arVar.b2) {
            str = org.telegram.messenger.hd.M0(arVar.T1 ? 2131743428 : 2131743429, null);
        }
        arrayList.add(b41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        final bs bsVar = (bs) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = bsVar.Q;
        q2 q2Var = bsVar.k0;
        ArrayList arrayList2 = bsVar.W;
        as asVar = bsVar.T;
        boolean z11 = bsVar.S;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(bsVar.h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(bsVar.U);
            arrayList3.addAll(bsVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z11) {
                    arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745822, null)));
                } else {
                    arrayList.add(b41.s(org.telegram.messenger.hd.M0(2131745822, null), org.telegram.messenger.hd.M0(bsVar.Y ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.yr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    bs bsVar2 = bsVar;
                                    bsVar2.Y = !bsVar2.Y;
                                    bsVar2.O(true);
                                    break;
                                default:
                                    bs bsVar3 = bsVar;
                                    bsVar3.X = !bsVar3.X;
                                    bsVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!bsVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    b41 w10 = b41.w((TLObject) arrayList3.get(i12));
                    w10.t = true;
                    w10.H = q2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z11) {
                return;
            }
            arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745756, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                b41 b41Var = new b41(33);
                b41Var.G = (org.telegram.messenger.gj) obj3;
                arrayList.add(b41Var);
            }
            if (bsVar.e0) {
                arrayList.add(b41.p(1));
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.si.b0(i7).m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList4.get(i13)).peer)));
                if (a22 != null && a22.bot) {
                    arrayList5.add(a22);
                }
            }
        }
        bsVar.a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                arrayList.add(b41.s(org.telegram.messenger.hd.M0(2131745820, null), org.telegram.messenger.hd.M0(bsVar.X ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.yr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                bs bsVar2 = bsVar;
                                bsVar2.Y = !bsVar2.Y;
                                bsVar2.O(true);
                                break;
                            default:
                                bs bsVar3 = bsVar;
                                bsVar3.X = !bsVar3.X;
                                bsVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745820, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || bsVar.X); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    b41 w11 = b41.w(user);
                    w11.q = true;
                    w11.t = true;
                    w11.H = q2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        bsVar.b0 = arrayList.size();
        ArrayList arrayList6 = asVar.h;
        if (arrayList6.isEmpty()) {
            if (asVar.c || !asVar.e) {
                if (!z11) {
                    arrayList.add(b41.p(30));
                }
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
            }
            z10 = false;
        } else {
            if (!z11) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745819, null)));
            }
            boolean z12 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    b41 w12 = b41.w(user2);
                    w12.q = true;
                    w12.r = true;
                    w12.t = true;
                    w12.H = q2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (asVar.c || !asVar.e) {
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
            }
            z10 = z12;
        }
        if (z10) {
            arrayList.add(b41.C(bsVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        final em0 em0Var = (em0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = em0Var.S;
        ArrayList arrayList3 = em0Var.Y;
        int i7 = em0Var.Q;
        final int i10 = 0;
        if (TextUtils.isEmpty(em0Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(b41.s(org.telegram.messenger.hd.M0(2131745739, null), org.telegram.messenger.hd.M0(em0Var.X ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.cs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    em0 em0Var2 = em0Var;
                                    em0Var2.X = !em0Var2.X;
                                    em0Var2.O(true);
                                    if (em0Var2.X) {
                                        org.telegram.messenger.g0.v1(em0Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    em0 em0Var3 = em0Var;
                                    em0Var3.W = !em0Var3.W;
                                    em0Var3.O(true);
                                    if (em0Var3.W) {
                                        org.telegram.messenger.g0.v1(em0Var3.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745739, null)));
                }
                int size = arrayList3.size();
                if (!em0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    b41 w10 = b41.w((TLObject) arrayList3.get(i11));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.np.s1(i7).Z7;
            org.telegram.messenger.oo ooVar = hashMap == null ? null : (org.telegram.messenger.oo) hashMap.get(0L);
            if (ooVar == null) {
                arrayList.add(b41.p(30));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
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
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(chat.id));
                    if (org.telegram.messenger.t3.r0(chat) && (M0 == null || org.telegram.messenger.t3.r0(M0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745711, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(b41.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = em0Var.T;
        int size4 = arrayList7.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList7.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i14 = size4;
            TLRPC.Chat M02 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(chat2.id));
            if (org.telegram.messenger.t3.r0(chat2) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                arrayList6.add(chat2);
            }
            size4 = i14;
        }
        ArrayList arrayList8 = em0Var.U;
        int size5 = arrayList8.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj6 = arrayList8.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M03 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(chat3.id));
            if (org.telegram.messenger.t3.r0(chat3) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = em0Var.V;
        int size6 = arrayList9.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj7 = arrayList9.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M04 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(chat4.id));
            if (org.telegram.messenger.t3.r0(chat4) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745814, null)));
            } else {
                final int i17 = 1;
                arrayList.add(b41.s(org.telegram.messenger.hd.M0(2131745814, null), org.telegram.messenger.hd.M0(em0Var.W ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.cs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                em0 em0Var2 = em0Var;
                                em0Var2.X = !em0Var2.X;
                                em0Var2.O(true);
                                if (em0Var2.X) {
                                    org.telegram.messenger.g0.v1(em0Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                em0 em0Var3 = em0Var;
                                em0Var3.W = !em0Var3.W;
                                em0Var3.O(true);
                                if (em0Var3.W) {
                                    org.telegram.messenger.g0.v1(em0Var3.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!em0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(b41.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745756, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            b41 b41Var = new b41(33);
            b41Var.G = (org.telegram.messenger.gj) obj8;
            arrayList.add(b41Var);
        }
        if (em0Var.b0) {
            arrayList.add(b41.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        ly lyVar = (ly) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ux uxVar = lyVar.S1;
        if (uxVar == null || !(uxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            return;
        }
        org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) lyVar.S1.getDrawable();
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
            u5 u5Var = f4Var.e;
            if (u5Var != null) {
                u5Var.e(true, 0.0f);
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
            u5 u5Var2 = f4Var.f;
            if (u5Var2 != null) {
                u5Var2.e(true, 0.0f);
            }
        }
        f4Var.invalidateSelf();
        String str = (String) lyVar.S1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            org.telegram.messenger.j6.j.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? (String) org.telegram.messenger.h4.a.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? (String) org.telegram.messenger.h4.a.get(num2.intValue()) : "");
            org.telegram.messenger.j6.j.put(str, sb2.toString());
        }
        org.telegram.messenger.j6.q();
    }

    private final void f(Object obj, Object obj2) {
        gy gyVar = (gy) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = gyVar.F;
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
                boolean z10 = tL_messages_stickerSet.set.id == gyVar.d;
                int i10 = nx.b;
                b41 K = b41.K(nx.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = gyVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            ex exVar = (ex) obj4;
            TLRPC.StickerSet stickerSet = exVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(nx.i(exVar.a, exVar, stickerSet.id == gyVar.d));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
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

    private final void h(Object obj, Object obj2) {
        ((ArrayList) obj).add(b41.j(-1, ((p20) this.b).U1));
    }

    private final void i(Object obj, Object obj2) {
        w20 w20Var = (w20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        w20Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.na.a(w20Var.a).f);
        if (w20Var.c.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < w20Var.c.size(); i7++) {
            String str = (String) w20Var.c.get(i7);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(b41.c(i7 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(b41.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.hd.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        fi.d6 d6Var;
        x20 x20Var = (x20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = x20Var.R;
        int i7 = 0;
        boolean z10 = x20Var.S && (d6Var = x20Var.T) != null && d6Var.i.size() > 0;
        if (z10) {
            fi.d6 d6Var2 = x20Var.T;
            int i10 = jg.j1.b;
            b41 K = b41.K(jg.j1.class);
            K.G = d6Var2;
            arrayList.add(K);
        }
        x20Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i7);
            b41 b41Var = new b41(33);
            b41Var.d = i11;
            b41Var.G = gjVar;
            arrayList.add(b41Var);
            i7 = i11;
        }
        if (x20Var.V || !x20Var.Y) {
            arrayList.add(b41.q(-2, 1));
            arrayList.add(b41.q(-3, 1));
            arrayList.add(b41.q(-4, 1));
        }
        if (x20Var.U || !z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new fo(x20Var, 21));
    }

    private final void k(Object obj, Object obj2) {
        k60 k60Var = (k60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        m60 m60Var = k60Var.y;
        m60Var.f.setAlpha(1.0f);
        if (m60Var.u) {
            k60Var.c = bitmap;
        }
        ui.b bVar = m60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(m60Var.n, k60Var);
            ViewGroup viewGroup = m60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        cf0 cf0Var = (cf0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = cf0Var.e;
        ArrayList arrayList3 = cf0Var.n;
        int i7 = 0;
        if (cf0Var.d == null) {
            arrayList.add(b41.q(-1, 7));
            arrayList.add(b41.q(-2, 7));
            arrayList.add(b41.q(-3, 7));
            cf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(cf0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745722, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                b41 b41Var = new b41(33);
                b41Var.G = (org.telegram.messenger.gj) obj3;
                arrayList.add(b41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745723, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                b41 b41Var2 = new b41(33);
                b41Var2.G = (org.telegram.messenger.gj) obj4;
                arrayList.add(b41Var2);
            }
        }
        if (cf0Var.w || ((cf0Var.N && !cf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !cf0Var.s))) {
            arrayList.add(b41.q(cf0Var.M * 3, 7));
            arrayList.add(b41.q((cf0Var.M * 3) + 1, 7));
            arrayList.add(b41.q((cf0Var.M * 3) + 2, 7));
        }
        cf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        ok0 ok0Var = (ok0) this.b;
        ok0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ok0Var.e = paint;
        Bitmap bitmap = ok0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ok0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ok0Var.f = new Matrix();
        ui.b bVar = ok0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, ok0Var.s);
        ViewGroup viewGroup = ok0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        bw0 bw0Var = (bw0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        bw0Var.r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.si.Z(bw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_stickers_renameStickerSet, new v1((org.telegram.messenger.z10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        p21 p21Var = (p21) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        a21 a21Var = p21Var.z1;
        o21 o21Var = p21Var.I1;
        if (str != null) {
            p21Var.P1 = false;
            p21Var.A1.setText(p21Var.R0(str));
            o21Var.D(a21Var);
        } else {
            if (p21Var.J) {
                return;
            }
            if (p21Var.P1) {
                p21Var.dismiss();
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.P4, 1, org.telegram.messenger.hd.M0(bool.booleanValue() ? 2131743947 : 2131743946, null));
                return;
            }
            org.telegram.messenger.k5.o(null, bool.booleanValue() ? 2131743947 : 2131743946, new cc((FrameLayout) p21Var.b, p21Var.J0), null);
            l21 l21Var = p21Var.x1.e;
            String str2 = p21Var.w1;
            p21Var.v1 = str2;
            l21Var.setText(p21.O0(str2, null, null));
            o21Var.D(a21Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0370  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        b41 i7;
        TL_iv.RichMessage richMessage;
        b41 i10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        b41 i11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String a02;
        String str2;
        String str3;
        boolean z11;
        String str4;
        p41 p41Var;
        String str5;
        CharSequence charSequence;
        String str6;
        org.telegram.messenger.we weVar;
        int i12 = this.a;
        Object obj3 = this.b;
        boolean z12 = true;
        switch (i12) {
            case 0:
                d0 d0Var = (d0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var2 = (p41) obj2;
                boolean[] zArr = d0Var.l2;
                boolean[] zArr2 = d0Var.m2;
                c0 c0Var = d0Var.t2;
                arrayList.add(b41.C(null));
                arrayList.add(b41.m(d0Var.r2));
                arrayList.add(b41.C(null));
                p41Var2.G = 1;
                p41Var2.V();
                c0 c0Var2 = d0Var.s2;
                int selectedTab = c0Var2 != null ? c0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = d0Var.n2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(u21.j(3, org.telegram.messenger.hd.M0(2131754986, null), null, null, null));
                    } else {
                        String O0 = p21.O0(d0Var.n2, null, zArr2);
                        String M0 = org.telegram.messenger.hd.M0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            O0 = p21.K0(O0);
                        }
                        arrayList.add(u21.j(3, substring2, O0, substring3, null));
                    }
                    arrayList.add(d0Var.n1() ? d0Var.o1(4, d0Var.U1, false) : y21.i(4, d0Var.T1, d0Var.L2, new c(d0Var, 4), null, null));
                    String O02 = p21.O0(d0Var.o2, zArr, null);
                    String M02 = org.telegram.messenger.hd.M0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
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
                        O02 = p21.K0(O02);
                    }
                    arrayList.add(u21.i(5, str, r.b.v(O02, ""), substring, new c(d0Var, 5), d0Var.p2, new c(d0Var, 6), null));
                    if (d0Var.n1()) {
                        boolean z13 = d0Var.V1;
                        if (z13 || (richMessage3 = d0Var.X1) == null) {
                            richMessage3 = d0Var.U1;
                        }
                        i11 = d0Var.o1(6, richMessage3, z13);
                    } else {
                        boolean z14 = d0Var.V1;
                        i11 = y21.i(z14 ? 7 : 6, d0Var.W1, false, null, null, !z14 ? new c(d0Var, 7) : null);
                    }
                    arrayList.add(i11);
                } else if (selectedTab == 1) {
                    arrayList.add(b41.k(c0Var));
                    if (c0Var.getSelectedTone() instanceof z) {
                        arrayList.add(b41.j(10, d0Var.v2));
                        p41Var2.U();
                        arrayList.add(b41.B(11, null));
                        p41Var2.V();
                    }
                    if ((c0Var.getSelectedTab() >= 0 || d0Var.p2) && (!(c0Var.getSelectedTone() instanceof z) || TextUtils.equals(d0Var.w2.getText().toString(), d0Var.E2))) {
                        arrayList.add(u21.i(7, org.telegram.messenger.hd.M0(2131754984, null), null, null, null, d0Var.p2, new c(d0Var, 6), null));
                        if (d0Var.n1()) {
                            boolean z15 = d0Var.Y1;
                            if (z15 || (richMessage2 = d0Var.a2) == null) {
                                richMessage2 = d0Var.U1;
                            }
                            i10 = d0Var.o1(8, richMessage2, z15);
                        } else {
                            boolean z16 = d0Var.Y1;
                            i10 = y21.i(z16 ? 7 : 6, d0Var.Z1, false, null, null, !z16 ? new c(d0Var, 7) : null);
                        }
                        arrayList.add(i10);
                    } else {
                        arrayList.add(u21.i(5, org.telegram.messenger.hd.M0(2131754987, null), null, null, null, d0Var.p2, new c(d0Var, 6), null));
                        arrayList.add(d0Var.n1() ? d0Var.o1(6, d0Var.U1, false) : y21.i(d0Var.Y1 ? 7 : 6, d0Var.T1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(u21.j(3, org.telegram.messenger.hd.M0(2131754987, null), null, null, null));
                    arrayList.add(d0Var.n1() ? d0Var.o1(4, d0Var.U1, false) : y21.i(4, d0Var.T1, d0Var.L2, new c(d0Var, 4), null, null));
                    arrayList.add(u21.j(5, org.telegram.messenger.hd.M0(2131754984, null), null, null, null));
                    if (d0Var.n1()) {
                        boolean z17 = d0Var.b2;
                        if (z17 || (richMessage = d0Var.d2) == null) {
                            richMessage = d0Var.U1;
                        }
                        i7 = d0Var.o1(6, richMessage, z17);
                    } else {
                        boolean z18 = d0Var.b2;
                        i7 = y21.i(z18 ? 7 : 6, d0Var.c2, false, null, null, !z18 ? new c(d0Var, 7) : null);
                    }
                    arrayList.add(i7);
                }
                p41Var2.U();
                arrayList.add(b41.C(null));
                break;
            case 1:
                q qVar = (q) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                p41 p41Var3 = (p41) obj2;
                p41Var3.G = 1;
                arrayList2.add(b41.C(null));
                FrameLayout frameLayout = qVar.W1;
                b41 b41Var = new b41(-4);
                b41Var.c = frameLayout;
                b41Var.z = -1;
                b41Var.e = true;
                arrayList2.add(b41Var);
                arrayList2.add(b41.C(null));
                arrayList2.add(b41.m(qVar.X1));
                arrayList2.add(b41.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(b41.m(qVar.Y1));
                arrayList2.add(b41.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = qVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.e2[qVar.d2];
                    p41Var3.V();
                    arrayList2.add(u21.i(3, org.telegram.messenger.hd.M0(2131755001, null), null, null, null, false, null, new n(qVar, 1)));
                    arrayList2.add(y21.i(4, aicomposetoneexample == null ? q.e1() : org.telegram.messenger.gj.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(u21.j(5, org.telegram.messenger.hd.M0(2131755004, null), null, null, null));
                    arrayList2.add(y21.i(6, aicomposetoneexample == null ? q.e1() : org.telegram.messenger.gj.h0(aicomposetoneexample.to, false), false, null, null, null));
                    p41Var3.U();
                    TLRPC.User a22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.np.s1(qVar.a).a2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String n10 = org.telegram.messenger.q10.n(a22);
                    if (a22 == null) {
                        int i13 = tL_aiComposeTone.installs_count;
                        if (i13 > 0) {
                            arrayList2.add(b41.C(org.telegram.messenger.hd.G(i13, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.hd.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(n10)) {
                            z10 = false;
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131754999, org.telegram.messenger.q10.p(a22));
                        } else {
                            z10 = false;
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131754999, r.b.k("@", n10));
                        }
                        sb2.append(a02);
                        arrayList2.add(b41.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.j6.Xc, qVar.J0, new org.telegram.ui.zg(20, qVar, tL_aiComposeTone), z10)));
                    }
                }
                arrayList2.add(b41.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(b41.C(null));
                arrayList3.add(b41.m(yVar.T1));
                arrayList3.add(b41.C(null));
                arrayList3.add(b41.k(yVar.W1));
                arrayList3.add(b41.C(null));
                arrayList3.add(b41.k(yVar.X1));
                arrayList3.add(b41.C(null));
                if (yVar.f2 != null) {
                    b41 e10 = b41.e(1, org.telegram.messenger.hd.M0(2131754998, null));
                    e10.r = true;
                    arrayList3.add(e10);
                    arrayList3.add(b41.C(null));
                }
                arrayList3.add(b41.m(yVar.Y1));
                break;
            case 3:
                f0 f0Var = (f0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z19 = f0Var.X1;
                if (f0Var.U1 != null) {
                    arrayList4.add(b41.C(null));
                    arrayList4.add(b41.u(org.telegram.messenger.hd.M0(2131751002, null)));
                    b41 A = b41.A(f0Var.d1(0), org.telegram.messenger.hd.M0(z19 ? 2131750981 : 2131750979, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = f0Var.U1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z19 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !f0Var.Z1;
                    int i14 = 9;
                    A.D = new ci.q(f0Var, 0, i14);
                    arrayList4.add(A);
                    if (f0Var.Z1) {
                        b41 z20 = b41.z(3, org.telegram.messenger.hd.M0(2131750984, null));
                        z20.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = f0Var.U1;
                        z20.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z20);
                        if (z19) {
                            b41 z21 = b41.z(4, org.telegram.messenger.hd.M0(2131750987, null));
                            z21.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = f0Var.U1;
                            z21.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z21);
                        }
                        b41 z22 = b41.z(5, org.telegram.messenger.hd.M0(z19 ? 2131750988 : 2131750986, null));
                        z22.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = f0Var.U1;
                        z22.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z22);
                        b41 z23 = b41.z(6, org.telegram.messenger.hd.M0(z19 ? 2131750992 : 2131750991, null));
                        z23.i = 1;
                        z23.L(f0Var.U1.leave);
                        arrayList4.add(z23);
                        if (z19) {
                            b41 z24 = b41.z(7, org.telegram.messenger.hd.M0(2131750990, null));
                            z24.i = 1;
                            z24.L(f0Var.U1.edit_rank);
                            arrayList4.add(z24);
                        }
                    }
                    b41 A2 = b41.A(f0Var.d1(1), org.telegram.messenger.hd.M0(z19 ? 2131750982 : 2131750983, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = f0Var.U1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !f0Var.a2;
                    A2.D = new ci.q(f0Var, 1, i14);
                    arrayList4.add(A2);
                    if (f0Var.a2) {
                        b41 z25 = b41.z(9, org.telegram.messenger.hd.M0(z19 ? 2131750995 : 2131750998, null));
                        z25.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = f0Var.U1;
                        z25.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z25);
                        str2 = null;
                        b41 z26 = b41.z(10, org.telegram.messenger.hd.M0(2131750994, null));
                        z26.i = 1;
                        z26.L(f0Var.U1.invites);
                        arrayList4.add(z26);
                        b41 z27 = b41.z(11, org.telegram.messenger.hd.M0(2131750999, null));
                        z27.i = 1;
                        z27.L(f0Var.U1.group_call);
                        arrayList4.add(z27);
                    } else {
                        str2 = null;
                    }
                    b41 A3 = b41.A(f0Var.d1(2), org.telegram.messenger.hd.M0(2131750980, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = f0Var.U1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !f0Var.b2;
                    A3.D = new ci.q(f0Var, 2, i14);
                    arrayList4.add(A3);
                    if (f0Var.b2) {
                        str3 = null;
                        b41 z28 = b41.z(13, org.telegram.messenger.hd.M0(2131750997, null));
                        z28.i = 1;
                        z28.L(f0Var.U1.delete);
                        arrayList4.add(z28);
                        b41 z29 = b41.z(14, org.telegram.messenger.hd.M0(2131750996, null));
                        z29.i = 1;
                        z29.L(f0Var.U1.edit);
                        arrayList4.add(z29);
                        b41 z30 = b41.z(15, org.telegram.messenger.hd.M0(2131750985, null));
                        z30.i = 1;
                        z30.L(f0Var.U1.pinned);
                        arrayList4.add(z30);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(b41.C(str3));
                    arrayList4.add(b41.u(org.telegram.messenger.hd.M0(2131751001, str3)));
                    b41 z31 = b41.z(16, org.telegram.messenger.hd.M0(2131751000, str3));
                    a0.h hVar = f0Var.W1;
                    int m10 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = f0Var.V1;
                    z31.L(m10 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z31);
                    if (f0Var.V1 != null) {
                        for (int i15 = 0; i15 < f0Var.V1.size(); i15++) {
                            long o4 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) f0Var.V1.get(i15)).peer);
                            TLRPC.User a23 = org.telegram.messenger.np.s1(f0Var.a).a2(Long.valueOf(o4));
                            b41 b41Var2 = new b41(37);
                            b41Var2.d = (-1) - i15;
                            b41Var2.G = a23;
                            b41Var2.i = 1;
                            a0.h hVar2 = f0Var.W1;
                            b41Var2.L(hVar2 != null && hVar2.d(o4));
                            arrayList4.add(b41Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((ChatActivityEnterView) obj3).l0((Canvas) obj, (org.telegram.messenger.r10) obj2);
                break;
            case 5:
                vi viVar = (vi) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                p41 p41Var4 = (p41) obj2;
                int i16 = viVar.Q;
                ArrayList arrayList7 = viVar.N;
                org.telegram.messenger.hp hpVar = viVar.K;
                ArrayList arrayList8 = viVar.L;
                HashSet hashSet = viVar.J;
                ArrayList arrayList9 = viVar.M;
                arrayList6.add(b41.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(viVar.E)) {
                    p41Var4.V();
                    int i17 = 0;
                    while (i17 < viVar.I.size()) {
                        org.telegram.messenger.we weVar2 = (org.telegram.messenger.we) viVar.I.get(i17);
                        weVar2.e.K5(null, z12);
                        b41 i18 = org.telegram.ui.Cells.e7.i(weVar2, new mi(viVar, 0));
                        i18.L(hashSet.contains(weVar2));
                        i18.d = -1;
                        arrayList6.add(i18);
                        i17++;
                        z12 = z12;
                    }
                    boolean z32 = z12;
                    if (viVar.H) {
                        arrayList6.add(b41.q(11, 4));
                        arrayList6.add(b41.q(12, 4));
                        arrayList6.add(b41.q(13, 4));
                    }
                    p41Var4.U();
                    if (hpVar != null) {
                        ArrayList arrayList10 = hpVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        for (int i19 = 0; i19 < size2; i19++) {
                            if (i19 >= arrayList8.size()) {
                                weVar = new org.telegram.messenger.we();
                                arrayList8.add(weVar);
                            } else {
                                weVar = (org.telegram.messenger.we) arrayList8.get(i19);
                            }
                            if (weVar.e != arrayList10.get(i19)) {
                                viVar.m0--;
                                weVar.e = (org.telegram.messenger.gj) arrayList10.get(i19);
                            }
                        }
                    }
                    if (hpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(b41.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        p41Var4.V();
                        arrayList6.add(b41.t(45, org.telegram.messenger.hd.M0(2131753904, str6)));
                        for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                            org.telegram.messenger.we weVar3 = (org.telegram.messenger.we) arrayList8.get(i20);
                            b41 i21 = org.telegram.ui.Cells.e7.i(weVar3, new mi(viVar, 0));
                            i21.L(hashSet.contains(weVar3));
                            arrayList6.add(i21);
                        }
                        if (hpVar.f) {
                            arrayList6.add(b41.q(41, 4));
                            arrayList6.add(b41.q(42, 4));
                            arrayList6.add(b41.q(43, 4));
                        }
                        if (!hpVar.f && !hpVar.e) {
                            b41 c10 = b41.c(viVar.S, R.drawable.arrow_more, org.telegram.messenger.hd.M0(2131745339, null));
                            c10.q = z32;
                            arrayList6.add(c10);
                        }
                        p41Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || viVar.V >= 0 || viVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(b41.B(-98, null));
                        }
                        p41Var4.V();
                        arrayList6.add(b41.t(((viVar.V >= 0 || viVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.hd.M0(2131753907, null)));
                        for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                            org.telegram.messenger.we weVar4 = (org.telegram.messenger.we) arrayList9.get(i22);
                            weVar4.e.K5(viVar.E, true);
                            b41 i23 = org.telegram.ui.Cells.e7.i(weVar4, new mi(viVar, 0));
                            i23.L(hashSet.contains(weVar4));
                            arrayList6.add(i23);
                        }
                        if (viVar.V >= 0 || viVar.a0) {
                            arrayList6.add(b41.q(21, 4));
                            arrayList6.add(b41.q(22, 4));
                            arrayList6.add(b41.q(23, 4));
                        }
                        if (viVar.d0) {
                            b41 c11 = b41.c(i16, R.drawable.arrow_more, org.telegram.messenger.hd.M0(2131745339, null));
                            c11.q = true;
                            arrayList6.add(c11);
                        }
                        p41Var4.U();
                    }
                } else {
                    String lowerCase = viVar.E.toLowerCase();
                    String N3 = org.telegram.messenger.g0.N3(lowerCase);
                    int i24 = 0;
                    boolean z33 = false;
                    while (i24 < viVar.I.size()) {
                        org.telegram.messenger.we weVar5 = (org.telegram.messenger.we) viVar.I.get(i24);
                        String str8 = weVar5.a;
                        if (str8 != null) {
                            String lowerCase2 = str8.toLowerCase();
                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || i5.c.A(" ", lowerCase, lowerCase2) || N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                z11 = true;
                                str4 = weVar5.b;
                                if (str4 == null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    boolean z34 = z11;
                                    String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                    z11 = z34 || lowerCase3.startsWith(lowerCase) || i5.c.A(" ", lowerCase, lowerCase3) || N33.startsWith(N3) || N33.contains(" ".concat(N3));
                                }
                                if (z11) {
                                    p41Var = p41Var4;
                                } else {
                                    if (!z33) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(b41.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        p41Var4.V();
                                        arrayList6.add(b41.t(10, org.telegram.messenger.hd.M0(2131753905, str5)));
                                        z33 = true;
                                    }
                                    p41Var = p41Var4;
                                    weVar5.e.K5(viVar.E, true);
                                    b41 i25 = org.telegram.ui.Cells.e7.i(weVar5, new mi(viVar, 0));
                                    i25.L(hashSet.contains(weVar5));
                                    i25.d = 10;
                                    arrayList6.add(i25);
                                }
                                i24++;
                                p41Var4 = p41Var;
                            }
                        }
                        z11 = false;
                        str4 = weVar5.b;
                        if (str4 == null) {
                        }
                        if (z11) {
                        }
                        i24++;
                        p41Var4 = p41Var;
                    }
                    p41 p41Var5 = p41Var4;
                    p41Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || viVar.V >= 0 || viVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(b41.B(-98, null));
                        }
                        p41Var5.V();
                        arrayList6.add(b41.t(((viVar.V >= 0 || viVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.hd.M0(2131753907, null)));
                        for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                            org.telegram.messenger.we weVar6 = (org.telegram.messenger.we) arrayList9.get(i26);
                            weVar6.e.K5(viVar.E, true);
                            b41 i27 = org.telegram.ui.Cells.e7.i(weVar6, new mi(viVar, 0));
                            i27.L(hashSet.contains(weVar6));
                            arrayList6.add(i27);
                        }
                        if (viVar.V >= 0 || viVar.a0) {
                            arrayList6.add(b41.q(21, 4));
                            arrayList6.add(b41.q(22, 4));
                            arrayList6.add(b41.q(23, 4));
                        }
                        if (viVar.d0) {
                            b41 c12 = b41.c(i16, R.drawable.arrow_more, org.telegram.messenger.hd.M0(2131745339, null));
                            c12.q = true;
                            arrayList6.add(c12);
                        }
                        p41Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || viVar.e0 >= 0 || viVar.n0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(b41.B(-96, null));
                        }
                        p41Var5.V();
                        arrayList6.add(b41.t(((viVar.e0 >= 0 || viVar.n0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.hd.M0(2131753906, null)));
                        int size3 = arrayList7.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            org.telegram.messenger.we weVar7 = (org.telegram.messenger.we) arrayList7.get(i28);
                            weVar7.e.K5(viVar.E, true);
                            b41 i29 = org.telegram.ui.Cells.e7.i(weVar7, new mi(viVar, 0));
                            i29.L(hashSet.contains(weVar7));
                            arrayList6.add(i29);
                        }
                        if (viVar.e0 >= 0 || viVar.n0) {
                            arrayList6.add(b41.q(31, 4));
                            arrayList6.add(b41.q(32, 4));
                            arrayList6.add(b41.q(33, 4));
                        }
                        if (viVar.h0) {
                            b41 c13 = b41.c(viVar.R, R.drawable.arrow_more, org.telegram.messenger.hd.M0(2131745339, null));
                            c13.q = true;
                            arrayList6.add(c13);
                        }
                        p41Var5.U();
                    }
                }
                if (arrayList6.size() > size || viVar.H) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(viVar.E)) {
                    charSequence = null;
                    String M03 = org.telegram.messenger.hd.M0(2131748245, null);
                    String M04 = org.telegram.messenger.hd.M0(2131748244, null);
                    int i30 = ti.b;
                    b41 K = b41.K(ti.class);
                    K.l = M03;
                    K.m = M04;
                    arrayList6.add(K);
                } else {
                    charSequence = null;
                    String M05 = org.telegram.messenger.hd.M0(2131748243, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, viVar.E.length() >= 3 ? 2131748241 : 2131748242, viVar.E));
                    int i31 = ti.b;
                    b41 K2 = b41.K(ti.class);
                    K2.l = M05;
                    K2.m = X2;
                    arrayList6.add(K2);
                }
                arrayList6.add(b41.B(-99, charSequence));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z35 = ChatAttachAlertPhotoLayout.r1;
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
                lx lxVar = (lx) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = lxVar.s;
                int size4 = arrayList12.size();
                int i32 = 0;
                while (i32 < size4) {
                    Object obj4 = arrayList12.get(i32);
                    i32++;
                    ex exVar = (ex) obj4;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = exVar.b;
                    if (tL_messages_stickerSet != null) {
                        boolean z36 = tL_messages_stickerSet.set.id == lxVar.d;
                        int i33 = nx.b;
                        b41 K3 = b41.K(nx.class);
                        long j3 = tL_messages_stickerSet.set.id;
                        K3.d = (int) ((j3 >>> 32) ^ j3);
                        K3.B = j3;
                        K3.G = tL_messages_stickerSet;
                        K3.e = z36;
                        arrayList11.add(K3);
                    } else {
                        TLRPC.StickerSetCovered stickerSetCovered = exVar.a;
                        if (stickerSetCovered != null) {
                            arrayList11.add(nx.i(stickerSetCovered, exVar, stickerSetCovered.set.id == lxVar.d));
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
                ((r41) obj3).Z((ArrayList) obj, (p41) obj2);
                break;
        }
    }
}
