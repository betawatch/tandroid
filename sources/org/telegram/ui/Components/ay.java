package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ay extends yy {
    public final qu0 X;
    public final /* synthetic */ vy Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(vy vyVar) {
        super(100, true);
        this.Y = vyVar;
        this.X = new qu0();
        this.O = new jg.h1(this, 4);
    }

    @Override // s4.n0
    public final int A() {
        vy vyVar = this.Y;
        s4.g0 adapter = vyVar.h0.getAdapter();
        zx zxVar = vyVar.j0;
        if (adapter == zxVar && zxVar.y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.yy
    public final qu0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        vy vyVar = this.Y;
        zx zxVar = vyVar.j0;
        s4.g0 adapter = vyVar.h0.getAdapter();
        zx zxVar2 = vyVar.n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != zxVar2) {
            if (zxVar.y.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) zxVar.y.get(i10);
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
        int i11 = zxVar2.H;
        if (i10 <= i11) {
            if (i10 == i11) {
                return null;
            }
            document2 = (TLRPC.Document) vyVar.i1.get(i10);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) zxVar2.y.get((i10 - i11) - 1);
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

    public final qu0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w9;
        int i10;
        int i11;
        qu0 qu0Var = this.X;
        qu0Var.b = 100.0f;
        qu0Var.a = 100.0f;
        if (document != null && (w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false)) != null && (i10 = w9.w) != 0 && (i11 = w9.h) != 0) {
            qu0Var.a = i10;
            qu0Var.b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.a = documentAttribute.w;
                    qu0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }
}
