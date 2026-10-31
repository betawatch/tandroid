package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lb(int i10, long j10, long j11, String str) {
        this.a = 0;
        this.d = i10;
        this.e = str;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        long j10;
        long j11;
        int i10;
        int i11;
        long j12;
        long j13;
        int i12 = this.a;
        int i13 = 0;
        long j14 = this.c;
        long j15 = this.b;
        int i14 = this.d;
        Object obj = this.e;
        switch (i12) {
            case 0:
                zs.f(i14).k(zs.X1, (String) obj, Long.valueOf(j15), Long.valueOf(j14));
                break;
            case 1:
                ui uiVar = (ui) obj;
                uiVar.getClass();
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
                    int i15 = 8;
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
                    int i16 = 7;
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
                    long j16 = this.b;
                    int i17 = 4;
                    long j17 = this.c;
                    if (j16 != 0) {
                        SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j17 + " AND topic_id = " + j16, new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j17, new Object[0]);
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
                    if (!o5.C(j17)) {
                        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
                        tL_messages_getSearchCounters.peer = uiVar.getMessagesController().i1(j17);
                        if (j16 != 0) {
                            if (j17 == uiVar.getUserConfig().e()) {
                                tL_messages_getSearchCounters.saved_peer_id = uiVar.getMessagesController().i1(j16);
                                tL_messages_getSearchCounters.flags |= 4;
                            } else {
                                tL_messages_getSearchCounters.top_msg_id = (int) j16;
                                tL_messages_getSearchCounters.flags |= 1;
                            }
                        }
                        int i18 = 0;
                        boolean z10 = false;
                        while (i18 < 9) {
                            if (tL_messages_getSearchCounters.peer == null) {
                                iArr[i18] = i13;
                            } else if (iArr[i18] == -1 || iArr3[i18] == 1) {
                                if (i18 == 0) {
                                    i10 = i13;
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                                } else {
                                    i10 = i13;
                                    if (i18 == 1) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                                    } else if (i18 == 2) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                                    } else if (i18 == 3) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                                    } else if (i18 == i17) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                                    } else if (i18 == 6) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                                    } else if (i18 == i16) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                                    } else if (i18 == i15) {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                                    } else {
                                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                                    }
                                }
                                if (iArr[i18] == -1) {
                                    z10 = true;
                                } else if (iArr3[i18] == 1) {
                                    iArr[i18] = -1;
                                }
                                i18++;
                                i13 = i10;
                                i15 = 8;
                                i16 = 7;
                                i17 = 4;
                            }
                            i10 = i13;
                            i18++;
                            i13 = i10;
                            i15 = 8;
                            i16 = 7;
                            i17 = 4;
                        }
                        if (tL_messages_getSearchCounters.filters.isEmpty()) {
                            j10 = j16;
                            j11 = j17;
                        } else {
                            j11 = j17;
                            j10 = j16;
                            uiVar.getConnectionsManager().bindRequestToGuid(uiVar.getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new yf(uiVar, iArr, j17, j16, 1)), i14);
                        }
                        if (!z10 || uiVar.getConnectionsManager().getConnectionState() != 3) {
                            i0.g3(new gg(uiVar, j11, j10, iArr2, 1));
                            break;
                        }
                    } else {
                        int i19 = 0;
                        while (i19 < 9) {
                            if (iArr[i19] == -1) {
                                SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().b;
                                Locale locale3 = Locale.US;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j17 + " AND type = " + i19 + " LIMIT 1", new Object[0]);
                                if (queryFinalized2.next()) {
                                    iArr[i19] = queryFinalized2.intValue(0);
                                } else {
                                    iArr[i19] = 0;
                                }
                                queryFinalized2.dispose();
                                i11 = i19;
                                j13 = j16;
                                long j18 = j17;
                                ui uiVar2 = uiVar;
                                uiVar2.H1(j18, j13, i11, iArr[i19]);
                                j12 = j18;
                                uiVar = uiVar2;
                            } else {
                                i11 = i19;
                                j12 = j17;
                                j13 = j16;
                            }
                            i19 = i11 + 1;
                            j17 = j12;
                            j16 = j13;
                        }
                        i0.g3(new gg(uiVar, j17, j16, iArr, 0));
                        break;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
                break;
            default:
                x00 x00Var = (x00) obj;
                long j19 = -j15;
                TLRPC.TL_forumTopic f7 = x00Var.f(j19, j14);
                if (f7 != null) {
                    f7.unread_mentions_count = i14;
                    x00Var.y(j19, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lb(f1 f1Var, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.e = f1Var;
        this.b = j10;
        this.c = j11;
        this.d = i10;
    }
}
