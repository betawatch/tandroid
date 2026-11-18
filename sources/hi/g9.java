package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fs e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ g9(ta taVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = taVar;
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
                ta taVar = (ta) fsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j3 = this.b;
                if (!z10) {
                    fi.c1.X = new fi.c1(taVar.b, taVar.c, storyItem, j3, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                oa oaVar = taVar.G;
                if (oaVar != null) {
                    oaVar.f(false);
                }
                taVar.G = null;
                taVar.K = 0;
                RectF rectF = taVar.I;
                Point point = org.telegram.messenger.g0.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                taVar.H = org.telegram.messenger.g0.L(8.0f);
                taVar.p(true);
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(taVar.b, storyItem, null);
                ks.f(taVar.c).k(ks.G2, Long.valueOf(inputGroupCall.id));
                break;
            default:
                cx cxVar = (cx) fsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.b;
                boolean z11 = this.c;
                if (chat == null) {
                    cxVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        cxVar.getMessagesController().w(user.id);
                    }
                } else if (org.telegram.messenger.v3.r0(chat)) {
                    cxVar.getMessagesController().X(0, j10, z11);
                } else {
                    cxVar.getMessagesController().g0(-j10, cxVar.getMessagesController().c2(Long.valueOf(cxVar.getUserConfig().e())), null, z11, z11);
                }
                cxVar.getMessagesController().J(cxVar.Y2);
                break;
        }
    }

    public /* synthetic */ g9(cx cxVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = cxVar;
        this.f = chat;
        this.b = j3;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
