package org.telegram.messenger.video;

import android.graphics.RectF;
import bi.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.j0;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.Wallet.q0;
import org.telegram.ui.o6;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, long j3, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = j3;
        this.b = z9;
        this.e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0 A[LOOP:0: B:20:0x00da->B:22:0x00e0, LOOP_END] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String message;
        Iterator it;
        switch (this.a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$seekTo$12(this.c, this.b, (Runnable) this.e);
                return;
            case 1:
                y6.Z((y6) this.d, this.b, this.c, (o6) this.e);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                long j3 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                boolean z9 = this.b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getMessagesController().P1().r0(j3, arrayList, z9, null);
                return;
            default:
                q0 q0Var = (q0) this.d;
                long j10 = this.c;
                boolean z10 = this.b;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                q0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        message = e10 instanceof p0 ? e10.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((j0) it2.next()).close();
                        }
                    }
                    try {
                        synchronized (q0.f) {
                            try {
                                q0Var.c(j10);
                                ew0 r10 = q0Var.r();
                                if (r10.c == z10) {
                                    if (((LinkedHashMap) r10.e).isEmpty()) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((j0) it.next()).close();
                                    }
                                    message = null;
                                    q0Var.e(arrayList2);
                                    g0.h3(new w2(q0Var, kVar, j10, message));
                                    return;
                                }
                                if (z10 && !q0.i(q0Var.a)) {
                                    throw new p0("AUTH_UNAVAILABLE");
                                }
                                if (!((LinkedHashMap) r10.e).isEmpty()) {
                                    q0Var.b(j10, false);
                                    for (String str : ((LinkedHashMap) r10.e).keySet()) {
                                        linkedHashMap.put(str, q0Var.h(r10, str, j10));
                                    }
                                }
                                r10.c = z10;
                                ((LinkedHashMap) r10.e).clear();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    ((LinkedHashMap) r10.e).put((String) entry.getKey(), q0Var.j(r10, (String) entry.getKey(), (j0) entry.getValue(), arrayList2, j10));
                                }
                                r10.d = false;
                                synchronized (q0.f) {
                                    q0Var.c(j10);
                                    q0Var.v(r10, linkedHashMap);
                                    q0Var.d(r10);
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                }
                                message = null;
                                q0Var.e(arrayList2);
                                g0.h3(new w2(q0Var, kVar, j10, message));
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
                        ((j0) it3.next()).close();
                    }
                    q0Var.e(arrayList2);
                    throw th4;
                }
                break;
        }
    }

    public /* synthetic */ n(y6 y6Var, boolean z9, long j3, o6 o6Var) {
        this.a = 1;
        this.d = y6Var;
        this.b = z9;
        this.c = j3;
        this.e = o6Var;
    }

    public /* synthetic */ n(ProfileActivity profileActivity, long j3, ArrayList arrayList, boolean z9) {
        this.a = 2;
        this.d = profileActivity;
        this.c = j3;
        this.e = arrayList;
        this.b = z9;
    }
}
