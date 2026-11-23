package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f2 extends v4.i0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final /* synthetic */ g2 O;
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
    public final w N = new w(this, 7);

    public f2(g2 g2Var) {
        this.O = g2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        e2 e2Var;
        g2 g2Var;
        TLRPC.TL_messages_stickerSet o02;
        int i7;
        g2 g2Var2;
        e2 e2Var2;
        r2 r2Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i10;
        e2 e2Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        g2 g2Var3 = this.O;
        e2 e2Var4 = g2Var3.e;
        r2 r2Var2 = g2Var3.s;
        this.I = str;
        w wVar = this.N;
        int i11 = 1;
        if (str != null) {
            g2Var3.f.c(true);
            e2Var4.n(false);
            org.telegram.messenger.g0.r(wVar);
            org.telegram.messenger.g0.h3(wVar, 100L);
            return;
        }
        e2Var4.n(true);
        org.telegram.messenger.g0.r(wVar);
        int i12 = r2.D1;
        ri d02 = ri.d0(r2Var2.a);
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
        if (g2Var3.a == 1) {
            if (r2Var2.B1 != null && (r2Var2.K0(0) || r2Var2.K0(1) || r2Var2.K0(2) || r2Var2.K0(3) || r2Var2.K0(4))) {
                arrayList4.add(r2Var2.o1);
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
                this.G.set.title = gd.N0(2131750829, null);
                arrayList5.add(this.G);
            }
            ArrayList<TLRPC.Document> k03 = d02.k0(0, false);
            if (!k03.isEmpty()) {
                if (this.H == null) {
                    this.H = new TLRPC.TL_messages_stickerSet();
                }
                this.H.documents = k03;
                if (r2Var2.A1 != null) {
                    k03.add(0, r2Var2.p1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = gd.N0(2131746168, null);
                arrayList5.add(this.H);
            }
        }
        arrayList5.addAll(d02.u0(g2Var3.a == 0 ? 5 : 0));
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
            ex exVar = new ex();
            exVar.c = tL_messages_stickerSet3.documents;
            exVar.b = tL_messages_stickerSet3.set;
            exVar.f = true;
            exVar.g = false;
            exVar.h = true;
            exVar.e = true;
            if (tL_messages_stickerSet3 == this.G) {
                exVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.H) {
                exVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(exVar);
            arrayList6.add(tL_messages_stickerSet3);
            i13++;
            sparseIntArray2 = sparseIntArray3;
            i11 = 1;
            z10 = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (g2Var3.a == 0) {
            ArrayList arrayList8 = d02.t0[1];
            if (arrayList8 != null) {
                int i15 = 0;
                while (i15 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i15);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        tL_messages_stickerSet = ri.d0(r2Var2.a).o0(ri.b0(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            g2Var2 = g2Var3;
                            e2Var2 = e2Var4;
                            r2Var = r2Var2;
                            arrayList = arrayList8;
                            i7 = i15;
                            if (tL_messages_stickerSet.set != null) {
                                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                    TLRPC.StickerSet stickerSet = ((ex) arrayList7.get(i16)).b;
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
                                ex exVar2 = new ex();
                                exVar2.c = tL_messages_stickerSet.documents;
                                exVar2.b = tL_messages_stickerSet.set;
                                exVar2.f = false;
                                exVar2.g = true;
                                exVar2.h = true;
                                exVar2.e = true;
                                arrayList7.add(exVar2);
                                i15 = i7 + 1;
                                sparseIntArray4 = sparseIntArray;
                                r2Var2 = r2Var;
                                arrayList8 = arrayList;
                                e2Var4 = e2Var2;
                                g2Var3 = g2Var2;
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            r2Var2 = r2Var;
                            arrayList8 = arrayList;
                            e2Var4 = e2Var2;
                            g2Var3 = g2Var2;
                        }
                        g2Var2 = g2Var3;
                        e2Var2 = e2Var4;
                        r2Var = r2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        r2Var2 = r2Var;
                        arrayList8 = arrayList;
                        e2Var4 = e2Var2;
                        g2Var3 = g2Var2;
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
                                r2Var = r2Var2;
                                int i18 = 0;
                                while (i18 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i18);
                                    if (document == null) {
                                        e2Var3 = e2Var4;
                                        arrayList2 = arrayList9;
                                        i10 = i18;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i10 = i18;
                                        ArrayList j3 = org.telegram.messenger.j6.j(fj.V(document, null, null), null);
                                        e2Var3 = e2Var4;
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
                                            g2 g2Var4 = g2Var3;
                                            i19 = com.google.android.gms.internal.vision.e2.g(i19, 1, document.id, arrayList3);
                                            g2Var3 = g2Var4;
                                            j3 = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i18 = i10 + 1;
                                    arrayList9 = arrayList2;
                                    e2Var4 = e2Var3;
                                    g2Var3 = g2Var3;
                                }
                                g2Var2 = g2Var3;
                                e2Var2 = e2Var4;
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
                                g2Var2 = g2Var3;
                                e2Var2 = e2Var4;
                                r2Var = r2Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            i15 = i7 + 1;
                            sparseIntArray4 = sparseIntArray;
                            r2Var2 = r2Var;
                            arrayList8 = arrayList;
                            e2Var4 = e2Var2;
                            g2Var3 = g2Var2;
                        }
                        g2Var2 = g2Var3;
                        e2Var2 = e2Var4;
                        r2Var = r2Var2;
                        arrayList = arrayList8;
                        i7 = i15;
                        sparseIntArray = sparseIntArray4;
                        i15 = i7 + 1;
                        sparseIntArray4 = sparseIntArray;
                        r2Var2 = r2Var;
                        arrayList8 = arrayList;
                        e2Var4 = e2Var2;
                        g2Var3 = g2Var2;
                    }
                }
            }
            g2 g2Var5 = g2Var3;
            e2Var = e2Var4;
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
            g2Var = g2Var5;
        } else {
            e2Var = e2Var4;
            g2Var = g2Var3;
        }
        g2Var.r = true;
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
        e2Var.p(arrayList7);
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
        g2 g2Var = this.O;
        r2 r2Var = g2Var.s;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) r2Var.s1));
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
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                if (this.J == null) {
                    j8Var.a(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.J.toLowerCase());
                if (indexOf < 0) {
                    j8Var.a(0, str);
                    return;
                } else {
                    j8Var.b(str, 0, null, indexOf, this.J.length());
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                d2 d2Var = (d2) view;
                int i12 = this.L;
                if (d2Var.b != i12) {
                    d2Var.b = i12;
                    q11.D(i10.t0, d2Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i7 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i7);
        v1 v1Var = (v1) view;
        if (document == r2Var.p1) {
            v1Var.setSticker(null);
            if (v1Var.a == null) {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                int i13 = org.telegram.ui.ActionBar.n6.Ef;
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i13);
                org.telegram.ui.ActionBar.u6.k(v1Var, d02, K.a, -1, 2, K.d, r2Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = g2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.u6.x(v1Var, mutate, i13, r2Var.J0, PorterDuff.Mode.MULTIPLY);
                lq lqVar = new lq(d02, mutate);
                int L = org.telegram.messenger.g0.L(56.0f);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                lqVar.h = L;
                lqVar.n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                lqVar.e = L3;
                lqVar.f = L4;
                lqVar.r = true;
                v1Var.a = lqVar;
            }
            v1Var.setDrawable(v1Var.a);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i14 = g2Var.a;
        if (i14 != 0) {
            v1Var.a(null, i14 == 1);
            v1Var.setSticker(document);
            return;
        }
        if (document != null) {
            v1Var.setSticker(null);
            v1Var.a(document, g2Var.a == 1);
            return;
        }
        v1Var.setSticker(null);
        boolean z10 = g2Var.a == 1;
        if (v1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.o5 o5Var = v1Var.d;
        if (o5Var != null) {
            o5Var.n(v1Var);
        }
        if (longValue == 0) {
            v1Var.b = false;
            v1Var.h = 0L;
            v1Var.d = null;
            return;
        }
        v1Var.b = true;
        v1Var.h = longValue;
        org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(v1Var.c, longValue, null, pc.e(z10 ? 1 : 16388) ? 3 : 13);
        v1Var.d = m10;
        if (v1Var.w) {
            m10.a(v1Var);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View j8Var;
        g2 g2Var = this.O;
        r2 r2Var = g2Var.s;
        if (i7 == 0) {
            j8Var = new View(g2Var.getContext());
        } else if (i7 == 1) {
            Context context = g2Var.getContext();
            int i10 = r2.D1;
            j8Var = new org.telegram.ui.Cells.j8(context, true, false, r2Var.J0, false);
        } else if (i7 == 3) {
            Context context2 = g2Var.getContext();
            boolean z10 = g2Var.a == 0;
            d2 d2Var = new d2(context2);
            d2Var.b = -1;
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
            d2Var.a = p9Var;
            d2Var.addView(p9Var, c8.na.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(gd.N0(z10 ? 2131748020 : 2131747956, null));
            d2Var.addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = d2Var;
        } else if (i7 == 4) {
            p2 p2Var = new p2(r2Var, g2Var.getContext());
            r2Var.C1.add(p2Var);
            p2Var.e = new m1(r2Var, 2);
            j8Var = p2Var;
        } else {
            j8Var = new v1(g2Var.getContext(), g2Var.b);
        }
        return new mj0(j8Var);
    }
}
