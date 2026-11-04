package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ch implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ String c;

    public /* synthetic */ ch(li liVar, String str, int i3) {
        this.a = i3;
        this.b = liVar;
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
        int i3;
        int i10;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        int i11 = this.a;
        int i12 = 2;
        String str = this.c;
        li liVar = this.b;
        switch (i11) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = liVar.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    g0.h3(new ch(liVar, str, i12));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                liVar.A1.remove(str);
                liVar.B1.add(str);
                liVar.getNotificationCenter().k(hs.l3, new Object[0]);
                break;
            case 2:
                liVar.A1.remove(str);
                liVar.B1.add(str);
                liVar.M(new String[]{str}, false);
                liVar.getNotificationCenter().k(hs.l3, new Object[0]);
                break;
            case 3:
                liVar.A1.remove(str);
                liVar.getNotificationCenter().k(hs.L2, str);
                break;
            case 4:
                liVar.T.remove(str);
                break;
            default:
                li liVar2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = liVar2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
                    if (queryFinalized.next()) {
                        str3 = queryFinalized.stringValue(0);
                        i3 = queryFinalized.intValue(1);
                        try {
                            queryFinalized.longValue(2);
                        } catch (Exception e11) {
                            e = e11;
                            a8.g(e, true);
                            String str4 = str3;
                            i10 = i3;
                            boolean z10 = r2.a;
                            if (i10 != -1) {
                            }
                            liVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new tg(liVar2, i10, str4, str2, 0));
                        }
                    } else {
                        i3 = -1;
                    }
                    queryFinalized.dispose();
                } catch (Exception e12) {
                    e = e12;
                    i3 = -1;
                }
                String str42 = str3;
                i10 = i3;
                boolean z102 = r2.a;
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
                liVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new tg(liVar2, i10, str42, str2, 0));
        }
    }
}
