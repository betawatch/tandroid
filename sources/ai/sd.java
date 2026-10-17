package ai;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sd(Object obj, long j10, boolean z10, int i10) {
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
                ke keVar = (ke) this.d;
                long j10 = this.c;
                keVar.F = j10;
                keVar.E = j10;
                if (this.b) {
                    ci.v0 v0Var = keVar.G;
                    v0Var.c = j10;
                    keVar.H.set(v0Var);
                }
                keVar.s();
                keVar.J.a(true, true);
                je jeVar = keVar.y;
                if (jeVar != null) {
                    jeVar.setMyPrivacy(keVar.E);
                    break;
                }
                break;
            case 1:
                ei.k9 k9Var = (ei.k9) this.d;
                ei.r9 r9Var = k9Var.W;
                boolean z10 = this.b;
                long j11 = this.c;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new ei.c9(k9Var, j11, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                    break;
                }
            case 2:
                hi.s0 s0Var = (hi.s0) this.d;
                s0Var.i = null;
                a0.h hVar = s0Var.g;
                long j12 = this.c;
                hVar.l(j12);
                ArrayList arrayList = s0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) s0Var.j.get(size)).peer) == j12) {
                            s0Var.j.remove(size);
                        }
                    }
                }
                s0Var.a();
                hi.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.p();
                }
                MessagesController.getInstance(s0Var.d).resolveCommunityJoinPendingRequest(s0Var.e, j12, !this.b, new hi.q0(s0Var, 2));
                break;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.b, this.c);
                break;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.b, this.c);
                break;
            case 5:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.c, this.b);
                break;
            default:
                sn.z0((sn) this.d, this.c, this.b);
                break;
        }
    }

    public /* synthetic */ sd(Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = j10;
    }
}
