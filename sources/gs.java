// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gs implements q4b {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ is c;

    public gs(is isVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = isVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // q4b
    public final void a() {
        uv8 uv8Var = ((fs) this.a).f;
        if (uv8Var != null) {
            uv8Var.a(true, true);
        }
        zh6 zh6Var = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        zh6Var.k(stickerSetCovered.set.id, stickerSetCovered);
    }
}
