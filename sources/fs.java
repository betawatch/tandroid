// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
