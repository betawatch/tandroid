package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yy extends vz {
    public final qw0 X;
    public final /* synthetic */ sz Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(sz szVar) {
        super(100, true);
        this.Y = szVar;
        this.X = new qw0();
        this.O = new ai.l(this, 6);
    }

    @Override // s4.p0
    public final int A() {
        sz szVar = this.Y;
        s4.h0 adapter = szVar.h0.getAdapter();
        xy xyVar = szVar.j0;
        if (adapter == xyVar && xyVar.x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.vz
    public final qw0 E1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        sz szVar = this.Y;
        xy xyVar = szVar.j0;
        s4.h0 adapter = szVar.h0.getAdapter();
        xy xyVar2 = szVar.n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != xyVar2) {
            if (xyVar.x.isEmpty()) {
                arrayList = null;
                return G1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) xyVar.x.get(i10);
            document = botInlineResult.document;
            if (document != null) {
                arrayList2 = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList2 = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    if (webDocument2 != null) {
                        arrayList2 = webDocument2.attributes;
                    }
                }
            }
            arrayList = arrayList2;
            document2 = document;
            return G1(document2, arrayList);
        }
        int i11 = xyVar2.H;
        if (i10 <= i11) {
            if (i10 == i11) {
                return null;
            }
            document2 = (TLRPC.Document) szVar.i1.get(i10);
            arrayList = document2.attributes;
            return G1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) xyVar2.x.get((i10 - i11) - 1);
        document = botInlineResult2.document;
        if (document != null) {
            arrayList2 = document.attributes;
        } else {
            TLRPC.WebDocument webDocument3 = botInlineResult2.content;
            if (webDocument3 != null) {
                arrayList2 = webDocument3.attributes;
            } else {
                TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                if (webDocument4 != null) {
                    arrayList2 = webDocument4.attributes;
                }
            }
        }
        arrayList = arrayList2;
        document2 = document;
        return G1(document2, arrayList);
    }

    public final qw0 G1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        qw0 qw0Var = this.X;
        qw0Var.b = 100.0f;
        qw0Var.a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            qw0Var.a = i10;
            qw0Var.b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qw0Var.a = documentAttribute.w;
                    qw0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qw0Var;
    }
}
