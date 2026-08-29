package jh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oa(Object obj, long j10, boolean z10, int i10) {
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
                db dbVar = (db) this.d;
                long j10 = this.c;
                dbVar.B = j10;
                dbVar.A = j10;
                if (this.b) {
                    lh.s0 s0Var = dbVar.C;
                    s0Var.c = j10;
                    dbVar.D.set(s0Var);
                }
                dbVar.r();
                dbVar.E.a(true, true);
                cb cbVar = dbVar.y;
                if (cbVar != null) {
                    cbVar.setMyPrivacy(dbVar.A);
                    break;
                }
                break;
            case 1:
                nh.y8 y8Var = (nh.y8) this.d;
                nh.e9 e9Var = y8Var.S;
                boolean z10 = this.b;
                long j11 = this.c;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new nh.q8(y8Var, j11, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                    break;
                }
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.b, this.c);
                break;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.b, this.c);
                break;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.c, this.b);
                break;
            case 5:
                tn.b0((tn) this.d, this.c, this.b);
                break;
            default:
                qh.o0 o0Var = (qh.o0) this.d;
                o0Var.i = null;
                a0.h hVar = o0Var.g;
                long j12 = this.c;
                hVar.l(j12);
                ArrayList arrayList = o0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) o0Var.j.get(size)).peer) == j12) {
                            o0Var.j.remove(size);
                        }
                    }
                }
                o0Var.a();
                qh.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.k();
                }
                MessagesController.getInstance(o0Var.d).resolveCommunityJoinPendingRequest(o0Var.e, j12, !this.b, new qh.l0(o0Var, 2));
                break;
        }
    }

    public /* synthetic */ oa(Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = j10;
    }
}
