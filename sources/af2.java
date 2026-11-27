// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class af2 extends rf0 {
    public static volatile to3 s = new to3("chatThemeQueue");
    public static final af2[] w = new af2[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final ze2 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public af2(int i) {
        super(i);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new ze2();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        i();
    }

    public static af2 e(int i) {
        af2 af2Var;
        af2[] af2VarArr = w;
        af2 af2Var2 = af2VarArr[i];
        if (af2Var2 != null) {
            return af2Var2;
        }
        synchronized (af2.class) {
            af2Var = af2VarArr[i];
            if (af2Var == null) {
                af2Var = new af2(i);
                af2VarArr[i] = af2Var;
            }
        }
        return af2Var;
    }

    public static String h(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return (wallPaperSettings == null || TextUtils.isEmpty(wallPaperSettings.emoticon)) ? "" : wallPaper.settings.emoticon;
    }

    public static void l(String str) {
        new ImageReceiver(null).d0(jn5.b(ls6.d0(yac.t0).V(str)), "50_50", null, null, null, 0);
        pv3.k(str);
    }

    public static boolean t(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.id == wallPaper2.id;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(h(wallPaper), h(wallPaper2));
            }
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i = this.currentAccount;
        byte b = 0;
        if (j >= 0) {
            tL_messages_setChatWallPaper.peer = uc7.n1(uc7.s1(i).X1(Long.valueOf(j)));
            tL_messages_setChatWallPaper.revert = z2;
            if (!z2) {
                TLRPC.UserFull Y1 = getMessagesController().Y1(j);
                if (Y1 != null) {
                    Y1.wallpaper = null;
                    Y1.flags &= -16777217;
                    getMessagesStorage().g2(Y1, false);
                }
                p(j, null);
                if (z) {
                    jn7.f(this.currentAccount).k(jn7.E0, Long.valueOf(j), Y1);
                }
            }
        } else {
            long j2 = -j;
            tL_messages_setChatWallPaper.peer = uc7.l1(uc7.s1(i).M0(Long.valueOf(j2)));
            TLRPC.ChatFull N0 = getMessagesController().N0(j2);
            if (N0 != null) {
                N0.wallpaper = null;
                N0.flags2 &= -129;
                getMessagesStorage().K1(N0, false);
            }
            p(j, null);
            if (z) {
                jn7 f = jn7.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(jn7.T, N0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new xe2(b));
    }

    public final ArrayList b() {
        SharedPreferences f = f();
        int i = f.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.v(f.getString("theme_" + i2, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new ez3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        return arrayList;
    }

    public final TLRPC.WallPaper c(long j) {
        if (j >= 0) {
            TLRPC.UserFull Y1 = getMessagesController().Y1(j);
            if (Y1 != null) {
                return Y1.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j);
            if (N0 != null) {
                return N0.wallpaper;
            }
        }
        String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatWallpaper_" + this.currentAccount + "_" + j, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        return null;
    }

    public final ArrayList d(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i, 1);
        boolean hasFlag2 = TLObject.hasFlag(i, 2);
        boolean hasFlag3 = TLObject.hasFlag(i, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i2 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((ez3) arrayList3.get(0)).a)) {
            ez3 ez3Var = new ez3(this.currentAccount);
            ez3Var.e = "❌";
            ez3Var.c = dpb.d("❌");
            ez3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            ez3Var.a = true;
            dz3 dz3Var = new dz3();
            dz3Var.a = ez3.d(true);
            ArrayList arrayList4 = ez3Var.f;
            arrayList4.add(dz3Var);
            dz3 dz3Var2 = new dz3();
            dz3Var2.a = ez3.d(false);
            arrayList4.add(dz3Var2);
            arrayList3.add(0, ez3Var);
        }
        int size = arrayList3.size();
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            ((ez3) obj).k();
        }
        return arrayList3;
    }

    public final SharedPreferences f() {
        return bp1.k(new StringBuilder("chatthemeconfig_"), this.currentAccount, a.b, 0);
    }

    public final ez3 g(dpb dpbVar) {
        if (dpbVar == null) {
            return null;
        }
        String str = dpbVar.b;
        if (!TextUtils.isEmpty(str)) {
            return (ez3) this.e.get(str);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ez3 ez3Var = (ez3) obj;
            if (dpbVar.equals(ez3Var.c)) {
                return ez3Var;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        SharedPreferences f = f();
        this.c = 0L;
        this.d = 0L;
        try {
            this.c = f.getLong("hash", 0L);
            this.d = f.getLong("lastReload", 0L);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.b = b();
        jf7 messagesStorage = getMessagesStorage();
        int i = 0;
        te2 te2Var = new te2(this, 0 == true ? 1 : 0);
        messagesStorage.getClass();
        messagesStorage.H(new t87(messagesStorage, te2Var, (byte) 13));
        l("❌");
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l(((ez3) obj).e);
        }
    }

    public final void j(boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ez3 ez3Var = (ez3) obj;
            if (ez3Var.h(z ? 1 : 0) != 0) {
                TLRPC.WallPaper j = ez3Var.j(z ? 1 : 0);
                if (!((j == null || j.document == null) ? true : j.pattern ? nvc.b(pi5.c(lvc.b(j))).exists() : v2f.a(v2f.c(j.id)).exists())) {
                    ez3Var.n(z ? 1 : 0, null);
                }
            }
        }
    }

    public final void k(boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ez3 ez3Var = (ez3) obj;
            long h = ez3Var.h(z ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                ez3Var.p(z ? 1 : 0, new rd1((Object) this, (byte) 25));
            }
        }
    }

    public final void m(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        byte b = 0;
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull N0 = getMessagesController().N0(-wf3.n(tL_updatePeerWallpaper.peer));
            if (N0 == null || t(N0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j = -N0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                N0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                N0.flags2 |= 128;
            } else {
                N0.wallpaper = null;
                N0.flags2 &= -129;
            }
            getMessagesStorage().K1(N0, false);
            p(j, N0.wallpaper);
            hl.c3(new ve2(this, N0, b));
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(tL_updatePeerWallpaper.peer.user_id);
        if (Y1 == null || t(Y1.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j2 = Y1.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            Y1.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
            Y1.wallpaper = tL_updatePeerWallpaper.wallpaper;
            Y1.flags |= 16777216;
        } else {
            Y1.wallpaper_overridden = false;
            Y1.wallpaper = null;
            Y1.flags &= -16777217;
        }
        getMessagesStorage().g2(Y1, false);
        p(j2, Y1.wallpaper);
        hl.c3(new ue2((Object) this, j2, (Object) Y1, (byte) 0));
    }

    public final void n(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (hashMap.containsKey(str)) {
                return;
            }
            ez3 ez3Var = new ez3(this.currentAccount, tL_chatThemeUniqueGift);
            ez3Var.k();
            hashMap.put(tL_chatThemeUniqueGift.gift.slug, ez3Var);
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.H(new t87(messagesStorage, Collections.singletonList(chatTheme), (byte) 21));
        }
    }

    public final void o(ResultCallback resultCallback, boolean z) {
        if (this.c == 0 || this.d == 0) {
            i();
        }
        byte b = 0;
        boolean z2 = System.currentTimeMillis() - this.d > 7200000;
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || z2) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            to3 to3Var = s;
            Objects.requireNonNull(to3Var);
            connectionsManager.sendRequestTyped(getchatthemes, new pe2(to3Var, b), new se2(this, resultCallback, z, b));
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(d((z ? 1 : 0) | 2));
    }

    public final void p(long j, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().remove("chatWallpaper_" + this.currentAccount + "_" + j).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String f = Utilities.f(serializedData.toByteArray());
        a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().putString("chatWallpaper_" + this.currentAccount + "_" + j, f).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(long j, dpb dpbVar, TLRPC.ChatTheme chatTheme, boolean z) {
        String str;
        String str2;
        TLRPC.Tl_inputChatThemeEmpty tl_inputChatThemeEmpty;
        LongSparseArray longSparseArray = this.h;
        if (dpb.a((dpb) longSparseArray.get(j), dpbVar)) {
            return;
        }
        if (dpbVar == null) {
            longSparseArray.delete(j);
            str = null;
        } else {
            longSparseArray.put(j, dpbVar);
            str = dpbVar.b;
        }
        r(j, str);
        if (j >= 0) {
            TLRPC.UserFull Y1 = getMessagesController().Y1(j);
            if (Y1 != null && (dpbVar == null || dpbVar.b() || chatTheme != null)) {
                Y1.theme = chatTheme;
                getMessagesStorage().g2(Y1, true);
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j);
            if (N0 != null) {
                N0.theme_emoticon = dpbVar != null ? dpbVar.a : null;
                getMessagesStorage().K1(N0, true);
            }
        }
        SharedPreferences.Editor edit = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        String str3 = "chatTheme_" + this.currentAccount + "_" + j;
        if (dpbVar != null) {
            String str4 = dpbVar.a;
            String str5 = dpbVar.b;
            if (str5 != null) {
                str2 = "gift_".concat(str5);
            } else if (str4 != null) {
                str2 = "emoticon_".concat(str4);
            }
            edit.putString(str3, str2).apply();
            if (z) {
                return;
            }
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            if (dpbVar != null) {
                String str6 = dpbVar.a;
                if (TextUtils.isEmpty(str6)) {
                    String str7 = dpbVar.b;
                    if (!TextUtils.isEmpty(str7)) {
                        TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift = new TLRPC.Tl_inputChatThemeUniqueGift();
                        tl_inputChatThemeUniqueGift.slug = str7;
                        tl_inputChatThemeEmpty = tl_inputChatThemeUniqueGift;
                    }
                } else {
                    TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
                    tl_inputChatTheme.emoticon = str6;
                    tl_inputChatThemeEmpty = tl_inputChatTheme;
                }
                tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
                tL_messages_setChatTheme.peer = getMessagesController().j1(j);
                getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new n82(this, (byte) 2));
                return;
            }
            tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().j1(j);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new n82(this, (byte) 2));
            return;
        }
        str2 = null;
        edit.putString(str3, str2).apply();
        if (z) {
        }
    }

    public final void r(long j, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.r;
        HashMap hashMap2 = this.n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j));
            if (str2 != null) {
                hashMap.remove(str2);
                return;
            }
            return;
        }
        if (j == 0) {
            Long l = (Long) hashMap.remove(str);
            if (l != null) {
                hashMap2.remove(l);
                return;
            }
            return;
        }
        String str3 = (String) hashMap2.put(Long.valueOf(j), str);
        Long l2 = (Long) hashMap.put(str, Long.valueOf(j));
        if (str3 != null && !TextUtils.equals(str, str3)) {
            hashMap.remove(str3);
        }
        if (l2 == null || l2.longValue() == j) {
            return;
        }
        hashMap2.remove(l2);
    }

    public final int s(long j, String str, unb unbVar, r47 r47Var, kc kcVar) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper;
        boolean z;
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper2 = new TLRPC.TL_messages_setChatWallPaper();
        int i = this.currentAccount;
        if (j >= 0) {
            tL_messages_setChatWallPaper2.peer = uc7.n1(uc7.s1(i).X1(Long.valueOf(j)));
        } else {
            tL_messages_setChatWallPaper2.peer = uc7.l1(uc7.s1(i).M0(Long.valueOf(-j)));
        }
        tL_messages_setChatWallPaper2.for_both = unbVar.o;
        if (r47Var == null || !(r47Var.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper = tL_messages_setChatWallPaper2;
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = uc7.r1(unbVar);
            z = true;
        } else {
            tL_messages_setChatWallPaper2.flags |= 2;
            tL_messages_setChatWallPaper2.id = r47Var.e1();
            int i2 = this.currentAccount;
            TLRPC.WallPaper wallPaper = null;
            if (j >= 0) {
                userFull = uc7.s1(i2).Y1(j);
                N0 = null;
            } else {
                N0 = uc7.s1(i2).N0(-j);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) r47Var.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_messages_setChatWallPaper = tL_messages_setChatWallPaper2;
            tL_wallPaper.id = wallPaper2.id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (unbVar.k * 100.0f);
            tL_wallPaperSettings.motion = unbVar.j;
            tL_wallPaperSettings.blur = unbVar.i;
            tL_wallPaperSettings.background_color = unbVar.d;
            tL_wallPaperSettings.second_background_color = unbVar.e;
            tL_wallPaperSettings.third_background_color = unbVar.f;
            tL_wallPaperSettings.fourth_background_color = unbVar.g;
            tL_wallPaperSettings.rotation = unbVar.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull = N0;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i3 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i3 | 4;
            z = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().g2(userFull, false);
                jn7.f(this.currentAccount).k(jn7.E0, Long.valueOf(j), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().K1(chatFull, false);
                jn7 f = jn7.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(jn7.T, chatFull, 0, bool, bool);
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = uc7.d2(unbVar);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new rs0((Object) this, j, z, (Object) str, (Runnable) kcVar, (byte) 1));
    }
}
