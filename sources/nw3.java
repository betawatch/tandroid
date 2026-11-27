// default package

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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nw3 extends j79 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final /* synthetic */ ow3 O;
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
    public final lw3 N = new lw3((Object) this, (byte) 0);

    public nw3(ow3 ow3Var) {
        this.O = ow3Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        kw3 kw3Var;
        ow3 ow3Var;
        TLRPC.TL_messages_stickerSet n0;
        int i;
        ow3 ow3Var2;
        kw3 kw3Var2;
        zw3 zw3Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i2;
        kw3 kw3Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        this.I = str;
        ow3 ow3Var3 = this.O;
        kw3 kw3Var4 = ow3Var3.e;
        zw3 zw3Var2 = ow3Var3.s;
        lw3 lw3Var = this.N;
        int i3 = 1;
        if (str != null) {
            ow3Var3.f.c(true);
            kw3Var4.n(false);
            hl.r(lw3Var);
            hl.d3(lw3Var, 100L);
            return;
        }
        kw3Var4.n(true);
        hl.r(lw3Var);
        int i4 = zw3.C1;
        ls6 d0 = ls6.d0(zw3Var2.a);
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
        boolean z = false;
        arrayList4.add(null);
        ArrayList arrayList7 = this.r;
        arrayList7.clear();
        if (ow3Var3.a == 1) {
            if (zw3Var2.A1 != null && (zw3Var2.F0(0) || zw3Var2.F0(1) || zw3Var2.F0(2) || zw3Var2.F0(3) || zw3Var2.F0(4))) {
                arrayList4.add(zw3Var2.n1);
                this.y++;
            }
            ArrayList<TLRPC.Document> j0 = d0.j0(2, false);
            if (!j0.isEmpty()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.G;
                if (tL_messages_stickerSet2 == null) {
                    tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                    this.G = tL_messages_stickerSet2;
                }
                tL_messages_stickerSet2.documents = j0;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.G.set.title = ob6.M0(2131750806, null);
                arrayList5.add(this.G);
            }
            ArrayList<TLRPC.Document> j02 = d0.j0(0, false);
            if (!j02.isEmpty()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.H;
                if (tL_messages_stickerSet3 == null) {
                    tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                    this.H = tL_messages_stickerSet3;
                }
                tL_messages_stickerSet3.documents = j02;
                if (zw3Var2.z1 != null) {
                    j02.add(0, zw3Var2.o1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = ob6.M0(2131746091, null);
                arrayList5.add(this.H);
            }
        }
        arrayList5.addAll(d0.t0(ow3Var3.a == 0 ? 5 : 0));
        int i5 = 0;
        while (i5 < arrayList5.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i5);
            sparseIntArray2.put(this.y, i5);
            arrayList4.add(z);
            this.y += i3;
            arrayList4.addAll(tL_messages_stickerSet4.documents);
            this.y = tL_messages_stickerSet4.documents.size() + this.y;
            String str2 = tL_messages_stickerSet4 == this.H ? "recent" : tL_messages_stickerSet4 == this.G ? "fav" : tL_messages_stickerSet4;
            int i6 = 0;
            while (i6 < tL_messages_stickerSet4.documents.size()) {
                hashMap.put(Long.valueOf(tL_messages_stickerSet4.documents.get(i6).id), str2);
                i6++;
                sparseIntArray2 = sparseIntArray2;
            }
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            c14 c14Var = new c14();
            c14Var.c = tL_messages_stickerSet4.documents;
            c14Var.b = tL_messages_stickerSet4.set;
            c14Var.f = true;
            c14Var.g = false;
            c14Var.h = true;
            c14Var.e = true;
            if (tL_messages_stickerSet4 == this.G) {
                c14Var.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet4 == this.H) {
                c14Var.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(c14Var);
            arrayList6.add(tL_messages_stickerSet4);
            i5++;
            sparseIntArray2 = sparseIntArray3;
            i3 = 1;
            z = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (ow3Var3.a == 0) {
            ArrayList arrayList8 = d0.t0[1];
            if (arrayList8 != null) {
                int i7 = 0;
                while (i7 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i7);
                    if (!(stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered)) {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                            tL_messages_stickerSet5.set = stickerSet;
                            tL_messages_stickerSet5.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList arrayList9 = arrayList8;
                            i = i7;
                            Long valueOf = Long.valueOf(stickerSet.id);
                            HashMap hashMap2 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList10 = (ArrayList) hashMap2.get(valueOf);
                            tL_messages_stickerSet5.packs = arrayList10;
                            if (arrayList10 == null) {
                                HashMap hashMap3 = new HashMap();
                                zw3Var = zw3Var2;
                                int i8 = 0;
                                while (i8 < tL_messages_stickerSet5.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet5.documents.get(i8);
                                    if (document == null) {
                                        kw3Var3 = kw3Var4;
                                        arrayList2 = arrayList9;
                                        i2 = i8;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i2 = i8;
                                        ArrayList j = pv3.j(r47.V(document, null, null), null);
                                        kw3Var3 = kw3Var4;
                                        int i9 = 0;
                                        while (i9 < j.size()) {
                                            String charSequence = ((nv3) j.get(i9)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            ow3 ow3Var4 = ow3Var3;
                                            i9 = dze.c(i9, 1, document.id, arrayList3);
                                            ow3Var3 = ow3Var4;
                                            j = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i8 = i2 + 1;
                                    arrayList9 = arrayList2;
                                    kw3Var4 = kw3Var3;
                                    ow3Var3 = ow3Var3;
                                }
                                ow3Var2 = ow3Var3;
                                kw3Var2 = kw3Var4;
                                arrayList = arrayList9;
                                tL_messages_stickerSet5.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap3.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet5.packs.add(tL_stickerPack);
                                }
                                hashMap2.put(Long.valueOf(tL_messages_stickerSet5.set.id), tL_messages_stickerSet5.packs);
                            } else {
                                ow3Var2 = ow3Var3;
                                kw3Var2 = kw3Var4;
                                zw3Var = zw3Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet5;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            break;
                            break;
                        }
                        ow3Var2 = ow3Var3;
                        kw3Var2 = kw3Var4;
                        zw3Var = zw3Var2;
                        arrayList = arrayList8;
                        i = i7;
                        sparseIntArray = sparseIntArray4;
                        break;
                        break;
                    }
                    tL_messages_stickerSet = ls6.d0(zw3Var2.a).n0(ls6.b0(stickerSetCovered.set), false);
                    if (tL_messages_stickerSet != null) {
                        ow3Var2 = ow3Var3;
                        kw3Var2 = kw3Var4;
                        zw3Var = zw3Var2;
                        arrayList = arrayList8;
                        i = i7;
                        if (tL_messages_stickerSet.set != null) {
                            for (int i10 = 0; i10 < arrayList7.size(); i10++) {
                                TLRPC.StickerSet stickerSet2 = ((c14) arrayList7.get(i10)).b;
                                if (stickerSet2 == null || stickerSet2.id != tL_messages_stickerSet.set.id) {
                                }
                            }
                            arrayList5.add(tL_messages_stickerSet);
                            arrayList6.add(tL_messages_stickerSet);
                            sparseIntArray = sparseIntArray4;
                            sparseIntArray.put(this.y, i5);
                            i5++;
                            arrayList4.add(null);
                            this.y++;
                            arrayList4.addAll(tL_messages_stickerSet.documents);
                            this.y = tL_messages_stickerSet.documents.size() + this.y;
                            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                hashMap.put(Long.valueOf(tL_messages_stickerSet.documents.get(i11).id), tL_messages_stickerSet);
                            }
                            c14 c14Var2 = new c14();
                            c14Var2.c = tL_messages_stickerSet.documents;
                            c14Var2.b = tL_messages_stickerSet.set;
                            c14Var2.f = false;
                            c14Var2.g = true;
                            c14Var2.h = true;
                            c14Var2.e = true;
                            arrayList7.add(c14Var2);
                        }
                        sparseIntArray = sparseIntArray4;
                        break;
                    }
                    ow3Var2 = ow3Var3;
                    kw3Var2 = kw3Var4;
                    zw3Var = zw3Var2;
                    arrayList = arrayList8;
                    i = i7;
                    sparseIntArray = sparseIntArray4;
                    break;
                    break;
                    i7 = i + 1;
                    sparseIntArray4 = sparseIntArray;
                    zw3Var2 = zw3Var;
                    arrayList8 = arrayList;
                    kw3Var4 = kw3Var2;
                    ow3Var3 = ow3Var2;
                }
            }
            ow3 ow3Var5 = ow3Var3;
            kw3Var = kw3Var4;
            boolean z2 = false;
            for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                try {
                    z2 = ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z2) {
                    break;
                }
            }
            if (!z2 && (n0 = d0.n0(this.F, false)) != null) {
                arrayList6.add(n0);
            }
            ow3Var = ow3Var5;
        } else {
            kw3Var = kw3Var4;
            ow3Var = ow3Var3;
        }
        ow3Var.r = true;
        if (this.c != arrayList6.size()) {
            HashMap hashMap4 = this.d;
            hashMap4.clear();
            for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                if (tL_messages_stickerSet6 != null) {
                    for (int i14 = 0; i14 < tL_messages_stickerSet6.packs.size(); i14++) {
                        String str3 = tL_messages_stickerSet6.packs.get(i14).emoticon;
                        ArrayList arrayList13 = (ArrayList) hashMap4.get(str3);
                        if (arrayList13 == null) {
                            arrayList13 = new ArrayList();
                            hashMap4.put(str3, arrayList13);
                        }
                        arrayList13.addAll(tL_messages_stickerSet6.packs.get(i14).documents);
                    }
                }
            }
            this.c = arrayList6.size();
        }
        this.x = false;
        kw3Var.p(arrayList7);
        this.J = null;
        f();
    }

    @Override // j79
    public final int b() {
        return this.y;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.x && i == this.y - 1) {
            return 3;
        }
        if (this.E.get(i, -1) >= 0) {
            return 1;
        }
        if (i < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i >= arrayList.size() || arrayList.get(i) != this.O.s.n1) ? 2 : 4;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLRPC.StickerSet stickerSet;
        ow3 ow3Var = this.O;
        zw3 zw3Var = ow3Var.s;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new r79(-1, (int) zw3Var.r1));
            return;
        }
        if (i2 == 1) {
            int i3 = this.E.get(i);
            if (i3 >= 0) {
                ArrayList arrayList = this.n;
                if (i3 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                    u3b u3bVar = (u3b) view;
                    if (this.J == null) {
                        u3bVar.a(0, str);
                        return;
                    }
                    int indexOf = str.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        u3bVar.a(0, str);
                        return;
                    } else {
                        u3bVar.b(str, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                jw3 jw3Var = (jw3) view;
                int i4 = this.L;
                if (jw3Var.b != i4) {
                    jw3Var.b = i4;
                    n1a.D(yac.t0, jw3Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i);
        cw3 cw3Var = (cw3) view;
        if (document == zw3Var.o1) {
            cw3Var.setSticker(null);
            zm2 zm2Var = cw3Var.a;
            if (zm2Var == null) {
                ShapeDrawable b0 = aob.b0(hl.L(28.0f), -1);
                int i5 = aob.Ef;
                uob K = yob.K(0.12f, i5);
                yob.k(cw3Var, b0, K.a, -1, 2, K.d, zw3Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = ow3Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                yob.x(cw3Var, mutate, i5, zw3Var.J0, PorterDuff.Mode.MULTIPLY);
                zm2Var = new zm2(b0, mutate);
                int L = hl.L(56.0f);
                int L2 = hl.L(56.0f);
                zm2Var.h = L;
                zm2Var.n = L2;
                int L3 = hl.L(24.0f);
                int L4 = hl.L(24.0f);
                zm2Var.e = L3;
                zm2Var.f = L4;
                zm2Var.r = true;
                cw3Var.a = zm2Var;
            }
            cw3Var.setDrawable(zm2Var);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i6 = ow3Var.a;
        if (i6 != 0) {
            cw3Var.a(null, i6 == 1);
            cw3Var.setSticker(document);
            return;
        }
        if (document != null) {
            cw3Var.setSticker(null);
            cw3Var.a(document, ow3Var.a == 1);
            return;
        }
        cw3Var.setSticker(null);
        boolean z = ow3Var.a == 1;
        if (cw3Var.h != longValue) {
            wl wlVar = cw3Var.d;
            if (wlVar != null) {
                wlVar.o(cw3Var);
            }
            if (longValue == 0) {
                cw3Var.b = false;
                cw3Var.h = 0L;
                cw3Var.d = null;
                return;
            }
            cw3Var.b = true;
            cw3Var.h = longValue;
            wl m = wl.m(cw3Var.c, longValue, null, i86.e(z ? 1 : 16388) ? 3 : 13);
            cw3Var.d = m;
            if (cw3Var.w) {
                m.b(cw3Var);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        ow3 ow3Var = this.O;
        zw3 zw3Var = ow3Var.s;
        if (i == 0) {
            view = new View(ow3Var.getContext());
        } else if (i == 1) {
            Context context = ow3Var.getContext();
            int i2 = zw3.C1;
            view = new u3b(context, true, false, zw3Var.J0, false);
        } else if (i == 3) {
            Context context2 = ow3Var.getContext();
            boolean z = ow3Var.a == 0;
            jw3 jw3Var = new jw3(context2);
            jw3Var.b = -1;
            de0 de0Var = new de0(context2);
            jw3Var.a = de0Var;
            jw3Var.addView(de0Var, tre.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(ob6.M0(z ? 2131747944 : 2131747880, null));
            jw3Var.addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            view = jw3Var;
        } else if (i == 4) {
            xw3 xw3Var = new xw3(zw3Var, ow3Var.getContext());
            zw3Var.B1.add(xw3Var);
            xw3Var.e = new uv3(zw3Var, (byte) 2);
            view = xw3Var;
        } else {
            view = new cw3(ow3Var.getContext(), ow3Var.b);
        }
        return new n69(view);
    }
}
