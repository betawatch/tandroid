// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qca b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ nca(qca qcaVar, int i, String str) {
        this.a = (byte) 1;
        this.b = qcaVar;
        this.c = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03b3, code lost:
    
        if (r6.contains(" " + r9) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0172, code lost:
    
        if (r5.contains(" " + r12) == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0428 A[Catch: Exception -> 0x044f, LOOP:7: B:192:0x0379->B:207:0x0428, LOOP_END, TryCatch #1 {Exception -> 0x044f, blocks: (B:5:0x0010, B:12:0x0036, B:19:0x0052, B:22:0x005a, B:23:0x0079, B:47:0x00c5, B:50:0x00d8, B:51:0x0102, B:53:0x0108, B:56:0x0122, B:58:0x0129, B:61:0x0136, B:63:0x0140, B:66:0x0159, B:68:0x015f, B:71:0x0176, B:77:0x0186, B:79:0x018d, B:85:0x01ba, B:86:0x01ee, B:89:0x01c5, B:75:0x01fe, B:105:0x0215, B:106:0x022d, B:108:0x0233, B:109:0x025c, B:111:0x0262, B:116:0x027a, B:118:0x0282, B:121:0x0299, B:123:0x029f, B:157:0x02b4, B:126:0x02b7, B:129:0x02be, B:132:0x02cb, B:135:0x02d1, B:137:0x02d7, B:139:0x02db, B:141:0x02df, B:147:0x02e3, B:144:0x02e7, B:164:0x0306, B:165:0x0309, B:166:0x0311, B:168:0x0317, B:170:0x0321, B:172:0x0325, B:174:0x0328, B:178:0x032b, B:179:0x033c, B:181:0x0342, B:184:0x034d, B:188:0x0368, B:190:0x036f, B:193:0x037b, B:195:0x0383, B:198:0x039a, B:200:0x03a0, B:203:0x03b7, B:209:0x03c2, B:211:0x03c9, B:213:0x03dd, B:214:0x03e4, B:216:0x03f0, B:217:0x0424, B:221:0x03fb, B:207:0x0428, B:229:0x0432), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe A[Catch: Exception -> 0x044f, LOOP:2: B:60:0x0134->B:75:0x01fe, LOOP_END, TryCatch #1 {Exception -> 0x044f, blocks: (B:5:0x0010, B:12:0x0036, B:19:0x0052, B:22:0x005a, B:23:0x0079, B:47:0x00c5, B:50:0x00d8, B:51:0x0102, B:53:0x0108, B:56:0x0122, B:58:0x0129, B:61:0x0136, B:63:0x0140, B:66:0x0159, B:68:0x015f, B:71:0x0176, B:77:0x0186, B:79:0x018d, B:85:0x01ba, B:86:0x01ee, B:89:0x01c5, B:75:0x01fe, B:105:0x0215, B:106:0x022d, B:108:0x0233, B:109:0x025c, B:111:0x0262, B:116:0x027a, B:118:0x0282, B:121:0x0299, B:123:0x029f, B:157:0x02b4, B:126:0x02b7, B:129:0x02be, B:132:0x02cb, B:135:0x02d1, B:137:0x02d7, B:139:0x02db, B:141:0x02df, B:147:0x02e3, B:144:0x02e7, B:164:0x0306, B:165:0x0309, B:166:0x0311, B:168:0x0317, B:170:0x0321, B:172:0x0325, B:174:0x0328, B:178:0x032b, B:179:0x033c, B:181:0x0342, B:184:0x034d, B:188:0x0368, B:190:0x036f, B:193:0x037b, B:195:0x0383, B:198:0x039a, B:200:0x03a0, B:203:0x03b7, B:209:0x03c2, B:211:0x03c9, B:213:0x03dd, B:214:0x03e4, B:216:0x03f0, B:217:0x0424, B:221:0x03fb, B:207:0x0428, B:229:0x0432), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        qca qcaVar;
        String str;
        String[] strArr;
        int i2;
        int i3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i4;
        qca qcaVar2;
        String str2;
        ?? r3;
        byte b = this.a;
        int i5 = this.c;
        String str3 = this.d;
        qca qcaVar3 = this.b;
        switch (b) {
            case 0:
                qcaVar3.f = null;
                cf7.Y(qcaVar3.L.a).a.c(new nca(qcaVar3, str3, i5, (byte) 2));
                nca ncaVar = new nca(qcaVar3, i5, str3);
                qcaVar3.h = ncaVar;
                gm.c3(ncaVar);
                break;
            case 1:
                qcaVar3.h = null;
                int i6 = qcaVar3.r;
                int i7 = this.c;
                if (i7 == i6) {
                    qcaVar3.e.g(this.d, true, true, true, true, 0L, false, 0, i7);
                    break;
                }
                break;
            default:
                tca tcaVar = qcaVar3.L;
                try {
                    String lowerCase = str3.trim().toLowerCase();
                    byte b2 = 4;
                    try {
                        if (lowerCase.length() == 0) {
                            qcaVar3.r = -1;
                            gm.c3(new v99(qcaVar3, qcaVar3.r, new ArrayList(), b2));
                            break;
                        } else {
                            String S0 = jb6.D0().S0(lowerCase, true, false);
                            if (lowerCase.equals(S0) || S0.length() == 0) {
                                S0 = null;
                            }
                            int i8 = (S0 != null ? 1 : 0) + 1;
                            String[] strArr2 = new String[i8];
                            strArr2[0] = lowerCase;
                            if (S0 != null) {
                                strArr2[1] = S0;
                            }
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            vh6 vh6Var = new vh6();
                            SQLiteCursor queryFinalized = cf7.Y(tcaVar.a).b.queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(0);
                                ica icaVar = new ica();
                                icaVar.c = queryFinalized.intValue(1);
                                vh6Var.k(icaVar, longValue);
                                if (pg3.D(longValue)) {
                                    if (!arrayList.contains(Long.valueOf(longValue))) {
                                        arrayList.add(Long.valueOf(longValue));
                                    }
                                } else if (pg3.y(longValue)) {
                                    long j = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j))) {
                                        arrayList2.add(Long.valueOf(j));
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            String str4 = ";;;";
                            if (arrayList.isEmpty()) {
                                i = i5;
                                qcaVar = qcaVar3;
                                str = ";;;";
                                strArr = strArr2;
                                i2 = 0;
                            } else {
                                SQLiteDatabase sQLiteDatabase = cf7.Y(tcaVar.a).b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT data, status, name FROM users WHERE uid IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                                int i9 = 0;
                                while (queryFinalized2.next()) {
                                    String stringValue = queryFinalized2.stringValue(2);
                                    int i10 = i9;
                                    String[] strArr3 = strArr2;
                                    String S02 = jb6.D0().S0(stringValue, true, false);
                                    if (stringValue.equals(S02)) {
                                        S02 = null;
                                    }
                                    int lastIndexOf = stringValue.lastIndexOf(str4);
                                    String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                                    int i11 = 0;
                                    boolean z2 = false;
                                    while (true) {
                                        if (i11 < i8) {
                                            int i12 = i11;
                                            String str5 = strArr3[i12];
                                            if (stringValue.startsWith(str5)) {
                                                i4 = i5;
                                            } else {
                                                i4 = i5;
                                                if (!stringValue.contains(" " + str5)) {
                                                    if (S02 != null) {
                                                        if (!S02.startsWith(str5)) {
                                                            break;
                                                        }
                                                    }
                                                    r3 = (substring == null || !substring.startsWith(str5)) ? z2 : 2;
                                                    if (r3 == 0) {
                                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                                        if (byteBufferValue != null) {
                                                            TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                            byteBufferValue.reuse();
                                                            ica icaVar2 = (ica) vh6Var.f(TLdeserialize.id);
                                                            TLRPC.UserStatus userStatus = TLdeserialize.status;
                                                            if (userStatus != null) {
                                                                qcaVar2 = qcaVar3;
                                                                str2 = str4;
                                                                z = true;
                                                                try {
                                                                    userStatus.expires = queryFinalized2.intValue(1);
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    fc4.g(e, z);
                                                                }
                                                            } else {
                                                                qcaVar2 = qcaVar3;
                                                                str2 = str4;
                                                                z = true;
                                                            }
                                                            if (r3 == z) {
                                                                icaVar2.d = gm.r0(TLdeserialize.first_name, TLdeserialize.last_name, str5);
                                                            } else {
                                                                icaVar2.d = gm.r0("@" + m9c.p(TLdeserialize), null, "@" + str5);
                                                            }
                                                            icaVar2.b = TLdeserialize;
                                                            icaVar2.a.id = TLdeserialize.id;
                                                            i9 = i10 + 1;
                                                        }
                                                    } else {
                                                        i11 = i12 + 1;
                                                        z2 = r3;
                                                        i5 = i4;
                                                    }
                                                }
                                            }
                                            r3 = 1;
                                            if (r3 == 0) {
                                            }
                                        } else {
                                            i4 = i5;
                                        }
                                    }
                                    qcaVar2 = qcaVar3;
                                    str2 = str4;
                                    i9 = i10;
                                    strArr2 = strArr3;
                                    i5 = i4;
                                    qcaVar3 = qcaVar2;
                                    str4 = str2;
                                }
                                i = i5;
                                i2 = i9;
                                qcaVar = qcaVar3;
                                str = str4;
                                strArr = strArr2;
                                queryFinalized2.dispose();
                            }
                            if (!arrayList2.isEmpty()) {
                                SQLiteDatabase sQLiteDatabase2 = cf7.Y(tcaVar.a).b;
                                Locale locale2 = Locale.US;
                                SQLiteCursor queryFinalized3 = sQLiteDatabase2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                                while (queryFinalized3.next()) {
                                    String stringValue2 = queryFinalized3.stringValue(1);
                                    String S03 = jb6.D0().S0(stringValue2, true, false);
                                    if (stringValue2.equals(S03)) {
                                        S03 = null;
                                    }
                                    for (int i13 = 0; i13 < i8; i13++) {
                                        String str6 = strArr[i13];
                                        if (!stringValue2.startsWith(str6)) {
                                            if (!stringValue2.contains(" " + str6)) {
                                                if (S03 != null) {
                                                    if (!S03.startsWith(str6)) {
                                                        if (!S03.contains(" " + str6)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize2 != null && !sd2.r0(TLdeserialize2) && (!sd2.T(TLdeserialize2) || TLdeserialize2.creator || (((tL_chatAdminRights = TLdeserialize2.admin_rights) != null && tL_chatAdminRights.post_messages) || TLdeserialize2.megagroup))) {
                                                ica icaVar3 = (ica) vh6Var.f(-TLdeserialize2.id);
                                                icaVar3.d = gm.r0(TLdeserialize2.title, null, str6);
                                                icaVar3.b = TLdeserialize2;
                                                icaVar3.a.id = -TLdeserialize2.id;
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                queryFinalized3.dispose();
                            }
                            ArrayList arrayList3 = new ArrayList(i2);
                            for (int i14 = 0; i14 < vh6Var.m(); i14++) {
                                ica icaVar4 = (ica) vh6Var.n(i14);
                                if (icaVar4.b != null && icaVar4.d != null) {
                                    arrayList3.add(icaVar4);
                                }
                            }
                            SQLiteCursor queryFinalized4 = cf7.Y(tcaVar.a).b.queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                            while (queryFinalized4.next()) {
                                if (vh6Var.h(queryFinalized4.longValue(3)) < 0) {
                                    String stringValue3 = queryFinalized4.stringValue(2);
                                    String S04 = jb6.D0().S0(stringValue3, true, false);
                                    String str7 = stringValue3.equals(S04) ? null : S04;
                                    String str8 = str;
                                    int lastIndexOf2 = stringValue3.lastIndexOf(str8);
                                    String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 3) : null;
                                    int i15 = 0;
                                    char c = 0;
                                    while (true) {
                                        if (i15 < i8) {
                                            String str9 = strArr[i15];
                                            if (!stringValue3.startsWith(str9)) {
                                                if (!stringValue3.contains(" " + str9)) {
                                                    if (str7 != null) {
                                                        if (!str7.startsWith(str9)) {
                                                            break;
                                                        }
                                                    }
                                                    if (substring2 != null && substring2.startsWith(str9)) {
                                                        c = 2;
                                                    }
                                                    if (c == 0) {
                                                        NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                                        if (byteBufferValue3 != null) {
                                                            TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                            byteBufferValue3.reuse();
                                                            ica icaVar5 = new ica();
                                                            TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                                            if (userStatus2 != null) {
                                                                userStatus2.expires = queryFinalized4.intValue(1);
                                                            }
                                                            i3 = i8;
                                                            icaVar5.a.id = TLdeserialize3.id;
                                                            icaVar5.b = TLdeserialize3;
                                                            if (c == 1) {
                                                                icaVar5.d = gm.r0(TLdeserialize3.first_name, TLdeserialize3.last_name, str9);
                                                            } else {
                                                                icaVar5.d = gm.r0("@" + m9c.p(TLdeserialize3), null, "@" + str9);
                                                            }
                                                            arrayList3.add(icaVar5);
                                                        }
                                                    } else {
                                                        i15++;
                                                    }
                                                }
                                            }
                                            c = 1;
                                            if (c == 0) {
                                            }
                                        }
                                    }
                                    i3 = i8;
                                    str = str8;
                                    i8 = i3;
                                }
                            }
                            queryFinalized4.dispose();
                            Collections.sort(arrayList3, new qx7((byte) 24));
                            gm.c3(new v99((Object) qcaVar, i, (Object) arrayList3, (byte) 4));
                            break;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                }
                break;
        }
    }

    public /* synthetic */ nca(qca qcaVar, String str, int i, byte b) {
        this.a = b;
        this.b = qcaVar;
        this.d = str;
        this.c = i;
    }
}
