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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fx extends vk0 {
    public int A;
    public final /* synthetic */ wy B;
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

    public fx(wy wyVar) {
        this.B = wyVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 4 || i9 == 3 || i9 == 6;
    }

    public final void E(int i9, View view) {
        wy wyVar = this.B;
        ArrayList arrayList = wyVar.m1;
        int i10 = this.w.get(i9);
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        jx jxVar = (jx) arrayList.get(i10);
        if (jxVar.h) {
            return;
        }
        boolean z10 = i10 + 1 == arrayList.size();
        int intValue = ((Integer) this.x.get(i10)).intValue();
        wyVar.k1.add(Long.valueOf(jxVar.b.id));
        boolean z11 = UserConfig.getInstance(wyVar.Y0).isPremium() || wyVar.Q0;
        int i11 = wyVar.M.J * 3;
        int size = ((jxVar.f && !jxVar.g && (jxVar.e || z11)) || jxVar.h) ? jxVar.c.size() : Math.min(i11, jxVar.c.size());
        Integer num = null;
        Integer valueOf = jxVar.c.size() > i11 ? Integer.valueOf(intValue + 1 + size) : null;
        jxVar.h = true;
        int size2 = jxVar.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        wyVar.o2 = view;
        wyVar.p2 = valueOf.intValue();
        wyVar.q2 = num.intValue() + valueOf.intValue();
        wyVar.r2 = SystemClock.elapsedRealtime();
        s(valueOf.intValue(), num.intValue());
        m(valueOf.intValue());
        if (z10) {
            wyVar.post(new ex(this, num.intValue() > i11 / 2 ? 1.5f : 4.0f, valueOf.intValue(), 0));
        }
    }

    public final void F(boolean z10) {
        wy wyVar = this.B;
        ArrayList arrayList = wyVar.j1;
        if (wyVar.J2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        MediaDataController mediaDataController = MediaDataController.getInstance(wyVar.Y0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i9);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || wyVar.l1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        uy uyVar = wyVar.P;
        if (uyVar != null) {
            uyVar.l();
        }
        f2.s.c(new of.g(this, arrayList2, 1), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        int i9;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        wy wyVar = this.B;
        ArrayList arrayList = wyVar.j1;
        ArrayList arrayList2 = wyVar.k1;
        int i10 = wyVar.Y0;
        ArrayList arrayList3 = wyVar.m1;
        arrayList3.clear();
        if (wyVar.Y1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            boolean z13 = UserConfig.getInstance(i10).isPremium() || wyVar.Q0;
            TLRPC.ChatFull chatFull = wyVar.F1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                jx jxVar = new jx();
                jxVar.b = wyVar.F1.emojiset;
                jxVar.c = new ArrayList(groupStickerSetById.documents);
                jxVar.e = true;
                jxVar.f = true;
                jxVar.g = false;
                jxVar.h = true;
                jxVar.i = true;
                arrayList3.add(jxVar);
                TLRPC.StickerSet stickerSet2 = jxVar.b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                        arrayList4.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (!z13) {
                int i12 = 0;
                while (i12 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        jx jxVar2 = new jx();
                        jxVar2.b = tL_messages_stickerSet2.set;
                        jxVar2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        jxVar2.e = true;
                        jxVar2.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                        jxVar2.g = false;
                        jxVar2.h = true;
                        arrayList3.add(jxVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            int i13 = 0;
            while (i13 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z13) {
                    jx jxVar3 = new jx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    jxVar3.b = stickerSet3;
                    jxVar3.c = tL_messages_stickerSet3.documents;
                    jxVar3.e = false;
                    jxVar3.f = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                    jxVar3.g = false;
                    jxVar3.h = z12;
                    arrayList3.add(jxVar3);
                    i9 = i13;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        jx jxVar4 = new jx();
                        jxVar4.b = tL_messages_stickerSet3.set;
                        jxVar4.c = new ArrayList(arrayList5);
                        jxVar4.e = z12;
                        i9 = i13;
                        jxVar4.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        jxVar4.g = false;
                        jxVar4.h = true;
                        arrayList3.add(jxVar4);
                    } else {
                        i9 = i13;
                    }
                    if (arrayList6.size() > 0) {
                        jx jxVar5 = new jx();
                        jxVar5.b = tL_messages_stickerSet3.set;
                        jxVar5.c = new ArrayList(arrayList6);
                        jxVar5.e = false;
                        jxVar5.f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                        jxVar5.g = false;
                        jxVar5.h = arrayList2.contains(Long.valueOf(jxVar5.b.id));
                        arrayList3.add(jxVar5);
                    }
                }
                i13 = i9 + 1;
                z12 = true;
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                jx jxVar6 = new jx();
                jxVar6.f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                jxVar6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    jxVar6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        jxVar6.c = stickerSet5.documents;
                    } else {
                        jxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    jxVar6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = jxVar6.c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= jxVar6.c.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) jxVar6.c.get(i16))) {
                                z11 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    jxVar6.e = !z11;
                    jxVar6.h = arrayList2.contains(Long.valueOf(jxVar6.b.id));
                    jxVar6.g = true;
                    arrayList3.add(jxVar6);
                }
            }
            vv vvVar = wyVar.E;
            if (vvVar != null) {
                vvVar.p(wyVar.getEmojipacks());
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
        wy wyVar = this.B;
        boolean z11 = wyVar.W;
        ArrayList arrayList3 = wyVar.m1;
        ArrayList arrayList4 = wyVar.j1;
        int i9 = wyVar.Y0;
        boolean z12 = UserConfig.getInstance(i9).isPremium() || wyVar.Q0;
        if (z11) {
            this.y++;
            arrayList2.add(-1);
        }
        if (!z12 || !wyVar.Y1 || arrayList4.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList4.get(0)).set == null || MessagesController.getEmojiSettings(i9).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id || !z11) {
            this.c = -1;
            this.d = -1;
            this.f = -1;
        } else {
            int i10 = this.y;
            this.c = i10;
            this.d = i10 + 1;
            this.y = i10 + 3;
            this.f = i10 + 2;
            arrayList2.add(324953);
            arrayList2.add(123342);
            arrayList2.add(929132);
        }
        ArrayList<String> recentEmoji = wyVar.getRecentEmoji();
        vv vvVar = wyVar.E;
        if (vvVar != null) {
            boolean isEmpty = recentEmoji.isEmpty();
            boolean z13 = !isEmpty;
            jv jvVar = vvVar.y;
            if (vvVar.S != z13) {
                vvVar.S = z13;
                if (vvVar.R) {
                    jvVar.setAlpha(isEmpty ? 0.0f : 1.0f);
                } else {
                    jvVar.animate().alpha(isEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(gr.h).start();
                }
                if (!isEmpty || vvVar.I != 0) {
                    z10 = isEmpty ? true : true;
                    vvVar.b.requestLayout();
                    vvVar.R = false;
                }
                vvVar.j(0, vvVar.R ^ z10);
                vvVar.b.requestLayout();
                vvVar.R = false;
            }
        }
        this.y = recentEmoji.size() + this.y;
        for (int i11 = 0; i11 < recentEmoji.size(); i11++) {
            arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i11))));
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            String[][] strArr = EmojiData.dataColored;
            if (i12 >= strArr.length) {
                break;
            }
            sparseIntArray.put(this.y, i13);
            sparseIntArray2.put(i13, this.y);
            this.y = strArr[i12].length + 1 + this.y;
            arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i12))));
            int i14 = 0;
            while (true) {
                String[] strArr2 = EmojiData.dataColored[i12];
                if (i14 < strArr2.length) {
                    arrayList2.add(Integer.valueOf(strArr2[i14].hashCode()));
                    i14++;
                }
            }
            i12++;
            i13++;
        }
        int i15 = wyVar.M.J * 3;
        this.A = this.y;
        this.e = -1;
        if (arrayList3 != null) {
            int i16 = 0;
            while (i16 < arrayList3.size()) {
                sparseIntArray.put(this.y, i13);
                sparseIntArray2.put(i13, this.y);
                arrayList.add(Integer.valueOf(this.y));
                jx jxVar = (jx) arrayList3.get(i16);
                boolean z14 = jxVar.g;
                if (z14 && this.e < 0) {
                    this.e = this.y;
                }
                int size = ((jxVar.f && !z14 && (jxVar.e || z12)) || jxVar.h) ? jxVar.c.size() : Math.min(i15, jxVar.c.size());
                int i17 = 1 + size;
                if (jxVar.h || jxVar.c.size() <= i15) {
                    size = i17;
                }
                Integer valueOf = Integer.valueOf(jxVar.g ? 56345 : -495231);
                TLRPC.StickerSet stickerSet = jxVar.b;
                int i18 = size;
                SparseIntArray sparseIntArray4 = sparseIntArray;
                arrayList2.add(Integer.valueOf(Objects.hash(valueOf, Long.valueOf(stickerSet == null ? i16 : stickerSet.id), Boolean.valueOf(jxVar.i))));
                int i19 = 1;
                while (i19 < i18) {
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(jxVar.g ? 3442 : -9964), Long.valueOf(((TLRPC.Document) jxVar.c.get(i19 - 1)).id))));
                    i19++;
                    sparseIntArray2 = sparseIntArray2;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray2;
                this.y += i18;
                if (!jxVar.h && jxVar.c.size() > i15) {
                    sparseIntArray3.put(this.y, i16);
                    arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(jxVar.g ? -65174 : 92242), Long.valueOf(jxVar.b.id))));
                    this.y++;
                }
                i16++;
                i13++;
                sparseIntArray2 = sparseIntArray5;
                sparseIntArray = sparseIntArray4;
            }
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.y;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == this.d) {
            return 4;
        }
        if (i9 == this.c || i9 == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i9) >= 0) {
            return sparseIntArray.get(i9) >= EmojiData.dataColored.length ? 5 : 1;
        }
        if (this.B.W && i9 == 0) {
            return 2;
        }
        if (this.v.indexOfKey(i9) >= 0) {
            return 3;
        }
        return this.w.indexOfKey(i9) >= 0 ? 6 : 0;
    }

    @Override // f2.r0
    public final void l() {
        F(false);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int i10;
        int i11 = i9;
        wy wyVar = this.B;
        String[] strArr = wyVar.W0;
        xw xwVar = wyVar.M;
        int i12 = wyVar.Y0;
        ArrayList arrayList = wyVar.m1;
        int i13 = q1Var.f;
        View view = q1Var.a;
        boolean z10 = true;
        jx jxVar = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i13 == 1) {
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.getClass();
                int i14 = sparseIntArray.get(i11);
                if (i11 == this.c) {
                    m8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                    return;
                }
                if (i11 == this.f) {
                    m8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                    return;
                } else {
                    if (i14 < strArr.length) {
                        m8Var.b(0, strArr[i14]);
                        return;
                    }
                    try {
                        m8Var.b(0, ((jx) arrayList.get(i14 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        m8Var.b(0, "");
                        return;
                    }
                }
            }
            if (i13 != 5) {
                if (i13 != 6) {
                    return;
                }
                lx lxVar = (lx) view;
                int i15 = this.w.get(i11);
                int i16 = xwVar.J * 3;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    jxVar = (jx) arrayList.get(i15);
                }
                if (jxVar != null) {
                    lxVar.a.setText("+" + ((jxVar.c.size() - i16) + 1));
                    return;
                }
                return;
            }
            nx nxVar = (nx) view;
            int length = sparseIntArray.get(i11) - strArr.length;
            jx jxVar2 = (jx) arrayList.get(length);
            int i17 = length - 1;
            jx jxVar3 = i17 >= 0 ? (jx) arrayList.get(i17) : null;
            if (jxVar2 == null || !jxVar2.g || (jxVar3 != null && !jxVar3.e && jxVar3.f && !UserConfig.getInstance(i12).isPremium())) {
                z10 = false;
            }
            if (jxVar2 != null && jxVar2.d != null) {
                MediaDataController.getInstance(i12).getStickerSet(jxVar2.d, false);
                jxVar2.d = null;
            }
            zf.p0 p0Var = nxVar.h;
            if (jxVar2 == null) {
                return;
            }
            nxVar.s = jxVar2;
            nxVar.v = z10;
            nxVar.b.l(jxVar2.b.title, false);
            nxVar.c.setVisibility(jxVar2.i ? 0 : 8);
            if (!jxVar2.f || jxVar2.b.official) {
                p0Var.a(LocaleController.getString(R.string.Unlock), new mx(nxVar, 6), false);
            } else {
                p0Var.a(LocaleController.getString(R.string.Restore), new mx(nxVar, 5), false);
            }
            nxVar.a(false);
            return;
        }
        fy fyVar = (fy) view;
        fyVar.a = i11;
        fyVar.e = null;
        if (wyVar.W) {
            i11--;
        }
        if (this.f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = wyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = wyVar.getRecentEmoji().get(i11);
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
            int i18 = 0;
            while (true) {
                String[][] strArr2 = EmojiData.dataColored;
                if (i18 >= strArr2.length) {
                    str = null;
                    break;
                }
                String[] strArr3 = strArr2[i18];
                int length2 = strArr3.length + 1;
                int i19 = (i11 - size) - 1;
                if (i19 < 0 || i11 >= size + length2) {
                    size += length2;
                    i18++;
                } else {
                    String str4 = strArr3[i19];
                    String str5 = Emoji.emojiColor.get(str4);
                    if (str5 != null) {
                        str = wy.g(str4, str5);
                        str2 = str4;
                    } else {
                        str = str4;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i12).isPremium();
                int i20 = xwVar.J * 3;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList2 = this.x;
                    if (i21 >= arrayList2.size()) {
                        break;
                    }
                    jx jxVar4 = (jx) arrayList.get(i21);
                    int intValue = ((Integer) arrayList2.get(i21)).intValue() + 1;
                    int size2 = ((jxVar4.f && !jxVar4.g && (jxVar4.e || isPremium)) || jxVar4.h) ? jxVar4.c.size() : Math.min(i20, jxVar4.c.size());
                    int i22 = fyVar.a;
                    if (i22 < intValue || (i10 = i22 - intValue) >= size2) {
                        i21++;
                    } else {
                        fyVar.e = jxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) jxVar4.c.get(i10);
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
            fyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            fyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            fyVar.a(null, z10);
            if (fyVar.getSpan() == null || fyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    fyVar.setSpan(new t5(document, (Paint.FontMetricsInt) null));
                } else {
                    fyVar.setSpan(new t5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            fyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            fyVar.setSpan(null);
        }
        fyVar.setTag(str2);
        fyVar.setContentDescription(str);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        wy wyVar = this.B;
        org.telegram.ui.ActionBar.b6 b6Var = wyVar.V1;
        if (i9 == 0) {
            view = new fy(wyVar.getContext());
        } else if (i9 == 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(wyVar.getContext(), true, false, wyVar.V1, wyVar.e2);
            m8Var.setOnIconClickListener(new f0(this, 14));
            view = m8Var;
        } else if (i9 != 3) {
            int i10 = 5;
            if (i9 == 4) {
                Context context = wyVar.getContext();
                uy uyVar = new uy(wyVar, true);
                wyVar.P = uyVar;
                gh.f1 f1Var = new gh.f1(wyVar, context, uyVar);
                f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                f1Var.setClipToPadding(false);
                f1Var.i(new ih.l(2));
                f1Var.setOnItemClickListener(new j(this, i10));
                view = f1Var;
            } else if (i9 == 5) {
                view = new nx(wyVar, wyVar.getContext());
            } else if (i9 != 6) {
                View view2 = new View(wyVar.getContext());
                view2.setLayoutParams(new f2.a1(-1, wyVar.X0));
                view = view2;
            } else {
                Context context2 = wyVar.getContext();
                lx lxVar = new lx(context2);
                TextView textView = new TextView(context2);
                lxVar.a = textView;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var), 99)));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                lxVar.addView(textView, g7.e6.e(-2, -2, 17));
                view = lxVar;
            }
        } else {
            kx kxVar = new kx(wyVar.getContext());
            j6 j6Var = new j6(kxVar.getContext(), false, false, false);
            j6Var.b(0.3f, 250L, gr.h);
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.Sh));
            j6Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(kxVar.getContext());
            frameLayout.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{8.0f}, wyVar.z(org.telegram.ui.ActionBar.f6.Oh)));
            frameLayout.addView(j6Var, g7.e6.e(-1, -2, 17));
            kxVar.addView(frameLayout, g7.e6.c(-1.0f, -1));
            zf.p0 p0Var = new zf.p0(kxVar.getContext(), b6Var, false);
            p0Var.setIcon(R.raw.unlock_icon);
            kxVar.addView(p0Var, g7.e6.c(-1.0f, -1));
            view = kxVar;
        }
        return new ik0(view);
    }
}
