package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yt0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s1 extends wy {
    public final yt0 X;
    public final /* synthetic */ t1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new yt0();
        this.O = new bi.w2(this, 5);
    }

    @Override // v4.p0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.wy
    public final yt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        yt0 yt0Var = this.X;
        yt0Var.c = false;
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
                yt0Var.c = true;
                return yt0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        yt0Var.b = 100.0f;
        yt0Var.a = 100.0f;
        yt0Var.c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
            yt0Var.a = i10;
            yt0Var.b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
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
