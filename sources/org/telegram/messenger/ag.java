package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ MessagesStorage c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ag(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.c = messagesStorage;
        this.d = j3;
        this.b = i10;
        this.h = inputChannel;
        this.f = i11;
        this.e = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        int i10;
        SQLiteCursor queryFinalized;
        long j3;
        int i11 = this.a;
        Object obj = this.h;
        switch (i11) {
            case 0:
                this.c.lambda$loadPendingTasks$22(this.d, this.b, (TLRPC.InputChannel) obj, this.f, this.e);
                return;
            default:
                final org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) obj;
                long j10 = this.e;
                final ArrayList arrayList = new ArrayList();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
                int i12 = this.b;
                final MessagesStorage messagesStorage = this.c;
                final long j11 = this.d;
                if (i12 <= 0) {
                    try {
                        try {
                            i10 = i12;
                        } catch (Exception e) {
                            e = e;
                            i10 = i12;
                        }
                        try {
                            queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j11));
                        } catch (Exception e7) {
                            e = e7;
                            sQLiteCursor = null;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                final int i13 = this.f;
                                final int i14 = i10;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.g6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        h6.b(h6.this, i13, arrayList, j11, i14, messagesStorage);
                                    }
                                });
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = null;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                } else {
                    i10 = i12;
                    try {
                        queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j11), Integer.valueOf(i10));
                    } catch (Exception e10) {
                        e = e10;
                        sQLiteCursor = null;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                        }
                        final int i132 = this.f;
                        final int i142 = i10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.g6
                            @Override // java.lang.Runnable
                            public final void run() {
                                h6.b(h6.this, i132, arrayList, j11, i142, messagesStorage);
                            }
                        });
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = null;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                try {
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    ArrayList arrayList5 = new ArrayList();
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.readAttachPath(byteBufferValue, j10);
                            byteBufferValue.reuse();
                            TLdeserialize.id = queryFinalized.intValue(1);
                            j3 = j10;
                            TLdeserialize.dialog_id = -j11;
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                            arrayList.add(TLdeserialize);
                        } else {
                            j3 = j10;
                        }
                        j10 = j3;
                    }
                    queryFinalized.dispose();
                    if (!arrayList.isEmpty()) {
                        if (!arrayList4.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList4, arrayList2);
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = queryFinalized;
                    FileLog.e(e);
                    if (sQLiteCursor != null) {
                    }
                    final int i1322 = this.f;
                    final int i1422 = i10;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            h6.b(h6.this, i1322, arrayList, j11, i1422, messagesStorage);
                        }
                    });
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                final int i13222 = this.f;
                final int i14222 = i10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.g6
                    @Override // java.lang.Runnable
                    public final void run() {
                        h6.b(h6.this, i13222, arrayList, j11, i14222, messagesStorage);
                    }
                });
                return;
        }
    }

    public /* synthetic */ ag(org.telegram.ui.Cells.h6 h6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = h6Var;
        this.b = i10;
        this.c = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f = i11;
    }
}
