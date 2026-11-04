package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cy extends sj0 {
    public final boolean c;
    public final /* synthetic */ ey d;

    public cy(ey eyVar, boolean z10) {
        this.d = eyVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        boolean z10 = this.c;
        ey eyVar = this.d;
        return (z10 ? eyVar.o1 : eyVar.n1).size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.messenger.ac k10;
        k9 k9Var = (k9) d1Var.a;
        ey eyVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? eyVar.o1 : eyVar.n1).get(i3);
        k9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(eyVar.d1).m0(org.telegram.messenger.li.Z(stickerSetCovered.set), false);
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
        if (z10) {
            k9Var.setColorFilter(org.telegram.messenger.zi.D4(document) ? org.telegram.ui.ActionBar.k6.o0(eyVar.a2) : null);
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        org.telegram.messenger.jz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.c7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        if (w10 == null || org.telegram.messenger.zi.O4(document)) {
            w10 = document;
        }
        boolean z11 = w10 instanceof TLRPC.Document;
        if (z11) {
            k10 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
        } else if (!(w10 instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            k10 = org.telegram.messenger.ac.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        }
        org.telegram.messenger.ac acVar = k10;
        if (acVar == null) {
            return;
        }
        String str = !org.telegram.messenger.lc.e(z10 ? 16388 : 1) ? "30_30_firstframe" : "30_30";
        if (z11 && (org.telegram.messenger.zi.L2(document, true) || org.telegram.messenger.zi.O4(document))) {
            if (d != null) {
                k9Var.p(org.telegram.messenger.ac.b(document), str, d, stickerSetCovered);
                return;
            } else {
                k9Var.l(org.telegram.messenger.ac.b(document), str, acVar, null, 0, stickerSetCovered);
                return;
            }
        }
        if (acVar.p == 1) {
            k9Var.k(acVar, str, "tgs", d, stickerSetCovered);
        } else {
            k9Var.k(acVar, null, "webp", d, stickerSetCovered);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ay ayVar = new ay(this, this.d.getContext());
        ayVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ayVar.setLayerNum(1);
        ayVar.setAspectFit(true);
        ayVar.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new bj0(ayVar);
    }
}
