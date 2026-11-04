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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        tq tqVar = (tq) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String str = null;
        if (tqVar.Z1 == null) {
            Context context = tqVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = tqVar.J0;
            ci.q qVar = new ci.q(context, 7);
            qVar.setOrientation(1);
            fh0 fh0Var = new fh0(context);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_streaming, org.telegram.messenger.hs.x1, org.telegram.messenger.hs.x1, null);
            fh0Var.d();
            qVar.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.x1, org.telegram.messenger.hs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131744448, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
            qVar.addView(textView, b8.mf.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, e6Var);
            textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131743246, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            qVar.addView(textView2, b8.mf.t(-2, -2, 1, 28, 0, 28, 17));
            tqVar.Z1 = qVar;
        }
        arrayList.add(r31.k(tqVar.Z1));
        arrayList.add(r31.C(null));
        arrayList.add(r31.u(org.telegram.messenger.bd.M0(2131743441, null)));
        String str2 = tqVar.U1;
        String M0 = org.telegram.messenger.bd.M0(2131743442, null);
        int i3 = sq.b;
        r31 K = r31.K(sq.class);
        K.l = str2;
        K.n = M0;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = tqVar.W1;
        String M02 = org.telegram.messenger.bd.M0(2131743443, null);
        r31 K2 = r31.K(sq.class);
        K2.l = spannableStringBuilder;
        K2.n = M02;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (tqVar.Y1) {
            str = org.telegram.messenger.bd.M0(tqVar.Q1 ? 2131743438 : 2131743439, null);
        }
        arrayList.add(r31.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        final vr vrVar = (vr) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i3 = vrVar.Q;
        p2 p2Var = vrVar.k0;
        ArrayList arrayList2 = vrVar.W;
        ur urVar = vrVar.T;
        boolean z11 = vrVar.S;
        HashSet hashSet = new HashSet();
        final int i10 = 0;
        final int i11 = 1;
        if (!TextUtils.isEmpty(vrVar.h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(vrVar.U);
            arrayList3.addAll(vrVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() <= 5 || arrayList2.isEmpty() || z11) {
                    arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745832, null)));
                } else {
                    arrayList.add(r31.s(org.telegram.messenger.bd.M0(2131745832, null), org.telegram.messenger.bd.M0(vrVar.Y ? 2131745350 : 2131745349, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.sr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    vr vrVar2 = vrVar;
                                    vrVar2.Y = !vrVar2.Y;
                                    vrVar2.O(true);
                                    break;
                                default:
                                    vr vrVar3 = vrVar;
                                    vrVar3.X = !vrVar3.X;
                                    vrVar3.O(true);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList3.size();
                if (!vrVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i12 = 0; i12 < size; i12++) {
                    r31 w10 = r31.w((TLObject) arrayList3.get(i12));
                    w10.t = true;
                    w10.H = p2Var;
                    arrayList.add(w10);
                }
            }
            if (arrayList2.isEmpty() || z11) {
                return;
            }
            arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745766, null)));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                r31 r31Var = new r31(33);
                r31Var.G = (org.telegram.messenger.zi) obj3;
                arrayList.add(r31Var);
            }
            if (vrVar.e0) {
                arrayList.add(r31.p(1));
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.li.b0(i3).m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList4.get(i13)).peer)));
                if (a22 != null && a22.bot) {
                    arrayList5.add(a22);
                }
            }
        }
        vrVar.a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                arrayList.add(r31.s(org.telegram.messenger.bd.M0(2131745830, null), org.telegram.messenger.bd.M0(vrVar.X ? 2131745350 : 2131745349, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.sr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                vr vrVar2 = vrVar;
                                vrVar2.Y = !vrVar2.Y;
                                vrVar2.O(true);
                                break;
                            default:
                                vr vrVar3 = vrVar;
                                vrVar3.X = !vrVar3.X;
                                vrVar3.O(true);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745830, null)));
            }
            for (int i14 = 0; i14 < arrayList5.size() && (i14 < 5 || vrVar.X); i14++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    r31 w11 = r31.w(user);
                    w11.q = true;
                    w11.t = true;
                    w11.H = p2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        vrVar.b0 = arrayList.size();
        ArrayList arrayList6 = urVar.h;
        if (arrayList6.isEmpty()) {
            if (urVar.c || !urVar.e) {
                if (!z11) {
                    arrayList.add(r31.p(30));
                }
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
            }
            z10 = false;
        } else {
            if (!z11) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745829, null)));
            }
            boolean z12 = false;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i15);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    r31 w12 = r31.w(user2);
                    w12.q = true;
                    w12.r = true;
                    w12.t = true;
                    w12.H = p2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (urVar.c || !urVar.e) {
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
            }
            z10 = z12;
        }
        if (z10) {
            arrayList.add(r31.C(vrVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        final dm0 dm0Var = (dm0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = dm0Var.S;
        ArrayList arrayList3 = dm0Var.Y;
        int i3 = dm0Var.Q;
        final int i10 = 0;
        if (TextUtils.isEmpty(dm0Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(r31.s(org.telegram.messenger.bd.M0(2131745749, null), org.telegram.messenger.bd.M0(dm0Var.X ? 2131745350 : 2131745349, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.wr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    dm0 dm0Var2 = dm0Var;
                                    dm0Var2.X = !dm0Var2.X;
                                    dm0Var2.O(true);
                                    if (dm0Var2.X) {
                                        org.telegram.messenger.g0.v1(dm0Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    dm0 dm0Var3 = dm0Var;
                                    dm0Var3.W = !dm0Var3.W;
                                    dm0Var3.O(true);
                                    if (dm0Var3.W) {
                                        org.telegram.messenger.g0.v1(dm0Var3.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745749, null)));
                }
                int size = arrayList3.size();
                if (!dm0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    r31 w10 = r31.w((TLObject) arrayList3.get(i11));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.hp.s1(i3).Y7;
            org.telegram.messenger.io ioVar = hashMap == null ? null : (org.telegram.messenger.io) hashMap.get(0L);
            if (ioVar == null) {
                arrayList.add(r31.p(30));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = ioVar.b;
            int size2 = arrayList5.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList5.get(i12);
                i12++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(chat.id));
                    if (org.telegram.messenger.t3.r0(chat) && (M0 == null || org.telegram.messenger.t3.r0(M0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745721, null)));
            }
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                arrayList.add(r31.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = dm0Var.T;
        int size4 = arrayList7.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList7.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i14 = size4;
            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(chat2.id));
            if (org.telegram.messenger.t3.r0(chat2) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                arrayList6.add(chat2);
            }
            size4 = i14;
        }
        ArrayList arrayList8 = dm0Var.U;
        int size5 = arrayList8.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj6 = arrayList8.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M03 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(chat3.id));
            if (org.telegram.messenger.t3.r0(chat3) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = dm0Var.V;
        int size6 = arrayList9.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj7 = arrayList9.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M04 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(chat4.id));
            if (org.telegram.messenger.t3.r0(chat4) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745824, null)));
            } else {
                final int i17 = 1;
                arrayList.add(r31.s(org.telegram.messenger.bd.M0(2131745824, null), org.telegram.messenger.bd.M0(dm0Var.W ? 2131745350 : 2131745349, null), new View.OnClickListener() { // from class: org.telegram.ui.Components.wr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                dm0 dm0Var2 = dm0Var;
                                dm0Var2.X = !dm0Var2.X;
                                dm0Var2.O(true);
                                if (dm0Var2.X) {
                                    org.telegram.messenger.g0.v1(dm0Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                dm0 dm0Var3 = dm0Var;
                                dm0Var3.W = !dm0Var3.W;
                                dm0Var3.O(true);
                                if (dm0Var3.W) {
                                    org.telegram.messenger.g0.v1(dm0Var3.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!dm0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i18 = 0; i18 < size7; i18++) {
                arrayList.add(r31.w((TLObject) arrayList6.get(i18)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745766, null)));
        int size8 = arrayList2.size();
        int i19 = 0;
        while (i19 < size8) {
            Object obj8 = arrayList2.get(i19);
            i19++;
            r31 r31Var = new r31(33);
            r31Var.G = (org.telegram.messenger.zi) obj8;
            arrayList.add(r31Var);
        }
        if (dm0Var.b0) {
            arrayList.add(r31.p(1));
        }
    }

    private final void e(Object obj, Object obj2) {
        ey eyVar = (ey) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        nx nxVar = eyVar.S1;
        if (nxVar == null || !(nxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            return;
        }
        org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) eyVar.S1.getDrawable();
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
        String str = (String) eyVar.S1.getTag();
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
        yx yxVar = (yx) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = yxVar.F;
        int size = arrayList2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i3);
            i3++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z10 = tL_messages_stickerSet.set.id == yxVar.d;
                int i10 = gx.b;
                r31 K = r31.K(gx.class);
                long j10 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j10 >>> 32) ^ j10);
                K.B = j10;
                K.G = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = yxVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            xw xwVar = (xw) obj4;
            TLRPC.StickerSet stickerSet = xwVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(gx.i(xwVar.a, xwVar, stickerSet.id == yxVar.d));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
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

    private final void h(Object obj, Object obj2) {
        ((ArrayList) obj).add(r31.j(-1, ((i20) this.b).R1));
    }

    private final void i(Object obj, Object obj2) {
        p20 p20Var = (p20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        p20Var.c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.ha.a(p20Var.a).f);
        if (p20Var.c.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < p20Var.c.size(); i3++) {
            String str = (String) p20Var.c.get(i3);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(r31.c(i3 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(r31.c(0, R.drawable.msg_clear_recent, org.telegram.messenger.bd.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        ei.l6 l6Var;
        q20 q20Var = (q20) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = q20Var.R;
        int i3 = 0;
        boolean z10 = q20Var.S && (l6Var = q20Var.T) != null && l6Var.i.size() > 0;
        if (z10) {
            ei.l6 l6Var2 = q20Var.T;
            int i10 = kg.g1.b;
            r31 K = r31.K(kg.g1.class);
            K.G = l6Var2;
            arrayList.add(K);
        }
        q20Var.U = z10;
        while (i3 < arrayList2.size()) {
            int i11 = i3 + 1;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i3);
            r31 r31Var = new r31(33);
            r31Var.d = i11;
            r31Var.G = ziVar;
            arrayList.add(r31Var);
            i3 = i11;
        }
        if (q20Var.V || !q20Var.Y) {
            arrayList.add(r31.q(-2, 1));
            arrayList.add(r31.q(-3, 1));
            arrayList.add(r31.q(-4, 1));
        }
        if (q20Var.U || !z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new gp(q20Var, 19));
    }

    private final void k(Object obj, Object obj2) {
        d60 d60Var = (d60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        f60 f60Var = d60Var.y;
        f60Var.f.setAlpha(1.0f);
        if (f60Var.u) {
            d60Var.c = bitmap;
        }
        si.b bVar = f60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            jh.d.c(f60Var.n, d60Var);
            ViewGroup viewGroup = f60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        bf0 bf0Var = (bf0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = bf0Var.e;
        ArrayList arrayList3 = bf0Var.n;
        int i3 = 0;
        if (bf0Var.d == null) {
            arrayList.add(r31.q(-1, 7));
            arrayList.add(r31.q(-2, 7));
            arrayList.add(r31.q(-3, 7));
            bf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(bf0Var.x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745732, null)));
            }
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                r31 r31Var = new r31(33);
                r31Var.G = (org.telegram.messenger.zi) obj3;
                arrayList.add(r31Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745733, null)));
            }
            int size2 = arrayList3.size();
            while (i3 < size2) {
                Object obj4 = arrayList3.get(i3);
                i3++;
                r31 r31Var2 = new r31(33);
                r31Var2.G = (org.telegram.messenger.zi) obj4;
                arrayList.add(r31Var2);
            }
        }
        if (bf0Var.w || ((bf0Var.N && !bf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !bf0Var.s))) {
            arrayList.add(r31.q(bf0Var.M * 3, 7));
            arrayList.add(r31.q((bf0Var.M * 3) + 1, 7));
            arrayList.add(r31.q((bf0Var.M * 3) + 2, 7));
        }
        bf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        nk0 nk0Var = (nk0) this.b;
        nk0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        nk0Var.e = paint;
        Bitmap bitmap = nk0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        nk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        nk0Var.f = new Matrix();
        si.b bVar = nk0Var.h;
        bVar.a((Bitmap) obj2);
        jh.d.c(bVar, nk0Var.s);
        ViewGroup viewGroup = nk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        xv0 xv0Var = (xv0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        xv0Var.o1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.li.Z(xv0Var.K1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_stickers_renameStickerSet, new w1((org.telegram.messenger.u10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        f21 f21Var = (f21) this.b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        q11 q11Var = f21Var.w1;
        e21 e21Var = f21Var.F1;
        if (str != null) {
            f21Var.M1 = false;
            f21Var.x1.setText(f21Var.Q0(str));
            e21Var.D(q11Var);
        } else {
            if (f21Var.J) {
                return;
            }
            if (f21Var.M1) {
                f21Var.dismiss();
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.P4, 1, org.telegram.messenger.bd.M0(bool.booleanValue() ? 2131743957 : 2131743956, null));
                return;
            }
            org.telegram.messenger.k5.p(null, bool.booleanValue() ? 2131743957 : 2131743956, new fc((FrameLayout) f21Var.b, f21Var.J0), null);
            b21 b21Var = f21Var.u1.e;
            String str2 = f21Var.t1;
            f21Var.s1 = str2;
            b21Var.setText(f21.O0(str2, null, null));
            e21Var.D(q11Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0372  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        r31 i3;
        TL_iv.RichMessage richMessage;
        r31 i10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        r31 i11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String a02;
        String str2;
        String str3;
        boolean z11;
        String str4;
        f41 f41Var;
        String str5;
        CharSequence charSequence;
        String str6;
        org.telegram.messenger.qe qeVar;
        int i12 = this.a;
        Object obj3 = this.b;
        boolean z12 = true;
        switch (i12) {
            case 0:
                e0 e0Var = (e0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var2 = (f41) obj2;
                boolean[] zArr = e0Var.i2;
                boolean[] zArr2 = e0Var.j2;
                d0 d0Var = e0Var.q2;
                arrayList.add(r31.C(null));
                arrayList.add(r31.m(e0Var.o2));
                arrayList.add(r31.C(null));
                f41Var2.G = 1;
                f41Var2.V();
                d0 d0Var2 = e0Var.p2;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str7 = e0Var.k2;
                    if (str7 == null || str7.equalsIgnoreCase("und")) {
                        arrayList.add(k21.j(3, org.telegram.messenger.bd.M0(2131754986, null), null, null, null));
                    } else {
                        String O0 = f21.O0(e0Var.k2, null, zArr2);
                        String M0 = org.telegram.messenger.bd.M0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            O0 = f21.K0(O0);
                        }
                        arrayList.add(k21.j(3, substring2, O0, substring3, null));
                    }
                    arrayList.add(e0Var.n1() ? e0Var.o1(4, e0Var.R1, false) : o21.i(4, e0Var.Q1, e0Var.I2, new d(e0Var, 4), null, null));
                    String O02 = f21.O0(e0Var.l2, zArr, null);
                    String M02 = org.telegram.messenger.bd.M0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
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
                        O02 = f21.K0(O02);
                    }
                    arrayList.add(k21.i(5, str, t4.c.q(O02, ""), substring, new d(e0Var, 5), e0Var.m2, new d(e0Var, 6), null));
                    if (e0Var.n1()) {
                        boolean z13 = e0Var.S1;
                        if (z13 || (richMessage3 = e0Var.U1) == null) {
                            richMessage3 = e0Var.R1;
                        }
                        i11 = e0Var.o1(6, richMessage3, z13);
                    } else {
                        boolean z14 = e0Var.S1;
                        i11 = o21.i(z14 ? 7 : 6, e0Var.T1, false, null, null, !z14 ? new d(e0Var, 7) : null);
                    }
                    arrayList.add(i11);
                } else if (selectedTab == 1) {
                    arrayList.add(r31.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof a0) {
                        arrayList.add(r31.j(10, e0Var.s2));
                        f41Var2.U();
                        arrayList.add(r31.B(11, null));
                        f41Var2.V();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.m2) && (!(d0Var.getSelectedTone() instanceof a0) || TextUtils.equals(e0Var.t2.getText().toString(), e0Var.B2))) {
                        arrayList.add(k21.i(7, org.telegram.messenger.bd.M0(2131754984, null), null, null, null, e0Var.m2, new d(e0Var, 6), null));
                        if (e0Var.n1()) {
                            boolean z15 = e0Var.V1;
                            if (z15 || (richMessage2 = e0Var.X1) == null) {
                                richMessage2 = e0Var.R1;
                            }
                            i10 = e0Var.o1(8, richMessage2, z15);
                        } else {
                            boolean z16 = e0Var.V1;
                            i10 = o21.i(z16 ? 7 : 6, e0Var.W1, false, null, null, !z16 ? new d(e0Var, 7) : null);
                        }
                        arrayList.add(i10);
                    } else {
                        arrayList.add(k21.i(5, org.telegram.messenger.bd.M0(2131754987, null), null, null, null, e0Var.m2, new d(e0Var, 6), null));
                        arrayList.add(e0Var.n1() ? e0Var.o1(6, e0Var.R1, false) : o21.i(e0Var.V1 ? 7 : 6, e0Var.Q1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(k21.j(3, org.telegram.messenger.bd.M0(2131754987, null), null, null, null));
                    arrayList.add(e0Var.n1() ? e0Var.o1(4, e0Var.R1, false) : o21.i(4, e0Var.Q1, e0Var.I2, new d(e0Var, 4), null, null));
                    arrayList.add(k21.j(5, org.telegram.messenger.bd.M0(2131754984, null), null, null, null));
                    if (e0Var.n1()) {
                        boolean z17 = e0Var.Y1;
                        if (z17 || (richMessage = e0Var.a2) == null) {
                            richMessage = e0Var.R1;
                        }
                        i3 = e0Var.o1(6, richMessage, z17);
                    } else {
                        boolean z18 = e0Var.Y1;
                        i3 = o21.i(z18 ? 7 : 6, e0Var.Z1, false, null, null, !z18 ? new d(e0Var, 7) : null);
                    }
                    arrayList.add(i3);
                }
                f41Var2.U();
                arrayList.add(r31.C(null));
                break;
            case 1:
                r rVar = (r) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                f41 f41Var3 = (f41) obj2;
                f41Var3.G = 1;
                arrayList2.add(r31.C(null));
                FrameLayout frameLayout = rVar.T1;
                r31 r31Var = new r31(-4);
                r31Var.c = frameLayout;
                r31Var.z = -1;
                r31Var.e = true;
                arrayList2.add(r31Var);
                arrayList2.add(r31.C(null));
                arrayList2.add(r31.m(rVar.U1));
                arrayList2.add(r31.D(org.telegram.messenger.g0.L(1.0f)));
                arrayList2.add(r31.m(rVar.V1));
                arrayList2.add(r31.D(org.telegram.messenger.g0.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = rVar.Q1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.b2[rVar.a2];
                    f41Var3.V();
                    arrayList2.add(k21.i(3, org.telegram.messenger.bd.M0(2131755001, null), null, null, null, false, null, new o(rVar, 1)));
                    arrayList2.add(o21.i(4, aicomposetoneexample == null ? r.e1() : org.telegram.messenger.zi.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList2.add(k21.j(5, org.telegram.messenger.bd.M0(2131755004, null), null, null, null));
                    arrayList2.add(o21.i(6, aicomposetoneexample == null ? r.e1() : org.telegram.messenger.zi.h0(aicomposetoneexample.to, false), false, null, null, null));
                    f41Var3.U();
                    TLRPC.User a22 = tL_aiComposeTone.author_id != 0 ? org.telegram.messenger.hp.s1(rVar.a).a2(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String n4 = org.telegram.messenger.l10.n(a22);
                    if (a22 == null) {
                        int i13 = tL_aiComposeTone.installs_count;
                        if (i13 > 0) {
                            arrayList2.add(r31.C(org.telegram.messenger.bd.G(i13, "AIEditorUsedBy", new Object[0])));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_aiComposeTone.installs_count > 0 ? org.telegram.messenger.bd.G(tL_aiComposeTone.installs_count, "AIEditorUsedBy", new Object[0]) + " " : "");
                        if (TextUtils.isEmpty(n4)) {
                            z10 = false;
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131754999, org.telegram.messenger.l10.p(a22));
                        } else {
                            z10 = false;
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131754999, t4.c.f("@", n4));
                        }
                        sb2.append(a02);
                        arrayList2.add(r31.C(org.telegram.messenger.g0.Q2(sb2.toString(), org.telegram.ui.ActionBar.k6.Uc, rVar.J0, new org.telegram.ui.lo(6, rVar, tL_aiComposeTone), z10)));
                    }
                }
                arrayList2.add(r31.D(org.telegram.messenger.g0.L(32.0f)));
                break;
            case 2:
                z zVar = (z) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(r31.C(null));
                arrayList3.add(r31.m(zVar.Q1));
                arrayList3.add(r31.C(null));
                arrayList3.add(r31.k(zVar.T1));
                arrayList3.add(r31.C(null));
                arrayList3.add(r31.k(zVar.U1));
                arrayList3.add(r31.C(null));
                if (zVar.c2 != null) {
                    r31 e10 = r31.e(1, org.telegram.messenger.bd.M0(2131754998, null));
                    e10.r = true;
                    arrayList3.add(e10);
                    arrayList3.add(r31.C(null));
                }
                arrayList3.add(r31.m(zVar.V1));
                break;
            case 3:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean z19 = g0Var.U1;
                if (g0Var.R1 != null) {
                    arrayList4.add(r31.C(null));
                    arrayList4.add(r31.u(org.telegram.messenger.bd.M0(2131751003, null)));
                    r31 A = r31.A(g0Var.d1(0), org.telegram.messenger.bd.M0(z19 ? 2131750982 : 2131750980, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.R1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z19 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !g0Var.W1;
                    int i14 = 9;
                    A.D = new bi.q(g0Var, 0, i14);
                    arrayList4.add(A);
                    if (g0Var.W1) {
                        r31 z20 = r31.z(3, org.telegram.messenger.bd.M0(2131750985, null));
                        z20.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.R1;
                        z20.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList4.add(z20);
                        if (z19) {
                            r31 z21 = r31.z(4, org.telegram.messenger.bd.M0(2131750988, null));
                            z21.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = g0Var.R1;
                            z21.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList4.add(z21);
                        }
                        r31 z22 = r31.z(5, org.telegram.messenger.bd.M0(z19 ? 2131750989 : 2131750987, null));
                        z22.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = g0Var.R1;
                        z22.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList4.add(z22);
                        r31 z23 = r31.z(6, org.telegram.messenger.bd.M0(z19 ? 2131750993 : 2131750992, null));
                        z23.i = 1;
                        z23.L(g0Var.R1.leave);
                        arrayList4.add(z23);
                        if (z19) {
                            r31 z24 = r31.z(7, org.telegram.messenger.bd.M0(2131750991, null));
                            z24.i = 1;
                            z24.L(g0Var.R1.edit_rank);
                            arrayList4.add(z24);
                        }
                    }
                    r31 A2 = r31.A(g0Var.d1(1), org.telegram.messenger.bd.M0(z19 ? 2131750983 : 2131750984, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = g0Var.R1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !g0Var.X1;
                    A2.D = new bi.q(g0Var, 1, i14);
                    arrayList4.add(A2);
                    if (g0Var.X1) {
                        r31 z25 = r31.z(9, org.telegram.messenger.bd.M0(z19 ? 2131750996 : 2131750999, null));
                        z25.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = g0Var.R1;
                        z25.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList4.add(z25);
                        str2 = null;
                        r31 z26 = r31.z(10, org.telegram.messenger.bd.M0(2131750995, null));
                        z26.i = 1;
                        z26.L(g0Var.R1.invites);
                        arrayList4.add(z26);
                        r31 z27 = r31.z(11, org.telegram.messenger.bd.M0(2131751000, null));
                        z27.i = 1;
                        z27.L(g0Var.R1.group_call);
                        arrayList4.add(z27);
                    } else {
                        str2 = null;
                    }
                    r31 A3 = r31.A(g0Var.d1(2), org.telegram.messenger.bd.M0(2131750981, str2), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = g0Var.R1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !g0Var.Y1;
                    A3.D = new bi.q(g0Var, 2, i14);
                    arrayList4.add(A3);
                    if (g0Var.Y1) {
                        str3 = null;
                        r31 z28 = r31.z(13, org.telegram.messenger.bd.M0(2131750998, null));
                        z28.i = 1;
                        z28.L(g0Var.R1.delete);
                        arrayList4.add(z28);
                        r31 z29 = r31.z(14, org.telegram.messenger.bd.M0(2131750997, null));
                        z29.i = 1;
                        z29.L(g0Var.R1.edit);
                        arrayList4.add(z29);
                        r31 z30 = r31.z(15, org.telegram.messenger.bd.M0(2131750986, null));
                        z30.i = 1;
                        z30.L(g0Var.R1.pinned);
                        arrayList4.add(z30);
                    } else {
                        str3 = null;
                    }
                    arrayList4.add(r31.C(str3));
                    arrayList4.add(r31.u(org.telegram.messenger.bd.M0(2131751002, str3)));
                    r31 z31 = r31.z(16, org.telegram.messenger.bd.M0(2131751001, str3));
                    a0.h hVar = g0Var.T1;
                    int m10 = hVar == null ? 0 : hVar.m();
                    ArrayList arrayList5 = g0Var.S1;
                    z31.L(m10 >= (arrayList5 == null ? 0 : arrayList5.size()));
                    arrayList4.add(z31);
                    if (g0Var.S1 != null) {
                        for (int i15 = 0; i15 < g0Var.S1.size(); i15++) {
                            long o10 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) g0Var.S1.get(i15)).peer);
                            TLRPC.User a23 = org.telegram.messenger.hp.s1(g0Var.a).a2(Long.valueOf(o10));
                            r31 r31Var2 = new r31(37);
                            r31Var2.d = (-1) - i15;
                            r31Var2.G = a23;
                            r31Var2.i = 1;
                            a0.h hVar2 = g0Var.T1;
                            r31Var2.L(hVar2 != null && hVar2.d(o10));
                            arrayList4.add(r31Var2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((ChatActivityEnterView) obj3).c0((Canvas) obj, (org.telegram.messenger.m10) obj2);
                break;
            case 5:
                ni niVar = (ni) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                f41 f41Var4 = (f41) obj2;
                int i16 = niVar.Q;
                ArrayList arrayList7 = niVar.N;
                org.telegram.messenger.bp bpVar = niVar.K;
                ArrayList arrayList8 = niVar.L;
                HashSet hashSet = niVar.J;
                ArrayList arrayList9 = niVar.M;
                arrayList6.add(r31.E(-100, org.telegram.messenger.g0.L(1.0f)));
                int size = arrayList6.size();
                if (TextUtils.isEmpty(niVar.E)) {
                    f41Var4.V();
                    int i17 = 0;
                    while (i17 < niVar.I.size()) {
                        org.telegram.messenger.qe qeVar2 = (org.telegram.messenger.qe) niVar.I.get(i17);
                        qeVar2.e.L5(null, z12);
                        r31 i18 = org.telegram.ui.Cells.e7.i(qeVar2, new di(niVar, 0));
                        i18.L(hashSet.contains(qeVar2));
                        i18.d = -1;
                        arrayList6.add(i18);
                        i17++;
                        z12 = z12;
                    }
                    boolean z32 = z12;
                    if (niVar.H) {
                        arrayList6.add(r31.q(11, 4));
                        arrayList6.add(r31.q(12, 4));
                        arrayList6.add(r31.q(13, 4));
                    }
                    f41Var4.U();
                    if (bpVar != null) {
                        ArrayList arrayList10 = bpVar.c;
                        int size2 = arrayList10.size();
                        if (size2 < arrayList8.size()) {
                            arrayList8.subList(size2, arrayList8.size()).clear();
                        }
                        for (int i19 = 0; i19 < size2; i19++) {
                            if (i19 >= arrayList8.size()) {
                                qeVar = new org.telegram.messenger.qe();
                                arrayList8.add(qeVar);
                            } else {
                                qeVar = (org.telegram.messenger.qe) arrayList8.get(i19);
                            }
                            if (qeVar.e != arrayList10.get(i19)) {
                                niVar.m0--;
                                qeVar.e = (org.telegram.messenger.zi) arrayList10.get(i19);
                            }
                        }
                    }
                    if (bpVar != null && arrayList8 != null && !arrayList8.isEmpty()) {
                        if (arrayList6.size() > size) {
                            str6 = null;
                            arrayList6.add(r31.B(-98, null));
                        } else {
                            str6 = null;
                        }
                        f41Var4.V();
                        arrayList6.add(r31.t(45, org.telegram.messenger.bd.M0(2131753904, str6)));
                        for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                            org.telegram.messenger.qe qeVar3 = (org.telegram.messenger.qe) arrayList8.get(i20);
                            r31 i21 = org.telegram.ui.Cells.e7.i(qeVar3, new di(niVar, 0));
                            i21.L(hashSet.contains(qeVar3));
                            arrayList6.add(i21);
                        }
                        if (bpVar.f) {
                            arrayList6.add(r31.q(41, 4));
                            arrayList6.add(r31.q(42, 4));
                            arrayList6.add(r31.q(43, 4));
                        }
                        if (!bpVar.f && !bpVar.e) {
                            r31 c2 = r31.c(niVar.S, R.drawable.arrow_more, org.telegram.messenger.bd.M0(2131745349, null));
                            c2.q = z32;
                            arrayList6.add(c2);
                        }
                        f41Var4.U();
                    }
                    if (arrayList9 != null && (!arrayList9.isEmpty() || niVar.V >= 0 || niVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(r31.B(-98, null));
                        }
                        f41Var4.V();
                        arrayList6.add(r31.t(((niVar.V >= 0 || niVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.bd.M0(2131753907, null)));
                        for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                            org.telegram.messenger.qe qeVar4 = (org.telegram.messenger.qe) arrayList9.get(i22);
                            qeVar4.e.L5(niVar.E, true);
                            r31 i23 = org.telegram.ui.Cells.e7.i(qeVar4, new di(niVar, 0));
                            i23.L(hashSet.contains(qeVar4));
                            arrayList6.add(i23);
                        }
                        if (niVar.V >= 0 || niVar.a0) {
                            arrayList6.add(r31.q(21, 4));
                            arrayList6.add(r31.q(22, 4));
                            arrayList6.add(r31.q(23, 4));
                        }
                        if (niVar.d0) {
                            r31 c10 = r31.c(i16, R.drawable.arrow_more, org.telegram.messenger.bd.M0(2131745349, null));
                            c10.q = true;
                            arrayList6.add(c10);
                        }
                        f41Var4.U();
                    }
                } else {
                    String lowerCase = niVar.E.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    int i24 = 0;
                    boolean z33 = false;
                    while (i24 < niVar.I.size()) {
                        org.telegram.messenger.qe qeVar5 = (org.telegram.messenger.qe) niVar.I.get(i24);
                        String str8 = qeVar5.a;
                        if (str8 != null) {
                            String lowerCase2 = str8.toLowerCase();
                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || k2.p1.z(" ", lowerCase, lowerCase2) || O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                z11 = true;
                                str4 = qeVar5.b;
                                if (str4 == null) {
                                    String lowerCase3 = str4.toLowerCase();
                                    boolean z34 = z11;
                                    String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                    z11 = z34 || lowerCase3.startsWith(lowerCase) || k2.p1.z(" ", lowerCase, lowerCase3) || O33.startsWith(O3) || O33.contains(" ".concat(O3));
                                }
                                if (z11) {
                                    f41Var = f41Var4;
                                } else {
                                    if (!z33) {
                                        if (arrayList6.size() > size) {
                                            str5 = null;
                                            arrayList6.add(r31.B(-97, null));
                                        } else {
                                            str5 = null;
                                        }
                                        f41Var4.V();
                                        arrayList6.add(r31.t(10, org.telegram.messenger.bd.M0(2131753905, str5)));
                                        z33 = true;
                                    }
                                    f41Var = f41Var4;
                                    qeVar5.e.L5(niVar.E, true);
                                    r31 i25 = org.telegram.ui.Cells.e7.i(qeVar5, new di(niVar, 0));
                                    i25.L(hashSet.contains(qeVar5));
                                    i25.d = 10;
                                    arrayList6.add(i25);
                                }
                                i24++;
                                f41Var4 = f41Var;
                            }
                        }
                        z11 = false;
                        str4 = qeVar5.b;
                        if (str4 == null) {
                        }
                        if (z11) {
                        }
                        i24++;
                        f41Var4 = f41Var;
                    }
                    f41 f41Var5 = f41Var4;
                    f41Var5.U();
                    if (arrayList9 != null && (!arrayList9.isEmpty() || niVar.V >= 0 || niVar.a0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(r31.B(-98, null));
                        }
                        f41Var5.V();
                        arrayList6.add(r31.t(((niVar.V >= 0 || niVar.a0) && arrayList9.isEmpty()) ? 25 : 20, org.telegram.messenger.bd.M0(2131753907, null)));
                        for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                            org.telegram.messenger.qe qeVar6 = (org.telegram.messenger.qe) arrayList9.get(i26);
                            qeVar6.e.L5(niVar.E, true);
                            r31 i27 = org.telegram.ui.Cells.e7.i(qeVar6, new di(niVar, 0));
                            i27.L(hashSet.contains(qeVar6));
                            arrayList6.add(i27);
                        }
                        if (niVar.V >= 0 || niVar.a0) {
                            arrayList6.add(r31.q(21, 4));
                            arrayList6.add(r31.q(22, 4));
                            arrayList6.add(r31.q(23, 4));
                        }
                        if (niVar.d0) {
                            r31 c11 = r31.c(i16, R.drawable.arrow_more, org.telegram.messenger.bd.M0(2131745349, null));
                            c11.q = true;
                            arrayList6.add(c11);
                        }
                        f41Var5.U();
                    }
                    if (arrayList7 != null && (!arrayList7.isEmpty() || niVar.e0 >= 0 || niVar.n0)) {
                        if (arrayList6.size() > size) {
                            arrayList6.add(r31.B(-96, null));
                        }
                        f41Var5.V();
                        arrayList6.add(r31.t(((niVar.e0 >= 0 || niVar.n0) && arrayList7.isEmpty()) ? 35 : 30, org.telegram.messenger.bd.M0(2131753906, null)));
                        int size3 = arrayList7.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            org.telegram.messenger.qe qeVar7 = (org.telegram.messenger.qe) arrayList7.get(i28);
                            qeVar7.e.L5(niVar.E, true);
                            r31 i29 = org.telegram.ui.Cells.e7.i(qeVar7, new di(niVar, 0));
                            i29.L(hashSet.contains(qeVar7));
                            arrayList6.add(i29);
                        }
                        if (niVar.e0 >= 0 || niVar.n0) {
                            arrayList6.add(r31.q(31, 4));
                            arrayList6.add(r31.q(32, 4));
                            arrayList6.add(r31.q(33, 4));
                        }
                        if (niVar.h0) {
                            r31 c12 = r31.c(niVar.R, R.drawable.arrow_more, org.telegram.messenger.bd.M0(2131745349, null));
                            c12.q = true;
                            arrayList6.add(c12);
                        }
                        f41Var5.U();
                    }
                }
                if (arrayList6.size() > size || niVar.H) {
                    charSequence = null;
                } else if (TextUtils.isEmpty(niVar.E)) {
                    charSequence = null;
                    String M03 = org.telegram.messenger.bd.M0(2131748253, null);
                    String M04 = org.telegram.messenger.bd.M0(2131748252, null);
                    int i30 = li.b;
                    r31 K = r31.K(li.class);
                    K.l = M03;
                    K.m = M04;
                    arrayList6.add(K);
                } else {
                    charSequence = null;
                    String M05 = org.telegram.messenger.bd.M0(2131748251, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, niVar.E.length() >= 3 ? 2131748249 : 2131748250, niVar.E));
                    int i31 = li.b;
                    r31 K2 = r31.K(li.class);
                    K2.l = M05;
                    K2.m = X2;
                    arrayList6.add(K2);
                }
                arrayList6.add(r31.B(-99, charSequence));
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
                ex exVar = (ex) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = exVar.s;
                int size4 = arrayList12.size();
                int i32 = 0;
                while (i32 < size4) {
                    Object obj4 = arrayList12.get(i32);
                    i32++;
                    xw xwVar = (xw) obj4;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xwVar.b;
                    if (tL_messages_stickerSet != null) {
                        boolean z36 = tL_messages_stickerSet.set.id == exVar.d;
                        int i33 = gx.b;
                        r31 K3 = r31.K(gx.class);
                        long j10 = tL_messages_stickerSet.set.id;
                        K3.d = (int) ((j10 >>> 32) ^ j10);
                        K3.B = j10;
                        K3.G = tL_messages_stickerSet;
                        K3.e = z36;
                        arrayList11.add(K3);
                    } else {
                        TLRPC.StickerSetCovered stickerSetCovered = xwVar.a;
                        if (stickerSetCovered != null) {
                            arrayList11.add(gx.i(stickerSetCovered, xwVar, stickerSetCovered.set.id == exVar.d));
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
                ((h41) obj3).Z((ArrayList) obj, (f41) obj2);
                break;
        }
    }
}
