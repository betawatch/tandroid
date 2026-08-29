package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = z10;
        this.c = j10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.c);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.c, this.d);
                break;
            case 2:
                ((MessagesController) this.b).lambda$processUpdates$376(this.d, this.c, (ArrayList) this.e);
                break;
            case 3:
                ((MessagesController) this.b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.c);
                break;
            case 4:
                ((MessagesController) this.b).lambda$processLoadedChannelAdmins$66(this.c, (a0.h) this.e, this.d);
                break;
            case 5:
                ((MessagesStorage) this.b).lambda$createTaskForMid$115(this.d, this.c, (ArrayList) this.e);
                break;
            case 6:
                ((MessagesStorage) this.b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.z5) this.e, this.d, this.c);
                break;
            case 7:
                ((VideoPlayerHolderBase) this.b).lambda$seekTo$12(this.c, this.d, (Runnable) this.e);
                break;
            case 8:
                org.telegram.ui.x6.U((org.telegram.ui.x6) this.b, this.d, this.c, (org.telegram.ui.m6) this.e);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                profileActivity.getMessagesController().getStoriesController().o0(this.c, (ArrayList) this.e, this.d, null);
                break;
        }
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

    public /* synthetic */ v8(VideoPlayerHolderBase videoPlayerHolderBase, long j10, boolean z10, Runnable runnable) {
        this.a = 7;
        this.b = videoPlayerHolderBase;
        this.c = j10;
        this.d = z10;
        this.e = runnable;
    }
}
