package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fy extends pj0 {
    public final boolean c;
    public final /* synthetic */ hy d;

    public fy(hy hyVar, boolean z9) {
        this.d = hyVar;
        this.c = z9;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        boolean z9 = this.c;
        hy hyVar = this.d;
        return (z9 ? hyVar.n1 : hyVar.m1).size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.messenger.hc k10;
        l9 l9Var = (l9) d1Var.a;
        hy hyVar = this.d;
        boolean z9 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z9 ? hyVar.n1 : hyVar.m1).get(i7);
        l9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(hyVar.c1).m0(org.telegram.messenger.ui.Z(stickerSetCovered.set), false);
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
            l9Var.setColorFilter(org.telegram.messenger.ij.C4(document) ? org.telegram.ui.ActionBar.l6.o0(hyVar.Z1) : null);
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        org.telegram.messenger.rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.l6.c7, 0.2f, false);
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
                l9Var.p(org.telegram.messenger.hc.b(document), str, d, stickerSetCovered);
                return;
            } else {
                l9Var.l(org.telegram.messenger.hc.b(document), str, hcVar, null, 0, stickerSetCovered);
                return;
            }
        }
        if (hcVar.p == 1) {
            l9Var.k(hcVar, str, "tgs", d, stickerSetCovered);
        } else {
            l9Var.k(hcVar, null, "webp", d, stickerSetCovered);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ey eyVar = new ey(this, this.d.getContext());
        eyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        eyVar.setLayerNum(1);
        eyVar.setAspectFit(true);
        eyVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new yi0(eyVar);
    }
}
