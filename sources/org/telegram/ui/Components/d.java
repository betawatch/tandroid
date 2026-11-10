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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        sq sqVar = (sq) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (sqVar.b2 == null) {
            Context context = sqVar.getContext();
            org.telegram.ui.ActionBar.h6 h6Var = sqVar.I0;
            bi.t tVar = new bi.t(context, 7);
            tVar.setOrientation(1);
            ch0 ch0Var = new ch0(context);
            ch0Var.setAutoRepeat(true);
            ch0Var.f(R.raw.utyan_streaming, org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, null);
            ch0Var.d();
            tVar.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131744438, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
            tVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, h6Var);
            textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743236, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            tVar.addView(textView2, c8.ha.t(-2, -2, 1, 28, 0, 28, 17));
            sqVar.b2 = tVar;
        }
        arrayList.add(x31.k(sqVar.b2));
        arrayList.add(x31.C(null));
        arrayList.add(x31.u(org.telegram.messenger.id.M0(2131743431, null)));
        String str2 = sqVar.W1;
        String M0 = org.telegram.messenger.id.M0(2131743432, null);
        int i7 = rq.b;
        x31 K = x31.K(rq.class);
        K.l = str2;
        K.n = M0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = sqVar.Y1;
        String M02 = org.telegram.messenger.id.M0(2131743433, null);
        x31 K2 = x31.K(rq.class);
        K2.l = spannableStringBuilder;
        K2.n = M02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (sqVar.a2) {
            str = org.telegram.messenger.id.M0(sqVar.S1 ? 2131743428 : 2131743429, null);
        }
        arrayList.add(x31.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z9;
        final ur urVar = (ur) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = urVar.P;
        r2 r2Var = urVar.j0;
        ArrayList arrayList2 = urVar.V;
        tr trVar = urVar.S;
        boolean z10 = urVar.R;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(urVar.g0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(urVar.T);
            arrayList3.addAll(urVar.U);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z10) {
                    arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745822, null)));
                } else {
                    arrayList.add(x31.s(org.telegram.messenger.id.M0(2131745822, null), org.telegram.messenger.id.M0(urVar.X ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.rr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    ur urVar2 = urVar;
                                    urVar2.X = !urVar2.X;
                                    urVar2.O(true);
                                    break;
                                default:
                                    ur urVar3 = urVar;
                                    urVar3.W = !urVar3.W;
                                    urVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!urVar.X && !arrayList2.isEmpty() && !z10) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    x31 w10 = x31.w((TLObject) arrayList3.get(i12));
                    w10.t = true;
                    w10.H = r2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z10) {
                return;
            }
            arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745756, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                x31 x31Var = new x31(33);
                x31Var.G = (org.telegram.messenger.ij) obj3;
                arrayList.add(x31Var);
            }
            if (urVar.d0) {
                arrayList.add(x31.p(1));
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
        urVar.Z = arrayList.size();
        if (!arrayList5.isEmpty() && !z10) {
            if (arrayList5.size() > 5) {
                arrayList.add(x31.s(org.telegram.messenger.id.M0(2131745820, null), org.telegram.messenger.id.M0(urVar.W ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.rr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                ur urVar2 = urVar;
                                urVar2.X = !urVar2.X;
                                urVar2.O(true);
                                break;
                            default:
                                ur urVar3 = urVar;
                                urVar3.W = !urVar3.W;
                                urVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745820, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || urVar.W); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    x31 w11 = x31.w(user);
                    w11.q = true;
                    w11.t = true;
                    w11.H = r2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        urVar.a0 = arrayList.size();
        ArrayList arrayList6 = trVar.h;
        if (arrayList6.isEmpty()) {
            if (trVar.c || !trVar.e) {
                if (!z10) {
                    arrayList.add(x31.p(30));
                }
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
            }
            z9 = false;
        } else {
            if (!z10) {
                arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745819, null)));
            }
            boolean z11 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    x31 w12 = x31.w(user2);
                    w12.q = true;
                    w12.r = true;
                    w12.t = true;
                    w12.H = r2Var;
                    arrayList.add(w12);
                    z11 = true;
                }
            }
            if (trVar.c || !trVar.e) {
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
            }
            z9 = z11;
        }
        if (z9) {
            arrayList.add(x31.C(urVar.Y));
        }
    }

    private final void d(Object obj, Object obj2) {
        final am0 am0Var = (am0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = am0Var.R;
        ArrayList arrayList3 = am0Var.X;
        int i7 = am0Var.P;
        final int i10 = 0;
        if (TextUtils.isEmpty(am0Var.d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(x31.s(org.telegram.messenger.id.M0(2131745739, null), org.telegram.messenger.id.M0(am0Var.W ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.vr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    am0 am0Var2 = am0Var;
                                    am0Var2.W = !am0Var2.W;
                                    am0Var2.O(true);
                                    if (am0Var2.W) {
                                        org.telegram.messenger.g0.v1(am0Var2.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    am0 am0Var3 = am0Var;
                                    am0Var3.V = !am0Var3.V;
                                    am0Var3.O(true);
                                    if (am0Var3.V) {
                                        org.telegram.messenger.g0.v1(am0Var3.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745739, null)));
                }
                int size = arrayList3.size();
                if (!am0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    x31 w10 = x31.w((TLObject) arrayList3.get(i11));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.qp.s1(i7).Y7;
            org.telegram.messenger.ro roVar = hashMap == null ? null : (org.telegram.messenger.ro) hashMap.get(0L);
            if (roVar == null) {
                arrayList.add(x31.p(30));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
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
                arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745711, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(x31.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = am0Var.S;
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
        ArrayList arrayList8 = am0Var.T;
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
        ArrayList arrayList9 = am0Var.U;
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
                arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745814, null)));
            } else {
                final int i17 = 1;
                arrayList.add(x31.s(org.telegram.messenger.id.M0(2131745814, null), org.telegram.messenger.id.M0(am0Var.V ? 2131745340 : 2131745339, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.vr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                am0 am0Var2 = am0Var;
                                am0Var2.W = !am0Var2.W;
                                am0Var2.O(true);
                                if (am0Var2.W) {
                                    org.telegram.messenger.g0.v1(am0Var2.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                am0 am0Var3 = am0Var;
                                am0Var3.V = !am0Var3.V;
                                am0Var3.O(true);
                                if (am0Var3.V) {
                                    org.telegram.messenger.g0.v1(am0Var3.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!am0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(x31.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745756, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            x31 x31Var = new x31(33);
            x31Var.G = (org.telegram.messenger.ij) obj8;
            arrayList.add(x31Var);
        }
        if (am0Var.a0) {
            arrayList.add(x31.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        gy gyVar = (gy) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        px pxVar = gyVar.R1;
        if (pxVar == null || !(pxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            return;
        }
        org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) gyVar.R1.getDrawable();
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
            v5 v5Var = f4Var.e;
            if (v5Var != null) {
                v5Var.e(true, 0.0f);
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
            v5 v5Var2 = f4Var.f;
            if (v5Var2 != null) {
                v5Var2.e(true, 0.0f);
            }
        }
        f4Var.invalidateSelf();
        String str = (String) gyVar.R1.getTag();
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
        ay ayVar = (ay) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = ayVar.E;
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
                boolean z9 = tL_messages_stickerSet.set.id == ayVar.d;
                int i10 = ix.b;
                x31 K = x31.K(ix.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.e = z9;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = ayVar.J;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            yw ywVar = (yw) obj4;
            TLRPC.StickerSet stickerSet = ywVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(ix.i(ywVar.a, ywVar, stickerSet.id == ayVar.d));
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
        ((ArrayList) obj).add(x31.j(-1, ((m20) this.b).T1));
    }

    private final void i(Object obj, Object obj2) {
        t20 t20Var = (t20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        t20Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.oa.a(t20Var.a).f);
        if (t20Var.c.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < t20Var.c.size(); i7++) {
            String str = (String) t20Var.c.get(i7);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(x31.c(i7 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(x31.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.id.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        di.l6 l6Var;
        u20 u20Var = (u20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = u20Var.Q;
        int i7 = 0;
        boolean z9 = u20Var.R && (l6Var = u20Var.S) != null && l6Var.i.size() > 0;
        if (z9) {
            di.l6 l6Var2 = u20Var.S;
            int i10 = jg.k1.b;
            x31 K = x31.K(jg.k1.class);
            K.G = l6Var2;
            arrayList.add(K);
        }
        u20Var.T = z9;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i7);
            x31 x31Var = new x31(33);
            x31Var.d = i11;
            x31Var.G = ijVar;
            arrayList.add(x31Var);
            i7 = i11;
        }
        if (u20Var.U || !u20Var.X) {
            arrayList.add(x31.q(-2, 1));
            arrayList.add(x31.q(-3, 1));
            arrayList.add(x31.q(-4, 1));
        }
        if (u20Var.T || !z9) {
            return;
        }
        org.telegram.messenger.g0.h3(new gp(u20Var, 19));
    }

    private final void k(Object obj, Object obj2) {
        i60 i60Var = (i60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        k60 k60Var = i60Var.y;
        k60Var.f.setAlpha(1.0f);
        if (k60Var.u) {
            i60Var.c = bitmap;
        }
        ri.b bVar = k60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(k60Var.n, i60Var);
            ViewGroup viewGroup = k60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        ze0 ze0Var = (ze0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = ze0Var.e;
        ArrayList arrayList3 = ze0Var.n;
        int i7 = 0;
        if (ze0Var.d == null) {
            arrayList.add(x31.q(-1, 7));
            arrayList.add(x31.q(-2, 7));
            arrayList.add(x31.q(-3, 7));
            ze0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(ze0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745722, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                x31 x31Var = new x31(33);
                x31Var.G = (org.telegram.messenger.ij) obj3;
                arrayList.add(x31Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(x31.r(org.telegram.messenger.id.M0(2131745723, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                x31 x31Var2 = new x31(33);
                x31Var2.G = (org.telegram.messenger.ij) obj4;
                arrayList.add(x31Var2);
            }
        }
        if (ze0Var.w || ((ze0Var.M && !ze0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !ze0Var.s))) {
            arrayList.add(x31.q(ze0Var.L * 3, 7));
            arrayList.add(x31.q((ze0Var.L * 3) + 1, 7));
            arrayList.add(x31.q((ze0Var.L * 3) + 2, 7));
        }
        ze0Var.Q = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        jk0 jk0Var = (jk0) this.b;
        jk0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        jk0Var.e = paint;
        Bitmap bitmap = jk0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        jk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        jk0Var.f = new Matrix();
        ri.b bVar = jk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, jk0Var.s);
        ViewGroup viewGroup = jk0Var.D;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        yv0 yv0Var = (yv0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        yv0Var.q1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ui.Z(yv0Var.M1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_stickers_renameStickerSet, new w1((org.telegram.messenger.c20) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        k21 k21Var = (k21) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        v11 v11Var = k21Var.y1;
        j21 j21Var = k21Var.H1;
        if (str != null) {
            k21Var.O1 = false;
            k21Var.z1.setText(k21Var.Q0(str));
            j21Var.D(v11Var);
        } else {
            if (k21Var.I) {
                return;
            }
            if (k21Var.O1) {
                k21Var.dismiss();
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.P4, 1, org.telegram.messenger.id.M0(bool.booleanValue() ? 2131743947 : 2131743946, null));
                return;
            }
            org.telegram.messenger.k5.p(null, bool.booleanValue() ? 2131743947 : 2131743946, new gc((FrameLayout) k21Var.b, k21Var.I0), null);
            g21 g21Var = k21Var.w1.e;
            String str2 = k21Var.v1;
            k21Var.u1 = str2;
            g21Var.setText(k21.O0(str2, null, null));
            j21Var.D(v11Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0375  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        x31 i7;
        TL_iv.RichMessage richMessage;
        x31 i10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        x31 i11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
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
        int i12 = this.a;
        char c10 = ' ';
        Object obj3 = this.b;
        boolean z11 = true;
        switch (i12) {
            case 0:
                f0 f0Var = (f0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var2 = (m41) obj2;
                boolean[] zArr = f0Var.k2;
                boolean[] zArr2 = f0Var.l2;
                e0 e0Var = f0Var.s2;
                arrayList.add(x31.C(null));
                arrayList.add(x31.m(f0Var.q2));
                arrayList.add(x31.C(null));
                m41Var2.F = 1;
                m41Var2.V();
                e0 e0Var2 = f0Var.r2;
                int selectedTab = e0Var2 != null ? e0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = f0Var.m2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(p21.j(3, org.telegram.messenger.id.M0(2131754986, null), null, null, null));
                    } else {
                        String O0 = k21.O0(f0Var.m2, null, zArr2);
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
                            O0 = k21.K0(O0);
                        }
                        arrayList.add(p21.j(3, substring2, O0, substring3, null));
                    }
                    arrayList.add(f0Var.n1() ? f0Var.o1(4, f0Var.T1, false) : t21.i(4, f0Var.S1, f0Var.K2, new c(f0Var, 4), null, null));
                    String O02 = k21.O0(f0Var.n2, zArr, null);
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
                        O02 = k21.K0(O02);
                    }
                    arrayList.add(p21.i(5, str, rf.b.r(O02, ""), substring, new c(f0Var, 5), f0Var.o2, new c(f0Var, 6), null));
                    if (f0Var.n1()) {
                        boolean z12 = f0Var.U1;
                        if (z12 || (richMessage3 = f0Var.W1) == null) {
                            richMessage3 = f0Var.T1;
                        }
                        i11 = f0Var.o1(6, richMessage3, z12);
                    } else {
                        boolean z13 = f0Var.U1;
                        i11 = t21.i(z13 ? 7 : 6, f0Var.V1, false, null, null, !z13 ? new c(f0Var, 7) : null);
                    }
                    arrayList.add(i11);
                } else if (selectedTab == 1) {
                    arrayList.add(x31.k(e0Var));
                    if (e0Var.getSelectedTone() instanceof a0) {
                        arrayList.add(x31.j(10, f0Var.u2));
                        m41Var2.U();
                        arrayList.add(x31.B(11, null));
                        m41Var2.V();
                    }
                    if ((e0Var.getSelectedTab() >= 0 || f0Var.o2) && (!(e0Var.getSelectedTone() instanceof a0) || TextUtils.equals(f0Var.v2.getText().toString(), f0Var.D2))) {
                        arrayList.add(p21.i(7, org.telegram.messenger.id.M0(2131754984, null), null, null, null, f0Var.o2, new c(f0Var, 6), null));
                        if (f0Var.n1()) {
                            boolean z14 = f0Var.X1;
                            if (z14 || (richMessage2 = f0Var.Z1) == null) {
                                richMessage2 = f0Var.T1;
                            }
                            i10 = f0Var.o1(8, richMessage2, z14);
                        } else {
                            boolean z15 = f0Var.X1;
                            i10 = t21.i(z15 ? 7 : 6, f0Var.Y1, false, null, null, !z15 ? new c(f0Var, 7) : null);
                        }
                        arrayList.add(i10);
                    } else {
                        arrayList.add(p21.i(5, org.telegram.messenger.id.M0(2131754987, null), null, null, null, f0Var.o2, new c(f0Var, 6), null));
                        arrayList.add(f0Var.n1() ? f0Var.o1(6, f0Var.T1, false) : t21.i(f0Var.X1 ? 7 : 6, f0Var.S1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(p21.j(3, org.telegram.messenger.id.M0(2131754987, null), null, null, null));
                    arrayList.add(f0Var.n1() ? f0Var.o1(4, f0Var.T1, false) : t21.i(4, f0Var.S1, f0Var.K2, new c(f0Var, 4), null, null));
                    arrayList.add(p21.j(5, org.telegram.messenger.id.M0(2131754984, null), null, null, null));
                    if (f0Var.n1()) {
                        boolean z16 = f0Var.a2;
                        if (z16 || (richMessage = f0Var.c2) == null) {
                            richMessage = f0Var.T1;
                        }
                        i7 = f0Var.o1(6, richMessage, z16);
                    } else {
                        boolean z17 = f0Var.a2;
                        i7 = t21.i(z17 ? 7 : 6, f0Var.b2, false, null, null, !z17 ? new c(f0Var, 7) : null);
                    }
                    arrayList.add(i7);
                }
                m41Var2.U();
                arrayList.add(x31.C(null));
                break;
            case 1:
                r rVar = (r) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                m41 m41Var3 = (m41) obj2;
                m41Var3.F = 1;
                arrayList2.add(x31.C(null));
                FrameLayout frameLayout = rVar.V1;
                x31 x31Var = new x31(-4);
                x31Var.c = frameLayout;
                x31Var.z = -1;
                x31Var.e = true;
                arrayList2.add(x31Var);
                arrayList2.add(x31.C(null));
                arrayList2.add(x31.m(rVar.W1));
                arrayList2.add(x31.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(x31.m(rVar.X1));
                arrayList2.add(x31.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = rVar.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.d2[rVar.c2];
                    m41Var3.V();
                    arrayList2.add(p21.i(3, org.telegram.messenger.id.M0(2131755001, null), null, null, null, false, null, new o(rVar, 1)));
                    arrayList2.add(t21.i(4, aicomposetoneexample == null ? r.e1() : org.telegram.messenger.ij.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(p21.j(5, org.telegram.messenger.id.M0(2131755004, null), null, null, null));
                    arrayList2.add(t21.i(6, aicomposetoneexample == null ? r.e1() : org.telegram.messenger.ij.h0(aicomposetoneexample.to, false), false, null, null, null));
                    m41Var3.U();
                    TLRPC.User a22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.qp.s1(rVar.a).a2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String n10 = org.telegram.messenger.t10.n(a22);
                    if (a22 == null) {
                        int i13 = tL_aiComposeTone.installs_count;
                        if (i13 > 0) {
                            arrayList2.add(x31.C(org.telegram.messenger.id.G(i13, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.id.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(n10)) {
                            z9 = false;
                            a02 = org.telegram.messenger.id.a0(null, null, 2131754999, org.telegram.messenger.t10.p(a22));
                        } else {
                            z9 = false;
                            a02 = org.telegram.messenger.id.a0(null, null, 2131754999, rf.b.i("@", n10));
                        }
                        sb2.append(a02);
                        arrayList2.add(x31.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.m6.Uc, rVar.I0, new org.telegram.ui.fq(2, rVar, tL_aiComposeTone), z9)));
                    }
                }
                arrayList2.add(x31.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                z zVar = (z) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(x31.C(null));
                arrayList3.add(x31.m(zVar.S1));
                arrayList3.add(x31.C(null));
                arrayList3.add(x31.k(zVar.V1));
                arrayList3.add(x31.C(null));
                arrayList3.add(x31.k(zVar.W1));
                arrayList3.add(x31.C(null));
                if (zVar.e2 != null) {
                    x31 e10 = x31.e(1, org.telegram.messenger.id.M0(2131754998, null));
                    e10.r = true;
                    arrayList3.add(e10);
                    arrayList3.add(x31.C(null));
                }
                arrayList3.add(x31.m(zVar.X1));
                break;
            case 3:
                h0 h0Var = (h0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z18 = h0Var.W1;
                if (h0Var.T1 != null) {
                    arrayList4.add(x31.C(null));
                    arrayList4.add(x31.u(org.telegram.messenger.id.M0(2131751002, null)));
                    x31 A = x31.A(h0Var.d1(0), org.telegram.messenger.id.M0(z18 ? 2131750981 : 2131750979, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = h0Var.T1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z18 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !h0Var.Y1;
                    int i14 = 9;
                    A.D = new ai.v(h0Var, 0, i14);
                    arrayList4.add(A);
                    if (h0Var.Y1) {
                        x31 z19 = x31.z(3, org.telegram.messenger.id.M0(2131750984, null));
                        z19.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.T1;
                        z19.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z19);
                        if (z18) {
                            x31 z20 = x31.z(4, org.telegram.messenger.id.M0(2131750987, null));
                            z20.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = h0Var.T1;
                            z20.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z20);
                        }
                        x31 z21 = x31.z(5, org.telegram.messenger.id.M0(z18 ? 2131750988 : 2131750986, null));
                        z21.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = h0Var.T1;
                        z21.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z21);
                        x31 z22 = x31.z(6, org.telegram.messenger.id.M0(z18 ? 2131750992 : 2131750991, null));
                        z22.i = 1;
                        z22.L(h0Var.T1.leave);
                        arrayList4.add(z22);
                        if (z18) {
                            x31 z23 = x31.z(7, org.telegram.messenger.id.M0(2131750990, null));
                            z23.i = 1;
                            z23.L(h0Var.T1.edit_rank);
                            arrayList4.add(z23);
                        }
                    }
                    x31 A2 = x31.A(h0Var.d1(1), org.telegram.messenger.id.M0(z18 ? 2131750982 : 2131750983, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = h0Var.T1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !h0Var.Z1;
                    A2.D = new ai.v(h0Var, 1, i14);
                    arrayList4.add(A2);
                    if (h0Var.Z1) {
                        x31 z24 = x31.z(9, org.telegram.messenger.id.M0(z18 ? 2131750995 : 2131750998, null));
                        z24.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = h0Var.T1;
                        z24.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z24);
                        str2 = null;
                        x31 z25 = x31.z(10, org.telegram.messenger.id.M0(2131750994, null));
                        z25.i = 1;
                        z25.L(h0Var.T1.invites);
                        arrayList4.add(z25);
                        x31 z26 = x31.z(11, org.telegram.messenger.id.M0(2131750999, null));
                        z26.i = 1;
                        z26.L(h0Var.T1.group_call);
                        arrayList4.add(z26);
                    } else {
                        str2 = null;
                    }
                    x31 A3 = x31.A(h0Var.d1(2), org.telegram.messenger.id.M0(2131750980, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = h0Var.T1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !h0Var.a2;
                    A3.D = new ai.v(h0Var, 2, i14);
                    arrayList4.add(A3);
                    if (h0Var.a2) {
                        str3 = null;
                        x31 z27 = x31.z(13, org.telegram.messenger.id.M0(2131750997, null));
                        z27.i = 1;
                        z27.L(h0Var.T1.delete);
                        arrayList4.add(z27);
                        x31 z28 = x31.z(14, org.telegram.messenger.id.M0(2131750996, null));
                        z28.i = 1;
                        z28.L(h0Var.T1.edit);
                        arrayList4.add(z28);
                        x31 z29 = x31.z(15, org.telegram.messenger.id.M0(2131750985, null));
                        z29.i = 1;
                        z29.L(h0Var.T1.pinned);
                        arrayList4.add(z29);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(x31.C(str3));
                    arrayList4.add(x31.u(org.telegram.messenger.id.M0(2131751001, str3)));
                    x31 z30 = x31.z(16, org.telegram.messenger.id.M0(2131751000, str3));
                    a0.h hVar = h0Var.V1;
                    int m10 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = h0Var.U1;
                    z30.L(m10 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z30);
                    if (h0Var.U1 != null) {
                        for (int i15 = 0; i15 < h0Var.U1.size(); i15++) {
                            long o4 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) h0Var.U1.get(i15)).peer);
                            TLRPC.User a23 = org.telegram.messenger.qp.s1(h0Var.a).a2(Long.valueOf(o4));
                            x31 x31Var2 = new x31(37);
                            x31Var2.d = (-1) - i15;
                            x31Var2.G = a23;
                            x31Var2.i = 1;
                            a0.h hVar2 = h0Var.V1;
                            x31Var2.L(hVar2 != null && hVar2.d(o4));
                            arrayList4.add(x31Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((ChatActivityEnterView) obj3).c0((Canvas) obj, (org.telegram.messenger.u10) obj2);
                break;
            case 5:
                mi miVar = (mi) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                m41 m41Var4 = (m41) obj2;
                int i16 = miVar.P;
                ArrayList arrayList7 = miVar.M;
                org.telegram.messenger.kp kpVar = miVar.J;
                ArrayList arrayList8 = miVar.K;
                HashSet hashSet = miVar.I;
                ArrayList arrayList9 = miVar.L;
                arrayList6.add(x31.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(miVar.D)) {
                    m41Var4.V();
                    int i17 = 0;
                    while (i17 < miVar.H.size()) {
                        org.telegram.messenger.xe xeVar2 = (org.telegram.messenger.xe) miVar.H.get(i17);
                        xeVar2.e.K5(null, z11);
                        boolean z31 = z11;
                        x31 i18 = org.telegram.ui.Cells.f7.i(xeVar2, new ei(miVar, 0));
                        i18.L(hashSet.contains(xeVar2));
                        i18.d = -1;
                        arrayList6.add(i18);
                        i17++;
                        z11 = z31;
                    }
                    boolean z32 = z11;
                    if (miVar.G) {
                        arrayList6.add(x31.q(11, 4));
                        arrayList6.add(x31.q(12, 4));
                        arrayList6.add(x31.q(13, 4));
                    }
                    m41Var4.U();
                    if (kpVar != null) {
                        ArrayList arrayList10 = kpVar.c;
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
                                xeVar.e = (org.telegram.messenger.ij) arrayList10.get(i19);
                            }
                        }
                    }
                    if (kpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(x31.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        m41Var4.V();
                        arrayList6.add(x31.t(45, org.telegram.messenger.id.M0(2131753904, str6)));
                        for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                            org.telegram.messenger.xe xeVar3 = (org.telegram.messenger.xe) arrayList8.get(i20);
                            x31 i21 = org.telegram.ui.Cells.f7.i(xeVar3, new ei(miVar, 0));
                            i21.L(hashSet.contains(xeVar3));
                            arrayList6.add(i21);
                        }
                        if (kpVar.f) {
                            arrayList6.add(x31.q(41, 4));
                            arrayList6.add(x31.q(42, 4));
                            arrayList6.add(x31.q(43, 4));
                        }
                        if (!kpVar.f && !kpVar.e) {
                            x31 c11 = x31.c(miVar.R, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c11.q = z32;
                            arrayList6.add(c11);
                        }
                        m41Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || miVar.U >= 0 || miVar.W)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(x31.B(-98, null));
                        }
                        m41Var4.V();
                        arrayList6.add(x31.t(((miVar.U >= 0 || miVar.W) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.id.M0(2131753907, null)));
                        for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                            org.telegram.messenger.xe xeVar4 = (org.telegram.messenger.xe) arrayList9.get(i22);
                            xeVar4.e.K5(miVar.D, true);
                            x31 i23 = org.telegram.ui.Cells.f7.i(xeVar4, new ei(miVar, 0));
                            i23.L(hashSet.contains(xeVar4));
                            arrayList6.add(i23);
                        }
                        if (miVar.U >= 0 || miVar.W) {
                            arrayList6.add(x31.q(21, 4));
                            arrayList6.add(x31.q(22, 4));
                            arrayList6.add(x31.q(23, 4));
                        }
                        if (miVar.c0) {
                            x31 c12 = x31.c(i16, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c12.q = true;
                            arrayList6.add(c12);
                        }
                        m41Var4.U();
                    }
                } else {
                    String lowerCase = miVar.D.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    int i24 = 0;
                    boolean z33 = false;
                    while (i24 < miVar.H.size()) {
                        org.telegram.messenger.xe xeVar5 = (org.telegram.messenger.xe) miVar.H.get(i24);
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
                                            arrayList6.add(x31.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        m41Var4.V();
                                        arrayList6.add(x31.t(10, org.telegram.messenger.id.M0(2131753905, str5)));
                                        z33 = true;
                                    }
                                    m41Var = m41Var4;
                                    xeVar5.e.K5(miVar.D, true);
                                    x31 i25 = org.telegram.ui.Cells.f7.i(xeVar5, new ei(miVar, 0));
                                    i25.L(hashSet.contains(xeVar5));
                                    i25.d = 10;
                                    arrayList6.add(i25);
                                }
                                i24++;
                                m41Var4 = m41Var;
                            }
                        }
                        z10 = false;
                        str4 = xeVar5.b;
                        if (str4 == null) {
                        }
                        if (z10) {
                        }
                        i24++;
                        m41Var4 = m41Var;
                    }
                    m41 m41Var5 = m41Var4;
                    m41Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || miVar.U >= 0 || miVar.W)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(x31.B(-98, null));
                        }
                        m41Var5.V();
                        arrayList6.add(x31.t(((miVar.U >= 0 || miVar.W) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.id.M0(2131753907, null)));
                        for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                            org.telegram.messenger.xe xeVar6 = (org.telegram.messenger.xe) arrayList9.get(i26);
                            xeVar6.e.K5(miVar.D, true);
                            x31 i27 = org.telegram.ui.Cells.f7.i(xeVar6, new ei(miVar, 0));
                            i27.L(hashSet.contains(xeVar6));
                            arrayList6.add(i27);
                        }
                        if (miVar.U >= 0 || miVar.W) {
                            arrayList6.add(x31.q(21, 4));
                            arrayList6.add(x31.q(22, 4));
                            arrayList6.add(x31.q(23, 4));
                        }
                        if (miVar.c0) {
                            x31 c13 = x31.c(i16, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c13.q = true;
                            arrayList6.add(c13);
                        }
                        m41Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || miVar.d0 >= 0 || miVar.m0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(x31.B(-96, null));
                        }
                        m41Var5.V();
                        arrayList6.add(x31.t(((miVar.d0 >= 0 || miVar.m0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.id.M0(2131753906, null)));
                        int size3 = arrayList7.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            org.telegram.messenger.xe xeVar7 = (org.telegram.messenger.xe) arrayList7.get(i28);
                            xeVar7.e.K5(miVar.D, true);
                            x31 i29 = org.telegram.ui.Cells.f7.i(xeVar7, new ei(miVar, 0));
                            i29.L(hashSet.contains(xeVar7));
                            arrayList6.add(i29);
                        }
                        if (miVar.d0 >= 0 || miVar.m0) {
                            arrayList6.add(x31.q(31, 4));
                            arrayList6.add(x31.q(32, 4));
                            arrayList6.add(x31.q(33, 4));
                        }
                        if (miVar.g0) {
                            x31 c14 = x31.c(miVar.Q, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745339, null));
                            c14.q = true;
                            arrayList6.add(c14);
                        }
                        m41Var5.U();
                    }
                }
                if (arrayList6.size() > size || miVar.G) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(miVar.D)) {
                    charSequence = null;
                    String M03 = org.telegram.messenger.id.M0(2131748245, null);
                    String M04 = org.telegram.messenger.id.M0(2131748244, null);
                    int i30 = ki.b;
                    x31 K = x31.K(ki.class);
                    K.l = M03;
                    K.m = M04;
                    arrayList6.add(K);
                } else {
                    charSequence = null;
                    String M05 = org.telegram.messenger.id.M0(2131748243, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, miVar.D.length() >= 3 ? 2131748241 : 2131748242, miVar.D));
                    int i31 = ki.b;
                    x31 K2 = x31.K(ki.class);
                    K2.l = M05;
                    K2.m = X2;
                    arrayList6.add(K2);
                }
                arrayList6.add(x31.B(-99, charSequence));
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
                gx gxVar = (gx) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = gxVar.s;
                int size4 = arrayList12.size();
                int i32 = 0;
                while (i32 < size4) {
                    Object obj4 = arrayList12.get(i32);
                    i32++;
                    yw ywVar = (yw) obj4;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ywVar.b;
                    if (tL_messages_stickerSet != null) {
                        boolean z36 = tL_messages_stickerSet.set.id == gxVar.d;
                        int i33 = ix.b;
                        x31 K3 = x31.K(ix.class);
                        long j3 = tL_messages_stickerSet.set.id;
                        K3.d = (int) (j3 ^ (j3 >>> c10));
                        K3.B = j3;
                        K3.G = tL_messages_stickerSet;
                        K3.e = z36;
                        arrayList11.add(K3);
                    } else {
                        TLRPC.StickerSetCovered stickerSetCovered = ywVar.a;
                        if (stickerSetCovered != null) {
                            arrayList11.add(ix.i(stickerSetCovered, ywVar, stickerSetCovered.set.id == gxVar.d));
                        }
                    }
                    c10 = ' ';
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
