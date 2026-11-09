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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qw extends pj0 {
    public int D;
    public int E;
    public final /* synthetic */ hy F;
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

    public qw(hy hyVar) {
        this.F = hyVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 4 || i7 == 3 || i7 == 6;
    }

    public final void E(int i7, View view) {
        hy hyVar = this.F;
        ArrayList arrayList = hyVar.q1;
        int i10 = this.x.get(i7);
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        uw uwVar = (uw) arrayList.get(i10);
        if (uwVar.h) {
            return;
        }
        boolean z9 = i10 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i10)).intValue();
        hyVar.o1.add(Long.valueOf(uwVar.b.id));
        boolean z10 = org.telegram.messenger.p10.i(hyVar.c1).q() || hyVar.U0;
        int i11 = hyVar.Q.J * 3;
        int size = ((uwVar.f && !uwVar.g && (uwVar.e || z10)) || uwVar.h) ? uwVar.c.size() : Math.min(i11, uwVar.c.size());
        Integer num = null;
        Integer valueOf = uwVar.c.size() > i11 ? Integer.valueOf(intValue + 1 + size) : null;
        uwVar.h = true;
        int size2 = uwVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        hyVar.s2 = view;
        hyVar.t2 = valueOf.intValue();
        hyVar.u2 = num.intValue() + valueOf.intValue();
        hyVar.v2 = SystemClock.elapsedRealtime();
        o(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z9) {
            hyVar.post(new pw(this, num.intValue() > i11 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z9) {
        hy hyVar = this.F;
        ArrayList arrayList = hyVar.n1;
        if (hyVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(hyVar.c1);
        ArrayList arrayList3 = b02.s0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!b02.B0(stickerSetCovered.set.id, true) || hyVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z9);
        H();
        fy fyVar = hyVar.T;
        if (fyVar != null) {
            fyVar.f();
        }
        v4.o.c(new jg.h(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z9) {
        boolean z10;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        hy hyVar = this.F;
        ArrayList arrayList = hyVar.n1;
        ArrayList arrayList2 = hyVar.o1;
        int i10 = hyVar.c1;
        ArrayList arrayList3 = hyVar.q1;
        arrayList3.clear();
        if (hyVar.c2) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            if (z9 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z11 = org.telegram.messenger.p10.i(i10).q() || hyVar.U0;
            TLRPC.ChatFull chatFull = hyVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                uw uwVar = new uw();
                uwVar.b = hyVar.J1.emojiset;
                uwVar.c = new ArrayList(Y.documents);
                uwVar.e = true;
                uwVar.f = true;
                uwVar.g = false;
                uwVar.h = true;
                uwVar.i = true;
                arrayList3.add(uwVar);
                TLRPC.StickerSet stickerSet2 = uwVar.b;
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
            if (!z11) {
                int i12 = 0;
                while (i12 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet2 == null || org.telegram.messenger.ij.V3(tL_messages_stickerSet2)) {
                        i7 = 1;
                    } else {
                        uw uwVar2 = new uw();
                        uwVar2.b = tL_messages_stickerSet2.set;
                        uwVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        uwVar2.e = true;
                        uwVar2.f = b02.B0(tL_messages_stickerSet2.set.id, true);
                        uwVar2.g = false;
                        uwVar2.h = true;
                        arrayList3.add(uwVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12 += i7;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z11) {
                    uw uwVar3 = new uw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    uwVar3.b = stickerSet3;
                    uwVar3.c = tL_messages_stickerSet3.documents;
                    uwVar3.e = false;
                    uwVar3.f = b02.B0(stickerSet3.id, true);
                    uwVar3.g = false;
                    uwVar3.h = true;
                    arrayList3.add(uwVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.ij.m3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        uw uwVar4 = new uw();
                        uwVar4.b = tL_messages_stickerSet3.set;
                        uwVar4.c = new ArrayList(arrayList5);
                        uwVar4.e = true;
                        uwVar4.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        uwVar4.g = false;
                        uwVar4.h = true;
                        arrayList3.add(uwVar4);
                    }
                    if (arrayList6.size() > 0) {
                        uw uwVar5 = new uw();
                        uwVar5.b = tL_messages_stickerSet3.set;
                        uwVar5.c = new ArrayList(arrayList6);
                        uwVar5.e = false;
                        uwVar5.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        uwVar5.g = false;
                        uwVar5.h = arrayList2.contains(Long.valueOf(uwVar5.b.id));
                        arrayList3.add(uwVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                uw uwVar6 = new uw();
                uwVar6.f = b02.B0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                uwVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    uwVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.ui.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        uwVar6.c = l02.documents;
                    } else {
                        uwVar6.d = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                    }
                } else {
                    uwVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = uwVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= uwVar6.c.size()) {
                            z10 = false;
                            break;
                        } else {
                            if (!org.telegram.messenger.ij.m3((TLRPC.Document) uwVar6.c.get(i16))) {
                                z10 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    uwVar6.e = !z10;
                    uwVar6.h = arrayList2.contains(Long.valueOf(uwVar6.b.id));
                    uwVar6.g = true;
                    arrayList3.add(uwVar6);
                }
            }
            lw lwVar = hyVar.I;
            if (lwVar != null) {
                lwVar.p(hyVar.getEmojipacks());
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
        int i7;
        ArrayList<String> recentEmoji;
        lw lwVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
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
        boolean z10 = false;
        this.D = 0;
        hy hyVar = this.F;
        boolean z11 = hyVar.d0;
        ArrayList arrayList3 = hyVar.q1;
        ArrayList arrayList4 = hyVar.n1;
        int i15 = hyVar.c1;
        Object[] objArr = org.telegram.messenger.p10.i(i15).q() || hyVar.U0;
        if (z11) {
            this.D++;
            arrayList2.add(-1);
        }
        int i16 = 3;
        if (!objArr == true || !hyVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
            i7 = -1;
        } else {
            if (org.telegram.messenger.qp.s1(i15).f7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id && z11) {
                int i17 = this.D;
                this.c = i17;
                this.d = i17 + 1;
                this.D = i17 + 3;
                this.f = i17 + 2;
                arrayList2.add(324953);
                arrayList2.add(123342);
                arrayList2.add(929132);
                recentEmoji = hyVar.getRecentEmoji();
                lwVar = hyVar.I;
                if (lwVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z12 = !isEmpty;
                    xu xuVar = lwVar.D;
                    if (lwVar.W != z12) {
                        lwVar.W = z12;
                        if (lwVar.V) {
                            xuVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            xuVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(xq.h).start();
                        }
                        if (!isEmpty || lwVar.M != 0) {
                            z9 = isEmpty ? true : true;
                            lwVar.b.requestLayout();
                            lwVar.V = false;
                        }
                        lwVar.j(0, lwVar.V ^ z9);
                        lwVar.b.requestLayout();
                        lwVar.V = false;
                    }
                }
                this.D = recentEmoji.size() + this.D;
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
                    sparseIntArray.put(this.D, i13);
                    sparseIntArray2.put(i13, this.D);
                    this.D = strArr[i12].length + 1 + this.D;
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
                int i19 = hyVar.Q.J * 3;
                this.E = this.D;
                this.e = -1;
                if (arrayList3 == null) {
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        sparseIntArray.put(this.D, i13);
                        sparseIntArray2.put(i13, this.D);
                        arrayList.add(Integer.valueOf(this.D));
                        uw uwVar = (uw) arrayList3.get(i20);
                        boolean z13 = uwVar.g;
                        if (z13 && this.e < 0) {
                            this.e = this.D;
                        }
                        int size = ((uwVar.f && !z13 && (uwVar.e || objArr == true)) || uwVar.h) ? uwVar.c.size() : Math.min(i19, uwVar.c.size());
                        int i21 = 1 + size;
                        boolean z14 = z10;
                        if (uwVar.h || uwVar.c.size() <= i19) {
                            size = i21;
                        }
                        Integer valueOf = Integer.valueOf(uwVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = uwVar.b;
                        int i22 = i11;
                        int i23 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i20 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(uwVar.i);
                        int i24 = i16;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i24];
                        objArr2[z14 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i22] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i25 = 1;
                        while (i25 < i23) {
                            Integer valueOf4 = Integer.valueOf(uwVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) uwVar.c.get(i25 - 1)).id);
                            Object[] objArr3 = new Object[i22];
                            objArr3[z14 ? 1 : 0] = valueOf4;
                            objArr3[1] = valueOf5;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr3)));
                            i25++;
                            sparseIntArray2 = sparseIntArray2;
                            i22 = 2;
                        }
                        SparseIntArray sparseIntArray5 = sparseIntArray2;
                        this.D += i23;
                        if (uwVar.h || uwVar.c.size() <= i19) {
                            i14 = 2;
                        } else {
                            sparseIntArray3.put(this.D, i20);
                            Integer valueOf6 = Integer.valueOf(uwVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(uwVar.b.id);
                            i14 = 2;
                            Object[] objArr4 = new Object[2];
                            objArr4[z14 ? 1 : 0] = valueOf6;
                            objArr4[1] = valueOf7;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr4)));
                            this.D++;
                        }
                        i20++;
                        i13++;
                        i11 = i14;
                        sparseIntArray2 = sparseIntArray5;
                        sparseIntArray = sparseIntArray4;
                        z10 = z14 ? 1 : 0;
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
        recentEmoji = hyVar.getRecentEmoji();
        lwVar = hyVar.I;
        if (lwVar != null) {
        }
        this.D = recentEmoji.size() + this.D;
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
        int i192 = hyVar.Q.J * 3;
        this.E = this.D;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.D;
    }

    @Override // v4.g0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.g0
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
            char[] cArr = org.telegram.messenger.j6.a;
            return i10 >= 8 ? 5 : 1;
        }
        if (this.F.d0 && i7 == 0) {
            return 2;
        }
        if (this.w.indexOfKey(i7) >= 0) {
            return 3;
        }
        return this.x.indexOfKey(i7) >= 0 ? 6 : 0;
    }

    @Override // v4.g0
    public final void f() {
        F(false);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i10;
        int i11 = i7;
        hy hyVar = this.F;
        String[] strArr = hyVar.a1;
        hw hwVar = hyVar.Q;
        int i12 = hyVar.c1;
        ArrayList arrayList = hyVar.q1;
        int i13 = d1Var.f;
        View view = d1Var.a;
        boolean z9 = true;
        uw uwVar = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i13 == 1) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                j8Var.getClass();
                int i14 = sparseIntArray.get(i11);
                if (i11 == this.c) {
                    j8Var.b(org.telegram.messenger.id.M0(2131750835, null), R.drawable.msg_close, org.telegram.messenger.id.M0(2131754899, null), 0, 0);
                    return;
                }
                if (i11 == this.f) {
                    j8Var.a(0, org.telegram.messenger.id.M0(2131746361, null));
                    return;
                } else {
                    if (i14 < strArr.length) {
                        j8Var.a(0, strArr[i14]);
                        return;
                    }
                    try {
                        j8Var.a(0, ((uw) arrayList.get(i14 - strArr.length)).b.title);
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
                ww wwVar = (ww) view;
                int i17 = this.x.get(i11);
                int i18 = hwVar.J * 3;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    uwVar = (uw) arrayList.get(i17);
                }
                if (uwVar != null) {
                    wwVar.a.setText("+" + ((uwVar.c.size() - i18) + 1));
                    return;
                }
                return;
            }
            yw ywVar = (yw) view;
            int length = sparseIntArray.get(i11) - strArr.length;
            uw uwVar2 = (uw) arrayList.get(length);
            int i19 = length - 1;
            uw uwVar3 = i19 >= 0 ? (uw) arrayList.get(i19) : null;
            if (uwVar2 == null || !uwVar2.g || (uwVar3 != null && !uwVar3.e && uwVar3.f && !org.telegram.messenger.p10.i(i12).q())) {
                z9 = false;
            }
            if (uwVar2 != null && uwVar2.d != null) {
                org.telegram.messenger.ui.b0(i12).m0(uwVar2.d, false);
                uwVar2.d = null;
            }
            ug.p0 p0Var = ywVar.r;
            if (uwVar2 == null) {
                return;
            }
            ywVar.x = uwVar2;
            ywVar.y = z9;
            ywVar.d.l(uwVar2.b.title, false);
            ywVar.e.setVisibility(uwVar2.i ? 0 : 8);
            if (!uwVar2.f || uwVar2.b.official) {
                p0Var.b(org.telegram.messenger.id.M0(2131743876, null), new xw(ywVar, i15), false);
            } else {
                p0Var.b(org.telegram.messenger.id.M0(2131746082, null), new xw(ywVar, i16), false);
            }
            ywVar.a(false);
            return;
        }
        qx qxVar = (qx) view;
        qxVar.a = i11;
        qxVar.e = null;
        if (hyVar.d0) {
            i11--;
        }
        if (this.f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = hyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = hyVar.getRecentEmoji().get(i11);
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
                        str = hy.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q10 = org.telegram.messenger.p10.i(i12).q();
                int i22 = hwVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    uw uwVar4 = (uw) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    int size2 = ((uwVar4.f && !uwVar4.g && (uwVar4.e || q10)) || uwVar4.h) ? uwVar4.c.size() : Math.min(i22, uwVar4.c.size());
                    int i24 = qxVar.a;
                    if (i24 < intValue || (i10 = i24 - intValue) >= size2) {
                        i23++;
                    } else {
                        qxVar.e = uwVar4;
                        TLRPC.Document document2 = (TLRPC.Document) uwVar4.c.get(i10);
                        document = document2;
                        l10 = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l10 = null;
            document = null;
            z9 = false;
        }
        if (l10 != null) {
            qxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            qxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            qxVar.a(null, z9);
            if (qxVar.getSpan() == null || qxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    qxVar.setSpan(new r5(document, (Paint.FontMetricsInt) null));
                } else {
                    qxVar.setSpan(new r5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            qxVar.a(org.telegram.messenger.i6.f(str), z9);
            qxVar.setSpan(null);
        }
        qxVar.setTag(str2);
        qxVar.setContentDescription(str);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        hy hyVar = this.F;
        if (i7 == 0) {
            view = new qx(hyVar.getContext());
        } else if (i7 == 1) {
            org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(hyVar.getContext(), true, false, hyVar.Z1, hyVar.i2);
            j8Var.setOnIconClickListener(new h0(this, 13));
            view = j8Var;
        } else if (i7 == 3) {
            view = new vw(hyVar, hyVar.getContext());
        } else if (i7 == 4) {
            Context context = hyVar.getContext();
            fy fyVar = new fy(hyVar, true);
            hyVar.T = fyVar;
            bi.q1 q1Var = new bi.q1(hyVar, context, fyVar);
            q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            q1Var.setClipToPadding(false);
            q1Var.i(new di.k(6));
            q1Var.setOnItemClickListener(new k(this, 5));
            view = q1Var;
        } else if (i7 == 5) {
            view = new yw(hyVar, hyVar.getContext());
        } else if (i7 != 6) {
            View view2 = new View(hyVar.getContext());
            view2.setLayoutParams(new v4.o0(-1, hyVar.b1));
            view = view2;
        } else {
            Context context2 = hyVar.getContext();
            org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
            ww wwVar = new ww(context2);
            TextView textView = new TextView(context2);
            wwVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.d6, g6Var);
            int L = org.telegram.messenger.g0.L(11.0f);
            int i10 = org.telegram.ui.ActionBar.l6.If;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, i0.a.o(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 99));
            org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i10, 99);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.s6.j(textView, d02, g10, null, g6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
            wwVar.addView(textView, c8.ha.e(-2, -2, 17));
            view = wwVar;
        }
        return new yi0(view);
    }
}
