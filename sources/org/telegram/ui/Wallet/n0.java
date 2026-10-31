package org.telegram.ui.Wallet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q20 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n0(p0 p0Var, String str, h0 h0Var, long j10, long j11, q20 q20Var) {
        this.e = p0Var;
        this.f = str;
        this.h = h0Var;
        this.c = j10;
        this.d = j11;
        this.b = q20Var;
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
        String str;
        LinkedHashMap linkedHashMap = null;
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.e;
                String str2 = (String) this.f;
                h0 h0Var = (h0) this.h;
                long j10 = this.c;
                ?? r72 = this.d;
                q20 q20Var = this.b;
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e7) {
                    e = e7;
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
                    throw new o0("INVALID_ARGUMENT");
                }
                Object obj = p0.f;
                synchronized (obj) {
                    try {
                        p0Var.c(j10);
                        try {
                            ix0 r10 = p0Var.r();
                            try {
                                if (!((LinkedHashMap) r10.e).isEmpty() && r10.a != r72) {
                                    throw new o0("USER_MISMATCH");
                                }
                                r10.a = r72;
                                arrayList = arrayList2;
                                try {
                                    p0Var.s(r10, str2, linkedHashMap2, arrayList, j10);
                                    linkedHashMap = linkedHashMap2;
                                } catch (Exception e10) {
                                    e = e10;
                                    linkedHashMap = linkedHashMap2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    linkedHashMap = linkedHashMap2;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                r72 = h0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            } catch (Throwable th5) {
                                th = th5;
                                r72 = h0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            }
                            try {
                                ((LinkedHashMap) r10.e).put(str2, p0Var.j(r10, str2, h0Var, arrayList, j10));
                                linkedHashMap.put(str2, h0Var);
                                r10.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                synchronized (obj) {
                                    p0Var.c(j10);
                                    p0Var.v(r10, linkedHashMap);
                                    p0Var.d(r10);
                                }
                                h0Var.close();
                                Iterator it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    ((h0) it.next()).close();
                                }
                                str = null;
                            } catch (Exception e12) {
                                e = e12;
                                r72 = h0Var;
                                org.telegram.messenger.f8.g(e, true);
                                String message = e instanceof o0 ? e.getMessage() : "STORAGE_BROKEN";
                                if (r72 != 0) {
                                    r72.close();
                                }
                                Iterator it2 = linkedHashMap.values().iterator();
                                while (it2.hasNext()) {
                                    ((h0) it2.next()).close();
                                }
                                str = message;
                                p0Var.e(arrayList);
                                org.telegram.messenger.i0.g3(new ag.a3(p0Var, q20Var, j10, str, 13));
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                r72 = h0Var;
                                if (r72 != 0) {
                                    r72.close();
                                }
                                Iterator it3 = linkedHashMap.values().iterator();
                                while (it3.hasNext()) {
                                    ((h0) it3.next()).close();
                                }
                                p0Var.e(arrayList);
                                throw th;
                            }
                            p0Var.e(arrayList);
                            org.telegram.messenger.i0.g3(new ag.a3(p0Var, q20Var, j10, str, 13));
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
            default:
                rh.e4 e4Var = (rh.e4) this.e;
                q20 q20Var2 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.h;
                long j11 = this.c;
                long j12 = this.d;
                q20Var2.a(tL_error);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.Updates)) {
                        cc.a0(T).f0(tL_error, false);
                    } else if (j11 < 0 || j12 < 0) {
                        wb I = cc.a0(T).I(R.raw.forward, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j11))));
                        I.t = true;
                        I.j();
                    } else {
                        un ha = un.ha(j11);
                        ha.whenFullyVisible(new rh.v1(e4Var, ha, j11, 0));
                        T.presentFragment(ha);
                    }
                }
                rh.e6.y(e4Var.a, false).P(j11);
                rh.e6.y(e4Var.a, false).P(j12);
                return;
        }
    }

    public /* synthetic */ n0(rh.e4 e4Var, q20 q20Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, long j11) {
        this.e = e4Var;
        this.b = q20Var;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j10;
        this.d = j11;
    }
}
