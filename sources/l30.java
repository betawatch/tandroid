// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l30(int i, long j, long j2, String str) {
        this.a = (byte) 2;
        this.b = i;
        this.e = str;
        this.c = j;
        this.d = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0231 A[Catch: Exception -> 0x0289, TryCatch #0 {Exception -> 0x0289, blocks: (B:13:0x003a, B:16:0x0093, B:18:0x00d0, B:20:0x00d6, B:25:0x00de, B:31:0x00ed, B:35:0x00fa, B:37:0x00fe, B:39:0x0130, B:40:0x0139, B:42:0x0146, B:43:0x0137, B:47:0x014a, B:49:0x015b, B:51:0x016e, B:53:0x017a, B:54:0x018b, B:57:0x0198, B:59:0x019c, B:62:0x0237, B:63:0x019f, B:65:0x01a3, B:68:0x01af, B:70:0x022a, B:74:0x0231, B:76:0x0235, B:81:0x01c0, B:83:0x01cd, B:85:0x01da, B:88:0x01e9, B:89:0x01f6, B:91:0x01fb, B:94:0x020c, B:97:0x0219, B:98:0x0222, B:100:0x0245, B:102:0x024d, B:104:0x0271, B:107:0x027b, B:110:0x00b6), top: B:12:0x003a }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor queryFinalized;
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        byte b = this.a;
        int i3 = 0;
        int i4 = 2;
        long j4 = this.d;
        long j5 = this.c;
        int i5 = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                o30 o30Var = (o30) ((tg2) obj).c;
                String str = g8c.a;
                l93 l93Var = ((t54) o30Var).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1011, new i93(U, this.b, this.c, this.d));
                break;
            case 1:
                l93 l93Var2 = ((he0) obj).b;
                ep epVar = l93Var2.d;
                tj R = l93Var2.R(((mm5) epVar.b).isEmpty() ? null : (rx6) jle.b((mm5) epVar.b));
                l93Var2.V(R, 1006, new gf(R, this.b, this.c, this.d));
                break;
            case 2:
                kk7.f(i5).k(kk7.W1, (String) obj, Long.valueOf(j5), Long.valueOf(j4));
                break;
            case 3:
                hq6 hq6Var = (hq6) obj;
                hq6Var.getClass();
                try {
                    int[] iArr = new int[9];
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    iArr[6] = -1;
                    iArr[7] = -1;
                    iArr[8] = -1;
                    int i6 = 8;
                    int[] iArr2 = new int[9];
                    iArr2[0] = -1;
                    iArr2[1] = -1;
                    iArr2[2] = -1;
                    iArr2[3] = -1;
                    iArr2[4] = -1;
                    iArr2[5] = -1;
                    iArr2[6] = -1;
                    iArr2[7] = -1;
                    iArr2[8] = -1;
                    int i7 = 7;
                    int[] iArr3 = new int[9];
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    iArr3[2] = 0;
                    iArr3[3] = 0;
                    iArr3[4] = 0;
                    iArr3[5] = 0;
                    iArr3[6] = 0;
                    iArr3[7] = 0;
                    iArr3[8] = 0;
                    long j6 = this.c;
                    int i8 = 4;
                    long j7 = this.d;
                    if (j6 != 0) {
                        SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j7 + " AND topic_id = " + j6, new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = hq6Var.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j7, new Object[0]);
                    }
                    while (queryFinalized.next()) {
                        int intValue = queryFinalized.intValue(0);
                        if (intValue >= 0 && intValue < 9) {
                            int intValue2 = queryFinalized.intValue(1);
                            iArr[intValue] = intValue2;
                            iArr2[intValue] = intValue2;
                            iArr3[intValue] = queryFinalized.intValue(2);
                        }
                    }
                    queryFinalized.dispose();
                    if (!cf3.B(j7)) {
                        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
                        tL_messages_getSearchCounters.peer = hq6Var.getMessagesController().h1(j7);
                        if (j6 != 0) {
                            if (j7 == hq6Var.getUserConfig().e()) {
                                tL_messages_getSearchCounters.saved_peer_id = hq6Var.getMessagesController().h1(j6);
                                tL_messages_getSearchCounters.flags |= 4;
                            } else {
                                tL_messages_getSearchCounters.top_msg_id = (int) j6;
                                tL_messages_getSearchCounters.flags |= 1;
                            }
                        }
                        int i9 = 0;
                        boolean z = false;
                        while (i9 < 9) {
                            if (tL_messages_getSearchCounters.peer == null) {
                                iArr[i9] = i3;
                            } else if (iArr[i9] == -1 || iArr3[i9] == 1) {
                                if (i9 == 0) {
                                    i = i3;
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                                } else {
                                    i = i3;
                                    if (i9 == 1) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                                    } else if (i9 == i4) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                                    } else if (i9 == 3) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                                    } else if (i9 == i8) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                                    } else {
                                        ArrayList<TLRPC.MessagesFilter> arrayList = tL_messages_getSearchCounters.filters;
                                        if (i9 == 6) {
                                            i2 = i4;
                                            arrayList.add(new TLRPC.TL_inputMessagesFilterPhotos());
                                        } else {
                                            i2 = i4;
                                            if (i9 == i7) {
                                                arrayList.add(new TLRPC.TL_inputMessagesFilterVideo());
                                            } else if (i9 == i6) {
                                                arrayList.add(new TLRPC.TL_inputMessagesFilterPoll());
                                            } else {
                                                arrayList.add(new TLRPC.TL_inputMessagesFilterGif());
                                            }
                                        }
                                        if (iArr[i9] != -1) {
                                            z = true;
                                        } else if (iArr3[i9] == 1) {
                                            iArr[i9] = -1;
                                        }
                                        i9++;
                                        i4 = i2;
                                        i3 = i;
                                        i6 = 8;
                                        i7 = 7;
                                        i8 = 4;
                                    }
                                }
                                i2 = i4;
                                if (iArr[i9] != -1) {
                                }
                                i9++;
                                i4 = i2;
                                i3 = i;
                                i6 = 8;
                                i7 = 7;
                                i8 = 4;
                            }
                            i = i3;
                            i2 = i4;
                            i9++;
                            i4 = i2;
                            i3 = i;
                            i6 = 8;
                            i7 = 7;
                            i8 = 4;
                        }
                        if (tL_messages_getSearchCounters.filters.isEmpty()) {
                            j = j7;
                            j2 = j6;
                        } else {
                            ConnectionsManager connectionsManager = hq6Var.getConnectionsManager();
                            pn6 pn6Var = new pn6(hq6Var, iArr, j7, j6, (byte) 1);
                            hq6Var = hq6Var;
                            j = j7;
                            j2 = j6;
                            hq6Var.getConnectionsManager().bindRequestToGuid(connectionsManager.sendRequest(tL_messages_getSearchCounters, pn6Var), i5);
                        }
                        if (!z || hq6Var.getConnectionsManager().getConnectionState() != 3) {
                            gl.d3(new vn6(hq6Var, j, j2, iArr2, (byte) 1));
                            break;
                        }
                    } else {
                        int i10 = 0;
                        while (i10 < 9) {
                            if (iArr[i10] == -1) {
                                SQLiteDatabase sQLiteDatabase3 = hq6Var.getMessagesStorage().b;
                                Locale locale3 = Locale.US;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j7 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
                                if (queryFinalized2.next()) {
                                    iArr[i10] = queryFinalized2.intValue(0);
                                } else {
                                    iArr[i10] = 0;
                                }
                                queryFinalized2.dispose();
                                j3 = j6;
                                long j8 = j7;
                                hq6Var.K1(i10, iArr[i10], j8, j3);
                                j7 = j8;
                            } else {
                                j3 = j6;
                            }
                            i10++;
                            j6 = j3;
                        }
                        gl.d3(new vn6(hq6Var, j7, j6, iArr, (byte) 0));
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 4:
                ((na7) obj).m0(this.c, this.b, this.d);
                break;
            default:
                pub pubVar = (pub) obj;
                long j9 = -j5;
                TLRPC.TL_forumTopic f = pubVar.f(j9, j4);
                if (f != null) {
                    f.unread_mentions_count = i5;
                    pubVar.y(j9, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l30(pf0 pf0Var, long j, long j2, int i, byte b) {
        this.a = b;
        this.e = pf0Var;
        this.c = j;
        this.d = j2;
        this.b = i;
    }

    public /* synthetic */ l30(Object obj, int i, long j, long j2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = j2;
    }
}
