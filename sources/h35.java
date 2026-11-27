// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class h35 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h35(k35 k35Var, String str, c35 c35Var, long j, long j2, pcc pccVar) {
        this.e = k35Var;
        this.f = str;
        this.h = c35Var;
        this.c = j;
        this.d = j2;
        this.b = pccVar;
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
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k35] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [c35] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        LinkedHashMap linkedHashMap;
        c35 c35Var;
        Iterator it;
        Iterator it2;
        j35 s;
        String str = null;
        switch (this.a) {
            case 0:
                ?? r2 = (k35) this.e;
                String str2 = (String) this.f;
                c35 c35Var2 = (c35) this.h;
                long j = this.c;
                long j2 = this.d;
                pcc pccVar = this.b;
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
                            c35Var = linkedHashMap2;
                            linkedHashMap = r10;
                            if (c35Var != null) {
                                c35Var.close();
                            }
                            it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                                ((c35) it.next()).close();
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
                        str = !(e instanceof i35) ? e.getMessage() : "STORAGE_BROKEN";
                        if (linkedHashMap2 != 0) {
                            linkedHashMap2.close();
                        }
                        it2 = r10.values().iterator();
                        while (it2.hasNext()) {
                            ((c35) it2.next()).close();
                        }
                        r2.e(arrayList);
                        hl.c3(new ba7((Object) r2, (Object) pccVar, j, (Object) str, (byte) 9));
                        return;
                    }
                    if (str2.isEmpty() || c35Var2 == null || c35Var2.d()) {
                        throw new i35("INVALID_ARGUMENT");
                    }
                    Object obj = k35.g;
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
                                throw new i35("USER_MISMATCH");
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            linkedHashMap = linkedHashMap2;
                            c35Var = c35Var2;
                            if (c35Var != null) {
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
                        ((LinkedHashMap) s.e).put(str2, r2.j(s, str2, c35Var2, arrayList, j));
                        r10.put(str2, c35Var2);
                        s.a = ConnectionsManager.getInstance(r2.b).getCurrentTime();
                        synchronized (obj) {
                            r2.c(j);
                            r2.w(s, r10);
                            r2.d(s);
                        }
                        c35Var2.close();
                        Iterator it3 = r10.values().iterator();
                        while (it3.hasNext()) {
                            ((c35) it3.next()).close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        linkedHashMap2 = c35Var2;
                        r2.m(e);
                        str = !(e instanceof i35) ? e.getMessage() : "STORAGE_BROKEN";
                        if (linkedHashMap2 != 0) {
                        }
                        it2 = r10.values().iterator();
                        while (it2.hasNext()) {
                        }
                        r2.e(arrayList);
                        hl.c3(new ba7((Object) r2, (Object) pccVar, j, (Object) str, (byte) 9));
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        linkedHashMap2 = c35Var2;
                        th = th;
                        c35Var = linkedHashMap2;
                        linkedHashMap = r10;
                        if (c35Var != null) {
                        }
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        r2.e(arrayList);
                        throw th;
                    }
                    r2.e(arrayList);
                    hl.c3(new ba7((Object) r2, (Object) pccVar, j, (Object) str, (byte) 9));
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    r10 = linkedHashMap2;
                }
            default:
                wua wuaVar = (wua) this.e;
                pcc pccVar2 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.h;
                long j3 = this.c;
                long j4 = this.d;
                pccVar2.a(tL_error);
                e S = LaunchActivity.S();
                if (S != null) {
                    if (!(tLObject instanceof TLRPC.Updates)) {
                        d31.b0(S).g0(tL_error, false);
                    } else if (j3 < 0 || j4 < 0) {
                        v21 I = d31.b0(S).I(R.raw.forward, ob6.M0(2131749843, null), hl.S2(ob6.a0(null, null, 2131749844, wuaVar.t1(), wf3.s(j3))));
                        I.u = true;
                        I.j();
                    } else {
                        zu1 ha = zu1.ha(j3);
                        ha.whenFullyVisible(new lsa(wuaVar, ha, j3, (byte) 0));
                        S.presentFragment(ha);
                    }
                }
                jxa.v(wuaVar.a, false).M(j3);
                jxa.v(wuaVar.a, false).M(j4);
                return;
        }
    }

    public /* synthetic */ h35(wua wuaVar, pcc pccVar, TLRPC.TL_error tL_error, TLObject tLObject, long j, long j2) {
        this.e = wuaVar;
        this.b = pccVar;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j;
        this.d = j2;
    }
}
