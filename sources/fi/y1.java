package fi;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y1 extends s4.h0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final /* synthetic */ z1 N;
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
    public final di.s8 M = new di.s8(this, 16);

    public y1(z1 z1Var) {
        this.N = z1Var;
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
        z1 z1Var4 = this.N;
        x1 x1Var = z1Var4.e;
        l2 l2Var = z1Var4.s;
        this.H = str;
        di.s8 s8Var = this.M;
        int i16 = 1;
        if (str != null) {
            z1Var4.f.c(true);
            x1Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(s8Var);
            AndroidUtilities.runOnUIThread(s8Var, 100L);
            return;
        }
        x1Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(s8Var);
        i10 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
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
            if (l2Var.G != null && (l2Var.o0(0) || l2Var.o0(1) || l2Var.o0(2) || l2Var.o0(3) || l2Var.o0(4))) {
                arrayList3.add(l2Var.d);
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
                if (l2Var.F != null) {
                    recentStickers2.add(0, l2Var.e);
                }
                this.G.set = new TLRPC.TL_stickerSet();
                this.G.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.G);
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
            String str2 = tL_messages_stickerSet3 == this.G ? "recent" : tL_messages_stickerSet3 == this.F ? "fav" : tL_messages_stickerSet3;
            int i18 = 0;
            while (i18 < tL_messages_stickerSet3.documents.size()) {
                hashMap2.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i18).id), str2);
                i18++;
                l2Var = l2Var;
                x1Var = x1Var;
            }
            x1 x1Var2 = x1Var;
            l2 l2Var2 = l2Var;
            ey eyVar = new ey();
            eyVar.c = tL_messages_stickerSet3.documents;
            eyVar.b = tL_messages_stickerSet3.set;
            eyVar.f = true;
            eyVar.g = false;
            eyVar.h = true;
            eyVar.e = true;
            if (tL_messages_stickerSet3 == this.F) {
                eyVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.G) {
                eyVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(eyVar);
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
                        i15 = ((org.telegram.ui.ActionBar.k3) l2Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            z1Var2 = z1Var4;
                            arrayList = featuredEmojiSets;
                            i11 = i19;
                            if (tL_messages_stickerSet.set == null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((ey) arrayList6.get(i20)).b;
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
                                        ey eyVar2 = new ey();
                                        eyVar2.c = tL_messages_stickerSet.documents;
                                        eyVar2.b = tL_messages_stickerSet.set;
                                        eyVar2.f = false;
                                        eyVar2.g = true;
                                        eyVar2.h = true;
                                        eyVar2.e = true;
                                        arrayList6.add(eyVar2);
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
                                                i24 = c3.h0.j(document.id, arrayList2, i24, 1);
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
            if (!z11 && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.E, false)) != null) {
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
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.N;
        l2 l2Var = z1Var.s;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.q0(-1, (int) l2Var.n));
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
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (this.I == null) {
                    s8Var.a(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.I.toLowerCase());
                if (indexOf < 0) {
                    s8Var.a(0, str);
                    return;
                } else {
                    s8Var.b(str, 0, null, indexOf, this.I.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                w1 w1Var = (w1) view;
                int i13 = this.K;
                if (w1Var.b != i13) {
                    w1Var.b = i13;
                    c61.D(UserConfig.selectedAccount, w1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        m1 m1Var = (m1) view;
        if (document == l2Var.e) {
            m1Var.setSticker(null);
            if (m1Var.a == null) {
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(28.0f), -1);
                int i14 = org.telegram.ui.ActionBar.y6.Me;
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i14);
                u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.l(m1Var, c02, L.a, -1, 2, L.d, u6Var, PorterDuff.Mode.SRC_IN);
                Drawable mutate = z1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                u6Var2 = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.y(m1Var, mutate, i14, u6Var2, PorterDuff.Mode.MULTIPLY);
                ar arVar = new ar(c02, mutate);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                arVar.h = dp;
                arVar.n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                arVar.e = dp3;
                arVar.f = dp4;
                arVar.r = true;
                m1Var.a = arVar;
            }
            m1Var.setDrawable(m1Var.a);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = z1Var.a;
        if (i15 != 0) {
            m1Var.a(null, i15 == 1);
            m1Var.setSticker(document);
            return;
        }
        if (document != null) {
            m1Var.setSticker(null);
            m1Var.a(document, z1Var.a == 1);
            return;
        }
        m1Var.setSticker(null);
        boolean z10 = z1Var.a == 1;
        if (m1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.t5 t5Var = m1Var.d;
        if (t5Var != null) {
            t5Var.o(m1Var);
        }
        if (longValue == 0) {
            m1Var.b = false;
            m1Var.h = 0L;
            m1Var.d = null;
            return;
        }
        m1Var.b = true;
        m1Var.h = longValue;
        org.telegram.ui.Components.t5 n10 = org.telegram.ui.Components.t5.n(m1Var.c, longValue, null, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        m1Var.d = n10;
        if (m1Var.v) {
            n10.a(m1Var);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        View s8Var;
        z1 z1Var = this.N;
        l2 l2Var = z1Var.s;
        if (i10 == 0) {
            s8Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            Context context = z1Var.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
            s8Var = new org.telegram.ui.Cells.s8(context, true, false, u6Var, false);
        } else if (i10 == 3) {
            Context context2 = z1Var.getContext();
            boolean z10 = z1Var.a == 0;
            w1 w1Var = new w1(context2);
            w1Var.b = -1;
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context2);
            w1Var.a = y9Var;
            w1Var.addView(y9Var, gb1.i(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            w1Var.addView(textView, gb1.h(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            s8Var = w1Var;
        } else if (i10 == 4) {
            j2 j2Var = new j2(l2Var, z1Var.getContext());
            j2Var.e = new d1(l2Var, 2);
            s8Var = j2Var;
        } else {
            s8Var = new m1(z1Var.getContext(), z1Var.b);
        }
        return new vl0(s8Var);
    }
}
