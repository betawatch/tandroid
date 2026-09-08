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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c51 extends kl0 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int w;
    public final /* synthetic */ d51 x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int v = 5;

    public c51(d51 d51Var, Context context) {
        this.x = d51Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 5;
    }

    public final void E(View view, int i10, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        d51 d51Var = this.x;
        LongSparseArray longSparseArray = d51Var.e;
        LongSparseArray longSparseArray2 = d51Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = d51Var.c;
        int i11 = d51Var.a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            boolean z14 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z14) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
            }
            z11 = z14;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 >= stickerSetCoveredArr.length) {
                z12 = false;
                break;
            }
            if (stickerSetCoveredArr[i13] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i13] = null;
                } else if (stickerSetCoveredArr[i13].set.id == stickerSetCovered2.set.id) {
                    z12 = true;
                    break;
                }
            }
            i13++;
        }
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.id);
        boolean z15 = longSparseArray2.indexOfKey(stickerSetCovered2.set.id) >= 0;
        boolean z16 = longSparseArray.indexOfKey(stickerSetCovered2.set.id) >= 0;
        if (z15 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.id);
            z15 = false;
        } else if (z16 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.id);
        }
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
        r3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        r3Var.b(!z12 && z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z13 = true;
                r3Var.setNeedDivider(z13);
            }
        }
        z13 = false;
        r3Var.setNeedDivider(z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r3 >= r1.length) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r1[r3] != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r1[r3] = r10;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r1 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if ((r11 instanceof org.telegram.ui.Cells.o3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        ((org.telegram.ui.Cells.o3) r11).e.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if ((r11 instanceof org.telegram.ui.Cells.r3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        ((org.telegram.ui.Cells.r3) r11).b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r0.d.put(r10.set.id, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r0.b.g(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r11 = r9.f;
        r0 = r11.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r1 >= r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r11.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r3.set.id != r10.set.id) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        n(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004b, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, FrameLayout frameLayout) {
        d51 d51Var = this.x;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = d51Var.c;
        int i10 = 0;
        while (true) {
            if (i10 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i10] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(d51Var.a).getStickerSetById(stickerSetCoveredArr[i10].set.id);
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
        d51 d51Var = this.x;
        int measuredWidth = d51Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            u41 u41Var = d51Var.r;
            if (u41Var.J != max) {
                u41Var.y1(max);
                d51Var.J = false;
            }
        }
        if (d51Var.J) {
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
        MediaDataController mediaDataController = MediaDataController.getInstance(d51Var.a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
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
                    int i14 = this.w;
                    this.w = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.w));
                int i15 = this.w;
                this.w = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.w, stickerSetCovered.cover);
                } else {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.w + i17, stickerSetCovered.covers.get(i17));
                    }
                }
                int i18 = 0;
                while (true) {
                    i10 = this.v * i13;
                    if (i18 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.w + i18, stickerSetCovered);
                    i18++;
                }
                this.w = i10 + this.w;
                i12 = i16;
            }
            i11++;
        }
        if (this.w != 0) {
            d51Var.J = true;
            d51Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) this.d.get(i10), null, this.f.get(i10), null, false, false);
        } else {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.k3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            if (i11 != 2) {
                if (i11 == 4) {
                    ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.OtherStickers));
                    return;
                } else if (i11 != 5) {
                    return;
                }
            }
            E(view, i10, false);
        }
    }

    @Override // s4.h0
    public final void w(s4.c1 c1Var, int i10, List list) {
        if (!list.contains(0)) {
            v(c1Var, i10);
            return;
        }
        int i11 = c1Var.f;
        if (i11 == 2 || i11 == 5) {
            E(c1Var.a, i10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        d51 d51Var = this.x;
        org.telegram.ui.ActionBar.f6 f6Var = d51Var.P;
        Context context = this.c;
        if (i10 == 0) {
            hg.e2 e2Var = new hg.e2(3, context, f6Var, false);
            e2Var.getImageView().setLayerNum(3);
            frameLayout = e2Var;
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.k3(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.c, d51Var.P, true, true);
            final int i11 = 0;
            r3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b51
                public final /* synthetic */ c51 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                            c51 c51Var = this.b;
                            d51 d51Var2 = c51Var.x;
                            LongSparseArray longSparseArray = d51Var2.d;
                            LongSparseArray longSparseArray2 = d51Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!r3Var2.r) {
                                    c51Var.F(stickerSet, r3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    d51Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = o3Var.getStickerSet();
                            c51 c51Var2 = this.b;
                            d51 d51Var3 = c51Var2.x;
                            LongSparseArray longSparseArray3 = d51Var3.d;
                            LongSparseArray longSparseArray4 = d51Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!o3Var.s) {
                                    c51Var2.F(stickerSet2, o3Var);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    d51Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout = r3Var;
        } else if (i10 == 3) {
            frameLayout = new View(context);
        } else if (i10 == 4) {
            frameLayout = new org.telegram.ui.Cells.u3(context, f6Var);
        } else if (i10 != 5) {
            frameLayout = null;
        } else {
            org.telegram.ui.Cells.o3 o3Var = new org.telegram.ui.Cells.o3(context, f6Var);
            final int i12 = 1;
            o3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b51
                public final /* synthetic */ c51 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                            c51 c51Var = this.b;
                            d51 d51Var2 = c51Var.x;
                            LongSparseArray longSparseArray = d51Var2.d;
                            LongSparseArray longSparseArray2 = d51Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!r3Var2.r) {
                                    c51Var.F(stickerSet, r3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    d51Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.o3 o3Var2 = (org.telegram.ui.Cells.o3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = o3Var2.getStickerSet();
                            c51 c51Var2 = this.b;
                            d51 d51Var3 = c51Var2.x;
                            LongSparseArray longSparseArray3 = d51Var3.d;
                            LongSparseArray longSparseArray4 = d51Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!o3Var2.s) {
                                    c51Var2.F(stickerSet2, o3Var2);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    d51Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            o3Var.getImageView().setLayerNum(3);
            frameLayout = o3Var;
        }
        return new vk0(frameLayout);
    }
}
