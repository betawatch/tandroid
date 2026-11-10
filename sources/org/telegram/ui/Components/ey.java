package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ey extends oj0 {
    public final boolean c;
    public final /* synthetic */ gy d;

    public ey(gy gyVar, boolean z9) {
        this.d = gyVar;
        this.c = z9;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        boolean z9 = this.c;
        gy gyVar = this.d;
        return (z9 ? gyVar.n1 : gyVar.m1).size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.messenger.hc k10;
        k9 k9Var = (k9) d1Var.a;
        gy gyVar = this.d;
        boolean z9 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z9 ? gyVar.n1 : gyVar.m1).get(i7);
        k9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(gyVar.c1).m0(org.telegram.messenger.ui.Z(stickerSetCovered.set), false);
            arrayList = m0 == null ? null : m0.documents;
        } else {
            arrayList = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList == null || arrayList.isEmpty()) {
                document = null;
            } else {
                if (stickerSetCovered.set != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i10);
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
        if (document == null) {
            return;
        }
        if (z9) {
            k9Var.setColorFilter(org.telegram.messenger.ij.C4(document) ? org.telegram.ui.ActionBar.m6.o0(gyVar.Z1) : null);
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        org.telegram.messenger.rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.m6.c7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        if (w10 == null || org.telegram.messenger.ij.N4(document)) {
            w10 = document;
        }
        boolean z10 = w10 instanceof TLRPC.Document;
        if (z10) {
            k10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
        } else if (!(w10 instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            k10 = org.telegram.messenger.hc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        }
        org.telegram.messenger.hc hcVar = k10;
        if (hcVar == null) {
            return;
        }
        String str = !org.telegram.messenger.sc.e(z9 ? 16388 : 1) ? "30_30_firstframe" : "30_30";
        if (z10 && (org.telegram.messenger.ij.K2(document, true) || org.telegram.messenger.ij.N4(document))) {
            if (d != null) {
                k9Var.p(org.telegram.messenger.hc.b(document), str, d, stickerSetCovered);
                return;
            } else {
                k9Var.l(org.telegram.messenger.hc.b(document), str, hcVar, null, 0, stickerSetCovered);
                return;
            }
        }
        if (hcVar.p == 1) {
            k9Var.k(hcVar, str, "tgs", d, stickerSetCovered);
        } else {
            k9Var.k(hcVar, null, "webp", d, stickerSetCovered);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        dy dyVar = new dy(this, this.d.getContext());
        dyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        dyVar.setLayerNum(1);
        dyVar.setAspectFit(true);
        dyVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new xi0(dyVar);
    }
}
