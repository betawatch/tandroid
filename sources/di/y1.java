package di;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.nz;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y1 extends nz {
    public final iv0 X;
    public final /* synthetic */ z1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var) {
        super(100, true);
        this.Y = z1Var;
        this.X = new iv0();
        this.O = new x1(this, 0);
    }

    @Override // s4.o0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final iv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        iv0 iv0Var = this.X;
        iv0Var.c = false;
        Object F = this.Y.c.F(i10);
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
                iv0Var.c = true;
                return iv0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        iv0Var.b = 100.0f;
        iv0Var.a = 100.0f;
        iv0Var.c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            iv0Var.a = i11;
            iv0Var.b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iv0Var.a = documentAttribute.w;
                    iv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return iv0Var;
    }
}
