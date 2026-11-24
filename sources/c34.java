// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c34 extends q59 {
    public final boolean c;
    public final /* synthetic */ e34 d;

    public c34(e34 e34Var, boolean z) {
        this.d = e34Var;
        this.c = z;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        boolean z = this.c;
        e34 e34Var = this.d;
        return (z ? e34Var.o1 : e34Var.n1).size();
    }

    @Override // y59
    public final int d(int i) {
        return 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        ArrayList<TLRPC.Document> arrayList;
        gn5 k;
        bf0 bf0Var = (bf0) u69Var.a;
        boolean z = this.c;
        e34 e34Var = this.d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z ? e34Var.o1 : e34Var.n1).get(i);
        bf0Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet n0 = hs6.d0(e34Var.d1).n0(hs6.b0(stickerSetCovered.set), false);
            arrayList = n0 == null ? null : n0.documents;
        } else {
            arrayList = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList == null || arrayList.isEmpty()) {
                document = null;
            } else {
                if (stickerSetCovered.set != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (arrayList.get(i2).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i2);
                            break;
                        }
                    }
                }
                document = null;
                if (document == null) {
                    document = arrayList.get(0);
                }
            }
        }
        if (document != null) {
            if (z) {
                bf0Var.setColorFilter(k47.B4(document) ? cmb.n0(e34Var.a2) : null);
            }
            TLObject w = bc4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            meb d = eq3.d(stickerSetCovered.set.thumbs, cmb.b7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            if (w == null || k47.M4(document)) {
                w = document;
            }
            boolean z2 = w instanceof TLRPC.Document;
            if (z2) {
                k = gn5.c(bc4.w(document.thumbs, 90, false, null, false), document);
            } else if (!(w instanceof TLRPC.PhotoSize)) {
                return;
            } else {
                k = gn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            }
            gn5 gn5Var = k;
            if (gn5Var != null) {
                String str = !e86.e(z ? 16388 : 1) ? "30_30_firstframe" : "30_30";
                if (z2 && (k47.K2(document, true) || k47.M4(document))) {
                    if (d != null) {
                        bf0Var.p(gn5.b(document), str, d, stickerSetCovered);
                        return;
                    } else {
                        bf0Var.h(gn5.b(document), str, gn5Var, null, 0, stickerSetCovered);
                        return;
                    }
                }
                if (gn5Var.p == 1) {
                    bf0Var.n(gn5Var, str, "tgs", d, stickerSetCovered);
                } else {
                    bf0Var.n(gn5Var, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        b34 b34Var = new b34(this, this.d.getContext());
        b34Var.t(gm.L(24.0f), gm.L(24.0f));
        b34Var.setLayerNum(1);
        b34Var.setAspectFit(true);
        b34Var.setLayoutParams(new g69(gm.L(34.0f), gm.L(34.0f)));
        return new b59(b34Var);
    }
}
