package bi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import di.cd;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n7(x8 x8Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 0;
        this.d = x8Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Utilities.Callback callback;
        int i10 = this.a;
        int i11 = 4;
        boolean z10 = this.c;
        boolean z11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i12 = 0;
        switch (i10) {
            case 0:
                x8 x8Var = (x8) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = x8Var.a;
                SharedPreferences sharedPreferences = x8Var.l;
                if (z11) {
                    x8Var.r = false;
                } else {
                    x8Var.q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i13).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        x8Var.v = tL_stories_allStories.count;
                        x8Var.z = tL_stories_allStories.has_more;
                        x8Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", x8Var.y).putBoolean("last_stories_has_more_hidden", x8Var.z).putInt("total_stores_hidden", x8Var.v).apply();
                    } else {
                        x8Var.u = tL_stories_allStories.count;
                        x8Var.p = tL_stories_allStories.has_more;
                        x8Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", x8Var.o).putBoolean("last_stories_has_more", x8Var.p).putInt("total_stores", x8Var.u).apply();
                    }
                    x8Var.Y(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        x8Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        x8Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", x8Var.y).apply();
                    } else {
                        x8Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        x8Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", x8Var.o).apply();
                    }
                    if (z11 ? x8Var.z : x8Var.p) {
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                k9 k9Var = (k9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ah.j jVar = (ah.j) obj;
                int i14 = k9Var.a;
                MessagesStorage messagesStorage = k9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i15);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i16 = i12; i16 < arrayList2.size(); i16++) {
                            if (arrayList2.get(i16) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = k9Var.f(arrayList2.get(i16).id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i16, f7);
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    i15++;
                    i12 = 0;
                }
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i14).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i14).getChat(j10);
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
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i17);
                    k9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(jVar);
                break;
            case 2:
                m4.w wVar = (m4.w) obj;
                m4.f0 f0Var = ((m4.q0) ((m.d3) obj3).d).g;
                m4.n1 n1Var = f0Var.t;
                w7.w.b(n1Var, (m4.x) obj2);
                int d = n1Var.d();
                if (z11) {
                    if (d == 1) {
                        if (n1Var.o0(2)) {
                            n1Var.b();
                        }
                    } else if (d == 4 && n1Var.o0(4)) {
                        n1Var.G();
                    }
                }
                if (z10 && n1Var.o0(1)) {
                    n1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    v7.u6.p(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z10) {
                    v7.u6.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                v7.u6.p(!false);
                f0Var.p(wVar);
                break;
            case 3:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 4:
                final r71 r71Var = (r71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(r71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z12 = this.b;
                final boolean z13 = this.c;
                Utilities.Callback callback2 = new Utilities.Callback() { // from class: org.telegram.ui.x51
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        final r71 r71Var2 = r71.this;
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
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.b61
                            @Override // java.lang.Runnable
                            public final void run() {
                                r71 r71Var3 = r71.this;
                                t51 t51Var = r71Var3.I1;
                                if (t51Var != null) {
                                    AndroidUtilities.cancelRunOnUIThread(t51Var);
                                    r71Var3.I1 = null;
                                }
                                String str3 = r71Var3.z1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                r71Var3.y1 = true;
                                r71Var3.z(true, z14);
                                i61 i61Var = r71Var3.f0;
                                if (i61Var != null) {
                                    i61Var.e(true);
                                }
                                ArrayList arrayList12 = r71Var3.A1;
                                if (arrayList12 == null) {
                                    r71Var3.A1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = r71Var3.D1;
                                if (arrayList13 == null) {
                                    r71Var3.D1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = r71Var3.C1;
                                if (arrayList14 == null) {
                                    r71Var3.C1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = r71Var3.B1;
                                if (arrayList15 == null) {
                                    r71Var3.B1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i19 = 0;
                                r71Var3.i0.u0(0);
                                int i20 = r71Var3.W;
                                if (i20 == 1 || i20 == 14 || i20 == 11 || i20 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (arrayList16.isEmpty()) {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap2.get(str4);
                                        if (tL_availableReaction != null) {
                                            r71Var3.A1.add(ah.i1.c(tL_availableReaction));
                                        }
                                    } else {
                                        r71Var3.A1.addAll(arrayList16);
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        r71Var3.B1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l4 = (Long) it.next();
                                    l4.getClass();
                                    ArrayList arrayList18 = r71Var3.A1;
                                    ah.i1 i1Var = new ah.i1();
                                    long longValue2 = l4.longValue();
                                    i1Var.g = longValue2;
                                    i1Var.h = longValue2;
                                    arrayList18.add(i1Var);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    r71Var3.A1.add(ah.i1.b((String) it2.next()));
                                }
                                r71Var3.D1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i19 < size) {
                                    Object obj5 = arrayList19.get(i19);
                                    i19++;
                                    r71Var3.C1.addAll((ArrayList) obj5);
                                }
                                r71Var3.q0.E(true ^ z15);
                            }
                        });
                    }
                };
                int i19 = r71Var.W;
                final int i20 = 1;
                if (i19 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.y51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i12) {
                                case 0:
                                    MediaDataController.getInstance(r71Var.V).getEmojiSuggestions(r71.a2, str, false, new cs0(11, linkedHashSet2, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(r71Var.V).getAnimatedEmojiByKeywords(str, new a61(linkedHashSet2, runnable, 0));
                                    break;
                            }
                        }
                    }, callback2);
                    break;
                } else if (i19 == 14) {
                    if (fullyConsistsOfEmojis) {
                        final int i21 = 0;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.z51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i21) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i22 = 0; i22 < availableEffects.effects.size(); i22++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i22);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ah.i1.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        r71 r71Var2 = r71Var;
                                        MediaDataController.getInstance(r71Var2.V).getEmojiSuggestions(r71.a2, str, false, new a1.d(r71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i22 = 1;
                        callback = new Utilities.Callback() { // from class: org.telegram.ui.z51
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj4) {
                                switch (i22) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i222 = 0; i222 < availableEffects.effects.size(); i222++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i222);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ah.i1.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        r71 r71Var2 = r71Var;
                                        MediaDataController.getInstance(r71Var2.V).getEmojiSuggestions(r71.a2, str, false, new a1.d(r71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, callback2);
                    break;
                } else {
                    Utilities.doCallbacks(new cd(fullyConsistsOfEmojis, str, linkedHashSet, i11), new Utilities.Callback() { // from class: org.telegram.ui.y51
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i20) {
                                case 0:
                                    MediaDataController.getInstance(r71Var.V).getEmojiSuggestions(r71.a2, str, false, new cs0(11, linkedHashSet, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(r71Var.V).getAnimatedEmojiByKeywords(str, new a61(linkedHashSet, runnable, 0));
                                    break;
                            }
                        }
                    }, new u3(r71Var, strArr, str, linkedHashSet, 12), new mk(r71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new u3((Object) r71Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.z(r71Var, str, arrayList7, 12), callback2);
                    break;
                }
            case 5:
                Runnable runnable = (Runnable) obj;
                ((qg.q0) obj3).l((qg.r0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                qg.q0 q0Var = ((qg.a1) obj3).y.c;
                iw0 iw0Var = q0Var.g;
                m4.c h = q0Var.h(new RectF(0.0f, 0.0f, iw0Var.a, iw0Var.b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ n7(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    public /* synthetic */ n7(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 3;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ n7(qg.a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 6;
        this.d = a1Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
