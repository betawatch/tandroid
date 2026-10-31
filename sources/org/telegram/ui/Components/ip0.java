package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ ip0(lp0 lp0Var, int i10, String str) {
        this.a = 1;
        this.b = lp0Var;
        this.c = i10;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043f A[Catch: Exception -> 0x0130, LOOP:7: B:183:0x038b->B:199:0x043f, LOOP_END, TryCatch #0 {Exception -> 0x0130, blocks: (B:5:0x0010, B:12:0x0038, B:19:0x0054, B:22:0x005c, B:23:0x007b, B:42:0x00c5, B:45:0x00d8, B:46:0x0104, B:48:0x010a, B:51:0x0122, B:53:0x0129, B:56:0x013a, B:58:0x0144, B:61:0x015d, B:63:0x0163, B:67:0x017b, B:73:0x018b, B:75:0x0192, B:81:0x01c1, B:82:0x01f5, B:85:0x01cc, B:71:0x0205, B:102:0x0222, B:103:0x0238, B:105:0x023e, B:106:0x0267, B:108:0x026d, B:113:0x0287, B:115:0x028f, B:118:0x02a6, B:120:0x02ac, B:148:0x02c3, B:124:0x02c6, B:126:0x02cc, B:128:0x02d9, B:130:0x02df, B:132:0x02e5, B:134:0x02e9, B:136:0x02ed, B:138:0x02f1, B:142:0x02f5, B:155:0x0316, B:157:0x0321, B:158:0x0327, B:160:0x032d, B:162:0x0337, B:164:0x033b, B:166:0x033e, B:170:0x0341, B:171:0x0352, B:173:0x0358, B:176:0x0364, B:179:0x037a, B:181:0x0381, B:184:0x038d, B:186:0x0395, B:189:0x03ac, B:191:0x03b2, B:195:0x03ca, B:201:0x03d5, B:208:0x03dc, B:210:0x03f0, B:211:0x03f7, B:213:0x0402, B:214:0x0437, B:216:0x040e, B:199:0x043f, B:226:0x044b), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205 A[Catch: Exception -> 0x0130, LOOP:2: B:55:0x0138->B:71:0x0205, LOOP_END, TryCatch #0 {Exception -> 0x0130, blocks: (B:5:0x0010, B:12:0x0038, B:19:0x0054, B:22:0x005c, B:23:0x007b, B:42:0x00c5, B:45:0x00d8, B:46:0x0104, B:48:0x010a, B:51:0x0122, B:53:0x0129, B:56:0x013a, B:58:0x0144, B:61:0x015d, B:63:0x0163, B:67:0x017b, B:73:0x018b, B:75:0x0192, B:81:0x01c1, B:82:0x01f5, B:85:0x01cc, B:71:0x0205, B:102:0x0222, B:103:0x0238, B:105:0x023e, B:106:0x0267, B:108:0x026d, B:113:0x0287, B:115:0x028f, B:118:0x02a6, B:120:0x02ac, B:148:0x02c3, B:124:0x02c6, B:126:0x02cc, B:128:0x02d9, B:130:0x02df, B:132:0x02e5, B:134:0x02e9, B:136:0x02ed, B:138:0x02f1, B:142:0x02f5, B:155:0x0316, B:157:0x0321, B:158:0x0327, B:160:0x032d, B:162:0x0337, B:164:0x033b, B:166:0x033e, B:170:0x0341, B:171:0x0352, B:173:0x0358, B:176:0x0364, B:179:0x037a, B:181:0x0381, B:184:0x038d, B:186:0x0395, B:189:0x03ac, B:191:0x03b2, B:195:0x03ca, B:201:0x03d5, B:208:0x03dc, B:210:0x03f0, B:211:0x03f7, B:213:0x0402, B:214:0x0437, B:216:0x040e, B:199:0x043f, B:226:0x044b), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        lp0 lp0Var;
        int i11;
        String[] strArr;
        int i12;
        int i13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i14;
        lp0 lp0Var2;
        int i15;
        ?? r22;
        boolean z11;
        switch (this.a) {
            case 0:
                lp0 lp0Var3 = this.b;
                lp0Var3.f = null;
                org.telegram.messenger.r5 r5Var = org.telegram.messenger.hs.a0(lp0Var3.K.a).a;
                String str = this.d;
                int i16 = this.c;
                r5Var.c(new ip0(lp0Var3, str, i16, 2));
                ip0 ip0Var = new ip0(lp0Var3, i16, str);
                lp0Var3.h = ip0Var;
                org.telegram.messenger.i0.g3(ip0Var);
                break;
            case 1:
                lp0 lp0Var4 = this.b;
                lp0Var4.h = null;
                int i17 = lp0Var4.r;
                int i18 = this.c;
                if (i18 == i17) {
                    lp0Var4.e.g(this.d, true, true, true, true, 0L, false, 0, i18);
                    break;
                }
                break;
            default:
                String str2 = this.d;
                int i19 = this.c;
                lp0 lp0Var5 = this.b;
                op0 op0Var = lp0Var5.K;
                try {
                    String lowerCase = str2.trim().toLowerCase();
                    try {
                        if (lowerCase.length() == 0) {
                            lp0Var5.r = -1;
                            org.telegram.messenger.i0.g3(new ji0(lp0Var5, lp0Var5.r, new ArrayList(), 1));
                            break;
                        } else {
                            String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                            if (lowerCase.equals(R0) || R0.length() == 0) {
                                R0 = null;
                            }
                            int i20 = (R0 != null ? 1 : 0) + 1;
                            String[] strArr2 = new String[i20];
                            strArr2[0] = lowerCase;
                            if (R0 != null) {
                                strArr2[1] = R0;
                            }
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            a0.h hVar = new a0.h();
                            SQLiteCursor queryFinalized = org.telegram.messenger.hs.a0(op0Var.a).b.queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(0);
                                dp0 dp0Var = new dp0();
                                dp0Var.c = queryFinalized.intValue(1);
                                hVar.k(dp0Var, longValue);
                                if (org.telegram.messenger.o5.E(longValue)) {
                                    if (!arrayList.contains(Long.valueOf(longValue))) {
                                        arrayList.add(Long.valueOf(longValue));
                                    }
                                } else if (org.telegram.messenger.o5.z(longValue)) {
                                    long j10 = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j10))) {
                                        arrayList2.add(Long.valueOf(j10));
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            if (arrayList.isEmpty()) {
                                i10 = i19;
                                lp0Var = lp0Var5;
                                i11 = i20;
                                strArr = strArr2;
                                i12 = 0;
                            } else {
                                SQLiteDatabase sQLiteDatabase = org.telegram.messenger.hs.a0(op0Var.a).b;
                                Locale locale = Locale.US;
                                String join = TextUtils.join(",", arrayList);
                                StringBuilder sb2 = new StringBuilder();
                                strArr = strArr2;
                                sb2.append("SELECT data, status, name FROM users WHERE uid IN(");
                                sb2.append(join);
                                sb2.append(")");
                                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                int i21 = 0;
                                while (queryFinalized2.next()) {
                                    String stringValue = queryFinalized2.stringValue(2);
                                    int i22 = i21;
                                    String R02 = org.telegram.messenger.cd.D0().R0(stringValue, true, false);
                                    if (stringValue.equals(R02)) {
                                        R02 = null;
                                    }
                                    int lastIndexOf = stringValue.lastIndexOf(";;;");
                                    String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                                    int i23 = 0;
                                    boolean z12 = false;
                                    while (true) {
                                        if (i23 < i20) {
                                            int i24 = i23;
                                            String str3 = strArr[i24];
                                            if (stringValue.startsWith(str3)) {
                                                i14 = i19;
                                            } else {
                                                i14 = i19;
                                                if (!stringValue.contains(" " + str3)) {
                                                    if (R02 != null) {
                                                        if (!R02.startsWith(str3)) {
                                                            if (R02.contains(" " + str3)) {
                                                            }
                                                        }
                                                    }
                                                    r22 = (substring == null || !substring.startsWith(str3)) ? z12 : 2;
                                                    if (r22 == 0) {
                                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                                        if (byteBufferValue != null) {
                                                            TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                            byteBufferValue.reuse();
                                                            int i25 = i20;
                                                            dp0 dp0Var2 = (dp0) hVar.f(TLdeserialize.id);
                                                            TLRPC.UserStatus userStatus = TLdeserialize.status;
                                                            if (userStatus != null) {
                                                                i15 = i25;
                                                                lp0Var2 = lp0Var5;
                                                                z11 = true;
                                                                try {
                                                                    userStatus.expires = queryFinalized2.intValue(1);
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    z10 = true;
                                                                    org.telegram.messenger.f8.g(e, z10);
                                                                }
                                                            } else {
                                                                i15 = i25;
                                                                lp0Var2 = lp0Var5;
                                                                z11 = true;
                                                            }
                                                            if (r22 == z11) {
                                                                dp0Var2.d = org.telegram.messenger.i0.r0(TLdeserialize.first_name, TLdeserialize.last_name, str3);
                                                            } else {
                                                                dp0Var2.d = org.telegram.messenger.i0.r0("@" + org.telegram.messenger.h20.n(TLdeserialize), null, "@" + str3);
                                                            }
                                                            dp0Var2.b = TLdeserialize;
                                                            dp0Var2.a.id = TLdeserialize.id;
                                                            i21 = i22 + 1;
                                                        }
                                                    } else {
                                                        i23 = i24 + 1;
                                                        z12 = r22;
                                                        i19 = i14;
                                                    }
                                                }
                                            }
                                            r22 = 1;
                                            if (r22 == 0) {
                                            }
                                        } else {
                                            i14 = i19;
                                        }
                                    }
                                    lp0Var2 = lp0Var5;
                                    i15 = i20;
                                    i21 = i22;
                                    i19 = i14;
                                    i20 = i15;
                                    lp0Var5 = lp0Var2;
                                }
                                i10 = i19;
                                lp0Var = lp0Var5;
                                i12 = i21;
                                i11 = i20;
                                queryFinalized2.dispose();
                            }
                            if (arrayList2.isEmpty()) {
                                i13 = i11;
                            } else {
                                SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.hs.a0(op0Var.a).b;
                                Locale locale2 = Locale.US;
                                SQLiteCursor queryFinalized3 = sQLiteDatabase2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                                while (queryFinalized3.next()) {
                                    String stringValue2 = queryFinalized3.stringValue(1);
                                    String R03 = org.telegram.messenger.cd.D0().R0(stringValue2, true, false);
                                    if (stringValue2.equals(R03)) {
                                        R03 = null;
                                    }
                                    int i26 = i11;
                                    for (int i27 = 0; i27 < i26; i27++) {
                                        String str4 = strArr[i27];
                                        if (!stringValue2.startsWith(str4)) {
                                            if (!stringValue2.contains(" " + str4)) {
                                                if (R03 != null) {
                                                    if (!R03.startsWith(str4)) {
                                                        if (R03.contains(" " + str4)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize2 != null && !org.telegram.messenger.w3.r0(TLdeserialize2) && (!org.telegram.messenger.w3.T(TLdeserialize2) || TLdeserialize2.creator || (((tL_chatAdminRights = TLdeserialize2.admin_rights) != null && tL_chatAdminRights.post_messages) || TLdeserialize2.megagroup))) {
                                                dp0 dp0Var3 = (dp0) hVar.f(-TLdeserialize2.id);
                                                dp0Var3.d = org.telegram.messenger.i0.r0(TLdeserialize2.title, null, str4);
                                                dp0Var3.b = TLdeserialize2;
                                                dp0Var3.a.id = -TLdeserialize2.id;
                                                i12++;
                                            }
                                        }
                                        i11 = i26;
                                    }
                                    i11 = i26;
                                }
                                i13 = i11;
                                queryFinalized3.dispose();
                            }
                            ArrayList arrayList3 = new ArrayList(i12);
                            for (int i28 = 0; i28 < hVar.m(); i28++) {
                                dp0 dp0Var4 = (dp0) hVar.n(i28);
                                if (dp0Var4.b != null && dp0Var4.d != null) {
                                    arrayList3.add(dp0Var4);
                                }
                            }
                            SQLiteCursor queryFinalized4 = org.telegram.messenger.hs.a0(op0Var.a).b.queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                            while (queryFinalized4.next()) {
                                if (hVar.h(queryFinalized4.longValue(3)) < 0) {
                                    char c10 = 2;
                                    String stringValue3 = queryFinalized4.stringValue(2);
                                    String R04 = org.telegram.messenger.cd.D0().R0(stringValue3, true, false);
                                    if (stringValue3.equals(R04)) {
                                        R04 = null;
                                    }
                                    int lastIndexOf2 = stringValue3.lastIndexOf(";;;");
                                    String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 3) : null;
                                    int i29 = 0;
                                    char c11 = 0;
                                    while (true) {
                                        if (i29 < i13) {
                                            String str5 = strArr[i29];
                                            if (!stringValue3.startsWith(str5)) {
                                                if (!stringValue3.contains(" " + str5)) {
                                                    if (R04 != null) {
                                                        if (!R04.startsWith(str5)) {
                                                            if (R04.contains(" " + str5)) {
                                                            }
                                                        }
                                                    }
                                                    if (substring2 != null && substring2.startsWith(str5)) {
                                                        c11 = c10;
                                                    }
                                                    if (c11 == 0) {
                                                        NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                                        if (byteBufferValue3 != null) {
                                                            TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                            byteBufferValue3.reuse();
                                                            dp0 dp0Var5 = new dp0();
                                                            TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                                            if (userStatus2 != null) {
                                                                userStatus2.expires = queryFinalized4.intValue(1);
                                                            }
                                                            dp0Var5.a.id = TLdeserialize3.id;
                                                            dp0Var5.b = TLdeserialize3;
                                                            if (c11 == 1) {
                                                                dp0Var5.d = org.telegram.messenger.i0.r0(TLdeserialize3.first_name, TLdeserialize3.last_name, str5);
                                                            } else {
                                                                dp0Var5.d = org.telegram.messenger.i0.r0("@" + org.telegram.messenger.h20.n(TLdeserialize3), null, "@" + str5);
                                                            }
                                                            arrayList3.add(dp0Var5);
                                                        }
                                                    } else {
                                                        i29++;
                                                        c10 = 2;
                                                    }
                                                }
                                            }
                                            c11 = 1;
                                            if (c11 == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            queryFinalized4.dispose();
                            Collections.sort(arrayList3, new org.telegram.ui.f6(18));
                            org.telegram.messenger.i0.g3(new ji0(lp0Var, i10, arrayList3, 1));
                            break;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z10 = true;
                    }
                } catch (Exception e10) {
                    e = e10;
                    z10 = true;
                }
                break;
        }
    }

    public /* synthetic */ ip0(lp0 lp0Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = lp0Var;
        this.d = str;
        this.c = i10;
    }
}
