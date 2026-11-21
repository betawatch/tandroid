package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class yx extends wy {
    public final yt0 X;
    public final /* synthetic */ ty Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(ty tyVar) {
        super(100, true);
        this.Y = tyVar;
        this.X = new yt0();
        this.O = new bi.w2(this, 11);
    }

    @Override // v4.p0
    public final int A() {
        ty tyVar = this.Y;
        v4.i0 adapter = tyVar.i0.getAdapter();
        xx xxVar = tyVar.k0;
        if (adapter == xxVar && xxVar.y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.wy
    public final yt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ty tyVar = this.Y;
        xx xxVar = tyVar.k0;
        v4.i0 adapter = tyVar.i0.getAdapter();
        xx xxVar2 = tyVar.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != xxVar2) {
            if (xxVar.y.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) xxVar.y.get(i7);
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
        int i10 = xxVar2.I;
        if (i7 <= i10) {
            if (i7 == i10) {
                return null;
            }
            document2 = (TLRPC.Document) tyVar.j1.get(i7);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) xxVar2.y.get((i7 - i10) - 1);
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

    public final yt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        yt0 yt0Var = this.X;
        yt0Var.b = 100.0f;
        yt0Var.a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.w) != 0 && (i10 = w10.h) != 0) {
            yt0Var.a = i7;
            yt0Var.b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    yt0Var.a = documentAttribute.w;
                    yt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return yt0Var;
    }
}
