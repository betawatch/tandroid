package org.telegram.messenger.video;

import ag.a3;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.h0;
import org.telegram.ui.Wallet.o0;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.o6;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.a = i10;
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
                y6.Y((y6) this.d, this.b, this.c, (o6) this.e);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                long j10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                boolean z10 = this.b;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getMessagesController().O1().r0(j10, arrayList, z10, null);
                return;
            default:
                p0 p0Var = (p0) this.d;
                long j11 = this.c;
                boolean z11 = this.b;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                p0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                    } catch (Exception e) {
                        f8.g(e, true);
                        message = e instanceof o0 ? e.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((h0) it2.next()).close();
                        }
                    }
                    try {
                        synchronized (p0.f) {
                            try {
                                p0Var.c(j11);
                                ix0 r10 = p0Var.r();
                                if (r10.c == z11) {
                                    if (((LinkedHashMap) r10.e).isEmpty()) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((h0) it.next()).close();
                                    }
                                    message = null;
                                    p0Var.e(arrayList2);
                                    i0.g3(new a3(p0Var, kVar, j11, message, 13));
                                    return;
                                }
                                if (z11 && !p0.i(p0Var.a)) {
                                    throw new o0("AUTH_UNAVAILABLE");
                                }
                                if (!((LinkedHashMap) r10.e).isEmpty()) {
                                    p0Var.b(j11, false);
                                    for (String str : ((LinkedHashMap) r10.e).keySet()) {
                                        linkedHashMap.put(str, p0Var.h(r10, str, j11));
                                    }
                                }
                                r10.c = z11;
                                ((LinkedHashMap) r10.e).clear();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    ((LinkedHashMap) r10.e).put((String) entry.getKey(), p0Var.j(r10, (String) entry.getKey(), (h0) entry.getValue(), arrayList2, j11));
                                }
                                r10.d = false;
                                synchronized (p0.f) {
                                    p0Var.c(j11);
                                    p0Var.v(r10, linkedHashMap);
                                    p0Var.d(r10);
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                }
                                message = null;
                                p0Var.e(arrayList2);
                                i0.g3(new a3(p0Var, kVar, j11, message, 13));
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
                    p0Var.e(arrayList2);
                    throw th4;
                }
                break;
        }
    }

    public /* synthetic */ o(y6 y6Var, boolean z10, long j10, o6 o6Var) {
        this.a = 1;
        this.d = y6Var;
        this.b = z10;
        this.c = j10;
        this.e = o6Var;
    }

    public /* synthetic */ o(ProfileActivity profileActivity, long j10, ArrayList arrayList, boolean z10) {
        this.a = 2;
        this.d = profileActivity;
        this.c = j10;
        this.e = arrayList;
        this.b = z10;
    }
}
