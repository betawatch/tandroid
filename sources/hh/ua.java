package hh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ua(Object obj, long j10, boolean z10, int i10) {
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
                jb jbVar = (jb) this.d;
                long j10 = this.c;
                jbVar.B = j10;
                jbVar.A = j10;
                if (this.b) {
                    jh.s0 s0Var = jbVar.C;
                    s0Var.c = j10;
                    jbVar.D.set(s0Var);
                }
                jbVar.s();
                jbVar.E.a(true, true);
                ib ibVar = jbVar.y;
                if (ibVar != null) {
                    ibVar.setMyPrivacy(jbVar.A);
                    break;
                }
                break;
            case 1:
                lh.k9 k9Var = (lh.k9) this.d;
                lh.q9 q9Var = k9Var.S;
                boolean z10 = this.b;
                long j11 = this.c;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new lh.b9(k9Var, j11, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                    break;
                }
            case 2:
                oh.q0 q0Var = (oh.q0) this.d;
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
                oh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.i();
                }
                MessagesController.getInstance(q0Var.d).resolveCommunityJoinPendingRequest(q0Var.e, j12, !this.b, new oh.o0(q0Var, 2));
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
                rn.b0((rn) this.d, this.c, this.b);
                break;
        }
    }

    public /* synthetic */ ua(Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = j10;
    }
}
