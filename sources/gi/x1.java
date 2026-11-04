package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.mf;
import ci.fc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.xp;
import org.telegram.ui.g11;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x1 extends u4.h0 {
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
    public final ei.z5 N = new ei.z5(this, 23);

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
        int i3;
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
        ei.z5 z5Var = this.N;
        int i11 = 1;
        if (str != null) {
            y1Var3.f.c(true);
            w1Var4.n(false);
            org.telegram.messenger.g0.r(z5Var);
            org.telegram.messenger.g0.i3(z5Var, 100L);
            return;
        }
        w1Var4.n(true);
        org.telegram.messenger.g0.r(z5Var);
        int i12 = i2.z1;
        li b02 = li.b0(i2Var2.a);
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
            if (i2Var2.y1 != null && (i2Var2.J0(0) || i2Var2.J0(1) || i2Var2.J0(2) || i2Var2.J0(3) || i2Var2.J0(4))) {
                arrayList4.add(i2Var2.l1);
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
                this.G.set.title = bd.M0(2131750842, null);
                arrayList5.add(this.G);
            }
            ArrayList<TLRPC.Document> i03 = b02.i0(0, false);
            if (!i03.isEmpty()) {
                if (this.H == null) {
                    this.H = new TLRPC.TL_messages_stickerSet();
                }
                this.H.documents = i03;
                if (i2Var2.x1 != null) {
                    i03.add(0, i2Var2.m1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = bd.M0(2131746372, null);
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
            sw swVar = new sw();
            swVar.c = tL_messages_stickerSet3.documents;
            swVar.b = tL_messages_stickerSet3.set;
            swVar.f = true;
            swVar.g = false;
            swVar.h = true;
            swVar.e = true;
            if (tL_messages_stickerSet3 == this.G) {
                swVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.H) {
                swVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(swVar);
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
                        tL_messages_stickerSet = li.b0(i2Var2.a).m0(li.Z(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            y1Var2 = y1Var3;
                            w1Var2 = w1Var4;
                            i2Var = i2Var2;
                            arrayList = arrayList8;
                            i3 = i15;
                            if (tL_messages_stickerSet.set != null) {
                                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                    TLRPC.StickerSet stickerSet = ((sw) arrayList7.get(i16)).b;
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
                                sw swVar2 = new sw();
                                swVar2.c = tL_messages_stickerSet.documents;
                                swVar2.b = tL_messages_stickerSet.set;
                                swVar2.f = false;
                                swVar2.g = true;
                                swVar2.h = true;
                                swVar2.e = true;
                                arrayList7.add(swVar2);
                                i15 = i3 + 1;
                                sparseIntArray4 = sparseIntArray;
                                i2Var2 = i2Var;
                                arrayList8 = arrayList;
                                w1Var4 = w1Var2;
                                y1Var3 = y1Var2;
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i3 + 1;
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
                        i3 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i3 + 1;
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
                            i3 = i15;
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
                                        ArrayList j10 = org.telegram.messenger.i6.j(zi.V(document, null, null), null);
                                        w1Var3 = w1Var4;
                                        int i19 = 0;
                                        while (i19 < j10.size()) {
                                            String charSequence = ((org.telegram.messenger.g6) j10.get(i19)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j10;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            y1 y1Var4 = y1Var3;
                                            i19 = a1.g.h(i19, 1, document.id, arrayList3);
                                            y1Var3 = y1Var4;
                                            j10 = arrayList12;
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
                            i15 = i3 + 1;
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
                        i3 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i3 + 1;
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

    @Override // u4.h0
    public final int b() {
        return this.y;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.x && i3 == this.y - 1) {
            return 3;
        }
        if (this.E.get(i3, -1) >= 0) {
            return 1;
        }
        if (i3 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i3 >= arrayList.size() || arrayList.get(i3) != this.O.s.l1) ? 2 : 4;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.StickerSet stickerSet;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.s;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new u4.p0(-1, (int) i2Var.p1));
            return;
        }
        if (i10 == 1) {
            int i11 = this.E.get(i3);
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
                    g11.D(h10.t0, v1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i3 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i3);
        l1 l1Var = (l1) view;
        if (document == i2Var.m1) {
            l1Var.setSticker(null);
            if (l1Var.a == null) {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                int i13 = org.telegram.ui.ActionBar.k6.Bf;
                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.12f, i13);
                org.telegram.ui.ActionBar.r6.l(l1Var, d02, L.a, -1, 2, L.d, i2Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = y1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.r6.y(l1Var, mutate, i13, i2Var.J0, PorterDuff.Mode.MULTIPLY);
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
        long longValue = i3 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i3)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i14 = y1Var.a;
        if (i14 != 0) {
            l1Var.a(null, i14 == 1);
            l1Var.setSticker(document);
            return;
        }
        if (document != null) {
            l1Var.setSticker(null);
            l1Var.a(document, y1Var.a == 1);
            return;
        }
        l1Var.setSticker(null);
        boolean z10 = y1Var.a == 1;
        if (l1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.g5 g5Var = l1Var.d;
        if (g5Var != null) {
            g5Var.n(l1Var);
        }
        if (longValue == 0) {
            l1Var.b = false;
            l1Var.h = 0L;
            l1Var.d = null;
            return;
        }
        l1Var.b = true;
        l1Var.h = longValue;
        org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(l1Var.c, longValue, null, lc.e(z10 ? 1 : 16388) ? 3 : 13);
        l1Var.d = m10;
        if (l1Var.w) {
            m10.a(l1Var);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View i8Var;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.s;
        if (i3 == 0) {
            i8Var = new View(y1Var.getContext());
        } else if (i3 == 1) {
            Context context = y1Var.getContext();
            int i10 = i2.z1;
            i8Var = new org.telegram.ui.Cells.i8(context, true, false, i2Var.J0, false);
        } else if (i3 == 3) {
            Context context2 = y1Var.getContext();
            boolean z10 = y1Var.a == 0;
            v1 v1Var = new v1(context2);
            v1Var.b = -1;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
            v1Var.a = k9Var;
            v1Var.addView(k9Var, mf.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(bd.M0(z10 ? 2131748221 : 2131748157, null));
            v1Var.addView(textView, mf.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            i8Var = v1Var;
        } else if (i3 == 4) {
            fc fcVar = new fc(i2Var, y1Var.getContext());
            fcVar.f = new c1(i2Var, 2);
            i8Var = fcVar;
        } else {
            i8Var = new l1(y1Var.getContext(), y1Var.b);
        }
        return new bj0(i8Var);
    }
}
