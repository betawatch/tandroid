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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ fq0(iq0 iq0Var, int i10, String str) {
        this.a = 1;
        this.b = iq0Var;
        this.c = i10;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0430 A[Catch: Exception -> 0x0032, LOOP:7: B:178:0x037b->B:194:0x0430, LOOP_END, TryCatch #0 {Exception -> 0x0032, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0035, B:12:0x0043, B:17:0x0051, B:19:0x0058, B:20:0x005a, B:21:0x007d, B:23:0x0083, B:25:0x009b, B:27:0x00a5, B:31:0x00ad, B:33:0x00b3, B:35:0x00be, B:40:0x00c7, B:43:0x00da, B:44:0x010a, B:46:0x0110, B:49:0x0124, B:51:0x012f, B:54:0x013c, B:56:0x0146, B:59:0x015d, B:61:0x0163, B:65:0x017b, B:71:0x0189, B:73:0x0190, B:75:0x01aa, B:77:0x01b9, B:78:0x01ed, B:81:0x01c4, B:69:0x01fd, B:91:0x0217, B:92:0x022d, B:94:0x0233, B:95:0x0260, B:97:0x0266, B:102:0x027d, B:104:0x0285, B:107:0x029c, B:109:0x02a2, B:144:0x02b9, B:113:0x02bc, B:116:0x02c2, B:119:0x02cf, B:122:0x02d5, B:124:0x02db, B:126:0x02df, B:128:0x02e3, B:134:0x02e7, B:131:0x02eb, B:151:0x030a, B:152:0x030d, B:153:0x0315, B:155:0x031b, B:157:0x0325, B:159:0x0329, B:161:0x032c, B:165:0x032f, B:166:0x0344, B:168:0x034a, B:171:0x0356, B:174:0x036a, B:176:0x0371, B:179:0x037d, B:181:0x0385, B:184:0x039c, B:186:0x03a2, B:190:0x03ba, B:196:0x03c5, B:203:0x03cc, B:205:0x03e0, B:206:0x03e7, B:208:0x03f2, B:209:0x0427, B:211:0x03fe, B:194:0x0430, B:221:0x043d), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd A[Catch: Exception -> 0x0032, LOOP:2: B:53:0x013a->B:69:0x01fd, LOOP_END, TryCatch #0 {Exception -> 0x0032, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0035, B:12:0x0043, B:17:0x0051, B:19:0x0058, B:20:0x005a, B:21:0x007d, B:23:0x0083, B:25:0x009b, B:27:0x00a5, B:31:0x00ad, B:33:0x00b3, B:35:0x00be, B:40:0x00c7, B:43:0x00da, B:44:0x010a, B:46:0x0110, B:49:0x0124, B:51:0x012f, B:54:0x013c, B:56:0x0146, B:59:0x015d, B:61:0x0163, B:65:0x017b, B:71:0x0189, B:73:0x0190, B:75:0x01aa, B:77:0x01b9, B:78:0x01ed, B:81:0x01c4, B:69:0x01fd, B:91:0x0217, B:92:0x022d, B:94:0x0233, B:95:0x0260, B:97:0x0266, B:102:0x027d, B:104:0x0285, B:107:0x029c, B:109:0x02a2, B:144:0x02b9, B:113:0x02bc, B:116:0x02c2, B:119:0x02cf, B:122:0x02d5, B:124:0x02db, B:126:0x02df, B:128:0x02e3, B:134:0x02e7, B:131:0x02eb, B:151:0x030a, B:152:0x030d, B:153:0x0315, B:155:0x031b, B:157:0x0325, B:159:0x0329, B:161:0x032c, B:165:0x032f, B:166:0x0344, B:168:0x034a, B:171:0x0356, B:174:0x036a, B:176:0x0371, B:179:0x037d, B:181:0x0385, B:184:0x039c, B:186:0x03a2, B:190:0x03ba, B:196:0x03c5, B:203:0x03cc, B:205:0x03e0, B:206:0x03e7, B:208:0x03f2, B:209:0x0427, B:211:0x03fe, B:194:0x0430, B:221:0x043d), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        iq0 iq0Var;
        mq0 mq0Var;
        String[] strArr;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i16;
        int i17;
        iq0 iq0Var2;
        ?? r12;
        boolean z4;
        switch (this.a) {
            case 0:
                iq0 iq0Var3 = this.b;
                iq0Var3.f = null;
                i10 = ((org.telegram.ui.ActionBar.h3) iq0Var3.H).currentAccount;
                DispatchQueue storageQueue = MessagesStorage.getInstance(i10).getStorageQueue();
                String str = this.d;
                int i18 = this.c;
                storageQueue.postRunnable(new fq0(iq0Var3, str, i18, 2));
                fq0 fq0Var = new fq0(iq0Var3, i18, str);
                iq0Var3.h = fq0Var;
                AndroidUtilities.runOnUIThread(fq0Var);
                break;
            case 1:
                iq0 iq0Var4 = this.b;
                iq0Var4.h = null;
                int i19 = iq0Var4.r;
                int i20 = this.c;
                if (i20 == i19) {
                    iq0Var4.e.g(this.d, true, true, true, true, 0L, false, 0, i20);
                    break;
                }
                break;
            default:
                String str2 = this.d;
                int i21 = this.c;
                iq0 iq0Var5 = this.b;
                mq0 mq0Var2 = iq0Var5.H;
                try {
                    String lowerCase = str2.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        iq0Var5.r = -1;
                        AndroidUtilities.runOnUIThread(new gy(iq0Var5, iq0Var5.r, new ArrayList(), 7));
                        break;
                    } else {
                        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString) || translitString.length() == 0) {
                            translitString = null;
                        }
                        int i22 = (translitString != null ? 1 : 0) + 1;
                        String[] strArr2 = new String[i22];
                        strArr2[0] = lowerCase;
                        if (translitString != null) {
                            strArr2[1] = translitString;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        a0.h hVar = new a0.h();
                        i11 = ((org.telegram.ui.ActionBar.h3) mq0Var2).currentAccount;
                        SQLiteCursor queryFinalized = MessagesStorage.getInstance(i11).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            aq0 aq0Var = new aq0();
                            aq0Var.c = queryFinalized.intValue(1);
                            hVar.k(aq0Var, longValue);
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
                            i12 = i21;
                            iq0Var = iq0Var5;
                            mq0Var = mq0Var2;
                            strArr = strArr2;
                            i13 = 0;
                        } else {
                            i16 = ((org.telegram.ui.ActionBar.h3) mq0Var2).currentAccount;
                            SQLiteDatabase database = MessagesStorage.getInstance(i16).getDatabase();
                            Locale locale = Locale.US;
                            String join = TextUtils.join(",", arrayList);
                            StringBuilder sb = new StringBuilder();
                            mq0Var = mq0Var2;
                            sb.append("SELECT data, status, name FROM users WHERE uid IN(");
                            sb.append(join);
                            sb.append(")");
                            SQLiteCursor queryFinalized2 = database.queryFinalized(sb.toString(), new Object[0]);
                            int i23 = 0;
                            while (queryFinalized2.next()) {
                                String stringValue = queryFinalized2.stringValue(2);
                                String translitString2 = LocaleController.getInstance().getTranslitString(stringValue);
                                if (stringValue.equals(translitString2)) {
                                    translitString2 = null;
                                }
                                int i24 = i23;
                                int lastIndexOf = stringValue.lastIndexOf(";;;");
                                String[] strArr3 = strArr2;
                                String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                                int i25 = 0;
                                boolean z10 = false;
                                while (true) {
                                    if (i25 < i22) {
                                        int i26 = i25;
                                        String str3 = strArr3[i26];
                                        if (!stringValue.startsWith(str3)) {
                                            if (!stringValue.contains(" " + str3)) {
                                                if (translitString2 != null) {
                                                    if (!translitString2.startsWith(str3)) {
                                                        if (translitString2.contains(" " + str3)) {
                                                        }
                                                    }
                                                }
                                                r12 = (substring == null || !substring.startsWith(str3)) ? z10 : 2;
                                                if (r12 == 0) {
                                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                                    if (byteBufferValue != null) {
                                                        TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        byteBufferValue.reuse();
                                                        int i27 = i21;
                                                        iq0Var2 = iq0Var5;
                                                        aq0 aq0Var2 = (aq0) hVar.f(TLdeserialize.id);
                                                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                                                        if (userStatus != null) {
                                                            i17 = i27;
                                                            z4 = true;
                                                            userStatus.expires = queryFinalized2.intValue(1);
                                                        } else {
                                                            i17 = i27;
                                                            z4 = true;
                                                        }
                                                        if (r12 == z4) {
                                                            aq0Var2.d = AndroidUtilities.generateSearchName(TLdeserialize.first_name, TLdeserialize.last_name, str3);
                                                        } else {
                                                            aq0Var2.d = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(TLdeserialize), null, "@" + str3);
                                                        }
                                                        aq0Var2.b = TLdeserialize;
                                                        aq0Var2.a.id = TLdeserialize.id;
                                                        i23 = i24 + 1;
                                                    }
                                                } else {
                                                    i25 = i26 + 1;
                                                    z10 = r12;
                                                }
                                            }
                                        }
                                        r12 = 1;
                                        if (r12 == 0) {
                                        }
                                    }
                                }
                                i17 = i21;
                                iq0Var2 = iq0Var5;
                                i23 = i24;
                                strArr2 = strArr3;
                                iq0Var5 = iq0Var2;
                                i21 = i17;
                            }
                            i12 = i21;
                            iq0Var = iq0Var5;
                            i13 = i23;
                            strArr = strArr2;
                            queryFinalized2.dispose();
                        }
                        if (!arrayList2.isEmpty()) {
                            i15 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                            SQLiteDatabase database2 = MessagesStorage.getInstance(i15).getDatabase();
                            Locale locale2 = Locale.US;
                            SQLiteCursor queryFinalized3 = database2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                            while (queryFinalized3.next()) {
                                String stringValue2 = queryFinalized3.stringValue(1);
                                String translitString3 = LocaleController.getInstance().getTranslitString(stringValue2);
                                if (stringValue2.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                for (int i28 = 0; i28 < i22; i28++) {
                                    String str4 = strArr[i28];
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
                                            aq0 aq0Var3 = (aq0) hVar.f(-TLdeserialize2.id);
                                            aq0Var3.d = AndroidUtilities.generateSearchName(TLdeserialize2.title, null, str4);
                                            aq0Var3.b = TLdeserialize2;
                                            aq0Var3.a.id = -TLdeserialize2.id;
                                            i13++;
                                        }
                                    }
                                }
                            }
                            queryFinalized3.dispose();
                        }
                        ArrayList arrayList3 = new ArrayList(i13);
                        for (int i29 = 0; i29 < hVar.m(); i29++) {
                            aq0 aq0Var4 = (aq0) hVar.n(i29);
                            if (aq0Var4.b != null && aq0Var4.d != null) {
                                arrayList3.add(aq0Var4);
                            }
                        }
                        i14 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                        SQLiteCursor queryFinalized4 = MessagesStorage.getInstance(i14).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                        while (queryFinalized4.next()) {
                            if (hVar.h(queryFinalized4.longValue(3)) < 0) {
                                String stringValue3 = queryFinalized4.stringValue(2);
                                String translitString4 = LocaleController.getInstance().getTranslitString(stringValue3);
                                if (stringValue3.equals(translitString4)) {
                                    translitString4 = null;
                                }
                                int lastIndexOf2 = stringValue3.lastIndexOf(";;;");
                                String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 3) : null;
                                int i30 = 0;
                                char c3 = 0;
                                while (true) {
                                    if (i30 < i22) {
                                        String str5 = strArr[i30];
                                        if (!stringValue3.startsWith(str5)) {
                                            if (!stringValue3.contains(" " + str5)) {
                                                if (translitString4 != null) {
                                                    if (!translitString4.startsWith(str5)) {
                                                        if (translitString4.contains(" " + str5)) {
                                                        }
                                                    }
                                                }
                                                if (substring2 != null && substring2.startsWith(str5)) {
                                                    c3 = 2;
                                                }
                                                if (c3 == 0) {
                                                    NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                                    if (byteBufferValue3 != null) {
                                                        TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                        byteBufferValue3.reuse();
                                                        aq0 aq0Var5 = new aq0();
                                                        TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                                        if (userStatus2 != null) {
                                                            userStatus2.expires = queryFinalized4.intValue(1);
                                                        }
                                                        aq0Var5.a.id = TLdeserialize3.id;
                                                        aq0Var5.b = TLdeserialize3;
                                                        if (c3 == 1) {
                                                            aq0Var5.d = AndroidUtilities.generateSearchName(TLdeserialize3.first_name, TLdeserialize3.last_name, str5);
                                                        } else {
                                                            aq0Var5.d = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(TLdeserialize3), null, "@" + str5);
                                                        }
                                                        arrayList3.add(aq0Var5);
                                                    }
                                                } else {
                                                    i30++;
                                                }
                                            }
                                        }
                                        c3 = 1;
                                        if (c3 == 0) {
                                        }
                                    }
                                }
                            }
                        }
                        queryFinalized4.dispose();
                        Collections.sort(arrayList3, new oh.k0(27));
                        AndroidUtilities.runOnUIThread(new gy(iq0Var, i12, arrayList3, 7));
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }

    public /* synthetic */ fq0(iq0 iq0Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = iq0Var;
        this.d = str;
        this.c = i10;
    }
}
