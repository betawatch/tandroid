package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jy extends tj0 {
    public final boolean c;
    public final /* synthetic */ ly d;

    public jy(ly lyVar, boolean z10) {
        this.d = lyVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        boolean z10 = this.c;
        ly lyVar = this.d;
        return (z10 ? lyVar.o1 : lyVar.n1).size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.messenger.gc k10;
        i9 i9Var = (i9) e1Var.a;
        ly lyVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? lyVar.o1 : lyVar.n1).get(i7);
        i9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(lyVar.d1).m0(org.telegram.messenger.si.Z(stickerSetCovered.set), false);
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
            i9Var.setColorFilter(org.telegram.messenger.gj.C4(document) ? org.telegram.ui.ActionBar.j6.o0(lyVar.a2) : null);
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        org.telegram.messenger.pz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.j6.c7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        if (w10 == null || org.telegram.messenger.gj.N4(document)) {
            w10 = document;
        }
        boolean z11 = w10 instanceof TLRPC.Document;
        if (z11) {
            k10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
        } else if (!(w10 instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            k10 = org.telegram.messenger.gc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        }
        org.telegram.messenger.gc gcVar = k10;
        if (gcVar == null) {
            return;
        }
        String str = !org.telegram.messenger.qc.e(z10 ? 16388 : 1) ? "30_30_firstframe" : "30_30";
        if (z11 && (org.telegram.messenger.gj.K2(document, true) || org.telegram.messenger.gj.N4(document))) {
            if (d != null) {
                i9Var.p(org.telegram.messenger.gc.b(document), str, d, stickerSetCovered);
                return;
            } else {
                i9Var.l(org.telegram.messenger.gc.b(document), str, gcVar, null, 0, stickerSetCovered);
                return;
            }
        }
        if (gcVar.p == 1) {
            i9Var.k(gcVar, str, "tgs", d, stickerSetCovered);
        } else {
            i9Var.k(gcVar, null, "webp", d, stickerSetCovered);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        iy iyVar = new iy(this, this.d.getContext());
        iyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        iyVar.setLayerNum(1);
        iyVar.setAspectFit(true);
        iyVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new cj0(iyVar);
    }
}
