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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o7(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
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
        int i10;
        TLRPC.Message message;
        int i11;
        long j10;
        int i12;
        int i13;
        vp vpVar;
        int i14;
        vp vpVar2;
        boolean z12;
        int i15;
        TLRPC.Peer peer;
        o7 o7Var = this;
        vp vpVar3 = (vp) o7Var.c;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) o7Var.d;
        boolean z13 = true;
        try {
            i10 = 0;
            vpVar3.getUserConfig().z(0, vpVar3.getUserConfig().n(0) + messages_dialogs.dialogs.size());
            message = null;
            i11 = 0;
        } catch (Exception e) {
            e = e;
        }
        while (true) {
            j10 = 1000;
            if (i11 >= messages_dialogs.messages.size()) {
                break;
            }
            try {
                TLRPC.Message message2 = messages_dialogs.messages.get(i11);
                if (v2.a) {
                    f8.b("search migrate id " + message2.id + " date " + cd.D0().y0().format(message2.date * 1000));
                }
                if (message == null || message2.date < message.date) {
                    message = message2;
                }
                i11++;
            } catch (Exception e7) {
                e = e7;
                z11 = true;
            }
            e = e7;
            z11 = true;
            f8.g(e, z11);
            i0.g3(new eo(vpVar3, 0));
            return;
        }
        if (v2.a) {
            f8.b("migrate step with id " + message.id + " date " + cd.D0().y0().format(message.date * 1000));
        }
        if (messages_dialogs.dialogs.size() >= 100) {
            i12 = message.id;
        } else {
            if (v2.a) {
                f8.b("migrate stop due to not 100 dialogs");
            }
            int i16 = 0;
            for (int i17 = 2; i16 < i17; i17 = 2) {
                long j11 = j10;
                vpVar3.getUserConfig().x(i16, ConnectionsManager.DEFAULT_DATACENTER_ID, vpVar3.getUserConfig().K, vpVar3.getUserConfig().L, vpVar3.getUserConfig().M, vpVar3.getUserConfig().N, vpVar3.getUserConfig().O);
                i16++;
                j10 = j11;
            }
            i12 = -1;
        }
        long j12 = j10;
        StringBuilder sb2 = new StringBuilder(messages_dialogs.dialogs.size() * 12);
        a0.h hVar = new a0.h();
        for (int i18 = 0; i18 < messages_dialogs.dialogs.size(); i18++) {
            TLRPC.Dialog dialog = messages_dialogs.dialogs.get(i18);
            o5.x(dialog);
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(dialog.id);
            hVar.k(dialog, dialog.id);
        }
        SQLiteDatabase sQLiteDatabase = vpVar3.getMessagesStorage().b;
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
                        int i19 = 0;
                        while (true) {
                            if (i19 >= messages_dialogs.messages.size()) {
                                break;
                            }
                            TLRPC.Message message3 = messages_dialogs.messages.get(i19);
                            if (jj.B0(message3) == longValue) {
                                messages_dialogs.messages.remove(i19);
                                i19--;
                                if (message3.id == dialog2.top_message) {
                                    dialog2.top_message = 0;
                                    break;
                                }
                            }
                            i19++;
                        }
                    }
                }
                hVar.l(longValue);
            }
            queryFinalized.dispose();
            if (v2.a) {
                f8.b("migrate found missing dialogs " + messages_dialogs.dialogs.size());
            }
            SQLiteCursor queryFinalized2 = vpVar3.getMessagesStorage().b.queryFinalized("SELECT min(date) FROM dialogs WHERE date != 0 AND did >> 32 NOT IN (536870912, 1073741824)", new Object[0]);
            try {
                if (queryFinalized2.next()) {
                    try {
                        int max = Math.max(1441062000, queryFinalized2.intValue(0));
                        int i20 = 0;
                        while (true) {
                            int size = messages_dialogs.messages.size();
                            i13 = o7Var.b;
                            String str = "migrate stop due to reached loaded dialogs ";
                            if (i20 >= size) {
                                break;
                            }
                            TLRPC.Message message4 = messages_dialogs.messages.get(i20);
                            if (message4.date < max) {
                                if (i13 != -1) {
                                    int i21 = i10;
                                    while (i21 < 2) {
                                        int i22 = i20;
                                        z10 = z13;
                                        String str2 = str;
                                        try {
                                            vp vpVar4 = vpVar3;
                                            try {
                                                int i23 = i21;
                                                vpVar3.getUserConfig().x(i23, vpVar3.getUserConfig().J, vpVar3.getUserConfig().K, vpVar3.getUserConfig().L, vpVar3.getUserConfig().M, vpVar3.getUserConfig().N, vpVar4.getUserConfig().O);
                                                i21 = i23 + 1;
                                                i20 = i22;
                                                z13 = z10;
                                                str = str2;
                                                vpVar3 = vpVar4;
                                            } catch (Exception e10) {
                                                e = e10;
                                                z11 = z10;
                                                vpVar3 = vpVar4;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            z11 = z10;
                                            f8.g(e, z11);
                                            i0.g3(new eo(vpVar3, 0));
                                            return;
                                        }
                                    }
                                    vpVar2 = vpVar3;
                                    i15 = i20;
                                    z12 = z13;
                                    String str3 = str;
                                    if (v2.a) {
                                        f8.b(str3 + cd.D0().y0().format(max * j12));
                                    }
                                    i12 = -1;
                                } else {
                                    vpVar2 = vpVar3;
                                    i15 = i20;
                                    z12 = z13;
                                }
                                int i24 = i15;
                                messages_dialogs.messages.remove(i24);
                                i20 = i24 - 1;
                                long B0 = jj.B0(message4);
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(B0);
                                hVar.l(B0);
                                if (dialog3 != null) {
                                    messages_dialogs.dialogs.remove(dialog3);
                                }
                            } else {
                                vpVar2 = vpVar3;
                                z12 = z13;
                            }
                            i20++;
                            o7Var = this;
                            z13 = z12;
                            vpVar3 = vpVar2;
                            i10 = 0;
                        }
                        vpVar = vpVar3;
                        z10 = z13;
                        if (message != null && message.date < max && i13 != -1) {
                            int i25 = 0;
                            while (i25 < 2) {
                                int i26 = i25;
                                vpVar.getUserConfig().x(i26, vpVar.getUserConfig().J, vpVar.getUserConfig().K, vpVar.getUserConfig().L, vpVar.getUserConfig().M, vpVar.getUserConfig().N, vpVar.getUserConfig().O);
                                i25 = i26 + 1;
                            }
                            if (v2.a) {
                                f8.b("migrate stop due to reached loaded dialogs " + cd.D0().y0().format(max * j12));
                            }
                            i14 = -1;
                            queryFinalized2.dispose();
                            vpVar.getUserConfig().K = message.date;
                            peer = message.peer_id;
                            if (peer.channel_id == 0) {
                                vpVar.getUserConfig().N = message.peer_id.channel_id;
                                vpVar.getUserConfig().M = 0L;
                                vpVar.getUserConfig().L = 0L;
                                int i27 = 0;
                                while (true) {
                                    if (i27 >= messages_dialogs.chats.size()) {
                                        break;
                                    }
                                    TLRPC.Chat chat = messages_dialogs.chats.get(i27);
                                    if (chat.id == vpVar.getUserConfig().N) {
                                        vpVar.getUserConfig().O = chat.access_hash;
                                        break;
                                    }
                                    i27++;
                                }
                            } else if (peer.chat_id != 0) {
                                vpVar.getUserConfig().M = message.peer_id.chat_id;
                                vpVar.getUserConfig().N = 0L;
                                vpVar.getUserConfig().L = 0L;
                                int i28 = 0;
                                while (true) {
                                    if (i28 >= messages_dialogs.chats.size()) {
                                        break;
                                    }
                                    TLRPC.Chat chat2 = messages_dialogs.chats.get(i28);
                                    if (chat2.id == vpVar.getUserConfig().M) {
                                        vpVar.getUserConfig().O = chat2.access_hash;
                                        break;
                                    }
                                    i28++;
                                }
                            } else if (peer.user_id != 0) {
                                vpVar.getUserConfig().L = message.peer_id.user_id;
                                vpVar.getUserConfig().M = 0L;
                                vpVar.getUserConfig().N = 0L;
                                int i29 = 0;
                                while (true) {
                                    if (i29 >= messages_dialogs.users.size()) {
                                        break;
                                    }
                                    TLRPC.User user = messages_dialogs.users.get(i29);
                                    if (user.id == vpVar.getUserConfig().L) {
                                        vpVar.getUserConfig().O = user.access_hash;
                                        break;
                                    }
                                    i29++;
                                }
                            }
                            vpVar3 = vpVar;
                            vpVar3.G3(messages_dialogs, null, null, 0, i14, 0, 0, false, true, false);
                            return;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z10 = z13;
                        z11 = z10;
                        f8.g(e, z11);
                        i0.g3(new eo(vpVar3, 0));
                        return;
                    }
                } else {
                    vpVar = vpVar3;
                    z10 = true;
                }
                vpVar3.G3(messages_dialogs, null, null, 0, i14, 0, 0, false, true, false);
                return;
            } catch (Exception e13) {
                e = e13;
                z11 = z10;
                f8.g(e, z11);
                i0.g3(new eo(vpVar3, 0));
                return;
            }
            i14 = i12;
            queryFinalized2.dispose();
            vpVar.getUserConfig().K = message.date;
            peer = message.peer_id;
            if (peer.channel_id == 0) {
            }
            vpVar3 = vpVar;
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x053b, code lost:
    
        if (r11 == null) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v32, types: [org.telegram.messenger.b8] */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.messenger.pw] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [org.telegram.messenger.pw] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v15, types: [org.telegram.messenger.b30] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int P;
        vb vbVar;
        ic icVar;
        ?? r62;
        TLRPC.Document document;
        TLObject tLObject;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2;
        ?? r92;
        ?? r72;
        int i10;
        int i11;
        boolean z10;
        int i12 = 21;
        int i13 = 7;
        SQLiteCursor sQLiteCursor = null;
        switch (this.a) {
            case 0:
                b8 b8Var = (b8) this.c;
                String str = (String) this.d;
                int i14 = this.b;
                m7 m7Var = (m7) b8Var.w.get(str);
                if (m7Var == null || m7Var.W0 == (P = b8Var.P(i14))) {
                    return;
                }
                m7Var.W0 = P;
                bg.h hVar = m7Var.e1;
                ((ArrayList) hVar.d).remove(m7Var);
                hVar.a(m7Var);
                hVar.b(false);
                StringBuilder u10 = a1.g.u("update priority ", str, " position in queue ");
                u10.append(((ArrayList) m7Var.e1.d).indexOf(m7Var));
                u10.append(" account=");
                i0.a.p(b8Var.currentAccount, u10);
                return;
            case 1:
                hs hsVar = (hs) this.c;
                int i15 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                hsVar.getClass();
                try {
                    long j10 = message.id;
                    if (jj.b4(message)) {
                        i15 = 5;
                    } else if (jj.d5(message)) {
                        i15 = 9;
                    }
                    if (i15 == 9) {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j10 + " AND dialog_id = " + jj.B0(message)).stepThis().dispose();
                        return;
                    }
                    if (i15 == 5) {
                        SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j10 + " AND topic_id = " + jj.I1(hsVar.currentAccount, message)).stepThis().dispose();
                        return;
                    }
                    if (i15 == 1) {
                        SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                        Locale locale3 = Locale.US;
                        sQLiteDatabase3.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + jj.B0(message)).stepThis().dispose();
                        return;
                    }
                    SQLiteDatabase sQLiteDatabase4 = hsVar.b;
                    Locale locale4 = Locale.US;
                    sQLiteDatabase4.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + jj.B0(message)).stepThis().dispose();
                    hsVar.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + jj.B0(message)).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    hsVar.o(e, true);
                    return;
                }
            case 2:
                b6 b6Var = (b6) this.c;
                jj jjVar = (jj) this.d;
                int i16 = this.b;
                ArrayList arrayList = b6Var.G;
                TLRPC.Document F0 = jjVar.F0();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TLRPC.Document F02 = ((jj) arrayList.get(i17)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList.remove(i17);
                        b6Var.getNotificationCenter().k(zs.b5, new Object[0]);
                        if (i16 == 0) {
                            zs.e().k(zs.P4, 1, cd.a0("MessageNotFound", null, 2131748567, new Object[0]));
                            return;
                        } else {
                            if (i16 == -1) {
                                LaunchActivity.D(2);
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 3:
                hc hcVar = (hc) this.c;
                ImageReceiver imageReceiver = (ImageReceiver) this.d;
                int i18 = this.b;
                int i19 = 0;
                while (i19 < 3) {
                    int G = imageReceiver.G(i19 == 0 ? 1 : i19 == 1 ? 0 : 3);
                    if (G != 0 && (vbVar = (vb) hcVar.k.get(G)) != null && (icVar = vbVar.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = icVar.f;
                        if (tL_fileLocationToBeDeprecated3 != null) {
                            r92 = vbVar.g;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated3;
                            document = null;
                            r62 = null;
                            r72 = 0;
                        } else {
                            TLRPC.Document document2 = icVar.i;
                            if (document2 != null) {
                                document = document2;
                                r62 = null;
                            } else {
                                r62 = icVar.h;
                                if (r62 != null) {
                                    document = null;
                                    tL_fileLocationToBeDeprecated2 = null;
                                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                                    tLObject = tL_fileLocationToBeDeprecated2;
                                    r92 = tL_fileLocationToBeDeprecated;
                                    r72 = tLObject;
                                } else {
                                    TLObject tLObject2 = icVar.v;
                                    if (tLObject2 != null) {
                                        tLObject = tLObject2;
                                        document = null;
                                        r62 = null;
                                        tL_fileLocationToBeDeprecated = null;
                                        r92 = tL_fileLocationToBeDeprecated;
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
                            r92 = tL_fileLocationToBeDeprecated;
                            r72 = tLObject;
                        }
                        b8.G(vbVar.o).h(i18, document, r62, r72, tL_fileLocationToBeDeprecated, r92);
                    }
                    i19++;
                }
                return;
            case 4:
                hc hcVar2 = (hc) this.c;
                yb ybVar = (yb) this.d;
                int i20 = this.b;
                LinkedList linkedList = hcVar2.B;
                HashMap hashMap = hcVar2.C;
                if (ybVar != null) {
                    i10 = 1;
                    hcVar2.E--;
                } else {
                    i10 = 1;
                }
                if (ybVar != null) {
                    File file = ybVar.b;
                    int i21 = ybVar.h;
                    String str2 = ybVar.a;
                    if (i20 == i10) {
                        if (ybVar.f) {
                            t6 t6Var = new t6(14, hcVar2, new yb(hcVar2, ybVar.a, ybVar.b, ybVar.c, ybVar.h));
                            hcVar2.D.put(str2, t6Var);
                            i0.h3(t6Var, 1000L);
                        } else {
                            hashMap.remove(str2);
                            zs.f(i21).k(zs.S1, str2, 0);
                        }
                    } else if (i20 == 2) {
                        hashMap.remove(str2);
                        File file2 = new File(b8.z(4), Utilities.a(str2) + "." + ybVar.c);
                        zs.f(i21).k(zs.R1, str2, file.renameTo(file2) ? file2.toString() : file.toString());
                    }
                }
                while (hcVar2.E < 2 && !linkedList.isEmpty()) {
                    ((yb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    hcVar2.E++;
                }
                return;
            case 5:
                nd ndVar = (nd) this.c;
                int i22 = this.b;
                md mdVar = (md) this.d;
                try {
                    if (i22 == 2) {
                        ndVar.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (i22 == 1) {
                        if (mdVar == null) {
                            return;
                        }
                        ndVar.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + mdVar.a).stepThis().dispose();
                    } else {
                        if (mdVar == null) {
                            return;
                        }
                        SQLitePreparedStatement executeFast = ndVar.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(mdVar.h.k.getObjectSize());
                        mdVar.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, mdVar.a);
                        executeFast.bindInteger(2, mdVar.b);
                        executeFast.bindInteger(3, mdVar.c);
                        executeFast.bindInteger(4, mdVar.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, mdVar.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    }
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 6:
                long j11 = 0;
                ui uiVar = (ui) this.c;
                int i23 = this.b;
                q20 q20Var = (q20) this.d;
                ArrayList arrayList2 = new ArrayList();
                try {
                    boolean z11 = false;
                    sQLiteCursor = uiVar.getMessagesStorage().b.queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i23 + 1), new Object[0]);
                    if (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            int readInt32 = byteBufferValue.readInt32(false);
                            int i24 = 0;
                            while (i24 < readInt32) {
                                arrayList2.add(TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z11), z11));
                                i24++;
                                z11 = false;
                            }
                            byteBufferValue.reuse();
                        }
                        i11 = sQLiteCursor.intValue(1);
                        try {
                            j11 = ui.q(arrayList2);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                f8.g(th, true);
                                break;
                            } catch (Throwable th3) {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        i11 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i11 = 0;
                }
                sQLiteCursor.dispose();
                uiVar.z1(i23, arrayList2, true, i11, j11, new t6(28, q20Var, arrayList2));
                return;
            case 7:
                ui uiVar2 = (ui) this.c;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = (TLRPC.TL_help_premiumPromo) this.d;
                int i25 = this.b;
                try {
                    if (tL_help_premiumPromo != null) {
                        uiVar2.getMessagesStorage().b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
                        SQLitePreparedStatement executeFast2 = uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                        executeFast2.requery();
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                        tL_help_premiumPromo.serializeToStream(nativeByteBuffer2);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                        executeFast2.bindInteger(2, i25);
                        executeFast2.step();
                        nativeByteBuffer2.reuse();
                        executeFast2.dispose();
                    } else {
                        SQLitePreparedStatement executeFast3 = uiVar2.getMessagesStorage().b.executeFast("UPDATE premium_promo SET date = ?");
                        executeFast3.requery();
                        executeFast3.bindInteger(1, i25);
                        executeFast3.step();
                        executeFast3.dispose();
                    }
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 8:
                ui uiVar3 = (ui) this.c;
                int i26 = this.b;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) this.d;
                try {
                    uiVar3.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + i26).stepThis().dispose();
                    SQLitePreparedStatement executeFast4 = uiVar3.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast4.requery();
                    NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer3);
                    executeFast4.bindByteBuffer(1, nativeByteBuffer3);
                    executeFast4.bindInteger(2, i26);
                    executeFast4.step();
                    nativeByteBuffer3.reuse();
                    executeFast4.dispose();
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
                uiVar3.H0[i26] = false;
                return;
            case 9:
                ui uiVar4 = (ui) this.c;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.d;
                int i27 = this.b;
                uiVar4.T.l(stickerSet.id);
                uiVar4.b1(i27, false, true, false, new fh(uiVar4, stickerSet, 1));
                return;
            case 10:
                ui uiVar5 = (ui) this.c;
                int i28 = this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.d;
                if (i28 == 0) {
                    i13 = 3;
                } else if (i28 == 1) {
                    i13 = 4;
                } else if (i28 != 5) {
                    i13 = 5;
                }
                try {
                    uiVar5.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
            case 11:
                ni niVar = (ni) this.c;
                ni niVar2 = (ni) this.d;
                int i29 = this.b;
                SparseArray sparseArray = niVar.w.getMessagesStorage().h;
                ArrayList arrayList3 = (ArrayList) sparseArray.get(i29);
                if (arrayList3 == null) {
                    return;
                }
                arrayList3.remove(niVar2);
                if (arrayList3.isEmpty()) {
                    sparseArray.remove(i29);
                    return;
                }
                return;
            case 12:
                vp vpVar = (vp) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i30 = this.b;
                if (tLObject3 != null) {
                    vpVar.r2--;
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = (TLRPC.TL_peerNotifySettings) tLObject3;
                    SharedPreferences.Editor edit = vpVar.e7.edit();
                    if (i30 == 0) {
                        if ((tL_peerNotifySettings.flags & 1) != 0) {
                            edit.putBoolean("EnablePreviewGroup", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableGroup2", tL_peerNotifySettings.mute_until);
                        }
                    } else if (i30 == 1) {
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
                    vpVar.getNotificationsController().g0.a(tL_peerNotifySettings.android_sound, edit, 0L, 0L, i30);
                    edit.apply();
                    if (vpVar.r2 == 0) {
                        vpVar.getUserConfig().S = true;
                        vpVar.getUserConfig().v(false);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                vp vpVar2 = (vp) this.c;
                j20 j20Var = (j20) this.d;
                int i31 = this.b;
                if (j20Var != null) {
                    j20Var.a(Integer.valueOf(i31), null);
                }
                vpVar2.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                return;
            case 14:
                a();
                return;
            case 15:
                vp vpVar3 = (vp) this.c;
                int i32 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                vpVar3.getConnectionsManager().cancelRequest(i32, true);
                k2Var.setVisibleDialog(null);
                return;
            case 16:
                dp dpVar = (dp) this.c;
                int i33 = this.b;
                HashMap hashMap2 = (HashMap) this.d;
                ArrayList arrayList4 = dpVar.b;
                arrayList4.clear();
                dpVar.f = -1;
                dpVar.g = -1;
                for (int i34 = 0; i34 < i33; i34++) {
                    arrayList4.add(null);
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList4.set(((Integer) entry.getKey()).intValue(), (TLRPC.Photo) entry.getValue());
                }
                dpVar.h.getNotificationCenter().k(zs.e3, dpVar);
                dpVar.a(0, 80);
                return;
            case 17:
                ((hs) this.c).getNotificationCenter().k(zs.r1, (Long) this.d, Integer.valueOf(this.b), Boolean.TRUE);
                return;
            case 18:
                hs hsVar2 = (hs) this.c;
                hsVar2.e1((TLRPC.messages_Dialogs) this.d, this.b);
                try {
                    hsVar2.a.c(new br(hsVar2, i12));
                    return;
                } catch (Exception e13) {
                    hsVar2.o(e13, true);
                    return;
                }
            case 19:
                ((zs) this.c).k(this.b, (Object[]) this.d);
                return;
            case 20:
                ot otVar = (ot) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                int i35 = this.b;
                otVar.w.addAll(0, arrayList5);
                if (w0.x || !w0.w) {
                    if (i35 == 3 || ((i35 == 1 && w0.w) || (i35 == 2 && !w0.w))) {
                        Intent intent = new Intent(w0.b, (Class<?>) PopupNotificationActivity.class);
                        intent.setFlags(268763140);
                        try {
                            w0.b.startActivity(intent);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 21:
                ow owVar = (ow) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                int i36 = this.b;
                message2.send_state = 0;
                zs notificationCenter = owVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(message2.id);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(message2.dialog_id);
                Integer valueOf4 = Integer.valueOf(i36);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, valueOf4, bool);
                owVar.getNotificationCenter().k(22, Integer.valueOf(message2.id), Integer.valueOf(message2.id), message2, Long.valueOf(message2.dialog_id), 0L, Integer.valueOf(i36), bool);
                owVar.getSendMessagesHelper().d0(message2.id);
                owVar.getSendMessagesHelper().i0(message2.id, false);
                return;
            case 22:
                h00 h00Var = (h00) this.c;
                hs hsVar3 = (hs) this.d;
                int i37 = this.b;
                ArrayList arrayList6 = new ArrayList();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                try {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase5 = hsVar3.b;
                    Locale locale5 = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase5.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            if (!o5.C(longValue)) {
                                arrayList6.add(Long.valueOf(longValue));
                                if (o5.E(longValue)) {
                                    arrayList7.add(Long.valueOf(longValue));
                                } else {
                                    arrayList8.add(Long.valueOf(-longValue));
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            z10 = true;
                            f8.g(e, z10);
                            i0.g3(new kk(h00Var, i37, arrayList6, hVar2, hVar3));
                            return;
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList7.isEmpty()) {
                        ArrayList arrayList9 = new ArrayList();
                        hsVar3.n0(arrayList7, arrayList9, false);
                        int size = arrayList9.size();
                        int i38 = 0;
                        while (i38 < size) {
                            Object obj = arrayList9.get(i38);
                            i38++;
                            TLRPC.User user = (TLRPC.User) obj;
                            hVar2.k(user, user.id);
                        }
                    }
                    if (!arrayList8.isEmpty()) {
                        ArrayList arrayList10 = new ArrayList();
                        hsVar3.Q(TextUtils.join(",", arrayList8), arrayList10);
                        int size2 = arrayList10.size();
                        int i39 = 0;
                        while (i39 < size2) {
                            Object obj2 = arrayList10.get(i39);
                            i39++;
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            hVar3.k(chat, chat.id);
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    z10 = true;
                }
                i0.g3(new kk(h00Var, i37, arrayList6, hVar2, hVar3));
                return;
            default:
                g20 g20Var = (g20) this.c;
                String str3 = (String) this.d;
                int i40 = this.b;
                g20Var.c.remove(str3);
                ConnectionsManager.getInstance(g20Var.a).cancelRequest(i40, true);
                return;
        }
    }

    public /* synthetic */ o7(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
