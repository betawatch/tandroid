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
import org.telegram.ui.Components.pw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e40;
import org.telegram.ui.i20;
import org.telegram.ui.o6;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
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
                i2 i2Var = (i2) this.d;
                long j3 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                if (i2Var.x.d) {
                    i20 i20Var = i2Var.x.a;
                    int i7 = i2Var.a;
                    e40 e40Var = i20Var.a;
                    if (i7 == 0) {
                        TLRPC.Peer peer = e40Var.v2;
                        if (peer != null) {
                            e40Var.o3.a(e40Var.o1.a, fj.B1(peer), j3, str, z10);
                            return;
                        }
                        return;
                    }
                    t3 t3Var = e40Var.V2;
                    r1 = t3Var != null ? (TLRPC.GroupCallParticipant) t3Var.p.get(i7) : null;
                    if (r1 != null) {
                        e40Var.o3.a(e40Var.o1.a, fj.B1(r1.peer), j3, str, z10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$seekTo$12(this.b, this.c, (Runnable) this.e);
                return;
            case 2:
                y6.Z((y6) this.d, this.c, this.b, (o6) this.e);
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
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) this.d;
                long j11 = this.b;
                boolean z12 = this.c;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                a1Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        a1Var.f = null;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e10) {
                        a1Var.m(e10);
                        r1 = e10 instanceof org.telegram.ui.Wallet.z0 ? e10.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((org.telegram.ui.Wallet.s0) it2.next()).close();
                        }
                    }
                    synchronized (org.telegram.ui.Wallet.a1.g) {
                        try {
                            a1Var.c(j11);
                            pw0 s5 = a1Var.s();
                            if (s5.c == z12) {
                                if (((LinkedHashMap) s5.e).isEmpty()) {
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    ((org.telegram.ui.Wallet.s0) it.next()).close();
                                }
                                a1Var.e(arrayList2);
                                org.telegram.messenger.g0.g3(new di.j2(a1Var, kVar, j11, r1));
                                return;
                            }
                            if (z12 && !org.telegram.ui.Wallet.a1.i(a1Var.a)) {
                                throw new org.telegram.ui.Wallet.z0("AUTH_UNAVAILABLE");
                            }
                            if (!((LinkedHashMap) s5.e).isEmpty()) {
                                a1Var.b(j11, false);
                                for (String str2 : ((LinkedHashMap) s5.e).keySet()) {
                                    linkedHashMap.put(str2, a1Var.h(s5, str2, j11));
                                }
                            }
                            s5.c = z12;
                            ((LinkedHashMap) s5.e).clear();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                ((LinkedHashMap) s5.e).put((String) entry.getKey(), a1Var.j(s5, (String) entry.getKey(), (org.telegram.ui.Wallet.s0) entry.getValue(), arrayList2, j11));
                            }
                            s5.d = false;
                            synchronized (org.telegram.ui.Wallet.a1.g) {
                                a1Var.c(j11);
                                a1Var.w(s5, linkedHashMap);
                                a1Var.d(s5);
                            }
                            it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                            }
                            a1Var.e(arrayList2);
                            org.telegram.messenger.g0.g3(new di.j2(a1Var, kVar, j11, r1));
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((org.telegram.ui.Wallet.s0) it3.next()).close();
                    }
                    a1Var.e(arrayList2);
                    throw th4;
                }
        }
    }

    public /* synthetic */ f2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = z10;
        this.e = obj2;
    }

    public /* synthetic */ f2(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        this.a = 2;
        this.d = y6Var;
        this.c = z10;
        this.b = j3;
        this.e = o6Var;
    }
}
