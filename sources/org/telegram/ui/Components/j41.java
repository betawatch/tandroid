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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class j41 extends dk0 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final /* synthetic */ k41 y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public j41(k41 k41Var, Context context) {
        this.y = k41Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 5;
    }

    public final void E(int i7, View view, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        k41 k41Var = this.y;
        LongSparseArray longSparseArray = k41Var.e;
        LongSparseArray longSparseArray2 = k41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = k41Var.c;
        int i10 = k41Var.a;
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i10);
        int i11 = this.x;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i7 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            ArrayList arrayList2 = d02.v0[0];
            boolean z14 = arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z14) {
                d02.h1(stickerSetCovered.set.id);
            }
            z11 = z14;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        d02.s1(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 >= stickerSetCoveredArr.length) {
                z12 = false;
                break;
            }
            if (stickerSetCoveredArr[i12] != null) {
                TLRPC.TL_messages_stickerSet q02 = org.telegram.messenger.si.d0(i10).q0(stickerSetCoveredArr[i12].set.id);
                if (q02 != null && !q02.set.archived) {
                    stickerSetCoveredArr[i12] = null;
                } else if (stickerSetCoveredArr[i12].set.id == stickerSetCovered2.set.id) {
                    z12 = true;
                    break;
                }
            }
            i12++;
        }
        boolean E0 = d02.E0(stickerSetCovered2.set.id, true);
        boolean z15 = longSparseArray2.indexOfKey(stickerSetCovered2.set.id) >= 0;
        boolean z16 = longSparseArray.indexOfKey(stickerSetCovered2.set.id) >= 0;
        if (z15 && E0) {
            longSparseArray2.remove(stickerSetCovered2.set.id);
            z15 = false;
        } else if (z16 && !E0) {
            longSparseArray.remove(stickerSetCovered2.set.id);
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        v3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        v3Var.b(!z12 && z15, z10);
        if (i7 > 0) {
            int i13 = i7 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z13 = true;
                v3Var.setNeedDivider(z13);
            }
        }
        z13 = false;
        v3Var.setNeedDivider(z13);
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
    
        if ((r10 instanceof org.telegram.ui.Cells.r3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        ((org.telegram.ui.Cells.r3) r10).f.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.v3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        ((org.telegram.ui.Cells.v3) r10).b(true, true);
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
        k41 k41Var = this.y;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = k41Var.c;
        int i7 = 0;
        while (true) {
            if (i7 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i7] != null) {
                TLRPC.TL_messages_stickerSet q02 = org.telegram.messenger.si.d0(k41Var.a).q0(stickerSetCoveredArr[i7].set.id);
                if (q02 != null && !q02.set.archived) {
                    stickerSetCoveredArr[i7] = null;
                    break;
                } else if (stickerSetCoveredArr[i7].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i7++;
        }
    }

    public final void G() {
        int i7;
        k41 k41Var = this.y;
        int measuredWidth = k41Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.w = max;
            b41 b41Var = k41Var.r;
            if (b41Var.J != max) {
                b41Var.y1(max);
                k41Var.K = false;
            }
        }
        if (k41Var.K) {
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
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(k41Var.a);
        ArrayList arrayList2 = new ArrayList(d02.t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.n);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i11 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i11);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i11 == size) {
                    int i14 = this.x;
                    this.x = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.x));
                int i15 = this.x;
                this.x = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.x, stickerSetCovered.cover);
                } else {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.w);
                    for (int i17 = i10; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.x + i17, stickerSetCovered.covers.get(i17));
                    }
                }
                int i18 = 0;
                while (true) {
                    i7 = this.w * i13;
                    if (i18 >= i7) {
                        break;
                    }
                    sparseArray2.put(this.x + i18, stickerSetCovered);
                    i18++;
                }
                this.x = i7 + this.x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.x != 0) {
            k41Var.K = true;
            k41Var.L = d02.Z();
        }
        f();
    }

    @Override // v4.i0
    public final int b() {
        return this.x + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == this.x) {
            return 3;
        }
        Object obj = this.d.get(i7);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj.equals(-1) ? 4 : 2;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.a8) view).d((TLRPC.Document) this.d.get(i7), null, this.f.get(i7), null, false, false);
        } else {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.n3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            if (i10 != 2) {
                if (i10 == 4) {
                    ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.N0(2131747570, null));
                    return;
                } else if (i10 != 5) {
                    return;
                }
            }
            E(i7, view, false);
        }
    }

    @Override // v4.i0
    public final void v(v4.f1 f1Var, int i7, List list) {
        if (!list.contains(0)) {
            t(f1Var, i7);
            return;
        }
        int i10 = f1Var.f;
        if (i10 == 2 || i10 == 5) {
            E(i7, f1Var.a, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        k41 k41Var = this.y;
        org.telegram.ui.ActionBar.h6 h6Var = k41Var.Q;
        Context context = this.c;
        if (i7 == 0) {
            jg.b2 b2Var = new jg.b2(3, context, h6Var, false);
            b2Var.getImageView().E0(3);
            frameLayout = b2Var;
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.n3(context);
        } else if (i7 == 2) {
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(17, this.c, k41Var.Q, true, true);
            final int i10 = 0;
            v3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i41
                public final /* synthetic */ j41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            org.telegram.ui.Cells.v3 v3Var2 = (org.telegram.ui.Cells.v3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = v3Var2.getStickerSet();
                            j41 j41Var = this.b;
                            k41 k41Var2 = j41Var.y;
                            LongSparseArray longSparseArray = k41Var2.d;
                            LongSparseArray longSparseArray2 = k41Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!v3Var2.r) {
                                    j41Var.F(stickerSet, v3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    k41Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = r3Var.getStickerSet();
                            j41 j41Var2 = this.b;
                            k41 k41Var3 = j41Var2.y;
                            LongSparseArray longSparseArray3 = k41Var3.d;
                            LongSparseArray longSparseArray4 = k41Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!r3Var.w) {
                                    j41Var2.F(stickerSet2, r3Var);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    k41Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout = v3Var;
        } else if (i7 == 3) {
            frameLayout = new View(context);
        } else if (i7 == 4) {
            frameLayout = new org.telegram.ui.Cells.y3(context, h6Var);
        } else if (i7 != 5) {
            frameLayout = null;
        } else {
            org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, h6Var);
            final int i11 = 1;
            r3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i41
                public final /* synthetic */ j41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.v3 v3Var2 = (org.telegram.ui.Cells.v3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = v3Var2.getStickerSet();
                            j41 j41Var = this.b;
                            k41 k41Var2 = j41Var.y;
                            LongSparseArray longSparseArray = k41Var2.d;
                            LongSparseArray longSparseArray2 = k41Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!v3Var2.r) {
                                    j41Var.F(stickerSet, v3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    k41Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = r3Var2.getStickerSet();
                            j41 j41Var2 = this.b;
                            k41 k41Var3 = j41Var2.y;
                            LongSparseArray longSparseArray3 = k41Var3.d;
                            LongSparseArray longSparseArray4 = k41Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!r3Var2.w) {
                                    j41Var2.F(stickerSet2, r3Var2);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    k41Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            r3Var.getImageView().setLayerNum(3);
            frameLayout = r3Var;
        }
        return new mj0(frameLayout);
    }
}
