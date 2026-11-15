package di;

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.at;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.sv;
import org.telegram.messenger.tm;
import org.telegram.messenger.tv;
import org.telegram.messenger.up;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ g9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = i7;
        this.e = context;
        this.c = j3;
        this.d = j10;
        this.f = u2VarArr;
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
        sv svVar;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.f;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                int i10 = this.b;
                e0 g10 = e0.g(i10);
                long j3 = this.c;
                g10.f(context, j3, this.d, new ki.a3(u2VarArr, context, i10, j3, e6Var, 2));
                return;
            case 1:
                fi.u0 u0Var = (fi.u0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u0Var.c(this.b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = u0Var.getContext();
                    fi.b bVar = new fi.b();
                    long j10 = this.d;
                    long j11 = this.c;
                    new cb(context2, bVar, j11, 17, "", new d3.e0(u0Var, j10, tL_textWithEntities, j11), u0Var.N).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.cc(u0Var.b, new fi.b()).f0(tL_error, true);
                    return;
                }
                fi.e1 e1Var = u0Var.Q;
                if (e1Var != null) {
                    e1Var.w();
                    return;
                }
                return;
            case 2:
                np npVar = (np) this.e;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f;
                int[] iArr = (int[]) this.h;
                long j12 = this.c;
                long j13 = this.d;
                if (j12 == 0) {
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.a.c(new up(messagesStorage, j13, 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = npVar.j1(j13);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (this.b == 0 && j12 == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= npVar.G1().j.size()) {
                            svVar = null;
                        } else if (((sv) npVar.G1().j.get(i11)).a == j13) {
                            svVar = (sv) npVar.G1().j.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (svVar != null) {
                        iArr[0] = Math.max(iArr[0], svVar.c);
                        tv G1 = npVar.G1();
                        G1.g -= G1.j(j13);
                        G1.l();
                    }
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    tL_messages_deleteSavedHistory.max_id = i12;
                }
                npVar.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new tm(npVar, j13, iArr, inputPeer, 1), 64);
                return;
            case 3:
                vr vrVar = (vr) this.e;
                int i13 = this.b;
                long j14 = this.c;
                String str = (String) this.f;
                long j15 = this.d;
                String str2 = (String) this.h;
                vrVar.getClass();
                try {
                    vrVar.b.beginTransaction();
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < 2) {
                        SQLiteDatabase sQLiteDatabase2 = vrVar.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM " + (i15 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i13 + " AND uid = " + j14, new Object[i14]);
                        try {
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(i14)) == null) {
                                i7 = i15;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i14), i14);
                                if (TLdeserialize != null) {
                                    i7 = i15;
                                    TLdeserialize.readAttachPath(byteBufferValue, vrVar.getUserConfig().n);
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
                                        SQLitePreparedStatement executeFast = vrVar.b.executeFast("UPDATE " + (i7 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        gj.q5(TLdeserialize);
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
                                vrVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase3 = vrVar.b;
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
                                sQLiteDatabase = vrVar.b;
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
                            sQLiteDatabase = vrVar.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    vrVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase4 = vrVar.b;
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
                m60 m60Var = (m60) this.e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.h;
                m60Var.u();
                int i16 = this.b;
                np s12 = np.s1(i16);
                long j16 = this.c;
                long j17 = this.d;
                boolean r22 = s12.r2(j16, j17, null);
                at.t(i16).G(j16, j17, !r22);
                if (org.telegram.ui.Components.cc.a(e2Var)) {
                    org.telegram.ui.Components.cc.z(e2Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, e6Var2).j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g9(fi.u0 u0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = u0Var;
        this.b = i7;
        this.f = tL_error;
        this.c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ g9(np npVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.e = npVar;
        this.c = j3;
        this.d = j10;
        this.f = inputPeer;
        this.b = i7;
        this.h = iArr;
    }

    public /* synthetic */ g9(vr vrVar, int i7, long j3, String str, long j10, String str2) {
        this.e = vrVar;
        this.b = i7;
        this.c = j3;
        this.f = str;
        this.d = j10;
        this.h = str2;
    }

    public /* synthetic */ g9(m60 m60Var, int i7, long j3, long j10, an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = m60Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.f = anVar;
        this.h = e6Var;
    }
}
