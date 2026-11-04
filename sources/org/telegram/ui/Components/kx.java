package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kx extends hy {
    public final lt0 X;
    public final /* synthetic */ ey Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(ey eyVar) {
        super(100, true);
        this.Y = eyVar;
        this.X = new lt0();
        this.O = new ai.g2(this, 11);
    }

    @Override // u4.o0
    public final int A() {
        ey eyVar = this.Y;
        u4.h0 adapter = eyVar.i0.getAdapter();
        jx jxVar = eyVar.k0;
        if (adapter == jxVar && jxVar.y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.hy
    public final lt0 D1(int i3) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ey eyVar = this.Y;
        jx jxVar = eyVar.k0;
        u4.h0 adapter = eyVar.i0.getAdapter();
        jx jxVar2 = eyVar.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != jxVar2) {
            if (jxVar.y.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) jxVar.y.get(i3);
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
        int i10 = jxVar2.I;
        if (i3 <= i10) {
            if (i3 == i10) {
                return null;
            }
            document2 = (TLRPC.Document) eyVar.j1.get(i3);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) jxVar2.y.get((i3 - i10) - 1);
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

    public final lt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i3;
        int i10;
        lt0 lt0Var = this.X;
        lt0Var.b = 100.0f;
        lt0Var.a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i3 = w10.w) != 0 && (i10 = w10.h) != 0) {
            lt0Var.a = i3;
            lt0Var.b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    lt0Var.a = documentAttribute.w;
                    lt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return lt0Var;
    }
}
