package org.telegram.messenger;

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ mn(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = i10;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = z2VarArr;
        this.h = p6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0205  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fw fwVar;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        int i10;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.e;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f;
                int[] iArr = (int[]) this.h;
                long j10 = this.c;
                long j11 = this.d;
                if (j10 == 0) {
                    hs messagesStorage = vpVar.getMessagesStorage();
                    messagesStorage.a.c(new cq(messagesStorage, j11, 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = vpVar.i1(j11);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (this.b == 0 && j10 == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= vpVar.F1().j.size()) {
                            fwVar = null;
                        } else if (((fw) vpVar.F1().j.get(i11)).a == j11) {
                            fwVar = (fw) vpVar.F1().j.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (fwVar != null) {
                        iArr[0] = Math.max(iArr[0], fwVar.c);
                        gw F1 = vpVar.F1();
                        F1.g -= F1.j(j11);
                        F1.l();
                    }
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    tL_messages_deleteSavedHistory.max_id = i12;
                }
                vpVar.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new hm(vpVar, j11, iArr, inputPeer, 1), 64);
                return;
            case 1:
                hs hsVar = (hs) this.e;
                int i13 = this.b;
                long j12 = this.c;
                String str = (String) this.f;
                long j13 = this.d;
                String str2 = (String) this.h;
                hsVar.getClass();
                try {
                    hsVar.b.beginTransaction();
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < 2) {
                        SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM " + (i15 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i13 + " AND uid = " + j12, new Object[i14]);
                        try {
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(i14)) == null) {
                                i10 = i15;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i14), i14);
                                if (TLdeserialize != null) {
                                    i10 = i15;
                                    TLdeserialize.readAttachPath(byteBufferValue, hsVar.getUserConfig().n);
                                } else {
                                    i10 = i15;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str != null) {
                                            tL_messageMediaWidget.public_data = str.isEmpty() ? null : str;
                                            tL_messageMediaWidget.public_data_hash = j13;
                                        }
                                        if (str2 != null) {
                                            tL_messageMediaWidget.chat_data = str2.isEmpty() ? null : str2;
                                        }
                                        SQLitePreparedStatement executeFast = hsVar.b.executeFast("UPDATE " + (i10 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        jj.q5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast.requery();
                                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                                        executeFast.bindInteger(2, i13);
                                        executeFast.bindLong(3, j12);
                                        executeFast.step();
                                        nativeByteBuffer.reuse();
                                        executeFast.dispose();
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            i15 = i10 + 1;
                            i14 = 0;
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            try {
                                hsVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase3 = hsVar.b;
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
                                sQLiteDatabase = hsVar.b;
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
                            sQLiteDatabase = hsVar.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    hsVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase4 = hsVar.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                break;
            case 2:
                z60 z60Var = (z60) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.h;
                z60Var.u();
                int i16 = this.b;
                vp r12 = vp.r1(i16);
                long j14 = this.c;
                long j15 = this.d;
                boolean q22 = r12.q2(j14, j15, null);
                ot.t(i16).G(j14, j15, !q22);
                if (org.telegram.ui.Components.cc.a(k2Var)) {
                    org.telegram.ui.Components.cc.z(k2Var, !q22 ? 3 : 4, !q22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, p6Var).j();
                    return;
                }
                return;
            case 3:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.f;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) this.h;
                int i17 = this.b;
                rh.r g10 = rh.r.g(i17);
                long j16 = this.c;
                g10.f(context, j16, this.d, new xh.q2(z2VarArr, context, i17, j16, p6Var2, 2));
                return;
            default:
                th.j0 j0Var = (th.j0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                j0Var.c(this.b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = j0Var.getContext();
                    th.b bVar = new th.b();
                    long j17 = this.d;
                    long j18 = this.c;
                    new rh.x7(context2, bVar, j18, 17, "", new a3.h0(j0Var, j17, tL_textWithEntities, j18), j0Var.M).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.cc(j0Var.b, new th.b()).f0(tL_error, true);
                    return;
                }
                th.s0 s0Var = j0Var.P;
                if (s0Var != null) {
                    s0Var.w();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ mn(vp vpVar, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = vpVar;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ mn(hs hsVar, int i10, long j10, String str, long j11, String str2) {
        this.e = hsVar;
        this.b = i10;
        this.c = j10;
        this.f = str;
        this.d = j11;
        this.h = str2;
    }

    public /* synthetic */ mn(z60 z60Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = z60Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = unVar;
        this.h = p6Var;
    }

    public /* synthetic */ mn(th.j0 j0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = j0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }
}
