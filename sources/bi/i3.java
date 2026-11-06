package bi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c20 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i3(k7 k7Var, c20 c20Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.e = k7Var;
        this.d = c20Var;
        this.f = tL_error;
        this.h = tLObject;
        this.b = j3;
        this.c = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [org.telegram.ui.Wallet.k0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [org.telegram.ui.Wallet.k0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.e;
                c20 c20Var = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.h;
                long j3 = this.b;
                long j10 = this.c;
                c20Var.a(tL_error);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.Updates)) {
                        org.telegram.ui.Components.hc.a0(T).f0(tL_error, false);
                    } else if (j3 < 0 || j10 < 0) {
                        org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(T).I(R.raw.forward, org.telegram.messenger.hd.M0(2131749896, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749897, k7Var.z1(), org.telegram.messenger.m5.t(j3))));
                        I.t = true;
                        I.j();
                    } else {
                        an ra2 = an.ra(j3);
                        ra2.whenFullyVisible(new s3(k7Var, ra2, j3, 0));
                        T.presentFragment(ra2);
                    }
                }
                ea.y(k7Var.a, false).P(j3);
                ea.y(k7Var.a, false).P(j10);
                return;
            default:
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.e;
                String str2 = (String) this.f;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.h;
                long j11 = this.b;
                ?? r72 = this.c;
                c20 c20Var2 = this.d;
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                try {
                    try {
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
                    r72 = k0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = k0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (str2.isEmpty() || k0Var == null || k0Var.d()) {
                    throw new org.telegram.ui.Wallet.q0("INVALID_ARGUMENT");
                }
                Object obj = org.telegram.ui.Wallet.r0.f;
                synchronized (obj) {
                    try {
                        r0Var.c(j11);
                        try {
                            ew0 r10 = r0Var.r();
                            try {
                                if (!((LinkedHashMap) r10.e).isEmpty() && r10.a != r72) {
                                    throw new org.telegram.ui.Wallet.q0("USER_MISMATCH");
                                }
                                r10.a = r72;
                                arrayList = arrayList2;
                                try {
                                    r0Var.s(r10, str2, linkedHashMap2, arrayList, j11);
                                    linkedHashMap = linkedHashMap2;
                                    try {
                                        ((LinkedHashMap) r10.e).put(str2, r0Var.j(r10, str2, k0Var, arrayList, j11));
                                        linkedHashMap.put(str2, k0Var);
                                        r10.b = ConnectionsManager.getInstance(r0Var.b).getCurrentTime();
                                        synchronized (obj) {
                                            r0Var.c(j11);
                                            r0Var.v(r10, linkedHashMap);
                                            r0Var.d(r10);
                                        }
                                        k0Var.close();
                                        Iterator it = linkedHashMap.values().iterator();
                                        while (it.hasNext()) {
                                            ((org.telegram.ui.Wallet.k0) it.next()).close();
                                        }
                                        str = null;
                                    } catch (Exception e12) {
                                        e = e12;
                                        r72 = k0Var;
                                        org.telegram.messenger.a8.g(e, true);
                                        String message = e instanceof org.telegram.ui.Wallet.q0 ? e.getMessage() : "STORAGE_BROKEN";
                                        if (r72 != 0) {
                                            r72.close();
                                        }
                                        Iterator it2 = linkedHashMap.values().iterator();
                                        while (it2.hasNext()) {
                                            ((org.telegram.ui.Wallet.k0) it2.next()).close();
                                        }
                                        str = message;
                                        r0Var.e(arrayList);
                                        org.telegram.messenger.g0.h3(new w2(r0Var, c20Var2, j11, str));
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r72 = k0Var;
                                        if (r72 != 0) {
                                            r72.close();
                                        }
                                        Iterator it3 = linkedHashMap.values().iterator();
                                        while (it3.hasNext()) {
                                            ((org.telegram.ui.Wallet.k0) it3.next()).close();
                                        }
                                        r0Var.e(arrayList);
                                        throw th;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    linkedHashMap = linkedHashMap2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    linkedHashMap = linkedHashMap2;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                r72 = k0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            } catch (Throwable th6) {
                                th = th6;
                                r72 = k0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            }
                            r0Var.e(arrayList);
                            org.telegram.messenger.g0.h3(new w2(r0Var, c20Var2, j11, str));
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i3(org.telegram.ui.Wallet.r0 r0Var, String str, org.telegram.ui.Wallet.k0 k0Var, long j3, long j10, c20 c20Var) {
        this.e = r0Var;
        this.f = str;
        this.h = k0Var;
        this.b = j3;
        this.c = j10;
        this.d = c20Var;
    }
}
