package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f4 extends c1 {
    public static volatile q5 s = new q5("chatThemeQueue");
    public static final f4[] w = new f4[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final l2.q1 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public f4(int i7) {
        super(i7);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new l2.q1();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        k();
    }

    public static f4 f(int i7) {
        f4 f4Var;
        f4[] f4VarArr = w;
        f4 f4Var2 = f4VarArr[i7];
        if (f4Var2 != null) {
            return f4Var2;
        }
        synchronized (f4.class) {
            try {
                f4Var = f4VarArr[i7];
                if (f4Var == null) {
                    f4Var = new f4(i7);
                    f4VarArr[i7] = f4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f4Var;
    }

    public static String j(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return (wallPaperSettings == null || TextUtils.isEmpty(wallPaperSettings.emoticon)) ? "" : wallPaper.settings.emoticon;
    }

    public static void n(String str) {
        new ImageReceiver(null).q0(fc.b(ri.d0(j10.t0).V(str)), "50_50", null, null, null, 0);
        j6.k(str);
    }

    public static boolean v(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.id == wallPaper2.id;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(j(wallPaper), j(wallPaper2));
            }
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = mp.p1(mp.u1(this.currentAccount).c2(Long.valueOf(j3)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull d2 = getMessagesController().d2(j3);
                if (d2 != null) {
                    d2.wallpaper = null;
                    d2.flags &= -16777217;
                    getMessagesStorage().j2(d2, false);
                }
                r(j3, null);
                if (z10) {
                    ks.f(this.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
                }
            }
        } else {
            long j10 = -j3;
            tL_messages_setChatWallPaper.peer = mp.n1(mp.u1(this.currentAccount).O0(Long.valueOf(j10)));
            TLRPC.ChatFull P0 = getMessagesController().P0(j10);
            if (P0 != null) {
                P0.wallpaper = null;
                P0.flags2 &= -129;
                getMessagesStorage().N1(P0, false);
            }
            r(j3, null);
            if (z10) {
                ks f10 = ks.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(ks.T, P0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new fi.k5(8));
    }

    public final ArrayList b() {
        SharedPreferences h = h();
        int i7 = h.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            SerializedData serializedData = new SerializedData(Utilities.v(h.getString("theme_" + i10, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.t3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.t3 c(long j3) {
        ig.b bVar;
        LongSparseArray longSparseArray = this.h;
        ig.b bVar2 = (ig.b) longSparseArray.get(j3);
        if (bVar2 == null) {
            String string = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j3, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new ig.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new ig.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new ig.b(string, null);
                }
                bVar2 = bVar;
                longSparseArray.put(j3, bVar2);
            }
            bVar2 = null;
            longSparseArray.put(j3, bVar2);
        }
        return i(bVar2);
    }

    public final TLRPC.WallPaper d(long j3) {
        if (j3 >= 0) {
            TLRPC.UserFull d2 = getMessagesController().d2(j3);
            if (d2 != null) {
                return d2.wallpaper;
            }
        } else {
            TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
            if (P0 != null) {
                return P0.wallpaper;
            }
        }
        String string = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatWallpaper_" + this.currentAccount + "_" + j3, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return null;
    }

    public final ArrayList e(int i7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i7, 1);
        boolean hasFlag2 = TLObject.hasFlag(i7, 2);
        boolean hasFlag3 = TLObject.hasFlag(i7, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i10 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.t3) arrayList3.get(0)).a)) {
            org.telegram.ui.ActionBar.t3 t3Var = new org.telegram.ui.ActionBar.t3(this.currentAccount);
            t3Var.e = "❌";
            t3Var.c = ig.b.d("❌");
            t3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            t3Var.a = true;
            org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3();
            s3Var.a = org.telegram.ui.ActionBar.t3.d(true);
            t3Var.f.add(s3Var);
            org.telegram.ui.ActionBar.s3 s3Var2 = new org.telegram.ui.ActionBar.s3();
            s3Var2.a = org.telegram.ui.ActionBar.t3.d(false);
            t3Var.f.add(s3Var2);
            arrayList3.add(0, t3Var);
        }
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.t3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j3) {
        File h = t0.h();
        Locale locale = Locale.US;
        return new File(h, j3 + "_" + this.c + ".jpg");
    }

    public final SharedPreferences h() {
        return f3.e(new StringBuilder("chatthemeconfig_"), this.currentAccount, t0.b, 0);
    }

    public final org.telegram.ui.ActionBar.t3 i(ig.b bVar) {
        if (bVar == null) {
            return null;
        }
        String str = bVar.b;
        if (!TextUtils.isEmpty(str)) {
            return (org.telegram.ui.ActionBar.t3) this.e.get(str);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj;
            if (bVar.equals(t3Var.c)) {
                return t3Var;
            }
        }
        return null;
    }

    public final void k() {
        SharedPreferences h = h();
        this.c = 0L;
        this.d = 0L;
        try {
            this.c = h.getLong("hash", 0L);
            this.d = h.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.b = b();
        tr messagesStorage = getMessagesStorage();
        a4 a4Var = new a4(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new rq(8, messagesStorage, a4Var));
        n("❌");
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            n(((org.telegram.ui.ActionBar.t3) obj).e);
        }
    }

    public final void l(boolean z10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj;
            long h = t3Var.h(z10 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                t3Var.n(z10 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj;
            long h = t3Var.h(z10 ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                t3Var.p(z10 ? 1 : 0, new j1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull P0 = getMessagesController().P0(-n5.o(tL_updatePeerWallpaper.peer));
            if (P0 == null || v(P0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j3 = -P0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                P0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                P0.flags2 |= 128;
            } else {
                P0.wallpaper = null;
                P0.flags2 &= -129;
            }
            getMessagesStorage().N1(P0, false);
            r(j3, P0.wallpaper);
            g0.g3(new w3(0, this, P0));
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(tL_updatePeerWallpaper.peer.user_id);
        if (d2 == null || v(d2.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j10 = d2.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            d2.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
            d2.wallpaper = tL_updatePeerWallpaper.wallpaper;
            d2.flags |= 16777216;
        } else {
            d2.wallpaper_overridden = false;
            d2.wallpaper = null;
            d2.flags &= -16777217;
        }
        getMessagesStorage().j2(d2, false);
        r(j10, d2.wallpaper);
        g0.g3(new d4(this, j10, d2, 0));
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (hashMap.containsKey(str)) {
                return;
            }
            org.telegram.ui.ActionBar.t3 t3Var = new org.telegram.ui.ActionBar.t3(this.currentAccount, tL_chatThemeUniqueGift);
            t3Var.k();
            hashMap.put(tL_chatThemeUniqueGift.gift.slug, t3Var);
            tr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.I(new rq(7, messagesStorage, Collections.singletonList(chatTheme)));
        }
    }

    public final void q(final ResultCallback resultCallback, final boolean z10) {
        if (this.c == 0 || this.d == 0) {
            k();
        }
        boolean z11 = System.currentTimeMillis() - this.d > 7200000;
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || z11) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            q5 q5Var = s;
            Objects.requireNonNull(q5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new x3(q5Var), new q10() { // from class: org.telegram.messenger.y3
                /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                @Override // org.telegram.messenger.q10
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(Object obj, Object obj2) {
                    f4 f4Var = f4.this;
                    ResultCallback resultCallback2 = resultCallback;
                    boolean z12 = z10;
                    TL_account.Themes themes = (TL_account.Themes) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    ArrayList arrayList2 = null;
                    boolean z13 = true;
                    if (themes instanceof TL_account.TL_themes) {
                        TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
                        f4Var.c = tL_themes.hash;
                        f4Var.d = System.currentTimeMillis();
                        SharedPreferences.Editor edit = f4Var.h().edit();
                        edit.clear();
                        edit.putLong("hash", f4Var.c);
                        edit.putLong("lastReload", f4Var.d);
                        edit.putInt("count", tL_themes.themes.size());
                        ArrayList arrayList3 = new ArrayList(tL_themes.themes.size());
                        for (int i7 = 0; i7 < tL_themes.themes.size(); i7++) {
                            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i7);
                            j6.k(tL_theme.emoticon);
                            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                            tL_theme.serializeToStream(serializedData);
                            edit.putString("theme_" + i7, Utilities.f(serializedData.toByteArray()));
                            org.telegram.ui.ActionBar.t3 t3Var = new org.telegram.ui.ActionBar.t3(f4Var.currentAccount, tL_theme);
                            t3Var.p(0, null);
                            t3Var.p(1, null);
                            t3Var.n(0, null);
                            t3Var.n(1, null);
                            arrayList3.add(t3Var);
                        }
                        edit.apply();
                        arrayList2 = arrayList3;
                    } else {
                        if (!(themes instanceof TL_account.TL_themesNotModified)) {
                            g0.g3(new w3(19, resultCallback2, tL_error));
                            if (z13) {
                                g0.g3(new aa.c0(f4Var, arrayList2, resultCallback2, z12, 10));
                                return;
                            }
                            return;
                        }
                        arrayList2 = f4Var.b();
                    }
                    z13 = false;
                    if (z13) {
                    }
                }
            });
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(e((z10 ? 1 : 0) | 2));
    }

    public final void r(long j3, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().remove("chatWallpaper_" + this.currentAccount + "_" + j3).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String f10 = Utilities.f(serializedData.toByteArray());
        t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().putString("chatWallpaper_" + this.currentAccount + "_" + j3, f10).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j3, ig.b bVar, TLRPC.ChatTheme chatTheme, boolean z10) {
        String str;
        TLRPC.Tl_inputChatThemeEmpty tl_inputChatThemeEmpty;
        LongSparseArray longSparseArray = this.h;
        if (ig.b.a((ig.b) longSparseArray.get(j3), bVar)) {
            return;
        }
        if (bVar == null) {
            longSparseArray.delete(j3);
        } else {
            longSparseArray.put(j3, bVar);
        }
        t(j3, bVar != null ? bVar.b : null);
        if (j3 >= 0) {
            TLRPC.UserFull d2 = getMessagesController().d2(j3);
            if (d2 != null && (bVar == null || bVar.b() || chatTheme != null)) {
                d2.theme = chatTheme;
                getMessagesStorage().j2(d2, true);
            }
        } else {
            TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
            if (P0 != null) {
                P0.theme_emoticon = bVar != null ? bVar.a : null;
                getMessagesStorage().N1(P0, true);
            }
        }
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        String str2 = "chatTheme_" + this.currentAccount + "_" + j3;
        if (bVar != null) {
            String str3 = bVar.a;
            String str4 = bVar.b;
            if (str4 != null) {
                str = "gift_".concat(str4);
            } else if (str3 != null) {
                str = "emoticon_".concat(str3);
            }
            edit.putString(str2, str).apply();
            if (z10) {
                return;
            }
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            if (bVar != null) {
                String str5 = bVar.a;
                if (!TextUtils.isEmpty(str5)) {
                    TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
                    tl_inputChatTheme.emoticon = str5;
                    tl_inputChatThemeEmpty = tl_inputChatTheme;
                    tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
                    tL_messages_setChatTheme.peer = getMessagesController().l1(j3);
                    getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
                    return;
                }
            }
            if (bVar != null) {
                String str6 = bVar.b;
                if (!TextUtils.isEmpty(str6)) {
                    TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift = new TLRPC.Tl_inputChatThemeUniqueGift();
                    tl_inputChatThemeUniqueGift.slug = str6;
                    tl_inputChatThemeEmpty = tl_inputChatThemeUniqueGift;
                    tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
                    tL_messages_setChatTheme.peer = getMessagesController().l1(j3);
                    getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
                    return;
                }
            }
            tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().l1(j3);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
            return;
        }
        str = null;
        edit.putString(str2, str).apply();
        if (z10) {
        }
    }

    public final void t(long j3, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.r;
        HashMap hashMap2 = this.n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j3));
            if (str2 != null) {
                hashMap.remove(str2);
                return;
            }
            return;
        }
        if (j3 == 0) {
            Long l10 = (Long) hashMap.remove(str);
            if (l10 != null) {
                hashMap2.remove(l10);
                return;
            }
            return;
        }
        String str3 = (String) hashMap2.put(Long.valueOf(j3), str);
        Long l11 = (Long) hashMap.put(str, Long.valueOf(j3));
        if (str3 != null && !TextUtils.equals(str, str3)) {
            hashMap.remove(str3);
        }
        if (l11 == null || l11.longValue() == j3) {
            return;
        }
        hashMap2.remove(l11);
    }

    public final int u(long j3, String str, org.telegram.ui.ActionBar.e6 e6Var, fj fjVar, j2 j2Var) {
        boolean z10;
        TLRPC.ChatFull P0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = mp.p1(mp.u1(this.currentAccount).c2(Long.valueOf(j3)));
        } else {
            tL_messages_setChatWallPaper.peer = mp.n1(mp.u1(this.currentAccount).O0(Long.valueOf(-j3)));
        }
        tL_messages_setChatWallPaper.for_both = e6Var.o;
        if (fjVar == null || !(fjVar.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = mp.t1(e6Var);
            z10 = true;
        } else {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.id = fjVar.e1();
            if (j3 >= 0) {
                userFull = mp.u1(this.currentAccount).d2(j3);
                P0 = null;
            } else {
                P0 = mp.u1(this.currentAccount).P0(-j3);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) fjVar.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper.id;
            tL_wallPaper.document = wallPaper.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (e6Var.k * 100.0f);
            tL_wallPaperSettings.motion = e6Var.j;
            tL_wallPaperSettings.blur = e6Var.i;
            tL_wallPaperSettings.background_color = e6Var.d;
            tL_wallPaperSettings.second_background_color = e6Var.e;
            tL_wallPaperSettings.third_background_color = e6Var.f;
            tL_wallPaperSettings.fourth_background_color = e6Var.g;
            tL_wallPaperSettings.rotation = e6Var.h;
            tL_wallPaper.uploadingImage = str;
            TLRPC.WallPaper wallPaper2 = userFull != null ? userFull.wallpaper : P0 != null ? P0.wallpaper : null;
            if (wallPaper2 != null && (str2 = wallPaper2.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper2.stripedThumb;
            }
            tL_wallPaper.settings.flags |= ks.F1;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull = P0;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i7 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i7 | 4;
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                ks.f(this.currentAccount).k(ks.E0, Long.valueOf(j3), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                ks f10 = ks.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(ks.T, chatFull, 0, bool, bool);
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = mp.i2(e6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new b4(this, j3, z10, str, j2Var));
    }
}
