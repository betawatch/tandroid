package bi;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kd(Object obj, long j10, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = j10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                be beVar = (be) this.d;
                long j10 = this.c;
                beVar.F = j10;
                beVar.E = j10;
                if (this.b) {
                    di.v0 v0Var = beVar.G;
                    v0Var.c = j10;
                    beVar.H.set(v0Var);
                }
                beVar.r();
                beVar.J.a(true, true);
                ae aeVar = beVar.y;
                if (aeVar != null) {
                    aeVar.setMyPrivacy(beVar.E);
                    break;
                }
                break;
            case 1:
                fi.g9 g9Var = (fi.g9) this.d;
                fi.n9 n9Var = g9Var.W;
                boolean z10 = this.b;
                long j11 = this.c;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new fi.y8(g9Var, j11, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                    break;
                }
            case 2:
                ii.r0 r0Var = (ii.r0) this.d;
                r0Var.i = null;
                a0.h hVar = r0Var.g;
                long j12 = this.c;
                hVar.l(j12);
                ArrayList arrayList = r0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) r0Var.j.get(size)).peer) == j12) {
                            r0Var.j.remove(size);
                        }
                    }
                }
                r0Var.a();
                ii.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.c();
                }
                MessagesController.getInstance(r0Var.d).resolveCommunityJoinPendingRequest(r0Var.e, j12, !this.b, new ii.p0(r0Var, 2));
                break;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.b, this.c);
                break;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.b, this.c);
                break;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.c, this.b);
                break;
        }
    }

    public /* synthetic */ kd(Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = j10;
    }
}
