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
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    /* JADX WARN: Type inference failed for: r7v3, types: [org.telegram.ui.Wallet.i0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [org.telegram.ui.Wallet.i0] */
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
                        org.telegram.ui.Components.gc.a0(T).f0(tL_error, false);
                    } else if (j3 < 0 || j10 < 0) {
                        org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(T).I(R.raw.forward, org.telegram.messenger.id.M0(2131749897, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749898, k7Var.y1(), org.telegram.messenger.m5.t(j3))));
                        I.t = true;
                        I.j();
                    } else {
                        cn ta2 = cn.ta(j3);
                        ta2.whenFullyVisible(new s3(k7Var, ta2, j3, 0));
                        T.presentFragment(ta2);
                    }
                }
                ea.y(k7Var.a, false).P(j3);
                ea.y(k7Var.a, false).P(j10);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.e;
                String str2 = (String) this.f;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
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
                    r72 = i0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = i0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (str2.isEmpty() || i0Var == null || i0Var.d()) {
                    throw new org.telegram.ui.Wallet.o0("INVALID_ARGUMENT");
                }
                Object obj = org.telegram.ui.Wallet.p0.f;
                synchronized (obj) {
                    try {
                        p0Var.c(j11);
                        try {
                            ew0 r10 = p0Var.r();
                            try {
                                if (!((LinkedHashMap) r10.e).isEmpty() && r10.a != r72) {
                                    throw new org.telegram.ui.Wallet.o0("USER_MISMATCH");
                                }
                                r10.a = r72;
                                arrayList = arrayList2;
                                try {
                                    p0Var.s(r10, str2, linkedHashMap2, arrayList, j11);
                                    linkedHashMap = linkedHashMap2;
                                    try {
                                        ((LinkedHashMap) r10.e).put(str2, p0Var.j(r10, str2, i0Var, arrayList, j11));
                                        linkedHashMap.put(str2, i0Var);
                                        r10.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                        synchronized (obj) {
                                            p0Var.c(j11);
                                            p0Var.v(r10, linkedHashMap);
                                            p0Var.d(r10);
                                        }
                                        i0Var.close();
                                        Iterator it = linkedHashMap.values().iterator();
                                        while (it.hasNext()) {
                                            ((org.telegram.ui.Wallet.i0) it.next()).close();
                                        }
                                        str = null;
                                    } catch (Exception e12) {
                                        e = e12;
                                        r72 = i0Var;
                                        org.telegram.messenger.a8.g(e, true);
                                        String message = e instanceof org.telegram.ui.Wallet.o0 ? e.getMessage() : "STORAGE_BROKEN";
                                        if (r72 != 0) {
                                            r72.close();
                                        }
                                        Iterator it2 = linkedHashMap.values().iterator();
                                        while (it2.hasNext()) {
                                            ((org.telegram.ui.Wallet.i0) it2.next()).close();
                                        }
                                        str = message;
                                        p0Var.e(arrayList);
                                        org.telegram.messenger.g0.h3(new w2(p0Var, c20Var2, j11, str));
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r72 = i0Var;
                                        if (r72 != 0) {
                                            r72.close();
                                        }
                                        Iterator it3 = linkedHashMap.values().iterator();
                                        while (it3.hasNext()) {
                                            ((org.telegram.ui.Wallet.i0) it3.next()).close();
                                        }
                                        p0Var.e(arrayList);
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
                                r72 = i0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            } catch (Throwable th6) {
                                th = th6;
                                r72 = i0Var;
                                linkedHashMap = linkedHashMap2;
                                arrayList = arrayList2;
                            }
                            p0Var.e(arrayList);
                            org.telegram.messenger.g0.h3(new w2(p0Var, c20Var2, j11, str));
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

    public /* synthetic */ i3(org.telegram.ui.Wallet.p0 p0Var, String str, org.telegram.ui.Wallet.i0 i0Var, long j3, long j10, c20 c20Var) {
        this.e = p0Var;
        this.f = str;
        this.h = i0Var;
        this.b = j3;
        this.c = j10;
        this.d = c20Var;
    }
}
