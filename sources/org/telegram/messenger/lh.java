package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ String c;

    public /* synthetic */ lh(ui uiVar, String str, int i7) {
        this.a = i7;
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
        int i7;
        int i10;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        int i11 = this.a;
        int i12 = 2;
        String str = this.c;
        ui uiVar = this.b;
        switch (i11) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    g0.h3(new lh(uiVar, str, i12));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                uiVar.z1.remove(str);
                uiVar.A1.add(str);
                uiVar.getNotificationCenter().k(qs.l3, new Object[0]);
                break;
            case 2:
                uiVar.z1.remove(str);
                uiVar.A1.add(str);
                uiVar.M(new String[]{str}, false);
                uiVar.getNotificationCenter().k(qs.l3, new Object[0]);
                break;
            case 3:
                uiVar.z1.remove(str);
                uiVar.getNotificationCenter().k(qs.L2, str);
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
                        i7 = queryFinalized.intValue(1);
                        try {
                            queryFinalized.longValue(2);
                        } catch (Exception e11) {
                            e = e11;
                            a8.g(e, true);
                            String str4 = str3;
                            i10 = i7;
                            boolean z9 = r2.a;
                            if (i10 != -1) {
                            }
                            uiVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new bh(uiVar2, i10, str4, str2, 0));
                        }
                    } else {
                        i7 = -1;
                    }
                    queryFinalized.dispose();
                } catch (Exception e12) {
                    e = e12;
                    i7 = -1;
                }
                String str42 = str3;
                i10 = i7;
                boolean z92 = r2.a;
                if (i10 != -1) {
                    TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
                    tL_messages_getEmojiKeywords.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywords;
                } else {
                    TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
                    tL_messages_getEmojiKeywordsDifference2.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference2.from_version = i10;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywordsDifference2;
                }
                uiVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new bh(uiVar2, i10, str42, str2, 0));
        }
    }
}
