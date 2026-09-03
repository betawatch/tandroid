package nh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ MessagesStorage c;

    public /* synthetic */ j6(l6 l6Var, MessagesStorage messagesStorage, int i10) {
        this.a = i10;
        this.b = l6Var;
        this.c = messagesStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a7, code lost:
    
        if (r12 == null) goto L70;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l6 l6Var;
        long j10;
        long j11;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = this.c;
                l6 l6Var2 = this.b;
                long j12 = l6Var2.d;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet<Long> hashSet2 = new HashSet<>();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
                SQLiteCursor sQLiteCursor = null;
                try {
                    messagesStorage.getDatabase();
                    sQLiteCursor = messagesStorage.createLoadStoriesCursor(j12, l6Var2.f, l6Var2.e);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                            TLdeserialize.dialogId = j12;
                            TLdeserialize.messageId = TLdeserialize.id;
                            MessageObject messageObject = new MessageObject(l6Var2.c, TLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                            l6Var = l6Var2;
                            try {
                                int size = arrayList5.size();
                                j10 = j12;
                                int i10 = 0;
                                while (i10 < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i10);
                                    i10++;
                                    TLRPC.PrivacyRule privacyRule2 = privacyRule;
                                    ArrayList<TLRPC.PrivacyRule> arrayList6 = arrayList5;
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                                    }
                                    arrayList5 = arrayList6;
                                }
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader == null || (peer = storyFwdHeader.from) == null) {
                                    j11 = 0;
                                } else {
                                    j11 = 0;
                                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                                    if (peerDialogId >= 0) {
                                        hashSet2.add(Long.valueOf(peerDialogId));
                                    } else {
                                        hashSet3.add(Long.valueOf(-peerDialogId));
                                    }
                                }
                                for (int i11 = 0; i11 < TLdeserialize.media_areas.size(); i11++) {
                                    if (TLdeserialize.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i11)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                                    if (peerDialogId2 >= j11) {
                                        hashSet2.add(Long.valueOf(peerDialogId2));
                                    } else {
                                        hashSet3.add(Long.valueOf(-peerDialogId2));
                                    }
                                }
                                messageObject.generateThumbs(false);
                                arrayList2.add(messageObject);
                                byteBufferValue.reuse();
                                if (sQLiteCursor.intValue(1) == 1) {
                                    hashSet.add(Integer.valueOf(TLdeserialize.id));
                                }
                                int intValue = sQLiteCursor.intValue(2);
                                if (intValue > 0) {
                                    arrayList.add(Utilities.clamp(intValue, arrayList.size() - 1, 0), Integer.valueOf(TLdeserialize.id));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    break;
                                } catch (Throwable th3) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            l6Var = l6Var2;
                            j10 = j12;
                        }
                        l6Var2 = l6Var;
                        j12 = j10;
                    }
                    l6Var = l6Var2;
                    sQLiteCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        messagesStorage.getUsersInternal(hashSet2, arrayList3);
                    }
                    if (!hashSet3.isEmpty()) {
                        messagesStorage.getChatsInternal(TextUtils.join(",", hashSet3), arrayList4);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    l6Var = l6Var2;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new kh.e1(l6Var, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 8));
                return;
            default:
                l6 l6Var3 = this.b;
                MessagesStorage messagesStorage2 = this.c;
                try {
                    SQLiteDatabase database = messagesStorage2.getDatabase();
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + l6Var3.d + " AND type = " + l6Var3.e).stepThis().dispose();
                } catch (Throwable th5) {
                    messagesStorage2.checkSQLException(th5);
                }
                AndroidUtilities.runOnUIThread(new i6(l6Var3, 3));
                return;
        }
    }
}
