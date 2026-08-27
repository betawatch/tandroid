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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gx extends yk0 {
    public int A;
    public final /* synthetic */ yy B;
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

    public gx(yy yyVar) {
        this.B = yyVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        yy yyVar = this.B;
        ArrayList arrayList = yyVar.m1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        kx kxVar = (kx) arrayList.get(i11);
        if (kxVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        yyVar.k1.add(Long.valueOf(kxVar.b.id));
        boolean z11 = UserConfig.getInstance(yyVar.Y0).isPremium() || yyVar.Q0;
        int i12 = yyVar.M.J * 3;
        int size = ((kxVar.f && !kxVar.g && (kxVar.e || z11)) || kxVar.h) ? kxVar.c.size() : Math.min(i12, kxVar.c.size());
        Integer num = null;
        Integer valueOf = kxVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        kxVar.h = true;
        int size2 = kxVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        yyVar.o2 = view;
        yyVar.p2 = valueOf.intValue();
        yyVar.q2 = num.intValue() + valueOf.intValue();
        yyVar.r2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            yyVar.post(new ex(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        yy yyVar = this.B;
        ArrayList arrayList = yyVar.j1;
        if (yyVar.J2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(yyVar.Y0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || yyVar.l1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        wy wyVar = yyVar.P;
        if (wyVar != null) {
            wyVar.l();
        }
        f2.q.c(new fx(this, arrayList2, 0), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        yy yyVar = this.B;
        ArrayList arrayList = yyVar.j1;
        ArrayList arrayList2 = yyVar.k1;
        int i11 = yyVar.Y0;
        ArrayList arrayList3 = yyVar.m1;
        arrayList3.clear();
        if (yyVar.Y1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || yyVar.Q0;
            TLRPC.ChatFull chatFull = yyVar.F1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                kx kxVar = new kx();
                kxVar.b = yyVar.F1.emojiset;
                kxVar.c = new ArrayList(groupStickerSetById.documents);
                kxVar.e = true;
                kxVar.f = true;
                kxVar.g = false;
                kxVar.h = true;
                kxVar.i = true;
                arrayList3.add(kxVar);
                TLRPC.StickerSet stickerSet2 = kxVar.b;
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
                        kx kxVar2 = new kx();
                        kxVar2.b = tL_messages_stickerSet2.set;
                        kxVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        kxVar2.e = true;
                        kxVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        kxVar2.g = false;
                        kxVar2.h = true;
                        arrayList3.add(kxVar2);
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
                    kx kxVar3 = new kx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    kxVar3.b = stickerSet3;
                    kxVar3.c = tL_messages_stickerSet3.documents;
                    kxVar3.e = false;
                    kxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    kxVar3.g = false;
                    kxVar3.h = z12;
                    arrayList3.add(kxVar3);
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
                        kx kxVar4 = new kx();
                        kxVar4.b = tL_messages_stickerSet3.set;
                        kxVar4.c = new ArrayList(arrayList5);
                        kxVar4.e = z12;
                        i10 = i14;
                        kxVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        kxVar4.g = false;
                        kxVar4.h = true;
                        arrayList3.add(kxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        kx kxVar5 = new kx();
                        kxVar5.b = tL_messages_stickerSet3.set;
                        kxVar5.c = new ArrayList(arrayList6);
                        kxVar5.e = false;
                        kxVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        kxVar5.g = false;
                        kxVar5.h = arrayList2.contains(Long.valueOf(kxVar5.b.id));
                        arrayList3.add(kxVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                kx kxVar6 = new kx();
                kxVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                kxVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    kxVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        kxVar6.c = stickerSet5.documents;
                    } else {
                        kxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    kxVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = kxVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= kxVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) kxVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    kxVar6.e = !z11;
                    kxVar6.h = arrayList2.contains(Long.valueOf(kxVar6.b.id));
                    kxVar6.g = true;
                    arrayList3.add(kxVar6);
                }
            }
            uv uvVar = yyVar.E;
            if (uvVar != null) {
                uvVar.p(yyVar.getEmojipacks());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        if (r10.I == 1) goto L47;
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
        yy yyVar = this.B;
        boolean z11 = yyVar.W;
        ArrayList arrayList3 = yyVar.m1;
        ArrayList arrayList4 = yyVar.j1;
        int i10 = yyVar.Y0;
        boolean z12 = UserConfig.getInstance(i10).isPremium() || yyVar.Q0;
        if (z11) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z12 || !yyVar.Y1 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z11) {
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
        ArrayList<String> recentEmoji = yyVar.getRecentEmoji();
        uv uvVar = yyVar.E;
        if (uvVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z13 = !isEmpty;
            iv ivVar = uvVar.y;
            if (uvVar.T != z13) {
                uvVar.T = z13;
                if (uvVar.S) {
                    ivVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    ivVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(er.h).start();
                }
                if (!isEmpty || uvVar.I != 0) {
                    z10 = isEmpty ? true : true;
                    uvVar.b.requestLayout();
                    uvVar.S = false;
                }
                uvVar.j(0, uvVar.S ^ z10);
                uvVar.b.requestLayout();
                uvVar.S = false;
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
        int i16 = yyVar.M.J * 3;
        this.A = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                kx kxVar = (kx) arrayList3.get(i17);
                boolean z14 = kxVar.g;
                if (z14 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((kxVar.f && !z14 && (kxVar.e || z12)) || kxVar.h) ? kxVar.c.size() : Math.min(i16, kxVar.c.size());
                int i18 = 1 + size;
                if (kxVar.h || kxVar.c.size() <= i16) {
                    size = i18;
                }
                Integer valueOf = Integer.valueOf(kxVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = kxVar.b;
                int i19 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i17 : stickerSet.id), Boolean.valueOf(kxVar.i))));
                int i20 = 1;
                while (i20 < i19) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(kxVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) kxVar.c.get(i20 - 1)).id))));
                    i20++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i19;
                if (!kxVar.h && kxVar.c.size() > i16) {
                    sparseIntArray3.put(this.y, i17);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(kxVar.g ? -65174 : 92242), Long.valueOf(kxVar.b.id))));
                    this.y++;
                }
                i17++;
                i14++;
                sparseIntArray2 = sparseIntArray5;
                sparseIntArray = sparseIntArray4;
            }
        }
    }

    @Override // f2.q0
    public final int h() {
        return this.y;
    }

    @Override // f2.q0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.q0
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
        if (this.B.W && i10 == 0) {
            return 2;
        }
        if (this.v.indexOfKey(i10) >= 0) {
            return 3;
        }
        return this.w.indexOfKey(i10) >= 0 ? 6 : 0;
    }

    @Override // f2.q0
    public final void l() {
        F(false);
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        yy yyVar = this.B;
        String[] strArr = yyVar.W0;
        xw xwVar = yyVar.M;
        int i13 = yyVar.Y0;
        ArrayList arrayList = yyVar.m1;
        int i14 = o1Var.f;
        View view = o1Var.a;
        boolean z10 = true;
        kx kxVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                j8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    j8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    j8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        j8Var.b(0, strArr[i15]);
                        return;
                    }
                    try {
                        j8Var.b(0, ((kx) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        j8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                mx mxVar = (mx) view;
                int i16 = this.w.get(i12);
                int i17 = xwVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    kxVar = (kx) arrayList.get(i16);
                }
                if (kxVar != null) {
                    mxVar.a.setText("+" + ((kxVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            ox oxVar = (ox) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            kx kxVar2 = (kx) arrayList.get(length);
            int i18 = length - 1;
            kx kxVar3 = i18 >= 0 ? (kx) arrayList.get(i18) : null;
            if (kxVar2 == null || !kxVar2.g || (kxVar3 != null && !kxVar3.e && kxVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (kxVar2 != null && kxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(kxVar2.d, false);
                kxVar2.d = null;
            }
            ag.s1 s1Var = oxVar.h;
            if (kxVar2 == null) {
                return;
            }
            oxVar.s = kxVar2;
            oxVar.v = z10;
            oxVar.b.l(kxVar2.b.title, false);
            oxVar.c.setVisibility(kxVar2.i ? 0 : 8);
            if (!kxVar2.f || kxVar2.b.official) {
                s1Var.a(LocaleController.getString(R.string.Unlock), new nx(oxVar, 6), false);
            } else {
                s1Var.a(LocaleController.getString(R.string.Restore), new nx(oxVar, 5), false);
            }
            oxVar.a(false);
            return;
        }
        gy gyVar = (gy) view;
        gyVar.a = i12;
        gyVar.e = null;
        if (yyVar.W) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = yyVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = yyVar.getRecentEmoji().get(i12);
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
                        str = yy.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = xwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    kx kxVar4 = (kx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((kxVar4.f && !kxVar4.g && (kxVar4.e || isPremium)) || kxVar4.h) ? kxVar4.c.size() : Math.min(i21, kxVar4.c.size());
                    int i23 = gyVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        gyVar.e = kxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) kxVar4.c.get(i11);
                        document = document2;
                        l10 = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l10 = null;
            document = null;
            z10 = false;
        }
        if (l10 != null) {
            gyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            gyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            gyVar.a(null, z10);
            if (gyVar.getSpan() == null || gyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    gyVar.setSpan(new t5(document, (Paint.FontMetricsInt) null));
                } else {
                    gyVar.setSpan(new t5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            gyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            gyVar.setSpan(null);
        }
        gyVar.setTag(str2);
        gyVar.setContentDescription(str);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        yy yyVar = this.B;
        org.telegram.ui.ActionBar.c6 c6Var = yyVar.V1;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 == 1) {
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(yyVar.getContext(), true, false, yyVar.V1, yyVar.e2);
                j8Var.setOnIconClickListener(new f0(this, 14));
                view = j8Var;
            } else if (i10 != 3) {
                int i12 = 5;
                if (i10 == 4) {
                    Context context = yyVar.getContext();
                    wy wyVar = new wy(yyVar, true);
                    yyVar.P = wyVar;
                    hh.f1 f1Var = new hh.f1(yyVar, context, wyVar);
                    f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    f1Var.setClipToPadding(false);
                    f1Var.i(new jh.j(i11));
                    f1Var.setOnItemClickListener(new j(this, i12));
                    view = f1Var;
                } else if (i10 == 5) {
                    view = new ox(yyVar, yyVar.getContext());
                } else if (i10 != 6) {
                    View view2 = new View(yyVar.getContext());
                    view2.setLayoutParams(new f2.y0(-1, yyVar.X0));
                    view = view2;
                } else {
                    Context context2 = yyVar.getContext();
                    mx mxVar = new mx(context2);
                    TextView textView = new TextView(context2);
                    mxVar.a = textView;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var), 99)));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                    mxVar.addView(textView, h7.z5.e(-2, -2, 17));
                    view = mxVar;
                }
            } else {
                lx lxVar = new lx(yyVar.getContext());
                j6 j6Var = new j6(lxVar.getContext(), false, false, false);
                j6Var.b(0.3f, 250L, er.h);
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(yyVar.B(org.telegram.ui.ActionBar.g6.Sh));
                j6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(lxVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, yyVar.B(org.telegram.ui.ActionBar.g6.Oh)));
                frameLayout.addView(j6Var, h7.z5.e(-1, -2, 17));
                lxVar.addView(frameLayout, h7.z5.c(-1.0f, -1));
                ag.s1 s1Var = new ag.s1(lxVar.getContext(), c6Var, false);
                s1Var.setIcon(R.raw.unlock_icon);
                lxVar.addView(s1Var, h7.z5.c(-1.0f, -1));
                view = lxVar;
            }
        } else {
            view = new gy(yyVar.getContext());
        }
        return new lk0(view);
    }
}
