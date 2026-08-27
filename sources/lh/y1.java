package lh;

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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.a61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class y1 extends f2.q0 {
    public final TLRPC.TL_inputStickerSetShortName A;
    public TLRPC.TL_messages_stickerSet B;
    public TLRPC.TL_messages_stickerSet C;
    public String D;
    public String E;
    public String[] F;
    public int G;
    public final /* synthetic */ z1 J;
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
    public final kh.c I = new kh.c(this, 9);

    public y1(z1 z1Var) {
        this.J = z1Var;
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
        z1 z1Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        z1 z1Var2;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12;
        z1 z1Var3;
        HashMap hashMap;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        z1 z1Var4 = this.J;
        x1 x1Var = z1Var4.e;
        l2 l2Var = z1Var4.s;
        this.D = str;
        kh.c cVar = this.I;
        int i16 = 1;
        if (str != null) {
            z1Var4.f.c(true);
            x1Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 100L);
            return;
        }
        x1Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(cVar);
        i10 = ((org.telegram.ui.ActionBar.e3) l2Var).currentAccount;
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
        if (z1Var4.a == 1) {
            if (l2Var.B != null && (l2Var.m0(0) || l2Var.m0(1) || l2Var.m0(2) || l2Var.m0(3) || l2Var.m0(4))) {
                arrayList3.add(l2Var.d);
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
                if (l2Var.A != null) {
                    recentStickers2.add(0, l2Var.e);
                }
                this.C.set = new TLRPC.TL_stickerSet();
                this.C.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.C);
            }
        }
        arrayList4.addAll(mediaDataController.getStickerSets(z1Var4.a == 0 ? 5 : 0));
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
                l2Var = l2Var;
                x1Var = x1Var;
            }
            x1 x1Var2 = x1Var;
            l2 l2Var2 = l2Var;
            kx kxVar = new kx();
            kxVar.c = tL_messages_stickerSet3.documents;
            kxVar.b = tL_messages_stickerSet3.set;
            kxVar.f = true;
            kxVar.g = false;
            kxVar.h = true;
            kxVar.e = true;
            if (tL_messages_stickerSet3 == this.B) {
                kxVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.C) {
                kxVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(kxVar);
            arrayList5.add(tL_messages_stickerSet3);
            i17++;
            l2Var = l2Var2;
            x1Var = x1Var2;
            i16 = 1;
            z10 = false;
        }
        x1 x1Var3 = x1Var;
        l2 l2Var3 = l2Var;
        if (z1Var4.a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i19 = 0;
                while (i19 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        i15 = ((org.telegram.ui.ActionBar.e3) l2Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            z1Var2 = z1Var4;
                            arrayList = featuredEmojiSets;
                            i11 = i19;
                            if (tL_messages_stickerSet.set == null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((kx) arrayList6.get(i20)).b;
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
                                        kx kxVar2 = new kx();
                                        kxVar2.c = tL_messages_stickerSet.documents;
                                        kxVar2.b = tL_messages_stickerSet.set;
                                        kxVar2.f = false;
                                        kxVar2.g = true;
                                        kxVar2.h = true;
                                        kxVar2.e = true;
                                        arrayList6.add(kxVar2);
                                    }
                                }
                            }
                        }
                        z1Var2 = z1Var4;
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
                                        z1Var3 = z1Var4;
                                        hashMap = hashMap4;
                                        i12 = i23;
                                    } else {
                                        i12 = i23;
                                        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                        z1Var3 = z1Var4;
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
                                                i24 = com.google.android.recaptcha.internal.a.f(document.id, arrayList2, i24, 1);
                                                hashMap4 = hashMap5;
                                                parseEmojis = arrayList10;
                                                document = document;
                                            }
                                            hashMap = hashMap4;
                                            i23 = i12 + 1;
                                            i22 = i13;
                                            z1Var4 = z1Var3;
                                            hashMap4 = hashMap;
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                    }
                                    i13 = i22;
                                    i23 = i12 + 1;
                                    i22 = i13;
                                    z1Var4 = z1Var3;
                                    hashMap4 = hashMap;
                                }
                                z1Var2 = z1Var4;
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
                                z1Var2 = z1Var4;
                                arrayList = arrayList7;
                                i11 = i22;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set == null) {
                            }
                        }
                        z1Var2 = z1Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    }
                    i19 = i11 + 1;
                    featuredEmojiSets = arrayList;
                    z1Var4 = z1Var2;
                }
            }
            z1 z1Var5 = z1Var4;
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
            z1Var = z1Var5;
        } else {
            z1Var = z1Var4;
        }
        z1Var.r = true;
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
        x1Var3.p(arrayList6);
        this.E = null;
        l();
    }

    @Override // f2.q0
    public final int h() {
        return this.x;
    }

    @Override // f2.q0
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

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.J;
        l2 l2Var = z1Var.s;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.y0(-1, (int) l2Var.n));
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
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                if (this.E == null) {
                    j8Var.b(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.E.toLowerCase());
                if (indexOf < 0) {
                    j8Var.b(0, str);
                    return;
                } else {
                    j8Var.c(str, 0, null, indexOf, this.E.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                w1 w1Var = (w1) view;
                int i13 = this.G;
                if (w1Var.b != i13) {
                    w1Var.b = i13;
                    a61.D(UserConfig.selectedAccount, w1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        n1 n1Var = (n1) view;
        if (document == l2Var.e) {
            n1Var.setSticker(null);
            int dp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.g6.Me;
            ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, l2Var.getThemedColor(i14)));
            Drawable mutate = z1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(l2Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
            dq dqVar = new dq(b02, mutate);
            int dp2 = AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(56.0f);
            dqVar.h = dp2;
            dqVar.n = dp3;
            int dp4 = AndroidUtilities.dp(24.0f);
            int dp5 = AndroidUtilities.dp(24.0f);
            dqVar.e = dp4;
            dqVar.f = dp5;
            dqVar.r = true;
            n1Var.setDrawable(dqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = z1Var.a;
        if (i15 != 0) {
            n1Var.a(null, i15 == 1);
            n1Var.setSticker(document);
            return;
        }
        if (document != null) {
            n1Var.setSticker(null);
            n1Var.a(document, z1Var.a == 1);
            return;
        }
        n1Var.setSticker(null);
        boolean z10 = z1Var.a == 1;
        if (n1Var.f == longValue) {
            return;
        }
        org.telegram.ui.Components.k5 k5Var = n1Var.c;
        if (k5Var != null) {
            k5Var.o(n1Var);
        }
        if (longValue == 0) {
            n1Var.a = false;
            n1Var.f = 0L;
            n1Var.c = null;
            return;
        }
        n1Var.a = true;
        n1Var.f = longValue;
        org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(n1Var.b, longValue, null, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        n1Var.c = n10;
        if (n1Var.s) {
            n10.a(n1Var);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        View j8Var;
        z1 z1Var = this.J;
        l2 l2Var = z1Var.s;
        if (i10 == 0) {
            j8Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            Context context = z1Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider;
            j8Var = new org.telegram.ui.Cells.j8(context, true, false, c6Var, false);
        } else if (i10 == 3) {
            Context context2 = z1Var.getContext();
            boolean z10 = z1Var.a == 0;
            w1 w1Var = new w1(context2);
            w1Var.b = -1;
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
            w1Var.a = n9Var;
            w1Var.addView(n9Var, h7.z5.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            w1Var.addView(textView, h7.z5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = w1Var;
        } else if (i10 == 4) {
            j2 j2Var = new j2(l2Var, z1Var.getContext());
            j2Var.e = new d1(l2Var, 2);
            j8Var = j2Var;
        } else {
            j8Var = new n1(z1Var.getContext(), z1Var.b);
        }
        return new lk0(j8Var);
    }
}
