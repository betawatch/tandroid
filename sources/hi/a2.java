package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class a2 extends ty {
    public final xt0 X;
    public final /* synthetic */ b2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var) {
        super(100, true);
        this.Y = b2Var;
        this.X = new xt0();
        this.O = new bi.y2(this, 5);
    }

    @Override // v4.p0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.ty
    public final xt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        xt0 xt0Var = this.X;
        xt0Var.c = false;
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
                xt0Var.c = true;
                return xt0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        xt0Var.b = 100.0f;
        xt0Var.a = 100.0f;
        xt0Var.c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
            xt0Var.a = i10;
            xt0Var.b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
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
