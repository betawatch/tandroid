package kh;

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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jx;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a2 extends f2.r0 {
    public final TLRPC.TL_inputStickerSetShortName A;
    public TLRPC.TL_messages_stickerSet B;
    public TLRPC.TL_messages_stickerSet C;
    public String D;
    public String E;
    public String[] F;
    public int G;
    public final /* synthetic */ b2 J;
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
    public final f1 I = new f1(this, 2);

    public a2(b2 b2Var) {
        this.J = b2Var;
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
        int i9;
        b2 b2Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        b2 b2Var2;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11;
        b2 b2Var3;
        HashMap hashMap;
        int i12;
        ArrayList arrayList2;
        int i13;
        int i14;
        b2 b2Var4 = this.J;
        z1 z1Var = b2Var4.e;
        n2 n2Var = b2Var4.s;
        this.D = str;
        f1 f1Var = this.I;
        int i15 = 1;
        if (str != null) {
            b2Var4.f.c(true);
            z1Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            AndroidUtilities.runOnUIThread(f1Var, 100L);
            return;
        }
        z1Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(f1Var);
        i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i9);
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
        if (b2Var4.a == 1) {
            if (n2Var.B != null && (n2Var.l0(0) || n2Var.l0(1) || n2Var.l0(2) || n2Var.l0(3) || n2Var.l0(4))) {
                arrayList3.add(n2Var.d);
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
                if (n2Var.A != null) {
                    recentStickers2.add(0, n2Var.e);
                }
                this.C.set = new TLRPC.TL_stickerSet();
                this.C.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.C);
            }
        }
        arrayList4.addAll(mediaDataController.getStickerSets(b2Var4.a == 0 ? 5 : 0));
        int i16 = 0;
        while (i16 < arrayList4.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i16);
            sparseIntArray.put(this.x, i16);
            arrayList3.add(z10);
            this.x += i15;
            arrayList3.addAll(tL_messages_stickerSet3.documents);
            this.x = tL_messages_stickerSet3.documents.size() + this.x;
            String str2 = tL_messages_stickerSet3 == this.C ? "recent" : tL_messages_stickerSet3 == this.B ? "fav" : tL_messages_stickerSet3;
            int i17 = 0;
            while (i17 < tL_messages_stickerSet3.documents.size()) {
                hashMap2.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i17).id), str2);
                i17++;
                n2Var = n2Var;
                z1Var = z1Var;
            }
            z1 z1Var2 = z1Var;
            n2 n2Var2 = n2Var;
            jx jxVar = new jx();
            jxVar.c = tL_messages_stickerSet3.documents;
            jxVar.b = tL_messages_stickerSet3.set;
            jxVar.f = true;
            jxVar.g = false;
            jxVar.h = true;
            jxVar.e = true;
            if (tL_messages_stickerSet3 == this.B) {
                jxVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.C) {
                jxVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(jxVar);
            arrayList5.add(tL_messages_stickerSet3);
            i16++;
            n2Var = n2Var2;
            z1Var = z1Var2;
            i15 = 1;
            z10 = false;
        }
        z1 z1Var3 = z1Var;
        n2 n2Var3 = n2Var;
        if (b2Var4.a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i18 = 0;
                while (i18 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i18);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        i14 = ((org.telegram.ui.ActionBar.f3) n2Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            b2Var2 = b2Var4;
                            arrayList = featuredEmojiSets;
                            i10 = i18;
                            if (tL_messages_stickerSet.set == null) {
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((jx) arrayList6.get(i19)).b;
                                        if (stickerSet2 != null) {
                                            i13 = i19;
                                            if (stickerSet2.id == tL_messages_stickerSet.set.id) {
                                                break;
                                            }
                                        } else {
                                            i13 = i19;
                                        }
                                        i19 = i13 + 1;
                                    } else {
                                        arrayList4.add(tL_messages_stickerSet);
                                        arrayList5.add(tL_messages_stickerSet);
                                        sparseIntArray.put(this.x, i16);
                                        i16++;
                                        arrayList3.add(null);
                                        this.x++;
                                        arrayList3.addAll(tL_messages_stickerSet.documents);
                                        this.x = tL_messages_stickerSet.documents.size() + this.x;
                                        for (int i20 = 0; i20 < tL_messages_stickerSet.documents.size(); i20++) {
                                            hashMap2.put(Long.valueOf(tL_messages_stickerSet.documents.get(i20).id), tL_messages_stickerSet);
                                        }
                                        jx jxVar2 = new jx();
                                        jxVar2.c = tL_messages_stickerSet.documents;
                                        jxVar2.b = tL_messages_stickerSet.set;
                                        jxVar2.f = false;
                                        jxVar2.g = true;
                                        jxVar2.h = true;
                                        jxVar2.e = true;
                                        arrayList6.add(jxVar2);
                                    }
                                }
                            }
                        }
                        b2Var2 = b2Var4;
                        arrayList = featuredEmojiSets;
                        i10 = i18;
                    } else {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                            tL_messages_stickerSet4.set = stickerSet3;
                            tL_messages_stickerSet4.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList<TLRPC.StickerSetCovered> arrayList7 = featuredEmojiSets;
                            int i21 = i18;
                            Long valueOf = Long.valueOf(stickerSet3.id);
                            HashMap hashMap3 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList8 = (ArrayList) hashMap3.get(valueOf);
                            tL_messages_stickerSet4.packs = arrayList8;
                            if (arrayList8 == null) {
                                HashMap hashMap4 = new HashMap();
                                arrayList = arrayList7;
                                int i22 = 0;
                                while (i22 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i22);
                                    if (document == null) {
                                        b2Var3 = b2Var4;
                                        hashMap = hashMap4;
                                        i11 = i22;
                                    } else {
                                        i11 = i22;
                                        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                        b2Var3 = b2Var4;
                                        if (parseEmojis != null) {
                                            i12 = i21;
                                            int i23 = 0;
                                            while (i23 < parseEmojis.size()) {
                                                String charSequence = parseEmojis.get(i23).code.toString();
                                                ArrayList arrayList9 = (ArrayList) hashMap4.get(charSequence);
                                                ArrayList<Emoji.EmojiSpanRange> arrayList10 = parseEmojis;
                                                if (arrayList9 == null) {
                                                    arrayList2 = new ArrayList();
                                                    hashMap4.put(charSequence, arrayList2);
                                                } else {
                                                    arrayList2 = arrayList9;
                                                }
                                                HashMap hashMap5 = hashMap4;
                                                i23 = aa.d.g(document.id, arrayList2, i23, 1);
                                                hashMap4 = hashMap5;
                                                parseEmojis = arrayList10;
                                                document = document;
                                            }
                                            hashMap = hashMap4;
                                            i22 = i11 + 1;
                                            i21 = i12;
                                            b2Var4 = b2Var3;
                                            hashMap4 = hashMap;
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                    }
                                    i12 = i21;
                                    i22 = i11 + 1;
                                    i21 = i12;
                                    b2Var4 = b2Var3;
                                    hashMap4 = hashMap;
                                }
                                b2Var2 = b2Var4;
                                i10 = i21;
                                tL_messages_stickerSet4.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap4.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet4.packs.add(tL_stickerPack);
                                }
                                hashMap3.put(Long.valueOf(tL_messages_stickerSet4.set.id), tL_messages_stickerSet4.packs);
                            } else {
                                b2Var2 = b2Var4;
                                arrayList = arrayList7;
                                i10 = i21;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set == null) {
                            }
                        }
                        b2Var2 = b2Var4;
                        arrayList = featuredEmojiSets;
                        i10 = i18;
                    }
                    i18 = i10 + 1;
                    featuredEmojiSets = arrayList;
                    b2Var4 = b2Var2;
                }
            }
            b2 b2Var5 = b2Var4;
            boolean z11 = false;
            for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                try {
                    z11 = ((TLRPC.TL_messages_stickerSet) arrayList5.get(i24)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z11) {
                    break;
                }
            }
            if (!z11 && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.A, false)) != null) {
                arrayList5.add(stickerSet);
            }
            b2Var = b2Var5;
        } else {
            b2Var = b2Var4;
        }
        b2Var.r = true;
        if (this.c != arrayList5.size()) {
            HashMap hashMap6 = this.d;
            hashMap6.clear();
            for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i25);
                if (tL_messages_stickerSet5 != null) {
                    for (int i26 = 0; i26 < tL_messages_stickerSet5.packs.size(); i26++) {
                        String str3 = tL_messages_stickerSet5.packs.get(i26).emoticon;
                        ArrayList arrayList11 = (ArrayList) hashMap6.get(str3);
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                            hashMap6.put(str3, arrayList11);
                        }
                        arrayList11.addAll(tL_messages_stickerSet5.packs.get(i26).documents);
                    }
                }
            }
            this.c = arrayList5.size();
        }
        this.w = false;
        z1Var3.p(arrayList6);
        this.E = null;
        l();
    }

    @Override // f2.r0
    public final int h() {
        return this.x;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (this.w && i9 == this.x - 1) {
            return 3;
        }
        if (this.y.get(i9, -1) >= 0) {
            return 1;
        }
        if (i9 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i9 >= arrayList.size() || arrayList.get(i9) != this.J.s.d) ? 2 : 4;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.StickerSet stickerSet;
        b2 b2Var = this.J;
        n2 n2Var = b2Var.s;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.a1(-1, (int) n2Var.n));
            return;
        }
        if (i10 == 1) {
            int i11 = this.y.get(i9);
            if (i11 >= 0) {
                ArrayList arrayList = this.n;
                if (i11 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i11);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (this.E == null) {
                    m8Var.b(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.E.toLowerCase());
                if (indexOf < 0) {
                    m8Var.b(0, str);
                    return;
                } else {
                    m8Var.c(str, 0, null, indexOf, this.E.length());
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                y1 y1Var = (y1) view;
                int i12 = this.G;
                if (y1Var.b != i12) {
                    y1Var.b = i12;
                    b61.D(UserConfig.selectedAccount, y1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i9 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i9);
        p1 p1Var = (p1) view;
        if (document == n2Var.e) {
            p1Var.setSticker(null);
            int dp = AndroidUtilities.dp(28.0f);
            int i13 = org.telegram.ui.ActionBar.f6.Me;
            ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.12f, n2Var.getThemedColor(i13)));
            Drawable mutate = b2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
            fq fqVar = new fq(b02, mutate);
            int dp2 = AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(56.0f);
            fqVar.h = dp2;
            fqVar.n = dp3;
            int dp4 = AndroidUtilities.dp(24.0f);
            int dp5 = AndroidUtilities.dp(24.0f);
            fqVar.e = dp4;
            fqVar.f = dp5;
            fqVar.r = true;
            p1Var.setDrawable(fqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i9 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i9)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i14 = b2Var.a;
        if (i14 != 0) {
            p1Var.a(null, i14 == 1);
            p1Var.setSticker(document);
            return;
        }
        if (document != null) {
            p1Var.setSticker(null);
            p1Var.a(document, b2Var.a == 1);
            return;
        }
        p1Var.setSticker(null);
        boolean z10 = b2Var.a == 1;
        if (p1Var.f == longValue) {
            return;
        }
        org.telegram.ui.Components.k5 k5Var = p1Var.c;
        if (k5Var != null) {
            k5Var.o(p1Var);
        }
        if (longValue == 0) {
            p1Var.a = false;
            p1Var.f = 0L;
            p1Var.c = null;
            return;
        }
        p1Var.a = true;
        p1Var.f = longValue;
        org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(p1Var.b, longValue, null, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        p1Var.c = n10;
        if (p1Var.s) {
            n10.a(p1Var);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        View m8Var;
        b2 b2Var = this.J;
        n2 n2Var = b2Var.s;
        if (i9 == 0) {
            m8Var = new View(b2Var.getContext());
        } else if (i9 == 1) {
            Context context = b2Var.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
            m8Var = new org.telegram.ui.Cells.m8(context, true, false, b6Var, false);
        } else if (i9 == 3) {
            Context context2 = b2Var.getContext();
            boolean z10 = b2Var.a == 0;
            y1 y1Var = new y1(context2);
            y1Var.b = -1;
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context2);
            y1Var.a = o9Var;
            y1Var.addView(o9Var, g7.e6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            y1Var.addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            m8Var = y1Var;
        } else if (i9 == 4) {
            l2 l2Var = new l2(n2Var, b2Var.getContext());
            l2Var.e = new e1(n2Var, 2);
            m8Var = l2Var;
        } else {
            m8Var = new p1(b2Var.getContext(), b2Var.b);
        }
        return new ik0(m8Var);
    }
}
