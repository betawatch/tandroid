package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.nd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uw;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y1 extends v4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final /* synthetic */ z1 N;
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
    public final SparseIntArray D = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final di.s7 M = new di.s7(this, 19);

    public y1(z1 z1Var) {
        this.N = z1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        w1 w1Var;
        z1 z1Var;
        TLRPC.TL_messages_stickerSet m0;
        int i7;
        z1 z1Var2;
        w1 w1Var2;
        k2 k2Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i10;
        w1 w1Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        z1 z1Var3 = this.N;
        w1 w1Var4 = z1Var3.e;
        k2 k2Var2 = z1Var3.s;
        this.H = str;
        di.s7 s7Var = this.M;
        int i11 = 1;
        if (str != null) {
            z1Var3.f.c(true);
            w1Var4.n(false);
            org.telegram.messenger.g0.r(s7Var);
            org.telegram.messenger.g0.i3(s7Var, 100L);
            return;
        }
        w1Var4.n(true);
        org.telegram.messenger.g0.r(s7Var);
        int i12 = k2.y1;
        ui b02 = ui.b0(k2Var2.a);
        this.y = 0;
        ArrayList arrayList4 = this.s;
        arrayList4.clear();
        this.w.clear();
        SparseIntArray sparseIntArray2 = this.D;
        sparseIntArray2.clear();
        ArrayList arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = this.h;
        arrayList6.clear();
        HashMap hashMap = this.f;
        hashMap.clear();
        this.y++;
        boolean z9 = false;
        arrayList4.add(null);
        ArrayList arrayList7 = this.r;
        arrayList7.clear();
        if (z1Var3.a == 1) {
            if (k2Var2.x1 != null && (k2Var2.J0(0) || k2Var2.J0(1) || k2Var2.J0(2) || k2Var2.J0(3) || k2Var2.J0(4))) {
                arrayList4.add(k2Var2.k1);
                this.y++;
            }
            ArrayList<TLRPC.Document> i02 = b02.i0(2, false);
            if (!i02.isEmpty()) {
                if (this.F == null) {
                    this.F = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.F;
                tL_messages_stickerSet2.documents = i02;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.F.set.title = id.M0(2131750842, null);
                arrayList5.add(this.F);
            }
            ArrayList<TLRPC.Document> i03 = b02.i0(0, false);
            if (!i03.isEmpty()) {
                if (this.G == null) {
                    this.G = new TLRPC.TL_messages_stickerSet();
                }
                this.G.documents = i03;
                if (k2Var2.w1 != null) {
                    i03.add(0, k2Var2.l1);
                }
                this.G.set = new TLRPC.TL_stickerSet();
                this.G.set.title = id.M0(2131746365, null);
                arrayList5.add(this.G);
            }
        }
        arrayList5.addAll(b02.s0(z1Var3.a == 0 ? 5 : 0));
        int i13 = 0;
        while (i13 < arrayList5.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i13);
            sparseIntArray2.put(this.y, i13);
            arrayList4.add(z9);
            this.y += i11;
            arrayList4.addAll(tL_messages_stickerSet3.documents);
            this.y = tL_messages_stickerSet3.documents.size() + this.y;
            String str2 = tL_messages_stickerSet3 == this.G ? "recent" : tL_messages_stickerSet3 == this.F ? "fav" : tL_messages_stickerSet3;
            int i14 = 0;
            while (i14 < tL_messages_stickerSet3.documents.size()) {
                hashMap.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i14).id), str2);
                i14++;
                sparseIntArray2 = sparseIntArray2;
            }
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            uw uwVar = new uw();
            uwVar.c = tL_messages_stickerSet3.documents;
            uwVar.b = tL_messages_stickerSet3.set;
            uwVar.f = true;
            uwVar.g = false;
            uwVar.h = true;
            uwVar.e = true;
            if (tL_messages_stickerSet3 == this.F) {
                uwVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.G) {
                uwVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(uwVar);
            arrayList6.add(tL_messages_stickerSet3);
            i13++;
            sparseIntArray2 = sparseIntArray3;
            i11 = 1;
            z9 = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (z1Var3.a == 0) {
            ArrayList arrayList8 = b02.s0[1];
            if (arrayList8 != null) {
                int i15 = 0;
                while (i15 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i15);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        tL_messages_stickerSet = ui.b0(k2Var2.a).m0(ui.Z(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            z1Var2 = z1Var3;
                            w1Var2 = w1Var4;
                            k2Var = k2Var2;
                            arrayList = arrayList8;
                            i7 = i15;
                            if (tL_messages_stickerSet.set != null) {
                                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                    TLRPC.StickerSet stickerSet = ((uw) arrayList7.get(i16)).b;
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
                                uw uwVar2 = new uw();
                                uwVar2.c = tL_messages_stickerSet.documents;
                                uwVar2.b = tL_messages_stickerSet.set;
                                uwVar2.f = false;
                                uwVar2.g = true;
                                uwVar2.h = true;
                                uwVar2.e = true;
                                arrayList7.add(uwVar2);
                                i15 = i7 + 1;
                                sparseIntArray4 = sparseIntArray;
                                k2Var2 = k2Var;
                                arrayList8 = arrayList;
                                w1Var4 = w1Var2;
                                z1Var3 = z1Var2;
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            k2Var2 = k2Var;
                            arrayList8 = arrayList;
                            w1Var4 = w1Var2;
                            z1Var3 = z1Var2;
                        }
                        z1Var2 = z1Var3;
                        w1Var2 = w1Var4;
                        k2Var = k2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        k2Var2 = k2Var;
                        arrayList8 = arrayList;
                        w1Var4 = w1Var2;
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
                                k2Var = k2Var2;
                                int i18 = 0;
                                while (i18 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i18);
                                    if (document == null) {
                                        w1Var3 = w1Var4;
                                        arrayList2 = arrayList9;
                                        i10 = i18;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i10 = i18;
                                        ArrayList j3 = org.telegram.messenger.i6.j(ij.V(document, null, null), null);
                                        w1Var3 = w1Var4;
                                        int i19 = 0;
                                        while (i19 < j3.size()) {
                                            String charSequence = ((org.telegram.messenger.g6) j3.get(i19)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j3;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            z1 z1Var4 = z1Var3;
                                            i19 = com.google.android.recaptcha.internal.a.g(i19, 1, document.id, arrayList3);
                                            z1Var3 = z1Var4;
                                            j3 = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i18 = i10 + 1;
                                    arrayList9 = arrayList2;
                                    w1Var4 = w1Var3;
                                    z1Var3 = z1Var3;
                                }
                                z1Var2 = z1Var3;
                                w1Var2 = w1Var4;
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
                                w1Var2 = w1Var4;
                                k2Var = k2Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            k2Var2 = k2Var;
                            arrayList8 = arrayList;
                            w1Var4 = w1Var2;
                            z1Var3 = z1Var2;
                        }
                        z1Var2 = z1Var3;
                        w1Var2 = w1Var4;
                        k2Var = k2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        k2Var2 = k2Var;
                        arrayList8 = arrayList;
                        w1Var4 = w1Var2;
                        z1Var3 = z1Var2;
                    }
                }
            }
            z1 z1Var5 = z1Var3;
            w1Var = w1Var4;
            boolean z10 = false;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                try {
                    z10 = ((TLRPC.TL_messages_stickerSet) arrayList6.get(i20)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z10) {
                    break;
                }
            }
            if (!z10 && (m0 = b02.m0(this.E, false)) != null) {
                arrayList6.add(m0);
            }
            z1Var = z1Var5;
        } else {
            w1Var = w1Var4;
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
        w1Var.p(arrayList7);
        this.I = null;
        f();
    }

    @Override // v4.g0
    public final int b() {
        return this.y;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.x && i7 == this.y - 1) {
            return 3;
        }
        if (this.D.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i7 >= arrayList.size() || arrayList.get(i7) != this.N.s.k1) ? 2 : 4;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.N;
        k2 k2Var = z1Var.s;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.o0(-1, (int) k2Var.o1));
            return;
        }
        if (i10 == 1) {
            int i11 = this.D.get(i7);
            if (i11 >= 0) {
                ArrayList arrayList = this.n;
                if (i11 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i11);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                if (this.I == null) {
                    j8Var.a(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.I.toLowerCase());
                if (indexOf < 0) {
                    j8Var.a(0, str);
                    return;
                } else {
                    j8Var.b(str, 0, null, indexOf, this.I.length());
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                v1 v1Var = (v1) view;
                int i12 = this.K;
                if (v1Var.b != i12) {
                    v1Var.b = i12;
                    q11.D(p10.s0, v1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i7 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i7);
        l1 l1Var = (l1) view;
        if (document == k2Var.l1) {
            l1Var.setSticker(null);
            if (l1Var.a == null) {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                int i13 = org.telegram.ui.ActionBar.k6.Bf;
                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.12f, i13);
                org.telegram.ui.ActionBar.r6.l(l1Var, d02, L.a, -1, 2, L.d, k2Var.I0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = z1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.r6.y(l1Var, mutate, i13, k2Var.I0, PorterDuff.Mode.MULTIPLY);
                xp xpVar = new xp(d02, mutate);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                int L3 = org.telegram.messenger.g0.L(56.0f);
                xpVar.h = L2;
                xpVar.n = L3;
                int L4 = org.telegram.messenger.g0.L(24.0f);
                int L5 = org.telegram.messenger.g0.L(24.0f);
                xpVar.e = L4;
                xpVar.f = L5;
                xpVar.r = true;
                l1Var.a = xpVar;
            }
            l1Var.setDrawable(l1Var.a);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i14 = z1Var.a;
        if (i14 != 0) {
            l1Var.a(null, i14 == 1);
            l1Var.setSticker(document);
            return;
        }
        if (document != null) {
            l1Var.setSticker(null);
            l1Var.a(document, z1Var.a == 1);
            return;
        }
        l1Var.setSticker(null);
        boolean z9 = z1Var.a == 1;
        if (l1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.i5 i5Var = l1Var.d;
        if (i5Var != null) {
            i5Var.n(l1Var);
        }
        if (longValue == 0) {
            l1Var.b = false;
            l1Var.h = 0L;
            l1Var.d = null;
            return;
        }
        l1Var.b = true;
        l1Var.h = longValue;
        org.telegram.ui.Components.i5 m10 = org.telegram.ui.Components.i5.m(l1Var.c, longValue, null, sc.e(z9 ? 1 : 16388) ? 3 : 13);
        l1Var.d = m10;
        if (l1Var.w) {
            m10.a(l1Var);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View j8Var;
        z1 z1Var = this.N;
        k2 k2Var = z1Var.s;
        if (i7 == 0) {
            j8Var = new View(z1Var.getContext());
        } else if (i7 == 1) {
            Context context = z1Var.getContext();
            int i10 = k2.y1;
            j8Var = new org.telegram.ui.Cells.j8(context, true, false, k2Var.I0, false);
        } else if (i7 == 3) {
            Context context2 = z1Var.getContext();
            boolean z9 = z1Var.a == 0;
            v1 v1Var = new v1(context2);
            v1Var.b = -1;
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context2);
            v1Var.a = l9Var;
            v1Var.addView(l9Var, c8.ha.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(id.M0(z9 ? 2131748214 : 2131748150, null));
            v1Var.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = v1Var;
        } else if (i7 == 4) {
            nd ndVar = new nd(k2Var, z1Var.getContext());
            ndVar.f = new c1(k2Var, 2);
            j8Var = ndVar;
        } else {
            j8Var = new l1(z1Var.getContext(), z1Var.b);
        }
        return new xi0(j8Var);
    }
}
