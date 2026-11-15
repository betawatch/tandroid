package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.ub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.zw;
import org.telegram.ui.n11;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x1 extends v4.h0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final /* synthetic */ y1 O;
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
    public final e1 N = new e1(this, 2);

    public x1(y1 y1Var) {
        this.O = y1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        w1 w1Var;
        y1 y1Var;
        TLRPC.TL_messages_stickerSet m0;
        int i7;
        y1 y1Var2;
        w1 w1Var2;
        i2 i2Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i10;
        w1 w1Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        y1 y1Var3 = this.O;
        w1 w1Var4 = y1Var3.e;
        i2 i2Var2 = y1Var3.s;
        this.I = str;
        e1 e1Var = this.N;
        int i11 = 1;
        if (str != null) {
            y1Var3.f.c(true);
            w1Var4.n(false);
            org.telegram.messenger.g0.r(e1Var);
            org.telegram.messenger.g0.i3(e1Var, 100L);
            return;
        }
        w1Var4.n(true);
        org.telegram.messenger.g0.r(e1Var);
        int i12 = i2.C1;
        si b02 = si.b0(i2Var2.a);
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
        if (y1Var3.a == 1) {
            if (i2Var2.B1 != null && (i2Var2.J0(0) || i2Var2.J0(1) || i2Var2.J0(2) || i2Var2.J0(3) || i2Var2.J0(4))) {
                arrayList4.add(i2Var2.o1);
                this.y++;
            }
            ArrayList<TLRPC.Document> i02 = b02.i0(2, false);
            if (!i02.isEmpty()) {
                if (this.G == null) {
                    this.G = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.G;
                tL_messages_stickerSet2.documents = i02;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.G.set.title = hd.M0(2131750841, null);
                arrayList5.add(this.G);
            }
            ArrayList<TLRPC.Document> i03 = b02.i0(0, false);
            if (!i03.isEmpty()) {
                if (this.H == null) {
                    this.H = new TLRPC.TL_messages_stickerSet();
                }
                this.H.documents = i03;
                if (i2Var2.A1 != null) {
                    i03.add(0, i2Var2.p1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = hd.M0(2131746364, null);
                arrayList5.add(this.H);
            }
        }
        arrayList5.addAll(b02.s0(y1Var3.a == 0 ? 5 : 0));
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
            zw zwVar = new zw();
            zwVar.c = tL_messages_stickerSet3.documents;
            zwVar.b = tL_messages_stickerSet3.set;
            zwVar.f = true;
            zwVar.g = false;
            zwVar.h = true;
            zwVar.e = true;
            if (tL_messages_stickerSet3 == this.G) {
                zwVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.H) {
                zwVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(zwVar);
            arrayList6.add(tL_messages_stickerSet3);
            i13++;
            sparseIntArray2 = sparseIntArray3;
            i11 = 1;
            z10 = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (y1Var3.a == 0) {
            ArrayList arrayList8 = b02.t0[1];
            if (arrayList8 != null) {
                int i15 = 0;
                while (i15 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i15);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        tL_messages_stickerSet = si.b0(i2Var2.a).m0(si.Z(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            y1Var2 = y1Var3;
                            w1Var2 = w1Var4;
                            i2Var = i2Var2;
                            arrayList = arrayList8;
                            i7 = i15;
                            if (tL_messages_stickerSet.set != null) {
                                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                    TLRPC.StickerSet stickerSet = ((zw) arrayList7.get(i16)).b;
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
                                zw zwVar2 = new zw();
                                zwVar2.c = tL_messages_stickerSet.documents;
                                zwVar2.b = tL_messages_stickerSet.set;
                                zwVar2.f = false;
                                zwVar2.g = true;
                                zwVar2.h = true;
                                zwVar2.e = true;
                                arrayList7.add(zwVar2);
                                i15 = i7 + 1;
                                sparseIntArray4 = sparseIntArray;
                                i2Var2 = i2Var;
                                arrayList8 = arrayList;
                                w1Var4 = w1Var2;
                                y1Var3 = y1Var2;
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            i2Var2 = i2Var;
                            arrayList8 = arrayList;
                            w1Var4 = w1Var2;
                            y1Var3 = y1Var2;
                        }
                        y1Var2 = y1Var3;
                        w1Var2 = w1Var4;
                        i2Var = i2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        i2Var2 = i2Var;
                        arrayList8 = arrayList;
                        w1Var4 = w1Var2;
                        y1Var3 = y1Var2;
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
                                i2Var = i2Var2;
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
                                        ArrayList j3 = org.telegram.messenger.j6.j(gj.V(document, null, null), null);
                                        w1Var3 = w1Var4;
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
                                            y1 y1Var4 = y1Var3;
                                            i19 = com.google.android.gms.internal.vision.e2.g(i19, 1, document.id, arrayList3);
                                            y1Var3 = y1Var4;
                                            j3 = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i18 = i10 + 1;
                                    arrayList9 = arrayList2;
                                    w1Var4 = w1Var3;
                                    y1Var3 = y1Var3;
                                }
                                y1Var2 = y1Var3;
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
                                y1Var2 = y1Var3;
                                w1Var2 = w1Var4;
                                i2Var = i2Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            i2Var2 = i2Var;
                            arrayList8 = arrayList;
                            w1Var4 = w1Var2;
                            y1Var3 = y1Var2;
                        }
                        y1Var2 = y1Var3;
                        w1Var2 = w1Var4;
                        i2Var = i2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        i2Var2 = i2Var;
                        arrayList8 = arrayList;
                        w1Var4 = w1Var2;
                        y1Var3 = y1Var2;
                    }
                }
            }
            y1 y1Var5 = y1Var3;
            w1Var = w1Var4;
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
            if (!z11 && (m0 = b02.m0(this.F, false)) != null) {
                arrayList6.add(m0);
            }
            y1Var = y1Var5;
        } else {
            w1Var = w1Var4;
            y1Var = y1Var3;
        }
        y1Var.r = true;
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
        this.J = null;
        f();
    }

    @Override // v4.h0
    public final int b() {
        return this.y;
    }

    @Override // v4.h0
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

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.StickerSet stickerSet;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.s;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.p0(-1, (int) i2Var.s1));
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
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                if (this.J == null) {
                    i8Var.a(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.J.toLowerCase());
                if (indexOf < 0) {
                    i8Var.a(0, str);
                    return;
                } else {
                    i8Var.b(str, 0, null, indexOf, this.J.length());
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                v1 v1Var = (v1) view;
                int i12 = this.L;
                if (v1Var.b != i12) {
                    v1Var.b = i12;
                    n11.D(m10.t0, v1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i7 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i7);
        n1 n1Var = (n1) view;
        if (document == i2Var.p1) {
            n1Var.setSticker(null);
            if (n1Var.a == null) {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                int i13 = org.telegram.ui.ActionBar.j6.Ef;
                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i13);
                org.telegram.ui.ActionBar.q6.k(n1Var, d02, K.a, -1, 2, K.d, i2Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = y1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.q6.x(n1Var, mutate, i13, i2Var.J0, PorterDuff.Mode.MULTIPLY);
                fq fqVar = new fq(d02, mutate);
                int L = org.telegram.messenger.g0.L(56.0f);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                fqVar.h = L;
                fqVar.n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                fqVar.e = L3;
                fqVar.f = L4;
                fqVar.r = true;
                n1Var.a = fqVar;
            }
            n1Var.setDrawable(n1Var.a);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i14 = y1Var.a;
        if (i14 != 0) {
            n1Var.a(null, i14 == 1);
            n1Var.setSticker(document);
            return;
        }
        if (document != null) {
            n1Var.setSticker(null);
            n1Var.a(document, y1Var.a == 1);
            return;
        }
        n1Var.setSticker(null);
        boolean z10 = y1Var.a == 1;
        if (n1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.g5 g5Var = n1Var.d;
        if (g5Var != null) {
            g5Var.n(n1Var);
        }
        if (longValue == 0) {
            n1Var.b = false;
            n1Var.h = 0L;
            n1Var.d = null;
            return;
        }
        n1Var.b = true;
        n1Var.h = longValue;
        org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(n1Var.c, longValue, null, qc.e(z10 ? 1 : 16388) ? 3 : 13);
        n1Var.d = m10;
        if (n1Var.w) {
            m10.a(n1Var);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View i8Var;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.s;
        if (i7 == 0) {
            i8Var = new View(y1Var.getContext());
        } else if (i7 == 1) {
            Context context = y1Var.getContext();
            int i10 = i2.C1;
            i8Var = new org.telegram.ui.Cells.i8(context, true, false, i2Var.J0, false);
        } else if (i7 == 3) {
            Context context2 = y1Var.getContext();
            boolean z10 = y1Var.a == 0;
            v1 v1Var = new v1(context2);
            v1Var.b = -1;
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context2);
            v1Var.a = i9Var;
            v1Var.addView(i9Var, c8.ja.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(hd.M0(z10 ? 2131748213 : 2131748149, null));
            v1Var.addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            i8Var = v1Var;
        } else if (i7 == 4) {
            ub ubVar = new ub(i2Var, y1Var.getContext());
            ubVar.f = new d1(i2Var, 2);
            i8Var = ubVar;
        } else {
            i8Var = new n1(y1Var.getContext(), y1Var.b);
        }
        return new cj0(i8Var);
    }
}
