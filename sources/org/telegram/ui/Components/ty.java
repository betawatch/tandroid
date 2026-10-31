package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ty extends sk0 {
    public final boolean c;
    public final /* synthetic */ vy d;

    public ty(vy vyVar, boolean z10) {
        this.d = vyVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        boolean z10 = this.c;
        vy vyVar = this.d;
        return (z10 ? vyVar.n1 : vyVar.m1).size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.messenger.ic k10;
        g9 g9Var = (g9) c1Var.a;
        vy vyVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? vyVar.n1 : vyVar.m1).get(i10);
        g9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(vyVar.c1).m0(org.telegram.messenger.ui.Z(stickerSetCovered.set), false);
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
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i11);
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
            g9Var.setColorFilter(org.telegram.messenger.jj.C4(document) ? org.telegram.ui.ActionBar.t6.o0(vyVar.Z1) : null);
        }
        TLObject w9 = org.telegram.messenger.b8.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.t6.c7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        if (w9 == null || org.telegram.messenger.jj.N4(document)) {
            w9 = document;
        }
        boolean z11 = w9 instanceof TLRPC.Document;
        if (z11) {
            k10 = org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document);
        } else if (!(w9 instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            k10 = org.telegram.messenger.ic.k((TLRPC.PhotoSize) w9, document, stickerSetCovered.set.thumb_version);
        }
        org.telegram.messenger.ic icVar = k10;
        if (icVar == null) {
            return;
        }
        String str = !org.telegram.messenger.sc.e(z10 ? 16388 : 1) ? "30_30_firstframe" : "30_30";
        if (z11 && (org.telegram.messenger.jj.K2(document, true) || org.telegram.messenger.jj.N4(document))) {
            if (d != null) {
                g9Var.p(org.telegram.messenger.ic.b(document), str, d, stickerSetCovered);
                return;
            } else {
                g9Var.l(org.telegram.messenger.ic.b(document), str, icVar, null, 0, stickerSetCovered);
                return;
            }
        }
        if (icVar.p == 1) {
            g9Var.k(icVar, str, "tgs", d, stickerSetCovered);
        } else {
            g9Var.k(icVar, null, "webp", d, stickerSetCovered);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        sy syVar = new sy(this, this.d.getContext());
        syVar.u(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
        syVar.setLayerNum(1);
        syVar.setAspectFit(true);
        syVar.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f)));
        return new ck0(syVar);
    }
}
