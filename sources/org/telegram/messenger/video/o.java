package org.telegram.messenger.video;

import android.graphics.RectF;
import ci.l2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.h0;
import org.telegram.ui.Wallet.n0;
import org.telegram.ui.Wallet.o0;
import org.telegram.ui.p6;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(Object obj, long j10, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.d = obj;
        this.c = j10;
        this.b = z10;
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
                z6.Z((z6) this.d, this.b, this.c, (p6) this.e);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                long j10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                boolean z10 = this.b;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getMessagesController().P1().r0(j10, arrayList, z10, null);
                return;
            default:
                o0 o0Var = (o0) this.d;
                long j11 = this.c;
                boolean z11 = this.b;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                o0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        message = e10 instanceof n0 ? e10.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((h0) it2.next()).close();
                        }
                    }
                    try {
                        synchronized (o0.f) {
                            try {
                                o0Var.c(j11);
                                dw0 r5 = o0Var.r();
                                if (r5.c == z11) {
                                    if (((LinkedHashMap) r5.e).isEmpty()) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((h0) it.next()).close();
                                    }
                                    message = null;
                                    o0Var.e(arrayList2);
                                    g0.h3(new l2(o0Var, kVar, j11, message));
                                    return;
                                }
                                if (z11 && !o0.i(o0Var.a)) {
                                    throw new n0("AUTH_UNAVAILABLE");
                                }
                                if (!((LinkedHashMap) r5.e).isEmpty()) {
                                    o0Var.b(j11, false);
                                    for (String str : ((LinkedHashMap) r5.e).keySet()) {
                                        linkedHashMap.put(str, o0Var.h(r5, str, j11));
                                    }
                                }
                                r5.c = z11;
                                ((LinkedHashMap) r5.e).clear();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    ((LinkedHashMap) r5.e).put((String) entry.getKey(), o0Var.j(r5, (String) entry.getKey(), (h0) entry.getValue(), arrayList2, j11));
                                }
                                r5.d = false;
                                synchronized (o0.f) {
                                    o0Var.c(j11);
                                    o0Var.v(r5, linkedHashMap);
                                    o0Var.d(r5);
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                }
                                message = null;
                                o0Var.e(arrayList2);
                                g0.h3(new l2(o0Var, kVar, j11, message));
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
                        ((h0) it3.next()).close();
                    }
                    o0Var.e(arrayList2);
                    throw th4;
                }
                break;
        }
    }

    public /* synthetic */ o(z6 z6Var, boolean z10, long j10, p6 p6Var) {
        this.a = 1;
        this.d = z6Var;
        this.b = z10;
        this.c = j10;
        this.e = p6Var;
    }

    public /* synthetic */ o(ProfileActivity profileActivity, long j10, ArrayList arrayList, boolean z10) {
        this.a = 2;
        this.d = profileActivity;
        this.c = j10;
        this.e = arrayList;
        this.b = z10;
    }
}
