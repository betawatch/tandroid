package lh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                    nh.t0 t0Var = ebVar.D;
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
                ph.z7 z7Var = (ph.z7) this.d;
                ph.f8 f8Var = z7Var.T;
                boolean z4 = this.b;
                long j11 = this.c;
                if (z4) {
                    i11 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new org.telegram.ui.ActionBar.a4(z7Var, j11, 2), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                    break;
                }
            default:
                sh.o0 o0Var = (sh.o0) this.d;
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
                sh.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.d();
                }
                MessagesController.getInstance(o0Var.d).resolveCommunityJoinPendingRequest(o0Var.e, j12, !this.b, new sh.l0(o0Var, 2));
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
