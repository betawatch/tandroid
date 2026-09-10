package og;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import bi.we;
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
import org.telegram.messenger.vk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hl0;
import org.telegram.ui.l71;
import zh.i5;
import zh.v5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p0(int i10, Object obj, Object obj2, Object obj3, boolean z10, boolean z11) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Utilities.Callback callback;
        int i10 = this.a;
        boolean z10 = this.c;
        boolean z11 = this.b;
        final int i11 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((v0) obj3).l((w0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                v0 v0Var = ((f1) obj3).y.c;
                tv0 tv0Var = v0Var.g;
                u0 h = v0Var.h(new RectF(0.0f, 0.0f, tv0Var.a, tv0Var.b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 3:
                final l71 l71Var = (l71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(l71Var.V).getReactionsMap();
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList3 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList4 = new ArrayList();
                hl0 hl0Var = new hl0(l71Var, str, this.b, arrayList, reactionsMap, arrayList2, linkedHashSet, linkedHashSet2, arrayList4, arrayList3, this.c);
                int i12 = l71Var.W;
                if (i12 == 13) {
                    final int i13 = 0;
                    Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.t51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (i13) {
                                case 0:
                                    MediaDataController.getInstance(l71Var.V).getEmojiSuggestions(l71.a2, str, false, new fz0(2, linkedHashSet2, runnable2), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(l71Var.V).getAnimatedEmojiByKeywords(str, new v51(linkedHashSet2, runnable2, 0));
                                    break;
                            }
                        }
                    }, hl0Var);
                    break;
                } else if (i12 == 14) {
                    if (fullyConsistsOfEmojis) {
                        final int i14 = 0;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.u51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i14) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(l71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i15 = 0; i15 < availableEffects.effects.size(); i15++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i15);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList).add(yg.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        break;
                                    default:
                                        l71 l71Var2 = l71Var;
                                        MediaDataController.getInstance(l71Var2.V).getEmojiSuggestions(l71.a2, str, false, new a1.d(l71Var2, arrayList2, arrayList, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i15 = 1;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.u51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i15) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(l71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i152 = 0; i152 < availableEffects.effects.size(); i152++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i152);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList).add(yg.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        break;
                                    default:
                                        l71 l71Var2 = l71Var;
                                        MediaDataController.getInstance(l71Var2.V).getEmojiSuggestions(l71.a2, str, false, new a1.d(l71Var2, arrayList2, arrayList, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, hl0Var);
                    break;
                } else {
                    Utilities.doCallbacks(new we(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() { // from class: org.telegram.ui.t51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (i11) {
                                case 0:
                                    MediaDataController.getInstance(l71Var.V).getEmojiSuggestions(l71.a2, str, false, new fz0(2, linkedHashSet, runnable2), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(l71Var.V).getAnimatedEmojiByKeywords(str, new v51(linkedHashSet, runnable2, 0));
                                    break;
                            }
                        }
                    }, new gg.u1(l71Var, strArr, str, linkedHashSet, 9), new vk(l71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList), new gg.u1(l71Var, str, arrayList3, hashMap, 10), new org.telegram.ui.z(l71Var, str, arrayList4, 8), hl0Var);
                    break;
                }
            case 4:
                i5 i5Var = (i5) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = i5Var.a;
                SharedPreferences sharedPreferences = i5Var.l;
                if (z11) {
                    i5Var.r = false;
                } else {
                    i5Var.q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i16).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        i5Var.v = tL_stories_allStories.count;
                        i5Var.z = tL_stories_allStories.has_more;
                        i5Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", i5Var.y).putBoolean("last_stories_has_more_hidden", i5Var.z).putInt("total_stores_hidden", i5Var.v).apply();
                    } else {
                        i5Var.u = tL_stories_allStories.count;
                        i5Var.p = tL_stories_allStories.has_more;
                        i5Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", i5Var.o).putBoolean("last_stories_has_more", i5Var.p).putInt("total_stores", i5Var.u).apply();
                    }
                    i5Var.Y(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        i5Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        i5Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", i5Var.y).apply();
                    } else {
                        i5Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        i5Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", i5Var.o).apply();
                    }
                    if (z11 ? i5Var.z : i5Var.p) {
                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        break;
                    }
                }
                break;
            default:
                v5 v5Var = (v5) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                int i17 = v5Var.a;
                MessagesStorage messagesStorage = v5Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i18);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                            if (arrayList6.get(i19) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = v5Var.f(arrayList6.get(i19).id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList6.set(i19, f7);
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
                        ArrayList arrayList7 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i17).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z10 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(j3));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i17).getChat(j3);
                                }
                                if (chat == null || (chat.stories_hidden == z10 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList7));
                        }
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList7) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        messagesStorage.checkSQLException(th2);
                    }
                }
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i20);
                    v5Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(d1Var);
                break;
        }
    }

    public /* synthetic */ p0(f1 f1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 1;
        this.d = f1Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }

    public /* synthetic */ p0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ p0(i5 i5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 4;
        this.d = i5Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z11;
    }
}
