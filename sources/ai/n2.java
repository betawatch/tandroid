package ai;

import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.fj;
import org.telegram.messenger.t3;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f40;
import org.telegram.ui.j20;
import org.telegram.ui.n6;
import org.telegram.ui.x6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.e = serializable;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3 A[LOOP:0: B:20:0x00dd->B:22:0x00e3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Iterator it;
        switch (this.a) {
            case 0:
                q2 q2Var = (q2) this.d;
                long j3 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                if (q2Var.t.d) {
                    j20 j20Var = q2Var.t.a;
                    int i7 = q2Var.a;
                    f40 f40Var = j20Var.a;
                    if (i7 == 0) {
                        TLRPC.Peer peer = f40Var.v2;
                        if (peer != null) {
                            f40Var.o3.a(f40Var.o1.a, fj.B1(peer), j3, str, z10);
                            return;
                        }
                        return;
                    }
                    t3 t3Var = f40Var.V2;
                    r1 = t3Var != null ? (TLRPC.GroupCallParticipant) t3Var.p.get(i7) : null;
                    if (r1 != null) {
                        f40Var.o3.a(f40Var.o1.a, fj.B1(r1.peer), j3, str, z10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$seekTo$12(this.b, this.c, (Runnable) this.e);
                return;
            case 2:
                x6.Z((x6) this.d, this.c, this.b, (n6) this.e);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                long j10 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                boolean z11 = this.c;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getMessagesController().R1().r0(j10, arrayList, z11, null);
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.d;
                long j11 = this.b;
                boolean z12 = this.c;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                z0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        z0Var.f = null;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e10) {
                        z0Var.m(e10);
                        r1 = e10 instanceof org.telegram.ui.Wallet.y0 ? e10.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((org.telegram.ui.Wallet.r0) it2.next()).close();
                        }
                    }
                    synchronized (org.telegram.ui.Wallet.z0.g) {
                        try {
                            z0Var.c(j11);
                            qw0 s5 = z0Var.s();
                            if (s5.c == z12) {
                                if (((LinkedHashMap) s5.e).isEmpty()) {
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    ((org.telegram.ui.Wallet.r0) it.next()).close();
                                }
                                z0Var.e(arrayList2);
                                org.telegram.messenger.g0.g3(new di.j2(z0Var, kVar, j11, r1));
                                return;
                            }
                            if (z12 && !org.telegram.ui.Wallet.z0.i(z0Var.a)) {
                                throw new org.telegram.ui.Wallet.y0("AUTH_UNAVAILABLE");
                            }
                            if (!((LinkedHashMap) s5.e).isEmpty()) {
                                z0Var.b(j11, false);
                                for (String str2 : ((LinkedHashMap) s5.e).keySet()) {
                                    linkedHashMap.put(str2, z0Var.h(s5, str2, j11));
                                }
                            }
                            s5.c = z12;
                            ((LinkedHashMap) s5.e).clear();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                ((LinkedHashMap) s5.e).put((String) entry.getKey(), z0Var.j(s5, (String) entry.getKey(), (org.telegram.ui.Wallet.r0) entry.getValue(), arrayList2, j11));
                            }
                            s5.d = false;
                            synchronized (org.telegram.ui.Wallet.z0.g) {
                                z0Var.c(j11);
                                z0Var.w(s5, linkedHashMap);
                                z0Var.d(s5);
                            }
                            it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                            }
                            z0Var.e(arrayList2);
                            org.telegram.messenger.g0.g3(new di.j2(z0Var, kVar, j11, r1));
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((org.telegram.ui.Wallet.r0) it3.next()).close();
                    }
                    z0Var.e(arrayList2);
                    throw th4;
                }
        }
    }

    public /* synthetic */ n2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = z10;
        this.e = obj2;
    }

    public /* synthetic */ n2(x6 x6Var, boolean z10, long j3, n6 n6Var) {
        this.a = 2;
        this.d = x6Var;
        this.c = z10;
        this.b = j3;
        this.e = n6Var;
    }
}
