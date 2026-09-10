package bi;

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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.l71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p2 extends s4.h0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final /* synthetic */ q2 N;
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
    public final a3.d M = new a3.d(this, 18);

    public p2(q2 q2Var) {
        this.N = q2Var;
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
        q2 q2Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        q2 q2Var2;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12;
        q2 q2Var3;
        HashMap hashMap;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        q2 q2Var4 = this.N;
        n2 n2Var = q2Var4.e;
        f3 f3Var = q2Var4.s;
        this.H = str;
        a3.d dVar = this.M;
        int i16 = 1;
        if (str != null) {
            q2Var4.f.c(true);
            n2Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 100L);
            return;
        }
        n2Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(dVar);
        i10 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
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
        if (q2Var4.a == 1) {
            if (f3Var.F != null && (f3Var.m0(0) || f3Var.m0(1) || f3Var.m0(2) || f3Var.m0(3) || f3Var.m0(4))) {
                arrayList3.add(f3Var.d);
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
                if (f3Var.E != null) {
                    recentStickers2.add(0, f3Var.e);
                }
                this.G.set = new TLRPC.TL_stickerSet();
                this.G.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.G);
            }
        }
        arrayList4.addAll(mediaDataController.getStickerSets(q2Var4.a == 0 ? 5 : 0));
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
                f3Var = f3Var;
                n2Var = n2Var;
            }
            n2 n2Var2 = n2Var;
            f3 f3Var2 = f3Var;
            dy dyVar = new dy();
            dyVar.c = tL_messages_stickerSet3.documents;
            dyVar.b = tL_messages_stickerSet3.set;
            dyVar.f = true;
            dyVar.g = false;
            dyVar.h = true;
            dyVar.e = true;
            if (tL_messages_stickerSet3 == this.F) {
                dyVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.G) {
                dyVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(dyVar);
            arrayList5.add(tL_messages_stickerSet3);
            i17++;
            f3Var = f3Var2;
            n2Var = n2Var2;
            i16 = 1;
            z10 = false;
        }
        n2 n2Var3 = n2Var;
        f3 f3Var3 = f3Var;
        if (q2Var4.a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i19 = 0;
                while (i19 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        i15 = ((org.telegram.ui.ActionBar.h3) f3Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            q2Var2 = q2Var4;
                            arrayList = featuredEmojiSets;
                            i11 = i19;
                            if (tL_messages_stickerSet.set == null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((dy) arrayList6.get(i20)).b;
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
                                        dy dyVar2 = new dy();
                                        dyVar2.c = tL_messages_stickerSet.documents;
                                        dyVar2.b = tL_messages_stickerSet.set;
                                        dyVar2.f = false;
                                        dyVar2.g = true;
                                        dyVar2.h = true;
                                        dyVar2.e = true;
                                        arrayList6.add(dyVar2);
                                    }
                                }
                            }
                        }
                        q2Var2 = q2Var4;
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
                                        q2Var3 = q2Var4;
                                        hashMap = hashMap4;
                                        i12 = i23;
                                    } else {
                                        i12 = i23;
                                        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                        q2Var3 = q2Var4;
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
                                                i24 = com.google.android.gms.internal.vision.e2.f(document.id, arrayList2, i24, 1);
                                                hashMap4 = hashMap5;
                                                parseEmojis = arrayList10;
                                                document = document;
                                            }
                                            hashMap = hashMap4;
                                            i23 = i12 + 1;
                                            i22 = i13;
                                            q2Var4 = q2Var3;
                                            hashMap4 = hashMap;
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                    }
                                    i13 = i22;
                                    i23 = i12 + 1;
                                    i22 = i13;
                                    q2Var4 = q2Var3;
                                    hashMap4 = hashMap;
                                }
                                q2Var2 = q2Var4;
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
                                q2Var2 = q2Var4;
                                arrayList = arrayList7;
                                i11 = i22;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set == null) {
                            }
                        }
                        q2Var2 = q2Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    }
                    i19 = i11 + 1;
                    featuredEmojiSets = arrayList;
                    q2Var4 = q2Var2;
                }
            }
            q2 q2Var5 = q2Var4;
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
            q2Var = q2Var5;
        } else {
            q2Var = q2Var4;
        }
        q2Var.r = true;
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
        n2Var3.p(arrayList6);
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
        q2 q2Var = this.N;
        f3 f3Var = q2Var.s;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) f3Var.n));
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
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (this.I == null) {
                    p8Var.b(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.I.toLowerCase());
                if (indexOf < 0) {
                    p8Var.b(0, str);
                    return;
                } else {
                    p8Var.c(str, 0, null, indexOf, this.I.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                m2 m2Var = (m2) view;
                int i13 = this.K;
                if (m2Var.b != i13) {
                    m2Var.b = i13;
                    l71.D(UserConfig.selectedAccount, m2Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        v1 v1Var = (v1) view;
        if (document == f3Var.e) {
            v1Var.setSticker(null);
            int dp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.j6.Me;
            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, f3Var.getThemedColor(i14)));
            Drawable mutate = q2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(f3Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
            vq vqVar = new vq(b02, mutate);
            int dp2 = AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(56.0f);
            vqVar.h = dp2;
            vqVar.n = dp3;
            int dp4 = AndroidUtilities.dp(24.0f);
            int dp5 = AndroidUtilities.dp(24.0f);
            vqVar.e = dp4;
            vqVar.f = dp5;
            vqVar.r = true;
            v1Var.setDrawable(vqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = q2Var.a;
        if (i15 != 0) {
            v1Var.a(null, i15 == 1);
            v1Var.setSticker(document);
            return;
        }
        if (document != null) {
            v1Var.setSticker(null);
            v1Var.a(document, q2Var.a == 1);
            return;
        }
        v1Var.setSticker(null);
        boolean z10 = q2Var.a == 1;
        if (v1Var.f == longValue) {
            return;
        }
        org.telegram.ui.Components.p5 p5Var = v1Var.c;
        if (p5Var != null) {
            p5Var.o(v1Var);
        }
        if (longValue == 0) {
            v1Var.a = false;
            v1Var.f = 0L;
            v1Var.c = null;
            return;
        }
        v1Var.a = true;
        v1Var.f = longValue;
        org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(v1Var.b, longValue, null, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        v1Var.c = n10;
        if (v1Var.s) {
            n10.a(v1Var);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View p8Var;
        q2 q2Var = this.N;
        f3 f3Var = q2Var.s;
        if (i10 == 0) {
            p8Var = new View(q2Var.getContext());
        } else if (i10 == 1) {
            Context context = q2Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
            p8Var = new org.telegram.ui.Cells.p8(context, true, false, f6Var, false);
        } else if (i10 == 3) {
            Context context2 = q2Var.getContext();
            boolean z10 = q2Var.a == 0;
            m2 m2Var = new m2(context2);
            m2Var.b = -1;
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
            m2Var.a = w9Var;
            m2Var.addView(w9Var, w7.a6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            m2Var.addView(textView, w7.a6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            p8Var = m2Var;
        } else if (i10 == 4) {
            d3 d3Var = new d3(f3Var, q2Var.getContext());
            d3Var.e = new j1(f3Var, 2);
            p8Var = d3Var;
        } else {
            p8Var = new v1(q2Var.getContext(), q2Var.b);
        }
        return new fl0(p8Var);
    }
}
