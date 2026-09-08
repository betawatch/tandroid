package di;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q9(Object obj, long j3, boolean z10, int i10) {
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
                ba baVar = (ba) this.d;
                ia iaVar = baVar.W;
                boolean z10 = this.c;
                long j3 = this.b;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j3), new r9(baVar, j3, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j3, 0, true);
                    break;
                }
            case 1:
                gi.t0 t0Var = (gi.t0) this.d;
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
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.l();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.c, new gi.r0(t0Var, 2));
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
                co.b0((co) this.d, this.b, this.c);
                break;
            default:
                zh.n8 n8Var = (zh.n8) this.d;
                long j11 = this.b;
                n8Var.F = j11;
                n8Var.E = j11;
                if (this.c) {
                    bi.e1 e1Var = n8Var.G;
                    e1Var.c = j11;
                    n8Var.H.set(e1Var);
                }
                n8Var.r();
                n8Var.I.a(true, true);
                zh.m8 m8Var = n8Var.y;
                if (m8Var != null) {
                    m8Var.setMyPrivacy(n8Var.E);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q9(Object obj, boolean z10, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = j3;
    }
}
