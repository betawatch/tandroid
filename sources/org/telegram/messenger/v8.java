package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v8(Object obj, long j10, boolean z10, Object obj2, int i10) {
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
                ((MessagesController) this.b).lambda$processUpdates$381(this.d, this.c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.b).lambda$getChannelRecommendations$487((TLObject) this.e, this.d, this.c);
                return;
            case 4:
                ((MessagesController) this.b).lambda$processLoadedChannelAdmins$65(this.c, (a0.h) this.e, this.d);
                return;
            case 5:
                ((MessagesStorage) this.b).lambda$createTaskForMid$119(this.d, this.c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.r6) this.e, this.d, this.c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.b).lambda$seekTo$12(this.c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.c7.V((org.telegram.ui.c7) this.b, this.d, this.c, (org.telegram.ui.r6) this.e);
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                long j10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                boolean z10 = this.d;
                int i10 = ProfileActivity.R6;
                profileActivity.getMessagesController().getStoriesController().r0(j10, arrayList, z10, null);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
                long j11 = this.c;
                boolean z11 = this.d;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
                p0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                    } catch (Exception e) {
                        FileLog.e(e);
                        message = e instanceof org.telegram.ui.Wallet.o0 ? e.getMessage() : "STORAGE_BROKEN";
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((org.telegram.ui.Wallet.i0) it2.next()).close();
                        }
                    }
                    try {
                        synchronized (org.telegram.ui.Wallet.p0.f) {
                            try {
                                p0Var.c(j11);
                                jz0 r6 = p0Var.r();
                                if (r6.c == z11) {
                                    if (((LinkedHashMap) r6.e).isEmpty()) {
                                    }
                                    it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((org.telegram.ui.Wallet.i0) it.next()).close();
                                    }
                                    message = null;
                                    p0Var.e(arrayList2);
                                    AndroidUtilities.runOnUIThread(new bi.y2(p0Var, kVar, j11, message));
                                    return;
                                }
                                if (z11 && !org.telegram.ui.Wallet.p0.i(p0Var.a)) {
                                    throw new org.telegram.ui.Wallet.o0("AUTH_UNAVAILABLE");
                                }
                                if (!((LinkedHashMap) r6.e).isEmpty()) {
                                    p0Var.b(j11, false);
                                    for (String str : ((LinkedHashMap) r6.e).keySet()) {
                                        linkedHashMap.put(str, p0Var.h(r6, str, j11));
                                    }
                                }
                                r6.c = z11;
                                ((LinkedHashMap) r6.e).clear();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    ((LinkedHashMap) r6.e).put((String) entry.getKey(), p0Var.j(r6, (String) entry.getKey(), (org.telegram.ui.Wallet.i0) entry.getValue(), arrayList2, j11));
                                }
                                r6.d = false;
                                synchronized (org.telegram.ui.Wallet.p0.f) {
                                    p0Var.c(j11);
                                    p0Var.v(r6, linkedHashMap);
                                    p0Var.d(r6);
                                }
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                }
                                message = null;
                                p0Var.e(arrayList2);
                                AndroidUtilities.runOnUIThread(new bi.y2(p0Var, kVar, j11, message));
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

    public /* synthetic */ v8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = z10;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ v8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.b = baseController;
        this.e = obj;
        this.d = z10;
        this.c = j10;
    }

    public /* synthetic */ v8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.a = 1;
        this.b = mediaDataController;
        this.e = arrayList;
        this.c = j10;
        this.d = z10;
    }

    public /* synthetic */ v8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
