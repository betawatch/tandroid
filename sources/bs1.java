// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bs1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bs1(rja rjaVar, boolean z, int i, gb2 gb2Var) {
        this.a = (byte) 9;
        this.d = rjaVar;
        this.c = z;
        this.b = i;
        this.e = gb2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:24|25|(2:26|27)|(19:(3:221|222|(36:224|225|226|227|30|31|32|33|34|35|36|(7:41|42|43|44|45|38|39)|71|72|73|74|75|(6:77|78|79|80|(1:82)(1:191)|83)(1:200)|84|85|(3:173|174|(1:180))|87|88|(9:145|146|147|148|149|150|151|152|(3:154|(1:156)|157))(1:90)|91|92|(4:126|127|128|(12:130|131|132|(1:134)|95|(1:97)|98|(4:102|(1:104)|105|(1:109))|110|(2:112|(1:114))|124|125))|94|95|(0)|98|(5:100|102|(0)|105|(2:107|109))|110|(0)|124|125))|84|85|(0)|87|88|(0)(0)|91|92|(0)|94|95|(0)|98|(0)|110|(0)|124|125)|29|30|31|32|33|34|35|36|(2:38|39)|71|72|73|74|75|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02ec, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02e0, code lost:
    
        r12 = r4;
        r2 = true;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02e8, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02da, code lost:
    
        r12 = r4;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x031b, code lost:
    
        r4.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x031e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0245 A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024f A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279 A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142 A[Catch: all -> 0x02f3, Exception -> 0x02f5, TRY_LEAVE, TryCatch #33 {Exception -> 0x02f5, all -> 0x02f3, blocks: (B:31:0x00be, B:73:0x011d, B:75:0x013c, B:77:0x0142), top: B:30:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226 A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c;
        SQLiteCursor sQLiteCursor;
        boolean z;
        TLRPC.UserFull userFull;
        int i;
        boolean z2;
        TLRPC.UserFull TLdeserialize;
        int i2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.PeerSettings peerSettings;
        long j;
        long j2;
        switch (this.a) {
            case 0:
                cs1 cs1Var = (cs1) this.d;
                boolean z5 = this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                int i3 = this.b;
                mu1 mu1Var = cs1Var.b;
                if (!z5) {
                    if (mu1Var.x4) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            mu1Var.getMessagesController().E3(mu1Var.e, mu1Var.f, ((Integer) arrayList3.get(i4)).intValue(), true, false, false);
                        }
                    } else {
                        na7 messagesController = mu1Var.getMessagesController();
                        TLRPC.Chat chat = mu1Var.e;
                        TLRPC.User user = mu1Var.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.h1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new k45(messagesController, chat, user, (byte) 20));
                        }
                    }
                }
                if (i3 == mu1Var.R3) {
                    mu1Var.P3 = null;
                    return;
                }
                return;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                return;
            case 2:
                vj3 vj3Var = (vj3) this.d;
                int i5 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z6 = this.c;
                if (i5 == vj3Var.g0 && TextUtils.equals(tL_messages_searchGlobal.q, vj3Var.h0)) {
                    ConnectionsManager.getInstance(vj3Var.Q).sendRequest(tL_messages_searchGlobal, new rj3(vj3Var, i5, tL_messages_searchGlobal, z6, (byte) 0));
                    return;
                }
                return;
            case 3:
                xj3 xj3Var = (xj3) this.d;
                int i6 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z7 = this.c;
                if (i6 == xj3Var.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, xj3Var.e0)) {
                    ConnectionsManager.getInstance(xj3Var.Q).sendRequest(tL_messages_searchGlobal2, new rj3(xj3Var, i6, tL_messages_searchGlobal2, z7, (byte) 1));
                    return;
                }
                return;
            case 4:
                h75 h75Var = (h75) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i7 = this.b;
                boolean z8 = this.c;
                boolean z9 = tLObject instanceof TL_phone.exportedGroupCallInvite;
                String[] strArr = h75Var.I4;
                if (z9) {
                    strArr[i7] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i7] = "";
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    String str = strArr[i8];
                    if (str == null) {
                        return;
                    }
                    if (str.length() == 0) {
                        strArr[i8] = null;
                    }
                }
                if (z8 || !h75Var.G0() || h75Var.T2.b.join_muted) {
                    c = 0;
                } else {
                    c = 0;
                    strArr[0] = null;
                }
                if (strArr[c] != null || strArr[1] != null || !hc2.t0(h75Var.S2)) {
                    h75Var.o1(strArr[0], strArr[1], false, z8);
                    return;
                }
                h75Var.o1(null, na7.q1(h75Var.n1.a).N2 + "/" + hc2.K(h75Var.S2, false), true, z8);
                return;
            case 5:
                pk5 pk5Var = (pk5) this.d;
                int i9 = this.b;
                String str2 = (String) this.e;
                boolean z10 = this.c;
                pk5Var.getClass();
                gl.c3(new ok5(i9, str2, z10));
                pk5Var.b.u.remove(str2);
                return;
            case 6:
                k96 k96Var = (k96) this.d;
                Vector vector = (Vector) this.e;
                boolean z11 = this.c;
                int i10 = this.b;
                HashMap hashMap = k96Var.N;
                ArrayList arrayList4 = k96Var.J;
                HashMap hashMap2 = k96Var.M;
                k96Var.I = false;
                ArrayList arrayList5 = k96Var.L;
                int size = arrayList5.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((i96) arrayList5.get(i11)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                int size2 = vector.objects.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i12);
                    if (w01.a) {
                        de9.s(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
                    }
                    i96 i96Var = new i96();
                    i96Var.b = tL_langPackLanguage.name;
                    i96Var.a = tL_langPackLanguage.native_name;
                    i96Var.c = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        i96Var.e = str3.replace('-', '_').toLowerCase();
                    } else {
                        i96Var.e = "";
                    }
                    i96Var.f = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    i96Var.g = tL_langPackLanguage.rtl;
                    i96Var.d = "remote";
                    i96Var.k = i12;
                    i96 F0 = k96Var.F0(i96Var.b());
                    if (F0 == null) {
                        arrayList4.add(i96Var);
                        hashMap.put(i96Var.b(), i96Var);
                    } else {
                        F0.b = i96Var.b;
                        F0.a = i96Var.a;
                        F0.e = i96Var.e;
                        F0.f = i96Var.f;
                        F0.d = i96Var.d;
                        F0.k = i96Var.k;
                        i96Var = F0;
                    }
                    if (!hashMap2.containsKey(i96Var.b())) {
                        arrayList5.add(i96Var);
                        hashMap2.put(i96Var.b(), i96Var);
                    }
                }
                int i13 = 0;
                while (i13 < arrayList5.size()) {
                    i96 i96Var2 = (i96) arrayList5.get(i13);
                    if (i96Var2.k == Integer.MAX_VALUE && i96Var2 != k96Var.B) {
                        if (w01.a) {
                            fa4.b("remove lang " + i96Var2.b());
                        }
                        arrayList5.remove(i13);
                        hashMap2.remove(i96Var2.b());
                        arrayList4.remove(i96Var2);
                        hashMap.remove(i96Var2.b());
                        i13--;
                    }
                    i13++;
                }
                k96Var.a1();
                kk7.e().k(kk7.A4, new Object[0]);
                if (z11) {
                    k96Var.d(k96Var.B, true, false, i10);
                    return;
                }
                return;
            case 7:
                ((hq6) this.d).c1(this.b, false, this.c, false, (p8c) this.e);
                return;
            case 8:
                ad7 ad7Var = (ad7) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                boolean z12 = this.c;
                int i14 = this.b;
                HashMap hashMap3 = new HashMap();
                ArrayList arrayList6 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user2.id, new Object[0]);
                    try {
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        z = true;
                        userFull = null;
                        i = 0;
                        z2 = false;
                        try {
                            ad7Var.n(e, z);
                            na7 messagesController2 = ad7Var.getMessagesController();
                            messagesController2.getClass();
                            gl.c3(new u1a(messagesController2, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                            if (sQLiteCursor == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            na7 messagesController3 = ad7Var.getMessagesController();
                            messagesController3.getClass();
                            gl.c3(new u1a(messagesController3, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = queryFinalized;
                        userFull = null;
                        i = 0;
                        z2 = false;
                        na7 messagesController32 = ad7Var.getMessagesController();
                        messagesController32.getClass();
                        gl.c3(new u1a(messagesController32, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                    try {
                        try {
                            if (queryFinalized.next()) {
                                try {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        try {
                                            TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                                            byteBufferValue.reuse();
                                            queryFinalized.dispose();
                                            SQLiteDatabase sQLiteDatabase = ad7Var.getMessagesStorage().b;
                                            Locale locale = Locale.US;
                                            ArrayList arrayList7 = arrayList6;
                                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user2.id + " ORDER BY mid DESC", new Object[0]);
                                            while (queryFinalized.next()) {
                                                try {
                                                    try {
                                                        int intValue = queryFinalized.intValue(0);
                                                        arrayList6 = arrayList7;
                                                        arrayList6.add(Integer.valueOf(intValue));
                                                        hashMap3.put(Integer.valueOf(intValue), null);
                                                        arrayList7 = arrayList6;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        arrayList6 = arrayList7;
                                                        userFull = TLdeserialize;
                                                        i = 0;
                                                        z2 = false;
                                                        sQLiteCursor = queryFinalized;
                                                        z = true;
                                                        ad7Var.n(e, z);
                                                        na7 messagesController22 = ad7Var.getMessagesController();
                                                        messagesController22.getClass();
                                                        gl.c3(new u1a(messagesController22, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                        if (sQLiteCursor == null) {
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        arrayList6 = arrayList7;
                                                        userFull = TLdeserialize;
                                                        i = 0;
                                                        z2 = false;
                                                        sQLiteCursor = queryFinalized;
                                                        na7 messagesController322 = ad7Var.getMessagesController();
                                                        messagesController322.getClass();
                                                        gl.c3(new u1a(messagesController322, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    arrayList6 = arrayList7;
                                                    userFull = TLdeserialize;
                                                    i = 0;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    z = true;
                                                    ad7Var.n(e, z);
                                                    na7 messagesController222 = ad7Var.getMessagesController();
                                                    messagesController222.getClass();
                                                    gl.c3(new u1a(messagesController222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    arrayList6 = arrayList7;
                                                    userFull = TLdeserialize;
                                                    i = 0;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    na7 messagesController3222 = ad7Var.getMessagesController();
                                                    messagesController3222.getClass();
                                                    gl.c3(new u1a(messagesController3222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            arrayList6 = arrayList7;
                                            queryFinalized.dispose();
                                            queryFinalized = ad7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user2.id, new Object[0]);
                                            if (queryFinalized.next()) {
                                                i2 = 0;
                                                z3 = false;
                                            } else {
                                                i2 = queryFinalized.intValue(0);
                                                try {
                                                    z3 = queryFinalized.intValue(1) != 0;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    z = true;
                                                    ad7Var.n(e, z);
                                                    na7 messagesController2222 = ad7Var.getMessagesController();
                                                    messagesController2222.getClass();
                                                    gl.c3(new u1a(messagesController2222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    na7 messagesController32222 = ad7Var.getMessagesController();
                                                    messagesController32222.getClass();
                                                    gl.c3(new u1a(messagesController32222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            queryFinalized.dispose();
                                            if (TLdeserialize != null) {
                                                try {
                                                    if (TLdeserialize.pinned_msg_id != 0 && (arrayList6.isEmpty() || TLdeserialize.pinned_msg_id > ((Integer) arrayList6.get(0)).intValue())) {
                                                        arrayList6.clear();
                                                        arrayList6.add(Integer.valueOf(TLdeserialize.pinned_msg_id));
                                                        hashMap3.put(Integer.valueOf(TLdeserialize.pinned_msg_id), null);
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = z3;
                                                    z = true;
                                                    sQLiteCursor = null;
                                                    ad7Var.n(e, z);
                                                    na7 messagesController22222 = ad7Var.getMessagesController();
                                                    messagesController22222.getClass();
                                                    gl.c3(new u1a(messagesController22222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = z3;
                                                    sQLiteCursor = null;
                                                    na7 messagesController322222 = ad7Var.getMessagesController();
                                                    messagesController322222.getClass();
                                                    gl.c3(new u1a(messagesController322222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            if (arrayList6.isEmpty()) {
                                                try {
                                                    z4 = z3;
                                                    try {
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    z4 = z3;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    z4 = z3;
                                                }
                                                try {
                                                    ArrayList R0 = ad7Var.getMediaDataController().R0(user2.id, 0L, arrayList6, true);
                                                    if (R0 != null) {
                                                        int size3 = R0.size();
                                                        for (int i15 = 0; i15 < size3; i15++) {
                                                            k27 k27Var = (k27) R0.get(i15);
                                                            hashMap3.put(Integer.valueOf(k27Var.e1()), k27Var);
                                                        }
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    arrayList6 = arrayList6;
                                                    z2 = z4;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z = true;
                                                    sQLiteCursor = null;
                                                    ad7Var.n(e, z);
                                                    na7 messagesController222222 = ad7Var.getMessagesController();
                                                    messagesController222222.getClass();
                                                    gl.c3(new u1a(messagesController222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    arrayList6 = arrayList6;
                                                    z2 = z4;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    sQLiteCursor = null;
                                                    na7 messagesController3222222 = ad7Var.getMessagesController();
                                                    messagesController3222222.getClass();
                                                    gl.c3(new u1a(messagesController3222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                z4 = z3;
                                            }
                                            arrayList = new ArrayList();
                                            if (TLdeserialize != null) {
                                                try {
                                                    if ((TLdeserialize.flags2 & 64) != 0) {
                                                        i = i2;
                                                        try {
                                                            long j3 = TLdeserialize.personal_channel_id;
                                                            if (j3 != 0) {
                                                                arrayList.add(Long.valueOf(j3));
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                                ArrayList arrayList8 = new ArrayList();
                                                                ad7Var.P(TextUtils.join(",", arrayList), arrayList8);
                                                                gl.c3(new i41(ad7Var, arrayList8, (byte) 21));
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            if (TLdeserialize != null && (peerSettings = TLdeserialize.settings) != null) {
                                                                j = peerSettings.bot_inviter_id;
                                                                if (j != 0) {
                                                                    arrayList2.add(Long.valueOf(j));
                                                                }
                                                                j2 = TLdeserialize.settings.bot_owner_id;
                                                                if (j2 != 0 && !arrayList2.contains(Long.valueOf(j2))) {
                                                                    arrayList2.add(Long.valueOf(TLdeserialize.settings.bot_owner_id));
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                ArrayList arrayList9 = new ArrayList();
                                                                ad7Var.k0(arrayList2, arrayList9, false);
                                                                if (!arrayList9.isEmpty()) {
                                                                    gl.c3(new i41(ad7Var, arrayList9, (byte) 22));
                                                                }
                                                            }
                                                            na7 messagesController4 = ad7Var.getMessagesController();
                                                            messagesController4.getClass();
                                                            gl.c3(new u1a(messagesController4, user2, i14, z12, TLdeserialize, arrayList6, hashMap3, i, z4));
                                                            return;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            z2 = z4;
                                                            userFull = TLdeserialize;
                                                            z = true;
                                                            sQLiteCursor = null;
                                                            ad7Var.n(e, z);
                                                            na7 messagesController2222222 = ad7Var.getMessagesController();
                                                            messagesController2222222.getClass();
                                                            gl.c3(new u1a(messagesController2222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                            if (sQLiteCursor == null) {
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            z2 = z4;
                                                            userFull = TLdeserialize;
                                                            sQLiteCursor = null;
                                                            na7 messagesController32222222 = ad7Var.getMessagesController();
                                                            messagesController32222222.getClass();
                                                            gl.c3(new u1a(messagesController32222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    i = i2;
                                                    z2 = z4;
                                                    userFull = TLdeserialize;
                                                    z = true;
                                                    sQLiteCursor = null;
                                                    ad7Var.n(e, z);
                                                    na7 messagesController22222222 = ad7Var.getMessagesController();
                                                    messagesController22222222.getClass();
                                                    gl.c3(new u1a(messagesController22222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    i = i2;
                                                    z2 = z4;
                                                    userFull = TLdeserialize;
                                                    sQLiteCursor = null;
                                                    na7 messagesController322222222 = ad7Var.getMessagesController();
                                                    messagesController322222222.getClass();
                                                    gl.c3(new u1a(messagesController322222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            i = i2;
                                            if (!arrayList.isEmpty()) {
                                            }
                                            arrayList2 = new ArrayList();
                                            if (TLdeserialize != null) {
                                                j = peerSettings.bot_inviter_id;
                                                if (j != 0) {
                                                }
                                                j2 = TLdeserialize.settings.bot_owner_id;
                                                if (j2 != 0) {
                                                    arrayList2.add(Long.valueOf(TLdeserialize.settings.bot_owner_id));
                                                }
                                            }
                                            if (!arrayList2.isEmpty()) {
                                            }
                                            na7 messagesController42 = ad7Var.getMessagesController();
                                            messagesController42.getClass();
                                            gl.c3(new u1a(messagesController42, user2, i14, z12, TLdeserialize, arrayList6, hashMap3, i, z4));
                                            return;
                                        } catch (Exception e11) {
                                            e = e11;
                                            userFull = TLdeserialize;
                                            i = 0;
                                            z2 = false;
                                            sQLiteCursor = queryFinalized;
                                            z = true;
                                            ad7Var.n(e, z);
                                            na7 messagesController222222222 = ad7Var.getMessagesController();
                                            messagesController222222222.getClass();
                                            gl.c3(new u1a(messagesController222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                            if (sQLiteCursor == null) {
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            userFull = TLdeserialize;
                                            i = 0;
                                            z2 = false;
                                            sQLiteCursor = queryFinalized;
                                            na7 messagesController3222222222 = ad7Var.getMessagesController();
                                            messagesController3222222222.getClass();
                                            gl.c3(new u1a(messagesController3222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor = queryFinalized;
                                    i = 0;
                                    z2 = false;
                                    z = true;
                                    userFull = null;
                                    ad7Var.n(e, z);
                                    na7 messagesController2222222222 = ad7Var.getMessagesController();
                                    messagesController2222222222.getClass();
                                    gl.c3(new u1a(messagesController2222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                    if (sQLiteCursor == null) {
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    sQLiteCursor = queryFinalized;
                                    i = 0;
                                    z2 = false;
                                    userFull = null;
                                    na7 messagesController32222222222 = ad7Var.getMessagesController();
                                    messagesController32222222222.getClass();
                                    gl.c3(new u1a(messagesController32222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (arrayList6.isEmpty()) {
                            }
                            arrayList = new ArrayList();
                            if (TLdeserialize != null) {
                            }
                            i = i2;
                            if (!arrayList.isEmpty()) {
                            }
                            arrayList2 = new ArrayList();
                            if (TLdeserialize != null) {
                            }
                            if (!arrayList2.isEmpty()) {
                            }
                            na7 messagesController422 = ad7Var.getMessagesController();
                            messagesController422.getClass();
                            gl.c3(new u1a(messagesController422, user2, i14, z12, TLdeserialize, arrayList6, hashMap3, i, z4));
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            i = i2;
                            z2 = z3;
                        } catch (Throwable th14) {
                            th = th14;
                            i = i2;
                            z2 = z3;
                        }
                        queryFinalized.dispose();
                        if (TLdeserialize != null) {
                        }
                    } catch (Exception e14) {
                        e = e14;
                        i = i2;
                        z2 = z3;
                        userFull = TLdeserialize;
                        sQLiteCursor = queryFinalized;
                        z = true;
                        ad7Var.n(e, z);
                        na7 messagesController22222222222 = ad7Var.getMessagesController();
                        messagesController22222222222.getClass();
                        gl.c3(new u1a(messagesController22222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        i = i2;
                        z2 = z3;
                        userFull = TLdeserialize;
                        sQLiteCursor = queryFinalized;
                        na7 messagesController322222222222 = ad7Var.getMessagesController();
                        messagesController322222222222.getClass();
                        gl.c3(new u1a(messagesController322222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                    TLdeserialize = null;
                    queryFinalized.dispose();
                    SQLiteDatabase sQLiteDatabase2 = ad7Var.getMessagesStorage().b;
                    Locale locale2 = Locale.US;
                    ArrayList arrayList72 = arrayList6;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user2.id + " ORDER BY mid DESC", new Object[0]);
                    while (queryFinalized.next()) {
                    }
                    arrayList6 = arrayList72;
                    queryFinalized.dispose();
                    queryFinalized = ad7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user2.id, new Object[0]);
                    if (queryFinalized.next()) {
                    }
                } catch (Exception e15) {
                    e = e15;
                    z = true;
                    sQLiteCursor = null;
                } catch (Throwable th16) {
                    th = th16;
                    sQLiteCursor = null;
                }
                break;
            case 9:
                rja rjaVar = (rja) this.d;
                boolean z13 = this.c;
                int i16 = this.b;
                gb2 gb2Var = (gb2) this.e;
                if (z13 && rjaVar.R == null && rjaVar.S == null && rjaVar.Q == null) {
                    rjaVar.K = (byte) 2;
                    rjaVar.Y0 = true;
                }
                rjaVar.W0 = false;
                if (!rjaVar.Z0 && rjaVar.X0) {
                    rjaVar.x(true);
                    return;
                }
                rjaVar.V0 = rjaVar.j1[0];
                up3.q(i16).v(gb2Var);
                rjaVar.D();
                rjaVar.s();
                return;
            default:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$58((String) this.e, this.b, this.c);
                return;
        }
    }

    public /* synthetic */ bs1(hq6 hq6Var, int i, boolean z, p8c p8cVar) {
        this.a = (byte) 7;
        this.d = hq6Var;
        this.b = i;
        this.c = z;
        this.e = p8cVar;
    }

    public /* synthetic */ bs1(cs1 cs1Var, boolean z, ArrayList arrayList, int i) {
        this.a = (byte) 0;
        this.d = cs1Var;
        this.c = z;
        this.e = arrayList;
        this.b = i;
    }

    public /* synthetic */ bs1(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = z;
    }

    public /* synthetic */ bs1(Object obj, Object obj2, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = z;
    }

    public /* synthetic */ bs1(Object obj, TLObject tLObject, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.c = z;
        this.b = i;
    }
}
