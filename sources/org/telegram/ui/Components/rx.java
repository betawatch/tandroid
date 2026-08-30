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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rx extends rl0 {
    public int B;
    public final /* synthetic */ kz C;
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

    public rx(kz kzVar) {
        this.C = kzVar;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6;
    }

    public final void E(int i10, View view) {
        kz kzVar = this.C;
        ArrayList arrayList = kzVar.n1;
        int i11 = this.w.get(i10);
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        vx vxVar = (vx) arrayList.get(i11);
        if (vxVar.h) {
            return;
        }
        boolean z4 = i11 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i11)).intValue();
        kzVar.l1.add(Long.valueOf(vxVar.b.id));
        boolean z10 = UserConfig.getInstance(kzVar.Z0).isPremium() || kzVar.R0;
        int i12 = kzVar.N.J * 3;
        int size = ((vxVar.f && !vxVar.g && (vxVar.e || z10)) || vxVar.h) ? vxVar.c.size() : Math.min(i12, vxVar.c.size());
        Integer num = null;
        Integer valueOf = vxVar.c.size() > i12 ? Integer.valueOf(intValue + 1 + size) : null;
        vxVar.h = true;
        int size2 = vxVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        kzVar.p2 = view;
        kzVar.q2 = valueOf.intValue();
        kzVar.r2 = num.intValue() + valueOf.intValue();
        kzVar.s2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z4) {
            kzVar.post(new qx(this, num.intValue() > i12 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z4) {
        kz kzVar = this.C;
        ArrayList arrayList = kzVar.k1;
        if (kzVar.K2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.Z0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || kzVar.m1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z4);
        H();
        iz izVar = kzVar.Q;
        if (izVar != null) {
            izVar.l();
        }
        f2.q.c(new bg.a(this, arrayList2, 1), false).b(this);
    }

    public final void G(boolean z4) {
        boolean z10;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        kz kzVar = this.C;
        ArrayList arrayList = kzVar.k1;
        ArrayList arrayList2 = kzVar.l1;
        int i11 = kzVar.Z0;
        ArrayList arrayList3 = kzVar.n1;
        arrayList3.clear();
        if (kzVar.Z1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z4 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z11 = true;
            boolean z12 = UserConfig.getInstance(i11).isPremium() || kzVar.R0;
            TLRPC.ChatFull chatFull = kzVar.G1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                vx vxVar = new vx();
                vxVar.b = kzVar.G1.emojiset;
                vxVar.c = new ArrayList(groupStickerSetById.documents);
                vxVar.e = true;
                vxVar.f = true;
                vxVar.g = false;
                vxVar.h = true;
                vxVar.i = true;
                arrayList3.add(vxVar);
                TLRPC.StickerSet stickerSet2 = vxVar.b;
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
                        vx vxVar2 = new vx();
                        vxVar2.b = tL_messages_stickerSet2.set;
                        vxVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        vxVar2.e = true;
                        vxVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        vxVar2.g = false;
                        vxVar2.h = true;
                        arrayList3.add(vxVar2);
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
                    vx vxVar3 = new vx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    vxVar3.b = stickerSet3;
                    vxVar3.c = tL_messages_stickerSet3.documents;
                    vxVar3.e = false;
                    vxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    vxVar3.g = false;
                    vxVar3.h = z11;
                    arrayList3.add(vxVar3);
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
                        vx vxVar4 = new vx();
                        vxVar4.b = tL_messages_stickerSet3.set;
                        vxVar4.c = new ArrayList(arrayList5);
                        vxVar4.e = z11;
                        i10 = i14;
                        vxVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        vxVar4.g = false;
                        vxVar4.h = true;
                        arrayList3.add(vxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        vx vxVar5 = new vx();
                        vxVar5.b = tL_messages_stickerSet3.set;
                        vxVar5.c = new ArrayList(arrayList6);
                        vxVar5.e = false;
                        vxVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        vxVar5.g = false;
                        vxVar5.h = arrayList2.contains(Long.valueOf(vxVar5.b.id));
                        arrayList3.add(vxVar5);
                    }
                }
                i14 = i10 + 1;
                z11 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                vx vxVar6 = new vx();
                vxVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                vxVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    vxVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        vxVar6.c = stickerSet5.documents;
                    } else {
                        vxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    vxVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = vxVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= vxVar6.c.size()) {
                            z10 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) vxVar6.c.get(i17))) {
                                z10 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    vxVar6.e = !z10;
                    vxVar6.h = arrayList2.contains(Long.valueOf(vxVar6.b.id));
                    vxVar6.g = true;
                    arrayList3.add(vxVar6);
                }
            }
            fw fwVar = kzVar.F;
            if (fwVar != null) {
                fwVar.p(kzVar.getEmojipacks());
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
        kz kzVar = this.C;
        boolean z10 = kzVar.a0;
        ArrayList arrayList3 = kzVar.n1;
        ArrayList arrayList4 = kzVar.k1;
        int i10 = kzVar.Z0;
        boolean z11 = UserConfig.getInstance(i10).isPremium() || kzVar.R0;
        if (z10) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z11 || !kzVar.Z1 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i10).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z10) {
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
        fw fwVar = kzVar.F;
        if (fwVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z12 = !isEmpty;
            tv tvVar = fwVar.y;
            if (fwVar.T != z12) {
                fwVar.T = z12;
                if (fwVar.S) {
                    tvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    tvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(nr.h).start();
                }
                if (!isEmpty || fwVar.J != 0) {
                    z4 = isEmpty ? true : true;
                    fwVar.b.requestLayout();
                    fwVar.S = false;
                }
                fwVar.j(0, fwVar.S ^ z4);
                fwVar.b.requestLayout();
                fwVar.S = false;
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
        int i16 = kzVar.N.J * 3;
        this.B = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i17 = 0;
            while (i17 < arrayList3.size()) {
                sparseIntArray.put(this.y, i14);
                sparseIntArray2.put(i14, this.y);
                arrayList.add(Integer.valueOf(this.y));
                vx vxVar = (vx) arrayList3.get(i17);
                boolean z13 = vxVar.g;
                if (z13 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((vxVar.f && !z13 && (vxVar.e || z11)) || vxVar.h) ? vxVar.c.size() : Math.min(i16, vxVar.c.size());
                int i18 = 1 + size;
                if (vxVar.h || vxVar.c.size() <= i16) {
                    size = i18;
                }
                Integer valueOf = Integer.valueOf(vxVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = vxVar.b;
                int i19 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i17 : stickerSet.id), Boolean.valueOf(vxVar.i))));
                int i20 = 1;
                while (i20 < i19) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(vxVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) vxVar.c.get(i20 - 1)).id))));
                    i20++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i19;
                if (!vxVar.h && vxVar.c.size() > i16) {
                    sparseIntArray3.put(this.y, i17);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(vxVar.g ? -65174 : 92242), Long.valueOf(vxVar.b.id))));
                    this.y++;
                }
                i17++;
                i14++;
                sparseIntArray2 = sparseIntArray5;
                sparseIntArray = sparseIntArray4;
            }
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.y;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void l() {
        F(false);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i11;
        int i12 = i10;
        kz kzVar = this.C;
        String[] strArr = kzVar.X0;
        jx jxVar = kzVar.N;
        int i13 = kzVar.Z0;
        ArrayList arrayList = kzVar.n1;
        int i14 = l1Var.f;
        View view = l1Var.a;
        boolean z4 = true;
        vx vxVar = null;
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
                        m8Var.b(0, ((vx) arrayList.get(i15 - strArr.length)).b.title);
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
                xx xxVar = (xx) view;
                int i16 = this.w.get(i12);
                int i17 = jxVar.J * 3;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    vxVar = (vx) arrayList.get(i16);
                }
                if (vxVar != null) {
                    xxVar.a.setText("+" + ((vxVar.c.size() - i17) + 1));
                    return;
                }
                return;
            }
            zx zxVar = (zx) view;
            int length = sparseIntArray.get(i12) - strArr.length;
            vx vxVar2 = (vx) arrayList.get(length);
            int i18 = length - 1;
            vx vxVar3 = i18 >= 0 ? (vx) arrayList.get(i18) : null;
            if (vxVar2 == null || !vxVar2.g || (vxVar3 != null && !vxVar3.e && vxVar3.f && !UserConfig.getInstance(i13).isPremium())) {
                z4 = false;
            }
            if (vxVar2 != null && vxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(vxVar2.d, false);
                vxVar2.d = null;
            }
            eg.c1 c1Var = zxVar.h;
            if (vxVar2 == null) {
                return;
            }
            zxVar.s = vxVar2;
            zxVar.v = z4;
            zxVar.b.l(vxVar2.b.title, false);
            zxVar.c.setVisibility(vxVar2.i ? 0 : 8);
            if (!vxVar2.f || vxVar2.b.official) {
                c1Var.a(LocaleController.getString(R.string.Unlock), new yx(zxVar, 6), false);
            } else {
                c1Var.a(LocaleController.getString(R.string.Restore), new yx(zxVar, 5), false);
            }
            zxVar.a(false);
            return;
        }
        sy syVar = (sy) view;
        syVar.a = i12;
        syVar.e = null;
        if (kzVar.a0) {
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
                int i21 = jxVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    vx vxVar4 = (vx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    int size2 = ((vxVar4.f && !vxVar4.g && (vxVar4.e || isPremium)) || vxVar4.h) ? vxVar4.c.size() : Math.min(i21, vxVar4.c.size());
                    int i23 = syVar.a;
                    if (i23 < intValue || (i11 = i23 - intValue) >= size2) {
                        i22++;
                    } else {
                        syVar.e = vxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) vxVar4.c.get(i11);
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
            syVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            syVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            syVar.a(null, z4);
            if (syVar.getSpan() == null || syVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    syVar.setSpan(new u5(document, (Paint.FontMetricsInt) null));
                } else {
                    syVar.setSpan(new u5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            syVar.a(Emoji.getEmojiBigDrawable(str), z4);
            syVar.setSpan(null);
        }
        syVar.setTag(str2);
        syVar.setContentDescription(str);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        kz kzVar = this.C;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.W1;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 == 1) {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(kzVar.getContext(), true, false, kzVar.W1, kzVar.f2);
                m8Var.setOnIconClickListener(new g0(this, 14));
                view = m8Var;
            } else if (i10 != 3) {
                int i12 = 5;
                if (i10 == 4) {
                    Context context = kzVar.getContext();
                    iz izVar = new iz(kzVar, true);
                    kzVar.Q = izVar;
                    lh.e1 e1Var = new lh.e1(kzVar, context, izVar);
                    e1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    e1Var.setClipToPadding(false);
                    e1Var.i(new nh.k(i11));
                    e1Var.setOnItemClickListener(new k(this, i12));
                    view = e1Var;
                } else if (i10 == 5) {
                    view = new zx(kzVar, kzVar.getContext());
                } else if (i10 != 6) {
                    View view2 = new View(kzVar.getContext());
                    view2.setLayoutParams(new f2.w0(-1, kzVar.Y0));
                    view = view2;
                } else {
                    Context context2 = kzVar.getContext();
                    xx xxVar = new xx(context2);
                    TextView textView = new TextView(context2);
                    xxVar.a = textView;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var), 99)));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                    xxVar.addView(textView, k7.b6.e(-2, -2, 17));
                    view = xxVar;
                }
            } else {
                wx wxVar = new wx(kzVar.getContext());
                k6 k6Var = new k6(wxVar.getContext(), false, false, false);
                k6Var.b(0.3f, 250L, nr.h);
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Sh));
                k6Var.setGravity(17);
                FrameLayout frameLayout = new FrameLayout(wxVar.getContext());
                frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, kzVar.A(org.telegram.ui.ActionBar.j6.Oh)));
                frameLayout.addView(k6Var, k7.b6.e(-1, -2, 17));
                wxVar.addView(frameLayout, k7.b6.c(-1.0f, -1));
                eg.c1 c1Var = new eg.c1(wxVar.getContext(), f6Var, false);
                c1Var.setIcon(R.raw.unlock_icon);
                wxVar.addView(c1Var, k7.b6.c(-1.0f, -1));
                view = wxVar;
            }
        } else {
            view = new sy(kzVar.getContext());
        }
        return new el0(view);
    }
}
