// default package

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ic2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ic2(fu5 fu5Var, int i, long j, long j2, zu1 zu1Var, vnb vnbVar) {
        this.a = (byte) 0;
        this.e = fu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = zu1Var;
        this.h = vnbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        mt9 mt9Var;
        SQLiteCursor sQLiteCursor;
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase2;
        boolean z2;
        String str;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        int i2 = 2;
        long j = this.d;
        long j2 = this.c;
        int i3 = this.b;
        int i4 = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                int i5 = 4;
                zu1 zu1Var = (zu1) obj2;
                vnb vnbVar = (vnb) obj;
                ((fu5) obj3).u();
                uc7 s1 = uc7.s1(i3);
                long j3 = this.c;
                long j4 = this.d;
                boolean p2 = s1.p2(j3, j4, null);
                ip7.n(i3).G(j3, j4, !p2);
                if (d31.a(zu1Var)) {
                    if (p2) {
                        i = 0;
                    } else {
                        i5 = 3;
                        i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    d31.z(zu1Var, i5, i, vnbVar).j();
                    return;
                }
                return;
            case 1:
                o96 o96Var = (o96) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                o96Var.b(i3);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = o96Var.getContext();
                    x53 x53Var = new x53();
                    long j5 = this.d;
                    long j6 = this.c;
                    new dza(context, x53Var, j6, 17, "", new o30((Object) o96Var, j5, (TLObject) tL_textWithEntities, j6, (byte) 6), o96Var.N).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new d31(o96Var.b, new x53()).g0(tL_error, true);
                    return;
                }
                w96 w96Var = o96Var.Q;
                if (w96Var != null) {
                    w96Var.G();
                    return;
                }
                return;
            case 2:
                ls6 ls6Var = (ls6) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj2;
                c97 c97Var = (c97) obj;
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) ls6Var.y1.get(j2 + "_" + j);
                if (botInfo2 != null) {
                    botInfo = botInfo2;
                }
                if (c97Var != null) {
                    c97Var.a(botInfo);
                }
                ls6Var.getNotificationCenter().k(67, botInfo, Integer.valueOf(i3));
                return;
            case 3:
                uc7 uc7Var = (uc7) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                int[] iArr = (int[]) obj;
                long j7 = this.d;
                if (j2 == 0) {
                    jf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new le7(messagesStorage, j7, (byte) 1));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = uc7Var.j1(j7);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (i3 == 0 && j2 == 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= uc7Var.F1().j.size()) {
                            mt9Var = null;
                        } else if (((mt9) uc7Var.F1().j.get(i6)).a == j7) {
                            mt9Var = (mt9) uc7Var.F1().j.get(i6);
                        } else {
                            i6++;
                        }
                    }
                    if (mt9Var != null) {
                        iArr[0] = Math.max(iArr[0], mt9Var.c);
                        nt9 F1 = uc7Var.F1();
                        F1.g -= F1.i(j7);
                        F1.k();
                    }
                    int i7 = iArr[0];
                    if (i7 <= 0) {
                        i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    tL_messages_deleteSavedHistory.max_id = i7;
                }
                uc7Var.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new ft0(uc7Var, j7, (Object) iArr, (TLObject) inputPeer, (byte) 4), 64);
                return;
            case 4:
                jf7 jf7Var = (jf7) obj3;
                String str2 = (String) obj2;
                mt7 mt7Var = (mt7) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        sQLiteDatabase = jf7Var.b;
                        sb = new StringBuilder("DELETE FROM onchain_offer_intents WHERE used_at < ");
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        sb.append(currentTimeMillis - 1800000);
                        sb.append(" OR used_at > ");
                        sb.append(currentTimeMillis);
                        sQLiteDatabase.executeFast(sb.toString()).stepThis().dispose();
                        jf7Var = jf7Var;
                        SQLiteCursor queryFinalized = jf7Var.b.queryFinalized("SELECT random_id FROM onchain_offer_intents WHERE slug = ? AND amount = ? AND duration = ?", str2, Long.valueOf(j), Integer.valueOf(i3));
                        try {
                            try {
                                if (queryFinalized.next()) {
                                    try {
                                        j2 = queryFinalized.longValue(0);
                                    } catch (Exception e2) {
                                        e = e2;
                                        sQLiteCursor = queryFinalized;
                                        z = true;
                                        sQLitePreparedStatement = null;
                                        try {
                                            jf7Var.n(e, z);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            hl.c3(new kt(mt7Var, j2, (byte) 21));
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                queryFinalized.dispose();
                                executeFast = jf7Var.b.executeFast("REPLACE INTO onchain_offer_intents VALUES(?, ?, ?, ?, ?)");
                            } catch (Exception e3) {
                                e = e3;
                                sQLiteCursor = queryFinalized;
                                z = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            sQLitePreparedStatement = null;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        jf7Var = jf7Var;
                        z = true;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = null;
                        jf7Var.n(e, z);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        hl.c3(new kt(mt7Var, j2, (byte) 21));
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                try {
                    executeFast.bindString(1, str2);
                    executeFast.bindLong(2, j);
                    executeFast.bindInteger(3, i3);
                    executeFast.bindLong(4, j2);
                    executeFast.bindLong(5, currentTimeMillis);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = executeFast;
                    z = true;
                    sQLiteCursor = null;
                    jf7Var.n(e, z);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    hl.c3(new kt(mt7Var, j2, (byte) 21));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                hl.c3(new kt(mt7Var, j2, (byte) 21));
                return;
            case 5:
                jf7 jf7Var2 = (jf7) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                try {
                    jf7Var2.b.beginTransaction();
                    int i8 = 0;
                    while (true) {
                        SQLiteDatabase sQLiteDatabase3 = jf7Var2.b;
                        if (i8 >= i2) {
                            sQLiteDatabase3.commitTransaction();
                            SQLiteDatabase sQLiteDatabase4 = jf7Var2.b;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.commitTransaction();
                                return;
                            }
                            return;
                        }
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT data FROM " + (i8 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i3 + " AND uid = " + j2, new Object[i4]);
                        try {
                            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(i4)) == null) {
                                z2 = i4;
                                str = str4;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i4), i4);
                                if (TLdeserialize != null) {
                                    z2 = i4;
                                    str = str4;
                                    TLdeserialize.readAttachPath(byteBufferValue, jf7Var2.getUserConfig().n);
                                } else {
                                    z2 = i4;
                                    str = str4;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str3 != null) {
                                            tL_messageMediaWidget.public_data = str3.isEmpty() ? null : str3;
                                            tL_messageMediaWidget.public_data_hash = j;
                                        }
                                        if (str != null) {
                                            tL_messageMediaWidget.chat_data = str.isEmpty() ? null : str;
                                        }
                                        SQLitePreparedStatement executeFast2 = jf7Var2.b.executeFast("UPDATE " + (i8 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        r47.p5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast2.requery();
                                        executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                        executeFast2.bindInteger(2, i3);
                                        executeFast2.bindLong(3, j2);
                                        executeFast2.step();
                                        nativeByteBuffer.reuse();
                                        executeFast2.dispose();
                                    }
                                }
                            }
                            queryFinalized2.dispose();
                            i8++;
                            str4 = str;
                            i4 = z2;
                            i2 = 2;
                        } catch (Exception e6) {
                            e = e6;
                            sQLiteCursor2 = queryFinalized2;
                            try {
                                jf7Var2.n(e, true);
                                SQLiteDatabase sQLiteDatabase5 = jf7Var2.b;
                                if (sQLiteDatabase5 != null) {
                                    sQLiteDatabase5.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteDatabase2 = jf7Var2.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor2 = queryFinalized2;
                            sQLiteDatabase2 = jf7Var2.b;
                            if (sQLiteDatabase2 != null) {
                            }
                            if (sQLiteCursor2 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor2 = null;
                }
                break;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                wra wraVar = (wra) obj2;
                String str5 = (String) obj;
                String str6 = tL_starGiftUnique.slug;
                int i9 = this.b;
                it7.o(i9, str6, true);
                String str7 = tL_starGiftUnique.slug;
                long j8 = j2 != 0 ? j2 : j;
                jn7 f = jn7.f(i9);
                at7 at7Var = new at7(new fn7[]{r19}, f);
                et7 et7Var = new et7(str7, i9, j8, at7Var);
                f.a(et7Var, 1);
                hl.d3(at7Var, 600000L);
                wraVar.run();
                it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749381, str5));
                return;
            default:
                Context context2 = (Context) obj3;
                int i10 = this.b;
                kt0 g = kt0.g(i10);
                long j9 = this.c;
                g.f(context2, j9, this.d, new bg1((nx0[]) obj2, context2, i10, j9, (vnb) obj, (byte) 2));
                return;
        }
    }

    public /* synthetic */ ic2(int i, Object obj, long j, long j2, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = i;
        this.e = obj;
        this.c = j;
        this.d = j2;
        this.f = obj2;
        this.h = obj3;
    }

    public /* synthetic */ ic2(o96 o96Var, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = (byte) 1;
        this.e = o96Var;
        this.b = i;
        this.f = tL_error;
        this.c = j;
        this.d = j2;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ ic2(ls6 ls6Var, long j, long j2, TL_bots.BotInfo botInfo, c97 c97Var, int i) {
        this.a = (byte) 2;
        this.e = ls6Var;
        this.c = j;
        this.d = j2;
        this.f = botInfo;
        this.h = c97Var;
        this.b = i;
    }

    public /* synthetic */ ic2(uc7 uc7Var, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.a = (byte) 3;
        this.e = uc7Var;
        this.c = j;
        this.d = j2;
        this.f = inputPeer;
        this.b = i;
        this.h = iArr;
    }

    public /* synthetic */ ic2(jf7 jf7Var, int i, long j, String str, long j2, String str2) {
        this.a = (byte) 5;
        this.e = jf7Var;
        this.b = i;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.h = str2;
    }

    public /* synthetic */ ic2(jf7 jf7Var, long j, String str, long j2, int i, mt7 mt7Var) {
        this.a = (byte) 4;
        this.e = jf7Var;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.b = i;
        this.h = mt7Var;
    }
}
