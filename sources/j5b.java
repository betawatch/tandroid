// default package

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class j5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j5b(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        a5c a5cVar = (a5c) this.c;
        long j = this.b;
        v4c v4cVar = (v4c) this.d;
        synchronized (a5cVar) {
            ArrayList arrayList = (ArrayList) a5cVar.I.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(v4cVar);
                if (arrayList.isEmpty()) {
                    a5cVar.I.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = a5cVar.getMessagesController().j1(j);
        tL_messages_translateRichMessage.id = v4cVar.b;
        tL_messages_translateRichMessage.to_lang = a5c.D(v4cVar.d);
        int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new p87((Object) a5cVar, (Object) v4cVar, j, (byte) 21));
        synchronized (a5cVar) {
            v4cVar.f = sendRequest;
        }
    }

    private final void b() {
        a5c a5cVar = (a5c) this.c;
        long j = this.b;
        u4c u4cVar = (u4c) this.d;
        synchronized (a5cVar) {
            ArrayList arrayList = (ArrayList) a5cVar.E.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(u4cVar);
                if (arrayList.isEmpty()) {
                    a5cVar.E.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        ArrayList arrayList2 = u4cVar.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Pair pair = (Pair) obj;
            x4c x4cVar = (x4c) pair.first;
            x4c x4cVar2 = (x4c) pair.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = x4cVar.a;
            if (tL_textWithEntities != null && (x4cVar2 == null || x4cVar2.a == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            if (x4cVar.b.size() != (x4cVar2 == null ? 0 : x4cVar2.b.size())) {
                ArrayList arrayList3 = x4cVar.b;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = x4cVar.c;
            if (tL_textWithEntities2 != null && (x4cVar2 == null || x4cVar2.c == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = a5c.D(u4cVar.e);
        int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new p87((Object) a5cVar, (Object) u4cVar, j, (byte) 20));
        synchronized (a5cVar) {
            u4cVar.h = sendRequest;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                c6b c6bVar = (c6b) this.c;
                long j = this.b;
                TLObject tLObject = (TLObject) this.d;
                int i = c6bVar.a;
                c6bVar.C.remove(Long.valueOf(j));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    uc7.s1(i).j4(tL_stories_peerStories.users, false);
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    c6bVar.i.k(wf3.n(peerStories.peer), peerStories);
                    if (X1 != null && (c6bVar.N(X1) || X1.self)) {
                        c6bVar.f(peerStories);
                        o6b o6bVar = c6bVar.k;
                        o6bVar.b.a.c(new n6b(o6bVar, peerStories, b));
                    }
                    StringBuilder o = ik8.o(j, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    o.append(tL_stories_peerStories.stories.stories.size());
                    cc4.b(o.toString());
                    jn7.f(i).k(jn7.y5, new Object[0]);
                    return;
                }
                return;
            case 1:
                b6b b6bVar = (b6b) this.c;
                long j2 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                c6b c6bVar2 = b6bVar.N;
                ar3 ar3Var = c6bVar2.w;
                b6bVar.d = true;
                c8b c8bVar = b6bVar.c;
                if (c8bVar.w) {
                    ar3Var.b(c8bVar);
                }
                c8bVar.w = false;
                c8bVar.x = null;
                if (!c8bVar.b0) {
                    ArrayList arrayList = ar3Var.b;
                    if (!c8bVar.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            c8b c8bVar2 = (c8b) obj;
                            if (c8bVar2.g && c8bVar2.f == storyItem.id) {
                                arrayList2.add(c8bVar2);
                            }
                        }
                        ar3Var.c(arrayList2);
                        ar3Var.e(c8bVar);
                        c8bVar.b = Utilities.b.nextLong();
                        zq3 zq3Var = new zq3(c8bVar);
                        c8bVar.g = true;
                        zq3Var.G = true;
                        c8bVar.e = j2;
                        zq3Var.I = j2;
                        int i3 = storyItem.id;
                        c8bVar.f = i3;
                        zq3Var.H = i3;
                        long j3 = storyItem.expire_date * 1000;
                        c8bVar.J = j3;
                        zq3Var.L = j3;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j4 = document.id;
                            c8bVar.H = j4;
                            zq3Var.J = j4;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j5 = photo.id;
                                c8bVar.I = j5;
                                zq3Var.K = j5;
                            }
                        }
                        arrayList.remove(c8bVar);
                        arrayList.add(0, c8bVar);
                        ar3Var.a(zq3Var);
                    }
                }
                if (b6bVar.b) {
                    return;
                }
                c6bVar2.R = false;
                c6bVar2.S = null;
                return;
            case 2:
                ((o6b) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 3:
                o6b o6bVar2 = (o6b) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                long j6 = this.b;
                kf7 kf7Var = o6bVar2.b;
                SQLiteDatabase sQLiteDatabase = kf7Var.b;
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j6 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    kf7Var.p(th, true);
                    return;
                }
            case 4:
                s6b s6bVar = (s6b) this.c;
                View view = (View) this.d;
                long j7 = this.b;
                view.invalidate();
                uc7.s1(s6bVar.a).O1().g0(j7, false);
                return;
            case 5:
                ((r9b) this.c).e(this.b, ((TLRPC.ChatFull) this.d).participants);
                return;
            case 6:
                qyb qybVar = (qyb) this.c;
                long j8 = this.b;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                qybVar.c.put(j8, 0);
                if ((qybVar.l(j8) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    qybVar.d.put(j8, 1);
                    qybVar.getUserConfig().j().edit().putBoolean("topics_end_reached_" + j8, true).apply();
                }
                qybVar.getNotificationCenter().k(jn7.t5, Long.valueOf(j8), Boolean.FALSE);
                return;
            case 7:
                qyb qybVar2 = (qyb) this.c;
                long j9 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                qybVar2.n.delete(j9);
                if (tLObject2 instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList4 = ((TLRPC.TL_messages_forumTopics) tLObject2).top_icons;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    qybVar2.f.k(j9, arrayList4);
                    qybVar2.h.put(j9, System.currentTimeMillis());
                    qybVar2.getNotificationCenter().k(jn7.t5, Long.valueOf(j9), Boolean.FALSE);
                    return;
                }
                return;
            case 8:
                qyb qybVar3 = (qyb) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j10 = this.b;
                zh6 zh6Var = qybVar3.e;
                ArrayList arrayList6 = null;
                boolean z = false;
                for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList5.get(i4);
                    zh6 zh6Var2 = (zh6) qybVar3.b.f(j10);
                    if (zh6Var2 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) zh6Var2.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            zh6Var.l(qyb.p(tL_forumTopic2.top_message, j10));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i5 = message.id;
                            tL_forumTopic2.top_message = i5;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            zh6Var.k(qyb.p(i5, j10), tL_forumTopic2);
                            z = true;
                        } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(tL_forumTopic);
                        }
                    }
                }
                if (z) {
                    qybVar3.y(j10, true);
                }
                if (arrayList6 != null) {
                    qybVar3.v(j10, arrayList6, null);
                    return;
                }
                return;
            case 9:
                a();
                return;
            case 10:
                b();
                return;
            case 11:
                ((VideoCapturerDevice) this.c).lambda$init$5(this.b, (String) this.d);
                return;
            case 12:
                ((VideoCapturerDevice) this.c).lambda$init$2(this.b, (Point) this.d);
                return;
            case 13:
                ((VideoFramesRewinder) this.c).lambda$new$1((ArrayList) this.d, this.b);
                return;
            case 14:
                k7b k7bVar = (k7b) this.c;
                Object obj2 = this.d;
                long j11 = this.b;
                vfc vfcVar = (vfc) k7bVar.c;
                String str = gcc.a;
                s64 s64Var = ((n64) vfcVar).a;
                ea3 ea3Var = s64Var.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 26, new q72(U, obj2, j11));
                if (s64Var.T == obj2) {
                    s64Var.m.e(26, new su3((byte) 17));
                    return;
                }
                return;
            default:
                lyc lycVar = (lyc) this.c;
                kyc kycVar = (kyc) this.d;
                long j12 = this.b;
                if (((kyc) lycVar.c) == kycVar) {
                    iyc iycVar = (iyc) lycVar.e;
                    if (iycVar != null) {
                        hl.r(iycVar);
                        lycVar.e = null;
                    }
                    synchronized (pyc.y) {
                        pyc pycVar = pyc.A;
                        if (pycVar != null) {
                            pycVar.q();
                            pyc.A = null;
                        }
                    }
                    lycVar.c = null;
                    kycVar.c.run(j12);
                    lycVar.L();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ j5b(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
