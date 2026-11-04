package ci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ u10 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v2(l6 l6Var, u10 u10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, long j11) {
        this.e = l6Var;
        this.d = u10Var;
        this.f = tL_error;
        this.h = tLObject;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [org.telegram.ui.Wallet.h0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [org.telegram.ui.Wallet.h0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.e;
                u10 u10Var = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.h;
                long j10 = this.b;
                long j11 = this.c;
                u10Var.a(tL_error);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.Updates)) {
                        org.telegram.ui.Components.fc.a0(T).f0(tL_error, false);
                    } else if (j10 < 0 || j11 < 0) {
                        org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T).I(R.raw.forward, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var.z1(), org.telegram.messenger.m5.t(j10))));
                        I.t = true;
                        I.j();
                    } else {
                        wm ra2 = wm.ra(j10);
                        ra2.whenFullyVisible(new f3(l6Var, ra2, j10, 0));
                        T.presentFragment(ra2);
                    }
                }
                e9.y(l6Var.a, false).P(j10);
                e9.y(l6Var.a, false).P(j11);
                return;
            default:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.e;
                String str2 = (String) this.f;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.h;
                long j12 = this.b;
                ?? r72 = this.c;
                u10 u10Var2 = this.d;
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
                    r72 = h0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = h0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (str2.isEmpty() || h0Var == null || h0Var.d()) {
                    throw new org.telegram.ui.Wallet.n0("INVALID_ARGUMENT");
                }
                Object obj = org.telegram.ui.Wallet.o0.f;
                synchronized (obj) {
                    try {
                        o0Var.c(j12);
                        try {
                            dw0 r5 = o0Var.r();
                            try {
                                if (!((LinkedHashMap) r5.e).isEmpty() && r5.a != r72) {
                                    throw new org.telegram.ui.Wallet.n0("USER_MISMATCH");
                                }
                                r5.a = r72;
                                arrayList = arrayList2;
                                try {
                                    o0Var.s(r5, str2, linkedHashMap2, arrayList, j12);
                                    linkedHashMap = linkedHashMap2;
                                    try {
                                        ((LinkedHashMap) r5.e).put(str2, o0Var.j(r5, str2, h0Var, arrayList, j12));
                                        linkedHashMap.put(str2, h0Var);
                                        r5.b = ConnectionsManager.getInstance(o0Var.b).getCurrentTime();
                                        synchronized (obj) {
                                            o0Var.c(j12);
                                            o0Var.v(r5, linkedHashMap);
                                            o0Var.d(r5);
                                        }
                                        h0Var.close();
                                        Iterator it = linkedHashMap.values().iterator();
                                        while (it.hasNext()) {
                                            ((org.telegram.ui.Wallet.h0) it.next()).close();
                                        }
                                        str = null;
                                    } catch (Exception e12) {
                                        e = e12;
                                        r72 = h0Var;
                                        org.telegram.messenger.a8.g(e, true);
                                        String message = e instanceof org.telegram.ui.Wallet.n0 ? e.getMessage() : "STORAGE_BROKEN";
                                        if (r72 != 0) {
                                            r72.close();
                                        }
                                        Iterator it2 = linkedHashMap.values().iterator();
                                        while (it2.hasNext()) {
                                            ((org.telegram.ui.Wallet.h0) it2.next()).close();
                                        }
                                        str = message;
                                        o0Var.e(arrayList);
                                        org.telegram.messenger.g0.h3(new l2(o0Var, u10Var2, j12, str));
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r72 = h0Var;
                                        if (r72 != 0) {
                                            r72.close();
                                        }
                                        Iterator it3 = linkedHashMap.values().iterator();
                                        while (it3.hasNext()) {
                                            ((org.telegram.ui.Wallet.h0) it3.next()).close();
                                        }
                                        o0Var.e(arrayList);
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
                                r72 = h0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            } catch (Throwable th6) {
                                th = th6;
                                r72 = h0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            }
                            o0Var.e(arrayList);
                            org.telegram.messenger.g0.h3(new l2(o0Var, u10Var2, j12, str));
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

    public /* synthetic */ v2(org.telegram.ui.Wallet.o0 o0Var, String str, org.telegram.ui.Wallet.h0 h0Var, long j10, long j11, u10 u10Var) {
        this.e = o0Var;
        this.f = str;
        this.h = h0Var;
        this.b = j10;
        this.c = j11;
        this.d = u10Var;
    }
}
