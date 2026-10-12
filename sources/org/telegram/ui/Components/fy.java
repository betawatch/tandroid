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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fy extends lm0 {
    public int E;
    public final /* synthetic */ wz F;
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

    public fy(wz wzVar) {
        this.F = wzVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        wz wzVar = this.F;
        ArrayList arrayList = wzVar.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        jy jyVar = (jy) arrayList.get(i11);
        if (jyVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        wzVar.o1.add(Long.valueOf(jyVar.b.id));
        boolean z11 = UserConfig.getInstance(wzVar.c1).isPremium() || wzVar.U0;
        int i12 = wzVar.Q.J * 3;
        int size = ((jyVar.f && !jyVar.g && (jyVar.e || z11)) || jyVar.h) ? jyVar.c.size() : Math.min(i12, jyVar.c.size());
        Integer num = null;
        Integer valueOf = jyVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        jyVar.h = true;
        int size2 = jyVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        wzVar.r2 = view;
        wzVar.s2 = valueOf.intValue();
        wzVar.t2 = num.intValue() + valueOf.intValue();
        wzVar.u2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            wzVar.post(new ey(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        wz wzVar = this.F;
        ArrayList arrayList = wzVar.n1;
        if (wzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(wzVar.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || wzVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        uz uzVar = wzVar.T;
        if (uzVar != null) {
            uzVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        wz wzVar = this.F;
        ArrayList arrayList = wzVar.n1;
        ArrayList arrayList2 = wzVar.o1;
        int i11 = wzVar.c1;
        ArrayList arrayList3 = wzVar.q1;
        arrayList3.clear();
        if (wzVar.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || wzVar.U0;
            TLRPC.ChatFull chatFull = wzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                jy jyVar = new jy();
                jyVar.b = wzVar.J1.emojiset;
                jyVar.c = new ArrayList(groupStickerSetById.documents);
                jyVar.e = true;
                jyVar.f = true;
                jyVar.g = false;
                jyVar.h = true;
                jyVar.i = true;
                arrayList3.add(jyVar);
                TLRPC.StickerSet stickerSet2 = jyVar.b;
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
                        jy jyVar2 = new jy();
                        jyVar2.b = tL_messages_stickerSet2.set;
                        jyVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        jyVar2.e = true;
                        jyVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        jyVar2.g = false;
                        jyVar2.h = true;
                        arrayList3.add(jyVar2);
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
                    jy jyVar3 = new jy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    jyVar3.b = stickerSet3;
                    jyVar3.c = tL_messages_stickerSet3.documents;
                    jyVar3.e = false;
                    jyVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    jyVar3.g = false;
                    jyVar3.h = z12;
                    arrayList3.add(jyVar3);
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
                        jy jyVar4 = new jy();
                        jyVar4.b = tL_messages_stickerSet3.set;
                        jyVar4.c = new ArrayList(arrayList5);
                        jyVar4.e = z12;
                        i10 = i14;
                        jyVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        jyVar4.g = false;
                        jyVar4.h = true;
                        arrayList3.add(jyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        jy jyVar5 = new jy();
                        jyVar5.b = tL_messages_stickerSet3.set;
                        jyVar5.c = new ArrayList(arrayList6);
                        jyVar5.e = false;
                        jyVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        jyVar5.g = false;
                        jyVar5.h = arrayList2.contains(Long.valueOf(jyVar5.b.id));
                        arrayList3.add(jyVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                jy jyVar6 = new jy();
                jyVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                jyVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    jyVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        jyVar6.c = stickerSet5.documents;
                    } else {
                        jyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    jyVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = jyVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jyVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) jyVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    jyVar6.e = !z11;
                    jyVar6.h = arrayList2.contains(Long.valueOf(jyVar6.b.id));
                    jyVar6.g = true;
                    arrayList3.add(jyVar6);
                }
            }
            zx zxVar = wzVar.I;
            if (zxVar != null) {
                zxVar.p(wzVar.getEmojipacks());
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
        zx zxVar;
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
        wz wzVar = this.F;
        boolean z12 = wzVar.d0;
        ArrayList arrayList3 = wzVar.q1;
        ArrayList arrayList4 = wzVar.n1;
        int i16 = wzVar.c1;
        Object[] objArr = UserConfig.getInstance(i16).isPremium() || wzVar.U0;
        if (z12) {
            this.y++;
            arrayList2.add(-1);
        }
        int i17 = 3;
        if (!objArr == true || !wzVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
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
                recentEmoji = wzVar.getRecentEmoji();
                zxVar = wzVar.I;
                if (zxVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    kw kwVar = zxVar.y;
                    if (zxVar.W != z13) {
                        zxVar.W = z13;
                        if (zxVar.V) {
                            kwVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            kwVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(es.h).start();
                        }
                        if (!isEmpty || zxVar.M != 0) {
                            z10 = isEmpty ? true : true;
                            zxVar.b.requestLayout();
                            zxVar.V = false;
                        }
                        zxVar.j(0, zxVar.V ^ z10);
                        zxVar.b.requestLayout();
                        zxVar.V = false;
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
                int i20 = wzVar.Q.J * 3;
                this.E = this.y;
                this.e = -1;
                if (arrayList3 == null) {
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        sparseIntArray.put(this.y, i14);
                        sparseIntArray2.put(i14, this.y);
                        arrayList.add(Integer.valueOf(this.y));
                        jy jyVar = (jy) arrayList3.get(i21);
                        boolean z14 = jyVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.y;
                        }
                        int size = ((jyVar.f && !z14 && (jyVar.e || objArr == true)) || jyVar.h) ? jyVar.c.size() : Math.min(i20, jyVar.c.size());
                        int i22 = 1 + size;
                        boolean z15 = z11;
                        if (jyVar.h || jyVar.c.size() <= i20) {
                            size = i22;
                        }
                        Integer valueOf = Integer.valueOf(jyVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = jyVar.b;
                        int i23 = i12;
                        int i24 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i21 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(jyVar.i);
                        int i25 = i17;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i25];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i23] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i26 = 1;
                        while (i26 < i24) {
                            Integer valueOf4 = Integer.valueOf(jyVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) jyVar.c.get(i26 - 1)).id);
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
                        if (jyVar.h || jyVar.c.size() <= i20) {
                            i15 = 2;
                        } else {
                            sparseIntArray3.put(this.y, i21);
                            Integer valueOf6 = Integer.valueOf(jyVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(jyVar.b.id);
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
        recentEmoji = wzVar.getRecentEmoji();
        zxVar = wzVar.I;
        if (zxVar != null) {
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
        int i202 = wzVar.Q.J * 3;
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
        wz wzVar = this.F;
        String[] strArr = wzVar.a1;
        vx vxVar = wzVar.Q;
        int i13 = wzVar.c1;
        ArrayList arrayList = wzVar.q1;
        int i14 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        jy jyVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        o8Var.b(0, strArr[i15]);
                        return;
                    }
                    try {
                        o8Var.b(0, ((jy) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        o8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                ly lyVar = (ly) view;
                int i16 = this.w.get(i12);
                int i17 = vxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    jyVar = (jy) arrayList.get(i16);
                }
                if (jyVar != null) {
                    lyVar.a.setText("+" + ((jyVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            ny nyVar = (ny) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            jy jyVar2 = (jy) arrayList.get(length);
            int i18 = length - 1;
            jy jyVar3 = i18 >= 0 ? (jy) arrayList.get(i18) : null;
            if (jyVar2 == null || !jyVar2.g || (jyVar3 != null && !jyVar3.e && jyVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (jyVar2 != null && jyVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(jyVar2.d, false);
                jyVar2.d = null;
            }
            sg.q0 q0Var = nyVar.h;
            if (jyVar2 == null) {
                return;
            }
            nyVar.s = jyVar2;
            nyVar.v = z10;
            nyVar.b.l(jyVar2.b.title, false);
            nyVar.c.setVisibility(jyVar2.i ? 0 : 8);
            if (!jyVar2.f || jyVar2.b.official) {
                q0Var.a(LocaleController.getString(R.string.Unlock), new my(nyVar, 6), false);
            } else {
                q0Var.a(LocaleController.getString(R.string.Restore), new my(nyVar, 5), false);
            }
            nyVar.a(false);
            return;
        }
        ez ezVar = (ez) view;
        ezVar.a = i12;
        ezVar.e = null;
        if (wzVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = wzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = wzVar.getRecentEmoji().get(i12);
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
                        str = wz.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = vxVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    jy jyVar4 = (jy) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((jyVar4.f && !jyVar4.g && (jyVar4.e || isPremium)) || jyVar4.h) ? jyVar4.c.size() : Math.min(i21, jyVar4.c.size());
                    int i23 = ezVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        ezVar.e = jyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) jyVar4.c.get(i11);
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
            ezVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            ezVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            ezVar.a(null, z10);
            if (ezVar.getSpan() == null || ezVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    ezVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                } else {
                    ezVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            ezVar.a(Emoji.getEmojiBigDrawable(str), z10);
            ezVar.setSpan(null);
        }
        ezVar.setTag(str2);
        ezVar.setContentDescription(str);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        wz wzVar = this.F;
        org.telegram.ui.ActionBar.c6 c6Var = wzVar.Z1;
        if (i10 == 0) {
            view = new ez(wzVar.getContext());
        } else if (i10 != 1) {
            int i11 = 3;
            if (i10 == 3) {
                ky kyVar = new ky(wzVar.getContext());
                s6 s6Var = new s6(kyVar.getContext(), false, false, false);
                s6Var.b(0.3f, 250L, es.h);
                s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(wzVar.A(org.telegram.ui.ActionBar.g6.Sh));
                s6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(kyVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, wzVar.A(org.telegram.ui.ActionBar.g6.Oh)));
                frameLayout.addView(s6Var, w7.a6.e(-1, -2, 17));
                kyVar.addView(frameLayout, w7.a6.d(-1.0f, -1));
                sg.q0 q0Var = new sg.q0(kyVar.getContext(), c6Var, false);
                q0Var.setIcon(R.raw.unlock_icon);
                kyVar.addView(q0Var, w7.a6.d(-1.0f, -1));
                view = kyVar;
            } else if (i10 == 4) {
                Context context = wzVar.getContext();
                uz uzVar = new uz(wzVar, true);
                wzVar.T = uzVar;
                bi.o0 o0Var = new bi.o0(wzVar, context, uzVar);
                o0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                o0Var.setClipToPadding(false);
                o0Var.i(new bi.o(i11));
                o0Var.setOnItemClickListener(new j(this, 5));
                view = o0Var;
            } else if (i10 == 5) {
                view = new ny(wzVar, wzVar.getContext());
            } else if (i10 != 6) {
                View view2 = new View(wzVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, wzVar.b1));
                view = view2;
            } else {
                Context context2 = wzVar.getContext();
                ly lyVar = new ly(context2);
                TextView textView = new TextView(context2);
                lyVar.a = textView;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var), 99)));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                lyVar.addView(textView, w7.a6.e(-2, -2, 17));
                view = lyVar;
            }
        } else {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(wzVar.getContext(), true, false, wzVar.Z1, wzVar.i2);
            o8Var.setOnIconClickListener(new f0(this, 13));
            view = o8Var;
        }
        return new wl0(view);
    }
}
