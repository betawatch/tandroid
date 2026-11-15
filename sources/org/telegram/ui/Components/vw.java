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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vw extends tj0 {
    public int E;
    public int F;
    public final /* synthetic */ ly G;
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

    public vw(ly lyVar) {
        this.G = lyVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 4 || i7 == 3 || i7 == 6;
    }

    public final void E(int i7, View view) {
        ly lyVar = this.G;
        ArrayList arrayList = lyVar.r1;
        int i10 = this.x.get(i7);
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        zw zwVar = (zw) arrayList.get(i10);
        if (zwVar.h) {
            return;
        }
        boolean z10 = i10 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i10)).intValue();
        lyVar.p1.add(Long.valueOf(zwVar.b.id));
        boolean z11 = org.telegram.messenger.m10.i(lyVar.d1).q() || lyVar.V0;
        int i11 = lyVar.R.J * 3;
        int size = ((zwVar.f && !zwVar.g && (zwVar.e || z11)) || zwVar.h) ? zwVar.c.size() : Math.min(i11, zwVar.c.size());
        Integer num = null;
        Integer valueOf = zwVar.c.size() > i11 ? Integer.valueOf(intValue + 1 + size) : null;
        zwVar.h = true;
        int size2 = zwVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        lyVar.t2 = view;
        lyVar.u2 = valueOf.intValue();
        lyVar.v2 = num.intValue() + valueOf.intValue();
        lyVar.w2 = SystemClock.elapsedRealtime();
        o(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z10) {
            lyVar.post(new uw(this, num.intValue() > i11 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        ly lyVar = this.G;
        ArrayList arrayList = lyVar.o1;
        if (lyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(lyVar.d1);
        ArrayList arrayList3 = b02.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!b02.B0(stickerSetCovered.set.id, true) || lyVar.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        jy jyVar = lyVar.U;
        if (jyVar != null) {
            jyVar.f();
        }
        v4.o.c(new jg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        ly lyVar = this.G;
        ArrayList arrayList = lyVar.o1;
        ArrayList arrayList2 = lyVar.p1;
        int i10 = lyVar.d1;
        ArrayList arrayList3 = lyVar.r1;
        arrayList3.clear();
        if (lyVar.d2) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = org.telegram.messenger.m10.i(i10).q() || lyVar.V0;
            TLRPC.ChatFull chatFull = lyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                zw zwVar = new zw();
                zwVar.b = lyVar.K1.emojiset;
                zwVar.c = new ArrayList(Y.documents);
                zwVar.e = true;
                zwVar.f = true;
                zwVar.g = false;
                zwVar.h = true;
                zwVar.i = true;
                arrayList3.add(zwVar);
                TLRPC.StickerSet stickerSet2 = zwVar.b;
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
                    if (tL_messages_stickerSet2 == null || org.telegram.messenger.gj.V3(tL_messages_stickerSet2)) {
                        i7 = 1;
                    } else {
                        zw zwVar2 = new zw();
                        zwVar2.b = tL_messages_stickerSet2.set;
                        zwVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        zwVar2.e = true;
                        zwVar2.f = b02.B0(tL_messages_stickerSet2.set.id, true);
                        zwVar2.g = false;
                        zwVar2.h = true;
                        arrayList3.add(zwVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12 += i7;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z12) {
                    zw zwVar3 = new zw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    zwVar3.b = stickerSet3;
                    zwVar3.c = tL_messages_stickerSet3.documents;
                    zwVar3.e = false;
                    zwVar3.f = b02.B0(stickerSet3.id, true);
                    zwVar3.g = false;
                    zwVar3.h = true;
                    arrayList3.add(zwVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.gj.m3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        zw zwVar4 = new zw();
                        zwVar4.b = tL_messages_stickerSet3.set;
                        zwVar4.c = new ArrayList(arrayList5);
                        zwVar4.e = true;
                        zwVar4.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        zwVar4.g = false;
                        zwVar4.h = true;
                        arrayList3.add(zwVar4);
                    }
                    if (arrayList6.size() > 0) {
                        zw zwVar5 = new zw();
                        zwVar5.b = tL_messages_stickerSet3.set;
                        zwVar5.c = new ArrayList(arrayList6);
                        zwVar5.e = false;
                        zwVar5.f = b02.B0(tL_messages_stickerSet3.set.id, true);
                        zwVar5.g = false;
                        zwVar5.h = arrayList2.contains(Long.valueOf(zwVar5.b.id));
                        arrayList3.add(zwVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                zw zwVar6 = new zw();
                zwVar6.f = b02.B0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                zwVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    zwVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.si.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        zwVar6.c = l02.documents;
                    } else {
                        zwVar6.d = org.telegram.messenger.si.Z(stickerSetCovered.set);
                    }
                } else {
                    zwVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = zwVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= zwVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!org.telegram.messenger.gj.m3((TLRPC.Document) zwVar6.c.get(i16))) {
                                z11 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    zwVar6.e = !z11;
                    zwVar6.h = arrayList2.contains(Long.valueOf(zwVar6.b.id));
                    zwVar6.g = true;
                    arrayList3.add(zwVar6);
                }
            }
            qw qwVar = lyVar.J;
            if (qwVar != null) {
                qwVar.p(lyVar.getEmojipacks());
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
        qw qwVar;
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
        ly lyVar = this.G;
        boolean z12 = lyVar.e0;
        ArrayList arrayList3 = lyVar.r1;
        ArrayList arrayList4 = lyVar.o1;
        int i15 = lyVar.d1;
        Object[] objArr = org.telegram.messenger.m10.i(i15).q() || lyVar.V0;
        if (z12) {
            this.E++;
            arrayList2.add(-1);
        }
        int i16 = 3;
        if (!objArr == true || !lyVar.d2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
            i7 = -1;
        } else {
            if (org.telegram.messenger.np.s1(i15).g7.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id && z12) {
                int i17 = this.E;
                this.c = i17;
                this.d = i17 + 1;
                this.E = i17 + 3;
                this.f = i17 + 2;
                arrayList2.add(324953);
                arrayList2.add(123342);
                arrayList2.add(929132);
                recentEmoji = lyVar.getRecentEmoji();
                qwVar = lyVar.J;
                if (qwVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    cv cvVar = qwVar.E;
                    if (qwVar.a0 != z13) {
                        qwVar.a0 = z13;
                        if (qwVar.W) {
                            cvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            cvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(er.h).start();
                        }
                        if (!isEmpty || qwVar.N != 0) {
                            z10 = isEmpty ? true : true;
                            qwVar.b.requestLayout();
                            qwVar.W = false;
                        }
                        qwVar.j(0, qwVar.W ^ z10);
                        qwVar.b.requestLayout();
                        qwVar.W = false;
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
                int i19 = lyVar.R.J * 3;
                this.F = this.E;
                this.e = -1;
                if (arrayList3 == null) {
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        sparseIntArray.put(this.E, i13);
                        sparseIntArray2.put(i13, this.E);
                        arrayList.add(Integer.valueOf(this.E));
                        zw zwVar = (zw) arrayList3.get(i20);
                        boolean z14 = zwVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.E;
                        }
                        int size = ((zwVar.f && !z14 && (zwVar.e || objArr == true)) || zwVar.h) ? zwVar.c.size() : Math.min(i19, zwVar.c.size());
                        int i21 = 1 + size;
                        boolean z15 = z11;
                        if (zwVar.h || zwVar.c.size() <= i19) {
                            size = i21;
                        }
                        Integer valueOf = Integer.valueOf(zwVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = zwVar.b;
                        int i22 = i11;
                        int i23 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i20 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(zwVar.i);
                        int i24 = i16;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i24];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i22] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i25 = 1;
                        while (i25 < i23) {
                            Integer valueOf4 = Integer.valueOf(zwVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) zwVar.c.get(i25 - 1)).id);
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
                        if (zwVar.h || zwVar.c.size() <= i19) {
                            i14 = 2;
                        } else {
                            sparseIntArray3.put(this.E, i20);
                            Integer valueOf6 = Integer.valueOf(zwVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(zwVar.b.id);
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
        recentEmoji = lyVar.getRecentEmoji();
        qwVar = lyVar.J;
        if (qwVar != null) {
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
        int i192 = lyVar.R.J * 3;
        this.F = this.E;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // v4.h0
    public final int b() {
        return this.E;
    }

    @Override // v4.h0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.h0
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

    @Override // v4.h0
    public final void f() {
        F(false);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i10;
        int i11 = i7;
        ly lyVar = this.G;
        String[] strArr = lyVar.b1;
        mw mwVar = lyVar.R;
        int i12 = lyVar.d1;
        ArrayList arrayList = lyVar.r1;
        int i13 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        zw zwVar = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i13 == 1) {
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                i8Var.getClass();
                int i14 = sparseIntArray.get(i11);
                if (i11 == this.c) {
                    i8Var.b(org.telegram.messenger.hd.M0(2131750835, null), R.drawable.msg_close, org.telegram.messenger.hd.M0(2131754899, null), 0, 0);
                    return;
                }
                if (i11 == this.f) {
                    i8Var.a(0, org.telegram.messenger.hd.M0(2131746361, null));
                    return;
                } else {
                    if (i14 < strArr.length) {
                        i8Var.a(0, strArr[i14]);
                        return;
                    }
                    try {
                        i8Var.a(0, ((zw) arrayList.get(i14 - strArr.length)).b.title);
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
                bx bxVar = (bx) view;
                int i17 = this.x.get(i11);
                int i18 = mwVar.J * 3;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    zwVar = (zw) arrayList.get(i17);
                }
                if (zwVar != null) {
                    bxVar.a.setText("+" + ((zwVar.c.size() - i18) + 1));
                    return;
                }
                return;
            }
            dx dxVar = (dx) view;
            int length = sparseIntArray.get(i11) - strArr.length;
            zw zwVar2 = (zw) arrayList.get(length);
            int i19 = length - 1;
            zw zwVar3 = i19 >= 0 ? (zw) arrayList.get(i19) : null;
            if (zwVar2 == null || !zwVar2.g || (zwVar3 != null && !zwVar3.e && zwVar3.f && !org.telegram.messenger.m10.i(i12).q())) {
                z10 = false;
            }
            if (zwVar2 != null && zwVar2.d != null) {
                org.telegram.messenger.si.b0(i12).m0(zwVar2.d, false);
                zwVar2.d = null;
            }
            ug.q0 q0Var = dxVar.r;
            if (zwVar2 == null) {
                return;
            }
            dxVar.x = zwVar2;
            dxVar.y = z10;
            dxVar.d.l(zwVar2.b.title, false);
            dxVar.e.setVisibility(zwVar2.i ? 0 : 8);
            if (!zwVar2.f || zwVar2.b.official) {
                q0Var.b(org.telegram.messenger.hd.M0(2131743876, null), new cx(dxVar, i15), false);
            } else {
                q0Var.b(org.telegram.messenger.hd.M0(2131746082, null), new cx(dxVar, i16), false);
            }
            dxVar.a(false);
            return;
        }
        ux uxVar = (ux) view;
        uxVar.a = i11;
        uxVar.e = null;
        if (lyVar.e0) {
            i11--;
        }
        if (this.f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = lyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = lyVar.getRecentEmoji().get(i11);
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
                        str = ly.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q10 = org.telegram.messenger.m10.i(i12).q();
                int i22 = mwVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    zw zwVar4 = (zw) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    int size2 = ((zwVar4.f && !zwVar4.g && (zwVar4.e || q10)) || zwVar4.h) ? zwVar4.c.size() : Math.min(i22, zwVar4.c.size());
                    int i24 = uxVar.a;
                    if (i24 < intValue || (i10 = i24 - intValue) >= size2) {
                        i23++;
                    } else {
                        uxVar.e = zwVar4;
                        TLRPC.Document document2 = (TLRPC.Document) zwVar4.c.get(i10);
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
            uxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            uxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            uxVar.a(null, z10);
            if (uxVar.getSpan() == null || uxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    uxVar.setSpan(new p5(document, (Paint.FontMetricsInt) null));
                } else {
                    uxVar.setSpan(new p5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            uxVar.a(org.telegram.messenger.j6.f(str), z10);
            uxVar.setSpan(null);
        }
        uxVar.setTag(str2);
        uxVar.setContentDescription(str);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        ly lyVar = this.G;
        if (i7 == 0) {
            view = new ux(lyVar.getContext());
        } else if (i7 == 1) {
            org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(lyVar.getContext(), true, false, lyVar.a2, lyVar.j2);
            i8Var.setOnIconClickListener(new e0(this, 14));
            view = i8Var;
        } else if (i7 == 3) {
            view = new ax(lyVar, lyVar.getContext());
        } else if (i7 == 4) {
            Context context = lyVar.getContext();
            jy jyVar = new jy(lyVar, true);
            lyVar.U = jyVar;
            di.c1 c1Var = new di.c1(lyVar, context, jyVar);
            c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            c1Var.setClipToPadding(false);
            c1Var.i(new fi.k(6));
            c1Var.setOnItemClickListener(new j(this, 5));
            view = c1Var;
        } else if (i7 == 5) {
            view = new dx(lyVar, lyVar.getContext());
        } else if (i7 != 6) {
            View view2 = new View(lyVar.getContext());
            view2.setLayoutParams(new v4.p0(-1, lyVar.c1));
            view = view2;
        } else {
            Context context2 = lyVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
            bx bxVar = new bx(context2);
            TextView textView = new TextView(context2);
            bxVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.d6, e6Var);
            int L = org.telegram.messenger.g0.L(11.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Lf;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 99));
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 99);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.q6.j(textView, d02, g10, null, e6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
            bxVar.addView(textView, c8.ja.e(-2, -2, 17));
            view = bxVar;
        }
        return new cj0(view);
    }
}
