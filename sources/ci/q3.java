package ci;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.lo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3(int i3, long j10, TLRPC.Document document) {
        this.b = i3;
        this.c = j10;
        this.d = document;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i3 = this.a;
        int i10 = this.b;
        long j10 = this.c;
        Object obj2 = this.d;
        int i11 = 0;
        switch (i3) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    e9.y(i10, false).P(j10);
                    org.telegram.messenger.g0.h3(new ai.k3(new u3(j10, i11), document, bd.M0(2131750110, null), 16));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                org.telegram.messenger.g0.i3(new lo(8, (org.telegram.ui.Components.ac) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? bd.M0(2131754435, null) : i10 == 1 ? org.telegram.messenger.g0.X2(bd.a0("TopicContainsEmojiPackSingle", null, 2131744032, stickerSet.title)) : i10 == 2 ? org.telegram.messenger.g0.X2(bd.a0("StoryContainsEmojiPackSingle", null, 2131744709, stickerSet.title)) : org.telegram.messenger.g0.X2(bd.a0("MessageContainsEmojiPackSingle", null, 2131748604, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                break;
            default:
                ((ws0) obj2).getStoriesController().b(i10, j10, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ q3(int i3, org.telegram.ui.Components.ac acVar, long j10) {
        this.b = i3;
        this.d = acVar;
        this.c = j10;
    }

    public /* synthetic */ q3(ws0 ws0Var, long j10, int i3) {
        this.d = ws0Var;
        this.c = j10;
        this.b = i3;
    }
}
