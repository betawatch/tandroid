package ci;

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.hp;
import org.telegram.messenger.mm;
import org.telegram.messenger.mv;
import org.telegram.messenger.nv;
import org.telegram.messenger.op;
import org.telegram.messenger.qr;
import org.telegram.messenger.us;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f60;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p9(int i3, Context context, long j10, long j11, org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = i3;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = t2VarArr;
        this.h = e6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        mv mvVar;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        int i3;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.f;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                int i10 = this.b;
                i0 g7 = i0.g(i10);
                long j10 = this.c;
                g7.f(context, j10, this.d, new ii.d3(t2VarArr, context, i10, j10, e6Var, 2));
                return;
            case 1:
                ei.w0 w0Var = (ei.w0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                w0Var.c(this.b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = w0Var.getContext();
                    ei.b bVar = new ei.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new mb(context2, bVar, j12, 17, "", new c3.f0(w0Var, j11, tL_textWithEntities, j12), w0Var.N).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.fc(w0Var.b, new ei.b()).f0(tL_error, true);
                    return;
                }
                ei.g1 g1Var = w0Var.Q;
                if (g1Var != null) {
                    g1Var.w();
                    return;
                }
                return;
            case 2:
                hp hpVar = (hp) this.e;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f;
                int[] iArr = (int[]) this.h;
                long j13 = this.c;
                long j14 = this.d;
                if (j13 == 0) {
                    qr messagesStorage = hpVar.getMessagesStorage();
                    messagesStorage.a.c(new op(messagesStorage, j14, 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = hpVar.j1(j14);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (this.b == 0 && j13 == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= hpVar.G1().j.size()) {
                            mvVar = null;
                        } else if (((mv) hpVar.G1().j.get(i11)).a == j14) {
                            mvVar = (mv) hpVar.G1().j.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (mvVar != null) {
                        iArr[0] = Math.max(iArr[0], mvVar.c);
                        nv G1 = hpVar.G1();
                        G1.g -= G1.j(j14);
                        G1.l();
                    }
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    tL_messages_deleteSavedHistory.max_id = i12;
                }
                hpVar.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new mm(hpVar, j14, iArr, inputPeer, 1), 64);
                return;
            case 3:
                qr qrVar = (qr) this.e;
                int i13 = this.b;
                long j15 = this.c;
                String str = (String) this.f;
                long j16 = this.d;
                String str2 = (String) this.h;
                qrVar.getClass();
                try {
                    qrVar.b.beginTransaction();
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < 2) {
                        SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM " + (i15 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i13 + " AND uid = " + j15, new Object[i14]);
                        try {
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(i14)) == null) {
                                i3 = i15;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i14), i14);
                                if (TLdeserialize != null) {
                                    i3 = i15;
                                    TLdeserialize.readAttachPath(byteBufferValue, qrVar.getUserConfig().n);
                                } else {
                                    i3 = i15;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str != null) {
                                            tL_messageMediaWidget.public_data = str.isEmpty() ? null : str;
                                            tL_messageMediaWidget.public_data_hash = j16;
                                        }
                                        if (str2 != null) {
                                            tL_messageMediaWidget.chat_data = str2.isEmpty() ? null : str2;
                                        }
                                        SQLitePreparedStatement executeFast = qrVar.b.executeFast("UPDATE " + (i3 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        zi.r5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast.requery();
                                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                                        executeFast.bindInteger(2, i13);
                                        executeFast.bindLong(3, j15);
                                        executeFast.step();
                                        nativeByteBuffer.reuse();
                                        executeFast.dispose();
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            i15 = i3 + 1;
                            i14 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = queryFinalized;
                            try {
                                qrVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteDatabase = qrVar.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            sQLiteDatabase = qrVar.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    qrVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase4 = qrVar.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                break;
            default:
                f60 f60Var = (f60) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.h;
                f60Var.u();
                int i16 = this.b;
                hp s12 = hp.s1(i16);
                long j17 = this.c;
                long j18 = this.d;
                boolean r22 = s12.r2(j17, j18, null);
                us.t(i16).G(j17, j18, !r22);
                if (org.telegram.ui.Components.fc.a(d2Var)) {
                    org.telegram.ui.Components.fc.z(d2Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, e6Var2).j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ p9(ei.w0 w0Var, int i3, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = w0Var;
        this.b = i3;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ p9(hp hpVar, long j10, long j11, TLRPC.InputPeer inputPeer, int i3, int[] iArr) {
        this.e = hpVar;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i3;
        this.h = iArr;
    }

    public /* synthetic */ p9(qr qrVar, int i3, long j10, String str, long j11, String str2) {
        this.e = qrVar;
        this.b = i3;
        this.c = j10;
        this.f = str;
        this.d = j11;
        this.h = str2;
    }

    public /* synthetic */ p9(f60 f60Var, int i3, long j10, long j11, wm wmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = f60Var;
        this.b = i3;
        this.c = j10;
        this.d = j11;
        this.f = wmVar;
        this.h = e6Var;
    }
}
