package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ow extends sj0 {
    public int E;
    public int F;
    public final /* synthetic */ ey G;
    public ArrayList h;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public final ArrayList n = new ArrayList();
    public final SparseIntArray r = new SparseIntArray();
    public final SparseIntArray s = new SparseIntArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseIntArray x = new SparseIntArray();
    public final ArrayList y = new ArrayList();

    public ow(ey eyVar) {
        this.G = eyVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 4 || i3 == 3 || i3 == 6;
    }

    public final void E(int i3, View view) {
        ey eyVar = this.G;
        ArrayList arrayList = eyVar.r1;
        int i10 = this.x.get(i3);
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        sw swVar = (sw) arrayList.get(i10);
        if (swVar.h) {
            return;
        }
        boolean z10 = i10 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i10)).intValue();
        eyVar.p1.add(Long.valueOf(swVar.b.id));
        boolean z11 = org.telegram.messenger.h10.i(eyVar.d1).q() || eyVar.V0;
        int i11 = eyVar.R.J * 3;
        int size = ((swVar.f && !swVar.g && (swVar.e || z11)) || swVar.h) ? swVar.c.size() : Math.min(i11, swVar.c.size());
        Integer num = null;
        Integer valueOf = swVar.c.size() > i11 ? Integer.valueOf(intValue + 1 + size) : null;
        swVar.h = true;
        int size2 = swVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        eyVar.t2 = view;
        eyVar.u2 = valueOf.intValue();
        eyVar.v2 = num.intValue() + valueOf.intValue();
        eyVar.w2 = SystemClock.elapsedRealtime();
        o(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z10) {
            eyVar.post(new nw(this, num.intValue() > i11 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        ey eyVar = this.G;
        ArrayList arrayList = eyVar.o1;
        if (eyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(eyVar.d1);
        ArrayList arrayList3 = b02.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i3);
            if (!b02.B0(stickerSetCovered.set.id, true) || eyVar.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        cy cyVar = eyVar.U;
        if (cyVar != null) {
            cyVar.f();
        }
        u4.o.c(new kg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i3;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        ey eyVar = this.G;
        ArrayList arrayList = eyVar.o1;
        ArrayList arrayList2 = eyVar.p1;
        int i10 = eyVar.d1;
        ArrayList arrayList3 = eyVar.r1;
        arrayList3.clear();
        if (eyVar.d2) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = org.telegram.messenger.h10.i(i10).q() || eyVar.V0;
            TLRPC.ChatFull chatFull = eyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                sw swVar = new sw();
                swVar.b = eyVar.K1.emojiset;
                swVar.c = new ArrayList(Y.documents);
                swVar.e = true;
                swVar.f = true;
                swVar.g = false;
                swVar.h = true;
                swVar.i = true;
                arrayList3.add(swVar);
                TLRPC.StickerSet stickerSet2 = swVar.b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                        arrayList4.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (!z12) {
                int i12 = 0;
                while (i12 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet2 == null || org.telegram.messenger.zi.W3(tL_messages_stickerSet2)) {
                        i3 = 1;
                    } else {
                        sw swVar2 = new sw();
                        swVar2.b = tL_messages_stickerSet2.set;
                        swVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        i3 = 1;
                        swVar2.e = true;
                        swVar2.f = b02.B0(tL_messages_stickerSet2.set.id, true);
                        swVar2.g = false;
                        swVar2.h = true;
                        arrayList3.add(swVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12 += i3;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z12) {
                    sw swVar3 = new sw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    swVar3.b = stickerSet3;
                    swVar3.c = tL_messages_stickerSet3.documents;
                    swVar3.e = false;
                    swVar3.f = b02.B0(stickerSet3.id, true);
                    swVar3.g = false;
                    swVar3.h = true;
                    arrayList3.add(swVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.zi.n3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        sw swVar4 = new sw();
                        swVar4.b = tL_messages_stickerSet3.set;
                        swVar4.c = new ArrayList(arrayList5);
                        swVar4.e = true;
                        swVar4.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        swVar4.g = false;
                        swVar4.h = true;
                        arrayList3.add(swVar4);
                    }
                    if (arrayList6.size() > 0) {
                        sw swVar5 = new sw();
                        swVar5.b = tL_messages_stickerSet3.set;
                        swVar5.c = new ArrayList(arrayList6);
                        swVar5.e = false;
                        swVar5.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        swVar5.g = false;
                        swVar5.h = arrayList2.contains(Long.valueOf(swVar5.b.id));
                        arrayList3.add(swVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                sw swVar6 = new sw();
                swVar6.f = b02.B0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                swVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    swVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.li.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        swVar6.c = l02.documents;
                    } else {
                        swVar6.d = org.telegram.messenger.li.Z(stickerSetCovered.set);
                    }
                } else {
                    swVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = swVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= swVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!org.telegram.messenger.zi.n3((TLRPC.Document) swVar6.c.get(i16))) {
                                z11 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    swVar6.e = !z11;
                    swVar6.h = arrayList2.contains(Long.valueOf(swVar6.b.id));
                    swVar6.g = true;
                    arrayList3.add(swVar6);
                }
            }
            jw jwVar = eyVar.J;
            if (jwVar != null) {
                jwVar.p(eyVar.getEmojipacks());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (r10.N == 1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[LOOP:0: B:44:0x0125->B:46:0x012c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d A[EDGE_INSN: B:47:0x014d->B:48:0x014d BREAK  A[LOOP:0: B:44:0x0125->B:46:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4 A[EDGE_INSN: B:57:0x01a4->B:58:0x01a4 BREAK  A[LOOP:1: B:49:0x014f->B:56:0x019f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        int i3;
        ArrayList<String> recentEmoji;
        jw jwVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        SparseIntArray sparseIntArray = this.r;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.s;
        sparseIntArray2.clear();
        this.w.clear();
        SparseIntArray sparseIntArray3 = this.x;
        sparseIntArray3.clear();
        ArrayList arrayList = this.y;
        arrayList.clear();
        ArrayList arrayList2 = this.n;
        arrayList2.clear();
        boolean z11 = false;
        this.E = 0;
        ey eyVar = this.G;
        boolean z12 = eyVar.e0;
        ArrayList arrayList3 = eyVar.r1;
        ArrayList arrayList4 = eyVar.o1;
        int i15 = eyVar.d1;
        Object[] objArr = org.telegram.messenger.h10.i(i15).q() || eyVar.V0;
        if (z12) {
            this.E++;
            arrayList2.add(-1);
        }
        int i16 = 3;
        if (!objArr == true || !eyVar.d2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
            i3 = -1;
        } else {
            if (org.telegram.messenger.hp.s1(i15).f7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id && z12) {
                int i17 = this.E;
                this.c = i17;
                this.d = i17 + 1;
                this.E = i17 + 3;
                this.f = i17 + 2;
                arrayList2.add(324953);
                arrayList2.add(123342);
                arrayList2.add(929132);
                recentEmoji = eyVar.getRecentEmoji();
                jwVar = eyVar.J;
                if (jwVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    vu vuVar = jwVar.E;
                    if (jwVar.a0 != z13) {
                        jwVar.a0 = z13;
                        if (jwVar.W) {
                            vuVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            vuVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(xq.h).start();
                        }
                        if (!isEmpty || jwVar.N != 0) {
                            z10 = isEmpty ? true : true;
                            jwVar.b.requestLayout();
                            jwVar.W = false;
                        }
                        jwVar.j(0, jwVar.W ^ z10);
                        jwVar.b.requestLayout();
                        jwVar.W = false;
                    }
                }
                this.E = recentEmoji.size() + this.E;
                i10 = 0;
                while (true) {
                    i11 = 2;
                    if (i10 < recentEmoji.size()) {
                        break;
                    }
                    arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i10))));
                    i10++;
                }
                i12 = 0;
                i13 = 0;
                while (true) {
                    String[][] strArr = org.telegram.messenger.j6.f;
                    if (i12 < 8) {
                        break;
                    }
                    sparseIntArray.put(this.E, i13);
                    sparseIntArray2.put(i13, this.E);
                    this.E = strArr[i12].length + 1 + this.E;
                    arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i12))));
                    int i18 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.j6.f[i12];
                        if (i18 < strArr2.length) {
                            arrayList2.add(Integer.valueOf(strArr2[i18].hashCode()));
                            i18++;
                        }
                    }
                    i12++;
                    i13++;
                }
                int i19 = eyVar.R.J * 3;
                this.F = this.E;
                this.e = -1;
                if (arrayList3 == null) {
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        sparseIntArray.put(this.E, i13);
                        sparseIntArray2.put(i13, this.E);
                        arrayList.add(Integer.valueOf(this.E));
                        sw swVar = (sw) arrayList3.get(i20);
                        boolean z14 = swVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.E;
                        }
                        int size = ((swVar.f && !z14 && (swVar.e || objArr == true)) || swVar.h) ? swVar.c.size() : Math.min(i19, swVar.c.size());
                        int i21 = 1 + size;
                        boolean z15 = z11;
                        if (swVar.h || swVar.c.size() <= i19) {
                            size = i21;
                        }
                        Integer valueOf = Integer.valueOf(swVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = swVar.b;
                        int i22 = i11;
                        int i23 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i20 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(swVar.i);
                        int i24 = i16;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i24];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i22] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i25 = 1;
                        while (i25 < i23) {
                            Integer valueOf4 = Integer.valueOf(swVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) swVar.c.get(i25 - 1)).id);
                            Object[] objArr3 = new Object[i22];
                            objArr3[z15 ? 1 : 0] = valueOf4;
                            objArr3[1] = valueOf5;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr3)));
                            i25++;
                            sparseIntArray2 = sparseIntArray2;
                            i22 = 2;
                        }
                        SparseIntArray sparseIntArray5 = sparseIntArray2;
                        this.E += i23;
                        if (swVar.h || swVar.c.size() <= i19) {
                            i14 = 2;
                        } else {
                            sparseIntArray3.put(this.E, i20);
                            Integer valueOf6 = Integer.valueOf(swVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(swVar.b.id);
                            i14 = 2;
                            Object[] objArr4 = new Object[2];
                            objArr4[z15 ? 1 : 0] = valueOf6;
                            objArr4[1] = valueOf7;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr4)));
                            this.E++;
                        }
                        i20++;
                        i13++;
                        i11 = i14;
                        sparseIntArray2 = sparseIntArray5;
                        sparseIntArray = sparseIntArray4;
                        z11 = z15 ? 1 : 0;
                        i16 = 3;
                    }
                    return;
                }
                return;
            }
            i3 = -1;
        }
        this.c = i3;
        this.d = i3;
        this.f = i3;
        recentEmoji = eyVar.getRecentEmoji();
        jwVar = eyVar.J;
        if (jwVar != null) {
        }
        this.E = recentEmoji.size() + this.E;
        i10 = 0;
        while (true) {
            i11 = 2;
            if (i10 < recentEmoji.size()) {
            }
            arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i10))));
            i10++;
        }
        i12 = 0;
        i13 = 0;
        while (true) {
            String[][] strArr3 = org.telegram.messenger.j6.f;
            if (i12 < 8) {
            }
            i12++;
            i13++;
        }
        int i192 = eyVar.R.J * 3;
        this.F = this.E;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.E;
    }

    @Override // u4.h0
    public final long c(int i3) {
        return i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == this.d) {
            return 4;
        }
        if (i3 == this.c || i3 == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i3) >= 0) {
            int i10 = sparseIntArray.get(i3);
            char[] cArr = org.telegram.messenger.j6.a;
            return i10 >= 8 ? 5 : 1;
        }
        if (this.G.e0 && i3 == 0) {
            return 2;
        }
        if (this.w.indexOfKey(i3) >= 0) {
            return 3;
        }
        return this.x.indexOfKey(i3) >= 0 ? 6 : 0;
    }

    @Override // u4.h0
    public final void f() {
        F(false);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i10;
        int i11 = i3;
        ey eyVar = this.G;
        String[] strArr = eyVar.b1;
        fw fwVar = eyVar.R;
        int i12 = eyVar.d1;
        ArrayList arrayList = eyVar.r1;
        int i13 = d1Var.f;
        View view = d1Var.a;
        boolean z10 = true;
        sw swVar = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i13 == 1) {
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                i8Var.getClass();
                int i14 = sparseIntArray.get(i11);
                if (i11 == this.c) {
                    i8Var.b(org.telegram.messenger.bd.M0(2131750836, null), R.drawable.msg_close, org.telegram.messenger.bd.M0(2131754899, null), 0, 0);
                    return;
                }
                if (i11 == this.f) {
                    i8Var.a(0, org.telegram.messenger.bd.M0(2131746369, null));
                    return;
                } else {
                    if (i14 < strArr.length) {
                        i8Var.a(0, strArr[i14]);
                        return;
                    }
                    try {
                        i8Var.a(0, ((sw) arrayList.get(i14 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        i8Var.a(0, "");
                        return;
                    }
                }
            }
            int i15 = 6;
            int i16 = 5;
            if (i13 != 5) {
                if (i13 != 6) {
                    return;
                }
                uw uwVar = (uw) view;
                int i17 = this.x.get(i11);
                int i18 = fwVar.J * 3;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    swVar = (sw) arrayList.get(i17);
                }
                if (swVar != null) {
                    uwVar.a.setText("+" + ((swVar.c.size() - i18) + 1));
                    return;
                }
                return;
            }
            ww wwVar = (ww) view;
            int length = sparseIntArray.get(i11) - strArr.length;
            sw swVar2 = (sw) arrayList.get(length);
            int i19 = length - 1;
            sw swVar3 = i19 >= 0 ? (sw) arrayList.get(i19) : null;
            if (swVar2 == null || !swVar2.g || (swVar3 != null && !swVar3.e && swVar3.f && !org.telegram.messenger.h10.i(i12).q())) {
                z10 = false;
            }
            if (swVar2 != null && swVar2.d != null) {
                org.telegram.messenger.li.b0(i12).m0(swVar2.d, false);
                swVar2.d = null;
            }
            vg.o0 o0Var = wwVar.r;
            if (swVar2 == null) {
                return;
            }
            wwVar.x = swVar2;
            wwVar.y = z10;
            wwVar.d.l(swVar2.b.title, false);
            wwVar.e.setVisibility(swVar2.i ? 0 : 8);
            if (!swVar2.f || swVar2.b.official) {
                o0Var.b(org.telegram.messenger.bd.M0(2131743886, null), new vw(wwVar, i15), false);
            } else {
                o0Var.b(org.telegram.messenger.bd.M0(2131746092, null), new vw(wwVar, i16), false);
            }
            wwVar.a(false);
            return;
        }
        nx nxVar = (nx) view;
        nxVar.a = i11;
        nxVar.e = null;
        if (eyVar.e0) {
            i11--;
        }
        if (this.f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = eyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = eyVar.getRecentEmoji().get(i11);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l10 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l10 = null;
            str2 = str;
            document = null;
        } else {
            int i20 = 0;
            while (true) {
                String[][] strArr2 = org.telegram.messenger.j6.f;
                if (i20 >= 8) {
                    str = null;
                    break;
                }
                String[] strArr3 = strArr2[i20];
                int length2 = strArr3.length + 1;
                int i21 = (i11 - size) - 1;
                if (i21 < 0 || i11 >= size + length2) {
                    size += length2;
                    i20++;
                } else {
                    String str4 = strArr3[i21];
                    String str5 = (String) org.telegram.messenger.i6.j.get(str4);
                    if (str5 != null) {
                        str = ey.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q10 = org.telegram.messenger.h10.i(i12).q();
                int i22 = fwVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    sw swVar4 = (sw) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    int size2 = ((swVar4.f && !swVar4.g && (swVar4.e || q10)) || swVar4.h) ? swVar4.c.size() : Math.min(i22, swVar4.c.size());
                    int i24 = nxVar.a;
                    if (i24 < intValue || (i10 = i24 - intValue) >= size2) {
                        i23++;
                    } else {
                        nxVar.e = swVar4;
                        TLRPC.Document document2 = (TLRPC.Document) swVar4.c.get(i10);
                        document = document2;
                        l10 = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l10 = null;
            document = null;
            z10 = false;
        }
        if (l10 != null) {
            nxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            nxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            nxVar.a(null, z10);
            if (nxVar.getSpan() == null || nxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    nxVar.setSpan(new p5(document, (Paint.FontMetricsInt) null));
                } else {
                    nxVar.setSpan(new p5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            nxVar.a(org.telegram.messenger.i6.f(str), z10);
            nxVar.setSpan(null);
        }
        nxVar.setTag(str2);
        nxVar.setContentDescription(str);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        ey eyVar = this.G;
        if (i3 == 0) {
            view = new nx(eyVar.getContext());
        } else if (i3 == 1) {
            org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(eyVar.getContext(), true, false, eyVar.a2, eyVar.j2);
            i8Var.setOnIconClickListener(new f0(this, 13));
            view = i8Var;
        } else if (i3 == 3) {
            view = new tw(eyVar, eyVar.getContext());
        } else if (i3 == 4) {
            Context context = eyVar.getContext();
            cy cyVar = new cy(eyVar, true);
            eyVar.U = cyVar;
            ci.j1 j1Var = new ci.j1(eyVar, context, cyVar);
            j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            j1Var.setClipToPadding(false);
            j1Var.i(new ei.l(6));
            j1Var.setOnItemClickListener(new k(this, 5));
            view = j1Var;
        } else if (i3 == 5) {
            view = new ww(eyVar, eyVar.getContext());
        } else if (i3 != 6) {
            View view2 = new View(eyVar.getContext());
            view2.setLayoutParams(new u4.p0(-1, eyVar.c1));
            view = view2;
        } else {
            Context context2 = eyVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
            uw uwVar = new uw(context2);
            TextView textView = new TextView(context2);
            uwVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.d6, e6Var);
            int L = org.telegram.messenger.g0.L(11.0f);
            int i10 = org.telegram.ui.ActionBar.k6.If;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 99));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 99);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, e6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
            uwVar.addView(textView, b8.mf.e(-2, -2, 17));
            view = uwVar;
        }
        return new bj0(view);
    }
}
