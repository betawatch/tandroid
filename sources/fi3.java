// default package

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fi3 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ jm7 e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ fi3(nk3 nk3Var, TLRPC.Chat chat, long j, boolean z, TLRPC.User user, boolean z2) {
        this.e = nk3Var;
        this.f = chat;
        this.c = j;
        this.b = z;
        this.h = user;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        jm7 jm7Var = this.e;
        switch (b) {
            case 0:
                nk3 nk3Var = (nk3) jm7Var;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j = this.c;
                boolean z = this.b;
                if (chat == null) {
                    nk3Var.getMessagesController().T(0, j, z);
                    if (user != null && user.bot && this.d) {
                        nk3Var.getMessagesController().t(user.id);
                    }
                } else if (sd2.r0(chat)) {
                    nk3Var.getMessagesController().T(0, j, z);
                } else {
                    nk3Var.getMessagesController().c0(-j, nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.getUserConfig().e())), null, z, z);
                }
                nk3Var.getMessagesController().F(nk3Var.Y2);
                break;
            default:
                v9b v9bVar = (v9b) jm7Var;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z2 = this.b;
                long j2 = this.c;
                if (!z2) {
                    s96.N = s96.g(v9bVar.b, v9bVar.c, storyItem, j2, storyItem.id, z2, inputGroupCall, true, this.d);
                }
                q9b q9bVar = v9bVar.G;
                if (q9bVar != null) {
                    q9bVar.f(false);
                }
                v9bVar.G = null;
                v9bVar.K = false;
                RectF rectF = v9bVar.I;
                Point point = gm.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                v9bVar.H = gm.L(8.0f);
                v9bVar.o(true);
                d S = LaunchActivity.S();
                storyItem.dialogId = j2;
                storyItem.justUploaded = true;
                S.getOrCreateStoryViewer().J(v9bVar.b, storyItem, null);
                nm7.f(v9bVar.c).k(nm7.G2, Long.valueOf(inputGroupCall.id));
                break;
        }
    }

    public /* synthetic */ fi3(v9b v9bVar, boolean z, TL_stories.StoryItem storyItem, long j, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        this.e = v9bVar;
        this.b = z;
        this.f = storyItem;
        this.c = j;
        this.h = inputGroupCall;
        this.d = z2;
    }
}
