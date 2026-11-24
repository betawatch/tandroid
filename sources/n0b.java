// default package

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n0b extends hs5 {
    public int f;
    public final /* synthetic */ u0b g;

    public n0b(u0b u0bVar) {
        this.g = u0bVar;
        this.e = (byte) 15;
        this.f = -1;
    }

    @Override // fs5
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        int i = s49Var.f;
        if (i == 3 || i != s49Var2.f) {
            return false;
        }
        u0b u0bVar = this.g;
        if (u0bVar.M1 == null) {
            return false;
        }
        int b = s49Var.b();
        int b2 = s49Var2.b();
        u0bVar.M1.documents.add(b2, u0bVar.M1.documents.remove(b));
        u0bVar.n1.j(b, b2);
        this.f = b2;
        return true;
    }

    @Override // fs5
    public final void q(s49 s49Var, int i) {
        u0b u0bVar = this.g;
        if (i != 0 || u0bVar.p1 == null || this.f <= 0) {
            if (i == 2) {
                u0bVar.p1 = ((xya) s49Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f;
            tL_stickers_changeStickerPosition.sticker = hq6.c0(u0bVar.p1, "").document;
            this.f = -1;
            u0bVar.p1 = null;
        }
    }

    @Override // fs5
    public final void r(s49 s49Var) {
    }

    @Override // fs5
    public final void p(RecyclerView recyclerView, s49 s49Var, s49 s49Var2, int i, int i2, int i3) {
    }
}
