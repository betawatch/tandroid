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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ux extends vl0 {
    public int E;
    public final /* synthetic */ lz F;
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

    public ux(lz lzVar) {
        this.F = lzVar;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        lz lzVar = this.F;
        ArrayList arrayList = lzVar.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        yx yxVar = (yx) arrayList.get(i11);
        if (yxVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        lzVar.o1.add(Long.valueOf(yxVar.b.id));
        boolean z11 = UserConfig.getInstance(lzVar.c1).isPremium() || lzVar.U0;
        int i12 = lzVar.Q.J * 3;
        int size = ((yxVar.f && !yxVar.g && (yxVar.e || z11)) || yxVar.h) ? yxVar.c.size() : Math.min(i12, yxVar.c.size());
        Integer num = null;
        Integer valueOf = yxVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        yxVar.h = true;
        int size2 = yxVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        lzVar.r2 = view;
        lzVar.s2 = valueOf.intValue();
        lzVar.t2 = num.intValue() + valueOf.intValue();
        lzVar.u2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            lzVar.post(new tx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        lz lzVar = this.F;
        ArrayList arrayList = lzVar.n1;
        if (lzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(lzVar.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || lzVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        jz jzVar = lzVar.T;
        if (jzVar != null) {
            jzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        lz lzVar = this.F;
        ArrayList arrayList = lzVar.n1;
        ArrayList arrayList2 = lzVar.o1;
        int i11 = lzVar.c1;
        ArrayList arrayList3 = lzVar.q1;
        arrayList3.clear();
        if (lzVar.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || lzVar.U0;
            TLRPC.ChatFull chatFull = lzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                yx yxVar = new yx();
                yxVar.b = lzVar.J1.emojiset;
                yxVar.c = new ArrayList(groupStickerSetById.documents);
                yxVar.e = true;
                yxVar.f = true;
                yxVar.g = false;
                yxVar.h = true;
                yxVar.i = true;
                arrayList3.add(yxVar);
                TLRPC.StickerSet stickerSet2 = yxVar.b;
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
                        yx yxVar2 = new yx();
                        yxVar2.b = tL_messages_stickerSet2.set;
                        yxVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        yxVar2.e = true;
                        yxVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        yxVar2.g = false;
                        yxVar2.h = true;
                        arrayList3.add(yxVar2);
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
                    yx yxVar3 = new yx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    yxVar3.b = stickerSet3;
                    yxVar3.c = tL_messages_stickerSet3.documents;
                    yxVar3.e = false;
                    yxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    yxVar3.g = false;
                    yxVar3.h = z12;
                    arrayList3.add(yxVar3);
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
                        yx yxVar4 = new yx();
                        yxVar4.b = tL_messages_stickerSet3.set;
                        yxVar4.c = new ArrayList(arrayList5);
                        yxVar4.e = z12;
                        i10 = i14;
                        yxVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        yxVar4.g = false;
                        yxVar4.h = true;
                        arrayList3.add(yxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        yx yxVar5 = new yx();
                        yxVar5.b = tL_messages_stickerSet3.set;
                        yxVar5.c = new ArrayList(arrayList6);
                        yxVar5.e = false;
                        yxVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        yxVar5.g = false;
                        yxVar5.h = arrayList2.contains(Long.valueOf(yxVar5.b.id));
                        arrayList3.add(yxVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                yx yxVar6 = new yx();
                yxVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                yxVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    yxVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        yxVar6.c = stickerSet5.documents;
                    } else {
                        yxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    yxVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = yxVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= yxVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) yxVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    yxVar6.e = !z11;
                    yxVar6.h = arrayList2.contains(Long.valueOf(yxVar6.b.id));
                    yxVar6.g = true;
                    arrayList3.add(yxVar6);
                }
            }
            px pxVar = lzVar.I;
            if (pxVar != null) {
                pxVar.p(lzVar.getEmojipacks());
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
        lz lzVar = this.F;
        boolean z11 = lzVar.d0;
        ArrayList arrayList3 = lzVar.q1;
        ArrayList arrayList4 = lzVar.n1;
        int i10 = lzVar.c1;
        boolean z12 = UserConfig.getInstance(i10).isPremium() || lzVar.U0;
        if (z11) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z12 || !lzVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z11) {
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
        ArrayList<String> recentEmoji = lzVar.getRecentEmoji();
        px pxVar = lzVar.I;
        if (pxVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z13 = !isEmpty;
            aw awVar = pxVar.y;
            if (pxVar.W != z13) {
                pxVar.W = z13;
                if (pxVar.V) {
                    awVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    awVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(rr.h).start();
                }
                if (!isEmpty || pxVar.M != 0) {
                    z10 = isEmpty ? true : true;
                    pxVar.b.requestLayout();
                    pxVar.V = false;
                }
                pxVar.j(0, pxVar.V ^ z10);
                pxVar.b.requestLayout();
                pxVar.V = false;
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
        int i16 = lzVar.Q.J * 3;
        this.E = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                yx yxVar = (yx) arrayList3.get(i17);
                boolean z14 = yxVar.g;
                if (z14 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((yxVar.f && !z14 && (yxVar.e || z12)) || yxVar.h) ? yxVar.c.size() : Math.min(i16, yxVar.c.size());
                int i18 = 1 + size;
                if (yxVar.h || yxVar.c.size() <= i16) {
                    size = i18;
                }
                Integer valueOf = Integer.valueOf(yxVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = yxVar.b;
                int i19 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i17 : stickerSet.id), Boolean.valueOf(yxVar.i))));
                int i20 = 1;
                while (i20 < i19) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(yxVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) yxVar.c.get(i20 - 1)).id))));
                    i20++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i19;
                if (!yxVar.h && yxVar.c.size() > i16) {
                    sparseIntArray3.put(this.y, i17);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(yxVar.g ? -65174 : 92242), Long.valueOf(yxVar.b.id))));
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
        lz lzVar = this.F;
        String[] strArr = lzVar.a1;
        lx lxVar = lzVar.Q;
        int i13 = lzVar.c1;
        ArrayList arrayList = lzVar.q1;
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        yx yxVar = null;
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
                        o8Var.b(0, ((yx) arrayList.get(i15 - strArr.length)).b.title);
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
                ay ayVar = (ay) view;
                int i16 = this.w.get(i12);
                int i17 = lxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    yxVar = (yx) arrayList.get(i16);
                }
                if (yxVar != null) {
                    ayVar.a.setText("+" + ((yxVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            dy dyVar = (dy) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            yx yxVar2 = (yx) arrayList.get(length);
            int i18 = length - 1;
            yx yxVar3 = i18 >= 0 ? (yx) arrayList.get(i18) : null;
            if (yxVar2 == null || !yxVar2.g || (yxVar3 != null && !yxVar3.e && yxVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (yxVar2 != null && yxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(yxVar2.d, false);
                yxVar2.d = null;
            }
            rg.p0 p0Var = dyVar.h;
            if (yxVar2 == null) {
                return;
            }
            dyVar.s = yxVar2;
            dyVar.v = z10;
            dyVar.b.l(yxVar2.b.title, false);
            dyVar.c.setVisibility(yxVar2.i ? 0 : 8);
            if (!yxVar2.f || yxVar2.b.official) {
                p0Var.a(LocaleController.getString(R.string.Unlock), new cy(dyVar, 6), false);
            } else {
                p0Var.a(LocaleController.getString(R.string.Restore), new cy(dyVar, 5), false);
            }
            dyVar.a(false);
            return;
        }
        uy uyVar = (uy) view;
        uyVar.a = i12;
        uyVar.e = null;
        if (lzVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = lzVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = lzVar.getRecentEmoji().get(i12);
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
                        str = lz.g(str4, str5);
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
                    yx yxVar4 = (yx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((yxVar4.f && !yxVar4.g && (yxVar4.e || isPremium)) || yxVar4.h) ? yxVar4.c.size() : Math.min(i21, yxVar4.c.size());
                    int i23 = uyVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        uyVar.e = yxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) yxVar4.c.get(i11);
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
            uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            uyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            uyVar.a(null, z10);
            if (uyVar.getSpan() == null || uyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    uyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                } else {
                    uyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            uyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            uyVar.setSpan(null);
        }
        uyVar.setTag(str2);
        uyVar.setContentDescription(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        lz lzVar = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = lzVar.Z1;
        if (i10 == 0) {
            view = new uy(lzVar.getContext());
        } else if (i10 != 1) {
            int i11 = 3;
            if (i10 != 3) {
                int i12 = 5;
                if (i10 == 4) {
                    Context context = lzVar.getContext();
                    jz jzVar = new jz(lzVar, true);
                    lzVar.T = jzVar;
                    ai.w0 w0Var = new ai.w0(lzVar, context, jzVar);
                    w0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    w0Var.setClipToPadding(false);
                    w0Var.i(new ai.t(i11));
                    w0Var.setOnItemClickListener(new j(this, i12));
                    view = w0Var;
                } else if (i10 == 5) {
                    view = new dy(lzVar, lzVar.getContext());
                } else if (i10 != 6) {
                    View view2 = new View(lzVar.getContext());
                    view2.setLayoutParams(new s4.p0(-1, lzVar.b1));
                    view = view2;
                } else {
                    Context context2 = lzVar.getContext();
                    ay ayVar = new ay(context2);
                    TextView textView = new TextView(context2);
                    ayVar.a = textView;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                    ayVar.addView(textView, w7.y5.e(-2, -2, 17));
                    view = ayVar;
                }
            } else {
                zx zxVar = new zx(lzVar.getContext());
                p6 p6Var = new p6(zxVar.getContext(), false, false, false);
                p6Var.b(0.3f, 250L, rr.h);
                p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextColor(lzVar.z(org.telegram.ui.ActionBar.h6.Sh));
                p6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(zxVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, lzVar.z(org.telegram.ui.ActionBar.h6.Oh)));
                frameLayout.addView(p6Var, w7.y5.e(-1, -2, 17));
                zxVar.addView(frameLayout, w7.y5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(zxVar.getContext(), d6Var, false);
                p0Var.setIcon(R.raw.unlock_icon);
                zxVar.addView(p0Var, w7.y5.c(-1.0f, -1));
                view = zxVar;
            }
        } else {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(lzVar.getContext(), true, false, lzVar.Z1, lzVar.i2);
            o8Var.setOnIconClickListener(new f0(this, 14));
            view = o8Var;
        }
        return new gl0(view);
    }
}
