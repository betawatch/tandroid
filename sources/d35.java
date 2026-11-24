// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class d35 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qac b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d35(g35 g35Var, String str, y25 y25Var, long j, long j2, qac qacVar) {
        this.e = g35Var;
        this.f = str;
        this.h = y25Var;
        this.c = j;
        this.d = j2;
        this.b = qacVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:37:0x00f3, B:38:0x0109, B:52:0x0130, B:56:0x0152, B:58:0x0159, B:96:0x013b, B:99:0x013e, B:100:0x0147), top: B:18:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174 A[LOOP:1: B:63:0x016e->B:65:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5 A[LOOP:2: B:74:0x019f->B:76:0x01a5, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [g35, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [y25] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        LinkedHashMap linkedHashMap;
        y25 y25Var;
        Iterator it;
        Iterator it2;
        f35 s;
        String str = null;
        switch (this.a) {
            case 0:
                ?? r2 = (g35) this.e;
                String str2 = (String) this.f;
                y25 y25Var2 = (y25) this.h;
                long j = this.c;
                long j2 = this.d;
                qac qacVar = this.b;
                ?? r10 = j2;
                ArrayList arrayList = new ArrayList();
                ?? linkedHashMap2 = new LinkedHashMap();
                try {
                    try {
                        try {
                            r2.f = null;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            y25Var = linkedHashMap2;
                            linkedHashMap = r10;
                            if (y25Var != null) {
                                y25Var.close();
                            }
                            it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                                ((y25) it.next()).close();
                            }
                            r2.e(arrayList);
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        r10 = linkedHashMap2;
                    }
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        r2.m(e);
                        str = !(e instanceof e35) ? e.getMessage() : "STORAGE_BROKEN";
                        if (linkedHashMap2 != 0) {
                            linkedHashMap2.close();
                        }
                        it2 = r10.values().iterator();
                        while (it2.hasNext()) {
                            ((y25) it2.next()).close();
                        }
                        r2.e(arrayList);
                        gm.c3(new p97((Object) r2, (Object) qacVar, j, (Object) str, (byte) 9));
                        return;
                    }
                    if (str2.isEmpty() || y25Var2 == null || y25Var2.d()) {
                        throw new e35("INVALID_ARGUMENT");
                    }
                    Object obj = g35.g;
                    synchronized (obj) {
                        try {
                            r2.c(j);
                            s = r2.s();
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    }
                    if (!((LinkedHashMap) s.e).isEmpty()) {
                        try {
                            if (s.d != r10) {
                                throw new e35("USER_MISMATCH");
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            linkedHashMap = linkedHashMap2;
                            y25Var = y25Var2;
                            if (y25Var != null) {
                            }
                            it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                            }
                            r2.e(arrayList);
                            throw th;
                        }
                    }
                    s.d = r10;
                    r2.t(s, str2, linkedHashMap2, arrayList, j);
                    r10 = linkedHashMap2;
                    try {
                        ((LinkedHashMap) s.e).put(str2, r2.j(s, str2, y25Var2, arrayList, j));
                        r10.put(str2, y25Var2);
                        s.a = ConnectionsManager.getInstance(r2.b).getCurrentTime();
                        synchronized (obj) {
                            r2.c(j);
                            r2.w(s, r10);
                            r2.d(s);
                        }
                        y25Var2.close();
                        Iterator it3 = r10.values().iterator();
                        while (it3.hasNext()) {
                            ((y25) it3.next()).close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        linkedHashMap2 = y25Var2;
                        r2.m(e);
                        str = !(e instanceof e35) ? e.getMessage() : "STORAGE_BROKEN";
                        if (linkedHashMap2 != 0) {
                        }
                        it2 = r10.values().iterator();
                        while (it2.hasNext()) {
                        }
                        r2.e(arrayList);
                        gm.c3(new p97((Object) r2, (Object) qacVar, j, (Object) str, (byte) 9));
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        linkedHashMap2 = y25Var2;
                        th = th;
                        y25Var = linkedHashMap2;
                        linkedHashMap = r10;
                        if (y25Var != null) {
                        }
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        r2.e(arrayList);
                        throw th;
                    }
                    r2.e(arrayList);
                    gm.c3(new p97((Object) r2, (Object) qacVar, j, (Object) str, (byte) 9));
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    r10 = linkedHashMap2;
                }
            default:
                wsa wsaVar = (wsa) this.e;
                qac qacVar2 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.h;
                long j3 = this.c;
                long j4 = this.d;
                qacVar2.a(tL_error);
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!(tLObject instanceof TLRPC.Updates)) {
                        c41.b0(S).g0(tL_error, false);
                    } else if (j3 < 0 || j4 < 0) {
                        u31 I = c41.b0(S).I(R.raw.forward, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar.s1(), pg3.s(j3))));
                        I.u = true;
                        I.j();
                    } else {
                        yv1 ga = yv1.ga(j3);
                        ga.whenFullyVisible(new kqa(wsaVar, ga, j3, (byte) 0));
                        S.presentFragment(ga);
                    }
                }
                jva.v(wsaVar.a, false).M(j3);
                jva.v(wsaVar.a, false).M(j4);
                return;
        }
    }

    public /* synthetic */ d35(wsa wsaVar, qac qacVar, TLRPC.TL_error tL_error, TLObject tLObject, long j, long j2) {
        this.e = wsaVar;
        this.b = qacVar;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j;
        this.d = j2;
    }
}
