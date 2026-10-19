package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ay extends hm0 {
    public int E;
    public final /* synthetic */ tz F;
    public ArrayList h;
    public int y;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public final ArrayList n = new ArrayList();
    public final SparseIntArray r = new SparseIntArray();
    public final SparseIntArray s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray w = new SparseIntArray();
    public final ArrayList x = new ArrayList();

    public ay(tz tzVar) {
        this.F = tzVar;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        fy fyVar = (fy) arrayList.get(i11);
        if (fyVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        tzVar.o1.add(Long.valueOf(fyVar.b.id));
        boolean z11 = UserConfig.getInstance(tzVar.c1).isPremium() || tzVar.U0;
        int i12 = tzVar.Q.J * 3;
        int size = ((fyVar.f && !fyVar.g && (fyVar.e || z11)) || fyVar.h) ? fyVar.c.size() : Math.min(i12, fyVar.c.size());
        Integer num = null;
        Integer valueOf = fyVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        fyVar.h = true;
        int size2 = fyVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        tzVar.r2 = view;
        tzVar.s2 = valueOf.intValue();
        tzVar.t2 = num.intValue() + valueOf.intValue();
        tzVar.u2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            tzVar.post(new zx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.n1;
        if (tzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(tzVar.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || tzVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        rz rzVar = tzVar.T;
        if (rzVar != null) {
            rzVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.n1;
        ArrayList arrayList2 = tzVar.o1;
        int i11 = tzVar.c1;
        ArrayList arrayList3 = tzVar.q1;
        arrayList3.clear();
        if (tzVar.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || tzVar.U0;
            TLRPC.ChatFull chatFull = tzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                fy fyVar = new fy();
                fyVar.b = tzVar.J1.emojiset;
                fyVar.c = new ArrayList(groupStickerSetById.documents);
                fyVar.e = true;
                fyVar.f = true;
                fyVar.g = false;
                fyVar.h = true;
                fyVar.i = true;
                arrayList3.add(fyVar);
                TLRPC.StickerSet stickerSet2 = fyVar.b;
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
            if (!z13) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        fy fyVar2 = new fy();
                        fyVar2.b = tL_messages_stickerSet2.set;
                        fyVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        fyVar2.e = true;
                        fyVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        fyVar2.g = false;
                        fyVar2.h = true;
                        arrayList3.add(fyVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z13) {
                    fy fyVar3 = new fy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    fyVar3.b = stickerSet3;
                    fyVar3.c = tL_messages_stickerSet3.documents;
                    fyVar3.e = false;
                    fyVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    fyVar3.g = false;
                    fyVar3.h = z12;
                    arrayList3.add(fyVar3);
                    i10 = i14;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i15 = 0; i15 < tL_messages_stickerSet3.documents.size(); i15++) {
                            if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i15))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i15));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i15));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        fy fyVar4 = new fy();
                        fyVar4.b = tL_messages_stickerSet3.set;
                        fyVar4.c = new ArrayList(arrayList5);
                        fyVar4.e = z12;
                        i10 = i14;
                        fyVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        fyVar4.g = false;
                        fyVar4.h = true;
                        arrayList3.add(fyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        fy fyVar5 = new fy();
                        fyVar5.b = tL_messages_stickerSet3.set;
                        fyVar5.c = new ArrayList(arrayList6);
                        fyVar5.e = false;
                        fyVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        fyVar5.g = false;
                        fyVar5.h = arrayList2.contains(Long.valueOf(fyVar5.b.id));
                        arrayList3.add(fyVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                fy fyVar6 = new fy();
                fyVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                fyVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    fyVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        fyVar6.c = stickerSet5.documents;
                    } else {
                        fyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    fyVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = fyVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= fyVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) fyVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    fyVar6.e = !z11;
                    fyVar6.h = arrayList2.contains(Long.valueOf(fyVar6.b.id));
                    fyVar6.g = true;
                    arrayList3.add(fyVar6);
                }
            }
            vx vxVar = tzVar.I;
            if (vxVar != null) {
                vxVar.p(tzVar.getEmojipacks());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        if (r10.M == 1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02eb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a A[LOOP:0: B:44:0x0123->B:46:0x012a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b A[EDGE_INSN: B:47:0x014b->B:48:0x014b BREAK  A[LOOP:0: B:44:0x0123->B:46:0x012a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1 A[EDGE_INSN: B:57:0x01a1->B:58:0x01a1 BREAK  A[LOOP:1: B:49:0x014d->B:56:0x019c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        int i10;
        ArrayList<String> recentEmoji;
        vx vxVar;
        int i11;
        int i12;
        int i13;
        int i14;
        String[][] strArr;
        int i15;
        boolean z10;
        SparseIntArray sparseIntArray = this.r;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.s;
        sparseIntArray2.clear();
        this.v.clear();
        SparseIntArray sparseIntArray3 = this.w;
        sparseIntArray3.clear();
        ArrayList arrayList = this.x;
        arrayList.clear();
        ArrayList arrayList2 = this.n;
        arrayList2.clear();
        boolean z11 = false;
        this.y = 0;
        tz tzVar = this.F;
        boolean z12 = tzVar.d0;
        ArrayList arrayList3 = tzVar.q1;
        ArrayList arrayList4 = tzVar.n1;
        int i16 = tzVar.c1;
        Object[] objArr = UserConfig.getInstance(i16).isPremium() || tzVar.U0;
        if (z12) {
            this.y++;
            arrayList2.add(-1);
        }
        int i17 = 3;
        if (!objArr == true || !tzVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
            i10 = -1;
        } else {
            if (MessagesController.getEmojiSettings(i16).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id && z12) {
                int i18 = this.y;
                this.c = i18;
                this.d = i18 + 1;
                this.y = i18 + 3;
                this.f = i18 + 2;
                arrayList2.add(324953);
                arrayList2.add(123342);
                arrayList2.add(929132);
                recentEmoji = tzVar.getRecentEmoji();
                vxVar = tzVar.I;
                if (vxVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    gw gwVar = vxVar.y;
                    if (vxVar.W != z13) {
                        vxVar.W = z13;
                        if (vxVar.V) {
                            gwVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            gwVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(bs.h).start();
                        }
                        if (!isEmpty || vxVar.M != 0) {
                            z10 = isEmpty ? true : true;
                            vxVar.b.requestLayout();
                            vxVar.V = false;
                        }
                        vxVar.j(0, vxVar.V ^ z10);
                        vxVar.b.requestLayout();
                        vxVar.V = false;
                    }
                }
                this.y = recentEmoji.size() + this.y;
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
                    strArr = EmojiData.dataColored;
                    if (i13 < strArr.length) {
                        break;
                    }
                    sparseIntArray.put(this.y, i14);
                    sparseIntArray2.put(i14, this.y);
                    this.y = strArr[i13].length + 1 + this.y;
                    arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i13))));
                    int i19 = 0;
                    while (true) {
                        String[] strArr2 = EmojiData.dataColored[i13];
                        if (i19 < strArr2.length) {
                            arrayList2.add(Integer.valueOf(strArr2[i19].hashCode()));
                            i19++;
                        }
                    }
                    i13++;
                    i14++;
                }
                int i20 = tzVar.Q.J * 3;
                this.E = this.y;
                this.e = -1;
                if (arrayList3 == null) {
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        sparseIntArray.put(this.y, i14);
                        sparseIntArray2.put(i14, this.y);
                        arrayList.add(Integer.valueOf(this.y));
                        fy fyVar = (fy) arrayList3.get(i21);
                        boolean z14 = fyVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.y;
                        }
                        int size = ((fyVar.f && !z14 && (fyVar.e || objArr == true)) || fyVar.h) ? fyVar.c.size() : Math.min(i20, fyVar.c.size());
                        int i22 = 1 + size;
                        boolean z15 = z11;
                        if (fyVar.h || fyVar.c.size() <= i20) {
                            size = i22;
                        }
                        Integer valueOf = Integer.valueOf(fyVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = fyVar.b;
                        int i23 = i12;
                        int i24 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i21 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(fyVar.i);
                        int i25 = i17;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i25];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i23] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i26 = 1;
                        while (i26 < i24) {
                            Integer valueOf4 = Integer.valueOf(fyVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) fyVar.c.get(i26 - 1)).id);
                            Object[] objArr3 = new Object[i23];
                            objArr3[z15 ? 1 : 0] = valueOf4;
                            objArr3[1] = valueOf5;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr3)));
                            i26++;
                            sparseIntArray2 = sparseIntArray2;
                            i23 = 2;
                        }
                        SparseIntArray sparseIntArray5 = sparseIntArray2;
                        this.y += i24;
                        if (fyVar.h || fyVar.c.size() <= i20) {
                            i15 = 2;
                        } else {
                            sparseIntArray3.put(this.y, i21);
                            Integer valueOf6 = Integer.valueOf(fyVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(fyVar.b.id);
                            i15 = 2;
                            Object[] objArr4 = new Object[2];
                            objArr4[z15 ? 1 : 0] = valueOf6;
                            objArr4[1] = valueOf7;
                            arrayList2.add(Integer.valueOf(Objects.hash(objArr4)));
                            this.y++;
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
        recentEmoji = tzVar.getRecentEmoji();
        vxVar = tzVar.I;
        if (vxVar != null) {
        }
        this.y = recentEmoji.size() + this.y;
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
            strArr = EmojiData.dataColored;
            if (i13 < strArr.length) {
            }
            i13++;
            i14++;
        }
        int i202 = tzVar.Q.J * 3;
        this.E = this.y;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.y;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == this.d) {
            return 4;
        }
        if (i10 == this.c || i10 == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            return sparseIntArray.get(i10) >= EmojiData.dataColored.length ? 5 : 1;
        }
        if (this.F.d0 && i10 == 0) {
            return 2;
        }
        if (this.v.indexOfKey(i10) >= 0) {
            return 3;
        }
        return this.w.indexOfKey(i10) >= 0 ? 6 : 0;
    }

    @Override // s4.g0
    public final void l() {
        F(false);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        tz tzVar = this.F;
        String[] strArr = tzVar.a1;
        rx rxVar = tzVar.Q;
        int i13 = tzVar.c1;
        ArrayList arrayList = tzVar.q1;
        int i14 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        fy fyVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                n8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    n8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    n8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        n8Var.b(0, strArr[i15]);
                        return;
                    }
                    try {
                        n8Var.b(0, ((fy) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        n8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                hy hyVar = (hy) view;
                int i16 = this.w.get(i12);
                int i17 = rxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    fyVar = (fy) arrayList.get(i16);
                }
                if (fyVar != null) {
                    hyVar.a.setText("+" + ((fyVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            jy jyVar = (jy) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            fy fyVar2 = (fy) arrayList.get(length);
            int i18 = length - 1;
            fy fyVar3 = i18 >= 0 ? (fy) arrayList.get(i18) : null;
            if (fyVar2 == null || !fyVar2.g || (fyVar3 != null && !fyVar3.e && fyVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (fyVar2 != null && fyVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(fyVar2.d, false);
                fyVar2.d = null;
            }
            sg.q0 q0Var = jyVar.h;
            if (fyVar2 == null) {
                return;
            }
            jyVar.s = fyVar2;
            jyVar.v = z10;
            jyVar.b.l(fyVar2.b.title, false);
            jyVar.c.setVisibility(fyVar2.i ? 0 : 8);
            if (!fyVar2.f || fyVar2.b.official) {
                q0Var.a(LocaleController.getString(R.string.Unlock), new iy(jyVar, 6), false);
            } else {
                q0Var.a(LocaleController.getString(R.string.Restore), new iy(jyVar, 5), false);
            }
            jyVar.a(false);
            return;
        }
        cz czVar = (cz) view;
        czVar.a = i12;
        czVar.e = null;
        if (tzVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = tzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = tzVar.getRecentEmoji().get(i12);
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
            int i19 = 0;
            while (true) {
                String[][] strArr2 = EmojiData.dataColored;
                if (i19 >= strArr2.length) {
                    str = null;
                    break;
                }
                String[] strArr3 = strArr2[i19];
                int length2 = strArr3.length + 1;
                int i20 = (i12 - size) - 1;
                if (i20 < 0 || i12 >= size + length2) {
                    size += length2;
                    i19++;
                } else {
                    String str4 = strArr3[i20];
                    String str5 = Emoji.emojiColor.get(str4);
                    if (str5 != null) {
                        str = tz.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = rxVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    fy fyVar4 = (fy) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((fyVar4.f && !fyVar4.g && (fyVar4.e || isPremium)) || fyVar4.h) ? fyVar4.c.size() : Math.min(i21, fyVar4.c.size());
                    int i23 = czVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        czVar.e = fyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) fyVar4.c.get(i11);
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
            czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            czVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            czVar.a(null, z10);
            if (czVar.getSpan() == null || czVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    czVar.setSpan(new a6(document, (Paint.FontMetricsInt) null));
                } else {
                    czVar.setSpan(new a6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            czVar.a(Emoji.getEmojiBigDrawable(str), z10);
            czVar.setSpan(null);
        }
        czVar.setTag(str2);
        czVar.setContentDescription(str);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        tz tzVar = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = tzVar.Z1;
        if (i10 == 0) {
            view = new cz(tzVar.getContext());
        } else if (i10 != 1) {
            int i11 = 3;
            if (i10 == 3) {
                gy gyVar = new gy(tzVar.getContext());
                q6 q6Var = new q6(gyVar.getContext(), false, false, false);
                q6Var.b(0.3f, 250L, bs.h);
                q6Var.setTextSize(AndroidUtilities.dp(14.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextColor(tzVar.A(org.telegram.ui.ActionBar.h6.Sh));
                q6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(gyVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, tzVar.A(org.telegram.ui.ActionBar.h6.Oh)));
                frameLayout.addView(q6Var, w7.z5.e(-1, -2, 17));
                gyVar.addView(frameLayout, w7.z5.c(-1.0f, -1));
                sg.q0 q0Var = new sg.q0(gyVar.getContext(), d6Var, false);
                q0Var.setIcon(R.raw.unlock_icon);
                gyVar.addView(q0Var, w7.z5.c(-1.0f, -1));
                view = gyVar;
            } else if (i10 == 4) {
                Context context = tzVar.getContext();
                rz rzVar = new rz(tzVar, true);
                tzVar.T = rzVar;
                ai.u1 u1Var = new ai.u1(tzVar, context, rzVar);
                u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                u1Var.setClipToPadding(false);
                u1Var.i(new ci.l(i11));
                u1Var.setOnItemClickListener(new j(this, 5));
                view = u1Var;
            } else if (i10 == 5) {
                view = new jy(tzVar, tzVar.getContext());
            } else if (i10 != 6) {
                View view2 = new View(tzVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, tzVar.b1));
                view = view2;
            } else {
                Context context2 = tzVar.getContext();
                hy hyVar = new hy(context2);
                TextView textView = new TextView(context2);
                hyVar.a = textView;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                hyVar.addView(textView, w7.z5.e(-2, -2, 17));
                view = hyVar;
            }
        } else {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(tzVar.getContext(), true, false, tzVar.Z1, tzVar.i2);
            n8Var.setOnIconClickListener(new f0(this, 13));
            view = n8Var;
        }
        return new sl0(view);
    }
}
