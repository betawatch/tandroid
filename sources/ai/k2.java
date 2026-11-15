package ai;

import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.r3;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c40;
import org.telegram.ui.g20;
import org.telegram.ui.o6;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.e = serializable;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1 A[LOOP:0: B:20:0x00db->B:22:0x00e1, LOOP_END] */
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
                n2 n2Var = (n2) this.d;
                long j3 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                if (n2Var.t.d) {
                    g20 g20Var = n2Var.t.a;
                    int i7 = n2Var.a;
                    c40 c40Var = g20Var.a;
                    if (i7 == 0) {
                        TLRPC.Peer peer = c40Var.v2;
                        if (peer != null) {
                            c40Var.o3.a(c40Var.o1.a, gj.B1(peer), j3, str, z10);
                            return;
                        }
                        return;
                    }
                    r3 r3Var = c40Var.V2;
                    r1 = r3Var != null ? (TLRPC.GroupCallParticipant) r3Var.p.get(i7) : null;
                    if (r1 != null) {
                        c40Var.o3.a(c40Var.o1.a, gj.B1(r1.peer), j3, str, z10);
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
                RectF rectF = ProfileActivity.X6;
                profileActivity.getMessagesController().P1().r0(j10, arrayList, z11, null);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.b;
                boolean z12 = this.c;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                p0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        r1 = e10 instanceof org.telegram.ui.Wallet.o0 ? e10.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((org.telegram.ui.Wallet.i0) it2.next()).close();
                        }
                    }
                    try {
                        synchronized (org.telegram.ui.Wallet.p0.f) {
                            try {
                                p0Var.c(j11);
                                hw0 r10 = p0Var.r();
                                if (r10.c == z12) {
                                    if (((LinkedHashMap) r10.e).isEmpty()) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((org.telegram.ui.Wallet.i0) it.next()).close();
                                    }
                                    p0Var.e(arrayList2);
                                    org.telegram.messenger.g0.h3(new di.f2(p0Var, (z10) kVar, j11, (String) r1));
                                    return;
                                }
                                if (z12 && !org.telegram.ui.Wallet.p0.i(p0Var.a)) {
                                    throw new org.telegram.ui.Wallet.o0("AUTH_UNAVAILABLE");
                                }
                                if (!((LinkedHashMap) r10.e).isEmpty()) {
                                    p0Var.b(j11, false);
                                    for (String str2 : ((LinkedHashMap) r10.e).keySet()) {
                                        linkedHashMap.put(str2, p0Var.h(r10, str2, j11));
                                    }
                                }
                                r10.c = z12;
                                ((LinkedHashMap) r10.e).clear();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    ((LinkedHashMap) r10.e).put((String) entry.getKey(), p0Var.j(r10, (String) entry.getKey(), (org.telegram.ui.Wallet.i0) entry.getValue(), arrayList2, j11));
                                }
                                r10.d = false;
                                synchronized (org.telegram.ui.Wallet.p0.f) {
                                    p0Var.c(j11);
                                    p0Var.v(r10, linkedHashMap);
                                    p0Var.d(r10);
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                }
                                p0Var.e(arrayList2);
                                org.telegram.messenger.g0.h3(new di.f2(p0Var, (z10) kVar, j11, (String) r1));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((org.telegram.ui.Wallet.i0) it3.next()).close();
                    }
                    p0Var.e(arrayList2);
                    throw th4;
                }
                break;
        }
    }

    public /* synthetic */ k2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = z10;
        this.e = obj2;
    }

    public /* synthetic */ k2(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        this.a = 2;
        this.d = y6Var;
        this.c = z10;
        this.b = j3;
        this.e = o6Var;
    }
}
