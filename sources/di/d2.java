package di;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xx;
import org.telegram.ui.j71;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class d2 extends s4.h0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final /* synthetic */ e2 N;
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
    public final HashSet L = new HashSet();
    public final bi.oa M = new bi.oa(this, 18);

    public d2(e2 e2Var) {
        this.N = e2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        int i10;
        e2 e2Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        e2 e2Var2;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12;
        e2 e2Var3;
        HashMap hashMap;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        e2 e2Var4 = this.N;
        c2 c2Var = e2Var4.e;
        t2 t2Var = e2Var4.s;
        this.H = str;
        bi.oa oaVar = this.M;
        int i16 = 1;
        if (str != null) {
            e2Var4.f.c(true);
            c2Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(oaVar);
            AndroidUtilities.runOnUIThread(oaVar, 100L);
            return;
        }
        c2Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(oaVar);
        i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
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
        if (e2Var4.a == 1) {
            if (t2Var.F != null && (t2Var.m0(0) || t2Var.m0(1) || t2Var.m0(2) || t2Var.m0(3) || t2Var.m0(4))) {
                arrayList3.add(t2Var.d);
                this.x++;
            }
            ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(2);
            if (recentStickers != null && !recentStickers.isEmpty()) {
                if (this.F == null) {
                    this.F = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.F;
                tL_messages_stickerSet2.documents = recentStickers;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.F.set.title = LocaleController.getString(R.string.FavoriteStickers);
                arrayList4.add(this.F);
            }
            ArrayList<TLRPC.Document> recentStickers2 = mediaDataController.getRecentStickers(0);
            if (recentStickers2 != null && !recentStickers2.isEmpty()) {
                if (this.G == null) {
                    this.G = new TLRPC.TL_messages_stickerSet();
                }
                this.G.documents = recentStickers2;
                if (t2Var.E != null) {
                    recentStickers2.add(0, t2Var.e);
                }
                this.G.set = new TLRPC.TL_stickerSet();
                this.G.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.G);
            }
        }
        arrayList4.addAll(mediaDataController.getStickerSets(e2Var4.a == 0 ? 5 : 0));
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i17);
            sparseIntArray.put(this.x, i17);
            arrayList3.add(z10);
            this.x += i16;
            arrayList3.addAll(tL_messages_stickerSet3.documents);
            this.x = tL_messages_stickerSet3.documents.size() + this.x;
            String str2 = tL_messages_stickerSet3 == this.G ? "recent" : tL_messages_stickerSet3 == this.F ? "fav" : tL_messages_stickerSet3;
            int i18 = 0;
            while (i18 < tL_messages_stickerSet3.documents.size()) {
                hashMap2.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i18).id), str2);
                i18++;
                t2Var = t2Var;
                c2Var = c2Var;
            }
            c2 c2Var2 = c2Var;
            t2 t2Var2 = t2Var;
            xx xxVar = new xx();
            xxVar.c = tL_messages_stickerSet3.documents;
            xxVar.b = tL_messages_stickerSet3.set;
            xxVar.f = true;
            xxVar.g = false;
            xxVar.h = true;
            xxVar.e = true;
            if (tL_messages_stickerSet3 == this.F) {
                xxVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.G) {
                xxVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(xxVar);
            arrayList5.add(tL_messages_stickerSet3);
            i17++;
            t2Var = t2Var2;
            c2Var = c2Var2;
            i16 = 1;
            z10 = false;
        }
        c2 c2Var3 = c2Var;
        t2 t2Var3 = t2Var;
        if (e2Var4.a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i19 = 0;
                while (i19 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        i15 = ((org.telegram.ui.ActionBar.f3) t2Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            e2Var2 = e2Var4;
                            arrayList = featuredEmojiSets;
                            i11 = i19;
                            if (tL_messages_stickerSet.set == null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((xx) arrayList6.get(i20)).b;
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
                                        xx xxVar2 = new xx();
                                        xxVar2.c = tL_messages_stickerSet.documents;
                                        xxVar2.b = tL_messages_stickerSet.set;
                                        xxVar2.f = false;
                                        xxVar2.g = true;
                                        xxVar2.h = true;
                                        xxVar2.e = true;
                                        arrayList6.add(xxVar2);
                                    }
                                }
                            }
                        }
                        e2Var2 = e2Var4;
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
                                        e2Var3 = e2Var4;
                                        hashMap = hashMap4;
                                        i12 = i23;
                                    } else {
                                        i12 = i23;
                                        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                        e2Var3 = e2Var4;
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
                                                i24 = com.google.android.gms.internal.vision.e2.g(document.id, arrayList2, i24, 1);
                                                hashMap4 = hashMap5;
                                                parseEmojis = arrayList10;
                                                document = document;
                                            }
                                            hashMap = hashMap4;
                                            i23 = i12 + 1;
                                            i22 = i13;
                                            e2Var4 = e2Var3;
                                            hashMap4 = hashMap;
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                    }
                                    i13 = i22;
                                    i23 = i12 + 1;
                                    i22 = i13;
                                    e2Var4 = e2Var3;
                                    hashMap4 = hashMap;
                                }
                                e2Var2 = e2Var4;
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
                                e2Var2 = e2Var4;
                                arrayList = arrayList7;
                                i11 = i22;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set == null) {
                            }
                        }
                        e2Var2 = e2Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    }
                    i19 = i11 + 1;
                    featuredEmojiSets = arrayList;
                    e2Var4 = e2Var2;
                }
            }
            e2 e2Var5 = e2Var4;
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
            if (!z11 && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.E, false)) != null) {
                arrayList5.add(stickerSet);
            }
            e2Var = e2Var5;
        } else {
            e2Var = e2Var4;
        }
        e2Var.r = true;
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
        c2Var3.p(arrayList6);
        this.I = null;
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.x;
    }

    @Override // s4.h0
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
        return (i10 >= arrayList.size() || arrayList.get(i10) != this.N.s.d) ? 2 : 4;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        e2 e2Var = this.N;
        t2 t2Var = e2Var.s;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) t2Var.n));
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
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                if (this.I == null) {
                    o8Var.b(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.I.toLowerCase());
                if (indexOf < 0) {
                    o8Var.b(0, str);
                    return;
                } else {
                    o8Var.c(str, 0, null, indexOf, this.I.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                b2 b2Var = (b2) view;
                int i13 = this.K;
                if (b2Var.b != i13) {
                    b2Var.b = i13;
                    j71.D(UserConfig.selectedAccount, b2Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        o1 o1Var = (o1) view;
        if (document == t2Var.e) {
            o1Var.setSticker(null);
            int dp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.j6.Me;
            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, t2Var.getThemedColor(i14)));
            Drawable mutate = e2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(t2Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
            oq oqVar = new oq(b02, mutate);
            int dp2 = AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(56.0f);
            oqVar.h = dp2;
            oqVar.n = dp3;
            int dp4 = AndroidUtilities.dp(24.0f);
            int dp5 = AndroidUtilities.dp(24.0f);
            oqVar.e = dp4;
            oqVar.f = dp5;
            oqVar.r = true;
            o1Var.setDrawable(oqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = e2Var.a;
        if (i15 != 0) {
            o1Var.a(null, i15 == 1);
            o1Var.setSticker(document);
            return;
        }
        if (document != null) {
            o1Var.setSticker(null);
            o1Var.a(document, e2Var.a == 1);
            return;
        }
        o1Var.setSticker(null);
        boolean z10 = e2Var.a == 1;
        if (o1Var.f == longValue) {
            return;
        }
        org.telegram.ui.Components.q5 q5Var = o1Var.c;
        if (q5Var != null) {
            q5Var.o(o1Var);
        }
        if (longValue == 0) {
            o1Var.a = false;
            o1Var.f = 0L;
            o1Var.c = null;
            return;
        }
        o1Var.a = true;
        o1Var.f = longValue;
        org.telegram.ui.Components.q5 n10 = org.telegram.ui.Components.q5.n(o1Var.b, longValue, null, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        o1Var.c = n10;
        if (o1Var.s) {
            n10.a(o1Var);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View o8Var;
        e2 e2Var = this.N;
        t2 t2Var = e2Var.s;
        if (i10 == 0) {
            o8Var = new View(e2Var.getContext());
        } else if (i10 == 1) {
            Context context = e2Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
            o8Var = new org.telegram.ui.Cells.o8(context, true, false, f6Var, false);
        } else if (i10 == 3) {
            Context context2 = e2Var.getContext();
            boolean z10 = e2Var.a == 0;
            b2 b2Var = new b2(context2);
            b2Var.b = -1;
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context2);
            b2Var.a = x9Var;
            b2Var.addView(x9Var, w7.x5.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            b2Var.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            o8Var = b2Var;
        } else if (i10 == 4) {
            r2 r2Var = new r2(t2Var, e2Var.getContext());
            r2Var.e = new e1(t2Var, 2);
            o8Var = r2Var;
        } else {
            o8Var = new o1(e2Var.getContext(), e2Var.b);
        }
        return new vk0(o8Var);
    }
}
