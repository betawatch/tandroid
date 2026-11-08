package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ go0(jo0 jo0Var, int i7, String str) {
        this.a = 1;
        this.b = jo0Var;
        this.c = i7;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0440 A[Catch: Exception -> 0x0131, LOOP:7: B:183:0x038c->B:199:0x0440, LOOP_END, TryCatch #2 {Exception -> 0x0131, blocks: (B:5:0x0010, B:12:0x0039, B:19:0x0055, B:22:0x005d, B:23:0x007c, B:42:0x00c6, B:45:0x00d9, B:46:0x0105, B:48:0x010b, B:51:0x0123, B:53:0x012a, B:56:0x013b, B:58:0x0145, B:61:0x015e, B:63:0x0164, B:67:0x017c, B:73:0x018c, B:75:0x0193, B:81:0x01c2, B:82:0x01f6, B:85:0x01cd, B:71:0x0206, B:102:0x0223, B:103:0x0239, B:105:0x023f, B:106:0x0268, B:108:0x026e, B:113:0x0288, B:115:0x0290, B:118:0x02a7, B:120:0x02ad, B:148:0x02c4, B:124:0x02c7, B:126:0x02cd, B:128:0x02da, B:130:0x02e0, B:132:0x02e6, B:134:0x02ea, B:136:0x02ee, B:138:0x02f2, B:142:0x02f6, B:155:0x0317, B:157:0x0322, B:158:0x0328, B:160:0x032e, B:162:0x0338, B:164:0x033c, B:166:0x033f, B:170:0x0342, B:171:0x0353, B:173:0x0359, B:176:0x0365, B:179:0x037b, B:181:0x0382, B:184:0x038e, B:186:0x0396, B:189:0x03ad, B:191:0x03b3, B:195:0x03cb, B:201:0x03d6, B:208:0x03dd, B:210:0x03f1, B:211:0x03f8, B:213:0x0403, B:214:0x0438, B:216:0x040f, B:199:0x0440, B:226:0x044c), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0206 A[Catch: Exception -> 0x0131, LOOP:2: B:55:0x0139->B:71:0x0206, LOOP_END, TryCatch #2 {Exception -> 0x0131, blocks: (B:5:0x0010, B:12:0x0039, B:19:0x0055, B:22:0x005d, B:23:0x007c, B:42:0x00c6, B:45:0x00d9, B:46:0x0105, B:48:0x010b, B:51:0x0123, B:53:0x012a, B:56:0x013b, B:58:0x0145, B:61:0x015e, B:63:0x0164, B:67:0x017c, B:73:0x018c, B:75:0x0193, B:81:0x01c2, B:82:0x01f6, B:85:0x01cd, B:71:0x0206, B:102:0x0223, B:103:0x0239, B:105:0x023f, B:106:0x0268, B:108:0x026e, B:113:0x0288, B:115:0x0290, B:118:0x02a7, B:120:0x02ad, B:148:0x02c4, B:124:0x02c7, B:126:0x02cd, B:128:0x02da, B:130:0x02e0, B:132:0x02e6, B:134:0x02ea, B:136:0x02ee, B:138:0x02f2, B:142:0x02f6, B:155:0x0317, B:157:0x0322, B:158:0x0328, B:160:0x032e, B:162:0x0338, B:164:0x033c, B:166:0x033f, B:170:0x0342, B:171:0x0353, B:173:0x0359, B:176:0x0365, B:179:0x037b, B:181:0x0382, B:184:0x038e, B:186:0x0396, B:189:0x03ad, B:191:0x03b3, B:195:0x03cb, B:201:0x03d6, B:208:0x03dd, B:210:0x03f1, B:211:0x03f8, B:213:0x0403, B:214:0x0438, B:216:0x040f, B:199:0x0440, B:226:0x044c), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        int i7;
        jo0 jo0Var;
        int i10;
        String[] strArr;
        int i11;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13;
        jo0 jo0Var2;
        int i14;
        ?? r22;
        boolean z10;
        switch (this.a) {
            case 0:
                jo0 jo0Var3 = this.b;
                jo0Var3.f = null;
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.yr.a0(jo0Var3.K.a).a;
                String str = this.d;
                int i15 = this.c;
                p5Var.c(new go0(jo0Var3, str, i15, 2));
                go0 go0Var = new go0(jo0Var3, i15, str);
                jo0Var3.h = go0Var;
                org.telegram.messenger.g0.h3(go0Var);
                break;
            case 1:
                jo0 jo0Var4 = this.b;
                jo0Var4.h = null;
                int i16 = jo0Var4.r;
                int i17 = this.c;
                if (i17 == i16) {
                    jo0Var4.e.g(this.d, true, true, true, true, 0L, false, 0, i17);
                    break;
                }
                break;
            default:
                String str2 = this.d;
                int i18 = this.c;
                jo0 jo0Var5 = this.b;
                mo0 mo0Var = jo0Var5.K;
                try {
                    String lowerCase = str2.trim().toLowerCase();
                    try {
                        if (lowerCase.length() == 0) {
                            jo0Var5.r = -1;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.q8(jo0Var5, jo0Var5.r, new ArrayList(), 14));
                            break;
                        } else {
                            String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
                            if (lowerCase.equals(S0) || S0.length() == 0) {
                                S0 = null;
                            }
                            int i19 = (S0 != null ? 1 : 0) + 1;
                            String[] strArr2 = new String[i19];
                            strArr2[0] = lowerCase;
                            if (S0 != null) {
                                strArr2[1] = S0;
                            }
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            a0.h hVar = new a0.h();
                            SQLiteCursor queryFinalized = org.telegram.messenger.yr.a0(mo0Var.a).b.queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(0);
                                bo0 bo0Var = new bo0();
                                bo0Var.c = queryFinalized.intValue(1);
                                hVar.k(bo0Var, longValue);
                                if (org.telegram.messenger.m5.E(longValue)) {
                                    if (!arrayList.contains(Long.valueOf(longValue))) {
                                        arrayList.add(Long.valueOf(longValue));
                                    }
                                } else if (org.telegram.messenger.m5.z(longValue)) {
                                    long j3 = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j3))) {
                                        arrayList2.add(Long.valueOf(j3));
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            if (arrayList.isEmpty()) {
                                i7 = i18;
                                jo0Var = jo0Var5;
                                i10 = i19;
                                strArr = strArr2;
                                i11 = 0;
                            } else {
                                SQLiteDatabase sQLiteDatabase = org.telegram.messenger.yr.a0(mo0Var.a).b;
                                Locale locale = Locale.US;
                                String join = TextUtils.join(",", arrayList);
                                StringBuilder sb2 = new StringBuilder();
                                strArr = strArr2;
                                sb2.append("SELECT data, status, name FROM users WHERE uid IN(");
                                sb2.append(join);
                                sb2.append(")");
                                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                int i20 = 0;
                                while (queryFinalized2.next()) {
                                    String stringValue = queryFinalized2.stringValue(2);
                                    int i21 = i20;
                                    String S02 = org.telegram.messenger.id.E0().S0(stringValue, true, false);
                                    if (stringValue.equals(S02)) {
                                        S02 = null;
                                    }
                                    int lastIndexOf = stringValue.lastIndexOf(";;;");
                                    String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                                    int i22 = 0;
                                    boolean z11 = false;
                                    while (true) {
                                        if (i22 < i19) {
                                            int i23 = i22;
                                            String str3 = strArr[i23];
                                            if (stringValue.startsWith(str3)) {
                                                i13 = i18;
                                            } else {
                                                i13 = i18;
                                                if (!stringValue.contains(" " + str3)) {
                                                    if (S02 != null) {
                                                        if (!S02.startsWith(str3)) {
                                                            if (S02.contains(" " + str3)) {
                                                            }
                                                        }
                                                    }
                                                    r22 = (substring == null || !substring.startsWith(str3)) ? z11 : 2;
                                                    if (r22 == 0) {
                                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                                        if (byteBufferValue != null) {
                                                            TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                            byteBufferValue.reuse();
                                                            int i24 = i19;
                                                            bo0 bo0Var2 = (bo0) hVar.f(TLdeserialize.id);
                                                            TLRPC.UserStatus userStatus = TLdeserialize.status;
                                                            if (userStatus != null) {
                                                                i14 = i24;
                                                                jo0Var2 = jo0Var5;
                                                                z10 = true;
                                                                try {
                                                                    userStatus.expires = queryFinalized2.intValue(1);
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    z9 = true;
                                                                    org.telegram.messenger.a8.g(e, z9);
                                                                }
                                                            } else {
                                                                i14 = i24;
                                                                jo0Var2 = jo0Var5;
                                                                z10 = true;
                                                            }
                                                            if (r22 == z10) {
                                                                bo0Var2.d = org.telegram.messenger.g0.r0(TLdeserialize.first_name, TLdeserialize.last_name, str3);
                                                            } else {
                                                                bo0Var2.d = org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(TLdeserialize), null, "@" + str3);
                                                            }
                                                            bo0Var2.b = TLdeserialize;
                                                            bo0Var2.a.id = TLdeserialize.id;
                                                            i20 = i21 + 1;
                                                        }
                                                    } else {
                                                        i22 = i23 + 1;
                                                        z11 = r22;
                                                        i18 = i13;
                                                    }
                                                }
                                            }
                                            r22 = 1;
                                            if (r22 == 0) {
                                            }
                                        } else {
                                            i13 = i18;
                                        }
                                    }
                                    jo0Var2 = jo0Var5;
                                    i14 = i19;
                                    i20 = i21;
                                    i18 = i13;
                                    i19 = i14;
                                    jo0Var5 = jo0Var2;
                                }
                                i7 = i18;
                                jo0Var = jo0Var5;
                                i11 = i20;
                                i10 = i19;
                                queryFinalized2.dispose();
                            }
                            if (arrayList2.isEmpty()) {
                                i12 = i10;
                            } else {
                                SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.yr.a0(mo0Var.a).b;
                                Locale locale2 = Locale.US;
                                SQLiteCursor queryFinalized3 = sQLiteDatabase2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                                while (queryFinalized3.next()) {
                                    String stringValue2 = queryFinalized3.stringValue(1);
                                    String S03 = org.telegram.messenger.id.E0().S0(stringValue2, true, false);
                                    if (stringValue2.equals(S03)) {
                                        S03 = null;
                                    }
                                    int i25 = i10;
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        String str4 = strArr[i26];
                                        if (!stringValue2.startsWith(str4)) {
                                            if (!stringValue2.contains(" " + str4)) {
                                                if (S03 != null) {
                                                    if (!S03.startsWith(str4)) {
                                                        if (S03.contains(" " + str4)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize2 != null && !org.telegram.messenger.t3.r0(TLdeserialize2) && (!org.telegram.messenger.t3.T(TLdeserialize2) || TLdeserialize2.creator || (((tL_chatAdminRights = TLdeserialize2.admin_rights) != null && tL_chatAdminRights.post_messages) || TLdeserialize2.megagroup))) {
                                                bo0 bo0Var3 = (bo0) hVar.f(-TLdeserialize2.id);
                                                bo0Var3.d = org.telegram.messenger.g0.r0(TLdeserialize2.title, null, str4);
                                                bo0Var3.b = TLdeserialize2;
                                                bo0Var3.a.id = -TLdeserialize2.id;
                                                i11++;
                                            }
                                        }
                                        i10 = i25;
                                    }
                                    i10 = i25;
                                }
                                i12 = i10;
                                queryFinalized3.dispose();
                            }
                            ArrayList arrayList3 = new ArrayList(i11);
                            for (int i27 = 0; i27 < hVar.m(); i27++) {
                                bo0 bo0Var4 = (bo0) hVar.n(i27);
                                if (bo0Var4.b != null && bo0Var4.d != null) {
                                    arrayList3.add(bo0Var4);
                                }
                            }
                            SQLiteCursor queryFinalized4 = org.telegram.messenger.yr.a0(mo0Var.a).b.queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                            while (queryFinalized4.next()) {
                                if (hVar.h(queryFinalized4.longValue(3)) < 0) {
                                    char c10 = 2;
                                    String stringValue3 = queryFinalized4.stringValue(2);
                                    String S04 = org.telegram.messenger.id.E0().S0(stringValue3, true, false);
                                    if (stringValue3.equals(S04)) {
                                        S04 = null;
                                    }
                                    int lastIndexOf2 = stringValue3.lastIndexOf(";;;");
                                    String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 3) : null;
                                    int i28 = 0;
                                    char c11 = 0;
                                    while (true) {
                                        if (i28 < i12) {
                                            String str5 = strArr[i28];
                                            if (!stringValue3.startsWith(str5)) {
                                                if (!stringValue3.contains(" " + str5)) {
                                                    if (S04 != null) {
                                                        if (!S04.startsWith(str5)) {
                                                            if (S04.contains(" " + str5)) {
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
                                                            bo0 bo0Var5 = new bo0();
                                                            TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                                            if (userStatus2 != null) {
                                                                userStatus2.expires = queryFinalized4.intValue(1);
                                                            }
                                                            bo0Var5.a.id = TLdeserialize3.id;
                                                            bo0Var5.b = TLdeserialize3;
                                                            if (c11 == 1) {
                                                                bo0Var5.d = org.telegram.messenger.g0.r0(TLdeserialize3.first_name, TLdeserialize3.last_name, str5);
                                                            } else {
                                                                bo0Var5.d = org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(TLdeserialize3), null, "@" + str5);
                                                            }
                                                            arrayList3.add(bo0Var5);
                                                        }
                                                    } else {
                                                        i28++;
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
                            Collections.sort(arrayList3, new org.telegram.ui.oe(16));
                            org.telegram.messenger.g0.h3(new org.telegram.ui.q8(jo0Var, i7, arrayList3, 14));
                            break;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        z9 = true;
                    }
                } catch (Exception e12) {
                    e = e12;
                    z9 = true;
                }
                break;
        }
    }

    public /* synthetic */ go0(jo0 jo0Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = jo0Var;
        this.d = str;
        this.c = i7;
    }
}
