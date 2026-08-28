package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ kp0(np0 np0Var, int i9, String str) {
        this.a = 1;
        this.b = np0Var;
        this.c = i9;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0431 A[Catch: Exception -> 0x0033, LOOP:7: B:178:0x037c->B:194:0x0431, LOOP_END, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0036, B:12:0x0044, B:17:0x0052, B:19:0x0059, B:20:0x005b, B:21:0x007e, B:23:0x0084, B:25:0x009c, B:27:0x00a6, B:31:0x00ae, B:33:0x00b4, B:35:0x00bf, B:40:0x00c8, B:43:0x00db, B:44:0x010b, B:46:0x0111, B:49:0x0125, B:51:0x0130, B:54:0x013d, B:56:0x0147, B:59:0x015e, B:61:0x0164, B:65:0x017c, B:71:0x018a, B:73:0x0191, B:75:0x01ab, B:77:0x01ba, B:78:0x01ee, B:81:0x01c5, B:69:0x01fe, B:91:0x0218, B:92:0x022e, B:94:0x0234, B:95:0x0261, B:97:0x0267, B:102:0x027e, B:104:0x0286, B:107:0x029d, B:109:0x02a3, B:144:0x02ba, B:113:0x02bd, B:116:0x02c3, B:119:0x02d0, B:122:0x02d6, B:124:0x02dc, B:126:0x02e0, B:128:0x02e4, B:134:0x02e8, B:131:0x02ec, B:151:0x030b, B:152:0x030e, B:153:0x0316, B:155:0x031c, B:157:0x0326, B:159:0x032a, B:161:0x032d, B:165:0x0330, B:166:0x0345, B:168:0x034b, B:171:0x0357, B:174:0x036b, B:176:0x0372, B:179:0x037e, B:181:0x0386, B:184:0x039d, B:186:0x03a3, B:190:0x03bb, B:196:0x03c6, B:203:0x03cd, B:205:0x03e1, B:206:0x03e8, B:208:0x03f3, B:209:0x0428, B:211:0x03ff, B:194:0x0431, B:221:0x043e), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fe A[Catch: Exception -> 0x0033, LOOP:2: B:53:0x013b->B:69:0x01fe, LOOP_END, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0036, B:12:0x0044, B:17:0x0052, B:19:0x0059, B:20:0x005b, B:21:0x007e, B:23:0x0084, B:25:0x009c, B:27:0x00a6, B:31:0x00ae, B:33:0x00b4, B:35:0x00bf, B:40:0x00c8, B:43:0x00db, B:44:0x010b, B:46:0x0111, B:49:0x0125, B:51:0x0130, B:54:0x013d, B:56:0x0147, B:59:0x015e, B:61:0x0164, B:65:0x017c, B:71:0x018a, B:73:0x0191, B:75:0x01ab, B:77:0x01ba, B:78:0x01ee, B:81:0x01c5, B:69:0x01fe, B:91:0x0218, B:92:0x022e, B:94:0x0234, B:95:0x0261, B:97:0x0267, B:102:0x027e, B:104:0x0286, B:107:0x029d, B:109:0x02a3, B:144:0x02ba, B:113:0x02bd, B:116:0x02c3, B:119:0x02d0, B:122:0x02d6, B:124:0x02dc, B:126:0x02e0, B:128:0x02e4, B:134:0x02e8, B:131:0x02ec, B:151:0x030b, B:152:0x030e, B:153:0x0316, B:155:0x031c, B:157:0x0326, B:159:0x032a, B:161:0x032d, B:165:0x0330, B:166:0x0345, B:168:0x034b, B:171:0x0357, B:174:0x036b, B:176:0x0372, B:179:0x037e, B:181:0x0386, B:184:0x039d, B:186:0x03a3, B:190:0x03bb, B:196:0x03c6, B:203:0x03cd, B:205:0x03e1, B:206:0x03e8, B:208:0x03f3, B:209:0x0428, B:211:0x03ff, B:194:0x0431, B:221:0x043e), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        int i10;
        int i11;
        np0 np0Var;
        rp0 rp0Var;
        String[] strArr;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i15;
        int i16;
        np0 np0Var2;
        ?? r12;
        boolean z10;
        switch (this.a) {
            case 0:
                np0 np0Var3 = this.b;
                np0Var3.f = null;
                i9 = ((org.telegram.ui.ActionBar.f3) np0Var3.G).currentAccount;
                DispatchQueue storageQueue = MessagesStorage.getInstance(i9).getStorageQueue();
                String str = this.d;
                int i17 = this.c;
                storageQueue.postRunnable(new kp0(np0Var3, str, i17, 2));
                kp0 kp0Var = new kp0(np0Var3, i17, str);
                np0Var3.h = kp0Var;
                AndroidUtilities.runOnUIThread(kp0Var);
                break;
            case 1:
                np0 np0Var4 = this.b;
                np0Var4.h = null;
                int i18 = np0Var4.r;
                int i19 = this.c;
                if (i19 == i18) {
                    np0Var4.e.g(this.d, true, true, true, true, 0L, false, 0, i19);
                    break;
                }
                break;
            default:
                String str2 = this.d;
                int i20 = this.c;
                np0 np0Var5 = this.b;
                rp0 rp0Var2 = np0Var5.G;
                try {
                    String lowerCase = str2.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        np0Var5.r = -1;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(np0Var5, np0Var5.r, new ArrayList(), 10));
                        break;
                    } else {
                        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString) || translitString.length() == 0) {
                            translitString = null;
                        }
                        int i21 = (translitString != null ? 1 : 0) + 1;
                        String[] strArr2 = new String[i21];
                        strArr2[0] = lowerCase;
                        if (translitString != null) {
                            strArr2[1] = translitString;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        a0.h hVar = new a0.h();
                        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var2).currentAccount;
                        SQLiteCursor queryFinalized = MessagesStorage.getInstance(i10).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            fp0 fp0Var = new fp0();
                            fp0Var.c = queryFinalized.intValue(1);
                            hVar.k(fp0Var, longValue);
                            if (DialogObject.isUserDialog(longValue)) {
                                if (!arrayList.contains(Long.valueOf(longValue))) {
                                    arrayList.add(Long.valueOf(longValue));
                                }
                            } else if (DialogObject.isChatDialog(longValue)) {
                                long j10 = -longValue;
                                if (!arrayList2.contains(Long.valueOf(j10))) {
                                    arrayList2.add(Long.valueOf(j10));
                                }
                            }
                        }
                        queryFinalized.dispose();
                        if (arrayList.isEmpty()) {
                            i11 = i20;
                            np0Var = np0Var5;
                            rp0Var = rp0Var2;
                            strArr = strArr2;
                            i12 = 0;
                        } else {
                            i15 = ((org.telegram.ui.ActionBar.f3) rp0Var2).currentAccount;
                            SQLiteDatabase database = MessagesStorage.getInstance(i15).getDatabase();
                            Locale locale = Locale.US;
                            String join = TextUtils.join(",", arrayList);
                            StringBuilder sb2 = new StringBuilder();
                            rp0Var = rp0Var2;
                            sb2.append("SELECT data, status, name FROM users WHERE uid IN(");
                            sb2.append(join);
                            sb2.append(")");
                            SQLiteCursor queryFinalized2 = database.queryFinalized(sb2.toString(), new Object[0]);
                            int i22 = 0;
                            while (queryFinalized2.next()) {
                                String stringValue = queryFinalized2.stringValue(2);
                                String translitString2 = LocaleController.getInstance().getTranslitString(stringValue);
                                if (stringValue.equals(translitString2)) {
                                    translitString2 = null;
                                }
                                int i23 = i22;
                                int lastIndexOf = stringValue.lastIndexOf(";;;");
                                String[] strArr3 = strArr2;
                                String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                                int i24 = 0;
                                boolean z11 = false;
                                while (true) {
                                    if (i24 < i21) {
                                        int i25 = i24;
                                        String str3 = strArr3[i25];
                                        if (!stringValue.startsWith(str3)) {
                                            if (!stringValue.contains(" " + str3)) {
                                                if (translitString2 != null) {
                                                    if (!translitString2.startsWith(str3)) {
                                                        if (translitString2.contains(" " + str3)) {
                                                        }
                                                    }
                                                }
                                                r12 = (substring == null || !substring.startsWith(str3)) ? z11 : 2;
                                                if (r12 == 0) {
                                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                                    if (byteBufferValue != null) {
                                                        TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        byteBufferValue.reuse();
                                                        int i26 = i20;
                                                        np0Var2 = np0Var5;
                                                        fp0 fp0Var2 = (fp0) hVar.f(TLdeserialize.id);
                                                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                                                        if (userStatus != null) {
                                                            i16 = i26;
                                                            z10 = true;
                                                            userStatus.expires = queryFinalized2.intValue(1);
                                                        } else {
                                                            i16 = i26;
                                                            z10 = true;
                                                        }
                                                        if (r12 == z10) {
                                                            fp0Var2.d = AndroidUtilities.generateSearchName(TLdeserialize.first_name, TLdeserialize.last_name, str3);
                                                        } else {
                                                            fp0Var2.d = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(TLdeserialize), null, "@" + str3);
                                                        }
                                                        fp0Var2.b = TLdeserialize;
                                                        fp0Var2.a.id = TLdeserialize.id;
                                                        i22 = i23 + 1;
                                                    }
                                                } else {
                                                    i24 = i25 + 1;
                                                    z11 = r12;
                                                }
                                            }
                                        }
                                        r12 = 1;
                                        if (r12 == 0) {
                                        }
                                    }
                                }
                                i16 = i20;
                                np0Var2 = np0Var5;
                                i22 = i23;
                                strArr2 = strArr3;
                                np0Var5 = np0Var2;
                                i20 = i16;
                            }
                            i11 = i20;
                            np0Var = np0Var5;
                            i12 = i22;
                            strArr = strArr2;
                            queryFinalized2.dispose();
                        }
                        if (!arrayList2.isEmpty()) {
                            i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                            SQLiteDatabase database2 = MessagesStorage.getInstance(i14).getDatabase();
                            Locale locale2 = Locale.US;
                            SQLiteCursor queryFinalized3 = database2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                            while (queryFinalized3.next()) {
                                String stringValue2 = queryFinalized3.stringValue(1);
                                String translitString3 = LocaleController.getInstance().getTranslitString(stringValue2);
                                if (stringValue2.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                for (int i27 = 0; i27 < i21; i27++) {
                                    String str4 = strArr[i27];
                                    if (!stringValue2.startsWith(str4)) {
                                        if (!stringValue2.contains(" " + str4)) {
                                            if (translitString3 != null) {
                                                if (!translitString3.startsWith(str4)) {
                                                    if (translitString3.contains(" " + str4)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                    if (byteBufferValue2 != null) {
                                        TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                        byteBufferValue2.reuse();
                                        if (TLdeserialize2 != null && !ChatObject.isNotInChat(TLdeserialize2) && (!ChatObject.isChannel(TLdeserialize2) || TLdeserialize2.creator || (((tL_chatAdminRights = TLdeserialize2.admin_rights) != null && tL_chatAdminRights.post_messages) || TLdeserialize2.megagroup))) {
                                            fp0 fp0Var3 = (fp0) hVar.f(-TLdeserialize2.id);
                                            fp0Var3.d = AndroidUtilities.generateSearchName(TLdeserialize2.title, null, str4);
                                            fp0Var3.b = TLdeserialize2;
                                            fp0Var3.a.id = -TLdeserialize2.id;
                                            i12++;
                                        }
                                    }
                                }
                            }
                            queryFinalized3.dispose();
                        }
                        ArrayList arrayList3 = new ArrayList(i12);
                        for (int i28 = 0; i28 < hVar.m(); i28++) {
                            fp0 fp0Var4 = (fp0) hVar.n(i28);
                            if (fp0Var4.b != null && fp0Var4.d != null) {
                                arrayList3.add(fp0Var4);
                            }
                        }
                        i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                        SQLiteCursor queryFinalized4 = MessagesStorage.getInstance(i13).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                        while (queryFinalized4.next()) {
                            if (hVar.h(queryFinalized4.longValue(3)) < 0) {
                                String stringValue3 = queryFinalized4.stringValue(2);
                                String translitString4 = LocaleController.getInstance().getTranslitString(stringValue3);
                                if (stringValue3.equals(translitString4)) {
                                    translitString4 = null;
                                }
                                int lastIndexOf2 = stringValue3.lastIndexOf(";;;");
                                String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 3) : null;
                                int i29 = 0;
                                char c10 = 0;
                                while (true) {
                                    if (i29 < i21) {
                                        String str5 = strArr[i29];
                                        if (!stringValue3.startsWith(str5)) {
                                            if (!stringValue3.contains(" " + str5)) {
                                                if (translitString4 != null) {
                                                    if (!translitString4.startsWith(str5)) {
                                                        if (translitString4.contains(" " + str5)) {
                                                        }
                                                    }
                                                }
                                                if (substring2 != null && substring2.startsWith(str5)) {
                                                    c10 = 2;
                                                }
                                                if (c10 == 0) {
                                                    NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                                    if (byteBufferValue3 != null) {
                                                        TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                        byteBufferValue3.reuse();
                                                        fp0 fp0Var5 = new fp0();
                                                        TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                                        if (userStatus2 != null) {
                                                            userStatus2.expires = queryFinalized4.intValue(1);
                                                        }
                                                        fp0Var5.a.id = TLdeserialize3.id;
                                                        fp0Var5.b = TLdeserialize3;
                                                        if (c10 == 1) {
                                                            fp0Var5.d = AndroidUtilities.generateSearchName(TLdeserialize3.first_name, TLdeserialize3.last_name, str5);
                                                        } else {
                                                            fp0Var5.d = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(TLdeserialize3), null, "@" + str5);
                                                        }
                                                        arrayList3.add(fp0Var5);
                                                    }
                                                } else {
                                                    i29++;
                                                }
                                            }
                                        }
                                        c10 = 1;
                                        if (c10 == 0) {
                                        }
                                    }
                                }
                            }
                        }
                        queryFinalized4.dispose();
                        Collections.sort(arrayList3, new jn0(2));
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(np0Var, i11, arrayList3, 10));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }

    public /* synthetic */ kp0(np0 np0Var, String str, int i9, int i10) {
        this.a = i10;
        this.b = np0Var;
        this.d = str;
        this.c = i9;
    }
}
