package kh;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v1 extends zy {
    public final qu0 X;
    public final /* synthetic */ w1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var) {
        super(100, true);
        this.Y = w1Var;
        this.X = new qu0();
        this.O = new fh.c6(this, 2);
    }

    @Override // f2.z0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.zy
    public final qu0 D1(int i9) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        qu0 qu0Var = this.X;
        qu0Var.c = false;
        Object F = this.Y.c.F(i9);
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
                qu0Var.c = true;
                return qu0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        qu0Var.b = 100.0f;
        qu0Var.a = 100.0f;
        qu0Var.c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            qu0Var.a = i10;
            qu0Var.b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
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
