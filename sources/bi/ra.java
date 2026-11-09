package bi;

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.dt;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.uv;
import org.telegram.messenger.vv;
import org.telegram.messenger.wm;
import org.telegram.messenger.xp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l60;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ra(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = i7;
        this.e = context;
        this.c = j3;
        this.d = j10;
        this.f = v2VarArr;
        this.h = g6Var;
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
        uv uvVar;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.f;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.h;
                int i10 = this.b;
                n0 g10 = n0.g(i10);
                long j3 = this.c;
                g10.f(context, j3, this.d, new hi.d3(v2VarArr, context, i10, j3, g6Var, 2));
                return;
            case 1:
                di.u0 u0Var = (di.u0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u0Var.c(this.b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = u0Var.getContext();
                    di.b bVar = new di.b();
                    long j10 = this.d;
                    long j11 = this.c;
                    new tc(context2, bVar, j11, 17, "", new h4(u0Var, j10, tL_textWithEntities, j11), u0Var.M).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.hc(u0Var.b, new di.b()).f0(tL_error, true);
                    return;
                }
                di.g1 g1Var = u0Var.P;
                if (g1Var != null) {
                    g1Var.w();
                    return;
                }
                return;
            case 2:
                qp qpVar = (qp) this.e;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f;
                int[] iArr = (int[]) this.h;
                long j12 = this.c;
                long j13 = this.d;
                if (j12 == 0) {
                    yr messagesStorage = qpVar.getMessagesStorage();
                    messagesStorage.a.c(new xp(messagesStorage, j13, 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = qpVar.j1(j13);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (this.b == 0 && j12 == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= qpVar.G1().j.size()) {
                            uvVar = null;
                        } else if (((uv) qpVar.G1().j.get(i11)).a == j13) {
                            uvVar = (uv) qpVar.G1().j.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (uvVar != null) {
                        iArr[0] = Math.max(iArr[0], uvVar.c);
                        vv G1 = qpVar.G1();
                        G1.g -= G1.j(j13);
                        G1.l();
                    }
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    tL_messages_deleteSavedHistory.max_id = i12;
                }
                qpVar.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new wm(qpVar, j13, iArr, inputPeer, 1), 64);
                return;
            case 3:
                yr yrVar = (yr) this.e;
                int i13 = this.b;
                long j14 = this.c;
                String str = (String) this.f;
                long j15 = this.d;
                String str2 = (String) this.h;
                yrVar.getClass();
                try {
                    yrVar.b.beginTransaction();
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < 2) {
                        SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM " + (i15 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i13 + " AND uid = " + j14, new Object[i14]);
                        try {
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(i14)) == null) {
                                i7 = i15;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i14), i14);
                                if (TLdeserialize != null) {
                                    i7 = i15;
                                    TLdeserialize.readAttachPath(byteBufferValue, yrVar.getUserConfig().n);
                                } else {
                                    i7 = i15;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str != null) {
                                            tL_messageMediaWidget.public_data = str.isEmpty() ? null : str;
                                            tL_messageMediaWidget.public_data_hash = j15;
                                        }
                                        if (str2 != null) {
                                            tL_messageMediaWidget.chat_data = str2.isEmpty() ? null : str2;
                                        }
                                        SQLitePreparedStatement executeFast = yrVar.b.executeFast("UPDATE " + (i7 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        ij.q5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast.requery();
                                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                                        executeFast.bindInteger(2, i13);
                                        executeFast.bindLong(3, j14);
                                        executeFast.step();
                                        nativeByteBuffer.reuse();
                                        executeFast.dispose();
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            i15 = i7 + 1;
                            i14 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = queryFinalized;
                            try {
                                yrVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
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
                                sQLiteDatabase = yrVar.b;
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
                            sQLiteDatabase = yrVar.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    yrVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase4 = yrVar.b;
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
                l60 l60Var = (l60) this.e;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.h;
                l60Var.u();
                int i16 = this.b;
                qp s12 = qp.s1(i16);
                long j16 = this.c;
                long j17 = this.d;
                boolean r22 = s12.r2(j16, j17, null);
                dt.t(i16).G(j16, j17, !r22);
                if (org.telegram.ui.Components.hc.a(f2Var)) {
                    org.telegram.ui.Components.hc.z(f2Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, g6Var2).j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ra(di.u0 u0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = u0Var;
        this.b = i7;
        this.f = tL_error;
        this.c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ ra(qp qpVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.e = qpVar;
        this.c = j3;
        this.d = j10;
        this.f = inputPeer;
        this.b = i7;
        this.h = iArr;
    }

    public /* synthetic */ ra(yr yrVar, int i7, long j3, String str, long j10, String str2) {
        this.e = yrVar;
        this.b = i7;
        this.c = j3;
        this.f = str;
        this.d = j10;
        this.h = str2;
    }

    public /* synthetic */ ra(l60 l60Var, int i7, long j3, long j10, cn cnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = l60Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.f = cnVar;
        this.h = g6Var;
    }
}
