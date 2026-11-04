package ei;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;
    public final /* synthetic */ qr c;

    public /* synthetic */ p6(r6 r6Var, qr qrVar, int i3) {
        this.a = i3;
        this.b = r6Var;
        this.c = qrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        if (r13 == null) goto L70;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r6 r6Var;
        long j10;
        long j11;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                qr qrVar = this.c;
                r6 r6Var2 = this.b;
                long j12 = r6Var2.d;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                boolean z10 = true;
                SQLiteCursor sQLiteCursor = null;
                try {
                    sQLiteCursor = qrVar.x(r6Var2.f, r6Var2.e, j12);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z10), z10);
                            TLdeserialize.dialogId = j12;
                            TLdeserialize.messageId = TLdeserialize.id;
                            zi ziVar = new zi(r6Var2.c, TLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                            r6Var = r6Var2;
                            try {
                                int size = arrayList5.size();
                                j10 = j12;
                                int i3 = 0;
                                while (i3 < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i3);
                                    i3++;
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
                                    long o10 = org.telegram.messenger.m5.o(peer);
                                    if (o10 >= 0) {
                                        hashSet2.add(Long.valueOf(o10));
                                    } else {
                                        hashSet3.add(Long.valueOf(-o10));
                                    }
                                }
                                for (int i10 = 0; i10 < TLdeserialize.media_areas.size(); i10++) {
                                    if (TLdeserialize.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i10)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    long o11 = org.telegram.messenger.m5.o(peer2);
                                    if (o11 >= j11) {
                                        hashSet2.add(Long.valueOf(o11));
                                    } else {
                                        hashSet3.add(Long.valueOf(-o11));
                                    }
                                }
                                ziVar.r0(false);
                                arrayList2.add(ziVar);
                                byteBufferValue.reuse();
                                if (sQLiteCursor.intValue(1) == 1) {
                                    hashSet.add(Integer.valueOf(TLdeserialize.id));
                                }
                                int intValue = sQLiteCursor.intValue(2);
                                if (intValue > 0) {
                                    arrayList.add(Utilities.j(intValue, arrayList.size() - 1, 0), Integer.valueOf(TLdeserialize.id));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    qrVar.o(th, true);
                                    break;
                                } catch (Throwable th3) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            r6Var = r6Var2;
                            j10 = j12;
                        }
                        r6Var2 = r6Var;
                        j12 = j10;
                        z10 = true;
                    }
                    r6Var = r6Var2;
                    sQLiteCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        qrVar.o0(arrayList3, hashSet2);
                    }
                    if (!hashSet3.isEmpty()) {
                        qrVar.Q(TextUtils.join(",", hashSet3), arrayList4);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r6Var = r6Var2;
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.g0.h3(new ai.w1(r6Var, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 8));
                return;
            default:
                r6 r6Var3 = this.b;
                qr qrVar2 = this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar2.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + r6Var3.d + " AND type = " + r6Var3.e).stepThis().dispose();
                } catch (Throwable th5) {
                    qrVar2.o(th5, true);
                }
                org.telegram.messenger.g0.h3(new o6(r6Var3, 3));
                return;
        }
    }
}
