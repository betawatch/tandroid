package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class py extends bk0 {
    public final boolean c;
    public final /* synthetic */ ry d;

    public py(ry ryVar, boolean z10) {
        this.d = ryVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        boolean z10 = this.c;
        ry ryVar = this.d;
        return (z10 ? ryVar.o1 : ryVar.n1).size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.messenger.fc k10;
        q9 q9Var = (q9) f1Var.a;
        ry ryVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? ryVar.o1 : ryVar.n1).get(i7);
        q9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(ryVar.d1).o0(org.telegram.messenger.ri.b0(stickerSetCovered.set), false);
            arrayList = o02 == null ? null : o02.documents;
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
            q9Var.setColorFilter(org.telegram.messenger.fj.C4(document) ? org.telegram.ui.ActionBar.n6.o0(ryVar.a2) : null);
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        org.telegram.messenger.lz d = org.telegram.messenger.u5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.n6.c7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        if (w10 == null || org.telegram.messenger.fj.N4(document)) {
            w10 = document;
        }
        boolean z11 = w10 instanceof TLRPC.Document;
        if (z11) {
            k10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
        } else if (!(w10 instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            k10 = org.telegram.messenger.fc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        }
        org.telegram.messenger.fc fcVar = k10;
        if (fcVar == null) {
            return;
        }
        String str = !org.telegram.messenger.pc.e(z10 ? 16388 : 1) ? "30_30_firstframe" : "30_30";
        if (z11 && (org.telegram.messenger.fj.K2(document, true) || org.telegram.messenger.fj.N4(document))) {
            if (d != null) {
                q9Var.p(org.telegram.messenger.fc.b(document), str, d, stickerSetCovered);
                return;
            } else {
                q9Var.l(org.telegram.messenger.fc.b(document), str, fcVar, null, 0, stickerSetCovered);
                return;
            }
        }
        if (fcVar.p == 1) {
            q9Var.k(fcVar, str, "tgs", d, stickerSetCovered);
        } else {
            q9Var.k(fcVar, null, "webp", d, stickerSetCovered);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        oy oyVar = new oy(this, this.d.getContext());
        oyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        oyVar.setLayerNum(1);
        oyVar.setAspectFit(true);
        oyVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new kj0(oyVar);
    }
}
