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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tx extends sl0 {
    public int B;
    public final /* synthetic */ mz C;
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

    public tx(mz mzVar) {
        this.C = mzVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        mz mzVar = this.C;
        ArrayList arrayList = mzVar.n1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        xx xxVar = (xx) arrayList.get(i11);
        if (xxVar.h) {
            return;
        }
        boolean z4 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        mzVar.l1.add(Long.valueOf(xxVar.b.id));
        boolean z10 = UserConfig.getInstance(mzVar.Z0).isPremium() || mzVar.R0;
        int i12 = mzVar.N.J * 3;
        int size = ((xxVar.f && !xxVar.g && (xxVar.e || z10)) || xxVar.h) ? xxVar.c.size() : Math.min(i12, xxVar.c.size());
        Integer num = null;
        Integer valueOf = xxVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        xxVar.h = true;
        int size2 = xxVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        mzVar.p2 = view;
        mzVar.q2 = valueOf.intValue();
        mzVar.r2 = num.intValue() + valueOf.intValue();
        mzVar.s2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z4) {
            mzVar.post(new sx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z4) {
        mz mzVar = this.C;
        ArrayList arrayList = mzVar.k1;
        if (mzVar.K2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.Z0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || mzVar.m1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z4);
        H();
        kz kzVar = mzVar.Q;
        if (kzVar != null) {
            kzVar.l();
        }
        f2.q.c(new cg.a(this, arrayList2, 1), false).b(this);
    }

    public final void G(boolean z4) {
        boolean z10;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        mz mzVar = this.C;
        ArrayList arrayList = mzVar.k1;
        ArrayList arrayList2 = mzVar.l1;
        int i11 = mzVar.Z0;
        ArrayList arrayList3 = mzVar.n1;
        arrayList3.clear();
        if (mzVar.Z1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z4 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z11 = true;
            boolean z12 = UserConfig.getInstance(i11).isPremium() || mzVar.R0;
            TLRPC.ChatFull chatFull = mzVar.G1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                xx xxVar = new xx();
                xxVar.b = mzVar.G1.emojiset;
                xxVar.c = new ArrayList(groupStickerSetById.documents);
                xxVar.e = true;
                xxVar.f = true;
                xxVar.g = false;
                xxVar.h = true;
                xxVar.i = true;
                arrayList3.add(xxVar);
                TLRPC.StickerSet stickerSet2 = xxVar.b;
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
            if (!z12) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        xx xxVar2 = new xx();
                        xxVar2.b = tL_messages_stickerSet2.set;
                        xxVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        xxVar2.e = true;
                        xxVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        xxVar2.g = false;
                        xxVar2.h = true;
                        arrayList3.add(xxVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z12) {
                    xx xxVar3 = new xx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    xxVar3.b = stickerSet3;
                    xxVar3.c = tL_messages_stickerSet3.documents;
                    xxVar3.e = false;
                    xxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    xxVar3.g = false;
                    xxVar3.h = z11;
                    arrayList3.add(xxVar3);
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
                        xx xxVar4 = new xx();
                        xxVar4.b = tL_messages_stickerSet3.set;
                        xxVar4.c = new ArrayList(arrayList5);
                        xxVar4.e = z11;
                        i10 = i14;
                        xxVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        xxVar4.g = false;
                        xxVar4.h = true;
                        arrayList3.add(xxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        xx xxVar5 = new xx();
                        xxVar5.b = tL_messages_stickerSet3.set;
                        xxVar5.c = new ArrayList(arrayList6);
                        xxVar5.e = false;
                        xxVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        xxVar5.g = false;
                        xxVar5.h = arrayList2.contains(Long.valueOf(xxVar5.b.id));
                        arrayList3.add(xxVar5);
                    }
                }
                i14 = i10 + 1;
                z11 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                xx xxVar6 = new xx();
                xxVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                xxVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    xxVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        xxVar6.c = stickerSet5.documents;
                    } else {
                        xxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    xxVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = xxVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= xxVar6.c.size()) {
                            z10 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) xxVar6.c.get(i17))) {
                                z10 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    xxVar6.e = !z10;
                    xxVar6.h = arrayList2.contains(Long.valueOf(xxVar6.b.id));
                    xxVar6.g = true;
                    arrayList3.add(xxVar6);
                }
            }
            hw hwVar = mzVar.F;
            if (hwVar != null) {
                hwVar.p(mzVar.getEmojipacks());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        if (r10.J == 1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        boolean z4;
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
        this.y = 0;
        mz mzVar = this.C;
        boolean z10 = mzVar.a0;
        ArrayList arrayList3 = mzVar.n1;
        ArrayList arrayList4 = mzVar.k1;
        int i10 = mzVar.Z0;
        boolean z11 = UserConfig.getInstance(i10).isPremium() || mzVar.R0;
        if (z10) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z11 || !mzVar.Z1 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z10) {
            this.c = -1;
            this.d = -1;
            this.f = -1;
        } else {
            int i11 = this.y;
            this.c = i11;
            this.d = i11 + 1;
            this.y = i11 + 3;
            this.f = i11 + 2;
            arrayList2.add(324953);
            arrayList2.add(123342);
            arrayList2.add(929132);
        }
        ArrayList<String> recentEmoji = mzVar.getRecentEmoji();
        hw hwVar = mzVar.F;
        if (hwVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z12 = !isEmpty;
            vv vvVar = hwVar.y;
            if (hwVar.T != z12) {
                hwVar.T = z12;
                if (hwVar.S) {
                    vvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    vvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(pr.h).start();
                }
                if (!isEmpty || hwVar.J != 0) {
                    z4 = isEmpty ? true : true;
                    hwVar.b.requestLayout();
                    hwVar.S = false;
                }
                hwVar.j(0, hwVar.S ^ z4);
                hwVar.b.requestLayout();
                hwVar.S = false;
            }
        }
        this.y = recentEmoji.size() + this.y;
        for (int i12 = 0; i12 < recentEmoji.size(); i12++) {
            arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i12))));
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String[][] strArr = EmojiData.dataColored;
            if (i13 >= strArr.length) {
                break;
            }
            sparseIntArray.put(this.y, i14);
            sparseIntArray2.put(i14, this.y);
            this.y = strArr[i13].length + 1 + this.y;
            arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i13))));
            int i15 = 0;
            while (true) {
                String[] strArr2 = EmojiData.dataColored[i13];
                if (i15 < strArr2.length) {
                    arrayList2.add(Integer.valueOf(strArr2[i15].hashCode()));
                    i15++;
                }
            }
            i13++;
            i14++;
        }
        int i16 = mzVar.N.J * 3;
        this.B = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                xx xxVar = (xx) arrayList3.get(i17);
                boolean z13 = xxVar.g;
                if (z13 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((xxVar.f && !z13 && (xxVar.e || z11)) || xxVar.h) ? xxVar.c.size() : Math.min(i16, xxVar.c.size());
                int i18 = 1 + size;
                if (xxVar.h || xxVar.c.size() <= i16) {
                    size = i18;
                }
                Integer valueOf = Integer.valueOf(xxVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = xxVar.b;
                int i19 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i17 : stickerSet.id), Boolean.valueOf(xxVar.i))));
                int i20 = 1;
                while (i20 < i19) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(xxVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) xxVar.c.get(i20 - 1)).id))));
                    i20++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i19;
                if (!xxVar.h && xxVar.c.size() > i16) {
                    sparseIntArray3.put(this.y, i17);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(xxVar.g ? -65174 : 92242), Long.valueOf(xxVar.b.id))));
                    this.y++;
                }
                i17++;
                i14++;
                sparseIntArray2 = sparseIntArray5;
                sparseIntArray = sparseIntArray4;
            }
        }
    }

    @Override // f2.p0
    public final int h() {
        return this.y;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.p0
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
        if (this.C.a0 && i10 == 0) {
            return 2;
        }
        if (this.v.indexOfKey(i10) >= 0) {
            return 3;
        }
        return this.w.indexOfKey(i10) >= 0 ? 6 : 0;
    }

    @Override // f2.p0
    public final void l() {
        F(false);
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        mz mzVar = this.C;
        String[] strArr = mzVar.X0;
        lx lxVar = mzVar.N;
        int i13 = mzVar.Z0;
        ArrayList arrayList = mzVar.n1;
        int i14 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = true;
        xx xxVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    m8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    m8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        m8Var.b(0, strArr[i15]);
                        return;
                    }
                    try {
                        m8Var.b(0, ((xx) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        m8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                zx zxVar = (zx) view;
                int i16 = this.w.get(i12);
                int i17 = lxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    xxVar = (xx) arrayList.get(i16);
                }
                if (xxVar != null) {
                    zxVar.a.setText("+" + ((xxVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            cy cyVar = (cy) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            xx xxVar2 = (xx) arrayList.get(length);
            int i18 = length - 1;
            xx xxVar3 = i18 >= 0 ? (xx) arrayList.get(i18) : null;
            if (xxVar2 == null || !xxVar2.g || (xxVar3 != null && !xxVar3.e && xxVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z4 = false;
            }
            if (xxVar2 != null && xxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(xxVar2.d, false);
                xxVar2.d = null;
            }
            fg.b1 b1Var = cyVar.h;
            if (xxVar2 == null) {
                return;
            }
            cyVar.s = xxVar2;
            cyVar.v = z4;
            cyVar.b.l(xxVar2.b.title, false);
            cyVar.c.setVisibility(xxVar2.i ? 0 : 8);
            if (!xxVar2.f || xxVar2.b.official) {
                b1Var.a(LocaleController.getString(R.string.Unlock), new ay(cyVar, 6), false);
            } else {
                b1Var.a(LocaleController.getString(R.string.Restore), new ay(cyVar, 5), false);
            }
            cyVar.a(false);
            return;
        }
        uy uyVar = (uy) view;
        uyVar.a = i12;
        uyVar.e = null;
        if (mzVar.a0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = mzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = mzVar.getRecentEmoji().get(i12);
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
                        str = mz.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = lxVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    xx xxVar4 = (xx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((xxVar4.f && !xxVar4.g && (xxVar4.e || isPremium)) || xxVar4.h) ? xxVar4.c.size() : Math.min(i21, xxVar4.c.size());
                    int i23 = uyVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        uyVar.e = xxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) xxVar4.c.get(i11);
                        document = document2;
                        l10 = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l10 = null;
            document = null;
            z4 = false;
        }
        if (l10 != null) {
            uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            uyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            uyVar.a(null, z4);
            if (uyVar.getSpan() == null || uyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    uyVar.setSpan(new u5(document, (Paint.FontMetricsInt) null));
                } else {
                    uyVar.setSpan(new u5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            uyVar.a(Emoji.getEmojiBigDrawable(str), z4);
            uyVar.setSpan(null);
        }
        uyVar.setTag(str2);
        uyVar.setContentDescription(str);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        mz mzVar = this.C;
        org.telegram.ui.ActionBar.g6 g6Var = mzVar.W1;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 == 1) {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(mzVar.getContext(), true, false, mzVar.W1, mzVar.f2);
                m8Var.setOnIconClickListener(new g0(this, 14));
                view = m8Var;
            } else if (i10 != 3) {
                int i12 = 5;
                if (i10 == 4) {
                    Context context = mzVar.getContext();
                    kz kzVar = new kz(mzVar, true);
                    mzVar.Q = kzVar;
                    mh.d1 d1Var = new mh.d1(mzVar, context, kzVar);
                    d1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    d1Var.setClipToPadding(false);
                    d1Var.i(new oh.j(i11));
                    d1Var.setOnItemClickListener(new k(this, i12));
                    view = d1Var;
                } else if (i10 == 5) {
                    view = new cy(mzVar, mzVar.getContext());
                } else if (i10 != 6) {
                    View view2 = new View(mzVar.getContext());
                    view2.setLayoutParams(new f2.x0(-1, mzVar.Y0));
                    view = view2;
                } else {
                    Context context2 = mzVar.getContext();
                    zx zxVar = new zx(context2);
                    TextView textView = new TextView(context2);
                    zxVar.a = textView;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
                    textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Te, g6Var), 99)));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                    zxVar.addView(textView, k7.c6.e(-2, -2, 17));
                    view = zxVar;
                }
            } else {
                yx yxVar = new yx(mzVar.getContext());
                k6 k6Var = new k6(yxVar.getContext(), false, false, false);
                k6Var.b(0.3f, 250L, pr.h);
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(mzVar.A(org.telegram.ui.ActionBar.k6.Sh));
                k6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(yxVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, mzVar.A(org.telegram.ui.ActionBar.k6.Oh)));
                frameLayout.addView(k6Var, k7.c6.e(-1, -2, 17));
                yxVar.addView(frameLayout, k7.c6.c(-1.0f, -1));
                fg.b1 b1Var = new fg.b1(yxVar.getContext(), g6Var, false);
                b1Var.setIcon(R.raw.unlock_icon);
                yxVar.addView(b1Var, k7.c6.c(-1.0f, -1));
                view = yxVar;
            }
        } else {
            view = new uy(mzVar.getContext());
        }
        return new fl0(view);
    }
}
