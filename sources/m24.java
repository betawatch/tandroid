// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m24 extends c79 {
    public final boolean c;
    public final /* synthetic */ o24 d;

    public m24(o24 o24Var, boolean z) {
        this.d = o24Var;
        this.c = z;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        boolean z = this.c;
        o24 o24Var = this.d;
        return (z ? o24Var.o1 : o24Var.n1).size();
    }

    @Override // j79
    public final int d(int i) {
        return 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        ArrayList<TLRPC.Document> arrayList;
        jn5 k;
        de0 de0Var = (de0) f89Var.a;
        boolean z = this.c;
        o24 o24Var = this.d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z ? o24Var.o1 : o24Var.n1).get(i);
        de0Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet n0 = ls6.d0(o24Var.d1).n0(ls6.b0(stickerSetCovered.set), false);
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
                de0Var.setColorFilter(r47.B4(document) ? aob.n0(o24Var.a2) : null);
            }
            TLObject w = xb4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            ggb d = lp3.d(stickerSetCovered.set.thumbs, aob.c7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            if (w == null || r47.M4(document)) {
                w = document;
            }
            boolean z2 = w instanceof TLRPC.Document;
            if (z2) {
                k = jn5.c(xb4.w(document.thumbs, 90, false, null, false), document);
            } else if (!(w instanceof TLRPC.PhotoSize)) {
                return;
            } else {
                k = jn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            }
            jn5 jn5Var = k;
            if (jn5Var != null) {
                String str = !i86.e(z ? 16388 : 1) ? "30_30_firstframe" : "30_30";
                if (z2 && (r47.K2(document, true) || r47.M4(document))) {
                    if (d != null) {
                        de0Var.p(jn5.b(document), str, d, stickerSetCovered);
                        return;
                    } else {
                        de0Var.h(jn5.b(document), str, jn5Var, null, 0, stickerSetCovered);
                        return;
                    }
                }
                if (jn5Var.p == 1) {
                    de0Var.n(jn5Var, str, "tgs", d, stickerSetCovered);
                } else {
                    de0Var.n(jn5Var, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        l24 l24Var = new l24(this, this.d.getContext());
        l24Var.t(hl.L(24.0f), hl.L(24.0f));
        l24Var.setLayerNum(1);
        l24Var.setAspectFit(true);
        l24Var.setLayoutParams(new r79(hl.L(34.0f), hl.L(34.0f)));
        return new n69(l24Var);
    }
}
