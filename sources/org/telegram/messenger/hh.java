package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ String c;

    public /* synthetic */ hh(ri riVar, String str, int i7) {
        this.a = i7;
        this.b = riVar;
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
        ri riVar = this.b;
        switch (i11) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    g0.g3(new hh(riVar, str, i12));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                riVar.C1.remove(str);
                riVar.D1.add(str);
                riVar.getNotificationCenter().k(ks.n3, new Object[0]);
                break;
            case 2:
                riVar.C1.remove(str);
                riVar.D1.add(str);
                riVar.O(new String[]{str}, false);
                riVar.getNotificationCenter().k(ks.n3, new Object[0]);
                break;
            case 3:
                riVar.C1.remove(str);
                riVar.getNotificationCenter().k(ks.L2, str);
                break;
            case 4:
                riVar.T.remove(str);
                break;
            default:
                ri riVar2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = riVar2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
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
                            boolean z10 = s2.a;
                            if (i10 != -1) {
                            }
                            riVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new dh(riVar2, i10, str4, str2, 0));
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
                boolean z102 = s2.a;
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
                riVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new dh(riVar2, i10, str42, str2, 0));
        }
    }
}
