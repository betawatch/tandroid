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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yx extends ul0 {
    public int E;
    public final /* synthetic */ rz F;
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

    public yx(rz rzVar) {
        this.F = rzVar;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        rz rzVar = this.F;
        ArrayList arrayList = rzVar.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        dy dyVar = (dy) arrayList.get(i11);
        if (dyVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        rzVar.o1.add(Long.valueOf(dyVar.b.id));
        boolean z11 = UserConfig.getInstance(rzVar.c1).isPremium() || rzVar.U0;
        int i12 = rzVar.Q.J * 3;
        int size = ((dyVar.f && !dyVar.g && (dyVar.e || z11)) || dyVar.h) ? dyVar.c.size() : Math.min(i12, dyVar.c.size());
        Integer num = null;
        Integer valueOf = dyVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        dyVar.h = true;
        int size2 = dyVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        rzVar.s2 = view;
        rzVar.t2 = valueOf.intValue();
        rzVar.u2 = num.intValue() + valueOf.intValue();
        rzVar.v2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            rzVar.post(new xx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        rz rzVar = this.F;
        ArrayList arrayList = rzVar.n1;
        if (rzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || rzVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        pz pzVar = rzVar.T;
        if (pzVar != null) {
            pzVar.l();
        }
        s4.o.c(new fg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        rz rzVar = this.F;
        ArrayList arrayList = rzVar.n1;
        ArrayList arrayList2 = rzVar.o1;
        int i11 = rzVar.c1;
        ArrayList arrayList3 = rzVar.q1;
        arrayList3.clear();
        if (rzVar.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || rzVar.U0;
            TLRPC.ChatFull chatFull = rzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                dy dyVar = new dy();
                dyVar.b = rzVar.J1.emojiset;
                dyVar.c = new ArrayList(groupStickerSetById.documents);
                dyVar.e = true;
                dyVar.f = true;
                dyVar.g = false;
                dyVar.h = true;
                dyVar.i = true;
                arrayList3.add(dyVar);
                TLRPC.StickerSet stickerSet2 = dyVar.b;
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
                        dy dyVar2 = new dy();
                        dyVar2.b = tL_messages_stickerSet2.set;
                        dyVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        dyVar2.e = true;
                        dyVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        dyVar2.g = false;
                        dyVar2.h = true;
                        arrayList3.add(dyVar2);
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
                    dy dyVar3 = new dy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    dyVar3.b = stickerSet3;
                    dyVar3.c = tL_messages_stickerSet3.documents;
                    dyVar3.e = false;
                    dyVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    dyVar3.g = false;
                    dyVar3.h = z12;
                    arrayList3.add(dyVar3);
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
                        dy dyVar4 = new dy();
                        dyVar4.b = tL_messages_stickerSet3.set;
                        dyVar4.c = new ArrayList(arrayList5);
                        dyVar4.e = z12;
                        i10 = i14;
                        dyVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        dyVar4.g = false;
                        dyVar4.h = true;
                        arrayList3.add(dyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        dy dyVar5 = new dy();
                        dyVar5.b = tL_messages_stickerSet3.set;
                        dyVar5.c = new ArrayList(arrayList6);
                        dyVar5.e = false;
                        dyVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        dyVar5.g = false;
                        dyVar5.h = arrayList2.contains(Long.valueOf(dyVar5.b.id));
                        arrayList3.add(dyVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                dy dyVar6 = new dy();
                dyVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                dyVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    dyVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        dyVar6.c = stickerSet5.documents;
                    } else {
                        dyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    dyVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = dyVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= dyVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) dyVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    dyVar6.e = !z11;
                    dyVar6.h = arrayList2.contains(Long.valueOf(dyVar6.b.id));
                    dyVar6.g = true;
                    arrayList3.add(dyVar6);
                }
            }
            ow owVar = rzVar.I;
            if (owVar != null) {
                owVar.p(rzVar.getEmojipacks());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        if (r10.M == 1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
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
        this.y = 0;
        rz rzVar = this.F;
        boolean z11 = rzVar.d0;
        ArrayList arrayList3 = rzVar.q1;
        ArrayList arrayList4 = rzVar.n1;
        int i10 = rzVar.c1;
        boolean z12 = UserConfig.getInstance(i10).isPremium() || rzVar.U0;
        if (z11) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z12 || !rzVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z11) {
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
        ArrayList<String> recentEmoji = rzVar.getRecentEmoji();
        ow owVar = rzVar.I;
        if (owVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z13 = !isEmpty;
            cw cwVar = owVar.y;
            if (owVar.W != z13) {
                owVar.W = z13;
                if (owVar.V) {
                    cwVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    cwVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(wr.h).start();
                }
                if (!isEmpty || owVar.M != 0) {
                    z10 = isEmpty ? true : true;
                    owVar.b.requestLayout();
                    owVar.V = false;
                }
                owVar.j(0, owVar.V ^ z10);
                owVar.b.requestLayout();
                owVar.V = false;
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
        int i16 = rzVar.Q.J * 3;
        this.E = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                dy dyVar = (dy) arrayList3.get(i17);
                boolean z14 = dyVar.g;
                if (z14 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((dyVar.f && !z14 && (dyVar.e || z12)) || dyVar.h) ? dyVar.c.size() : Math.min(i16, dyVar.c.size());
                int i18 = 1 + size;
                if (dyVar.h || dyVar.c.size() <= i16) {
                    size = i18;
                }
                Integer valueOf = Integer.valueOf(dyVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = dyVar.b;
                int i19 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i17 : stickerSet.id), Boolean.valueOf(dyVar.i))));
                int i20 = 1;
                while (i20 < i19) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(dyVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) dyVar.c.get(i20 - 1)).id))));
                    i20++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i19;
                if (!dyVar.h && dyVar.c.size() > i16) {
                    sparseIntArray3.put(this.y, i17);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(dyVar.g ? -65174 : 92242), Long.valueOf(dyVar.b.id))));
                    this.y++;
                }
                i17++;
                i14++;
                sparseIntArray2 = sparseIntArray5;
                sparseIntArray = sparseIntArray4;
            }
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.y;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void l() {
        F(false);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        rz rzVar = this.F;
        String[] strArr = rzVar.a1;
        qx qxVar = rzVar.Q;
        int i13 = rzVar.c1;
        ArrayList arrayList = rzVar.q1;
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        dy dyVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    p8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    p8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        p8Var.b(0, strArr[i15]);
                        return;
                    }
                    try {
                        p8Var.b(0, ((dy) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        p8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                fy fyVar = (fy) view;
                int i16 = this.w.get(i12);
                int i17 = qxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    dyVar = (dy) arrayList.get(i16);
                }
                if (dyVar != null) {
                    fyVar.a.setText("+" + ((dyVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            iy iyVar = (iy) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            dy dyVar2 = (dy) arrayList.get(length);
            int i18 = length - 1;
            dy dyVar3 = i18 >= 0 ? (dy) arrayList.get(i18) : null;
            if (dyVar2 == null || !dyVar2.g || (dyVar3 != null && !dyVar3.e && dyVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (dyVar2 != null && dyVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(dyVar2.d, false);
                dyVar2.d = null;
            }
            qg.s0 s0Var = iyVar.h;
            if (dyVar2 == null) {
                return;
            }
            iyVar.s = dyVar2;
            iyVar.v = z10;
            iyVar.b.l(dyVar2.b.title, false);
            iyVar.c.setVisibility(dyVar2.i ? 0 : 8);
            if (!dyVar2.f || dyVar2.b.official) {
                s0Var.a(LocaleController.getString(R.string.Unlock), new gy(iyVar, 6), false);
            } else {
                s0Var.a(LocaleController.getString(R.string.Restore), new gy(iyVar, 5), false);
            }
            iyVar.a(false);
            return;
        }
        az azVar = (az) view;
        azVar.a = i12;
        azVar.e = null;
        if (rzVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = rzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = rzVar.getRecentEmoji().get(i12);
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
                        str = rz.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = qxVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    dy dyVar4 = (dy) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((dyVar4.f && !dyVar4.g && (dyVar4.e || isPremium)) || dyVar4.h) ? dyVar4.c.size() : Math.min(i21, dyVar4.c.size());
                    int i23 = azVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        azVar.e = dyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) dyVar4.c.get(i11);
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
            azVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            azVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            azVar.a(null, z10);
            if (azVar.getSpan() == null || azVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    azVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                } else {
                    azVar.setSpan(new y5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            azVar.a(Emoji.getEmojiBigDrawable(str), z10);
            azVar.setSpan(null);
        }
        azVar.setTag(str2);
        azVar.setContentDescription(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        rz rzVar = this.F;
        org.telegram.ui.ActionBar.f6 f6Var = rzVar.Z1;
        if (i10 == 0) {
            view = new az(rzVar.getContext());
        } else if (i10 == 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(rzVar.getContext(), true, false, rzVar.Z1, rzVar.i2);
            p8Var.setOnIconClickListener(new h0(this, 14));
            view = p8Var;
        } else if (i10 != 3) {
            int i11 = 5;
            if (i10 == 4) {
                Context context = rzVar.getContext();
                pz pzVar = new pz(rzVar, true);
                rzVar.T = pzVar;
                bi.y1 y1Var = new bi.y1(rzVar, context, pzVar);
                y1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                y1Var.setClipToPadding(false);
                y1Var.i(new fg.j0(2));
                y1Var.setOnItemClickListener(new k(this, i11));
                view = y1Var;
            } else if (i10 == 5) {
                view = new iy(rzVar, rzVar.getContext());
            } else if (i10 != 6) {
                View view2 = new View(rzVar.getContext());
                view2.setLayoutParams(new s4.p0(-1, rzVar.b1));
                view = view2;
            } else {
                Context context2 = rzVar.getContext();
                fy fyVar = new fy(context2);
                TextView textView = new TextView(context2);
                fyVar.a = textView;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var), 99)));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                fyVar.addView(textView, w7.a6.e(-2, -2, 17));
                view = fyVar;
            }
        } else {
            ey eyVar = new ey(rzVar.getContext());
            o6 o6Var = new o6(eyVar.getContext(), false, false, false);
            o6Var.b(0.3f, 250L, wr.h);
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var.setTypeface(AndroidUtilities.bold());
            o6Var.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.Sh));
            o6Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(eyVar.getContext());
            frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, rzVar.z(org.telegram.ui.ActionBar.j6.Oh)));
            frameLayout.addView(o6Var, w7.a6.e(-1, -2, 17));
            eyVar.addView(frameLayout, w7.a6.c(-1.0f, -1));
            qg.s0 s0Var = new qg.s0(eyVar.getContext(), f6Var, false);
            s0Var.setIcon(R.raw.unlock_icon);
            eyVar.addView(s0Var, w7.a6.c(-1.0f, -1));
            view = eyVar;
        }
        return new fl0(view);
    }
}
