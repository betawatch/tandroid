package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = j10;
        this.d = z10;
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
                ((MediaDataController) this.b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.c);
                return;
            case 1:
                ((MediaDataController) this.b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.c, this.d);
                return;
            case 2:
                ((MessagesController) this.b).lambda$processUpdates$379(this.d, this.c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.b).lambda$getChannelRecommendations$484((TLObject) this.e, this.d, this.c);
                return;
            case 4:
                ((MessagesController) this.b).lambda$processLoadedChannelAdmins$65(this.c, (a0.h) this.e, this.d);
                return;
            case 5:
                ((MessagesStorage) this.b).lambda$createTaskForMid$115(this.d, this.c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.a6) this.e, this.d, this.c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.b).lambda$seekTo$12(this.c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.c7.U((org.telegram.ui.c7) this.b, this.d, this.c, (org.telegram.ui.q6) this.e);
                return;
            case 9:
                ((ProfileActivity) this.b).getMessagesController().getStoriesController().o0(this.c, (ArrayList) this.e, this.d, null);
                return;
            default:
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.b;
                long j10 = this.c;
                boolean z10 = this.d;
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) this.e;
                q0Var.getClass();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                    } catch (Exception e) {
                        FileLog.e(e);
                        message = e instanceof org.telegram.ui.Wallet.p0 ? e.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((org.telegram.ui.Wallet.j0) it2.next()).close();
                        }
                    }
                    try {
                        synchronized (org.telegram.ui.Wallet.q0.f) {
                            try {
                                q0Var.c(j10);
                                uy0 r10 = q0Var.r();
                                if (r10.c == z10) {
                                    if (((LinkedHashMap) r10.e).isEmpty()) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((org.telegram.ui.Wallet.j0) it.next()).close();
                                    }
                                    message = null;
                                    q0Var.e(arrayList);
                                    AndroidUtilities.runOnUIThread(new ai.b2(q0Var, lVar, j10, message));
                                    return;
                                }
                                if (z10 && !org.telegram.ui.Wallet.q0.i(q0Var.a)) {
                                    throw new org.telegram.ui.Wallet.p0("AUTH_UNAVAILABLE");
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
                                    ((LinkedHashMap) r10.e).put((String) entry.getKey(), q0Var.j(r10, (String) entry.getKey(), (org.telegram.ui.Wallet.j0) entry.getValue(), arrayList, j10));
                                }
                                r10.d = false;
                                synchronized (org.telegram.ui.Wallet.q0.f) {
                                    q0Var.c(j10);
                                    q0Var.v(r10, linkedHashMap);
                                    q0Var.d(r10);
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                }
                                message = null;
                                q0Var.e(arrayList);
                                AndroidUtilities.runOnUIThread(new ai.b2(q0Var, lVar, j10, message));
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
                        ((org.telegram.ui.Wallet.j0) it3.next()).close();
                    }
                    q0Var.e(arrayList);
                    throw th4;
                }
                break;
        }
    }

    public /* synthetic */ o8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = z10;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ o8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.b = baseController;
        this.e = obj;
        this.d = z10;
        this.c = j10;
    }

    public /* synthetic */ o8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.a = 1;
        this.b = mediaDataController;
        this.e = arrayList;
        this.c = j10;
        this.d = z10;
    }

    public /* synthetic */ o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
