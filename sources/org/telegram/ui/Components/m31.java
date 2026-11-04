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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m31 extends sj0 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final /* synthetic */ n31 y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public m31(n31 n31Var, Context context) {
        this.y = n31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 5;
    }

    public final void E(int i3, View view, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        n31 n31Var = this.y;
        LongSparseArray longSparseArray = n31Var.e;
        LongSparseArray longSparseArray2 = n31Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = n31Var.c;
        int i10 = n31Var.a;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
        int i11 = this.x;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i3 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i3)).intValue());
            ArrayList arrayList2 = b02.v0[0];
            boolean z14 = arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z14) {
                b02.e1(stickerSetCovered.set.id);
            }
            z11 = z14;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i3)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        b02.p1(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 >= stickerSetCoveredArr.length) {
                z12 = false;
                break;
            }
            if (stickerSetCoveredArr[i12] != null) {
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.li.b0(i10).o0(stickerSetCoveredArr[i12].set.id);
                if (o02 != null && !o02.set.archived) {
                    stickerSetCoveredArr[i12] = null;
                } else if (stickerSetCoveredArr[i12].set.id == stickerSetCovered2.set.id) {
                    z12 = true;
                    break;
                }
            }
            i12++;
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
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        u3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        u3Var.b(!z12 && z15, z10);
        if (i3 > 0) {
            int i13 = i3 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z13 = true;
                u3Var.setNeedDivider(z13);
            }
        }
        z13 = false;
        u3Var.setNeedDivider(z13);
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
    
        if ((r10 instanceof org.telegram.ui.Cells.q3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        ((org.telegram.ui.Cells.q3) r10).f.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.u3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        ((org.telegram.ui.Cells.u3) r10).b(true, true);
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
        n31 n31Var = this.y;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = n31Var.c;
        int i3 = 0;
        while (true) {
            if (i3 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i3] != null) {
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.li.b0(n31Var.a).o0(stickerSetCoveredArr[i3].set.id);
                if (o02 != null && !o02.set.archived) {
                    stickerSetCoveredArr[i3] = null;
                    break;
                } else if (stickerSetCoveredArr[i3].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i3++;
        }
    }

    public final void G() {
        int i3;
        n31 n31Var = this.y;
        int measuredWidth = n31Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.w = max;
            e31 e31Var = n31Var.r;
            if (e31Var.J != max) {
                e31Var.y1(max);
                n31Var.K = false;
            }
        }
        if (n31Var.K) {
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
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(n31Var.a);
        ArrayList arrayList2 = new ArrayList(b02.t0[0]);
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
                    i3 = this.w * i13;
                    if (i18 >= i3) {
                        break;
                    }
                    sparseArray2.put(this.x + i18, stickerSetCovered);
                    i18++;
                }
                this.x = i3 + this.x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.x != 0) {
            n31Var.K = true;
            n31Var.L = b02.X();
        }
        f();
    }

    @Override // u4.h0
    public final int b() {
        return this.x + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == this.x) {
            return 3;
        }
        Object obj = this.d.get(i3);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj.equals(-1) ? 4 : 2;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.y7) view).d((TLRPC.Document) this.d.get(i3), null, this.f.get(i3), null, false, false);
        } else {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            if (i10 != 2) {
                if (i10 == 4) {
                    ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131747772, null));
                    return;
                } else if (i10 != 5) {
                    return;
                }
            }
            E(i3, view, false);
        }
    }

    @Override // u4.h0
    public final void v(u4.d1 d1Var, int i3, List list) {
        if (!list.contains(0)) {
            t(d1Var, i3);
            return;
        }
        int i10 = d1Var.f;
        if (i10 == 2 || i10 == 5) {
            E(i3, d1Var.a, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        n31 n31Var = this.y;
        org.telegram.ui.ActionBar.e6 e6Var = n31Var.Q;
        Context context = this.c;
        if (i3 == 0) {
            kg.x1 x1Var = new kg.x1(3, context, e6Var, false);
            x1Var.getImageView().E0(3);
            frameLayout = x1Var;
        } else if (i3 == 1) {
            frameLayout = new org.telegram.ui.Cells.m3(context);
        } else if (i3 == 2) {
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.c, n31Var.Q, true, true);
            final int i10 = 0;
            u3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
                public final /* synthetic */ m31 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            org.telegram.ui.Cells.u3 u3Var2 = (org.telegram.ui.Cells.u3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = u3Var2.getStickerSet();
                            m31 m31Var = this.b;
                            n31 n31Var2 = m31Var.y;
                            LongSparseArray longSparseArray = n31Var2.d;
                            LongSparseArray longSparseArray2 = n31Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!u3Var2.r) {
                                    m31Var.F(stickerSet, u3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    n31Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = q3Var.getStickerSet();
                            m31 m31Var2 = this.b;
                            n31 n31Var3 = m31Var2.y;
                            LongSparseArray longSparseArray3 = n31Var3.d;
                            LongSparseArray longSparseArray4 = n31Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!q3Var.w) {
                                    m31Var2.F(stickerSet2, q3Var);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    n31Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout = u3Var;
        } else if (i3 == 3) {
            frameLayout = new View(context);
        } else if (i3 == 4) {
            frameLayout = new org.telegram.ui.Cells.x3(context, e6Var);
        } else if (i3 != 5) {
            frameLayout = null;
        } else {
            org.telegram.ui.Cells.q3 q3Var = new org.telegram.ui.Cells.q3(context, e6Var);
            final int i11 = 1;
            q3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
                public final /* synthetic */ m31 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.u3 u3Var2 = (org.telegram.ui.Cells.u3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = u3Var2.getStickerSet();
                            m31 m31Var = this.b;
                            n31 n31Var2 = m31Var.y;
                            LongSparseArray longSparseArray = n31Var2.d;
                            LongSparseArray longSparseArray2 = n31Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!u3Var2.r) {
                                    m31Var.F(stickerSet, u3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    n31Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = q3Var2.getStickerSet();
                            m31 m31Var2 = this.b;
                            n31 n31Var3 = m31Var2.y;
                            LongSparseArray longSparseArray3 = n31Var3.d;
                            LongSparseArray longSparseArray4 = n31Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!q3Var2.w) {
                                    m31Var2.F(stickerSet2, q3Var2);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    n31Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            q3Var.getImageView().setLayerNum(3);
            frameLayout = q3Var;
        }
        return new bj0(frameLayout);
    }
}
