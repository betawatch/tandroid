package ai;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import ci.ed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c8(m9 m9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 0;
        this.d = m9Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Utilities.Callback callback;
        int i10 = this.a;
        boolean z10 = this.c;
        boolean z11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i11 = 0;
        switch (i10) {
            case 0:
                m9 m9Var = (m9) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = m9Var.a;
                SharedPreferences sharedPreferences = m9Var.l;
                if (z11) {
                    m9Var.r = false;
                } else {
                    m9Var.q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        m9Var.v = tL_stories_allStories.count;
                        m9Var.z = tL_stories_allStories.has_more;
                        m9Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", m9Var.y).putBoolean("last_stories_has_more_hidden", m9Var.z).putInt("total_stores_hidden", m9Var.v).apply();
                    } else {
                        m9Var.u = tL_stories_allStories.count;
                        m9Var.p = tL_stories_allStories.has_more;
                        m9Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", m9Var.o).putBoolean("last_stories_has_more", m9Var.p).putInt("total_stores", m9Var.u).apply();
                    }
                    m9Var.Y(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        m9Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        m9Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", m9Var.y).apply();
                    } else {
                        m9Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        m9Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", m9Var.o).apply();
                    }
                    if (z11 ? m9Var.z : m9Var.p) {
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                z9 z9Var = (z9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                f fVar = (f) obj;
                int i13 = z9Var.a;
                MessagesStorage messagesStorage = z9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = i11; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = z9Var.f(arrayList2.get(i15).id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, f7);
                                }
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    i14++;
                    i11 = 0;
                }
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i13).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i13).getChat(j3);
                                }
                                if (chat == null || (chat.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        messagesStorage.checkSQLException(th2);
                    }
                }
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i16);
                    z9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(fVar);
                break;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 3:
                final k71 k71Var = (k71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(k71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z12 = this.b;
                final boolean z13 = this.c;
                Utilities.Callback callback2 = new Utilities.Callback() { // from class: org.telegram.ui.q51
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        final k71 k71Var2 = k71.this;
                        final String str2 = str;
                        final boolean z14 = z12;
                        final ArrayList arrayList8 = arrayList4;
                        final HashMap hashMap2 = reactionsMap;
                        final ArrayList arrayList9 = arrayList5;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList10 = arrayList7;
                        final ArrayList arrayList11 = arrayList6;
                        final boolean z15 = z13;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.u51
                            @Override // java.lang.Runnable
                            public final void run() {
                                k71 k71Var3 = k71.this;
                                m51 m51Var = k71Var3.I1;
                                if (m51Var != null) {
                                    AndroidUtilities.cancelRunOnUIThread(m51Var);
                                    k71Var3.I1 = null;
                                }
                                String str3 = k71Var3.z1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                k71Var3.y1 = true;
                                k71Var3.z(true, z14);
                                b61 b61Var = k71Var3.f0;
                                if (b61Var != null) {
                                    b61Var.d(true);
                                }
                                ArrayList arrayList12 = k71Var3.A1;
                                if (arrayList12 == null) {
                                    k71Var3.A1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = k71Var3.D1;
                                if (arrayList13 == null) {
                                    k71Var3.D1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = k71Var3.C1;
                                if (arrayList14 == null) {
                                    k71Var3.C1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = k71Var3.B1;
                                if (arrayList15 == null) {
                                    k71Var3.B1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i17 = 0;
                                k71Var3.i0.u0(0);
                                int i18 = k71Var3.W;
                                if (i18 == 1 || i18 == 14 || i18 == 11 || i18 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (arrayList16.isEmpty()) {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap2.get(str4);
                                        if (tL_availableReaction != null) {
                                            k71Var3.A1.add(zg.n0.c(tL_availableReaction));
                                        }
                                    } else {
                                        k71Var3.A1.addAll(arrayList16);
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        k71Var3.B1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l4 = (Long) it.next();
                                    l4.getClass();
                                    ArrayList arrayList18 = k71Var3.A1;
                                    zg.n0 n0Var = new zg.n0();
                                    long longValue2 = l4.longValue();
                                    n0Var.g = longValue2;
                                    n0Var.h = longValue2;
                                    arrayList18.add(n0Var);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    k71Var3.A1.add(zg.n0.b((String) it2.next()));
                                }
                                k71Var3.D1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i17 < size) {
                                    Object obj5 = arrayList19.get(i17);
                                    i17++;
                                    k71Var3.C1.addAll((ArrayList) obj5);
                                }
                                k71Var3.q0.E(true ^ z15);
                            }
                        });
                    }
                };
                int i17 = k71Var.W;
                final int i18 = 1;
                if (i17 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.r51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i11) {
                                case 0:
                                    MediaDataController.getInstance(k71Var.V).getEmojiSuggestions(k71.a2, str, false, new ls0(8, linkedHashSet2, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(k71Var.V).getAnimatedEmojiByKeywords(str, new t51(linkedHashSet2, runnable, 0));
                                    break;
                            }
                        }
                    }, callback2);
                    break;
                } else if (i17 == 14) {
                    if (fullyConsistsOfEmojis) {
                        final int i19 = 0;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.s51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(k71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i20 = 0; i20 < availableEffects.effects.size(); i20++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i20);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(zg.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        k71 k71Var2 = k71Var;
                                        MediaDataController.getInstance(k71Var2.V).getEmojiSuggestions(k71.a2, str, false, new a1.d(k71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i20 = 1;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.s51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i20) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(k71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i202 = 0; i202 < availableEffects.effects.size(); i202++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i202);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(zg.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        k71 k71Var2 = k71Var;
                                        MediaDataController.getInstance(k71Var2.V).getEmojiSuggestions(k71.a2, str, false, new a1.d(k71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, callback2);
                    break;
                } else {
                    Utilities.doCallbacks(new ed(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() { // from class: org.telegram.ui.r51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i18) {
                                case 0:
                                    MediaDataController.getInstance(k71Var.V).getEmojiSuggestions(k71.a2, str, false, new ls0(8, linkedHashSet, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(k71Var.V).getAnimatedEmojiByKeywords(str, new t51(linkedHashSet, runnable, 0));
                                    break;
                            }
                        }
                    }, new f4(k71Var, strArr, str, linkedHashSet, 12), new jk(k71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new f4((Object) k71Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.z(k71Var, str, arrayList7, 12), callback2);
                    break;
                }
            case 4:
                Runnable runnable = (Runnable) obj;
                ((pg.s0) obj3).l((pg.t0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                pg.s0 s0Var = ((pg.c1) obj3).y.c;
                mw0 mw0Var = s0Var.g;
                n6.t h = s0Var.h(new RectF(0.0f, 0.0f, mw0Var.a, mw0Var.b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ c8(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    public /* synthetic */ c8(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ c8(pg.c1 c1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 5;
        this.d = c1Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
