package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xp implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ xp(int i3, int i10, long j10, long j11, qr qrVar, TLRPC.InputChannel inputChannel) {
        this.b = qrVar;
        this.c = j10;
        this.e = i3;
        this.h = inputChannel;
        this.f = i10;
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
        int i3;
        SQLiteCursor sQLiteCursor2;
        int i10;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        long j10;
        int i11 = this.a;
        Object obj = this.h;
        switch (i11) {
            case 0:
                this.b.getMessagesController().q3(-this.c, this.e, (TLRPC.InputChannel) obj, this.f, this.d, true);
                return;
            case 1:
                this.b.a2(this.c, this.d, (Integer) obj, this.e, this.f, 0, 0);
                return;
            default:
                final org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) obj;
                long j11 = this.d;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ?? r72 = 0;
                int i12 = this.e;
                final qr qrVar = this.b;
                final long j12 = this.c;
                try {
                    if (i12 <= 0) {
                        try {
                            i10 = 1;
                            i3 = i12;
                            sQLiteCursor3 = qrVar.b.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j12));
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            i3 = i12;
                            sQLiteCursor2 = null;
                            a8.g(e, z10);
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
                                i3 = i12;
                                try {
                                    i10 = 1;
                                    try {
                                        sQLiteCursor3 = qrVar.b.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j12), Integer.valueOf(i3));
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor3 = 0;
                                        z10 = true;
                                        sQLiteCursor2 = sQLiteCursor3;
                                        a8.g(e, z10);
                                        sQLiteCursor4 = sQLiteCursor2;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = null;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            i3 = i12;
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
                                TLdeserialize.id = sQLiteCursor3.intValue(i10);
                                j10 = j11;
                                TLdeserialize.dialog_id = -j12;
                                qr.e(TLdeserialize, arrayList4, arrayList5, null);
                                arrayList.add(TLdeserialize);
                            } else {
                                j10 = j11;
                            }
                            j11 = j10;
                            r72 = 0;
                            i10 = 1;
                        }
                        sQLiteCursor3.dispose();
                        sQLiteCursor4 = sQLiteCursor3;
                        if (!arrayList.isEmpty()) {
                            if (!arrayList4.isEmpty()) {
                                qrVar.n0(arrayList4, arrayList2, false);
                            }
                            sQLiteCursor4 = sQLiteCursor3;
                            if (!arrayList5.isEmpty()) {
                                qrVar.Q(TextUtils.join(",", arrayList5), arrayList3);
                                sQLiteCursor4 = sQLiteCursor3;
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        z10 = true;
                        sQLiteCursor2 = sQLiteCursor3;
                        a8.g(e, z10);
                        sQLiteCursor4 = sQLiteCursor2;
                    }
                    sQLiteCursor4.dispose();
                    final int i13 = this.f;
                    final int i14 = i3;
                    g0.h3(new Runnable() { // from class: org.telegram.ui.Cells.b6
                        @Override // java.lang.Runnable
                        public final void run() {
                            d6.b(d6.this, i13, arrayList, j12, i14, qrVar);
                        }
                    });
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }

    public /* synthetic */ xp(qr qrVar, long j10, long j11, Integer num, int i3, int i10) {
        this.b = qrVar;
        this.c = j10;
        this.d = j11;
        this.h = num;
        this.e = i3;
        this.f = i10;
    }

    public /* synthetic */ xp(org.telegram.ui.Cells.d6 d6Var, int i3, qr qrVar, long j10, long j11, int i10) {
        this.h = d6Var;
        this.e = i3;
        this.b = qrVar;
        this.c = j10;
        this.d = j11;
        this.f = i10;
    }
}
