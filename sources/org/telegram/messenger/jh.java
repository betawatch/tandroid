package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ String c;

    public /* synthetic */ jh(ui uiVar, String str, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        int i12 = this.a;
        int i13 = 2;
        String str = this.c;
        ui uiVar = this.b;
        switch (i12) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    i0.g3(new jh(uiVar, str, i13));
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                uiVar.z1.remove(str);
                uiVar.A1.add(str);
                uiVar.getNotificationCenter().k(zs.l3, new Object[0]);
                break;
            case 2:
                uiVar.z1.remove(str);
                uiVar.A1.add(str);
                uiVar.M(new String[]{str}, false);
                uiVar.getNotificationCenter().k(zs.l3, new Object[0]);
                break;
            case 3:
                uiVar.z1.remove(str);
                uiVar.getNotificationCenter().k(zs.L2, str);
                break;
            case 4:
                uiVar.S.remove(str);
                break;
            default:
                ui uiVar2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
                    if (queryFinalized.next()) {
                        str3 = queryFinalized.stringValue(0);
                        i10 = queryFinalized.intValue(1);
                        try {
                            queryFinalized.longValue(2);
                        } catch (Exception e7) {
                            e = e7;
                            f8.g(e, true);
                            String str4 = str3;
                            i11 = i10;
                            boolean z10 = v2.a;
                            if (i11 != -1) {
                            }
                            uiVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new ah(uiVar2, i11, str4, str2, 0));
                        }
                    } else {
                        i10 = -1;
                    }
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    e = e10;
                    i10 = -1;
                }
                String str42 = str3;
                i11 = i10;
                boolean z102 = v2.a;
                if (i11 != -1) {
                    TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
                    tL_messages_getEmojiKeywords.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywords;
                } else {
                    TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
                    tL_messages_getEmojiKeywordsDifference2.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference2.from_version = i11;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywordsDifference2;
                }
                uiVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new ah(uiVar2, i11, str42, str2, 0));
        }
    }
}
