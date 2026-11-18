package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.yb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.r11;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class y1 extends v4.i0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final /* synthetic */ z1 O;
    public int c;
    public boolean x;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public int y = 0;
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final k N = new k(this, 6);

    public y1(z1 z1Var) {
        this.O = z1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        x1 x1Var;
        z1 z1Var;
        TLRPC.TL_messages_stickerSet o02;
        int i7;
        z1 z1Var2;
        x1 x1Var2;
        j2 j2Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i10;
        x1 x1Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        z1 z1Var3 = this.O;
        x1 x1Var4 = z1Var3.e;
        j2 j2Var2 = z1Var3.s;
        this.I = str;
        k kVar = this.N;
        int i11 = 1;
        if (str != null) {
            z1Var3.f.c(true);
            x1Var4.n(false);
            org.telegram.messenger.g0.r(kVar);
            org.telegram.messenger.g0.h3(kVar, 100L);
            return;
        }
        x1Var4.n(true);
        org.telegram.messenger.g0.r(kVar);
        int i12 = j2.C1;
        ri d02 = ri.d0(j2Var2.a);
        this.y = 0;
        ArrayList arrayList4 = this.s;
        arrayList4.clear();
        this.w.clear();
        SparseIntArray sparseIntArray2 = this.E;
        sparseIntArray2.clear();
        ArrayList arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = this.h;
        arrayList6.clear();
        HashMap hashMap = this.f;
        hashMap.clear();
        this.y++;
        boolean z10 = false;
        arrayList4.add(null);
        ArrayList arrayList7 = this.r;
        arrayList7.clear();
        if (z1Var3.a == 1) {
            if (j2Var2.B1 != null && (j2Var2.K0(0) || j2Var2.K0(1) || j2Var2.K0(2) || j2Var2.K0(3) || j2Var2.K0(4))) {
                arrayList4.add(j2Var2.o1);
                this.y++;
            }
            ArrayList<TLRPC.Document> k02 = d02.k0(2, false);
            if (!k02.isEmpty()) {
                if (this.G == null) {
                    this.G = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.G;
                tL_messages_stickerSet2.documents = k02;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.G.set.title = gd.M0(2131750830, null);
                arrayList5.add(this.G);
            }
            ArrayList<TLRPC.Document> k03 = d02.k0(0, false);
            if (!k03.isEmpty()) {
                if (this.H == null) {
                    this.H = new TLRPC.TL_messages_stickerSet();
                }
                this.H.documents = k03;
                if (j2Var2.A1 != null) {
                    k03.add(0, j2Var2.p1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = gd.M0(2131746169, null);
                arrayList5.add(this.H);
            }
        }
        arrayList5.addAll(d02.u0(z1Var3.a == 0 ? 5 : 0));
        int i13 = 0;
        while (i13 < arrayList5.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i13);
            sparseIntArray2.put(this.y, i13);
            arrayList4.add(z10);
            this.y += i11;
            arrayList4.addAll(tL_messages_stickerSet3.documents);
            this.y = tL_messages_stickerSet3.documents.size() + this.y;
            String str2 = tL_messages_stickerSet3 == this.H ? "recent" : tL_messages_stickerSet3 == this.G ? "fav" : tL_messages_stickerSet3;
            int i14 = 0;
            while (i14 < tL_messages_stickerSet3.documents.size()) {
                hashMap.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i14).id), str2);
                i14++;
                sparseIntArray2 = sparseIntArray2;
            }
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            fx fxVar = new fx();
            fxVar.c = tL_messages_stickerSet3.documents;
            fxVar.b = tL_messages_stickerSet3.set;
            fxVar.f = true;
            fxVar.g = false;
            fxVar.h = true;
            fxVar.e = true;
            if (tL_messages_stickerSet3 == this.G) {
                fxVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.H) {
                fxVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(fxVar);
            arrayList6.add(tL_messages_stickerSet3);
            i13++;
            sparseIntArray2 = sparseIntArray3;
            i11 = 1;
            z10 = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (z1Var3.a == 0) {
            ArrayList arrayList8 = d02.t0[1];
            if (arrayList8 != null) {
                int i15 = 0;
                while (i15 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i15);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        tL_messages_stickerSet = ri.d0(j2Var2.a).o0(ri.b0(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            z1Var2 = z1Var3;
                            x1Var2 = x1Var4;
                            j2Var = j2Var2;
                            arrayList = arrayList8;
                            i7 = i15;
                            if (tL_messages_stickerSet.set != null) {
                                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                    TLRPC.StickerSet stickerSet = ((fx) arrayList7.get(i16)).b;
                                    if (stickerSet == null || stickerSet.id != tL_messages_stickerSet.set.id) {
                                    }
                                }
                                arrayList5.add(tL_messages_stickerSet);
                                arrayList6.add(tL_messages_stickerSet);
                                sparseIntArray = sparseIntArray4;
                                sparseIntArray.put(this.y, i13);
                                i13++;
                                arrayList4.add(null);
                                this.y++;
                                arrayList4.addAll(tL_messages_stickerSet.documents);
                                this.y = tL_messages_stickerSet.documents.size() + this.y;
                                for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                    hashMap.put(Long.valueOf(tL_messages_stickerSet.documents.get(i17).id), tL_messages_stickerSet);
                                }
                                fx fxVar2 = new fx();
                                fxVar2.c = tL_messages_stickerSet.documents;
                                fxVar2.b = tL_messages_stickerSet.set;
                                fxVar2.f = false;
                                fxVar2.g = true;
                                fxVar2.h = true;
                                fxVar2.e = true;
                                arrayList7.add(fxVar2);
                                i15 = i7 + 1;
                                sparseIntArray4 = sparseIntArray;
                                j2Var2 = j2Var;
                                arrayList8 = arrayList;
                                x1Var4 = x1Var2;
                                z1Var3 = z1Var2;
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            j2Var2 = j2Var;
                            arrayList8 = arrayList;
                            x1Var4 = x1Var2;
                            z1Var3 = z1Var2;
                        }
                        z1Var2 = z1Var3;
                        x1Var2 = x1Var4;
                        j2Var = j2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        j2Var2 = j2Var;
                        arrayList8 = arrayList;
                        x1Var4 = x1Var2;
                        z1Var3 = z1Var2;
                    } else {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                            tL_messages_stickerSet4.set = stickerSet2;
                            tL_messages_stickerSet4.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList arrayList9 = arrayList8;
                            i7 = i15;
                            Long valueOf = Long.valueOf(stickerSet2.id);
                            HashMap hashMap2 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList10 = (ArrayList) hashMap2.get(valueOf);
                            tL_messages_stickerSet4.packs = arrayList10;
                            if (arrayList10 == null) {
                                HashMap hashMap3 = new HashMap();
                                j2Var = j2Var2;
                                int i18 = 0;
                                while (i18 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i18);
                                    if (document == null) {
                                        x1Var3 = x1Var4;
                                        arrayList2 = arrayList9;
                                        i10 = i18;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i10 = i18;
                                        ArrayList j3 = org.telegram.messenger.j6.j(fj.V(document, null, null), null);
                                        x1Var3 = x1Var4;
                                        int i19 = 0;
                                        while (i19 < j3.size()) {
                                            String charSequence = ((org.telegram.messenger.h6) j3.get(i19)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j3;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            z1 z1Var4 = z1Var3;
                                            i19 = com.google.android.gms.internal.vision.e2.g(i19, 1, document.id, arrayList3);
                                            z1Var3 = z1Var4;
                                            j3 = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i18 = i10 + 1;
                                    arrayList9 = arrayList2;
                                    x1Var4 = x1Var3;
                                    z1Var3 = z1Var3;
                                }
                                z1Var2 = z1Var3;
                                x1Var2 = x1Var4;
                                arrayList = arrayList9;
                                tL_messages_stickerSet4.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap3.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet4.packs.add(tL_stickerPack);
                                }
                                hashMap2.put(Long.valueOf(tL_messages_stickerSet4.set.id), tL_messages_stickerSet4.packs);
                            } else {
                                z1Var2 = z1Var3;
                                x1Var2 = x1Var4;
                                j2Var = j2Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            j2Var2 = j2Var;
                            arrayList8 = arrayList;
                            x1Var4 = x1Var2;
                            z1Var3 = z1Var2;
                        }
                        z1Var2 = z1Var3;
                        x1Var2 = x1Var4;
                        j2Var = j2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        j2Var2 = j2Var;
                        arrayList8 = arrayList;
                        x1Var4 = x1Var2;
                        z1Var3 = z1Var2;
                    }
                }
            }
            z1 z1Var5 = z1Var3;
            x1Var = x1Var4;
            boolean z11 = false;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                try {
                    z11 = ((TLRPC.TL_messages_stickerSet) arrayList6.get(i20)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z11) {
                    break;
                }
            }
            if (!z11 && (o02 = d02.o0(this.F, false)) != null) {
                arrayList6.add(o02);
            }
            z1Var = z1Var5;
        } else {
            x1Var = x1Var4;
            z1Var = z1Var3;
        }
        z1Var.r = true;
        if (this.c != arrayList6.size()) {
            HashMap hashMap4 = this.d;
            hashMap4.clear();
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i21);
                if (tL_messages_stickerSet5 != null) {
                    for (int i22 = 0; i22 < tL_messages_stickerSet5.packs.size(); i22++) {
                        String str3 = tL_messages_stickerSet5.packs.get(i22).emoticon;
                        ArrayList arrayList13 = (ArrayList) hashMap4.get(str3);
                        if (arrayList13 == null) {
                            arrayList13 = new ArrayList();
                            hashMap4.put(str3, arrayList13);
                        }
                        arrayList13.addAll(tL_messages_stickerSet5.packs.get(i22).documents);
                    }
                }
            }
            this.c = arrayList6.size();
        }
        this.x = false;
        x1Var.p(arrayList7);
        this.J = null;
        f();
    }

    @Override // v4.i0
    public final int b() {
        return this.y;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.x && i7 == this.y - 1) {
            return 3;
        }
        if (this.E.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i7 >= arrayList.size() || arrayList.get(i7) != this.O.s.o1) ? 2 : 4;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.O;
        j2 j2Var = z1Var.s;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) j2Var.s1));
            return;
        }
        if (i10 == 1) {
            int i11 = this.E.get(i7);
            if (i11 >= 0) {
                ArrayList arrayList = this.n;
                if (i11 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i11);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                if (this.J == null) {
                    k8Var.a(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.J.toLowerCase());
                if (indexOf < 0) {
                    k8Var.a(0, str);
                    return;
                } else {
                    k8Var.b(str, 0, null, indexOf, this.J.length());
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                w1 w1Var = (w1) view;
                int i12 = this.L;
                if (w1Var.b != i12) {
                    w1Var.b = i12;
                    r11.D(j10.t0, w1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i7 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i7);
        n1 n1Var = (n1) view;
        if (document == j2Var.p1) {
            n1Var.setSticker(null);
            if (n1Var.a == null) {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                int i13 = org.telegram.ui.ActionBar.n6.Ef;
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i13);
                org.telegram.ui.ActionBar.u6.k(n1Var, d02, K.a, -1, 2, K.d, j2Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = z1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.u6.x(n1Var, mutate, i13, j2Var.J0, PorterDuff.Mode.MULTIPLY);
                mq mqVar = new mq(d02, mutate);
                int L = org.telegram.messenger.g0.L(56.0f);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                mqVar.h = L;
                mqVar.n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                mqVar.e = L3;
                mqVar.f = L4;
                mqVar.r = true;
                n1Var.a = mqVar;
            }
            n1Var.setDrawable(n1Var.a);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i14 = z1Var.a;
        if (i14 != 0) {
            n1Var.a(null, i14 == 1);
            n1Var.setSticker(document);
            return;
        }
        if (document != null) {
            n1Var.setSticker(null);
            n1Var.a(document, z1Var.a == 1);
            return;
        }
        n1Var.setSticker(null);
        boolean z10 = z1Var.a == 1;
        if (n1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.o5 o5Var = n1Var.d;
        if (o5Var != null) {
            o5Var.n(n1Var);
        }
        if (longValue == 0) {
            n1Var.b = false;
            n1Var.h = 0L;
            n1Var.d = null;
            return;
        }
        n1Var.b = true;
        n1Var.h = longValue;
        org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(n1Var.c, longValue, null, pc.e(z10 ? 1 : 16388) ? 3 : 13);
        n1Var.d = m10;
        if (n1Var.w) {
            m10.a(n1Var);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View k8Var;
        z1 z1Var = this.O;
        j2 j2Var = z1Var.s;
        if (i7 == 0) {
            k8Var = new View(z1Var.getContext());
        } else if (i7 == 1) {
            Context context = z1Var.getContext();
            int i10 = j2.C1;
            k8Var = new org.telegram.ui.Cells.k8(context, true, false, j2Var.J0, false);
        } else if (i7 == 3) {
            Context context2 = z1Var.getContext();
            boolean z10 = z1Var.a == 0;
            w1 w1Var = new w1(context2);
            w1Var.b = -1;
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context2);
            w1Var.a = q9Var;
            w1Var.addView(q9Var, c8.ma.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(gd.M0(z10 ? 2131748021 : 2131747957, null));
            w1Var.addView(textView, c8.ma.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            k8Var = w1Var;
        } else if (i7 == 4) {
            yb ybVar = new yb(j2Var, z1Var.getContext());
            ybVar.f = new e1(j2Var, 2);
            k8Var = ybVar;
        } else {
            k8Var = new n1(z1Var.getContext(), z1Var.b);
        }
        return new kj0(k8Var);
    }
}
