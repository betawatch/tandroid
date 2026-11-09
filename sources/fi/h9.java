package fi;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ls e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ h9(va vaVar, boolean z9, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.e = vaVar;
        this.c = z9;
        this.f = storyItem;
        this.b = j3;
        this.h = inputGroupCall;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        ls lsVar = this.e;
        switch (i7) {
            case 0:
                va vaVar = (va) lsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z9 = this.c;
                long j3 = this.b;
                if (!z9) {
                    di.g1.W = new di.g1(vaVar.b, vaVar.c, storyItem, j3, storyItem.id, z9, inputGroupCall, true, this.d);
                }
                qa qaVar = vaVar.F;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                vaVar.F = null;
                vaVar.J = 0;
                RectF rectF = vaVar.H;
                Point point = org.telegram.messenger.g0.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vaVar.G = org.telegram.messenger.g0.L(8.0f);
                vaVar.p(true);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().L(vaVar.b, storyItem, null);
                qs.f(vaVar.c).k(qs.G2, Long.valueOf(inputGroupCall.id));
                break;
            default:
                yw ywVar = (yw) lsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.b;
                boolean z10 = this.c;
                if (chat == null) {
                    ywVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        ywVar.getMessagesController().w(user.id);
                    }
                } else if (org.telegram.messenger.t3.r0(chat)) {
                    ywVar.getMessagesController().X(0, j10, z10);
                } else {
                    ywVar.getMessagesController().g0(-j10, ywVar.getMessagesController().a2(Long.valueOf(ywVar.getUserConfig().e())), null, z10, z10);
                }
                ywVar.getMessagesController().J(ywVar.X2);
                break;
        }
    }

    public /* synthetic */ h9(yw ywVar, TLRPC.Chat chat, long j3, boolean z9, TLRPC.User user, boolean z10) {
        this.e = ywVar;
        this.f = chat;
        this.b = j3;
        this.c = z9;
        this.h = user;
        this.d = z10;
    }
}
