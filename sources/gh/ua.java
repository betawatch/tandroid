package gh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ua(Object obj, long j10, boolean z10, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = j10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                jb jbVar = (jb) this.d;
                long j10 = this.c;
                jbVar.B = j10;
                jbVar.A = j10;
                if (this.b) {
                    ih.u0 u0Var = jbVar.C;
                    u0Var.c = j10;
                    jbVar.D.set(u0Var);
                }
                jbVar.r();
                jbVar.E.a(true, true);
                ib ibVar = jbVar.y;
                if (ibVar != null) {
                    ibVar.setMyPrivacy(jbVar.A);
                    break;
                }
                break;
            case 1:
                kh.n9 n9Var = (kh.n9) this.d;
                kh.t9 t9Var = n9Var.S;
                boolean z10 = this.b;
                long j11 = this.c;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    MessagesController.getInstance(i10).loadChannelParticipants(Long.valueOf(j11), new kh.e9(n9Var, j11, 0), 200);
                    break;
                } else {
                    i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    MessagesController.getInstance(i9).loadFullChat(j11, 0, true);
                    break;
                }
            case 2:
                nh.q0 q0Var = (nh.q0) this.d;
                q0Var.i = null;
                a0.h hVar = q0Var.g;
                long j12 = this.c;
                hVar.l(j12);
                ArrayList arrayList = q0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) q0Var.j.get(size)).peer) == j12) {
                            q0Var.j.remove(size);
                        }
                    }
                }
                q0Var.a();
                nh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.c();
                }
                MessagesController.getInstance(q0Var.d).resolveCommunityJoinPendingRequest(q0Var.e, j12, !this.b, new nh.o0(q0Var, 2));
                break;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.b, this.c);
                break;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.b, this.c);
                break;
            case 5:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.c, this.b);
                break;
            default:
                qn.a0((qn) this.d, this.c, this.b);
                break;
        }
    }

    public /* synthetic */ ua(Object obj, boolean z10, long j10, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = z10;
        this.c = j10;
    }
}
