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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jy extends pm0 {
    public int E;
    public final /* synthetic */ a00 F;
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

    public jy(a00 a00Var) {
        this.F = a00Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        a00 a00Var = this.F;
        ArrayList arrayList = a00Var.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        ny nyVar = (ny) arrayList.get(i11);
        if (nyVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        a00Var.o1.add(Long.valueOf(nyVar.b.id));
        boolean z11 = UserConfig.getInstance(a00Var.c1).isPremium() || a00Var.U0;
        int i12 = a00Var.Q.J * 3;
        int size = ((nyVar.f && !nyVar.g && (nyVar.e || z11)) || nyVar.h) ? nyVar.c.size() : Math.min(i12, nyVar.c.size());
        Integer num = null;
        Integer valueOf = nyVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        nyVar.h = true;
        int size2 = nyVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        a00Var.r2 = view;
        a00Var.s2 = valueOf.intValue();
        a00Var.t2 = num.intValue() + valueOf.intValue();
        a00Var.u2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            a00Var.post(new iy(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        a00 a00Var = this.F;
        ArrayList arrayList = a00Var.n1;
        if (a00Var.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(a00Var.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || a00Var.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        yz yzVar = a00Var.T;
        if (yzVar != null) {
            yzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        a00 a00Var = this.F;
        ArrayList arrayList = a00Var.n1;
        ArrayList arrayList2 = a00Var.o1;
        int i11 = a00Var.c1;
        ArrayList arrayList3 = a00Var.q1;
        arrayList3.clear();
        if (a00Var.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || a00Var.U0;
            TLRPC.ChatFull chatFull = a00Var.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                ny nyVar = new ny();
                nyVar.b = a00Var.J1.emojiset;
                nyVar.c = new ArrayList(groupStickerSetById.documents);
                nyVar.e = true;
                nyVar.f = true;
                nyVar.g = false;
                nyVar.h = true;
                nyVar.i = true;
                arrayList3.add(nyVar);
                TLRPC.StickerSet stickerSet2 = nyVar.b;
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
                        ny nyVar2 = new ny();
                        nyVar2.b = tL_messages_stickerSet2.set;
                        nyVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        nyVar2.e = true;
                        nyVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        nyVar2.g = false;
                        nyVar2.h = true;
                        arrayList3.add(nyVar2);
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
                    ny nyVar3 = new ny();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    nyVar3.b = stickerSet3;
                    nyVar3.c = tL_messages_stickerSet3.documents;
                    nyVar3.e = false;
                    nyVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    nyVar3.g = false;
                    nyVar3.h = z12;
                    arrayList3.add(nyVar3);
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
                        ny nyVar4 = new ny();
                        nyVar4.b = tL_messages_stickerSet3.set;
                        nyVar4.c = new ArrayList(arrayList5);
                        nyVar4.e = z12;
                        i10 = i14;
                        nyVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        nyVar4.g = false;
                        nyVar4.h = true;
                        arrayList3.add(nyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        ny nyVar5 = new ny();
                        nyVar5.b = tL_messages_stickerSet3.set;
                        nyVar5.c = new ArrayList(arrayList6);
                        nyVar5.e = false;
                        nyVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        nyVar5.g = false;
                        nyVar5.h = arrayList2.contains(Long.valueOf(nyVar5.b.id));
                        arrayList3.add(nyVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ny nyVar6 = new ny();
                nyVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                nyVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    nyVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        nyVar6.c = stickerSet5.documents;
                    } else {
                        nyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    nyVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = nyVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= nyVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) nyVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    nyVar6.e = !z11;
                    nyVar6.h = arrayList2.contains(Long.valueOf(nyVar6.b.id));
                    nyVar6.g = true;
                    arrayList3.add(nyVar6);
                }
            }
            ey eyVar = a00Var.I;
            if (eyVar != null) {
                eyVar.p(a00Var.getEmojipacks());
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
        ey eyVar;
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
        a00 a00Var = this.F;
        boolean z12 = a00Var.d0;
        ArrayList arrayList3 = a00Var.q1;
        ArrayList arrayList4 = a00Var.n1;
        int i16 = a00Var.c1;
        Object[] objArr = UserConfig.getInstance(i16).isPremium() || a00Var.U0;
        if (z12) {
            this.y++;
            arrayList2.add(-1);
        }
        int i17 = 3;
        if (!objArr == true || !a00Var.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
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
                recentEmoji = a00Var.getRecentEmoji();
                eyVar = a00Var.I;
                if (eyVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    ow owVar = eyVar.y;
                    if (eyVar.W != z13) {
                        eyVar.W = z13;
                        if (eyVar.V) {
                            owVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            owVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(hs.h).start();
                        }
                        if (!isEmpty || eyVar.M != 0) {
                            z10 = isEmpty ? true : true;
                            eyVar.b.requestLayout();
                            eyVar.V = false;
                        }
                        eyVar.j(0, eyVar.V ^ z10);
                        eyVar.b.requestLayout();
                        eyVar.V = false;
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
                int i20 = a00Var.Q.J * 3;
                this.E = this.y;
                this.e = -1;
                if (arrayList3 == null) {
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        sparseIntArray.put(this.y, i14);
                        sparseIntArray2.put(i14, this.y);
                        arrayList.add(Integer.valueOf(this.y));
                        ny nyVar = (ny) arrayList3.get(i21);
                        boolean z14 = nyVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.y;
                        }
                        int size = ((nyVar.f && !z14 && (nyVar.e || objArr == true)) || nyVar.h) ? nyVar.c.size() : Math.min(i20, nyVar.c.size());
                        int i22 = 1 + size;
                        boolean z15 = z11;
                        if (nyVar.h || nyVar.c.size() <= i20) {
                            size = i22;
                        }
                        Integer valueOf = Integer.valueOf(nyVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = nyVar.b;
                        int i23 = i12;
                        int i24 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i21 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(nyVar.i);
                        int i25 = i17;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i25];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i23] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i26 = 1;
                        while (i26 < i24) {
                            Integer valueOf4 = Integer.valueOf(nyVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) nyVar.c.get(i26 - 1)).id);
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
                        if (nyVar.h || nyVar.c.size() <= i20) {
                            i15 = 2;
                        } else {
                            sparseIntArray3.put(this.y, i21);
                            Integer valueOf6 = Integer.valueOf(nyVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(nyVar.b.id);
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
        recentEmoji = a00Var.getRecentEmoji();
        eyVar = a00Var.I;
        if (eyVar != null) {
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
        int i202 = a00Var.Q.J * 3;
        this.E = this.y;
        this.e = -1;
        if (arrayList3 == null) {
        }
    }

    @Override // s4.i0
    public final int h() {
        return this.y;
    }

    @Override // s4.i0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.i0
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

    @Override // s4.i0
    public final void l() {
        F(false);
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        a00 a00Var = this.F;
        String[] strArr = a00Var.a1;
        zx zxVar = a00Var.Q;
        int i13 = a00Var.c1;
        ArrayList arrayList = a00Var.q1;
        int i14 = d1Var.f;
        View view = d1Var.a;
        boolean z10 = true;
        ny nyVar = null;
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
                        o8Var.b(0, ((ny) arrayList.get(i15 - strArr.length)).b.title);
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
                py pyVar = (py) view;
                int i16 = this.w.get(i12);
                int i17 = zxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    nyVar = (ny) arrayList.get(i16);
                }
                if (nyVar != null) {
                    pyVar.a.setText("+" + ((nyVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            ry ryVar = (ry) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            ny nyVar2 = (ny) arrayList.get(length);
            int i18 = length - 1;
            ny nyVar3 = i18 >= 0 ? (ny) arrayList.get(i18) : null;
            if (nyVar2 == null || !nyVar2.g || (nyVar3 != null && !nyVar3.e && nyVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (nyVar2 != null && nyVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(nyVar2.d, false);
                nyVar2.d = null;
            }
            rg.p0 p0Var = ryVar.h;
            if (nyVar2 == null) {
                return;
            }
            ryVar.s = nyVar2;
            ryVar.v = z10;
            ryVar.b.l(nyVar2.b.title, false);
            ryVar.c.setVisibility(nyVar2.i ? 0 : 8);
            if (!nyVar2.f || nyVar2.b.official) {
                p0Var.a(LocaleController.getString(R.string.Unlock), new qy(ryVar, 6), false);
            } else {
                p0Var.a(LocaleController.getString(R.string.Restore), new qy(ryVar, 5), false);
            }
            ryVar.a(false);
            return;
        }
        iz izVar = (iz) view;
        izVar.a = i12;
        izVar.e = null;
        if (a00Var.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = a00Var.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = a00Var.getRecentEmoji().get(i12);
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
                        str = a00.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = zxVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    ny nyVar4 = (ny) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((nyVar4.f && !nyVar4.g && (nyVar4.e || isPremium)) || nyVar4.h) ? nyVar4.c.size() : Math.min(i21, nyVar4.c.size());
                    int i23 = izVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        izVar.e = nyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) nyVar4.c.get(i11);
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
            izVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            izVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            izVar.a(null, z10);
            if (izVar.getSpan() == null || izVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    izVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                } else {
                    izVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            izVar.a(Emoji.getEmojiBigDrawable(str), z10);
            izVar.setSpan(null);
        }
        izVar.setTag(str2);
        izVar.setContentDescription(str);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        a00 a00Var = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = a00Var.Z1;
        if (i10 == 0) {
            view = new iz(a00Var.getContext());
        } else if (i10 != 1) {
            int i11 = 3;
            if (i10 == 3) {
                oy oyVar = new oy(a00Var.getContext());
                r6 r6Var = new r6(oyVar.getContext(), false, false, false);
                r6Var.b(0.3f, 250L, hs.h);
                r6Var.setTextSize(AndroidUtilities.dp(14.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(a00Var.B(org.telegram.ui.ActionBar.i6.Sh));
                r6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(oyVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, a00Var.B(org.telegram.ui.ActionBar.i6.Oh)));
                frameLayout.addView(r6Var, w7.x5.e(-1, -2, 17));
                oyVar.addView(frameLayout, w7.x5.d(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(oyVar.getContext(), e6Var, false);
                p0Var.setIcon(R.raw.unlock_icon);
                oyVar.addView(p0Var, w7.x5.d(-1.0f, -1));
                view = oyVar;
            } else if (i10 == 4) {
                Context context = a00Var.getContext();
                yz yzVar = new yz(a00Var, true);
                a00Var.T = yzVar;
                ai.w0 w0Var = new ai.w0(a00Var, context, yzVar);
                w0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                w0Var.setClipToPadding(false);
                w0Var.i(new ai.t(i11));
                w0Var.setOnItemClickListener(new j(this, 5));
                view = w0Var;
            } else if (i10 == 5) {
                view = new ry(a00Var, a00Var.getContext());
            } else if (i10 != 6) {
                View view2 = new View(a00Var.getContext());
                view2.setLayoutParams(new s4.q0(-1, a00Var.b1));
                view = view2;
            } else {
                Context context2 = a00Var.getContext();
                py pyVar = new py(context2);
                TextView textView = new TextView(context2);
                pyVar.a = textView;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
                textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var), 99)));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                pyVar.addView(textView, w7.x5.e(-2, -2, 17));
                view = pyVar;
            }
        } else {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(a00Var.getContext(), true, false, a00Var.Z1, a00Var.i2);
            o8Var.setOnIconClickListener(new f0(this, 13));
            view = o8Var;
        }
        return new am0(view);
    }
}
