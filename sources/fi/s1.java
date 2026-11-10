package fi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.nt0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s1 extends jy {
    public final nt0 X;
    public final /* synthetic */ t1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new nt0();
        this.O = new ai.l(this, 2);
    }

    @Override // v4.n0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.jy
    public final nt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        nt0 nt0Var = this.X;
        nt0Var.c = false;
        Object F = this.Y.c.F(i7);
        if (F instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) F;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    arrayList = webDocument2 != null ? webDocument2.attributes : null;
                }
            }
        } else {
            if (!(F instanceof TLRPC.Document)) {
                nt0Var.c = true;
                return nt0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        nt0Var.b = 100.0f;
        nt0Var.a = 100.0f;
        nt0Var.c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
            nt0Var.a = i10;
            nt0Var.b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nt0Var.a = documentAttribute.w;
                    nt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return nt0Var;
    }
}
