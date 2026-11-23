package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fs e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ aa(nb nbVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = nbVar;
        this.c = z10;
        this.f = storyItem;
        this.b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        fs fsVar = this.e;
        switch (i7) {
            case 0:
                nb nbVar = (nb) fsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j3 = this.b;
                if (!z10) {
                    fi.c1.X = new fi.c1(nbVar.b, nbVar.c, storyItem, j3, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                ib ibVar = nbVar.G;
                if (ibVar != null) {
                    ibVar.f(false);
                }
                nbVar.G = null;
                nbVar.K = 0;
                RectF rectF = nbVar.I;
                Point point = org.telegram.messenger.g0.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                nbVar.H = org.telegram.messenger.g0.L(8.0f);
                nbVar.p(true);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(nbVar.b, storyItem, null);
                ks.f(nbVar.c).k(ks.G2, Long.valueOf(inputGroupCall.id));
                break;
            default:
                bx bxVar = (bx) fsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.b;
                boolean z11 = this.c;
                if (chat == null) {
                    bxVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        bxVar.getMessagesController().w(user.id);
                    }
                } else if (org.telegram.messenger.v3.r0(chat)) {
                    bxVar.getMessagesController().X(0, j10, z11);
                } else {
                    bxVar.getMessagesController().g0(-j10, bxVar.getMessagesController().c2(Long.valueOf(bxVar.getUserConfig().e())), null, z11, z11);
                }
                bxVar.getMessagesController().J(bxVar.Y2);
                break;
        }
    }

    public /* synthetic */ aa(bx bxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = bxVar;
        this.f = chat;
        this.b = j3;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
