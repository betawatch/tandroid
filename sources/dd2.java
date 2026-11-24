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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dd2 implements Runnable {
    public final /* synthetic */ byte a = 6;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ dd2(int i, Context context, long j, long j2, my0[] my0VarArr, ylb ylbVar) {
        this.b = i;
        this.e = context;
        this.c = j;
        this.d = j2;
        this.f = my0VarArr;
        this.h = ylbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        vr9 vr9Var;
        SQLiteCursor sQLiteCursor;
        js7 js7Var;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        int i2;
        NativeByteBuffer byteBufferValue;
        int i3;
        byte b = this.a;
        int i4 = 4;
        long j = this.d;
        int i5 = 2;
        long j2 = this.c;
        int i6 = 0;
        int i7 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj2;
                ylb ylbVar = (ylb) obj;
                ((bu5) obj3).u();
                oc7 r1 = oc7.r1(i7);
                long j3 = this.c;
                long j4 = this.d;
                boolean o2 = r1.o2(j3, j4, null);
                lo7.n(i7).G(j3, j4, !o2);
                if (c41.a(yv1Var)) {
                    if (o2) {
                        i = 0;
                    } else {
                        i4 = 3;
                        i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    c41.z(yv1Var, i4, i, ylbVar).j();
                    return;
                }
                return;
            case 1:
                k96 k96Var = (k96) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                k96Var.b(i7);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = k96Var.getContext();
                    r63 r63Var = new r63();
                    long j5 = this.d;
                    long j6 = this.c;
                    new dxa(context, r63Var, j6, 17, "", new n40((Object) k96Var, j5, (TLObject) tL_textWithEntities, j6, (byte) 6), k96Var.N).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new c41(k96Var.b, new r63()).g0(tL_error, true);
                    return;
                }
                s96 s96Var = k96Var.Q;
                if (s96Var != null) {
                    s96Var.G();
                    return;
                }
                return;
            case 2:
                hs6 hs6Var = (hs6) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj2;
                h97 h97Var = (h97) obj;
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) hs6Var.y1.get(j2 + "_" + j);
                if (botInfo2 != null) {
                    botInfo = botInfo2;
                }
                if (h97Var != null) {
                    h97Var.a(botInfo);
                }
                hs6Var.getNotificationCenter().k(67, botInfo, Integer.valueOf(i7));
                return;
            case 3:
                oc7 oc7Var = (oc7) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                int[] iArr = (int[]) obj;
                long j7 = this.d;
                if (j2 == 0) {
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    messagesStorage.a.c(new vc7(messagesStorage, j7, (byte) 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = oc7Var.i1(j7);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (i7 == 0 && j2 == 0) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= oc7Var.E1().j.size()) {
                            vr9Var = null;
                        } else if (((vr9) oc7Var.E1().j.get(i8)).a == j7) {
                            vr9Var = (vr9) oc7Var.E1().j.get(i8);
                        } else {
                            i8++;
                        }
                    }
                    if (vr9Var != null) {
                        iArr[0] = Math.max(iArr[0], vr9Var.c);
                        wr9 E1 = oc7Var.E1();
                        E1.g -= E1.i(j7);
                        E1.k();
                    }
                    int i9 = iArr[0];
                    tL_messages_deleteSavedHistory.max_id = i9 <= 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i9;
                }
                oc7Var.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new eu0(oc7Var, j7, (Object) iArr, (TLObject) inputPeer, (byte) 4), 64);
                return;
            case 4:
                cf7 cf7Var = (cf7) obj3;
                String str = (String) obj2;
                js7 js7Var2 = (js7) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
                        StringBuilder sb = new StringBuilder("DELETE FROM onchain_offer_intents WHERE used_at < ");
                        js7Var = js7Var2;
                        try {
                            sb.append(currentTimeMillis - 1800000);
                            sb.append(" OR used_at > ");
                            sb.append(currentTimeMillis);
                            sQLiteDatabase2.executeFast(sb.toString()).stepThis().dispose();
                            SQLiteCursor queryFinalized = cf7Var.b.queryFinalized("SELECT random_id FROM onchain_offer_intents WHERE slug = ? AND amount = ? AND duration = ?", str, Long.valueOf(j), Integer.valueOf(i7));
                            try {
                                try {
                                    if (queryFinalized.next()) {
                                        try {
                                            j2 = queryFinalized.longValue(0);
                                        } catch (Exception e) {
                                            e = e;
                                            sQLiteCursor = queryFinalized;
                                            z = true;
                                            sQLitePreparedStatement = null;
                                            try {
                                                cf7Var.n(e, z);
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                gm.c3(new fu(js7Var, j2, (byte) 21));
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    queryFinalized.dispose();
                                    executeFast = cf7Var.b.executeFast("REPLACE INTO onchain_offer_intents VALUES(?, ?, ?, ?, ?)");
                                } catch (Exception e2) {
                                    e = e2;
                                    sQLiteCursor = queryFinalized;
                                    z = true;
                                    sQLitePreparedStatement = null;
                                    cf7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    gm.c3(new fu(js7Var, j2, (byte) 21));
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteCursor = null;
                            z = true;
                            sQLitePreparedStatement = null;
                            cf7Var.n(e, z);
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            gm.c3(new fu(js7Var, j2, (byte) 21));
                            return;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        js7Var = js7Var2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                try {
                    executeFast.bindString(1, str);
                    executeFast.bindLong(2, j);
                    executeFast.bindInteger(3, i7);
                    executeFast.bindLong(4, j2);
                    executeFast.bindLong(5, currentTimeMillis);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    z = true;
                    cf7Var.n(e, z);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    gm.c3(new fu(js7Var, j2, (byte) 21));
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
                gm.c3(new fu(js7Var, j2, (byte) 21));
                return;
            case 5:
                cf7 cf7Var2 = (cf7) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                try {
                    cf7Var2.b.beginTransaction();
                    int i10 = 0;
                    while (true) {
                        SQLiteDatabase sQLiteDatabase3 = cf7Var2.b;
                        if (i10 >= i5) {
                            sQLiteDatabase3.commitTransaction();
                            SQLiteDatabase sQLiteDatabase4 = cf7Var2.b;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.commitTransaction();
                                return;
                            }
                            return;
                        }
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT data FROM " + (i10 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i7 + " AND uid = " + j2, new Object[i6]);
                        try {
                            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(i6)) == null) {
                                z2 = i6;
                                i2 = i7;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i6), i6);
                                if (TLdeserialize != null) {
                                    z2 = i6;
                                    i3 = i7;
                                    TLdeserialize.readAttachPath(byteBufferValue, cf7Var2.getUserConfig().n);
                                } else {
                                    z2 = i6;
                                    i3 = i7;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str2 != null) {
                                            tL_messageMediaWidget.public_data = str2.isEmpty() ? null : str2;
                                            tL_messageMediaWidget.public_data_hash = j;
                                        }
                                        if (str3 != null) {
                                            tL_messageMediaWidget.chat_data = str3.isEmpty() ? null : str3;
                                        }
                                        SQLitePreparedStatement executeFast2 = cf7Var2.b.executeFast("UPDATE " + (i10 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        k47.p5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast2.requery();
                                        executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                        i2 = i3;
                                        executeFast2.bindInteger(2, i2);
                                        executeFast2.bindLong(3, j2);
                                        executeFast2.step();
                                        nativeByteBuffer.reuse();
                                        executeFast2.dispose();
                                    }
                                }
                                i2 = i3;
                            }
                            queryFinalized2.dispose();
                            i10++;
                            i7 = i2;
                            i6 = z2;
                            i5 = 2;
                        } catch (Exception e6) {
                            e = e6;
                            sQLiteCursor2 = queryFinalized2;
                            try {
                                cf7Var2.n(e, true);
                                SQLiteDatabase sQLiteDatabase5 = cf7Var2.b;
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
                                sQLiteDatabase = cf7Var2.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor2 = queryFinalized2;
                            sQLiteDatabase = cf7Var2.b;
                            if (sQLiteDatabase != null) {
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
            default:
                Context context2 = (Context) obj3;
                int i11 = this.b;
                ku0 g = ku0.g(i11);
                long j8 = this.c;
                g.f(context2, j8, this.d, new yg1((my0[]) obj2, context2, i11, j8, (ylb) obj, (byte) 2));
                return;
        }
    }

    public /* synthetic */ dd2(bu5 bu5Var, int i, long j, long j2, yv1 yv1Var, ylb ylbVar) {
        this.e = bu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = yv1Var;
        this.h = ylbVar;
    }

    public /* synthetic */ dd2(k96 k96Var, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = k96Var;
        this.b = i;
        this.f = tL_error;
        this.c = j;
        this.d = j2;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ dd2(hs6 hs6Var, long j, long j2, TL_bots.BotInfo botInfo, h97 h97Var, int i) {
        this.e = hs6Var;
        this.c = j;
        this.d = j2;
        this.f = botInfo;
        this.h = h97Var;
        this.b = i;
    }

    public /* synthetic */ dd2(oc7 oc7Var, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.e = oc7Var;
        this.c = j;
        this.d = j2;
        this.f = inputPeer;
        this.b = i;
        this.h = iArr;
    }

    public /* synthetic */ dd2(cf7 cf7Var, int i, long j, String str, long j2, String str2) {
        this.e = cf7Var;
        this.b = i;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.h = str2;
    }

    public /* synthetic */ dd2(cf7 cf7Var, long j, String str, long j2, int i, js7 js7Var) {
        this.e = cf7Var;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.b = i;
        this.h = js7Var;
    }
}
