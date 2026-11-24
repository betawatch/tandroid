// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class me7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ me7(cf7 cf7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = j;
        this.d = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        r0.b.commitTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        r5.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        if (r5 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        cf7 cf7Var = this.b;
        long j = this.c;
        ArrayList arrayList = this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                cf7Var.b.beginTransaction();
                cf7Var.b.executeFast("DELETE FROM profile_stories_albums WHERE dialog_id = " + j).stepThis().dispose();
                sQLitePreparedStatement = cf7Var.b.executeFast("REPLACE INTO profile_stories_albums VALUES(?, ?, ?, ?)");
                for (int i = 0; i < arrayList.size(); i++) {
                    a4b a4bVar = (a4b) arrayList.get(i);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, j);
                    sQLitePreparedStatement.bindInteger(2, a4bVar.a);
                    sQLitePreparedStatement.bindInteger(3, i);
                    TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                    tL_storyAlbum.album_id = a4bVar.a;
                    tL_storyAlbum.title = a4bVar.b;
                    tL_storyAlbum.icon_photo = a4bVar.c;
                    tL_storyAlbum.icon_video = a4bVar.d;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_storyAlbum.getObjectSize());
                    tL_storyAlbum.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer.reuse();
                }
            } catch (Exception e) {
                cf7Var.n(e, true);
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            cf7Var.b.commitTransaction();
            throw th;
        }
    }

    private final void b() {
        cf7 cf7Var = this.b;
        ArrayList arrayList = this.d;
        long j = this.c;
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = cf7Var.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                cf7Var.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase2.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement sQLitePreparedStatement;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement executeFast;
        byte b = this.a;
        int i = 7;
        int i2 = 3;
        cf7 cf7Var = this.b;
        long j = this.c;
        int i3 = 2;
        ArrayList arrayList4 = this.d;
        int i4 = 0;
        switch (b) {
            case 0:
                ArrayList arrayList5 = new ArrayList();
                try {
                    String join = TextUtils.join(",", arrayList4);
                    SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
                    Locale locale = Locale.US;
                    boolean z = false;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid IN (" + join + ")", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(z ? 1 : 0);
                            if (byteBufferValue != null) {
                                try {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                                    if (TLdeserialize != null) {
                                        TLdeserialize.readAttachPath(byteBufferValue, cf7Var.getUserConfig().n);
                                        if (!TLdeserialize.out && TLdeserialize.media_unread && k47.Q4(TLdeserialize)) {
                                            arrayList5.add(new k47(cf7Var.currentAccount, TLdeserialize, false, false));
                                            byteBufferValue.reuse();
                                            z = false;
                                        }
                                    }
                                    byteBufferValue.reuse();
                                    z = false;
                                } catch (Throwable th) {
                                    byteBufferValue.reuse();
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            try {
                                cf7Var.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (arrayList5.isEmpty()) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                if (arrayList5.isEmpty()) {
                    gm.c3(new p51(cf7Var, arrayList5, (byte) 4));
                    return;
                }
                return;
            case 1:
                cf7 cf7Var2 = this.b;
                long j2 = this.c;
                ArrayList arrayList6 = this.d;
                cf7Var2.P0(0, 0, j2, arrayList6);
                cf7Var2.getNotificationCenter().k(66, Long.valueOf(j2), arrayList6);
                return;
            case 2:
                cf7 cf7Var3 = this.b;
                try {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase3 = cf7Var3.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT data, mid, date, uid, custom_params FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList4) + ") AND uid = " + j, new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            try {
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, cf7Var3.getUserConfig().n);
                                    byteBufferValue2.reuse();
                                    if (TLdeserialize2.media != null) {
                                        try {
                                            boolean a = cf7Var3.a(TLdeserialize2, arrayList7, arrayList9, arrayList8, true);
                                            arrayList = arrayList7;
                                            arrayList2 = arrayList9;
                                            arrayList3 = arrayList8;
                                            if (a) {
                                                TLRPC.MessageMedia messageMedia = TLdeserialize2.media;
                                                if (messageMedia.document != null) {
                                                    messageMedia.document = new TLRPC.TL_documentEmpty();
                                                } else if (messageMedia.photo != null) {
                                                    messageMedia.photo = new TLRPC.TL_photoEmpty();
                                                }
                                                TLdeserialize2.media.flags &= -2;
                                                TLdeserialize2.id = queryFinalized2.intValue(1);
                                                TLdeserialize2.date = queryFinalized2.intValue(2);
                                                TLdeserialize2.dialog_id = queryFinalized2.longValue(3);
                                                NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(4);
                                                if (byteBufferValue3 != null) {
                                                    l37.b(TLdeserialize2, byteBufferValue3);
                                                    byteBufferValue3.reuse();
                                                }
                                                arrayList10.add(TLdeserialize2);
                                            }
                                            arrayList7 = arrayList;
                                            arrayList8 = arrayList3;
                                            arrayList9 = arrayList2;
                                        } catch (Exception e3) {
                                            e = e3;
                                            cf7Var3 = cf7Var3;
                                            sQLiteCursor2 = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            try {
                                                cf7Var3.n(e, true);
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                if (sQLitePreparedStatement == null) {
                                                    return;
                                                }
                                                sQLitePreparedStatement.dispose();
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                arrayList = arrayList7;
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList8;
                                arrayList7 = arrayList;
                                arrayList8 = arrayList3;
                                arrayList9 = arrayList2;
                            } catch (Exception e4) {
                                e = e4;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor2 = queryFinalized2;
                            sQLitePreparedStatement = null;
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    ArrayList arrayList11 = arrayList7;
                    ArrayList arrayList12 = arrayList9;
                    ArrayList arrayList13 = arrayList8;
                    queryFinalized2.dispose();
                    cf7Var3.C(arrayList12, true);
                    if (arrayList10.isEmpty()) {
                        sQLitePreparedStatement = null;
                    } else {
                        sQLitePreparedStatement = cf7Var3.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                        int i5 = 0;
                        while (true) {
                            try {
                                byte b2 = 18;
                                if (i5 < arrayList10.size()) {
                                    TLRPC.Message message = (TLRPC.Message) arrayList10.get(i5);
                                    k47.p5(message);
                                    NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer3);
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindInteger(1, message.id);
                                    sQLitePreparedStatement.bindLong(i3, message.dialog_id);
                                    sQLitePreparedStatement.bindInteger(i2, k47.c2(message));
                                    sQLitePreparedStatement.bindInteger(4, message.send_state);
                                    sQLitePreparedStatement.bindInteger(5, message.date);
                                    sQLitePreparedStatement.bindByteBuffer(6, nativeByteBuffer3);
                                    sQLitePreparedStatement.bindInteger(i, (message.out || message.from_scheduled) ? 1 : 0);
                                    sQLitePreparedStatement.bindInteger(8, message.ttl);
                                    if ((message.flags & 1024) != 0) {
                                        sQLitePreparedStatement.bindInteger(9, message.views);
                                    } else {
                                        sQLitePreparedStatement.bindInteger(9, cf7.b0(message));
                                    }
                                    if (message.replyStory != null) {
                                        nativeByteBuffer = new NativeByteBuffer(message.replyStory.getObjectSize());
                                        message.replyStory.serializeToStream(nativeByteBuffer);
                                        sQLitePreparedStatement.bindByteBuffer(10, nativeByteBuffer);
                                    } else {
                                        sQLitePreparedStatement.bindNull(10);
                                        nativeByteBuffer = null;
                                    }
                                    int i6 = message.stickerVerified;
                                    sQLitePreparedStatement.bindInteger(11, i6 == 0 ? 1 : i6 == i3 ? i3 : 0);
                                    sQLitePreparedStatement.bindInteger(12, message.mentioned ? 1 : 0);
                                    sQLitePreparedStatement.bindInteger(13, message.forwards);
                                    if (message.replies != null) {
                                        nativeByteBuffer2 = new NativeByteBuffer(message.replies.getObjectSize());
                                        message.replies.serializeToStream(nativeByteBuffer2);
                                        sQLitePreparedStatement.bindByteBuffer(14, nativeByteBuffer2);
                                    } else {
                                        sQLitePreparedStatement.bindNull(14);
                                        nativeByteBuffer2 = null;
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                                    if (messageReplyHeader != null) {
                                        int i7 = messageReplyHeader.reply_to_top_id;
                                        if (i7 == 0) {
                                            i7 = messageReplyHeader.reply_to_msg_id;
                                        }
                                        sQLitePreparedStatement.bindInteger(15, i7);
                                    } else {
                                        sQLitePreparedStatement.bindInteger(15, 0);
                                    }
                                    TLRPC.Peer peer = message.peer_id;
                                    sQLitePreparedStatement.bindLong(16, peer != null ? peer.channel_id : 0L);
                                    NativeByteBuffer c = l37.c(message);
                                    if (c != null) {
                                        sQLitePreparedStatement.bindByteBuffer(16, c);
                                    } else {
                                        sQLitePreparedStatement.bindNull(17);
                                    }
                                    if ((message.flags & 131072) != 0) {
                                        sQLitePreparedStatement.bindLong(18, message.grouped_id);
                                    } else {
                                        sQLitePreparedStatement.bindNull(18);
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
                                    if (messageReplyHeader2 != null) {
                                        sQLitePreparedStatement.bindInteger(19, messageReplyHeader2.story_id);
                                    } else {
                                        sQLitePreparedStatement.bindInteger(19, 0);
                                    }
                                    sQLitePreparedStatement.step();
                                    nativeByteBuffer3.reuse();
                                    if (nativeByteBuffer2 != null) {
                                        nativeByteBuffer2.reuse();
                                    }
                                    if (c != null) {
                                        c.reuse();
                                    }
                                    if (nativeByteBuffer != null) {
                                        nativeByteBuffer.reuse();
                                    }
                                    i5++;
                                    i = 7;
                                    i2 = 3;
                                    i3 = 2;
                                } else {
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                        sQLitePreparedStatement = null;
                                    }
                                    gm.c3(new p51(cf7Var3, arrayList10, b2));
                                }
                            } catch (Exception e5) {
                                e = e5;
                                sQLiteCursor2 = null;
                                cf7Var3.n(e, true);
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement == null) {
                                }
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteCursor2 = null;
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                    }
                    gm.c3(new p51(cf7Var3, arrayList13, (byte) 19));
                    cf7Var3.getFileLoader().getClass();
                    bc4.p(0, arrayList11);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                } catch (Exception e6) {
                    e = e6;
                    sQLiteCursor2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor2 = null;
                }
                sQLitePreparedStatement.dispose();
                return;
            case 3:
                cf7 cf7Var4 = this.b;
                long j3 = this.c;
                long j4 = -j3;
                try {
                    cf7Var4.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j4).stepThis().dispose();
                    cf7Var4.b.beginTransaction();
                    executeFast = cf7Var4.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
                } catch (Exception e7) {
                    e = e7;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLitePreparedStatement2 = null;
                }
                try {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    while (i4 < arrayList4.size()) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList4.get(i4);
                        executeFast.requery();
                        executeFast.bindLong(1, j4);
                        executeFast.bindLong(2, k47.B1(channelParticipant.peer));
                        executeFast.bindInteger(3, currentTimeMillis);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer4);
                        executeFast.bindByteBuffer(4, nativeByteBuffer4);
                        executeFast.step();
                        nativeByteBuffer4.reuse();
                        currentTimeMillis--;
                        i4++;
                    }
                    executeFast.dispose();
                    cf7Var4.b.commitTransaction();
                    cf7Var4.C0(j3, true, null, false, true, 0);
                    SQLiteDatabase sQLiteDatabase4 = cf7Var4.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    e = e8;
                    sQLitePreparedStatement2 = executeFast;
                    try {
                        cf7Var4.n(e, true);
                        SQLiteDatabase sQLiteDatabase5 = cf7Var4.b;
                        if (sQLiteDatabase5 != null) {
                            sQLiteDatabase5.commitTransaction();
                        }
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteDatabase = cf7Var4.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    sQLitePreparedStatement2 = executeFast;
                    sQLiteDatabase = cf7Var4.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            case 4:
                a();
                return;
            case 5:
                HashSet hashSet = new HashSet();
                int size = arrayList4.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList4.get(i8);
                    i8++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (cf7Var.getMessagesController().L3(message2)) {
                        hashSet.add(Long.valueOf(k47.Q1(j, message2)));
                        i4 = 1;
                    }
                }
                if (i4 != 0) {
                    cf7Var.getMessagesController().z5(hashSet);
                    return;
                }
                return;
            case 6:
                b();
                return;
            case 7:
                cf7 cf7Var5 = this.b;
                long j5 = this.c;
                ArrayList arrayList14 = this.d;
                cf7Var5.P0(0, 0, j5, arrayList14);
                cf7Var5.getNotificationCenter().k(66, Long.valueOf(j5), arrayList14);
                return;
            case 8:
                cf7Var.getNotificationCenter().k(7, arrayList4, Long.valueOf(pg3.y(j) ? -j : 0L), Boolean.FALSE);
                return;
            default:
                cf7Var.getMessagesController().p3(arrayList4, j);
                cf7Var.getNotificationCenter().k(7, arrayList4, 0L, Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ me7(cf7 cf7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.d = arrayList;
        this.c = j;
    }
}
