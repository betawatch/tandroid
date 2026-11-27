// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gw3 extends q74 {
    public final qma X;
    public final /* synthetic */ hw3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw3(hw3 hw3Var) {
        super(100, true);
        this.Y = hw3Var;
        this.X = new qma();
        this.O = new ar1(this, (byte) 3);
    }

    @Override // q74
    public final qma B1(int i) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w;
        int i2;
        int i3;
        qma qmaVar = this.X;
        qmaVar.c = false;
        Object E = this.Y.c.E(i);
        if (E instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) E;
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
            if (!(E instanceof TLRPC.Document)) {
                qmaVar.c = true;
                return qmaVar;
            }
            document = (TLRPC.Document) E;
            arrayList = document.attributes;
        }
        qmaVar.b = 100.0f;
        qmaVar.a = 100.0f;
        qmaVar.c = false;
        if (document != null && (w = xb4.w(document.thumbs, 90, false, null, false)) != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
            qmaVar.a = i2;
            qmaVar.b = i3;
        }
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qmaVar.a = documentAttribute.w;
                    qmaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qmaVar;
    }

    @Override // q79
    public final int z() {
        return A();
    }
}
