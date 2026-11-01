package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ String c;

    public /* synthetic */ kh(vi viVar, String str, int i10) {
        this.a = i10;
        this.b = viVar;
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
        vi viVar = this.b;
        switch (i12) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = viVar.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    i0.g3(new kh(viVar, str, i13));
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                viVar.z1.remove(str);
                viVar.A1.add(str);
                viVar.getNotificationCenter().k(at.l3, new Object[0]);
                break;
            case 2:
                viVar.z1.remove(str);
                viVar.A1.add(str);
                viVar.M(new String[]{str}, false);
                viVar.getNotificationCenter().k(at.l3, new Object[0]);
                break;
            case 3:
                viVar.z1.remove(str);
                viVar.getNotificationCenter().k(at.L2, str);
                break;
            case 4:
                viVar.S.remove(str);
                break;
            default:
                vi viVar2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = viVar2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
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
                            viVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new bh(viVar2, i11, str4, str2, 0));
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
                viVar2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new bh(viVar2, i11, str42, str2, 0));
        }
    }
}
