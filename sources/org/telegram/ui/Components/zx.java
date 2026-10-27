package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zx extends mm0 {
    public int E;
    public final /* synthetic */ sz F;
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

    public zx(sz szVar) {
        this.F = szVar;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        sz szVar = this.F;
        ArrayList arrayList = szVar.q1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        ey eyVar = (ey) arrayList.get(i11);
        if (eyVar.h) {
            return;
        }
        boolean z10 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        szVar.o1.add(Long.valueOf(eyVar.b.id));
        boolean z11 = UserConfig.getInstance(szVar.c1).isPremium() || szVar.U0;
        int i12 = szVar.Q.J * 3;
        int size = ((eyVar.f && !eyVar.g && (eyVar.e || z11)) || eyVar.h) ? eyVar.c.size() : Math.min(i12, eyVar.c.size());
        Integer num = null;
        Integer valueOf = eyVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        eyVar.h = true;
        int size2 = eyVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        szVar.s2 = view;
        szVar.t2 = valueOf.intValue();
        szVar.u2 = num.intValue() + valueOf.intValue();
        szVar.v2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            szVar.post(new yx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        sz szVar = this.F;
        ArrayList arrayList = szVar.n1;
        if (szVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(szVar.c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || szVar.p1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        qz qzVar = szVar.T;
        if (qzVar != null) {
            qzVar.l();
        }
        s4.p.c(new ig.h(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        sz szVar = this.F;
        ArrayList arrayList = szVar.n1;
        ArrayList arrayList2 = szVar.o1;
        int i11 = szVar.c1;
        ArrayList arrayList3 = szVar.q1;
        arrayList3.clear();
        if (szVar.c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i11).isPremium() || szVar.U0;
            TLRPC.ChatFull chatFull = szVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                ey eyVar = new ey();
                eyVar.b = szVar.J1.emojiset;
                eyVar.c = new ArrayList(groupStickerSetById.documents);
                eyVar.e = true;
                eyVar.f = true;
                eyVar.g = false;
                eyVar.h = true;
                eyVar.i = true;
                arrayList3.add(eyVar);
                TLRPC.StickerSet stickerSet2 = eyVar.b;
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
                        ey eyVar2 = new ey();
                        eyVar2.b = tL_messages_stickerSet2.set;
                        eyVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        eyVar2.e = true;
                        eyVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        eyVar2.g = false;
                        eyVar2.h = true;
                        arrayList3.add(eyVar2);
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
                    ey eyVar3 = new ey();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    eyVar3.b = stickerSet3;
                    eyVar3.c = tL_messages_stickerSet3.documents;
                    eyVar3.e = false;
                    eyVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    eyVar3.g = false;
                    eyVar3.h = z12;
                    arrayList3.add(eyVar3);
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
                        ey eyVar4 = new ey();
                        eyVar4.b = tL_messages_stickerSet3.set;
                        eyVar4.c = new ArrayList(arrayList5);
                        eyVar4.e = z12;
                        i10 = i14;
                        eyVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        eyVar4.g = false;
                        eyVar4.h = true;
                        arrayList3.add(eyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        ey eyVar5 = new ey();
                        eyVar5.b = tL_messages_stickerSet3.set;
                        eyVar5.c = new ArrayList(arrayList6);
                        eyVar5.e = false;
                        eyVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        eyVar5.g = false;
                        eyVar5.h = arrayList2.contains(Long.valueOf(eyVar5.b.id));
                        arrayList3.add(eyVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ey eyVar6 = new ey();
                eyVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                eyVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    eyVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        eyVar6.c = stickerSet5.documents;
                    } else {
                        eyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    eyVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = eyVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= eyVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) eyVar6.c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    eyVar6.e = !z11;
                    eyVar6.h = arrayList2.contains(Long.valueOf(eyVar6.b.id));
                    eyVar6.g = true;
                    arrayList3.add(eyVar6);
                }
            }
            ux uxVar = szVar.I;
            if (uxVar != null) {
                uxVar.p(szVar.getEmojipacks());
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
        ux uxVar;
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
        sz szVar = this.F;
        boolean z12 = szVar.d0;
        ArrayList arrayList3 = szVar.q1;
        ArrayList arrayList4 = szVar.n1;
        int i16 = szVar.c1;
        Object[] objArr = UserConfig.getInstance(i16).isPremium() || szVar.U0;
        if (z12) {
            this.y++;
            arrayList2.add(-1);
        }
        int i17 = 3;
        if (!objArr == true || !szVar.c2 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null) {
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
                recentEmoji = szVar.getRecentEmoji();
                uxVar = szVar.I;
                if (uxVar != null) {
                    boolean isEmpty = recentEmoji.isEmpty();
                    boolean z13 = !isEmpty;
                    gw gwVar = uxVar.y;
                    if (uxVar.W != z13) {
                        uxVar.W = z13;
                        if (uxVar.V) {
                            gwVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                        } else {
                            gwVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(ds.h).start();
                        }
                        if (!isEmpty || uxVar.M != 0) {
                            z10 = isEmpty ? true : true;
                            uxVar.b.requestLayout();
                            uxVar.V = false;
                        }
                        uxVar.j(0, uxVar.V ^ z10);
                        uxVar.b.requestLayout();
                        uxVar.V = false;
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
                int i20 = szVar.Q.J * 3;
                this.E = this.y;
                this.e = -1;
                if (arrayList3 == null) {
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        sparseIntArray.put(this.y, i14);
                        sparseIntArray2.put(i14, this.y);
                        arrayList.add(Integer.valueOf(this.y));
                        ey eyVar = (ey) arrayList3.get(i21);
                        boolean z14 = eyVar.g;
                        if (z14 && this.e < 0) {
                            this.e = this.y;
                        }
                        int size = ((eyVar.f && !z14 && (eyVar.e || objArr == true)) || eyVar.h) ? eyVar.c.size() : Math.min(i20, eyVar.c.size());
                        int i22 = 1 + size;
                        boolean z15 = z11;
                        if (eyVar.h || eyVar.c.size() <= i20) {
                            size = i22;
                        }
                        Integer valueOf = Integer.valueOf(eyVar.g ? 56345 : -495231);
                        TLRPC.StickerSet stickerSet = eyVar.b;
                        int i23 = i12;
                        int i24 = size;
                        Long valueOf2 = Long.valueOf(stickerSet == null ? i21 : stickerSet.id);
                        Boolean valueOf3 = Boolean.valueOf(eyVar.i);
                        int i25 = i17;
                        SparseIntArray sparseIntArray4 = sparseIntArray;
                        Object[] objArr2 = new Object[i25];
                        objArr2[z15 ? 1 : 0] = valueOf;
                        objArr2[1] = valueOf2;
                        objArr2[i23] = valueOf3;
                        arrayList2.add(Integer.valueOf(Objects.hash(objArr2)));
                        int i26 = 1;
                        while (i26 < i24) {
                            Integer valueOf4 = Integer.valueOf(eyVar.g ? 3442 : -9964);
                            Long valueOf5 = Long.valueOf(((TLRPC.Document) eyVar.c.get(i26 - 1)).id);
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
                        if (eyVar.h || eyVar.c.size() <= i20) {
                            i15 = 2;
                        } else {
                            sparseIntArray3.put(this.y, i21);
                            Integer valueOf6 = Integer.valueOf(eyVar.g ? -65174 : 92242);
                            Long valueOf7 = Long.valueOf(eyVar.b.id);
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
        recentEmoji = szVar.getRecentEmoji();
        uxVar = szVar.I;
        if (uxVar != null) {
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
        int i202 = szVar.Q.J * 3;
        this.E = this.y;
        this.e = -1;
        if (arrayList3 == null) {
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
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        sz szVar = this.F;
        String[] strArr = szVar.a1;
        qx qxVar = szVar.Q;
        int i13 = szVar.c1;
        ArrayList arrayList = szVar.q1;
        int i14 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        ey eyVar = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i14 == 1) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.getClass();
                int i15 = sparseIntArray.get(i12);
                if (i12 == this.c) {
                    s8Var.b(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i12 == this.f) {
                    s8Var.a(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i15 < strArr.length) {
                        s8Var.a(0, strArr[i15]);
                        return;
                    }
                    try {
                        s8Var.a(0, ((ey) arrayList.get(i15 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        s8Var.a(0, "");
                        return;
                    }
                }
            }
            if (i14 != 5) {
                if (i14 != 6) {
                    return;
                }
                gy gyVar = (gy) view;
                int i16 = this.w.get(i12);
                int i17 = qxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    eyVar = (ey) arrayList.get(i16);
                }
                if (eyVar != null) {
                    gyVar.a.setText("+" + ((eyVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            iy iyVar = (iy) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            ey eyVar2 = (ey) arrayList.get(length);
            int i18 = length - 1;
            ey eyVar3 = i18 >= 0 ? (ey) arrayList.get(i18) : null;
            if (eyVar2 == null || !eyVar2.g || (eyVar3 != null && !eyVar3.e && eyVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z10 = false;
            }
            if (eyVar2 != null && eyVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(eyVar2.d, false);
                eyVar2.d = null;
            }
            tg.p0 p0Var = iyVar.r;
            if (eyVar2 == null) {
                return;
            }
            iyVar.w = eyVar2;
            iyVar.x = z10;
            iyVar.d.l(eyVar2.b.title, false);
            iyVar.e.setVisibility(eyVar2.i ? 0 : 8);
            if (!eyVar2.f || eyVar2.b.official) {
                p0Var.a(LocaleController.getString(R.string.Unlock), new hy(iyVar, 6), false);
            } else {
                p0Var.a(LocaleController.getString(R.string.Restore), new hy(iyVar, 5), false);
            }
            iyVar.a(false);
            return;
        }
        bz bzVar = (bz) view;
        bzVar.a = i12;
        bzVar.e = null;
        if (szVar.d0) {
            i12--;
        }
        if (this.f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = szVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = szVar.getRecentEmoji().get(i12);
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
                        str = sz.g(str4, str5);
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
                    ey eyVar4 = (ey) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((eyVar4.f && !eyVar4.g && (eyVar4.e || isPremium)) || eyVar4.h) ? eyVar4.c.size() : Math.min(i21, eyVar4.c.size());
                    int i23 = bzVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        bzVar.e = eyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) eyVar4.c.get(i11);
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
            bzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            bzVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            bzVar.a(null, z10);
            if (bzVar.getSpan() == null || bzVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    bzVar.setSpan(new c6(document, (Paint.FontMetricsInt) null));
                } else {
                    bzVar.setSpan(new c6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            bzVar.a(Emoji.getEmojiBigDrawable(str), z10);
            bzVar.setSpan(null);
        }
        bzVar.setTag(str2);
        bzVar.setContentDescription(str);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        sz szVar = this.F;
        if (i10 == 0) {
            view = new bz(szVar.getContext());
        } else if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(szVar.getContext(), true, false, szVar.Z1, szVar.i2);
            s8Var.setOnIconClickListener(new f0(this, 13));
            view = s8Var;
        } else if (i10 == 3) {
            view = new fy(szVar, szVar.getContext());
        } else if (i10 == 4) {
            Context context = szVar.getContext();
            qz qzVar = new qz(szVar, true);
            szVar.T = qzVar;
            bi.r1 r1Var = new bi.r1(szVar, context, qzVar);
            r1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            r1Var.setClipToPadding(false);
            r1Var.i(new di.l(3));
            r1Var.setOnItemClickListener(new j(this, 5));
            view = r1Var;
        } else if (i10 == 5) {
            view = new iy(szVar, szVar.getContext());
        } else if (i10 != 6) {
            View view2 = new View(szVar.getContext());
            view2.setLayoutParams(new s4.q0(-1, szVar.b1));
            view = view2;
        } else {
            Context context2 = szVar.getContext();
            org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
            gy gyVar = new gy(context2);
            TextView textView = new TextView(context2);
            gyVar.a = textView;
            textView.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.d6, u6Var);
            int dp = AndroidUtilities.dp(11.0f);
            int i11 = org.telegram.ui.ActionBar.y6.Te;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 99));
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 99);
            textView.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(textView, c02, h, null, u6Var);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
            gyVar.addView(textView, kb1.i(-2, -2, 17));
            view = gyVar;
        }
        return new wl0(view);
    }
}
