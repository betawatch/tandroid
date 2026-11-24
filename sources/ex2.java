// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ex2 extends q59 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ hx2 d;

    public ex2(hx2 hx2Var, ArrayList arrayList) {
        this.d = hx2Var;
        this.c = arrayList;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return this.c.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        gx2 gx2Var = (gx2) u69Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i);
        bf0 bf0Var = gx2Var.a;
        gx2Var.d = stickerSetCovered;
        boolean z = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        lka lkaVar = gx2Var.b;
        if (z) {
            lkaVar.l(jb6.M0(2131748019, null), false);
            bf0Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        lkaVar.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            bf0Var.j(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
        meb f = eq3.f(stickerSetCovered.cover, cmb.Z6, 1.0f, gx2Var.c);
        TLRPC.Document document2 = stickerSetCovered.cover;
        if (f == null) {
            bf0Var.n(gn5.c(w, document2), null, "webp", null, stickerSetCovered);
        } else if (w != null) {
            bf0Var.n(gn5.c(w, document2), null, "webp", f, stickerSetCovered);
        } else {
            bf0Var.n(gn5.b(document2), null, "webp", f, stickerSetCovered);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        gx2 gx2Var = new gx2(viewGroup.getContext(), this.d.c0);
        gx2Var.setLayoutParams(new g69(-2, gm.L(48.0f)));
        return new b59(gx2Var);
    }
}
