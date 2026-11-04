package gi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cs e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ i9(va vaVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = vaVar;
        this.c = z10;
        this.f = storyItem;
        this.b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        cs csVar = this.e;
        switch (i3) {
            case 0:
                va vaVar = (va) csVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j10 = this.b;
                if (!z10) {
                    ei.g1.X = new ei.g1(vaVar.b, vaVar.c, storyItem, j10, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                qa qaVar = vaVar.G;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                vaVar.G = null;
                vaVar.K = 0;
                RectF rectF = vaVar.I;
                Point point = org.telegram.messenger.g0.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vaVar.H = org.telegram.messenger.g0.L(8.0f);
                vaVar.p(true);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().T(vaVar.b, storyItem, null);
                hs.f(vaVar.c).k(hs.G2, Long.valueOf(inputGroupCall.id));
                break;
            default:
                uw uwVar = (uw) csVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.b;
                boolean z11 = this.c;
                if (chat == null) {
                    uwVar.getMessagesController().X(0, j11, z11);
                    if (user != null && user.bot && this.d) {
                        uwVar.getMessagesController().w(user.id);
                    }
                } else if (org.telegram.messenger.t3.r0(chat)) {
                    uwVar.getMessagesController().X(0, j11, z11);
                } else {
                    uwVar.getMessagesController().g0(-j11, uwVar.getMessagesController().a2(Long.valueOf(uwVar.getUserConfig().e())), null, z11, z11);
                }
                uwVar.getMessagesController().J(uwVar.X2);
                break;
        }
    }

    public /* synthetic */ i9(uw uwVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = uwVar;
        this.f = chat;
        this.b = j10;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
