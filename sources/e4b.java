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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e4b(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = obj2;
    }

    private final void a() {
        b3c b3cVar = (b3c) this.d;
        long j = this.b;
        w2c w2cVar = (w2c) this.c;
        synchronized (b3cVar) {
            ArrayList arrayList = (ArrayList) b3cVar.I.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(w2cVar);
                if (arrayList.isEmpty()) {
                    b3cVar.I.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = b3cVar.getMessagesController().i1(j);
        tL_messages_translateRichMessage.id = w2cVar.b;
        tL_messages_translateRichMessage.to_lang = b3c.D(w2cVar.d);
        int sendRequest = b3cVar.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new jb7((Object) b3cVar, (Object) w2cVar, j, (byte) 20));
        synchronized (b3cVar) {
            w2cVar.f = sendRequest;
        }
    }

    private final void b() {
        b3c b3cVar = (b3c) this.d;
        long j = this.b;
        v2c v2cVar = (v2c) this.c;
        synchronized (b3cVar) {
            ArrayList arrayList = (ArrayList) b3cVar.E.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(v2cVar);
                if (arrayList.isEmpty()) {
                    b3cVar.E.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        ArrayList arrayList2 = v2cVar.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Pair pair = (Pair) obj;
            y2c y2cVar = (y2c) pair.first;
            y2c y2cVar2 = (y2c) pair.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = y2cVar.a;
            if (tL_textWithEntities != null && (y2cVar2 == null || y2cVar2.a == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            if (y2cVar.b.size() != (y2cVar2 == null ? 0 : y2cVar2.b.size())) {
                ArrayList arrayList3 = y2cVar.b;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = y2cVar.c;
            if (tL_textWithEntities2 != null && (y2cVar2 == null || y2cVar2.c == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = b3c.D(v2cVar.e);
        int sendRequest = b3cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new jb7((Object) b3cVar, (Object) v2cVar, j, (byte) 19));
        synchronized (b3cVar) {
            v2cVar.h = sendRequest;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g4b g4bVar = (g4b) this.d;
                long j = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                h4b h4bVar = g4bVar.N;
                tr3 tr3Var = h4bVar.w;
                g4bVar.d = true;
                g6b g6bVar = g4bVar.c;
                if (g6bVar.w) {
                    tr3Var.b(g6bVar);
                }
                g6bVar.w = false;
                g6bVar.x = null;
                if (!g6bVar.b0) {
                    ArrayList arrayList = tr3Var.b;
                    if (!g6bVar.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            g6b g6bVar2 = (g6b) obj;
                            if (g6bVar2.g && g6bVar2.f == storyItem.id) {
                                arrayList2.add(g6bVar2);
                            }
                        }
                        tr3Var.c(arrayList2);
                        tr3Var.e(g6bVar);
                        g6bVar.b = Utilities.b.nextLong();
                        sr3 sr3Var = new sr3(g6bVar);
                        g6bVar.g = true;
                        sr3Var.G = true;
                        g6bVar.e = j;
                        sr3Var.I = j;
                        int i2 = storyItem.id;
                        g6bVar.f = i2;
                        sr3Var.H = i2;
                        long j2 = storyItem.expire_date * 1000;
                        g6bVar.J = j2;
                        sr3Var.L = j2;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j3 = document.id;
                            g6bVar.H = j3;
                            sr3Var.J = j3;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j4 = photo.id;
                                g6bVar.I = j4;
                                sr3Var.K = j4;
                            }
                        }
                        arrayList.remove(g6bVar);
                        arrayList.add(0, g6bVar);
                        tr3Var.a(sr3Var);
                    }
                }
                if (g4bVar.b) {
                    return;
                }
                h4bVar.R = false;
                h4bVar.S = null;
                return;
            case 1:
                ((t4b) this.d).l(this.b, (TL_stories.StoryItem) this.c);
                return;
            case 2:
                t4b t4bVar = (t4b) this.d;
                ArrayList arrayList3 = (ArrayList) this.c;
                long j5 = this.b;
                cf7 cf7Var = t4bVar.b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j5 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            case 3:
                x4b x4bVar = (x4b) this.d;
                View view = (View) this.c;
                long j6 = this.b;
                view.invalidate();
                oc7.r1(x4bVar.a).N1().g0(j6, false);
                return;
            case 4:
                ((v7b) this.d).e(this.b, ((TLRPC.ChatFull) this.c).participants);
                return;
            case 5:
                qwb qwbVar = (qwb) this.d;
                long j7 = this.b;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.c;
                qwbVar.c.put(j7, 0);
                if ((qwbVar.l(j7) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    qwbVar.d.put(j7, 1);
                    qwbVar.getUserConfig().j().edit().putBoolean("topics_end_reached_" + j7, true).apply();
                }
                qwbVar.getNotificationCenter().k(nm7.u5, Long.valueOf(j7), Boolean.FALSE);
                return;
            case 6:
                qwb qwbVar2 = (qwb) this.d;
                long j8 = this.b;
                TLObject tLObject = (TLObject) this.c;
                qwbVar2.n.delete(j8);
                if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList4 = ((TLRPC.TL_messages_forumTopics) tLObject).top_icons;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    qwbVar2.f.k(arrayList4, j8);
                    qwbVar2.h.put(j8, System.currentTimeMillis());
                    qwbVar2.getNotificationCenter().k(nm7.u5, Long.valueOf(j8), Boolean.FALSE);
                    return;
                }
                return;
            case 7:
                qwb qwbVar3 = (qwb) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                long j9 = this.b;
                vh6 vh6Var = qwbVar3.e;
                ArrayList arrayList6 = null;
                boolean z = false;
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList5.get(i3);
                    vh6 vh6Var2 = (vh6) qwbVar3.b.f(j9);
                    if (vh6Var2 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) vh6Var2.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            vh6Var.l(qwb.p(tL_forumTopic2.top_message, j9));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i4 = message.id;
                            tL_forumTopic2.top_message = i4;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            vh6Var.k(tL_forumTopic2, qwb.p(i4, j9));
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
                    qwbVar3.y(j9, true);
                }
                if (arrayList6 != null) {
                    qwbVar3.v(j9, arrayList6, null);
                    return;
                }
                return;
            case 8:
                a();
                return;
            case 9:
                b();
                return;
            case 10:
                ((VideoCapturerDevice) this.d).lambda$init$5(this.b, (String) this.c);
                return;
            case 11:
                ((VideoCapturerDevice) this.d).lambda$init$2(this.b, (Point) this.c);
                return;
            case 12:
                ((VideoFramesRewinder) this.d).lambda$new$1((ArrayList) this.c, this.b);
                return;
            case 13:
                xab xabVar = (xab) this.d;
                Object obj2 = this.c;
                long j10 = this.b;
                ydc ydcVar = (ydc) xabVar.c;
                String str = hac.a;
                h74 h74Var = ((c74) ydcVar).a;
                xa3 xa3Var = h74Var.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 26, new x92(U, obj2, j10));
                if (h74Var.T == obj2) {
                    h74Var.m.e(26, new h64((byte) 7));
                    return;
                }
                return;
            default:
                xvc xvcVar = (xvc) this.d;
                wvc wvcVar = (wvc) this.c;
                long j11 = this.b;
                if (((wvc) xvcVar.c) == wvcVar) {
                    uvc uvcVar = (uvc) xvcVar.e;
                    if (uvcVar != null) {
                        gm.r(uvcVar);
                        xvcVar.e = null;
                    }
                    synchronized (bwc.y) {
                        bwc bwcVar = bwc.A;
                        if (bwcVar != null) {
                            bwcVar.q();
                            bwc.A = null;
                        }
                    }
                    xvcVar.c = null;
                    wvcVar.c.run(j11);
                    xvcVar.I();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e4b(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = j;
    }
}
