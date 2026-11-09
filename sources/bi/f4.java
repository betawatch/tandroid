package bi;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zs0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f4 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f4(int i7, long j3, TLRPC.Document document) {
        this.b = i7;
        this.c = j3;
        this.d = document;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i7 = this.a;
        int i10 = this.b;
        long j3 = this.c;
        Object obj2 = this.d;
        int i11 = 0;
        switch (i7) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ea.y(i10, false).P(j3);
                    org.telegram.messenger.g0.h3(new aa.s((Object) new k4(j3, i11), (Object) document, (Object) org.telegram.messenger.id.M0(2131750102, null), 13));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.f(3, (org.telegram.ui.Components.cc) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? org.telegram.messenger.id.M0(2131754435, null) : i10 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title)) : i10 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                break;
            default:
                ((zs0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ f4(int i7, org.telegram.ui.Components.cc ccVar, long j3) {
        this.b = i7;
        this.d = ccVar;
        this.c = j3;
    }

    public /* synthetic */ f4(zs0 zs0Var, long j3, int i7) {
        this.d = zs0Var;
        this.c = j3;
        this.b = i7;
    }
}
