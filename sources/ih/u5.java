package ih;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kh.oc;
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
import org.telegram.messenger.dk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b61;
import org.telegram.ui.qk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u5(v6 v6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 0;
        this.d = v6Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Utilities.Callback callback;
        int i9 = this.a;
        boolean z10 = this.c;
        boolean z11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i10 = 0;
        switch (i9) {
            case 0:
                v6 v6Var = (v6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = v6Var.a;
                SharedPreferences sharedPreferences = v6Var.l;
                if (z11) {
                    v6Var.r = false;
                } else {
                    v6Var.q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        v6Var.v = tL_stories_allStories.count;
                        v6Var.z = tL_stories_allStories.has_more;
                        v6Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", v6Var.y).putBoolean("last_stories_has_more_hidden", v6Var.z).putInt("total_stores_hidden", v6Var.v).apply();
                    } else {
                        v6Var.u = tL_stories_allStories.count;
                        v6Var.p = tL_stories_allStories.has_more;
                        v6Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", v6Var.o).putBoolean("last_stories_has_more", v6Var.p).putInt("total_stores", v6Var.u).apply();
                    }
                    v6Var.Y(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        v6Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        v6Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", v6Var.y).apply();
                    } else {
                        v6Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        v6Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", v6Var.o).apply();
                    }
                    if (z11 ? v6Var.z : v6Var.p) {
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                i7 i7Var = (i7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                bg.d2 d2Var = (bg.d2) obj;
                int i12 = i7Var.a;
                MessagesStorage messagesStorage = i7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = i7Var.f(arrayList2.get(i14).id, peerDialogId);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f10);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i12).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i12).getChat(j10);
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
                    } catch (Throwable th) {
                        messagesStorage.checkSQLException(th);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    i7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(d2Var);
                break;
            case 2:
                ProfileActivity.l0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 3:
                final b61 b61Var = (b61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(b61Var.R).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                qk0 qk0Var = new qk0(b61Var, str, this.b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.c);
                int i16 = b61Var.S;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.j41
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i10) {
                                case 0:
                                    MediaDataController.getInstance(b61Var.R).getEmojiSuggestions(b61.W1, str, false, new nl0(16, linkedHashSet2, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(b61Var.R).getAnimatedEmojiByKeywords(str, new l41(linkedHashSet2, runnable, 0));
                                    break;
                            }
                        }
                    }, qk0Var);
                    break;
                } else if (i16 == 14) {
                    if (fullyConsistsOfEmojis) {
                        final int i17 = 0;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.k41
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i17) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(b61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i18 = 0; i18 < availableEffects.effects.size(); i18++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i18);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(hg.r0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        b61 b61Var2 = b61Var;
                                        MediaDataController.getInstance(b61Var2.R).getEmojiSuggestions(b61.W1, str, false, new a1.d(b61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i18 = 1;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.k41
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i18) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(b61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i182 = 0; i182 < availableEffects.effects.size(); i182++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i182);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(hg.r0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        b61 b61Var2 = b61Var;
                                        MediaDataController.getInstance(b61Var2.R).getEmojiSuggestions(b61.W1, str, false, new a1.d(b61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, qk0Var);
                    break;
                } else {
                    final int i19 = 1;
                    Utilities.doCallbacks(new oc(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() { // from class: org.telegram.ui.j41
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i19) {
                                case 0:
                                    MediaDataController.getInstance(b61Var.R).getEmojiSuggestions(b61.W1, str, false, new nl0(16, linkedHashSet, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(b61Var.R).getAnimatedEmojiByKeywords(str, new l41(linkedHashSet, runnable, 0));
                                    break;
                            }
                        }
                    }, new bg.j1(b61Var, strArr, str, linkedHashSet, 13), new dk(b61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new bg.j1((Object) b61Var, str, (Object) arrayList6, (Object) hashMap, 14), new org.telegram.ui.a0(b61Var, str, arrayList7, 8), qk0Var);
                    break;
                }
            case 4:
                Runnable runnable = (Runnable) obj;
                ((xf.q0) obj3).l((xf.r0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                xf.q0 q0Var = ((xf.a1) obj3).y.c;
                qu0 qu0Var = q0Var.g;
                w4.e h = q0Var.h(new RectF(0.0f, 0.0f, qu0Var.a, qu0Var.b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ u5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    public /* synthetic */ u5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ u5(xf.a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 5;
        this.d = a1Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
