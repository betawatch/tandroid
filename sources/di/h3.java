package di;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.zg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements z10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(int i7, long j3, TLRPC.Document document) {
        this.b = i7;
        this.c = j3;
        this.d = document;
    }

    @Override // org.telegram.messenger.z10
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
                    u8.y(i10, false).P(j3);
                    org.telegram.messenger.g0.h3(new aa.r((Object) new l3(j3, i11), (Object) document, (Object) hd.M0(2131750102, null), 19));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                org.telegram.messenger.g0.i3(new zg(22, (org.telegram.ui.Components.xb) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? hd.M0(2131754435, null) : i10 == 1 ? org.telegram.messenger.g0.X2(hd.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title)) : i10 == 2 ? org.telegram.messenger.g0.X2(hd.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title)) : org.telegram.messenger.g0.X2(hd.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                break;
            default:
                ((ys0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ h3(int i7, org.telegram.ui.Components.xb xbVar, long j3) {
        this.b = i7;
        this.d = xbVar;
        this.c = j3;
    }

    public /* synthetic */ h3(ys0 ys0Var, long j3, int i7) {
        this.d = ys0Var;
        this.c = j3;
        this.b = i7;
    }
}
