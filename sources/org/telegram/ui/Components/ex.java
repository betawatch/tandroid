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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ex extends sk0 {
    public int D;
    public int E;
    public final /* synthetic */ vy F;
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

    public ex(vy vyVar) {
        this.F = vyVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        vy vyVar = this.F;
        ArrayList arrayList = vyVar.q1;
        int i11 = this.x.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        ix ixVar = (ix) arrayList.get(i11);
        if (ixVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i11)).intValue();
        vyVar.o1.add(Long.valueOf(ixVar.b.id));
        boolean z11 = org.telegram.messenger.d20.i(vyVar.c1).q() || vyVar.U0;
        int i12 = vyVar.Q.J * 3;
        int size = ((ixVar.f && !ixVar.g && (ixVar.e || z11)) || ixVar.h) ? ixVar.c.size() : Math.min(i12, ixVar.c.size());
        Integer num = null;
        Integer valueOf = ixVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        ixVar.h = true;
        int size2 = ixVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        vyVar.s2 = view;
        vyVar.t2 = valueOf.intValue();
        vyVar.u2 = num.intValue() + valueOf.intValue();
        vyVar.v2 = SystemClock.elapsedRealtime();
        o(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z10) {
            vyVar.post(new dx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        vy vyVar = this.F;
        ArrayList arrayList = vyVar.n1;
        if (vyVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(vyVar.c1);
        ArrayList arrayList3 = b02.s0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i10);
            if (!b02.B0(stickerSetCovered.set.id, true) || vyVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        ty tyVar = vyVar.T;
        if (tyVar != null) {
            tyVar.f();
        }
        s4.n.c(new hg.a(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        vy vyVar = this.F;
        ArrayList arrayList = vyVar.n1;
        ArrayList arrayList2 = vyVar.o1;
        int i11 = vyVar.c1;
        ArrayList arrayList3 = vyVar.q1;
        arrayList3.clear();
        if (vyVar.c2) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = org.telegram.messenger.d20.i(i11).q() || vyVar.U0;
            TLRPC.ChatFull chatFull = vyVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                ix ixVar = new ix();
                ixVar.b = vyVar.J1.emojiset;
                ixVar.c = new ArrayList(Y.documents);
                ixVar.e = true;
                ixVar.f = true;
                ixVar.g = false;
                ixVar.h = true;
                ixVar.i = true;
                arrayList3.add(ixVar);
                TLRPC.StickerSet stickerSet2 = ixVar.b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                        arrayList4.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (!z12) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 == null || org.telegram.messenger.jj.V3(tL_messages_stickerSet2)) {
                        i10 = 1;
                    } else {
                        ix ixVar2 = new ix();
                        ixVar2.b = tL_messages_stickerSet2.set;
                        ixVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        i10 = 1;
                        ixVar2.e = true;
                        ixVar2.f = b02.B0(tL_messages_stickerSet2.set.id, true);
                        ixVar2.g = false;
                        ixVar2.h = true;
                        arrayList3.add(ixVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13 += i10;
                }
            }
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z12) {
                    ix ixVar3 = new ix();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    ixVar3.b = stickerSet3;
                    ixVar3.c = tL_messages_stickerSet3.documents;
                    ixVar3.e = false;
                    ixVar3.f = b02.B0(stickerSet3.id, true);
                    ixVar3.g = false;
                    ixVar3.h = true;
                    arrayList3.add(ixVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i15 = 0; i15 < tL_messages_stickerSet3.documents.size(); i15++) {
                            if (org.telegram.messenger.jj.m3(tL_messages_stickerSet3.documents.get(i15))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i15));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i15));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        ix ixVar4 = new ix();
                        ixVar4.b = tL_messages_stickerSet3.set;
                        ixVar4.c = new ArrayList(arrayList5);
                        ixVar4.e = true;
                        ixVar4.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        ixVar4.g = false;
                        ixVar4.h = true;
                        arrayList3.add(ixVar4);
                    }
                    if (arrayList6.size() > 0) {
                        ix ixVar5 = new ix();
                        ixVar5.b = tL_messages_stickerSet3.set;
                        ixVar5.c = new ArrayList(arrayList6);
                        ixVar5.e = false;
                        ixVar5.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        ixVar5.g = false;
                        ixVar5.h = arrayList2.contains(Long.valueOf(ixVar5.b.id));
                        arrayList3.add(ixVar5);
                    }
                }
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ix ixVar6 = new ix();
                ixVar6.f = b02.B0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                ixVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    ixVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.ui.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        ixVar6.c = l02.documents;
                    } else {
                        ixVar6.d = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                    }
                } else {
                    ixVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = ixVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= ixVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!org.telegram.messenger.jj.m3((TLRPC.Document) ixVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    ixVar6.e = !z11;
                    ixVar6.h = arrayList2.contains(Long.valueOf(ixVar6.b.id));
                    ixVar6.g = true;
                    arrayList3.add(ixVar6);
                }
            }
            zw zwVar = vyVar.I;
            if (zwVar != null) {
                zwVar.p(vyVar.getEmojipacks());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (r10.M == 1) goto L49;
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
        int i10;
        ArrayList<String> recentEmoji;
        zw zwVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
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
        this.D = 0;
        vy vyVar = this.F;
        boolean z12 = vyVar.d0;
        ArrayList arrayList3 = vyVar.q1;
        ArrayList arrayList4 = vyVar.n1;
        int i16 = vyVar.c1;
        Object[] objArr = org.telegram.messenger.d20.i(i16).q() || vyVar.U0;
        if (z12) {
            this.D++;
            arrayList2.add(-1);
        }
        int i17 = 3;
        if (!objArr == true || !vyVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
            i10 = -1;
        } else {
            if (org.telegram.messenger.vp.r1(i16).g7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id && z12) {
                int i18 = this.D;
                this.c = i18;
                this.d = i18 + 1;
                this.D = i18 + 3;
                this.f = i18 + 2;
                arrayList2.add(324953);
                arrayList2.add(123342);
                arrayList2.add(929132);
                recentEmoji = vyVar.getRecentEmoji();
                zwVar = vyVar.I;
                if (zwVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    iv ivVar = zwVar.D;
                    if (zwVar.W != z13) {
                        zwVar.W = z13;
                        if (zwVar.V) {
                            ivVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            ivVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(gr.h).start();
                        }
                        if (!isEmpty || zwVar.M != 0) {
                            z10 = isEmpty ? true : true;
                            zwVar.b.requestLayout();
                            zwVar.V = false;
                        }
                        zwVar.j(0, zwVar.V ^ z10);
                        zwVar.b.requestLayout();
                        zwVar.V = false;
                    }
                }
                this.D = recentEmoji.size() + this.D;
                i11 = 0;
                while (true) {
                    i12 = 2;
                    if (i11 < recentEmoji.size()) {
                        break;
                    }
                    arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i11))));
                    i11++;
                }
                i13 = 0;
                i14 = 0;
                while (true) {
                    String[][] strArr = org.telegram.messenger.l6.f;
                    if (i13 < 8) {
                        break;
                    }
                    sparseIntArray.put(this.D, i14);
                    sparseIntArray2.put(i14, this.D);
                    this.D = strArr[i13].length + 1 + this.D;
                    arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i13))));
                    int i19 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.l6.f[i13];
                        if (i19 < strArr2.length) {
                            arrayList2.add(Integer.valueOf(strArr2[i19].hashCode()));
                            i19++;
                        }
                    }
                    i13++;
                    i14++;
                }
                int i20 = vyVar.Q.J * 3;
                this.E = this.D;
                this.e = -1;
                if (arrayList3 == null) {
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        sparseIntArray.put(this.D, i14);
                        sparseIntArray2.put(i14, this.D);
                        arrayList.add(Integer.valueOf(this.D));
                        ix ixVar = (ix) arrayList3.get(i21);
                        boolean z14 = ixVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.D;
                        }
                        int size = ((ixVar.f && !z14 && (ixVar.e || objArr == true)) || ixVar.h) ? ixVar.c.size() : Math.min(i20, ixVar.c.size());
                        int i22 = 1 + size;
                        boolean z15 = z11;
                        if (ixVar.h || ixVar.c.size() <= i20) {
                            size = i22;
                        }
                        Integer valueOf = Integer.valueOf(ixVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = ixVar.b;
                        int i23 = i12;
                        int i24 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i21 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(ixVar.i);
                        int i25 = i17;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i25];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i23] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i26 = 1;
                        while (i26 < i24) {
                            Integer valueOf4 = Integer.valueOf(ixVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) ixVar.c.get(i26 - 1)).id);
                            Object[] objArr3 = new Object[i23];
                            objArr3[z15 ? 1 : 0] = valueOf4;
                            objArr3[1] = valueOf5;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr3)));
                            i26++;
                            sparseIntArray2 = sparseIntArray2;
                            i23 = 2;
                        }
                        SparseIntArray sparseIntArray5 = sparseIntArray2;
                        this.D += i24;
                        if (ixVar.h || ixVar.c.size() <= i20) {
                            i15 = 2;
                        } else {
                            sparseIntArray3.put(this.D, i21);
                            Integer valueOf6 = Integer.valueOf(ixVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(ixVar.b.id);
                            i15 = 2;
                            Object[] objArr4 = new Object[2];
                            objArr4[z15 ? 1 : 0] = valueOf6;
                            objArr4[1] = valueOf7;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr4)));
                            this.D++;
                        }
                        i21++;
                        i14++;
                        i12 = i15;
                        sparseIntArray2 = sparseIntArray5;
                        sparseIntArray = sparseIntArray4;
                        z11 = z15 ? 1 : 0;
                        i17 = 3;
                    }
                    return;
                }
                return;
            }
            i10 = -1;
        }
        this.c = i10;
        this.d = i10;
        this.f = i10;
        recentEmoji = vyVar.getRecentEmoji();
        zwVar = vyVar.I;
        if (zwVar != null) {
        }
        this.D = recentEmoji.size() + this.D;
        i11 = 0;
        while (true) {
            i12 = 2;
            if (i11 < recentEmoji.size()) {
            }
            arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i11))));
            i11++;
        }
        i13 = 0;
        i14 = 0;
        while (true) {
            String[][] strArr3 = org.telegram.messenger.l6.f;
            if (i13 < 8) {
            }
            i13++;
            i14++;
        }
        int i202 = vyVar.Q.J * 3;
        this.E = this.D;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.D;
    }

    @Override // s4.g0
    public final long c(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == this.d) {
            return 4;
        }
        if (i10 == this.c || i10 == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            int i11 = sparseIntArray.get(i10);
            char[] cArr = org.telegram.messenger.l6.a;
            return i11 >= 8 ? 5 : 1;
        }
        if (this.F.d0 && i10 == 0) {
            return 2;
        }
        if (this.w.indexOfKey(i10) >= 0) {
            return 3;
        }
        return this.x.indexOfKey(i10) >= 0 ? 6 : 0;
    }

    @Override // s4.g0
    public final void f() {
        F(false);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        vy vyVar = this.F;
        String[] strArr = vyVar.a1;
        vw vwVar = vyVar.Q;
        int i13 = vyVar.c1;
        ArrayList arrayList = vyVar.q1;
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        ix ixVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                n8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    n8Var.b(org.telegram.messenger.cd.L0(2131750836, null), R.drawable.msg_close, org.telegram.messenger.cd.L0(2131754899, null), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    n8Var.a(0, org.telegram.messenger.cd.L0(2131746376, null));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        n8Var.a(0, strArr[i15]);
                        return;
                    }
                    try {
                        n8Var.a(0, ((ix) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        n8Var.a(0, "");
                        return;
                    }
                }
            }
            int i16 = 6;
            int i17 = 5;
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                kx kxVar = (kx) view;
                int i18 = this.x.get(i12);
                int i19 = vwVar.J * 3;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    ixVar = (ix) arrayList.get(i18);
                }
                if (ixVar != null) {
                    kxVar.a.setText("+" + ((ixVar.c.size() - i19) + 1));
                    return;
                }
                return;
            }
            mx mxVar = (mx) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            ix ixVar2 = (ix) arrayList.get(length);
            int i20 = length - 1;
            ix ixVar3 = i20 >= 0 ? (ix) arrayList.get(i20) : null;
            if (ixVar2 == null || !ixVar2.g || (ixVar3 != null && !ixVar3.e && ixVar3.f && !org.telegram.messenger.d20.i(i13).q())) {
                z10 = false;
            }
            if (ixVar2 != null && ixVar2.d != null) {
                org.telegram.messenger.ui.b0(i13).m0(ixVar2.d, false);
                ixVar2.d = null;
            }
            kg.x0 x0Var = mxVar.r;
            if (ixVar2 == null) {
                return;
            }
            mxVar.x = ixVar2;
            mxVar.y = z10;
            mxVar.d.l(ixVar2.b.title, false);
            mxVar.e.setVisibility(ixVar2.i ? 0 : 8);
            if (!ixVar2.f || ixVar2.b.official) {
                x0Var.b(org.telegram.messenger.cd.L0(2131743901, null), new lx(mxVar, i16), false);
            } else {
                x0Var.b(org.telegram.messenger.cd.L0(2131746099, null), new lx(mxVar, i17), false);
            }
            mxVar.a(false);
            return;
        }
        ey eyVar = (ey) view;
        eyVar.a = i12;
        eyVar.e = null;
        if (vyVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = vyVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = vyVar.getRecentEmoji().get(i12);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l4 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l4 = null;
            str2 = str;
            document = null;
        } else {
            int i21 = 0;
            while (true) {
                String[][] strArr2 = org.telegram.messenger.l6.f;
                if (i21 >= 8) {
                    str = null;
                    break;
                }
                String[] strArr3 = strArr2[i21];
                int length2 = strArr3.length + 1;
                int i22 = (i12 - size) - 1;
                if (i22 < 0 || i12 >= size + length2) {
                    size += length2;
                    i21++;
                } else {
                    String str4 = strArr3[i22];
                    String str5 = (String) org.telegram.messenger.k6.j.get(str4);
                    if (str5 != null) {
                        str = vy.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q6 = org.telegram.messenger.d20.i(i13).q();
                int i23 = vwVar.J * 3;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i24 >= arrayList2.size()) {
                        break;
                    }
                    ix ixVar4 = (ix) arrayList.get(i24);
                    int intValue = ((Integer) arrayList2.get(i24)).intValue() + 1;
                    int size2 = ((ixVar4.f && !ixVar4.g && (ixVar4.e || q6)) || ixVar4.h) ? ixVar4.c.size() : Math.min(i23, ixVar4.c.size());
                    int i25 = eyVar.a;
                    if (i25 < intValue || (i11 = i25 - intValue) >= size2) {
                        i24++;
                    } else {
                        eyVar.e = ixVar4;
                        TLRPC.Document document2 = (TLRPC.Document) ixVar4.c.get(i11);
                        document = document2;
                        l4 = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l4 = null;
            document = null;
            z10 = false;
        }
        if (l4 != null) {
            eyVar.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        } else {
            eyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            eyVar.a(null, z10);
            if (eyVar.getSpan() == null || eyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    eyVar.setSpan(new o5(document, (Paint.FontMetricsInt) null));
                } else {
                    eyVar.setSpan(new o5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            eyVar.a(org.telegram.messenger.k6.f(str), z10);
            eyVar.setSpan(null);
        }
        eyVar.setTag(str2);
        eyVar.setContentDescription(str);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        vy vyVar = this.F;
        if (i10 == 0) {
            view = new ey(vyVar.getContext());
        } else if (i10 == 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(vyVar.getContext(), true, false, vyVar.Z1, vyVar.i2);
            n8Var.setOnIconClickListener(new h0(this, 12));
            view = n8Var;
        } else if (i10 == 3) {
            view = new jx(vyVar, vyVar.getContext());
        } else if (i10 == 4) {
            Context context = vyVar.getContext();
            ty tyVar = new ty(vyVar, true);
            vyVar.T = tyVar;
            ag.b1 b1Var = new ag.b1(vyVar, context, tyVar);
            b1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
            b1Var.setClipToPadding(false);
            b1Var.i(new dh.g(3));
            b1Var.setOnItemClickListener(new k(this, 5));
            view = b1Var;
        } else if (i10 == 5) {
            view = new mx(vyVar, vyVar.getContext());
        } else if (i10 != 6) {
            View view2 = new View(vyVar.getContext());
            view2.setLayoutParams(new s4.o0(-1, vyVar.b1));
            view = view2;
        } else {
            Context context2 = vyVar.getContext();
            org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
            kx kxVar = new kx(context2);
            TextView textView = new TextView(context2);
            kxVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.d6, p6Var);
            int L = org.telegram.messenger.i0.L(11.0f);
            int i11 = org.telegram.ui.ActionBar.t6.If;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 99));
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 99);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(textView, d02, h, null, p6Var);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f));
            kxVar.addView(textView, w7.b6.e(-2, -2, 17));
            view = kxVar;
        }
        return new ck0(view);
    }
}
