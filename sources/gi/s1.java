package gi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s1 extends hy {
    public final lt0 X;
    public final /* synthetic */ t1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new lt0();
        this.O = new ai.g2(this, 5);
    }

    @Override // u4.o0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.hy
    public final lt0 D1(int i3) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        lt0 lt0Var = this.X;
        lt0Var.c = false;
        Object F = this.Y.c.F(i3);
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
                lt0Var.c = true;
                return lt0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        lt0Var.b = 100.0f;
        lt0Var.a = 100.0f;
        lt0Var.c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
            lt0Var.a = i10;
            lt0Var.b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
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
