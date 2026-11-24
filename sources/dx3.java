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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dx3 extends y59 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final /* synthetic */ ex3 O;
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
    public final bi3 N = new bi3(this, 26);

    public dx3(ex3 ex3Var) {
        this.O = ex3Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        bx3 bx3Var;
        ex3 ex3Var;
        TLRPC.TL_messages_stickerSet n0;
        int i;
        ex3 ex3Var2;
        bx3 bx3Var2;
        px3 px3Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i2;
        bx3 bx3Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        this.I = str;
        ex3 ex3Var3 = this.O;
        bx3 bx3Var4 = ex3Var3.e;
        px3 px3Var2 = ex3Var3.s;
        bi3 bi3Var = this.N;
        int i3 = 1;
        if (str != null) {
            ex3Var3.f.c(true);
            bx3Var4.n(false);
            gm.r(bi3Var);
            gm.d3(bi3Var, 100L);
            return;
        }
        bx3Var4.n(true);
        gm.r(bi3Var);
        int i4 = px3.C1;
        hs6 d0 = hs6.d0(px3Var2.a);
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
        if (ex3Var3.a == 1) {
            if (px3Var2.A1 != null && (px3Var2.E0(0) || px3Var2.E0(1) || px3Var2.E0(2) || px3Var2.E0(3) || px3Var2.E0(4))) {
                arrayList4.add(px3Var2.n1);
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
                this.G.set.title = jb6.M0(2131750778, null);
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
                if (px3Var2.z1 != null) {
                    j02.add(0, px3Var2.o1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = jb6.M0(2131746097, null);
                arrayList5.add(this.H);
            }
        }
        arrayList5.addAll(d0.t0(ex3Var3.a == 0 ? 5 : 0));
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
            s14 s14Var = new s14();
            s14Var.c = tL_messages_stickerSet4.documents;
            s14Var.b = tL_messages_stickerSet4.set;
            s14Var.f = true;
            s14Var.g = false;
            s14Var.h = true;
            s14Var.e = true;
            if (tL_messages_stickerSet4 == this.G) {
                s14Var.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet4 == this.H) {
                s14Var.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(s14Var);
            arrayList6.add(tL_messages_stickerSet4);
            i5++;
            sparseIntArray2 = sparseIntArray3;
            i3 = 1;
            z = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (ex3Var3.a == 0) {
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
                                px3Var = px3Var2;
                                int i8 = 0;
                                while (i8 < tL_messages_stickerSet5.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet5.documents.get(i8);
                                    if (document == null) {
                                        bx3Var3 = bx3Var4;
                                        arrayList2 = arrayList9;
                                        i2 = i8;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i2 = i8;
                                        ArrayList j = gw3.j(k47.V(document, null, null), null);
                                        bx3Var3 = bx3Var4;
                                        int i9 = 0;
                                        while (i9 < j.size()) {
                                            String charSequence = ((ew3) j.get(i9)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            ex3 ex3Var4 = ex3Var3;
                                            i9 = mle.c(i9, 1, document.id, arrayList3);
                                            ex3Var3 = ex3Var4;
                                            j = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i8 = i2 + 1;
                                    arrayList9 = arrayList2;
                                    bx3Var4 = bx3Var3;
                                    ex3Var3 = ex3Var3;
                                }
                                ex3Var2 = ex3Var3;
                                bx3Var2 = bx3Var4;
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
                                ex3Var2 = ex3Var3;
                                bx3Var2 = bx3Var4;
                                px3Var = px3Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet5;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            break;
                            break;
                        }
                        ex3Var2 = ex3Var3;
                        bx3Var2 = bx3Var4;
                        px3Var = px3Var2;
                        arrayList = arrayList8;
                        i = i7;
                        sparseIntArray = sparseIntArray4;
                        break;
                        break;
                    }
                    tL_messages_stickerSet = hs6.d0(px3Var2.a).n0(hs6.b0(stickerSetCovered.set), false);
                    if (tL_messages_stickerSet != null) {
                        ex3Var2 = ex3Var3;
                        bx3Var2 = bx3Var4;
                        px3Var = px3Var2;
                        arrayList = arrayList8;
                        i = i7;
                        if (tL_messages_stickerSet.set != null) {
                            for (int i10 = 0; i10 < arrayList7.size(); i10++) {
                                TLRPC.StickerSet stickerSet2 = ((s14) arrayList7.get(i10)).b;
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
                            s14 s14Var2 = new s14();
                            s14Var2.c = tL_messages_stickerSet.documents;
                            s14Var2.b = tL_messages_stickerSet.set;
                            s14Var2.f = false;
                            s14Var2.g = true;
                            s14Var2.h = true;
                            s14Var2.e = true;
                            arrayList7.add(s14Var2);
                        }
                        sparseIntArray = sparseIntArray4;
                        break;
                    }
                    ex3Var2 = ex3Var3;
                    bx3Var2 = bx3Var4;
                    px3Var = px3Var2;
                    arrayList = arrayList8;
                    i = i7;
                    sparseIntArray = sparseIntArray4;
                    break;
                    break;
                    i7 = i + 1;
                    sparseIntArray4 = sparseIntArray;
                    px3Var2 = px3Var;
                    arrayList8 = arrayList;
                    bx3Var4 = bx3Var2;
                    ex3Var3 = ex3Var2;
                }
            }
            ex3 ex3Var5 = ex3Var3;
            bx3Var = bx3Var4;
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
            ex3Var = ex3Var5;
        } else {
            bx3Var = bx3Var4;
            ex3Var = ex3Var3;
        }
        ex3Var.r = true;
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
        bx3Var.p(arrayList7);
        this.J = null;
        f();
    }

    @Override // y59
    public final int b() {
        return this.y;
    }

    @Override // y59
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

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLRPC.StickerSet stickerSet;
        ex3 ex3Var = this.O;
        px3 px3Var = ex3Var.s;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new g69(-1, (int) px3Var.r1));
            return;
        }
        if (i2 == 1) {
            int i3 = this.E.get(i);
            if (i3 >= 0) {
                ArrayList arrayList = this.n;
                if (i3 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                    w1b w1bVar = (w1b) view;
                    if (this.J == null) {
                        w1bVar.a(0, str);
                        return;
                    }
                    int indexOf = str.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        w1bVar.a(0, str);
                        return;
                    } else {
                        w1bVar.b(str, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ax3 ax3Var = (ax3) view;
                int i4 = this.L;
                if (ax3Var.b != i4) {
                    ax3Var.b = i4;
                    vz9.D(z8c.t0, ax3Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i);
        tw3 tw3Var = (tw3) view;
        if (document == px3Var.o1) {
            tw3Var.setSticker(null);
            sn2 sn2Var = tw3Var.a;
            if (sn2Var == null) {
                ShapeDrawable b0 = cmb.b0(gm.L(28.0f), -1);
                int i5 = cmb.Df;
                wmb K = anb.K(0.12f, i5);
                anb.k(tw3Var, b0, K.a, -1, 2, K.d, px3Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = ex3Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                anb.x(tw3Var, mutate, i5, px3Var.J0, PorterDuff.Mode.MULTIPLY);
                sn2Var = new sn2(b0, mutate);
                int L = gm.L(56.0f);
                int L2 = gm.L(56.0f);
                sn2Var.h = L;
                sn2Var.n = L2;
                int L3 = gm.L(24.0f);
                int L4 = gm.L(24.0f);
                sn2Var.e = L3;
                sn2Var.f = L4;
                sn2Var.r = true;
                tw3Var.a = sn2Var;
            }
            tw3Var.setDrawable(sn2Var);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i6 = ex3Var.a;
        if (i6 != 0) {
            tw3Var.a(null, i6 == 1);
            tw3Var.setSticker(document);
            return;
        }
        if (document != null) {
            tw3Var.setSticker(null);
            tw3Var.a(document, ex3Var.a == 1);
            return;
        }
        tw3Var.setSticker(null);
        boolean z = ex3Var.a == 1;
        if (tw3Var.h != longValue) {
            vm vmVar = tw3Var.d;
            if (vmVar != null) {
                vmVar.o(tw3Var);
            }
            if (longValue == 0) {
                tw3Var.b = false;
                tw3Var.h = 0L;
                tw3Var.d = null;
                return;
            }
            tw3Var.b = true;
            tw3Var.h = longValue;
            vm m = vm.m(tw3Var.c, longValue, null, e86.e(z ? 1 : 16388) ? 3 : 13);
            tw3Var.d = m;
            if (tw3Var.w) {
                m.b(tw3Var);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        ex3 ex3Var = this.O;
        px3 px3Var = ex3Var.s;
        if (i == 0) {
            view = new View(ex3Var.getContext());
        } else if (i == 1) {
            Context context = ex3Var.getContext();
            int i2 = px3.C1;
            view = new w1b(context, true, false, px3Var.J0, false);
        } else if (i == 3) {
            Context context2 = ex3Var.getContext();
            boolean z = ex3Var.a == 0;
            ax3 ax3Var = new ax3(context2);
            ax3Var.b = -1;
            bf0 bf0Var = new bf0(context2);
            ax3Var.a = bf0Var;
            ax3Var.addView(bf0Var, qoe.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(jb6.M0(z ? 2131747947 : 2131747883, null));
            ax3Var.addView(textView, qoe.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            view = ax3Var;
        } else if (i == 4) {
            nx3 nx3Var = new nx3(px3Var, ex3Var.getContext());
            px3Var.B1.add(nx3Var);
            nx3Var.e = new lw3(px3Var, (byte) 2);
            view = nx3Var;
        } else {
            view = new tw3(ex3Var.getContext(), ex3Var.b);
        }
        return new b59(view);
    }
}
