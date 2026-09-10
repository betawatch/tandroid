package bi;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xa(Object obj, long j3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                kb kbVar = (kb) this.d;
                rb rbVar = kbVar.W;
                boolean z10 = this.c;
                long j3 = this.b;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j3), new ab(kbVar, j3, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j3, 0, true);
                    break;
                }
            case 1:
                ei.t0 t0Var = (ei.t0) this.d;
                t0Var.i = null;
                a0.i iVar = t0Var.g;
                long j10 = this.b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.j.get(size)).peer) == j10) {
                            t0Var.j.remove(size);
                        }
                    }
                }
                t0Var.a();
                ei.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.F();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.c, new ei.r0(t0Var, 2));
                break;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.c, this.b);
                break;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.c, this.b);
                break;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.b, this.c);
                break;
            case 5:
                eo.b0((eo) this.d, this.b, this.c);
                break;
            default:
                xh.r8 r8Var = (xh.r8) this.d;
                long j11 = this.b;
                r8Var.F = j11;
                r8Var.E = j11;
                if (this.c) {
                    zh.k0 k0Var = r8Var.G;
                    k0Var.c = j11;
                    r8Var.H.set(k0Var);
                }
                r8Var.r();
                r8Var.I.a(true, true);
                xh.q8 q8Var = r8Var.y;
                if (q8Var != null) {
                    q8Var.setMyPrivacy(r8Var.E);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xa(Object obj, boolean z10, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = j3;
    }
}
