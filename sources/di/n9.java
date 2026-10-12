package di;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n9(Object obj, long j10, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) this.d;
                ea eaVar = x9Var.W;
                boolean z10 = this.c;
                long j10 = this.b;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j10), new o9(x9Var, j10, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j10, 0, true);
                    break;
                }
            case 1:
                gi.t0 t0Var = (gi.t0) this.d;
                t0Var.i = null;
                a0.h hVar = t0Var.g;
                long j11 = this.b;
                hVar.l(j11);
                ArrayList arrayList = t0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.j.get(size)).peer) == j11) {
                            t0Var.j.remove(size);
                        }
                    }
                }
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.b();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j11, !this.c, new gi.r0(t0Var, 2));
                break;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.c, this.b);
                break;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.c, this.b);
                break;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.b, this.c);
                break;
            case 5:
                fo.z0((fo) this.d, this.b, this.c);
                break;
            default:
                zh.h8 h8Var = (zh.h8) this.d;
                long j12 = this.b;
                h8Var.F = j12;
                h8Var.E = j12;
                if (this.c) {
                    bi.e1 e1Var = h8Var.G;
                    e1Var.c = j12;
                    h8Var.H.set(e1Var);
                }
                h8Var.t();
                h8Var.J.a(true, true);
                zh.g8 g8Var = h8Var.y;
                if (g8Var != null) {
                    g8Var.setMyPrivacy(h8Var.E);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n9(Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = j10;
    }
}
