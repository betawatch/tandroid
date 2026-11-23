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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ax extends dk0 {
    public int E;
    public int F;
    public final /* synthetic */ qy G;
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

    public ax(qy qyVar) {
        this.G = qyVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 4 || i7 == 3 || i7 == 6;
    }

    public final void E(int i7, View view) {
        qy qyVar = this.G;
        ArrayList arrayList = qyVar.r1;
        int i10 = this.x.get(i7);
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ex exVar = (ex) arrayList.get(i10);
        if (exVar.h) {
            return;
        }
        boolean z10 = i10 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i10)).intValue();
        qyVar.p1.add(Long.valueOf(exVar.b.id));
        boolean z11 = org.telegram.messenger.i10.i(qyVar.d1).q() || qyVar.V0;
        int i11 = qyVar.R.J * 3;
        int size = ((exVar.f && !exVar.g && (exVar.e || z11)) || exVar.h) ? exVar.c.size() : Math.min(i11, exVar.c.size());
        Integer num = null;
        Integer valueOf = exVar.c.size() > i11 ? Integer.valueOf(intValue + 1 + size) : null;
        exVar.h = true;
        int size2 = exVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        qyVar.t2 = view;
        qyVar.u2 = valueOf.intValue();
        qyVar.v2 = num.intValue() + valueOf.intValue();
        qyVar.w2 = SystemClock.elapsedRealtime();
        o(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z10) {
            qyVar.post(new zw(this, num.intValue() > i11 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        qy qyVar = this.G;
        ArrayList arrayList = qyVar.o1;
        if (qyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.d1);
        ArrayList arrayList3 = d02.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!d02.E0(stickerSetCovered.set.id, true) || qyVar.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        oy oyVar = qyVar.U;
        if (oyVar != null) {
            oyVar.f();
        }
        v4.p.c(new jg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a02;
        qy qyVar = this.G;
        ArrayList arrayList = qyVar.o1;
        ArrayList arrayList2 = qyVar.p1;
        int i10 = qyVar.d1;
        ArrayList arrayList3 = qyVar.r1;
        arrayList3.clear();
        if (qyVar.d2) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(d02.u0(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = org.telegram.messenger.i10.i(i10).q() || qyVar.V0;
            TLRPC.ChatFull chatFull = qyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a02 = d02.a0(stickerSet)) != null) {
                ex exVar = new ex();
                exVar.b = qyVar.K1.emojiset;
                exVar.c = new ArrayList(a02.documents);
                exVar.e = true;
                exVar.f = true;
                exVar.g = false;
                exVar.h = true;
                exVar.i = true;
                arrayList3.add(exVar);
                TLRPC.StickerSet stickerSet2 = exVar.b;
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
                    if (tL_messages_stickerSet2 == null || org.telegram.messenger.fj.V3(tL_messages_stickerSet2)) {
                        i7 = 1;
                    } else {
                        ex exVar2 = new ex();
                        exVar2.b = tL_messages_stickerSet2.set;
                        exVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        exVar2.e = true;
                        exVar2.f = d02.E0(tL_messages_stickerSet2.set.id, true);
                        exVar2.g = false;
                        exVar2.h = true;
                        arrayList3.add(exVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12 += i7;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z12) {
                    ex exVar3 = new ex();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    exVar3.b = stickerSet3;
                    exVar3.c = tL_messages_stickerSet3.documents;
                    exVar3.e = false;
                    exVar3.f = d02.E0(stickerSet3.id, true);
                    exVar3.g = false;
                    exVar3.h = true;
                    arrayList3.add(exVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.fj.m3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        ex exVar4 = new ex();
                        exVar4.b = tL_messages_stickerSet3.set;
                        exVar4.c = new ArrayList(arrayList5);
                        exVar4.e = true;
                        exVar4.f = d02.E0(tL_messages_stickerSet3.set.id, true);
                        exVar4.g = false;
                        exVar4.h = true;
                        arrayList3.add(exVar4);
                    }
                    if (arrayList6.size() > 0) {
                        ex exVar5 = new ex();
                        exVar5.b = tL_messages_stickerSet3.set;
                        exVar5.c = new ArrayList(arrayList6);
                        exVar5.e = false;
                        exVar5.f = d02.E0(tL_messages_stickerSet3.set.id, true);
                        exVar5.g = false;
                        exVar5.h = arrayList2.contains(Long.valueOf(exVar5.b.id));
                        arrayList3.add(exVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                ex exVar6 = new ex();
                exVar6.f = d02.E0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                exVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    exVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(org.telegram.messenger.ri.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (n02 != null) {
                        exVar6.c = n02.documents;
                    } else {
                        exVar6.d = org.telegram.messenger.ri.b0(stickerSetCovered.set);
                    }
                } else {
                    exVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = exVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= exVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!org.telegram.messenger.fj.m3((TLRPC.Document) exVar6.c.get(i16))) {
                                z11 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    exVar6.e = !z11;
                    exVar6.h = arrayList2.contains(Long.valueOf(exVar6.b.id));
                    exVar6.g = true;
                    arrayList3.add(exVar6);
                }
            }
            vw vwVar = qyVar.J;
            if (vwVar != null) {
                vwVar.p(qyVar.getEmojipacks());
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
        int i7;
        ArrayList<String> recentEmoji;
        vw vwVar;
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
        qy qyVar = this.G;
        boolean z12 = qyVar.e0;
        ArrayList arrayList3 = qyVar.r1;
        ArrayList arrayList4 = qyVar.o1;
        int i15 = qyVar.d1;
        Object[] objArr = org.telegram.messenger.i10.i(i15).q() || qyVar.V0;
        if (z12) {
            this.E++;
            arrayList2.add(-1);
        }
        int i16 = 3;
        if (!objArr == true || !qyVar.d2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
            i7 = -1;
        } else {
            if (org.telegram.messenger.mp.u1(i15).i7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id && z12) {
                int i17 = this.E;
                this.c = i17;
                this.d = i17 + 1;
                this.E = i17 + 3;
                this.f = i17 + 2;
                arrayList2.add(324953);
                arrayList2.add(123342);
                arrayList2.add(929132);
                recentEmoji = qyVar.getRecentEmoji();
                vwVar = qyVar.J;
                if (vwVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    hv hvVar = vwVar.E;
                    if (vwVar.a0 != z13) {
                        vwVar.a0 = z13;
                        if (vwVar.W) {
                            hvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            hvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(kr.h).start();
                        }
                        if (!isEmpty || vwVar.N != 0) {
                            z10 = isEmpty ? true : true;
                            vwVar.b.requestLayout();
                            vwVar.W = false;
                        }
                        vwVar.j(0, vwVar.W ^ z10);
                        vwVar.b.requestLayout();
                        vwVar.W = false;
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
                    String[][] strArr = org.telegram.messenger.k6.f;
                    if (i12 < 8) {
                        break;
                    }
                    sparseIntArray.put(this.E, i13);
                    sparseIntArray2.put(i13, this.E);
                    this.E = strArr[i12].length + 1 + this.E;
                    arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i12))));
                    int i18 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.k6.f[i12];
                        if (i18 < strArr2.length) {
                            arrayList2.add(Integer.valueOf(strArr2[i18].hashCode()));
                            i18++;
                        }
                    }
                    i12++;
                    i13++;
                }
                int i19 = qyVar.R.J * 3;
                this.F = this.E;
                this.e = -1;
                if (arrayList3 == null) {
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        sparseIntArray.put(this.E, i13);
                        sparseIntArray2.put(i13, this.E);
                        arrayList.add(Integer.valueOf(this.E));
                        ex exVar = (ex) arrayList3.get(i20);
                        boolean z14 = exVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.E;
                        }
                        int size = ((exVar.f && !z14 && (exVar.e || objArr == true)) || exVar.h) ? exVar.c.size() : Math.min(i19, exVar.c.size());
                        int i21 = 1 + size;
                        boolean z15 = z11;
                        if (exVar.h || exVar.c.size() <= i19) {
                            size = i21;
                        }
                        Integer valueOf = Integer.valueOf(exVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = exVar.b;
                        int i22 = i11;
                        int i23 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i20 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(exVar.i);
                        int i24 = i16;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i24];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i22] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i25 = 1;
                        while (i25 < i23) {
                            Integer valueOf4 = Integer.valueOf(exVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) exVar.c.get(i25 - 1)).id);
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
                        if (exVar.h || exVar.c.size() <= i19) {
                            i14 = 2;
                        } else {
                            sparseIntArray3.put(this.E, i20);
                            Integer valueOf6 = Integer.valueOf(exVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(exVar.b.id);
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
            i7 = -1;
        }
        this.c = i7;
        this.d = i7;
        this.f = i7;
        recentEmoji = qyVar.getRecentEmoji();
        vwVar = qyVar.J;
        if (vwVar != null) {
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
            String[][] strArr3 = org.telegram.messenger.k6.f;
            if (i12 < 8) {
            }
            i12++;
            i13++;
        }
        int i192 = qyVar.R.J * 3;
        this.F = this.E;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.E;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == this.d) {
            return 4;
        }
        if (i7 == this.c || i7 == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.k6.a;
            return i10 >= 8 ? 5 : 1;
        }
        if (this.G.e0 && i7 == 0) {
            return 2;
        }
        if (this.w.indexOfKey(i7) >= 0) {
            return 3;
        }
        return this.x.indexOfKey(i7) >= 0 ? 6 : 0;
    }

    @Override // v4.i0
    public final void f() {
        F(false);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i10;
        int i11 = i7;
        qy qyVar = this.G;
        String[] strArr = qyVar.b1;
        rw rwVar = qyVar.R;
        int i12 = qyVar.d1;
        ArrayList arrayList = qyVar.r1;
        int i13 = f1Var.f;
        View view = f1Var.a;
        boolean z10 = true;
        ex exVar = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i13 == 1) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                j8Var.getClass();
                int i14 = sparseIntArray.get(i11);
                if (i11 == this.c) {
                    j8Var.b(org.telegram.messenger.gd.N0(2131750823, null), R.drawable.msg_close, org.telegram.messenger.gd.N0(2131754899, null), 0, 0);
                    return;
                }
                if (i11 == this.f) {
                    j8Var.a(0, org.telegram.messenger.gd.N0(2131746165, null));
                    return;
                } else {
                    if (i14 < strArr.length) {
                        j8Var.a(0, strArr[i14]);
                        return;
                    }
                    try {
                        j8Var.a(0, ((ex) arrayList.get(i14 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        j8Var.a(0, "");
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
                gx gxVar = (gx) view;
                int i17 = this.x.get(i11);
                int i18 = rwVar.J * 3;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    exVar = (ex) arrayList.get(i17);
                }
                if (exVar != null) {
                    gxVar.a.setText("+" + ((exVar.c.size() - i18) + 1));
                    return;
                }
                return;
            }
            ix ixVar = (ix) view;
            int length = sparseIntArray.get(i11) - strArr.length;
            ex exVar2 = (ex) arrayList.get(length);
            int i19 = length - 1;
            ex exVar3 = i19 >= 0 ? (ex) arrayList.get(i19) : null;
            if (exVar2 == null || !exVar2.g || (exVar3 != null && !exVar3.e && exVar3.f && !org.telegram.messenger.i10.i(i12).q())) {
                z10 = false;
            }
            if (exVar2 != null && exVar2.d != null) {
                org.telegram.messenger.ri.d0(i12).o0(exVar2.d, false);
                exVar2.d = null;
            }
            ug.r0 r0Var = ixVar.r;
            if (exVar2 == null) {
                return;
            }
            ixVar.x = exVar2;
            ixVar.y = z10;
            ixVar.d.l(exVar2.b.title, false);
            ixVar.e.setVisibility(exVar2.i ? 0 : 8);
            if (!exVar2.f || exVar2.b.official) {
                r0Var.b(org.telegram.messenger.gd.N0(2131743629, null), new hx(ixVar, i15), false);
            } else {
                r0Var.b(org.telegram.messenger.gd.N0(2131745886, null), new hx(ixVar, i16), false);
            }
            ixVar.a(false);
            return;
        }
        yx yxVar = (yx) view;
        yxVar.a = i11;
        yxVar.e = null;
        if (qyVar.e0) {
            i11--;
        }
        if (this.f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = qyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = qyVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.k6.f;
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
                    String str5 = (String) org.telegram.messenger.j6.j.get(str4);
                    if (str5 != null) {
                        str = qy.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q10 = org.telegram.messenger.i10.i(i12).q();
                int i22 = rwVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    ex exVar4 = (ex) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    int size2 = ((exVar4.f && !exVar4.g && (exVar4.e || q10)) || exVar4.h) ? exVar4.c.size() : Math.min(i22, exVar4.c.size());
                    int i24 = yxVar.a;
                    if (i24 < intValue || (i10 = i24 - intValue) >= size2) {
                        i23++;
                    } else {
                        yxVar.e = exVar4;
                        TLRPC.Document document2 = (TLRPC.Document) exVar4.c.get(i10);
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
            yxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            yxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            yxVar.a(null, z10);
            if (yxVar.getSpan() == null || yxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    yxVar.setSpan(new x5(document, (Paint.FontMetricsInt) null));
                } else {
                    yxVar.setSpan(new x5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            yxVar.a(org.telegram.messenger.j6.f(str), z10);
            yxVar.setSpan(null);
        }
        yxVar.setTag(str2);
        yxVar.setContentDescription(str);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        qy qyVar = this.G;
        if (i7 == 0) {
            view = new yx(qyVar.getContext());
        } else if (i7 == 1) {
            org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(qyVar.getContext(), true, false, qyVar.a2, qyVar.j2);
            j8Var.setOnIconClickListener(new n0(this, 14));
            view = j8Var;
        } else if (i7 == 3) {
            view = new fx(qyVar, qyVar.getContext());
        } else if (i7 == 4) {
            Context context = qyVar.getContext();
            oy oyVar = new oy(qyVar, true);
            qyVar.U = oyVar;
            di.b1 b1Var = new di.b1(qyVar, context, oyVar);
            b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            b1Var.setClipToPadding(false);
            b1Var.i(new fi.k(6));
            b1Var.setOnItemClickListener(new n(this, 5));
            view = b1Var;
        } else if (i7 == 5) {
            view = new ix(qyVar, qyVar.getContext());
        } else if (i7 != 6) {
            View view2 = new View(qyVar.getContext());
            view2.setLayoutParams(new v4.q0(-1, qyVar.c1));
            view = view2;
        } else {
            Context context2 = qyVar.getContext();
            org.telegram.ui.ActionBar.i6 i6Var = qyVar.a2;
            gx gxVar = new gx(context2);
            TextView textView = new TextView(context2);
            gxVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.d6, i6Var);
            int L = org.telegram.messenger.g0.L(11.0f);
            int i10 = org.telegram.ui.ActionBar.n6.Lf;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 99));
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 99);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, i6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
            gxVar.addView(textView, c8.na.e(-2, -2, 17));
            view = gxVar;
        }
        return new mj0(view);
    }
}
