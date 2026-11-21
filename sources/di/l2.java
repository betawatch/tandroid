package di;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ x10 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l2(f6 f6Var, x10 x10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.e = f6Var;
        this.d = x10Var;
        this.f = tL_error;
        this.h = tLObject;
        this.b = j3;
        this.c = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108 A[Catch: all -> 0x00c1, TryCatch #1 {all -> 0x00c1, blocks: (B:36:0x007b, B:37:0x0091, B:54:0x00c0, B:58:0x0101, B:60:0x0108, B:105:0x00e9, B:112:0x00f6, B:113:0x0100), top: B:4:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122 A[LOOP:1: B:64:0x011c->B:66:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151 A[LOOP:2: B:75:0x014b->B:77:0x0151, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v1, types: [long] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [org.telegram.ui.Wallet.r0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [org.telegram.ui.Wallet.r0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        String str;
        org.telegram.ui.Wallet.z0 z0Var;
        LinkedHashMap linkedHashMap = null;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.e;
                x10 x10Var = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.h;
                long j3 = this.b;
                long j10 = this.c;
                x10Var.a(tL_error);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.Updates)) {
                        org.telegram.ui.Components.lc.b0(T).g0(tL_error, false);
                    } else if (j3 < 0 || j10 < 0) {
                        org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(T).I(R.raw.forward, gd.N0(2131749880, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                        I.t = true;
                        I.j();
                    } else {
                        bn ua2 = bn.ua(j3);
                        ua2.whenFullyVisible(new b3(f6Var, ua2, j3, 0));
                        T.presentFragment(ua2);
                    }
                }
                y8.y(f6Var.a, false).O(j3);
                y8.y(f6Var.a, false).O(j10);
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var2 = (org.telegram.ui.Wallet.z0) this.e;
                String str2 = (String) this.f;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.h;
                long j11 = this.b;
                ?? r62 = this.c;
                x10 x10Var2 = this.d;
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                try {
                    try {
                        z0Var2.f = null;
                        try {
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList = arrayList2;
                    r62 = r0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r62 = r0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (str2.isEmpty() || r0Var == null || r0Var.d()) {
                    throw new org.telegram.ui.Wallet.y0("INVALID_ARGUMENT");
                }
                Object obj = org.telegram.ui.Wallet.z0.g;
                synchronized (obj) {
                    try {
                        z0Var2.c(j11);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    try {
                        qw0 s5 = z0Var2.s();
                        try {
                            if (((LinkedHashMap) s5.e).isEmpty()) {
                                z0Var = z0Var2;
                            } else {
                                z0Var = z0Var2;
                                try {
                                    if (s5.a != r62) {
                                        throw new org.telegram.ui.Wallet.y0("USER_MISMATCH");
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    r62 = r0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                    z0Var2 = z0Var;
                                    z0Var2.m(e);
                                    if (!(e instanceof org.telegram.ui.Wallet.y0)) {
                                    }
                                    if (r62 != 0) {
                                    }
                                    it2 = linkedHashMap.values().iterator();
                                    while (it2.hasNext()) {
                                    }
                                    z0Var2.e(arrayList);
                                    str = r0;
                                    org.telegram.messenger.g0.g3(new j2(z0Var2, x10Var2, j11, str));
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r62 = r0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                    z0Var2 = z0Var;
                                    if (r62 != 0) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                    }
                                    z0Var2.e(arrayList);
                                    throw th;
                                }
                            }
                            s5.a = r62;
                            arrayList = arrayList2;
                            z0Var2 = z0Var;
                            try {
                                z0Var2.t(s5, str2, linkedHashMap2, arrayList, j11);
                                linkedHashMap = linkedHashMap2;
                            } catch (Exception e13) {
                                e = e13;
                                linkedHashMap = linkedHashMap2;
                            } catch (Throwable th6) {
                                th = th6;
                                linkedHashMap = linkedHashMap2;
                            }
                            try {
                                ((LinkedHashMap) s5.e).put(str2, z0Var2.j(s5, str2, r0Var, arrayList, j11));
                                linkedHashMap.put(str2, r0Var);
                                s5.b = ConnectionsManager.getInstance(z0Var2.b).getCurrentTime();
                                synchronized (obj) {
                                    z0Var2.c(j11);
                                    z0Var2.w(s5, linkedHashMap);
                                    z0Var2.d(s5);
                                }
                                r0Var.close();
                                Iterator it3 = linkedHashMap.values().iterator();
                                while (it3.hasNext()) {
                                    ((org.telegram.ui.Wallet.r0) it3.next()).close();
                                }
                                z0Var2.e(arrayList);
                                str = null;
                            } catch (Exception e14) {
                                e = e14;
                                r62 = r0Var;
                                z0Var2.m(e);
                                String message = !(e instanceof org.telegram.ui.Wallet.y0) ? e.getMessage() : "STORAGE_BROKEN";
                                if (r62 != 0) {
                                    r62.close();
                                }
                                it2 = linkedHashMap.values().iterator();
                                while (it2.hasNext()) {
                                    ((org.telegram.ui.Wallet.r0) it2.next()).close();
                                }
                                z0Var2.e(arrayList);
                                str = message;
                                org.telegram.messenger.g0.g3(new j2(z0Var2, x10Var2, j11, str));
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                r62 = r0Var;
                                if (r62 != 0) {
                                    r62.close();
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    ((org.telegram.ui.Wallet.r0) it.next()).close();
                                }
                                z0Var2.e(arrayList);
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            r62 = r0Var;
                            linkedHashMap = linkedHashMap2;
                            arrayList = arrayList2;
                        } catch (Throwable th8) {
                            th = th8;
                            r62 = r0Var;
                            linkedHashMap = linkedHashMap2;
                            arrayList = arrayList2;
                        }
                        org.telegram.messenger.g0.g3(new j2(z0Var2, x10Var2, j11, str));
                        return;
                    } catch (Throwable th9) {
                        th = th9;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                    }
                }
        }
    }

    public /* synthetic */ l2(org.telegram.ui.Wallet.z0 z0Var, String str, org.telegram.ui.Wallet.r0 r0Var, long j3, long j10, x10 x10Var) {
        this.e = z0Var;
        this.f = str;
        this.h = r0Var;
        this.b = j3;
        this.c = j10;
        this.d = x10Var;
    }
}
