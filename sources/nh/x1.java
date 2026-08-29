package nh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x1 extends f2.p0 {
    public final TLRPC.TL_inputStickerSetShortName A;
    public TLRPC.TL_messages_stickerSet B;
    public TLRPC.TL_messages_stickerSet C;
    public String D;
    public String E;
    public String[] F;
    public int G;
    public final /* synthetic */ y1 J;
    public int c;
    public boolean w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int x = 0;
    public final SparseIntArray y = new SparseIntArray();
    public final HashSet H = new HashSet();
    public final lh.m5 I = new lh.m5(this, 23);

    public x1(y1 y1Var) {
        this.J = y1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.A = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        int i10;
        y1 y1Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        y1 y1Var2;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12;
        y1 y1Var3;
        HashMap hashMap;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        y1 y1Var4 = this.J;
        w1 w1Var = y1Var4.e;
        k2 k2Var = y1Var4.s;
        this.D = str;
        lh.m5 m5Var = this.I;
        int i16 = 1;
        if (str != null) {
            y1Var4.f.c(true);
            w1Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(m5Var);
            AndroidUtilities.runOnUIThread(m5Var, 100L);
            return;
        }
        w1Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(m5Var);
        i10 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        this.x = 0;
        ArrayList arrayList3 = this.s;
        arrayList3.clear();
        this.v.clear();
        SparseIntArray sparseIntArray = this.y;
        sparseIntArray.clear();
        ArrayList arrayList4 = this.n;
        arrayList4.clear();
        ArrayList arrayList5 = this.h;
        arrayList5.clear();
        HashMap hashMap2 = this.f;
        hashMap2.clear();
        this.x++;
        boolean z10 = false;
        arrayList3.add(null);
        ArrayList arrayList6 = this.r;
        arrayList6.clear();
        if (y1Var4.a == 1) {
            if (k2Var.B != null && (k2Var.m0(0) || k2Var.m0(1) || k2Var.m0(2) || k2Var.m0(3) || k2Var.m0(4))) {
                arrayList3.add(k2Var.d);
                this.x++;
            }
            ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(2);
            if (recentStickers != null && !recentStickers.isEmpty()) {
                if (this.B == null) {
                    this.B = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.B;
                tL_messages_stickerSet2.documents = recentStickers;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.B.set.title = LocaleController.getString(R.string.FavoriteStickers);
                arrayList4.add(this.B);
            }
            ArrayList<TLRPC.Document> recentStickers2 = mediaDataController.getRecentStickers(0);
            if (recentStickers2 != null && !recentStickers2.isEmpty()) {
                if (this.C == null) {
                    this.C = new TLRPC.TL_messages_stickerSet();
                }
                this.C.documents = recentStickers2;
                if (k2Var.A != null) {
                    recentStickers2.add(0, k2Var.e);
                }
                this.C.set = new TLRPC.TL_stickerSet();
                this.C.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.C);
            }
        }
        arrayList4.addAll(mediaDataController.getStickerSets(y1Var4.a == 0 ? 5 : 0));
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i17);
            sparseIntArray.put(this.x, i17);
            arrayList3.add(z10);
            this.x += i16;
            arrayList3.addAll(tL_messages_stickerSet3.documents);
            this.x = tL_messages_stickerSet3.documents.size() + this.x;
            String str2 = tL_messages_stickerSet3 == this.C ? "recent" : tL_messages_stickerSet3 == this.B ? "fav" : tL_messages_stickerSet3;
            int i18 = 0;
            while (i18 < tL_messages_stickerSet3.documents.size()) {
                hashMap2.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i18).id), str2);
                i18++;
                k2Var = k2Var;
                w1Var = w1Var;
            }
            w1 w1Var2 = w1Var;
            k2 k2Var2 = k2Var;
            rx rxVar = new rx();
            rxVar.c = tL_messages_stickerSet3.documents;
            rxVar.b = tL_messages_stickerSet3.set;
            rxVar.f = true;
            rxVar.g = false;
            rxVar.h = true;
            rxVar.e = true;
            if (tL_messages_stickerSet3 == this.B) {
                rxVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.C) {
                rxVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(rxVar);
            arrayList5.add(tL_messages_stickerSet3);
            i17++;
            k2Var = k2Var2;
            w1Var = w1Var2;
            i16 = 1;
            z10 = false;
        }
        w1 w1Var3 = w1Var;
        k2 k2Var3 = k2Var;
        if (y1Var4.a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i19 = 0;
                while (i19 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        i15 = ((org.telegram.ui.ActionBar.f3) k2Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            y1Var2 = y1Var4;
                            arrayList = featuredEmojiSets;
                            i11 = i19;
                            if (tL_messages_stickerSet.set == null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((rx) arrayList6.get(i20)).b;
                                        if (stickerSet2 != null) {
                                            i14 = i20;
                                            if (stickerSet2.id == tL_messages_stickerSet.set.id) {
                                                break;
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        i20 = i14 + 1;
                                    } else {
                                        arrayList4.add(tL_messages_stickerSet);
                                        arrayList5.add(tL_messages_stickerSet);
                                        sparseIntArray.put(this.x, i17);
                                        i17++;
                                        arrayList3.add(null);
                                        this.x++;
                                        arrayList3.addAll(tL_messages_stickerSet.documents);
                                        this.x = tL_messages_stickerSet.documents.size() + this.x;
                                        for (int i21 = 0; i21 < tL_messages_stickerSet.documents.size(); i21++) {
                                            hashMap2.put(Long.valueOf(tL_messages_stickerSet.documents.get(i21).id), tL_messages_stickerSet);
                                        }
                                        rx rxVar2 = new rx();
                                        rxVar2.c = tL_messages_stickerSet.documents;
                                        rxVar2.b = tL_messages_stickerSet.set;
                                        rxVar2.f = false;
                                        rxVar2.g = true;
                                        rxVar2.h = true;
                                        rxVar2.e = true;
                                        arrayList6.add(rxVar2);
                                    }
                                }
                            }
                        }
                        y1Var2 = y1Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    } else {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                            tL_messages_stickerSet4.set = stickerSet3;
                            tL_messages_stickerSet4.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList<TLRPC.StickerSetCovered> arrayList7 = featuredEmojiSets;
                            int i22 = i19;
                            Long valueOf = Long.valueOf(stickerSet3.id);
                            HashMap hashMap3 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList8 = (ArrayList) hashMap3.get(valueOf);
                            tL_messages_stickerSet4.packs = arrayList8;
                            if (arrayList8 == null) {
                                HashMap hashMap4 = new HashMap();
                                arrayList = arrayList7;
                                int i23 = 0;
                                while (i23 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i23);
                                    if (document == null) {
                                        y1Var3 = y1Var4;
                                        hashMap = hashMap4;
                                        i12 = i23;
                                    } else {
                                        i12 = i23;
                                        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                        y1Var3 = y1Var4;
                                        if (parseEmojis != null) {
                                            i13 = i22;
                                            int i24 = 0;
                                            while (i24 < parseEmojis.size()) {
                                                String charSequence = parseEmojis.get(i24).code.toString();
                                                ArrayList arrayList9 = (ArrayList) hashMap4.get(charSequence);
                                                ArrayList<Emoji.EmojiSpanRange> arrayList10 = parseEmojis;
                                                if (arrayList9 == null) {
                                                    arrayList2 = new ArrayList();
                                                    hashMap4.put(charSequence, arrayList2);
                                                } else {
                                                    arrayList2 = arrayList9;
                                                }
                                                HashMap hashMap5 = hashMap4;
                                                i24 = a4.w.g(document.id, arrayList2, i24, 1);
                                                hashMap4 = hashMap5;
                                                parseEmojis = arrayList10;
                                                document = document;
                                            }
                                            hashMap = hashMap4;
                                            i23 = i12 + 1;
                                            i22 = i13;
                                            y1Var4 = y1Var3;
                                            hashMap4 = hashMap;
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                    }
                                    i13 = i22;
                                    i23 = i12 + 1;
                                    i22 = i13;
                                    y1Var4 = y1Var3;
                                    hashMap4 = hashMap;
                                }
                                y1Var2 = y1Var4;
                                i11 = i22;
                                tL_messages_stickerSet4.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap4.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet4.packs.add(tL_stickerPack);
                                }
                                hashMap3.put(Long.valueOf(tL_messages_stickerSet4.set.id), tL_messages_stickerSet4.packs);
                            } else {
                                y1Var2 = y1Var4;
                                arrayList = arrayList7;
                                i11 = i22;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set == null) {
                            }
                        }
                        y1Var2 = y1Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    }
                    i19 = i11 + 1;
                    featuredEmojiSets = arrayList;
                    y1Var4 = y1Var2;
                }
            }
            y1 y1Var5 = y1Var4;
            boolean z11 = false;
            for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                try {
                    z11 = ((TLRPC.TL_messages_stickerSet) arrayList5.get(i25)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z11) {
                    break;
                }
            }
            if (!z11 && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.A, false)) != null) {
                arrayList5.add(stickerSet);
            }
            y1Var = y1Var5;
        } else {
            y1Var = y1Var4;
        }
        y1Var.r = true;
        if (this.c != arrayList5.size()) {
            HashMap hashMap6 = this.d;
            hashMap6.clear();
            for (int i26 = 0; i26 < arrayList5.size(); i26++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i26);
                if (tL_messages_stickerSet5 != null) {
                    for (int i27 = 0; i27 < tL_messages_stickerSet5.packs.size(); i27++) {
                        String str3 = tL_messages_stickerSet5.packs.get(i27).emoticon;
                        ArrayList arrayList11 = (ArrayList) hashMap6.get(str3);
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                            hashMap6.put(str3, arrayList11);
                        }
                        arrayList11.addAll(tL_messages_stickerSet5.packs.get(i27).documents);
                    }
                }
            }
            this.c = arrayList5.size();
        }
        this.w = false;
        w1Var3.p(arrayList6);
        this.E = null;
        l();
    }

    @Override // f2.p0
    public final int h() {
        return this.x;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.w && i10 == this.x - 1) {
            return 3;
        }
        if (this.y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i10 >= arrayList.size() || arrayList.get(i10) != this.J.s.d) ? 2 : 4;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        y1 y1Var = this.J;
        k2 k2Var = y1Var.s;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.x0(-1, (int) k2Var.n));
            return;
        }
        if (i11 == 1) {
            int i12 = this.y.get(i10);
            if (i12 >= 0) {
                ArrayList arrayList = this.n;
                if (i12 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                if (this.E == null) {
                    k8Var.b(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.E.toLowerCase());
                if (indexOf < 0) {
                    k8Var.b(0, str);
                    return;
                } else {
                    k8Var.c(str, 0, null, indexOf, this.E.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                v1 v1Var = (v1) view;
                int i13 = this.G;
                if (v1Var.b != i13) {
                    v1Var.b = i13;
                    d61.D(UserConfig.selectedAccount, v1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        m1 m1Var = (m1) view;
        if (document == k2Var.e) {
            m1Var.setSticker(null);
            int dp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.g6.Me;
            ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, k2Var.getThemedColor(i14)));
            Drawable mutate = y1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(k2Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
            jq jqVar = new jq(b02, mutate);
            int dp2 = AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(56.0f);
            jqVar.h = dp2;
            jqVar.n = dp3;
            int dp4 = AndroidUtilities.dp(24.0f);
            int dp5 = AndroidUtilities.dp(24.0f);
            jqVar.e = dp4;
            jqVar.f = dp5;
            jqVar.r = true;
            m1Var.setDrawable(jqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = y1Var.a;
        if (i15 != 0) {
            m1Var.a(null, i15 == 1);
            m1Var.setSticker(document);
            return;
        }
        if (document != null) {
            m1Var.setSticker(null);
            m1Var.a(document, y1Var.a == 1);
            return;
        }
        m1Var.setSticker(null);
        boolean z10 = y1Var.a == 1;
        if (m1Var.f == longValue) {
            return;
        }
        org.telegram.ui.Components.p5 p5Var = m1Var.c;
        if (p5Var != null) {
            p5Var.o(m1Var);
        }
        if (longValue == 0) {
            m1Var.a = false;
            m1Var.f = 0L;
            m1Var.c = null;
            return;
        }
        m1Var.a = true;
        m1Var.f = longValue;
        org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(m1Var.b, longValue, null, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        m1Var.c = n10;
        if (m1Var.s) {
            n10.a(m1Var);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        View k8Var;
        y1 y1Var = this.J;
        k2 k2Var = y1Var.s;
        if (i10 == 0) {
            k8Var = new View(y1Var.getContext());
        } else if (i10 == 1) {
            Context context = y1Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
            k8Var = new org.telegram.ui.Cells.k8(context, true, false, c6Var, false);
        } else if (i10 == 3) {
            Context context2 = y1Var.getContext();
            boolean z10 = y1Var.a == 0;
            v1 v1Var = new v1(context2);
            v1Var.b = -1;
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context2);
            v1Var.a = t9Var;
            v1Var.addView(t9Var, i7.f6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            v1Var.addView(textView, i7.f6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            k8Var = v1Var;
        } else if (i10 == 4) {
            i2 i2Var = new i2(k2Var, y1Var.getContext());
            i2Var.e = new d1(k2Var, 2);
            k8Var = i2Var;
        } else {
            k8Var = new m1(y1Var.getContext(), y1Var.b);
        }
        return new vk0(k8Var);
    }
}
