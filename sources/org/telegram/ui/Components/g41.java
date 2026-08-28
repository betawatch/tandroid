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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g41 extends vk0 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int w;
    public final /* synthetic */ h41 x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int v = 5;

    public g41(h41 h41Var, Context context) {
        this.x = h41Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 5;
    }

    public final void E(View view, int i9, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        h41 h41Var = this.x;
        LongSparseArray longSparseArray = h41Var.e;
        LongSparseArray longSparseArray2 = h41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = h41Var.c;
        int i10 = h41Var.a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        int i11 = this.w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i9 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i9)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            boolean z14 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z14) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
            }
            z11 = z14;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i9)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 >= stickerSetCoveredArr.length) {
                z12 = false;
                break;
            }
            if (stickerSetCoveredArr[i12] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i10).getStickerSetById(stickerSetCoveredArr[i12].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i12] = null;
                } else if (stickerSetCoveredArr[i12].set.id == stickerSetCovered2.set.id) {
                    z12 = true;
                    break;
                }
            }
            i12++;
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
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        s3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        s3Var.b(!z12 && z15, z10);
        if (i9 > 0) {
            int i13 = i9 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z13 = true;
                s3Var.setNeedDivider(z13);
            }
        }
        z13 = false;
        s3Var.setNeedDivider(z13);
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
    
        if ((r11 instanceof org.telegram.ui.Cells.p3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        ((org.telegram.ui.Cells.p3) r11).e.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if ((r11 instanceof org.telegram.ui.Cells.s3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        ((org.telegram.ui.Cells.s3) r11).b(true, true);
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
        h41 h41Var = this.x;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = h41Var.c;
        int i9 = 0;
        while (true) {
            if (i9 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i9] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(h41Var.a).getStickerSetById(stickerSetCoveredArr[i9].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i9] = null;
                    break;
                } else if (stickerSetCoveredArr[i9].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i9++;
        }
    }

    public final void G() {
        int i9;
        h41 h41Var = this.x;
        int measuredWidth = h41Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            y31 y31Var = h41Var.r;
            if (y31Var.J != max) {
                y31Var.y1(max);
                h41Var.F = false;
            }
        }
        if (h41Var.F) {
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
        MediaDataController mediaDataController = MediaDataController.getInstance(h41Var.a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.n);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i10);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i10 == size) {
                    int i13 = this.w;
                    this.w = i13 + 1;
                    sparseArray.put(i13, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.w));
                int i14 = this.w;
                this.w = i14 + 1;
                int i15 = i11 + 1;
                sparseArray.put(i14, Integer.valueOf(i11));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.w, stickerSetCovered.cover);
                } else {
                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                        sparseArray.put(this.w + i16, stickerSetCovered.covers.get(i16));
                    }
                }
                int i17 = 0;
                while (true) {
                    i9 = this.v * i12;
                    if (i17 >= i9) {
                        break;
                    }
                    sparseArray2.put(this.w + i17, stickerSetCovered);
                    i17++;
                }
                this.w = i9 + this.w;
                i11 = i15;
            }
            i10++;
        }
        if (this.w != 0) {
            h41Var.F = true;
            h41Var.G = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override // f2.r0
    public final int h() {
        return this.w + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == this.w) {
            return 3;
        }
        Object obj = this.d.get(i9);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj.equals(-1) ? 4 : 2;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) this.d.get(i9), null, this.f.get(i9), null, false, false);
        } else {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.l3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            if (i10 != 2) {
                if (i10 == 4) {
                    ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.OtherStickers));
                    return;
                } else if (i10 != 5) {
                    return;
                }
            }
            E(view, i9, false);
        }
    }

    @Override // f2.r0
    public final void w(f2.q1 q1Var, int i9, List list) {
        if (!list.contains(0)) {
            v(q1Var, i9);
            return;
        }
        int i10 = q1Var.f;
        if (i10 == 2 || i10 == 5) {
            E(q1Var.a, i9, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        h41 h41Var = this.x;
        org.telegram.ui.ActionBar.b6 b6Var = h41Var.L;
        Context context = this.c;
        if (i9 == 0) {
            of.x1 x1Var = new of.x1(3, context, b6Var, false);
            x1Var.getImageView().setLayerNum(3);
            frameLayout = x1Var;
        } else if (i9 == 1) {
            frameLayout = new org.telegram.ui.Cells.l3(context);
        } else if (i9 == 2) {
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.c, h41Var.L, true, true);
            final int i10 = 0;
            s3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f41
                public final /* synthetic */ g41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                            g41 g41Var = this.b;
                            h41 h41Var2 = g41Var.x;
                            LongSparseArray longSparseArray = h41Var2.d;
                            LongSparseArray longSparseArray2 = h41Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!s3Var2.r) {
                                    g41Var.F(stickerSet, s3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    h41Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = p3Var.getStickerSet();
                            g41 g41Var2 = this.b;
                            h41 h41Var3 = g41Var2.x;
                            LongSparseArray longSparseArray3 = h41Var3.d;
                            LongSparseArray longSparseArray4 = h41Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!p3Var.s) {
                                    g41Var2.F(stickerSet2, p3Var);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    h41Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout = s3Var;
        } else if (i9 == 3) {
            frameLayout = new View(context);
        } else if (i9 == 4) {
            frameLayout = new org.telegram.ui.Cells.v3(context, b6Var);
        } else if (i9 != 5) {
            frameLayout = null;
        } else {
            org.telegram.ui.Cells.p3 p3Var = new org.telegram.ui.Cells.p3(context, b6Var);
            final int i11 = 1;
            p3Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f41
                public final /* synthetic */ g41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                            g41 g41Var = this.b;
                            h41 h41Var2 = g41Var.x;
                            LongSparseArray longSparseArray = h41Var2.d;
                            LongSparseArray longSparseArray2 = h41Var2.e;
                            if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                if (!s3Var2.r) {
                                    g41Var.F(stickerSet, s3Var2);
                                    break;
                                } else {
                                    longSparseArray2.put(stickerSet.set.id, stickerSet);
                                    h41Var2.b.h(stickerSet);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.p3 p3Var2 = (org.telegram.ui.Cells.p3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = p3Var2.getStickerSet();
                            g41 g41Var2 = this.b;
                            h41 h41Var3 = g41Var2.x;
                            LongSparseArray longSparseArray3 = h41Var3.d;
                            LongSparseArray longSparseArray4 = h41Var3.e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                if (!p3Var2.s) {
                                    g41Var2.F(stickerSet2, p3Var2);
                                    break;
                                } else {
                                    longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                    h41Var3.b.h(stickerSet2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            p3Var.getImageView().setLayerNum(3);
            frameLayout = p3Var;
        }
        return new ik0(frameLayout);
    }
}
