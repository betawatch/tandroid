package fi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.ur;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;
    public final /* synthetic */ ur c;

    public /* synthetic */ f6(h6 h6Var, ur urVar, int i7) {
        this.a = i7;
        this.b = h6Var;
        this.c = urVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        if (r13 == null) goto L70;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        h6 h6Var;
        long j3;
        long j10;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                ur urVar = this.c;
                h6 h6Var2 = this.b;
                long j11 = h6Var2.d;
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
                    sQLiteCursor = urVar.x(h6Var2.f, h6Var2.e, j11);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z10), z10);
                            TLdeserialize.dialogId = j11;
                            TLdeserialize.messageId = TLdeserialize.id;
                            gj gjVar = new gj(h6Var2.c, TLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                            h6Var = h6Var2;
                            try {
                                int size = arrayList5.size();
                                j3 = j11;
                                int i7 = 0;
                                while (i7 < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i7);
                                    i7++;
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
                                    j10 = 0;
                                } else {
                                    j10 = 0;
                                    long o4 = org.telegram.messenger.n5.o(peer);
                                    if (o4 >= 0) {
                                        hashSet2.add(Long.valueOf(o4));
                                    } else {
                                        hashSet3.add(Long.valueOf(-o4));
                                    }
                                }
                                for (int i10 = 0; i10 < TLdeserialize.media_areas.size(); i10++) {
                                    if (TLdeserialize.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i10)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    long o10 = org.telegram.messenger.n5.o(peer2);
                                    if (o10 >= j10) {
                                        hashSet2.add(Long.valueOf(o10));
                                    } else {
                                        hashSet3.add(Long.valueOf(-o10));
                                    }
                                }
                                gjVar.r0(false);
                                arrayList2.add(gjVar);
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
                                    urVar.o(th, true);
                                    break;
                                } catch (Throwable th3) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            h6Var = h6Var2;
                            j3 = j11;
                        }
                        h6Var2 = h6Var;
                        j11 = j3;
                        z10 = true;
                    }
                    h6Var = h6Var2;
                    sQLiteCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        urVar.o0(arrayList3, hashSet2);
                    }
                    if (!hashSet3.isEmpty()) {
                        urVar.Q(TextUtils.join(",", hashSet3), arrayList4);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    h6Var = h6Var2;
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.g0.g3(new bi.l2(h6Var, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 8));
                return;
            default:
                h6 h6Var3 = this.b;
                ur urVar2 = this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = urVar2.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + h6Var3.d + " AND type = " + h6Var3.e).stepThis().dispose();
                } catch (Throwable th5) {
                    urVar2.o(th5, true);
                }
                org.telegram.messenger.g0.g3(new e6(h6Var3, 3));
                return;
        }
    }
}
