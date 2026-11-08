package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class nx extends ky {
    public final mt0 X;
    public final /* synthetic */ hy Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(hy hyVar) {
        super(100, true);
        this.Y = hyVar;
        this.X = new mt0();
        this.O = new ai.l(this, 8);
    }

    @Override // v4.n0
    public final int A() {
        hy hyVar = this.Y;
        v4.g0 adapter = hyVar.h0.getAdapter();
        mx mxVar = hyVar.j0;
        if (adapter == mxVar && mxVar.y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.ky
    public final mt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        hy hyVar = this.Y;
        mx mxVar = hyVar.j0;
        v4.g0 adapter = hyVar.h0.getAdapter();
        mx mxVar2 = hyVar.n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != mxVar2) {
            if (mxVar.y.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) mxVar.y.get(i7);
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
        int i10 = mxVar2.H;
        if (i7 <= i10) {
            if (i7 == i10) {
                return null;
            }
            document2 = (TLRPC.Document) hyVar.i1.get(i7);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) mxVar2.y.get((i7 - i10) - 1);
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

    public final mt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        mt0 mt0Var = this.X;
        mt0Var.b = 100.0f;
        mt0Var.a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.w) != 0 && (i10 = w10.h) != 0) {
            mt0Var.a = i7;
            mt0Var.b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mt0Var.a = documentAttribute.w;
                    mt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return mt0Var;
    }
}
