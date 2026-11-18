package di;

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.nd;
import org.telegram.messenger.ov;
import org.telegram.messenger.pm;
import org.telegram.messenger.pp;
import org.telegram.messenger.pv;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.x2[] x2VarArr, org.telegram.ui.ActionBar.i6 i6Var) {
        this.b = i7;
        this.e = context;
        this.c = j3;
        this.d = j10;
        this.f = x2VarArr;
        this.h = i6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v12 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ov ovVar;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        int i7;
        NativeByteBuffer byteBufferValue;
        int i10;
        int i11 = this.a;
        long j3 = this.d;
        long j10 = this.c;
        int i12 = 0;
        int i13 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i14 = 1;
        switch (i11) {
            case 0:
                Context context = (Context) obj3;
                int i15 = this.b;
                e0 g10 = e0.g(i15);
                long j11 = this.c;
                g10.f(context, j11, this.d, new ki.w2((org.telegram.ui.ActionBar.x2[]) obj2, context, i15, j11, (org.telegram.ui.ActionBar.i6) obj, 2));
                return;
            case 1:
                fi.t0 t0Var = (fi.t0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                t0Var.c(i13);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = t0Var.getContext();
                    fi.b bVar = new fi.b();
                    long j12 = this.d;
                    long j13 = this.c;
                    new fb(context2, bVar, j13, 17, "", new d3.e0(t0Var, j12, tL_textWithEntities, j13), t0Var.N).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.lc(t0Var.b, new fi.b()).g0(tL_error, true);
                    return;
                }
                fi.c1 c1Var = t0Var.Q;
                if (c1Var != null) {
                    c1Var.w();
                    return;
                }
                return;
            case 2:
                ri riVar = (ri) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj2;
                x10 x10Var = (x10) obj;
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) riVar.y1.get(j10 + "_" + j3);
                if (botInfo2 != null) {
                    botInfo = botInfo2;
                }
                if (x10Var != null) {
                    x10Var.a(botInfo);
                }
                riVar.getNotificationCenter().k(66, botInfo, Integer.valueOf(i13));
                return;
            case 3:
                mp mpVar = (mp) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                int[] iArr = (int[]) obj;
                long j14 = this.d;
                if (j10 == 0) {
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.a.c(new pp(messagesStorage, j14, 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = mpVar.l1(j14);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (i13 == 0 && j10 == 0) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= mpVar.I1().j.size()) {
                            ovVar = null;
                        } else if (((ov) mpVar.I1().j.get(i16)).a == j14) {
                            ovVar = (ov) mpVar.I1().j.get(i16);
                        } else {
                            i16++;
                        }
                    }
                    if (ovVar != null) {
                        iArr[0] = Math.max(iArr[0], ovVar.c);
                        pv I1 = mpVar.I1();
                        I1.g -= I1.j(j14);
                        I1.l();
                    }
                    int i17 = iArr[0];
                    if (i17 <= 0) {
                        i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    tL_messages_deleteSavedHistory.max_id = i17;
                }
                mpVar.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new pm(mpVar, j14, iArr, inputPeer, 1), 64);
                return;
            case 4:
                tr trVar = (tr) obj3;
                String str = (String) obj2;
                bi.x4 x4Var = (bi.x4) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = trVar.b;
                        StringBuilder sb2 = new StringBuilder("DELETE FROM onchain_offer_intents WHERE used_at < ");
                        try {
                            sb2.append(currentTimeMillis - 1800000);
                            sb2.append(" OR used_at > ");
                            sb2.append(currentTimeMillis);
                            sQLiteDatabase2.executeFast(sb2.toString()).stepThis().dispose();
                            queryFinalized = trVar.b.queryFinalized("SELECT random_id FROM onchain_offer_intents WHERE slug = ? AND amount = ? AND duration = ?", str, Long.valueOf(j3), Integer.valueOf(i13));
                            try {
                                try {
                                    j10 = queryFinalized.next() ? queryFinalized.longValue(0) : j10;
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
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = queryFinalized;
                                j10 = j10;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            j10 = j10;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    try {
                        queryFinalized.dispose();
                    } catch (Exception e13) {
                        e = e13;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = null;
                        try {
                            trVar.o(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            org.telegram.messenger.g0.g3(new nd(x4Var, j10, i14));
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    try {
                        executeFast = trVar.b.executeFast("REPLACE INTO onchain_offer_intents VALUES(?, ?, ?, ?, ?)");
                    } catch (Exception e14) {
                        e = e14;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = null;
                        trVar.o(e, true);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        org.telegram.messenger.g0.g3(new nd(x4Var, j10, i14));
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                try {
                    executeFast.bindString(1, str);
                    executeFast.bindLong(2, j3);
                    executeFast.bindInteger(3, i13);
                    executeFast.bindLong(4, j10);
                    executeFast.bindLong(5, currentTimeMillis);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    trVar.o(e, true);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    org.telegram.messenger.g0.g3(new nd(x4Var, j10, i14));
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                org.telegram.messenger.g0.g3(new nd(x4Var, j10, i14));
                return;
            case 5:
                tr trVar2 = (tr) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                trVar2.getClass();
                try {
                    trVar2.b.beginTransaction();
                    int i18 = 0;
                    for (int i19 = 2; i18 < i19; i19 = 2) {
                        SQLiteDatabase sQLiteDatabase3 = trVar2.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT data FROM " + (i18 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i13 + " AND uid = " + j10, new Object[i12]);
                        try {
                            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(i12)) == null) {
                                z10 = i12;
                                i7 = i13;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i12), i12);
                                if (TLdeserialize != null) {
                                    z10 = i12;
                                    i10 = i13;
                                    TLdeserialize.readAttachPath(byteBufferValue, trVar2.getUserConfig().n);
                                } else {
                                    z10 = i12;
                                    i10 = i13;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str2 != null) {
                                            tL_messageMediaWidget.public_data = str2.isEmpty() ? null : str2;
                                            tL_messageMediaWidget.public_data_hash = j3;
                                        }
                                        if (str3 != null) {
                                            tL_messageMediaWidget.chat_data = str3.isEmpty() ? null : str3;
                                        }
                                        SQLitePreparedStatement executeFast2 = trVar2.b.executeFast("UPDATE " + (i18 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        fj.q5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast2.requery();
                                        executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                        i7 = i10;
                                        executeFast2.bindInteger(2, i7);
                                        executeFast2.bindLong(3, j10);
                                        executeFast2.step();
                                        nativeByteBuffer.reuse();
                                        executeFast2.dispose();
                                    }
                                }
                                i7 = i10;
                            }
                            queryFinalized2.dispose();
                            i18++;
                            i13 = i7;
                            i12 = z10;
                        } catch (Exception e16) {
                            e = e16;
                            sQLiteCursor2 = queryFinalized2;
                            try {
                                trVar2.o(e, true);
                                SQLiteDatabase sQLiteDatabase4 = trVar2.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                sQLiteDatabase = trVar2.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            sQLiteCursor2 = queryFinalized2;
                            sQLiteDatabase = trVar2.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor2 != null) {
                            }
                            throw th;
                        }
                    }
                    trVar2.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase5 = trVar2.b;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor2 = null;
                }
                break;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                ((y60) obj3).v();
                mp u12 = mp.u1(i13);
                long j15 = this.c;
                long j16 = this.d;
                boolean u22 = u12.u2(j15, j16, null);
                xs.t(i13).G(j15, j16, !u22);
                if (org.telegram.ui.Components.lc.a(h2Var)) {
                    org.telegram.ui.Components.lc.z(h2Var, !u22 ? 3 : 4, !u22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, i6Var).j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ i9(fi.t0 t0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = t0Var;
        this.b = i7;
        this.f = tL_error;
        this.c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ i9(ri riVar, long j3, long j10, TL_bots.BotInfo botInfo, x10 x10Var, int i7) {
        this.e = riVar;
        this.c = j3;
        this.d = j10;
        this.f = botInfo;
        this.h = x10Var;
        this.b = i7;
    }

    public /* synthetic */ i9(mp mpVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.e = mpVar;
        this.c = j3;
        this.d = j10;
        this.f = inputPeer;
        this.b = i7;
        this.h = iArr;
    }

    public /* synthetic */ i9(tr trVar, int i7, long j3, String str, long j10, String str2) {
        this.e = trVar;
        this.b = i7;
        this.c = j3;
        this.f = str;
        this.d = j10;
        this.h = str2;
    }

    public /* synthetic */ i9(tr trVar, long j3, String str, long j10, int i7, bi.x4 x4Var) {
        this.e = trVar;
        this.c = j3;
        this.f = str;
        this.d = j10;
        this.b = i7;
        this.h = x4Var;
    }

    public /* synthetic */ i9(y60 y60Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.e = y60Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.f = bnVar;
        this.h = i6Var;
    }
}
