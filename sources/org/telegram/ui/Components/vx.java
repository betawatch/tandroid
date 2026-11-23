package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vx extends ty {
    public final xt0 X;
    public final /* synthetic */ qy Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(qy qyVar) {
        super(100, true);
        this.Y = qyVar;
        this.X = new xt0();
        this.O = new bi.y2(this, 11);
    }

    @Override // v4.p0
    public final int A() {
        qy qyVar = this.Y;
        v4.i0 adapter = qyVar.i0.getAdapter();
        ux uxVar = qyVar.k0;
        if (adapter == uxVar && uxVar.y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.ty
    public final xt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        qy qyVar = this.Y;
        ux uxVar = qyVar.k0;
        v4.i0 adapter = qyVar.i0.getAdapter();
        ux uxVar2 = qyVar.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != uxVar2) {
            if (uxVar.y.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) uxVar.y.get(i7);
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
        int i10 = uxVar2.I;
        if (i7 <= i10) {
            if (i7 == i10) {
                return null;
            }
            document2 = (TLRPC.Document) qyVar.j1.get(i7);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) uxVar2.y.get((i7 - i10) - 1);
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

    public final xt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        xt0 xt0Var = this.X;
        xt0Var.b = 100.0f;
        xt0Var.a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.w) != 0 && (i10 = w10.h) != 0) {
            xt0Var.a = i7;
            xt0Var.b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xt0Var.a = documentAttribute.w;
                    xt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return xt0Var;
    }
}
