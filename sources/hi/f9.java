package hi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ is e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ f9(sa saVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = saVar;
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
        is isVar = this.e;
        switch (i7) {
            case 0:
                sa saVar = (sa) isVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j3 = this.b;
                if (!z10) {
                    fi.e1.X = new fi.e1(saVar.b, saVar.c, storyItem, j3, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                na naVar = saVar.G;
                if (naVar != null) {
                    naVar.f(false);
                }
                saVar.G = null;
                saVar.K = 0;
                RectF rectF = saVar.I;
                Point point = org.telegram.messenger.g0.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                saVar.H = org.telegram.messenger.g0.L(8.0f);
                saVar.p(true);
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(saVar.b, storyItem, null);
                ns.f(saVar.c).k(ns.G2, Long.valueOf(inputGroupCall.id));
                break;
            default:
                yw ywVar = (yw) isVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.b;
                boolean z11 = this.c;
                if (chat == null) {
                    ywVar.getMessagesController().X(0, j10, z11);
                    if (user != null && user.bot && this.d) {
                        ywVar.getMessagesController().w(user.id);
                    }
                } else if (org.telegram.messenger.t3.r0(chat)) {
                    ywVar.getMessagesController().X(0, j10, z11);
                } else {
                    ywVar.getMessagesController().g0(-j10, ywVar.getMessagesController().a2(Long.valueOf(ywVar.getUserConfig().e())), null, z11, z11);
                }
                ywVar.getMessagesController().J(ywVar.Y2);
                break;
        }
    }

    public /* synthetic */ f9(yw ywVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = ywVar;
        this.f = chat;
        this.b = j3;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
