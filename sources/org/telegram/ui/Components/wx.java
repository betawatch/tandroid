package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wx extends uy {
    public final vt0 X;
    public final /* synthetic */ ry Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(ry ryVar) {
        super(100, true);
        this.Y = ryVar;
        this.X = new vt0();
        this.O = new bi.s2(this, 11);
    }

    @Override // v4.p0
    public final int A() {
        ry ryVar = this.Y;
        v4.i0 adapter = ryVar.i0.getAdapter();
        vx vxVar = ryVar.k0;
        if (adapter == vxVar && vxVar.y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.uy
    public final vt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ry ryVar = this.Y;
        vx vxVar = ryVar.k0;
        v4.i0 adapter = ryVar.i0.getAdapter();
        vx vxVar2 = ryVar.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != vxVar2) {
            if (vxVar.y.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) vxVar.y.get(i7);
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
            return F1(document2, arrayList);
        }
        int i10 = vxVar2.I;
        if (i7 <= i10) {
            if (i7 == i10) {
                return null;
            }
            document2 = (TLRPC.Document) ryVar.j1.get(i7);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) vxVar2.y.get((i7 - i10) - 1);
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
        return F1(document2, arrayList);
    }

    public final vt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        vt0 vt0Var = this.X;
        vt0Var.b = 100.0f;
        vt0Var.a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.w) != 0 && (i10 = w10.h) != 0) {
            vt0Var.a = i7;
            vt0Var.b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    vt0Var.a = documentAttribute.w;
                    vt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return vt0Var;
    }
}
