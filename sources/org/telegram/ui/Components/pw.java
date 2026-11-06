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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pw extends oj0 {
    public int D;
    public int E;
    public final /* synthetic */ gy F;
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

    public pw(gy gyVar) {
        this.F = gyVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 4 || i7 == 3 || i7 == 6;
    }

    public final void E(int i7, View view) {
        gy gyVar = this.F;
        ArrayList arrayList = gyVar.q1;
        int i10 = this.x.get(i7);
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        tw twVar = (tw) arrayList.get(i10);
        if (twVar.h) {
            return;
        }
        boolean z9 = i10 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i10)).intValue();
        gyVar.o1.add(Long.valueOf(twVar.b.id));
        boolean z10 = org.telegram.messenger.p10.i(gyVar.c1).q() || gyVar.U0;
        int i11 = gyVar.Q.J * 3;
        int size = ((twVar.f && !twVar.g && (twVar.e || z10)) || twVar.h) ? twVar.c.size() : Math.min(i11, twVar.c.size());
        Integer num = null;
        Integer valueOf = twVar.c.size() > i11 ? Integer.valueOf(intValue + 1 + size) : null;
        twVar.h = true;
        int size2 = twVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        gyVar.s2 = view;
        gyVar.t2 = valueOf.intValue();
        gyVar.u2 = num.intValue() + valueOf.intValue();
        gyVar.v2 = SystemClock.elapsedRealtime();
        o(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z9) {
            gyVar.post(new ow(this, num.intValue() > i11 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z9) {
        gy gyVar = this.F;
        ArrayList arrayList = gyVar.n1;
        if (gyVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(gyVar.c1);
        ArrayList arrayList3 = b02.s0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!b02.B0(stickerSetCovered.set.id, true) || gyVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z9);
        H();
        ey eyVar = gyVar.T;
        if (eyVar != null) {
            eyVar.f();
        }
        v4.o.c(new jg.h(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z9) {
        boolean z10;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        gy gyVar = this.F;
        ArrayList arrayList = gyVar.n1;
        ArrayList arrayList2 = gyVar.o1;
        int i10 = gyVar.c1;
        ArrayList arrayList3 = gyVar.q1;
        arrayList3.clear();
        if (gyVar.c2) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            if (z9 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z11 = org.telegram.messenger.p10.i(i10).q() || gyVar.U0;
            TLRPC.ChatFull chatFull = gyVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                tw twVar = new tw();
                twVar.b = gyVar.J1.emojiset;
                twVar.c = new ArrayList(Y.documents);
                twVar.e = true;
                twVar.f = true;
                twVar.g = false;
                twVar.h = true;
                twVar.i = true;
                arrayList3.add(twVar);
                TLRPC.StickerSet stickerSet2 = twVar.b;
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
                    if (tL_messages_stickerSet2 == null || org.telegram.messenger.ij.W3(tL_messages_stickerSet2)) {
                        i7 = 1;
                    } else {
                        tw twVar2 = new tw();
                        twVar2.b = tL_messages_stickerSet2.set;
                        twVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        twVar2.e = true;
                        twVar2.f = b02.B0(tL_messages_stickerSet2.set.id, true);
                        twVar2.g = false;
                        twVar2.h = true;
                        arrayList3.add(twVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12 += i7;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z11) {
                    tw twVar3 = new tw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    twVar3.b = stickerSet3;
                    twVar3.c = tL_messages_stickerSet3.documents;
                    twVar3.e = false;
                    twVar3.f = b02.B0(stickerSet3.id, true);
                    twVar3.g = false;
                    twVar3.h = true;
                    arrayList3.add(twVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.ij.n3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        tw twVar4 = new tw();
                        twVar4.b = tL_messages_stickerSet3.set;
                        twVar4.c = new ArrayList(arrayList5);
                        twVar4.e = true;
                        twVar4.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        twVar4.g = false;
                        twVar4.h = true;
                        arrayList3.add(twVar4);
                    }
                    if (arrayList6.size() > 0) {
                        tw twVar5 = new tw();
                        twVar5.b = tL_messages_stickerSet3.set;
                        twVar5.c = new ArrayList(arrayList6);
                        twVar5.e = false;
                        twVar5.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        twVar5.g = false;
                        twVar5.h = arrayList2.contains(Long.valueOf(twVar5.b.id));
                        arrayList3.add(twVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                tw twVar6 = new tw();
                twVar6.f = b02.B0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                twVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    twVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.ui.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        twVar6.c = l02.documents;
                    } else {
                        twVar6.d = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                    }
                } else {
                    twVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = twVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= twVar6.c.size()) {
                            z10 = false;
                            break;
                        } else {
                            if (!org.telegram.messenger.ij.n3((TLRPC.Document) twVar6.c.get(i16))) {
                                z10 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    twVar6.e = !z10;
                    twVar6.h = arrayList2.contains(Long.valueOf(twVar6.b.id));
                    twVar6.g = true;
                    arrayList3.add(twVar6);
                }
            }
            kw kwVar = gyVar.I;
            if (kwVar != null) {
                kwVar.p(gyVar.getEmojipacks());
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
        kw kwVar;
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
        gy gyVar = this.F;
        boolean z11 = gyVar.d0;
        ArrayList arrayList3 = gyVar.q1;
        ArrayList arrayList4 = gyVar.n1;
        int i15 = gyVar.c1;
        Object[] objArr = org.telegram.messenger.p10.i(i15).q() || gyVar.U0;
        if (z11) {
            this.D++;
            arrayList2.add(-1);
        }
        int i16 = 3;
        if (!objArr == true || !gyVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
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
                recentEmoji = gyVar.getRecentEmoji();
                kwVar = gyVar.I;
                if (kwVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z12 = !isEmpty;
                    wu wuVar = kwVar.D;
                    if (kwVar.W != z12) {
                        kwVar.W = z12;
                        if (kwVar.V) {
                            wuVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            wuVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(xq.h).start();
                        }
                        if (!isEmpty || kwVar.M != 0) {
                            z9 = isEmpty ? true : true;
                            kwVar.b.requestLayout();
                            kwVar.V = false;
                        }
                        kwVar.j(0, kwVar.V ^ z9);
                        kwVar.b.requestLayout();
                        kwVar.V = false;
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
                int i19 = gyVar.Q.J * 3;
                this.E = this.D;
                this.e = -1;
                if (arrayList3 == null) {
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        sparseIntArray.put(this.D, i13);
                        sparseIntArray2.put(i13, this.D);
                        arrayList.add(Integer.valueOf(this.D));
                        tw twVar = (tw) arrayList3.get(i20);
                        boolean z13 = twVar.g;
                        if (z13 && this.e < 0) {
                            this.e = this.D;
                        }
                        int size = ((twVar.f && !z13 && (twVar.e || objArr == true)) || twVar.h) ? twVar.c.size() : Math.min(i19, twVar.c.size());
                        int i21 = 1 + size;
                        boolean z14 = z10;
                        if (twVar.h || twVar.c.size() <= i19) {
                            size = i21;
                        }
                        Integer valueOf = Integer.valueOf(twVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = twVar.b;
                        int i22 = i11;
                        int i23 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i20 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(twVar.i);
                        int i24 = i16;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i24];
                        objArr2[z14 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i22] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i25 = 1;
                        while (i25 < i23) {
                            Integer valueOf4 = Integer.valueOf(twVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) twVar.c.get(i25 - 1)).id);
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
                        if (twVar.h || twVar.c.size() <= i19) {
                            i14 = 2;
                        } else {
                            sparseIntArray3.put(this.D, i20);
                            Integer valueOf6 = Integer.valueOf(twVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(twVar.b.id);
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
        recentEmoji = gyVar.getRecentEmoji();
        kwVar = gyVar.I;
        if (kwVar != null) {
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
        int i192 = gyVar.Q.J * 3;
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
        gy gyVar = this.F;
        String[] strArr = gyVar.a1;
        gw gwVar = gyVar.Q;
        int i12 = gyVar.c1;
        ArrayList arrayList = gyVar.q1;
        int i13 = d1Var.f;
        View view = d1Var.a;
        boolean z9 = true;
        tw twVar = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i13 == 1) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                j8Var.getClass();
                int i14 = sparseIntArray.get(i11);
                if (i11 == this.c) {
                    j8Var.b(org.telegram.messenger.hd.M0(2131750836, null), R.drawable.msg_close, org.telegram.messenger.hd.M0(2131754899, null), 0, 0);
                    return;
                }
                if (i11 == this.f) {
                    j8Var.a(0, org.telegram.messenger.hd.M0(2131746360, null));
                    return;
                } else {
                    if (i14 < strArr.length) {
                        j8Var.a(0, strArr[i14]);
                        return;
                    }
                    try {
                        j8Var.a(0, ((tw) arrayList.get(i14 - strArr.length)).b.title);
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
                vw vwVar = (vw) view;
                int i17 = this.x.get(i11);
                int i18 = gwVar.J * 3;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    twVar = (tw) arrayList.get(i17);
                }
                if (twVar != null) {
                    vwVar.a.setText("+" + ((twVar.c.size() - i18) + 1));
                    return;
                }
                return;
            }
            xw xwVar = (xw) view;
            int length = sparseIntArray.get(i11) - strArr.length;
            tw twVar2 = (tw) arrayList.get(length);
            int i19 = length - 1;
            tw twVar3 = i19 >= 0 ? (tw) arrayList.get(i19) : null;
            if (twVar2 == null || !twVar2.g || (twVar3 != null && !twVar3.e && twVar3.f && !org.telegram.messenger.p10.i(i12).q())) {
                z9 = false;
            }
            if (twVar2 != null && twVar2.d != null) {
                org.telegram.messenger.ui.b0(i12).m0(twVar2.d, false);
                twVar2.d = null;
            }
            ug.p0 p0Var = xwVar.r;
            if (twVar2 == null) {
                return;
            }
            xwVar.x = twVar2;
            xwVar.y = z9;
            xwVar.d.l(twVar2.b.title, false);
            xwVar.e.setVisibility(twVar2.i ? 0 : 8);
            if (!twVar2.f || twVar2.b.official) {
                p0Var.b(org.telegram.messenger.hd.M0(2131743877, null), new ww(xwVar, i15), false);
            } else {
                p0Var.b(org.telegram.messenger.hd.M0(2131746083, null), new ww(xwVar, i16), false);
            }
            xwVar.a(false);
            return;
        }
        px pxVar = (px) view;
        pxVar.a = i11;
        pxVar.e = null;
        if (gyVar.d0) {
            i11--;
        }
        if (this.f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = gyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = gyVar.getRecentEmoji().get(i11);
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
                        str = gy.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q10 = org.telegram.messenger.p10.i(i12).q();
                int i22 = gwVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    tw twVar4 = (tw) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    int size2 = ((twVar4.f && !twVar4.g && (twVar4.e || q10)) || twVar4.h) ? twVar4.c.size() : Math.min(i22, twVar4.c.size());
                    int i24 = pxVar.a;
                    if (i24 < intValue || (i10 = i24 - intValue) >= size2) {
                        i23++;
                    } else {
                        pxVar.e = twVar4;
                        TLRPC.Document document2 = (TLRPC.Document) twVar4.c.get(i10);
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
            pxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            pxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            pxVar.a(null, z9);
            if (pxVar.getSpan() == null || pxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    pxVar.setSpan(new r5(document, (Paint.FontMetricsInt) null));
                } else {
                    pxVar.setSpan(new r5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            pxVar.a(org.telegram.messenger.i6.f(str), z9);
            pxVar.setSpan(null);
        }
        pxVar.setTag(str2);
        pxVar.setContentDescription(str);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        gy gyVar = this.F;
        if (i7 == 0) {
            view = new px(gyVar.getContext());
        } else if (i7 == 1) {
            org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(gyVar.getContext(), true, false, gyVar.Z1, gyVar.i2);
            j8Var.setOnIconClickListener(new h0(this, 13));
            view = j8Var;
        } else if (i7 == 3) {
            view = new uw(gyVar, gyVar.getContext());
        } else if (i7 == 4) {
            Context context = gyVar.getContext();
            ey eyVar = new ey(gyVar, true);
            gyVar.T = eyVar;
            bi.q1 q1Var = new bi.q1(gyVar, context, eyVar);
            q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            q1Var.setClipToPadding(false);
            q1Var.i(new di.k(6));
            q1Var.setOnItemClickListener(new k(this, 5));
            view = q1Var;
        } else if (i7 == 5) {
            view = new xw(gyVar, gyVar.getContext());
        } else if (i7 != 6) {
            View view2 = new View(gyVar.getContext());
            view2.setLayoutParams(new v4.o0(-1, gyVar.b1));
            view = view2;
        } else {
            Context context2 = gyVar.getContext();
            org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
            vw vwVar = new vw(context2);
            TextView textView = new TextView(context2);
            vwVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.d6, f6Var);
            int L = org.telegram.messenger.g0.L(11.0f);
            int i10 = org.telegram.ui.ActionBar.k6.If;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 99));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 99);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, f6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
            vwVar.addView(textView, c8.ha.e(-2, -2, 17));
            view = vwVar;
        }
        return new xi0(view);
    }
}
