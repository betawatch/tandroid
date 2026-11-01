package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ is b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ nq(int i10, int i11, long j10, long j11, is isVar, TLRPC.InputChannel inputChannel) {
        this.b = isVar;
        this.c = j10;
        this.e = i10;
        this.h = inputChannel;
        this.f = i11;
        this.d = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (r13 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        int i10;
        SQLiteCursor sQLiteCursor2;
        int i11;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        long j10;
        int i12 = this.a;
        Object obj = this.h;
        switch (i12) {
            case 0:
                this.b.getMessagesController().n3(-this.c, this.e, (TLRPC.InputChannel) obj, this.f, this.d, true);
                return;
            case 1:
                this.b.a2(this.c, this.d, (Integer) obj, this.e, this.f, 0, 0);
                return;
            default:
                final org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) obj;
                long j11 = this.d;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ?? r72 = 0;
                int i13 = this.e;
                final is isVar = this.b;
                final long j12 = this.c;
                try {
                    if (i13 <= 0) {
                        try {
                            i11 = 1;
                            i10 = i13;
                            sQLiteCursor3 = isVar.b.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j12));
                        } catch (Exception e) {
                            e = e;
                            z10 = true;
                            i10 = i13;
                            sQLiteCursor2 = null;
                            f8.g(e, z10);
                            sQLiteCursor4 = sQLiteCursor2;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = null;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    } else {
                        try {
                            try {
                                i10 = i13;
                                try {
                                    i11 = 1;
                                    try {
                                        sQLiteCursor3 = isVar.b.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j12), Integer.valueOf(i10));
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLiteCursor3 = 0;
                                        z10 = true;
                                        sQLiteCursor2 = sQLiteCursor3;
                                        f8.g(e, z10);
                                        sQLiteCursor4 = sQLiteCursor2;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = null;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i10 = i13;
                        }
                    }
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        while (sQLiteCursor3.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor3.byteBufferValue(r72);
                            if (byteBufferValue != 0) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                TLdeserialize.readAttachPath(byteBufferValue, j11);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor3.intValue(i11);
                                j10 = j11;
                                TLdeserialize.dialog_id = -j12;
                                is.e(TLdeserialize, arrayList4, arrayList5, null);
                                arrayList.add(TLdeserialize);
                            } else {
                                j10 = j11;
                            }
                            j11 = j10;
                            r72 = 0;
                            i11 = 1;
                        }
                        sQLiteCursor3.dispose();
                        sQLiteCursor4 = sQLiteCursor3;
                        if (!arrayList.isEmpty()) {
                            if (!arrayList4.isEmpty()) {
                                isVar.n0(arrayList4, arrayList2, false);
                            }
                            sQLiteCursor4 = sQLiteCursor3;
                            if (!arrayList5.isEmpty()) {
                                isVar.Q(TextUtils.join(",", arrayList5), arrayList3);
                                sQLiteCursor4 = sQLiteCursor3;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z10 = true;
                        sQLiteCursor2 = sQLiteCursor3;
                        f8.g(e, z10);
                        sQLiteCursor4 = sQLiteCursor2;
                    }
                    sQLiteCursor4.dispose();
                    final int i14 = this.f;
                    final int i15 = i10;
                    i0.g3(new Runnable() { // from class: org.telegram.ui.Cells.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            i6.b(i6.this, i14, arrayList, j12, i15, isVar);
                        }
                    });
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }

    public /* synthetic */ nq(is isVar, long j10, long j11, Integer num, int i10, int i11) {
        this.b = isVar;
        this.c = j10;
        this.d = j11;
        this.h = num;
        this.e = i10;
        this.f = i11;
    }

    public /* synthetic */ nq(org.telegram.ui.Cells.i6 i6Var, int i10, is isVar, long j10, long j11, int i11) {
        this.h = i6Var;
        this.e = i10;
        this.b = isVar;
        this.c = j10;
        this.d = j11;
        this.f = i11;
    }
}
