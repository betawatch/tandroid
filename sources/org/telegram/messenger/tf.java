package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class tf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ tf(ui uiVar, boolean z9, int i7, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = z9;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                boolean[] zArr = uiVar.w0;
                boolean z9 = this.c;
                zArr[z9 ? 1 : 0] = false;
                uiVar.x0[z9 ? 1 : 0] = true;
                uiVar.q0[z9 ? 1 : 0] = this.d;
                break;
            case 1:
                this.b.q0[this.c ? 1 : 0] = this.d;
                break;
            default:
                ui uiVar2 = this.b;
                boolean z10 = this.c;
                int i10 = this.d;
                if (z10) {
                    i7 = 2;
                } else {
                    i7 = 3;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i7 = 4;
                        } else if (i10 == 3) {
                            i7 = 6;
                        } else {
                            i7 = 7;
                            if (i10 != 5) {
                                i7 = i10 == 7 ? 8 : 5;
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i7 + " ORDER BY date DESC", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    while (queryFinalized.next()) {
                        if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                            TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                arrayList.add(TLdeserialize);
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    g0.h3(new wf(uiVar2, z10, arrayList, i10));
                    break;
                } catch (Throwable th2) {
                    uiVar2.getMessagesStorage().o(th2, true);
                }
                break;
        }
    }
}
