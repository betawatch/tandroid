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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o61 extends lm0 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int w;
    public final /* synthetic */ p61 x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int v = 5;

    public o61(p61 p61Var, Context context) {
        this.x = p61Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 5;
    }

    public final void E(View view, int i10, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p61 p61Var = this.x;
        LongSparseArray longSparseArray = p61Var.e;
        LongSparseArray longSparseArray2 = p61Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = p61Var.c;
        int i11 = p61Var.a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            boolean z15 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z15) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
            }
            z11 = z15;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 >= stickerSetCoveredArr.length) {
                z12 = true;
                z13 = false;
                break;
            }
            if (stickerSetCoveredArr[i13] != null) {
                z12 = true;
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i13] = null;
                } else if (stickerSetCoveredArr[i13].set.id == stickerSetCovered2.set.id) {
                    z13 = true;
                    break;
                }
            }
            i13++;
        }
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.id);
        boolean z16 = longSparseArray2.indexOfKey(stickerSetCovered2.set.id) >= 0 ? z12 : false;
        boolean z17 = longSparseArray.indexOfKey(stickerSetCovered2.set.id) >= 0 ? z12 : false;
        if (z16 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.id);
            z16 = false;
        } else if (z17 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.id);
        }
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view;
        q3Var.c(stickerSetCovered2, z11, z10, 0, 0, z13);
        q3Var.b((z13 || !z16) ? false : z12, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z14 = z12;
                q3Var.setNeedDivider(z14);
            }
        }
        z14 = false;
        q3Var.setNeedDivider(z14);
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
    
        if ((r10 instanceof org.telegram.ui.Cells.m3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        ((org.telegram.ui.Cells.m3) r10).f.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.q3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        ((org.telegram.ui.Cells.q3) r10).b(true, true);
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
    
        n(r1, 0);
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
        p61 p61Var = this.x;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = p61Var.c;
        int i10 = 0;
        while (true) {
            if (i10 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i10] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(p61Var.a).getStickerSetById(stickerSetCoveredArr[i10].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
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
        p61 p61Var = this.x;
        int measuredWidth = p61Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            g61 g61Var = p61Var.r;
            if (g61Var.J != max) {
                g61Var.z1(max);
                p61Var.J = false;
            }
        }
        if (p61Var.J) {
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
        this.w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(p61Var.a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
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
                    int i15 = this.w;
                    this.w = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.w));
                int i16 = this.w;
                this.w = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.w, stickerSetCovered.cover);
                } else {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.w + i18, stickerSetCovered.covers.get(i18));
                    }
                }
                int i19 = 0;
                while (true) {
                    i10 = this.v * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.w + i19, stickerSetCovered);
                    i19++;
                }
                this.w = i10 + this.w;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.w != 0) {
            p61Var.J = true;
            p61Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.w + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == this.w) {
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.i8) view).d((TLRPC.Document) this.d.get(i10), null, this.f.get(i10), null, false, false);
        } else {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            if (i11 != 2) {
                if (i11 == 4) {
                    ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString(R.string.OtherStickers));
                    return;
                } else if (i11 != 5) {
                    return;
                }
            }
            E(view, i10, false);
        }
    }

    @Override // s4.h0
    public final void w(s4.e1 e1Var, int i10, List list) {
        if (!list.contains(0)) {
            v(e1Var, i10);
            return;
        }
        int i11 = e1Var.f;
        if (i11 == 2 || i11 == 5) {
            E(e1Var.a, i10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        p61 p61Var = this.x;
        org.telegram.ui.ActionBar.u6 u6Var = p61Var.P;
        Context context = this.c;
        if (i10 == 0) {
            ig.c2 c2Var = new ig.c2(3, context, u6Var, false);
            c2Var.getImageView().setLayerNum(3);
            frameLayout = c2Var;
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.i3(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.q3 q3Var = new org.telegram.ui.Cells.q3(17, this.c, p61Var.P, true, true);
            final int i11 = 0;
            q3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n61
                public final /* synthetic */ o61 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = q3Var2.getStickerSet();
                            o61 o61Var = this.b;
                            p61 p61Var2 = o61Var.x;
                            LongSparseArray longSparseArray = p61Var2.d;
                            LongSparseArray longSparseArray2 = p61Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!q3Var2.r) {
                                    o61Var.F(stickerSet, q3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    p61Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = m3Var.getStickerSet();
                            o61 o61Var2 = this.b;
                            p61 p61Var3 = o61Var2.x;
                            LongSparseArray longSparseArray3 = p61Var3.d;
                            LongSparseArray longSparseArray4 = p61Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!m3Var.v) {
                                    o61Var2.F(stickerSet2, m3Var);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    p61Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout = q3Var;
        } else if (i10 == 3) {
            frameLayout = new View(context);
        } else if (i10 == 4) {
            frameLayout = new org.telegram.ui.Cells.z3(context, u6Var);
        } else if (i10 != 5) {
            frameLayout = null;
        } else {
            org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, u6Var);
            final int i12 = 1;
            m3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n61
                public final /* synthetic */ o61 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = q3Var2.getStickerSet();
                            o61 o61Var = this.b;
                            p61 p61Var2 = o61Var.x;
                            LongSparseArray longSparseArray = p61Var2.d;
                            LongSparseArray longSparseArray2 = p61Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!q3Var2.r) {
                                    o61Var.F(stickerSet, q3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    p61Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.m3 m3Var2 = (org.telegram.ui.Cells.m3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = m3Var2.getStickerSet();
                            o61 o61Var2 = this.b;
                            p61 p61Var3 = o61Var2.x;
                            LongSparseArray longSparseArray3 = p61Var3.d;
                            LongSparseArray longSparseArray4 = p61Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!m3Var2.v) {
                                    o61Var2.F(stickerSet2, m3Var2);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    p61Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            m3Var.getImageView().setLayerNum(3);
            frameLayout = m3Var;
        }
        return new vl0(frameLayout);
    }
}
