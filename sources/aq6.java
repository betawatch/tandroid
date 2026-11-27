// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class aq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ aq6(ls6 ls6Var, String str, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        byte b = this.a;
        String str = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6 ls6Var2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = ls6Var2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
                    if (queryFinalized.next()) {
                        str3 = queryFinalized.stringValue(0);
                        i = queryFinalized.intValue(1);
                        try {
                            queryFinalized.longValue(2);
                        } catch (Exception e) {
                            e = e;
                            cc4.g(e, true);
                            String str4 = str3;
                            i2 = i;
                            boolean z = f11.a;
                            if (i2 != -1) {
                            }
                            ls6Var2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new lh((Object) ls6Var2, i2, (Object) str4, (Object) str2, (byte) 5));
                            return;
                        }
                    } else {
                        i = -1;
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    i = -1;
                }
                String str42 = str3;
                i2 = i;
                boolean z2 = f11.a;
                if (i2 != -1) {
                    TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
                    tL_messages_getEmojiKeywords.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywords;
                } else {
                    TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
                    tL_messages_getEmojiKeywordsDifference2.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference2.from_version = i2;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywordsDifference2;
                }
                ls6Var2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new lh((Object) ls6Var2, i2, (Object) str42, (Object) str2, (byte) 5));
            case 1:
                try {
                    SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    hl.c3(new aq6(ls6Var, str, (byte) 3));
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 2:
                ls6Var.C1.remove(str);
                ls6Var.D1.add(str);
                ls6Var.getNotificationCenter().k(jn7.n3, new Object[0]);
                break;
            case 3:
                ls6Var.C1.remove(str);
                ls6Var.D1.add(str);
                ls6Var.O(new String[]{str}, false);
                ls6Var.getNotificationCenter().k(jn7.n3, new Object[0]);
                break;
            case 4:
                ls6Var.C1.remove(str);
                ls6Var.getNotificationCenter().k(jn7.L2, str);
                break;
            default:
                ls6Var.T.remove(str);
                break;
        }
    }
}
