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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nx extends il0 {
    public int A;
    public final /* synthetic */ fz B;
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

    public nx(fz fzVar) {
        this.B = fzVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        fz fzVar = this.B;
        ArrayList arrayList = fzVar.m1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        rx rxVar = (rx) arrayList.get(i11);
        if (rxVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        fzVar.k1.add(Long.valueOf(rxVar.b.id));
        boolean z11 = UserConfig.getInstance(fzVar.Y0).isPremium() || fzVar.Q0;
        int i12 = fzVar.M.J * 3;
        int size = ((rxVar.f && !rxVar.g && (rxVar.e || z11)) || rxVar.h) ? rxVar.c.size() : Math.min(i12, rxVar.c.size());
        Integer num = null;
        Integer valueOf = rxVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        rxVar.h = true;
        int size2 = rxVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        fzVar.o2 = view;
        fzVar.p2 = valueOf.intValue();
        fzVar.q2 = num.intValue() + valueOf.intValue();
        fzVar.r2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            fzVar.post(new lx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        fz fzVar = this.B;
        ArrayList arrayList = fzVar.j1;
        if (fzVar.J2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(fzVar.Y0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || fzVar.l1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        dz dzVar = fzVar.P;
        if (dzVar != null) {
            dzVar.l();
        }
        f2.q.c(new mx(this, arrayList2, 0), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        fz fzVar = this.B;
        ArrayList arrayList = fzVar.j1;
        ArrayList arrayList2 = fzVar.k1;
        int i11 = fzVar.Y0;
        ArrayList arrayList3 = fzVar.m1;
        arrayList3.clear();
        if (fzVar.Y1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || fzVar.Q0;
            TLRPC.ChatFull chatFull = fzVar.F1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                rx rxVar = new rx();
                rxVar.b = fzVar.F1.emojiset;
                rxVar.c = new ArrayList(groupStickerSetById.documents);
                rxVar.e = true;
                rxVar.f = true;
                rxVar.g = false;
                rxVar.h = true;
                rxVar.i = true;
                arrayList3.add(rxVar);
                TLRPC.StickerSet stickerSet2 = rxVar.b;
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
                        rx rxVar2 = new rx();
                        rxVar2.b = tL_messages_stickerSet2.set;
                        rxVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        rxVar2.e = true;
                        rxVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        rxVar2.g = false;
                        rxVar2.h = true;
                        arrayList3.add(rxVar2);
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
                    rx rxVar3 = new rx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    rxVar3.b = stickerSet3;
                    rxVar3.c = tL_messages_stickerSet3.documents;
                    rxVar3.e = false;
                    rxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    rxVar3.g = false;
                    rxVar3.h = z12;
                    arrayList3.add(rxVar3);
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
                        rx rxVar4 = new rx();
                        rxVar4.b = tL_messages_stickerSet3.set;
                        rxVar4.c = new ArrayList(arrayList5);
                        rxVar4.e = z12;
                        i10 = i14;
                        rxVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        rxVar4.g = false;
                        rxVar4.h = true;
                        arrayList3.add(rxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        rx rxVar5 = new rx();
                        rxVar5.b = tL_messages_stickerSet3.set;
                        rxVar5.c = new ArrayList(arrayList6);
                        rxVar5.e = false;
                        rxVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        rxVar5.g = false;
                        rxVar5.h = arrayList2.contains(Long.valueOf(rxVar5.b.id));
                        arrayList3.add(rxVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                rx rxVar6 = new rx();
                rxVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                rxVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    rxVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        rxVar6.c = stickerSet5.documents;
                    } else {
                        rxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    rxVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = rxVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= rxVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) rxVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    rxVar6.e = !z11;
                    rxVar6.h = arrayList2.contains(Long.valueOf(rxVar6.b.id));
                    rxVar6.g = true;
                    arrayList3.add(rxVar6);
                }
            }
            bw bwVar = fzVar.E;
            if (bwVar != null) {
                bwVar.p(fzVar.getEmojipacks());
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
        fz fzVar = this.B;
        boolean z11 = fzVar.W;
        ArrayList arrayList3 = fzVar.m1;
        ArrayList arrayList4 = fzVar.j1;
        int i10 = fzVar.Y0;
        boolean z12 = UserConfig.getInstance(i10).isPremium() || fzVar.Q0;
        if (z11) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z12 || !fzVar.Y1 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z11) {
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
        ArrayList<String> recentEmoji = fzVar.getRecentEmoji();
        bw bwVar = fzVar.E;
        if (bwVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z13 = !isEmpty;
            pv pvVar = bwVar.y;
            if (bwVar.S != z13) {
                bwVar.S = z13;
                if (bwVar.R) {
                    pvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    pvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(jr.h).start();
                }
                if (!isEmpty || bwVar.I != 0) {
                    z10 = isEmpty ? true : true;
                    bwVar.b.requestLayout();
                    bwVar.R = false;
                }
                bwVar.j(0, bwVar.R ^ z10);
                bwVar.b.requestLayout();
                bwVar.R = false;
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
        int i16 = fzVar.M.J * 3;
        this.A = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                rx rxVar = (rx) arrayList3.get(i17);
                boolean z14 = rxVar.g;
                if (z14 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((rxVar.f && !z14 && (rxVar.e || z12)) || rxVar.h) ? rxVar.c.size() : Math.min(i16, rxVar.c.size());
                int i18 = 1 + size;
                if (rxVar.h || rxVar.c.size() <= i16) {
                    size = i18;
                }
                Integer valueOf = Integer.valueOf(rxVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = rxVar.b;
                int i19 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i17 : stickerSet.id), Boolean.valueOf(rxVar.i))));
                int i20 = 1;
                while (i20 < i19) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(rxVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) rxVar.c.get(i20 - 1)).id))));
                    i20++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i19;
                if (!rxVar.h && rxVar.c.size() > i16) {
                    sparseIntArray3.put(this.y, i17);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(rxVar.g ? -65174 : 92242), Long.valueOf(rxVar.b.id))));
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
        if (this.B.W && i10 == 0) {
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
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        fz fzVar = this.B;
        String[] strArr = fzVar.W0;
        ex exVar = fzVar.M;
        int i13 = fzVar.Y0;
        ArrayList arrayList = fzVar.m1;
        int i14 = n1Var.f;
        View view = n1Var.a;
        boolean z10 = true;
        rx rxVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                k8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    k8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    k8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        k8Var.b(0, strArr[i15]);
                        return;
                    }
                    try {
                        k8Var.b(0, ((rx) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        k8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                tx txVar = (tx) view;
                int i16 = this.w.get(i12);
                int i17 = exVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    rxVar = (rx) arrayList.get(i16);
                }
                if (rxVar != null) {
                    txVar.a.setText("+" + ((rxVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            vx vxVar = (vx) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            rx rxVar2 = (rx) arrayList.get(length);
            int i18 = length - 1;
            rx rxVar3 = i18 >= 0 ? (rx) arrayList.get(i18) : null;
            if (rxVar2 == null || !rxVar2.g || (rxVar3 != null && !rxVar3.e && rxVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (rxVar2 != null && rxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(rxVar2.d, false);
                rxVar2.d = null;
            }
            cg.d1 d1Var = vxVar.h;
            if (rxVar2 == null) {
                return;
            }
            vxVar.s = rxVar2;
            vxVar.v = z10;
            vxVar.b.l(rxVar2.b.title, false);
            vxVar.c.setVisibility(rxVar2.i ? 0 : 8);
            if (!rxVar2.f || rxVar2.b.official) {
                d1Var.a(LocaleController.getString(R.string.Unlock), new ux(vxVar, 6), false);
            } else {
                d1Var.a(LocaleController.getString(R.string.Restore), new ux(vxVar, 5), false);
            }
            vxVar.a(false);
            return;
        }
        ny nyVar = (ny) view;
        nyVar.a = i12;
        nyVar.e = null;
        if (fzVar.W) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = fzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = fzVar.getRecentEmoji().get(i12);
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
                        str = fz.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = exVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    rx rxVar4 = (rx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((rxVar4.f && !rxVar4.g && (rxVar4.e || isPremium)) || rxVar4.h) ? rxVar4.c.size() : Math.min(i21, rxVar4.c.size());
                    int i23 = nyVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        nyVar.e = rxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) rxVar4.c.get(i11);
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
            nyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            nyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            nyVar.a(null, z10);
            if (nyVar.getSpan() == null || nyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    nyVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                } else {
                    nyVar.setSpan(new y5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            nyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            nyVar.setSpan(null);
        }
        nyVar.setTag(str2);
        nyVar.setContentDescription(str);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        fz fzVar = this.B;
        org.telegram.ui.ActionBar.c6 c6Var = fzVar.V1;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 == 1) {
                org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(fzVar.getContext(), true, false, fzVar.V1, fzVar.e2);
                k8Var.setOnIconClickListener(new h0(this, 14));
                view = k8Var;
            } else if (i10 != 3) {
                int i12 = 5;
                if (i10 == 4) {
                    Context context = fzVar.getContext();
                    dz dzVar = new dz(fzVar, true);
                    fzVar.P = dzVar;
                    jh.e1 e1Var = new jh.e1(fzVar, context, dzVar);
                    e1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    e1Var.setClipToPadding(false);
                    e1Var.i(new lh.j(i11));
                    e1Var.setOnItemClickListener(new k(this, i12));
                    view = e1Var;
                } else if (i10 == 5) {
                    view = new vx(fzVar, fzVar.getContext());
                } else if (i10 != 6) {
                    View view2 = new View(fzVar.getContext());
                    view2.setLayoutParams(new f2.x0(-1, fzVar.X0));
                    view = view2;
                } else {
                    Context context2 = fzVar.getContext();
                    tx txVar = new tx(context2);
                    TextView textView = new TextView(context2);
                    txVar.a = textView;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var), 99)));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                    txVar.addView(textView, i7.f6.e(-2, -2, 17));
                    view = txVar;
                }
            } else {
                sx sxVar = new sx(fzVar.getContext());
                o6 o6Var = new o6(sxVar.getContext(), false, false, false);
                o6Var.b(0.3f, 250L, jr.h);
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(fzVar.A(org.telegram.ui.ActionBar.g6.Sh));
                o6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(sxVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, fzVar.A(org.telegram.ui.ActionBar.g6.Oh)));
                frameLayout.addView(o6Var, i7.f6.e(-1, -2, 17));
                sxVar.addView(frameLayout, i7.f6.c(-1.0f, -1));
                cg.d1 d1Var = new cg.d1(sxVar.getContext(), c6Var, false);
                d1Var.setIcon(R.raw.unlock_icon);
                sxVar.addView(d1Var, i7.f6.c(-1.0f, -1));
                view = sxVar;
            }
        } else {
            view = new ny(fzVar.getContext());
        }
        return new vk0(view);
    }
}
