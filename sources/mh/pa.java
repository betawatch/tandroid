package mh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pa(Object obj, long j10, boolean z4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = j10;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                eb ebVar = (eb) this.d;
                long j10 = this.c;
                ebVar.C = j10;
                ebVar.B = j10;
                if (this.b) {
                    oh.t0 t0Var = ebVar.D;
                    t0Var.c = j10;
                    ebVar.E.set(t0Var);
                }
                ebVar.r();
                ebVar.F.a(true, true);
                db dbVar = ebVar.y;
                if (dbVar != null) {
                    dbVar.setMyPrivacy(ebVar.B);
                    break;
                }
                break;
            case 1:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.b, this.c);
                break;
            case 2:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.b, this.c);
                break;
            case 3:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.c, this.b);
                break;
            case 4:
                xn.b0((xn) this.d, this.c, this.b);
                break;
            case 5:
                qh.x7 x7Var = (qh.x7) this.d;
                qh.d8 d8Var = x7Var.T;
                boolean z4 = this.b;
                long j11 = this.c;
                if (z4) {
                    i11 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new org.telegram.ui.ActionBar.b4(x7Var, j11, 2), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                    break;
                }
            default:
                th.n0 n0Var = (th.n0) this.d;
                n0Var.i = null;
                a0.h hVar = n0Var.g;
                long j12 = this.c;
                hVar.l(j12);
                ArrayList arrayList = n0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) n0Var.j.get(size)).peer) == j12) {
                            n0Var.j.remove(size);
                        }
                    }
                }
                n0Var.a();
                th.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.e();
                }
                MessagesController.getInstance(n0Var.d).resolveCommunityJoinPendingRequest(n0Var.e, j12, !this.b, new th.l0(n0Var, 2));
                break;
        }
    }

    public /* synthetic */ pa(Object obj, boolean z4, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z4;
        this.c = j10;
    }
}
