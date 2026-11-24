// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fs implements s0b {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ hs c;

    public fs(hs hsVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = hsVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // s0b
    public final void a() {
        ls8 ls8Var = ((es) this.a).f;
        if (ls8Var != null) {
            ls8Var.a(true, true);
        }
        vf6 vf6Var = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        vf6Var.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
