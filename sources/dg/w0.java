package dg;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import oh.g7;
import oh.t6;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r61;
import org.telegram.ui.wk0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w0(m1 m1Var, boolean z4, boolean z10, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 1;
        this.d = m1Var;
        this.b = z4;
        this.c = z10;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Utilities.Callback callback;
        int i10 = this.a;
        boolean z4 = this.c;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i11 = 0;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((c1) obj3).l((d1) obj2, z10, z4);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                c1 c1Var = ((m1) obj3).y.c;
                kv0 kv0Var = c1Var.g;
                bf.b h = c1Var.h(new RectF(0.0f, 0.0f, kv0Var.a, kv0Var.b), false, z10, z4);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
            case 2:
                t6 t6Var = (t6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = t6Var.a;
                SharedPreferences sharedPreferences = t6Var.l;
                if (z10) {
                    t6Var.r = false;
                } else {
                    t6Var.q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z10) {
                        t6Var.v = tL_stories_allStories.count;
                        t6Var.z = tL_stories_allStories.has_more;
                        t6Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", t6Var.y).putBoolean("last_stories_has_more_hidden", t6Var.z).putInt("total_stores_hidden", t6Var.v).apply();
                    } else {
                        t6Var.u = tL_stories_allStories.count;
                        t6Var.p = tL_stories_allStories.has_more;
                        t6Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", t6Var.o).putBoolean("last_stories_has_more", t6Var.p).putInt("total_stores", t6Var.u).apply();
                    }
                    t6Var.Y(tL_stories_allStories, z10, false, z4);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z10) {
                        t6Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        t6Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", t6Var.y).apply();
                    } else {
                        t6Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        t6Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", t6Var.o).apply();
                    }
                    if (z10 ? t6Var.z : t6Var.p) {
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        break;
                    }
                }
                break;
            case 3:
                g7 g7Var = (g7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ag.f fVar = (ag.f) obj;
                int i13 = g7Var.a;
                MessagesStorage messagesStorage = g7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = g7Var.f(arrayList2.get(i15).id, peerDialogId);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, f10);
                                }
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (!z10) {
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
                                if (user == null || (user.stories_hidden == z4 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i13).getChat(j10);
                                }
                                if (chat == null || (chat.stories_hidden == z4 && !arrayList3.contains(Long.valueOf(longValue)))) {
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
                    g7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(fVar);
                break;
            case 4:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z10, z4);
                break;
            default:
                final r61 r61Var = (r61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(r61Var.S).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                wk0 wk0Var = new wk0(r61Var, str, this.b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.c);
                int i17 = r61Var.T;
                if (i17 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.x41
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (i11) {
                                case 0:
                                    MediaDataController.getInstance(r61Var.S).getEmojiSuggestions(r61.X1, str, false, new vl0(15, linkedHashSet2, runnable2), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(r61Var.S).getAnimatedEmojiByKeywords(str, new z41(linkedHashSet2, runnable2, 0));
                                    break;
                            }
                        }
                    }, wk0Var);
                    break;
                } else if (i17 == 14) {
                    if (fullyConsistsOfEmojis) {
                        final int i18 = 0;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.y41
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i18) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r61Var.S).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i19 = 0; i19 < availableEffects.effects.size(); i19++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i19);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ng.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        break;
                                    default:
                                        r61 r61Var2 = r61Var;
                                        MediaDataController.getInstance(r61Var2.S).getEmojiSuggestions(r61.X1, str, false, new a1.d(r61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i19 = 1;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.y41
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r61Var.S).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i192 = 0; i192 < availableEffects.effects.size(); i192++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i192);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ng.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        break;
                                    default:
                                        r61 r61Var2 = r61Var;
                                        MediaDataController.getInstance(r61Var2.S).getEmojiSuggestions(r61.X1, str, false, new a1.d(r61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, wk0Var);
                    break;
                } else {
                    final int i20 = 1;
                    Utilities.doCallbacks(new ml(fullyConsistsOfEmojis, str, linkedHashSet, 3), new Utilities.Callback() { // from class: org.telegram.ui.x41
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (i20) {
                                case 0:
                                    MediaDataController.getInstance(r61Var.S).getEmojiSuggestions(r61.X1, str, false, new vl0(15, linkedHashSet, runnable2), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(r61Var.S).getAnimatedEmojiByKeywords(str, new z41(linkedHashSet, runnable2, 0));
                                    break;
                            }
                        }
                    }, new hg.c1(r61Var, strArr, str, linkedHashSet, 13), new ok(r61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new hg.c1(14, r61Var, arrayList6, hashMap, str), new org.telegram.ui.a0(r61Var, str, arrayList7, 8), wk0Var);
                    break;
                }
        }
    }

    public /* synthetic */ w0(Object obj, Object obj2, boolean z4, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z4;
        this.c = z10;
        this.f = obj3;
    }

    public /* synthetic */ w0(t6 t6Var, boolean z4, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z10) {
        this.a = 2;
        this.d = t6Var;
        this.b = z4;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z10;
    }

    public /* synthetic */ w0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z4, boolean z10) {
        this.a = 4;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z4;
        this.c = z10;
    }
}
