package org.telegram.ui.Wallet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n0(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, yh.s3 s3Var) {
        this.e = s3Var;
        this.b = callback;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j3;
        this.d = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6 A[Catch: all -> 0x00c6, TryCatch #4 {all -> 0x00c6, blocks: (B:31:0x0085, B:32:0x009b, B:47:0x00c5, B:51:0x00df, B:53:0x00e6, B:80:0x00d2, B:83:0x00d5, B:84:0x00de), top: B:7:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100 A[LOOP:1: B:57:0x00fa->B:59:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e A[LOOP:2: B:67:0x0128->B:69:0x012e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, org.telegram.ui.Wallet.p0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.ui.Wallet.h0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.telegram.ui.Wallet.h0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Iterator it;
        String message;
        Iterator it2;
        dz0 r10;
        switch (this.a) {
            case 0:
                ?? r12 = (p0) this.e;
                String str = (String) this.f;
                h0 h0Var = (h0) this.h;
                long j3 = this.c;
                long j10 = this.d;
                Utilities.Callback callback = this.b;
                ?? r102 = j10;
                ArrayList arrayList = new ArrayList();
                ?? linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        try {
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            message = !(e instanceof o0) ? e.getMessage() : "STORAGE_BROKEN";
                            if (linkedHashMap != 0) {
                                linkedHashMap.close();
                            }
                            it2 = r102.values().iterator();
                            while (it2.hasNext()) {
                                ((h0) it2.next()).close();
                            }
                            r12.e(arrayList);
                            AndroidUtilities.runOnUIThread(new o31((Object) r12, callback, j3, message, 7));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (linkedHashMap != 0) {
                            linkedHashMap.close();
                        }
                        it = r102.values().iterator();
                        while (it.hasNext()) {
                            ((h0) it.next()).close();
                        }
                        r12.e(arrayList);
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    r102 = linkedHashMap;
                } catch (Throwable th3) {
                    th = th3;
                    r102 = linkedHashMap;
                }
                if (str.isEmpty() || h0Var == null || h0Var.e()) {
                    throw new o0("INVALID_ARGUMENT");
                }
                Object obj = p0.f;
                synchronized (obj) {
                    try {
                        r12.c(j3);
                        r10 = r12.r();
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                }
                if (!((LinkedHashMap) r10.e).isEmpty() && r10.a != r102) {
                    throw new o0("USER_MISMATCH");
                }
                r10.a = r102;
                r12.s(r10, str, linkedHashMap, arrayList, j3);
                r102 = linkedHashMap;
                try {
                    ((LinkedHashMap) r10.e).put(str, r12.j(r10, str, h0Var, arrayList, j3));
                    r102.put(str, h0Var);
                    r10.b = ConnectionsManager.getInstance(r12.b).getCurrentTime();
                    synchronized (obj) {
                        r12.c(j3);
                        r12.v(r10, r102);
                        r12.d(r10);
                    }
                    h0Var.close();
                    Iterator it3 = r102.values().iterator();
                    while (it3.hasNext()) {
                        ((h0) it3.next()).close();
                    }
                    message = null;
                } catch (Exception e11) {
                    e = e11;
                    linkedHashMap = h0Var;
                    FileLog.e(e);
                    if (!(e instanceof o0)) {
                    }
                    if (linkedHashMap != 0) {
                    }
                    it2 = r102.values().iterator();
                    while (it2.hasNext()) {
                    }
                    r12.e(arrayList);
                    AndroidUtilities.runOnUIThread(new o31((Object) r12, callback, j3, message, 7));
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    linkedHashMap = h0Var;
                    if (linkedHashMap != 0) {
                    }
                    it = r102.values().iterator();
                    while (it.hasNext()) {
                    }
                    r12.e(arrayList);
                    throw th;
                }
                r12.e(arrayList);
                AndroidUtilities.runOnUIThread(new o31((Object) r12, callback, j3, message, 7));
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.e;
                yh.s3.T(this.c, this.d, this.b, (TLObject) this.h, (TLRPC.TL_error) this.f, s3Var);
                return;
        }
    }

    public /* synthetic */ n0(p0 p0Var, String str, h0 h0Var, long j3, long j10, Utilities.Callback callback) {
        this.e = p0Var;
        this.f = str;
        this.h = h0Var;
        this.c = j3;
        this.d = j10;
        this.b = callback;
    }
}
