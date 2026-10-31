package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v41 extends sk0 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final /* synthetic */ w41 y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public v41(w41 w41Var, Context context) {
        this.y = w41Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 5;
    }

    public final void E(int i10, View view, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        w41 w41Var = this.y;
        LongSparseArray longSparseArray = w41Var.e;
        LongSparseArray longSparseArray2 = w41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = w41Var.c;
        int i11 = w41Var.a;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
        int i12 = this.x;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList arrayList2 = b02.u0[0];
            boolean z14 = arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z14) {
                b02.e1(stickerSetCovered.set.id);
            }
            z11 = z14;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        b02.p1(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 >= stickerSetCoveredArr.length) {
                z12 = false;
                break;
            }
            if (stickerSetCoveredArr[i13] != null) {
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ui.b0(i11).o0(stickerSetCoveredArr[i13].set.id);
                if (o02 != null && !o02.set.archived) {
                    stickerSetCoveredArr[i13] = null;
                } else if (stickerSetCoveredArr[i13].set.id == stickerSetCovered2.set.id) {
                    z12 = true;
                    break;
                }
            }
            i13++;
        }
        boolean B0 = b02.B0(stickerSetCovered2.set.id, true);
        boolean z15 = longSparseArray2.indexOfKey(stickerSetCovered2.set.id) >= 0;
        boolean z16 = longSparseArray.indexOfKey(stickerSetCovered2.set.id) >= 0;
        if (z15 && B0) {
            longSparseArray2.remove(stickerSetCovered2.set.id);
            z15 = false;
        } else if (z16 && !B0) {
            longSparseArray.remove(stickerSetCovered2.set.id);
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        w3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        w3Var.b(!z12 && z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z13 = true;
                w3Var.setNeedDivider(z13);
            }
        }
        z13 = false;
        w3Var.setNeedDivider(z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r3 >= r1.length) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1[r3] != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1[r3] = r9;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r1 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.s3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        ((org.telegram.ui.Cells.s3) r10).f.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.w3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        ((org.telegram.ui.Cells.w3) r10).b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r0.d.put(r9.set.id, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r10 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        r0.b.g(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r10 = r8.f;
        r0 = r10.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r1 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r10.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r3.set.id != r9.set.id) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        h(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, FrameLayout frameLayout) {
        w41 w41Var = this.y;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = w41Var.c;
        int i10 = 0;
        while (true) {
            if (i10 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i10] != null) {
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ui.b0(w41Var.a).o0(stickerSetCoveredArr[i10].set.id);
                if (o02 != null && !o02.set.archived) {
                    stickerSetCoveredArr[i10] = null;
                    break;
                } else if (stickerSetCoveredArr[i10].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i10++;
        }
    }

    public final void G() {
        int i10;
        w41 w41Var = this.y;
        int measuredWidth = w41Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.i0.L(72.0f));
            this.w = max;
            m41 m41Var = w41Var.r;
            if (m41Var.J != max) {
                m41Var.y1(max);
                w41Var.J = false;
            }
        }
        if (w41Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.x = 0;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(w41Var.a);
        ArrayList arrayList2 = new ArrayList(b02.s0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.n);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i12 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i12);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i12 == size) {
                    int i15 = this.x;
                    this.x = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.x));
                int i16 = this.x;
                this.x = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.x, stickerSetCovered.cover);
                } else {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.w);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.x + i18, stickerSetCovered.covers.get(i18));
                    }
                }
                int i19 = 0;
                while (true) {
                    i10 = this.w * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.x + i19, stickerSetCovered);
                    i19++;
                }
                this.x = i10 + this.x;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.x != 0) {
            w41Var.J = true;
            w41Var.K = b02.X();
        }
        f();
    }

    @Override // s4.g0
    public final int b() {
        return this.x + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == this.x) {
            return 3;
        }
        Object obj = this.d.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj.equals(-1) ? 4 : 2;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) this.d.get(i10), null, this.f.get(i10), null, false, false);
        } else {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.o3) view).setHeight(org.telegram.messenger.i0.L(82.0f));
                return;
            }
            if (i11 != 2) {
                if (i11 == 4) {
                    ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131747780, null));
                    return;
                } else if (i11 != 5) {
                    return;
                }
            }
            E(i10, view, false);
        }
    }

    @Override // s4.g0
    public final void v(s4.c1 c1Var, int i10, List list) {
        if (!list.contains(0)) {
            t(c1Var, i10);
            return;
        }
        int i11 = c1Var.f;
        if (i11 == 2 || i11 == 5) {
            E(i10, c1Var.a, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        w41 w41Var = this.y;
        org.telegram.ui.ActionBar.p6 p6Var = w41Var.P;
        Context context = this.c;
        if (i10 == 0) {
            my myVar = new my(2, context, p6Var, false);
            myVar.getImageView().E0(3);
            frameLayout = myVar;
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.o3(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(17, this.c, w41Var.P, true, true);
            final int i11 = 0;
            w3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t41
                public final /* synthetic */ v41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.w3 w3Var2 = (org.telegram.ui.Cells.w3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = w3Var2.getStickerSet();
                            v41 v41Var = this.b;
                            w41 w41Var2 = v41Var.y;
                            LongSparseArray longSparseArray = w41Var2.d;
                            LongSparseArray longSparseArray2 = w41Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!w3Var2.r) {
                                    v41Var.F(stickerSet, w3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    w41Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = s3Var.getStickerSet();
                            v41 v41Var2 = this.b;
                            w41 w41Var3 = v41Var2.y;
                            LongSparseArray longSparseArray3 = w41Var3.d;
                            LongSparseArray longSparseArray4 = w41Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!s3Var.w) {
                                    v41Var2.F(stickerSet2, s3Var);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    w41Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout = w3Var;
        } else if (i10 == 3) {
            frameLayout = new View(context);
        } else if (i10 == 4) {
            frameLayout = new org.telegram.ui.Cells.z3(context, p6Var);
        } else if (i10 != 5) {
            frameLayout = null;
        } else {
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, p6Var);
            final int i12 = 1;
            s3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t41
                public final /* synthetic */ v41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            org.telegram.ui.Cells.w3 w3Var2 = (org.telegram.ui.Cells.w3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = w3Var2.getStickerSet();
                            v41 v41Var = this.b;
                            w41 w41Var2 = v41Var.y;
                            LongSparseArray longSparseArray = w41Var2.d;
                            LongSparseArray longSparseArray2 = w41Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!w3Var2.r) {
                                    v41Var.F(stickerSet, w3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    w41Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = s3Var2.getStickerSet();
                            v41 v41Var2 = this.b;
                            w41 w41Var3 = v41Var2.y;
                            LongSparseArray longSparseArray3 = w41Var3.d;
                            LongSparseArray longSparseArray4 = w41Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!s3Var2.w) {
                                    v41Var2.F(stickerSet2, s3Var2);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    w41Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            s3Var.getImageView().setLayerNum(3);
            frameLayout = s3Var;
        }
        return new ck0(frameLayout);
    }
}
