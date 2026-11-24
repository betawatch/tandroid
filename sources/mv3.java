// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mv3 extends w64 {
    public final via X;
    public final /* synthetic */ nv3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv3(nv3 nv3Var) {
        super(100, true);
        this.Y = nv3Var;
        this.X = new via();
        this.O = new nq1(this, (byte) 3);
    }

    @Override // w64
    public final via B1(int i) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w;
        int i2;
        int i3;
        via viaVar = this.X;
        viaVar.c = false;
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
                viaVar.c = true;
                return viaVar;
            }
            document = (TLRPC.Document) E;
            arrayList = document.attributes;
        }
        viaVar.b = 100.0f;
        viaVar.a = 100.0f;
        viaVar.c = false;
        if (document != null && (w = ba4.w(document.thumbs, 90, false, null, false)) != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
            viaVar.a = i2;
            viaVar.b = i3;
        }
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    viaVar.a = documentAttribute.w;
                    viaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return viaVar;
    }

    @Override // d49
    public final int z() {
        return A();
    }
}
