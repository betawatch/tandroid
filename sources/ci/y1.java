package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.wv0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class y1 extends nz {
    public final wv0 X;
    public final /* synthetic */ z1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var) {
        super(100, true);
        this.Y = z1Var;
        this.X = new wv0();
        this.O = new x1(this, 0);
    }

    @Override // s4.o0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final wv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        wv0 wv0Var = this.X;
        wv0Var.c = false;
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
                wv0Var.c = true;
                return wv0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        wv0Var.b = 100.0f;
        wv0Var.a = 100.0f;
        wv0Var.c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            wv0Var.a = i11;
            wv0Var.b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    wv0Var.a = documentAttribute.w;
                    wv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return wv0Var;
    }
}
