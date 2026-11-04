package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k7(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:42|43|44|(6:47|(1:72)(2:49|(4:69|70|71|66)(3:51|52|(2:53|(3:55|(2:57|58)(2:60|(2:62|63)(1:67))|59)(1:68))))|64|65|66|45)|73|74|(1:76)|78|(4:(5:129|130|(3:131|132|(3:134|(4:136|(6:138|(8:141|142|143|144|145|146|147|139)|153|154|(1:156)|157)(1:164)|158|(2:160|161)(1:163))(2:165|166)|162)(1:167))|168|(14:174|(2:177|175)|178|179|(1:181)|182|82|83|84|(2:86|(2:87|(2:89|(2:92|93)(1:91))(1:101)))(3:102|103|(2:105|(2:106|(2:108|(2:111|112)(1:110))(1:113)))(3:114|115|(2:117|(2:118|(2:120|(2:123|124)(1:122))(1:125)))(0)))|94|95|96|97))(1:80)|95|96|97)|81|82|83|84|(0)(0)|94) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x044e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x044f, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b3 A[Catch: Exception -> 0x044e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044e, blocks: (B:83:0x035e, B:102:0x03b3, B:114:0x03f8), top: B:82:0x035e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0373 A[Catch: Exception -> 0x0268, TRY_ENTER, TryCatch #4 {Exception -> 0x0268, blocks: (B:147:0x0241, B:154:0x027c, B:156:0x0288, B:158:0x02b3, B:160:0x02cb, B:162:0x02d6, B:170:0x02e8, B:177:0x02f3, B:179:0x0330, B:181:0x0334, B:86:0x0373, B:87:0x038a, B:89:0x0392, B:93:0x03a6, B:105:0x03b9, B:106:0x03d0, B:108:0x03d8, B:112:0x03ec, B:117:0x03fe, B:118:0x0415, B:120:0x041d, B:124:0x0431), top: B:146:0x0241 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z10;
        boolean z11;
        int i3;
        TLRPC.Message message;
        int i10;
        long j10;
        int i11;
        int i12;
        hp hpVar;
        int i13;
        hp hpVar2;
        boolean z12;
        int i14;
        TLRPC.Peer peer;
        k7 k7Var = this;
        hp hpVar3 = (hp) k7Var.c;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) k7Var.d;
        boolean z13 = true;
        try {
            i3 = 0;
            hpVar3.getUserConfig().z(0, hpVar3.getUserConfig().n(0) + messages_dialogs.dialogs.size());
            message = null;
            i10 = 0;
        } catch (Exception e10) {
            e = e10;
        }
        while (true) {
            j10 = 1000;
            if (i10 >= messages_dialogs.messages.size()) {
                break;
            }
            try {
                TLRPC.Message message2 = messages_dialogs.messages.get(i10);
                if (r2.a) {
                    a8.b("search migrate id " + message2.id + " date " + bd.E0().z0().format(message2.date * 1000));
                }
                if (message == null || message2.date < message.date) {
                    message = message2;
                }
                i10++;
            } catch (Exception e11) {
                e = e11;
                z11 = true;
            }
            e = e11;
            z11 = true;
            a8.g(e, z11);
            g0.h3(new in(hpVar3, 1));
            return;
        }
        if (r2.a) {
            a8.b("migrate step with id " + message.id + " date " + bd.E0().z0().format(message.date * 1000));
        }
        if (messages_dialogs.dialogs.size() >= 100) {
            i11 = message.id;
        } else {
            if (r2.a) {
                a8.b("migrate stop due to not 100 dialogs");
            }
            int i15 = 0;
            for (int i16 = 2; i15 < i16; i16 = 2) {
                long j11 = j10;
                hpVar3.getUserConfig().x(i15, ConnectionsManager.DEFAULT_DATACENTER_ID, hpVar3.getUserConfig().L, hpVar3.getUserConfig().M, hpVar3.getUserConfig().N, hpVar3.getUserConfig().O, hpVar3.getUserConfig().P);
                i15++;
                j10 = j11;
            }
            i11 = -1;
        }
        long j12 = j10;
        StringBuilder sb2 = new StringBuilder(messages_dialogs.dialogs.size() * 12);
        a0.h hVar = new a0.h();
        for (int i17 = 0; i17 < messages_dialogs.dialogs.size(); i17++) {
            TLRPC.Dialog dialog = messages_dialogs.dialogs.get(i17);
            m5.x(dialog);
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(dialog.id);
            hVar.k(dialog, dialog.id);
        }
        SQLiteDatabase sQLiteDatabase = hpVar3.getMessagesStorage().b;
        Locale locale = Locale.US;
        try {
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did, folder_id FROM dialogs WHERE did IN (" + sb2.toString() + ")", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                int intValue = queryFinalized.intValue(1);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar.f(longValue);
                if (dialog2 != null) {
                    if (dialog2.folder_id == intValue) {
                        messages_dialogs.dialogs.remove(dialog2);
                        int i18 = 0;
                        while (true) {
                            if (i18 >= messages_dialogs.messages.size()) {
                                break;
                            }
                            TLRPC.Message message3 = messages_dialogs.messages.get(i18);
                            if (zi.B0(message3) == longValue) {
                                messages_dialogs.messages.remove(i18);
                                i18--;
                                if (message3.id == dialog2.top_message) {
                                    dialog2.top_message = 0;
                                    break;
                                }
                            }
                            i18++;
                        }
                    }
                }
                hVar.l(longValue);
            }
            queryFinalized.dispose();
            if (r2.a) {
                a8.b("migrate found missing dialogs " + messages_dialogs.dialogs.size());
            }
            SQLiteCursor queryFinalized2 = hpVar3.getMessagesStorage().b.queryFinalized("SELECT min(date) FROM dialogs WHERE date != 0 AND did >> 32 NOT IN (536870912, 1073741824)", new Object[0]);
            try {
                if (queryFinalized2.next()) {
                    try {
                        int max = Math.max(1441062000, queryFinalized2.intValue(0));
                        int i19 = 0;
                        while (true) {
                            int size = messages_dialogs.messages.size();
                            i12 = k7Var.b;
                            String str = "migrate stop due to reached loaded dialogs ";
                            if (i19 >= size) {
                                break;
                            }
                            TLRPC.Message message4 = messages_dialogs.messages.get(i19);
                            if (message4.date < max) {
                                if (i12 != -1) {
                                    int i20 = i3;
                                    while (i20 < 2) {
                                        int i21 = i19;
                                        z10 = z13;
                                        String str2 = str;
                                        try {
                                            hp hpVar4 = hpVar3;
                                            try {
                                                int i22 = i20;
                                                hpVar3.getUserConfig().x(i22, hpVar3.getUserConfig().K, hpVar3.getUserConfig().L, hpVar3.getUserConfig().M, hpVar3.getUserConfig().N, hpVar3.getUserConfig().O, hpVar4.getUserConfig().P);
                                                i20 = i22 + 1;
                                                i19 = i21;
                                                z13 = z10;
                                                str = str2;
                                                hpVar3 = hpVar4;
                                            } catch (Exception e12) {
                                                e = e12;
                                                z11 = z10;
                                                hpVar3 = hpVar4;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            z11 = z10;
                                            a8.g(e, z11);
                                            g0.h3(new in(hpVar3, 1));
                                            return;
                                        }
                                    }
                                    hpVar2 = hpVar3;
                                    i14 = i19;
                                    z12 = z13;
                                    String str3 = str;
                                    if (r2.a) {
                                        a8.b(str3 + bd.E0().z0().format(max * j12));
                                    }
                                    i11 = -1;
                                } else {
                                    hpVar2 = hpVar3;
                                    i14 = i19;
                                    z12 = z13;
                                }
                                int i23 = i14;
                                messages_dialogs.messages.remove(i23);
                                i19 = i23 - 1;
                                long B0 = zi.B0(message4);
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(B0);
                                hVar.l(B0);
                                if (dialog3 != null) {
                                    messages_dialogs.dialogs.remove(dialog3);
                                }
                            } else {
                                hpVar2 = hpVar3;
                                z12 = z13;
                            }
                            i19++;
                            k7Var = this;
                            z13 = z12;
                            hpVar3 = hpVar2;
                            i3 = 0;
                        }
                        hpVar = hpVar3;
                        z10 = z13;
                        if (message != null && message.date < max && i12 != -1) {
                            int i24 = 0;
                            while (i24 < 2) {
                                int i25 = i24;
                                hpVar.getUserConfig().x(i25, hpVar.getUserConfig().K, hpVar.getUserConfig().L, hpVar.getUserConfig().M, hpVar.getUserConfig().N, hpVar.getUserConfig().O, hpVar.getUserConfig().P);
                                i24 = i25 + 1;
                            }
                            if (r2.a) {
                                a8.b("migrate stop due to reached loaded dialogs " + bd.E0().z0().format(max * j12));
                            }
                            i13 = -1;
                            queryFinalized2.dispose();
                            hpVar.getUserConfig().L = message.date;
                            peer = message.peer_id;
                            if (peer.channel_id == 0) {
                                hpVar.getUserConfig().O = message.peer_id.channel_id;
                                hpVar.getUserConfig().N = 0L;
                                hpVar.getUserConfig().M = 0L;
                                int i26 = 0;
                                while (true) {
                                    if (i26 >= messages_dialogs.chats.size()) {
                                        break;
                                    }
                                    TLRPC.Chat chat = messages_dialogs.chats.get(i26);
                                    if (chat.id == hpVar.getUserConfig().O) {
                                        hpVar.getUserConfig().P = chat.access_hash;
                                        break;
                                    }
                                    i26++;
                                }
                            } else if (peer.chat_id != 0) {
                                hpVar.getUserConfig().N = message.peer_id.chat_id;
                                hpVar.getUserConfig().O = 0L;
                                hpVar.getUserConfig().M = 0L;
                                int i27 = 0;
                                while (true) {
                                    if (i27 >= messages_dialogs.chats.size()) {
                                        break;
                                    }
                                    TLRPC.Chat chat2 = messages_dialogs.chats.get(i27);
                                    if (chat2.id == hpVar.getUserConfig().N) {
                                        hpVar.getUserConfig().P = chat2.access_hash;
                                        break;
                                    }
                                    i27++;
                                }
                            } else if (peer.user_id != 0) {
                                hpVar.getUserConfig().M = message.peer_id.user_id;
                                hpVar.getUserConfig().N = 0L;
                                hpVar.getUserConfig().O = 0L;
                                int i28 = 0;
                                while (true) {
                                    if (i28 >= messages_dialogs.users.size()) {
                                        break;
                                    }
                                    TLRPC.User user = messages_dialogs.users.get(i28);
                                    if (user.id == hpVar.getUserConfig().M) {
                                        hpVar.getUserConfig().P = user.access_hash;
                                        break;
                                    }
                                    i28++;
                                }
                            }
                            hpVar3 = hpVar;
                            hpVar3.J3(messages_dialogs, null, null, 0, i13, 0, 0, false, true, false);
                            return;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        z10 = z13;
                        z11 = z10;
                        a8.g(e, z11);
                        g0.h3(new in(hpVar3, 1));
                        return;
                    }
                } else {
                    hpVar = hpVar3;
                    z10 = true;
                }
                hpVar3.J3(messages_dialogs, null, null, 0, i13, 0, 0, false, true, false);
                return;
            } catch (Exception e15) {
                e = e15;
                z11 = z10;
                a8.g(e, z11);
                g0.h3(new in(hpVar3, 1));
                return;
            }
            i13 = i11;
            queryFinalized2.dispose();
            hpVar.getUserConfig().L = message.date;
            peer = message.peer_id;
            if (peer.channel_id == 0) {
            }
            hpVar3 = hpVar;
        } catch (Exception e16) {
            e = e16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x053a, code lost:
    
        if (r11 == null) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [org.telegram.messenger.w7] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.messenger.wv] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [org.telegram.messenger.wv] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r7v15, types: [org.telegram.messenger.e20] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int P;
        nb nbVar;
        ac acVar;
        ?? r62;
        TLRPC.Document document;
        TLObject tLObject;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2;
        ?? r9;
        ?? r72;
        int i3;
        int i10;
        boolean z10;
        int i11 = 22;
        int i12 = 7;
        SQLiteCursor sQLiteCursor = null;
        switch (this.a) {
            case 0:
                w7 w7Var = (w7) this.c;
                String str = (String) this.d;
                int i13 = this.b;
                i7 i7Var = (i7) w7Var.w.get(str);
                if (i7Var == null || i7Var.W0 == (P = w7Var.P(i13))) {
                    return;
                }
                i7Var.W0 = P;
                mg.f fVar = i7Var.e1;
                ((ArrayList) fVar.d).remove(i7Var);
                fVar.a(i7Var);
                fVar.b(false);
                StringBuilder u10 = a1.g.u("update priority ", str, " position in queue ");
                u10.append(((ArrayList) i7Var.e1.d).indexOf(i7Var));
                u10.append(" account=");
                k2.p1.q(w7Var.currentAccount, u10);
                return;
            case 1:
                qr qrVar = (qr) this.c;
                int i14 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                qrVar.getClass();
                try {
                    long j10 = message.id;
                    if (zi.c4(message)) {
                        i14 = 5;
                    } else if (zi.e5(message)) {
                        i14 = 9;
                    }
                    if (i14 == 9) {
                        SQLiteDatabase sQLiteDatabase = qrVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j10 + " AND dialog_id = " + zi.B0(message)).stepThis().dispose();
                        return;
                    }
                    if (i14 == 5) {
                        SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j10 + " AND topic_id = " + zi.I1(qrVar.currentAccount, message)).stepThis().dispose();
                        return;
                    }
                    if (i14 == 1) {
                        SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                        Locale locale3 = Locale.US;
                        sQLiteDatabase3.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + zi.B0(message)).stepThis().dispose();
                        return;
                    }
                    SQLiteDatabase sQLiteDatabase4 = qrVar.b;
                    Locale locale4 = Locale.US;
                    sQLiteDatabase4.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + zi.B0(message)).stepThis().dispose();
                    qrVar.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + zi.B0(message)).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    qrVar.o(e10, true);
                    return;
                }
            case 2:
                z5 z5Var = (z5) this.c;
                zi ziVar = (zi) this.d;
                int i15 = this.b;
                ArrayList arrayList = z5Var.H;
                TLRPC.Document F0 = ziVar.F0();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document F02 = ((zi) arrayList.get(i16)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList.remove(i16);
                        z5Var.getNotificationCenter().k(hs.b5, new Object[0]);
                        if (i15 == 0) {
                            hs.e().k(hs.P4, 1, bd.a0("MessageNotFound", null, 2131748560, new Object[0]));
                            return;
                        } else {
                            if (i15 == -1) {
                                LaunchActivity.D(2);
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 3:
                zb zbVar = (zb) this.c;
                ImageReceiver imageReceiver = (ImageReceiver) this.d;
                int i17 = this.b;
                int i18 = 0;
                while (i18 < 3) {
                    int G = imageReceiver.G(i18 == 0 ? 1 : i18 == 1 ? 0 : 3);
                    if (G != 0 && (nbVar = (nb) zbVar.k.get(G)) != null && (acVar = nbVar.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = acVar.f;
                        if (tL_fileLocationToBeDeprecated3 != null) {
                            r9 = nbVar.g;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated3;
                            document = null;
                            r62 = null;
                            r72 = 0;
                        } else {
                            TLRPC.Document document2 = acVar.i;
                            if (document2 != null) {
                                document = document2;
                                r62 = null;
                            } else {
                                r62 = acVar.h;
                                if (r62 != null) {
                                    document = null;
                                    tL_fileLocationToBeDeprecated2 = null;
                                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                                    tLObject = tL_fileLocationToBeDeprecated2;
                                    r9 = tL_fileLocationToBeDeprecated;
                                    r72 = tLObject;
                                } else {
                                    TLObject tLObject2 = acVar.v;
                                    if (tLObject2 != null) {
                                        tLObject = tLObject2;
                                        document = null;
                                        r62 = null;
                                        tL_fileLocationToBeDeprecated = null;
                                        r9 = tL_fileLocationToBeDeprecated;
                                        r72 = tLObject;
                                    } else {
                                        document = null;
                                        r62 = null;
                                    }
                                }
                            }
                            tL_fileLocationToBeDeprecated2 = r62;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                            tLObject = tL_fileLocationToBeDeprecated2;
                            r9 = tL_fileLocationToBeDeprecated;
                            r72 = tLObject;
                        }
                        w7.G(nbVar.o).h(i17, document, r62, r72, tL_fileLocationToBeDeprecated, r9);
                    }
                    i18++;
                }
                return;
            case 4:
                zb zbVar2 = (zb) this.c;
                qb qbVar = (qb) this.d;
                int i19 = this.b;
                LinkedList linkedList = zbVar2.B;
                HashMap hashMap = zbVar2.C;
                if (qbVar != null) {
                    i3 = 1;
                    zbVar2.E--;
                } else {
                    i3 = 1;
                }
                if (qbVar != null) {
                    File file = qbVar.b;
                    int i20 = qbVar.h;
                    String str2 = qbVar.a;
                    if (i19 == i3) {
                        if (qbVar.f) {
                            y4 y4Var = new y4(16, zbVar2, new qb(zbVar2, qbVar.a, qbVar.b, qbVar.c, qbVar.h));
                            zbVar2.D.put(str2, y4Var);
                            g0.i3(y4Var, 1000L);
                        } else {
                            hashMap.remove(str2);
                            hs.f(i20).k(hs.S1, str2, 0);
                        }
                    } else if (i19 == 2) {
                        hashMap.remove(str2);
                        File file2 = new File(w7.z(4), Utilities.a(str2) + "." + qbVar.c);
                        hs.f(i20).k(hs.R1, str2, file.renameTo(file2) ? file2.toString() : file.toString());
                    }
                }
                while (zbVar2.E < 2 && !linkedList.isEmpty()) {
                    ((qb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    zbVar2.E++;
                }
                return;
            case 5:
                ld ldVar = (ld) this.c;
                int i21 = this.b;
                kd kdVar = (kd) this.d;
                try {
                    if (i21 == 2) {
                        ldVar.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (i21 == 1) {
                        if (kdVar == null) {
                            return;
                        }
                        ldVar.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + kdVar.a).stepThis().dispose();
                    } else {
                        if (kdVar == null) {
                            return;
                        }
                        SQLitePreparedStatement executeFast = ldVar.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(kdVar.h.k.getObjectSize());
                        kdVar.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, kdVar.a);
                        executeFast.bindInteger(2, kdVar.b);
                        executeFast.bindInteger(3, kdVar.c);
                        executeFast.bindInteger(4, kdVar.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, kdVar.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 6:
                long j11 = 0;
                li liVar = (li) this.c;
                int i22 = this.b;
                u10 u10Var = (u10) this.d;
                ArrayList arrayList2 = new ArrayList();
                try {
                    boolean z11 = false;
                    sQLiteCursor = liVar.getMessagesStorage().b.queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i22 + 1), new Object[0]);
                    if (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            int readInt32 = byteBufferValue.readInt32(false);
                            int i23 = 0;
                            while (i23 < readInt32) {
                                arrayList2.add(TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z11), z11));
                                i23++;
                                z11 = false;
                            }
                            byteBufferValue.reuse();
                        }
                        i10 = sQLiteCursor.intValue(1);
                        try {
                            j11 = li.q(arrayList2);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                a8.g(th, true);
                                break;
                            } catch (Throwable th3) {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i10 = 0;
                }
                sQLiteCursor.dispose();
                liVar.z1(i22, arrayList2, true, i10, j11, new yh(0, u10Var, arrayList2));
                return;
            case 7:
                li liVar2 = (li) this.c;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = (TLRPC.TL_help_premiumPromo) this.d;
                int i24 = this.b;
                try {
                    if (tL_help_premiumPromo != null) {
                        liVar2.getMessagesStorage().b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
                        SQLitePreparedStatement executeFast2 = liVar2.getMessagesStorage().b.executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                        executeFast2.requery();
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                        tL_help_premiumPromo.serializeToStream(nativeByteBuffer2);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                        executeFast2.bindInteger(2, i24);
                        executeFast2.step();
                        nativeByteBuffer2.reuse();
                        executeFast2.dispose();
                    } else {
                        SQLitePreparedStatement executeFast3 = liVar2.getMessagesStorage().b.executeFast("UPDATE premium_promo SET date = ?");
                        executeFast3.requery();
                        executeFast3.bindInteger(1, i24);
                        executeFast3.step();
                        executeFast3.dispose();
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 8:
                li liVar3 = (li) this.c;
                int i25 = this.b;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) this.d;
                try {
                    liVar3.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + i25).stepThis().dispose();
                    SQLitePreparedStatement executeFast4 = liVar3.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast4.requery();
                    NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer3);
                    executeFast4.bindByteBuffer(1, nativeByteBuffer3);
                    executeFast4.bindInteger(2, i25);
                    executeFast4.step();
                    nativeByteBuffer3.reuse();
                    executeFast4.dispose();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                liVar3.I0[i25] = false;
                return;
            case 9:
                li liVar4 = (li) this.c;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.d;
                int i26 = this.b;
                liVar4.U.l(stickerSet.id);
                liVar4.b1(i26, false, true, false, new yg(liVar4, stickerSet, 1));
                return;
            case 10:
                li liVar5 = (li) this.c;
                int i27 = this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.d;
                if (i27 == 0) {
                    i12 = 3;
                } else if (i27 == 1) {
                    i12 = 4;
                } else if (i27 != 5) {
                    i12 = 5;
                }
                try {
                    liVar5.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    return;
                }
            case 11:
                fi fiVar = (fi) this.c;
                fi fiVar2 = (fi) this.d;
                int i28 = this.b;
                SparseArray sparseArray = fiVar.w.getMessagesStorage().h;
                ArrayList arrayList3 = (ArrayList) sparseArray.get(i28);
                if (arrayList3 == null) {
                    return;
                }
                arrayList3.remove(fiVar2);
                if (arrayList3.isEmpty()) {
                    sparseArray.remove(i28);
                    return;
                }
                return;
            case 12:
                hp hpVar = (hp) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i29 = this.b;
                if (tLObject3 != null) {
                    hpVar.s2--;
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = (TLRPC.TL_peerNotifySettings) tLObject3;
                    SharedPreferences.Editor edit = hpVar.d7.edit();
                    if (i29 == 0) {
                        if ((tL_peerNotifySettings.flags & 1) != 0) {
                            edit.putBoolean("EnablePreviewGroup", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableGroup2", tL_peerNotifySettings.mute_until);
                        }
                    } else if (i29 == 1) {
                        if ((tL_peerNotifySettings.flags & 1) != 0) {
                            edit.putBoolean("EnablePreviewAll", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 64) != 0) {
                            edit.putBoolean("EnableAllStories", !tL_peerNotifySettings.stories_muted);
                        }
                        if ((tL_peerNotifySettings.flags & 128) != 0) {
                            edit.putBoolean("EnableHideStoriesSenders", tL_peerNotifySettings.stories_hide_sender);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableAll2", tL_peerNotifySettings.mute_until);
                        }
                        if ((tL_peerNotifySettings.flags & 64) != 0) {
                            edit.putBoolean("EnableAllStories", !tL_peerNotifySettings.stories_muted);
                        }
                    } else {
                        if ((tL_peerNotifySettings.flags & 1) != 0) {
                            edit.putBoolean("EnablePreviewChannel", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableChannel2", tL_peerNotifySettings.mute_until);
                        }
                    }
                    hpVar.getNotificationsController().h0.a(tL_peerNotifySettings.android_sound, edit, 0L, 0L, i29);
                    edit.apply();
                    if (hpVar.s2 == 0) {
                        hpVar.getUserConfig().T = true;
                        hpVar.getUserConfig().v(false);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                hp hpVar2 = (hp) this.c;
                n10 n10Var = (n10) this.d;
                int i30 = this.b;
                if (n10Var != null) {
                    n10Var.a(Integer.valueOf(i30), null);
                }
                hpVar2.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                return;
            case 14:
                a();
                return;
            case 15:
                hp hpVar3 = (hp) this.c;
                int i31 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                hpVar3.getConnectionsManager().cancelRequest(i31, true);
                d2Var.setVisibleDialog(null);
                return;
            case 16:
                po poVar = (po) this.c;
                int i32 = this.b;
                HashMap hashMap2 = (HashMap) this.d;
                ArrayList arrayList4 = poVar.b;
                arrayList4.clear();
                poVar.f = -1;
                poVar.g = -1;
                for (int i33 = 0; i33 < i32; i33++) {
                    arrayList4.add(null);
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList4.set(((Integer) entry.getKey()).intValue(), (TLRPC.Photo) entry.getValue());
                }
                poVar.h.getNotificationCenter().k(hs.e3, poVar);
                poVar.a(0, 80);
                return;
            case 17:
                ((qr) this.c).getNotificationCenter().k(hs.r1, (Long) this.d, Integer.valueOf(this.b), Boolean.TRUE);
                return;
            case 18:
                qr qrVar2 = (qr) this.c;
                qrVar2.e1((TLRPC.messages_Dialogs) this.d, this.b);
                try {
                    qrVar2.a.c(new hq(qrVar2, i11));
                    return;
                } catch (Exception e15) {
                    qrVar2.o(e15, true);
                    return;
                }
            case 19:
                ((hs) this.c).k(this.b, (Object[]) this.d);
                return;
            case 20:
                us usVar = (us) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                int i34 = this.b;
                usVar.w.addAll(0, arrayList5);
                if (t0.x || !t0.w) {
                    if (i34 == 3 || ((i34 == 1 && t0.w) || (i34 == 2 && !t0.w))) {
                        Intent intent = new Intent(t0.b, (Class<?>) PopupNotificationActivity.class);
                        intent.setFlags(268763140);
                        try {
                            t0.b.startActivity(intent);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 21:
                vv vvVar = (vv) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                int i35 = this.b;
                message2.send_state = 0;
                hs notificationCenter = vvVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(message2.id);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(message2.dialog_id);
                Integer valueOf4 = Integer.valueOf(i35);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, valueOf4, bool);
                vvVar.getNotificationCenter().k(22, Integer.valueOf(message2.id), Integer.valueOf(message2.id), message2, Long.valueOf(message2.dialog_id), 0L, Integer.valueOf(i35), bool);
                vvVar.getSendMessagesHelper().d0(message2.id);
                vvVar.getSendMessagesHelper().i0(message2.id, false);
                return;
            case 22:
                oz ozVar = (oz) this.c;
                qr qrVar3 = (qr) this.d;
                int i36 = this.b;
                ArrayList arrayList6 = new ArrayList();
                a0.h hVar = new a0.h();
                a0.h hVar2 = new a0.h();
                try {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase5 = qrVar3.b;
                    Locale locale5 = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase5.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            if (!m5.C(longValue)) {
                                arrayList6.add(Long.valueOf(longValue));
                                if (m5.E(longValue)) {
                                    arrayList7.add(Long.valueOf(longValue));
                                } else {
                                    arrayList8.add(Long.valueOf(-longValue));
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            z10 = true;
                            a8.g(e, z10);
                            g0.h3(new sj(ozVar, i36, arrayList6, hVar, hVar2));
                            return;
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList7.isEmpty()) {
                        ArrayList arrayList9 = new ArrayList();
                        qrVar3.n0(arrayList7, arrayList9, false);
                        int size = arrayList9.size();
                        int i37 = 0;
                        while (i37 < size) {
                            Object obj = arrayList9.get(i37);
                            i37++;
                            TLRPC.User user = (TLRPC.User) obj;
                            hVar.k(user, user.id);
                        }
                    }
                    if (!arrayList8.isEmpty()) {
                        ArrayList arrayList10 = new ArrayList();
                        qrVar3.Q(TextUtils.join(",", arrayList8), arrayList10);
                        int size2 = arrayList10.size();
                        int i38 = 0;
                        while (i38 < size2) {
                            Object obj2 = arrayList10.get(i38);
                            i38++;
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            hVar2.k(chat, chat.id);
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    z10 = true;
                }
                g0.h3(new sj(ozVar, i36, arrayList6, hVar, hVar2));
                return;
            default:
                k10 k10Var = (k10) this.c;
                String str3 = (String) this.d;
                int i39 = this.b;
                k10Var.c.remove(str3);
                ConnectionsManager.getInstance(k10Var.a).cancelRequest(i39, true);
                return;
        }
    }

    public /* synthetic */ k7(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }
}
