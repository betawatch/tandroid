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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class d2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d2b(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = obj2;
    }

    private final void a() {
        b1c b1cVar = (b1c) this.d;
        long j = this.b;
        w0c w0cVar = (w0c) this.c;
        synchronized (b1cVar) {
            ArrayList arrayList = (ArrayList) b1cVar.I.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(w0cVar);
                if (arrayList.isEmpty()) {
                    b1cVar.I.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = b1cVar.getMessagesController().h1(j);
        tL_messages_translateRichMessage.id = w0cVar.b;
        tL_messages_translateRichMessage.to_lang = b1c.D(w0cVar.d);
        int sendRequest = b1cVar.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new w47((Object) b1cVar, (Object) w0cVar, j, (byte) 20));
        synchronized (b1cVar) {
            w0cVar.f = sendRequest;
        }
    }

    private final void b() {
        b1c b1cVar = (b1c) this.d;
        long j = this.b;
        v0c v0cVar = (v0c) this.c;
        synchronized (b1cVar) {
            ArrayList arrayList = (ArrayList) b1cVar.E.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(v0cVar);
                if (arrayList.isEmpty()) {
                    b1cVar.E.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        ArrayList arrayList2 = v0cVar.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Pair pair = (Pair) obj;
            y0c y0cVar = (y0c) pair.first;
            y0c y0cVar2 = (y0c) pair.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = y0cVar.a;
            if (tL_textWithEntities != null && (y0cVar2 == null || y0cVar2.a == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            if (y0cVar.b.size() != (y0cVar2 == null ? 0 : y0cVar2.b.size())) {
                ArrayList arrayList3 = y0cVar.b;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = y0cVar.c;
            if (tL_textWithEntities2 != null && (y0cVar2 == null || y0cVar2.c == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = b1c.D(v0cVar.e);
        int sendRequest = b1cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new w47((Object) b1cVar, (Object) v0cVar, j, (byte) 19));
        synchronized (b1cVar) {
            v0cVar.h = sendRequest;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2b f2bVar = (f2b) this.d;
                long j = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                g2b g2bVar = f2bVar.N;
                jq3 jq3Var = g2bVar.w;
                f2bVar.d = true;
                f4b f4bVar = f2bVar.c;
                if (f4bVar.w) {
                    jq3Var.b(f4bVar);
                }
                f4bVar.w = false;
                f4bVar.x = null;
                if (!f4bVar.b0) {
                    ArrayList arrayList = jq3Var.b;
                    if (!f4bVar.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            f4b f4bVar2 = (f4b) obj;
                            if (f4bVar2.g && f4bVar2.f == storyItem.id) {
                                arrayList2.add(f4bVar2);
                            }
                        }
                        jq3Var.c(arrayList2);
                        jq3Var.e(f4bVar);
                        f4bVar.b = Utilities.b.nextLong();
                        iq3 iq3Var = new iq3(f4bVar);
                        f4bVar.g = true;
                        iq3Var.G = true;
                        f4bVar.e = j;
                        iq3Var.I = j;
                        int i2 = storyItem.id;
                        f4bVar.f = i2;
                        iq3Var.H = i2;
                        long j2 = storyItem.expire_date * 1000;
                        f4bVar.J = j2;
                        iq3Var.L = j2;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j3 = document.id;
                            f4bVar.H = j3;
                            iq3Var.J = j3;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j4 = photo.id;
                                f4bVar.I = j4;
                                iq3Var.K = j4;
                            }
                        }
                        arrayList.remove(f4bVar);
                        arrayList.add(0, f4bVar);
                        jq3Var.a(iq3Var);
                    }
                }
                if (f2bVar.b) {
                    return;
                }
                g2bVar.R = false;
                g2bVar.S = null;
                return;
            case 1:
                ((s2b) this.d).l(this.b, (TL_stories.StoryItem) this.c);
                return;
            case 2:
                s2b s2bVar = (s2b) this.d;
                ArrayList arrayList3 = (ArrayList) this.c;
                long j5 = this.b;
                ad7 ad7Var = s2bVar.b;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j5 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    ad7Var.n(th, true);
                    return;
                }
            case 3:
                w2b w2bVar = (w2b) this.d;
                View view = (View) this.c;
                long j6 = this.b;
                view.invalidate();
                na7.q1(w2bVar.a).M1().g0(j6, false);
                return;
            case 4:
                ((t5b) this.d).e(this.b, ((TLRPC.ChatFull) this.c).participants);
                return;
            case 5:
                pub pubVar = (pub) this.d;
                long j7 = this.b;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.c;
                pubVar.c.put(j7, 0);
                if ((pubVar.l(j7) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    pubVar.d.put(j7, 1);
                    pubVar.getUserConfig().j().edit().putBoolean("topics_end_reached_" + j7, true).apply();
                }
                pubVar.getNotificationCenter().k(kk7.s5, Long.valueOf(j7), Boolean.FALSE);
                return;
            case 6:
                pub pubVar2 = (pub) this.d;
                long j8 = this.b;
                TLObject tLObject = (TLObject) this.c;
                pubVar2.n.delete(j8);
                if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList4 = ((TLRPC.TL_messages_forumTopics) tLObject).top_icons;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    pubVar2.f.k(arrayList4, j8);
                    pubVar2.h.put(j8, System.currentTimeMillis());
                    pubVar2.getNotificationCenter().k(kk7.s5, Long.valueOf(j8), Boolean.FALSE);
                    return;
                }
                return;
            case 7:
                pub pubVar3 = (pub) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                long j9 = this.b;
                vf6 vf6Var = pubVar3.e;
                ArrayList arrayList6 = null;
                boolean z = false;
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList5.get(i3);
                    vf6 vf6Var2 = (vf6) pubVar3.b.f(j9);
                    if (vf6Var2 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) vf6Var2.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            vf6Var.l(pub.p(tL_forumTopic2.top_message, j9));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i4 = message.id;
                            tL_forumTopic2.top_message = i4;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            vf6Var.k(tL_forumTopic2, pub.p(i4, j9));
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
                    pubVar3.y(j9, true);
                }
                if (arrayList6 != null) {
                    pubVar3.v(j9, arrayList6, null);
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
                v8b v8bVar = (v8b) this.d;
                Object obj2 = this.c;
                long j10 = this.b;
                xbc xbcVar = (xbc) v8bVar.c;
                String str = g8c.a;
                y54 y54Var = ((t54) xbcVar).a;
                l93 l93Var = y54Var.s;
                tj U = l93Var.U();
                l93Var.V(U, 26, new v82(U, obj2, j10));
                if (y54Var.T == obj2) {
                    y54Var.m.e(26, new w44((byte) 6));
                    return;
                }
                return;
            default:
                wtc wtcVar = (wtc) this.d;
                vtc vtcVar = (vtc) this.c;
                long j11 = this.b;
                if (((vtc) wtcVar.b) == vtcVar) {
                    ttc ttcVar = (ttc) wtcVar.d;
                    if (ttcVar != null) {
                        gl.r(ttcVar);
                        wtcVar.d = null;
                    }
                    synchronized (auc.y) {
                        auc aucVar = auc.A;
                        if (aucVar != null) {
                            aucVar.q();
                            auc.A = null;
                        }
                    }
                    wtcVar.b = null;
                    vtcVar.c.run(j11);
                    wtcVar.z();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d2b(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = j;
    }
}
