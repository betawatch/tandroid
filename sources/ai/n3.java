package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n3(long j10, long j11, l7 l7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.e = l7Var;
        this.d = callback;
        this.f = tL_error;
        this.h = tLObject;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:29:0x006c, B:30:0x0082, B:45:0x00ac, B:49:0x00c6, B:51:0x00cd, B:78:0x00b9, B:81:0x00bc, B:82:0x00c5), top: B:4:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7 A[LOOP:1: B:55:0x00e1->B:57:0x00e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114 A[LOOP:2: B:65:0x010e->B:67:0x0114, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.ui.Wallet.q0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.ui.Wallet.j0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.telegram.ui.Wallet.j0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Iterator it;
        String message;
        Iterator it2;
        wy0 r10;
        switch (this.a) {
            case 0:
                l7.z0(this.b, this.c, (l7) this.e, this.d, (TLObject) this.h, (TLRPC.TL_error) this.f);
                return;
            default:
                ?? r12 = (org.telegram.ui.Wallet.q0) this.e;
                String str = (String) this.f;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.h;
                long j10 = this.b;
                long j11 = this.c;
                Utilities.Callback callback = this.d;
                ?? r102 = j11;
                ArrayList arrayList = new ArrayList();
                ?? linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            message = !(e instanceof org.telegram.ui.Wallet.p0) ? e.getMessage() : "STORAGE_BROKEN";
                            if (linkedHashMap != 0) {
                                linkedHashMap.close();
                            }
                            it2 = r102.values().iterator();
                            while (it2.hasNext()) {
                                ((org.telegram.ui.Wallet.j0) it2.next()).close();
                            }
                            r12.e(arrayList);
                            AndroidUtilities.runOnUIThread(new c3((org.telegram.ui.Wallet.q0) r12, callback, j10, message));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (linkedHashMap != 0) {
                            linkedHashMap.close();
                        }
                        it = r102.values().iterator();
                        while (it.hasNext()) {
                            ((org.telegram.ui.Wallet.j0) it.next()).close();
                        }
                        r12.e(arrayList);
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    r102 = linkedHashMap;
                } catch (Throwable th3) {
                    th = th3;
                    r102 = linkedHashMap;
                }
                if (str.isEmpty() || j0Var == null || j0Var.e()) {
                    throw new org.telegram.ui.Wallet.p0("INVALID_ARGUMENT");
                }
                Object obj = org.telegram.ui.Wallet.q0.f;
                synchronized (obj) {
                    try {
                        r12.c(j10);
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
                    throw new org.telegram.ui.Wallet.p0("USER_MISMATCH");
                }
                r10.a = r102;
                r12.s(r10, str, linkedHashMap, arrayList, j10);
                r102 = linkedHashMap;
                try {
                    ((LinkedHashMap) r10.e).put(str, r12.j(r10, str, j0Var, arrayList, j10));
                    r102.put(str, j0Var);
                    r10.b = ConnectionsManager.getInstance(r12.b).getCurrentTime();
                    synchronized (obj) {
                        r12.c(j10);
                        r12.v(r10, r102);
                        r12.d(r10);
                    }
                    j0Var.close();
                    Iterator it3 = r102.values().iterator();
                    while (it3.hasNext()) {
                        ((org.telegram.ui.Wallet.j0) it3.next()).close();
                    }
                    message = null;
                } catch (Exception e10) {
                    e = e10;
                    linkedHashMap = j0Var;
                    FileLog.e(e);
                    if (!(e instanceof org.telegram.ui.Wallet.p0)) {
                    }
                    if (linkedHashMap != 0) {
                    }
                    it2 = r102.values().iterator();
                    while (it2.hasNext()) {
                    }
                    r12.e(arrayList);
                    AndroidUtilities.runOnUIThread(new c3((org.telegram.ui.Wallet.q0) r12, callback, j10, message));
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    linkedHashMap = j0Var;
                    if (linkedHashMap != 0) {
                    }
                    it = r102.values().iterator();
                    while (it.hasNext()) {
                    }
                    r12.e(arrayList);
                    throw th;
                }
                r12.e(arrayList);
                AndroidUtilities.runOnUIThread(new c3((org.telegram.ui.Wallet.q0) r12, callback, j10, message));
                return;
        }
    }

    public /* synthetic */ n3(org.telegram.ui.Wallet.q0 q0Var, String str, org.telegram.ui.Wallet.j0 j0Var, long j10, long j11, Utilities.Callback callback) {
        this.e = q0Var;
        this.f = str;
        this.h = j0Var;
        this.b = j10;
        this.c = j11;
        this.d = callback;
    }
}
