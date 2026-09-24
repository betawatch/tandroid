package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o9(Object obj, long j3, boolean z10, int i10) {
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
                y9 y9Var = (y9) this.d;
                fa faVar = y9Var.W;
                boolean z10 = this.c;
                long j3 = this.b;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j3), new p9(y9Var, j3, 0), 200);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    MessagesController.getInstance(i10).loadFullChat(j3, 0, true);
                    break;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
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
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.f();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.c, new fi.r0(t0Var, 2));
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
                wn.o0((wn) this.d, this.b, this.c);
                break;
            default:
                yh.o8 o8Var = (yh.o8) this.d;
                long j11 = this.b;
                o8Var.F = j11;
                o8Var.E = j11;
                if (this.c) {
                    ai.m1 m1Var = o8Var.G;
                    m1Var.c = j11;
                    o8Var.H.set(m1Var);
                }
                o8Var.r();
                o8Var.I.a(true, true);
                yh.n8 n8Var = o8Var.y;
                if (n8Var != null) {
                    n8Var.setMyPrivacy(o8Var.E);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o9(Object obj, boolean z10, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = j3;
    }
}
