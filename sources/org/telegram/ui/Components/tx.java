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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class tx extends kl0 {
    public int E;
    public final /* synthetic */ kz F;
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

    public tx(kz kzVar) {
        this.F = kzVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        xx xxVar = (xx) arrayList.get(i11);
        if (xxVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        kzVar.o1.add(Long.valueOf(xxVar.b.id));
        boolean z11 = UserConfig.getInstance(kzVar.c1).isPremium() || kzVar.U0;
        int i12 = kzVar.Q.J * 3;
        int size = ((xxVar.f && !xxVar.g && (xxVar.e || z11)) || xxVar.h) ? xxVar.c.size() : Math.min(i12, xxVar.c.size());
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
        kzVar.s2 = view;
        kzVar.t2 = valueOf.intValue();
        kzVar.u2 = num.intValue() + valueOf.intValue();
        kzVar.v2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            kzVar.post(new sx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.n1;
        if (kzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || kzVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        iz izVar = kzVar.T;
        if (izVar != null) {
            izVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.n1;
        ArrayList arrayList2 = kzVar.o1;
        int i11 = kzVar.c1;
        ArrayList arrayList3 = kzVar.q1;
        arrayList3.clear();
        if (kzVar.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || kzVar.U0;
            TLRPC.ChatFull chatFull = kzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                xx xxVar = new xx();
                xxVar.b = kzVar.J1.emojiset;
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
            if (!z13) {
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
                if (z13) {
                    xx xxVar3 = new xx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    xxVar3.b = stickerSet3;
                    xxVar3.c = tL_messages_stickerSet3.documents;
                    xxVar3.e = false;
                    xxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    xxVar3.g = false;
                    xxVar3.h = z12;
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
                        xxVar4.e = z12;
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
                z12 = true;
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
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) xxVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    xxVar6.e = !z11;
                    xxVar6.h = arrayList2.contains(Long.valueOf(xxVar6.b.id));
                    xxVar6.g = true;
                    arrayList3.add(xxVar6);
                }
            }
            jw jwVar = kzVar.I;
            if (jwVar != null) {
                jwVar.p(kzVar.getEmojipacks());
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
        kz kzVar = this.F;
        boolean z11 = kzVar.d0;
        ArrayList arrayList3 = kzVar.q1;
        ArrayList arrayList4 = kzVar.n1;
        int i10 = kzVar.c1;
        boolean z12 = UserConfig.getInstance(i10).isPremium() || kzVar.U0;
        if (z11) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z12 || !kzVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z11) {
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
        ArrayList<String> recentEmoji = kzVar.getRecentEmoji();
        jw jwVar = kzVar.I;
        if (jwVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z13 = !isEmpty;
            xv xvVar = jwVar.y;
            if (jwVar.W != z13) {
                jwVar.W = z13;
                if (jwVar.V) {
                    xvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    xvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(pr.h).start();
                }
                if (!isEmpty || jwVar.M != 0) {
                    z10 = isEmpty ? true : true;
                    jwVar.b.requestLayout();
                    jwVar.V = false;
                }
                jwVar.j(0, jwVar.V ^ z10);
                jwVar.b.requestLayout();
                jwVar.V = false;
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
        int i16 = kzVar.Q.J * 3;
        this.E = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                xx xxVar = (xx) arrayList3.get(i17);
                boolean z14 = xxVar.g;
                if (z14 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((xxVar.f && !z14 && (xxVar.e || z12)) || xxVar.h) ? xxVar.c.size() : Math.min(i16, xxVar.c.size());
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
        kz kzVar = this.F;
        String[] strArr = kzVar.a1;
        lx lxVar = kzVar.Q;
        int i13 = kzVar.c1;
        ArrayList arrayList = kzVar.q1;
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        xx xxVar = null;
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
                        o8Var.b(0, ((xx) arrayList.get(i15 - strArr.length)).b.title);
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
                z10 = false;
            }
            if (xxVar2 != null && xxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(xxVar2.d, false);
                xxVar2.d = null;
            }
            sg.r0 r0Var = cyVar.h;
            if (xxVar2 == null) {
                return;
            }
            cyVar.s = xxVar2;
            cyVar.v = z10;
            cyVar.b.l(xxVar2.b.title, false);
            cyVar.c.setVisibility(xxVar2.i ? 0 : 8);
            if (!xxVar2.f || xxVar2.b.official) {
                r0Var.a(LocaleController.getString(R.string.Unlock), new ay(cyVar, 6), false);
            } else {
                r0Var.a(LocaleController.getString(R.string.Restore), new ay(cyVar, 5), false);
            }
            cyVar.a(false);
            return;
        }
        ty tyVar = (ty) view;
        tyVar.a = i12;
        tyVar.e = null;
        if (kzVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = kzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = kzVar.getRecentEmoji().get(i12);
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
                        str = kz.g(str4, str5);
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
                    int i23 = tyVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        tyVar.e = xxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) xxVar4.c.get(i11);
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
            tyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            tyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            tyVar.a(null, z10);
            if (tyVar.getSpan() == null || tyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    tyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                } else {
                    tyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            tyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            tyVar.setSpan(null);
        }
        tyVar.setTag(str2);
        tyVar.setContentDescription(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        kz kzVar = this.F;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.Z1;
        if (i10 == 0) {
            view = new ty(kzVar.getContext());
        } else if (i10 != 1) {
            int i11 = 3;
            if (i10 != 3) {
                int i12 = 5;
                if (i10 == 4) {
                    Context context = kzVar.getContext();
                    iz izVar = new iz(kzVar, true);
                    kzVar.T = izVar;
                    bi.o0 o0Var = new bi.o0(kzVar, context, izVar);
                    o0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    o0Var.setClipToPadding(false);
                    o0Var.i(new bi.o(i11));
                    o0Var.setOnItemClickListener(new k(this, i12));
                    view = o0Var;
                } else if (i10 == 5) {
                    view = new cy(kzVar, kzVar.getContext());
                } else if (i10 != 6) {
                    View view2 = new View(kzVar.getContext());
                    view2.setLayoutParams(new s4.p0(-1, kzVar.b1));
                    view = view2;
                } else {
                    Context context2 = kzVar.getContext();
                    zx zxVar = new zx(context2);
                    TextView textView = new TextView(context2);
                    zxVar.a = textView;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var), 99)));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                    zxVar.addView(textView, w7.x5.e(-2, -2, 17));
                    view = zxVar;
                }
            } else {
                yx yxVar = new yx(kzVar.getContext());
                q6 q6Var = new q6(yxVar.getContext(), false, false, false);
                q6Var.b(0.3f, 250L, pr.h);
                q6Var.setTextSize(AndroidUtilities.dp(14.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Sh));
                q6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(yxVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, kzVar.A(org.telegram.ui.ActionBar.j6.Oh)));
                frameLayout.addView(q6Var, w7.x5.e(-1, -2, 17));
                yxVar.addView(frameLayout, w7.x5.c(-1.0f, -1));
                sg.r0 r0Var = new sg.r0(yxVar.getContext(), f6Var, false);
                r0Var.setIcon(R.raw.unlock_icon);
                yxVar.addView(r0Var, w7.x5.c(-1.0f, -1));
                view = yxVar;
            }
        } else {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(kzVar.getContext(), true, false, kzVar.Z1, kzVar.i2);
            o8Var.setOnIconClickListener(new g0(this, 14));
            view = o8Var;
        }
        return new vk0(view);
    }
}
