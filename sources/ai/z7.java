package ai;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import ci.hd;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g71;
import org.telegram.ui.il0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z7(l9 l9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 0;
        this.d = l9Var;
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
                l9 l9Var = (l9) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = l9Var.a;
                SharedPreferences sharedPreferences = l9Var.l;
                if (z11) {
                    l9Var.r = false;
                } else {
                    l9Var.q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        l9Var.v = tL_stories_allStories.count;
                        l9Var.z = tL_stories_allStories.has_more;
                        l9Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", l9Var.y).putBoolean("last_stories_has_more_hidden", l9Var.z).putInt("total_stores_hidden", l9Var.v).apply();
                    } else {
                        l9Var.u = tL_stories_allStories.count;
                        l9Var.p = tL_stories_allStories.has_more;
                        l9Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", l9Var.o).putBoolean("last_stories_has_more", l9Var.p).putInt("total_stores", l9Var.u).apply();
                    }
                    l9Var.Y(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        l9Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        l9Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", l9Var.y).apply();
                    } else {
                        l9Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        l9Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", l9Var.o).apply();
                    }
                    if (z11 ? l9Var.z : l9Var.p) {
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                y9 y9Var = (y9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                f fVar = (f) obj;
                int i13 = y9Var.a;
                MessagesStorage messagesStorage = y9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = y9Var.f(arrayList2.get(i15).id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, f7);
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
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
                    y9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(fVar);
                break;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 3:
                final g71 g71Var = (g71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(g71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                il0 il0Var = new il0(g71Var, str, this.b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.c);
                int i17 = g71Var.W;
                if (i17 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.o51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i11) {
                                case 0:
                                    MediaDataController.getInstance(g71Var.V).getEmojiSuggestions(g71.a2, str, false, new rv0(7, linkedHashSet2, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(g71Var.V).getAnimatedEmojiByKeywords(str, new q51(linkedHashSet2, runnable, 0));
                                    break;
                            }
                        }
                    }, il0Var);
                    break;
                } else if (i17 == 14) {
                    if (fullyConsistsOfEmojis) {
                        final int i18 = 0;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.p51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i18) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(g71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i19 = 0; i19 < availableEffects.effects.size(); i19++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i19);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(zg.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        g71 g71Var2 = g71Var;
                                        MediaDataController.getInstance(g71Var2.V).getEmojiSuggestions(g71.a2, str, false, new a1.d(g71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i19 = 1;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.p51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(g71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i192 = 0; i192 < availableEffects.effects.size(); i192++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i192);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(zg.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        g71 g71Var2 = g71Var;
                                        MediaDataController.getInstance(g71Var2.V).getEmojiSuggestions(g71.a2, str, false, new a1.d(g71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, il0Var);
                    break;
                } else {
                    final int i20 = 1;
                    Utilities.doCallbacks(new hd(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() { // from class: org.telegram.ui.o51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i20) {
                                case 0:
                                    MediaDataController.getInstance(g71Var.V).getEmojiSuggestions(g71.a2, str, false, new rv0(7, linkedHashSet, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(g71Var.V).getAnimatedEmojiByKeywords(str, new q51(linkedHashSet, runnable, 0));
                                    break;
                            }
                        }
                    }, new e4(g71Var, strArr, str, linkedHashSet, 11), new nk(g71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new e4((Object) g71Var, str, arrayList6, (Object) hashMap, 12), new org.telegram.ui.y(g71Var, str, arrayList7, 8), il0Var);
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
                vv0 vv0Var = s0Var.g;
                n7.z0 h = s0Var.h(new RectF(0.0f, 0.0f, vv0Var.a, vv0Var.b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ z7(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    public /* synthetic */ z7(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ z7(pg.c1 c1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 5;
        this.d = c1Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
